package D4;

import D4.P;
import YH.C16877v;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B=\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R)\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010#¨\u0006$"}, d2 = {"LD4/Q;", "", "Key", "Value", "", "LD4/P$b$b;", "pages", "", "anchorPosition", "LD4/L;", "config", "leadingPlaceholderCount", "<init>", "(Ljava/util/List;Ljava/lang/Integer;LD4/L;I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "(I)LD4/P$b$b;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "LD4/L;", "getConfig", "()LD4/L;", "I", "paging-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Q<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    private final List<P.b.C0534b<Key, Value>> f34205a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f34206b;

    /* renamed from: c  reason: collision with root package name */
    private final L f34207c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int f34208d;

    public Q(List<P.b.C0534b<Key, Value>> list, Integer num, L l10, int i10) {
        C17542s.j(list, "pages");
        C17542s.j(l10, "config");
        this.f34205a = list;
        this.f34206b = num;
        this.f34207c = l10;
        this.f34208d = i10;
    }

    public final P.b.C0534b<Key, Value> b(int i10) {
        Iterable<P.b.C0534b> iterable = this.f34205a;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return null;
        }
        for (P.b.C0534b b10 : iterable) {
            if (!b10.b().isEmpty()) {
                int a10 = i10 - this.f34208d;
                int i11 = 0;
                while (i11 < C16877v.p(d()) && a10 > C16877v.p(((P.b.C0534b) d().get(i11)).b())) {
                    a10 -= ((P.b.C0534b) d().get(i11)).b().size();
                    i11++;
                }
                return a10 < 0 ? (P.b.C0534b) C16877v.w0(this.f34205a) : this.f34205a.get(i11);
            }
        }
        return null;
    }

    public final Integer c() {
        return this.f34206b;
    }

    public final List<P.b.C0534b<Key, Value>> d() {
        return this.f34205a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Q) {
            Q q10 = (Q) obj;
            return C17542s.e(this.f34205a, q10.f34205a) && C17542s.e(this.f34206b, q10.f34206b) && C17542s.e(this.f34207c, q10.f34207c) && this.f34208d == q10.f34208d;
        }
    }

    public int hashCode() {
        int hashCode = this.f34205a.hashCode();
        Integer num = this.f34206b;
        return hashCode + (num != null ? num.hashCode() : 0) + this.f34207c.hashCode() + Integer.hashCode(this.f34208d);
    }

    public String toString() {
        return "PagingState(pages=" + this.f34205a + ", anchorPosition=" + this.f34206b + ", config=" + this.f34207c + ", leadingPlaceholderCount=" + this.f34208d + ')';
    }
}
