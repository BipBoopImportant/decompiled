package com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1;

import EB.C12832d;
import FB.C12860a;
import HJ.C15854t;
import Hj.C10720a;
import Hj.n;
import Hj.o;
import Hl.a;
import Iz.C13049o;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import Sy.a;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import Tj.E;
import XH.C16807N;
import XH.t;
import XH.x;
import XH.y;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.c;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.d;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.e;
import com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.g;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import gj.j;
import gj.k;
import hp.C11376b;
import hp.C11377c;
import java.util.ArrayList;
import jj.C11421d;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rz.C15009b;
import rz.O;
import sj.C11854e;
import sp.C11879a;

@Metadata(d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003BI\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J#\u0010'\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0019\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J'\u00107\u001a\u00020\u001a2\u0006\u00103\u001a\u00020%2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u001a2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020=H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020@H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020CH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u001aH\u0002¢\u0006\u0004\bJ\u0010KJ!\u0010N\u001a\u00020\u001a2\u0010\b\u0002\u0010M\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010LH\u0002¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020P2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u001aH\u0002¢\u0006\u0004\bS\u0010KJ\u0017\u0010V\u001a\u00020\u001a2\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u001aH\u0002¢\u0006\u0004\bX\u0010KJ\u0017\u0010Z\u001a\u00020\u001a2\u0006\u0010Y\u001a\u00020PH\u0002¢\u0006\u0004\bZ\u0010[J!\u0010_\u001a\u00020\u001a2\b\b\u0002\u0010\\\u001a\u00020P2\u0006\u0010^\u001a\u00020]H\u0002¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u001aH\u0002¢\u0006\u0004\ba\u0010KJ\u0017\u0010d\u001a\u00020\u001a2\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020\u001aH\u0002¢\u0006\u0004\bf\u0010KJ\u0017\u0010i\u001a\u00020\u001a2\u0006\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020\u001a2\u0006\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bk\u0010jJ\u0017\u0010l\u001a\u00020\u001a2\u0006\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bl\u0010jJ\u0017\u0010m\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\bm\u0010nR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u001d\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0}8\u0002X\u0004¢\u0006\u0006\n\u0004\b~\u0010R%\u0010\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010F0\u00018\u0006¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001c\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050}8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010R&\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/f;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/h;", "Lsp/a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d;", "LHj/n;", "LHl/a;", "wifiConnector", "LTj/E;", "scanProductUseCase", "LSy/a;", "scanAndGoAnalytics", "Lsj/e;", "vibrationFeedback", "Ljj/d;", "scanFailureCounter", "LOz/b;", "scanAndGoCleanUpUseCase", "Lgj/k;", "scannerProductResultMapper", "LFB/a;", "localStoreSelectionRepository", "<init>", "(LHl/a;LTj/E;LSy/a;Lsj/e;Ljj/d;LOz/b;Lgj/k;LFB/a;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d$c;", "action", "LXH/N;", "e0", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d$c;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d$g;", "a0", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d$g;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d$l;", "f0", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d$l;)V", "Lgj/j;", "scannerProductResult", "", "collectBarcode", "L", "(Lgj/j;Ljava/lang/String;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d$e;", "Z", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d$e;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d$j;", "", "d0", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d$j;)Ljava/lang/Object;", "LQJ/F0;", "S", "()LQJ/F0;", "barcode", "", "packageCount", "mustHavesCount", "P", "(Ljava/lang/String;II)V", "LIz/o$a$e;", "result", "Q", "(LIz/o$a$e;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d$m;", "O", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d$m;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d$k;", "K", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d$k;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d$d;", "N", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d$d;)V", "", "throwable", "g0", "(Ljava/lang/Throwable;)V", "I", "()V", "Lkotlin/Function0;", "execute", "W", "(LnI/a;)V", "", "H", "(Lgj/j;)Z", "V", "Lhp/c;", "exception", "c0", "(Lhp/c;)V", "X", "value", "Y", "(Z)V", "isKeepScannerRunning", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/e;", "userMessage", "i0", "(ZLcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/e;)V", "k0", "Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;", "navigateTo", "T", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/c;)V", "b0", "Landroidx/lifecycle/y;", "owner", "c", "(Landroidx/lifecycle/y;)V", "onResume", "onPause", "U", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/d;)V", "m", "LHl/a;", "n", "LTj/E;", "o", "LSy/a;", "p", "Lsj/e;", "q", "Ljj/d;", "r", "LOz/b;", "s", "Lgj/k;", "LTJ/B;", "t", "LTJ/B;", "_scannerError", "LTJ/P;", "u", "LTJ/P;", "J", "()LTJ/P;", "scannerError", "v", "_state", "w", "getState", "state", "LQJ/N;", "x", "LQJ/N;", "scannerExceptionHandler", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends f0 implements C5205h, C11879a<d, n> {

    /* renamed from: m  reason: collision with root package name */
    private final Hl.a f92190m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final E f92191n;

    /* renamed from: o  reason: collision with root package name */
    private final Sy.a f92192o;

    /* renamed from: p  reason: collision with root package name */
    private final C11854e f92193p;

    /* renamed from: q  reason: collision with root package name */
    private final C11421d f92194q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final Oz.b f92195r;

    /* renamed from: s  reason: collision with root package name */
    private final k f92196s;

    /* renamed from: t  reason: collision with root package name */
    private final C16505B<Throwable> f92197t;

    /* renamed from: u  reason: collision with root package name */
    private final C16519P<Throwable> f92198u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C16505B<n> f92199v;

    /* renamed from: w  reason: collision with root package name */
    private final C16519P<n> f92200w;

    /* renamed from: x  reason: collision with root package name */
    private final N f92201x = new e(N.f137593c0, this);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f92202a;

        static {
            int[] iArr = new int[a.C1585a.values().length];
            try {
                iArr[a.C1585a.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f92202a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerViewModel$handleBarcodeScanned$1", f = "ProductScannerViewModel.kt", l = {207}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92203c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f92204d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f92205e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, j jVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f92204d = fVar;
            this.f92205e = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f92204d, this.f92205e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            e eVar;
            Object f10 = C17187b.f();
            int i10 = this.f92203c;
            if (i10 == 0) {
                y.b(obj);
                E k10 = this.f92204d.f92191n;
                j jVar = this.f92205e;
                this.f92203c = 1;
                obj2 = k10.a(jVar, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f fVar = this.f92204d;
            Throwable e10 = x.e(obj2);
            if (e10 == null) {
                E.b bVar = (E.b) obj2;
                if (bVar instanceof E.b.d) {
                    j a10 = ((E.b.d) bVar).a();
                    C17542s.h(a10, "null cannot be cast to non-null type com.ingka.ikea.app.scanandgoonlineredesign.component.ScannerProductResult.Upptacka");
                    fVar.T(new c.k((j.e) a10));
                } else if (bVar instanceof E.b.a) {
                    fVar.T(new c.g(((E.b.a) bVar).a()));
                } else {
                    throw new t();
                }
            } else {
                if (e10 instanceof E.a) {
                    E.a aVar = (E.a) e10;
                    if (C17542s.e(aVar, E.a.b.f87378a)) {
                        eVar = e.c.d.f92186a;
                    } else if (C17542s.e(aVar, E.a.C1813a.f87377a)) {
                        eVar = e.a.f.f92171a;
                    } else if (C17542s.e(aVar, E.a.c.f87379a)) {
                        eVar = e.a.g.f92176a;
                    } else if (C17542s.e(aVar, E.a.d.f87380a)) {
                        eVar = e.a.i.f92180a;
                    } else {
                        throw new t();
                    }
                } else {
                    eVar = e.a.d.f92169a;
                }
                f.j0(fVar, false, eVar, 1, (Object) null);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerViewModel$handleStoreClosed$1", f = "ProductScannerViewModel.kt", l = {272}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f92206c;

        /* renamed from: d  reason: collision with root package name */
        int f92207d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f92208e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f92208e = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f92208e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f92207d;
            if (i10 == 0) {
                y.b(obj);
                Oz.b j10 = this.f92208e.f92195r;
                C12832d d10 = ((n) this.f92208e.f92199v.getValue()).d();
                String e10 = d10 != null ? d10.e() : null;
                this.f92206c = d10;
                this.f92207d = 1;
                if (j10.a(e10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C12832d dVar = (C12832d) this.f92206c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.j0(this.f92208e, false, e.b.a.f92183a, 1, (Object) null);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerViewModel$scannerExceptionHandler$1$1", f = "ProductScannerViewModel.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92209c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f92210d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Throwable f92211e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f92212f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Throwable th2, f fVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f92211e = th2;
            this.f92212f = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f92211e, this.f92212f, eVar);
            dVar.f92210d = obj;
            return dVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z10;
            Q q10;
            char c10;
            char c11;
            C17187b.f();
            if (this.f92209c == 0) {
                y.b(obj);
                Q q11 = (Q) this.f92210d;
                Throwable th2 = this.f92211e;
                char c12 = '$';
                String str = null;
                if ((th2 instanceof C11376b) || (th2 instanceof IllegalStateException)) {
                    qv.e eVar = qv.e.ERROR;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str2 = null;
                    String str3 = null;
                    for (C11819b bVar : arrayList) {
                        if (str2 == null) {
                            String a10 = C11818a.a(str, th2);
                            if (a10 == null) {
                                break;
                            }
                            str2 = C11820c.a(a10);
                        }
                        String str4 = str2;
                        if (str3 == null) {
                            String name = q11.getClass().getName();
                            C17542s.g(name);
                            c10 = 2;
                            c11 = '$';
                            q10 = q11;
                            String o12 = C15854t.o1(C15854t.s1(name, '$', str, 2, str), '.', str, 2, str);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        } else {
                            q10 = q11;
                            c10 = 2;
                            c11 = '$';
                        }
                        String str5 = str3;
                        char c13 = c10;
                        char c14 = c11;
                        bVar.a(eVar, str5, false, th2, str4);
                        str3 = str5;
                        str2 = str4;
                        q11 = q10;
                        str = str;
                    }
                    z10 = true;
                } else {
                    if (th2 instanceof C15009b) {
                        C15009b bVar2 = (C15009b) th2;
                        if (bVar2 instanceof C15009b.a.C3237a) {
                            f.j0(this.f92212f, false, e.c.b.f92184a, 1, (Object) null);
                        } else if (bVar2 instanceof C15009b.c.a) {
                            F0 unused = this.f92212f.S();
                        } else {
                            IllegalStateException illegalStateException = new IllegalStateException(((C15009b) this.f92211e).getMessage());
                            qv.e eVar2 = qv.e.ERROR;
                            ArrayList<C11819b> arrayList2 = new ArrayList<>();
                            for (Object next2 : qv.d.f102012a.a()) {
                                if (((C11819b) next2).b(eVar2, false)) {
                                    arrayList2.add(next2);
                                }
                            }
                            String str6 = null;
                            String str7 = null;
                            for (C11819b bVar3 : arrayList2) {
                                if (str6 == null) {
                                    String a11 = C11818a.a((String) null, illegalStateException);
                                    if (a11 == null) {
                                        break;
                                    }
                                    str6 = C11820c.a(a11);
                                }
                                if (str7 == null) {
                                    String name2 = q11.getClass().getName();
                                    C17542s.g(name2);
                                    String o13 = C15854t.o1(C15854t.s1(name2, c12, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                    if (o13.length() != 0) {
                                        name2 = C15854t.P0(o13, "Kt");
                                    }
                                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                                }
                                bVar3.a(eVar2, str7, false, illegalStateException, str6);
                                c12 = '$';
                            }
                            f.j0(this.f92212f, false, e.c.C2040c.f92185a, 1, (Object) null);
                        }
                    } else if (th2 instanceof C11377c) {
                        this.f92212f.c0((C11377c) th2);
                    }
                    z10 = false;
                }
                this.f92212f.Y(z10);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/scanner/v1/f$e", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f92213a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(N.a aVar, f fVar) {
            super(aVar);
            this.f92213a = fVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            F0 unused = C16314k.d(g0.a(this.f92213a), (C17168i) null, (T) null, new d(th2, this.f92213a, (C17164e<? super d>) null), 3, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LHj/n;", "uiState", "LEB/d;", "selectedStore", "<anonymous>", "(LHj/n;LEB/d;)LHj/n;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.ProductScannerViewModel$state$1", f = "ProductScannerViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.scanner.v1.f$f  reason: collision with other inner class name */
    static final class C2042f extends l implements q<n, C12832d, C17164e<? super n>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92214c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f92215d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f92216e;

        C2042f(C17164e<? super C2042f> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(n nVar, C12832d dVar, C17164e<? super n> eVar) {
            C2042f fVar = new C2042f(eVar);
            fVar.f92215d = nVar;
            fVar.f92216e = dVar;
            return fVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f92214c == 0) {
                y.b(obj);
                n nVar = (n) this.f92215d;
                return n.b(nVar, nVar.f(), (C12832d) this.f92216e, (c) null, (e) null, 12, (Object) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public f(Hl.a aVar, E e10, Sy.a aVar2, C11854e eVar, C11421d dVar, Oz.b bVar, k kVar, C12860a aVar3) {
        C17542s.j(aVar, "wifiConnector");
        C17542s.j(e10, "scanProductUseCase");
        C17542s.j(aVar2, "scanAndGoAnalytics");
        C17542s.j(eVar, "vibrationFeedback");
        C17542s.j(dVar, "scanFailureCounter");
        C17542s.j(bVar, "scanAndGoCleanUpUseCase");
        C17542s.j(kVar, "scannerProductResultMapper");
        C17542s.j(aVar3, "localStoreSelectionRepository");
        this.f92190m = aVar;
        this.f92191n = e10;
        this.f92192o = aVar2;
        this.f92193p = eVar;
        this.f92194q = dVar;
        this.f92195r = bVar;
        this.f92196s = kVar;
        C16505B<Throwable> a10 = C16521S.a(null);
        this.f92197t = a10;
        this.f92198u = a10;
        C16505B<n> a11 = C16521S.a(new n(false, (C12832d) null, (c) null, (e) null, 15, (DefaultConstructorMarker) null));
        this.f92199v = a11;
        this.f92200w = C16534i.c0(C16534i.n(a11, aVar3.b(), new C2042f((C17164e<? super C2042f>) null)), g0.a(this), ip.f.a(), new n(false, (C12832d) null, (c) null, (e) null, 15, (DefaultConstructorMarker) null));
    }

    private final boolean H(j jVar) {
        if ((jVar instanceof j.b) || (jVar instanceof j.a)) {
            return true;
        }
        if ((jVar instanceof j.d) || (jVar instanceof j.e) || (jVar instanceof j.c)) {
            IllegalStateException illegalStateException = new IllegalStateException("Should not happen in the regular scanner");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        return false;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = f.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalStateException, str3);
                str = str3;
                str2 = str4;
            }
            return false;
        }
        throw new t();
    }

    private final void I() {
        Throwable value;
        C16505B<Throwable> b10 = this.f92197t;
        do {
            value = b10.getValue();
            Throwable th2 = value;
        } while (!b10.e(value, null));
    }

    private final void K(d.k kVar) {
        Y(kVar.a());
    }

    private final void L(j jVar, String str) {
        if (str == null || !H(jVar) || C17542s.e(jVar.h(), str)) {
            F0 unused = C16314k.d(g0.a(this), this.f92201x, (T) null, new b(this, jVar, (C17164e<? super b>) null), 2, (Object) null);
        } else {
            j0(this, false, e.a.h.f92179a, 1, (Object) null);
        }
    }

    static /* synthetic */ void M(f fVar, j jVar, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        fVar.L(jVar, str);
    }

    private final void N(d.C2037d dVar) {
        if (C17542s.e(dVar, d.C2037d.a.f92153a)) {
            U(new d.e(Interaction$Component.SHOP_AND_GO_MANUAL_ENTRY_PROMPT));
            I();
        } else if (C17542s.e(dVar, d.C2037d.b.f92154a)) {
            this.f92192o.p();
        } else {
            throw new t();
        }
    }

    private final void O(d.m mVar) {
        Throwable value;
        Throwable a10 = mVar.a();
        if (a10 instanceof g.a) {
            T(new c.h(((g.a) mVar.a()).a()));
        } else if (a10 instanceof g.b) {
            T(new c.i(((g.b) mVar.a()).a()));
        } else {
            C16505B<Throwable> b10 = this.f92197t;
            do {
                value = b10.getValue();
                Throwable th2 = value;
            } while (!b10.e(value, mVar.a()));
        }
    }

    private final void P(String str, int i10, int i11) {
        if (i11 > 0 || i10 > 1) {
            j0(this, false, new e.a.b(str), 1, (Object) null);
        }
    }

    private final void Q(C13049o.a.e eVar) {
        W(new Hj.p(this, eVar, eVar));
    }

    /* access modifiers changed from: private */
    public static final C16807N R(f fVar, C13049o.a.e eVar, C13049o.a.e eVar2) {
        j0(fVar, false, eVar.b() ? new e.a.C2039e(eVar2.a()) : e.a.d.f92169a, 1, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final F0 S() {
        return C16314k.d(g0.a(this), (C17168i) null, (T) null, new c(this, (C17164e<? super c>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void T(c cVar) {
        n value;
        C16505B<n> b10 = this.f92199v;
        do {
            value = b10.getValue();
        } while (!b10.e(value, n.b(value, false, (C12832d) null, cVar, (e) null, 10, (Object) null)));
    }

    private final void V() {
        this.f92192o.k();
        T(c.b.f92138a);
    }

    private final void W(C17631a<C16807N> aVar) {
        if (this.f92194q.c()) {
            i0(false, e.a.C2038a.f92167a);
            this.f92194q.a();
            I();
            return;
        }
        if (aVar != null) {
            aVar.invoke();
        }
        this.f92194q.b();
    }

    private final void X() {
        T(c.d.f92140a);
    }

    /* access modifiers changed from: private */
    public final void Y(boolean z10) {
        n value;
        C16505B<n> b10 = this.f92199v;
        do {
            value = b10.getValue();
        } while (!b10.e(value, n.b(value, z10, (C12832d) null, (c) null, (e) null, 14, (Object) null)));
    }

    private final void Z(d.e eVar) {
        this.f92192o.e(eVar.a());
        T(c.e.f92141a);
    }

    private final void a0(d.g gVar) {
        this.f92193p.a(C11854e.a.f102378a.b());
        M(this, new j.b(gVar.a(), (String) null, (O) null, 6, (DefaultConstructorMarker) null), (String) null, 2, (Object) null);
    }

    private final void b0() {
        n value;
        C16505B<n> b10 = this.f92199v;
        do {
            value = b10.getValue();
        } while (!b10.e(value, n.b(value, true, (C12832d) null, (c) null, (e) null, 10, (Object) null)));
    }

    /* access modifiers changed from: private */
    public final void c0(C11377c cVar) {
        if (cVar.a() != C11377c.a.CANCELLED) {
            T(a.f92202a[this.f92190m.a().ordinal()] == 1 ? c.j.f92147a : c.C2036c.f92139a);
        }
    }

    private final Object d0(d.j jVar) {
        C13049o.a a10 = jVar.a();
        if (a10 instanceof C13049o.a.f) {
            return S();
        }
        if (a10 instanceof C13049o.a.b) {
            Y(true);
            return C16807N.f139792a;
        } else if (a10 instanceof C13049o.a.e) {
            Q((C13049o.a.e) jVar.a());
            return C16807N.f139792a;
        } else if (a10 instanceof C13049o.a.C2686a) {
            P(((C13049o.a.C2686a) jVar.a()).a(), ((C13049o.a.C2686a) jVar.a()).c(), ((C13049o.a.C2686a) jVar.a()).b());
            return C16807N.f139792a;
        } else if (a10 instanceof C13049o.a.c) {
            T(new c.f(((C13049o.a.c) jVar.a()).a(), ((C13049o.a.c) jVar.a()).b()));
            return C16807N.f139792a;
        } else {
            throw new t();
        }
    }

    private final void e0(d.c cVar) {
        this.f92193p.a(C11854e.a.f102378a.b());
        L(cVar.b(), cVar.a());
    }

    private final void f0(d.l lVar) {
        Throwable value;
        k.a a10 = this.f92196s.a(lVar.a(), lVar.b());
        if (a10 instanceof k.a.C2185a) {
            C16505B<Throwable> b10 = this.f92197t;
            do {
                value = b10.getValue();
                Throwable th2 = value;
            } while (!b10.e(value, new C10720a(lVar.b(), ((k.a.C2185a) a10).a())));
            this.f92192o.s(lVar.b(), (String) null, Interaction$Component.SHOP_AND_GO_SCANNER, a.d.CLIENT);
        } else if (a10 instanceof k.a.c) {
            this.f92193p.a(C11854e.a.f102378a.b());
            M(this, ((k.a.c) a10).a(), (String) null, 2, (Object) null);
        } else if (!C17542s.e(a10, k.a.b.f97613a)) {
            throw new t();
        }
    }

    private final void g0(Throwable th2) {
        W(new o(this, th2));
    }

    /* access modifiers changed from: private */
    public static final C16807N h0(f fVar, Throwable th2) {
        fVar.f92193p.a(C11854e.a.f102378a.b());
        fVar.i0(true, th2 instanceof C10720a ? e.c.C2041e.f92189a : e.c.C2040c.f92185a);
        return C16807N.f139792a;
    }

    private final void i0(boolean z10, e eVar) {
        n value;
        C16505B<n> b10 = this.f92199v;
        do {
            value = b10.getValue();
        } while (!b10.e(value, n.b(value, z10, (C12832d) null, (c) null, eVar, 6, (Object) null)));
    }

    static /* synthetic */ void j0(f fVar, boolean z10, e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        fVar.i0(z10, eVar);
    }

    private final void k0() {
        n value;
        C16505B<n> b10 = this.f92199v;
        do {
            value = b10.getValue();
        } while (!b10.e(value, n.b(value, true, (C12832d) null, (c) null, (e) null, 6, (Object) null)));
    }

    public final C16519P<Throwable> J() {
        return this.f92198u;
    }

    public void U(d dVar) {
        C17542s.j(dVar, "action");
        if (dVar instanceof d.m) {
            O((d.m) dVar);
        } else if (dVar instanceof d.n) {
            g0(((d.n) dVar).a());
        } else if (dVar instanceof d.C2037d) {
            N((d.C2037d) dVar);
        } else if (dVar instanceof d.e) {
            Z((d.e) dVar);
        } else if (dVar instanceof d.k) {
            K((d.k) dVar);
        } else if (dVar instanceof d.c) {
            e0((d.c) dVar);
        } else if (dVar instanceof d.g) {
            a0((d.g) dVar);
        } else if (dVar instanceof d.l) {
            f0((d.l) dVar);
        } else if (dVar instanceof d.j) {
            d0((d.j) dVar);
        } else if (C17542s.e(dVar, d.h.f92158a)) {
            I();
        } else if (C17542s.e(dVar, d.i.f92159a)) {
            b0();
        } else if (C17542s.e(dVar, d.f.f92156a)) {
            X();
        } else if (C17542s.e(dVar, d.a.f92149a)) {
            V();
        } else if (C17542s.e(dVar, d.o.f92166a)) {
            k0();
        } else if (C17542s.e(dVar, d.b.f92150a)) {
            T(c.a.f92137a);
        } else {
            throw new t();
        }
    }

    public void c(C5221y yVar) {
        C17542s.j(yVar, "owner");
        super.c(yVar);
        Y(true);
    }

    public C16519P<n> getState() {
        return this.f92200w;
    }

    public void onPause(C5221y yVar) {
        C17542s.j(yVar, "owner");
        Y(false);
        super.onPause(yVar);
    }

    public void onResume(C5221y yVar) {
        C17542s.j(yVar, "owner");
        super.onResume(yVar);
        Y(true);
    }
}
