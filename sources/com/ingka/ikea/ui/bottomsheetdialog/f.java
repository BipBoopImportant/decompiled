package com.ingka.ikea.ui.bottomsheetdialog;

import A0.g;
import E1.I;
import G1.C4504g;
import O0.C4725e0;
import O0.C4727f0;
import O0.F0;
import O0.P0;
import QJ.Q;
import TC.C13678a;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import dI.C17164e;
import eI.C17187b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import n0.C5601g;
import nI.C17631a;
import nI.p;
import nI.q;
import p1.i1;
import ql.C11796b;
import s0.C5844O;
import s0.C5848T;
import s0.C5850V;
import s0.C5854Z;
import s0.C5861g;
import s0.C5862h;
import s0.a0;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aE\u0010\n\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aE\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0003¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000f²\u0006\u000e\u0010\u000e\u001a\u0004\u0018\u00010\u00008\nX\u0002"}, d2 = {"Lcom/ingka/ikea/ui/bottomsheetdialog/g;", "sheetVisibility", "", "showTopHandle", "LO0/F0;", "sheetState", "Lkotlin/Function0;", "LXH/N;", "onDismiss", "sheetContent", "f", "(Lcom/ingka/ikea/ui/bottomsheetdialog/g;ZLO0/F0;LnI/a;LnI/p;LU0/m;I)V", "visibility", "c", "visibilityState", "bottom-sheet-dialog_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.ui.bottomsheetdialog.BottomSheetScreenKt$BottomSheetContent$1$1", f = "BottomSheetScreen.kt", l = {65, 67}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f120592c;

        /* renamed from: d  reason: collision with root package name */
        int f120593d;

        /* renamed from: e  reason: collision with root package name */
        int f120594e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ F0 f120595f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f120596g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ A1<g> f120597h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.ui.bottomsheetdialog.f$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C3008a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f120598a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    com.ingka.ikea.ui.bottomsheetdialog.g[] r0 = com.ingka.ikea.ui.bottomsheetdialog.g.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.ingka.ikea.ui.bottomsheetdialog.g r1 = com.ingka.ikea.ui.bottomsheetdialog.g.Expanded     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.ingka.ikea.ui.bottomsheetdialog.g r1 = com.ingka.ikea.ui.bottomsheetdialog.g.Hidden     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f120598a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.ui.bottomsheetdialog.f.a.C3008a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(F0 f02, C17631a<C16807N> aVar, A1<? extends g> a12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f120595f = f02;
            this.f120596g = aVar;
            this.f120597h = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f120595f, this.f120596g, this.f120597h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f120594e;
            if (i10 == 0) {
                y.b(obj);
                g i11 = f.d(this.f120597h);
                int i12 = i11 == null ? -1 : C3008a.f120598a[i11.ordinal()];
                if (i12 != -1) {
                    if (i12 == 1) {
                        F0 f02 = this.f120595f;
                        this.f120592c = i11;
                        this.f120593d = i12;
                        this.f120594e = 1;
                        if (f02.p(this) == f10) {
                            return f10;
                        }
                    } else if (i12 == 2) {
                        F0 f03 = this.f120595f;
                        this.f120592c = i11;
                        this.f120593d = i12;
                        this.f120594e = 2;
                        if (f03.k(this) == f10) {
                            return f10;
                        }
                    } else {
                        throw new t();
                    }
                }
                return C16807N.f139792a;
            } else if (i10 == 1) {
                g gVar = (g) this.f120592c;
                y.b(obj);
                return C16807N.f139792a;
            } else if (i10 == 2) {
                g gVar2 = (g) this.f120592c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f120596g.invoke();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C5848T> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f120599a = new b();

        b() {
        }

        public final C5848T a(C4889m mVar, int i10) {
            mVar.W(-1480278215);
            if (C4895p.J()) {
                C4895p.S(-1480278215, i10, -1, "com.ingka.ikea.ui.bottomsheetdialog.BottomSheetContent.<anonymous> (BottomSheetScreen.kt:90)");
            }
            C5848T c10 = C5850V.c(h.B((float) 0), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return c10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((C4889m) obj, ((Number) obj2).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f120600a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f120601b;

        c(boolean z10, p<? super C4889m, ? super Integer, C16807N> pVar) {
            this.f120600a = z10;
            this.f120601b = pVar;
        }

        public final void a(C5861g gVar, C4889m mVar, int i10) {
            C17542s.j(gVar, "$this$ModalBottomSheet");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-98631803, i10, -1, "com.ingka.ikea.ui.bottomsheetdialog.BottomSheetContent.<anonymous> (BottomSheetScreen.kt:77)");
                }
                boolean z10 = this.f120600a;
                p<C4889m, Integer, C16807N> pVar = this.f120601b;
                d.a aVar = androidx.compose.ui.d.f18749a;
                C5073d.m g10 = C5073d.f18068a.g();
                C5437c.a aVar2 = C5437c.f24302a;
                I a10 = C5080k.a(g10, aVar2.k(), mVar, 0);
                int a11 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, aVar);
                C4504g.a aVar3 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar3.c());
                F1.c(a13, s10, aVar3.e());
                p<C4504g, Integer, C16807N> b10 = aVar3.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar3.d());
                C5862h hVar = C5862h.f28810a;
                mVar.W(2050575228);
                if (z10) {
                    C11796b.b(hVar.b(aVar, aVar2.g()), mVar, 0, 0);
                }
                mVar.P();
                pVar.invoke(mVar, 0);
                C5844O.a(C5854Z.a(aVar, a0.c(C5848T.f28733a, mVar, 6)), mVar, 0);
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
            a((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f120602a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f120603b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ F0 f120604c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f120605d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f120606e;

        d(g gVar, boolean z10, F0 f02, C17631a<C16807N> aVar, p<? super C4889m, ? super Integer, C16807N> pVar) {
            this.f120602a = gVar;
            this.f120603b = z10;
            this.f120604c = f02;
            this.f120605d = aVar;
            this.f120606e = pVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-939848228, i10, -1, "com.ingka.ikea.ui.bottomsheetdialog.BottomSheetScreen.<anonymous> (BottomSheetScreen.kt:40)");
                }
                f.c(this.f120602a, this.f120603b, this.f120604c, this.f120605d, this.f120606e, mVar, 0);
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
    public static final void c(g gVar, boolean z10, F0 f02, C17631a<C16807N> aVar, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        g gVar2 = gVar;
        boolean z11 = z10;
        F0 f03 = f02;
        C17631a<C16807N> aVar2 = aVar;
        p<? super C4889m, ? super Integer, C16807N> pVar2 = pVar;
        int i12 = i10;
        C4889m k10 = mVar.k(322235842);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(gVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.b(z11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(f03) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar2) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(pVar2) ? 16384 : 8192;
        }
        if ((i11 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(322235842, i11, -1, "com.ingka.ikea.ui.bottomsheetdialog.BottomSheetContent (BottomSheetScreen.kt:58)");
            }
            A1 q10 = p1.q(gVar2, k10, i11 & 14);
            g d10 = d(q10);
            k10.W(-748609539);
            int i13 = i11 & 896;
            boolean V10 = (i13 == 256) | k10.V(q10) | ((i11 & 7168) == 2048);
            Object D10 = k10.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new a(f03, aVar2, q10, (C17164e<? super a>) null);
                k10.u(D10);
            }
            k10.P();
            P.g(d10, (p) D10, k10, 0);
            mVar2 = k10;
            C4725e0.a(aVar, androidx.compose.ui.d.f18749a, f02, 0.0f, g.g(C13678a.a(), C13678a.a(), 0.0f, 0.0f, 12, (Object) null), C18030v.f147664a.a(k10, C18030v.f147665b).k(), 0, 0.0f, c.f120579a.a(k10, 6), (p<? super C4889m, ? super Integer, C16807N>) null, b.f120599a, (C4727f0) null, c1.c.e(-98631803, true, new c(z11, pVar2), k10, 54), mVar2, ((i11 >> 9) & 14) | 805306416 | i13, 384, 2248);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new e(gVar, z10, f02, aVar, pVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final g d(A1<? extends g> a12) {
        return (g) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N e(g gVar, boolean z10, F0 f02, C17631a aVar, p pVar, int i10, C4889m mVar, int i11) {
        c(gVar, z10, f02, aVar, pVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void f(g gVar, boolean z10, F0 f02, C17631a<C16807N> aVar, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        F0 f03 = f02;
        C17631a<C16807N> aVar2 = aVar;
        p<? super C4889m, ? super Integer, C16807N> pVar2 = pVar;
        int i12 = i10;
        C17542s.j(f03, "sheetState");
        C17542s.j(aVar2, "onDismiss");
        C17542s.j(pVar2, "sheetContent");
        C4889m k10 = mVar.k(723362369);
        g gVar2 = gVar;
        if ((i12 & 6) == 0) {
            i11 = (k10.V(gVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        boolean z11 = z10;
        if ((i12 & 48) == 0) {
            i11 |= k10.b(z11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(f03) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(pVar2) ? 16384 : 8192;
        }
        if ((i11 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(723362369, i11, -1, "com.ingka.ikea.ui.bottomsheetdialog.BottomSheetScreen (BottomSheetScreen.kt:36)");
            }
            mVar2 = k10;
            P0.a((androidx.compose.ui.d) null, (i1) null, C18030v.f147664a.a(k10, C18030v.f147665b).L0(), 0, 0.0f, 0.0f, (C5601g) null, c1.c.e(-939848228, true, new d(gVar, z10, f02, aVar, pVar), k10, 54), mVar2, 12582912, 123);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new d(gVar, z10, f02, aVar, pVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(g gVar, boolean z10, F0 f02, C17631a aVar, p pVar, int i10, C4889m mVar, int i11) {
        f(gVar, z10, f02, aVar, pVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
