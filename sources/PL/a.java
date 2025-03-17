package Pl;

import VL.C16704f;
import VL.s;
import com.ingka.ikea.appconfig.impl.service.network.MarketConfigRemote;
import dI.C17164e;
import dp.C11216a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LPl/a;", "", "", "cc", "lc", "Lcom/ingka/ikea/appconfig/impl/service/network/MarketConfigRemote;", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {
    @C11216a
    @C16704f("/configuration/v6/{cc}/{lc}")
    Object a(@s("cc") String str, @s("lc") String str2, C17164e<? super MarketConfigRemote> eVar);
}
