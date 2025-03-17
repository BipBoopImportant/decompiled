package Ai;

import E1.I;
import Ei.C10696q;
import Ei.C10697r;
import G1.C4504g;
import HJ.C15854t;
import Hx.c;
import J1.j;
import L1.o;
import L1.x;
import N1.C4669d;
import O0.C4762x0;
import O0.H0;
import O0.J0;
import O0.L0;
import O0.e1;
import O0.g1;
import QJ.F0;
import QJ.Q;
import QJ.T;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.C13643u0;
import SC.H2;
import SC.Y2;
import TC.C13679b;
import U0.B;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.P;
import U0.Y0;
import XH.C16807N;
import XH.t;
import XH.y;
import Y1.k;
import android.content.res.Configuration;
import android.os.Build;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5094d0;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import c2.h;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import e.C5281d;
import eI.C17187b;
import i1.C5437c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import ol.u;
import ol.v;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import s0.C5834E;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5848T;
import s0.C5862h;
import s0.C5880z;
import sl.C11865e;
import wi.C12272a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u001a³\u0001\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00030\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a¥\u0001\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00030\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001ae\u0010 \u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b \u0010!\u001a\u0017\u0010#\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0006H\u0001¢\u0006\u0004\b#\u0010$\u001a\u000f\u0010%\u001a\u00020\u0003H\u0003¢\u0006\u0004\b%\u0010&\u001a%\u0010)\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u001c2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"LEi/r$b;", "state", "Lkotlin/Function0;", "LXH/N;", "onTopAppBarBackClicked", "Lkotlin/Function1;", "", "onErrorDismissed", "Lkotlin/Function2;", "viewProductsCallback", "onItemClicked", "Lkotlin/Function3;", "LHx/c$d;", "onActionClicked", "onTrackingLinkClicked", "onShowBarcode", "K", "(LEi/r$b;LnI/a;LnI/l;LnI/p;LnI/l;LnI/q;LnI/l;LnI/l;LU0/m;I)V", "F", "(LnI/a;LU0/m;I)V", "LEi/q;", "details", "onOrderIdCopied", "u", "(LEi/q;LnI/p;LnI/l;LnI/q;LnI/l;LnI/l;LnI/l;LU0/m;I)V", "orderId", "date", "location", "", "showBarcodeEntryPoint", "Landroidx/compose/ui/d;", "modifier", "z", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LnI/l;ZLnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "title", "P", "(Ljava/lang/String;LU0/m;I)V", "H", "(LU0/m;I)V", "isFromOrderConfirmation", "onDismiss", "s", "(ZLnI/a;LU0/m;I)V", "purchasehistory-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ai.g1  reason: case insensitive filesystem */
public final class C10573g1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.g1$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f78677a;

        a(C17631a<C16807N> aVar) {
            this.f78677a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(522345770, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseHistoryDetailsScreen.<anonymous> (PurchaseHistoryDetailsScreen.kt:132)");
                }
                C10573g1.F(this.f78677a, mVar, 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.g1$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f78678a;

        b(L0 l02) {
            this.f78678a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(638310316, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseHistoryDetailsScreen.<anonymous> (PurchaseHistoryDetailsScreen.kt:127)");
                }
                Y2.c(this.f78678a, (androidx.compose.ui.d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ai.g1$c */
    static final class c implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10697r.b f78679a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<String, String, C16807N> f78680b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f78681c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q<String, String, c.d, C16807N> f78682d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f78683e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f78684f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f78685g;

        c(C10697r.b bVar, p<? super String, ? super String, C16807N> pVar, C17642l<? super String, C16807N> lVar, q<? super String, ? super String, ? super c.d, C16807N> qVar, C17642l<? super String, C16807N> lVar2, C17642l<? super String, C16807N> lVar3, C17642l<? super String, C16807N> lVar4) {
            this.f78679a = bVar;
            this.f78680b = pVar;
            this.f78681c = lVar;
            this.f78682d = qVar;
            this.f78683e = lVar2;
            this.f78684f = lVar3;
            this.f78685g = lVar4;
        }

        public final void a(C5834E e10, C4889m mVar, int i10) {
            int i11;
            boolean z10;
            C5834E e11 = e10;
            C4889m mVar2 = mVar;
            C17542s.j(e11, "it");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(e11) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1658909621, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseHistoryDetailsScreen.<anonymous> (PurchaseHistoryDetailsScreen.kt:137)");
                }
                androidx.compose.ui.d h10 = D.h(J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), e11);
                C10697r.b bVar = this.f78679a;
                p<String, String, C16807N> pVar = this.f78680b;
                C17642l<String, C16807N> lVar = this.f78681c;
                q<String, String, c.d, C16807N> qVar = this.f78682d;
                C17642l<String, C16807N> lVar2 = this.f78683e;
                C17642l<String, C16807N> lVar3 = this.f78684f;
                C17642l<String, C16807N> lVar4 = this.f78685g;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e12 = androidx.compose.ui.c.e(mVar2, h10);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar.c());
                F1.c(a13, s10, aVar.e());
                p<C4504g, Integer, C16807N> b10 = aVar.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e12, aVar.d());
                C5862h hVar = C5862h.f28810a;
                if (bVar instanceof C10697r.b.c) {
                    mVar2.W(-2075488951);
                    C10573g1.H(mVar2, 0);
                    mVar.P();
                } else if (bVar instanceof C10697r.b.a) {
                    mVar2.W(-2075292256);
                    C10573g1.u(((C10697r.b.a) bVar).a(), pVar, lVar, qVar, lVar2, lVar3, lVar4, mVar, 0);
                    mVar.P();
                } else if (bVar instanceof C10697r.b.C1535b) {
                    mVar2.W(-2074611062);
                    mVar.P();
                    IllegalStateException illegalStateException = new IllegalStateException("Should not happen");
                    e eVar = e.ERROR;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar2 : arrayList) {
                        if (str == null) {
                            String a14 = C11818a.a((String) null, illegalStateException);
                            if (a14 == null) {
                                break;
                            }
                            str = C11820c.a(a14);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = hVar.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            z10 = true;
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        } else {
                            z10 = true;
                        }
                        String str4 = str2;
                        boolean z11 = z10;
                        bVar2.a(eVar, str4, false, illegalStateException, str3);
                        str = str3;
                        str2 = str4;
                    }
                } else {
                    mVar2.W(1595614911);
                    mVar.P();
                    throw new t();
                }
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseHistoryDetailsScreenKt$PurchaseHistoryDetailsScreen$onOrderIdCopied$1$1$2", f = "PurchaseHistoryDetailsScreen.kt", l = {106}, m = "invokeSuspend")
    /* renamed from: Ai.g1$d */
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f78686c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ L0 f78687d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f78688e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(L0 l02, String str, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f78687d = l02;
            this.f78688e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f78687d, this.f78688e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f78686c;
            if (i10 == 0) {
                y.b(obj);
                L0 l02 = this.f78687d;
                String str = this.f78688e;
                this.f78686c = 1;
                if (L0.f(l02, str, (String) null, false, (J0) null, this, 14, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(C5094d0 d0Var, String str, C17642l lVar, String str2) {
        d0Var.b(new C4669d(str, (List) null, (List) null, 6, (DefaultConstructorMarker) null));
        lVar.invoke(str2);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C17642l lVar, String str) {
        lVar.invoke(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(String str, String str2, String str3, C17642l lVar, boolean z10, C17642l lVar2, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        z(str, str2, str3, lVar, z10, lVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void F(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-575872420);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-575872420, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseDetailsTopAppBar (PurchaseHistoryDetailsScreen.kt:175)");
            }
            ol.p.c(v.BACK, aVar, (androidx.compose.ui.d) null, j.b(C12272a.f105828k0, k10, 0), (u) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (C5848T) null, (e1) null, (g1) null, k10, ((i11 << 3) & 112) | 6, 500);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10555a1(aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N G(C17631a aVar, int i10, C4889m mVar, int i11) {
        F(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void H(C4889m mVar, int i10) {
        int i11 = i10;
        C4889m k10 = mVar.k(-1762825188);
        if (i11 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1762825188, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseHistoryDetailsFullScreenLoading (PurchaseHistoryDetailsScreen.kt:382)");
            }
            String b10 = j.b(Oo.b.f84808v, k10, 0);
            d.a aVar = androidx.compose.ui.d.f18749a;
            k10.W(1876097083);
            boolean V10 = k10.V(b10);
            Object D10 = k10.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new P0(b10);
                k10.u(D10);
            }
            k10.P();
            float f10 = (float) 40;
            androidx.compose.ui.d a10 = C5116k1.a(D.k(TC.e.i(o.c(aVar, true, (C17642l) D10)), 0.0f, h.B(f10), 1, (Object) null), "DetailsTestTags_LOADING_TEST_TAG");
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar2 = C5437c.f24302a;
            I a11 = C5080k.a(g10, aVar2.k(), k10, 0);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, a10);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a13);
            } else {
                k10.t();
            }
            C4889m a14 = F1.a(k10);
            F1.c(a14, a11, aVar3.c());
            F1.c(a14, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b11 = aVar3.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b11);
            }
            F1.c(a14, e10, aVar3.d());
            C5862h hVar = C5862h.f28810a;
            int i12 = ((Configuration) k10.Q(AndroidCompositionLocals_androidKt.f())).screenWidthDp / 2;
            androidx.compose.ui.d h10 = J.h(aVar, 0.0f, 1, (Object) null);
            I b12 = G.b(dVar.f(), aVar2.l(), k10, 0);
            int a15 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, h10);
            C17631a<C4504g> a16 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a16);
            } else {
                k10.t();
            }
            C4889m a17 = F1.a(k10);
            F1.c(a17, b12, aVar3.c());
            F1.c(a17, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b13 = aVar3.b();
            if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.w(Integer.valueOf(a15), b13);
            }
            F1.c(a17, e11, aVar3.d());
            C5843N n10 = C5843N.f28726a;
            float f11 = (float) 16;
            H2.b(J.t(aVar, h.B(f11)), false, k10, 6, 2);
            float f12 = (float) 24;
            C5844O.a(J.y(aVar, h.B(f12)), k10, 6);
            float f13 = (float) i12;
            H2.b(J.v(aVar, h.B(f13), h.B(f11)), false, k10, 0, 2);
            k10.x();
            float f14 = (float) 32;
            C5844O.a(J.i(aVar, h.B(f14)), k10, 6);
            androidx.compose.ui.d h11 = J.h(androidx.compose.foundation.layout.x.a(aVar, C5880z.Min), 0.0f, 1, (Object) null);
            I b14 = G.b(dVar.f(), aVar2.l(), k10, 0);
            int a18 = C4883j.a(k10, 0);
            C4912y s12 = k10.s();
            androidx.compose.ui.d e12 = androidx.compose.ui.c.e(k10, h11);
            C17631a<C4504g> a19 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a19);
            } else {
                k10.t();
            }
            C4889m a20 = F1.a(k10);
            F1.c(a20, b14, aVar3.c());
            F1.c(a20, s12, aVar3.e());
            p<C4504g, Integer, C16807N> b15 = aVar3.b();
            if (a20.i() || !C17542s.e(a20.D(), Integer.valueOf(a18))) {
                a20.u(Integer.valueOf(a18));
                a20.w(Integer.valueOf(a18), b15);
            }
            F1.c(a20, e12, aVar3.d());
            androidx.compose.ui.d y10 = J.y(aVar, h.B(f11));
            I h12 = C5077h.h(aVar2.e(), false);
            int a21 = C4883j.a(k10, 0);
            C4912y s13 = k10.s();
            androidx.compose.ui.d e13 = androidx.compose.ui.c.e(k10, y10);
            C17631a<C4504g> a22 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a22);
            } else {
                k10.t();
            }
            C4889m a23 = F1.a(k10);
            F1.c(a23, h12, aVar3.c());
            F1.c(a23, s13, aVar3.e());
            p<C4504g, Integer, C16807N> b16 = aVar3.b();
            if (a23.i() || !C17542s.e(a23.D(), Integer.valueOf(a21))) {
                a23.u(Integer.valueOf(a21));
                a23.w(Integer.valueOf(a21), b16);
            }
            F1.c(a23, e13, aVar3.d());
            C5079j jVar = C5079j.f18125a;
            float f15 = f14;
            float f16 = f11;
            C13643u0.c(J.y(J.d(J.k(aVar, h.B(f14), 0.0f, 2, (Object) null), 0.0f, 1, (Object) null), h.B((float) 2)), 0.0f, 0, k10, 6, 6);
            k10.x();
            C5844O.a(J.y(aVar, h.B(f12)), k10, 6);
            I a24 = C5080k.a(dVar.g(), aVar2.k(), k10, 0);
            int a25 = C4883j.a(k10, 0);
            C4912y s14 = k10.s();
            androidx.compose.ui.d e14 = androidx.compose.ui.c.e(k10, aVar);
            C17631a<C4504g> a26 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a26);
            } else {
                k10.t();
            }
            C4889m a27 = F1.a(k10);
            F1.c(a27, a24, aVar3.c());
            F1.c(a27, s14, aVar3.e());
            p<C4504g, Integer, C16807N> b17 = aVar3.b();
            if (a27.i() || !C17542s.e(a27.D(), Integer.valueOf(a25))) {
                a27.u(Integer.valueOf(a25));
                a27.w(Integer.valueOf(a25), b17);
            }
            F1.c(a27, e14, aVar3.d());
            k10.W(6518689);
            int i13 = 1;
            while (true) {
                d.a aVar4 = androidx.compose.ui.d.f18749a;
                H2.b(J.v(aVar4, h.B(f13), h.B(f16)), false, k10, 0, 2);
                k10.W(6527940);
                if (i13 < 4) {
                    C5844O.a(J.i(aVar4, h.B(f10)), k10, 6);
                }
                k10.P();
                if (i13 == 4) {
                    break;
                }
                i13++;
            }
            k10.P();
            k10.x();
            k10.x();
            k10.W(-449806161);
            for (int i14 = 0; i14 < 3; i14++) {
                d.a aVar5 = androidx.compose.ui.d.f18749a;
                C5844O.a(J.i(aVar5, h.B(f15)), k10, 6);
                H2.b(J.i(J.h(aVar5, 0.0f, 1, (Object) null), h.B((float) 88)), false, k10, 6, 2);
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new Q0(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N I(String str, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        L1.v.d0(xVar, str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N J(int i10, C4889m mVar, int i11) {
        H(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void K(C10697r.b bVar, C17631a<C16807N> aVar, C17642l<? super String, C16807N> lVar, p<? super String, ? super String, C16807N> pVar, C17642l<? super String, C16807N> lVar2, q<? super String, ? super String, ? super c.d, C16807N> qVar, C17642l<? super String, C16807N> lVar3, C17642l<? super String, C16807N> lVar4, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C10697r.b bVar2 = bVar;
        C17631a<C16807N> aVar2 = aVar;
        C17642l<? super String, C16807N> lVar5 = lVar;
        p<? super String, ? super String, C16807N> pVar2 = pVar;
        C17642l<? super String, C16807N> lVar6 = lVar2;
        q<? super String, ? super String, ? super c.d, C16807N> qVar2 = qVar;
        C17642l<? super String, C16807N> lVar7 = lVar3;
        C17642l<? super String, C16807N> lVar8 = lVar4;
        int i12 = i10;
        C17542s.j(bVar2, "state");
        C17542s.j(aVar2, "onTopAppBarBackClicked");
        C17542s.j(lVar5, "onErrorDismissed");
        C17542s.j(pVar2, "viewProductsCallback");
        C17542s.j(lVar6, "onItemClicked");
        C17542s.j(qVar2, "onActionClicked");
        C17542s.j(lVar7, "onTrackingLinkClicked");
        C17542s.j(lVar8, "onShowBarcode");
        C4889m k10 = mVar.k(863980933);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(bVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar5) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(pVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(lVar6) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.F(qVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i12) == 0) {
            i11 |= k10.F(lVar7) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i12) == 0) {
            i11 |= k10.F(lVar8) ? 8388608 : 4194304;
        }
        if ((4793491 & i11) != 4793490 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(863980933, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseHistoryDetailsScreen (PurchaseHistoryDetailsScreen.kt:87)");
            }
            Object D10 = k10.D();
            C4889m.a aVar3 = C4889m.f14007a;
            if (D10 == aVar3.a()) {
                B b10 = new B(P.k(C17169j.f142968a, k10));
                k10.u(b10);
                D10 = b10;
            }
            Q a10 = ((B) D10).a();
            k10.W(-184018150);
            boolean z10 = true;
            boolean z11 = (i11 & 112) == 32;
            Object D11 = k10.D();
            if (z11 || D11 == aVar3.a()) {
                D11 = new O0(aVar2);
                k10.u(D11);
            }
            k10.P();
            C5281d.a(true, (C17631a) D11, k10, 6, 0);
            k10.W(-184015310);
            Object D12 = k10.D();
            if (D12 == aVar3.a()) {
                D12 = new L0();
                k10.u(D12);
            }
            L0 l02 = (L0) D12;
            k10.P();
            k10.W(-184012255);
            boolean F10 = k10.F(a10);
            Object D13 = k10.D();
            if (F10 || D13 == aVar3.a()) {
                D13 = new X0(a10, l02);
                k10.u(D13);
            }
            C17642l lVar9 = (C17642l) D13;
            k10.P();
            if (bVar2 instanceof C10697r.b.C1535b) {
                k10.W(-1408764087);
                boolean b11 = ((C10697r.b.C1535b) bVar2).b();
                k10.W(-183987392);
                boolean z12 = (i11 & 896) == 256;
                if ((i11 & 14) != 4) {
                    z10 = false;
                }
                boolean z13 = z12 | z10;
                Object D14 = k10.D();
                if (z13 || D14 == aVar3.a()) {
                    D14 = new Y0(lVar5, bVar2);
                    k10.u(D14);
                }
                k10.P();
                s(b11, (C17631a) D14, k10, 0);
                k10.P();
                mVar2 = k10;
            } else if ((bVar2 instanceof C10697r.b.a) || C17542s.e(bVar2, C10697r.b.c.f80614a)) {
                k10.W(-1408369891);
                C5264a e10 = c1.c.e(522345770, true, new a(aVar2), k10, 54);
                C5264a e11 = c1.c.e(638310316, true, new b(l02), k10, 54);
                c cVar = r0;
                mVar2 = k10;
                c cVar2 = new c(bVar, pVar, lVar2, qVar, lVar3, lVar9, lVar4);
                C4762x0.a((androidx.compose.ui.d) null, e10, (p<? super C4889m, ? super Integer, C16807N>) null, e11, (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, (C5848T) null, c1.c.e(1658909621, true, cVar, mVar2, 54), mVar2, 805309488, 501);
                mVar2.P();
            } else {
                k10.W(-183991478);
                k10.P();
                throw new t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new Z0(bVar, aVar, lVar, pVar, lVar2, qVar, lVar3, lVar4, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N L(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M(Q q10, L0 l02, String str) {
        String str2 = str;
        C17542s.j(str2, "message");
        boolean z10 = Build.VERSION.SDK_INT < 33;
        e eVar = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str3 = null;
        String str4 = null;
        for (C11819b bVar : arrayList) {
            if (str3 == null) {
                String a10 = C11818a.a("Order ID copied, show snackbar: " + z10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str3 = C11820c.a(a10);
            }
            String str5 = str3;
            if (str4 == null) {
                str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "PurchaseHistoryDetailsScreen";
            }
            String str6 = str4;
            bVar.a(eVar, str6, false, (Throwable) null, str5);
            str3 = str5;
            str4 = str6;
        }
        if (z10) {
            F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new d(l02, str2, (C17164e<? super d>) null), 3, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N(C17642l lVar, C10697r.b bVar) {
        lVar.invoke(((C10697r.b.C1535b) bVar).a());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O(C10697r.b bVar, C17631a aVar, C17642l lVar, p pVar, C17642l lVar2, q qVar, C17642l lVar3, C17642l lVar4, int i10, C4889m mVar, int i11) {
        K(bVar, aVar, lVar, pVar, lVar2, qVar, lVar3, lVar4, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void P(String str, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        C17542s.j(str2, "title");
        C4889m k10 = mVar.k(1171667051);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(str2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1171667051, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.SectionHeader (PurchaseHistoryDetailsScreen.kt:370)");
            }
            mVar2 = k10;
            C13607l.j(str, C13679b.C2857b.C2858b.f116684a, D.k(TC.e.i(J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null)), 0.0f, h.B((float) 24), 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super N1.P, C16807N>) null, mVar2, (i11 & 14) | 48, 0, 262136);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new W0(str, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N Q(String str, int i10, C4889m mVar, int i11) {
        P(str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void s(boolean z10, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        String str;
        String str2;
        C4889m k10 = mVar.k(391451090);
        if ((i10 & 6) == 0) {
            i11 = (k10.b(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(391451090, i11, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.ErrorDialog (PurchaseHistoryDetailsScreen.kt:463)");
            }
            if (z10) {
                k10.W(-782548468);
                str = j.b(C12272a.f105832m0, k10, 0);
                k10.P();
            } else {
                k10.W(-782451004);
                str = j.b(Oo.b.f84536V8, k10, 0);
                k10.P();
            }
            if (z10) {
                k10.W(-782329267);
                str2 = j.b(C12272a.f105830l0, k10, 0);
                k10.P();
            } else {
                k10.W(-782232950);
                str2 = j.b(Oo.b.f84526U8, k10, 0);
                k10.P();
            }
            C11865e.i(str, str2, j.b(Oo.b.f84616d5, k10, 0), C5116k1.a(androidx.compose.ui.d.f18749a, "DetailsTestTags_ERROR_TEST_TAG"), aVar, k10, ((i11 << 9) & 57344) | 3072, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10558b1(z10, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N t(boolean z10, C17631a aVar, int i10, C4889m mVar, int i11) {
        s(z10, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: nI.p} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void u(Ei.C10696q r28, nI.p<? super java.lang.String, ? super java.lang.String, XH.C16807N> r29, nI.C17642l<? super java.lang.String, XH.C16807N> r30, nI.q<? super java.lang.String, ? super java.lang.String, ? super Hx.c.d, XH.C16807N> r31, nI.C17642l<? super java.lang.String, XH.C16807N> r32, nI.C17642l<? super java.lang.String, XH.C16807N> r33, nI.C17642l<? super java.lang.String, XH.C16807N> r34, U0.C4889m r35, int r36) {
        /*
            r1 = r28
            r12 = r29
            r13 = r31
            r14 = r36
            r0 = 8
            r2 = 1226409026(0x49198442, float:628804.1)
            r3 = r35
            U0.m r15 = r3.k(r2)
            r3 = r14 & 6
            if (r3 != 0) goto L_0x002b
            r3 = r14 & 8
            if (r3 != 0) goto L_0x0020
            boolean r3 = r15.V(r1)
            goto L_0x0024
        L_0x0020:
            boolean r3 = r15.F(r1)
        L_0x0024:
            if (r3 == 0) goto L_0x0028
            r3 = 4
            goto L_0x0029
        L_0x0028:
            r3 = 2
        L_0x0029:
            r3 = r3 | r14
            goto L_0x002c
        L_0x002b:
            r3 = r14
        L_0x002c:
            r4 = r14 & 48
            if (r4 != 0) goto L_0x003c
            boolean r4 = r15.F(r12)
            if (r4 == 0) goto L_0x0039
            r4 = 32
            goto L_0x003b
        L_0x0039:
            r4 = 16
        L_0x003b:
            r3 = r3 | r4
        L_0x003c:
            r4 = r14 & 384(0x180, float:5.38E-43)
            r9 = r30
            if (r4 != 0) goto L_0x004e
            boolean r4 = r15.F(r9)
            if (r4 == 0) goto L_0x004b
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x004d
        L_0x004b:
            r4 = 128(0x80, float:1.794E-43)
        L_0x004d:
            r3 = r3 | r4
        L_0x004e:
            r4 = r14 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x005e
            boolean r4 = r15.F(r13)
            if (r4 == 0) goto L_0x005b
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x005d
        L_0x005b:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x005d:
            r3 = r3 | r4
        L_0x005e:
            r4 = r14 & 24576(0x6000, float:3.4438E-41)
            r7 = r32
            if (r4 != 0) goto L_0x0070
            boolean r4 = r15.F(r7)
            if (r4 == 0) goto L_0x006d
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x006f
        L_0x006d:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x006f:
            r3 = r3 | r4
        L_0x0070:
            r4 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 & r14
            r6 = r33
            if (r4 != 0) goto L_0x0083
            boolean r4 = r15.F(r6)
            if (r4 == 0) goto L_0x0080
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L_0x0082
        L_0x0080:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x0082:
            r3 = r3 | r4
        L_0x0083:
            r4 = 1572864(0x180000, float:2.204052E-39)
            r4 = r4 & r14
            r5 = r34
            if (r4 != 0) goto L_0x0096
            boolean r4 = r15.F(r5)
            if (r4 == 0) goto L_0x0093
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0095
        L_0x0093:
            r4 = 524288(0x80000, float:7.34684E-40)
        L_0x0095:
            r3 = r3 | r4
        L_0x0096:
            r4 = r3
            r3 = 599187(0x92493, float:8.3964E-40)
            r3 = r3 & r4
            r8 = 599186(0x92492, float:8.39638E-40)
            if (r3 != r8) goto L_0x00ad
            boolean r3 = r15.l()
            if (r3 != 0) goto L_0x00a7
            goto L_0x00ad
        L_0x00a7:
            r15.L()
            r10 = r15
            goto L_0x0366
        L_0x00ad:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00b9
            r3 = -1
            java.lang.String r8 = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.OrderDetailsContent (PurchaseHistoryDetailsScreen.kt:196)"
            U0.C4895p.S(r2, r4, r3, r8)
        L_0x00b9:
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r8 = 0
            r3 = 1
            r0 = 0
            androidx.compose.ui.d r17 = androidx.compose.foundation.layout.J.f(r2, r8, r3, r0)
            r0 = 0
            androidx.compose.foundation.o r18 = androidx.compose.foundation.m.c(r0, r15, r0, r3)
            r22 = 14
            r23 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.m.f(r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.foundation.layout.d r17 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r8 = r17.g()
            i1.c$a r17 = i1.C5437c.f24302a
            i1.c$b r10 = r17.k()
            E1.I r8 = androidx.compose.foundation.layout.C5080k.a(r8, r10, r15, r0)
            int r10 = U0.C4883j.a(r15, r0)
            U0.y r11 = r15.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r20 = G1.C4504g.f6515W
            nI.a r0 = r20.a()
            U0.f r22 = r15.m()
            if (r22 != 0) goto L_0x0100
            U0.C4883j.c()
        L_0x0100:
            r15.I()
            boolean r22 = r15.i()
            if (r22 == 0) goto L_0x010d
            r15.p(r0)
            goto L_0x0110
        L_0x010d:
            r15.t()
        L_0x0110:
            U0.m r0 = U0.F1.a(r15)
            r22 = r4
            nI.p r4 = r20.c()
            U0.F1.c(r0, r8, r4)
            nI.p r4 = r20.e()
            U0.F1.c(r0, r11, r4)
            nI.p r4 = r20.b()
            boolean r8 = r0.i()
            if (r8 != 0) goto L_0x013c
            java.lang.Object r8 = r0.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x014a
        L_0x013c:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r0.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r0.w(r8, r4)
        L_0x014a:
            nI.p r4 = r20.d()
            U0.F1.c(r0, r3, r4)
            s0.h r0 = s0.C5862h.f28810a
            KJ.c r0 = r28.d()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0187
            r0 = -1384323098(0xffffffffad7ce7e6, float:-1.4376033E-11)
            r15.W(r0)
            androidx.compose.ui.d r0 = TC.e.i(r2)
            Hx.c$e r3 = r28.j()
            Hx.f r4 = r28.k()
            r8 = 0
            r10 = 0
            r11 = 1
            r11 = r22
            r5 = r0
            r6 = r15
            r7 = r8
            r0 = 2048(0x800, float:2.87E-42)
            r8 = r10
            Ai.C10596o0.h(r3, r4, r5, r6, r7, r8)
            r15.P()
            r0 = r2
            r26 = r11
            r14 = 16
            goto L_0x01ef
        L_0x0187:
            r11 = r22
            r0 = 2048(0x800, float:2.87E-42)
            r3 = -1384037991(0xffffffffad814199, float:-1.4694733E-11)
            r15.W(r3)
            java.lang.String r3 = r28.e()
            KJ.c r4 = r28.d()
            KJ.c r4 = KJ.C15985a.h(r4)
            r5 = -183182367(0xfffffffff514dbe1, float:-1.8870108E32)
            r15.W(r5)
            r5 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != r0) goto L_0x01a9
            r5 = 1
            goto L_0x01aa
        L_0x01a9:
            r5 = 0
        L_0x01aa:
            boolean r6 = r15.F(r1)
            r5 = r5 | r6
            java.lang.Object r6 = r15.D()
            if (r5 != 0) goto L_0x01bd
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x01c5
        L_0x01bd:
            Ai.c1 r6 = new Ai.c1
            r6.<init>(r13, r1)
            r15.u(r6)
        L_0x01c5:
            r7 = r6
            nI.p r7 = (nI.p) r7
            r15.P()
            int r5 = r11 << 3
            r5 = r5 & 8064(0x1f80, float:1.13E-41)
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r11
            r10 = r5 | r6
            r18 = 64
            r8 = 0
            r6 = r2
            r2 = r3
            r3 = r4
            r4 = r29
            r5 = r30
            r0 = r6
            r6 = r32
            r9 = r15
            r26 = r11
            r14 = 16
            r11 = r18
            Ai.C0.p(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r15.P()
        L_0x01ef:
            float r2 = (float) r14
            float r3 = c2.h.B(r2)
            r4 = 0
            r11 = 0
            r14 = 1
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.k(r0, r11, r3, r14, r4)
            r4 = 8
            float r10 = (float) r4
            float r4 = c2.h.B(r10)
            r8 = 54
            r9 = 4
            r5 = 0
            r7 = r15
            SC.C13643u0.c(r3, r4, r5, r7, r8, r9)
            KJ.c r3 = r28.b()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x0217
            r4 = r3
            goto L_0x0218
        L_0x0217:
            r4 = 0
        L_0x0218:
            r3 = -183168700(0xfffffffff5151144, float:-1.8896543E32)
            r15.W(r3)
            if (r4 != 0) goto L_0x0225
            r25 = r10
            r27 = r26
            goto L_0x028b
        L_0x0225:
            int r3 = wi.C12272a.f105824i1
            r5 = 0
            java.lang.String r3 = J1.j.b(r3, r15, r5)
            r5 = -1477089439(0xffffffffa7f56761, float:-6.8113244E-15)
            r15.W(r5)
            r9 = r26
            r5 = r9 & 112(0x70, float:1.57E-43)
            r6 = 32
            if (r5 != r6) goto L_0x023c
            r5 = r14
            goto L_0x023d
        L_0x023c:
            r5 = 0
        L_0x023d:
            boolean r6 = r15.F(r1)
            r5 = r5 | r6
            java.lang.Object r6 = r15.D()
            if (r5 != 0) goto L_0x0250
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x0258
        L_0x0250:
            Ai.d1 r6 = new Ai.d1
            r6.<init>(r12, r1)
            r15.u(r6)
        L_0x0258:
            r5 = r6
            nI.a r5 = (nI.C17631a) r5
            r15.P()
            int r6 = r9 << 3
            r8 = r6 & 7168(0x1c00, float:1.0045E-41)
            r16 = 16
            r7 = 0
            r6 = r30
            r17 = r8
            r8 = r15
            r27 = r9
            r9 = r17
            r25 = r10
            r10 = r16
            Ai.N0.d(r3, r4, r5, r6, r7, r8, r9, r10)
            float r3 = c2.h.B(r2)
            r4 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.k(r0, r11, r3, r14, r4)
            float r4 = c2.h.B(r25)
            r8 = 54
            r9 = 4
            r5 = 0
            r7 = r15
            SC.C13643u0.c(r3, r4, r5, r7, r8, r9)
        L_0x028b:
            r15.P()
            r3 = -183148351(0xfffffffff51560c1, float:-1.8935904E32)
            r15.W(r3)
            KJ.c r3 = r28.a()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x02ff
            KJ.c r3 = r28.d()
            int r3 = r3.size()
            if (r3 <= r14) goto L_0x02aa
            r3 = r14
            goto L_0x02ab
        L_0x02aa:
            r3 = 0
        L_0x02ab:
            KJ.c r4 = r28.a()
            KJ.c r4 = KJ.C15985a.h(r4)
            r5 = -183141446(0xfffffffff5157bba, float:-1.894926E32)
            r15.W(r5)
            r10 = r27
            r5 = r10 & 7168(0x1c00, float:1.0045E-41)
            r6 = 2048(0x800, float:2.87E-42)
            if (r5 != r6) goto L_0x02c3
            r5 = r14
            goto L_0x02c4
        L_0x02c3:
            r5 = 0
        L_0x02c4:
            boolean r6 = r15.F(r1)
            r5 = r5 | r6
            java.lang.Object r6 = r15.D()
            if (r5 != 0) goto L_0x02d7
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x02df
        L_0x02d7:
            Ai.e1 r6 = new Ai.e1
            r6.<init>(r13, r1)
            r15.u(r6)
        L_0x02df:
            nI.l r6 = (nI.C17642l) r6
            r15.P()
            r5 = 0
            Ai.P.d(r3, r4, r6, r15, r5)
            float r3 = c2.h.B(r2)
            r4 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.k(r0, r11, r3, r14, r4)
            float r4 = c2.h.B(r25)
            r8 = 54
            r9 = 4
            r5 = 0
            r7 = r15
            SC.C13643u0.c(r3, r4, r5, r7, r8, r9)
            goto L_0x0301
        L_0x02ff:
            r10 = r27
        L_0x0301:
            r15.P()
            java.lang.String r3 = r28.e()
            java.lang.String r16 = r28.c()
            java.lang.String r17 = r28.f()
            boolean r19 = r28.i()
            int r4 = r10 >> 6
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r5 = 458752(0x70000, float:6.42848E-40)
            int r6 = r10 >> 3
            r5 = r5 & r6
            r23 = r4 | r5
            r24 = 64
            r21 = 0
            r10 = r15
            r15 = r3
            r18 = r33
            r20 = r34
            r22 = r10
            z(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            float r2 = c2.h.B(r2)
            r3 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.k(r0, r11, r2, r14, r3)
            float r4 = c2.h.B(r25)
            r8 = 54
            r9 = 4
            r5 = 0
            r7 = r10
            SC.C13643u0.c(r3, r4, r5, r7, r8, r9)
            RC.m r0 = r28.g()
            KJ.c r2 = r28.h()
            KJ.c r2 = KJ.C15985a.h(r2)
            int r3 = RC.m.f115340m
            int r4 = IC.C13023e.f110931a
            int r4 = r4 << 3
            r3 = r3 | r4
            Ai.z1.i(r0, r2, r10, r3)
            r10.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0366
            U0.C4895p.R()
        L_0x0366:
            U0.Y0 r9 = r10.n()
            if (r9 == 0) goto L_0x0385
            Ai.f1 r10 = new Ai.f1
            r0 = r10
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            r8 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0385:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.C10573g1.u(Ei.q, nI.p, nI.l, nI.q, nI.l, nI.l, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N v(q qVar, C10696q qVar2, String str, c.d.e eVar) {
        C17542s.j(str, "deliveryNumber");
        C17542s.j(eVar, "action");
        qVar.invoke(qVar2.e(), str, eVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w(p pVar, C10696q qVar) {
        pVar.invoke(qVar.e(), null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(q qVar, C10696q qVar2, c.d dVar) {
        C17542s.j(dVar, "it");
        qVar.invoke(qVar2.e(), null, dVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C10696q qVar, p pVar, C17642l lVar, q qVar2, C17642l lVar2, C17642l lVar3, C17642l lVar4, int i10, C4889m mVar, int i11) {
        u(qVar, pVar, lVar, qVar2, lVar2, lVar3, lVar4, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void z(java.lang.String r32, java.lang.String r33, java.lang.String r34, nI.C17642l<? super java.lang.String, XH.C16807N> r35, boolean r36, nI.C17642l<? super java.lang.String, XH.C16807N> r37, androidx.compose.ui.d r38, U0.C4889m r39, int r40, int r41) {
        /*
            r13 = r32
            r5 = r34
            r4 = r35
            r3 = r36
            r2 = r37
            r0 = r40
            r1 = 16
            r6 = 32
            r7 = 2
            r8 = 1423731462(0x54dc6b06, float:7.5735069E12)
            r9 = r39
            U0.m r12 = r9.k(r8)
            r11 = 1
            r9 = r41 & 1
            r10 = 4
            if (r9 == 0) goto L_0x0023
            r9 = r0 | 6
            goto L_0x0033
        L_0x0023:
            r9 = r0 & 6
            if (r9 != 0) goto L_0x0032
            boolean r9 = r12.V(r13)
            if (r9 == 0) goto L_0x002f
            r9 = r10
            goto L_0x0030
        L_0x002f:
            r9 = r7
        L_0x0030:
            r9 = r9 | r0
            goto L_0x0033
        L_0x0032:
            r9 = r0
        L_0x0033:
            r7 = r41 & 2
            if (r7 == 0) goto L_0x003c
            r9 = r9 | 48
        L_0x0039:
            r7 = r33
            goto L_0x004c
        L_0x003c:
            r7 = r0 & 48
            if (r7 != 0) goto L_0x0039
            r7 = r33
            boolean r14 = r12.V(r7)
            if (r14 == 0) goto L_0x004a
            r14 = r6
            goto L_0x004b
        L_0x004a:
            r14 = r1
        L_0x004b:
            r9 = r9 | r14
        L_0x004c:
            r14 = r41 & 4
            if (r14 == 0) goto L_0x0053
            r9 = r9 | 384(0x180, float:5.38E-43)
            goto L_0x0063
        L_0x0053:
            r14 = r0 & 384(0x180, float:5.38E-43)
            if (r14 != 0) goto L_0x0063
            boolean r14 = r12.V(r5)
            if (r14 == 0) goto L_0x0060
            r14 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r14 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r9 = r9 | r14
        L_0x0063:
            r14 = r41 & 8
            if (r14 == 0) goto L_0x006a
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            goto L_0x007a
        L_0x006a:
            r14 = r0 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L_0x007a
            boolean r14 = r12.F(r4)
            if (r14 == 0) goto L_0x0077
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r9 = r9 | r14
        L_0x007a:
            r1 = r41 & 16
            if (r1 == 0) goto L_0x0081
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
            goto L_0x0091
        L_0x0081:
            r1 = r0 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x0091
            boolean r1 = r12.b(r3)
            if (r1 == 0) goto L_0x008e
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008e:
            r1 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r9 = r9 | r1
        L_0x0091:
            r1 = r41 & 32
            r14 = 196608(0x30000, float:2.75506E-40)
            if (r1 == 0) goto L_0x0099
            r9 = r9 | r14
            goto L_0x00a9
        L_0x0099:
            r1 = r0 & r14
            if (r1 != 0) goto L_0x00a9
            boolean r1 = r12.F(r2)
            if (r1 == 0) goto L_0x00a6
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00a6:
            r1 = 65536(0x10000, float:9.18355E-41)
        L_0x00a8:
            r9 = r9 | r1
        L_0x00a9:
            r1 = r41 & 64
            r14 = 1572864(0x180000, float:2.204052E-39)
            if (r1 == 0) goto L_0x00b3
            r9 = r9 | r14
        L_0x00b0:
            r14 = r38
            goto L_0x00c5
        L_0x00b3:
            r14 = r14 & r0
            if (r14 != 0) goto L_0x00b0
            r14 = r38
            boolean r16 = r12.V(r14)
            if (r16 == 0) goto L_0x00c1
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c3
        L_0x00c1:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00c3:
            r9 = r9 | r16
        L_0x00c5:
            r16 = 599187(0x92493, float:8.3964E-40)
            r6 = r9 & r16
            r11 = 599186(0x92492, float:8.39638E-40)
            if (r6 != r11) goto L_0x00df
            boolean r6 = r12.l()
            if (r6 != 0) goto L_0x00d6
            goto L_0x00df
        L_0x00d6:
            r12.L()
            r6 = r2
            r1 = r12
            r2 = r13
            r7 = r14
            goto L_0x03b2
        L_0x00df:
            if (r1 == 0) goto L_0x00e5
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r11 = r1
            goto L_0x00e6
        L_0x00e5:
            r11 = r14
        L_0x00e6:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00f2
            r1 = -1
            java.lang.String r6 = "com.ingka.ikea.app.purchasehistory.impl.presentation.compose.PurchaseDetailsContent (PurchaseHistoryDetailsScreen.kt:296)"
            U0.C4895p.S(r8, r9, r1, r6)
        L_0x00f2:
            U0.I0 r1 = androidx.compose.ui.platform.C5100f0.d()
            java.lang.Object r1 = r12.Q(r1)
            androidx.compose.ui.platform.d0 r1 = (androidx.compose.ui.platform.C5094d0) r1
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r6.g()
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c$b r8 = r8.k()
            r14 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r8, r12, r14)
            int r8 = U0.C4883j.a(r12, r14)
            U0.y r15 = r12.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r12, r11)
            G1.g$a r19 = G1.C4504g.f6515W
            nI.a r14 = r19.a()
            U0.f r20 = r12.m()
            if (r20 != 0) goto L_0x0128
            U0.C4883j.c()
        L_0x0128:
            r12.I()
            boolean r20 = r12.i()
            if (r20 == 0) goto L_0x0135
            r12.p(r14)
            goto L_0x0138
        L_0x0135:
            r12.t()
        L_0x0138:
            U0.m r14 = U0.F1.a(r12)
            nI.p r0 = r19.c()
            U0.F1.c(r14, r6, r0)
            nI.p r0 = r19.e()
            U0.F1.c(r14, r15, r0)
            nI.p r0 = r19.b()
            boolean r6 = r14.i()
            if (r6 != 0) goto L_0x0162
            java.lang.Object r6 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r15)
            if (r6 != 0) goto L_0x0170
        L_0x0162:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r14.u(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r14.w(r6, r0)
        L_0x0170:
            nI.p r0 = r19.d()
            U0.F1.c(r14, r10, r0)
            s0.h r0 = s0.C5862h.f28810a
            int r0 = wi.C12272a.f105834n0
            r6 = 0
            java.lang.String r0 = J1.j.b(r0, r12, r6)
            P(r0, r12, r6)
            int r0 = Oo.b.f84620d9
            java.lang.Object[] r8 = new java.lang.Object[]{r32}
            java.lang.String r0 = J1.j.c(r0, r8, r12, r6)
            androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
            java.lang.String r8 = "DetailsTestTags_ORDER_ID_TEST_TAG"
            androidx.compose.ui.d r19 = androidx.compose.ui.platform.C5116k1.a(r10, r8)
            int r8 = wi.C12272a.f105838p0
            java.lang.String r20 = J1.j.b(r8, r12, r6)
            SC.c1$a r28 = new SC.c1$a
            int r22 = uK.C18146a.f148225Ra
            r26 = 12
            r27 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r21 = r28
            r21.<init>(r22, r23, r24, r25, r26, r27)
            SC.b1$e r21 = SC.C13569b1.e.f116150b
            r8 = -584806473(0xffffffffdd248fb7, float:-7.411186E17)
            r12.W(r8)
            boolean r8 = r12.F(r1)
            r15 = r9 & 14
            r14 = 4
            if (r15 != r14) goto L_0x01c2
            r18 = 1
            goto L_0x01c4
        L_0x01c2:
            r18 = r6
        L_0x01c4:
            r8 = r8 | r18
            r6 = r9 & 7168(0x1c00, float:1.0045E-41)
            r14 = 2048(0x800, float:2.87E-42)
            if (r6 != r14) goto L_0x01ce
            r6 = 1
            goto L_0x01cf
        L_0x01ce:
            r6 = 0
        L_0x01cf:
            r6 = r6 | r8
            boolean r8 = r12.V(r0)
            r6 = r6 | r8
            java.lang.Object r8 = r12.D()
            if (r6 != 0) goto L_0x01e3
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x01eb
        L_0x01e3:
            Ai.R0 r8 = new Ai.R0
            r8.<init>(r1, r13, r4, r0)
            r12.u(r8)
        L_0x01eb:
            r1 = r8
            nI.a r1 = (nI.C17631a) r1
            r12.P()
            int r0 = r9 << 9
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | 384(0x180, float:5.38E-43)
            int r26 = SC.C13573c1.a.f116164f
            int r6 = r26 << 12
            r0 = r0 | r6
            int r6 = SC.C13569b1.e.f116151c
            int r6 = r6 << 15
            r14 = r0 | r6
            r0 = 4
            r8 = 0
            r6 = 6
            r29 = r15
            r15 = r6
            r16 = 7104(0x1bc0, float:9.955E-42)
            r6 = 0
            r18 = 0
            r7 = r18
            r8 = r18
            r18 = 0
            r27 = r9
            r9 = r18
            r18 = 1
            r30 = r10
            r10 = r18
            r18 = 0
            r31 = r11
            r11 = r18
            r17 = 0
            r38 = r12
            r12 = r17
            r0 = r20
            r2 = r19
            r3 = r32
            r4 = r28
            r5 = r21
            r13 = r38
            SC.C13585f1.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = -584796847(0xffffffffdd24b551, float:-7.4178009E17)
            r3 = r38
            r3.W(r0)
            java.lang.Object r0 = r3.D()
            U0.m$a r28 = U0.C4889m.f14007a
            java.lang.Object r1 = r28.a()
            if (r0 != r1) goto L_0x0254
            Ai.S0 r0 = new Ai.S0
            r0.<init>()
            r3.u(r0)
        L_0x0254:
            nI.l r0 = (nI.C17642l) r0
            r3.P()
            r7 = r30
            r8 = 1
            androidx.compose.ui.d r11 = L1.o.c(r7, r8, r0)
            int r0 = wi.C12272a.f105842r0
            r6 = 0
            java.lang.String r9 = J1.j.b(r0, r3, r6)
            SC.c1$a r14 = new SC.c1$a
            r13 = r14
            int r15 = uK.C18146a.f148290W0
            r19 = 12
            r20 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20)
            int r0 = r27 << 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | 48
            int r1 = r26 << 12
            r23 = r0 | r1
            r24 = 6
            r25 = 7136(0x1be0, float:1.0E-41)
            r10 = 0
            r14 = 0
            r15 = 0
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = 0
            r12 = r33
            r22 = r3
            SC.C13585f1.c(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0 = -584783974(0xffffffffdd24e79a, float:-7.4266472E17)
            r3.W(r0)
            if (r34 != 0) goto L_0x02a8
            r38 = r3
            r17 = r7
            r18 = r8
            goto L_0x0303
        L_0x02a8:
            r0 = 1080373264(0x40653010, float:3.5810585)
            r3.W(r0)
            java.lang.Object r0 = r3.D()
            java.lang.Object r1 = r28.a()
            if (r0 != r1) goto L_0x02c0
            Ai.T0 r0 = new Ai.T0
            r0.<init>()
            r3.u(r0)
        L_0x02c0:
            nI.l r0 = (nI.C17642l) r0
            r3.P()
            androidx.compose.ui.d r2 = L1.o.c(r7, r8, r0)
            int r0 = wi.C12272a.f105840q0
            java.lang.String r0 = J1.j.b(r0, r3, r6)
            SC.c1$a r9 = new SC.c1$a
            r4 = r9
            int r10 = uK.C18146a.f148378bc
            r14 = 12
            r15 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            int r1 = r27 << 3
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | 48
            int r5 = r26 << 12
            r14 = r1 | r5
            r15 = 6
            r16 = 7136(0x1be0, float:1.0E-41)
            r1 = 0
            r5 = 0
            r9 = 0
            r13 = r6
            r6 = r9
            r17 = r7
            r7 = r9
            r18 = r8
            r8 = r9
            r9 = 0
            r10 = 1
            r11 = 0
            r38 = r3
            r3 = r34
            r13 = r38
            SC.C13585f1.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            XH.N r0 = XH.C16807N.f139792a
        L_0x0303:
            r38.P()
            r0 = -584766667(0xffffffffdd252b35, float:-7.4385404E17)
            r1 = r38
            r1.W(r0)
            if (r36 == 0) goto L_0x039d
            androidx.compose.ui.d r9 = TC.e.i(r17)
            r14 = 0
            r15 = 6
            r10 = 0
            r11 = 0
            r13 = r1
            SC.C13643u0.c(r9, r10, r11, r13, r14, r15)
            int r0 = wi.C12272a.f105785T0
            r2 = 0
            java.lang.String r9 = J1.j.b(r0, r1, r2)
            SC.c1$a r0 = new SC.c1$a
            int r11 = uK.C18146a.f148625ra
            r15 = 12
            r16 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            SC.b1$d r14 = SC.C13569b1.d.f116148b
            int r3 = wi.C12272a.f105783S0
            java.lang.String r12 = J1.j.b(r3, r1, r2)
            r3 = -584745364(0xffffffffdd257e6c, float:-7.4531798E17)
            r1.W(r3)
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r27 & r3
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r3 != r4) goto L_0x034f
            r11 = r18
        L_0x034b:
            r4 = r29
            r3 = 4
            goto L_0x0351
        L_0x034f:
            r11 = r2
            goto L_0x034b
        L_0x0351:
            if (r4 != r3) goto L_0x0354
            goto L_0x0356
        L_0x0354:
            r18 = r2
        L_0x0356:
            r2 = r11 | r18
            java.lang.Object r3 = r1.D()
            if (r2 != 0) goto L_0x036a
            java.lang.Object r2 = r28.a()
            if (r3 != r2) goto L_0x0365
            goto L_0x036a
        L_0x0365:
            r2 = r32
            r6 = r37
            goto L_0x0376
        L_0x036a:
            Ai.U0 r3 = new Ai.U0
            r2 = r32
            r6 = r37
            r3.<init>(r6, r2)
            r1.u(r3)
        L_0x0376:
            r10 = r3
            nI.a r10 = (nI.C17631a) r10
            r1.P()
            int r3 = r26 << 12
            int r4 = SC.C13569b1.d.f116149c
            int r4 = r4 << 15
            r23 = r3 | r4
            r24 = 6
            r25 = 7108(0x1bc4, float:9.96E-42)
            r11 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = 0
            r13 = r0
            r22 = r1
            SC.C13585f1.c(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x03a1
        L_0x039d:
            r2 = r32
            r6 = r37
        L_0x03a1:
            r1.P()
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x03b0
            U0.C4895p.R()
        L_0x03b0:
            r7 = r31
        L_0x03b2:
            U0.Y0 r10 = r1.n()
            if (r10 == 0) goto L_0x03d1
            Ai.V0 r11 = new Ai.V0
            r0 = r11
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r35
            r5 = r36
            r6 = r37
            r8 = r40
            r9 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.a(r11)
        L_0x03d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ai.C10573g1.z(java.lang.String, java.lang.String, java.lang.String, nI.l, boolean, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }
}
