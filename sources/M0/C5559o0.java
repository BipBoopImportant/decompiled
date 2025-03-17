package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0001\u0010\n*\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lm0/o0;", "T", "Lm0/N;", "", "dampingRatio", "stiffness", "visibilityThreshold", "<init>", "(FFLjava/lang/Object;)V", "Lm0/q;", "V", "Lm0/z0;", "converter", "Lm0/N0;", "i", "(Lm0/z0;)Lm0/N0;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "f", "()F", "b", "g", "c", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.o0  reason: case insensitive filesystem */
public final class C5559o0<T> implements N<T> {

    /* renamed from: a  reason: collision with root package name */
    private final float f25864a;

    /* renamed from: b  reason: collision with root package name */
    private final float f25865b;

    /* renamed from: c  reason: collision with root package name */
    private final T f25866c;

    public C5559o0() {
        this(0.0f, 0.0f, (Object) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5559o0)) {
            return false;
        }
        C5559o0 o0Var = (C5559o0) obj;
        return o0Var.f25864a == this.f25864a && o0Var.f25865b == this.f25865b && C17542s.e(o0Var.f25866c, this.f25866c);
    }

    public final float f() {
        return this.f25864a;
    }

    public final float g() {
        return this.f25865b;
    }

    public final T h() {
        return this.f25866c;
    }

    public int hashCode() {
        T t10 = this.f25866c;
        return ((((t10 != null ? t10.hashCode() : 0) * 31) + Float.hashCode(this.f25864a)) * 31) + Float.hashCode(this.f25865b);
    }

    /* renamed from: i */
    public <V extends C5562q> N0<V> a(z0<T, V> z0Var) {
        return new N0<>(this.f25864a, this.f25865b, C5548j.b(z0Var, this.f25866c));
    }

    public C5559o0(float f10, float f11, T t10) {
        this.f25864a = f10;
        this.f25865b = f11;
        this.f25866c = t10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5559o0(float f10, float f11, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : obj);
    }
}
