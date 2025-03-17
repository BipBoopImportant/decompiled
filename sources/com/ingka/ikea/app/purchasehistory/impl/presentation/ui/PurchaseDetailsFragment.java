package com.ingka.ikea.app.purchasehistory.impl.presentation.ui;

import Ae.e;
import Ai.C10573g1;
import Ar.j;
import Ci.C10631c;
import Ci.C10639k;
import Ci.C10640l;
import Ci.C10641m;
import Ci.C10642n;
import Ci.C10643o;
import Ci.C10644p;
import Ci.C10645q;
import Ci.C10646r;
import Ci.C10647s;
import Cr.a;
import Di.C10657a;
import Ei.C10697r;
import HJ.C15854t;
import Hx.c;
import Ma.C9140b;
import Nd.c;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16534i;
import U0.C4889m;
import U0.C4895p;
import U0.p1;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import YH.C16877v;
import YH.X;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.purchasehistory.impl.presentation.ui.a;
import com.ingka.ikea.app.purchasehistory.impl.presentation.ui.k;
import com.ingka.ikea.app.purchasehistory.impl.presentation.ui.l;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import lg.C10024a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import vi.C12127a;
import vm.C12193d;
import wi.C12272a;
import x4.C;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J!\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001e\u0010\u000eJ\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u0019J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010\u0019J\u0017\u0010#\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b#\u0010\u0019J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010\u0019J\u0017\u0010%\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b%\u0010\u0019J\u001b\u0010&\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010'\u001a\u00020\u0005H\u0015¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010)H\u0014¢\u0006\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010D\u001a\u00020=8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010L\u001a\u00020E8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010T\u001a\u00020M8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\\\u001a\u00020U8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010d\u001a\u00020]8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010l\u001a\u00020e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010s\u001a\u00020m8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b'\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\"\u0010z\u001a\u00020t8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b+\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u001c\u0010\u0001\u001a\u00020{8BX\u0002¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010R\u001f\u0010\u0001\u001a\u00020\n8\u0016XD¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R&\u0010\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u00030\u00018\u0014XD¢\u0006\u000f\n\u0005\b\u0001\u0010>\u001a\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u00030\u00018\u0014XD¢\u0006\u000f\n\u0005\b\u0001\u0010>\u001a\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u00030\u00018\u0014XD¢\u0006\u000f\n\u0005\b\u0001\u0010>\u001a\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010>R\u0018\u0010\u0001\u001a\u00030\u00018BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/PurchaseDetailsFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LXH/N;", "v1", "t1", "r1", "q1", "", "orderNumber", "deliveryMethodId", "u1", "(Ljava/lang/String;Ljava/lang/String;)V", "orderId", "deliveryNumber", "LHx/c$d;", "action", "s1", "(Ljava/lang/String;Ljava/lang/String;LHx/c$d;)V", "LHx/c$d$f;", "w1", "(Ljava/lang/String;LHx/c$d$f;)V", "z1", "(Ljava/lang/String;)V", "", "byteArray", "y1", "(Ljava/lang/String;[B)V", "C1", "productNumber", "A1", "barcode", "D1", "o1", "x1", "B1", "a1", "D0", "(LU0/m;I)V", "Landroid/os/Bundle;", "savedInstanceState", "E0", "(Landroid/os/Bundle;)V", "LAe/e;", "X", "LAe/e;", "d1", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "LNd/c;", "Y", "LNd/c;", "c1", "()LNd/c;", "setAbTesting", "(LNd/c;)V", "abTesting", "LAr/j;", "Z", "LAr/j;", "h1", "()LAr/j;", "setFeedback", "(LAr/j;)V", "feedback", "LEo/a;", "y0", "LEo/a;", "f1", "()LEo/a;", "setChromeApi", "(LEo/a;)V", "chromeApi", "Lvm/d;", "z0", "Lvm/d;", "e1", "()Lvm/d;", "setBarcodeNavigation", "(Lvm/d;)V", "barcodeNavigation", "LZw/a;", "A0", "LZw/a;", "l1", "()LZw/a;", "setPipNavigation", "(LZw/a;)V", "pipNavigation", "Lvi/a;", "B0", "Lvi/a;", "m1", "()Lvi/a;", "setPurchaseHistoryNavigation", "(Lvi/a;)V", "purchaseHistoryNavigation", "LDi/a;", "C0", "LDi/a;", "k1", "()LDi/a;", "setOpenInvoiceUseCase", "(LDi/a;)V", "openInvoiceUseCase", "LCr/a;", "LCr/a;", "i1", "()LCr/a;", "setFileProviderService", "(LCr/a;)V", "fileProviderService", "LIl/a;", "LIl/a;", "getAppConfigApi", "()LIl/a;", "setAppConfigApi", "(LIl/a;)V", "appConfigApi", "LEi/r;", "F0", "LXH/o;", "n1", "()LEi/r;", "viewModel", "G0", "Ljava/lang/String;", "g1", "()Ljava/lang/String;", "destId", "Lkotlin/Function0;", "H0", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "", "I0", "v0", "()Z", "drawUnderStatusBar", "J0", "u0", "drawUnderNavigationBar", "K0", "t0", "drawUnderDisplayCutout", "L0", "navControllerRequiredTaskRemaining", "j1", "fromConfirmation", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PurchaseDetailsFragment extends e {

    /* renamed from: A0  reason: collision with root package name */
    public Zw.a f90834A0;

    /* renamed from: B0  reason: collision with root package name */
    public C12127a f90835B0;

    /* renamed from: C0  reason: collision with root package name */
    public C10657a f90836C0;

    /* renamed from: D0  reason: collision with root package name */
    public Cr.a f90837D0;

    /* renamed from: E0  reason: collision with root package name */
    public Il.a f90838E0;

    /* renamed from: F0  reason: collision with root package name */
    private final C16824o f90839F0;

    /* renamed from: G0  reason: collision with root package name */
    private final String f90840G0 = "purchaseHistory/order/details?orderId={orderId}&fromConfirmation={fromConfirmation}&type={type}&liteId={liteId}";

    /* renamed from: H0  reason: collision with root package name */
    private final C17631a<C16807N> f90841H0 = new C10639k(this);

    /* renamed from: I0  reason: collision with root package name */
    private final boolean f90842I0;

    /* renamed from: J0  reason: collision with root package name */
    private final boolean f90843J0;

    /* renamed from: K0  reason: collision with root package name */
    private final boolean f90844K0;

    /* renamed from: L0  reason: collision with root package name */
    private boolean f90845L0 = true;

    /* renamed from: X  reason: collision with root package name */
    public Ae.e f90846X;

    /* renamed from: Y  reason: collision with root package name */
    public Nd.c f90847Y;

    /* renamed from: Z  reason: collision with root package name */
    public j f90848Z;

    /* renamed from: y0  reason: collision with root package name */
    public Eo.a f90849y0;

    /* renamed from: z0  reason: collision with root package name */
    public C12193d f90850z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f90851a;

        static {
            int[] iArr = new int[C10631c.values().length];
            try {
                iArr[C10631c.RETURN_COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f90851a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.ui.PurchaseDetailsFragment$observeNavigationResult$$inlined$consumeResult$1", f = "PurchaseDetailsFragment.kt", l = {}, m = "invokeSuspend")
    public static final class b extends l implements p<C10631c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f90852c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f90853d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f90854e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f90855f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ PurchaseDetailsFragment f90856g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C8948l lVar, String str, C17164e eVar, PurchaseDetailsFragment purchaseDetailsFragment) {
            super(2, eVar);
            this.f90854e = lVar;
            this.f90855f = str;
            this.f90856g = purchaseDetailsFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f90854e, this.f90855f, eVar, this.f90856g);
            bVar.f90853d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(C10631c cVar, C17164e<? super C16807N> eVar) {
            return ((b) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f90852c == 0) {
                y.b(obj);
                Object obj2 = this.f90853d;
                if (obj2 != null) {
                    if (a.f90851a[((C10631c) obj2).ordinal()] == 1) {
                        this.f90856g.r1();
                        this.f90854e.h().m(this.f90855f, null);
                    } else {
                        throw new t();
                    }
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.ui.PurchaseDetailsFragment$observeNavigationResult$$inlined$consumeResult$2", f = "PurchaseDetailsFragment.kt", l = {}, m = "invokeSuspend")
    public static final class c extends l implements p<a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f90857c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f90858d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f90859e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f90860f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ PurchaseDetailsFragment f90861g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C8948l lVar, String str, C17164e eVar, PurchaseDetailsFragment purchaseDetailsFragment) {
            super(2, eVar);
            this.f90859e = lVar;
            this.f90860f = str;
            this.f90861g = purchaseDetailsFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f90859e, this.f90860f, eVar, this.f90861g);
            cVar.f90858d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(a aVar, C17164e<? super C16807N> eVar) {
            return ((c) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f90857c == 0) {
                y.b(obj);
                Object obj2 = this.f90858d;
                if (obj2 != null) {
                    if (C17542s.e((a) obj2, a.C1984a.f90927a)) {
                        this.f90861g.q1();
                        this.f90859e.h().m(this.f90860f, null);
                    } else {
                        throw new t();
                    }
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.ui.PurchaseDetailsFragment$observeNavigationResult$$inlined$consumeResult$3", f = "PurchaseDetailsFragment.kt", l = {}, m = "invokeSuspend")
    public static final class d extends l implements p<l, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f90862c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f90863d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f90864e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f90865f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ PurchaseDetailsFragment f90866g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C8948l lVar, String str, C17164e eVar, PurchaseDetailsFragment purchaseDetailsFragment) {
            super(2, eVar);
            this.f90864e = lVar;
            this.f90865f = str;
            this.f90866g = purchaseDetailsFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f90864e, this.f90865f, eVar, this.f90866g);
            dVar.f90863d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(l lVar, C17164e<? super C16807N> eVar) {
            return ((d) create(lVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f90862c == 0) {
                y.b(obj);
                Object obj2 = this.f90863d;
                if (obj2 != null) {
                    l lVar = (l) obj2;
                    if (C17542s.e(lVar, l.a.f90953a) || C17542s.e(lVar, l.b.f90955a)) {
                        j.a.j(this.f90866g.h1(), this.f90866g.getContext(), C12272a.f105839q, kotlin.coroutines.jvm.internal.b.e(C12272a.f105837p), false, 0, (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 504, (Object) null);
                    } else if (C17542s.e(lVar, l.d.f90959a)) {
                        this.f90866g.t1();
                    } else if (C17542s.e(lVar, l.c.f90957a)) {
                        j.a.j(this.f90866g.h1(), this.f90866g.getContext(), C12272a.f105843s, kotlin.coroutines.jvm.internal.b.e(C12272a.f105841r), false, 0, (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 504, (Object) null);
                    } else {
                        throw new t();
                    }
                    this.f90864e.h().m(this.f90865f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f90867c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar) {
            super(0);
            this.f90867c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f90867c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f90868c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar) {
            super(0);
            this.f90868c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f90868c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f90869c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C16824o oVar) {
            super(0);
            this.f90869c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f90869c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f90870c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f90871d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C17631a aVar, C16824o oVar) {
            super(0);
            this.f90870c = aVar;
            this.f90871d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f90870c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f90871d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f90872c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f90873d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f90872c = oVar;
            this.f90873d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f90873d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f90872c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public PurchaseDetailsFragment() {
        C16824o a10 = C16825p.a(s.NONE, new f(new e(this)));
        this.f90839F0 = W.b(this, P.b(C10697r.class), new g(a10), new h((C17631a) null, a10), new i(this, a10));
    }

    private final void A1(String str) {
        qv.e eVar = qv.e.DEBUG;
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
                String a10 = C11818a.a("Open pip for: " + str, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = PurchaseDetailsFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        C8951o f10 = rw.f.f(this, g1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            l1().a(f10, str, Interaction$Component.PURCHASE_HISTORY);
        }
    }

    private final void B1(String str) {
        C8951o f10 = rw.f.f(this, g1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            m1().b(f10, str, n1().G(), rw.c.f28698a.c().a());
        }
        e.c.b(d1(), Interaction$Component.ASSEMBLY_SERVICE, (String) null, X.f(C16796C.a("app_location", "purchase_history")), (e.b) null, 10, (Object) null);
        c.a.a(c1(), "ph_open_assembly", (Map) null, (Map) null, 6, (Object) null);
    }

    private final void C1(String str, String str2) {
        e.c.c(d1(), Ae.j.ACTION_TAP.b(), (Map) null, Interaction$Component.PURCHASE_HISTORY_RESCHEDULE_ORDER, (e.b) null, 8, (Object) null);
        C8951o f10 = rw.f.f(this, g1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            Uri.Builder appendQueryParameter = Uri.parse(ow.c.b("ikea://navigation/purchaseHistory/order/reschedule?orderId={orderId}&deliveryNumber={deliveryNumber}")).buildUpon().appendQueryParameter("orderId", str);
            C17542s.i(appendQueryParameter, "appendQueryParameter(...)");
            Uri build = rw.g.a(appendQueryParameter, "deliveryNumber", str2).build();
            C17542s.i(build, "build(...)");
            f10.X(build);
        }
    }

    private final void D1(String str) {
        qv.e eVar = qv.e.DEBUG;
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
                String a10 = C11818a.a("Show barcode", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = PurchaseDetailsFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        e.c.c(d1(), Ae.j.ACTION_TAP.b(), (Map) null, Interaction$Component.PURCHASE_HISTORY_SHOW_RETURN_BARCODE, (e.b) null, 8, (Object) null);
        C8951o f10 = rw.f.f(this, g1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            C12193d e12 = e1();
            String string = getString(C12272a.f105767K0);
            C17542s.i(string, "getString(...)");
            e12.a(f10, str, string, getString(C12272a.f105769L0), true);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N P0(PurchaseDetailsFragment purchaseDetailsFragment, String str, String str2, c.d dVar) {
        C17542s.j(str, "orderId");
        C17542s.j(dVar, "action");
        purchaseDetailsFragment.s1(str, str2, dVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Q0(PurchaseDetailsFragment purchaseDetailsFragment, String str) {
        C17542s.j(str, "it");
        purchaseDetailsFragment.f1().a(purchaseDetailsFragment.requireContext(), str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N R0(PurchaseDetailsFragment purchaseDetailsFragment, String str) {
        C17542s.j(str, "it");
        purchaseDetailsFragment.D1(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N S0(PurchaseDetailsFragment purchaseDetailsFragment) {
        b1(purchaseDetailsFragment, (String) null, 1, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N T0(PurchaseDetailsFragment purchaseDetailsFragment, String str) {
        C17542s.j(str, "it");
        purchaseDetailsFragment.a1(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U0(PurchaseDetailsFragment purchaseDetailsFragment, String str, String str2) {
        C17542s.j(str, "orderId");
        purchaseDetailsFragment.u1(str, str2);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N V0(PurchaseDetailsFragment purchaseDetailsFragment, String str) {
        C17542s.j(str, "it");
        purchaseDetailsFragment.A1(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Z0(PurchaseDetailsFragment purchaseDetailsFragment) {
        purchaseDetailsFragment.v1();
        return C16807N.f139792a;
    }

    private final void a1(String str) {
        if (j1()) {
            C8951o f10 = rw.f.f(this, g1(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                m1().h(f10, str, C.a.l(new C.a().b(C10024a.f75251c).c(C10024a.f75254f).e(C10024a.f75251c).f(C10024a.f75254f), g1(), true, false, 4, (Object) null).a());
                return;
            }
            return;
        }
        C8951o f11 = rw.f.f(this, g1(), (C17642l) null, 2, (Object) null);
        if (f11 != null) {
            f11.i0();
        }
    }

    static /* synthetic */ void b1(PurchaseDetailsFragment purchaseDetailsFragment, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        purchaseDetailsFragment.a1(str);
    }

    private final boolean j1() {
        return requireArguments().getBoolean("fromConfirmation");
    }

    private final C10697r n1() {
        return (C10697r) this.f90839F0.getValue();
    }

    private final void o1(String str) {
        new C9140b(requireContext()).J(C12272a.f105812e1).x(C12272a.f105771M0).setPositiveButton(C12272a.f105773N0, new C10647s(this, str)).setNegativeButton(C12272a.f105775O0, (DialogInterface.OnClickListener) null).u(true).p();
    }

    /* access modifiers changed from: private */
    public static final void p1(PurchaseDetailsFragment purchaseDetailsFragment, String str, DialogInterface dialogInterface, int i10) {
        C8951o f10 = rw.f.f(purchaseDetailsFragment, purchaseDetailsFragment.g1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            Uri build = Uri.parse(ow.c.b("ikea://navigation/purchaseHistory/order/cancel?cancelOrderId={cancelOrderId}")).buildUpon().appendQueryParameter("cancelOrderId", str).build();
            C17542s.i(build, "build(...)");
            f10.X(build);
        }
    }

    /* access modifiers changed from: private */
    public final void q1() {
        qv.e eVar = qv.e.DEBUG;
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
                String a10 = C11818a.a("Order cancelled result", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = PurchaseDetailsFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        j.a.r(h1(), getView(), C12272a.f105801b, Oo.b.f84616d5, -2, (View) null, (C17631a) null, 48, (Object) null);
        n1().F(false);
        rw.d.a(this, k.a.f90951a, "PurchaseDetailsFragmentRequestKey");
    }

    /* access modifiers changed from: private */
    public final void r1() {
        e.c.c(d1(), Ae.j.ACTION_VIEWED.b(), (Map) null, Interaction$Component.PURCHASE_HISTORY_SHOW_RETURN_PRODUCTS, (e.b) null, 8, (Object) null);
        j.a.r(h1(), getView(), C12272a.f105777P0, Oo.b.f84616d5, -2, (View) null, (C17631a) null, 48, (Object) null);
    }

    private final void s1(String str, String str2, c.d dVar) {
        qv.e eVar = qv.e.DEBUG;
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
                String a10 = C11818a.a("Manage order, action clicked: " + dVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str3 = C11820c.a(a10);
            }
            String str5 = str3;
            if (str4 == null) {
                String name = PurchaseDetailsFragment.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str6 = str4;
            bVar.a(eVar, str6, false, (Throwable) null, str5);
            str3 = str5;
            str4 = str6;
        }
        if (dVar instanceof c.d.a) {
            B1(str);
        } else if (dVar instanceof c.d.b) {
            o1(str);
        } else if (dVar instanceof c.d.C2665c) {
            x1(str);
        } else if (dVar instanceof c.d.e) {
            C1(str, str2);
        } else if (dVar instanceof c.d.f) {
            w1(str, (c.d.f) dVar);
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public final void t1() {
        j.a.r(h1(), getView(), C12272a.f105845t, 0, 0, (View) null, (C17631a) null, 60, (Object) null);
        n1().F(false);
        rw.d.a(this, k.a.f90951a, "PurchaseDetailsFragmentRequestKey");
    }

    private final void u1(String str, String str2) {
        C8951o f10 = rw.f.f(this, g1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            Uri.Builder appendQueryParameter = Uri.parse(ow.c.b("ikea://navigation/purchaseHistory/order/list?orderId={orderId}&deliveryMethodId={deliveryMethodId}")).buildUpon().appendQueryParameter("orderId", str);
            C17542s.i(appendQueryParameter, "appendQueryParameter(...)");
            Uri build = rw.g.a(appendQueryParameter, "deliveryMethodId", str2).build();
            C17542s.i(build, "build(...)");
            f10.X(build);
        }
    }

    private final void v1() {
        if (rw.a.b(this) && this.f90845L0) {
            this.f90845L0 = false;
            C8948l E10 = androidx.navigation.fragment.a.a(this).E(g1());
            C16519P i10 = E10.h().i("ExpressReturnsResult", null);
            r lifecycle = E10.getLifecycle();
            r.b bVar = r.b.RESUMED;
            C16532g R10 = C16534i.R(C5208k.a(i10, lifecycle, bVar), new b(E10, "ExpressReturnsResult", (C17164e) null, this));
            C5221y viewLifecycleOwner = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C16534i.M(R10, C5222z.a(viewLifecycleOwner));
            C8948l E11 = androidx.navigation.fragment.a.a(this).E(g1());
            C16532g R11 = C16534i.R(C5208k.a(E11.h().i("CancelOrderReasonDialogRequestKey", null), E11.getLifecycle(), bVar), new c(E11, "CancelOrderReasonDialogRequestKey", (C17164e) null, this));
            C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            C16534i.M(R11, C5222z.a(viewLifecycleOwner2));
            C8948l E12 = androidx.navigation.fragment.a.a(this).E(g1());
            C16532g R12 = C16534i.R(C5208k.a(E12.h().i("RescheduleOrderDialogRequestKey", null), E12.getLifecycle(), bVar), new d(E12, "RescheduleOrderDialogRequestKey", (C17164e) null, this));
            C5221y viewLifecycleOwner3 = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
            C16534i.M(R12, C5222z.a(viewLifecycleOwner3));
        }
    }

    private final void w1(String str, c.d.f fVar) {
        if (fVar.b().isEmpty()) {
            IllegalStateException illegalStateException = new IllegalStateException("Showing Invoice without invoices");
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
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str2 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = PurchaseDetailsFragment.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalStateException, str4);
                str2 = str4;
                str3 = str5;
            }
        } else if (fVar.b().size() == 1) {
            byte[] a11 = ((c.d.C2666d) C16877v.w0(fVar.b())).a();
            if (a11 != null) {
                y1(str, a11);
            } else {
                j.a.r(h1(), getView(), Oo.b.f84843y3, 0, 0, (View) null, (C17631a) null, 60, (Object) null);
            }
        } else {
            z1(str);
        }
    }

    private final void x1(String str) {
        e.c.c(d1(), Ae.j.ACTION_TAP.b(), (Map) null, Interaction$Component.PURCHASE_HISTORY_SHOW_RETURN_PRODUCTS, (e.b) null, 8, (Object) null);
        C8951o f10 = rw.f.f(this, g1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            m1().g(f10, str, n1().G(), rw.c.f28698a.c().a());
        }
    }

    private final void y1(String str, byte[] bArr) {
        Context context = getContext();
        if (context != null) {
            C10657a k12 = k1();
            k12.a(context, str + ".pdf", bArr, getView());
        }
    }

    private final void z1(String str) {
        C8951o f10 = rw.f.f(this, g1(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            m1().e(f10, str);
        }
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-1410194412);
        if (C4895p.J()) {
            C4895p.S(-1410194412, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.ui.PurchaseDetailsFragment.FragmentContent (PurchaseDetailsFragment.kt:102)");
        }
        C10697r.b value = p1.b(n1().m(), (C17168i) null, mVar, 0, 1).getValue();
        mVar.W(-1540367431);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new C10640l(this);
            mVar.u(D10);
        }
        C17631a aVar = (C17631a) D10;
        mVar.P();
        mVar.W(-1540364955);
        boolean F11 = mVar.F(this);
        Object D11 = mVar.D();
        if (F11 || D11 == C4889m.f14007a.a()) {
            D11 = new C10641m(this);
            mVar.u(D11);
        }
        C17642l lVar = (C17642l) D11;
        mVar.P();
        mVar.W(-1540361829);
        boolean F12 = mVar.F(this);
        Object D12 = mVar.D();
        if (F12 || D12 == C4889m.f14007a.a()) {
            D12 = new C10642n(this);
            mVar.u(D12);
        }
        p pVar = (p) D12;
        mVar.P();
        mVar.W(-1540339864);
        boolean F13 = mVar.F(this);
        Object D13 = mVar.D();
        if (F13 || D13 == C4889m.f14007a.a()) {
            D13 = new C10643o(this);
            mVar.u(D13);
        }
        C17642l lVar2 = (C17642l) D13;
        mVar.P();
        mVar.W(-1540354180);
        boolean F14 = mVar.F(this);
        Object D14 = mVar.D();
        if (F14 || D14 == C4889m.f14007a.a()) {
            D14 = new C10644p(this);
            mVar.u(D14);
        }
        q qVar = (q) D14;
        mVar.P();
        mVar.W(-1540345409);
        boolean F15 = mVar.F(this);
        Object D15 = mVar.D();
        if (F15 || D15 == C4889m.f14007a.a()) {
            D15 = new C10645q(this);
            mVar.u(D15);
        }
        C17642l lVar3 = (C17642l) D15;
        mVar.P();
        mVar.W(-1540337018);
        boolean F16 = mVar.F(this);
        Object D16 = mVar.D();
        if (F16 || D16 == C4889m.f14007a.a()) {
            D16 = new C10646r(this);
            mVar.u(D16);
        }
        mVar.P();
        C10573g1.K(value, aVar, lVar, pVar, lVar2, qVar, lVar3, (C17642l) D16, mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public void E0(Bundle bundle) {
        v1();
        Cr.a i12 = i1();
        a.c cVar = a.c.INVOICE;
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        i12.b(cVar, requireContext);
    }

    public final Nd.c c1() {
        Nd.c cVar = this.f90847Y;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("abTesting");
        return null;
    }

    public final Ae.e d1() {
        Ae.e eVar = this.f90846X;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public final C12193d e1() {
        C12193d dVar = this.f90850z0;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("barcodeNavigation");
        return null;
    }

    public final Eo.a f1() {
        Eo.a aVar = this.f90849y0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("chromeApi");
        return null;
    }

    public String g1() {
        return this.f90840G0;
    }

    public final j h1() {
        j jVar = this.f90848Z;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final Cr.a i1() {
        Cr.a aVar = this.f90837D0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("fileProviderService");
        return null;
    }

    public final C10657a k1() {
        C10657a aVar = this.f90836C0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("openInvoiceUseCase");
        return null;
    }

    public final Zw.a l1() {
        Zw.a aVar = this.f90834A0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("pipNavigation");
        return null;
    }

    public final C12127a m1() {
        C12127a aVar = this.f90835B0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("purchaseHistoryNavigation");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f90844K0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f90843J0;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f90842I0;
    }
}
