package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\b\b\u0001\u0010\t*\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lm0/p0;", "T", "Lm0/i;", "animationSpec", "", "startDelayNanos", "<init>", "(Lm0/i;J)V", "Lm0/q;", "V", "Lm0/z0;", "converter", "Lm0/C0;", "a", "(Lm0/z0;)Lm0/C0;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lm0/i;", "getAnimationSpec", "()Lm0/i;", "b", "J", "getStartDelayNanos", "()J", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.p0  reason: case insensitive filesystem */
final class C5561p0<T> implements C5546i<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C5546i<T> f25872a;

    /* renamed from: b  reason: collision with root package name */
    private final long f25873b;

    public C5561p0(C5546i<T> iVar, long j10) {
        this.f25872a = iVar;
        this.f25873b = j10;
    }

    public <V extends C5562q> C0<V> a(z0<T, V> z0Var) {
        return new q0(this.f25872a.a(z0Var), this.f25873b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5561p0)) {
            return false;
        }
        C5561p0 p0Var = (C5561p0) obj;
        return p0Var.f25873b == this.f25873b && C17542s.e(p0Var.f25872a, this.f25872a);
    }

    public int hashCode() {
        return (this.f25872a.hashCode() * 31) + Long.hashCode(this.f25873b);
    }
}
