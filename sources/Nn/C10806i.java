package Nn;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11523e;
import kp.h;
import kp.k;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001:\u0001\u0014Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0001\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b1\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b2\u0010&R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00078\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b-\u0010+¨\u00063"}, d2 = {"LNn/i;", "", "Lkp/h;", "price", "", "deliveryPrice", "deliveryPriceExclTax", "", "Lkp/k;", "salesTaxes", "LNn/i$a;", "giftCardHolders", "familySavings", "familyPromotionSavings", "couponSavings", "employeeDiscounts", "Lkp/e;", "discountSummaries", "<init>", "(Lkp/h;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;DDLjava/lang/Double;Ljava/lang/Double;Ljava/util/List;)V", "a", "(Lkp/h;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;DDLjava/lang/Double;Ljava/lang/Double;Ljava/util/List;)LNn/i;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkp/h;", "i", "()Lkp/h;", "b", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "c", "e", "Ljava/util/List;", "j", "()Ljava/util/List;", "h", "f", "D", "g", "()D", "getFamilyPromotionSavings", "getEmployeeDiscounts", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Nn.i  reason: case insensitive filesystem */
public final class C10806i {

    /* renamed from: a  reason: collision with root package name */
    private final h f84075a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f84076b;

    /* renamed from: c  reason: collision with root package name */
    private final Double f84077c;

    /* renamed from: d  reason: collision with root package name */
    private final List<k> f84078d;

    /* renamed from: e  reason: collision with root package name */
    private final List<a> f84079e;

    /* renamed from: f  reason: collision with root package name */
    private final double f84080f;

    /* renamed from: g  reason: collision with root package name */
    private final double f84081g;

    /* renamed from: h  reason: collision with root package name */
    private final Double f84082h;

    /* renamed from: i  reason: collision with root package name */
    private final Double f84083i;

    /* renamed from: j  reason: collision with root package name */
    private final List<C11523e> f84084j;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"LNn/i$a;", "", "", "giftCardId", "maskedCardNumber", "", "remainingAmount", "reservedAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;D)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/lang/Double;", "()Ljava/lang/Double;", "d", "D", "()D", "onlinecheckout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Nn.i$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f84085a;

        /* renamed from: b  reason: collision with root package name */
        private final String f84086b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f84087c;

        /* renamed from: d  reason: collision with root package name */
        private final double f84088d;

        public a(String str, String str2, Double d10, double d11) {
            C17542s.j(str, "giftCardId");
            C17542s.j(str2, "maskedCardNumber");
            this.f84085a = str;
            this.f84086b = str2;
            this.f84087c = d10;
            this.f84088d = d11;
        }

        public final String a() {
            return this.f84085a;
        }

        public final String b() {
            return this.f84086b;
        }

        public final Double c() {
            return this.f84087c;
        }

        public final double d() {
            return this.f84088d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f84085a, aVar.f84085a) && C17542s.e(this.f84086b, aVar.f84086b) && C17542s.e(this.f84087c, aVar.f84087c) && Double.compare(this.f84088d, aVar.f84088d) == 0;
        }

        public int hashCode() {
            int hashCode = ((this.f84085a.hashCode() * 31) + this.f84086b.hashCode()) * 31;
            Double d10 = this.f84087c;
            return ((hashCode + (d10 == null ? 0 : d10.hashCode())) * 31) + Double.hashCode(this.f84088d);
        }

        public String toString() {
            String str = this.f84085a;
            String str2 = this.f84086b;
            Double d10 = this.f84087c;
            double d11 = this.f84088d;
            return "GiftCardHolder(giftCardId=" + str + ", maskedCardNumber=" + str2 + ", remainingAmount=" + d10 + ", reservedAmount=" + d11 + ")";
        }
    }

    public C10806i(h hVar, Double d10, Double d11, List<k> list, List<a> list2, double d12, double d13, Double d14, Double d15, List<C11523e> list3) {
        C17542s.j(hVar, "price");
        C17542s.j(list2, "giftCardHolders");
        C17542s.j(list3, "discountSummaries");
        this.f84075a = hVar;
        this.f84076b = d10;
        this.f84077c = d11;
        this.f84078d = list;
        this.f84079e = list2;
        this.f84080f = d12;
        this.f84081g = d13;
        this.f84082h = d14;
        this.f84083i = d15;
        this.f84084j = list3;
    }

    public static /* synthetic */ C10806i b(C10806i iVar, h hVar, Double d10, Double d11, List list, List list2, double d12, double d13, Double d14, Double d15, List list3, int i10, Object obj) {
        C10806i iVar2 = iVar;
        int i11 = i10;
        return iVar.a((i11 & 1) != 0 ? iVar2.f84075a : hVar, (i11 & 2) != 0 ? iVar2.f84076b : d10, (i11 & 4) != 0 ? iVar2.f84077c : d11, (i11 & 8) != 0 ? iVar2.f84078d : list, (i11 & 16) != 0 ? iVar2.f84079e : list2, (i11 & 32) != 0 ? iVar2.f84080f : d12, (i11 & 64) != 0 ? iVar2.f84081g : d13, (i11 & 128) != 0 ? iVar2.f84082h : d14, (i11 & 256) != 0 ? iVar2.f84083i : d15, (i11 & 512) != 0 ? iVar2.f84084j : list3);
    }

    public final C10806i a(h hVar, Double d10, Double d11, List<k> list, List<a> list2, double d12, double d13, Double d14, Double d15, List<C11523e> list3) {
        C17542s.j(hVar, "price");
        List<a> list4 = list2;
        C17542s.j(list4, "giftCardHolders");
        List<C11523e> list5 = list3;
        C17542s.j(list5, "discountSummaries");
        return new C10806i(hVar, d10, d11, list, list4, d12, d13, d14, d15, list5);
    }

    public final Double c() {
        return this.f84082h;
    }

    public final Double d() {
        return this.f84076b;
    }

    public final Double e() {
        return this.f84077c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10806i)) {
            return false;
        }
        C10806i iVar = (C10806i) obj;
        return C17542s.e(this.f84075a, iVar.f84075a) && C17542s.e(this.f84076b, iVar.f84076b) && C17542s.e(this.f84077c, iVar.f84077c) && C17542s.e(this.f84078d, iVar.f84078d) && C17542s.e(this.f84079e, iVar.f84079e) && Double.compare(this.f84080f, iVar.f84080f) == 0 && Double.compare(this.f84081g, iVar.f84081g) == 0 && C17542s.e(this.f84082h, iVar.f84082h) && C17542s.e(this.f84083i, iVar.f84083i) && C17542s.e(this.f84084j, iVar.f84084j);
    }

    public final List<C11523e> f() {
        return this.f84084j;
    }

    public final double g() {
        return this.f84080f;
    }

    public final List<a> h() {
        return this.f84079e;
    }

    public int hashCode() {
        int hashCode = this.f84075a.hashCode() * 31;
        Double d10 = this.f84076b;
        int i10 = 0;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f84077c;
        int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        List<k> list = this.f84078d;
        int hashCode4 = (((((((hashCode3 + (list == null ? 0 : list.hashCode())) * 31) + this.f84079e.hashCode()) * 31) + Double.hashCode(this.f84080f)) * 31) + Double.hashCode(this.f84081g)) * 31;
        Double d12 = this.f84082h;
        int hashCode5 = (hashCode4 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f84083i;
        if (d13 != null) {
            i10 = d13.hashCode();
        }
        return ((hashCode5 + i10) * 31) + this.f84084j.hashCode();
    }

    public final h i() {
        return this.f84075a;
    }

    public final List<k> j() {
        return this.f84078d;
    }

    public String toString() {
        h hVar = this.f84075a;
        Double d10 = this.f84076b;
        Double d11 = this.f84077c;
        List<k> list = this.f84078d;
        List<a> list2 = this.f84079e;
        double d12 = this.f84080f;
        double d13 = this.f84081g;
        Double d14 = this.f84082h;
        Double d15 = this.f84083i;
        List<C11523e> list3 = this.f84084j;
        return "CheckoutPrice(price=" + hVar + ", deliveryPrice=" + d10 + ", deliveryPriceExclTax=" + d11 + ", salesTaxes=" + list + ", giftCardHolders=" + list2 + ", familySavings=" + d12 + ", familyPromotionSavings=" + d13 + ", couponSavings=" + d14 + ", employeeDiscounts=" + d15 + ", discountSummaries=" + list3 + ")";
    }
}
