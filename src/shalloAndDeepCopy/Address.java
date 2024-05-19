package shalloAndDeepCopy;

public class Address implements Cloneable {
    int AddressId;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
