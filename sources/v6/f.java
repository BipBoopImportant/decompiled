package v6;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import t6.C8833b;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001e\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b\u001c\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b\u0018\u0010#¨\u0006'"}, d2 = {"Lv6/f;", "", "Ljava/math/BigDecimal;", "minimumAmount", "maximumAmount", "Ljava/util/Currency;", "currency", "Ljava/util/Locale;", "locale", "Lt6/b;", "environment", "consumerLocale", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Currency;Ljava/util/Locale;Lt6/b;Ljava/util/Locale;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/math/BigDecimal;", "e", "()Ljava/math/BigDecimal;", "b", "d", "c", "Ljava/util/Currency;", "getCurrency", "()Ljava/util/Currency;", "Ljava/util/Locale;", "()Ljava/util/Locale;", "Lt6/b;", "()Lt6/b;", "f", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final BigDecimal f56907a;

    /* renamed from: b  reason: collision with root package name */
    private final BigDecimal f56908b;

    /* renamed from: c  reason: collision with root package name */
    private final Currency f56909c;

    /* renamed from: d  reason: collision with root package name */
    private final Locale f56910d;

    /* renamed from: e  reason: collision with root package name */
    private final C8833b f56911e;

    /* renamed from: f  reason: collision with root package name */
    private final Locale f56912f;

    public f(BigDecimal bigDecimal, BigDecimal bigDecimal2, Currency currency, Locale locale, C8833b bVar, Locale locale2) {
        C17542s.j(bigDecimal2, "maximumAmount");
        C17542s.j(currency, "currency");
        C17542s.j(locale, "locale");
        C17542s.j(bVar, "environment");
        this.f56907a = bigDecimal;
        this.f56908b = bigDecimal2;
        this.f56909c = currency;
        this.f56910d = locale;
        this.f56911e = bVar;
        this.f56912f = locale2;
    }

    public final Locale a() {
        return this.f56912f;
    }

    public final C8833b b() {
        return this.f56911e;
    }

    public final Locale c() {
        return this.f56910d;
    }

    public final BigDecimal d() {
        return this.f56908b;
    }

    public final BigDecimal e() {
        return this.f56907a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return C17542s.e(this.f56907a, fVar.f56907a) && C17542s.e(this.f56908b, fVar.f56908b) && C17542s.e(this.f56909c, fVar.f56909c) && C17542s.e(this.f56910d, fVar.f56910d) && this.f56911e == fVar.f56911e && C17542s.e(this.f56912f, fVar.f56912f);
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.f56907a;
        int i10 = 0;
        int hashCode = (((((((((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31) + this.f56908b.hashCode()) * 31) + this.f56909c.hashCode()) * 31) + this.f56910d.hashCode()) * 31) + this.f56911e.hashCode()) * 31;
        Locale locale = this.f56912f;
        if (locale != null) {
            i10 = locale.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "Configuration(minimumAmount=" + this.f56907a + ", maximumAmount=" + this.f56908b + ", currency=" + this.f56909c + ", locale=" + this.f56910d + ", environment=" + this.f56911e + ", consumerLocale=" + this.f56912f + ')';
    }
}
