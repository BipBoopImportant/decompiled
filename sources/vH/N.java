package vh;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lvh/N;", "", "", "Lvh/N$a;", "orderDiscountSummaryList", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class N {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f77287a;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Lvh/N$a;", "", "", "amount", "", "name", "<init>", "(Ljava/lang/Double;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "b", "Ljava/lang/String;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Double f77288a;

        /* renamed from: b  reason: collision with root package name */
        private final String f77289b;

        public a(Double d10, String str) {
            this.f77288a = d10;
            this.f77289b = str;
        }

        public final Double a() {
            return this.f77288a;
        }

        public final String b() {
            return this.f77289b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f77288a, aVar.f77288a) && C17542s.e(this.f77289b, aVar.f77289b);
        }

        public int hashCode() {
            Double d10 = this.f77288a;
            int i10 = 0;
            int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
            String str = this.f77289b;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            Double d10 = this.f77288a;
            String str = this.f77289b;
            return "OrderDiscountSummaryList(amount=" + d10 + ", name=" + str + ")";
        }
    }

    public N(List<a> list) {
        this.f77287a = list;
    }

    public final List<a> a() {
        return this.f77287a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N) && C17542s.e(this.f77287a, ((N) obj).f77287a);
    }

    public int hashCode() {
        List<a> list = this.f77287a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<a> list = this.f77287a;
        return "OrderDiscountSummaryListFragment(orderDiscountSummaryList=" + list + ")";
    }
}
