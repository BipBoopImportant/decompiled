package Cn;

import Bn.k;
import HJ.C15854t;
import Op.c1;
import PA.C13331a;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import Vo.b;
import XH.C16807N;
import XH.t;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.C5187o;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.browseandsearch.plp.impl.ui.e;
import com.ingka.ikea.core.model.Media;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.i;
import l3.a;
import m3.c;
import nI.C17642l;
import on.C11687b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import rx.C15004a;
import x4.C8951o;
import yn.C1;
import yn.e2;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LBn/k;", "navigationContract", "Lcom/ingka/ikea/browseandsearch/plp/impl/ui/e;", "viewModel", "LXH/N;", "d", "(LBn/k;Lcom/ingka/ikea/browseandsearch/plp/impl/ui/e;LU0/m;II)V", "plp-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f79626a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                kp.i$a[] r0 = kp.i.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kp.i$a r1 = kp.i.a.SHOPPABLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kp.i$a r1 = kp.i.a.USER_CONTENT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kp.i$a r1 = kp.i.a.REGULAR     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                kp.i$a r1 = kp.i.a.VIDEO     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f79626a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Cn.n.a.<clinit>():void");
        }
    }

    public static final void d(k kVar, e eVar, C4889m mVar, int i10, int i11) {
        int i12;
        e eVar2;
        int i13;
        k kVar2 = kVar;
        int i14 = i10;
        int i15 = i11;
        C17542s.j(kVar2, "navigationContract");
        C4889m k10 = mVar.k(-1654004609);
        if ((i15 & 1) != 0) {
            i12 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i12 = ((i14 & 8) == 0 ? k10.V(kVar2) : k10.F(kVar2) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        if ((i14 & 48) == 0) {
            if ((i15 & 2) == 0) {
                eVar2 = eVar;
                if (k10.F(eVar2)) {
                    i13 = 32;
                    i12 |= i13;
                }
            } else {
                eVar2 = eVar;
            }
            i13 = 16;
            i12 |= i13;
        } else {
            eVar2 = eVar;
        }
        int i16 = i12;
        if ((i16 & 19) != 18 || !k10.l()) {
            k10.G();
            boolean z10 = false;
            if ((i14 & 1) != 0 && !k10.O()) {
                k10.L();
                if ((i15 & 2) != 0) {
                    i16 &= -113;
                }
            } else if ((i15 & 2) != 0) {
                k10.C(1890788296);
                k0 a10 = m3.a.f26247a.a(k10, m3.a.f26249c);
                if (a10 != null) {
                    i0.c a11 = f3.a.a(a10, k10, 0);
                    k10.C(1729797275);
                    f0 b10 = c.b(e.class, a10, (String) null, a11, a10 instanceof C5212o ? ((C5212o) a10).getDefaultViewModelCreationExtras() : a.C0407a.f25486b, k10, 36936, 0);
                    k10.U();
                    k10.U();
                    i16 &= -113;
                    eVar2 = (e) b10;
                } else {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
            }
            k10.y();
            if (C4895p.J()) {
                C4895p.S(-1654004609, i16, -1, "com.ingka.ikea.browseandsearch.plp.impl.ui.PlpDestination (PlpDestination.kt:30)");
            }
            Context context = (Context) k10.Q(AndroidCompositionLocals_androidKt.g());
            C8951o a12 = androidx.navigation.fragment.a.a((C5187o) k10.Q(b.c()));
            k10.W(-1554978018);
            int i17 = i16 & 14;
            boolean F10 = (i17 == 4 || ((i16 & 8) != 0 && k10.F(kVar2))) | k10.F(a12) | k10.F(eVar2) | k10.F(context);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new k(kVar2, a12, eVar2, context);
                k10.u(D10);
            }
            C17642l lVar = (C17642l) D10;
            k10.P();
            k10.W(-1554886935);
            if (i17 == 4 || ((i16 & 8) != 0 && k10.F(kVar2))) {
                z10 = true;
            }
            boolean F11 = k10.F(a12) | z10 | k10.F(context);
            Object D11 = k10.D();
            if (F11 || D11 == C4889m.f14007a.a()) {
                D11 = new l(kVar2, a12, context);
                k10.u(D11);
            }
            k10.P();
            C1.f0(eVar2, lVar, (C17642l) D11, k10, (i16 >> 3) & 14);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new m(kVar2, eVar2, i14, i15));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(k kVar, C8951o oVar, e eVar, Context context, e2 e2Var) {
        C17542s.j(e2Var, "event");
        if (e2Var instanceof e2.c) {
            e2.c cVar = (e2.c) e2Var;
            h(kVar, oVar, cVar.a(), cVar.b());
        } else if (e2Var instanceof e2.k) {
            e2.k kVar2 = (e2.k) e2Var;
            h(kVar, oVar, kVar2.a(), kVar2.b());
        } else if (e2Var instanceof e2.f) {
            kVar.d(oVar, ((e2.f) e2Var).a());
        } else if (e2Var instanceof e2.e) {
            i(kVar, oVar, ((e2.e) e2Var).a());
        } else if (C17542s.e(e2Var, e2.j.f106854a)) {
            oVar.k0();
        } else if (C17542s.e(e2Var, e2.a.f106842a)) {
            kVar.f(oVar);
        } else if (e2Var instanceof e2.h) {
            eVar.c0(e2Var);
        } else if (e2Var instanceof e2.i) {
            e2.i iVar = (e2.i) e2Var;
            kVar.k(oVar, iVar.a(), iVar.a(), C11687b.e.SEARCH_RESULTS, Interaction$Component.COMMON_SEARCHES);
        } else if (e2Var instanceof e2.d) {
            kVar.j(oVar, ((e2.d) e2Var).a().f(), C13331a.b.INSPIRATION);
        } else if (e2Var instanceof e2.b) {
            kVar.n(oVar, ((e2.b) e2Var).a(), context);
        } else if (e2Var instanceof e2.g) {
            kVar.i(oVar, ((e2.g) e2Var).a());
        } else {
            throw new t();
        }
        eVar.c0(e2Var);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(k kVar, C8951o oVar, Context context, c1 c1Var) {
        C17542s.j(c1Var, "event");
        if (!(c1Var instanceof c1.a)) {
            if (c1Var instanceof c1.c) {
                kVar.c(oVar, ((c1.c) c1Var).a());
            } else if (c1Var instanceof c1.d) {
                c1.d dVar = (c1.d) c1Var;
                kVar.l(oVar, new ListPickerNavigation.Operation.AddOrRemove(dVar.b(), dVar.a(), 0, new ListPickerNavigation.Operation.Analytics(Interaction$Component.PRODUCT_LISTING, Ae.k.BUTTON), 4, (DefaultConstructorMarker) null));
            } else if (c1Var instanceof c1.e) {
                kVar.g(oVar, ((c1.e) c1Var).a(), Interaction$Component.PRODUCT_LISTING);
            } else if (c1Var instanceof c1.b) {
                kVar.h(oVar, ((c1.b) c1Var).a(), C15004a.LIST_CART_ACTIONS);
            } else if (c1Var instanceof c1.f) {
                kVar.b(oVar, ((c1.f) c1Var).a(), context);
            } else {
                throw new t();
            }
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(k kVar, e eVar, int i10, int i11, C4889m mVar, int i12) {
        d(kVar, eVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void h(k kVar, C8951o oVar, String str, String str2) {
        kVar.m(oVar, str, str2);
    }

    private static final void i(k kVar, C8951o oVar, i iVar) {
        int i10 = a.f79626a[iVar.d().ordinal()];
        if (i10 == 1 || i10 == 2) {
            kVar.j(oVar, iVar.b(), C13331a.b.SHOPPABLE);
        } else if (i10 == 3) {
            kVar.e(oVar, new Media[]{new Media.Image(iVar.e(), iVar.a())}, 0);
        } else if (i10 == 4) {
            IllegalStateException illegalStateException = new IllegalStateException("Video should not be clickable.");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str2 == null) {
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "";
                }
                String str3 = str2;
                bVar.a(eVar, str3, false, illegalStateException, str);
                str2 = str3;
            }
        } else {
            throw new t();
        }
    }
}
