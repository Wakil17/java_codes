package week;


public class DataPair<Key, Value> {
    private Key key;
    private Value value;

    public DataPair(Key paramKey, Value paramValue){
        key = paramKey;
        value = paramValue;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return value;
    }
}


