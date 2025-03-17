package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\"\b\b\u0001\u0010\u000b*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lm0/y0;", "T", "Lm0/C;", "", "durationMillis", "delay", "Lm0/D;", "easing", "<init>", "(IILm0/D;)V", "Lm0/q;", "V", "Lm0/z0;", "converter", "Lm0/O0;", "f", "(Lm0/z0;)Lm0/O0;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "getDurationMillis", "b", "getDelay", "c", "Lm0/D;", "getEasing", "()Lm0/D;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class y0<T> implements C5524C<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f26038a;

    /* renamed from: b  reason: collision with root package name */
    private final int f26039b;

    /* renamed from: c  reason: collision with root package name */
    private final C5525D f26040c;

    public y0() {
        this(0, 0, (C5525D) null, 7, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return y0Var.f26038a == this.f26038a && y0Var.f26039b == this.f26039b && C17542s.e(y0Var.f26040c, this.f26040c);
    }

    /* renamed from: f */
    public <V extends C5562q> O0<V> a(z0<T, V> z0Var) {
        return new O0<>(this.f26038a, this.f26039b, this.f26040c);
    }

    public int hashCode() {
        return (((this.f26038a * 31) + this.f26040c.hashCode()) * 31) + this.f26039b;
    }

    public y0(int i10, int i11, C5525D d10) {
        this.f26038a = i10;
        this.f26039b = i11;
        this.f26040c = d10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(int i10, int i11, C5525D d10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? M.d() : d10);
    }
}
