class Appliance{
    void turnOn(){
        System.out.println("bread is baking");

    }
}
class Toaster extends Appliance{
    @Override
    void turnOn(){//Redefines turnon method        System.out.println("Heating up bread");
        
    }
}
class Problem2{
    public static void main(String[] args){
    Appliance a1 = new Appliance();
    a1.turnOn();
    Toaster t1 = new Toaster();
    t1.turnOn();

}
}
