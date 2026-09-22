package collections.generics;

class Box<T> {

    // private data_type var_name
    private T value;

    // setter
    public void setValue(T value) {
        this.value = value;
    }

    // getter
    public T getValue() {
        return value;
    }

}

public class GenericsEx {
    public static void main(String[] args) {
        Box<String> stringObj = new Box<>();
        Box<Integer> intObj = new Box<>();
        stringObj.setValue("Tuesday");
        intObj.setValue(2);
        System.out.println(stringObj.getValue());
        System.out.println(intObj.getValue());

    }

}
