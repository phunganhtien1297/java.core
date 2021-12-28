package xml_java.control;

import org.w3c.dom.*;

import xml_java.model.Student;

import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
    }

    public Main() {
        // creat_XML();

        // for (Student st : parser_XML()) {
        // System.out.println(st.getFirstName() + " " + st.getLastName() + " " +
        // st.getAge());
        // }
        // readFile_Scanner();
        // readFile_BufferedReader();
        // readFile_FileReader();
        writeFile();

    }

    public void creat_XML() {
        List<Student> listStudents = new ArrayList<>();
        Student student = null;

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            // tạo phần tử gốc có tên class
            Element rootElement = doc.createElement("classjava");

            // thêm thuộc tính totalStudents vào thẻ class
            doc.appendChild(rootElement);
            Attr totalStudentAttr = doc.createAttribute("totalStudents");
            totalStudentAttr.setValue("14");
            rootElement.setAttributeNode(totalStudentAttr);

            for (int i = 0; i < 5; i++) {
                Element student1 = doc.createElement("student");
                rootElement.appendChild(student1);

                // tạo thuộc tính rollno cho student1
                Attr attr1 = doc.createAttribute("ID");
                attr1.setValue(i + "");
                ;
                student1.setAttributeNode(attr1);

                // tạo thẻ firstname
                Element firstname = doc.createElement("firstname");
                firstname.appendChild(doc.createTextNode("Tien " + i));
                student1.appendChild(firstname);

                // tạo thẻ lastname
                Element lastname = doc.createElement("lastname");
                lastname.appendChild(doc.createTextNode("Phung " + i));
                student1.appendChild(lastname);

                Element age = doc.createElement("age");
                age.appendChild(doc.createTextNode("2" + i));
                student1.appendChild(age);

            }
            // tạo phần tử student1
            // Element student1 = doc.createElement("student");
            // rootElement.appendChild(student1);

            // // tạo thuộc tính rollno cho student1
            // Attr attr1 = doc.createAttribute("ID");
            // attr1.setValue("1");
            // student1.setAttributeNode(attr1);

            // // tạo thẻ firstname
            // Element firstname = doc.createElement("firstname");
            // firstname.appendChild(doc.createTextNode("Kiên"));
            // student1.appendChild(firstname);

            // // tạo thẻ lastname
            // Element lastname = doc.createElement("lastname");
            // lastname.appendChild(doc.createTextNode("Dương"));
            // student1.appendChild(lastname);

            // // tạo phần tử student2
            // Element student2 = doc.createElement("student");
            // rootElement.appendChild(student2);
            // // tạo thuộc tính rollno cho student2
            // Attr attr2 = doc.createAttribute("ID");
            // attr2.setValue("2");
            // student2.setAttributeNode(attr2);
            // // tạo thẻ firstname
            // Element firstname2 = doc.createElement("firstname");
            // firstname2.appendChild(doc.createTextNode("Doanh"));
            // student2.appendChild(firstname2);
            // // tạo thẻ lastname
            // Element lastname2 = doc.createElement("lastname");
            // lastname2.appendChild(doc.createTextNode("Vũ"));
            // student2.appendChild(lastname2);

            // ghi nội dung vào file XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);

            // Ghi ra 1 flie
            StreamResult result = new StreamResult(new File("students.xml"));
            transformer.transform(source, result);

            // ghi kết quả ra console để kiểm tra
            StreamResult consoleResult = new StreamResult(System.out);
            transformer.transform(source, consoleResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Student> parser_XML() {
        List<Student> listStudents = new ArrayList<>();
        Student student = null;
        try {

            File inputFile = new File("students.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            // in phần tử gốc ra màn hình
            System.out.println("Phần tử gốc:" + doc.getDocumentElement().getNodeName());

            // đọc tất cả các phần tử có tên thẻ là "student"
            NodeList nodeListStudent = doc.getElementsByTagName("student");

            // duyệt các phần tử student
            for (int i = 0; i < nodeListStudent.getLength(); i++) {
                // tạo đối tượng student
                student = new Student();
                // đọc các thuộc tính của student
                Node nNode = nodeListStudent.item(i);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    student.setId(eElement.getAttribute("id"));
                    student.setFirstName(eElement.getElementsByTagName("firstname").item(0).getTextContent());
                    student.setLastName(eElement.getElementsByTagName("lastname").item(0).getTextContent());
                    student.setAge(eElement.getElementsByTagName("age").item(0).getTextContent());

                }
                // add đối tượng student vào listStudents
                listStudents.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listStudents;
    }
    // --------Đọc File------------------

    public void readFile_Scanner() {

        String url = "test.xml";
        FileInputStream fileInputStream = null;
        Scanner scanner = null;

        try {
            // Đọc dữ liệu từ File với Scanner
            fileInputStream = new FileInputStream(url);
            scanner = new Scanner(fileInputStream);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
        } finally {
            try {
                if (fileInputStream != null)
                    fileInputStream.close();
                if (scanner != null)
                    scanner.close();
            } catch (IOException ex) {

            }
        }
    }

    public void readFile_BufferedReader() {
        String url = "test.xml";

        // Đọc dữ liệu từ File với BufferedReader
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;

        try {
            fileInputStream = new FileInputStream(url);
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = bufferedReader.readLine();
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (Exception ex) {

        } finally {
            try {
                bufferedReader.close();
                fileInputStream.close();
            } catch (IOException ex) {

            }
        }
    }

    public void readFile_FileReader() {
        // Đọc dữ liệu từ File với File và FileReader
        String url = "test.xml";
        File file = null;
        BufferedReader reader = null;

        try {
            file = new File(url);
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (Exception ex) {

        } finally {
            try {
                reader.close();
                // file.close();
            } catch (IOException ex) {

            }
        }
    }

    public void writeFile() {

        FileWriter fw = null;
        try {
            fw = new FileWriter("test.xml", true);
            fw.write("xin chao");
            fw.write("\n");
            fw.write("cac ban");
            fw.write("\n");

        } catch (Exception ex) {

        } finally {
            try {
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}