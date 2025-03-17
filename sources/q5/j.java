package q5;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.work.C7055y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import o5.C8603d;
import t5.C8822q;
import t5.C8824s;
import u5.C8878b;

@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001\u0013\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lq5/j;", "Lq5/h;", "Lo5/d;", "Landroid/content/Context;", "context", "Lu5/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Lu5/b;)V", "k", "()Lo5/d;", "LXH/N;", "h", "()V", "i", "Landroid/net/ConnectivityManager;", "f", "Landroid/net/ConnectivityManager;", "connectivityManager", "q5/j$a", "g", "Lq5/j$a;", "networkCallback", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j extends h<C8603d> {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final ConnectivityManager f55528f;

    /* renamed from: g  reason: collision with root package name */
    private final a f55529g = new a(this);

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"q5/j$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "capabilities", "LXH/N;", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f55530a;

        a(j jVar) {
            this.f55530a = jVar;
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C17542s.j(network, "network");
            C17542s.j(networkCapabilities, "capabilities");
            C7055y e10 = C7055y.e();
            String b10 = k.f55531a;
            e10.a(b10, "Network capabilities changed: " + networkCapabilities);
            j jVar = this.f55530a;
            jVar.g(Build.VERSION.SDK_INT >= 28 ? k.d(networkCapabilities) : k.c(jVar.f55528f));
        }

        public void onLost(Network network) {
            C17542s.j(network, "network");
            C7055y.e().a(k.f55531a, "Network connection lost");
            j jVar = this.f55530a;
            jVar.g(k.c(jVar.f55528f));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Context context, C8878b bVar) {
        super(context, bVar);
        C17542s.j(context, "context");
        C17542s.j(bVar, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        C17542s.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f55528f = (ConnectivityManager) systemService;
    }

    public void h() {
        try {
            C7055y.e().a(k.f55531a, "Registering network callback");
            C8824s.a(this.f55528f, this.f55529g);
        } catch (IllegalArgumentException e10) {
            C7055y.e().d(k.f55531a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            C7055y.e().d(k.f55531a, "Received exception while registering network callback", e11);
        }
    }

    public void i() {
        try {
            C7055y.e().a(k.f55531a, "Unregistering network callback");
            C8822q.c(this.f55528f, this.f55529g);
        } catch (IllegalArgumentException e10) {
            C7055y.e().d(k.f55531a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            C7055y.e().d(k.f55531a, "Received exception while unregistering network callback", e11);
        }
    }

    /* renamed from: k */
    public C8603d e() {
        return k.c(this.f55528f);
    }
}
