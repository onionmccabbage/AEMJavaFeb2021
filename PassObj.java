class Test{
    int a, b;
    Test(int i, int j){
        this.a = i;
        this.b = j;
    }
    boolean equalTo(Test obj){
        if(obj.a == this.a && obj.b == this.b){
            return true;
        }
        return false;
    }
}

public class PassObj {
    public static void main(String[] args) {
        int x = 42;
        int y = 42;
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        // are they actually equal?
        System.out.printf("Comparing ob1 == ob2: %b\n", ob1==ob2); // false - pass by REFERENCE
        System.out.printf("Comparing x == y: %b\n", x==y); // true - the VALUES are the same
        System.out.printf("Comparing properties: %b\n", ob1.a == ob2.a); // true
        System.out.printf("Using equalTo: %b \n", ob1.equalTo(ob2)); // true
        System.out.printf("Using equalTo: %b \n", ob2.equalTo(ob1)); // true
    }
}
