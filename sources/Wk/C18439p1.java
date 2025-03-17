package wK;

import N1.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LwK/p1;", "", "LwK/Z0;", "colors", "LN1/Y;", "textStyle", "<init>", "(LwK/Z0;LN1/Y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LwK/Z0;", "()LwK/Z0;", "b", "LN1/Y;", "getTextStyle", "()LN1/Y;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.p1  reason: case insensitive filesystem */
final class C18439p1 {

    /* renamed from: a  reason: collision with root package name */
    private final Z0 f151383a;

    /* renamed from: b  reason: collision with root package name */
    private final Y f151384b;

    public C18439p1(Z0 z02, Y y10) {
        C17542s.j(z02, "colors");
        C17542s.j(y10, "textStyle");
        this.f151383a = z02;
        this.f151384b = y10;
    }

    public final Z0 a() {
        return this.f151383a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18439p1)) {
            return false;
        }
        C18439p1 p1Var = (C18439p1) obj;
        return C17542s.e(this.f151383a, p1Var.f151383a) && C17542s.e(this.f151384b, p1Var.f151384b);
    }

    public int hashCode() {
        return (this.f151383a.hashCode() * 31) + this.f151384b.hashCode();
    }

    public String toString() {
        Z0 z02 = this.f151383a;
        Y y10 = this.f151384b;
        return "CheckboxStyle(colors=" + z02 + ", textStyle=" + y10 + ")";
    }
}
