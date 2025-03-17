package eD;

import QL.C16361d;
import QL.x;
import VL.C16699a;
import VL.C16700b;
import VL.C16704f;
import VL.C16712n;
import VL.o;
import VL.s;
import VL.t;
import com.ingka.ikea.dynamicfields.datalayer.DynamicFields$Configuration;
import com.ingka.ikea.useraccount.impl.network.RemoteProfile;
import com.ingka.ikea.useraccount.impl.network.RemoteRedirectUrl;
import dI.C17164e;
import dp.C11216a;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u0012\u0010\nJ\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\u0013\u0010\nJ+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0001\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0014H'¢\u0006\u0004\b\u0018\u0010\u0017J5\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00062\u0014\b\u0001\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0014H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0006H'¢\u0006\u0004\b\u001c\u0010\nJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0002H'¢\u0006\u0004\b\u001e\u0010\u0005J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001fH§@¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0002H'¢\u0006\u0004\b\"\u0010\u0005J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0002H'¢\u0006\u0004\b#\u0010\u0005J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0002H'¢\u0006\u0004\b$\u0010\u0005J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001fH§@¢\u0006\u0004\b%\u0010!¨\u0006&"}, d2 = {"LeD/b;", "", "LQL/d;", "Lcom/ingka/ikea/useraccount/impl/network/RemoteProfile;", "getProfile", "()LQL/d;", "", "version", "Lcom/ingka/ikea/dynamicfields/datalayer/DynamicFields$Configuration;", "l", "(Ljava/lang/String;)LQL/d;", "id", "a", "(Ljava/lang/String;Ljava/lang/String;)LQL/d;", "LeD/a;", "addressType", "i", "(LeD/a;Ljava/lang/String;)LQL/d;", "k", "j", "", "fields", "h", "(Ljava/util/Map;)LQL/d;", "e", "addressId", "c", "(Ljava/lang/String;Ljava/util/Map;)LQL/d;", "b", "Lcom/ingka/ikea/useraccount/impl/network/RemoteRedirectUrl;", "m", "LQL/x;", "d", "(LdI/e;)Ljava/lang/Object;", "o", "f", "n", "g", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eD.b  reason: case insensitive filesystem */
public interface C14381b {
    @C16704f("/customer/v6/{cc}/{lc}/profile/address/{id}")
    C16361d<DynamicFields$Configuration> a(@s("id") String str, @t("version") String str2);

    @C16700b("/customer/v6/{cc}/{lc}/profile/address/{addressId}")
    C16361d<RemoteProfile> b(@s("addressId") String str);

    @C16712n("/customer/v6/{cc}/{lc}/profile/address/{addressId}")
    C16361d<RemoteProfile> c(@s("addressId") String str, @C16699a Map<String, String> map);

    @C16704f("/customer/v6/{cc}/{lc}/profile/hosted/changepassword")
    Object d(C17164e<? super x<RemoteRedirectUrl>> eVar);

    @o("/customer/v6/{cc}/{lc}/profile/address")
    C16361d<RemoteProfile> e(@C16699a Map<String, String> map);

    @C16704f("/customer/v6/{cc}/{lc}/profile/hosted/changeemail")
    C16361d<RemoteRedirectUrl> f();

    @C16704f("/customer/v6/{cc}/{lc}/profile/hosted/deleteprofile")
    Object g(C17164e<? super x<RemoteRedirectUrl>> eVar);

    @C16704f("customer/v6/{cc}/{lc}/profile")
    C16361d<RemoteProfile> getProfile();

    @C16712n("/customer/v6/{cc}/{lc}/profile")
    C16361d<RemoteProfile> h(@C16699a Map<String, String> map);

    @C11216a
    @C16704f("/configuration/v6/{cc}/{lc}/marketsettings/{addressType}")
    C16361d<DynamicFields$Configuration> i(@s("addressType") C14380a aVar, @t("version") String str);

    @C16704f("/customer/v6/{cc}/{lc}/profile/consent")
    C16361d<DynamicFields$Configuration> j(@t("version") String str);

    @C16704f("/customer/v6/{cc}/{lc}/profile/configuration/upgrade")
    C16361d<DynamicFields$Configuration> k(@t("version") String str);

    @C16704f("/customer/v6/{cc}/{lc}/profile/configuration/editprofile")
    C16361d<DynamicFields$Configuration> l(@t("version") String str);

    @C16704f("/customer/v6/{cc}/{lc}/profile/hosted/changepassword")
    C16361d<RemoteRedirectUrl> m();

    @C16704f("/customer/v6/{cc}/{lc}/profile/hosted/deleteprofile")
    C16361d<RemoteRedirectUrl> n();

    @C16704f("/customer/v6/{cc}/{lc}/profile/hosted/changephone")
    C16361d<RemoteRedirectUrl> o();
}
