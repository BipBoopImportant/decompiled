package Sl;

import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"LSl/g;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "AccessibilityFeedback", "BuyGiftCards", "ChildProductRegistration", "ComplaintsBook", "ContactCustomerService", "EULA", "EnvironmentalTax", "FamilyTermsAndConditions", "GeneralTerms", "Impressum", "Imprint", "OrderTerms", "PrivacyAndSecurity", "PrivacyPolicy", "RecallInformation", "SaferHome", "ShopAndGoTerms", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum g {
    AccessibilityFeedback("accessibilityFeedback"),
    BuyGiftCards("BuyGiftCardsLink"),
    ChildProductRegistration("ChildrenProductRegistrationLink"),
    ComplaintsBook("complaintsBookLink"),
    ContactCustomerService("contactCustomerService"),
    EULA("EndOfUserAgreement"),
    EnvironmentalTax("prfUrl"),
    FamilyTermsAndConditions("FamilyTermsAndConditions"),
    GeneralTerms("GeneralTermsAndConditions"),
    Impressum("Impressum"),
    Imprint("Imprint"),
    OrderTerms("OrderTermsAndConditions"),
    PrivacyAndSecurity("PrivacyAndSecurityLink"),
    PrivacyPolicy("PrivacyPolicy"),
    RecallInformation("RecallInformation"),
    SaferHome("SaferHomesLink"),
    ShopAndGoTerms("ShopAndGoTermsAndConditions");
    
    private final String key;

    static {
        g[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private g(String str) {
        this.key = str;
    }

    public static C17220a<g> b() {
        return $ENTRIES;
    }

    public final String j() {
        return this.key;
    }
}
