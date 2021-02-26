package namespace.review5;

public class Brand {
    public ImageAsset imageAsset;
    public FeaturesEnum[] features;
    public ConditionsEnum[] conditions;
    public Prices prices;
    Brand(ImageAsset i, FeaturesEnum[] f, ConditionsEnum[] c, Prices p){
        this.imageAsset = i;
        this.features = f;
        this.conditions = c;
        this.prices = p;
    }

    // comparable check
    boolean comparable(Brand b) {
        if(b.features == this.features && b.conditions == this.conditions){
            return true;
        }
        return false;
    }
}
