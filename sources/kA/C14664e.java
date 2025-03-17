package kA;

import com.auth0.android.result.Credentials;
import com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/auth0/android/result/Credentials;", "", "oldRefreshToken", "Lcom/ingka/ikea/session/impl/usertoken/model/CiamSessionCredentials;", "a", "(Lcom/auth0/android/result/Credentials;Ljava/lang/String;)Lcom/ingka/ikea/session/impl/usertoken/model/CiamSessionCredentials;", "usersession-impl_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: kA.e  reason: case insensitive filesystem */
public final class C14664e {
    public static final CiamSessionCredentials a(Credentials credentials, String str) {
        String str2;
        C17542s.j(credentials, "<this>");
        String d10 = credentials.d();
        if (d10 != null) {
            str2 = d10;
        } else if (str == null) {
            return null;
        } else {
            str2 = str;
        }
        return new CiamSessionCredentials(credentials.c(), credentials.a(), (String) null, str2, credentials.b().getTime(), (String) null, 36, (DefaultConstructorMarker) null);
    }
}
