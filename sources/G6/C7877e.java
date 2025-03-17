package g6;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lg6/e;", "Lg6/d;", "Landroid/net/ConnectivityManager;", "connectivityManager", "<init>", "(Landroid/net/ConnectivityManager;)V", "", "a", "()Z", "c", "Landroid/net/ConnectivityManager;", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"MissingPermission"})
/* renamed from: g6.e  reason: case insensitive filesystem */
final class C7877e implements C7876d {

    /* renamed from: c  reason: collision with root package name */
    private final ConnectivityManager f51280c;

    public C7877e(ConnectivityManager connectivityManager) {
        this.f51280c = connectivityManager;
    }

    public boolean a() {
        NetworkCapabilities networkCapabilities = this.f51280c.getNetworkCapabilities(this.f51280c.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
