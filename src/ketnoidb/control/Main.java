package ketnoidb.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public Connection connection = null;
	public Statement statement, statement1;
	ResultSet resultSet, resultSet1;
	PreparedStatement stmt; //

	String JDBC_DB_URL = "jdbc:oracle:thin:@(DESCRIPTION =    (ADDRESS_LIST =      (ADDRESS = (PROTOCOL = TCP)(HOST = 10.50.11.171)(PORT = 1521))      (ADDRESS = (PROTOCOL = TCP)(HOST = 10.50.11.172)(PORT = 1521))      (LOAD_BALANCE = yes)      (FAILOVER = yes)    )    (CONNECT_DATA =      (SERVICE_NAME=dscdb)(failover_mode=(type=session)(method=basic))  ))";
	String JDBC_USER = "kiendv";
	String JDBC_PASS = "kiendv123"; 

	public static void main(String[] args) {
		Main m = new Main();

	}

	public Main() {
		getConnection(JDBC_DB_URL, JDBC_PASS, JDBC_USER);
		// getData();
		// inserttData();
		// upDateData();
		// deleteData();
		// inserttData_Batch();
	}

	/**
	 * 
	 * @param JDBC_DB_URL
	 * @param JDBC_PASS
	 * @param JDBC_USER
	 */
	private void getConnection(String JDBC_DB_URL, String JDBC_PASS, String JDBC_USER) {
		try {

			if ((connection != null && connection.isClosed()) || connection == null) {
				Class.forName("oracle.jdbc.OracleDriver");
				connection = DriverManager.getConnection(JDBC_DB_URL, JDBC_USER, JDBC_PASS);
			}

		} catch (Exception ex) {
			System.out.println("Exception: getConnection " + ex.getMessage());
		}

	}

	/**
	 * 
	 */
	private void getData() {
		try {
			String qr = "select *from users where valid=?";

			stmt = connection.prepareStatement(qr);

			stmt.setString(1, "1");
			resultSet = stmt.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getString("id"));

			}

		} catch (Exception ex) {
			System.out.println("Exception: getData " + ex.getMessage());
		} finally {
			try {
				connection.close();
				stmt.close();
				resultSet.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	/**
	 * 
	 */
	private void inserttData() {

		String insertTableSQL = "insert into users (id,fistname,lastname,room,valid) VALUES (?,?,?,?,?)";
		PreparedStatement preparedStatement = null;
		try {
			if (connection != null) {
				preparedStatement = connection.prepareStatement(insertTableSQL);
				preparedStatement.setString(1, "3");
				preparedStatement.setString(2, "Huy");
				preparedStatement.setString(3, "Nguyen");
				preparedStatement.setString(4, "TC");
				preparedStatement.setString(5, "1");
				preparedStatement.executeUpdate();
			}

		} catch (Exception throwables) {
			System.out.println("Exception inserttData:  " + throwables.getMessage());

		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				System.out.println("Exception: finally inserttData " + e.getMessage());
			}
		}
	}

	private void inserttData_Batch() {

		String insertTableSQL = "insert into users (id,fistname,lastname,room,valid) VALUES (?,?,?,?,?)";
		PreparedStatement preparedStatement = null;
		try {
			if (connection != null) {
				preparedStatement = connection.prepareStatement(insertTableSQL);
				for (int i = 0; i < 2; i++) {
					preparedStatement.setString(1, "3");
					preparedStatement.setString(2, "Huy_" + i);
					preparedStatement.setString(3, "Nguyen");
					preparedStatement.setString(4, "TC");
					preparedStatement.setString(5, "1");
					preparedStatement.addBatch();
				}
				preparedStatement.executeBatch();
			}
		} catch (Exception throwables) {
			System.out.println("Exception inserttData:  " + throwables.getMessage());
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				System.out.println("Exception: finally inserttData " + e.getMessage());
			}
		}
	}

	/**
	 *
	 */
	private void upDateData() {

		String insertTableSQL = "update users set id=1 where id=?";
		PreparedStatement preparedStatement = null;
		try {
			if (connection != null) {
				preparedStatement = connection.prepareStatement(insertTableSQL);
				preparedStatement.setString(1, "4");
				preparedStatement.executeUpdate();
			}
		} catch (Exception throwables) {
			System.out.println("Exception upDateData:  " + throwables.getMessage());
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}

			} catch (Exception e) {
				System.out.println("Exception: finally upDateData " + e.getMessage());
			}
		}
	}

	private void deleteData() {
		String insertTableSQL = "delete users where id=?";
		PreparedStatement preparedStatement = null;
		try {
			if (connection != null) {
				preparedStatement = connection.prepareStatement(insertTableSQL);
				preparedStatement.setString(1, "1");
				preparedStatement.executeUpdate();
			}
		} catch (Exception throwables) {
			System.out.println("Exception deleteData:  " + throwables.getMessage());
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				System.out.println("Exception: finally deleteData " + e.getMessage());
			}
		}
	}

}
