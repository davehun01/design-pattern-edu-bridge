abstract class Shape {
    protected Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void show();
    public abstract void resize(//TODO parameter(s)));
}