package namespace.training;

public class Employee extends Person {
    private Double salary;
    final Double MIN_WAGE = 7000.00; // by convention we use ALL_CAPS for constants
    public Employee( String n, Double s ){
        super(n); // call the parent constructor
        this.setSalary(s); // call the setter method
    }
    public Double getSalary(){
        return this.salary;
    }
    public void setSalary( Double s ){
        // here we would check the salary is suitable
        if( s >= MIN_WAGE){
            this.salary = s;
        }
        else {
            this.salary = MIN_WAGE; // minimum wage
        }
    }
    // business methods
    // pay rise
    public void payRaise( Double amount ){
        this.salary += amount;
    }
    // pay bonus: either a default 1% or a specific amount
    public void payBonus( Double percentBonus ){
        this.salary *= 1+percentBonus/100;
    }
    // overload the payBonus method with a DIFFERENT signature...
    public void payBonus(){
        this.salary *= 1.01; // defailt 1% raise
    }
    // we can Override built-in methods 
    @Override // the @ indicated a decorator
    public String toString(){ // we are overriding the built-in toString mwthod
        String str = String.format("%s earns %.2f", this.name, this.salary);
        return str;
    }
}
