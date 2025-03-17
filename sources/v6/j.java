package v6;

import YH.g0;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\"\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, d2 = {"Lv6/j;", "", "<init>", "()V", "Ljava/util/Locale;", "b", "Ljava/util/Locale;", "a", "()Ljava/util/Locale;", "EN_AU", "c", "EN_CA", "d", "g", "FR_CA", "e", "EN_NZ", "f", "EN_GB", "EN_US", "h", "i", "IT_IT", "FR_FR", "j", "ES_ES", "", "k", "Ljava/util/Set;", "()Ljava/util/Set;", "validSet", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f56916a = new j();

    /* renamed from: b  reason: collision with root package name */
    private static final Locale f56917b;

    /* renamed from: c  reason: collision with root package name */
    private static final Locale f56918c;

    /* renamed from: d  reason: collision with root package name */
    private static final Locale f56919d;

    /* renamed from: e  reason: collision with root package name */
    private static final Locale f56920e;

    /* renamed from: f  reason: collision with root package name */
    private static final Locale f56921f;

    /* renamed from: g  reason: collision with root package name */
    private static final Locale f56922g;

    /* renamed from: h  reason: collision with root package name */
    private static final Locale f56923h;

    /* renamed from: i  reason: collision with root package name */
    private static final Locale f56924i;

    /* renamed from: j  reason: collision with root package name */
    private static final Locale f56925j;

    /* renamed from: k  reason: collision with root package name */
    private static final Set<Locale> f56926k;

    static {
        Locale locale = new Locale("en", "AU");
        f56917b = locale;
        Locale locale2 = Locale.CANADA;
        C17542s.i(locale2, "CANADA");
        f56918c = locale2;
        Locale locale3 = Locale.CANADA_FRENCH;
        C17542s.i(locale3, "CANADA_FRENCH");
        f56919d = locale3;
        Locale locale4 = new Locale("en", "NZ");
        f56920e = locale4;
        Locale locale5 = Locale.UK;
        C17542s.i(locale5, "UK");
        f56921f = locale5;
        Locale locale6 = Locale.US;
        C17542s.i(locale6, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
        f56922g = locale6;
        Locale locale7 = Locale.ITALY;
        C17542s.i(locale7, "ITALY");
        f56923h = locale7;
        Locale locale8 = Locale.FRANCE;
        C17542s.i(locale8, "FRANCE");
        f56924i = locale8;
        Locale locale9 = new Locale("es", "ES");
        f56925j = locale9;
        f56926k = g0.h(locale, locale2, locale3, locale5, locale4, locale6, locale7, locale8, locale9);
    }

    private j() {
    }

    public final Locale a() {
        return f56917b;
    }

    public final Locale b() {
        return f56918c;
    }

    public final Locale c() {
        return f56921f;
    }

    public final Locale d() {
        return f56920e;
    }

    public final Locale e() {
        return f56922g;
    }

    public final Locale f() {
        return f56925j;
    }

    public final Locale g() {
        return f56919d;
    }

    public final Locale h() {
        return f56924i;
    }

    public final Locale i() {
        return f56923h;
    }

    public final Set<Locale> j() {
        return f56926k;
    }
}
