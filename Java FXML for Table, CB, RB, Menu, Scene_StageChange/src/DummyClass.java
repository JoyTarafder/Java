public class DummyClass {
    private int val;
    private static int val2;
    private String str;

    public DummyClass(int val, String str) {
        this.val = val;
        this.str = str;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public static int getVal2() {
        return val2;
    }

    public static void setVal2(int val2) {
        DummyClass.val2 = val2;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    
    
}
