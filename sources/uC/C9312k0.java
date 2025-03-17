package Uc;

import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"LUc/k0;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "b", "()I", "NONE", "NORMAL", "SATELLITE", "TERRAIN", "HYBRID", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Uc.k0  reason: case insensitive filesystem */
public enum C9312k0 {
    NONE(0),
    NORMAL(1),
    SATELLITE(2),
    TERRAIN(3),
    HYBRID(4);
    
    private final int value;

    static {
        C9312k0[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private C9312k0(int i10) {
        this.value = i10;
    }

    public final int b() {
        return this.value;
    }
}
