package patterns.module.builder;

/*
* Fluent builder
* */
class Enemy {

    private String name;
    private int color;

    private Enemy(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
    }

    public String getName() {
        return name;
    }

    public int getColor() {
        return color;
    }

    public static class Builder {
        private final String name;
        private int color;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setColor(int color) {
            this.color = color;
            return this;
        }

        public Enemy build() {
            return new Enemy(this);
        }
    }
}
