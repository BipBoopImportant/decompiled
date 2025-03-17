package kA;

import XH.C16807N;
import XH.x;
import android.app.Activity;
import com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials;
import dI.C17164e;
import kA.C14667h;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u000fJ>\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H¦@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"LkA/c;", "", "Landroid/app/Activity;", "activity", "LkA/h$a$a;", "type", "", "audience", "scope", "redirectUrl", "LXH/x;", "Lcom/ingka/ikea/session/impl/usertoken/model/CiamSessionCredentials;", "c", "(Landroid/app/Activity;LkA/h$a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "refreshToken", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LXH/N;", "b", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kA.c  reason: case insensitive filesystem */
public interface C14662c {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LkA/c$a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kA.c$a */
    public static final class a extends Exception {
        public a() {
            super("Failed to map credentials");
        }
    }

    Object a(String str, C17164e<? super x<CiamSessionCredentials>> eVar);

    Object b(String str, C17164e<? super C16807N> eVar);

    Object c(Activity activity, C14667h.a.C3170a aVar, String str, String str2, String str3, C17164e<? super x<CiamSessionCredentials>> eVar);
}
