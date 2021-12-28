package btFile.control;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import btFile.model.file;

public class Main {
    public static void main(String[] args) {
        readFile_Scanner();
    }

    public static void readFile_Scanner() {
        String url = "input.txt";
        FileInputStream fileInputStream = null;
        Scanner scanner = null;

        try {
            // Đọc dữ liệu từ File với Scanner
            fileInputStream = new FileInputStream(url);
            scanner = new Scanner(fileInputStream);

            while (scanner.hasNextLine()) {
                //System.out.println(scanner.nextLine());
                ArrayList<file> arrayListTT = new ArrayList<file>();
                String line = scanner.nextLine();
                try {
                    String[] sub_tmp = line.split(";");
                    String calling = sub_tmp[0];
                    String imsi = sub_tmp[1];
                    String startdatetime = sub_tmp[2];
                    String called = sub_tmp[3];
                    String duration = sub_tmp[4];

                    if (Integer.parseInt(duration) > 0) {
                        if (calling.startsWith("0")) {
                            String callingNew = calling.substring(1);
                            calling = callingNew;
                        }
                        file f = new file(calling, imsi, startdatetime, called, duration);
                        arrayListTT.add(f);

                        writeFile(arrayListTT);
                    }
                } catch (Exception e) {
                    System.out.println("err: " + e.getMessage());
                }
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

    private static void writeFile(ArrayList<file> arrayListTT) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("output.txt", true);
            for (int i = 0; i < arrayListTT.size(); i++) {
                file d = arrayListTT.get(i);
                fw.write(d.getCalling() + ';' + d.getImsi() + ';' + d.getStartdatetime() + ";"
                        + d.getCalled() + ';' + d.getDuration());
                fw.write("\n");
            }
        } catch (Exception ex) {
            System.out.println("Err WriteFile: " + ex.getMessage());
        }finally{
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
