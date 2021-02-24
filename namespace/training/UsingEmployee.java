package namespace.training;

public class UsingEmployee {
    static Employee emp;
    static Employee ginni;
    public static void main(String[] args) { // we usually use a functional approach, i.e. call functions to do the detail work
        setup();
        doStuff();
    }
    
    // we usually separate our code into functional blocks
    private static void setup(){
        emp = new Employee("Grace Hopper", 8700.00); // NB the salary MUST include decimal part since it is a Double
        ginni = new Employee("Ginny Rometty", 300.00); 
    }
    private static void doStuff(){
        System.out.printf("Details of %s: salary is %.2f\n", emp.getName(), emp.getSalary());
        ginni.payBonus(); // default 1%
        ginni.payBonus(2.00);
        System.out.printf("Details of %s: salary is %.2f\n", ginni.getName(), ginni.getSalary());
        // experiment
        System.out.println( ginni.toString() );
    }
}
