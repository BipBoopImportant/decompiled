package Ql;

import android.telephony.TelephonyManager;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"LQl/a;", "LSl/a;", "Landroid/telephony/TelephonyManager;", "telephonyManager", "<init>", "(Landroid/telephony/TelephonyManager;)V", "Ljava/util/Locale;", "invoke", "()Ljava/util/Locale;", "deviceLocale", "a", "(Ljava/util/Locale;)Ljava/util/Locale;", "Landroid/telephony/TelephonyManager;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Sl.a {

    /* renamed from: a  reason: collision with root package name */
    private final TelephonyManager f85954a;

    public a(TelephonyManager telephonyManager) {
        this.f85954a = telephonyManager;
    }

    public final Locale a(Locale locale) {
        String networkCountryIso;
        C17542s.j(locale, "deviceLocale");
        TelephonyManager telephonyManager = this.f85954a;
        String str = null;
        if (telephonyManager != null) {
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (simCountryIso != null && simCountryIso.length() == 2) {
                Locale locale2 = Locale.US;
                C17542s.i(locale2, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
                str = simCountryIso.toLowerCase(locale2);
                C17542s.i(str, "toLowerCase(...)");
            } else if (!(telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null || networkCountryIso.length() != 2)) {
                Locale locale3 = Locale.US;
                C17542s.i(locale3, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
                str = networkCountryIso.toLowerCase(locale3);
                C17542s.i(str, "toLowerCase(...)");
            }
        }
        return str != null ? new Locale(locale.getLanguage(), str) : locale;
    }

    public Locale invoke() {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            locale = Locale.US;
        }
        C17542s.g(locale);
        return a(locale);
    }
}
