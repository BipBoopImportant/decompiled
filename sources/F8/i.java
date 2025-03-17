package F8;

import D8.c;
import G8.e;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\b\u0004*\u00013\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020(0'8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R*\u00102\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u00128\u0006@BX\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u00104¨\u00066"}, d2 = {"LF8/i;", "", "Landroid/content/Context;", "context", "LG8/e;", "buildInstantiable", "LF8/d;", "cellularNetworkProvider", "<init>", "(Landroid/content/Context;LG8/e;LF8/d;)V", "LXH/N;", "g", "()V", "j", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "capabilities", "LF8/e;", "i", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)LF8/e;", "LF8/j;", "listener", "k", "(LF8/j;)V", "a", "Landroid/content/Context;", "b", "LG8/e;", "c", "LF8/d;", "LD8/c;", "d", "LD8/c;", "logger", "Landroid/net/ConnectivityManager;", "e", "Landroid/net/ConnectivityManager;", "connectivityManager", "Ljava/util/WeakHashMap;", "", "f", "Ljava/util/WeakHashMap;", "listeners", "value", "LF8/e;", "h", "()LF8/e;", "l", "(LF8/e;)V", "connectionType", "F8/i$a", "LF8/i$a;", "networkCallback", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f35534a;

    /* renamed from: b  reason: collision with root package name */
    private final e f35535b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final d f35536c;

    /* renamed from: d  reason: collision with root package name */
    private final c f35537d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final ConnectivityManager f35538e;

    /* renamed from: f  reason: collision with root package name */
    private final WeakHashMap<j, Boolean> f35539f;

    /* renamed from: g  reason: collision with root package name */
    private e f35540g;

    /* renamed from: h  reason: collision with root package name */
    private final a f35541h;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"F8/i$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "LXH/N;", "onUnavailable", "()V", "Landroid/net/Network;", "network", "onLost", "(Landroid/net/Network;)V", "onAvailable", "Landroid/net/NetworkCapabilities;", "capabilities", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f35542a;

        public a(i iVar) {
            this.f35542a = iVar;
        }

        public void onAvailable(Network network) {
            C17542s.j(network, "network");
            NetworkCapabilities networkCapabilities = this.f35542a.f35538e.getNetworkCapabilities(network);
            i iVar = this.f35542a;
            iVar.l(networkCapabilities == null ? e.CONNECTIVITY_ERROR : iVar.i(network, networkCapabilities));
        }

        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C17542s.j(network, "network");
            C17542s.j(networkCapabilities, "capabilities");
            if (networkCapabilities.hasTransport(1) || !this.f35542a.f35536c.h()) {
                i iVar = this.f35542a;
                iVar.l(iVar.i(network, networkCapabilities));
            }
        }

        public void onLost(Network network) {
            C17542s.j(network, "network");
            this.f35542a.l(e.OFFLINE);
        }

        public void onUnavailable() {
            this.f35542a.l(e.CONNECTIVITY_ERROR);
        }
    }

    public i(Context context, e eVar, d dVar) {
        C17542s.j(context, "context");
        C17542s.j(eVar, "buildInstantiable");
        C17542s.j(dVar, "cellularNetworkProvider");
        this.f35534a = context;
        this.f35535b = eVar;
        this.f35536c = dVar;
        this.f35537d = new c("NetworkInfoProvider");
        Object systemService = context.getSystemService("connectivity");
        C17542s.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f35538e = (ConnectivityManager) systemService;
        this.f35539f = new WeakHashMap<>();
        this.f35540g = e.CONNECTIVITY_ERROR;
        this.f35541h = new a(this);
        dVar.i(new h(this));
        j();
    }

    /* access modifiers changed from: private */
    public static final void b(i iVar, e eVar) {
        C17542s.j(iVar, "this$0");
        C17542s.j(eVar, "newConnectionType");
        iVar.l(eVar);
    }

    private final synchronized void g() {
        for (Map.Entry<j, Boolean> key : this.f35539f.entrySet()) {
            ((j) key.getKey()).a();
        }
    }

    /* access modifiers changed from: private */
    public final e i(Network network, NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasTransport(1) ? e.WIFI : networkCapabilities.hasTransport(0) ? this.f35536c.d(network) : e.OFFLINE;
    }

    private final void j() {
        NetworkRequest build = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build();
        try {
            if (this.f35535b.e(24)) {
                this.f35538e.registerDefaultNetworkCallback(this.f35541h);
            } else {
                this.f35538e.registerNetworkCallback(build, this.f35541h);
            }
        } catch (SecurityException e10) {
            this.f35537d.i(e10, "We couldn't register a Network Callback, the network information will be less accurate.");
            l(e.CONNECTIVITY_ERROR);
        }
    }

    /* access modifiers changed from: private */
    public final void l(e eVar) {
        if (this.f35540g != eVar) {
            c cVar = this.f35537d;
            cVar.f("Network type change from: " + this.f35540g + " to: " + eVar);
            this.f35540g = eVar;
            g();
        }
    }

    public final e h() {
        return this.f35540g;
    }

    public final synchronized void k(j jVar) {
        C17542s.j(jVar, "listener");
        this.f35539f.put(jVar, Boolean.TRUE);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Context context, e eVar, d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? new e() : eVar, (i10 & 4) != 0 ? new d(context, (b) null, (e) null, 6, (DefaultConstructorMarker) null) : dVar);
    }
}
