package com.ingka.ikea.discover.impl.ui;

import E1.I;
import Es.a;
import G1.C4504g;
import N1.P;
import O0.H0;
import O0.L0;
import O0.e1;
import O0.g1;
import Op.c1;
import QJ.Q;
import Qr.b;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.F0;
import SC.G0;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import SC.Y2;
import TC.C13679b;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import Yp.C11011a;
import Yp.C11013c;
import Yp.C11014d;
import Yp.C11015e;
import Yp.C11016f;
import Yp.C11017g;
import Yp.C11018h;
import Yp.C11019i;
import Yp.C11020j;
import Yp.C11021k;
import Yp.C11022l;
import Yp.C11024n;
import Yp.C11025o;
import Yp.C11026p;
import Yp.C11030u;
import Yp.C11031v;
import Yp.C11032w;
import Yp.C11033x;
import Yp.E;
import Yp.F;
import Yp.S;
import Yp.b0;
import Zp.a;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import aq.C11079a;
import com.google.ar.core.ImageMetadata;
import com.ingka.ikea.discover.impl.ui.i;
import dI.C17164e;
import eI.C17187b;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kp.C11519a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import ol.u;
import ol.v;
import p0.s;
import qe.C10189b;
import r0.m;
import s0.C5834E;
import s0.C5842M;
import s0.C5848T;
import s0.C5862h;
import t0.C5934A;
import t0.C5937b;
import t0.C5938c;
import t0.x;
import uK.C18146a;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u001aG\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001am\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001ag\u0010\u0019\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001aa\u0010\u001e\u001a\u00020\u0006*\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010 \u001a\u00020\u0006*\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!\u001a?\u0010(\u001a\u00020\u0006*\u00020\u001b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0002¢\u0006\u0004\b(\u0010)\u001a+\u0010/\u001a\u00020\u0006*\u00020\u001b2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,H\u0000¢\u0006\u0004\b/\u00100\u001a1\u00103\u001a\u00020\u0006*\u00020\u001b2\u0006\u0010+\u001a\u00020*2\u0006\u00101\u001a\u00020,2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0000¢\u0006\u0004\b3\u00104\u001a7\u00109\u001a\u00020\u0006*\u00020\u001b2\u0006\u0010+\u001a\u00020*2\u0006\u00106\u001a\u0002052\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b9\u0010:\u001a;\u0010;\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0003¢\u0006\u0004\b;\u0010<\u001a%\u0010=\u001a\u00020\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b=\u0010>\u001a%\u0010?\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0003¢\u0006\u0004\b?\u0010@\u001a\u0013\u0010A\u001a\u00020\u0006*\u00020\u001bH\u0002¢\u0006\u0004\bA\u0010!\u001a#\u0010B\u001a\u00020\u0006*\u00020\u001b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0002¢\u0006\u0004\bB\u0010C\"\u0014\u0010F\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G²\u0006\f\u0010\r\u001a\u00020\f8\nX\u0002²\u0006\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\nX\u0002"}, d2 = {"LZp/a;", "viewModel", "LYp/F;", "injectedComposables", "Lkotlin/Function1;", "Lcom/ingka/ikea/discover/impl/ui/i;", "LXH/N;", "onScreenUiEvent", "LOp/c1;", "onProductItemEvent", "I", "(LZp/a;LYp/F;LnI/l;LnI/l;LU0/m;I)V", "LZp/a$b;", "uiState", "LZp/e;", "uiEvent", "Lkotlin/Function0;", "onUiEventConsumed", "onErrorTryAgainClicked", "E", "(LZp/a$b;LZp/e;LYp/F;LnI/a;LnI/a;LnI/l;LnI/l;LU0/m;I)V", "Lt0/A;", "lazyListState", "Landroidx/compose/ui/d;", "modifier", "z", "(LZp/a$b;LYp/F;LnI/l;LnI/l;LnI/a;Lt0/A;Landroidx/compose/ui/d;LU0/m;II)V", "Lt0/x;", "", "isScreenReaderOn", "c0", "(Lt0/x;LZp/a$b;LnI/a;LnI/l;LnI/l;ZLYp/F;)V", "Y", "(Lt0/x;)V", "LEs/a;", "inboxState", "Lqe/b;", "alertMessageState", "onInboxClicked", "onAlertMessageClicked", "m0", "(Lt0/x;LEs/a;Lqe/b;LnI/a;LnI/a;)V", "", "index", "", "eyebrow", "title", "b0", "(Lt0/x;ILjava/lang/String;Ljava/lang/String;)V", "label", "onClick", "X", "(Lt0/x;ILjava/lang/String;LnI/a;)V", "Laq/a$a;", "uiModel", "Lkp/a;", "onCampaignClicked", "Z", "(Lt0/x;ILaq/a$a;LnI/l;)V", "Q", "(LEs/a;Lqe/b;LnI/a;LnI/a;LU0/m;I)V", "O", "(LnI/a;LEs/a;LU0/m;I)V", "x", "(Lqe/b;LnI/a;LU0/m;I)V", "n0", "a0", "(Lt0/x;LnI/a;)V", "a", "LYp/F;", "injectedComposablesForPreview", "discover-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final F f95604a = new F(new e(), new f());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.discover.impl.ui.a$a  reason: collision with other inner class name */
    static final class C2125a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f95605a;

        C2125a(L0 l02) {
            this.f95605a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(468639450, i10, -1, "com.ingka.ikea.discover.impl.ui.DiscoverComposable.<anonymous> (DiscoverComposables.kt:126)");
                }
                Y2.c(this.f95605a, (androidx.compose.ui.d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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
    static final class b implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.b f95606a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ F f95607b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<i, C16807N> f95608c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<c1, C16807N> f95609d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f95610e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5934A f95611f;

        b(a.b bVar, F f10, C17642l<? super i, C16807N> lVar, C17642l<? super c1, C16807N> lVar2, C17631a<C16807N> aVar, C5934A a10) {
            this.f95606a = bVar;
            this.f95607b = f10;
            this.f95608c = lVar;
            this.f95609d = lVar2;
            this.f95610e = aVar;
            this.f95611f = a10;
        }

        public final void a(C5834E e10, C4889m mVar, int i10) {
            C17542s.j(e10, "contentPadding");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(e10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1579729635, i10, -1, "com.ingka.ikea.discover.impl.ui.DiscoverComposable.<anonymous> (DiscoverComposables.kt:129)");
                }
                a.z(this.f95606a, this.f95607b, this.f95608c, this.f95609d, this.f95610e, this.f95611f, D.h(androidx.compose.ui.d.f18749a, e10), mVar, 0, 0);
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.discover.impl.ui.DiscoverComposablesKt$DiscoverComposable$4$1", f = "DiscoverComposables.kt", l = {145}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f95612c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5934A f95613d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f95614e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5934A a10, C17631a<C16807N> aVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f95613d = a10;
            this.f95614e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f95613d, this.f95614e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f95612c;
            if (i10 == 0) {
                y.b(obj);
                C5934A a10 = this.f95613d;
                this.f95612c = 1;
                if (C5934A.L(a10, 0, 0, this, 2, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f95614e.invoke();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d extends C17540p implements C17631a<C16807N> {
        d(Object obj) {
            super(0, obj, Zp.a.class, "onUiEventConsumed", "onUiEventConsumed()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((Zp.a) this.receiver).I();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends C17540p implements C17631a<C16807N> {
        e(Object obj) {
            super(0, obj, Zp.a.class, "loadData", "loadData()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((Zp.a) this.receiver).E();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10189b f95615a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f95616b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f95617c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Es.a f95618d;

        f(C10189b bVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, Es.a aVar3) {
            this.f95615a = bVar;
            this.f95616b = aVar;
            this.f95617c = aVar2;
            this.f95618d = aVar3;
        }

        public final void a(C5842M m10, C4889m mVar, int i10) {
            C17542s.j(m10, "$this$IkeaTopAppBar");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(202157119, i10, -1, "com.ingka.ikea.discover.impl.ui.TopAppBarAndHeaderSection.<anonymous>.<anonymous> (DiscoverComposables.kt:445)");
                }
                a.x(this.f95615a, this.f95616b, mVar, 0);
                a.O(this.f95617c, this.f95618d, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f95619a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f95620b;

        g(String str, C17631a<C16807N> aVar) {
            this.f95619a = str;
            this.f95620b = aVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1493319221, i11, -1, "com.ingka.ikea.discover.impl.ui.actionButtonItem.<anonymous> (DiscoverComposables.kt:401)");
                }
                L.b(this.f95619a, J.h(TC.e.i(androidx.compose.ui.d.f18749a), 0.0f, 1, (Object) null), false, (N) null, (M) null, false, (Integer) null, (K0) null, (m) null, this.f95620b, mVar, 0, 508);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C11079a.C1960a f95621a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C11519a, C16807N> f95622b;

        h(C11079a.C1960a aVar, C17642l<? super C11519a, C16807N> lVar) {
            this.f95621a = aVar;
            this.f95622b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, C11519a aVar) {
            C17542s.j(aVar, "campaign");
            lVar.invoke(aVar);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(t0.C5938c r9, U0.C4889m r10, int r11) {
            /*
                r8 = this;
                java.lang.String r0 = "$this$item"
                kotlin.jvm.internal.C17542s.j(r9, r0)
                r9 = r11 & 17
                r0 = 16
                if (r9 != r0) goto L_0x0016
                boolean r9 = r10.l()
                if (r9 != 0) goto L_0x0012
                goto L_0x0016
            L_0x0012:
                r10.L()
                goto L_0x0070
            L_0x0016:
                boolean r9 = U0.C4895p.J()
                if (r9 == 0) goto L_0x0025
                r9 = -1
                java.lang.String r0 = "com.ingka.ikea.discover.impl.ui.campaignsSection.<anonymous> (DiscoverComposables.kt:420)"
                r1 = 354940061(0x1527f49d, float:3.3918347E-26)
                U0.C4895p.S(r1, r11, r9, r0)
            L_0x0025:
                kp.b r2 = new kp.b
                aq.a$a r9 = r8.f95621a
                java.lang.String r9 = r9.b()
                aq.a$a r11 = r8.f95621a
                KJ.c r11 = r11.a()
                r2.<init>(r9, r11)
                r9 = 361613484(0x158dc8ac, float:5.726605E-26)
                r10.W(r9)
                nI.l<kp.a, XH.N> r9 = r8.f95622b
                boolean r9 = r10.V(r9)
                nI.l<kp.a, XH.N> r11 = r8.f95622b
                java.lang.Object r0 = r10.D()
                if (r9 != 0) goto L_0x0052
                U0.m$a r9 = U0.C4889m.f14007a
                java.lang.Object r9 = r9.a()
                if (r0 != r9) goto L_0x005a
            L_0x0052:
                com.ingka.ikea.discover.impl.ui.b r0 = new com.ingka.ikea.discover.impl.ui.b
                r0.<init>(r11)
                r10.u(r0)
            L_0x005a:
                r3 = r0
                nI.l r3 = (nI.C17642l) r3
                r10.P()
                r6 = 0
                r7 = 4
                r4 = 0
                r5 = r10
                HC.C12975d.d(r2, r3, r4, r5, r6, r7)
                boolean r9 = U0.C4895p.J()
                if (r9 == 0) goto L_0x0070
                U0.C4895p.R()
            L_0x0070:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.discover.impl.ui.a.h.b(t0.c, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f95623a;

        i(C17631a<C16807N> aVar) {
            this.f95623a = aVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-405027836, i11, -1, "com.ingka.ikea.discover.impl.ui.error.<anonymous> (DiscoverComposables.kt:573)");
                }
                d.a aVar = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d m10 = D.m(TC.e.i(J.h(aVar, 0.0f, 1, (Object) null)), 0.0f, c2.h.B((float) 80), 0.0f, 0.0f, 13, (Object) null);
                C5073d.f n10 = C5073d.f18068a.n(c2.h.B((float) 8));
                C17631a<C16807N> aVar2 = this.f95623a;
                C5437c.a aVar3 = C5437c.f24302a;
                I a10 = C5080k.a(n10, aVar3.k(), mVar2, 6);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, m10);
                C4504g.a aVar4 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar4.a();
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
                F1.c(a13, a10, aVar4.c());
                F1.c(a13, s10, aVar4.e());
                p<C4504g, Integer, C16807N> b10 = aVar4.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar4.d());
                C5862h hVar = C5862h.f28810a;
                F0.b(C18146a.f148569o, J1.j.b(Oo.b.f84823w3, mVar2, 0), hVar.b(aVar, aVar3.g()), false, (SC.H0) null, (G0) null, (m) null, false, aVar2, mVar, 0, 248);
                C13607l.j(J1.j.b(Oo.b.f84812v3, mVar2, 0), C13679b.a.C2856b.f116680a, hVar.b(aVar, aVar3.g()), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262136);
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
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f95624a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f95625b;

        j(String str, String str2) {
            this.f95624a = str;
            this.f95625b = str2;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(541112408, i10, -1, "com.ingka.ikea.discover.impl.ui.eyebrowAndTitleItem.<anonymous> (DiscoverComposables.kt:385)");
                }
                E.b(this.f95624a, this.f95625b, (androidx.compose.ui.d) null, mVar, 0, 4);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Es.a f95626a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C10189b f95627b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f95628c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f95629d;

        k(Es.a aVar, C10189b bVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3) {
            this.f95626a = aVar;
            this.f95627b = bVar;
            this.f95628c = aVar2;
            this.f95629d = aVar3;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1354464880, i10, -1, "com.ingka.ikea.discover.impl.ui.headerWithArrowDownItem.<anonymous> (DiscoverComposables.kt:367)");
                }
                a.Q(this.f95626a, this.f95627b, this.f95628c, this.f95629d, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(a.b bVar, C17631a aVar, C17642l lVar, C17642l lVar2, boolean z10, F f10, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        m0(xVar, bVar.b(), bVar.a(), new C11032w(lVar), new C11033x(lVar));
        c0(xVar, bVar, aVar, lVar, lVar2, z10, f10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B(C17642l lVar) {
        lVar.invoke(i.e.f95643a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(C17642l lVar) {
        lVar.invoke(i.a.f95638a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(a.b bVar, F f10, C17642l lVar, C17642l lVar2, C17631a aVar, C5934A a10, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        z(bVar, f10, lVar, lVar2, aVar, a10, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void E(Zp.a.b r35, Zp.e r36, Yp.F r37, nI.C17631a<XH.C16807N> r38, nI.C17631a<XH.C16807N> r39, nI.C17642l<? super com.ingka.ikea.discover.impl.ui.i, XH.C16807N> r40, nI.C17642l<? super Op.c1, XH.C16807N> r41, U0.C4889m r42, int r43) {
        /*
            r7 = r35
            r8 = r36
            r15 = r38
            r14 = r40
            r13 = r43
            r0 = 1365750420(0x5167b294, float:6.2195843E10)
            r1 = r42
            U0.m r12 = r1.k(r0)
            r9 = 6
            r1 = r13 & 6
            if (r1 != 0) goto L_0x002c
            r1 = r13 & 8
            if (r1 != 0) goto L_0x0021
            boolean r1 = r12.V(r7)
            goto L_0x0025
        L_0x0021:
            boolean r1 = r12.F(r7)
        L_0x0025:
            if (r1 == 0) goto L_0x0029
            r1 = 4
            goto L_0x002a
        L_0x0029:
            r1 = 2
        L_0x002a:
            r1 = r1 | r13
            goto L_0x002d
        L_0x002c:
            r1 = r13
        L_0x002d:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0046
            r2 = r13 & 64
            if (r2 != 0) goto L_0x003a
            boolean r2 = r12.V(r8)
            goto L_0x003e
        L_0x003a:
            boolean r2 = r12.F(r8)
        L_0x003e:
            if (r2 == 0) goto L_0x0043
            r2 = 32
            goto L_0x0045
        L_0x0043:
            r2 = 16
        L_0x0045:
            r1 = r1 | r2
        L_0x0046:
            r2 = r13 & 384(0x180, float:5.38E-43)
            r10 = r37
            if (r2 != 0) goto L_0x0058
            boolean r2 = r12.F(r10)
            if (r2 == 0) goto L_0x0055
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0057
        L_0x0055:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r1 = r1 | r2
        L_0x0058:
            r2 = r13 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x0068
            boolean r2 = r12.F(r15)
            if (r2 == 0) goto L_0x0065
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0067
        L_0x0065:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0067:
            r1 = r1 | r2
        L_0x0068:
            r2 = r13 & 24576(0x6000, float:3.4438E-41)
            r5 = r39
            if (r2 != 0) goto L_0x007a
            boolean r2 = r12.F(r5)
            if (r2 == 0) goto L_0x0077
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0079
        L_0x0077:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0079:
            r1 = r1 | r2
        L_0x007a:
            r2 = 196608(0x30000, float:2.75506E-40)
            r2 = r2 & r13
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r2 != 0) goto L_0x008c
            boolean r2 = r12.F(r14)
            if (r2 == 0) goto L_0x0089
            r2 = r4
            goto L_0x008b
        L_0x0089:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x008b:
            r1 = r1 | r2
        L_0x008c:
            r2 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 & r13
            r3 = r41
            if (r2 != 0) goto L_0x009f
            boolean r2 = r12.F(r3)
            if (r2 == 0) goto L_0x009c
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x009e
        L_0x009c:
            r2 = 524288(0x80000, float:7.34684E-40)
        L_0x009e:
            r1 = r1 | r2
        L_0x009f:
            r2 = r1
            r1 = 599187(0x92493, float:8.3964E-40)
            r1 = r1 & r2
            r6 = 599186(0x92492, float:8.39638E-40)
            if (r1 != r6) goto L_0x00b6
            boolean r1 = r12.l()
            if (r1 != 0) goto L_0x00b0
            goto L_0x00b6
        L_0x00b0:
            r12.L()
            r3 = r12
            goto L_0x024a
        L_0x00b6:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00c2
            r1 = -1
            java.lang.String r6 = "com.ingka.ikea.discover.impl.ui.DiscoverComposable (DiscoverComposables.kt:115)"
            U0.C4895p.S(r0, r2, r1, r6)
        L_0x00c2:
            r0 = -484443782(0xffffffffe31ff97a, float:-2.951009E21)
            r12.W(r0)
            java.lang.Object r0 = r12.D()
            U0.m$a r31 = U0.C4889m.f14007a
            java.lang.Object r1 = r31.a()
            if (r0 != r1) goto L_0x00dc
            O0.L0 r0 = new O0.L0
            r0.<init>()
            r12.u(r0)
        L_0x00dc:
            r6 = r0
            O0.L0 r6 = (O0.L0) r6
            r12.P()
            r0 = 3
            r1 = 0
            t0.A r0 = t0.C5935B.c(r1, r1, r12, r1, r0)
            r11 = -484439396(0xffffffffe3200a9c, float:-2.9522435E21)
            r12.W(r11)
            r11 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r2
            if (r11 != r4) goto L_0x00f6
            r16 = 1
            goto L_0x00f8
        L_0x00f6:
            r16 = r1
        L_0x00f8:
            java.lang.Object r4 = r12.D()
            if (r16 != 0) goto L_0x0104
            java.lang.Object r9 = r31.a()
            if (r4 != r9) goto L_0x010c
        L_0x0104:
            Yp.r r4 = new Yp.r
            r4.<init>(r14)
            r12.u(r4)
        L_0x010c:
            nI.l r4 = (nI.C17642l) r4
            r12.P()
            vl.k.d(r0, r4, r12, r1)
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r16 = s0.C5852X.e(r4)
            com.ingka.ikea.discover.impl.ui.a$a r4 = new com.ingka.ikea.discover.impl.ui.a$a
            r4.<init>(r6)
            r9 = 468639450(0x1beededa, float:3.9517812E-22)
            r10 = 54
            r13 = 1
            c1.a r19 = c1.c.e(r9, r13, r4, r12, r10)
            com.ingka.ikea.discover.impl.ui.a$b r9 = new com.ingka.ikea.discover.impl.ui.a$b
            r4 = r0
            r0 = r9
            r1 = r35
            r33 = r2
            r2 = r37
            r3 = r40
            r32 = r4
            r4 = r41
            r5 = r39
            r34 = r6
            r6 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 1579729635(0x5e28c2e3, float:3.04013288E18)
            c1.a r27 = c1.c.e(r0, r13, r9, r12, r10)
            r29 = 805309440(0x30000c00, float:4.658318E-10)
            r30 = 502(0x1f6, float:7.03E-43)
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = r12
            O0.C4762x0.a(r16, r17, r18, r19, r20, r21, r22, r24, r26, r27, r28, r29, r30)
            r0 = -484419005(0xffffffffe3205a43, float:-2.957983E21)
            r12.W(r0)
            r0 = 0
            if (r8 == 0) goto L_0x01b7
            Zp.e$a r1 = Zp.e.a.f90141a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r8, r1)
            if (r1 == 0) goto L_0x01aa
            XH.N r1 = XH.C16807N.f139792a
            r2 = -484415089(0xffffffffe320698f, float:-2.9590854E21)
            r12.W(r2)
            r2 = r32
            boolean r3 = r12.V(r2)
            r4 = r33
            r5 = r4 & 7168(0x1c00, float:1.0045E-41)
            r6 = 2048(0x800, float:2.87E-42)
            if (r5 != r6) goto L_0x018a
            r5 = r13
            goto L_0x018b
        L_0x018a:
            r5 = 0
        L_0x018b:
            r3 = r3 | r5
            java.lang.Object r5 = r12.D()
            if (r3 != 0) goto L_0x0198
            java.lang.Object r3 = r31.a()
            if (r5 != r3) goto L_0x01a0
        L_0x0198:
            com.ingka.ikea.discover.impl.ui.a$c r5 = new com.ingka.ikea.discover.impl.ui.a$c
            r5.<init>(r2, r15, r0)
            r12.u(r5)
        L_0x01a0:
            nI.p r5 = (nI.p) r5
            r12.P()
            r2 = 6
            U0.P.g(r1, r5, r12, r2)
            goto L_0x01b9
        L_0x01aa:
            r4 = r33
            boolean r1 = r8 instanceof Zp.e.b
            if (r1 == 0) goto L_0x01b1
            goto L_0x01b9
        L_0x01b1:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x01b7:
            r4 = r33
        L_0x01b9:
            r12.P()
            boolean r1 = r8 instanceof Zp.e.b
            if (r1 == 0) goto L_0x01c4
            r1 = r8
            Zp.e$b r1 = (Zp.e.b) r1
            goto L_0x01c5
        L_0x01c4:
            r1 = r0
        L_0x01c5:
            r2 = -484406797(0xffffffffe32089f3, float:-2.9614193E21)
            r12.W(r2)
            if (r1 != 0) goto L_0x01d0
            r3 = r12
            r2 = 2
            goto L_0x021c
        L_0x01d0:
            sB.a r10 = r1.a()
            r2 = 596940826(0x2394981a, float:1.611061E-17)
            r12.W(r2)
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r11 != r2) goto L_0x01e0
            r2 = r13
            goto L_0x01e1
        L_0x01e0:
            r2 = 0
        L_0x01e1:
            java.lang.Object r3 = r12.D()
            if (r2 != 0) goto L_0x01ed
            java.lang.Object r2 = r31.a()
            if (r3 != r2) goto L_0x01f5
        L_0x01ed:
            Yp.s r3 = new Yp.s
            r3.<init>(r14)
            r12.u(r3)
        L_0x01f5:
            r11 = r3
            nI.l r11 = (nI.C17642l) r11
            r12.P()
            sB.a r1 = r1.a()
            sB.a$a r1 = r1.a()
            sB.a$a r2 = sB.C15035a.C3239a.ADD
            if (r1 != r2) goto L_0x0208
            goto L_0x0209
        L_0x0208:
            r13 = 0
        L_0x0209:
            r1 = r4 & 7168(0x1c00, float:1.0045E-41)
            r2 = 6
            r1 = r1 | r2
            r16 = 0
            r9 = r34
            r2 = 2
            r3 = r12
            r12 = r38
            r14 = r3
            r15 = r1
            tB.C15062c.c(r9, r10, r11, r12, r13, r14, r15, r16)
            XH.N r1 = XH.C16807N.f139792a
        L_0x021c:
            r3.P()
            boolean r1 = r7 instanceof Zp.a.b.C1934a
            if (r1 != 0) goto L_0x0241
            boolean r1 = r7 instanceof Zp.a.b.C1935b
            if (r1 == 0) goto L_0x0228
            goto L_0x0241
        L_0x0228:
            boolean r1 = r7 instanceof Zp.a.b.c
            if (r1 == 0) goto L_0x023b
            r1 = r7
            Zp.a$b$c r1 = (Zp.a.b.c) r1
            KJ.c r1 = r1.e()
            if (r1 != 0) goto L_0x0236
            goto L_0x0241
        L_0x0236:
            r4 = 0
            HC.r.k(r1, r0, r3, r4, r2)
            goto L_0x0241
        L_0x023b:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0241:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x024a
            U0.C4895p.R()
        L_0x024a:
            U0.Y0 r9 = r3.n()
            if (r9 == 0) goto L_0x0269
            Yp.t r10 = new Yp.t
            r0 = r10
            r1 = r35
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r40
            r7 = r41
            r8 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0269:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.discover.impl.ui.a.E(Zp.a$b, Zp.e, Yp.F, nI.a, nI.a, nI.l, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N F(C17642l lVar, boolean z10) {
        lVar.invoke(new i.C2126i(z10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G(C17642l lVar, String str) {
        C17542s.j(str, "listId");
        lVar.invoke(new i.n(str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H(a.b bVar, Zp.e eVar, F f10, C17631a aVar, C17631a aVar2, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        E(bVar, eVar, f10, aVar, aVar2, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void I(Zp.a r16, Yp.F r17, nI.C17642l<? super com.ingka.ikea.discover.impl.ui.i, XH.C16807N> r18, nI.C17642l<? super Op.c1, XH.C16807N> r19, U0.C4889m r20, int r21) {
        /*
            r1 = r16
            r11 = r17
            r12 = r18
            r13 = r19
            r14 = r21
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "injectedComposables"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onScreenUiEvent"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "onProductItemEvent"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = -223799735(0xfffffffff2a91649, float:-6.698228E30)
            r2 = r20
            U0.m r15 = r2.k(r0)
            r2 = r14 & 6
            if (r2 != 0) goto L_0x0036
            boolean r2 = r15.F(r1)
            if (r2 == 0) goto L_0x0033
            r2 = 4
            goto L_0x0034
        L_0x0033:
            r2 = 2
        L_0x0034:
            r2 = r2 | r14
            goto L_0x0037
        L_0x0036:
            r2 = r14
        L_0x0037:
            r3 = r14 & 48
            if (r3 != 0) goto L_0x0047
            boolean r3 = r15.F(r11)
            if (r3 == 0) goto L_0x0044
            r3 = 32
            goto L_0x0046
        L_0x0044:
            r3 = 16
        L_0x0046:
            r2 = r2 | r3
        L_0x0047:
            r3 = r14 & 384(0x180, float:5.38E-43)
            r9 = 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x0058
            boolean r3 = r15.F(r12)
            if (r3 == 0) goto L_0x0055
            r3 = r9
            goto L_0x0057
        L_0x0055:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r2 = r2 | r3
        L_0x0058:
            r3 = r14 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0068
            boolean r3 = r15.F(r13)
            if (r3 == 0) goto L_0x0065
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0067
        L_0x0065:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0067:
            r2 = r2 | r3
        L_0x0068:
            r8 = r2
            r2 = r8 & 1171(0x493, float:1.641E-42)
            r3 = 1170(0x492, float:1.64E-42)
            if (r2 != r3) goto L_0x007b
            boolean r2 = r15.l()
            if (r2 != 0) goto L_0x0076
            goto L_0x007b
        L_0x0076:
            r15.L()
            goto L_0x016e
        L_0x007b:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0087
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.discover.impl.ui.DiscoverScreen (DiscoverComposables.kt:86)"
            U0.C4895p.S(r0, r8, r2, r3)
        L_0x0087:
            TJ.P r2 = r16.m()
            r7 = 0
            r0 = 7
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = r15
            r10 = r8
            r8 = r0
            U0.A1 r0 = j3.a.c(r2, r3, r4, r5, r6, r7, r8)
            TJ.P r2 = r16.y()
            r8 = 7
            U0.A1 r2 = j3.a.c(r2, r3, r4, r5, r6, r7, r8)
            Zp.a$b r0 = J(r0)
            Zp.e r3 = K(r2)
            r2 = -1218282827(0xffffffffb7627ab5, float:-1.349922E-5)
            r15.W(r2)
            boolean r2 = r15.F(r1)
            java.lang.Object r4 = r15.D()
            if (r2 != 0) goto L_0x00c0
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x00c8
        L_0x00c0:
            com.ingka.ikea.discover.impl.ui.a$d r4 = new com.ingka.ikea.discover.impl.ui.a$d
            r4.<init>(r1)
            r15.u(r4)
        L_0x00c8:
            uI.h r4 = (uI.C18059h) r4
            r15.P()
            r2 = -1218280820(0xffffffffb762828c, float:-1.3501045E-5)
            r15.W(r2)
            boolean r2 = r15.F(r1)
            java.lang.Object r5 = r15.D()
            if (r2 != 0) goto L_0x00e5
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x00ed
        L_0x00e5:
            com.ingka.ikea.discover.impl.ui.a$e r5 = new com.ingka.ikea.discover.impl.ui.a$e
            r5.<init>(r1)
            r15.u(r5)
        L_0x00ed:
            uI.h r5 = (uI.C18059h) r5
            r15.P()
            r6 = r4
            nI.a r6 = (nI.C17631a) r6
            r7 = r5
            nI.a r7 = (nI.C17631a) r7
            r2 = -1218277575(0xffffffffb7628f39, float:-1.3503996E-5)
            r15.W(r2)
            r2 = r10 & 896(0x380, float:1.256E-42)
            r5 = 1
            if (r2 != r9) goto L_0x0105
            r2 = r5
            goto L_0x0106
        L_0x0105:
            r2 = 0
        L_0x0106:
            boolean r8 = r15.F(r1)
            r2 = r2 | r8
            java.lang.Object r8 = r15.D()
            if (r2 != 0) goto L_0x0119
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r8 != r2) goto L_0x0121
        L_0x0119:
            Yp.b r8 = new Yp.b
            r8.<init>(r12, r1)
            r15.u(r8)
        L_0x0121:
            nI.l r8 = (nI.C17642l) r8
            r15.P()
            r2 = -1218272467(0xffffffffb762a32d, float:-1.3508642E-5)
            r15.W(r2)
            boolean r2 = r15.F(r1)
            r9 = r10 & 7168(0x1c00, float:1.0045E-41)
            r4 = 2048(0x800, float:2.87E-42)
            if (r9 != r4) goto L_0x0138
            r4 = r5
            goto L_0x0139
        L_0x0138:
            r4 = 0
        L_0x0139:
            r2 = r2 | r4
            java.lang.Object r4 = r15.D()
            if (r2 != 0) goto L_0x0148
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r4 != r2) goto L_0x0150
        L_0x0148:
            Yp.m r4 = new Yp.m
            r4.<init>(r1, r13)
            r15.u(r4)
        L_0x0150:
            r9 = r4
            nI.l r9 = (nI.C17642l) r9
            r15.P()
            int r2 = r10 << 3
            r10 = r2 & 896(0x380, float:1.256E-42)
            r2 = r0
            r4 = r17
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r15
            E(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x016e
            U0.C4895p.R()
        L_0x016e:
            U0.Y0 r6 = r15.n()
            if (r6 == 0) goto L_0x0187
            Yp.q r7 = new Yp.q
            r0 = r7
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0187:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.discover.impl.ui.a.I(Zp.a, Yp.F, nI.l, nI.l, U0.m, int):void");
    }

    private static final a.b J(A1<? extends a.b> a12) {
        return (a.b) a12.getValue();
    }

    private static final Zp.e K(A1<? extends Zp.e> a12) {
        return (Zp.e) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N L(C17642l lVar, Zp.a aVar, i iVar) {
        C17542s.j(iVar, "screenUiEvent");
        lVar.invoke(iVar);
        aVar.G(iVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M(Zp.a aVar, C17642l lVar, c1 c1Var) {
        C17542s.j(c1Var, "productItemEvent");
        aVar.F(c1Var);
        lVar.invoke(c1Var);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N(Zp.a aVar, F f10, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        I(aVar, f10, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void O(C17631a<C16807N> aVar, Es.a aVar2, C4889m mVar, int i10) {
        int i11;
        C17631a<C16807N> aVar3 = aVar;
        Es.a aVar4 = aVar2;
        int i12 = i10;
        C4889m k10 = mVar.k(160307526);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar4) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(160307526, i11, -1, "com.ingka.ikea.discover.impl.ui.InboxMenuItem (DiscoverComposables.kt:463)");
            }
            d.a aVar5 = androidx.compose.ui.d.f18749a;
            C5437c.a aVar6 = C5437c.f24302a;
            I h10 = C5077h.h(aVar6.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar5);
            C4504g.a aVar7 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar7.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, h10, aVar7.c());
            F1.c(a12, s10, aVar7.e());
            p<C4504g, Integer, C16807N> b10 = aVar7.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar7.d());
            C5079j jVar = C5079j.f18125a;
            F0.b(C18146a.f148660u0, J1.j.b(Oo.b.f84593b4, k10, 0), (androidx.compose.ui.d) null, false, SC.H0.Tertiary, (G0) null, (m) null, false, aVar, k10, ((i11 << 24) & 234881024) | 24576, 236);
            NC.k.f(aVar4 instanceof a.C1544a, jVar.a(aVar5, aVar6.e()), k10, 0, 0);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11025o(aVar, aVar4, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N P(C17631a aVar, Es.a aVar2, int i10, C4889m mVar, int i11) {
        O(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void Q(Es.a aVar, C10189b bVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        Es.a aVar4 = aVar;
        C10189b bVar2 = bVar;
        C17631a<C16807N> aVar5 = aVar2;
        C17631a<C16807N> aVar6 = aVar3;
        int i12 = i10;
        C4889m k10 = mVar.k(-225221128);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar4) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(bVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar5) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar6) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-225221128, i11, -1, "com.ingka.ikea.discover.impl.ui.TopAppBarAndHeaderSection (DiscoverComposables.kt:439)");
            }
            d.a aVar7 = androidx.compose.ui.d.f18749a;
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar7);
            C4504g.a aVar8 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar8.a();
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
            F1.c(a13, a10, aVar8.c());
            F1.c(a13, s10, aVar8.e());
            p<C4504g, Integer, C16807N> b10 = aVar8.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar8.d());
            C5862h hVar = C5862h.f28810a;
            k10.W(86979429);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new C11022l();
                k10.u(D10);
            }
            k10.P();
            C4889m mVar3 = k10;
            ol.p.c((v) null, (C17631a) D10, (androidx.compose.ui.d) null, (String) null, (u) null, c1.c.e(202157119, true, new f(bVar2, aVar6, aVar5, aVar4), k10, 54), (C5848T) null, (e1) null, (g1) null, k10, 196662, 476);
            mVar2 = k10;
            C13607l.j(J1.j.b(Oo.b.f84532V4, k10, 0), C13679b.C2857b.d.f116686a, D.k(TC.e.i(aVar7), 0.0f, c2.h.B((float) 16), 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 48, 0, 262136);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C11024n(aVar, bVar, aVar2, aVar3, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N R() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N S(Es.a aVar, C10189b bVar, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        Q(aVar, bVar, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void X(x xVar, int i10, String str, C17631a<C16807N> aVar) {
        C17542s.j(xVar, "<this>");
        C17542s.j(str, "label");
        C17542s.j(aVar, "onClick");
        xVar.b("ActionButton" + i10, "ActionButton", c1.c.c(1493319221, true, new g(str, aVar)));
    }

    private static final void Y(x xVar) {
        xVar.b("BottomSpacer", "BottomSpacer", C11011a.f89610a.a());
    }

    public static final void Z(x xVar, int i10, C11079a.C1960a aVar, C17642l<? super C11519a, C16807N> lVar) {
        C17542s.j(xVar, "<this>");
        C17542s.j(aVar, "uiModel");
        C17542s.j(lVar, "onCampaignClicked");
        xVar.b("Campaigns" + i10, "Campaigns", c1.c.c(354940061, true, new h(aVar, lVar)));
    }

    private static final void a0(x xVar, C17631a<C16807N> aVar) {
        x.i(xVar, "Error", (Object) null, c1.c.c(-405027836, true, new i(aVar)), 2, (Object) null);
    }

    public static final void b0(x xVar, int i10, String str, String str2) {
        C17542s.j(xVar, "<this>");
        C17542s.j(str, "eyebrow");
        C17542s.j(str2, "title");
        xVar.b("EyebrowAndTitle" + i10, "EyebrowAndTitle", c1.c.c(541112408, true, new j(str, str2)));
    }

    private static final void c0(x xVar, a.b bVar, C17631a<C16807N> aVar, C17642l<? super i, C16807N> lVar, C17642l<? super c1, C16807N> lVar2, boolean z10, F f10) {
        if (bVar instanceof a.b.C1934a) {
            a0(xVar, aVar);
        } else if (bVar instanceof a.b.C1935b) {
            n0(xVar);
        } else if (bVar instanceof a.b.c) {
            a.b.c cVar = (a.b.c) bVar;
            int i10 = 0;
            for (T next : cVar.c()) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C16877v.x();
                }
                C11079a aVar2 = (C11079a) next;
                if (aVar2 instanceof C11079a.c) {
                    Yp.M.p(xVar, i10, (C11079a.c) aVar2, new C11013c(lVar), new C11014d(lVar));
                } else if (aVar2 instanceof C11079a.d) {
                    b.c d10 = cVar.d();
                    if (d10 != null) {
                        Yp.P.a(xVar, i10, d10, f10.a(), new C11015e(lVar));
                    }
                } else if (aVar2 instanceof C11079a.f) {
                    S.a(xVar, bVar, lVar2, new C11016f(lVar), new C11017g(lVar));
                } else if (aVar2 instanceof C11079a.g) {
                    b0.A(xVar, i10, (C11079a.g) aVar2, new C11018h(lVar), z10);
                } else if (aVar2 instanceof C11079a.C1960a) {
                    Z(xVar, i10, (C11079a.C1960a) aVar2, new C11019i(lVar));
                } else if (aVar2 instanceof C11079a.b) {
                    Yp.C.a(xVar, i10, (C11079a.b) aVar2, new C11020j(lVar, aVar2), new C11021k(lVar, aVar2));
                } else if (C17542s.e(aVar2, C11079a.e.f90399a)) {
                    h.a(xVar, i10, f10.b(), lVar);
                } else if (!(aVar2 instanceof C11079a.h) && !(aVar2 instanceof C11079a.i)) {
                    throw new t();
                }
                i10 = i11;
            }
            Y(xVar);
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d0(C17642l lVar, String str, String str2) {
        C17542s.j(str, "filter");
        C17542s.j(str2, "inspirationId");
        lVar.invoke(new i.f(str, str2));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e0(C17642l lVar) {
        lVar.invoke(i.b.f95639a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f0(C17642l lVar, Uri uri) {
        C17542s.j(uri, "uri");
        String uri2 = uri.toString();
        C17542s.i(uri2, "toString(...)");
        lVar.invoke(new i.g(uri2));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g0(C17642l lVar) {
        lVar.invoke(i.h.f95647a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h0(C17642l lVar, String str, List list) {
        C17542s.j(str, "id");
        C17542s.j(list, "itemNos");
        lVar.invoke(new i.d(str, list));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i0(C17642l lVar, String str, String str2) {
        C17542s.j(str, "storyId");
        C17542s.j(str2, "storyTitle");
        lVar.invoke(new i.k(str, str2));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j0(C17642l lVar, C11519a aVar) {
        C17542s.j(aVar, "campaign");
        lVar.invoke(new i.c(aVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k0(C17642l lVar, C11079a aVar, kp.g gVar) {
        C17542s.j(gVar, "productCategory");
        lVar.invoke(new i.l(gVar.a(), gVar.c(), ((C11079a.b) aVar).a().b()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l0(C17642l lVar, C11079a aVar, kp.i iVar) {
        C17542s.j(iVar, "referenceMedia");
        lVar.invoke(new i.j(iVar.b(), iVar.e(), iVar.a(), iVar.d(), ((C11079a.b) aVar).a().b()));
        return C16807N.f139792a;
    }

    private static final void m0(x xVar, Es.a aVar, C10189b bVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3) {
        xVar.b("Header", "Header", c1.c.c(1354464880, true, new k(aVar, bVar, aVar2, aVar3)));
    }

    private static final void n0(x xVar) {
        x.i(xVar, "Loading", (Object) null, C11011a.f89610a.b(), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void x(C10189b bVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C10189b bVar2 = bVar;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-664299495);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(bVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-664299495, i11, -1, "com.ingka.ikea.discover.impl.ui.AlertMenuItem (DiscoverComposables.kt:482)");
            }
            if (bVar2 instanceof C10189b.a) {
                d.a aVar3 = androidx.compose.ui.d.f18749a;
                I h10 = C5077h.h(C5437c.f24302a.o(), false);
                int a10 = C4883j.a(k10, 0);
                C4912y s10 = k10.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar3);
                C4504g.a aVar4 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar4.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a11);
                } else {
                    k10.t();
                }
                C4889m a12 = F1.a(k10);
                F1.c(a12, h10, aVar4.c());
                F1.c(a12, s10, aVar4.e());
                p<C4504g, Integer, C16807N> b10 = aVar4.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b10);
                }
                F1.c(a12, e10, aVar4.d());
                C5079j jVar = C5079j.f18125a;
                C10189b.a aVar5 = (C10189b.a) bVar2;
                F0.b(aVar5.b(), aVar5.d(), (androidx.compose.ui.d) null, false, SC.H0.Tertiary, (G0) null, (m) null, false, aVar, k10, ((i11 << 21) & 234881024) | 24576, 236);
                k10.x();
            } else if (!C17542s.e(bVar2, C10189b.C1398b.f76049a) && !C17542s.e(bVar2, C10189b.c.f76050a)) {
                throw new t();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11026p(bVar2, aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C10189b bVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        x(bVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void z(a.b bVar, F f10, C17642l<? super i, C16807N> lVar, C17642l<? super c1, C16807N> lVar2, C17631a<C16807N> aVar, C5934A a10, androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        androidx.compose.ui.d dVar3;
        C4889m mVar2;
        int i13;
        a.b bVar2 = bVar;
        F f11 = f10;
        int i14 = i10;
        C4889m k10 = mVar.k(-574657693);
        if ((i11 & 1) != 0) {
            i12 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            i12 = ((i14 & 8) == 0 ? k10.V(bVar2) : k10.F(bVar2) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i14 & 48) == 0) {
            i12 |= k10.F(f11) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
            C17642l<? super i, C16807N> lVar3 = lVar;
        } else {
            C17642l<? super i, C16807N> lVar4 = lVar;
            if ((i14 & 384) == 0) {
                i12 |= k10.F(lVar4) ? 256 : 128;
            }
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
            C17642l<? super c1, C16807N> lVar5 = lVar2;
        } else {
            C17642l<? super c1, C16807N> lVar6 = lVar2;
            if ((i14 & 3072) == 0) {
                i12 |= k10.F(lVar6) ? RecyclerView.n.FLAG_MOVED : 1024;
            }
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
            C17631a<C16807N> aVar2 = aVar;
        } else {
            C17631a<C16807N> aVar3 = aVar;
            if ((i14 & 24576) == 0) {
                i12 |= k10.F(aVar3) ? 16384 : 8192;
            }
        }
        if ((i11 & 32) != 0) {
            i12 |= ImageMetadata.EDGE_MODE;
            C5934A a11 = a10;
        } else {
            C5934A a12 = a10;
            if ((i14 & ImageMetadata.EDGE_MODE) == 0) {
                i12 |= k10.V(a12) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            }
        }
        int i15 = i11 & 64;
        if (i15 != 0) {
            i12 |= 1572864;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            if ((i14 & 1572864) == 0) {
                i12 |= k10.V(dVar2) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
            }
        }
        if ((i12 & 599187) != 599186 || !k10.l()) {
            d.a aVar4 = i15 != 0 ? androidx.compose.ui.d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(-574657693, i12, -1, "com.ingka.ikea.discover.impl.ui.Content (DiscoverComposables.kt:187)");
            }
            boolean b10 = Xo.c.b((Context) k10.Q(AndroidCompositionLocals_androidKt.g()));
            boolean z10 = true;
            androidx.compose.ui.d f12 = J.f(aVar4, 0.0f, 1, (Object) null);
            C5073d.f n10 = C5073d.f18068a.n(c2.h.B((float) 32));
            k10.W(-1169573081);
            boolean z11 = ((i12 & 14) == 4 || ((i12 & 8) != 0 && k10.F(bVar2))) | ((i12 & 896) == 256) | ((57344 & i12) == 16384);
            if ((i12 & 7168) != 2048) {
                z10 = false;
            }
            boolean b11 = z11 | z10 | k10.b(b10) | k10.F(f11);
            Object D10 = k10.D();
            if (b11 || D10 == C4889m.f14007a.a()) {
                i13 = i12;
                C11030u uVar = r0;
                C11030u uVar2 = new C11030u(bVar, aVar, lVar, lVar2, b10, f10);
                k10.u(uVar);
                D10 = uVar;
            } else {
                i13 = i12;
            }
            k10.P();
            androidx.compose.ui.d dVar4 = aVar4;
            mVar2 = k10;
            C5937b.a(f12, a10, (C5834E) null, false, n10, (C5437c.b) null, (s) null, false, (C17642l) D10, mVar2, ((i13 >> 12) & 112) | 24576, 236);
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar3 = dVar4;
        } else {
            k10.L();
            dVar3 = dVar2;
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new C11031v(bVar, f10, lVar, lVar2, aVar, a10, dVar3, i10, i11));
        }
    }
}
