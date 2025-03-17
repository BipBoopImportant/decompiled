package lA;

import aA.C13910b;
import com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/session/impl/usertoken/model/CiamSessionCredentials;", "LaA/b;", "a", "(Lcom/ingka/ikea/session/impl/usertoken/model/CiamSessionCredentials;)LaA/b;", "usersession-impl_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: lA.a  reason: case insensitive filesystem */
public final class C14742a {
    public static final C13910b a(CiamSessionCredentials ciamSessionCredentials) {
        return (ciamSessionCredentials == null || !ciamSessionCredentials.h() || !ciamSessionCredentials.c()) ? (ciamSessionCredentials == null || !ciamSessionCredentials.h() || ciamSessionCredentials.c()) ? C13910b.GUEST : C13910b.REGULAR : C13910b.FAMILY;
    }
}
