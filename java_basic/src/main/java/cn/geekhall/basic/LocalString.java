package cn.geekhall.basic;

/**
 * LocalString.java
 *
 * @author yiny
 */
public class LocalString {
    private int hash; // Default to 0
    private final char value[];


//    public LocalString(String value) {
//        this.value = value;
//    }

    public LocalString(char[] value, int hash) {
        this.value = value;
        this.hash = hash;
    }

    @Override
    public int hashCode() {
        int h = hash;
        if (h == 0 && value.length > 0) {
            char val[] = value;

            for (int i = 0; i < value.length; i++) {
                System.out.println(h);
                h = 31 * h + val[i];
            }
            hash = h;
        }
        return h;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
