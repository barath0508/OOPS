package Polymorphism;

class Overloading { 
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
    	Overloading calc = new Overloading();
        
        System.out.println("Sum:"+calc.add(5,7));
        System.out.println("Sum:"+calc.add(5,1,3));
        System.out.println("Sum:"+calc.add(5.5,7.2));
    }
}


