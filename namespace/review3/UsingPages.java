package namespace.review3;

public class UsingPages {
    static Page p;
    static HomePage h;
    static UserPage u;
    public static void main(String[] args) {
        initialise();
        additionalStuff();
        exercise();
    }

    private static void initialise(){
        // create some page instances
        p = new Page("Basic", "en");
        h = new HomePage("Home", "en", false, 5);
        u = new UserPage("User", "en", "Ginni", 10);
    }

    private static void exercise(){
        System.out.println( p.toString() );
        System.out.println( h.toString() );
        System.out.println( u.toString() );
    }

    private static void additionalStuff(){
        // make use of the content options
        p.setDefaultPageContent();
        p.setAdditionalPageContent("custom content");
        p.extendContent();
        p.extendContent("thats all for now");
    }
}
