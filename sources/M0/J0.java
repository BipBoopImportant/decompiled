package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5562q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0018\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J/\u0010\u0019\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J'\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\u00020\f8\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u0014\u0010'\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010&¨\u0006("}, d2 = {"Lm0/J0;", "Lm0/q;", "V", "Lm0/C0;", "Lm0/F0;", "animation", "Lm0/i0;", "repeatMode", "Lm0/r0;", "initialStartOffset", "<init>", "(Lm0/F0;Lm0/i0;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "playTimeNanos", "h", "(J)J", "start", "startVelocity", "end", "i", "(JLm0/q;Lm0/q;Lm0/q;)Lm0/q;", "initialValue", "targetValue", "initialVelocity", "d", "e", "c", "(Lm0/q;Lm0/q;Lm0/q;)J", "a", "Lm0/F0;", "b", "Lm0/i0;", "J", "getDurationNanos$animation_core_release", "()J", "durationNanos", "initialOffsetNanos", "", "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class J0<V extends C5562q> implements C0<V> {

    /* renamed from: a  reason: collision with root package name */
    private final F0<V> f25544a;

    /* renamed from: b  reason: collision with root package name */
    private final C5547i0 f25545b;

    /* renamed from: c  reason: collision with root package name */
    private final long f25546c;

    /* renamed from: d  reason: collision with root package name */
    private final long f25547d;

    public /* synthetic */ J0(F0 f02, C5547i0 i0Var, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f02, i0Var, j10);
    }

    private final long h(long j10) {
        long j11 = this.f25547d;
        if (j10 + j11 <= 0) {
            return 0;
        }
        long j12 = j10 + j11;
        long j13 = this.f25546c;
        long j14 = j12 / j13;
        return (this.f25545b == C5547i0.Restart || j14 % ((long) 2) == 0) ? j12 - (j14 * j13) : ((j14 + 1) * j13) - j12;
    }

    private final V i(long j10, V v10, V v11, V v12) {
        long j11 = this.f25547d;
        long j12 = this.f25546c;
        return j10 + j11 > j12 ? this.f25544a.e(j12 - j11, v10, v12, v11) : v11;
    }

    public boolean a() {
        return true;
    }

    public long c(V v10, V v11, V v12) {
        return Long.MAX_VALUE;
    }

    public V d(long j10, V v10, V v11, V v12) {
        return this.f25544a.d(h(j10), v10, v11, i(j10, v10, v12, v11));
    }

    public V e(long j10, V v10, V v11, V v12) {
        return this.f25544a.e(h(j10), v10, v11, i(j10, v10, v12, v11));
    }

    private J0(F0<V> f02, C5547i0 i0Var, long j10) {
        this.f25544a = f02;
        this.f25545b = i0Var;
        this.f25546c = ((long) (f02.f() + f02.b())) * 1000000;
        this.f25547d = j10 * 1000000;
    }
}
