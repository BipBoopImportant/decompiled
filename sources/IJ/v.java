package Ij;

import C.C4409q;
import E1.I;
import EB.C12832d;
import G1.C4504g;
import Hj.n;
import Ij.h;
import J1.j;
import Jj.e;
import Lj.o;
import QJ.Q;
import SC.F0;
import SC.G0;
import SC.H0;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import TJ.C16509F;
import TJ.C16533h;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.P;
import U0.Y0;
import Uj.C10958a;
import Uj.C10959b;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import bd.C9427a;
import com.google.ar.core.ImageMetadata;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.d;
import com.sugarcube.app.base.network.models.UploadKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import j3.g;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import r0.m;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5862h;
import uK.C18146a;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aG\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0017H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001e\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006!²\u0006\f\u0010 \u001a\u00020\u00118\nX\u0002²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u0002"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/f;", "viewModel", "Ljava/util/concurrent/Executor;", "executor", "LUj/b;", "cartButtonViewModel", "LC/q;", "cameraSelector", "Lbd/a;", "barcodeScanner", "LIj/h;", "scannerBarcodeAnalyzer", "LIj/y;", "actions", "LXH/N;", "l", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/f;Ljava/util/concurrent/Executor;LUj/b;LC/q;Lbd/a;LIj/h;LIj/y;LU0/m;I)V", "LHj/n;", "uiState", "LUj/a;", "cartButtonState", "k", "(LHj/n;LUj/a;Ljava/util/concurrent/Executor;LC/q;Lbd/a;LIj/h;LIj/y;LU0/m;I)V", "Lkotlin/Function0;", "onEnterArticleNumberButtonClicked", "onCartClicked", "f", "(LUj/a;LnI/a;LnI/a;LU0/m;I)V", "Landroidx/compose/ui/d;", "modifier", "h", "(Landroidx/compose/ui/d;LU0/m;II)V", "state", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ScannerProductScreenKt$ScannerProductScreen$1$1", f = "ScannerProductScreen.kt", l = {64}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81877c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ r f81878d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f81879e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.f f81880f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ScannerProductScreenKt$ScannerProductScreen$1$1$1", f = "ScannerProductScreen.kt", l = {66}, m = "invokeSuspend")
        /* renamed from: Ij.v$a$a  reason: collision with other inner class name */
        static final class C1602a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f81881c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h f81882d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.f f81883e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ij.v$a$a$a  reason: collision with other inner class name */
            static final class C1603a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.f f81884a;

                C1603a(com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.f fVar) {
                    this.f81884a = fVar;
                }

                /* renamed from: c */
                public final Object emit(h.a aVar, C17164e<? super C16807N> eVar) {
                    com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.f fVar = this.f81884a;
                    int a10 = aVar.a();
                    String b10 = aVar.b();
                    if (b10 == null) {
                        b10 = "";
                    }
                    fVar.U(new d.l(a10, b10));
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1602a(h hVar, com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.f fVar, C17164e<? super C1602a> eVar) {
                super(2, eVar);
                this.f81882d = hVar;
                this.f81883e = fVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C1602a(this.f81882d, this.f81883e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C1602a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f81881c;
                if (i10 == 0) {
                    y.b(obj);
                    C16509F<h.a> b10 = this.f81882d.b();
                    C1603a aVar = new C1603a(this.f81883e);
                    this.f81881c = 1;
                    if (b10.collect(aVar, this) == f10) {
                        return f10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y.b(obj);
                }
                throw new C16820k();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r rVar, h hVar, com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.f fVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f81878d = rVar;
            this.f81879e = hVar;
            this.f81880f = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f81878d, this.f81879e, this.f81880f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81877c;
            if (i10 == 0) {
                y.b(obj);
                r rVar = this.f81878d;
                r.b bVar = r.b.STARTED;
                C1602a aVar = new C1602a(this.f81879e, this.f81880f, (C17164e<? super C1602a>) null);
                this.f81877c = 1;
                if (androidx.lifecycle.Q.a(rVar, bVar, aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ScannerProductScreenKt$ScannerProductScreen$2$1", f = "ScannerProductScreen.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81885c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1<n> f81886d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ y f81887e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(A1<n> a12, y yVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f81886d = a12;
            this.f81887e = yVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f81886d, this.f81887e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f81885c == 0) {
                y.b(obj);
                com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.c c10 = v.m(this.f81886d).c();
                if (c10 != null) {
                    y yVar = this.f81887e;
                    yVar.a(c10);
                    yVar.b(d.i.f92159a);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Ij/v$c", "LJj/f;", "LXH/N;", "b", "()V", "a", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Jj.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f81888a;

        c(y yVar) {
            this.f81888a = yVar;
        }

        public void a() {
            this.f81888a.b(d.f.f92156a);
        }

        public void b() {
            this.f81888a.b(d.b.f92150a);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10958a f81889a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ y f81890b;

        d(C10958a aVar, y yVar) {
            this.f81889a = aVar;
            this.f81890b = yVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(y yVar) {
            yVar.b(new d.e(Interaction$Component.SCANNER));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(y yVar) {
            yVar.b(d.a.f92149a);
            return C16807N.f139792a;
        }

        public final void c(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-738724001, i10, -1, "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ScannerProductScreen.<anonymous> (ScannerProductScreen.kt:120)");
                }
                C10958a aVar = this.f81889a;
                mVar.W(532198734);
                boolean F10 = mVar.F(this.f81890b);
                y yVar = this.f81890b;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new w(yVar);
                    mVar.u(D10);
                }
                C17631a aVar2 = (C17631a) D10;
                mVar.P();
                mVar.W(532205424);
                boolean F11 = mVar.F(this.f81890b);
                y yVar2 = this.f81890b;
                Object D11 = mVar.D();
                if (F11 || D11 == C4889m.f14007a.a()) {
                    D11 = new x(yVar2);
                    mVar.u(D11);
                }
                mVar.P();
                v.f(aVar, aVar2, (C17631a) D11, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            c((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final void f(C10958a aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C17631a<C16807N> aVar4;
        int i12;
        C17631a<C16807N> aVar5;
        C10958a aVar6 = aVar;
        C17631a<C16807N> aVar7 = aVar2;
        C17631a<C16807N> aVar8 = aVar3;
        int i13 = i10;
        C4889m k10 = mVar.k(892500035);
        if ((i13 & 6) == 0) {
            i11 = (k10.V(aVar6) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.F(aVar7) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= k10.F(aVar8) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(892500035, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.BottomBarButtons (ScannerProductScreen.kt:140)");
            }
            d.a aVar9 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d k11 = D.k(aVar9, 0.0f, c2.h.B((float) 40), 1, (Object) null);
            C5437c.a aVar10 = C5437c.f24302a;
            C5437c.b g10 = aVar10.g();
            C5073d dVar = C5073d.f18068a;
            I a10 = C5080k.a(dVar.g(), g10, k10, 48);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, k11);
            C4504g.a aVar11 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar11.a();
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
            F1.c(a13, a10, aVar11.c());
            F1.c(a13, s10, aVar11.e());
            p<C4504g, Integer, C16807N> b10 = aVar11.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar11.d());
            C5862h hVar = C5862h.f28810a;
            L.b(j.b(Oo.b.f84852z2, k10, 0), (androidx.compose.ui.d) null, false, N.SecondaryInverse, M.Small, false, (Integer) null, (K0) null, (m) null, aVar2, k10, ((i11 << 24) & 1879048192) | 27648, 486);
            androidx.compose.ui.d h10 = J.h(aVar9, 0.0f, 1, (Object) null);
            I b11 = G.b(dVar.f(), aVar10.l(), k10, 0);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, h10);
            C17631a<C4504g> a15 = aVar11.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a15);
            } else {
                k10.t();
            }
            C4889m a16 = F1.a(k10);
            F1.c(a16, b11, aVar11.c());
            F1.c(a16, s11, aVar11.e());
            p<C4504g, Integer, C16807N> b12 = aVar11.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b12);
            }
            F1.c(a16, e11, aVar11.d());
            C5843N n10 = C5843N.f28726a;
            d.a aVar12 = aVar9;
            C5844O.a(C5842M.e(n10, aVar12, 1.0f, false, 2, (Object) null), k10, 0);
            h((androidx.compose.ui.d) null, k10, 0, 1);
            mVar2 = k10;
            i12 = i13;
            aVar4 = aVar8;
            aVar5 = aVar7;
            o.p(aVar, aVar3, C5842M.e(n10, aVar12, 1.0f, false, 2, (Object) null), 0, mVar2, (i11 & 14) | ((i11 >> 3) & 112), 8);
            mVar2.x();
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
            i12 = i13;
            aVar4 = aVar8;
            aVar5 = aVar7;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new s(aVar6, aVar5, aVar4, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(C10958a aVar, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        f(aVar, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void h(androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(2029125450);
        int i15 = i14 & 1;
        if (i15 != 0) {
            i12 = i13 | 6;
            dVar2 = dVar;
        } else if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i12 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i12 = i13;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            d.a aVar = i15 != 0 ? androidx.compose.ui.d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(2029125450, i12, -1, "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ScannerButton (ScannerProductScreen.kt:170)");
            }
            androidx.compose.ui.d i16 = D.i(aVar, c2.h.B((float) 24));
            int i17 = C18146a.f148610qa;
            H0 h02 = H0.PrimaryInverse;
            k10.W(-999204636);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new t();
                k10.u(D10);
            }
            k10.P();
            androidx.compose.ui.d dVar3 = aVar;
            F0.b(i17, (String) null, i16, false, h02, (G0) null, (m) null, false, (C17631a) D10, k10, 100687920, 232);
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = dVar3;
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new u(dVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N i() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        h(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void k(n nVar, C10958a aVar, Executor executor, C4409q qVar, C9427a aVar2, h hVar, y yVar, C4889m mVar, int i10) {
        int i11;
        String str;
        C10958a aVar3 = aVar;
        y yVar2 = yVar;
        int i12 = i10;
        C4889m k10 = mVar.k(84776844);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(nVar) ? 4 : 2) | i12;
        } else {
            n nVar2 = nVar;
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(aVar3) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(executor) ? 256 : 128;
        } else {
            Executor executor2 = executor;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(qVar) ? RecyclerView.n.FLAG_MOVED : 1024;
        } else {
            C4409q qVar2 = qVar;
        }
        C9427a aVar4 = aVar2;
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(aVar4) ? 16384 : 8192;
        }
        h hVar2 = hVar;
        if ((196608 & i12) == 0) {
            i11 |= k10.F(hVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((i12 & 1572864) == 0) {
            i11 |= (2097152 & i12) == 0 ? k10.V(yVar2) : k10.F(yVar2) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((599187 & i11) != 599186 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(84776844, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ScannerProductScreen (ScannerProductScreen.kt:103)");
            }
            C12832d d10 = nVar.d();
            if (d10 == null || (str = d10.getName()) == null) {
                str = "";
            }
            int i13 = i11 >> 3;
            e.d(str, executor, qVar, aVar2, hVar, new c(yVar2), c1.c.e(-738724001, true, new d(aVar3, yVar2), k10, 54), k10, (i13 & 112) | 1572864 | (i13 & 896) | (i13 & 7168) | (i13 & 57344));
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new r(nVar, aVar, executor, qVar, aVar2, hVar, yVar, i10));
        }
    }

    public static final void l(com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.f fVar, Executor executor, C10959b bVar, C4409q qVar, C9427a aVar, h hVar, y yVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.f fVar2 = fVar;
        Executor executor2 = executor;
        C10959b bVar2 = bVar;
        C4409q qVar2 = qVar;
        C9427a aVar2 = aVar;
        h hVar2 = hVar;
        y yVar2 = yVar;
        int i12 = i10;
        C17542s.j(fVar2, "viewModel");
        C17542s.j(executor2, "executor");
        C17542s.j(bVar2, "cartButtonViewModel");
        C17542s.j(qVar2, "cameraSelector");
        C17542s.j(aVar2, "barcodeScanner");
        C17542s.j(hVar2, "scannerBarcodeAnalyzer");
        C17542s.j(yVar2, "actions");
        C4889m k10 = mVar.k(1457851979);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(fVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(executor2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(bVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(qVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.F(hVar2) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i12) == 0) {
            i11 |= (i12 & UploadKt.MAX_CHUNK_SIZE) == 0 ? k10.V(yVar2) : k10.F(yVar2) ? 1048576 : ImageMetadata.LENS_APERTURE;
        }
        int i13 = i11;
        if ((599187 & i13) != 599186 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1457851979, i13, -1, "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v2.ScannerProductScreen (ScannerProductScreen.kt:54)");
            }
            int i14 = i13;
            C4889m mVar3 = k10;
            A1<n> c10 = j3.a.c(fVar.getState(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7);
            A1<C10958a> b10 = j3.a.b(bVar.C(), C10958a.b.f88001a, (C5221y) null, (r.b) null, (C17168i) null, mVar3, 48, 14);
            r lifecycle = ((C5221y) mVar3.Q(g.a())).getLifecycle();
            mVar3.W(-115215286);
            boolean F10 = mVar3.F(lifecycle) | mVar3.F(hVar2) | mVar3.F(fVar2);
            Object D10 = mVar3.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new a(lifecycle, hVar2, fVar2, (C17164e<? super a>) null);
                mVar3.u(D10);
            }
            mVar3.P();
            P.g(lifecycle, (p) D10, mVar3, 0);
            com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.c c11 = m(c10).c();
            mVar3.W(-115199610);
            int i15 = i14;
            int i16 = 3670016 & i15;
            boolean V10 = mVar3.V(c10) | (i16 == 1048576 || ((i15 & UploadKt.MAX_CHUNK_SIZE) != 0 && mVar3.F(yVar2)));
            Object D11 = mVar3.D();
            if (V10 || D11 == C4889m.f14007a.a()) {
                D11 = new b(c10, yVar2, (C17164e<? super b>) null);
                mVar3.u(D11);
            }
            mVar3.P();
            P.g(c11, (p) D11, mVar3, 0);
            mVar2 = mVar3;
            k(m(c10), n(b10), executor, qVar, aVar, hVar, yVar, mVar2, ((i15 << 3) & 896) | (i15 & 7168) | (57344 & i15) | (i15 & ImageMetadata.JPEG_GPS_COORDINATES) | i16);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new q(fVar, executor, bVar, qVar, aVar, hVar, yVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final n m(A1<n> a12) {
        return a12.getValue();
    }

    private static final C10958a n(A1<? extends C10958a> a12) {
        return (C10958a) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N o(com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.f fVar, Executor executor, C10959b bVar, C4409q qVar, C9427a aVar, h hVar, y yVar, int i10, C4889m mVar, int i11) {
        l(fVar, executor, bVar, qVar, aVar, hVar, yVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(n nVar, C10958a aVar, Executor executor, C4409q qVar, C9427a aVar2, h hVar, y yVar, int i10, C4889m mVar, int i11) {
        k(nVar, aVar, executor, qVar, aVar2, hVar, yVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
