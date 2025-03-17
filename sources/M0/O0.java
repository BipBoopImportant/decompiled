package m0;

import kotlin.Metadata;
import m0.C5562q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001d¨\u0006\u001f"}, d2 = {"Lm0/O0;", "Lm0/q;", "V", "Lm0/F0;", "", "durationMillis", "delayMillis", "Lm0/D;", "easing", "<init>", "(IILm0/D;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "d", "(JLm0/q;Lm0/q;Lm0/q;)Lm0/q;", "e", "a", "I", "b", "()I", "f", "c", "Lm0/D;", "getEasing", "()Lm0/D;", "Lm0/H0;", "Lm0/H0;", "anim", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class O0<V extends C5562q> implements F0<V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f25609a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25610b;

    /* renamed from: c  reason: collision with root package name */
    private final C5525D f25611c;

    /* renamed from: d  reason: collision with root package name */
    private final H0<V> f25612d;

    public O0(int i10, int i11, C5525D d10) {
        this.f25609a = i10;
        this.f25610b = i11;
        this.f25611c = d10;
        this.f25612d = new H0<>((O) new T(b(), f(), d10));
    }

    public int b() {
        return this.f25609a;
    }

    public V d(long j10, V v10, V v11, V v12) {
        return this.f25612d.d(j10, v10, v11, v12);
    }

    public V e(long j10, V v10, V v11, V v12) {
        return this.f25612d.e(j10, v10, v11, v12);
    }

    public int f() {
        return this.f25610b;
    }
}
