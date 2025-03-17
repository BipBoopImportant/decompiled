package FF;

import IJ.C15906b;
import IJ.C15908d;
import IJ.C15909e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5562q;
import m0.G0;
import m0.N0;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LFF/c;", "Lm0/q;", "V", "Lm0/G0;", "", "delayInMillis", "<init>", "(I)V", "initialValue", "targetValue", "initialVelocity", "", "c", "(Lm0/q;Lm0/q;Lm0/q;)J", "playTimeNanos", "d", "(JLm0/q;Lm0/q;Lm0/q;)Lm0/q;", "e", "a", "J", "getDelayDuration", "()J", "delayDuration", "Lm0/N0;", "b", "Lm0/N0;", "getSpringSpec", "()Lm0/N0;", "springSpec", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: FF.c  reason: case insensitive filesystem */
public final class C12886c<V extends C5562q> implements G0<V> {

    /* renamed from: c  reason: collision with root package name */
    public static final int f109859c = N0.f25605d;

    /* renamed from: a  reason: collision with root package name */
    private final long f109860a;

    /* renamed from: b  reason: collision with root package name */
    private final N0<V> f109861b = new N0(0.0f, 0.0f, (C5562q) null, 7, (DefaultConstructorMarker) null);

    public C12886c(int i10) {
        C15906b.a aVar = C15906b.f135496b;
        this.f109860a = C15906b.M(C15908d.s(i10, C15909e.MILLISECONDS));
    }

    public long c(V v10, V v11, V v12) {
        C17542s.j(v10, "initialValue");
        C17542s.j(v11, "targetValue");
        C17542s.j(v12, "initialVelocity");
        return this.f109861b.c(v10, v11, v12) + this.f109860a;
    }

    public V d(long j10, V v10, V v11, V v12) {
        C17542s.j(v10, "initialValue");
        C17542s.j(v11, "targetValue");
        C17542s.j(v12, "initialVelocity");
        return this.f109861b.d(Math.max(0, j10 - this.f109860a), v10, v11, v12);
    }

    public V e(long j10, V v10, V v11, V v12) {
        C17542s.j(v10, "initialValue");
        C17542s.j(v11, "targetValue");
        C17542s.j(v12, "initialVelocity");
        return this.f109861b.e(Math.max(0, j10 - this.f109860a), v10, v11, v12);
    }
}
