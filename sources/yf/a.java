package Yf;

import IC.C13026h;
import Ln.d;
import Oo.b;
import Op.C10828d;
import Pp.d;
import SC.L2;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LYf/a;", "", "LPp/d;", "mapper", "<init>", "(LPp/d;)V", "LLn/d;", "cartItem", "", "showMaterialsAsDisclaimer", "limitedAvailability", "LOp/d;", "b", "(LLn/d;ZZ)LOp/d;", "LPp/d$a;", "a", "(LLn/d;ZZ)LPp/d$a;", "LPp/d;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final d f64989a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Yf.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C1136a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f64990a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                Ln.d$a[] r0 = Ln.d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Ln.d$a r1 = Ln.d.a.NEW_LOWER_PRICE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Ln.d$a r1 = Ln.d.a.TRO     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f64990a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Yf.a.C1136a.<clinit>():void");
        }
    }

    public a(d dVar) {
        C17542s.j(dVar, "mapper");
        this.f64989a = dVar;
    }

    public final d.a a(Ln.d dVar, boolean z10, boolean z11) {
        C17542s.j(dVar, "cartItem");
        d.a.b bVar = null;
        d.a.C1733a aVar = z11 ? new d.a.C1733a(C13026h.a(b.f84765r0), L2.Low) : null;
        String j10 = dVar.j();
        String k10 = dVar.k();
        int l10 = dVar.l();
        Integer m10 = dVar.m();
        d.a.c cVar = new d.a.c(dVar.i().i(), dVar.i().h(), dVar.i().g(), (d.a.c.C1734a) null, dVar.i().d(), dVar.i().e(), dVar.i().c(), d.a.c.b.valueOf(dVar.i().j().name()), dVar.i().f());
        d.a h10 = dVar.h();
        int i10 = h10 == null ? -1 : C1136a.f64990a[h10.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                bVar = d.a.b.NEW_LOWER_PRICE;
            } else if (i10 == 2) {
                bVar = d.a.b.TRO;
            } else {
                throw new t();
            }
        }
        return new d.a(j10, k10, l10, m10, true, cVar, aVar, (String) null, bVar, dVar.o(), dVar.e(), dVar.f(), dVar.c(), dVar.d(), dVar.g(), dVar.n(), z10);
    }

    public final C10828d b(Ln.d dVar, boolean z10, boolean z11) {
        C17542s.j(dVar, "cartItem");
        return this.f64989a.a(a(dVar, z10, z11));
    }
}
