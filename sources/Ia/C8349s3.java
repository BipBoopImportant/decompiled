package ia;

/* renamed from: ia.s3  reason: case insensitive filesystem */
public enum C8349s3 implements C8269h {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);
    
    private final int zzl;

    private C8349s3(int i10) {
        this.zzl = i10;
    }

    public final int zza() {
        return this.zzl;
    }
}
