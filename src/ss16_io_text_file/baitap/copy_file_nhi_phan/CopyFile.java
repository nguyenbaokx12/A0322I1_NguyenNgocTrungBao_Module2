package ss16_io_text_file.baitap.copy_file_nhi_phan;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try {
            FileReader filereader = new FileReader("src/ss16_io_text_file/baitap/copy_file_nhi_phan/Source.txt");
            BufferedReader bufferedReader = new BufferedReader(filereader);
            FileWriter fileWriter = new FileWriter("src/ss16_io_text_file/baitap/copy_file_nhi_phan/Target.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String result = "";
            String line = "";
            while((line = bufferedReader.readLine()) != null){
                result = result + line + "\n";
            }
            result = result.substring(0, result.length()-1);
            bufferedWriter.write(result);
            bufferedReader.close();
            filereader.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
