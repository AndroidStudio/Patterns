package patterns.module.decorator;

class BoldTextDecorator extends TextDecorator {

    BoldTextDecorator(Text text) {
        super(text);
    }

    @Override
    public String getText() {
        return "<b>" + super.getText() + "</b>";
    }
}
