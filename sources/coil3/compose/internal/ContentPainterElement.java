package coil3.compose.internal;

import E1.C4478k;
import G1.C4515s;
import G1.E;
import G1.V;
import G1.x0;
import T5.r;
import U5.c;
import U5.e;
import U5.h;
import V5.d;
import XH.C16807N;
import i1.C5437c;
import k6.C8441h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l6.j;
import nI.C17642l;
import o1.C5673m;
import p1.C5749w0;
import p1.E0;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00182\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u00102R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006F"}, d2 = {"Lcoil3/compose/internal/ContentPainterElement;", "LG1/V;", "LV5/d;", "Lk6/h;", "request", "LT5/r;", "imageLoader", "LU5/c;", "modelEqualityDelegate", "Lkotlin/Function1;", "LU5/e$c;", "transform", "LXH/N;", "onState", "Lp1/E0;", "filterQuality", "Li1/c;", "alignment", "LE1/k;", "contentScale", "", "alpha", "Lp1/w0;", "colorFilter", "", "clipToBounds", "LU5/h;", "previewHandler", "", "contentDescription", "<init>", "(Lk6/h;LT5/r;LU5/c;LnI/l;LnI/l;ILi1/c;LE1/k;FLp1/w0;ZLU5/h;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()LV5/d;", "node", "f", "(LV5/d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Lk6/h;", "e", "LT5/r;", "LU5/c;", "g", "LnI/l;", "h", "i", "I", "j", "Li1/c;", "k", "LE1/k;", "l", "F", "m", "Lp1/w0;", "n", "Z", "o", "LU5/h;", "p", "Ljava/lang/String;", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ContentPainterElement extends V<d> {

    /* renamed from: d  reason: collision with root package name */
    private final C8441h f45778d;

    /* renamed from: e  reason: collision with root package name */
    private final r f45779e;

    /* renamed from: f  reason: collision with root package name */
    private final c f45780f;

    /* renamed from: g  reason: collision with root package name */
    private final C17642l<e.c, e.c> f45781g;

    /* renamed from: h  reason: collision with root package name */
    private final C17642l<e.c, C16807N> f45782h;

    /* renamed from: i  reason: collision with root package name */
    private final int f45783i;

    /* renamed from: j  reason: collision with root package name */
    private final C5437c f45784j;

    /* renamed from: k  reason: collision with root package name */
    private final C4478k f45785k;

    /* renamed from: l  reason: collision with root package name */
    private final float f45786l;

    /* renamed from: m  reason: collision with root package name */
    private final C5749w0 f45787m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f45788n;

    /* renamed from: o  reason: collision with root package name */
    private final h f45789o;

    /* renamed from: p  reason: collision with root package name */
    private final String f45790p;

    public /* synthetic */ ContentPainterElement(C8441h hVar, r rVar, c cVar, C17642l lVar, C17642l lVar2, int i10, C5437c cVar2, C4478k kVar, float f10, C5749w0 w0Var, boolean z10, h hVar2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, rVar, cVar, lVar, lVar2, i10, cVar2, kVar, f10, w0Var, z10, hVar2, str);
    }

    /* renamed from: c */
    public d a() {
        e.b bVar = new e.b(this.f45779e, this.f45778d, this.f45780f);
        e eVar = new e(bVar);
        eVar.G(this.f45781g);
        eVar.B(this.f45782h);
        eVar.y(this.f45785k);
        eVar.A(this.f45783i);
        eVar.D(this.f45789o);
        eVar.H(bVar);
        j x10 = this.f45778d.x();
        return new d(eVar, this.f45784j, this.f45785k, this.f45786l, this.f45787m, this.f45788n, this.f45790p, x10 instanceof U5.j ? (U5.j) x10 : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return C17542s.e(this.f45778d, contentPainterElement.f45778d) && C17542s.e(this.f45779e, contentPainterElement.f45779e) && C17542s.e(this.f45780f, contentPainterElement.f45780f) && C17542s.e(this.f45781g, contentPainterElement.f45781g) && C17542s.e(this.f45782h, contentPainterElement.f45782h) && E0.d(this.f45783i, contentPainterElement.f45783i) && C17542s.e(this.f45784j, contentPainterElement.f45784j) && C17542s.e(this.f45785k, contentPainterElement.f45785k) && Float.compare(this.f45786l, contentPainterElement.f45786l) == 0 && C17542s.e(this.f45787m, contentPainterElement.f45787m) && this.f45788n == contentPainterElement.f45788n && C17542s.e(this.f45789o, contentPainterElement.f45789o) && C17542s.e(this.f45790p, contentPainterElement.f45790p);
    }

    /* renamed from: f */
    public void b(d dVar) {
        long h10 = dVar.G2().h();
        U5.j E22 = dVar.E2();
        e.b bVar = new e.b(this.f45779e, this.f45778d, this.f45780f);
        e P22 = dVar.G2();
        P22.G(this.f45781g);
        P22.B(this.f45782h);
        P22.y(this.f45785k);
        P22.A(this.f45783i);
        P22.D(this.f45789o);
        P22.H(bVar);
        boolean h11 = C5673m.h(h10, P22.h());
        dVar.J2(this.f45784j);
        j x10 = this.f45778d.x();
        dVar.M2(x10 instanceof U5.j ? (U5.j) x10 : null);
        dVar.O2(this.f45785k);
        dVar.d(this.f45786l);
        dVar.L2(this.f45787m);
        dVar.K2(this.f45788n);
        if (!C17542s.e(dVar.F2(), this.f45790p)) {
            dVar.N2(this.f45790p);
            x0.b(dVar);
        }
        boolean e10 = C17542s.e(E22, dVar.E2());
        if (!h11 || !e10) {
            E.b(dVar);
        }
        C4515s.a(dVar);
    }

    public int hashCode() {
        int hashCode = ((((((this.f45778d.hashCode() * 31) + this.f45779e.hashCode()) * 31) + this.f45780f.hashCode()) * 31) + this.f45781g.hashCode()) * 31;
        C17642l<e.c, C16807N> lVar = this.f45782h;
        int i10 = 0;
        int hashCode2 = (((((((((hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + E0.e(this.f45783i)) * 31) + this.f45784j.hashCode()) * 31) + this.f45785k.hashCode()) * 31) + Float.hashCode(this.f45786l)) * 31;
        C5749w0 w0Var = this.f45787m;
        int hashCode3 = (((hashCode2 + (w0Var == null ? 0 : w0Var.hashCode())) * 31) + Boolean.hashCode(this.f45788n)) * 31;
        h hVar = this.f45789o;
        int hashCode4 = (hashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str = this.f45790p;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "ContentPainterElement(request=" + this.f45778d + ", imageLoader=" + this.f45779e + ", modelEqualityDelegate=" + this.f45780f + ", transform=" + this.f45781g + ", onState=" + this.f45782h + ", filterQuality=" + E0.f(this.f45783i) + ", alignment=" + this.f45784j + ", contentScale=" + this.f45785k + ", alpha=" + this.f45786l + ", colorFilter=" + this.f45787m + ", clipToBounds=" + this.f45788n + ", previewHandler=" + this.f45789o + ", contentDescription=" + this.f45790p + ')';
    }

    private ContentPainterElement(C8441h hVar, r rVar, c cVar, C17642l<? super e.c, ? extends e.c> lVar, C17642l<? super e.c, C16807N> lVar2, int i10, C5437c cVar2, C4478k kVar, float f10, C5749w0 w0Var, boolean z10, h hVar2, String str) {
        this.f45778d = hVar;
        this.f45779e = rVar;
        this.f45780f = cVar;
        this.f45781g = lVar;
        this.f45782h = lVar2;
        this.f45783i = i10;
        this.f45784j = cVar2;
        this.f45785k = kVar;
        this.f45786l = f10;
        this.f45787m = w0Var;
        this.f45788n = z10;
        this.f45789o = hVar2;
        this.f45790p = str;
    }
}
