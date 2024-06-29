class Square extends Shape {
    public double side;

    public Square(Renderer renderer) {
        super(renderer);
    }

    public Square(Renderer renderer, double side) {
        super(renderer);
        this.side = side;
    }

    @Override
    public void show() {
        renderer.drawSquare(side);
    }

    @Override
    public void resize(double multiplier) {
        side *= multiplier;
    }
}