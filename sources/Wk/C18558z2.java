package wK;

import U0.A1;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5525D;
import m0.C5534c;
import m0.C5548j;
import nI.C17642l;
import p1.C5747v0;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"LwK/z2;", "", "Lp1/v0;", "outerColor", "innerColor", "backgroundColor", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "selected", "hover", "pressed", "LU0/A1;", "Lc2/h;", "b", "(ZZZLU0/m;I)LU0/A1;", "", "a", "(ZZLU0/m;I)LU0/A1;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "e", "()J", "d", "c", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.z2  reason: case insensitive filesystem */
final class C18558z2 {

    /* renamed from: a  reason: collision with root package name */
    private final long f152010a;

    /* renamed from: b  reason: collision with root package name */
    private final long f152011b;

    /* renamed from: c  reason: collision with root package name */
    private final long f152012c;

    public /* synthetic */ C18558z2(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    public final A1<Float> a(boolean z10, boolean z11, C4889m mVar, int i10) {
        mVar.W(-925703527);
        if (C4895p.J()) {
            C4895p.S(-925703527, i10, -1, "net.ikea.skapa.ui.components.DotStyle.alpha (ShoppableImage.kt:600)");
        }
        A1<Float> d10 = C5534c.d(z11 ? 0.9f : z10 ? 0.75f : 0.48f, C5548j.j(100, 0, (C5525D) null, 6, (Object) null), 0.0f, "Alpha animation", (C17642l<? super Float, C16807N>) null, mVar, 3120, 20);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return d10;
    }

    public final A1<h> b(boolean z10, boolean z11, boolean z12, C4889m mVar, int i10) {
        mVar.W(711819008);
        if (C4895p.J()) {
            C4895p.S(711819008, i10, -1, "net.ikea.skapa.ui.components.DotStyle.dotRadius (ShoppableImage.kt:590)");
        }
        A1<h> c10 = C5534c.c((z10 || z12 || z11) ? h.B(A9.f149218a.b() / ((float) 2)) : h.B(A9.f149218a.a() / ((float) 2)), C5548j.j(100, 0, (C5525D) null, 6, (Object) null), "Dot animation", (C17642l<? super h, C16807N>) null, mVar, 432, 8);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return c10;
    }

    public final long c() {
        return this.f152012c;
    }

    public final long d() {
        return this.f152011b;
    }

    public final long e() {
        return this.f152010a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18558z2)) {
            return false;
        }
        C18558z2 z2Var = (C18558z2) obj;
        return C5747v0.q(this.f152010a, z2Var.f152010a) && C5747v0.q(this.f152011b, z2Var.f152011b) && C5747v0.q(this.f152012c, z2Var.f152012c);
    }

    public int hashCode() {
        return (((C5747v0.w(this.f152010a) * 31) + C5747v0.w(this.f152011b)) * 31) + C5747v0.w(this.f152012c);
    }

    public String toString() {
        String x10 = C5747v0.x(this.f152010a);
        String x11 = C5747v0.x(this.f152011b);
        String x12 = C5747v0.x(this.f152012c);
        return "DotStyle(outerColor=" + x10 + ", innerColor=" + x11 + ", backgroundColor=" + x12 + ")";
    }

    private C18558z2(long j10, long j11, long j12) {
        this.f152010a = j10;
        this.f152011b = j11;
        this.f152012c = j12;
    }
}
