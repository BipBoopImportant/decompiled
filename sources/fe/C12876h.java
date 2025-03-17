package FE;

/* renamed from: FE.h  reason: case insensitive filesystem */
public enum C12876h {
    REVENUE("revenue"),
    VALUE("value");
    
    private final String key;

    private C12876h(String str) {
        this.key = str;
    }

    public String toString() {
        return this.key;
    }
}
