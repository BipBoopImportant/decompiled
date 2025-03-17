package Ln;

import androidx.recyclerview.widget.RecyclerView;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b*\b\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010 \u001a\u0004\b!\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b+\u00101R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b/\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b)\u00103\u001a\u0004\b$\u00104R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b'\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b!\u00103\u001a\u0004\b2\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b6\u0010\u001aR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b&\u00107\u001a\u0004\b5\u00108R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;¨\u0006<"}, d2 = {"LLn/d;", "", "", "productNo", "productType", "", "quantity", "LLn/d$a;", "priceType", "", "isFamilyItem", "", "itemTotalPrice", "itemUnitPrice", "baseItemTotalPrice", "familyUpsellItemTotalPrice", "lowestPreviousPrice", "validUntilDate", "LLn/f;", "productData", "quantityLimit", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILLn/d$a;ZDDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;LLn/f;Ljava/lang/Integer;)V", "a", "(Ljava/lang/String;Ljava/lang/String;ILLn/d$a;ZDDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;LLn/f;Ljava/lang/Integer;)LLn/d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "j", "b", "k", "c", "I", "l", "d", "LLn/d$a;", "h", "()LLn/d$a;", "e", "Z", "o", "()Z", "f", "D", "()D", "g", "Ljava/lang/Double;", "()Ljava/lang/Double;", "i", "n", "LLn/f;", "()LLn/f;", "m", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "cart-data-layer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f83292a;

    /* renamed from: b  reason: collision with root package name */
    private final String f83293b;

    /* renamed from: c  reason: collision with root package name */
    private final int f83294c;

    /* renamed from: d  reason: collision with root package name */
    private final a f83295d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f83296e;

    /* renamed from: f  reason: collision with root package name */
    private final double f83297f;

    /* renamed from: g  reason: collision with root package name */
    private final double f83298g;

    /* renamed from: h  reason: collision with root package name */
    private final Double f83299h;

    /* renamed from: i  reason: collision with root package name */
    private final Double f83300i;

    /* renamed from: j  reason: collision with root package name */
    private final Double f83301j;

    /* renamed from: k  reason: collision with root package name */
    private final String f83302k;

    /* renamed from: l  reason: collision with root package name */
    private final f f83303l;

    /* renamed from: m  reason: collision with root package name */
    private final Integer f83304m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LLn/d$a;", "", "<init>", "(Ljava/lang/String;I)V", "NEW_LOWER_PRICE", "TRO", "cart-data-layer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        NEW_LOWER_PRICE,
        TRO;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public d(String str, String str2, int i10, a aVar, boolean z10, double d10, double d11, Double d12, Double d13, Double d14, String str3, f fVar, Integer num) {
        f fVar2 = fVar;
        C17542s.j(str, "productNo");
        C17542s.j(str2, "productType");
        C17542s.j(fVar2, "productData");
        this.f83292a = str;
        this.f83293b = str2;
        this.f83294c = i10;
        this.f83295d = aVar;
        this.f83296e = z10;
        this.f83297f = d10;
        this.f83298g = d11;
        this.f83299h = d12;
        this.f83300i = d13;
        this.f83301j = d14;
        this.f83302k = str3;
        this.f83303l = fVar2;
        this.f83304m = num;
    }

    public static /* synthetic */ d b(d dVar, String str, String str2, int i10, a aVar, boolean z10, double d10, double d11, Double d12, Double d13, Double d14, String str3, f fVar, Integer num, int i11, Object obj) {
        d dVar2 = dVar;
        int i12 = i11;
        return dVar.a((i12 & 1) != 0 ? dVar2.f83292a : str, (i12 & 2) != 0 ? dVar2.f83293b : str2, (i12 & 4) != 0 ? dVar2.f83294c : i10, (i12 & 8) != 0 ? dVar2.f83295d : aVar, (i12 & 16) != 0 ? dVar2.f83296e : z10, (i12 & 32) != 0 ? dVar2.f83297f : d10, (i12 & 64) != 0 ? dVar2.f83298g : d11, (i12 & 128) != 0 ? dVar2.f83299h : d12, (i12 & 256) != 0 ? dVar2.f83300i : d13, (i12 & 512) != 0 ? dVar2.f83301j : d14, (i12 & 1024) != 0 ? dVar2.f83302k : str3, (i12 & RecyclerView.n.FLAG_MOVED) != 0 ? dVar2.f83303l : fVar, (i12 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? dVar2.f83304m : num);
    }

    public final d a(String str, String str2, int i10, a aVar, boolean z10, double d10, double d11, Double d12, Double d13, Double d14, String str3, f fVar, Integer num) {
        String str4 = str;
        C17542s.j(str4, "productNo");
        String str5 = str2;
        C17542s.j(str5, "productType");
        f fVar2 = fVar;
        C17542s.j(fVar2, "productData");
        return new d(str4, str5, i10, aVar, z10, d10, d11, d12, d13, d14, str3, fVar2, num);
    }

    public final Double c() {
        return this.f83299h;
    }

    public final Double d() {
        return this.f83300i;
    }

    public final double e() {
        return this.f83297f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return C17542s.e(this.f83292a, dVar.f83292a) && C17542s.e(this.f83293b, dVar.f83293b) && this.f83294c == dVar.f83294c && this.f83295d == dVar.f83295d && this.f83296e == dVar.f83296e && Double.compare(this.f83297f, dVar.f83297f) == 0 && Double.compare(this.f83298g, dVar.f83298g) == 0 && C17542s.e(this.f83299h, dVar.f83299h) && C17542s.e(this.f83300i, dVar.f83300i) && C17542s.e(this.f83301j, dVar.f83301j) && C17542s.e(this.f83302k, dVar.f83302k) && C17542s.e(this.f83303l, dVar.f83303l) && C17542s.e(this.f83304m, dVar.f83304m);
    }

    public final double f() {
        return this.f83298g;
    }

    public final Double g() {
        return this.f83301j;
    }

    public final a h() {
        return this.f83295d;
    }

    public int hashCode() {
        int hashCode = ((((this.f83292a.hashCode() * 31) + this.f83293b.hashCode()) * 31) + Integer.hashCode(this.f83294c)) * 31;
        a aVar = this.f83295d;
        int i10 = 0;
        int hashCode2 = (((((((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + Boolean.hashCode(this.f83296e)) * 31) + Double.hashCode(this.f83297f)) * 31) + Double.hashCode(this.f83298g)) * 31;
        Double d10 = this.f83299h;
        int hashCode3 = (hashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f83300i;
        int hashCode4 = (hashCode3 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f83301j;
        int hashCode5 = (hashCode4 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str = this.f83302k;
        int hashCode6 = (((hashCode5 + (str == null ? 0 : str.hashCode())) * 31) + this.f83303l.hashCode()) * 31;
        Integer num = this.f83304m;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode6 + i10;
    }

    public final f i() {
        return this.f83303l;
    }

    public final String j() {
        return this.f83292a;
    }

    public final String k() {
        return this.f83293b;
    }

    public final int l() {
        return this.f83294c;
    }

    public final Integer m() {
        return this.f83304m;
    }

    public final String n() {
        return this.f83302k;
    }

    public final boolean o() {
        return this.f83296e;
    }

    public String toString() {
        String str = this.f83292a;
        String str2 = this.f83293b;
        int i10 = this.f83294c;
        a aVar = this.f83295d;
        boolean z10 = this.f83296e;
        double d10 = this.f83297f;
        double d11 = this.f83298g;
        Double d12 = this.f83299h;
        Double d13 = this.f83300i;
        Double d14 = this.f83301j;
        String str3 = this.f83302k;
        f fVar = this.f83303l;
        Integer num = this.f83304m;
        return "CartItemHolder(productNo=" + str + ", productType=" + str2 + ", quantity=" + i10 + ", priceType=" + aVar + ", isFamilyItem=" + z10 + ", itemTotalPrice=" + d10 + ", itemUnitPrice=" + d11 + ", baseItemTotalPrice=" + d12 + ", familyUpsellItemTotalPrice=" + d13 + ", lowestPreviousPrice=" + d14 + ", validUntilDate=" + str3 + ", productData=" + fVar + ", quantityLimit=" + num + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ d(java.lang.String r20, java.lang.String r21, int r22, Ln.d.a r23, boolean r24, double r25, double r27, java.lang.Double r29, java.lang.Double r30, java.lang.Double r31, java.lang.String r32, Ln.f r33, java.lang.Integer r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r13 = r2
            goto L_0x000b
        L_0x0009:
            r13 = r29
        L_0x000b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0011
            r14 = r2
            goto L_0x0013
        L_0x0011:
            r14 = r30
        L_0x0013:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x001a
            r16 = r2
            goto L_0x001c
        L_0x001a:
            r16 = r32
        L_0x001c:
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r11 = r27
            r15 = r31
            r17 = r33
            r18 = r34
            r3.<init>(r4, r5, r6, r7, r8, r9, r11, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ln.d.<init>(java.lang.String, java.lang.String, int, Ln.d$a, boolean, double, double, java.lang.Double, java.lang.Double, java.lang.Double, java.lang.String, Ln.f, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
