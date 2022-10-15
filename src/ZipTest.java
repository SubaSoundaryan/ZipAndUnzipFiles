import java.io.*;
import java.util.zip.DeflaterOutputStream;

public class ZipTest {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Test String");

        File file = new File("ZipFile/src/logger/sample.txt");

        if(file.getParentFile().mkdirs())
            System.out.println("LOGGER.log(Level.INFO, \"Path Found\"");
        if (file.createNewFile())
            System.out.println("LOGGER.log(Level.INFO, \"Path Found\"");
        FileWriter fileWriter = new FileWriter(file);

        if (!file.getParentFile().exists() && file.getParentFile().mkdirs())
            System.out.println("LOGGER.log(Level.INFO, \"Path Found\"");
        if (!file.exists() && file.createNewFile())
            System.out.println("LOGGER.log(Level.INFO, \"Path Found\"");

        fileWriter.write(String.valueOf(sb));
        fileWriter.flush();

        //Assign the original file : file to
        //FileInputStream for reading data
        FileInputStream fis=new FileInputStream("ZipFile/src/logger/sample.txt");

        //Assign compressed file:file2 to FileOutputStream
        FileOutputStream fos=new FileOutputStream("ZipFile/src/logger/sample.zip");

        //Assign FileOutputStream to DeflaterOutputStream
        DeflaterOutputStream dos=new DeflaterOutputStream(fos);

        //read data from FileInputStream and write it into DeflaterOutputStream
        int data;
        while ((data=fis.read())!=-1)
        {
            dos.write(data);
        }

        //close the file
        fis.close();
        dos.close();
    }
}
