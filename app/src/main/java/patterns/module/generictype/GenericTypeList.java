package patterns.module.generictype;

import java.util.ArrayList;

class GenericTypeList<T> {

    private final ArrayList<T> types = new ArrayList<>();

    ArrayList<T> getTypes() {
        return types;
    }

    void addItem(T t) {
        types.add(t);
    }
}
