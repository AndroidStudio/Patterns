package patterns.module.builder;

abstract class ShapeBuilder {

    Shape shape;

    Shape getShape() {
        return shape;
    }

    void createNewShape() {
        shape = new Shape();
    }

    abstract void setColor();

    abstract void setWidth();

    abstract void setHeight();

}
