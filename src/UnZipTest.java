import java.io.*;
import java.util.Enumeration;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class UnZipTest {
    public static void main(String[] args) throws IOException {

        String filePath = "ZipFile/src/logger/samplqaae.txt";
        String zipPath = "ZipFile/src/logger/Fri Oct 14 08:13:00 UTC 2022 ProductLabels : [ZIPTEST].zip";

        FileInputStream fis = new FileInputStream(zipPath);

        //assign output file: file3 to FileOutputStream for reading the data
        FileOutputStream fos = new FileOutputStream(filePath);

        //assign inflaterInputStream to FileInputStream for uncompressing the data
        InflaterInputStream iis = new InflaterInputStream(fis);

        //read data from inflaterInputStream and write it into FileOutputStream
        int data;
        while ((data = iis.read()) != -1) {
            fos.write(data);
        }

        //close the files
        fos.close();
        iis.close();
    }
}
