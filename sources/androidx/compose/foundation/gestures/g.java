package androidx.compose.foundation.gestures;

import A1.B;
import A1.P;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.h;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.L;
import m0.C5546i;
import m0.t0;
import n0.T;
import nI.C17642l;
import nI.p;
import p0.C5678A;
import p0.C5681D;
import p0.C5689g;
import p0.F;
import p0.s;
import p0.u;
import p0.v;
import r0.m;

@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005*\u0001(\u001aO\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001ae\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0017\u001a\u00020\u0015*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\" \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00050\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 \"\u001a\u0010'\u001a\u00020\"8\u0000X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0014\u0010+\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Landroidx/compose/ui/d;", "Lp0/D;", "state", "Lp0/v;", "orientation", "", "enabled", "reverseDirection", "Lp0/s;", "flingBehavior", "Lr0/m;", "interactionSource", "g", "(Landroidx/compose/ui/d;Lp0/D;Lp0/v;ZZLp0/s;Lr0/m;)Landroidx/compose/ui/d;", "Ln0/T;", "overscrollEffect", "Lp0/g;", "bringIntoViewSpec", "f", "(Landroidx/compose/ui/d;Lp0/D;Lp0/v;Ln0/T;ZZLp0/s;Lr0/m;Lp0/g;)Landroidx/compose/ui/d;", "Lp0/F;", "Lo1/g;", "offset", "j", "(Lp0/F;JLdI/e;)Ljava/lang/Object;", "Lkotlin/Function1;", "LA1/B;", "a", "LnI/l;", "CanDragCalculation", "Lp0/A;", "b", "Lp0/A;", "NoOpScrollScope", "Li1/h;", "c", "Li1/h;", "e", "()Li1/h;", "DefaultScrollMotionDurationScale", "androidx/compose/foundation/gestures/g$d", "d", "Landroidx/compose/foundation/gestures/g$d;", "UnityDensity", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C17642l<B, Boolean> f17811a = a.f17815c;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C5678A f17812b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final h f17813c = new b();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final d f17814d = new d();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA1/B;", "change", "", "a", "(LA1/B;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<B, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f17815c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(B b10) {
            return Boolean.valueOf(!P.g(b10.n(), P.f4356a.b()));
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/g$b", "Li1/h;", "", "z", "()F", "scaleFactor", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements h {
        b() {
        }

        public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
            return h.a.a(this, r10, pVar);
        }

        public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
            return h.a.b(this, cVar);
        }

        public C17168i minusKey(C17168i.c<?> cVar) {
            return h.a.c(this, cVar);
        }

        public C17168i plus(C17168i iVar) {
            return h.a.d(this, iVar);
        }

        public float z() {
            return 1.0f;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/compose/foundation/gestures/g$c", "Lp0/A;", "", "pixels", "a", "(F)F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements C5678A {
        c() {
        }

        public float a(float f10) {
            return f10;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"androidx/compose/foundation/gestures/g$d", "Lc2/d;", "", "getDensity", "()F", "density", "D1", "fontScale", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements c2.d {
        d() {
        }

        public float D1() {
            return 1.0f;
        }

        public float getDensity() {
            return 1.0f;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {966}, m = "semanticsScrollBy-d-4ec7I")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f17816c;

        /* renamed from: d  reason: collision with root package name */
        Object f17817d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f17818e;

        /* renamed from: f  reason: collision with root package name */
        int f17819f;

        e(C17164e<? super e> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f17818e = obj;
            this.f17819f |= Integer.MIN_VALUE;
            return g.j((F) null, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp0/u;", "LXH/N;", "<anonymous>", "(Lp0/u;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {967}, m = "invokeSuspend")
    static final class f extends l implements p<u, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17820c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f17821d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ F f17822e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f17823f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ L f17824g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "currentValue", "<anonymous parameter 1>", "LXH/N;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements p<Float, Float, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ L f17825c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ F f17826d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ u f17827e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(L l10, F f10, u uVar) {
                super(2);
                this.f17825c = l10;
                this.f17826d = f10;
                this.f17827e = uVar;
            }

            public final void a(float f10, float f11) {
                float f12 = f10 - this.f17825c.f144345a;
                F f13 = this.f17826d;
                this.f17825c.f144345a += f13.t(f13.A(this.f17827e.b(f13.B(f13.t(f12)), z1.e.f32374a.b())));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(F f10, long j10, L l10, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f17822e = f10;
            this.f17823f = j10;
            this.f17824g = l10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f17822e, this.f17823f, this.f17824g, eVar);
            fVar.f17821d = obj;
            return fVar;
        }

        /* renamed from: i */
        public final Object invoke(u uVar, C17164e<? super C16807N> eVar) {
            return ((f) create(uVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17820c;
            if (i10 == 0) {
                y.b(obj);
                float A10 = this.f17822e.A(this.f17823f);
                a aVar = new a(this.f17824g, this.f17822e, (u) this.f17821d);
                this.f17820c = 1;
                if (t0.e(0.0f, A10, 0.0f, (C5546i) null, aVar, this, 12, (Object) null) == f10) {
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

    public static final h e() {
        return f17813c;
    }

    public static final androidx.compose.ui.d f(androidx.compose.ui.d dVar, C5681D d10, v vVar, T t10, boolean z10, boolean z11, s sVar, m mVar, C5689g gVar) {
        androidx.compose.ui.d dVar2 = dVar;
        return dVar.s(new ScrollableElement(d10, vVar, t10, z10, z11, sVar, mVar, gVar));
    }

    public static final androidx.compose.ui.d g(androidx.compose.ui.d dVar, C5681D d10, v vVar, boolean z10, boolean z11, s sVar, m mVar) {
        return h(dVar, d10, vVar, (T) null, z10, z11, sVar, mVar, (C5689g) null, 128, (Object) null);
    }

    public static /* synthetic */ androidx.compose.ui.d h(androidx.compose.ui.d dVar, C5681D d10, v vVar, T t10, boolean z10, boolean z11, s sVar, m mVar, C5689g gVar, int i10, Object obj) {
        int i11 = i10;
        return f(dVar, d10, vVar, t10, (i11 & 8) != 0 ? true : z10, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? null : sVar, (i11 & 64) != 0 ? null : mVar, (i11 & 128) != 0 ? null : gVar);
    }

    public static /* synthetic */ androidx.compose.ui.d i(androidx.compose.ui.d dVar, C5681D d10, v vVar, boolean z10, boolean z11, s sVar, m mVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return g(dVar, d10, vVar, z12, z11, (i10 & 16) != 0 ? null : sVar, (i10 & 32) != 0 ? null : mVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(p0.F r11, long r12, dI.C17164e<? super o1.C5667g> r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.g.e
            if (r0 == 0) goto L_0x0013
            r0 = r14
            androidx.compose.foundation.gestures.g$e r0 = (androidx.compose.foundation.gestures.g.e) r0
            int r1 = r0.f17819f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17819f = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.g$e r0 = new androidx.compose.foundation.gestures.g$e
            r0.<init>(r14)
        L_0x0018:
            java.lang.Object r14 = r0.f17818e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f17819f
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r11 = r0.f17817d
            kotlin.jvm.internal.L r11 = (kotlin.jvm.internal.L) r11
            java.lang.Object r12 = r0.f17816c
            p0.F r12 = (p0.F) r12
            XH.y.b(r14)
            r14 = r11
            r11 = r12
            goto L_0x005c
        L_0x0033:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003b:
            XH.y.b(r14)
            kotlin.jvm.internal.L r14 = new kotlin.jvm.internal.L
            r14.<init>()
            n0.L r2 = n0.C5589L.Default
            androidx.compose.foundation.gestures.g$f r10 = new androidx.compose.foundation.gestures.g$f
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r14
            r4.<init>(r5, r6, r8, r9)
            r0.f17816c = r11
            r0.f17817d = r14
            r0.f17819f = r3
            java.lang.Object r12 = r11.v(r2, r10, r0)
            if (r12 != r1) goto L_0x005c
            return r1
        L_0x005c:
            float r12 = r14.f144345a
            long r11 = r11.B(r12)
            o1.g r11 = o1.C5667g.d(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.g.j(p0.F, long, dI.e):java.lang.Object");
    }
}
