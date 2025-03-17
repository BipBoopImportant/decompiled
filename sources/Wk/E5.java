package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"LwK/E5;", "", "LwK/A5;", "program", "LwK/z5;", "orientation", "LwK/e5;", "codeType", "<init>", "(LwK/A5;LwK/z5;LwK/e5;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LwK/A5;", "c", "()LwK/A5;", "b", "LwK/z5;", "()LwK/z5;", "LwK/e5;", "()LwK/e5;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class E5 {

    /* renamed from: d  reason: collision with root package name */
    public static final int f149449d = 0;

    /* renamed from: a  reason: collision with root package name */
    private final A5 f149450a;

    /* renamed from: b  reason: collision with root package name */
    private final C18561z5 f149451b;

    /* renamed from: c  reason: collision with root package name */
    private final C18311e5 f149452c;

    public E5() {
        this((A5) null, (C18561z5) null, (C18311e5) null, 7, (DefaultConstructorMarker) null);
    }

    public final C18311e5 a() {
        return this.f149452c;
    }

    public final C18561z5 b() {
        return this.f149451b;
    }

    public final A5 c() {
        return this.f149450a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E5)) {
            return false;
        }
        E5 e52 = (E5) obj;
        return this.f149450a == e52.f149450a && this.f149451b == e52.f149451b && this.f149452c == e52.f149452c;
    }

    public int hashCode() {
        return (((this.f149450a.hashCode() * 31) + this.f149451b.hashCode()) * 31) + this.f149452c.hashCode();
    }

    public String toString() {
        A5 a52 = this.f149450a;
        C18561z5 z5Var = this.f149451b;
        C18311e5 e5Var = this.f149452c;
        return "MemberCardStyleParams(program=" + a52 + ", orientation=" + z5Var + ", codeType=" + e5Var + ")";
    }

    public E5(A5 a52, C18561z5 z5Var, C18311e5 e5Var) {
        C17542s.j(a52, "program");
        C17542s.j(z5Var, "orientation");
        C17542s.j(e5Var, "codeType");
        this.f149450a = a52;
        this.f149451b = z5Var;
        this.f149452c = e5Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E5(A5 a52, C18561z5 z5Var, C18311e5 e5Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? A5.Family : a52, (i10 & 2) != 0 ? C18561z5.Horizontal : z5Var, (i10 & 4) != 0 ? C18311e5.QR : e5Var);
    }
}
