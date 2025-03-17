package N0;

import QJ.C16339x;
import QJ.C16343z;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import e2.C5295b;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5530a;
import m0.C5532b;
import m0.C5548j;
import m0.C5554m;
import m0.M;
import m0.y0;
import nI.C17642l;
import nI.p;
import o1.C5667g;
import o1.C5668h;
import o1.C5673m;
import p1.C5745u0;
import p1.C5747v0;
import p1.C5749w0;
import r1.g;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH@¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\nH@¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0014\u001a\u00020\n*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\n0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R+\u0010/\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068B@BX\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R+\u00101\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00068B@BX\u0002¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b&\u0010,\"\u0004\b0\u0010.\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, d2 = {"LN0/h;", "", "Lo1/g;", "origin", "", "radius", "", "bounded", "<init>", "(Lo1/g;FZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "LXH/N;", "f", "(LdI/e;)Ljava/lang/Object;", "g", "d", "h", "()V", "Lr1/f;", "Lp1/v0;", "color", "e", "(Lr1/f;J)V", "a", "Lo1/g;", "b", "F", "c", "Z", "Ljava/lang/Float;", "startRadius", "targetCenter", "Lm0/a;", "Lm0/m;", "Lm0/a;", "animatedAlpha", "animatedRadiusPercent", "animatedCenterPercent", "LQJ/x;", "i", "LQJ/x;", "finishSignalDeferred", "<set-?>", "j", "LU0/r0;", "()Z", "l", "(Z)V", "finishedFadingIn", "k", "finishRequested", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private C5667g f9198a;

    /* renamed from: b  reason: collision with root package name */
    private final float f9199b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9200c;

    /* renamed from: d  reason: collision with root package name */
    private Float f9201d;

    /* renamed from: e  reason: collision with root package name */
    private C5667g f9202e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C5530a<Float, C5554m> f9203f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C5530a<Float, C5554m> f9204g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C5530a<Float, C5554m> f9205h;

    /* renamed from: i  reason: collision with root package name */
    private final C16339x<C16807N> f9206i;

    /* renamed from: j  reason: collision with root package name */
    private final C4899r0 f9207j;

    /* renamed from: k  reason: collision with root package name */
    private final C4899r0 f9208k;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", l = {77, 79, 80}, m = "animate")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f9209c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f9210d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f9211e;

        /* renamed from: f  reason: collision with root package name */
        int f9212f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f9211e = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f9210d = obj;
            this.f9212f |= Integer.MIN_VALUE;
            return this.f9211e.d(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LQJ/F0;", "<anonymous>", "(LQJ/Q;)LQJ/F0;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super F0>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f9213c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f9214d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f9215e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$1", f = "RippleAnimation.kt", l = {86}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f9216c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h f9217d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f9217d = hVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f9217d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f9216c;
                if (i10 == 0) {
                    y.b(obj);
                    C5530a a10 = this.f9217d.f9203f;
                    Float d10 = kotlin.coroutines.jvm.internal.b.d(1.0f);
                    y0 j10 = C5548j.j(75, 0, M.e(), 2, (Object) null);
                    this.f9216c = 1;
                    if (C5530a.f(a10, d10, j10, (Object) null, (C17642l) null, this, 12, (Object) null) == f10) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$2", f = "RippleAnimation.kt", l = {92}, m = "invokeSuspend")
        /* renamed from: N0.h$b$b  reason: collision with other inner class name */
        static final class C0134b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f9218c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h f9219d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0134b(h hVar, C17164e<? super C0134b> eVar) {
                super(2, eVar);
                this.f9219d = hVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C0134b(this.f9219d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C0134b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f9218c;
                if (i10 == 0) {
                    y.b(obj);
                    C5530a c10 = this.f9219d.f9204g;
                    Float d10 = kotlin.coroutines.jvm.internal.b.d(1.0f);
                    y0 j10 = C5548j.j(225, 0, M.d(), 2, (Object) null);
                    this.f9218c = 1;
                    if (C5530a.f(c10, d10, j10, (Object) null, (C17642l) null, this, 12, (Object) null) == f10) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.material.ripple.RippleAnimation$fadeIn$2$3", f = "RippleAnimation.kt", l = {98}, m = "invokeSuspend")
        static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f9220c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h f9221d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(h hVar, C17164e<? super c> eVar) {
                super(2, eVar);
                this.f9221d = hVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new c(this.f9221d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f9220c;
                if (i10 == 0) {
                    y.b(obj);
                    C5530a b10 = this.f9221d.f9205h;
                    Float d10 = kotlin.coroutines.jvm.internal.b.d(1.0f);
                    y0 j10 = C5548j.j(225, 0, M.e(), 2, (Object) null);
                    this.f9220c = 1;
                    if (C5530a.f(b10, d10, j10, (Object) null, (C17642l) null, this, 12, (Object) null) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f9215e = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f9215e, eVar);
            bVar.f9214d = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super F0> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f9213c == 0) {
                y.b(obj);
                Q q10 = (Q) this.f9214d;
                F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new a(this.f9215e, (C17164e<? super a>) null), 3, (Object) null);
                F0 unused2 = C16314k.d(q10, (C17168i) null, (T) null, new C0134b(this.f9215e, (C17164e<? super C0134b>) null), 3, (Object) null);
                return C16314k.d(q10, (C17168i) null, (T) null, new c(this.f9215e, (C17164e<? super c>) null), 3, (Object) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LQJ/F0;", "<anonymous>", "(LQJ/Q;)LQJ/F0;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2", f = "RippleAnimation.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super F0>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f9222c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f9223d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f9224e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.material.ripple.RippleAnimation$fadeOut$2$1", f = "RippleAnimation.kt", l = {109}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f9225c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ h f9226d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f9226d = hVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f9226d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f9225c;
                if (i10 == 0) {
                    y.b(obj);
                    C5530a a10 = this.f9226d.f9203f;
                    Float d10 = kotlin.coroutines.jvm.internal.b.d(0.0f);
                    y0 j10 = C5548j.j(150, 0, M.e(), 2, (Object) null);
                    this.f9225c = 1;
                    if (C5530a.f(a10, d10, j10, (Object) null, (C17642l) null, this, 12, (Object) null) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f9224e = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f9224e, eVar);
            cVar.f9223d = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super F0> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f9222c == 0) {
                y.b(obj);
                return C16314k.d((Q) this.f9223d, (C17168i) null, (T) null, new a(this.f9224e, (C17164e<? super a>) null), 3, (Object) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public /* synthetic */ h(C5667g gVar, float f10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, f10, z10);
    }

    private final Object f(C17164e<? super C16807N> eVar) {
        Object f10 = S.f(new b(this, (C17164e<? super b>) null), eVar);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }

    private final Object g(C17164e<? super C16807N> eVar) {
        Object f10 = S.f(new c(this, (C17164e<? super c>) null), eVar);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }

    private final boolean i() {
        return ((Boolean) this.f9208k.getValue()).booleanValue();
    }

    private final boolean j() {
        return ((Boolean) this.f9207j.getValue()).booleanValue();
    }

    private final void k(boolean z10) {
        this.f9208k.setValue(Boolean.valueOf(z10));
    }

    private final void l(boolean z10) {
        this.f9207j.setValue(Boolean.valueOf(z10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(dI.C17164e<? super XH.C16807N> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof N0.h.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            N0.h$a r0 = (N0.h.a) r0
            int r1 = r0.f9212f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9212f = r1
            goto L_0x0018
        L_0x0013:
            N0.h$a r0 = new N0.h$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f9210d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f9212f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r5) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            XH.y.b(r7)
            goto L_0x0072
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0037:
            java.lang.Object r2 = r0.f9209c
            N0.h r2 = (N0.h) r2
            XH.y.b(r7)
            goto L_0x0066
        L_0x003f:
            java.lang.Object r2 = r0.f9209c
            N0.h r2 = (N0.h) r2
            XH.y.b(r7)
            goto L_0x0056
        L_0x0047:
            XH.y.b(r7)
            r0.f9209c = r6
            r0.f9212f = r5
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r2 = r6
        L_0x0056:
            r2.l(r5)
            QJ.x<XH.N> r7 = r2.f9206i
            r0.f9209c = r2
            r0.f9212f = r4
            java.lang.Object r7 = r7.f(r0)
            if (r7 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r7 = 0
            r0.f9209c = r7
            r0.f9212f = r3
            java.lang.Object r7 = r2.g(r0)
            if (r7 != r1) goto L_0x0072
            return r1
        L_0x0072:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.h.d(dI.e):java.lang.Object");
    }

    public final void e(r1.f fVar, long j10) {
        if (this.f9201d == null) {
            this.f9201d = Float.valueOf(i.b(fVar.b()));
        }
        if (this.f9198a == null) {
            this.f9198a = C5667g.d(fVar.N1());
        }
        if (this.f9202e == null) {
            this.f9202e = C5667g.d(C5668h.a(C5673m.l(fVar.b()) / 2.0f, C5673m.i(fVar.b()) / 2.0f));
        }
        float floatValue = (!i() || j()) ? this.f9203f.m().floatValue() : 1.0f;
        Float f10 = this.f9201d;
        C17542s.g(f10);
        float b10 = C5295b.b(f10.floatValue(), this.f9199b, this.f9204g.m().floatValue());
        C5667g gVar = this.f9198a;
        C17542s.g(gVar);
        float m10 = C5667g.m(gVar.v());
        C5667g gVar2 = this.f9202e;
        C17542s.g(gVar2);
        float b11 = C5295b.b(m10, C5667g.m(gVar2.v()), this.f9205h.m().floatValue());
        C5667g gVar3 = this.f9198a;
        C17542s.g(gVar3);
        float n10 = C5667g.n(gVar3.v());
        C5667g gVar4 = this.f9202e;
        C17542s.g(gVar4);
        long a10 = C5668h.a(b11, C5295b.b(n10, C5667g.n(gVar4.v()), this.f9205h.m().floatValue()));
        long o10 = C5747v0.o(j10, C5747v0.r(j10) * floatValue, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        if (this.f9200c) {
            float l10 = C5673m.l(fVar.b());
            float i10 = C5673m.i(fVar.b());
            int b12 = C5745u0.f27347a.b();
            r1.d I12 = fVar.I1();
            long b13 = I12.b();
            I12.e().t();
            try {
                I12.c().c(0.0f, 0.0f, l10, i10, b12);
                r1.f.G1(fVar, o10, b10, a10, 0.0f, (g) null, (C5749w0) null, 0, 120, (Object) null);
            } finally {
                I12.e().n();
                I12.g(b13);
            }
        } else {
            r1.f.G1(fVar, o10, b10, a10, 0.0f, (g) null, (C5749w0) null, 0, 120, (Object) null);
        }
    }

    public final void h() {
        k(true);
        this.f9206i.J(C16807N.f139792a);
    }

    private h(C5667g gVar, float f10, boolean z10) {
        this.f9198a = gVar;
        this.f9199b = f10;
        this.f9200c = z10;
        this.f9203f = C5532b.b(0.0f, 0.0f, 2, (Object) null);
        this.f9204g = C5532b.b(0.0f, 0.0f, 2, (Object) null);
        this.f9205h = C5532b.b(0.0f, 0.0f, 2, (Object) null);
        this.f9206i = C16343z.a((F0) null);
        Boolean bool = Boolean.FALSE;
        this.f9207j = u1.e(bool, (o1) null, 2, (Object) null);
        this.f9208k = u1.e(bool, (o1) null, 2, (Object) null);
    }
}
