package nr;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lnr/c;", "", "a", "b", "Lnr/c$a;", "Lnr/c$b;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001a\u0010\r¨\u0006\u001f"}, d2 = {"Lnr/c$a;", "Lnr/c;", "", "", "years", "LQq/b;", "dates", "LQq/a;", "balanceData", "currentSelectedYear", "<init>", "(Ljava/util/List;Ljava/util/List;LQq/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "c", "LQq/a;", "()LQq/a;", "Ljava/lang/String;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f100002a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Qq.b> f100003b;

        /* renamed from: c  reason: collision with root package name */
        private final Qq.a f100004c;

        /* renamed from: d  reason: collision with root package name */
        private final String f100005d;

        public a(List<String> list, List<Qq.b> list2, Qq.a aVar, String str) {
            C17542s.j(list, "years");
            C17542s.j(list2, "dates");
            C17542s.j(aVar, "balanceData");
            C17542s.j(str, "currentSelectedYear");
            this.f100002a = list;
            this.f100003b = list2;
            this.f100004c = aVar;
            this.f100005d = str;
        }

        public final Qq.a a() {
            return this.f100004c;
        }

        public final String b() {
            return this.f100005d;
        }

        public final List<Qq.b> c() {
            return this.f100003b;
        }

        public final List<String> d() {
            return this.f100002a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f100002a, aVar.f100002a) && C17542s.e(this.f100003b, aVar.f100003b) && C17542s.e(this.f100004c, aVar.f100004c) && C17542s.e(this.f100005d, aVar.f100005d);
        }

        public int hashCode() {
            return (((((this.f100002a.hashCode() * 31) + this.f100003b.hashCode()) * 31) + this.f100004c.hashCode()) * 31) + this.f100005d.hashCode();
        }

        public String toString() {
            List<String> list = this.f100002a;
            List<Qq.b> list2 = this.f100003b;
            Qq.a aVar = this.f100004c;
            String str = this.f100005d;
            return "Loaded(years=" + list + ", dates=" + list2 + ", balanceData=" + aVar + ", currentSelectedYear=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnr/c$b;", "Lnr/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f100006a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1908469304;
        }

        public String toString() {
            return "Loading";
        }
    }
}
