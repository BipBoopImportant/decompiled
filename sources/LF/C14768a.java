package lF;

import HJ.C15854t;
import NF.C13288b;
import NF.C13289c;
import YE.C13868b;
import YE.e;
import YH.C16877v;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import wK.C18464r2;
import wK.C18488t2;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u0000 B2\u00020\u0001:\u0001\u0013B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0017\u0010-\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001f\u0010,R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u0014\u001a\u0004\b\u0019\u0010\fR\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u0014\u001a\u0004\b\u0017\u0010\fR\u0017\u00103\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u00108\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\u0016\u00107R\u0017\u0010=\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b\u0015\u0010<R\u0014\u0010?\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0014R\u0017\u0010A\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010\u0014\u001a\u0004\b\u001b\u0010\f¨\u0006C"}, d2 = {"LlF/a;", "", "", "price", "country", "language", "", "showDifferenceOperator", "alwaysDisplayDecimals", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "Z", "e", "Ljava/util/Locale;", "f", "Ljava/util/Locale;", "locale", "LNF/c;", "g", "LNF/c;", "currencyFormat", "LNF/b;", "h", "LNF/b;", "currencyCode", "i", "Ljava/lang/Object;", "differenceOperator", "", "j", "F", "()F", "priceValue", "k", "integerValue", "l", "decimalValue", "m", "currency", "LwK/t2;", "n", "LwK/t2;", "()LwK/t2;", "decimalSign", "LwK/r2;", "o", "LwK/r2;", "()LwK/r2;", "currencyPosition", "p", "decimalPretty", "q", "plainText", "r", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lF.a  reason: case insensitive filesystem */
public final class C14768a {

    /* renamed from: r  reason: collision with root package name */
    public static final C3175a f128948r = new C3175a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f128949a;

    /* renamed from: b  reason: collision with root package name */
    private final String f128950b;

    /* renamed from: c  reason: collision with root package name */
    private final String f128951c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f128952d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f128953e;

    /* renamed from: f  reason: collision with root package name */
    private final Locale f128954f;

    /* renamed from: g  reason: collision with root package name */
    private final C13289c f128955g;

    /* renamed from: h  reason: collision with root package name */
    private final C13288b f128956h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f128957i;

    /* renamed from: j  reason: collision with root package name */
    private final float f128958j;

    /* renamed from: k  reason: collision with root package name */
    private final String f128959k;

    /* renamed from: l  reason: collision with root package name */
    private final String f128960l;

    /* renamed from: m  reason: collision with root package name */
    private final String f128961m;

    /* renamed from: n  reason: collision with root package name */
    private final C18488t2 f128962n;

    /* renamed from: o  reason: collision with root package name */
    private final C18464r2 f128963o;

    /* renamed from: p  reason: collision with root package name */
    private final String f128964p;

    /* renamed from: q  reason: collision with root package name */
    private final String f128965q;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LlF/a$a;", "", "<init>", "()V", "", "a", "(Ljava/lang/String;)Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lF.a$a  reason: collision with other inner class name */
    public static final class C3175a {
        public /* synthetic */ C3175a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String str) {
            C17542s.j(str, "<this>");
            String str2 = "";
            if (str.length() == 0) {
                return str2;
            }
            int length = str.length();
            while (true) {
                length--;
                if (-1 >= length) {
                    return str2;
                }
                str2 = str2 + str.charAt(length);
            }
        }

        private C3175a() {
        }
    }

    public C14768a(String str, String str2, String str3, boolean z10, boolean z11) {
        String str4;
        String str5;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        boolean z12 = z10;
        boolean z13 = z11;
        C17542s.j(str6, "price");
        C17542s.j(str7, PlaceTypes.COUNTRY);
        C17542s.j(str8, "language");
        this.f128949a = str6;
        this.f128950b = str7;
        this.f128951c = str8;
        this.f128952d = z12;
        this.f128953e = z13;
        Locale locale = new Locale(str8, str7);
        this.f128954f = locale;
        C13289c a10 = C13289c.Companion.a(str7, str8);
        this.f128955g = a10;
        C13288b a11 = C13288b.Companion.a(str7);
        this.f128956h = a11;
        char G12 = C15854t.G1(str);
        String str9 = null;
        String valueOf = G12 != '-' ? null : Character.valueOf(G12);
        String str10 = "";
        if (valueOf == null) {
            valueOf = z12 ? '+' : null;
            if (valueOf == null) {
                valueOf = str10;
            }
        }
        this.f128957i = valueOf;
        this.f128958j = Float.parseFloat(str);
        C3175a aVar = f128948r;
        this.f128959k = aVar.a(C16877v.G0(C15854t.D1(aVar.a((String) C15854t.Y0(C15854t.Q(str, "-", "", false, 4, (Object) null), new String[]{"."}, false, 0, 6, (Object) null).get(0)), 3), a10.n(), (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null));
        String E02 = C15854t.E0(C15854t.K1((String) C15854t.Y0(C15854t.Q(str, "-", "", false, 4, (Object) null), new String[]{"."}, false, 0, 6, (Object) null).get(1), 2), 2, '0');
        str9 = (!C17542s.e(E02, "00") || z13) ? E02 : str9;
        if (str9 == null) {
            String m10 = a10.m();
            str9 = m10.length() == 0 ? str10 : m10;
        }
        this.f128960l = str9;
        try {
            str4 = a11.j();
            str4 = str4 == null ? Currency.getInstance(a11.b()).getSymbol(locale) : str4;
            C17542s.g(str4);
        } catch (Exception e10) {
            C13868b.f118106a.b("Invalid locale for currency: " + e10, e.Converter);
            str4 = str10;
        }
        this.f128961m = str4;
        C18488t2 j10 = this.f128955g.j();
        this.f128962n = j10;
        C18464r2 b10 = this.f128955g.b();
        this.f128963o = b10;
        if (!C15854t.v0(this.f128960l)) {
            str10 = j10.b() + this.f128960l;
        }
        this.f128964p = str10;
        if (b10 == C18464r2.Leading) {
            str5 = this.f128957i + str4 + this.f128959k + str10;
        } else {
            str5 = this.f128957i + this.f128959k + str10 + str4;
        }
        this.f128965q = str5;
    }

    public final String a() {
        return this.f128961m;
    }

    public final C18464r2 b() {
        return this.f128963o;
    }

    public final C18488t2 c() {
        return this.f128962n;
    }

    public final String d() {
        return this.f128960l;
    }

    public final String e() {
        return this.f128959k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14768a)) {
            return false;
        }
        C14768a aVar = (C14768a) obj;
        return C17542s.e(this.f128949a, aVar.f128949a) && C17542s.e(this.f128950b, aVar.f128950b) && C17542s.e(this.f128951c, aVar.f128951c) && this.f128952d == aVar.f128952d && this.f128953e == aVar.f128953e;
    }

    public final String f() {
        return this.f128965q;
    }

    public final float g() {
        return this.f128958j;
    }

    public int hashCode() {
        return (((((((this.f128949a.hashCode() * 31) + this.f128950b.hashCode()) * 31) + this.f128951c.hashCode()) * 31) + Boolean.hashCode(this.f128952d)) * 31) + Boolean.hashCode(this.f128953e);
    }

    public String toString() {
        String str = this.f128949a;
        String str2 = this.f128950b;
        String str3 = this.f128951c;
        boolean z10 = this.f128952d;
        boolean z11 = this.f128953e;
        return "PriceData(price=" + str + ", country=" + str2 + ", language=" + str3 + ", showDifferenceOperator=" + z10 + ", alwaysDisplayDecimals=" + z11 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14768a(String str, String str2, String str3, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
    }
}
