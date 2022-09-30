package src.TableAssignment;

import java.lang.reflect.Type;

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
    
    @Override
    public boolean equals(Object val) {
        if (value.getClass() == val.getClass()) {
            return value.equals(val);
        } else if (val.getClass() == this.getClass()) {
            return this.value == ((Data<?>) val).getValue() && this.key == ((Data<?>) val).getKey();
        } else {
            return this.equals(val);
        }
    }
    
}
