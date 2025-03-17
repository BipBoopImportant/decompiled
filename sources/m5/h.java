package M5;

import M5.g;
import S5.d;
import S5.r;
import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.Metadata;
import u2.C6012a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/content/Context;", "context", "LM5/g$a;", "listener", "LS5/r;", "logger", "LM5/g;", "a", "(Landroid/content/Context;LM5/g$a;LS5/r;)LM5/g;", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h {
    public static final g a(Context context, g.a aVar, r rVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) C6012a.j(context, ConnectivityManager.class);
        if (connectivityManager == null || !d.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (rVar != null && rVar.getLevel() <= 5) {
                rVar.a("NetworkObserver", 5, "Unable to register network observer.", (Throwable) null);
            }
            return new e();
        }
        try {
            return new i(connectivityManager, aVar);
        } catch (Exception e10) {
            if (rVar != null) {
                S5.h.a(rVar, "NetworkObserver", new RuntimeException("Failed to register network observer.", e10));
            }
            return new e();
        }
    }
}
