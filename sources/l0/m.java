package l0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m0.N;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ll0/m;", "", "", "alpha", "Lm0/N;", "animationSpec", "<init>", "(FLm0/N;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "()F", "b", "Lm0/N;", "()Lm0/N;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final float f25425a;

    /* renamed from: b  reason: collision with root package name */
    private final N<Float> f25426b;

    public m(float f10, N<Float> n10) {
        this.f25425a = f10;
        this.f25426b = n10;
    }

    public final float a() {
        return this.f25425a;
    }

    public final N<Float> b() {
        return this.f25426b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f25425a, mVar.f25425a) == 0 && C17542s.e(this.f25426b, mVar.f25426b);
    }

    public int hashCode() {
        return (Float.hashCode(this.f25425a) * 31) + this.f25426b.hashCode();
    }

    public String toString() {
        return "Fade(alpha=" + this.f25425a + ", animationSpec=" + this.f25426b + ')';
    }
}
