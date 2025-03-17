package bp;

import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import XH.C16824o;
import XH.C16825p;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u2.C6012a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00118BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lbp/c;", "Lbp/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "d", "()Z", "LTJ/g;", "b", "()LTJ/g;", "a", "Landroid/content/Context;", "LTJ/B;", "LTJ/B;", "isAvailableFlow", "Landroid/net/ConnectivityManager;", "c", "LXH/o;", "f", "()Landroid/net/ConnectivityManager;", "connectivityManager", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements C11116a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f90604a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C16505B<Boolean> f90605b = C16521S.a(Boolean.valueOf(d()));

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f90606c = C16825p.b(new C11117b(this));

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"bp/c$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "LXH/N;", "onAvailable", "(Landroid/net/Network;)V", "onLost", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f90607a;

        a(c cVar) {
            this.f90607a = cVar;
        }

        public void onAvailable(Network network) {
            Object value;
            C17542s.j(network, "network");
            C16505B c10 = this.f90607a.f90605b;
            do {
                value = c10.getValue();
                ((Boolean) value).booleanValue();
            } while (!c10.e(value, Boolean.TRUE));
        }

        public void onLost(Network network) {
            Object value;
            C17542s.j(network, "network");
            C16505B c10 = this.f90607a.f90605b;
            do {
                value = c10.getValue();
                ((Boolean) value).booleanValue();
            } while (!c10.e(value, Boolean.FALSE));
        }
    }

    public c(Context context) {
        C17542s.j(context, "context");
        this.f90604a = context;
    }

    private final boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C6012a.j(this.f90604a, ConnectivityManager.class);
        NetworkCapabilities networkCapabilities = null;
        Network activeNetwork = connectivityManager != null ? connectivityManager.getActiveNetwork() : null;
        if (connectivityManager != null) {
            networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        }
        if (networkCapabilities != null) {
            return networkCapabilities.hasCapability(12);
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final ConnectivityManager e(c cVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) C6012a.j(cVar.f90604a, ConnectivityManager.class);
        a aVar = new a(cVar);
        if (connectivityManager != null) {
            connectivityManager.registerDefaultNetworkCallback(aVar);
        }
        return connectivityManager;
    }

    private final ConnectivityManager f() {
        return (ConnectivityManager) this.f90606c.getValue();
    }

    public C16532g<Boolean> b() {
        f();
        return this.f90605b;
    }
}
