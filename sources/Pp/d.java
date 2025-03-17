package Pp;

import IC.C13023e;
import Op.C10828d;
import SC.L2;
import fI.C17221b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import np.C11664a;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LPp/d;", "", "LPp/d$a;", "itemToMap", "LOp/d;", "a", "(LPp/d$a;)LOp/d;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b3\b\b\u0018\u00002\u00020\u0001:\u0003(#&B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b#\u00109R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b:\u0010$\u001a\u0004\b&\u0010\u001dR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b5\u0010;\u001a\u0004\b:\u0010<R\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u00100\u001a\u0004\b=\u00102R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b'\u0010>\u001a\u0004\b/\u0010?R\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b*\u0010>\u001a\u0004\b3\u0010?R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b(\u0010BR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bC\u0010A\u001a\u0004\b+\u0010BR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b=\u0010A\u001a\u0004\b7\u0010BR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\bC\u0010\u001dR\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bD\u00100\u001a\u0004\b@\u00102¨\u0006E"}, d2 = {"LPp/d$a;", "", "", "productNo", "productType", "", "quantity", "quantityLimit", "", "isOnlineSellable", "LPp/d$a$c;", "productData", "LPp/d$a$a;", "availability", "availabilityDisclaimer", "LPp/d$a$b;", "priceType", "isFamilyItem", "", "itemTotalPrice", "itemUnitPrice", "baseItemTotalPrice", "familyUpsellItemTotalPrice", "lowestPreviousPrice", "validUntilDate", "showMaterialsAsDisclaimer", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;ZLPp/d$a$c;LPp/d$a$a;Ljava/lang/String;LPp/d$a$b;ZDDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "j", "b", "k", "c", "I", "l", "d", "Ljava/lang/Integer;", "getQuantityLimit", "()Ljava/lang/Integer;", "e", "Z", "p", "()Z", "f", "LPp/d$a$c;", "i", "()LPp/d$a$c;", "g", "LPp/d$a$a;", "()LPp/d$a$a;", "h", "LPp/d$a$b;", "()LPp/d$a$b;", "o", "D", "()D", "m", "Ljava/lang/Double;", "()Ljava/lang/Double;", "n", "q", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f85650a;

        /* renamed from: b  reason: collision with root package name */
        private final String f85651b;

        /* renamed from: c  reason: collision with root package name */
        private final int f85652c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f85653d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f85654e;

        /* renamed from: f  reason: collision with root package name */
        private final c f85655f;

        /* renamed from: g  reason: collision with root package name */
        private final C1733a f85656g;

        /* renamed from: h  reason: collision with root package name */
        private final String f85657h;

        /* renamed from: i  reason: collision with root package name */
        private final b f85658i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f85659j;

        /* renamed from: k  reason: collision with root package name */
        private final double f85660k;

        /* renamed from: l  reason: collision with root package name */
        private final double f85661l;

        /* renamed from: m  reason: collision with root package name */
        private final Double f85662m;

        /* renamed from: n  reason: collision with root package name */
        private final Double f85663n;

        /* renamed from: o  reason: collision with root package name */
        private final Double f85664o;

        /* renamed from: p  reason: collision with root package name */
        private final String f85665p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f85666q;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LPp/d$a$a;", "", "LIC/e;", "label", "LSC/L2;", "statusVariant", "<init>", "(LIC/e;LSC/L2;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "b", "LSC/L2;", "()LSC/L2;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Pp.d$a$a  reason: collision with other inner class name */
        public static final class C1733a {

            /* renamed from: c  reason: collision with root package name */
            public static final int f85667c = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f85668a;

            /* renamed from: b  reason: collision with root package name */
            private final L2 f85669b;

            public C1733a(C13023e eVar, L2 l22) {
                C17542s.j(eVar, "label");
                C17542s.j(l22, "statusVariant");
                this.f85668a = eVar;
                this.f85669b = l22;
            }

            public final C13023e a() {
                return this.f85668a;
            }

            public final L2 b() {
                return this.f85669b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1733a)) {
                    return false;
                }
                C1733a aVar = (C1733a) obj;
                return C17542s.e(this.f85668a, aVar.f85668a) && this.f85669b == aVar.f85669b;
            }

            public int hashCode() {
                return (this.f85668a.hashCode() * 31) + this.f85669b.hashCode();
            }

            public String toString() {
                C13023e eVar = this.f85668a;
                L2 l22 = this.f85669b;
                return "Availability(label=" + eVar + ", statusVariant=" + l22 + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LPp/d$a$b;", "", "<init>", "(Ljava/lang/String;I)V", "NEW_LOWER_PRICE", "TRO", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public enum b {
            NEW_LOWER_PRICE,
            TRO;

            static {
                b[] a10;
                $ENTRIES = C17221b.a(a10);
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001:\u0002\u001f\u001cBe\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0014R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b#\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b \u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b&\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b\u001c\u0010+¨\u0006,"}, d2 = {"LPp/d$a$c;", "", "", "productName", "productDescription", "measurement", "LPp/d$a$c$a;", "displayUnit", "", "Lnp/a;", "environmentalFees", "imageUrl", "energyLabelUrl", "LPp/d$a$c$b;", "unitCode", "Lnp/b;", "materials", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LPp/d$a$c$a;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LPp/d$a$c$b;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "g", "c", "f", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "LPp/d$a$c$b;", "i", "()LPp/d$a$c$b;", "LPp/d$a$c$a;", "()LPp/d$a$c$a;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c {

            /* renamed from: a  reason: collision with root package name */
            private final String f85670a;

            /* renamed from: b  reason: collision with root package name */
            private final String f85671b;

            /* renamed from: c  reason: collision with root package name */
            private final String f85672c;

            /* renamed from: d  reason: collision with root package name */
            private final List<C11664a> f85673d;

            /* renamed from: e  reason: collision with root package name */
            private final String f85674e;

            /* renamed from: f  reason: collision with root package name */
            private final String f85675f;

            /* renamed from: g  reason: collision with root package name */
            private final b f85676g;

            /* renamed from: h  reason: collision with root package name */
            private final List<np.b> f85677h;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LPp/d$a$c$a;", "", "a", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pp.d$a$c$a  reason: collision with other inner class name */
            public static final class C1734a {

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LPp/d$a$c$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "AREA", "METERWARE", "MULTIPACK", "PIECE", "VOLUME", "WEIGHT", "WEIGHTWARE", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Pp.d$a$c$a$a  reason: collision with other inner class name */
                public enum C1735a {
                    AREA,
                    METERWARE,
                    MULTIPACK,
                    PIECE,
                    VOLUME,
                    WEIGHT,
                    WEIGHTWARE;

                    static {
                        C1735a[] a10;
                        $ENTRIES = C17221b.a(a10);
                    }
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LPp/d$a$c$b;", "", "<init>", "(Ljava/lang/String;I)V", "METER", "PIECE", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public enum b {
                METER,
                PIECE;

                static {
                    b[] a10;
                    $ENTRIES = C17221b.a(a10);
                }
            }

            public c(String str, String str2, String str3, C1734a aVar, List<C11664a> list, String str4, String str5, b bVar, List<np.b> list2) {
                C17542s.j(str, "productName");
                C17542s.j(str2, "productDescription");
                C17542s.j(bVar, "unitCode");
                C17542s.j(list2, "materials");
                this.f85670a = str;
                this.f85671b = str2;
                this.f85672c = str3;
                this.f85673d = list;
                this.f85674e = str4;
                this.f85675f = str5;
                this.f85676g = bVar;
                this.f85677h = list2;
            }

            public final C1734a a() {
                return null;
            }

            public final String b() {
                return this.f85675f;
            }

            public final List<C11664a> c() {
                return this.f85673d;
            }

            public final String d() {
                return this.f85674e;
            }

            public final List<np.b> e() {
                return this.f85677h;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C17542s.e(this.f85670a, cVar.f85670a) && C17542s.e(this.f85671b, cVar.f85671b) && C17542s.e(this.f85672c, cVar.f85672c) && C17542s.e((Object) null, (Object) null) && C17542s.e(this.f85673d, cVar.f85673d) && C17542s.e(this.f85674e, cVar.f85674e) && C17542s.e(this.f85675f, cVar.f85675f) && this.f85676g == cVar.f85676g && C17542s.e(this.f85677h, cVar.f85677h);
            }

            public final String f() {
                return this.f85672c;
            }

            public final String g() {
                return this.f85671b;
            }

            public final String h() {
                return this.f85670a;
            }

            public int hashCode() {
                int hashCode = ((this.f85670a.hashCode() * 31) + this.f85671b.hashCode()) * 31;
                String str = this.f85672c;
                int i10 = 0;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 961;
                List<C11664a> list = this.f85673d;
                int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                String str2 = this.f85674e;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f85675f;
                if (str3 != null) {
                    i10 = str3.hashCode();
                }
                return ((((hashCode4 + i10) * 31) + this.f85676g.hashCode()) * 31) + this.f85677h.hashCode();
            }

            public final b i() {
                return this.f85676g;
            }

            public String toString() {
                String str = this.f85670a;
                String str2 = this.f85671b;
                String str3 = this.f85672c;
                List<C11664a> list = this.f85673d;
                String str4 = this.f85674e;
                String str5 = this.f85675f;
                b bVar = this.f85676g;
                List<np.b> list2 = this.f85677h;
                return "ProductDetails(productName=" + str + ", productDescription=" + str2 + ", measurement=" + str3 + ", displayUnit=" + null + ", environmentalFees=" + list + ", imageUrl=" + str4 + ", energyLabelUrl=" + str5 + ", unitCode=" + bVar + ", materials=" + list2 + ")";
            }
        }

        public a(String str, String str2, int i10, Integer num, boolean z10, c cVar, C1733a aVar, String str3, b bVar, boolean z11, double d10, double d11, Double d12, Double d13, Double d14, String str4, boolean z12) {
            C17542s.j(str, "productNo");
            C17542s.j(str2, "productType");
            C17542s.j(cVar, "productData");
            this.f85650a = str;
            this.f85651b = str2;
            this.f85652c = i10;
            this.f85653d = num;
            this.f85654e = z10;
            this.f85655f = cVar;
            this.f85656g = aVar;
            this.f85657h = str3;
            this.f85658i = bVar;
            this.f85659j = z11;
            this.f85660k = d10;
            this.f85661l = d11;
            this.f85662m = d12;
            this.f85663n = d13;
            this.f85664o = d14;
            this.f85665p = str4;
            this.f85666q = z12;
        }

        public final C1733a a() {
            return this.f85656g;
        }

        public final String b() {
            return this.f85657h;
        }

        public final Double c() {
            return this.f85662m;
        }

        public final Double d() {
            return this.f85663n;
        }

        public final double e() {
            return this.f85660k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f85650a, aVar.f85650a) && C17542s.e(this.f85651b, aVar.f85651b) && this.f85652c == aVar.f85652c && C17542s.e(this.f85653d, aVar.f85653d) && this.f85654e == aVar.f85654e && C17542s.e(this.f85655f, aVar.f85655f) && C17542s.e(this.f85656g, aVar.f85656g) && C17542s.e(this.f85657h, aVar.f85657h) && this.f85658i == aVar.f85658i && this.f85659j == aVar.f85659j && Double.compare(this.f85660k, aVar.f85660k) == 0 && Double.compare(this.f85661l, aVar.f85661l) == 0 && C17542s.e(this.f85662m, aVar.f85662m) && C17542s.e(this.f85663n, aVar.f85663n) && C17542s.e(this.f85664o, aVar.f85664o) && C17542s.e(this.f85665p, aVar.f85665p) && this.f85666q == aVar.f85666q;
        }

        public final double f() {
            return this.f85661l;
        }

        public final Double g() {
            return this.f85664o;
        }

        public final b h() {
            return this.f85658i;
        }

        public int hashCode() {
            int hashCode = ((((this.f85650a.hashCode() * 31) + this.f85651b.hashCode()) * 31) + Integer.hashCode(this.f85652c)) * 31;
            Integer num = this.f85653d;
            int i10 = 0;
            int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.f85654e)) * 31) + this.f85655f.hashCode()) * 31;
            C1733a aVar = this.f85656g;
            int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str = this.f85657h;
            int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            b bVar = this.f85658i;
            int hashCode5 = (((((((hashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31) + Boolean.hashCode(this.f85659j)) * 31) + Double.hashCode(this.f85660k)) * 31) + Double.hashCode(this.f85661l)) * 31;
            Double d10 = this.f85662m;
            int hashCode6 = (hashCode5 + (d10 == null ? 0 : d10.hashCode())) * 31;
            Double d11 = this.f85663n;
            int hashCode7 = (hashCode6 + (d11 == null ? 0 : d11.hashCode())) * 31;
            Double d12 = this.f85664o;
            int hashCode8 = (hashCode7 + (d12 == null ? 0 : d12.hashCode())) * 31;
            String str2 = this.f85665p;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return ((hashCode8 + i10) * 31) + Boolean.hashCode(this.f85666q);
        }

        public final c i() {
            return this.f85655f;
        }

        public final String j() {
            return this.f85650a;
        }

        public final String k() {
            return this.f85651b;
        }

        public final int l() {
            return this.f85652c;
        }

        public final boolean m() {
            return this.f85666q;
        }

        public final String n() {
            return this.f85665p;
        }

        public final boolean o() {
            return this.f85659j;
        }

        public final boolean p() {
            return this.f85654e;
        }

        public String toString() {
            String str = this.f85650a;
            String str2 = this.f85651b;
            int i10 = this.f85652c;
            Integer num = this.f85653d;
            boolean z10 = this.f85654e;
            c cVar = this.f85655f;
            C1733a aVar = this.f85656g;
            String str3 = this.f85657h;
            b bVar = this.f85658i;
            boolean z11 = this.f85659j;
            double d10 = this.f85660k;
            double d11 = this.f85661l;
            Double d12 = this.f85662m;
            Double d13 = this.f85663n;
            Double d14 = this.f85664o;
            String str4 = this.f85665p;
            boolean z12 = this.f85666q;
            return "ItemToMap(productNo=" + str + ", productType=" + str2 + ", quantity=" + i10 + ", quantityLimit=" + num + ", isOnlineSellable=" + z10 + ", productData=" + cVar + ", availability=" + aVar + ", availabilityDisclaimer=" + str3 + ", priceType=" + bVar + ", isFamilyItem=" + z11 + ", itemTotalPrice=" + d10 + ", itemUnitPrice=" + d11 + ", baseItemTotalPrice=" + d12 + ", familyUpsellItemTotalPrice=" + d13 + ", lowestPreviousPrice=" + d14 + ", validUntilDate=" + str4 + ", showMaterialsAsDisclaimer=" + z12 + ")";
        }
    }

    C10828d a(a aVar);
}
