public class ForLoopStatement {
    public static void main(String[] args) {
//        This will go on forever due to it always being higher than zero
        for (int number = 100; number> 0; number += 10){
            System.out.println("number = " + number);
        }
    }
}
