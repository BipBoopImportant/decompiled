package If;

import QL.x;
import VL.C16699a;
import VL.C16700b;
import VL.C16704f;
import VL.C16707i;
import VL.o;
import VL.p;
import VL.s;
import VL.t;
import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.app.caasremote.models.AddEmployeeConsentRequestRemoteModel;
import com.ingka.ikea.app.caasremote.models.AddItemsRequestRemoteModel;
import com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel;
import com.ingka.ikea.app.caasremote.models.MergeCartFromUserIdRequestRemoteModel;
import com.ingka.ikea.app.caasremote.models.SetDiscountCodesRequestRemoteModel;
import com.ingka.ikea.app.caasremote.models.UpdateItemsRequestRemoteModel;
import com.ingka.ikea.app.caasremote.models.WrappedCartResponseRemoteModel;
import com.ingka.ikea.app.caasremote.models.h;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J@\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ@\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJ@\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00102\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013JÄ\u0001\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\"\u0010#Jº\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b$\u0010%JÆ\u0001\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b'\u0010(Jº\u0001\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b*\u0010%J@\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010,\u001a\u00020+2\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b-\u0010.J@\u00101\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u00100\u001a\u00020/2\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b1\u00102¨\u00063"}, d2 = {"LIf/a;", "", "", "retailUnit", "xConsumerName", "Lcom/ingka/ikea/app/caasremote/models/SetDiscountCodesRequestRemoteModel;", "setDiscountCodesRequestRemoteModel", "acceptLanguage", "LQL/x;", "Lcom/ingka/ikea/app/caasremote/models/WrappedCartResponseRemoteModel;", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/caasremote/models/SetDiscountCodesRequestRemoteModel;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/app/caasremote/models/AddEmployeeConsentRequestRemoteModel;", "addEmployeeConsentRequestRemoteModel", "c", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/caasremote/models/AddEmployeeConsentRequestRemoteModel;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/app/caasremote/models/AddItemsRequestRemoteModel;", "addItemsRequestRemoteModel", "f", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/caasremote/models/AddItemsRequestRemoteModel;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "discountCodes", "", "fetchCartContext", "fetchDiscountCodes", "fetchIndicativeAvailability", "fetchItemInfo", "fetchPrice", "fetchServices", "group", "postCode", "Lcom/ingka/ikea/app/caasremote/models/h;", "shoppingProfile", "stateCode", "storeId", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/caasremote/models/h;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/caasremote/models/h;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "itemNumbers", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/caasremote/models/h;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/app/caasremote/models/CartResponseRemoteModel;", "i", "Lcom/ingka/ikea/app/caasremote/models/MergeCartFromUserIdRequestRemoteModel;", "mergeCartFromUserIdRequestRemoteModel", "d", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/caasremote/models/MergeCartFromUserIdRequestRemoteModel;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/app/caasremote/models/UpdateItemsRequestRemoteModel;", "updateItemsRequestRemoteModel", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/caasremote/models/UpdateItemsRequestRemoteModel;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: If.a$a  reason: collision with other inner class name */
    public static final class C1004a {
        public static /* synthetic */ Object a(a aVar, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str5, String str6, h hVar, String str7, String str8, C17164e eVar, int i10, Object obj) {
            int i11 = i10;
            if (obj == null) {
                return aVar.a(str, str2, str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : bool, (i11 & 32) != 0 ? null : bool2, (i11 & 64) != 0 ? null : bool3, (i11 & 128) != 0 ? null : bool4, (i11 & 256) != 0 ? null : bool5, (i11 & 512) != 0 ? null : bool6, (i11 & 1024) != 0 ? null : str5, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? null : str6, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : hVar, (i11 & 8192) != 0 ? null : str7, (i11 & 16384) != 0 ? null : str8, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteDiscountCodesByUserToken");
        }

        public static /* synthetic */ Object b(a aVar, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str4, String str5, h hVar, String str6, String str7, C17164e eVar, int i10, Object obj) {
            int i11 = i10;
            if (obj == null) {
                return aVar.h(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? null : bool2, (i11 & 32) != 0 ? null : bool3, (i11 & 64) != 0 ? null : bool4, (i11 & 128) != 0 ? null : bool5, (i11 & 256) != 0 ? null : bool6, (i11 & 512) != 0 ? null : str4, (i11 & 1024) != 0 ? null : str5, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? null : hVar, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str6, (i11 & 8192) != 0 ? null : str7, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteEmployeeDiscountConsentByUserToken");
        }

        public static /* synthetic */ Object c(a aVar, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str4, String str5, String str6, h hVar, String str7, String str8, C17164e eVar, int i10, Object obj) {
            int i11 = i10;
            if (obj == null) {
                return aVar.g(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? null : bool2, (i11 & 32) != 0 ? null : bool3, (i11 & 64) != 0 ? null : bool4, (i11 & 128) != 0 ? null : bool5, (i11 & 256) != 0 ? null : bool6, (i11 & 512) != 0 ? null : str4, (i11 & 1024) != 0 ? null : str5, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? null : str6, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : hVar, (i11 & 8192) != 0 ? null : str7, (i11 & 16384) != 0 ? null : str8, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteItemsByUserToken");
        }

        public static /* synthetic */ Object d(a aVar, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, String str4, String str5, h hVar, String str6, String str7, C17164e eVar, int i10, Object obj) {
            int i11 = i10;
            if (obj == null) {
                return aVar.i(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? null : bool2, (i11 & 32) != 0 ? null : bool3, (i11 & 64) != 0 ? null : bool4, (i11 & 128) != 0 ? null : bool5, (i11 & 256) != 0 ? null : bool6, (i11 & 512) != 0 ? null : str4, (i11 & 1024) != 0 ? null : str5, (i11 & RecyclerView.n.FLAG_MOVED) != 0 ? null : hVar, (i11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str6, (i11 & 8192) != 0 ? null : str7, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCartByUserToken");
        }
    }

    @C16700b("api/v1/{retailUnit}/discount-codes")
    Object a(@s("retailUnit") String str, @C16707i("X-Consumer-Name") String str2, @t("discountCodes") String str3, @C16707i("Accept-Language") String str4, @t("fetchCartContext") Boolean bool, @t("fetchDiscountCodes") Boolean bool2, @t("fetchIndicativeAvailability") Boolean bool3, @t("fetchItemInfo") Boolean bool4, @t("fetchPrice") Boolean bool5, @t("fetchServices") Boolean bool6, @t("group") String str5, @t("postCode") String str6, @t("shoppingProfile") h hVar, @t("stateCode") String str7, @t("storeId") String str8, C17164e<? super x<WrappedCartResponseRemoteModel>> eVar);

    @o("api/v1/{retailUnit}/discount-codes")
    Object b(@s("retailUnit") String str, @C16707i("X-Consumer-Name") String str2, @C16699a SetDiscountCodesRequestRemoteModel setDiscountCodesRequestRemoteModel, @C16707i("Accept-Language") String str3, C17164e<? super x<WrappedCartResponseRemoteModel>> eVar);

    @o("api/v1/{retailUnit}/employee-discount-consent")
    Object c(@s("retailUnit") String str, @C16707i("X-Consumer-Name") String str2, @C16699a AddEmployeeConsentRequestRemoteModel addEmployeeConsentRequestRemoteModel, @C16707i("Accept-Language") String str3, C17164e<? super x<WrappedCartResponseRemoteModel>> eVar);

    @o("api/v1/{retailUnit}/merge-from-user")
    Object d(@s("retailUnit") String str, @C16707i("X-Consumer-Name") String str2, @C16699a MergeCartFromUserIdRequestRemoteModel mergeCartFromUserIdRequestRemoteModel, @C16707i("Accept-Language") String str3, C17164e<? super x<WrappedCartResponseRemoteModel>> eVar);

    @p("api/v1/{retailUnit}/items")
    Object e(@s("retailUnit") String str, @C16707i("X-Consumer-Name") String str2, @C16699a UpdateItemsRequestRemoteModel updateItemsRequestRemoteModel, @C16707i("Accept-Language") String str3, C17164e<? super x<WrappedCartResponseRemoteModel>> eVar);

    @o("api/v1/{retailUnit}/items")
    Object f(@s("retailUnit") String str, @C16707i("X-Consumer-Name") String str2, @C16699a AddItemsRequestRemoteModel addItemsRequestRemoteModel, @C16707i("Accept-Language") String str3, C17164e<? super x<WrappedCartResponseRemoteModel>> eVar);

    @C16700b("api/v1/{retailUnit}/items")
    Object g(@s("retailUnit") String str, @C16707i("X-Consumer-Name") String str2, @C16707i("Accept-Language") String str3, @t("fetchCartContext") Boolean bool, @t("fetchDiscountCodes") Boolean bool2, @t("fetchIndicativeAvailability") Boolean bool3, @t("fetchItemInfo") Boolean bool4, @t("fetchPrice") Boolean bool5, @t("fetchServices") Boolean bool6, @t("group") String str4, @t("itemNumbers") String str5, @t("postCode") String str6, @t("shoppingProfile") h hVar, @t("stateCode") String str7, @t("storeId") String str8, C17164e<? super x<WrappedCartResponseRemoteModel>> eVar);

    @C16700b("api/v1/{retailUnit}/employee-discount-consent")
    Object h(@s("retailUnit") String str, @C16707i("X-Consumer-Name") String str2, @C16707i("Accept-Language") String str3, @t("fetchCartContext") Boolean bool, @t("fetchDiscountCodes") Boolean bool2, @t("fetchIndicativeAvailability") Boolean bool3, @t("fetchItemInfo") Boolean bool4, @t("fetchPrice") Boolean bool5, @t("fetchServices") Boolean bool6, @t("group") String str4, @t("postCode") String str5, @t("shoppingProfile") h hVar, @t("stateCode") String str6, @t("storeId") String str7, C17164e<? super x<WrappedCartResponseRemoteModel>> eVar);

    @C16704f("api/v1/{retailUnit}")
    Object i(@s("retailUnit") String str, @C16707i("X-Consumer-Name") String str2, @C16707i("Accept-Language") String str3, @t("fetchCartContext") Boolean bool, @t("fetchDiscountCodes") Boolean bool2, @t("fetchIndicativeAvailability") Boolean bool3, @t("fetchItemInfo") Boolean bool4, @t("fetchPrice") Boolean bool5, @t("fetchServices") Boolean bool6, @t("group") String str4, @t("postCode") String str5, @t("shoppingProfile") h hVar, @t("stateCode") String str6, @t("storeId") String str7, C17164e<? super x<CartResponseRemoteModel>> eVar);
}
