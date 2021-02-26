enum Apple { // enumerated collections are used to look up values, NOT to change them
    Jonathan(10), GoldenDel(4), RedDel(7), PinkLady(12), CoxOrPip(8);
    private int price;
    Apple(int p){
        this.price = p;
    }
    int getPrice(){
        return this.price;
    }
    // @Override// NOT POSSIBLE since equals and compareTo are final
    // boolean compareTo(){
    //     super.compareTo();
    //     return false;
    // }
}
public class EnumExample {
    public static void main(String[] args) {
        // look up ONE apple
        System.out.printf("Pink Lady price is: %d\n", Apple.PinkLady.getPrice());
        // iterate over the WHOLE enum
        for ( Apple a : Apple.values() ){
            System.out.printf("%s costs %d\n", a, a.getPrice() );
            System.out.printf("%s position is %d\n", a, a.ordinal() );
        }
        // comparing items in an enum
        Apple ap1, ap2, ap3;
        ap1 = Apple.CoxOrPip;
        ap2 = Apple.PinkLady;
        ap3 = Apple.CoxOrPip;
        if(ap1.compareTo(ap2)<0){
            System.out.printf("%s comes before %s\n", ap1, ap2);
        }
        if(ap1.compareTo(ap2)>0){
            System.out.printf("%s comes after %s\n", ap1, ap2);
        }
        if(ap1.compareTo(ap2)==0){
            System.out.printf("%s is equal to %s\n", ap1, ap2);
        }
        if(ap1.equals(ap3)){
            System.out.printf("%s equals %s\n", ap1, ap3);
        }
    }
}
