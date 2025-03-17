package m0;

import U0.A1;
import U0.C4899r0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5562q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b&\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BM\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00008V@PX\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010%\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00028\u00018\u0006@@X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8F@@X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8F@@X\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b&\u0010)\"\u0004\b-\u0010+R*\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f8\u0006@@X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0011\u00105\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b4\u0010\u001b¨\u00066"}, d2 = {"Lm0/k;", "T", "Lm0/q;", "V", "LU0/A1;", "Lm0/z0;", "typeConverter", "initialValue", "initialVelocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "<init>", "(Lm0/z0;Ljava/lang/Object;Lm0/q;JJZ)V", "", "toString", "()Ljava/lang/String;", "a", "Lm0/z0;", "m", "()Lm0/z0;", "<set-?>", "b", "LU0/r0;", "getValue", "()Ljava/lang/Object;", "x", "(Ljava/lang/Object;)V", "value", "c", "Lm0/q;", "s", "()Lm0/q;", "y", "(Lm0/q;)V", "velocityVector", "d", "J", "i", "()J", "v", "(J)V", "e", "u", "f", "Z", "t", "()Z", "w", "(Z)V", "p", "velocity", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.k  reason: case insensitive filesystem */
public final class C5550k<T, V extends C5562q> implements A1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final z0<T, V> f25840a;

    /* renamed from: b  reason: collision with root package name */
    private final C4899r0 f25841b;

    /* renamed from: c  reason: collision with root package name */
    private V f25842c;

    /* renamed from: d  reason: collision with root package name */
    private long f25843d;

    /* renamed from: e  reason: collision with root package name */
    private long f25844e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25845f;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r5 = m0.r.e(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5550k(m0.z0<T, V> r3, T r4, V r5, long r6, long r8, boolean r10) {
        /*
            r2 = this;
            r2.<init>()
            r2.f25840a = r3
            r0 = 0
            r1 = 2
            U0.r0 r0 = U0.u1.e(r4, r0, r1, r0)
            r2.f25841b = r0
            if (r5 == 0) goto L_0x0015
            m0.q r5 = m0.r.e(r5)
            if (r5 != 0) goto L_0x0019
        L_0x0015:
            m0.q r5 = m0.C5552l.i(r3, r4)
        L_0x0019:
            r2.f25842c = r5
            r2.f25843d = r6
            r2.f25844e = r8
            r2.f25845f = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C5550k.<init>(m0.z0, java.lang.Object, m0.q, long, long, boolean):void");
    }

    public final long d() {
        return this.f25844e;
    }

    public T getValue() {
        return this.f25841b.getValue();
    }

    public final long i() {
        return this.f25843d;
    }

    public final z0<T, V> m() {
        return this.f25840a;
    }

    public final T p() {
        return this.f25840a.b().invoke(this.f25842c);
    }

    public final V s() {
        return this.f25842c;
    }

    public final boolean t() {
        return this.f25845f;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + p() + ", isRunning=" + this.f25845f + ", lastFrameTimeNanos=" + this.f25843d + ", finishedTimeNanos=" + this.f25844e + ')';
    }

    public final void u(long j10) {
        this.f25844e = j10;
    }

    public final void v(long j10) {
        this.f25843d = j10;
    }

    public final void w(boolean z10) {
        this.f25845f = z10;
    }

    public void x(T t10) {
        this.f25841b.setValue(t10);
    }

    public final void y(V v10) {
        this.f25842c = v10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5550k(z0 z0Var, Object obj, C5562q qVar, long j10, long j11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z0Var, obj, (i10 & 4) != 0 ? null : qVar, (i10 & 8) != 0 ? Long.MIN_VALUE : j10, (i10 & 16) != 0 ? Long.MIN_VALUE : j11, (i10 & 32) != 0 ? false : z10);
    }
}
