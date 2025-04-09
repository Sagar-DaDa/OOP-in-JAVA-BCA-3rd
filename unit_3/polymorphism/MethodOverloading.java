package unit_3.polymorphism;

public class MethodOverloading {
    
    double sum(double x, double y){
        return x+y;
    }

    double sum(double x, double y, double z){
        return x+y+z;
    }

    double sub(double x, double y){
        return x-y;
    }

    double sub(double x, double y, double z){
        return x-y-z;
    }

    double mul(double x, double y){
        return x*y;
    }

    double mul(double x, double y, double z){
        return x*y*z;
    }

    double div(double x, double y){
        return x/y;
    }

    double div(double x, double y, double z){
        return x/y/z;
    }

    public static void main(String[] args) {
        double x = 5;
        double y = 7;
        double z = 12;

        MethodOverloading methodOverloading = new MethodOverloading();

        System.out.println(methodOverloading.sum(x, y));
    }
}
