package pk;

import KJ.C15985a;
import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lpk/q;", "", "b", "a", "Lpk/q$a;", "Lpk/q$b;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface q {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lpk/q$a;", "Lpk/q;", "LKJ/c;", "Lpk/l;", "items", "<init>", "(LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "()LKJ/c;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements q {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<l> f101022a;

        public a() {
            this((C15987c) null, 1, (DefaultConstructorMarker) null);
        }

        public final C15987c<l> a() {
            return this.f101022a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f101022a, ((a) obj).f101022a);
        }

        public int hashCode() {
            return this.f101022a.hashCode();
        }

        public String toString() {
            C15987c<l> cVar = this.f101022a;
            return "OnlineProducts(items=" + cVar + ")";
        }

        public a(C15987c<l> cVar) {
            C17542s.j(cVar, "items");
            this.f101022a = cVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(C15987c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C15985a.a() : cVar);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lpk/q$b;", "Lpk/q;", "LKJ/c;", "Lpk/i;", "items", "<init>", "(LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "()LKJ/c;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements q {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<i> f101023a;

        public b() {
            this((C15987c) null, 1, (DefaultConstructorMarker) null);
        }

        public final C15987c<i> a() {
            return this.f101023a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f101023a, ((b) obj).f101023a);
        }

        public int hashCode() {
            return this.f101023a.hashCode();
        }

        public String toString() {
            C15987c<i> cVar = this.f101023a;
            return "StoreProducts(items=" + cVar + ")";
        }

        public b(C15987c<i> cVar) {
            C17542s.j(cVar, "items");
            this.f101023a = cVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(C15987c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C15985a.a() : cVar);
        }
    }
}
