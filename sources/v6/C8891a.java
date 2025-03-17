package v6;

import com.afterpay.android.Afterpay;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b>\b\u0001\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001:BÑ\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b#\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b$\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b%\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b&\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b'\u0010 R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b(\u0010 R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b)\u0010 R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b*\u0010 R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b+\u0010 R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b,\u0010 R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b-\u0010 R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b.\u0010 R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b/\u0010 R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b0\u0010 R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b1\u0010 R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b2\u0010 R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b3\u0010 R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b4\u0010 R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b5\u0010 R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b6\u0010 R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b7\u0010 R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b8\u0010 j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?¨\u0006@"}, d2 = {"Lv6/a;", "", "", "breakdownLimit", "breakdownLimitDescription", "introOrTitle", "introOr", "introInTitle", "introIn", "introPayTitle", "introPay", "introPayInTitle", "introPayIn", "introMakeTitle", "introMake", "noConfigurationDescription", "noConfiguration", "loadErrorTitle", "loadErrorRetry", "loadErrorCancel", "loadErrorMessage", "paymentButtonContentDescription", "priceBreakdownAvailable", "priceBreakdownAvailableDescription", "priceBreakdownWith", "priceBreakdownInterestFree", "priceBreakdownLinkLearnMore", "priceBreakdownLinkMoreInfo", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getBreakdownLimit", "()Ljava/lang/String;", "getBreakdownLimitDescription", "getIntroOrTitle", "getIntroOr", "getIntroInTitle", "getIntroIn", "getIntroPayTitle", "getIntroPay", "getIntroPayInTitle", "getIntroPayIn", "getIntroMakeTitle", "getIntroMake", "getNoConfigurationDescription", "getNoConfiguration", "n", "m", "b", "j", "getPaymentButtonContentDescription", "getPriceBreakdownAvailable", "getPriceBreakdownAvailableDescription", "getPriceBreakdownWith", "getPriceBreakdownInterestFree", "getPriceBreakdownLinkLearnMore", "getPriceBreakdownLinkMoreInfo", "Companion", "a", "EN", "FR_CA", "FR", "IT", "ES", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: v6.a  reason: case insensitive filesystem */
public enum C8891a {
    EN("available for orders between %1$s – %2$s", "%1$s available for orders between %2$s – %3$s", "Or", "or", "In", "in", "Pay", "pay", "Pay in", "pay in", "Make", "make", "Or pay with %1$s", "or pay with", "Error", "Retry", "Cancel", "Failed to load %1$s checkout", "Pay now with %1$s", "%1$s %2$s %3$spayments of %4$s %5$s", "%1$s %2$s %3$spayments of %4$s %5$s%6$s", "with ", "interest-free ", "Learn More", "More Info"),
    FR_CA("disponible pour les montants entre %1$s – %2$s", "%1$s disponible pour les montants entre %2$s – %3$s", "Ou", "ou", "En", "en", "Payez", "payez", "Payez en", "payez en", "Effectuez", "effectuez", "Ou payer avec %1$s", "ou payer avec", "Erreur", "Retenter", "Annuler", "Échec du chargement de la caisse %1$s", "Payez maintenant avec %1$s", "%1$s %2$s paiements %3$sde %4$s %5$s", "%1$s %2$s paiements %3$sde %4$s %5$s%6$s", "avec ", "sans intérêts ", "En savoir plus", "Plus d'infos"),
    FR("disponible pour les montants entre %1$s – %2$s", "%1$s disponible pour les montants entre %2$s – %3$s", "Ou", "ou", "En", "en", "Payez", "payez", "Payez en", "payez en", "Effectuez", "effectuez", "Ou payer avec %1$s", "ou payer avec", "Erreur", "Réessayer", "Annuler", "Échec du chargement de la page de paiement 1%$s", "Payez maintenant avec %1$s", "%1$s %2$s paiements %3$sde %4$s %5$s", "%1$s %2$s paiements %3$sde %4$s %5$s%6$s", "avec ", "sans frais ", "En savoir plus", "Plus d'infos"),
    IT("disponibile per importi fra %1$s – %2$s", "%1$s disponibile per importi fra %2$s – %3$s", "O", "o", "In", "in", "Paga", "paga", "Paga in", "paga in", "Scegli", "scegli", "O paga con %1$s", "o paga con", "Errore", "Riprovare", "Annulla", "Impossibile caricare il cassa di %1$s", "Paga ora con %1$s", "%1$s %2$s rate %3$sda %4$s %5$s", "%1$s %2$s rate %3$sda %4$s %5$s%6$s", "con ", "senza interessi ", "Scopri di piú", "Maggiori info"),
    ES("disponible para importes entre %1$s – %2$s", "%1$s disponible para importes entre %2$s – %3$s", "O", "o", "En", "en", "Paga", "paga", "Paga en", "paga en", "Haga", "haga", "O pagar con %1$s", "o pagar con", "Error", "Volver a intentar", "Cancelar", "Imposible cargar la página de pago de %1$s", "Pagar ahora con %1$s", "%1$s %2$s pagos %3$sde %4$s %5$s", "%1$s %2$s pagos %3$sde %4$s %5$s%6$s", "con ", "sin coste ", "Saber más", "Más infos");
    
    public static final C0915a Companion = null;
    private final String breakdownLimit;
    private final String breakdownLimitDescription;
    private final String introIn;
    private final String introInTitle;
    private final String introMake;
    private final String introMakeTitle;
    private final String introOr;
    private final String introOrTitle;
    private final String introPay;
    private final String introPayIn;
    private final String introPayInTitle;
    private final String introPayTitle;
    private final String loadErrorCancel;
    private final String loadErrorMessage;
    private final String loadErrorRetry;
    private final String loadErrorTitle;
    private final String noConfiguration;
    private final String noConfigurationDescription;
    private final String paymentButtonContentDescription;
    private final String priceBreakdownAvailable;
    private final String priceBreakdownAvailableDescription;
    private final String priceBreakdownInterestFree;
    private final String priceBreakdownLinkLearnMore;
    private final String priceBreakdownLinkMoreInfo;
    private final String priceBreakdownWith;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv6/a$a;", "", "<init>", "()V", "Lv6/a;", "a", "()Lv6/a;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* renamed from: v6.a$a  reason: collision with other inner class name */
    public static final class C0915a {
        public /* synthetic */ C0915a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C8891a a() {
            C8891a aVar = (C8891a) b.f56903a.get(Afterpay.f45951a.g());
            return aVar == null ? C8891a.EN : aVar;
        }

        private C0915a() {
        }
    }

    static {
        Companion = new C0915a((DefaultConstructorMarker) null);
    }

    private C8891a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25) {
        this.breakdownLimit = str;
        this.breakdownLimitDescription = str2;
        this.introOrTitle = str3;
        this.introOr = str4;
        this.introInTitle = str5;
        this.introIn = str6;
        this.introPayTitle = str7;
        this.introPay = str8;
        this.introPayInTitle = str9;
        this.introPayIn = str10;
        this.introMakeTitle = str11;
        this.introMake = str12;
        this.noConfigurationDescription = str13;
        this.noConfiguration = str14;
        this.loadErrorTitle = str15;
        this.loadErrorRetry = str16;
        this.loadErrorCancel = str17;
        this.loadErrorMessage = str18;
        this.paymentButtonContentDescription = str19;
        this.priceBreakdownAvailable = str20;
        this.priceBreakdownAvailableDescription = str21;
        this.priceBreakdownWith = str22;
        this.priceBreakdownInterestFree = str23;
        this.priceBreakdownLinkLearnMore = str24;
        this.priceBreakdownLinkMoreInfo = str25;
    }

    public final String b() {
        return this.loadErrorCancel;
    }

    public final String j() {
        return this.loadErrorMessage;
    }

    public final String m() {
        return this.loadErrorRetry;
    }

    public final String n() {
        return this.loadErrorTitle;
    }
}
