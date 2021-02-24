package namespace.training;

// we can declare classes anywhere
class A {
    // class properties
    int i, j;
    // class constructor
    A(int x, int y){
        this.i = x;
        this.j = y;
    }
    // class method
    void showValues(){ // this defaults to protected, i.e. available anywhere within this module
        System.out.println(i + " " + j);
    }
}
class B extends A { // Now B will inherit EVEYTHING that A has
    int k;
    B(int x, int y, int z){ // class constructor
        // we call the constructor of the parent class
        super(x, y);
        this.k = z;
    }
    void showValues(){ // overriding a method of the parent
        System.out.println(i + " " + j + " " + k);
    }
}
public class UsingInheritance {
    public static void main(String[] args) {
        A sup = new A(3, 4); // A is the super class (also called the base class or the parent class)
        B sub = new B(7, 8, 9); // B is the subordinate class (or the child class)
        // set the properties
        // sup.i = 10;
        // sup.j = 20;
        // sub.i = -10;
        // sub.j = -20;
        // call methods of the instances
        sup.showValues();
        sub.showValues();
    }
}
