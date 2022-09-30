package src.TableAssignment;

public class Data<T> {
    private T value;
    private final int key;
    Data(T _value, int _key){
        this.value = _value;
        this.key = _key;
    }

    public void setValue(T _value) {this.value = _value;}
    public T getValue() {return this.value;}
    public int getKey() {return this.key;}

}
