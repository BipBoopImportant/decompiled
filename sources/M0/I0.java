package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m0.C5562q;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u001f\u0010\u0011\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00028\u00008\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0016\u0010\u0019\u001a\u00028\u00008\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0016\u0010\u001a\u001a\u00028\u00008\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u001b8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u0013\u0010\u001d¨\u0006\u001f"}, d2 = {"Lm0/I0;", "Lm0/q;", "V", "Lm0/E0;", "Lm0/P;", "floatDecaySpec", "<init>", "(Lm0/P;)V", "", "playTimeNanos", "initialValue", "initialVelocity", "d", "(JLm0/q;Lm0/q;)Lm0/q;", "b", "(Lm0/q;Lm0/q;)J", "e", "c", "(Lm0/q;Lm0/q;)Lm0/q;", "a", "Lm0/P;", "getFloatDecaySpec", "()Lm0/P;", "Lm0/q;", "valueVector", "velocityVector", "targetVector", "", "F", "()F", "absVelocityThreshold", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class I0<V extends C5562q> implements E0<V> {

    /* renamed from: a  reason: collision with root package name */
    private final P f25539a;

    /* renamed from: b  reason: collision with root package name */
    private V f25540b;

    /* renamed from: c  reason: collision with root package name */
    private V f25541c;

    /* renamed from: d  reason: collision with root package name */
    private V f25542d;

    /* renamed from: e  reason: collision with root package name */
    private final float f25543e;

    public I0(P p10) {
        this.f25539a = p10;
        this.f25543e = p10.a();
    }

    public float a() {
        return this.f25543e;
    }

    public long b(V v10, V v11) {
        if (this.f25541c == null) {
            this.f25541c = r.g(v10);
        }
        V v12 = this.f25541c;
        if (v12 == null) {
            C17542s.z("velocityVector");
            v12 = null;
        }
        int b10 = v12.b();
        long j10 = 0;
        for (int i10 = 0; i10 < b10; i10++) {
            j10 = Math.max(j10, this.f25539a.c(v10.a(i10), v11.a(i10)));
        }
        return j10;
    }

    public V c(V v10, V v11) {
        if (this.f25542d == null) {
            this.f25542d = r.g(v10);
        }
        V v12 = this.f25542d;
        if (v12 == null) {
            C17542s.z("targetVector");
            v12 = null;
        }
        int b10 = v12.b();
        for (int i10 = 0; i10 < b10; i10++) {
            V v13 = this.f25542d;
            if (v13 == null) {
                C17542s.z("targetVector");
                v13 = null;
            }
            v13.e(i10, this.f25539a.d(v10.a(i10), v11.a(i10)));
        }
        V v14 = this.f25542d;
        if (v14 != null) {
            return v14;
        }
        C17542s.z("targetVector");
        return null;
    }

    public V d(long j10, V v10, V v11) {
        if (this.f25540b == null) {
            this.f25540b = r.g(v10);
        }
        V v12 = this.f25540b;
        if (v12 == null) {
            C17542s.z("valueVector");
            v12 = null;
        }
        int b10 = v12.b();
        for (int i10 = 0; i10 < b10; i10++) {
            V v13 = this.f25540b;
            if (v13 == null) {
                C17542s.z("valueVector");
                v13 = null;
            }
            v13.e(i10, this.f25539a.e(j10, v10.a(i10), v11.a(i10)));
        }
        V v14 = this.f25540b;
        if (v14 != null) {
            return v14;
        }
        C17542s.z("valueVector");
        return null;
    }

    public V e(long j10, V v10, V v11) {
        if (this.f25541c == null) {
            this.f25541c = r.g(v10);
        }
        V v12 = this.f25541c;
        if (v12 == null) {
            C17542s.z("velocityVector");
            v12 = null;
        }
        int b10 = v12.b();
        for (int i10 = 0; i10 < b10; i10++) {
            V v13 = this.f25541c;
            if (v13 == null) {
                C17542s.z("velocityVector");
                v13 = null;
            }
            v13.e(i10, this.f25539a.b(j10, v10.a(i10), v11.a(i10)));
        }
        V v14 = this.f25541c;
        if (v14 != null) {
            return v14;
        }
        C17542s.z("velocityVector");
        return null;
    }
}
