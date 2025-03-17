package q5;

import C2.a;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.C7055y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import o5.C8603d;
import t5.C8822q;
import t5.C8823r;
import u5.C8878b;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t\"\u0018\u0010\u000f\u001a\u00020\f*\u00020\u000b8@X\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001e\u0010\u0014\u001a\u00020\u0005*\u00020\u000b8@X\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0014\u001a\u00020\u0005*\u00020\u00158AX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroid/content/Context;", "context", "Lu5/b;", "taskExecutor", "Lq5/h;", "Lo5/d;", "a", "(Landroid/content/Context;Lu5/b;)Lq5/h;", "", "Ljava/lang/String;", "TAG", "Landroid/net/ConnectivityManager;", "", "e", "(Landroid/net/ConnectivityManager;)Z", "isActiveNetworkValidated", "c", "(Landroid/net/ConnectivityManager;)Lo5/d;", "getActiveNetworkState$annotations", "(Landroid/net/ConnectivityManager;)V", "activeNetworkState", "Landroid/net/NetworkCapabilities;", "d", "(Landroid/net/NetworkCapabilities;)Lo5/d;", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f55531a;

    static {
        String i10 = C7055y.i("NetworkStateTracker");
        C17542s.i(i10, "tagWithPrefix(\"NetworkStateTracker\")");
        f55531a = i10;
    }

    public static final h<C8603d> a(Context context, C8878b bVar) {
        C17542s.j(context, "context");
        C17542s.j(bVar, "taskExecutor");
        return new j(context, bVar);
    }

    public static final C8603d c(ConnectivityManager connectivityManager) {
        C17542s.j(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z10 = false;
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean e10 = e(connectivityManager);
        boolean a10 = a.a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z10 = true;
        }
        return new C8603d(z11, e10, a10, z10);
    }

    public static final C8603d d(NetworkCapabilities networkCapabilities) {
        C17542s.j(networkCapabilities, "<this>");
        return new C8603d(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18));
    }

    public static final boolean e(ConnectivityManager connectivityManager) {
        C17542s.j(connectivityManager, "<this>");
        try {
            NetworkCapabilities a10 = C8822q.a(connectivityManager, C8823r.a(connectivityManager));
            if (a10 != null) {
                return C8822q.b(a10, 16);
            }
            return false;
        } catch (SecurityException e10) {
            C7055y.e().d(f55531a, "Unable to validate active network", e10);
            return false;
        }
    }
}
