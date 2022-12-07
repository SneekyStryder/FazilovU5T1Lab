public class Prism {
    private int length;
    private int width;
    private int height;

    public Prism(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Prism(int side) {
        length = side;
        width = side;
        height = side;
    }

    public Prism() {
        length = (int) ((Math.random() * 91) + 10);
        width = (int) ((Math.random() * 91) + 10);
        height = (int) ((Math.random() * 91) + 10);
    }

    public int getVolume() {
        return length * width * height;
    }

    public int getSurfaceArea() {
        int perimeter = 2 * length + 2 * width;
        return perimeter * height + 2 * (length * width);
    }

    public String getPrismDimensions() {
        return "Length = " + length + ",\nWidth = " + width + ",\nHeight = " + height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
