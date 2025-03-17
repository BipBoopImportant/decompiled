package p1;

import android.graphics.ColorFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Lp1/e0;", "Lp1/w0;", "Lp1/v0;", "color", "Lp1/d0;", "blendMode", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "(JILandroid/graphics/ColorFilter;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "J", "getColor-0d7_KjU", "()J", "d", "I", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: p1.e0  reason: case insensitive filesystem */
public final class C5714e0 extends C5749w0 {

    /* renamed from: c  reason: collision with root package name */
    private final long f27306c;

    /* renamed from: d  reason: collision with root package name */
    private final int f27307d;

    public /* synthetic */ C5714e0(long j10, int i10, ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10, colorFilter);
    }

    public final int b() {
        return this.f27307d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5714e0)) {
            return false;
        }
        C5714e0 e0Var = (C5714e0) obj;
        return C5747v0.q(this.f27306c, e0Var.f27306c) && C5712d0.E(this.f27307d, e0Var.f27307d);
    }

    public int hashCode() {
        return (C5747v0.w(this.f27306c) * 31) + C5712d0.F(this.f27307d);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + C5747v0.x(this.f27306c) + ", blendMode=" + C5712d0.G(this.f27307d) + ')';
    }

    public /* synthetic */ C5714e0(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10);
    }

    private C5714e0(long j10, int i10, ColorFilter colorFilter) {
        super(colorFilter);
        this.f27306c = j10;
        this.f27307d = i10;
    }

    private C5714e0(long j10, int i10) {
        this(j10, i10, C5703I.a(j10, i10), (DefaultConstructorMarker) null);
    }
}
