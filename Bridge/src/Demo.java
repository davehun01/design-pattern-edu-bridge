class Demo {

    public static void main(String[] args) {
    VectorRenderer vectorRenderer = new VectorRenderer();
    BitmapRenderer bitmapRenderer = new BitmapRenderer();
    Square square1 = new Square(vectorRenderer, 5);
    square1.show();
    square1.resize(2);
    square1.show();

    Square square2 = new Square(bitmapRenderer, 8);
    square2.show();
    square2.resize(10);
    square2.show();

    }
}
