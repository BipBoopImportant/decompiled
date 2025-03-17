package sa;

public enum X {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);
    
    private final int zzh;

    private X(int i10) {
        this.zzh = i10;
    }

    public final int zza() {
        return this.zzh;
    }
}
