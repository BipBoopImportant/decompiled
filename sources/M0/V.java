package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f\"\b\b\u0001\u0010\f*\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Lm0/V;", "T", "Lm0/i;", "Lm0/C;", "animation", "Lm0/i0;", "repeatMode", "Lm0/r0;", "initialStartOffset", "<init>", "(Lm0/C;Lm0/i0;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lm0/q;", "V", "Lm0/z0;", "converter", "Lm0/C0;", "a", "(Lm0/z0;)Lm0/C0;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lm0/C;", "getAnimation", "()Lm0/C;", "b", "Lm0/i0;", "getRepeatMode", "()Lm0/i0;", "c", "J", "getInitialStartOffset-Rmkjzm4", "()J", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class V<T> implements C5546i<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final int f25628d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C5524C<T> f25629a;

    /* renamed from: b  reason: collision with root package name */
    private final C5547i0 f25630b;

    /* renamed from: c  reason: collision with root package name */
    private final long f25631c;

    public /* synthetic */ V(C5524C c10, C5547i0 i0Var, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c10, i0Var, j10);
    }

    public <V extends C5562q> C0<V> a(z0<T, V> z0Var) {
        return new J0(this.f25629a.a(z0Var), this.f25630b, this.f25631c, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        return C17542s.e(v10.f25629a, this.f25629a) && v10.f25630b == this.f25630b && r0.d(v10.f25631c, this.f25631c);
    }

    public int hashCode() {
        return (((this.f25629a.hashCode() * 31) + this.f25630b.hashCode()) * 31) + r0.e(this.f25631c);
    }

    private V(C5524C<T> c10, C5547i0 i0Var, long j10) {
        this.f25629a = c10;
        this.f25630b = i0Var;
        this.f25631c = j10;
    }
}
