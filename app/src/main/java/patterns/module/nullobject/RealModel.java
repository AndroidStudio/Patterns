package patterns.module.nullobject;

class RealModel extends BaseModel {

    RealModel(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
