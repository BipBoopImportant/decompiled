package Ml;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u001bJ\r\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b!\u0010*\u001a\u0004\b+\u0010$R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010$R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b,\u0010$R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u001f\u0010*\u001a\u0004\b/\u0010$R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u001e\u0010*\u001a\u0004\b0\u0010$R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u001c\u0010*\u001a\u0004\b1\u0010$R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b2\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\f\n\u0004\b\u001a\u00103\u001a\u0004\b4\u0010&R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\f\n\u0004\b1\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\f\n\u0004\b2\u00108\u001a\u0004\b.\u00109R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010:R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010;R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010:R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u0010<R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u00108¨\u0006="}, d2 = {"LMl/a;", "", "", "symbol", "decimalSymbol", "code", "negativeFormat", "positiveFormat", "digitGroupSymbol", "integerSymbol", "", "nbrFractionDigits", "", "showFractionDigitsOnInteger", "", "conversionRate", "LMl/d;", "decimalVerticalAlignment", "LMl/c;", "decimalSign", "currencyVerticalAlignment", "LMl/b;", "currencyPosition", "analyticsConversionRate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/Double;LMl/d;LMl/c;LMl/d;LMl/b;Ljava/lang/Double;)V", "h", "()LMl/d;", "f", "()LMl/c;", "e", "d", "()LMl/b;", "a", "()D", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "o", "b", "g", "c", "l", "m", "i", "j", "I", "k", "Z", "n", "()Z", "Ljava/lang/Double;", "()Ljava/lang/Double;", "LMl/d;", "LMl/c;", "LMl/b;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f83438a;

    /* renamed from: b  reason: collision with root package name */
    private final String f83439b;

    /* renamed from: c  reason: collision with root package name */
    private final String f83440c;

    /* renamed from: d  reason: collision with root package name */
    private final String f83441d;

    /* renamed from: e  reason: collision with root package name */
    private final String f83442e;

    /* renamed from: f  reason: collision with root package name */
    private final String f83443f;

    /* renamed from: g  reason: collision with root package name */
    private final String f83444g;

    /* renamed from: h  reason: collision with root package name */
    private final int f83445h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f83446i;

    /* renamed from: j  reason: collision with root package name */
    private final Double f83447j;

    /* renamed from: k  reason: collision with root package name */
    private final d f83448k;

    /* renamed from: l  reason: collision with root package name */
    private final c f83449l;

    /* renamed from: m  reason: collision with root package name */
    private final d f83450m;

    /* renamed from: n  reason: collision with root package name */
    private final b f83451n;

    /* renamed from: o  reason: collision with root package name */
    private final Double f83452o;

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, boolean z10, Double d10, d dVar, c cVar, d dVar2, b bVar, Double d11) {
        String str8 = str7;
        C17542s.j(str, "symbol");
        C17542s.j(str2, "decimalSymbol");
        C17542s.j(str3, "code");
        C17542s.j(str4, "negativeFormat");
        C17542s.j(str5, "positiveFormat");
        C17542s.j(str6, "digitGroupSymbol");
        C17542s.j(str8, "integerSymbol");
        this.f83438a = str;
        this.f83439b = str2;
        this.f83440c = str3;
        this.f83441d = str4;
        this.f83442e = str5;
        this.f83443f = str6;
        this.f83444g = str8;
        this.f83445h = i10;
        this.f83446i = z10;
        this.f83447j = d10;
        this.f83448k = dVar;
        this.f83449l = cVar;
        this.f83450m = dVar2;
        this.f83451n = bVar;
        this.f83452o = d11;
    }

    public final double a() {
        Double d10 = this.f83452o;
        if (d10 != null) {
            return d10.doubleValue();
        }
        return 1.0d;
    }

    public final String b() {
        return this.f83440c;
    }

    public final Double c() {
        return this.f83447j;
    }

    public final b d() {
        b bVar = this.f83451n;
        return bVar == null ? b.LEADING : bVar;
    }

    public final d e() {
        d dVar = this.f83450m;
        return dVar == null ? d.TOP : dVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f83438a, aVar.f83438a) && C17542s.e(this.f83439b, aVar.f83439b) && C17542s.e(this.f83440c, aVar.f83440c) && C17542s.e(this.f83441d, aVar.f83441d) && C17542s.e(this.f83442e, aVar.f83442e) && C17542s.e(this.f83443f, aVar.f83443f) && C17542s.e(this.f83444g, aVar.f83444g) && this.f83445h == aVar.f83445h && this.f83446i == aVar.f83446i && C17542s.e(this.f83447j, aVar.f83447j) && this.f83448k == aVar.f83448k && this.f83449l == aVar.f83449l && this.f83450m == aVar.f83450m && this.f83451n == aVar.f83451n && C17542s.e(this.f83452o, aVar.f83452o);
    }

    public final c f() {
        c cVar = this.f83449l;
        return cVar == null ? c.COMMA : cVar;
    }

    public final String g() {
        return this.f83439b;
    }

    public final d h() {
        d dVar = this.f83448k;
        return dVar == null ? d.TOP : dVar;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f83438a.hashCode() * 31) + this.f83439b.hashCode()) * 31) + this.f83440c.hashCode()) * 31) + this.f83441d.hashCode()) * 31) + this.f83442e.hashCode()) * 31) + this.f83443f.hashCode()) * 31) + this.f83444g.hashCode()) * 31) + Integer.hashCode(this.f83445h)) * 31) + Boolean.hashCode(this.f83446i)) * 31;
        Double d10 = this.f83447j;
        int i10 = 0;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        d dVar = this.f83448k;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        c cVar = this.f83449l;
        int hashCode4 = (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar2 = this.f83450m;
        int hashCode5 = (hashCode4 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        b bVar = this.f83451n;
        int hashCode6 = (hashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Double d11 = this.f83452o;
        if (d11 != null) {
            i10 = d11.hashCode();
        }
        return hashCode6 + i10;
    }

    public final String i() {
        return this.f83443f;
    }

    public final String j() {
        return this.f83444g;
    }

    public final int k() {
        return this.f83445h;
    }

    public final String l() {
        return this.f83441d;
    }

    public final String m() {
        return this.f83442e;
    }

    public final boolean n() {
        return this.f83446i;
    }

    public final String o() {
        return this.f83438a;
    }

    public String toString() {
        String str = this.f83438a;
        String str2 = this.f83439b;
        String str3 = this.f83440c;
        String str4 = this.f83441d;
        String str5 = this.f83442e;
        String str6 = this.f83443f;
        String str7 = this.f83444g;
        int i10 = this.f83445h;
        boolean z10 = this.f83446i;
        Double d10 = this.f83447j;
        d dVar = this.f83448k;
        c cVar = this.f83449l;
        d dVar2 = this.f83450m;
        b bVar = this.f83451n;
        Double d11 = this.f83452o;
        return "CurrencyConfigEntity(symbol=" + str + ", decimalSymbol=" + str2 + ", code=" + str3 + ", negativeFormat=" + str4 + ", positiveFormat=" + str5 + ", digitGroupSymbol=" + str6 + ", integerSymbol=" + str7 + ", nbrFractionDigits=" + i10 + ", showFractionDigitsOnInteger=" + z10 + ", conversionRate=" + d10 + ", decimalVerticalAlignment=" + dVar + ", decimalSign=" + cVar + ", currencyVerticalAlignment=" + dVar2 + ", currencyPosition=" + bVar + ", analyticsConversionRate=" + d11 + ")";
    }
}
