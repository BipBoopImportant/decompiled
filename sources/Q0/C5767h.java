package q0;

import QJ.Q;
import XH.C16807N;
import XH.C16814e;
import XH.y;
import androidx.compose.foundation.gestures.g;
import dI.C17164e;
import eI.C17187b;
import i1.h;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.L;
import m0.C5523B;
import m0.C5546i;
import m0.C5550k;
import m0.C5552l;
import m0.C5554m;
import m0.C5570z;
import nI.C17642l;
import nI.p;
import p0.C5678A;
import p0.H;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH@¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0017*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH@¢\u0006\u0004\b\u0018\u0010\u0019JD\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH@¢\u0006\u0004\b\u001c\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ0\u0010!\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH@¢\u0006\u0004\b!\u0010\u0013J\u001a\u0010$\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010+R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00105\u001a\u00020.8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00066"}, d2 = {"Lq0/h;", "Lp0/H;", "Lq0/j;", "snapLayoutInfoProvider", "Lm0/z;", "", "decayAnimationSpec", "Lm0/i;", "snapAnimationSpec", "<init>", "(Lq0/j;Lm0/z;Lm0/i;)V", "Lp0/A;", "initialVelocity", "Lkotlin/Function1;", "LXH/N;", "onRemainingScrollOffsetUpdate", "Lq0/a;", "Lm0/m;", "i", "(Lp0/A;FLnI/l;LdI/e;)Ljava/lang/Object;", "offset", "velocity", "updateRemainingScrollOffset", "Lm0/k;", "l", "(Lp0/A;FFLnI/l;LdI/e;)Ljava/lang/Object;", "initialTargetOffset", "onAnimationStep", "k", "", "j", "(FF)Z", "onRemainingDistanceUpdated", "b", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lq0/j;", "Lm0/z;", "c", "Lm0/i;", "Li1/h;", "d", "Li1/h;", "getMotionScaleDuration$foundation_release", "()Li1/h;", "setMotionScaleDuration$foundation_release", "(Li1/h;)V", "motionScaleDuration", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
/* renamed from: q0.h  reason: case insensitive filesystem */
public final class C5767h implements H {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C5769j f27604a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C5570z<Float> f27605b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C5546i<Float> f27606c;

    /* renamed from: d  reason: collision with root package name */
    private h f27607d = g.e();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {123}, m = "fling")
    /* renamed from: q0.h$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f27608c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f27609d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5767h f27610e;

        /* renamed from: f  reason: collision with root package name */
        int f27611f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5767h hVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f27610e = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f27609d = obj;
            this.f27611f |= Integer.MIN_VALUE;
            return this.f27610e.i((C5678A) null, 0.0f, (C17642l<? super Float, C16807N>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "Lq0/a;", "", "Lm0/m;", "<anonymous>", "(LQJ/Q;)Lq0/a;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {142, 161}, m = "invokeSuspend")
    /* renamed from: q0.h$b */
    static final class b extends l implements p<Q, C17164e<? super C5760a<Float, C5554m>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f27612c;

        /* renamed from: d  reason: collision with root package name */
        int f27613d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5767h f27614e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f27615f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17642l<Float, C16807N> f27616g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C5678A f27617h;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "LXH/N;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: q0.h$b$a */
        static final class a extends C17544u implements C17642l<Float, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ L f27618c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<Float, C16807N> f27619d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(L l10, C17642l<? super Float, C16807N> lVar) {
                super(1);
                this.f27618c = l10;
                this.f27619d = lVar;
            }

            public final void a(float f10) {
                L l10 = this.f27618c;
                float f11 = l10.f144345a - f10;
                l10.f144345a = f11;
                this.f27619d.invoke(Float.valueOf(f11));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).floatValue());
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "delta", "LXH/N;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: q0.h$b$b  reason: collision with other inner class name */
        static final class C0443b extends C17544u implements C17642l<Float, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ L f27620c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17642l<Float, C16807N> f27621d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0443b(L l10, C17642l<? super Float, C16807N> lVar) {
                super(1);
                this.f27620c = l10;
                this.f27621d = lVar;
            }

            public final void a(float f10) {
                L l10 = this.f27620c;
                float f11 = l10.f144345a - f10;
                l10.f144345a = f11;
                this.f27621d.invoke(Float.valueOf(f11));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).floatValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5767h hVar, float f10, C17642l<? super Float, C16807N> lVar, C5678A a10, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f27614e = hVar;
            this.f27615f = f10;
            this.f27616g = lVar;
            this.f27617h = a10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f27614e, this.f27615f, this.f27616g, this.f27617h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C5760a<Float, C5554m>> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            L l10;
            Object f10 = C17187b.f();
            int i10 = this.f27613d;
            if (i10 == 0) {
                y.b(obj);
                float b10 = this.f27614e.f27604a.b(this.f27615f, C5523B.a(this.f27614e.f27605b, 0.0f, this.f27615f));
                if (!Float.isNaN(b10)) {
                    l10 = new L();
                    float abs = Math.abs(b10) * Math.signum(this.f27615f);
                    l10.f144345a = abs;
                    this.f27616g.invoke(kotlin.coroutines.jvm.internal.b.d(abs));
                    C5767h hVar = this.f27614e;
                    C5678A a10 = this.f27617h;
                    float f11 = l10.f144345a;
                    float f12 = this.f27615f;
                    C0443b bVar = new C0443b(l10, this.f27616g);
                    this.f27612c = l10;
                    this.f27613d = 1;
                    obj = hVar.l(a10, f11, f12, bVar, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else {
                    throw new IllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
                }
            } else if (i10 == 1) {
                l10 = (L) this.f27612c;
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C5550k kVar = (C5550k) obj;
            float a11 = this.f27614e.f27604a.a(((Number) kVar.p()).floatValue());
            if (!Float.isNaN(a11)) {
                l10.f144345a = a11;
                C5678A a12 = this.f27617h;
                C5550k g10 = C5552l.g(kVar, 0.0f, 0.0f, 0, 0, false, 30, (Object) null);
                C5546i f13 = this.f27614e.f27606c;
                a aVar = new a(l10, this.f27616g);
                this.f27612c = null;
                this.f27613d = 2;
                obj = C5768i.h(a12, a11, a11, g10, f13, aVar, this);
                return obj == f10 ? f10 : obj;
            }
            throw new IllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {110}, m = "performFling")
    /* renamed from: q0.h$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f27622c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5767h f27623d;

        /* renamed from: e  reason: collision with root package name */
        int f27624e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5767h hVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f27623d = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f27622c = obj;
            this.f27624e |= Integer.MIN_VALUE;
            return this.f27623d.b((C5678A) null, 0.0f, (C17642l<? super Float, C16807N>) null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior", f = "SnapFlingBehavior.kt", l = {187}, m = "tryApproach")
    /* renamed from: q0.h$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f27625c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5767h f27626d;

        /* renamed from: e  reason: collision with root package name */
        int f27627e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C5767h hVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f27626d = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f27625c = obj;
            this.f27627e |= Integer.MIN_VALUE;
            return this.f27626d.l((C5678A) null, 0.0f, 0.0f, (C17642l<? super Float, C16807N>) null, this);
        }
    }

    public C5767h(C5769j jVar, C5570z<Float> zVar, C5546i<Float> iVar) {
        this.f27604a = jVar;
        this.f27605b = zVar;
        this.f27606c = iVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: nI.l<? super java.lang.Float, XH.N>} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(p0.C5678A r11, float r12, nI.C17642l<? super java.lang.Float, XH.C16807N> r13, dI.C17164e<? super q0.C5760a<java.lang.Float, m0.C5554m>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof q0.C5767h.a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            q0.h$a r0 = (q0.C5767h.a) r0
            int r1 = r0.f27611f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f27611f = r1
            goto L_0x0018
        L_0x0013:
            q0.h$a r0 = new q0.h$a
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f27609d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f27611f
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r11 = r0.f27608c
            r13 = r11
            nI.l r13 = (nI.C17642l) r13
            XH.y.b(r14)
            goto L_0x0051
        L_0x002e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0036:
            XH.y.b(r14)
            i1.h r14 = r10.f27607d
            q0.h$b r2 = new q0.h$b
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r12
            r7 = r13
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f27608c = r13
            r0.f27611f = r3
            java.lang.Object r14 = QJ.C16310i.g(r14, r2, r0)
            if (r14 != r1) goto L_0x0051
            return r1
        L_0x0051:
            q0.a r14 = (q0.C5760a) r14
            r11 = 0
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.b.d(r11)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.C5767h.i(p0.A, float, nI.l, dI.e):java.lang.Object");
    }

    private final boolean j(float f10, float f11) {
        return Math.abs(C5523B.a(this.f27605b, 0.0f, f11)) >= Math.abs(f10);
    }

    private final Object k(C5678A a10, float f10, float f11, C17642l<? super Float, C16807N> lVar, C17164e<? super C5760a<Float, C5554m>> eVar) {
        return C5768i.i(a10, f10, f11, j(f10, f11) ? new C5762c(this.f27605b) : new C5772m(this.f27606c), lVar, eVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(p0.C5678A r19, float r20, float r21, nI.C17642l<? super java.lang.Float, XH.C16807N> r22, dI.C17164e<? super m0.C5550k<java.lang.Float, m0.C5554m>> r23) {
        /*
            r18 = this;
            r0 = r23
            boolean r1 = r0 instanceof q0.C5767h.d
            if (r1 == 0) goto L_0x0018
            r1 = r0
            q0.h$d r1 = (q0.C5767h.d) r1
            int r2 = r1.f27627e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.f27627e = r2
            r8 = r18
        L_0x0016:
            r7 = r1
            goto L_0x0020
        L_0x0018:
            q0.h$d r1 = new q0.h$d
            r8 = r18
            r1.<init>(r8, r0)
            goto L_0x0016
        L_0x0020:
            java.lang.Object r0 = r7.f27625c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r7.f27627e
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            XH.y.b(r0)
            goto L_0x0073
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            XH.y.b(r0)
            float r0 = java.lang.Math.abs(r20)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0046
            goto L_0x004e
        L_0x0046:
            float r0 = java.lang.Math.abs(r21)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0060
        L_0x004e:
            r16 = 28
            r17 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r9 = r20
            r10 = r21
            m0.k r0 = m0.C5552l.c(r9, r10, r11, r13, r15, r16, r17)
            goto L_0x0079
        L_0x0060:
            r7.f27627e = r3
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            java.lang.Object r0 = r2.k(r3, r4, r5, r6, r7)
            if (r0 != r1) goto L_0x0073
            return r1
        L_0x0073:
            q0.a r0 = (q0.C5760a) r0
            m0.k r0 = r0.c()
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.C5767h.l(p0.A, float, float, nI.l, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(p0.C5678A r5, float r6, nI.C17642l<? super java.lang.Float, XH.C16807N> r7, dI.C17164e<? super java.lang.Float> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof q0.C5767h.c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            q0.h$c r0 = (q0.C5767h.c) r0
            int r1 = r0.f27624e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f27624e = r1
            goto L_0x0018
        L_0x0013:
            q0.h$c r0 = new q0.h$c
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f27622c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f27624e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            XH.y.b(r8)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            XH.y.b(r8)
            r0.f27624e = r3
            java.lang.Object r8 = r4.i(r5, r6, r7, r0)
            if (r8 != r1) goto L_0x003d
            return r1
        L_0x003d:
            q0.a r8 = (q0.C5760a) r8
            java.lang.Object r5 = r8.a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            m0.k r6 = r8.b()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0053
            goto L_0x005d
        L_0x0053:
            java.lang.Object r5 = r6.p()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L_0x005d:
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.d(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.C5767h.b(p0.A, float, nI.l, dI.e):java.lang.Object");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5767h)) {
            return false;
        }
        C5767h hVar = (C5767h) obj;
        return C17542s.e(hVar.f27606c, this.f27606c) && C17542s.e(hVar.f27605b, this.f27605b) && C17542s.e(hVar.f27604a, this.f27604a);
    }

    public int hashCode() {
        return (((this.f27606c.hashCode() * 31) + this.f27605b.hashCode()) * 31) + this.f27604a.hashCode();
    }
}
