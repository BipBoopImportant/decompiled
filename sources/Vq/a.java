package Vq;

import c2.h;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LVq/a;", "", "Lc2/h;", "width", "height", "<init>", "(Ljava/lang/String;IFF)V", "F", "m", "()F", "j", "QR", "CODE_128", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
enum a {
    QR(r1.e(), r1.d()),
    CODE_128(h.B((float) 280), r1.b());
    
    private final float height;
    private final float width;

    static {
        a[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private a(float f10, float f11) {
        this.width = f10;
        this.height = f11;
    }

    public static C17220a<a> b() {
        return $ENTRIES;
    }

    public final float j() {
        return this.height;
    }

    public final float m() {
        return this.width;
    }
}
