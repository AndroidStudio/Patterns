package patterns.module.decorator;

class TextDecorator implements Text {

    private final Text text;

    TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text.getText();
    }
}
