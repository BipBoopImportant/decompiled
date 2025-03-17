package wK;

import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.i1;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001c\u0010)R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b \u0010)¨\u0006+"}, d2 = {"LwK/f4;", "", "LwK/S1;", "colors", "LwK/R1;", "sizes", "LwK/J4;", "loadingAnimationType", "Lp1/i1;", "shape", "Lc2/h;", "cornerSize", "focusedCornerSize", "<init>", "(LwK/S1;LwK/R1;LwK/J4;Lp1/i1;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LwK/S1;", "()LwK/S1;", "b", "LwK/R1;", "getSizes", "()LwK/R1;", "c", "LwK/J4;", "d", "()LwK/J4;", "Lp1/i1;", "getShape", "()Lp1/i1;", "e", "F", "()F", "f", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.f4  reason: case insensitive filesystem */
public final class C18322f4 {

    /* renamed from: a  reason: collision with root package name */
    private final S1 f150821a;

    /* renamed from: b  reason: collision with root package name */
    private final R1 f150822b;

    /* renamed from: c  reason: collision with root package name */
    private final J4 f150823c;

    /* renamed from: d  reason: collision with root package name */
    private final i1 f150824d;

    /* renamed from: e  reason: collision with root package name */
    private final float f150825e;

    /* renamed from: f  reason: collision with root package name */
    private final float f150826f;

    public /* synthetic */ C18322f4(S1 s12, R1 r12, J4 j42, i1 i1Var, float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(s12, r12, j42, i1Var, f10, f11);
    }

    public final S1 a() {
        return this.f150821a;
    }

    public final float b() {
        return this.f150825e;
    }

    public final float c() {
        return this.f150826f;
    }

    public final J4 d() {
        return this.f150823c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18322f4)) {
            return false;
        }
        C18322f4 f4Var = (C18322f4) obj;
        return C17542s.e(this.f150821a, f4Var.f150821a) && C17542s.e(this.f150822b, f4Var.f150822b) && this.f150823c == f4Var.f150823c && C17542s.e(this.f150824d, f4Var.f150824d) && h.D(this.f150825e, f4Var.f150825e) && h.D(this.f150826f, f4Var.f150826f);
    }

    public int hashCode() {
        return (((((((((this.f150821a.hashCode() * 31) + this.f150822b.hashCode()) * 31) + this.f150823c.hashCode()) * 31) + this.f150824d.hashCode()) * 31) + h.E(this.f150825e)) * 31) + h.E(this.f150826f);
    }

    public String toString() {
        S1 s12 = this.f150821a;
        R1 r12 = this.f150822b;
        J4 j42 = this.f150823c;
        i1 i1Var = this.f150824d;
        String F10 = h.F(this.f150825e);
        String F11 = h.F(this.f150826f);
        return "JumboButtonStyle(colors=" + s12 + ", sizes=" + r12 + ", loadingAnimationType=" + j42 + ", shape=" + i1Var + ", cornerSize=" + F10 + ", focusedCornerSize=" + F11 + ")";
    }

    private C18322f4(S1 s12, R1 r12, J4 j42, i1 i1Var, float f10, float f11) {
        C17542s.j(s12, "colors");
        C17542s.j(r12, "sizes");
        C17542s.j(j42, "loadingAnimationType");
        C17542s.j(i1Var, "shape");
        this.f150821a = s12;
        this.f150822b = r12;
        this.f150823c = j42;
        this.f150824d = i1Var;
        this.f150825e = f10;
        this.f150826f = f11;
    }
}
