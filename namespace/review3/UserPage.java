package namespace.review3;

public class UserPage extends Page {
    protected String userName;
    protected int timeOutCountdown;
    final Double MIN_WAGE = 7000.00; // by convention we use ALL_CAPS for constants
    public UserPage( String n, String l, String u, int t ){
        super(n, l); // call the parent constructor
        this.setUsername(u);
        this.setTimeOutCountdown(t);;
    }
    public String getUserName(){
        return this.userName;
    }
    public void setUsername( String newUsername ){
        if(newUsername != ""){
            this.userName = newUsername;
        } else {
            this.userName = "Default Username";
        }
    }
    public int getTimeOutCountdown(){
        return this.timeOutCountdown;
    }
    public void setTimeOutCountdown(int t){
        if(t > 0){
            this.timeOutCountdown = t;
        } else {
            this.timeOutCountdown = 5;
        }
    }
    @Override
    public String toString(){
        String str = String.format("This User page is called %s, the language is %s\nThe username is %s and it times out after %d minutes", getPageName(), getLanguage(), getUserName(), getTimeOutCountdown());
        return str;
    }
}
