public class UsingExceptions {
    public static void main(String[] args) {
        procA();
    }
    private static void procA(){
        try {
            System.out.println("inside procA ");
            // throw new RuntimeException("demo exception");
        }
        catch(Exception e) {
            System.out.println("Exception caught " + e);
        }
        finally {
            System.out.println("the finally block ALWAYS runs, even if there is an exception");
        }
    }
}
