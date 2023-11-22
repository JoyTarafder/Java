
package mainpkg;


public class MyArray {
    private String arrayName;
    private int [] valList;
    private int arraySize;
    private float avgArray;

    public MyArray(String arrayName, int[] valList, int arraySize, float avgArray) {
        this.arrayName = arrayName;
        this.valList = valList;
        this.arraySize = arraySize;
        this.avgArray = avgArray;
    }

    public String getArrayName() {
        return arrayName;
    }

    public int[] getValList() {
        return valList;
    }

    public int getArraySize() {
        return arraySize;
    }

    public float getAvgArray() {
        return avgArray;
    }

    public void setArrayName(String arrayName) {
        this.arrayName = arrayName;
    }

    public void setValList(int[] valList) {
        this.valList = valList;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    public void setAvgArray(float avgArray) {
        this.avgArray = avgArray;
    }

    @Override
    public String toString() {
        return "MyArray{" + "arrayName=" + arrayName + ", valList=" + valList + ", arraySize=" + arraySize + ", avgArray=" + avgArray + '}';
    }

    
}
