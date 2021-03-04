import java.io.*;
class FileHandling{
    public static void main(String[] args) throws IOException{
        FileReader in=null; // in is a referance 
        FileWriter out=null;
        try{
            in=new FileReader("a.txt");
            out=new FileWriter("b.txt");
            int c;
            while((c=in.read()) != -1){
                    System.out.println(c);
                    out.write(c);
            }
        }finally{
            in.close();
            out.close();
        }
        
    }
}
//Write a java program that reads on file name from the user,
// then displays information about whether
//the file exists, whether the file is readable,
// whether the file is writable, the type of file and the
//length of the file in bytes?