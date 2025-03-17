package androidx.compose.ui.draw;

import E1.C4478k;
import G1.C4515s;
import G1.E;
import G1.V;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import o1.C5673m;
import p1.C5749w0;
import t1.C5942c;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00068"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "LG1/V;", "Landroidx/compose/ui/draw/e;", "Lt1/c;", "painter", "", "sizeToIntrinsics", "Li1/c;", "alignment", "LE1/k;", "contentScale", "", "alpha", "Lp1/w0;", "colorFilter", "<init>", "(Lt1/c;ZLi1/c;LE1/k;FLp1/w0;)V", "c", "()Landroidx/compose/ui/draw/e;", "node", "LXH/N;", "f", "(Landroidx/compose/ui/draw/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Lt1/c;", "getPainter", "()Lt1/c;", "e", "Z", "getSizeToIntrinsics", "()Z", "Li1/c;", "getAlignment", "()Li1/c;", "g", "LE1/k;", "getContentScale", "()LE1/k;", "h", "F", "getAlpha", "()F", "i", "Lp1/w0;", "getColorFilter", "()Lp1/w0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PainterElement extends V<e> {

    /* renamed from: d  reason: collision with root package name */
    private final C5942c f18767d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f18768e;

    /* renamed from: f  reason: collision with root package name */
    private final C5437c f18769f;

    /* renamed from: g  reason: collision with root package name */
    private final C4478k f18770g;

    /* renamed from: h  reason: collision with root package name */
    private final float f18771h;

    /* renamed from: i  reason: collision with root package name */
    private final C5749w0 f18772i;

    public PainterElement(C5942c cVar, boolean z10, C5437c cVar2, C4478k kVar, float f10, C5749w0 w0Var) {
        this.f18767d = cVar;
        this.f18768e = z10;
        this.f18769f = cVar2;
        this.f18770g = kVar;
        this.f18771h = f10;
        this.f18772i = w0Var;
    }

    /* renamed from: c */
    public e a() {
        return new e(this.f18767d, this.f18768e, this.f18769f, this.f18770g, this.f18771h, this.f18772i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return C17542s.e(this.f18767d, painterElement.f18767d) && this.f18768e == painterElement.f18768e && C17542s.e(this.f18769f, painterElement.f18769f) && C17542s.e(this.f18770g, painterElement.f18770g) && Float.compare(this.f18771h, painterElement.f18771h) == 0 && C17542s.e(this.f18772i, painterElement.f18772i);
    }

    /* renamed from: f */
    public void b(e eVar) {
        boolean E22 = eVar.E2();
        boolean z10 = this.f18768e;
        boolean z11 = E22 != z10 || (z10 && !C5673m.h(eVar.D2().h(), this.f18767d.h()));
        eVar.M2(this.f18767d);
        eVar.N2(this.f18768e);
        eVar.J2(this.f18769f);
        eVar.L2(this.f18770g);
        eVar.d(this.f18771h);
        eVar.K2(this.f18772i);
        if (z11) {
            E.b(eVar);
        }
        C4515s.a(eVar);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f18767d.hashCode() * 31) + Boolean.hashCode(this.f18768e)) * 31) + this.f18769f.hashCode()) * 31) + this.f18770g.hashCode()) * 31) + Float.hashCode(this.f18771h)) * 31;
        C5749w0 w0Var = this.f18772i;
        return hashCode + (w0Var == null ? 0 : w0Var.hashCode());
    }

    public String toString() {
        return "PainterElement(painter=" + this.f18767d + ", sizeToIntrinsics=" + this.f18768e + ", alignment=" + this.f18769f + ", contentScale=" + this.f18770g + ", alpha=" + this.f18771h + ", colorFilter=" + this.f18772i + ')';
    }
}
