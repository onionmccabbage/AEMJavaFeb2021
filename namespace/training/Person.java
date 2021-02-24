package namespace.training;

public class Person {
    // protected is available anywhere in the current namespace
    protected String name;
    public Person( String n ){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    public void setName( String newName ){
        // here we would data-cleanse the name value
        this.name = newName;
    }
}
