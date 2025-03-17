package ig;

import Qf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0007J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lig/i;", "", "", "checkoutId", "", "showPricesExclTax", "Lig/i$a;", "a", "(Ljava/lang/String;Z)Lig/i$a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface i {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lig/i$a;", "", "LQf/a$c;", "homeDetails", "collectDetails", "<init>", "(LQf/a$c;LQf/a$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQf/a$c;", "b", "()LQf/a$c;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final a.c f74431a;

        /* renamed from: b  reason: collision with root package name */
        private final a.c f74432b;

        public a() {
            this((a.c) null, (a.c) null, 3, (DefaultConstructorMarker) null);
        }

        public final a.c a() {
            return this.f74432b;
        }

        public final a.c b() {
            return this.f74431a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f74431a, aVar.f74431a) && C17542s.e(this.f74432b, aVar.f74432b);
        }

        public int hashCode() {
            a.c cVar = this.f74431a;
            int i10 = 0;
            int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            a.c cVar2 = this.f74432b;
            if (cVar2 != null) {
                i10 = cVar2.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            a.c cVar = this.f74431a;
            a.c cVar2 = this.f74432b;
            return "DeliveryDetails(homeDetails=" + cVar + ", collectDetails=" + cVar2 + ")";
        }

        public a(a.c cVar, a.c cVar2) {
            this.f74431a = cVar;
            this.f74432b = cVar2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(a.c cVar, a.c cVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : cVar, (i10 & 2) != 0 ? null : cVar2);
        }
    }

    a a(String str, boolean z10);
}
