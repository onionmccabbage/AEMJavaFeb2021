package namespace.review3;

public class Page {
    protected String pageName;
    protected String language;
    protected String defaultContent;
    protected String additionalContent;

    final String DEFAULT_CONTENT = "Default Page Name";

    public Page(String n, String l) {
        this.setPageName(n);
        this.setLanguage(l);
    }

    public String getPageName() {
        return this.pageName;
    }

    public void setPageName(String newPageName) {
        if (newPageName == "") {
            this.pageName = DEFAULT_CONTENT;
        } else {
            this.pageName = newPageName;
        }
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String newLanguage) {
        if (newLanguage == "") {
            this.pageName = "en";
        } else {
            this.language = newLanguage;
        }
    }

    public void setDefaultPageContent(){
        this.defaultContent = DEFAULT_CONTENT;
    }
    public String getDefaultPageContent(){
        return this.defaultContent;
    }
    public void setAdditionalPageContent(String newContent){
        if(newContent ==""){
            this.additionalContent = DEFAULT_CONTENT;
        } else {
            this.additionalContent = newContent;
        }
    }
    public String getAdditionalPageContent(){
        return this.additionalContent;
    } 

    public void extendContent(){
        this.additionalContent += String.format("\n%s","Default Additional content");
    }
    public void extendContent( String extra ){
        this.additionalContent += String.format("\n%s",extra);
    }

    @Override
    public String toString(){
        String str = String.format("This page is called %s and the language is %s\n", this.getPageName(), this.getLanguage());
        str += String.format("%s %s\n",this.getDefaultPageContent(), this.getAdditionalPageContent());
        return str;
    }
}
