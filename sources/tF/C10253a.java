package tf;

import TJ.C16519P;
import TJ.C16532g;
import com.ingka.ikea.killswitch.model.KillSwitchConfig;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b:\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H¦@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\fH¦@¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0014R\u0014\u0010 \u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0014\u0010\"\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0017R\u0014\u0010$\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0017R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001c\u0010,\u001a\u00020\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0017\"\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0017R\u0014\u00100\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0017R\u0014\u00102\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0017R\u0014\u00104\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0017R\u0014\u00106\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0017R\u0014\u00108\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0017R\u0014\u0010:\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0017R\u0014\u0010<\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0017R\u0014\u0010>\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0017R\u0014\u0010@\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0017R\u0014\u0010B\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0017R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00050%8&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010'R\u0014\u0010F\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u0017R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00050%8&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010'R\u0014\u0010J\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0017R\u0014\u0010L\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0017R\u0014\u0010N\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0017R\u0014\u0010P\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u0017R\u0014\u0010R\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0017R\u0014\u0010T\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u0017R\u0014\u0010V\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\u0017R\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00050%8&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010'R\u0014\u0010Z\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010\u0017R\u0014\u0010\\\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u0017R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00050%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010'¨\u0006_"}, d2 = {"Ltf/a;", "", "LXH/N;", "t", "()V", "", "f", "(LdI/e;)Ljava/lang/Object;", "", "retailCode", "languageCode", "isBlockMessageAllowed", "Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;", "B", "(Ljava/lang/String;Ljava/lang/String;ZLdI/e;)Ljava/lang/Object;", "newKillSwitchConfig", "F", "(Lcom/ingka/ikea/killswitch/model/KillSwitchConfig;LdI/e;)Ljava/lang/Object;", "LTJ/P;", "I", "()LTJ/P;", "killSwitchConfigFlow", "J", "()Z", "isDynamicLinkShareDisabled", "L", "isOnlineCheckoutEnabled", "q", "isScanAndGoSupported", "x", "isScanAndGoEnabledFlow", "b", "showAddToCartUnrestricted", "r", "isAppRatingEnabled", "E", "isFamilyRewardsCartEnabled", "LTJ/g;", "y", "()LTJ/g;", "isFamilyRewardsEnabledFlow", "H", "setBlockMessageAllowOnThisUpdate", "(Z)V", "isBlockMessageAllowOnThisUpdate", "w", "isOnlineAvailabilityEnabled", "K", "isOnlineClickCollectAvailabilityEnabled", "n", "isShopAndGoTermsAndConditionsEnabled", "v", "isAvailabilityCartEnabled", "A", "isAssemblyServicesAvailabilityEnabled", "D", "isAssemblyServicesOrderEnabled", "i", "isFinancialServicesEnabled", "l", "isPurchaseHistoryListingEnabled", "u", "isPurchaseHistoryLookupEnabled", "d", "isBackInStockNotificationsEnabledCashAndCarry", "k", "isBackInStockNotificationsEnabledHomeDelivery", "p", "isGeomagicalEnabledFlow", "g", "isRegisterPushTokensEnabled", "s", "isWayfindingEnabledFlow", "a", "isUpsertAddressInCheckoutEnabled", "G", "isInboxBackgroundFetchEnabled", "M", "isExpressAndOnlineReturnsEnabled", "e", "isInAppUpdatesEnabled", "j", "enableNavigeraAlertMessages", "m", "enableBrowseCommercialMessagesBanner", "c", "enableOffersHub", "o", "enableOffersHubFlow", "C", "enableAppointmentBooking", "h", "enableStoreModeActivation", "z", "enablePrepaidCardsFlow", "killswitch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tf.a  reason: case insensitive filesystem */
public interface C10253a {
    boolean A();

    Object B(String str, String str2, boolean z10, C17164e<? super KillSwitchConfig> eVar);

    boolean C();

    boolean D();

    boolean E();

    Object F(KillSwitchConfig killSwitchConfig, C17164e<? super Boolean> eVar);

    boolean G();

    boolean H();

    C16519P<KillSwitchConfig> I();

    boolean J();

    boolean K();

    C16519P<Boolean> L();

    boolean M();

    boolean a();

    boolean b();

    boolean c();

    boolean d();

    boolean e();

    Object f(C17164e<? super Boolean> eVar);

    boolean g();

    boolean h();

    boolean i();

    boolean j();

    boolean k();

    boolean l();

    boolean m();

    boolean n();

    C16532g<Boolean> o();

    C16532g<Boolean> p();

    boolean q();

    boolean r();

    C16532g<Boolean> s();

    void t();

    boolean u();

    boolean v();

    boolean w();

    C16519P<Boolean> x();

    C16532g<Boolean> y();

    C16532g<Boolean> z();
}
