package namespace.review5;

public enum ConditionsEnum {

    minAge(18), maxAge(80);
    private int age;
    // Constructor
    ConditionsEnum(int a){
        this.age = a;
    }

    int getAge(){
        return this.age;
    }
    
}
