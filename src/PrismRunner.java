public class PrismRunner {
    public static void main(String[] args) {
        Prism prism = new Prism(5, 6, 10);
        System.out.println(prism.getPrismDimensions());


// test volume and surfaceArea methods
        int vol = prism.getVolume();
        int surfaceArea = prism.getSurfaceArea();
        System.out.println(vol);
        System.out.println(surfaceArea);


// test setter methods
        prism.setLength(8);
        prism.setWidth(15);
        prism.setHeight(20);
        System.out.println(prism.getPrismDimensions());


// retest volume and surfaceArea methods after setting new dimensions
        vol = prism.getVolume();
        surfaceArea = prism.getSurfaceArea();
        System.out.println(vol);
        System.out.println(surfaceArea);

    }
}
