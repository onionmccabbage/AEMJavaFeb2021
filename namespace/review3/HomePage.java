package namespace.review3;

public class HomePage extends Page{
    protected boolean isLoggedIn;
    protected int maxNumberOfAdverts;
    protected String[] ads = {"Three", "EE", "Vodafone", "Orange", "GiffGaff", "Smarty", "Lebara"};
    final Double MIN_WAGE = 7000.00; // by convention we use ALL_CAPS for constants
    public HomePage( String n, String l, boolean logFlag, int maxAds ){
        super(n, l); // call the parent constructor
        this.setIsLogedIn(logFlag);
        this.setMaxNumberOfAdverts(maxAds);;
    }
    public boolean getIsLoggedIn(){
        return this.isLoggedIn;
    }
    public void setIsLogedIn( boolean logFlag ){
        this.isLoggedIn = logFlag;
    }
    public int getMaxNumberOfAdverts(){
        return this.maxNumberOfAdverts;
    }
    public void setMaxNumberOfAdverts(int maxAds){
        if(maxAds > 0){
            this.maxNumberOfAdverts = maxAds;
        } else {
            this.maxNumberOfAdverts = 1;
        }
    }

    @Override
    public String toString(){
        String str = String.format("This Home page is called %s, the language is %s\nLogged in: %b max adverts: %d\n", this.getPageName(), this.getLanguage(), this.getIsLoggedIn(), this.getMaxNumberOfAdverts());
        str += String.format("Adverts: \n");
        int max;
        if (this.ads.length > this.maxNumberOfAdverts){
            max = this.maxNumberOfAdverts;
        } else {
            max = this.ads.length;
        }

        for (int i=0; i<max; i++){
            str += String.format("%12s\n",ads[i]);
        }
        return str;
    }
}
