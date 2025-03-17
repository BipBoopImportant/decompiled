package jA;

import TJ.C16519P;
import XH.C16807N;
import android.app.Activity;
import com.ingka.ikea.session.impl.usertoken.model.CiamSessionCredentials;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u000e\u0010\nR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LjA/c;", "", "Landroid/app/Activity;", "activity", "", "e", "(Landroid/app/Activity;LdI/e;)Ljava/lang/Object;", "c", "LXH/N;", "d", "(LdI/e;)Ljava/lang/Object;", "", "getToken", "()Ljava/lang/String;", "b", "LTJ/P;", "Lcom/ingka/ikea/session/impl/usertoken/model/CiamSessionCredentials;", "a", "()LTJ/P;", "credentials", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jA.c  reason: case insensitive filesystem */
public interface C14609c {
    C16519P<CiamSessionCredentials> a();

    Object b(C17164e<? super String> eVar);

    Object c(Activity activity, C17164e<? super Boolean> eVar);

    Object d(C17164e<? super C16807N> eVar);

    Object e(Activity activity, C17164e<? super Boolean> eVar);

    String getToken();
}
