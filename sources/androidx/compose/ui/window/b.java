package androidx.compose.ui.window;

import E1.C4488v;
import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import G1.C4504g;
import L1.o;
import L1.v;
import L1.x;
import QJ.Q;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.C4912y;
import U0.F1;
import U0.I0;
import U0.L;
import U0.M;
import U0.M0;
import U0.o1;
import XH.C16807N;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import c1.C5264a;
import c2.r;
import c2.t;
import dI.C17164e;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import m1.C5571a;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aA\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0013\u001a\u00020\n*\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0016\u001a\u00020\u000f*\u00020\u00052\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\" \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#²\u0006\u0012\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\nX\u0002"}, d2 = {"Landroidx/compose/ui/window/p;", "popupPositionProvider", "Lkotlin/Function0;", "LXH/N;", "onDismissRequest", "Landroidx/compose/ui/window/q;", "properties", "content", "a", "(Landroidx/compose/ui/window/p;LnI/a;Landroidx/compose/ui/window/q;LnI/p;LU0/m;II)V", "", "focusable", "Landroidx/compose/ui/window/r;", "securePolicy", "clippingEnabled", "", "g", "(ZLandroidx/compose/ui/window/r;Z)I", "Landroid/view/View;", "i", "(Landroid/view/View;)Z", "isParentFlagSecureEnabled", "h", "(Landroidx/compose/ui/window/q;Z)I", "Landroid/graphics/Rect;", "Lc2/p;", "j", "(Landroid/graphics/Rect;)Lc2/p;", "LU0/I0;", "", "LU0/I0;", "getLocalPopupTestTag", "()LU0/I0;", "LocalPopupTestTag", "currentContent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<String> f19898a = C4910x.d((o1) null, a.f19899c, 1, (Object) null);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<String> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f19899c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.window.b$b  reason: collision with other inner class name */
    static final class C0315b extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PopupLayout f19900c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f19901d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q f19902e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f19903f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ t f19904g;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/b$b$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.window.b$b$a */
        public static final class a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ PopupLayout f19905a;

            public a(PopupLayout popupLayout) {
                this.f19905a = popupLayout;
            }

            public void b() {
                this.f19905a.e();
                this.f19905a.m();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0315b(PopupLayout popupLayout, C17631a<C16807N> aVar, q qVar, String str, t tVar) {
            super(1);
            this.f19900c = popupLayout;
            this.f19901d = aVar;
            this.f19902e = qVar;
            this.f19903f = str;
            this.f19904g = tVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f19900c.r();
            this.f19900c.t(this.f19901d, this.f19902e, this.f19903f, this.f19904g);
            return new a(this.f19900c);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PopupLayout f19906c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f19907d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q f19908e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f19909f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ t f19910g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PopupLayout popupLayout, C17631a<C16807N> aVar, q qVar, String str, t tVar) {
            super(0);
            this.f19906c = popupLayout;
            this.f19907d = aVar;
            this.f19908e = qVar;
            this.f19909f = str;
            this.f19910g = tVar;
        }

        public final void invoke() {
            this.f19906c.t(this.f19907d, this.f19908e, this.f19909f, this.f19910g);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LU0/M;", "LU0/L;", "a", "(LU0/M;)LU0/L;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<M, L> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PopupLayout f19911c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p f19912d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/b$d$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements L {
            public void b() {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PopupLayout popupLayout, p pVar) {
            super(1);
            this.f19911c = popupLayout;
            this.f19912d = pVar;
        }

        /* renamed from: a */
        public final L invoke(M m10) {
            this.f19911c.setPositionProvider(this.f19912d);
            this.f19911c.x();
            return new a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", l = {377}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f19913c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f19914d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ PopupLayout f19915e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<Long, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f19916c = new a();

            a() {
                super(1);
            }

            public final void a(long j10) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).longValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(PopupLayout popupLayout, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f19915e = popupLayout;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f19915e, eVar);
            eVar2.f19914d = obj;
            return eVar2;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r3.f19913c
                r2 = 1
                if (r1 == 0) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                java.lang.Object r1 = r3.f19914d
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r4)
                goto L_0x0036
            L_0x0013:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L_0x001b:
                XH.y.b(r4)
                java.lang.Object r4 = r3.f19914d
                QJ.Q r4 = (QJ.Q) r4
                r1 = r4
            L_0x0023:
                boolean r4 = QJ.S.h(r1)
                if (r4 == 0) goto L_0x003c
                androidx.compose.ui.window.b$e$a r4 = androidx.compose.ui.window.b.e.a.f19916c
                r3.f19914d = r1
                r3.f19913c = r2
                java.lang.Object r4 = androidx.compose.ui.platform.C5128q0.a(r4, r3)
                if (r4 != r0) goto L_0x0036
                return r0
            L_0x0036:
                androidx.compose.ui.window.PopupLayout r4 = r3.f19915e
                r4.p()
                goto L_0x0023
            L_0x003c:
                XH.N r4 = XH.C16807N.f139792a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LE1/v;", "childCoordinates", "LXH/N;", "a", "(LE1/v;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<C4488v, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PopupLayout f19917c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(PopupLayout popupLayout) {
            super(1);
            this.f19917c = popupLayout;
        }

        public final void a(C4488v vVar) {
            C4488v k02 = vVar.k0();
            C17542s.g(k02);
            this.f19917c.v(k02);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C4488v) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LE1/K;", "", "LE1/H;", "<anonymous parameter 0>", "Lc2/b;", "<anonymous parameter 1>", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;"}, k = 3, mv = {1, 8, 0})
    static final class g implements I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PopupLayout f19918a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f19919b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<a0.a, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f19920c = new a();

            a() {
                super(1);
            }

            public final void a(a0.a aVar) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a0.a) obj);
                return C16807N.f139792a;
            }
        }

        g(PopupLayout popupLayout, t tVar) {
            this.f19918a = popupLayout;
            this.f19919b = tVar;
        }

        public final J i(K k10, List<? extends H> list, long j10) {
            this.f19918a.setParentLayoutDirection(this.f19919b);
            return K.v0(k10, 0, 0, (Map) null, a.f19920c, 4, (Object) null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class h extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p f19921c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f19922d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q f19923e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f19924f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f19925g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f19926h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(p pVar, C17631a<C16807N> aVar, q qVar, p<? super C4889m, ? super Integer, C16807N> pVar2, int i10, int i11) {
            super(2);
            this.f19921c = pVar;
            this.f19922d = aVar;
            this.f19923e = qVar;
            this.f19924f = pVar2;
            this.f19925g = i10;
            this.f19926h = i11;
        }

        public final void a(C4889m mVar, int i10) {
            b.a(this.f19921c, this.f19922d, this.f19923e, this.f19924f, mVar, M0.a(this.f19925g | 1), this.f19926h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "b", "()Ljava/util/UUID;"}, k = 3, mv = {1, 8, 0})
    static final class i extends C17544u implements C17631a<UUID> {

        /* renamed from: c  reason: collision with root package name */
        public static final i f19927c = new i();

        i() {
            super(0);
        }

        /* renamed from: b */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class j extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PopupLayout f19928c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1<p<C4889m, Integer, C16807N>> f19929d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LL1/x;", "LXH/N;", "a", "(LL1/x;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<x, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f19930c = new a();

            a() {
                super(1);
            }

            public final void a(x xVar) {
                v.R(xVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((x) obj);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc2/r;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.window.b$j$b  reason: collision with other inner class name */
        static final class C0316b extends C17544u implements C17642l<r, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PopupLayout f19931c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0316b(PopupLayout popupLayout) {
                super(1);
                this.f19931c = popupLayout;
            }

            public final void a(long j10) {
                this.f19931c.m1setPopupContentSizefhxjrPA(r.b(j10));
                this.f19931c.x();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((r) obj).k());
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
        static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ A1<p<C4889m, Integer, C16807N>> f19932c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(A1<? extends p<? super C4889m, ? super Integer, C16807N>> a12) {
                super(2);
                this.f19932c = a12;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(606497925, i10, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:332)");
                    }
                    b.b(this.f19932c).invoke(mVar, 0);
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(PopupLayout popupLayout, A1<? extends p<? super C4889m, ? super Integer, C16807N>> a12) {
            super(2);
            this.f19928c = popupLayout;
            this.f19929d = a12;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1302892335, i10, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:321)");
                }
                androidx.compose.ui.d d10 = o.d(androidx.compose.ui.d.f18749a, false, a.f19930c, 1, (Object) null);
                boolean F10 = mVar.F(this.f19928c);
                PopupLayout popupLayout = this.f19928c;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new C0316b(popupLayout);
                    mVar.u(D10);
                }
                androidx.compose.ui.d a10 = C5571a.a(androidx.compose.ui.layout.g.a(d10, (C17642l) D10), this.f19928c.getCanCalculatePosition() ? 1.0f : 0.0f);
                C5264a e10 = c1.c.e(606497925, true, new c(this.f19929d), mVar, 54);
                c cVar = c.f19933a;
                int a11 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e11 = androidx.compose.ui.c.e(mVar, a10);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar.a();
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
                F1.c(a13, cVar, aVar.c());
                F1.c(a13, s10, aVar.e());
                p<C4504g, Integer, C16807N> b10 = aVar.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e11, aVar.d());
                e10.invoke(mVar, 6);
                mVar.x();
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: androidx.compose.ui.window.b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: androidx.compose.ui.window.b$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: androidx.compose.ui.window.b$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: androidx.compose.ui.window.b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: androidx.compose.ui.window.PopupLayout} */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0193, code lost:
        if (r9 == r24.a()) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d3, code lost:
        if (r5 == r24.a()) goto L_0x01d5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.window.p r35, nI.C17631a<XH.C16807N> r36, androidx.compose.ui.window.q r37, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r38, U0.C4889m r39, int r40, int r41) {
        /*
            r11 = r35
            r12 = r38
            r13 = r40
            r0 = -830247068(0xffffffffce836f64, float:-1.1025577E9)
            r1 = r39
            U0.m r14 = r1.k(r0)
            r1 = r41 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r13 | 6
            goto L_0x0026
        L_0x0016:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r14.V(r11)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r13
            goto L_0x0026
        L_0x0025:
            r1 = r13
        L_0x0026:
            r2 = r41 & 2
            r10 = 32
            if (r2 == 0) goto L_0x0031
            r1 = r1 | 48
        L_0x002e:
            r3 = r36
            goto L_0x0042
        L_0x0031:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x002e
            r3 = r36
            boolean r4 = r14.F(r3)
            if (r4 == 0) goto L_0x003f
            r4 = r10
            goto L_0x0041
        L_0x003f:
            r4 = 16
        L_0x0041:
            r1 = r1 | r4
        L_0x0042:
            r4 = r41 & 4
            r9 = 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x004d
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r5 = r37
            goto L_0x005e
        L_0x004d:
            r5 = r13 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r37
            boolean r6 = r14.V(r5)
            if (r6 == 0) goto L_0x005b
            r6 = r9
            goto L_0x005d
        L_0x005b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r6
        L_0x005e:
            r6 = r41 & 8
            if (r6 == 0) goto L_0x0066
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0064:
            r8 = r1
            goto L_0x0077
        L_0x0066:
            r6 = r13 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0064
            boolean r6 = r14.F(r12)
            if (r6 == 0) goto L_0x0073
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r1 = r1 | r6
            goto L_0x0064
        L_0x0077:
            r1 = r8 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r1 != r6) goto L_0x008b
            boolean r1 = r14.l()
            if (r1 != 0) goto L_0x0084
            goto L_0x008b
        L_0x0084:
            r14.L()
            r2 = r3
            r3 = r5
            goto L_0x02ec
        L_0x008b:
            r7 = 0
            if (r2 == 0) goto L_0x0091
            r22 = r7
            goto L_0x0093
        L_0x0091:
            r22 = r3
        L_0x0093:
            if (r4 == 0) goto L_0x00a9
            androidx.compose.ui.window.q r1 = new androidx.compose.ui.window.q
            r28 = 15
            r29 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r23 = r1
            r23.<init>((boolean) r24, (boolean) r25, (boolean) r26, (boolean) r27, (int) r28, (kotlin.jvm.internal.DefaultConstructorMarker) r29)
            goto L_0x00ab
        L_0x00a9:
            r23 = r5
        L_0x00ab:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00b7
            r1 = -1
            java.lang.String r2 = "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:302)"
            U0.C4895p.S(r0, r8, r1, r2)
        L_0x00b7:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.k()
            java.lang.Object r0 = r14.Q(r0)
            r16 = r0
            android.view.View r16 = (android.view.View) r16
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r0 = r14.Q(r0)
            r17 = r0
            c2.d r17 = (c2.d) r17
            U0.I0<java.lang.String> r0 = f19898a
            java.lang.Object r0 = r14.Q(r0)
            r20 = r0
            java.lang.String r20 = (java.lang.String) r20
            U0.I0 r0 = androidx.compose.ui.platform.C5100f0.k()
            java.lang.Object r0 = r14.Q(r0)
            c2.t r0 = (c2.t) r0
            r6 = 0
            U0.r r5 = U0.C4883j.d(r14, r6)
            int r1 = r8 >> 9
            r1 = r1 & 14
            U0.A1 r4 = U0.p1.q(r12, r14, r1)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            androidx.compose.ui.window.b$i r18 = androidx.compose.ui.window.b.i.f19927c
            r19 = 3072(0xc00, float:4.305E-42)
            r21 = 6
            r2 = 0
            r3 = 0
            r15 = r4
            r4 = r18
            r30 = r5
            r5 = r14
            r6 = r19
            r7 = r21
            java.lang.Object r1 = f1.C5301c.e(r1, r2, r3, r4, r5, r6, r7)
            r7 = r1
            java.util.UUID r7 = (java.util.UUID) r7
            java.lang.Object r1 = r14.D()
            U0.m$a r24 = U0.C4889m.f14007a
            java.lang.Object r2 = r24.a()
            r6 = 1
            if (r1 != r2) goto L_0x0159
            androidx.compose.ui.window.PopupLayout r5 = new androidx.compose.ui.window.PopupLayout
            r18 = 128(0x80, float:1.794E-43)
            r19 = 0
            r21 = 0
            r3 = r0
            r4 = r20
            r0 = r5
            r1 = r22
            r2 = r23
            r31 = r3
            r3 = r4
            r32 = r4
            r4 = r16
            r33 = r5
            r5 = r17
            r6 = r35
            r34 = r8
            r8 = r21
            r9 = r18
            r12 = r10
            r10 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.window.b$j r0 = new androidx.compose.ui.window.b$j
            r1 = r33
            r0.<init>(r1, r15)
            r2 = 1302892335(0x4da88f2f, float:3.53494496E8)
            r3 = 1
            c1.a r0 = c1.c.c(r2, r3, r0)
            r2 = r30
            r1.q(r2, r0)
            r14.u(r1)
            goto L_0x0161
        L_0x0159:
            r31 = r0
            r3 = r6
            r34 = r8
            r12 = r10
            r32 = r20
        L_0x0161:
            androidx.compose.ui.window.PopupLayout r1 = (androidx.compose.ui.window.PopupLayout) r1
            boolean r0 = r14.F(r1)
            r2 = r34
            r4 = r2 & 112(0x70, float:1.57E-43)
            if (r4 != r12) goto L_0x016f
            r6 = r3
            goto L_0x0170
        L_0x016f:
            r6 = 0
        L_0x0170:
            r0 = r0 | r6
            r5 = r2 & 896(0x380, float:1.256E-42)
            r6 = 256(0x100, float:3.59E-43)
            if (r5 != r6) goto L_0x0179
            r7 = r3
            goto L_0x017a
        L_0x0179:
            r7 = 0
        L_0x017a:
            r0 = r0 | r7
            r7 = r32
            boolean r8 = r14.V(r7)
            r0 = r0 | r8
            r8 = r31
            boolean r9 = r14.V(r8)
            r0 = r0 | r9
            java.lang.Object r9 = r14.D()
            if (r0 != 0) goto L_0x0195
            java.lang.Object r0 = r24.a()
            if (r9 != r0) goto L_0x01a9
        L_0x0195:
            androidx.compose.ui.window.b$b r9 = new androidx.compose.ui.window.b$b
            r16 = r9
            r17 = r1
            r18 = r22
            r19 = r23
            r20 = r7
            r21 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            r14.u(r9)
        L_0x01a9:
            nI.l r9 = (nI.C17642l) r9
            r0 = 0
            U0.P.c(r1, r9, r14, r0)
            boolean r9 = r14.F(r1)
            if (r4 != r12) goto L_0x01b7
            r4 = r3
            goto L_0x01b8
        L_0x01b7:
            r4 = r0
        L_0x01b8:
            r4 = r4 | r9
            if (r5 != r6) goto L_0x01bd
            r6 = r3
            goto L_0x01be
        L_0x01bd:
            r6 = r0
        L_0x01be:
            r4 = r4 | r6
            boolean r5 = r14.V(r7)
            r4 = r4 | r5
            boolean r5 = r14.V(r8)
            r4 = r4 | r5
            java.lang.Object r5 = r14.D()
            if (r4 != 0) goto L_0x01d5
            java.lang.Object r4 = r24.a()
            if (r5 != r4) goto L_0x01e9
        L_0x01d5:
            androidx.compose.ui.window.b$c r5 = new androidx.compose.ui.window.b$c
            r16 = r5
            r17 = r1
            r18 = r22
            r19 = r23
            r20 = r7
            r21 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            r14.u(r5)
        L_0x01e9:
            nI.a r5 = (nI.C17631a) r5
            U0.P.i(r5, r14, r0)
            boolean r4 = r14.F(r1)
            r2 = r2 & 14
            r5 = 4
            if (r2 != r5) goto L_0x01f9
            r6 = r3
            goto L_0x01fa
        L_0x01f9:
            r6 = r0
        L_0x01fa:
            r3 = r4 | r6
            java.lang.Object r4 = r14.D()
            if (r3 != 0) goto L_0x0208
            java.lang.Object r3 = r24.a()
            if (r4 != r3) goto L_0x0210
        L_0x0208:
            androidx.compose.ui.window.b$d r4 = new androidx.compose.ui.window.b$d
            r4.<init>(r1, r11)
            r14.u(r4)
        L_0x0210:
            nI.l r4 = (nI.C17642l) r4
            U0.P.c(r11, r4, r14, r2)
            boolean r2 = r14.F(r1)
            java.lang.Object r3 = r14.D()
            if (r2 != 0) goto L_0x0225
            java.lang.Object r2 = r24.a()
            if (r3 != r2) goto L_0x022e
        L_0x0225:
            androidx.compose.ui.window.b$e r3 = new androidx.compose.ui.window.b$e
            r2 = 0
            r3.<init>(r1, r2)
            r14.u(r3)
        L_0x022e:
            nI.p r3 = (nI.p) r3
            U0.P.g(r1, r3, r14, r0)
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            boolean r3 = r14.F(r1)
            java.lang.Object r4 = r14.D()
            if (r3 != 0) goto L_0x0245
            java.lang.Object r3 = r24.a()
            if (r4 != r3) goto L_0x024d
        L_0x0245:
            androidx.compose.ui.window.b$f r4 = new androidx.compose.ui.window.b$f
            r4.<init>(r1)
            r14.u(r4)
        L_0x024d:
            nI.l r4 = (nI.C17642l) r4
            androidx.compose.ui.d r2 = androidx.compose.ui.layout.c.a(r2, r4)
            boolean r3 = r14.F(r1)
            boolean r4 = r14.V(r8)
            r3 = r3 | r4
            java.lang.Object r4 = r14.D()
            if (r3 != 0) goto L_0x0268
            java.lang.Object r3 = r24.a()
            if (r4 != r3) goto L_0x0270
        L_0x0268:
            androidx.compose.ui.window.b$g r4 = new androidx.compose.ui.window.b$g
            r4.<init>(r1, r8)
            r14.u(r4)
        L_0x0270:
            E1.I r4 = (E1.I) r4
            int r0 = U0.C4883j.a(r14, r0)
            U0.y r1 = r14.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r14, r2)
            G1.g$a r3 = G1.C4504g.f6515W
            nI.a r5 = r3.a()
            U0.f r6 = r14.m()
            if (r6 != 0) goto L_0x028d
            U0.C4883j.c()
        L_0x028d:
            r14.I()
            boolean r6 = r14.i()
            if (r6 == 0) goto L_0x029a
            r14.p(r5)
            goto L_0x029d
        L_0x029a:
            r14.t()
        L_0x029d:
            U0.m r5 = U0.F1.a(r14)
            nI.p r6 = r3.c()
            U0.F1.c(r5, r4, r6)
            nI.p r4 = r3.e()
            U0.F1.c(r5, r1, r4)
            nI.p r1 = r3.b()
            boolean r4 = r5.i()
            if (r4 != 0) goto L_0x02c7
            java.lang.Object r4 = r5.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)
            if (r4 != 0) goto L_0x02d5
        L_0x02c7:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r5.u(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.w(r0, r1)
        L_0x02d5:
            nI.p r0 = r3.d()
            U0.F1.c(r5, r2, r0)
            r14.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02e8
            U0.C4895p.R()
        L_0x02e8:
            r2 = r22
            r3 = r23
        L_0x02ec:
            U0.Y0 r7 = r14.n()
            if (r7 == 0) goto L_0x0303
            androidx.compose.ui.window.b$h r8 = new androidx.compose.ui.window.b$h
            r0 = r8
            r1 = r35
            r4 = r38
            r5 = r40
            r6 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0303:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.b.a(androidx.compose.ui.window.p, nI.a, androidx.compose.ui.window.q, nI.p, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final p<C4889m, Integer, C16807N> b(A1<? extends p<? super C4889m, ? super Integer, C16807N>> a12) {
        return (p) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final int g(boolean z10, r rVar, boolean z11) {
        int i10 = !z10 ? 262152 : 262144;
        if (rVar == r.SecureOn) {
            i10 |= 8192;
        }
        return !z11 ? i10 | 512 : i10;
    }

    /* access modifiers changed from: private */
    public static final int h(q qVar, boolean z10) {
        return (!qVar.e() || !z10) ? (!qVar.e() || z10) ? qVar.d() : qVar.d() & -8193 : qVar.d() | 8192;
    }

    public static final boolean i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* access modifiers changed from: private */
    public static final c2.p j(Rect rect) {
        return new c2.p(rect.left, rect.top, rect.right, rect.bottom);
    }
}
