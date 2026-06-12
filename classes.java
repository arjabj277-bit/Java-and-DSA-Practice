class vehicle {
    int wheels;
    int color;
    int engine;

    void run(){
        System.out.println("runing");
    }
    void breaks(){
        System.out.println("apply the break");
    }
}
class cars extends vehicle {
    
}
class Scooty extends vehicle{

}
class Car {
    public static void main(String[] args) {
       vehicle v1 = new vehicle();
       v1.run();
       v1.breaks(); 
    }
}