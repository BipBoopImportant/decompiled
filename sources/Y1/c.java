package Y1;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import p1.C5728l0;
import p1.C5747v0;
import p1.e1;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u001b8VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"LY1/c;", "LY1/n;", "Lp1/e1;", "value", "", "alpha", "<init>", "(Lp1/e1;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lp1/e1;", "f", "()Lp1/e1;", "c", "F", "a", "()F", "Lp1/v0;", "()J", "color", "Lp1/l0;", "d", "()Lp1/l0;", "brush", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c implements n {

    /* renamed from: b  reason: collision with root package name */
    private final e1 f14740b;

    /* renamed from: c  reason: collision with root package name */
    private final float f14741c;

    public c(e1 e1Var, float f10) {
        this.f14740b = e1Var;
        this.f14741c = f10;
    }

    public float a() {
        return this.f14741c;
    }

    public long b() {
        return C5747v0.f27350b.i();
    }

    public C5728l0 d() {
        return this.f14740b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f14740b, cVar.f14740b) && Float.compare(this.f14741c, cVar.f14741c) == 0;
    }

    public final e1 f() {
        return this.f14740b;
    }

    public int hashCode() {
        return (this.f14740b.hashCode() * 31) + Float.hashCode(this.f14741c);
    }

    public String toString() {
        return "BrushStyle(value=" + this.f14740b + ", alpha=" + this.f14741c + ')';
    }
}
