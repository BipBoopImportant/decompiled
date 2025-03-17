package Sn;

import Nn.C10801d;
import Nn.C10803f;
import Nn.C10814q;
import Nn.J;
import Nn.S;
import XH.C16807N;
import dI.C17164e;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@¢\u0006\u0004\b\b\u0010\tJ>\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH¦@¢\u0006\u0004\b\u0011\u0010\u0012JH\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H¦@¢\u0006\u0004\b\u001b\u0010\u001cJJ\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004H¦@¢\u0006\u0004\b#\u0010$J,\u0010'\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u001fH¦@¢\u0006\u0004\b'\u0010(J&\u0010+\u001a\u0004\u0018\u00010*2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u001fH¦@¢\u0006\u0004\b+\u0010,J4\u0010.\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001fH¦@¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"LSn/a;", "", "", "checkoutId", "", "LNn/d$a;", "itemDetails", "LNn/f;", "a", "(Ljava/lang/String;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "zipCode", "stateCode", "deliveryCountryCode", "LNn/d;", "cart", "LUn/a;", "preferredDelivery", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNn/d;LUn/a;LdI/e;)Ljava/lang/Object;", "deliveryServiceId", "pickupPointId", "serviceAreaId", "LNn/J$b;", "selectServiceCategory", "", "supportsWheelChairCapability", "LNn/q;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNn/J$b;ZLdI/e;)Ljava/lang/Object;", "LNn/J;", "deliveriesAndServices", "", "additionalValues", "deliveryTimeWindows", "LSn/e;", "g", "(Ljava/lang/String;Ljava/lang/String;LNn/J;Ljava/util/Map;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "data", "LXH/N;", "c", "(Ljava/lang/String;Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "addressData", "LNn/S;", "d", "(Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "LSn/f;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {
    Object a(String str, List<C10801d.a> list, C17164e<? super C10803f> eVar);

    Object b(String str, String str2, String str3, String str4, J.b bVar, boolean z10, C17164e<? super List<C10814q>> eVar);

    Object c(String str, Map<String, ? extends Object> map, C17164e<? super C16807N> eVar);

    Object d(Map<String, ? extends Object> map, C17164e<? super S> eVar);

    Object e(String str, String str2, String str3, C10801d dVar, Un.a aVar, C17164e<? super C10803f> eVar);

    Object f(String str, String str2, Map<String, String> map, C17164e<? super f> eVar);

    Object g(String str, String str2, J j10, Map<String, String> map, List<C10814q> list, C17164e<? super e> eVar);
}
