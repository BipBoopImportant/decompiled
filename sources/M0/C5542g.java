package m0;

import kotlin.Metadata;
import m0.C5562q;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0014"}, d2 = {"Lm0/g;", "T", "Lm0/q;", "V", "", "Lm0/k;", "endState", "Lm0/e;", "endReason", "<init>", "(Lm0/k;Lm0/e;)V", "", "toString", "()Ljava/lang/String;", "a", "Lm0/k;", "b", "()Lm0/k;", "Lm0/e;", "()Lm0/e;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.g  reason: case insensitive filesystem */
public final class C5542g<T, V extends C5562q> {

    /* renamed from: a  reason: collision with root package name */
    private final C5550k<T, V> f25741a;

    /* renamed from: b  reason: collision with root package name */
    private final C5538e f25742b;

    public C5542g(C5550k<T, V> kVar, C5538e eVar) {
        this.f25741a = kVar;
        this.f25742b = eVar;
    }

    public final C5538e a() {
        return this.f25742b;
    }

    public final C5550k<T, V> b() {
        return this.f25741a;
    }

    public String toString() {
        return "AnimationResult(endReason=" + this.f25742b + ", endState=" + this.f25741a + ')';
    }
}
