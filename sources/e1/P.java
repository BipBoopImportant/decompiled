package E1;

import G1.U;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J)\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b$\u0010%\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"LE1/P;", "LE1/I;", "LE1/O;", "measurePolicy", "<init>", "(LE1/O;)V", "LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;", "LE1/r;", "LE1/q;", "", "height", "a", "(LE1/r;Ljava/util/List;I)I", "width", "j", "d", "h", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LE1/O;", "getMeasurePolicy", "()LE1/O;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class P implements I {

    /* renamed from: a  reason: collision with root package name */
    private final O f5856a;

    public P(O o10) {
        this.f5856a = o10;
    }

    public int a(r rVar, List<? extends C4484q> list, int i10) {
        return this.f5856a.a(rVar, U.a(rVar), i10);
    }

    public int d(r rVar, List<? extends C4484q> list, int i10) {
        return this.f5856a.d(rVar, U.a(rVar), i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P) && C17542s.e(this.f5856a, ((P) obj).f5856a);
    }

    public int h(r rVar, List<? extends C4484q> list, int i10) {
        return this.f5856a.h(rVar, U.a(rVar), i10);
    }

    public int hashCode() {
        return this.f5856a.hashCode();
    }

    public J i(K k10, List<? extends H> list, long j10) {
        return this.f5856a.i(k10, U.a(k10), j10);
    }

    public int j(r rVar, List<? extends C4484q> list, int i10) {
        return this.f5856a.j(rVar, U.a(rVar), i10);
    }

    public String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.f5856a + ')';
    }
}
