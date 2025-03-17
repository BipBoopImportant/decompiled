package C3;

import java.util.UUID;
import t3.N;
import y3.b;

/* renamed from: C3.B  reason: case insensitive filesystem */
public final class C6408B implements b {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f33556d;

    /* renamed from: a  reason: collision with root package name */
    public final UUID f33557a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f33558b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public final boolean f33559c;

    static {
        boolean z10;
        if ("Amazon".equals(N.f29464c)) {
            String str = N.f29465d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f33556d = z10;
            }
        }
        z10 = false;
        f33556d = z10;
    }

    public C6408B(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    @Deprecated
    public C6408B(UUID uuid, byte[] bArr, boolean z10) {
        this.f33557a = uuid;
        this.f33558b = bArr;
        this.f33559c = z10;
    }
}
