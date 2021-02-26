package namespace.review5;

public enum FeaturesEnum {
    legalCover(true), discount(true), excess(true);
    private boolean flag;
    // Constructor
    FeaturesEnum(boolean f){
        this.flag = f;
    }

    boolean getFlag(){
        return this.flag;
    }
}
