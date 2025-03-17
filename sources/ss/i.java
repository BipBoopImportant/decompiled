package ss;

import Ds.k;
import E1.I;
import G1.C4504g;
import O0.C4762x0;
import O0.H0;
import O0.L0;
import QJ.Q;
import SC.Y2;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.t;
import XH.y;
import android.content.Context;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5116k1;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import p0.s;
import s0.C5834E;
import s0.C5842M;
import s0.C5848T;
import s0.C5861g;
import s0.C5862h;
import ts.j;
import us.o;
import ys.C12502a;
import ys.C12503b;
import ys.C12506e;
import ys.C12507f;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a?\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\f\u0010\r\u001aG\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a=\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00102\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a5\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e²\u0006\f\u0010\t\u001a\u00020\b8\nX\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00108\n@\nX\u0002"}, d2 = {"LDs/k;", "viewModel", "Lkotlin/Function1;", "Lys/a;", "LXH/N;", "onNavigateTo", "m", "(LDs/k;LnI/l;LU0/m;I)V", "Lys/e;", "uiState", "Lys/b;", "onAction", "n", "(Lys/e;LnI/l;LnI/l;LU0/m;I)V", "", "screenTitle", "", "onLargeTitleVisibilityChanged", "j", "(Lys/e;Ljava/lang/String;LnI/l;LnI/l;LU0/m;I)V", "title", "isLargeTitleVisible", "Landroidx/compose/ui/d;", "modifier", "t", "(Ljava/lang/String;ZLnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "Ls0/g;", "content", "h", "(Ljava/lang/String;Landroidx/compose/ui/d;LnI/q;LU0/m;II)V", "inbox-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C12506e f102606a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C12503b, C16807N> f102607b;

        a(C12506e eVar, C17642l<? super C12503b, C16807N> lVar) {
            this.f102606a = eVar;
            this.f102607b = lVar;
        }

        public final void a(C5861g gVar, C4889m mVar, int i10) {
            C17542s.j(gVar, "$this$ColumnWithScreenTitle");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(gVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1603549400, i10, -1, "com.ingka.ikea.inbox.impl.compose.InboxContent.<anonymous> (InboxScreen.kt:154)");
                }
                us.f.c((C12506e.b) this.f102606a, this.f102607b, C5861g.c(gVar, androidx.compose.ui.d.f18749a, 1.0f, false, 2, (Object) null), mVar, 0, 0);
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
    static final class b implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C12503b, C16807N> f102608a;

        b(C17642l<? super C12503b, C16807N> lVar) {
            this.f102608a = lVar;
        }

        public final void a(C5861g gVar, C4889m mVar, int i10) {
            C17542s.j(gVar, "$this$ColumnWithScreenTitle");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(gVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(787957801, i10, -1, "com.ingka.ikea.inbox.impl.compose.InboxContent.<anonymous> (InboxScreen.kt:167)");
                }
                us.i.c(C5861g.c(gVar, androidx.compose.ui.d.f18749a, 1.0f, false, 2, (Object) null), this.f102608a, mVar, 0, 0);
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
    /* synthetic */ class c extends C17525a implements C17642l<C12503b, C16807N> {
        c(Object obj) {
            super(1, obj, k.class, "onEvent", "onEvent(Lcom/ingka/ikea/inbox/impl/model/Inbox$Event;)Lkotlinx/coroutines/Job;", 8);
        }

        public final void a(C12503b bVar) {
            C17542s.j(bVar, "p0");
            ((k) this.f144363a).t0(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C12503b) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inbox.impl.compose.InboxScreenKt$InboxScreen$3$1", f = "InboxScreen.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f102609c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12506e f102610d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<C12502a, C16807N> f102611e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<C12503b, C16807N> f102612f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C12506e eVar, C17642l<? super C12502a, C16807N> lVar, C17642l<? super C12503b, C16807N> lVar2, C17164e<? super d> eVar2) {
            super(2, eVar2);
            this.f102610d = eVar;
            this.f102611e = lVar;
            this.f102612f = lVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f102610d, this.f102611e, this.f102612f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f102609c == 0) {
                y.b(obj);
                C12502a b10 = this.f102610d.b();
                if (b10 != null) {
                    C17642l<C12502a, C16807N> lVar = this.f102611e;
                    C17642l<C12503b, C16807N> lVar2 = this.f102612f;
                    lVar.invoke(b10);
                    lVar2.invoke(C12503b.e.f107221a);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inbox.impl.compose.InboxScreenKt$InboxScreen$4$1", f = "InboxScreen.kt", l = {92}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f102613c;

        /* renamed from: d  reason: collision with root package name */
        Object f102614d;

        /* renamed from: e  reason: collision with root package name */
        int f102615e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C12506e f102616f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ L0 f102617g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f102618h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17642l<C12503b, C16807N> f102619i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f102620a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    O0.N0[] r0 = O0.N0.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    O0.N0 r1 = O0.N0.ActionPerformed     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    O0.N0 r1 = O0.N0.Dismissed     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f102620a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ss.i.e.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C12506e eVar, L0 l02, Context context, C17642l<? super C12503b, C16807N> lVar, C17164e<? super e> eVar2) {
            super(2, eVar2);
            this.f102616f = eVar;
            this.f102617g = l02;
            this.f102618h = context;
            this.f102619i = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f102616f, this.f102617g, this.f102618h, this.f102619i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
            r5 = r1.b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r11.f102615e
                r2 = 1
                if (r1 == 0) goto L_0x001f
                if (r1 != r2) goto L_0x0017
                java.lang.Object r0 = r11.f102614d
                ys.f$a r0 = (ys.C12507f.a) r0
                java.lang.Object r0 = r11.f102613c
                ys.f r0 = (ys.C12507f) r0
                XH.y.b(r12)
                goto L_0x0067
            L_0x0017:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x001f:
                XH.y.b(r12)
                ys.e r12 = r11.f102616f
                ys.f r12 = r12.c()
                if (r12 != 0) goto L_0x002b
                goto L_0x0095
            L_0x002b:
                boolean r1 = r12 instanceof ys.C12507f.d
                if (r1 == 0) goto L_0x0098
                O0.L0 r3 = r11.f102617g
                r1 = r12
                ys.f$d r1 = (ys.C12507f.d) r1
                IC.e r4 = r1.a()
                android.content.Context r5 = r11.f102618h
                java.lang.String r4 = r4.b(r5)
                ys.f$a r1 = r1.b()
                if (r1 == 0) goto L_0x0051
                IC.e r5 = r1.b()
                if (r5 == 0) goto L_0x0051
                android.content.Context r6 = r11.f102618h
                java.lang.String r5 = r5.b(r6)
                goto L_0x0052
            L_0x0051:
                r5 = 0
            L_0x0052:
                O0.J0 r7 = O0.J0.Short
                r11.f102613c = r12
                r11.f102614d = r1
                r11.f102615e = r2
                r6 = 0
                r9 = 4
                r10 = 0
                r8 = r11
                java.lang.Object r1 = O0.L0.f(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r1 != r0) goto L_0x0065
                return r0
            L_0x0065:
                r0 = r12
                r12 = r1
            L_0x0067:
                O0.N0 r12 = (O0.N0) r12
                int[] r1 = ss.i.e.a.f102620a
                int r12 = r12.ordinal()
                r12 = r1[r12]
                if (r12 == r2) goto L_0x0084
                r0 = 2
                if (r12 != r0) goto L_0x007e
                nI.l<ys.b, XH.N> r12 = r11.f102619i
                ys.b$l r0 = ys.C12503b.l.f107227a
                r12.invoke(r0)
                goto L_0x0095
            L_0x007e:
                XH.t r12 = new XH.t
                r12.<init>()
                throw r12
            L_0x0084:
                ys.f$d r0 = (ys.C12507f.d) r0
                ys.f$a r12 = r0.b()
                if (r12 == 0) goto L_0x0095
                nI.l<ys.b, XH.N> r0 = r11.f102619i
                ys.b r12 = r12.a()
                r0.invoke(r12)
            L_0x0095:
                XH.N r12 = XH.C16807N.f139792a
                return r12
            L_0x0098:
                XH.t r12 = new XH.t
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: ss.i.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f102621a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C12503b, C16807N> f102622b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f102623c;

        f(String str, C17642l<? super C12503b, C16807N> lVar, C4899r0<Boolean> r0Var) {
            this.f102621a = str;
            this.f102622b = lVar;
            this.f102623c = r0Var;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1316829446, i10, -1, "com.ingka.ikea.inbox.impl.compose.InboxScreen.<anonymous> (InboxScreen.kt:109)");
                }
                i.t(this.f102621a, i.q(this.f102623c), this.f102622b, (androidx.compose.ui.d) null, mVar, 0, 8);
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
    static final class g implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f102624a;

        g(L0 l02) {
            this.f102624a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-733579452, i10, -1, "com.ingka.ikea.inbox.impl.compose.InboxScreen.<anonymous> (InboxScreen.kt:108)");
                }
                Y2.c(this.f102624a, (androidx.compose.ui.d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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
    static final class h implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C12506e f102625a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C12503b, C16807N> f102626b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f102627c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f102628d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C12506e f102629a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f102630b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C17642l<C12503b, C16807N> f102631c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C4899r0<Boolean> f102632d;

            a(C12506e eVar, String str, C17642l<? super C12503b, C16807N> lVar, C4899r0<Boolean> r0Var) {
                this.f102629a = eVar;
                this.f102630b = str;
                this.f102631c = lVar;
                this.f102632d = r0Var;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(C4899r0 r0Var, boolean z10) {
                i.r(r0Var, z10);
                return C16807N.f139792a;
            }

            public final void b(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(270520594, i10, -1, "com.ingka.ikea.inbox.impl.compose.InboxScreen.<anonymous>.<anonymous> (InboxScreen.kt:119)");
                    }
                    C12506e eVar = this.f102629a;
                    String str = this.f102630b;
                    C17642l<C12503b, C16807N> lVar = this.f102631c;
                    mVar.W(506691367);
                    C4899r0<Boolean> r0Var = this.f102632d;
                    Object D10 = mVar.D();
                    if (D10 == C4889m.f14007a.a()) {
                        D10 = new k(r0Var);
                        mVar.u(D10);
                    }
                    mVar.P();
                    i.j(eVar, str, lVar, (C17642l) D10, mVar, 3072);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        h(C12506e eVar, C17642l<? super C12503b, C16807N> lVar, String str, C4899r0<Boolean> r0Var) {
            this.f102625a = eVar;
            this.f102626b = lVar;
            this.f102627c = str;
            this.f102628d = r0Var;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar) {
            lVar.invoke(C12503b.i.f107224a);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(s0.C5834E r9, U0.C4889m r10, int r11) {
            /*
                r8 = this;
                java.lang.String r0 = "paddingValues"
                kotlin.jvm.internal.C17542s.j(r9, r0)
                r0 = r11 & 6
                if (r0 != 0) goto L_0x0013
                boolean r0 = r10.V(r9)
                if (r0 == 0) goto L_0x0011
                r0 = 4
                goto L_0x0012
            L_0x0011:
                r0 = 2
            L_0x0012:
                r11 = r11 | r0
            L_0x0013:
                r0 = r11 & 19
                r1 = 18
                if (r0 != r1) goto L_0x0025
                boolean r0 = r10.l()
                if (r0 != 0) goto L_0x0020
                goto L_0x0025
            L_0x0020:
                r10.L()
                goto L_0x00a1
            L_0x0025:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0034
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.inbox.impl.compose.InboxScreen.<anonymous> (InboxScreen.kt:111)"
                r2 = -1680055653(0xffffffff9bdc629b, float:-3.645967E-22)
                U0.C4895p.S(r2, r11, r0, r1)
            L_0x0034:
                ys.e r11 = r8.f102625a
                ys.c r11 = r11.a()
                boolean r0 = r11 instanceof ys.C12504c.b
                ys.e r11 = r8.f102625a
                ys.c r11 = r11.a()
                boolean r1 = r11 instanceof ys.C12504c.d
                r11 = -1617818560(0xffffffff9f920c40, float:-6.185367E-20)
                r10.W(r11)
                nI.l<ys.b, XH.N> r11 = r8.f102626b
                boolean r11 = r10.V(r11)
                nI.l<ys.b, XH.N> r2 = r8.f102626b
                java.lang.Object r3 = r10.D()
                if (r11 != 0) goto L_0x0060
                U0.m$a r11 = U0.C4889m.f14007a
                java.lang.Object r11 = r11.a()
                if (r3 != r11) goto L_0x0068
            L_0x0060:
                ss.j r3 = new ss.j
                r3.<init>(r2)
                r10.u(r3)
            L_0x0068:
                r2 = r3
                nI.a r2 = (nI.C17631a) r2
                r10.P()
                androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
                r3 = 0
                r4 = 0
                r5 = 1
                androidx.compose.ui.d r11 = androidx.compose.foundation.layout.J.f(r11, r3, r5, r4)
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.h(r11, r9)
                ss.i$h$a r9 = new ss.i$h$a
                ys.e r11 = r8.f102625a
                java.lang.String r4 = r8.f102627c
                nI.l<ys.b, XH.N> r6 = r8.f102626b
                U0.r0<java.lang.Boolean> r7 = r8.f102628d
                r9.<init>(r11, r4, r6, r7)
                r11 = 54
                r4 = 270520594(0x101fd112, float:3.1518283E-29)
                c1.a r4 = c1.c.e(r4, r5, r9, r10, r11)
                r6 = 24576(0x6000, float:3.4438E-41)
                r7 = 0
                r5 = r10
                ts.h.c(r0, r1, r2, r3, r4, r5, r6, r7)
                boolean r9 = U0.C4895p.J()
                if (r9 == 0) goto L_0x00a1
                U0.C4895p.R()
            L_0x00a1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ss.i.h.b(s0.E, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ss.i$i  reason: collision with other inner class name */
    static final class C2449i implements q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C12503b, C16807N> f102633a;

        C2449i(C17642l<? super C12503b, C16807N> lVar) {
            this.f102633a = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar) {
            lVar.invoke(C12503b.g.f107222a);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(s0.C5842M r14, U0.C4889m r15, int r16) {
            /*
                r13 = this;
                r0 = r13
                r10 = r15
                r1 = r16
                java.lang.String r2 = "$this$TopBar"
                r3 = r14
                kotlin.jvm.internal.C17542s.j(r14, r2)
                r2 = r1 & 17
                r3 = 16
                if (r2 != r3) goto L_0x001b
                boolean r2 = r15.l()
                if (r2 != 0) goto L_0x0017
                goto L_0x001b
            L_0x0017:
                r15.L()
                goto L_0x0075
            L_0x001b:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x002a
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.inbox.impl.compose.InboxTopBar.<anonymous> (InboxScreen.kt:199)"
                r4 = 765407855(0x2d9f326f, float:1.8098604E-11)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x002a:
                int r1 = uK.C18146a.f148129L4
                int r2 = qs.d.f101996h
                r3 = 0
                java.lang.String r2 = J1.j.b(r2, r15, r3)
                SC.H0 r5 = SC.H0.Tertiary
                r3 = 2080041501(0x7bfaea1d, float:2.6056452E36)
                r15.W(r3)
                nI.l<ys.b, XH.N> r3 = r0.f102633a
                boolean r3 = r15.V(r3)
                nI.l<ys.b, XH.N> r4 = r0.f102633a
                java.lang.Object r6 = r15.D()
                if (r3 != 0) goto L_0x0051
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r6 != r3) goto L_0x0059
            L_0x0051:
                ss.l r6 = new ss.l
                r6.<init>(r4)
                r15.u(r6)
            L_0x0059:
                r9 = r6
                nI.a r9 = (nI.C17631a) r9
                r15.P()
                r11 = 24576(0x6000, float:3.4438E-41)
                r12 = 236(0xec, float:3.31E-43)
                r3 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = r15
                SC.F0.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0075
                U0.C4895p.R()
            L_0x0075:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ss.i.C2449i.b(s0.M, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    private static final void h(String str, androidx.compose.ui.d dVar, q<? super C5861g, ? super C4889m, ? super Integer, C16807N> qVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(-907701167);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.V(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.F(qVar) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-907701167, i12, -1, "com.ingka.ikea.inbox.impl.compose.ColumnWithScreenTitle (InboxScreen.kt:216)");
            }
            androidx.compose.ui.d f10 = m.f(dVar, m.c(0, k10, 0, 1), false, (s) null, false, 14, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, f10);
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
            F1.c(a13, a10, aVar.c());
            F1.c(a13, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar.d());
            C5862h hVar = C5862h.f28810a;
            j.b(str, D.m(androidx.compose.ui.d.f18749a, 0.0f, 0.0f, 0.0f, c2.h.B((float) 24), 7, (Object) null), k10, (i12 & 14) | 48, 0);
            qVar.invoke(hVar, k10, Integer.valueOf(((i12 >> 3) & 112) | 6));
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        androidx.compose.ui.d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new h(str, dVar2, qVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N i(String str, androidx.compose.ui.d dVar, q qVar, int i10, int i11, C4889m mVar, int i12) {
        h(str, dVar, qVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void j(C12506e eVar, String str, C17642l<? super C12503b, C16807N> lVar, C17642l<? super Boolean, C16807N> lVar2, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(613977340);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? k10.V(eVar) : k10.F(eVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(lVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= k10.F(lVar2) ? 2048 : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(613977340, i11, -1, "com.ingka.ikea.inbox.impl.compose.InboxContent (InboxScreen.kt:135)");
            }
            boolean z10 = true;
            androidx.compose.ui.d f10 = J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null);
            if (eVar instanceof C12506e.d) {
                k10.W(1662831988);
                h(str, C5116k1.a(f10, "TestTag-LoadingContent"), C11887a.f102578a.a(), k10, ((i11 >> 3) & 14) | 432, 0);
                k10.P();
            } else if (eVar instanceof C12506e.b) {
                k10.W(1663131138);
                h(str, C5116k1.a(f10, "TestTag-EmptyContent"), c1.c.e(-1603549400, true, new a(eVar, lVar), k10, 54), k10, ((i11 >> 3) & 14) | 432, 0);
                k10.P();
            } else if (eVar instanceof C12506e.c) {
                k10.W(1663538633);
                h(str, C5116k1.a(f10, "TestTag-ErrorContent"), c1.c.e(787957801, true, new b(lVar), k10, 54), k10, ((i11 >> 3) & 14) | 432, 0);
                k10.P();
            } else if (eVar instanceof C12506e.a) {
                k10.W(1663911284);
                C12506e.a aVar = (C12506e.a) eVar;
                androidx.compose.ui.d a10 = C5116k1.a(f10, "TestTag-ListContent");
                k10.W(607871357);
                if ((i11 & 7168) != 2048) {
                    z10 = false;
                }
                Object D10 = k10.D();
                if (z10 || D10 == C4889m.f14007a.a()) {
                    D10 = new f(lVar2);
                    k10.u(D10);
                }
                k10.P();
                o.d(str, aVar, (C17642l) D10, lVar, a10, k10, ((i11 >> 3) & 14) | 24576 | ((i11 << 3) & 7168), 0);
                k10.P();
            } else {
                k10.W(607828614);
                k10.P();
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
            n10.a(new g(eVar, str, lVar, lVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C17642l lVar, boolean z10) {
        lVar.invoke(Boolean.valueOf(z10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C12506e eVar, String str, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        j(eVar, str, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void m(k kVar, C17642l<? super C12502a, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(kVar, "viewModel");
        C17542s.j(lVar, "onNavigateTo");
        C4889m k10 = mVar.k(-890364914);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(kVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-890364914, i12, -1, "com.ingka.ikea.inbox.impl.compose.InboxScreen (InboxScreen.kt:56)");
            }
            C12506e o10 = o(j3.a.c(kVar.m(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7));
            k10.W(1699421455);
            boolean F10 = k10.F(kVar);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new c(kVar);
                k10.u(D10);
            }
            k10.P();
            n(o10, lVar, (C17642l) D10, k10, i12 & 112);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11888b(kVar, lVar, i10));
        }
    }

    public static final void n(C12506e eVar, C17642l<? super C12502a, C16807N> lVar, C17642l<? super C12503b, C16807N> lVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C12507f fVar;
        C12506e eVar2 = eVar;
        C17642l<? super C12502a, C16807N> lVar3 = lVar;
        C17642l<? super C12503b, C16807N> lVar4 = lVar2;
        int i12 = i10;
        C17542s.j(eVar2, "uiState");
        C17542s.j(lVar3, "onNavigateTo");
        C17542s.j(lVar4, "onAction");
        C4889m k10 = mVar.k(-287276726);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(eVar2) : k10.F(eVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar3) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar4) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-287276726, i11, -1, "com.ingka.ikea.inbox.impl.compose.InboxScreen (InboxScreen.kt:72)");
            }
            Context context = (Context) k10.Q(AndroidCompositionLocals_androidKt.g());
            k10.W(1699429693);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = new L0();
                k10.u(D10);
            }
            L0 l02 = (L0) D10;
            k10.P();
            String b10 = J1.j.b(qs.d.f102006r, k10, 0);
            k10.W(1699433854);
            Object D11 = k10.D();
            if (D11 == aVar.a()) {
                D11 = u1.e(Boolean.TRUE, (o1) null, 2, (Object) null);
                k10.u(D11);
            }
            C4899r0 r0Var = (C4899r0) D11;
            k10.P();
            C12502a b11 = eVar.b();
            k10.W(1699436341);
            int i13 = i11 & 14;
            int i14 = i11 & 896;
            boolean z10 = (i14 == 256) | (i13 == 4 || ((i11 & 8) != 0 && k10.F(eVar2))) | ((i11 & 112) == 32);
            Object D12 = k10.D();
            if (z10 || D12 == aVar.a()) {
                D12 = new d(eVar2, lVar3, lVar4, (C17164e<? super d>) null);
                k10.u(D12);
            }
            k10.P();
            P.g(b11, (p) D12, k10, 0);
            C12507f c10 = eVar.c();
            k10.W(1699443117);
            boolean F10 = k10.F(context) | (i13 == 4 || ((i11 & 8) != 0 && k10.F(eVar2))) | (i14 == 256);
            Object D13 = k10.D();
            if (F10 || D13 == aVar.a()) {
                fVar = c10;
                e eVar3 = new e(eVar, l02, context, lVar2, (C17164e<? super e>) null);
                k10.u(eVar3);
                D13 = eVar3;
            } else {
                fVar = c10;
            }
            k10.P();
            P.g(fVar, (p) D13, k10, 0);
            mVar2 = k10;
            C4762x0.a((androidx.compose.ui.d) null, c1.c.e(1316829446, true, new f(b10, lVar4, r0Var), k10, 54), (p<? super C4889m, ? super Integer, C16807N>) null, c1.c.e(-733579452, true, new g(l02), k10, 54), (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, (C5848T) null, c1.c.e(-1680055653, true, new h(eVar2, lVar4, b10, r0Var), k10, 54), mVar2, 805309488, 501);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C11889c(eVar2, lVar, lVar4, i12));
        }
    }

    private static final C12506e o(A1<? extends C12506e> a12) {
        return (C12506e) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N p(k kVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        m(kVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final boolean q(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void r(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C12506e eVar, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        n(eVar, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void t(java.lang.String r9, boolean r10, nI.C17642l<? super ys.C12503b, XH.C16807N> r11, androidx.compose.ui.d r12, U0.C4889m r13, int r14, int r15) {
        /*
            r0 = -2144859066(0xffffffff80280c46, float:-3.677823E-39)
            U0.m r13 = r13.k(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x000e
            r1 = r14 | 6
            goto L_0x001e
        L_0x000e:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x001d
            boolean r1 = r13.V(r9)
            if (r1 == 0) goto L_0x001a
            r1 = 4
            goto L_0x001b
        L_0x001a:
            r1 = 2
        L_0x001b:
            r1 = r1 | r14
            goto L_0x001e
        L_0x001d:
            r1 = r14
        L_0x001e:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x0025
            r1 = r1 | 48
            goto L_0x0035
        L_0x0025:
            r2 = r14 & 48
            if (r2 != 0) goto L_0x0035
            boolean r2 = r13.b(r10)
            if (r2 == 0) goto L_0x0032
            r2 = 32
            goto L_0x0034
        L_0x0032:
            r2 = 16
        L_0x0034:
            r1 = r1 | r2
        L_0x0035:
            r2 = r15 & 4
            r3 = 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x003e
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x004d
        L_0x003e:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x004d
            boolean r2 = r13.F(r11)
            if (r2 == 0) goto L_0x004a
            r2 = r3
            goto L_0x004c
        L_0x004a:
            r2 = 128(0x80, float:1.794E-43)
        L_0x004c:
            r1 = r1 | r2
        L_0x004d:
            r2 = r15 & 8
            if (r2 == 0) goto L_0x0054
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x0064
        L_0x0054:
            r4 = r14 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0064
            boolean r4 = r13.V(r12)
            if (r4 == 0) goto L_0x0061
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0063
        L_0x0061:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0063:
            r1 = r1 | r4
        L_0x0064:
            r4 = r1 & 1171(0x493, float:1.641E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r4 != r5) goto L_0x0076
            boolean r4 = r13.l()
            if (r4 != 0) goto L_0x0071
            goto L_0x0076
        L_0x0071:
            r13.L()
        L_0x0074:
            r5 = r12
            goto L_0x00db
        L_0x0076:
            if (r2 == 0) goto L_0x007a
            androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
        L_0x007a:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0086
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.inbox.impl.compose.InboxTopBar (InboxScreen.kt:192)"
            U0.C4895p.S(r0, r1, r2, r4)
        L_0x0086:
            if (r10 == 0) goto L_0x008b
            java.lang.String r0 = ""
            goto L_0x008c
        L_0x008b:
            r0 = r9
        L_0x008c:
            r2 = r10 ^ 1
            r4 = 1117814286(0x42a07e0e, float:80.2462)
            r13.W(r4)
            r4 = r1 & 896(0x380, float:1.256E-42)
            r5 = 1
            if (r4 != r3) goto L_0x009b
            r3 = r5
            goto L_0x009c
        L_0x009b:
            r3 = 0
        L_0x009c:
            java.lang.Object r4 = r13.D()
            if (r3 != 0) goto L_0x00aa
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x00b2
        L_0x00aa:
            ss.d r4 = new ss.d
            r4.<init>(r11)
            r13.u(r4)
        L_0x00b2:
            r3 = r4
            nI.a r3 = (nI.C17631a) r3
            r13.P()
            ss.i$i r4 = new ss.i$i
            r4.<init>(r11)
            r6 = 54
            r7 = 765407855(0x2d9f326f, float:1.8098604E-11)
            c1.a r5 = c1.c.e(r7, r5, r4, r13, r6)
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r7 = r1 | 24576(0x6000, float:3.4438E-41)
            r8 = 0
            r1 = r0
            r4 = r12
            r6 = r13
            ts.l.b(r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0074
            U0.C4895p.R()
            goto L_0x0074
        L_0x00db:
            U0.Y0 r12 = r13.n()
            if (r12 == 0) goto L_0x00ef
            ss.e r13 = new ss.e
            r1 = r13
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r12.a(r13)
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ss.i.t(java.lang.String, boolean, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C17642l lVar) {
        lVar.invoke(C12503b.a.f107217a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(String str, boolean z10, C17642l lVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        t(str, z10, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
