package ThisExample;

public class ThisIsFun {
    int a;
    int b;

    String food;
    char size;
//    You can not use the word static with This
    public void setData (String food, char size){
        this.food = food;
        this.size = size;

    }
//    You can not use the word static with THIs
    public void setData(int a, int b){
        this.a = a;
        this.b = b;

    }
    public static void main(String[] args) {

        ThisIsFun t = new ThisIsFun();

        t.setData(4,3);
        t.setData("soup", 'L');
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.food);
        System.out.println(t.size);
    }
}
