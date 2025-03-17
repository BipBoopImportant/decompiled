package m0;

import QJ.C16320n;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import U0.C4884j0;
import U0.C4892n0;
import U0.C4899r0;
import U0.D0;
import U0.o1;
import XH.C16807N;
import XH.y;
import YH.C16870n;
import bK.C17052a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import j0.L;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import pI.C17752b;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 h*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002/*B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H@¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00028\u0000H@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00028\u00002\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000eH@¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0007H@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007H@¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0007H@¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010#\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007H@¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0007H@¢\u0006\u0004\b&\u0010\u001cJ\u000f\u0010'\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010\u0017J\u000f\u0010(\u001a\u00020\u0007H\u0002¢\u0006\u0004\b(\u0010\u0017R+\u0010\u0006\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u00008V@PX\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010\u0005R+\u00101\u001a\u00028\u00002\u0006\u0010)\u001a\u00028\u00008V@PX\u0002¢\u0006\u0012\n\u0004\b.\u0010+\u001a\u0004\b/\u0010,\"\u0004\b0\u0010\u0005R\"\u00104\u001a\u00028\u00008\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b0\u00102\u001a\u0004\b3\u0010,\"\u0004\b\u0001\u0010\u0005R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010;\u001a\u00020!8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0014\u00107\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00070<8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010=R+\u0010\u000b\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n8G@BX\u0002¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR*\u0010L\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010E8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010R\u001a\u00020M8\u0000X\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u00107R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001f0Y8\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b]\u0010^R \u0010c\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00070`8\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bd\u00103R \u0010g\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00070`8\u0002X\u0004¢\u0006\u0006\n\u0004\bf\u0010b¨\u0006i"}, d2 = {"Lm0/j0;", "S", "Lm0/x0;", "initialState", "<init>", "(Ljava/lang/Object;)V", "targetState", "LXH/N;", "X", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "", "fraction", "P", "(FLjava/lang/Object;LdI/e;)Ljava/lang/Object;", "Lm0/N;", "animationSpec", "B", "(Ljava/lang/Object;Lm0/N;LdI/e;)Ljava/lang/Object;", "Lm0/v0;", "transition", "f", "(Lm0/v0;)V", "g", "()V", "L", "M", "E", "O", "(LdI/e;)Ljava/lang/Object;", "D", "A", "Lm0/j0$b;", "animation", "", "deltaPlayTimeNanos", "N", "(Lm0/j0$b;J)V", "Z", "Y", "K", "R", "<set-?>", "b", "LU0/r0;", "()Ljava/lang/Object;", "V", "c", "a", "d", "currentState", "Ljava/lang/Object;", "F", "composedTargetState", "e", "Lm0/v0;", "J", "()J", "W", "(J)V", "totalDurationNanos", "Lkotlin/Function0;", "LnI/a;", "recalculateTotalDurationNanos", "h", "LU0/n0;", "I", "()F", "U", "(F)V", "LQJ/n;", "i", "LQJ/n;", "G", "()LQJ/n;", "T", "(LQJ/n;)V", "compositionContinuation", "LbK/a;", "j", "LbK/a;", "H", "()LbK/a;", "compositionContinuationMutex", "Lm0/g0;", "k", "Lm0/g0;", "mutatorMutex", "l", "lastFrameTimeNanos", "Lj0/L;", "m", "Lj0/L;", "initialValueAnimations", "n", "Lm0/j0$b;", "currentAnimation", "Lkotlin/Function1;", "o", "LnI/l;", "firstFrameLambda", "p", "durationScale", "q", "animateOneFrameLambda", "r", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.j0  reason: case insensitive filesystem */
public final class C5549j0<S> extends x0<S> {
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final a f25764r = new a((DefaultConstructorMarker) null);

    /* renamed from: s  reason: collision with root package name */
    public static final int f25765s = 8;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public static final C5554m f25766t = new C5554m(0.0f);
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public static final C5554m f25767u = new C5554m(1.0f);

    /* renamed from: b  reason: collision with root package name */
    private final C4899r0 f25768b;

    /* renamed from: c  reason: collision with root package name */
    private final C4899r0 f25769c;

    /* renamed from: d  reason: collision with root package name */
    private S f25770d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public v0<S> f25771e;

    /* renamed from: f  reason: collision with root package name */
    private long f25772f;

    /* renamed from: g  reason: collision with root package name */
    private final C17631a<C16807N> f25773g = new f(this);

    /* renamed from: h  reason: collision with root package name */
    private final C4892n0 f25774h = D0.a(0.0f);

    /* renamed from: i  reason: collision with root package name */
    private C16320n<? super S> f25775i;

    /* renamed from: j  reason: collision with root package name */
    private final C17052a f25776j = bK.g.b(false, 1, (Object) null);

    /* renamed from: k  reason: collision with root package name */
    private final C5543g0 f25777k = new C5543g0();
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public long f25778l = Long.MIN_VALUE;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final L<b> f25779m = new L<>(0, 1, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public b f25780n;

    /* renamed from: o  reason: collision with root package name */
    private final C17642l<Long, C16807N> f25781o = new e(this);
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public float f25782p;

    /* renamed from: q  reason: collision with root package name */
    private final C17642l<Long, C16807N> f25783q = new c(this);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lm0/j0$a;", "", "<init>", "()V", "Lm0/m;", "ZeroVelocity", "Lm0/m;", "b", "()Lm0/m;", "Target1", "a", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: m0.j0$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5554m a() {
            return C5549j0.f25767u;
        }

        public final C5554m b() {
            return C5549j0.f25766t;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\b\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010,\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010.\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010'\u001a\u0004\b \u0010)\"\u0004\b-\u0010+R\"\u00100\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b/\u0010\rR\"\u00102\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b1\u0010\r¨\u00063"}, d2 = {"Lm0/j0$b;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "a", "J", "e", "()J", "n", "(J)V", "progressNanos", "Lm0/C0;", "Lm0/m;", "b", "Lm0/C0;", "()Lm0/C0;", "i", "(Lm0/C0;)V", "animationSpec", "", "c", "Z", "h", "()Z", "k", "(Z)V", "isComplete", "", "d", "F", "g", "()F", "o", "(F)V", "value", "Lm0/m;", "f", "()Lm0/m;", "setStart", "(Lm0/m;)V", "start", "m", "initialVelocity", "l", "durationNanos", "j", "animationSpecDuration", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: m0.j0$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private long f25784a;

        /* renamed from: b  reason: collision with root package name */
        private C0<C5554m> f25785b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f25786c;

        /* renamed from: d  reason: collision with root package name */
        private float f25787d;

        /* renamed from: e  reason: collision with root package name */
        private C5554m f25788e = new C5554m(0.0f);

        /* renamed from: f  reason: collision with root package name */
        private C5554m f25789f;

        /* renamed from: g  reason: collision with root package name */
        private long f25790g;

        /* renamed from: h  reason: collision with root package name */
        private long f25791h;

        public final C0<C5554m> a() {
            return this.f25785b;
        }

        public final long b() {
            return this.f25791h;
        }

        public final long c() {
            return this.f25790g;
        }

        public final C5554m d() {
            return this.f25789f;
        }

        public final long e() {
            return this.f25784a;
        }

        public final C5554m f() {
            return this.f25788e;
        }

        public final float g() {
            return this.f25787d;
        }

        public final boolean h() {
            return this.f25786c;
        }

        public final void i(C0<C5554m> c02) {
            this.f25785b = c02;
        }

        public final void j(long j10) {
            this.f25791h = j10;
        }

        public final void k(boolean z10) {
            this.f25786c = z10;
        }

        public final void l(long j10) {
            this.f25790g = j10;
        }

        public final void m(C5554m mVar) {
            this.f25789f = mVar;
        }

        public final void n(long j10) {
            this.f25784a = j10;
        }

        public final void o(float f10) {
            this.f25787d = f10;
        }

        public String toString() {
            return "progress nanos: " + this.f25784a + ", animationSpec: " + this.f25785b + ", isComplete: " + this.f25786c + ", value: " + this.f25787d + ", start: " + this.f25788e + ", initialVelocity: " + this.f25789f + ", durationNanos: " + this.f25790g + ", animationSpecDuration: " + this.f25791h;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "", "frameTimeNanos", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: m0.j0$c */
    static final class c extends C17544u implements C17642l<Long, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5549j0<S> f25792c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5549j0<S> j0Var) {
            super(1);
            this.f25792c = j0Var;
        }

        public final void a(long j10) {
            this.f25792c.f25778l = j10;
            long f10 = C17752b.f(((double) (j10 - this.f25792c.f25778l)) / ((double) this.f25792c.f25782p));
            if (this.f25792c.f25779m.d()) {
                L m10 = this.f25792c.f25779m;
                C5549j0<S> j0Var = this.f25792c;
                Object[] objArr = m10.f24557a;
                int i10 = m10.f24558b;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    b bVar = (b) objArr[i12];
                    j0Var.N(bVar, f10);
                    bVar.k(true);
                }
                v0 p10 = this.f25792c.f25771e;
                if (p10 != null) {
                    p10.Q();
                }
                L m11 = this.f25792c.f25779m;
                int i13 = m11.f24558b;
                Object[] objArr2 = m11.f24557a;
                C17974j w10 = C17978n.w(0, i13);
                int p11 = w10.p();
                int q10 = w10.q();
                if (p11 <= q10) {
                    while (true) {
                        objArr2[p11 - i11] = objArr2[p11];
                        if (((b) objArr2[p11]).h()) {
                            i11++;
                        }
                        if (p11 == q10) {
                            break;
                        }
                        p11++;
                    }
                }
                C16870n.x(objArr2, null, i13 - i11, i13);
                m11.f24558b -= i11;
            }
            b k10 = this.f25792c.f25780n;
            if (k10 != null) {
                k10.l(this.f25792c.J());
                this.f25792c.N(k10, f10);
                this.f25792c.U(k10.g());
                if (k10.g() == 1.0f) {
                    this.f25792c.f25780n = null;
                }
                this.f25792c.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", l = {623}, m = "invokeSuspend")
    /* renamed from: m0.j0$d */
    static final class d extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f25793c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v0<S> f25794d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5549j0<S> f25795e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ S f25796f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ N<Float> f25797g;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", l = {2191, 636, 638, 690, 692}, m = "invokeSuspend")
        /* renamed from: m0.j0$d$a */
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f25798c;

            /* renamed from: d  reason: collision with root package name */
            Object f25799d;

            /* renamed from: e  reason: collision with root package name */
            int f25800e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C5549j0<S> f25801f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ S f25802g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ v0<S> f25803h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ N<Float> f25804i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C5549j0<S> j0Var, S s10, v0<S> v0Var, N<Float> n10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f25801f = j0Var;
                this.f25802g = s10;
                this.f25803h = v0Var;
                this.f25804i = n10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f25801f, this.f25802g, this.f25803h, this.f25804i, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:30:0x00b7 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
            /* JADX WARNING: Removed duplicated region for block: B:73:0x01e7 A[RETURN] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                /*
                    r18 = this;
                    r1 = r18
                    java.lang.Object r0 = eI.C17187b.f()
                    int r2 = r1.f25800e
                    r3 = 5
                    r4 = 4
                    r5 = 3
                    r6 = 2
                    r7 = 1
                    r8 = 0
                    r10 = 0
                    r11 = 0
                    if (r2 == 0) goto L_0x0045
                    if (r2 == r7) goto L_0x0039
                    if (r2 == r6) goto L_0x0034
                    if (r2 == r5) goto L_0x002f
                    if (r2 == r4) goto L_0x002a
                    if (r2 != r3) goto L_0x0022
                    XH.y.b(r19)
                    goto L_0x01e8
                L_0x0022:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r2)
                    throw r0
                L_0x002a:
                    XH.y.b(r19)
                    goto L_0x01d6
                L_0x002f:
                    XH.y.b(r19)
                    goto L_0x00b8
                L_0x0034:
                    XH.y.b(r19)
                    goto L_0x00ad
                L_0x0039:
                    java.lang.Object r2 = r1.f25799d
                    m0.j0 r2 = (m0.C5549j0) r2
                    java.lang.Object r7 = r1.f25798c
                    bK.a r7 = (bK.C17052a) r7
                    XH.y.b(r19)
                    goto L_0x008f
                L_0x0045:
                    XH.y.b(r19)
                    m0.j0<S> r2 = r1.f25801f
                    java.lang.Object r2 = r2.b()
                    S r12 = r1.f25802g
                    boolean r12 = kotlin.jvm.internal.C17542s.e(r12, r2)
                    if (r12 != 0) goto L_0x0078
                    m0.j0<S> r12 = r1.f25801f
                    r12.K()
                    m0.j0<S> r12 = r1.f25801f
                    r12.U(r10)
                    m0.v0<S> r12 = r1.f25803h
                    S r13 = r1.f25802g
                    r12.R(r13)
                    m0.v0<S> r12 = r1.f25803h
                    r12.J(r8)
                    m0.j0<S> r12 = r1.f25801f
                    r12.d(r2)
                    m0.j0<S> r2 = r1.f25801f
                    S r12 = r1.f25802g
                    r2.V(r12)
                L_0x0078:
                    m0.j0<S> r2 = r1.f25801f
                    bK.a r2 = r2.H()
                    m0.j0<S> r12 = r1.f25801f
                    r1.f25798c = r2
                    r1.f25799d = r12
                    r1.f25800e = r7
                    java.lang.Object r7 = r2.e(r11, r1)
                    if (r7 != r0) goto L_0x008d
                    return r0
                L_0x008d:
                    r7 = r2
                    r2 = r12
                L_0x008f:
                    java.lang.Object r2 = r2.F()     // Catch:{ all -> 0x01f0 }
                    r7.d(r11)
                    S r7 = r1.f25802g
                    boolean r2 = kotlin.jvm.internal.C17542s.e(r7, r2)
                    if (r2 != 0) goto L_0x00b8
                    m0.j0<S> r2 = r1.f25801f
                    r1.f25798c = r11
                    r1.f25799d = r11
                    r1.f25800e = r6
                    java.lang.Object r2 = r2.D(r1)
                    if (r2 != r0) goto L_0x00ad
                    return r0
                L_0x00ad:
                    m0.j0<S> r2 = r1.f25801f
                    r1.f25800e = r5
                    java.lang.Object r2 = r2.Z(r1)
                    if (r2 != r0) goto L_0x00b8
                    return r0
                L_0x00b8:
                    m0.j0<S> r2 = r1.f25801f
                    java.lang.Object r2 = r2.a()
                    S r5 = r1.f25802g
                    boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r5)
                    if (r2 != 0) goto L_0x01ed
                    m0.j0<S> r2 = r1.f25801f
                    float r2 = r2.I()
                    r5 = 1065353216(0x3f800000, float:1.0)
                    int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                    if (r2 >= 0) goto L_0x01c7
                    m0.j0<S> r2 = r1.f25801f
                    m0.j0$b r2 = r2.f25780n
                    m0.N<java.lang.Float> r6 = r1.f25804i
                    if (r6 == 0) goto L_0x00e7
                    kotlin.jvm.internal.l r7 = kotlin.jvm.internal.C17536l.f144385a
                    m0.z0 r7 = m0.B0.f(r7)
                    m0.G0 r6 = r6.a(r7)
                    goto L_0x00e8
                L_0x00e7:
                    r6 = r11
                L_0x00e8:
                    if (r2 == 0) goto L_0x00f4
                    m0.C0 r7 = r2.a()
                    boolean r7 = kotlin.jvm.internal.C17542s.e(r6, r7)
                    if (r7 != 0) goto L_0x01c7
                L_0x00f4:
                    if (r2 == 0) goto L_0x00fc
                    m0.C0 r7 = r2.a()
                    r12 = r7
                    goto L_0x00fd
                L_0x00fc:
                    r12 = r11
                L_0x00fd:
                    if (r12 == 0) goto L_0x0126
                    long r13 = r2.e()
                    m0.m r15 = r2.f()
                    m0.j0$a r5 = m0.C5549j0.f25764r
                    m0.m r16 = r5.a()
                    m0.m r5 = r2.d()
                    if (r5 != 0) goto L_0x011d
                    m0.j0$a r5 = m0.C5549j0.f25764r
                    m0.m r5 = r5.b()
                L_0x011d:
                    r17 = r5
                    m0.q r5 = r12.e(r13, r15, r16, r17)
                    m0.m r5 = (m0.C5554m) r5
                    goto L_0x0163
                L_0x0126:
                    if (r2 == 0) goto L_0x015b
                    long r12 = r2.e()
                    int r7 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                    if (r7 != 0) goto L_0x0131
                    goto L_0x015b
                L_0x0131:
                    long r12 = r2.c()
                    r14 = -9223372036854775808
                    int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                    if (r7 != 0) goto L_0x0141
                    m0.j0<S> r7 = r1.f25801f
                    long r12 = r7.J()
                L_0x0141:
                    float r7 = (float) r12
                    r12 = 1315859240(0x4e6e6b28, float:1.0E9)
                    float r7 = r7 / r12
                    int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
                    if (r12 > 0) goto L_0x0153
                    m0.j0$a r5 = m0.C5549j0.f25764r
                    m0.m r5 = r5.b()
                    goto L_0x0163
                L_0x0153:
                    m0.m r12 = new m0.m
                    float r5 = r5 / r7
                    r12.<init>(r5)
                    r5 = r12
                    goto L_0x0163
                L_0x015b:
                    m0.j0$a r5 = m0.C5549j0.f25764r
                    m0.m r5 = r5.b()
                L_0x0163:
                    if (r2 != 0) goto L_0x016a
                    m0.j0$b r2 = new m0.j0$b
                    r2.<init>()
                L_0x016a:
                    r2.i(r6)
                    r7 = 0
                    r2.k(r7)
                    m0.j0<S> r12 = r1.f25801f
                    float r12 = r12.I()
                    r2.o(r12)
                    m0.m r12 = r2.f()
                    m0.j0<S> r13 = r1.f25801f
                    float r13 = r13.I()
                    r12.e(r7, r13)
                    m0.j0<S> r7 = r1.f25801f
                    long r12 = r7.J()
                    r2.l(r12)
                    r2.n(r8)
                    r2.m(r5)
                    if (r6 == 0) goto L_0x01a9
                    m0.m r7 = r2.f()
                    m0.j0$a r8 = m0.C5549j0.f25764r
                    m0.m r8 = r8.a()
                    long r5 = r6.c(r7, r8, r5)
                    goto L_0x01bf
                L_0x01a9:
                    m0.j0<S> r5 = r1.f25801f
                    long r5 = r5.J()
                    double r5 = (double) r5
                    m0.j0<S> r7 = r1.f25801f
                    float r7 = r7.I()
                    double r7 = (double) r7
                    r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                    double r12 = r12 - r7
                    double r5 = r5 * r12
                    long r5 = pI.C17752b.f(r5)
                L_0x01bf:
                    r2.j(r5)
                    m0.j0<S> r5 = r1.f25801f
                    r5.f25780n = r2
                L_0x01c7:
                    m0.j0<S> r2 = r1.f25801f
                    r1.f25798c = r11
                    r1.f25799d = r11
                    r1.f25800e = r4
                    java.lang.Object r2 = r2.O(r1)
                    if (r2 != r0) goto L_0x01d6
                    return r0
                L_0x01d6:
                    m0.j0<S> r2 = r1.f25801f
                    S r4 = r1.f25802g
                    r2.d(r4)
                    m0.j0<S> r2 = r1.f25801f
                    r1.f25800e = r3
                    java.lang.Object r2 = r2.Y(r1)
                    if (r2 != r0) goto L_0x01e8
                    return r0
                L_0x01e8:
                    m0.j0<S> r0 = r1.f25801f
                    r0.U(r10)
                L_0x01ed:
                    XH.N r0 = XH.C16807N.f139792a
                    return r0
                L_0x01f0:
                    r0 = move-exception
                    r2 = r0
                    r7.d(r11)
                    throw r2
                */
                throw new UnsupportedOperationException("Method not decompiled: m0.C5549j0.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(v0<S> v0Var, C5549j0<S> j0Var, S s10, N<Float> n10, C17164e<? super d> eVar) {
            super(1, eVar);
            this.f25794d = v0Var;
            this.f25795e = j0Var;
            this.f25796f = s10;
            this.f25797g = n10;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new d(this.f25794d, this.f25795e, this.f25796f, this.f25797g, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((d) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f25793c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = new a(this.f25795e, this.f25796f, this.f25794d, this.f25797g, (C17164e<? super a>) null);
                this.f25793c = 1;
                if (S.f(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f25794d.z();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "", "frameTimeNanos", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: m0.j0$e */
    static final class e extends C17544u implements C17642l<Long, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5549j0<S> f25805c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C5549j0<S> j0Var) {
            super(1);
            this.f25805c = j0Var;
        }

        public final void a(long j10) {
            this.f25805c.f25778l = j10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: m0.j0$f */
    static final class f extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5549j0<S> f25806c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C5549j0<S> j0Var) {
            super(0);
            this.f25806c = j0Var;
        }

        public final void invoke() {
            C5549j0<S> j0Var = this.f25806c;
            v0 p10 = j0Var.f25771e;
            j0Var.W(p10 != null ? p10.q() : 0);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {370, 373}, m = "runAnimations")
    /* renamed from: m0.j0$g */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f25807c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f25808d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C5549j0<S> f25809e;

        /* renamed from: f  reason: collision with root package name */
        int f25810f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C5549j0<S> j0Var, C17164e<? super g> eVar) {
            super(eVar);
            this.f25809e = j0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f25808d = obj;
            this.f25810f |= Integer.MIN_VALUE;
            return this.f25809e.O(this);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", l = {509}, m = "invokeSuspend")
    /* renamed from: m0.j0$h */
    static final class h extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f25811c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ S f25812d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ S f25813e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5549j0<S> f25814f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ v0<S> f25815g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f25816h;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", l = {531}, m = "invokeSuspend")
        /* renamed from: m0.j0$h$a */
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f25817c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f25818d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ S f25819e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ S f25820f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C5549j0<S> f25821g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ v0<S> f25822h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ float f25823i;

            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", f = "Transition.kt", l = {527}, m = "invokeSuspend")
            /* renamed from: m0.j0$h$a$a  reason: collision with other inner class name */
            static final class C0412a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f25824c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C5549j0<S> f25825d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0412a(C5549j0<S> j0Var, C17164e<? super C0412a> eVar) {
                    super(2, eVar);
                    this.f25825d = j0Var;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C0412a(this.f25825d, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C0412a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f25824c;
                    if (i10 == 0) {
                        y.b(obj);
                        C5549j0<S> j0Var = this.f25825d;
                        this.f25824c = 1;
                        if (j0Var.O(this) == f10) {
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
            a(S s10, S s11, C5549j0<S> j0Var, v0<S> v0Var, float f10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f25819e = s10;
                this.f25820f = s11;
                this.f25821g = j0Var;
                this.f25822h = v0Var;
                this.f25823i = f10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f25819e, this.f25820f, this.f25821g, this.f25822h, this.f25823i, eVar);
                aVar.f25818d = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f25817c;
                if (i10 == 0) {
                    y.b(obj);
                    Q q10 = (Q) this.f25818d;
                    if (!C17542s.e(this.f25819e, this.f25820f)) {
                        this.f25821g.K();
                    } else {
                        this.f25821g.f25780n = null;
                        if (C17542s.e(this.f25821g.a(), this.f25819e)) {
                            return C16807N.f139792a;
                        }
                    }
                    if (!C17542s.e(this.f25819e, this.f25820f)) {
                        this.f25822h.R(this.f25819e);
                        this.f25822h.J(0);
                        this.f25821g.V(this.f25819e);
                        this.f25822h.E(this.f25823i);
                    }
                    this.f25821g.U(this.f25823i);
                    if (this.f25821g.f25779m.d()) {
                        F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new C0412a(this.f25821g, (C17164e<? super C0412a>) null), 3, (Object) null);
                    } else {
                        this.f25821g.f25778l = Long.MIN_VALUE;
                    }
                    C5549j0<S> j0Var = this.f25821g;
                    this.f25817c = 1;
                    if (j0Var.Z(this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f25821g.R();
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(S s10, S s11, C5549j0<S> j0Var, v0<S> v0Var, float f10, C17164e<? super h> eVar) {
            super(1, eVar);
            this.f25812d = s10;
            this.f25813e = s11;
            this.f25814f = j0Var;
            this.f25815g = v0Var;
            this.f25816h = f10;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new h(this.f25812d, this.f25813e, this.f25814f, this.f25815g, this.f25816h, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((h) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f25811c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = new a(this.f25812d, this.f25813e, this.f25814f, this.f25815g, this.f25816h, (C17164e<? super a>) null);
                this.f25811c = 1;
                if (S.f(aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", l = {477}, m = "invokeSuspend")
    /* renamed from: m0.j0$i */
    static final class i extends l implements C17642l<C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f25826c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5549j0<S> f25827d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ S f25828e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ v0<S> f25829f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C5549j0<S> j0Var, S s10, v0<S> v0Var, C17164e<? super i> eVar) {
            super(1, eVar);
            this.f25827d = j0Var;
            this.f25828e = s10;
            this.f25829f = v0Var;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new i(this.f25827d, this.f25828e, this.f25829f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super C16807N> eVar) {
            return ((i) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f25826c;
            if (i10 == 0) {
                y.b(obj);
                this.f25827d.E();
                this.f25827d.f25778l = Long.MIN_VALUE;
                this.f25827d.U(0.0f);
                S s10 = this.f25828e;
                float f11 = C17542s.e(s10, this.f25827d.a()) ? -4.0f : C17542s.e(s10, this.f25827d.b()) ? -5.0f : -3.0f;
                this.f25829f.R(this.f25828e);
                this.f25829f.J(0);
                this.f25827d.V(this.f25828e);
                this.f25827d.U(0.0f);
                this.f25827d.d(this.f25828e);
                this.f25829f.E(f11);
                if (f11 == -3.0f) {
                    C5549j0<S> j0Var = this.f25827d;
                    this.f25826c = 1;
                    if (j0Var.Z(this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f25829f.z();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {566, 2186}, m = "waitForComposition")
    /* renamed from: m0.j0$j */
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f25830c;

        /* renamed from: d  reason: collision with root package name */
        Object f25831d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f25832e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5549j0<S> f25833f;

        /* renamed from: g  reason: collision with root package name */
        int f25834g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C5549j0<S> j0Var, C17164e<? super j> eVar) {
            super(eVar);
            this.f25833f = j0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f25832e = obj;
            this.f25834g |= Integer.MIN_VALUE;
            return this.f25833f.Y(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", l = {542, 2186}, m = "waitForCompositionAfterTargetStateChange")
    /* renamed from: m0.j0$k */
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f25835c;

        /* renamed from: d  reason: collision with root package name */
        Object f25836d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f25837e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5549j0<S> f25838f;

        /* renamed from: g  reason: collision with root package name */
        int f25839g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C5549j0<S> j0Var, C17164e<? super k> eVar) {
            super(eVar);
            this.f25838f = j0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f25837e = obj;
            this.f25839g |= Integer.MIN_VALUE;
            return this.f25838f.Z(this);
        }
    }

    public C5549j0(S s10) {
        super((DefaultConstructorMarker) null);
        this.f25768b = u1.e(s10, (o1) null, 2, (Object) null);
        this.f25769c = u1.e(s10, (o1) null, 2, (Object) null);
        this.f25770d = s10;
    }

    private final Object A(C17164e<? super C16807N> eVar) {
        float n10 = t0.n(eVar.getContext());
        if (n10 <= 0.0f) {
            E();
            return C16807N.f139792a;
        }
        this.f25782p = n10;
        Object c10 = C4884j0.c(this.f25783q, eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public static /* synthetic */ Object C(C5549j0 j0Var, Object obj, N n10, C17164e eVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = j0Var.b();
        }
        if ((i10 & 2) != 0) {
            n10 = null;
        }
        return j0Var.B(obj, n10, eVar);
    }

    /* access modifiers changed from: private */
    public final Object D(C17164e<? super C16807N> eVar) {
        if (this.f25778l == Long.MIN_VALUE) {
            Object c10 = C4884j0.c(this.f25781o, eVar);
            return c10 == C17187b.f() ? c10 : C16807N.f139792a;
        }
        Object A10 = A(eVar);
        return A10 == C17187b.f() ? A10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void E() {
        v0<S> v0Var = this.f25771e;
        if (v0Var != null) {
            v0Var.g();
        }
        this.f25779m.h();
        if (this.f25780n != null) {
            this.f25780n = null;
            U(1.0f);
            R();
        }
    }

    /* access modifiers changed from: private */
    public final void K() {
        v0<S> v0Var = this.f25771e;
        if (v0Var != null) {
            b bVar = this.f25780n;
            if (bVar == null) {
                if (this.f25772f <= 0 || I() == 1.0f || C17542s.e(a(), b())) {
                    bVar = null;
                } else {
                    bVar = new b();
                    bVar.o(I());
                    long j10 = this.f25772f;
                    bVar.l(j10);
                    bVar.j(C17752b.f(((double) j10) * (1.0d - ((double) I()))));
                    bVar.f().e(0, I());
                }
            }
            if (bVar != null) {
                bVar.l(this.f25772f);
                this.f25779m.g(bVar);
                v0Var.I(bVar);
            }
            this.f25780n = null;
        }
    }

    /* access modifiers changed from: private */
    public final void N(b bVar, long j10) {
        long e10 = bVar.e() + j10;
        bVar.n(e10);
        long b10 = bVar.b();
        if (e10 >= b10) {
            bVar.o(1.0f);
            return;
        }
        C0<C5554m> a10 = bVar.a();
        if (a10 != null) {
            C5554m f10 = bVar.f();
            C5554m mVar = f25767u;
            C5554m d10 = bVar.d();
            if (d10 == null) {
                d10 = f25766t;
            }
            bVar.o(C17978n.l(a10.d(e10, f10, mVar, d10).a(0), 0.0f, 1.0f));
            return;
        }
        bVar.o(B0.k(bVar.f().a(0), 1.0f, ((float) e10) / ((float) b10)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0083 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(dI.C17164e<? super XH.C16807N> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof m0.C5549j0.g
            if (r0 == 0) goto L_0x0013
            r0 = r10
            m0.j0$g r0 = (m0.C5549j0.g) r0
            int r1 = r0.f25810f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f25810f = r1
            goto L_0x0018
        L_0x0013:
            m0.j0$g r0 = new m0.j0$g
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f25808d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f25810f
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            if (r2 == 0) goto L_0x003b
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0033:
            java.lang.Object r2 = r0.f25807c
            m0.j0 r2 = (m0.C5549j0) r2
            XH.y.b(r10)
            goto L_0x0076
        L_0x003b:
            XH.y.b(r10)
            j0.L<m0.j0$b> r10 = r9.f25779m
            boolean r10 = r10.c()
            if (r10 == 0) goto L_0x004d
            m0.j0$b r10 = r9.f25780n
            if (r10 != 0) goto L_0x004d
            XH.N r10 = XH.C16807N.f139792a
            return r10
        L_0x004d:
            dI.i r10 = r0.getContext()
            float r10 = m0.t0.n(r10)
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 != 0) goto L_0x0062
            r9.E()
            r9.f25778l = r5
            XH.N r10 = XH.C16807N.f139792a
            return r10
        L_0x0062:
            long r7 = r9.f25778l
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x0075
            nI.l<java.lang.Long, XH.N> r10 = r9.f25781o
            r0.f25807c = r9
            r0.f25810f = r4
            java.lang.Object r10 = U0.C4884j0.c(r10, r0)
            if (r10 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r2 = r9
        L_0x0076:
            j0.L<m0.j0$b> r10 = r2.f25779m
            boolean r10 = r10.d()
            if (r10 != 0) goto L_0x0088
            m0.j0$b r10 = r2.f25780n
            if (r10 == 0) goto L_0x0083
            goto L_0x0088
        L_0x0083:
            r2.f25778l = r5
            XH.N r10 = XH.C16807N.f139792a
            return r10
        L_0x0088:
            r0.f25807c = r2
            r0.f25810f = r3
            java.lang.Object r10 = r2.A(r0)
            if (r10 != r1) goto L_0x0076
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C5549j0.O(dI.e):java.lang.Object");
    }

    public static /* synthetic */ Object Q(C5549j0 j0Var, float f10, Object obj, C17164e eVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = j0Var.b();
        }
        return j0Var.P(f10, obj, eVar);
    }

    /* access modifiers changed from: private */
    public final void R() {
        v0<S> v0Var = this.f25771e;
        if (v0Var != null) {
            v0Var.H(C17752b.f(((double) I()) * ((double) v0Var.q())));
        }
    }

    /* access modifiers changed from: private */
    public final void U(float f10) {
        this.f25774h.n(f10);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Y(dI.C17164e<? super XH.C16807N> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof m0.C5549j0.j
            if (r0 == 0) goto L_0x0013
            r0 = r8
            m0.j0$j r0 = (m0.C5549j0.j) r0
            int r1 = r0.f25834g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f25834g = r1
            goto L_0x0018
        L_0x0013:
            m0.j0$j r0 = new m0.j0$j
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f25832e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f25834g
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r5) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r1 = r0.f25831d
            java.lang.Object r0 = r0.f25830c
            m0.j0 r0 = (m0.C5549j0) r0
            XH.y.b(r8)
            goto L_0x008c
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003b:
            java.lang.Object r2 = r0.f25831d
            java.lang.Object r6 = r0.f25830c
            m0.j0 r6 = (m0.C5549j0) r6
            XH.y.b(r8)
            r8 = r2
            goto L_0x005d
        L_0x0046:
            XH.y.b(r8)
            java.lang.Object r8 = r7.b()
            bK.a r2 = r7.f25776j
            r0.f25830c = r7
            r0.f25831d = r8
            r0.f25834g = r5
            java.lang.Object r2 = bK.C17052a.C3460a.a(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r6 = r7
        L_0x005d:
            r0.f25830c = r6
            r0.f25831d = r8
            r0.f25834g = r3
            QJ.p r2 = new QJ.p
            dI.e r3 = eI.C17187b.c(r0)
            r2.<init>(r3, r5)
            r2.C()
            r6.T(r2)
            bK.a r3 = r6.H()
            bK.C17052a.C3460a.c(r3, r4, r5, r4)
            java.lang.Object r2 = r2.w()
            java.lang.Object r3 = eI.C17187b.f()
            if (r2 != r3) goto L_0x0086
            kotlin.coroutines.jvm.internal.h.c(r0)
        L_0x0086:
            if (r2 != r1) goto L_0x0089
            return r1
        L_0x0089:
            r1 = r8
            r8 = r2
            r0 = r6
        L_0x008c:
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r1)
            if (r8 == 0) goto L_0x0095
            XH.N r8 = XH.C16807N.f139792a
            return r8
        L_0x0095:
            r1 = -9223372036854775808
            r0.f25778l = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "targetState while waiting for composition"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C5549j0.Y(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Z(dI.C17164e<? super XH.C16807N> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof m0.C5549j0.k
            if (r0 == 0) goto L_0x0013
            r0 = r8
            m0.j0$k r0 = (m0.C5549j0.k) r0
            int r1 = r0.f25839g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f25839g = r1
            goto L_0x0018
        L_0x0013:
            m0.j0$k r0 = new m0.j0$k
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f25837e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f25839g
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r5) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r1 = r0.f25836d
            java.lang.Object r0 = r0.f25835c
            m0.j0 r0 = (m0.C5549j0) r0
            XH.y.b(r8)
            goto L_0x009a
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003b:
            java.lang.Object r2 = r0.f25836d
            java.lang.Object r6 = r0.f25835c
            m0.j0 r6 = (m0.C5549j0) r6
            XH.y.b(r8)
            r8 = r2
            goto L_0x005d
        L_0x0046:
            XH.y.b(r8)
            java.lang.Object r8 = r7.b()
            bK.a r2 = r7.f25776j
            r0.f25835c = r7
            r0.f25836d = r8
            r0.f25839g = r5
            java.lang.Object r2 = bK.C17052a.C3460a.a(r2, r4, r0, r5, r4)
            if (r2 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r6 = r7
        L_0x005d:
            S r2 = r6.f25770d
            boolean r2 = kotlin.jvm.internal.C17542s.e(r8, r2)
            if (r2 == 0) goto L_0x006b
            bK.a r8 = r6.f25776j
            bK.C17052a.C3460a.c(r8, r4, r5, r4)
            goto L_0x00a0
        L_0x006b:
            r0.f25835c = r6
            r0.f25836d = r8
            r0.f25839g = r3
            QJ.p r2 = new QJ.p
            dI.e r3 = eI.C17187b.c(r0)
            r2.<init>(r3, r5)
            r2.C()
            r6.T(r2)
            bK.a r3 = r6.H()
            bK.C17052a.C3460a.c(r3, r4, r5, r4)
            java.lang.Object r2 = r2.w()
            java.lang.Object r3 = eI.C17187b.f()
            if (r2 != r3) goto L_0x0094
            kotlin.coroutines.jvm.internal.h.c(r0)
        L_0x0094:
            if (r2 != r1) goto L_0x0097
            return r1
        L_0x0097:
            r1 = r8
            r8 = r2
            r0 = r6
        L_0x009a:
            boolean r2 = kotlin.jvm.internal.C17542s.e(r8, r1)
            if (r2 == 0) goto L_0x00a3
        L_0x00a0:
            XH.N r8 = XH.C16807N.f139792a
            return r8
        L_0x00a3:
            r2 = -9223372036854775808
            r0.f25778l = r2
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "snapTo() was canceled because state was changed to "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = " instead of "
            r2.append(r8)
            r2.append(r1)
            java.lang.String r8 = r2.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C5549j0.Z(dI.e):java.lang.Object");
    }

    public final Object B(S s10, N<Float> n10, C17164e<? super C16807N> eVar) {
        v0<S> v0Var = this.f25771e;
        if (v0Var == null) {
            return C16807N.f139792a;
        }
        Object e10 = C5543g0.e(this.f25777k, (C5539e0) null, new d(v0Var, this, s10, n10, (C17164e<? super d>) null), eVar, 1, (Object) null);
        return e10 == C17187b.f() ? e10 : C16807N.f139792a;
    }

    public final S F() {
        return this.f25770d;
    }

    public final C16320n<S> G() {
        return this.f25775i;
    }

    public final C17052a H() {
        return this.f25776j;
    }

    public final float I() {
        return this.f25774h.a();
    }

    public final long J() {
        return this.f25772f;
    }

    public final void L() {
        w0.e().o(this, w0.f25997a, this.f25773g);
    }

    public final void M() {
        long j10 = this.f25772f;
        L();
        long j11 = this.f25772f;
        if (j10 != j11) {
            b bVar = this.f25780n;
            if (bVar != null) {
                bVar.l(j11);
                if (bVar.a() == null) {
                    bVar.j(C17752b.f((1.0d - ((double) bVar.f().a(0))) * ((double) this.f25772f)));
                }
            } else if (j11 != 0) {
                R();
            }
        }
    }

    public final Object P(float f10, S s10, C17164e<? super C16807N> eVar) {
        boolean z10 = false;
        if (0.0f <= f10 && f10 <= 1.0f) {
            z10 = true;
        }
        if (!z10) {
            C5545h0.a("Expecting fraction between 0 and 1. Got " + f10);
        }
        v0<S> v0Var = this.f25771e;
        if (v0Var == null) {
            return C16807N.f139792a;
        }
        Object e10 = C5543g0.e(this.f25777k, (C5539e0) null, new h(s10, b(), this, v0Var, f10, (C17164e<? super h>) null), eVar, 1, (Object) null);
        return e10 == C17187b.f() ? e10 : C16807N.f139792a;
    }

    public final void S(S s10) {
        this.f25770d = s10;
    }

    public final void T(C16320n<? super S> nVar) {
        this.f25775i = nVar;
    }

    public void V(S s10) {
        this.f25768b.setValue(s10);
    }

    public final void W(long j10) {
        this.f25772f = j10;
    }

    public final Object X(S s10, C17164e<? super C16807N> eVar) {
        v0<S> v0Var = this.f25771e;
        if (v0Var == null) {
            return C16807N.f139792a;
        }
        if (C17542s.e(a(), s10) && C17542s.e(b(), s10)) {
            return C16807N.f139792a;
        }
        Object e10 = C5543g0.e(this.f25777k, (C5539e0) null, new i(this, s10, v0Var, (C17164e<? super i>) null), eVar, 1, (Object) null);
        return e10 == C17187b.f() ? e10 : C16807N.f139792a;
    }

    public S a() {
        return this.f25769c.getValue();
    }

    public S b() {
        return this.f25768b.getValue();
    }

    public void d(S s10) {
        this.f25769c.setValue(s10);
    }

    public void f(v0<S> v0Var) {
        v0<S> v0Var2 = this.f25771e;
        if (!(v0Var2 == null || C17542s.e(v0Var, v0Var2))) {
            C5545h0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f25771e + ", new instance: " + v0Var);
        }
        this.f25771e = v0Var;
    }

    public void g() {
        this.f25771e = null;
        w0.e().k(this);
    }
}
