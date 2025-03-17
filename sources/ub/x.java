package uB;

import A0.g;
import E1.C4478k;
import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import G1.C4504g;
import KJ.C15987c;
import LC.C13178b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5100f0;
import androidx.compose.ui.platform.C5116k1;
import c1.C5264a;
import c1.c;
import c2.d;
import c2.h;
import c2.k;
import gs.e;
import gs.h;
import i1.C5437c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m1.e;
import n0.C5599e;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import s0.C5857c;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LKJ/c;", "", "urls", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "f", "(LKJ/c;Landroidx/compose/ui/d;LU0/m;II)V", "imageUrl", "d", "(Ljava/lang/String;LU0/m;I)V", "shoppinglist_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f131364a;

        a(int i10) {
            this.f131364a = i10;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(List list, int i10, a0.a aVar) {
            C17542s.j(aVar, "$this$layout");
            Iterator it = list.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                a0.a.m(aVar, (a0) it.next(), i11, 0, 0.0f, 4, (Object) null);
                i11 += i10;
            }
            return C16807N.f139792a;
        }

        public final J i(K k10, List<? extends H> list, long j10) {
            C17542s.j(k10, "$this$Layout");
            C17542s.j(list, "measurables");
            Iterable<H> iterable = list;
            ArrayList<a0> arrayList = new ArrayList<>(C16877v.y(iterable, 10));
            for (H i02 : iterable) {
                arrayList.add(i02.i0(j10));
            }
            int E02 = ((a0) C16877v.w0(arrayList)).E0() - this.f131364a;
            int i10 = 0;
            for (a0 E03 : arrayList) {
                i10 += E03.E0();
            }
            return K.v0(k10, i10 - (E02 * (arrayList.size() - 1)), k10.K0(k.g(s.f131350a.a())), (Map) null, new w(arrayList, this.f131364a), 4, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<String> f131365a;

        b(C15987c<String> cVar) {
            this.f131365a = cVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1156945915, i10, -1, "com.ingka.ikea.shoppinglist.ui.Thumbnails.<anonymous> (Thumbnails.kt:45)");
                }
                for (String i11 : this.f131365a) {
                    x.d(i11, mVar, 0);
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final void d(String str, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        C4889m k10 = mVar.k(-1347586111);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(str2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1347586111, i11, -1, "com.ingka.ikea.shoppinglist.ui.Thumbnail (Thumbnails.kt:69)");
            }
            d dVar = (d) k10.Q(C5100f0.e());
            d.a aVar = androidx.compose.ui.d.f18749a;
            s sVar = s.f131350a;
            androidx.compose.ui.d a10 = e.a(C5599e.g(androidx.compose.foundation.layout.J.u(aVar, sVar.a()), h.B((float) 1), C18030v.f147664a.a(k10, C18030v.f147665b).E0(), g.h()), g.h());
            long a11 = sVar.a();
            mVar2 = k10;
            LC.h.c(str, (String) null, a10, new C13178b.C2734b(h.a.XS), new e.b(dVar.K0(k.h(a11)), dVar.K0(k.g(a11))), C4478k.f5915a.e(), (C5437c) null, (C17642l<? super e.c, C16807N>) null, false, false, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, k10, (i11 & 14) | 196656 | (C13178b.C2734b.f111820b << 9) | (e.b.f97961c << 12), 0, 4032);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new v(str, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(String str, int i10, C4889m mVar, int i11) {
        d(str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void f(C15987c<String> cVar, androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(cVar, "urls");
        C4889m k10 = mVar.k(175019814);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(cVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(175019814, i12, -1, "com.ingka.ikea.shoppinglist.ui.Thumbnails (Thumbnails.kt:42)");
            }
            if (cVar.isEmpty()) {
                if (C4895p.J()) {
                    C4895p.R();
                }
                Y0 n10 = k10.n();
                if (n10 != null) {
                    n10.a(new t(cVar, dVar, i10, i11));
                    return;
                }
                return;
            }
            C5264a e10 = c.e(-1156945915, true, new b(cVar), k10, 54);
            int K02 = ((c2.d) k10.Q(C5100f0.e())).K0(c2.h.B((float) 28));
            androidx.compose.ui.d a10 = C5116k1.a(dVar, "ContainerTag");
            k10.W(874688120);
            boolean d10 = k10.d(K02);
            Object D10 = k10.D();
            if (d10 || D10 == C4889m.f14007a.a()) {
                D10 = new a(K02);
                k10.u(D10);
            }
            I i14 = (I) D10;
            k10.P();
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, a10);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, i14, aVar.c());
            F1.c(a13, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e11, aVar.d());
            e10.invoke(k10, 6);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new u(cVar, dVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C15987c cVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        f(cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C15987c cVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        f(cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
