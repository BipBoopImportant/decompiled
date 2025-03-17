package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5562q;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\fJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010!\u001a\u00020\u001f8VX\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010 ¨\u0006\""}, d2 = {"Lm0/N0;", "Lm0/q;", "V", "Lm0/G0;", "", "dampingRatio", "stiffness", "Lm0/s;", "anims", "<init>", "(FFLm0/s;)V", "visibilityThreshold", "(FFLm0/q;)V", "initialValue", "targetValue", "initialVelocity", "", "c", "(Lm0/q;Lm0/q;Lm0/q;)J", "g", "(Lm0/q;Lm0/q;Lm0/q;)Lm0/q;", "playTimeNanos", "d", "(JLm0/q;Lm0/q;Lm0/q;)Lm0/q;", "e", "a", "F", "getDampingRatio", "()F", "b", "getStiffness", "", "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class N0<V extends C5562q> implements G0<V> {

    /* renamed from: d  reason: collision with root package name */
    public static final int f25605d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final float f25606a;

    /* renamed from: b  reason: collision with root package name */
    private final float f25607b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ H0<V> f25608c;

    private N0(float f10, float f11, C5563s sVar) {
        this.f25606a = f10;
        this.f25607b = f11;
        this.f25608c = new H0<>(sVar);
    }

    public boolean a() {
        return this.f25608c.a();
    }

    public long c(V v10, V v11, V v12) {
        return this.f25608c.c(v10, v11, v12);
    }

    public V d(long j10, V v10, V v11, V v12) {
        return this.f25608c.d(j10, v10, v11, v12);
    }

    public V e(long j10, V v10, V v11, V v12) {
        return this.f25608c.e(j10, v10, v11, v12);
    }

    public V g(V v10, V v11, V v12) {
        return this.f25608c.g(v10, v11, v12);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N0(float f10, float f11, C5562q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : qVar);
    }

    public N0(float f10, float f11, V v10) {
        this(f10, f11, D0.c(v10, f10, f11));
    }
}
