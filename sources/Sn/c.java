package Sn;

import Nn.C10806i;
import Nn.D;
import Nn.w;
import Rn.e;
import Rn.f;
import XH.C16807N;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0002H¦@¢\u0006\u0004\b\r\u0010\u0006J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0010\u0010\u0006J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0013\u0010\u000bJ \u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0015\u0010\u000bJ \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0017\u0010\u000bJ \u0010\u0019\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0019\u0010\u000bJ \u0010\u001c\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH¦@¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0002H¦@¢\u0006\u0004\b!\u0010\"J \u0010$\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0002H¦@¢\u0006\u0004\b$\u0010\u000bJ*\u0010)\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010&H¦@¢\u0006\u0004\b)\u0010*¨\u0006+"}, d2 = {"LSn/c;", "", "", "paymentContextId", "LXH/N;", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "checkoutId", "serviceAreaId", "LSn/b;", "k", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LRn/f;", "e", "", "LNn/D;", "h", "shopperResultUrl", "LSn/d;", "a", "paymentBrandName", "c", "externalSessionIopgId", "l", "externalSessionToken", "d", "", "usePayOnDelivery", "j", "(Ljava/lang/String;ZLdI/e;)Ljava/lang/Object;", "cardNumber", "securityCode", "LRn/e;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "iopgId", "i", "googlePayAddressJson", "LNn/w;", "googlePayTaxInfo", "LNn/i;", "f", "(Ljava/lang/String;Ljava/lang/String;LNn/w;LdI/e;)Ljava/lang/Object;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c {
    Object a(String str, String str2, C17164e<? super d> eVar);

    Object b(String str, C17164e<? super C16807N> eVar);

    Object c(String str, String str2, C17164e<? super d> eVar);

    Object d(String str, String str2, C17164e<? super f> eVar);

    Object e(String str, C17164e<? super f> eVar);

    Object f(String str, String str2, w wVar, C17164e<? super C10806i> eVar);

    Object g(String str, String str2, String str3, C17164e<? super e> eVar);

    Object h(String str, C17164e<? super List<? extends D>> eVar);

    Object i(String str, String str2, C17164e<? super e> eVar);

    Object j(String str, boolean z10, C17164e<? super f> eVar);

    Object k(String str, String str2, C17164e<? super b> eVar);

    Object l(String str, String str2, C17164e<? super C16807N> eVar);
}
