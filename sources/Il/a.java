package Il;

import Rl.b;
import Rl.g;
import com.ingka.ikea.appconfig.model.GiftCardConfiguration;
import com.ingka.ikea.appconfig.model.MapServiceData;
import com.ingka.ikea.appconfig.model.PostalCodePickerConfig;
import dI.C17164e;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kp.C11522d;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005H¦@¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028&X§\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00058&X§\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\f\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\f\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\f\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\"\u001a\u00020\u001e8&X§\u0004¢\u0006\f\u0012\u0004\b!\u0010\f\u001a\u0004\b\u001f\u0010 R\u001c\u0010'\u001a\u0004\u0018\u00010#8&X§\u0004¢\u0006\f\u0012\u0004\b&\u0010\f\u001a\u0004\b$\u0010%R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028&X§\u0004¢\u0006\f\u0012\u0004\b)\u0010\f\u001a\u0004\b(\u0010\u0010R\u001a\u0010/\u001a\u00020+8&X§\u0004¢\u0006\f\u0012\u0004\b.\u0010\f\u001a\u0004\b,\u0010-R\u001a\u00102\u001a\u00020+8&X§\u0004¢\u0006\f\u0012\u0004\b1\u0010\f\u001a\u0004\b0\u0010-R\u001a\u00107\u001a\u0002038&X§\u0004¢\u0006\f\u0012\u0004\b6\u0010\f\u001a\u0004\b4\u00105R\u001a\u0010<\u001a\u0002088&X§\u0004¢\u0006\f\u0012\u0004\b;\u0010\f\u001a\u0004\b9\u0010:R\u001c\u0010A\u001a\u0004\u0018\u00010=8&X§\u0004¢\u0006\f\u0012\u0004\b@\u0010\f\u001a\u0004\b>\u0010?R\u001a\u0010D\u001a\u00020\u00058&X§\u0004¢\u0006\f\u0012\u0004\bC\u0010\f\u001a\u0004\bB\u0010\u000eR\u001a\u0010G\u001a\u00020\u00058&X§\u0004¢\u0006\f\u0012\u0004\bF\u0010\f\u001a\u0004\bE\u0010\u000eR \u0010M\u001a\b\u0012\u0004\u0012\u00020I0H8&X§\u0004¢\u0006\f\u0012\u0004\bL\u0010\f\u001a\u0004\bJ\u0010KR\u0014\u0010Q\u001a\u00020N8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u001a\u0010T\u001a\u00020\u00058&X§\u0004¢\u0006\f\u0012\u0004\bS\u0010\f\u001a\u0004\bR\u0010\u000e¨\u0006U"}, d2 = {"LIl/a;", "", "", "marketCode", "languageCode", "", "y", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "z", "(LdI/e;)Ljava/lang/Object;", "LXH/N;", "x", "()V", "h", "()Z", "j", "()Ljava/lang/String;", "getPrfUrl$annotations", "prfUrl", "m", "getShowPricesInclVat$annotations", "showPricesInclVat", "a", "getLanguageCode$annotations", "i", "getRetailCode$annotations", "retailCode", "o", "getLegalInformationFooter$annotations", "legalInformationFooter", "Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "v", "()Lcom/ingka/ikea/appconfig/model/PostalCodePickerConfig;", "getPostalCodePickerConfig$annotations", "postalCodePickerConfig", "Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration;", "q", "()Lcom/ingka/ikea/appconfig/model/GiftCardConfiguration;", "getGiftCardConfiguration$annotations", "giftCardConfiguration", "t", "getPrivacyPolicyUrl$annotations", "privacyPolicyUrl", "LRl/a;", "l", "()LRl/a;", "getHostedLoginPage$annotations", "hostedLoginPage", "k", "getHostedSignupPage$annotations", "hostedSignupPage", "LRl/g;", "u", "()LRl/g;", "getMeasurementSystem$annotations", "measurementSystem", "Lkp/d;", "s", "()Lkp/d;", "getCurrencyConfig$annotations", "currencyConfig", "Lcom/ingka/ikea/appconfig/model/MapServiceData;", "r", "()Lcom/ingka/ikea/appconfig/model/MapServiceData;", "getMapServiceData$annotations", "mapServiceData", "p", "getExtendedAnalyticsTrackingEnabled$annotations", "extendedAnalyticsTrackingEnabled", "n", "isEnablePrf$annotations", "isEnablePrf", "", "LRl/b;", "B", "()Ljava/util/List;", "getUrls$annotations", "urls", "Ljava/util/Locale;", "A", "()Ljava/util/Locale;", "applicationLocale", "w", "getFamilyAndRegularPriceSameSize$annotations", "familyAndRegularPriceSameSize", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {
    Locale A();

    List<b> B();

    String a();

    boolean h();

    String i();

    String j();

    Rl.a k();

    Rl.a l();

    boolean m();

    boolean n();

    String o();

    boolean p();

    GiftCardConfiguration q();

    MapServiceData r();

    C11522d s();

    String t();

    g u();

    PostalCodePickerConfig v();

    boolean w();

    void x();

    Object y(String str, String str2, C17164e<? super Boolean> eVar);

    Object z(C17164e<? super Boolean> eVar);
}
