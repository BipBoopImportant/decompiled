package M5;

import M5.g;
import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0005*\u0001\u0017\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\n*\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"LM5/i;", "LM5/g;", "Landroid/net/ConnectivityManager;", "connectivityManager", "LM5/g$a;", "listener", "<init>", "(Landroid/net/ConnectivityManager;LM5/g$a;)V", "Landroid/net/Network;", "network", "", "isOnline", "LXH/N;", "d", "(Landroid/net/Network;Z)V", "c", "(Landroid/net/Network;)Z", "shutdown", "()V", "a", "Landroid/net/ConnectivityManager;", "b", "LM5/g$a;", "M5/i$a", "LM5/i$a;", "networkCallback", "()Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"MissingPermission"})
final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private final ConnectivityManager f38522a;

    /* renamed from: b  reason: collision with root package name */
    private final g.a f38523b;

    /* renamed from: c  reason: collision with root package name */
    private final a f38524c;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"M5/i$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "LXH/N;", "onAvailable", "(Landroid/net/Network;)V", "onLost", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f38525a;

        a(i iVar) {
            this.f38525a = iVar;
        }

        public void onAvailable(Network network) {
            this.f38525a.d(network, true);
        }

        public void onLost(Network network) {
            this.f38525a.d(network, false);
        }
    }

    public i(ConnectivityManager connectivityManager, g.a aVar) {
        this.f38522a = connectivityManager;
        this.f38523b = aVar;
        a aVar2 = new a(this);
        this.f38524c = aVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar2);
    }

    private final boolean c(Network network) {
        NetworkCapabilities networkCapabilities = this.f38522a.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    /* access modifiers changed from: private */
    public final void d(Network network, boolean z10) {
        Network[] allNetworks = this.f38522a.getAllNetworks();
        int length = allNetworks.length;
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Network network2 = allNetworks[i10];
            if (C17542s.e(network2, network) ? z10 : c(network2)) {
                z11 = true;
                break;
            }
            i10++;
        }
        this.f38523b.a(z11);
    }

    public boolean a() {
        for (Network c10 : this.f38522a.getAllNetworks()) {
            if (c(c10)) {
                return true;
            }
        }
        return false;
    }

    public void shutdown() {
        this.f38522a.unregisterNetworkCallback(this.f38524c);
    }
}
