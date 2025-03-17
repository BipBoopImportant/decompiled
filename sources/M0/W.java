package m0;

import QJ.Q;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.L;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bR\u00020\u00000\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R+\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R+\u0010)\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!¨\u0006*"}, d2 = {"Lm0/W;", "", "", "label", "<init>", "(Ljava/lang/String;)V", "", "playTimeNanos", "LXH/N;", "i", "(J)V", "Lm0/W$a;", "animation", "f", "(Lm0/W$a;)V", "j", "k", "(LU0/m;I)V", "a", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "LW0/b;", "b", "LW0/b;", "_animations", "", "<set-?>", "c", "LU0/r0;", "g", "()Z", "l", "(Z)V", "refreshChildNeeded", "d", "J", "startTimeNanos", "e", "h", "m", "isRunning", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class W {

    /* renamed from: f  reason: collision with root package name */
    public static final int f25632f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final String f25633a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final W0.b<a<?, ?>> f25634b = new W0.b<>(new a[16], 0);

    /* renamed from: c  reason: collision with root package name */
    private final C4899r0 f25635c = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public long f25636d = Long.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    private final C4899r0 f25637e = u1.e(Boolean.TRUE, (o1) null, 2, (Object) null);

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BC\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0005\u001a\u00028\u00008\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u00028\u00008\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b'\u0010(R+\u0010.\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u00008V@PX\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR0\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0006@BX\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102RB\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001032\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001038\u0006@@X\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020;8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010=R\u0016\u0010F\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lm0/W$a;", "T", "Lm0/q;", "V", "LU0/A1;", "initialValue", "targetValue", "Lm0/z0;", "typeConverter", "Lm0/i;", "animationSpec", "", "label", "<init>", "(Lm0/W;Ljava/lang/Object;Ljava/lang/Object;Lm0/z0;Lm0/i;Ljava/lang/String;)V", "LXH/N;", "v", "(Ljava/lang/Object;Ljava/lang/Object;Lm0/i;)V", "", "playTimeNanos", "p", "(J)V", "u", "()V", "s", "a", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "setInitialValue$animation_core_release", "(Ljava/lang/Object;)V", "b", "i", "setTargetValue$animation_core_release", "c", "Lm0/z0;", "getTypeConverter", "()Lm0/z0;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", "e", "LU0/r0;", "getValue", "t", "value", "f", "Lm0/i;", "getAnimationSpec", "()Lm0/i;", "Lm0/u0;", "g", "Lm0/u0;", "getAnimation", "()Lm0/u0;", "setAnimation$animation_core_release", "(Lm0/u0;)V", "animation", "", "h", "Z", "m", "()Z", "setFinished$animation_core_release", "(Z)V", "isFinished", "startOnTheNextFrame", "j", "J", "playTimeNanosOffset", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class a<T, V extends C5562q> implements A1<T> {

        /* renamed from: a  reason: collision with root package name */
        private T f25638a;

        /* renamed from: b  reason: collision with root package name */
        private T f25639b;

        /* renamed from: c  reason: collision with root package name */
        private final z0<T, V> f25640c;

        /* renamed from: d  reason: collision with root package name */
        private final String f25641d;

        /* renamed from: e  reason: collision with root package name */
        private final C4899r0 f25642e;

        /* renamed from: f  reason: collision with root package name */
        private C5546i<T> f25643f;

        /* renamed from: g  reason: collision with root package name */
        private u0<T, V> f25644g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f25645h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f25646i;

        /* renamed from: j  reason: collision with root package name */
        private long f25647j;

        public a(T t10, T t11, z0<T, V> z0Var, C5546i<T> iVar, String str) {
            this.f25638a = t10;
            this.f25639b = t11;
            this.f25640c = z0Var;
            this.f25641d = str;
            this.f25642e = u1.e(t10, (o1) null, 2, (Object) null);
            this.f25643f = iVar;
            this.f25644g = new u0(this.f25643f, z0Var, this.f25638a, this.f25639b, (C5562q) null, 16, (DefaultConstructorMarker) null);
        }

        public final T d() {
            return this.f25638a;
        }

        public T getValue() {
            return this.f25642e.getValue();
        }

        public final T i() {
            return this.f25639b;
        }

        public final boolean m() {
            return this.f25645h;
        }

        public final void p(long j10) {
            W.this.l(false);
            if (this.f25646i) {
                this.f25646i = false;
                this.f25647j = j10;
            }
            long j11 = j10 - this.f25647j;
            t(this.f25644g.f(j11));
            this.f25645h = this.f25644g.c(j11);
        }

        public final void s() {
            this.f25646i = true;
        }

        public void t(T t10) {
            this.f25642e.setValue(t10);
        }

        public final void u() {
            t(this.f25644g.g());
            this.f25646i = true;
        }

        public final void v(T t10, T t11, C5546i<T> iVar) {
            this.f25638a = t10;
            this.f25639b = t11;
            this.f25643f = iVar;
            this.f25644g = new u0(iVar, this.f25640c, t10, t11, (C5562q) null, 16, (DefaultConstructorMarker) null);
            W.this.l(true);
            this.f25645h = false;
            this.f25646i = true;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", f = "InfiniteTransition.kt", l = {181, 205}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f25649c;

        /* renamed from: d  reason: collision with root package name */
        int f25650d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f25651e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4899r0<A1<Long>> f25652f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ W f25653g;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends C17544u implements C17642l<Long, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4899r0<A1<Long>> f25654c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ W f25655d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ L f25656e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Q f25657f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C4899r0<A1<Long>> r0Var, W w10, L l10, Q q10) {
                super(1);
                this.f25654c = r0Var;
                this.f25655d = w10;
                this.f25656e = l10;
                this.f25657f = q10;
            }

            public final void a(long j10) {
                A1 value = this.f25654c.getValue();
                long longValue = value != null ? ((Number) value.getValue()).longValue() : j10;
                int i10 = 0;
                if (this.f25655d.f25636d == Long.MIN_VALUE || this.f25656e.f144345a != t0.n(this.f25657f.getCoroutineContext())) {
                    this.f25655d.f25636d = j10;
                    W0.b b10 = this.f25655d.f25634b;
                    int r10 = b10.r();
                    if (r10 > 0) {
                        Object[] q10 = b10.q();
                        int i11 = 0;
                        do {
                            ((a) q10[i11]).s();
                            i11++;
                        } while (i11 < r10);
                    }
                    this.f25656e.f144345a = t0.n(this.f25657f.getCoroutineContext());
                }
                if (this.f25656e.f144345a == 0.0f) {
                    W0.b b11 = this.f25655d.f25634b;
                    int r11 = b11.r();
                    if (r11 > 0) {
                        Object[] q11 = b11.q();
                        do {
                            ((a) q11[i10]).u();
                            i10++;
                        } while (i10 < r11);
                        return;
                    }
                    return;
                }
                this.f25655d.i((long) (((float) (longValue - this.f25655d.f25636d)) / this.f25656e.f144345a));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).longValue());
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: m0.W$b$b  reason: collision with other inner class name */
        static final class C0409b extends C17544u implements C17631a<Float> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Q f25658c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0409b(Q q10) {
                super(0);
                this.f25658c = q10;
            }

            /* renamed from: b */
            public final Float invoke() {
                return Float.valueOf(t0.n(this.f25658c.getCoroutineContext()));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H@"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
        @f(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend")
        static final class c extends l implements p<Float, C17164e<? super Boolean>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f25659c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ float f25660d;

            c(C17164e<? super c> eVar) {
                super(2, eVar);
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                c cVar = new c(eVar);
                cVar.f25660d = ((Number) obj).floatValue();
                return cVar;
            }

            public final Object i(float f10, C17164e<? super Boolean> eVar) {
                return ((c) create(Float.valueOf(f10), eVar)).invokeSuspend(C16807N.f139792a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return i(((Number) obj).floatValue(), (C17164e) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f25659c == 0) {
                    y.b(obj);
                    return kotlin.coroutines.jvm.internal.b.a(this.f25660d > 0.0f);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C4899r0<A1<Long>> r0Var, W w10, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f25652f = r0Var;
            this.f25653g = w10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f25652f, this.f25653g, eVar);
            bVar.f25651e = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0055 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r7.f25650d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0030
                if (r1 == r3) goto L_0x0023
                if (r1 != r2) goto L_0x001b
                java.lang.Object r1 = r7.f25649c
                kotlin.jvm.internal.L r1 = (kotlin.jvm.internal.L) r1
                java.lang.Object r4 = r7.f25651e
                QJ.Q r4 = (QJ.Q) r4
                XH.y.b(r8)
                r8 = r4
                goto L_0x0040
            L_0x001b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0023:
                java.lang.Object r1 = r7.f25649c
                kotlin.jvm.internal.L r1 = (kotlin.jvm.internal.L) r1
                java.lang.Object r4 = r7.f25651e
                QJ.Q r4 = (QJ.Q) r4
                XH.y.b(r8)
                r8 = r4
                goto L_0x0056
            L_0x0030:
                XH.y.b(r8)
                java.lang.Object r8 = r7.f25651e
                QJ.Q r8 = (QJ.Q) r8
                kotlin.jvm.internal.L r1 = new kotlin.jvm.internal.L
                r1.<init>()
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.f144345a = r4
            L_0x0040:
                m0.W$b$a r4 = new m0.W$b$a
                U0.r0<U0.A1<java.lang.Long>> r5 = r7.f25652f
                m0.W r6 = r7.f25653g
                r4.<init>(r5, r6, r1, r8)
                r7.f25651e = r8
                r7.f25649c = r1
                r7.f25650d = r3
                java.lang.Object r4 = m0.U.a(r4, r7)
                if (r4 != r0) goto L_0x0056
                return r0
            L_0x0056:
                float r4 = r1.f144345a
                r5 = 0
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 != 0) goto L_0x0040
                m0.W$b$b r4 = new m0.W$b$b
                r4.<init>(r8)
                TJ.g r4 = U0.p1.r(r4)
                m0.W$b$c r5 = new m0.W$b$c
                r6 = 0
                r5.<init>(r6)
                r7.f25651e = r8
                r7.f25649c = r1
                r7.f25650d = r2
                java.lang.Object r4 = TJ.C16534i.C(r4, r5, r7)
                if (r4 != r0) goto L_0x0040
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.W.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ W f25661c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f25662d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(W w10, int i10) {
            super(2);
            this.f25661c = w10;
            this.f25662d = i10;
        }

        public final void a(C4889m mVar, int i10) {
            this.f25661c.k(mVar, M0.a(this.f25662d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public W(String str) {
        this.f25633a = str;
    }

    private final boolean g() {
        return ((Boolean) this.f25635c.getValue()).booleanValue();
    }

    private final boolean h() {
        return ((Boolean) this.f25637e.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public final void i(long j10) {
        boolean z10;
        W0.b<a<?, ?>> bVar = this.f25634b;
        int r10 = bVar.r();
        if (r10 > 0) {
            Object[] q10 = bVar.q();
            z10 = true;
            int i10 = 0;
            do {
                a aVar = (a) q10[i10];
                if (!aVar.m()) {
                    aVar.p(j10);
                }
                if (!aVar.m()) {
                    z10 = false;
                }
                i10++;
            } while (i10 < r10);
        } else {
            z10 = true;
        }
        m(!z10);
    }

    /* access modifiers changed from: private */
    public final void l(boolean z10) {
        this.f25635c.setValue(Boolean.valueOf(z10));
    }

    private final void m(boolean z10) {
        this.f25637e.setValue(Boolean.valueOf(z10));
    }

    public final void f(a<?, ?> aVar) {
        this.f25634b.b(aVar);
        l(true);
    }

    public final void j(a<?, ?> aVar) {
        this.f25634b.y(aVar);
    }

    public final void k(C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-318043801);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-318043801, i11, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
            }
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                D10 = u1.e((Object) null, (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            if (h() || g()) {
                k10.W(1719915818);
                boolean F10 = k10.F(this);
                Object D11 = k10.D();
                if (F10 || D11 == aVar.a()) {
                    D11 = new b(r0Var, this, (C17164e<? super b>) null);
                    k10.u(D11);
                }
                P.g(this, (p) D11, k10, i11 & 14);
                k10.P();
            } else {
                k10.W(1721436120);
                k10.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new c(this, i10));
        }
    }
}
