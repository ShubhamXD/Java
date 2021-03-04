import java.io.File;
class DirectoryScan {
    static int directoryCount=0;
    static int fileCount=0;
    static int JavaFileCount=0;
    static void scan(File file){
        File []files=file.listFiles();
        for(File f:files){
            if(f.isDirectory()){
                scan(f);
            }
            else if(f.isFile()){
                fileCount++;
                if(f.getName().endsWith(".java")){
                    JavaFileCount++;
                }
            }
        }
        System.out.print("Directories:"+directoryCount+"\nFiles:"+fileCount+"\nJava Files:"+JavaFileCount);
    }
    public static void main(String[] args) {
        File file=new File(".");
        scan(file); // current Directory
        // .. parent directory
    }
}