package namespace.review5;

public class Compare {
    public static void main(String[] args) {
        // create brand instances and compare them
        ImageAsset img  = new ImageAsset("Brand Logo", "http://placekitten.com/420/640");
        ImageAsset img2 = new ImageAsset("Brand Logo", "http://placekitten.com/42/64");
        Prices prices   = new Prices(100, 10);
        Prices prices2   = new Prices(110, 11);
        FeaturesEnum features[] = {FeaturesEnum.legalCover};
        ConditionsEnum cond[] = {ConditionsEnum.minAge};
        Brand b1 = new Brand("Conmen-R-Us", img, features, cond, prices);
        Brand b2 = new Brand("Rip-off daily", img, features, cond, prices);
        Brand b3 = new Brand("Bodgit and Scarper", img2, features, cond, prices2);
        Brand b4 = new Brand("Tatty and Cheap (prunters) ltd", img, features, cond, prices2);
    
        // compare brands
        System.out.printf("Comparing %s with %s: %b\n", b1.brandName, b2.brandName, b1.comparable(b2));
        System.out.printf("Comparing %s with %s: %b\n", b2.brandName, b3.brandName, b2.comparable(b3));
        System.out.printf("Comparing %s with %s: %b\n", b3.brandName, b4.brandName, b3.comparable(b4));
    }
}
