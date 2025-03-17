package F6;

public enum c {
    JSON(".json"),
    ZIP(".zip");
    
    public final String extension;

    private c(String str) {
        this.extension = str;
    }

    public String b() {
        return ".temp" + this.extension;
    }

    public String toString() {
        return this.extension;
    }
}
