package shalloAndDeepCopy;

public class Student implements Cloneable {

    int RollNo;
    Address address;//object type variable mdhe fkt reference copy hoto not a object

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student =(Student) super.clone();
        //student address=(Address) address.clone();
        return student; //clone method return by default shallow copy
    }
}
