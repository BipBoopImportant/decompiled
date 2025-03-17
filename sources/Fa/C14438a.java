package fA;

import QL.x;
import VL.C16699a;
import VL.C16704f;
import VL.o;
import com.ingka.ikea.session.impl.guesttoken.network.models.GuestTokenResponse;
import com.ingka.ikea.session.impl.guesttoken.network.models.TokenBody;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LfA/a;", "", "LQL/x;", "Lcom/ingka/ikea/session/impl/guesttoken/network/models/GuestTokenResponse;", "a", "(LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/session/impl/guesttoken/network/models/TokenBody;", "tokenBody", "b", "(Lcom/ingka/ikea/session/impl/guesttoken/network/models/TokenBody;LdI/e;)Ljava/lang/Object;", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fA.a  reason: case insensitive filesystem */
public interface C14438a {
    @C16704f("checkout/v6/{cc}/{lc}/token/guest")
    Object a(C17164e<? super x<GuestTokenResponse>> eVar);

    @o("checkout/v6/{cc}/{lc}/refreshtoken/guest")
    Object b(@C16699a TokenBody tokenBody, C17164e<? super x<GuestTokenResponse>> eVar);
}
