package Vk;

import VL.C16704f;
import VL.t;
import com.ingka.ikea.app.stockinfo.network.AvailabilityRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J>\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LVk/a;", "", "", "itemNos", "zip", "areaCode", "expand", "Lcom/ingka/ikea/app/stockinfo/network/AvailabilityRemote;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {
    @C16704f("range/v6/{cc}/{lc}/availability/cia/products/online")
    Object a(@t("productIds") String str, @t("zip") String str2, @t("areaCode") String str3, @t("expand") String str4, C17164e<? super AvailabilityRemote> eVar);
}
