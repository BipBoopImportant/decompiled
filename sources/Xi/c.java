package Xi;

import Ae.e;
import Ae.j;
import Kf.g;
import Sy.a;
import XH.C16807N;
import XH.t;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.C15031y;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001a\u0013B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001e¨\u0006 "}, d2 = {"LXi/c;", "", "LAe/e;", "analytics", "LHl/a;", "wifiConnector", "LIl/a;", "appConfigApi", "<init>", "(LAe/e;LHl/a;LIl/a;)V", "", "storeId", "LXi/c$a;", "analyticsProductData", "", "quantity", "LSy/a$e;", "appLocation", "", "a", "(Ljava/lang/String;LXi/c$a;ILSy/a$e;)Ljava/util/Map;", "LKf/g;", "cartException", "LXH/N;", "c", "(Ljava/lang/String;LKf/g;LXi/c$a;ILSy/a$e;)V", "b", "(Ljava/lang/String;LXi/c$a;ILSy/a$e;)V", "LAe/e;", "LHl/a;", "LIl/a;", "d", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final b f89182d = new b((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f89183e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final e f89184a;

    /* renamed from: b  reason: collision with root package name */
    private final Hl.a f89185b;

    /* renamed from: c  reason: collision with root package name */
    private final Il.a f89186c;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001:\u0002\u0012\u0015B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LXi/c$a;", "", "LXi/c$a$a;", "parentProductData", "LXi/c$a$b;", "productData", "<init>", "(LXi/c$a$a;LXi/c$a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LXi/c$a$a;", "()LXi/c$a$a;", "b", "LXi/c$a$b;", "()LXi/c$a$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C1908a f89187a;

        /* renamed from: b  reason: collision with root package name */
        private final b f89188b;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LXi/c$a$a;", "", "Lrz/y;", "productPickupType", "<init>", "(Lrz/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrz/y;", "()Lrz/y;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Xi.c$a$a  reason: collision with other inner class name */
        public static final class C1908a {

            /* renamed from: a  reason: collision with root package name */
            private final C15031y f89189a;

            public C1908a(C15031y yVar) {
                C17542s.j(yVar, "productPickupType");
                this.f89189a = yVar;
            }

            public final C15031y a() {
                return this.f89189a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1908a) && this.f89189a == ((C1908a) obj).f89189a;
            }

            public int hashCode() {
                return this.f89189a.hashCode();
            }

            public String toString() {
                C15031y yVar = this.f89189a;
                return "ParentProductData(productPickupType=" + yVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LXi/c$a$b;", "", "", "productNo", "productType", "", "itemRawPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;D)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "D", "()D", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            private final String f89190a;

            /* renamed from: b  reason: collision with root package name */
            private final String f89191b;

            /* renamed from: c  reason: collision with root package name */
            private final double f89192c;

            public b(String str, String str2, double d10) {
                C17542s.j(str, "productNo");
                C17542s.j(str2, "productType");
                this.f89190a = str;
                this.f89191b = str2;
                this.f89192c = d10;
            }

            public final double a() {
                return this.f89192c;
            }

            public final String b() {
                return this.f89190a;
            }

            public final String c() {
                return this.f89191b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f89190a, bVar.f89190a) && C17542s.e(this.f89191b, bVar.f89191b) && Double.compare(this.f89192c, bVar.f89192c) == 0;
            }

            public int hashCode() {
                return (((this.f89190a.hashCode() * 31) + this.f89191b.hashCode()) * 31) + Double.hashCode(this.f89192c);
            }

            public String toString() {
                String str = this.f89190a;
                String str2 = this.f89191b;
                double d10 = this.f89192c;
                return "ProductData(productNo=" + str + ", productType=" + str2 + ", itemRawPrice=" + d10 + ")";
            }
        }

        public a(C1908a aVar, b bVar) {
            C17542s.j(bVar, "productData");
            this.f89187a = aVar;
            this.f89188b = bVar;
        }

        public final C1908a a() {
            return this.f89187a;
        }

        public final b b() {
            return this.f89188b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f89187a, aVar.f89187a) && C17542s.e(this.f89188b, aVar.f89188b);
        }

        public int hashCode() {
            C1908a aVar = this.f89187a;
            return ((aVar == null ? 0 : aVar.hashCode()) * 31) + this.f89188b.hashCode();
        }

        public String toString() {
            C1908a aVar = this.f89187a;
            b bVar = this.f89188b;
            return "AnalyticsProductData(parentProductData=" + aVar + ", productData=" + bVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LXi/c$b;", "", "<init>", "()V", "", "GENERIC_FAILURE", "Ljava/lang/String;", "ILLEGAL_QUANTITY_FAILURE", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public c(e eVar, Hl.a aVar, Il.a aVar2) {
        C17542s.j(eVar, "analytics");
        C17542s.j(aVar, "wifiConnector");
        C17542s.j(aVar2, "appConfigApi");
        this.f89184a = eVar;
        this.f89185b = aVar;
        this.f89186c = aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map<java.lang.String, java.lang.Object> a(java.lang.String r5, Xi.c.a r6, int r7, Sy.a.e r8) {
        /*
            r4 = this;
            Xi.c$a$a r0 = r6.a()
            if (r0 == 0) goto L_0x0011
            rz.y r0 = r0.a()
            if (r0 == 0) goto L_0x0011
            Sy.a$c r0 = Tj.D.a(r0)
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            java.util.Map r1 = YH.X.c()
            java.lang.String r2 = "store_id"
            r1.put(r2, r5)
            Xi.c$a$b r5 = r6.b()
            java.lang.String r5 = r5.b()
            java.lang.String r2 = "item_id"
            r1.put(r2, r5)
            if (r0 == 0) goto L_0x003c
            java.lang.String r5 = "fullserve"
            java.lang.String r2 = r0.m()
            r1.put(r5, r2)
            java.lang.String r5 = "product_assortment_type"
            java.lang.String r0 = r0.j()
            r1.put(r5, r0)
        L_0x003c:
            Xi.c$a$b r5 = r6.b()
            java.lang.String r5 = r5.c()
            java.lang.String r0 = "product_type"
            r1.put(r0, r5)
            double r2 = (double) r7
            Xi.c$a$b r5 = r6.b()
            double r5 = r5.a()
            double r2 = r2 * r5
            java.lang.Double r5 = java.lang.Double.valueOf(r2)
            java.lang.String r6 = "value"
            r1.put(r6, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            java.lang.String r6 = "quantity"
            r1.put(r6, r5)
            Il.a r5 = r4.f89186c
            kp.d r5 = r5.s()
            java.lang.String r5 = r5.b()
            java.lang.String r6 = "currency"
            r1.put(r6, r5)
            Hl.a r5 = r4.f89185b
            Hl.a$a r5 = r5.a()
            java.lang.String r5 = r5.b()
            java.lang.String r6 = "connection_type"
            r1.put(r6, r5)
            java.lang.String r5 = "app_location"
            java.lang.String r6 = r8.b()
            r1.put(r5, r6)
            java.util.Map r5 = YH.X.b(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Xi.c.a(java.lang.String, Xi.c$a, int, Sy.a$e):java.util.Map");
    }

    public final void b(String str, a aVar, int i10, a.e eVar) {
        C17542s.j(str, "storeId");
        C17542s.j(aVar, "analyticsProductData");
        C17542s.j(eVar, "appLocation");
        e.c.c(this.f89184a, j.SHOP_AND_GO_TAP.b(), a(str, aVar, i10, eVar), Interaction$Component.SHOP_AND_GO_ADD_TO_ONLINE_CART, (e.b) null, 8, (Object) null);
    }

    public final void c(String str, g gVar, a aVar, int i10, a.e eVar) {
        String str2;
        C17542s.j(str, "storeId");
        C17542s.j(gVar, "cartException");
        C17542s.j(aVar, "analyticsProductData");
        C17542s.j(eVar, "appLocation");
        if (C17542s.e(gVar, g.a.f61509a)) {
            str2 = "generic";
        } else if (C17542s.e(gVar, g.b.f61510a)) {
            str2 = "illegal_quantity";
        } else {
            throw new t();
        }
        e eVar2 = this.f89184a;
        String b10 = j.SHOP_AND_GO_ACTION_FAIL.b();
        Map c10 = X.c();
        c10.putAll(a(str, aVar, i10, eVar));
        c10.put("reason_code", str2);
        C16807N n10 = C16807N.f139792a;
        e.c.c(eVar2, b10, X.b(c10), Interaction$Component.SHOP_AND_GO_ADD_TO_ONLINE_CART, (e.b) null, 8, (Object) null);
    }
}
