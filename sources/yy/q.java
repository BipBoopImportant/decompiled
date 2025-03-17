package yy;

import KJ.C15987c;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import YH.C16877v;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l3.a;
import lH.C17551a;
import nI.C17642l;
import sy.b;
import uy.c;
import uy.d;
import wy.l;
import yy.r;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012²\u0006\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\nX\u0002"}, d2 = {"Lyy/q;", "", "Lsy/b;", "Luy/c;", "roomExternalNavigationContract", "<init>", "(Luy/c;)V", "slotModel", "Luy/d;", "roomInternalNavigation", "Lwy/l;", "b", "(Lsy/b;Luy/d;)Lwy/l;", "a", "Luy/c;", "", "", "itemNos", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f132347a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements nI.q<b, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f132348a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f132349b;

        a(d dVar, q qVar) {
            this.f132348a = dVar;
            this.f132349b = qVar;
        }

        private static final List<String> c(C4899r0<List<String>> r0Var) {
            return r0Var.getValue();
        }

        /* access modifiers changed from: private */
        public static final r e(C4899r0 r0Var, r.a aVar) {
            C17542s.j(aVar, "factory");
            return aVar.a(c(r0Var));
        }

        public final void b(b bVar, C4889m mVar, int i10) {
            int i11;
            b bVar2 = bVar;
            C4889m mVar2 = mVar;
            C17542s.j(bVar2, "productListingsSlotModel");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(bVar2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1764402336, i11, -1, "com.ingka.ikea.room.impl.presentation.composables.productlistings.ProductListingsSlotFactory.create.<anonymous> (ProductListingsSlotFactory.kt:30)");
                }
                mVar2.W(-698051656);
                boolean z10 = (i11 & 14) == 4;
                Object D10 = mVar.D();
                if (z10 || D10 == C4889m.f14007a.a()) {
                    C15987c<b.a> a10 = bVar.a();
                    ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
                    for (b.a b10 : a10) {
                        arrayList.add(b10.b());
                    }
                    D10 = u1.e(C16877v.A(arrayList), (o1) null, 2, (Object) null);
                    mVar2.u(D10);
                }
                C4899r0 r0Var = (C4899r0) D10;
                mVar.P();
                String G02 = C16877v.G0(c(r0Var), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 63, (Object) null);
                mVar2.W(-698031375);
                boolean V10 = mVar2.V(r0Var);
                Object D11 = mVar.D();
                if (V10 || D11 == C4889m.f14007a.a()) {
                    D11 = new p(r0Var);
                    mVar2.u(D11);
                }
                C17642l lVar = (C17642l) D11;
                mVar.P();
                mVar2.C(-83599083);
                k0 a11 = m3.a.f26247a.a(mVar2, m3.a.f26249c);
                if (a11 != null) {
                    i0.c a12 = f3.a.a(a11, mVar2, 0);
                    l3.a b11 = a11 instanceof C5212o ? C17551a.b(((C5212o) a11).getDefaultViewModelCreationExtras(), lVar) : C17551a.b(a.C0407a.f25486b, lVar);
                    mVar2.C(1729797275);
                    f0 b12 = m3.c.b(r.class, a11, G02, a12, b11, mVar, 36936, 0);
                    mVar.U();
                    mVar.U();
                    m.t((r) b12, bVar, this.f132348a, this.f132349b.f132347a, mVar, (i11 << 3) & 112);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((b) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public q(c cVar) {
        C17542s.j(cVar, "roomExternalNavigationContract");
        this.f132347a = cVar;
    }

    public l b(b bVar, d dVar) {
        C17542s.j(bVar, "slotModel");
        C17542s.j(dVar, "roomInternalNavigation");
        return new l(new l.b(bVar, c1.c.c(-1764402336, true, new a(dVar, this))));
    }
}
