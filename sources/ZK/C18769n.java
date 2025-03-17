package zK;

import G1.C4507j;
import U0.A1;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m0.C5530a;
import m0.C5546i;
import m0.C5554m;
import n0.C5586I;
import p1.C5747v0;
import r0.k;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t0\u0006\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010!¨\u0006$"}, d2 = {"LzK/n;", "Ln0/I;", "", "resizeFactor", "Lm0/i;", "animationSpec", "LU0/A1;", "Lp1/v0;", "color", "Lm0/a;", "Lm0/m;", "scale", "Lc2/h;", "cornersRadius", "<init>", "(FLm0/i;LU0/A1;LU0/A1;LU0/A1;)V", "Lr0/k;", "interactionSource", "LG1/j;", "a", "(Lr0/k;)LG1/j;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "b", "Lm0/i;", "c", "LU0/A1;", "d", "e", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zK.n  reason: case insensitive filesystem */
final class C18769n implements C5586I {

    /* renamed from: a  reason: collision with root package name */
    private final float f152854a;

    /* renamed from: b  reason: collision with root package name */
    private final C5546i<Float> f152855b;

    /* renamed from: c  reason: collision with root package name */
    private final A1<C5747v0> f152856c;

    /* renamed from: d  reason: collision with root package name */
    private final A1<C5530a<Float, C5554m>> f152857d;

    /* renamed from: e  reason: collision with root package name */
    private final A1<h> f152858e;

    public C18769n(float f10, C5546i<Float> iVar, A1<C5747v0> a12, A1<C5530a<Float, C5554m>> a13, A1<h> a14) {
        C17542s.j(iVar, "animationSpec");
        C17542s.j(a12, "color");
        C17542s.j(a13, "scale");
        C17542s.j(a14, "cornersRadius");
        this.f152854a = f10;
        this.f152855b = iVar;
        this.f152856c = a12;
        this.f152857d = a13;
        this.f152858e = a14;
    }

    public C4507j a(k kVar) {
        C17542s.j(kVar, "interactionSource");
        return new C18770o(kVar, this.f152854a, this.f152855b, this.f152856c, this.f152857d, this.f152858e);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return -1;
    }
}
