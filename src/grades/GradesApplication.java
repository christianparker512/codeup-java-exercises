//package grades;
//import util.Input;
//import java.util.HashMap;
////inport java.util.Map;
//
//public class GradesApplication {
//
//    public static void main(String[] args) {
//        Input input = new Input();
//        HashMap<String, Student> students = new HashMap<>();
//
//
////        Student christian = new Student("Christian");
//        Student lisa = new Student ("Lisa");
//        Student abby = new Student ("Abby");
//        Student quincy  = new Student ("Quincy");
//        Student baxter = new Student ("Baxter");
//
//        Student christian = new Student("Christian");
//        students.putIfAbsent("Christianparker512", christian);
//        christian.addGrade(100);
//        christian.addGrade(100);
//        christian.addGrade(100);
//        christian.addGrade(40);
//
//        students.put("Lisajo2112", lisa);
//        lisa.addGrade(85);
//        lisa.addGrade(85);
//        lisa.addGrade(85);
//        lisa.addGrade(85);
//
//        students.put("Abstastic902",abby);
//        abby.addGrade(100);
//        abby.addGrade(98);
//        abby.addGrade(99);
//        abby.addGrade(95);
//        students.put("Barkbarkwoofwoof", quincy);
//        quincy.addGrade(25);
//        quincy.addGrade(30);
//        quincy.addGrade(20);
//        quincy.addGrade(30);
//
//        students.put("Bugeye",baxter);
//        baxter.addGrade(10);
//        baxter.addGrade(20);
//        baxter.addGrade(20);
//        baxter.addGrade(10);
//
//        System.out.println("Welcome");
//        System.out.println("Here are the GitHub usernames of the Parker Family Home School Education Facility\n");
//
//        for(String key: students.keySet()){
//            System.out.printf("|%s| ", key);
//        }
//
//        boolean confirm;
//        do {
//
//            System.out.print("\nWhich student would you like more information on?\n");
//            String userName = input.getString();
//            if(students.containsKey(userName)) {
//                Student selectedStudent = students.get(userName);
//                System.out.printf("Name: %s, Github username: %s%nAverage: %.2f%n", selectedStudent.getName(), userName, selectedStudent.getGradeAverage());
//            } else {
//                System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n", input);
//            }
//            confirm = input.yesNo("Would you like to see another student? [y/n]");
//        }while(confirm);
//
//        System.out.println("Goodbye, and have a wonderful day!");
//
//
//
//    }
//
//}
