package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m0.C5562q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\"¨\u0006$"}, d2 = {"Lm0/q0;", "Lm0/q;", "V", "Lm0/C0;", "vectorizedAnimationSpec", "", "startDelayNanos", "<init>", "(Lm0/C0;J)V", "initialValue", "targetValue", "initialVelocity", "c", "(Lm0/q;Lm0/q;Lm0/q;)J", "playTimeNanos", "e", "(JLm0/q;Lm0/q;Lm0/q;)Lm0/q;", "d", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm0/C0;", "getVectorizedAnimationSpec", "()Lm0/C0;", "b", "J", "getStartDelayNanos", "()J", "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class q0<V extends C5562q> implements C0<V> {

    /* renamed from: a  reason: collision with root package name */
    private final C0<V> f25874a;

    /* renamed from: b  reason: collision with root package name */
    private final long f25875b;

    public q0(C0<V> c02, long j10) {
        this.f25874a = c02;
        this.f25875b = j10;
    }

    public boolean a() {
        return this.f25874a.a();
    }

    public long c(V v10, V v11, V v12) {
        return this.f25874a.c(v10, v11, v12) + this.f25875b;
    }

    public V d(long j10, V v10, V v11, V v12) {
        long j11 = this.f25875b;
        return j10 < j11 ? v10 : this.f25874a.d(j10 - j11, v10, v11, v12);
    }

    public V e(long j10, V v10, V v11, V v12) {
        long j11 = this.f25875b;
        return j10 < j11 ? v12 : this.f25874a.e(j10 - j11, v10, v11, v12);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return q0Var.f25875b == this.f25875b && C17542s.e(q0Var.f25874a, this.f25874a);
    }

    public int hashCode() {
        return (this.f25874a.hashCode() * 31) + Long.hashCode(this.f25875b);
    }
}
