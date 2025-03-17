package Nn;

import Nn.J;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LNn/s;", "", "<init>", "()V", "b", "a", "LNn/s$a;", "LNn/s$b;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Nn.s  reason: case insensitive filesystem */
public abstract class C10815s {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LNn/s$a;", "LNn/s;", "", "deliveryServiceId", "deliveryId", "LNn/G;", "pickupPoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;LNn/G;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "LNn/G;", "()LNn/G;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.s$a */
    public static final class a extends C10815s {

        /* renamed from: a  reason: collision with root package name */
        private final String f84147a;

        /* renamed from: b  reason: collision with root package name */
        private final String f84148b;

        /* renamed from: c  reason: collision with root package name */
        private final G f84149c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, G g10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "deliveryServiceId");
            C17542s.j(str2, "deliveryId");
            C17542s.j(g10, "pickupPoint");
            this.f84147a = str;
            this.f84148b = str2;
            this.f84149c = g10;
        }

        public final String a() {
            return this.f84148b;
        }

        public final String b() {
            return this.f84147a;
        }

        public final G c() {
            return this.f84149c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f84147a, aVar.f84147a) && C17542s.e(this.f84148b, aVar.f84148b) && C17542s.e(this.f84149c, aVar.f84149c);
        }

        public int hashCode() {
            return (((this.f84147a.hashCode() * 31) + this.f84148b.hashCode()) * 31) + this.f84149c.hashCode();
        }

        public String toString() {
            String str = this.f84147a;
            String str2 = this.f84148b;
            G g10 = this.f84149c;
            return "PickupPoint(deliveryServiceId=" + str + ", deliveryId=" + str2 + ", pickupPoint=" + g10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LNn/s$b;", "LNn/s;", "LNn/J$a$a;", "delivery", "<init>", "(LNn/J$a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LNn/J$a$a;", "()LNn/J$a$a;", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.s$b */
    public static final class b extends C10815s {

        /* renamed from: a  reason: collision with root package name */
        private final J.a.C1694a f84150a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(J.a.C1694a aVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(aVar, "delivery");
            this.f84150a = aVar;
        }

        public final J.a.C1694a a() {
            return this.f84150a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f84150a, ((b) obj).f84150a);
        }

        public int hashCode() {
            return this.f84150a.hashCode();
        }

        public String toString() {
            J.a.C1694a aVar = this.f84150a;
            return "SelectDelivery(delivery=" + aVar + ")";
        }
    }

    public /* synthetic */ C10815s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C10815s() {
    }
}
