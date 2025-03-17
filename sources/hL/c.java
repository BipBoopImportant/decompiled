package Hl;

import Hl.a;
import Hl.b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\r\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LHl/c;", "LHl/a;", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "LHl/a$a;", "a", "()LHl/a$a;", "Landroid/content/Context;", "Landroid/net/ConnectivityManager;", "b", "()Landroid/net/ConnectivityManager;", "connectivityManager", "wirelessautoconnect_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f81332a;

    public c(Context context) {
        C17542s.j(context, "applicationContext");
        this.f81332a = context;
    }

    private final ConnectivityManager b() {
        Object systemService = this.f81332a.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager != null) {
            return connectivityManager;
        }
        throw b.a.f81331a;
    }

    public a.C1585a a() {
        ConnectivityManager b10 = b();
        NetworkCapabilities networkCapabilities = b10.getNetworkCapabilities(b10.getActiveNetwork());
        boolean z10 = false;
        boolean hasTransport = networkCapabilities != null ? networkCapabilities.hasTransport(1) : false;
        ConnectivityManager b11 = b();
        NetworkCapabilities networkCapabilities2 = b11.getNetworkCapabilities(b11.getActiveNetwork());
        if (networkCapabilities2 != null) {
            z10 = networkCapabilities2.hasTransport(0);
        }
        return hasTransport ? a.C1585a.WIFI : z10 ? a.C1585a.CELLULAR : a.C1585a.OTHER;
    }
}
