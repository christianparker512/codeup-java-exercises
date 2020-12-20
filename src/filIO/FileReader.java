//package filIO;
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
//import java.util.Arrays;
//import java.util.List;
//
//public class FileReader {
//    private final Path logFilePath;
//    //properties for this class
//    //goal: read in a file and parse through it.
//    private String directoryName; //'data', 'src/fileIO'
//    private String fileName; //i.e.'day18.txt', 'jolts.txt'
//    private String logFileName;  //Where we store what went right or wrong. will hold logging info.
//    private Path directoryPath; //Path representation of the parent directory for our files.
////    parent directory for our files
//    private Path filePath;
////    file itself
//    private Path logfilePath; //Path representation of the log file.
//    private List<String> fileLines;//Holding spot for the content.
//
////    Constructor
////    Want to send in a directory path name and a file name, logFile name, and generate EVERYTHING from just those two values
//        public FileReader(String directoryName, String fileName, String logFileName){
//            this.directoryName = directoryName;
//            this.fileName = fileName;
//            this.logFileName = logFileName;
//            //Instantiating Path Values
//            this.directoryPath = Paths.get(directoryName);//Paths.get("data")
//            this.filePath= Paths.get(directoryName, fileName);
////            this.logFilePath = Paths.get(directoryName, logFileName);
//
//
//            //Check if files exist, and create them if they don't currently exist.
////            Log File
//            if (Files.notExists()){
//                try {
//                    Files.createFile(this.logFilePath);
//                } catch (IOException e) {
//                        //store this exception message in the log file
//                        // if there is an issue creating the log file, let's just crash the whole party and throw an IOException
//                    throw new IOException("Unable to create the logfile (" + this.logFileName + " )!");
//                }
//            }
//
//            //Director for data file ('data'), ('src/fileIO')
//            if (Files.notExists(this.directoryPath)) {
//                try {
//                    Files.createDirectories(this.directoryPath);
////                    createDirectories will create any missing parent directories along with the enclosing directory.
//                } catch (IOException e){
//////                    add this error message to the log
////                    Files.write(Path filePath, List<String> message(s))m aooendOption)
//                    Files.write(this.logFilePath, Arrays.asList(e.getMessage())),
//                    StandardOpenOption.APPEND);
//                //Stop all execution;
//                }
//            }
//            //            Data File ('day18.txt')
//            System.out.println(filePath);//display the file path for the passed in arguments
//
//
//        }
////   PSVM(20 files away from this way - it is static)
//        public static void main(String[] args) {
////            instantiate a fileReader object, and see if it works
//        FileReader thisFileReader = new FileReader("data", "day18.txt", "day18.log");
//        //set up a new instance to access the jolts.txt file
//            FileReader joltsReader = new FileReader("src/fileIO","jolts.txt", "jolts.log");
//}
//
////    CUSTOM METHOD
//
//
//    //Getters and Setters
//
//    public String getDirectoryName() {
//        return directoryName;
//    }
//
//    public void setDirectoryName(String directoryName) {
//        this.directoryName = directoryName;
//    }
//
//    public String getFileName() {
//        return fileName;
//    }
//
//    public void setFileName(String fileName) {
//        this.fileName = fileName;
//    }
//
//    public String getLogFileName() {
//        return logFileName;
//    }
//
//    public void setLogFileName(String logFileName) {
//        this.logFileName = logFileName;
//    }
//
//    public Path getDirectoryPath() {
//        return directoryPath;
//    }
//
//    public void setDirectoryPath(Path directoryPath) {
//        this.directoryPath = directoryPath;
//    }
//
//    public Path getFilePath() {
//        return filePath;
//    }
//
//    public void setFilePath(Path filePath) {
//        this.filePath = filePath;
//    }
//
//    public Path getLogfilePath() {
//        return logfilePath;
//    }
//
//    public void setLogfilePath(Path logfilePath) {
//        this.logfilePath = logfilePath;
//    }
//
//    public List<String> getFileLines() {
//        return fileLines;
//    }
//
//    public void setFileLines(List<String> fileLines) {
//        this.fileLines = fileLines;
//    }
//}
