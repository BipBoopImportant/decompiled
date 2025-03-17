package p0;

import XH.C16807N;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17536l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.B0;
import m0.C0;
import m0.C5546i;
import m0.C5554m;
import nI.C17631a;
import nI.C17642l;
import pI.C17752b;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001\u0010B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J=\u0010\f\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH@\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lp0/L;", "", "Lm0/i;", "", "animationSpec", "<init>", "(Lm0/i;)V", "Lkotlin/Function1;", "LXH/N;", "beforeFrame", "Lkotlin/Function0;", "afterFrame", "h", "(LnI/l;LnI/a;LdI/e;)Ljava/lang/Object;", "Lm0/C0;", "Lm0/m;", "a", "Lm0/C0;", "vectorizedSpec", "", "b", "J", "lastFrameTime", "c", "Lm0/m;", "lastVelocity", "", "d", "Z", "isRunning", "e", "F", "i", "()F", "j", "(F)V", "value", "f", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class L {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final a f26923f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f26924g = 8;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final C5554m f26925h = new C5554m(0.0f);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0<C5554m> f26926a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public long f26927b = Long.MIN_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C5554m f26928c = f26925h;

    /* renamed from: d  reason: collision with root package name */
    private boolean f26929d;

    /* renamed from: e  reason: collision with root package name */
    private float f26930e;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lp0/L$a;", "", "<init>", "()V", "", "", "b", "(F)Z", "Lm0/m;", "ZeroVector", "Lm0/m;", "a", "()Lm0/m;", "VisibilityThreshold", "F", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5554m a() {
            return L.f26925h;
        }

        public final boolean b(float f10) {
            return Math.abs(f10) < 0.01f;
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {101, 147}, m = "animateToZero")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f26931c;

        /* renamed from: d  reason: collision with root package name */
        Object f26932d;

        /* renamed from: e  reason: collision with root package name */
        Object f26933e;

        /* renamed from: f  reason: collision with root package name */
        float f26934f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f26935g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ L f26936h;

        /* renamed from: i  reason: collision with root package name */
        int f26937i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(L l10, C17164e<? super b> eVar) {
            super(eVar);
            this.f26936h = l10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f26935g = obj;
            this.f26937i |= Integer.MIN_VALUE;
            return this.f26936h.h((C17642l<? super Float, C16807N>) null, (C17631a<C16807N>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTime", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<Long, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ L f26938c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f26939d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<Float, C16807N> f26940e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(L l10, float f10, C17642l<? super Float, C16807N> lVar) {
            super(1);
            this.f26938c = l10;
            this.f26939d = f10;
            this.f26940e = lVar;
        }

        public final void a(long j10) {
            if (this.f26938c.f26927b == Long.MIN_VALUE) {
                this.f26938c.f26927b = j10;
            }
            C5554m mVar = new C5554m(this.f26938c.i());
            long c10 = this.f26939d == 0.0f ? this.f26938c.f26926a.c(new C5554m(this.f26938c.i()), L.f26923f.a(), this.f26938c.f26928c) : C17752b.g(((float) (j10 - this.f26938c.f26927b)) / this.f26939d);
            C5554m mVar2 = mVar;
            float f10 = ((C5554m) this.f26938c.f26926a.d(c10, mVar2, L.f26923f.a(), this.f26938c.f26928c)).f();
            L l10 = this.f26938c;
            l10.f26928c = (C5554m) l10.f26926a.e(c10, mVar2, L.f26923f.a(), this.f26938c.f26928c);
            this.f26938c.f26927b = j10;
            this.f26938c.j(f10);
            this.f26940e.invoke(Float.valueOf(this.f26938c.i() - f10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<Long, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ L f26941c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<Float, C16807N> f26942d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(L l10, C17642l<? super Float, C16807N> lVar) {
            super(1);
            this.f26941c = l10;
            this.f26942d = lVar;
        }

        public final void a(long j10) {
            float i10 = this.f26941c.i();
            this.f26941c.j(0.0f);
            this.f26942d.invoke(Float.valueOf(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return C16807N.f139792a;
        }
    }

    public L(C5546i<Float> iVar) {
        this.f26926a = iVar.a(B0.f(C17536l.f144385a));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a7, code lost:
        if (r13 != 0.0f) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c A[Catch:{ all -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bb A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bc A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(nI.C17642l<? super java.lang.Float, XH.C16807N> r13, nI.C17631a<XH.C16807N> r14, dI.C17164e<? super XH.C16807N> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof p0.L.b
            if (r0 == 0) goto L_0x0013
            r0 = r15
            p0.L$b r0 = (p0.L.b) r0
            int r1 = r0.f26937i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f26937i = r1
            goto L_0x0018
        L_0x0013:
            p0.L$b r0 = new p0.L$b
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f26935g
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f26937i
            r3 = 0
            r4 = -9223372036854775808
            r6 = 0
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L_0x005f
            if (r2 == r8) goto L_0x0044
            if (r2 != r7) goto L_0x003c
            java.lang.Object r13 = r0.f26932d
            nI.a r13 = (nI.C17631a) r13
            java.lang.Object r14 = r0.f26931c
            p0.L r14 = (p0.L) r14
            XH.y.b(r15)     // Catch:{ all -> 0x0039 }
            goto L_0x00d1
        L_0x0039:
            r13 = move-exception
            goto L_0x00df
        L_0x003c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0044:
            float r13 = r0.f26934f
            java.lang.Object r14 = r0.f26933e
            nI.a r14 = (nI.C17631a) r14
            java.lang.Object r2 = r0.f26932d
            nI.l r2 = (nI.C17642l) r2
            java.lang.Object r9 = r0.f26931c
            p0.L r9 = (p0.L) r9
            XH.y.b(r15)     // Catch:{ all -> 0x005b }
            r15 = r9
            r11 = r0
            r0 = r14
            r14 = r2
            r2 = r11
            goto L_0x00a2
        L_0x005b:
            r13 = move-exception
            r14 = r9
            goto L_0x00df
        L_0x005f:
            XH.y.b(r15)
            boolean r15 = r12.f26929d
            if (r15 != 0) goto L_0x00e8
            dI.i r15 = r0.getContext()
            i1.h$b r2 = i1.h.f24327t0
            dI.i$b r15 = r15.get(r2)
            i1.h r15 = (i1.h) r15
            if (r15 == 0) goto L_0x0079
            float r15 = r15.z()
            goto L_0x007b
        L_0x0079:
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x007b:
            r12.f26929d = r8
            r2 = r0
            r0 = r14
            r14 = r13
            r13 = r15
            r15 = r12
        L_0x0082:
            p0.L$a r9 = f26923f     // Catch:{ all -> 0x00ae }
            float r10 = r15.f26930e     // Catch:{ all -> 0x00ae }
            boolean r9 = r9.b(r10)     // Catch:{ all -> 0x00ae }
            if (r9 != 0) goto L_0x00a9
            p0.L$c r9 = new p0.L$c     // Catch:{ all -> 0x00ae }
            r9.<init>(r15, r13, r14)     // Catch:{ all -> 0x00ae }
            r2.f26931c = r15     // Catch:{ all -> 0x00ae }
            r2.f26932d = r14     // Catch:{ all -> 0x00ae }
            r2.f26933e = r0     // Catch:{ all -> 0x00ae }
            r2.f26934f = r13     // Catch:{ all -> 0x00ae }
            r2.f26937i = r8     // Catch:{ all -> 0x00ae }
            java.lang.Object r9 = U0.C4884j0.c(r9, r2)     // Catch:{ all -> 0x00ae }
            if (r9 != r1) goto L_0x00a2
            return r1
        L_0x00a2:
            r0.invoke()     // Catch:{ all -> 0x00ae }
            int r9 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x0082
        L_0x00a9:
            r13 = r0
            r11 = r15
            r15 = r14
            r14 = r11
            goto L_0x00b1
        L_0x00ae:
            r13 = move-exception
            r14 = r15
            goto L_0x00df
        L_0x00b1:
            float r0 = r14.f26930e     // Catch:{ all -> 0x0039 }
            float r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0039 }
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00bc
            goto L_0x00d4
        L_0x00bc:
            p0.L$d r0 = new p0.L$d     // Catch:{ all -> 0x0039 }
            r0.<init>(r14, r15)     // Catch:{ all -> 0x0039 }
            r2.f26931c = r14     // Catch:{ all -> 0x0039 }
            r2.f26932d = r13     // Catch:{ all -> 0x0039 }
            r15 = 0
            r2.f26933e = r15     // Catch:{ all -> 0x0039 }
            r2.f26937i = r7     // Catch:{ all -> 0x0039 }
            java.lang.Object r15 = U0.C4884j0.c(r0, r2)     // Catch:{ all -> 0x0039 }
            if (r15 != r1) goto L_0x00d1
            return r1
        L_0x00d1:
            r13.invoke()     // Catch:{ all -> 0x0039 }
        L_0x00d4:
            r14.f26927b = r4
            m0.m r13 = f26925h
            r14.f26928c = r13
            r14.f26929d = r3
            XH.N r13 = XH.C16807N.f139792a
            return r13
        L_0x00df:
            r14.f26927b = r4
            m0.m r15 = f26925h
            r14.f26928c = r15
            r14.f26929d = r3
            throw r13
        L_0x00e8:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "animateToZero called while previous animation is running"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.L.h(nI.l, nI.a, dI.e):java.lang.Object");
    }

    public final float i() {
        return this.f26930e;
    }

    public final void j(float f10) {
        this.f26930e = f10;
    }
}
