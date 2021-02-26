package namespace.review5;

public class Brand {
    public String brandName;
    public ImageAsset imageAsset;
    public FeaturesEnum[] features;
    public ConditionsEnum[] conditions;
    public Prices prices;
    Brand(String b, ImageAsset i, FeaturesEnum[] f, ConditionsEnum[] c, Prices p){
        this.brandName = b;
        this.imageAsset = i;
        this.features = f;
        this.conditions = c;
        this.prices = p;
    }

    // comparable check
    boolean comparable(Brand b) {
        if(b.features == this.features && b.conditions == this.conditions && b.prices == this.prices){
            return true;
        }
        return false;
    }
}
