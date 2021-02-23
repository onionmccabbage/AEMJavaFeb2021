package grades;

// a non-runnable class
public class GradeBook {

    // we have the option of including a constructor method
    // the constructor initializes our class
    public GradeBook( String name, int initGrade ){
        itemName = name;
        grade = initGrade;
    }

    // declare private properties of this class
    private String itemName; // only visible within this class
    private int grade;

    // declare methods to manipulate the properties
    public void setItemName( String name ){
        // we would check the name is legal and cleansed
        itemName = name;
    }
    public String getItemName(){
        return itemName;
    } 

    public void setGrade( int newGrade ){
        // check grade is ok
        if(newGrade >=0 && newGrade <=5){
            // set the value
            grade = newGrade;
        }
        else if(newGrade <0){
            grade = 0;
        }
        else if(newGrade > 5){
            grade = 5;
        }
    }

    public int getGrade(){
        return grade;
    }

    public void displayMessage(String message){
        System.out.printf("The Grade Book message is: %s\n", message);
    }
}
