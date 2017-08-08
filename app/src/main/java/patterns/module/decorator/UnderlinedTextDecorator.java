package patterns.module.decorator;

 class UnderlinedTextDecorator extends TextDecorator {

     UnderlinedTextDecorator(Text text) {
        super(text);
    }

    @Override
    public String getText() {
        return "<u>" + super.getText() + "</u>";
    }
}
