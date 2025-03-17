package sa;

public enum E {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");
    
    private final String zzf;

    private E(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
