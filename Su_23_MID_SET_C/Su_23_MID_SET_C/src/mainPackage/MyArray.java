package mainPackage;

import java.util.ArrayList;

public class MyArray {

    private String name;
    private ArrayList<Integer> vals;

    public MyArray(ArrayList<Integer> vals) {
        this.vals = vals;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getVals() {
        return vals;
    }

    public void setVals(ArrayList<Integer> vals) {
        this.vals = vals;
    }

    @Override
    public String toString() {
        return " " + vals;
    }

    public void merge(MyArray arr) { //custom model class method
        this.vals.addAll(arr.vals);
    }

}
