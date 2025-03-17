package q0;

import XH.C16807N;
import c2.h;
import com.adjust.sdk.Constants;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.L;
import m0.C5544h;
import m0.C5546i;
import m0.C5550k;
import m0.C5554m;
import m0.C5570z;
import nI.C17642l;
import p0.C5678A;
import p0.H;
import tI.C17978n;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\b\u0010\t\u001aX\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H@¢\u0006\u0004\b\u0014\u0010\u0015\u001a^\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00172\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H@¢\u0006\u0004\b\u0019\u0010\u001a\u001af\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0013*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H@¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b \u0010!\"\u001a\u0010'\u001a\u00020\"8\u0000X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lq0/j;", "snapLayoutInfoProvider", "Lm0/z;", "", "decayAnimationSpec", "Lm0/i;", "snapAnimationSpec", "Lp0/H;", "l", "(Lq0/j;Lm0/z;Lm0/i;)Lp0/H;", "Lp0/A;", "initialTargetOffset", "initialVelocity", "Lq0/b;", "Lm0/m;", "animation", "Lkotlin/Function1;", "LXH/N;", "onAnimationStep", "Lq0/a;", "i", "(Lp0/A;FFLq0/b;LnI/l;LdI/e;)Ljava/lang/Object;", "targetOffset", "Lm0/k;", "animationState", "f", "(Lp0/A;FLm0/k;Lm0/z;LnI/l;LdI/e;)Ljava/lang/Object;", "cancelOffset", "animationSpec", "h", "(Lp0/A;FFLm0/k;Lm0/i;LnI/l;LdI/e;)Ljava/lang/Object;", "target", "j", "(FF)F", "Lc2/h;", "a", "F", "k", "()F", "MinFlingVelocityDp", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: q0.i  reason: case insensitive filesystem */
public final class C5768i {

    /* renamed from: a  reason: collision with root package name */
    private static final float f27628a = h.B((float) Constants.MINIMAL_ERROR_STATUS_CODE);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {334}, m = "animateDecay")
    /* renamed from: q0.i$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        float f27629c;

        /* renamed from: d  reason: collision with root package name */
        Object f27630d;

        /* renamed from: e  reason: collision with root package name */
        Object f27631e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f27632f;

        /* renamed from: g  reason: collision with root package name */
        int f27633g;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27632f = obj;
            this.f27633g |= Integer.MIN_VALUE;
            return C5768i.f((C5678A) null, 0.0f, (C5550k<Float, C5554m>) null, (C5570z<Float>) null, (C17642l<? super Float, C16807N>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/h;", "", "Lm0/m;", "LXH/N;", "a", "(Lm0/h;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: q0.i$b */
    static final class b extends C17544u implements C17642l<C5544h<Float, C5554m>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f27634c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ L f27635d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5678A f27636e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<Float, C16807N> f27637f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(float f10, L l10, C5678A a10, C17642l<? super Float, C16807N> lVar) {
            super(1);
            this.f27634c = f10;
            this.f27635d = l10;
            this.f27636e = a10;
            this.f27637f = lVar;
        }

        public final void a(C5544h<Float, C5554m> hVar) {
            if (Math.abs(hVar.e().floatValue()) >= Math.abs(this.f27634c)) {
                float e10 = C5768i.j(hVar.e().floatValue(), this.f27634c);
                C5768i.g(hVar, this.f27636e, this.f27637f, e10 - this.f27635d.f144345a);
                hVar.a();
                this.f27635d.f144345a = e10;
                return;
            }
            C5768i.g(hVar, this.f27636e, this.f27637f, hVar.e().floatValue() - this.f27635d.f144345a);
            this.f27635d.f144345a = hVar.e().floatValue();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5544h) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {379}, m = "animateWithTarget")
    /* renamed from: q0.i$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        float f27638c;

        /* renamed from: d  reason: collision with root package name */
        float f27639d;

        /* renamed from: e  reason: collision with root package name */
        Object f27640e;

        /* renamed from: f  reason: collision with root package name */
        Object f27641f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f27642g;

        /* renamed from: h  reason: collision with root package name */
        int f27643h;

        c(C17164e<? super c> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f27642g = obj;
            this.f27643h |= Integer.MIN_VALUE;
            return C5768i.h((C5678A) null, 0.0f, 0.0f, (C5550k<Float, C5554m>) null, (C5546i<Float>) null, (C17642l<? super Float, C16807N>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm0/h;", "", "Lm0/m;", "LXH/N;", "a", "(Lm0/h;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: q0.i$d */
    static final class d extends C17544u implements C17642l<C5544h<Float, C5554m>, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f27644c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ L f27645d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5678A f27646e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<Float, C16807N> f27647f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(float f10, L l10, C5678A a10, C17642l<? super Float, C16807N> lVar) {
            super(1);
            this.f27644c = f10;
            this.f27645d = l10;
            this.f27646e = a10;
            this.f27647f = lVar;
        }

        public final void a(C5544h<Float, C5554m> hVar) {
            float e10 = C5768i.j(hVar.e().floatValue(), this.f27644c);
            float f10 = e10 - this.f27645d.f144345a;
            float a10 = this.f27646e.a(f10);
            this.f27647f.invoke(Float.valueOf(a10));
            if (Math.abs(f10 - a10) > 0.5f || e10 != hVar.e().floatValue()) {
                hVar.a();
            }
            this.f27645d.f144345a += a10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5544h) obj);
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object f(p0.C5678A r5, float r6, m0.C5550k<java.lang.Float, m0.C5554m> r7, m0.C5570z<java.lang.Float> r8, nI.C17642l<? super java.lang.Float, XH.C16807N> r9, dI.C17164e<? super q0.C5760a<java.lang.Float, m0.C5554m>> r10) {
        /*
            boolean r0 = r10 instanceof q0.C5768i.a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            q0.i$a r0 = (q0.C5768i.a) r0
            int r1 = r0.f27633g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f27633g = r1
            goto L_0x0018
        L_0x0013:
            q0.i$a r0 = new q0.i$a
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.f27632f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f27633g
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            float r6 = r0.f27629c
            java.lang.Object r5 = r0.f27631e
            kotlin.jvm.internal.L r5 = (kotlin.jvm.internal.L) r5
            java.lang.Object r7 = r0.f27630d
            m0.k r7 = (m0.C5550k) r7
            XH.y.b(r10)
            goto L_0x006b
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            XH.y.b(r10)
            kotlin.jvm.internal.L r10 = new kotlin.jvm.internal.L
            r10.<init>()
            java.lang.Object r2 = r7.p()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0054
            r2 = r3
            goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            r2 = r2 ^ r3
            q0.i$b r4 = new q0.i$b
            r4.<init>(r6, r10, r5, r9)
            r0.f27630d = r7
            r0.f27631e = r10
            r0.f27629c = r6
            r0.f27633g = r3
            java.lang.Object r5 = m0.t0.g(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r5 = r10
        L_0x006b:
            q0.a r8 = new q0.a
            float r5 = r5.f144345a
            float r6 = r6 - r5
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.d(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.C5768i.f(p0.A, float, m0.k, m0.z, nI.l, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final void g(C5544h<Float, C5554m> hVar, C5678A a10, C17642l<? super Float, C16807N> lVar, float f10) {
        float a11 = a10.a(f10);
        lVar.invoke(Float.valueOf(a11));
        if (Math.abs(f10 - a11) > 0.5f) {
            hVar.a();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object h(p0.C5678A r12, float r13, float r14, m0.C5550k<java.lang.Float, m0.C5554m> r15, m0.C5546i<java.lang.Float> r16, nI.C17642l<? super java.lang.Float, XH.C16807N> r17, dI.C17164e<? super q0.C5760a<java.lang.Float, m0.C5554m>> r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof q0.C5768i.c
            if (r1 == 0) goto L_0x0016
            r1 = r0
            q0.i$c r1 = (q0.C5768i.c) r1
            int r2 = r1.f27643h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.f27643h = r2
        L_0x0014:
            r7 = r1
            goto L_0x001c
        L_0x0016:
            q0.i$c r1 = new q0.i$c
            r1.<init>(r0)
            goto L_0x0014
        L_0x001c:
            java.lang.Object r0 = r7.f27642g
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r7.f27643h
            r3 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            float r1 = r7.f27639d
            float r2 = r7.f27638c
            java.lang.Object r3 = r7.f27641f
            kotlin.jvm.internal.L r3 = (kotlin.jvm.internal.L) r3
            java.lang.Object r4 = r7.f27640e
            m0.k r4 = (m0.C5550k) r4
            XH.y.b(r0)
            r10 = r2
            r0 = r4
            goto L_0x0090
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0043:
            XH.y.b(r0)
            kotlin.jvm.internal.L r0 = new kotlin.jvm.internal.L
            r0.<init>()
            java.lang.Object r2 = r15.p()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.b.d(r13)
            java.lang.Object r2 = r15.p()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x006a
            r2 = r3
            goto L_0x006b
        L_0x006a:
            r2 = 0
        L_0x006b:
            r5 = r2 ^ 1
            q0.i$d r6 = new q0.i$d
            r2 = r12
            r9 = r14
            r10 = r17
            r6.<init>(r14, r0, r12, r10)
            r9 = r15
            r7.f27640e = r9
            r7.f27641f = r0
            r10 = r13
            r7.f27638c = r10
            r7.f27639d = r8
            r7.f27643h = r3
            r2 = r15
            r3 = r4
            r4 = r16
            java.lang.Object r2 = m0.t0.i(r2, r3, r4, r5, r6, r7)
            if (r2 != r1) goto L_0x008d
            return r1
        L_0x008d:
            r3 = r0
            r1 = r8
            r0 = r9
        L_0x0090:
            java.lang.Object r2 = r0.p()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = j(r2, r1)
            q0.a r11 = new q0.a
            float r1 = r3.f144345a
            float r10 = r10 - r1
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.b.d(r10)
            r8 = 29
            r9 = 0
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            m0.k r0 = m0.C5552l.g(r0, r1, r2, r3, r5, r7, r8, r9)
            r11.<init>(r10, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.C5768i.h(p0.A, float, float, m0.k, m0.i, nI.l, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final Object i(C5678A a10, float f10, float f11, C5761b<Float, C5554m> bVar, C17642l<? super Float, C16807N> lVar, C17164e<? super C5760a<Float, C5554m>> eVar) {
        return bVar.a(a10, kotlin.coroutines.jvm.internal.b.d(f10), kotlin.coroutines.jvm.internal.b.d(f11), lVar, eVar);
    }

    /* access modifiers changed from: private */
    public static final float j(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return f11 > 0.0f ? C17978n.h(f10, f11) : C17978n.d(f10, f11);
    }

    public static final float k() {
        return f27628a;
    }

    public static final H l(C5769j jVar, C5570z<Float> zVar, C5546i<Float> iVar) {
        return new C5767h(jVar, zVar, iVar);
    }
}
