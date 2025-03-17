package ut;

import Bx.a;
import HJ.C15854t;
import Ht.c;
import It.D;
import It.q;
import It.t;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import YH.C16877v;
import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import p1.J0;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import qw.l;
import t0.C5934A;
import uI.C18059h;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ac\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022&\u0010\t\u001a\"\b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LIt/D;", "viewModel", "Lx4/o;", "fragmentNavController", "Lkotlin/Function2;", "", "LdI/e;", "Lp1/J0;", "", "qrCodeGenerator", "Lkotlin/Function1;", "", "LXH/N;", "onIsScrolledToTop", "LHt/c;", "navigationContract", "d", "(LIt/D;Lx4/o;LnI/p;LnI/l;LHt/c;LU0/m;I)V", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class P {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<t.a, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f104197a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f104198b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C8951o f104199c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Activity activity, c cVar, C8951o oVar) {
            super(1, C17542s.a.class, "handleNavigation", "InstoreDestination$handleNavigation(Landroid/app/Activity;Lcom/ingka/ikea/instore/impl/navigation/InstoreExternalNavigationContract;Landroidx/navigation/NavController;Lcom/ingka/ikea/instore/impl/presentation/InstoreContract$OneTimeEffect$Destination;)V", 0);
            this.f104197a = activity;
            this.f104198b = cVar;
            this.f104199c = oVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((t.a) obj);
            return C16807N.f139792a;
        }

        public final void t(t.a aVar) {
            C17542s.j(aVar, "p0");
            P.e(this.f104197a, this.f104198b, this.f104199c, aVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f104200a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                sB.a$a[] r0 = sB.C15035a.C3239a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                sB.a$a r1 = sB.C15035a.C3239a.ADD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                sB.a$a r1 = sB.C15035a.C3239a.REMOVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f104200a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ut.P.b.<clinit>():void");
        }
    }

    public static final void d(D d10, C8951o oVar, p<? super String, ? super C17164e<? super J0>, ? extends Object> pVar, C17642l<? super Boolean, C16807N> lVar, c cVar, C4889m mVar, int i10) {
        int i11;
        D d11 = d10;
        C8951o oVar2 = oVar;
        p<? super String, ? super C17164e<? super J0>, ? extends Object> pVar2 = pVar;
        C17642l<? super Boolean, C16807N> lVar2 = lVar;
        c cVar2 = cVar;
        int i12 = i10;
        C17542s.j(d11, "viewModel");
        C17542s.j(oVar2, "fragmentNavController");
        C17542s.j(pVar2, "qrCodeGenerator");
        C17542s.j(lVar2, "onIsScrolledToTop");
        C17542s.j(cVar2, "navigationContract");
        C4889m k10 = mVar.k(1112943459);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(d11) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(oVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(pVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(lVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= (i12 & 32768) == 0 ? k10.V(cVar2) : k10.F(cVar2) ? 16384 : 8192;
        }
        if ((i11 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1112943459, i11, -1, "com.ingka.ikea.instore.impl.composables.InstoreDestination (InstoreDestination.kt:30)");
            }
            Activity a10 = Xo.c.a((Context) k10.Q(AndroidCompositionLocals_androidKt.g()));
            C8948l H10 = oVar.H();
            if (H10 != null) {
                k10.W(-2041510286);
                Object D10 = k10.D();
                C4889m.a aVar = C4889m.f14007a;
                if (D10 == aVar.a()) {
                    D10 = new M();
                    k10.u(D10);
                }
                k10.P();
                l.c(H10, "login_signup_promotion_signup", (C17642l) D10, k10, 432);
                C8948l H11 = oVar.H();
                if (H11 != null) {
                    k10.W(-2041497572);
                    int i13 = i11 & 14;
                    boolean z10 = i13 == 4;
                    Object D11 = k10.D();
                    if (z10 || D11 == aVar.a()) {
                        D11 = new N(d11);
                        k10.u(D11);
                    }
                    k10.P();
                    l.c(H11, "ChooseListBottomSheet.RequestKey", (C17642l) D11, k10, 48);
                    k10.W(-2041470373);
                    boolean F10 = k10.F(a10) | ((57344 & i11) == 16384 || ((32768 & i11) != 0 && k10.F(cVar2))) | k10.F(oVar2);
                    Object D12 = k10.D();
                    if (F10 || D12 == aVar.a()) {
                        D12 = new a(a10, cVar2, oVar2);
                        k10.u(D12);
                    }
                    k10.P();
                    Z.i(d10, pVar, (C17642l) ((C18059h) D12), lVar, (C5934A) null, k10, ((i11 >> 3) & 112) | i13 | (i11 & 7168), 16);
                    if (C4895p.J()) {
                        C4895p.R();
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new O(d10, oVar, pVar, lVar, cVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final void e(Activity activity, c cVar, C8951o oVar, t.a aVar) {
        if (C17542s.e(aVar, t.a.g.f82431a)) {
            if (activity != null) {
                cVar.d(activity);
            }
        } else if (C17542s.e(aVar, t.a.d.f82428a)) {
            cVar.e(oVar);
        } else if (C17542s.e(aVar, t.a.q.f82443a)) {
            cVar.f(oVar);
        } else if (aVar instanceof t.a.n) {
            t.a.n nVar = (t.a.n) aVar;
            if (nVar.a() == null) {
                cVar.m(oVar);
            } else {
                cVar.i(oVar, nVar.a());
            }
        } else if (aVar instanceof t.a.o) {
            cVar.n(oVar, ((t.a.o) aVar).a());
        } else if (aVar instanceof t.a.l) {
            t.a.l lVar = (t.a.l) aVar;
            cVar.o(oVar, lVar.b(), lVar.a());
        } else if (aVar instanceof t.a.m) {
            cVar.r(oVar, ((t.a.m) aVar).a());
        } else if (C17542s.e(aVar, t.a.p.f82442a)) {
            cVar.p(oVar);
        } else if (C17542s.e(aVar, t.a.f.f82430a)) {
            cVar.b(oVar);
        } else if (aVar instanceof t.a.r) {
            t.a.r rVar = (t.a.r) aVar;
            cVar.s(oVar, rVar.a(), rVar.b());
        } else if (aVar instanceof t.a.e) {
            cVar.l(oVar, ((t.a.e) aVar).a());
        } else if (aVar instanceof t.a.c) {
            t.a.c cVar2 = (t.a.c) aVar;
            cVar.q(oVar, cVar2.b(), cVar2.a());
        } else if (aVar instanceof t.a.i) {
            cVar.j(oVar, ((t.a.i) aVar).a());
        } else if (aVar instanceof t.a.j) {
            cVar.a(oVar, ((t.a.j) aVar).a().a());
        } else if (aVar instanceof t.a.b) {
            cVar.c(oVar, ((t.a.b) aVar).a());
        } else if (aVar instanceof t.a.C1617a) {
            t.a.C1617a aVar2 = (t.a.C1617a) aVar;
            cVar.k(oVar, aVar2.b(), aVar2.a());
        } else if (aVar instanceof t.a.k) {
            cVar.g(oVar, ((t.a.k) aVar).a());
        } else if (C17542s.e(aVar, t.a.h.f82432a)) {
            cVar.h(oVar);
        } else {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(a.b bVar) {
        String str;
        C17542s.j(bVar, "result");
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar2 : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a("Ignoring and consuming login result " + bVar + " for key LOGIN_SIGNUP_PROMOTION_REQUEST_KEY", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                str = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "InstoreDestination";
            } else {
                str = str3;
            }
            bVar2.a(eVar, str, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str;
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(D d10, ListPickerNavigation.b bVar) {
        Object obj;
        C17542s.j(bVar, "result");
        if (bVar instanceof ListPickerNavigation.b.d) {
            ListPickerNavigation.b.d dVar = (ListPickerNavigation.b.d) bVar;
            int i10 = b.f104200a[dVar.a().ordinal()];
            String str = "";
            String str2 = null;
            if (i10 == 1) {
                ListPickerNavigation.b.c cVar = (ListPickerNavigation.b.c) C16877v.y0(dVar.d());
                if (cVar != null) {
                    str2 = cVar.b();
                }
                if (str2 != null) {
                    str = str2;
                }
                obj = new q.t(str, dVar.c(), dVar.b());
            } else if (i10 == 2) {
                ListPickerNavigation.b.c cVar2 = (ListPickerNavigation.b.c) C16877v.y0(dVar.d());
                if (cVar2 != null) {
                    str2 = cVar2.b();
                }
                if (str2 != null) {
                    str = str2;
                }
                obj = new q.v(str, dVar.c(), dVar.b());
            } else {
                throw new XH.t();
            }
            d10.b(obj);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(D d10, C8951o oVar, p pVar, C17642l lVar, c cVar, int i10, C4889m mVar, int i11) {
        d(d10, oVar, pVar, lVar, cVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
