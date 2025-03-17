package Do;

import Nn.G;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"LDo/l;", "", "<init>", "()V", "Lho/b;", "a", "()Lho/b;", "deliveryOption", "b", "LDo/l$a;", "LDo/l$b;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class l {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0018\u0010\f¨\u0006\u001e"}, d2 = {"LDo/l$a;", "LDo/l;", "Lho/b;", "deliveryOption", "", "deliveryServiceId", "LNn/G;", "pickupPoint", "deliveryId", "<init>", "(Lho/b;Ljava/lang/String;LNn/G;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lho/b;", "()Lho/b;", "b", "Ljava/lang/String;", "c", "LNn/G;", "d", "()LNn/G;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends l {

        /* renamed from: a  reason: collision with root package name */
        private final ho.b f80097a;

        /* renamed from: b  reason: collision with root package name */
        private final String f80098b;

        /* renamed from: c  reason: collision with root package name */
        private final G f80099c;

        /* renamed from: d  reason: collision with root package name */
        private final String f80100d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ho.b bVar, String str, G g10, String str2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(bVar, "deliveryOption");
            C17542s.j(str, "deliveryServiceId");
            C17542s.j(g10, "pickupPoint");
            C17542s.j(str2, "deliveryId");
            this.f80097a = bVar;
            this.f80098b = str;
            this.f80099c = g10;
            this.f80100d = str2;
        }

        public ho.b a() {
            return this.f80097a;
        }

        public final String b() {
            return this.f80100d;
        }

        public final String c() {
            return this.f80098b;
        }

        public final G d() {
            return this.f80099c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f80097a, aVar.f80097a) && C17542s.e(this.f80098b, aVar.f80098b) && C17542s.e(this.f80099c, aVar.f80099c) && C17542s.e(this.f80100d, aVar.f80100d);
        }

        public int hashCode() {
            return (((((this.f80097a.hashCode() * 31) + this.f80098b.hashCode()) * 31) + this.f80099c.hashCode()) * 31) + this.f80100d.hashCode();
        }

        public String toString() {
            ho.b bVar = this.f80097a;
            String str = this.f80098b;
            G g10 = this.f80099c;
            String str2 = this.f80100d;
            return "CollectDelivery(deliveryOption=" + bVar + ", deliveryServiceId=" + str + ", pickupPoint=" + g10 + ", deliveryId=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LDo/l$b;", "LDo/l;", "Lho/b;", "deliveryOption", "<init>", "(Lho/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lho/b;", "()Lho/b;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends l {

        /* renamed from: a  reason: collision with root package name */
        private final ho.b f80101a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ho.b bVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(bVar, "deliveryOption");
            this.f80101a = bVar;
        }

        public ho.b a() {
            return this.f80101a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f80101a, ((b) obj).f80101a);
        }

        public int hashCode() {
            return this.f80101a.hashCode();
        }

        public String toString() {
            ho.b bVar = this.f80101a;
            return "HomeDelivery(deliveryOption=" + bVar + ")";
        }
    }

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract ho.b a();

    private l() {
    }
}
