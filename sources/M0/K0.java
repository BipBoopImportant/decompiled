package m0;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5562q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u0010\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lm0/K0;", "Lm0/q;", "V", "", "vectorValue", "Lm0/D;", "easing", "Lm0/t;", "arcMode", "<init>", "(Lm0/q;Lm0/D;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm0/q;", "c", "()Lm0/q;", "b", "Lm0/D;", "()Lm0/D;", "I", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class K0<V extends C5562q> {

    /* renamed from: a  reason: collision with root package name */
    private final V f25582a;

    /* renamed from: b  reason: collision with root package name */
    private final C5525D f25583b;

    /* renamed from: c  reason: collision with root package name */
    private final int f25584c;

    public /* synthetic */ K0(C5562q qVar, C5525D d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, d10, i10);
    }

    public final int a() {
        return this.f25584c;
    }

    public final C5525D b() {
        return this.f25583b;
    }

    public final V c() {
        return this.f25582a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0)) {
            return false;
        }
        K0 k02 = (K0) obj;
        return C17542s.e(this.f25582a, k02.f25582a) && C17542s.e(this.f25583b, k02.f25583b) && C5564t.c(this.f25584c, k02.f25584c);
    }

    public int hashCode() {
        return (((this.f25582a.hashCode() * 31) + this.f25583b.hashCode()) * 31) + C5564t.d(this.f25584c);
    }

    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f25582a + ", easing=" + this.f25583b + ", arcMode=" + C5564t.e(this.f25584c) + ')';
    }

    private K0(V v10, C5525D d10, int i10) {
        this.f25582a = v10;
        this.f25583b = d10;
        this.f25584c = i10;
    }
}
