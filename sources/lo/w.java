package lo;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Llo/w;", "", "<init>", "()V", "b", "a", "Llo/w$a;", "Llo/w$b;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class w {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llo/w$a;", "Llo/w;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends w {

        /* renamed from: a  reason: collision with root package name */
        public static final a f99450a = new a();

        private a() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1615288052;
        }

        public String toString() {
            return "FinalSelection";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, d2 = {"Llo/w$b;", "Llo/w;", "", "deliveryServiceId", "nextDeliveryId", "", "nextDeliveryIndex", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends w {

        /* renamed from: a  reason: collision with root package name */
        private final String f99451a;

        /* renamed from: b  reason: collision with root package name */
        private final String f99452b;

        /* renamed from: c  reason: collision with root package name */
        private final int f99453c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, int i10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "deliveryServiceId");
            C17542s.j(str2, "nextDeliveryId");
            this.f99451a = str;
            this.f99452b = str2;
            this.f99453c = i10;
        }

        public final String a() {
            return this.f99451a;
        }

        public final String b() {
            return this.f99452b;
        }

        public final int c() {
            return this.f99453c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f99451a, bVar.f99451a) && C17542s.e(this.f99452b, bVar.f99452b) && this.f99453c == bVar.f99453c;
        }

        public int hashCode() {
            return (((this.f99451a.hashCode() * 31) + this.f99452b.hashCode()) * 31) + Integer.hashCode(this.f99453c);
        }

        public String toString() {
            String str = this.f99451a;
            String str2 = this.f99452b;
            int i10 = this.f99453c;
            return "NextPickupPoint(deliveryServiceId=" + str + ", nextDeliveryId=" + str2 + ", nextDeliveryIndex=" + i10 + ")";
        }
    }

    public /* synthetic */ w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private w() {
    }
}
