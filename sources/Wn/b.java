package Wn;

import Nn.C10800c;
import Nn.C10806i;
import Nn.C10813p;
import Nn.u;
import Rg.a;
import Yn.P;
import com.ingka.ikea.analytics.Interaction$Component;
import fI.C17221b;
import ho.b;
import java.util.List;
import jo.C11435a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002VTJ/\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J-\u0010(\u001a\u00020\t2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\tH&¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\tH&¢\u0006\u0004\b,\u0010+J)\u00101\u001a\u00020\t2\u0006\u0010-\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010\u00012\u0006\u00100\u001a\u00020/H&¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\tH&¢\u0006\u0004\b3\u0010+J\u000f\u00104\u001a\u00020\tH&¢\u0006\u0004\b4\u0010+J\u0017\u00107\u001a\u00020\t2\u0006\u00106\u001a\u000205H&¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\t2\u0006\u00109\u001a\u00020/H&¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\tH&¢\u0006\u0004\b<\u0010+J\u000f\u0010=\u001a\u00020\tH&¢\u0006\u0004\b=\u0010+J-\u0010@\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010>\u001a\u0004\u0018\u00010\u00072\b\u0010?\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b@\u0010AJE\u0010E\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010B\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010C\u001a\u0004\u0018\u00010\u00072\b\u0010D\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\bE\u0010FJ'\u0010I\u001a\u00020\t2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\b\u0010H\u001a\u0004\u0018\u00010/H&¢\u0006\u0004\bI\u0010JJ+\u0010K\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010C\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\bK\u0010LJ-\u0010O\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010M\u001a\u0004\u0018\u00010\u00072\b\u0010N\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\bO\u0010AJ+\u0010P\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010H\u001a\u0004\u0018\u00010/2\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\bP\u0010QJ#\u0010R\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\tH&¢\u0006\u0004\bT\u0010+J\u0017\u0010V\u001a\u00020\t2\u0006\u0010U\u001a\u00020\u0002H&¢\u0006\u0004\bV\u0010WJ\u0017\u0010Z\u001a\u00020\t2\u0006\u0010Y\u001a\u00020XH&¢\u0006\u0004\bZ\u0010[J\u0017\u0010]\u001a\u00020\t2\u0006\u0010\\\u001a\u00020\u0002H&¢\u0006\u0004\b]\u0010WJ\u001f\u0010`\u001a\u00020\t2\u0006\u0010\\\u001a\u00020\u00022\u0006\u0010_\u001a\u00020^H&¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\t2\u0006\u0010b\u001a\u00020/H&¢\u0006\u0004\bc\u0010;J\u0017\u0010e\u001a\u00020\t2\u0006\u0010d\u001a\u00020/H&¢\u0006\u0004\be\u0010;J\u0019\u0010g\u001a\u00020\t2\b\u0010f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\bg\u0010WJ\u0017\u0010i\u001a\u00020\t2\u0006\u0010\r\u001a\u00020hH&¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020\t2\u0006\u0010\r\u001a\u00020hH&¢\u0006\u0004\bk\u0010jJ\u001f\u0010m\u001a\u00020\t2\u0006\u0010\r\u001a\u00020h2\u0006\u0010l\u001a\u00020/H&¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020\tH&¢\u0006\u0004\bo\u0010+J\u000f\u0010p\u001a\u00020\tH&¢\u0006\u0004\bp\u0010+J\u0017\u0010r\u001a\u00020\t2\u0006\u0010\r\u001a\u00020qH&¢\u0006\u0004\br\u0010s¨\u0006t"}, d2 = {"LWn/b;", "", "", "currency", "", "LMn/a;", "items", "", "totalValue", "LXH/N;", "A", "(Ljava/lang/String;Ljava/util/List;D)V", "LRg/a;", "type", "transactionId", "LWn/b$a;", "checkoutDeliveryInfo", "successfulPspBrandNames", "y", "(LRg/a;Ljava/lang/String;Ljava/lang/String;LWn/b$a;Ljava/util/List;)V", "LYn/P;", "deliveryMethod", "o", "(LYn/P;)V", "Lho/b$a;", "collectDeliveryOption", "e", "(Lho/b$a;)V", "LNn/p;", "deliveryServiceType", "LNn/u;", "serviceType", "E", "(LYn/P;LNn/p;LNn/u;)V", "Lho/b;", "deliveryOption", "d", "(Lho/b;)V", "LWn/a;", "unavailableItems", "C", "(Ljava/util/List;LNn/p;LNn/u;)V", "f", "()V", "v", "key", "fieldValue", "", "isFrontend", "z", "(Ljava/lang/String;Ljava/lang/Object;Z)V", "k", "g", "LWn/s;", "origin", "r", "(LWn/s;)V", "viewAllOnMapPossible", "m", "(Z)V", "H", "u", "deliveryPriceHome", "deliveryPriceCollect", "K", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "fulfillmentServiceType", "deliveryCost", "fulfilmentTime", "p", "(Ljava/lang/String;LYn/P;LNn/u;LNn/p;Ljava/lang/Double;Ljava/lang/String;)V", "deliveryOptions", "excludingTax", "t", "(Ljava/util/List;Ljava/lang/Boolean;)V", "w", "(Ljava/lang/String;LYn/P;Ljava/lang/Double;)V", "cheapestDeliveryPrice", "rangeOfDaysDeliveryPrice", "J", "j", "(Ljava/lang/String;Ljava/lang/Boolean;Lho/b;)V", "l", "(Ljava/lang/String;LWn/b$a;)V", "a", "editParam", "b", "(Ljava/lang/String;)V", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "n", "(Lcom/ingka/ikea/analytics/Interaction$Component;)V", "transportType", "x", "LNn/c;", "capability", "c", "(Ljava/lang/String;LNn/c;)V", "isCollapsed", "I", "isDeliveryCollapsed", "D", "errorCode", "G", "LWn/b$b;", "h", "(LWn/b$b;)V", "s", "success", "B", "(LWn/b$b;Z)V", "F", "i", "LRg/a$a;", "q", "(LRg/a$a;)V", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0019B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0016\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006\""}, d2 = {"LWn/b$a;", "", "", "orderId", "LWn/b$a$a;", "price", "", "LMn/a;", "items", "LWn/b$a$b;", "selectedDelivery", "<init>", "(Ljava/lang/String;LWn/b$a$a;Ljava/util/List;LWn/b$a$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getOrderId", "b", "LWn/b$a$a;", "()LWn/b$a$a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "LWn/b$a$b;", "()LWn/b$a$b;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f89072a;

        /* renamed from: b  reason: collision with root package name */
        private final C1894a f89073b;

        /* renamed from: c  reason: collision with root package name */
        private final List<Mn.a> f89074c;

        /* renamed from: d  reason: collision with root package name */
        private final C1896b f89075d;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001c"}, d2 = {"LWn/b$a$a;", "", "", "totalPrice", "totalPriceExclTax", "totalTax", "deliveryPrice", "<init>", "(DLjava/lang/Double;DLjava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "b", "()D", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "d", "e", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Wn.b$a$a  reason: collision with other inner class name */
        public static final class C1894a {

            /* renamed from: e  reason: collision with root package name */
            public static final C1895a f89076e = new C1895a((DefaultConstructorMarker) null);

            /* renamed from: a  reason: collision with root package name */
            private final double f89077a;

            /* renamed from: b  reason: collision with root package name */
            private final Double f89078b;

            /* renamed from: c  reason: collision with root package name */
            private final double f89079c;

            /* renamed from: d  reason: collision with root package name */
            private final Double f89080d;

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LWn/b$a$a$a;", "", "<init>", "()V", "LNn/i;", "checkoutPrice", "LWn/b$a$a;", "a", "(LNn/i;)LWn/b$a$a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Wn.b$a$a$a  reason: collision with other inner class name */
            public static final class C1895a {
                public /* synthetic */ C1895a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final C1894a a(C10806i iVar) {
                    C17542s.j(iVar, "checkoutPrice");
                    double d10 = iVar.i().d();
                    Double valueOf = Double.valueOf(iVar.i().e());
                    double f10 = iVar.i().f();
                    Double d11 = iVar.d();
                    return new C1894a(d10, valueOf, f10, d11 == null ? iVar.e() : d11);
                }

                private C1895a() {
                }
            }

            public C1894a(double d10, Double d11, double d12, Double d13) {
                this.f89077a = d10;
                this.f89078b = d11;
                this.f89079c = d12;
                this.f89080d = d13;
            }

            public final Double a() {
                return this.f89080d;
            }

            public final double b() {
                return this.f89077a;
            }

            public final Double c() {
                return this.f89078b;
            }

            public final double d() {
                return this.f89079c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1894a)) {
                    return false;
                }
                C1894a aVar = (C1894a) obj;
                return Double.compare(this.f89077a, aVar.f89077a) == 0 && C17542s.e(this.f89078b, aVar.f89078b) && Double.compare(this.f89079c, aVar.f89079c) == 0 && C17542s.e(this.f89080d, aVar.f89080d);
            }

            public int hashCode() {
                int hashCode = Double.hashCode(this.f89077a) * 31;
                Double d10 = this.f89078b;
                int i10 = 0;
                int hashCode2 = (((hashCode + (d10 == null ? 0 : d10.hashCode())) * 31) + Double.hashCode(this.f89079c)) * 31;
                Double d11 = this.f89080d;
                if (d11 != null) {
                    i10 = d11.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                double d10 = this.f89077a;
                Double d11 = this.f89078b;
                double d12 = this.f89079c;
                Double d13 = this.f89080d;
                return "Price(totalPrice=" + d10 + ", totalPriceExclTax=" + d11 + ", totalTax=" + d12 + ", deliveryPrice=" + d13 + ")";
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"LWn/b$a$b;", "", "LNn/p;", "deliveryServiceType", "LNn/u;", "fulfillmentServiceType", "", "Ljo/a;", "deliveryArrangements", "<init>", "(LNn/p;LNn/u;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LNn/p;", "b", "()LNn/p;", "LNn/u;", "c", "()LNn/u;", "Ljava/util/List;", "()Ljava/util/List;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Wn.b$a$b  reason: collision with other inner class name */
        public static final class C1896b {

            /* renamed from: a  reason: collision with root package name */
            private final C10813p f89081a;

            /* renamed from: b  reason: collision with root package name */
            private final u f89082b;

            /* renamed from: c  reason: collision with root package name */
            private final List<C11435a> f89083c;

            public C1896b(C10813p pVar, u uVar, List<C11435a> list) {
                C17542s.j(pVar, "deliveryServiceType");
                C17542s.j(uVar, "fulfillmentServiceType");
                C17542s.j(list, "deliveryArrangements");
                this.f89081a = pVar;
                this.f89082b = uVar;
                this.f89083c = list;
            }

            public final List<C11435a> a() {
                return this.f89083c;
            }

            public final C10813p b() {
                return this.f89081a;
            }

            public final u c() {
                return this.f89082b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1896b)) {
                    return false;
                }
                C1896b bVar = (C1896b) obj;
                return this.f89081a == bVar.f89081a && this.f89082b == bVar.f89082b && C17542s.e(this.f89083c, bVar.f89083c);
            }

            public int hashCode() {
                return (((this.f89081a.hashCode() * 31) + this.f89082b.hashCode()) * 31) + this.f89083c.hashCode();
            }

            public String toString() {
                C10813p pVar = this.f89081a;
                u uVar = this.f89082b;
                List<C11435a> list = this.f89083c;
                return "SelectedDelivery(deliveryServiceType=" + pVar + ", fulfillmentServiceType=" + uVar + ", deliveryArrangements=" + list + ")";
            }
        }

        public a(String str, C1894a aVar, List<Mn.a> list, C1896b bVar) {
            C17542s.j(str, "orderId");
            C17542s.j(aVar, "price");
            this.f89072a = str;
            this.f89073b = aVar;
            this.f89074c = list;
            this.f89075d = bVar;
        }

        public final List<Mn.a> a() {
            return this.f89074c;
        }

        public final C1894a b() {
            return this.f89073b;
        }

        public final C1896b c() {
            return this.f89075d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f89072a, aVar.f89072a) && C17542s.e(this.f89073b, aVar.f89073b) && C17542s.e(this.f89074c, aVar.f89074c) && C17542s.e(this.f89075d, aVar.f89075d);
        }

        public int hashCode() {
            int hashCode = ((this.f89072a.hashCode() * 31) + this.f89073b.hashCode()) * 31;
            List<Mn.a> list = this.f89074c;
            int i10 = 0;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            C1896b bVar = this.f89075d;
            if (bVar != null) {
                i10 = bVar.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f89072a;
            C1894a aVar = this.f89073b;
            List<Mn.a> list = this.f89074c;
            C1896b bVar = this.f89075d;
            return "CheckoutDeliveryInfo(orderId=" + str + ", price=" + aVar + ", items=" + list + ", selectedDelivery=" + bVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LWn/b$b;", "", "<init>", "(Ljava/lang/String;I)V", "ADD", "UPDATE", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Wn.b$b  reason: collision with other inner class name */
    public enum C1897b {
        ADD,
        UPDATE;

        static {
            C1897b[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    void A(String str, List<Mn.a> list, double d10);

    void B(C1897b bVar, boolean z10);

    void C(List<a> list, C10813p pVar, u uVar);

    void D(boolean z10);

    void E(P p10, C10813p pVar, u uVar);

    void F();

    void G(String str);

    void H();

    void I(boolean z10);

    void J(String str, Double d10, Double d11);

    void K(String str, Double d10, Double d11);

    void a();

    void b(String str);

    void c(String str, C10800c cVar);

    void d(ho.b bVar);

    void e(b.a aVar);

    void f();

    void g();

    void h(C1897b bVar);

    void i();

    void j(String str, Boolean bool, ho.b bVar);

    void k();

    void l(String str, a aVar);

    void m(boolean z10);

    void n(Interaction$Component interaction$Component);

    void o(P p10);

    void p(String str, P p10, u uVar, C10813p pVar, Double d10, String str2);

    void q(a.C1085a aVar);

    void r(s sVar);

    void s(C1897b bVar);

    void t(List<? extends ho.b> list, Boolean bool);

    void u();

    void v();

    void w(String str, P p10, Double d10);

    void x(String str);

    void y(Rg.a aVar, String str, String str2, a aVar2, List<String> list);

    void z(String str, Object obj, boolean z10);
}
