import java.io.IOException;
import java.io.File;
class FileInfo{
    public static void main(String[] args) throws IOException {
    File a=new File("a.txt");
    System.out.println(a.exists() ? "File Exist":"File Not Found" );
    System.out.println(a.canRead() ? "File is readable":"File Not readable" );
    System.out.println(a.canWrite() ? "File is Writable":"File Not Writable"); 
    System.out.println(a.canExecute() ? "File is Executable":"File Not Executable" );
    System.out.println(a.getName());
    System.out.println(a.getAbsolutePath());
    System.out.println(a.getCanonicalFile());
    System.out.println(a.length());          
    }
}
//Write a java program that reads on file name from the user,
// then displays information about whether
//the file exists, whether the file is readable,
// whether the file is writable, the type of file and the
//length of the file in bytes?