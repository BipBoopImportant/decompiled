package wK;

import N1.E;
import N1.Y;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U0.C4889m;
import U0.C4895p;
import U1.e;
import Y1.a;
import Y1.h;
import Y1.k;
import Y1.o;
import Y1.q;
import Y1.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;
import p1.g1;
import r1.g;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"LwK/f3;", "", "LwK/S1;", "colors", "LY1/k;", "decoration", "Lp1/v0;", "background", "<init>", "(LwK/S1;LY1/k;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "LN1/Y;", "style", "", "active", "hover", "a", "(LN1/Y;ZZLU0/m;I)LN1/Y;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LwK/S1;", "getColors", "()LwK/S1;", "b", "LY1/k;", "getDecoration", "()LY1/k;", "c", "J", "getBackground-0d7_KjU", "()J", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.f3  reason: case insensitive filesystem */
final class C18321f3 {

    /* renamed from: a  reason: collision with root package name */
    private final S1 f150818a;

    /* renamed from: b  reason: collision with root package name */
    private final k f150819b;

    /* renamed from: c  reason: collision with root package name */
    private final long f150820c;

    public /* synthetic */ C18321f3(S1 s12, k kVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(s12, kVar, j10);
    }

    public final Y a(Y y10, boolean z10, boolean z11, C4889m mVar, int i10) {
        int i11 = i10;
        C17542s.j(y10, "style");
        mVar.W(1092571771);
        if (C4895p.J()) {
            C4895p.S(1092571771, i11, -1, "net.ikea.skapa.ui.components.HyperlinkStyle.toTextStyle (Hyperlink.kt:155)");
        }
        Y y11 = y10;
        Y c10 = Y.c(y11, this.f150818a.c(true, z10, z11, mVar, (i11 & 112) | 6 | (i11 & 896), 0).getValue().y(), 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (a) null, (o) null, (e) null, this.f150820c, this.f150819b, (g1) null, (g) null, 0, 0, 0, (q) null, (E) null, (h) null, 0, 0, (s) null, 16771070, (Object) null);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return c10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18321f3)) {
            return false;
        }
        C18321f3 f3Var = (C18321f3) obj;
        return C17542s.e(this.f150818a, f3Var.f150818a) && C17542s.e(this.f150819b, f3Var.f150819b) && C5747v0.q(this.f150820c, f3Var.f150820c);
    }

    public int hashCode() {
        int hashCode = this.f150818a.hashCode() * 31;
        k kVar = this.f150819b;
        return ((hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31) + C5747v0.w(this.f150820c);
    }

    public String toString() {
        S1 s12 = this.f150818a;
        k kVar = this.f150819b;
        String x10 = C5747v0.x(this.f150820c);
        return "HyperlinkStyle(colors=" + s12 + ", decoration=" + kVar + ", background=" + x10 + ")";
    }

    private C18321f3(S1 s12, k kVar, long j10) {
        C17542s.j(s12, "colors");
        this.f150818a = s12;
        this.f150819b = kVar;
        this.f150820c = j10;
    }
}
