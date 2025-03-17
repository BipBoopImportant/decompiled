package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lm0/k0;", "T", "Lm0/C;", "", "delay", "<init>", "(I)V", "Lm0/q;", "V", "Lm0/z0;", "converter", "Lm0/F0;", "a", "(Lm0/z0;)Lm0/F0;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "getDelay", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.k0  reason: case insensitive filesystem */
public final class C5551k0<T> implements C5524C<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f25846a;

    public C5551k0() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5551k0) && ((C5551k0) obj).f25846a == this.f25846a;
    }

    public int hashCode() {
        return this.f25846a;
    }

    public C5551k0(int i10) {
        this.f25846a = i10;
    }

    public <V extends C5562q> F0<V> a(z0<T, V> z0Var) {
        return new M0(this.f25846a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5551k0(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
