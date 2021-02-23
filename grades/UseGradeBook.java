package grades;

// runnable class - uses GradeBook class
public class UseGradeBook {
    public static void main(String[] args) {
        GradeBook myGradeBook = new GradeBook("initial", 3);
        String newItem = "Coffee";
        myGradeBook.setItemName(newItem);
        myGradeBook.setGrade(-99);// should set to zero
        myGradeBook.displayMessage( myGradeBook.getItemName() );
        myGradeBook.displayMessage( String.valueOf(myGradeBook.getGrade()) ); // cast int to String
        // myGradeBook.grade = -99; // fails - we cannot access private proterties directly
        System.out.printf("Grade is %d", myGradeBook.getGrade());
    }
}
