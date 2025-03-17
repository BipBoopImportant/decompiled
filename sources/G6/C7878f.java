package g6;

import android.content.Context;
import android.net.ConnectivityManager;
import h6.f;
import kotlin.Metadata;
import u2.C6012a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "Lg6/d;", "a", "(Landroid/content/Context;)Lg6/d;", "coil-network-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: g6.f  reason: case insensitive filesystem */
public final class C7878f {
    public static final C7876d a(Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) C6012a.j(applicationContext, ConnectivityManager.class);
        if (connectivityManager == null || !f.b(applicationContext, "android.permission.ACCESS_NETWORK_STATE")) {
            return C7876d.f51278b;
        }
        try {
            return new C7877e(connectivityManager);
        } catch (Exception unused) {
            return C7876d.f51278b;
        }
    }
}
