package I0;

import XH.C16814e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"LI0/M0;", "T", "", "from", "to", "", "fraction", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;F)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "c", "F", "()F", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public final class M0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f7389a;

    /* renamed from: b  reason: collision with root package name */
    private final T f7390b;

    /* renamed from: c  reason: collision with root package name */
    private final float f7391c;

    public M0(T t10, T t11, float f10) {
        this.f7389a = t10;
        this.f7390b = t11;
        this.f7391c = f10;
    }

    public final float a() {
        return this.f7391c;
    }

    public final T b() {
        return this.f7389a;
    }

    public final T c() {
        return this.f7390b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M0)) {
            return false;
        }
        M0 m02 = (M0) obj;
        return C17542s.e(this.f7389a, m02.f7389a) && C17542s.e(this.f7390b, m02.f7390b) && this.f7391c == m02.f7391c;
    }

    public int hashCode() {
        T t10 = this.f7389a;
        int i10 = 0;
        int hashCode = (t10 != null ? t10.hashCode() : 0) * 31;
        T t11 = this.f7390b;
        if (t11 != null) {
            i10 = t11.hashCode();
        }
        return ((hashCode + i10) * 31) + Float.hashCode(this.f7391c);
    }

    public String toString() {
        return "SwipeProgress(from=" + this.f7389a + ", to=" + this.f7390b + ", fraction=" + this.f7391c + ')';
    }
}
