package Superman;



class Vehicle {
    int maxSpeed = 120;
    public void vroom(){
        System.out.println("Vroom Vroom");
    }

}

class Car extends Vehicle{
    int maxSpeed = 100;
        public void vroom() {
            System.out.println("Skuurrt!");
        }

//    public void display() {
//        System.out.println(super.maxSpeed);
//    }
//    int maxSpeed = 100;

}



