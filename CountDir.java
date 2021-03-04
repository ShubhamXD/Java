import java.io.File;
class CountDir {
    static int directoryCount=0;
    static int fileCount=0;
    static int javaFileCount=0;
    public static void main(String[] args) {
        File file=new File(".");
        File[] files = file.listFiles();
        for(File f:files){
            if(f.isDirectory()){
                directoryCount++;}
            else if(f.isFile()){
                fileCount++;
                String s[]=f.getName().split("\\.");
                String extension=s[s.length - 1];
                if(extension.equalsIgnoreCase("java")){ 
                     //f.getName().endsWith(".java")
                    javaFileCount++;
                    System.out.println(f.getName());
                }
            }
        }
        System.out.println("Directories:"+directoryCount+"\nFiles:"+fileCount+"\n Java Files:"+javaFileCount);
    }
}