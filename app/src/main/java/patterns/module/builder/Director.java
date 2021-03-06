package patterns.module.builder;

class Director {

    private ShapeBuilder shapeBuilder;

    void setShapeBuilder(ShapeBuilder shapeBuilder) {
        this.shapeBuilder = shapeBuilder;
    }

    Shape getShape() {
        return shapeBuilder.getShape();
    }

    void buildShape() {
        shapeBuilder.createNewShape();
        shapeBuilder.setColor();
        shapeBuilder.setWidth();
        shapeBuilder.setHeight();
    }
}
