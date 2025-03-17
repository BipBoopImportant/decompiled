package f5;

import I2.C0;
import android.graphics.Rect;
import d5.C7744b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, d2 = {"Lf5/l;", "", "Ld5/b;", "_bounds", "LI2/C0;", "_windowInsetsCompat", "<init>", "(Ld5/b;LI2/C0;)V", "Landroid/graphics/Rect;", "bounds", "insets", "(Landroid/graphics/Rect;LI2/C0;)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ld5/b;", "b", "LI2/C0;", "()Landroid/graphics/Rect;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final C7744b f51164a;

    /* renamed from: b  reason: collision with root package name */
    private final C0 f51165b;

    public l(C7744b bVar, C0 c02) {
        C17542s.j(bVar, "_bounds");
        C17542s.j(c02, "_windowInsetsCompat");
        this.f51164a = bVar;
        this.f51165b = c02;
    }

    public final Rect a() {
        return this.f51164a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        l lVar = (l) obj;
        return C17542s.e(this.f51164a, lVar.f51164a) && C17542s.e(this.f51165b, lVar.f51165b);
    }

    public int hashCode() {
        return (this.f51164a.hashCode() * 31) + this.f51165b.hashCode();
    }

    public String toString() {
        return "WindowMetrics( bounds=" + this.f51164a + ", windowInsetsCompat=" + this.f51165b + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ l(android.graphics.Rect r1, I2.C0 r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0012
            I2.C0$a r2 = new I2.C0$a
            r2.<init>()
            I2.C0 r2 = r2.a()
            java.lang.String r3 = "Builder().build()"
            kotlin.jvm.internal.C17542s.i(r2, r3)
        L_0x0012:
            r0.<init>((android.graphics.Rect) r1, (I2.C0) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.l.<init>(android.graphics.Rect, I2.C0, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public l(Rect rect, C0 c02) {
        this(new C7744b(rect), c02);
        C17542s.j(rect, "bounds");
        C17542s.j(c02, "insets");
    }
}
