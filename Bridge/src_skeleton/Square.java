class Square extends Shape {
    public double side;

    public Square(Renderer renderer) {
        super(renderer);
    }

    public Square(Renderer renderer, double side) {
        //TODO implement
    }

    @Override
    public void show() {
        //TODO implement
    }

    @Override
    public void resize(double multiplier) {
        side *= multiplier;
    }
}