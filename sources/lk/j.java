package LK;

import GK.C15778F;
import GK.C15782a;
import GK.C15786e;
import GK.C15799r;
import GK.C15803v;
import HK.C15864d;
import YH.C16877v;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 /2\u00020\u0001:\u0002\u001a\u0014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010!R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010&R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010#R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010#¨\u00060"}, d2 = {"LLK/j;", "", "LGK/a;", "address", "LLK/h;", "routeDatabase", "LGK/e;", "call", "LGK/r;", "eventListener", "<init>", "(LGK/a;LLK/h;LGK/e;LGK/r;)V", "LGK/v;", "url", "Ljava/net/Proxy;", "proxy", "LXH/N;", "f", "(LGK/v;Ljava/net/Proxy;)V", "", "b", "()Z", "d", "()Ljava/net/Proxy;", "e", "(Ljava/net/Proxy;)V", "a", "LLK/j$b;", "c", "()LLK/j$b;", "LGK/a;", "LLK/h;", "LGK/e;", "LGK/r;", "", "Ljava/util/List;", "proxies", "", "I", "nextProxyIndex", "Ljava/net/InetSocketAddress;", "g", "inetSocketAddresses", "", "LGK/F;", "h", "postponedRoutes", "i", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* renamed from: i  reason: collision with root package name */
    public static final a f136208i = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C15782a f136209a;

    /* renamed from: b  reason: collision with root package name */
    private final h f136210b;

    /* renamed from: c  reason: collision with root package name */
    private final C15786e f136211c;

    /* renamed from: d  reason: collision with root package name */
    private final C15799r f136212d;

    /* renamed from: e  reason: collision with root package name */
    private List<? extends Proxy> f136213e = C16877v.n();

    /* renamed from: f  reason: collision with root package name */
    private int f136214f;

    /* renamed from: g  reason: collision with root package name */
    private List<? extends InetSocketAddress> f136215g = C16877v.n();

    /* renamed from: h  reason: collision with root package name */
    private final List<C15778F> f136216h = new ArrayList();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"LLK/j$a;", "", "<init>", "()V", "Ljava/net/InetSocketAddress;", "", "a", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "socketHost", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            C17542s.j(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                C17542s.i(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            C17542s.i(hostAddress, "address.hostAddress");
            return hostAddress;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0012"}, d2 = {"LLK/j$b;", "", "", "LGK/F;", "routes", "<init>", "(Ljava/util/List;)V", "", "b", "()Z", "c", "()LGK/F;", "a", "Ljava/util/List;", "()Ljava/util/List;", "", "I", "nextRouteIndex", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<C15778F> f136217a;

        /* renamed from: b  reason: collision with root package name */
        private int f136218b;

        public b(List<C15778F> list) {
            C17542s.j(list, "routes");
            this.f136217a = list;
        }

        public final List<C15778F> a() {
            return this.f136217a;
        }

        public final boolean b() {
            return this.f136218b < this.f136217a.size();
        }

        public final C15778F c() {
            if (b()) {
                List<C15778F> list = this.f136217a;
                int i10 = this.f136218b;
                this.f136218b = i10 + 1;
                return list.get(i10);
            }
            throw new NoSuchElementException();
        }
    }

    public j(C15782a aVar, h hVar, C15786e eVar, C15799r rVar) {
        C17542s.j(aVar, PlaceTypes.ADDRESS);
        C17542s.j(hVar, "routeDatabase");
        C17542s.j(eVar, "call");
        C17542s.j(rVar, "eventListener");
        this.f136209a = aVar;
        this.f136210b = hVar;
        this.f136211c = eVar;
        this.f136212d = rVar;
        f(aVar.l(), aVar.g());
    }

    private final boolean b() {
        return this.f136214f < this.f136213e.size();
    }

    private final Proxy d() {
        if (b()) {
            List<? extends Proxy> list = this.f136213e;
            int i10 = this.f136214f;
            this.f136214f = i10 + 1;
            Proxy proxy = (Proxy) list.get(i10);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f136209a.l().i() + "; exhausted proxy configurations: " + this.f136213e);
    }

    private final void e(Proxy proxy) {
        String str;
        int i10;
        List<InetAddress> list;
        ArrayList arrayList = new ArrayList();
        this.f136215g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            str = this.f136209a.l().i();
            i10 = this.f136209a.l().o();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                a aVar = f136208i;
                C17542s.i(address, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = aVar.a(inetSocketAddress);
                i10 = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
        }
        if (1 > i10 || i10 >= 65536) {
            throw new SocketException("No route to " + str + ':' + i10 + "; port is out of range");
        } else if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(str, i10));
        } else {
            if (C15864d.i(str)) {
                list = C16877v.e(InetAddress.getByName(str));
            } else {
                this.f136212d.n(this.f136211c, str);
                list = this.f136209a.c().a(str);
                if (!list.isEmpty()) {
                    this.f136212d.m(this.f136211c, str, list);
                } else {
                    throw new UnknownHostException(this.f136209a.c() + " returned no addresses for " + str);
                }
            }
            for (InetAddress inetSocketAddress2 : list) {
                arrayList.add(new InetSocketAddress(inetSocketAddress2, i10));
            }
        }
    }

    private final void f(C15803v vVar, Proxy proxy) {
        this.f136212d.p(this.f136211c, vVar);
        List<Proxy> g10 = g(proxy, vVar, this);
        this.f136213e = g10;
        this.f136214f = 0;
        this.f136212d.o(this.f136211c, vVar, g10);
    }

    private static final List<Proxy> g(Proxy proxy, C15803v vVar, j jVar) {
        if (proxy != null) {
            return C16877v.e(proxy);
        }
        URI u10 = vVar.u();
        if (u10.getHost() == null) {
            return C15864d.w(Proxy.NO_PROXY);
        }
        List<Proxy> select = jVar.f136209a.i().select(u10);
        Collection collection = select;
        if (collection == null || collection.isEmpty()) {
            return C15864d.w(Proxy.NO_PROXY);
        }
        C17542s.i(select, "proxiesOrNull");
        return C15864d.W(select);
    }

    public final boolean a() {
        return b() || !this.f136216h.isEmpty();
    }

    public final b c() {
        if (a()) {
            ArrayList arrayList = new ArrayList();
            while (b()) {
                Proxy d10 = d();
                for (InetSocketAddress f10 : this.f136215g) {
                    C15778F f11 = new C15778F(this.f136209a, d10, f10);
                    if (this.f136210b.c(f11)) {
                        this.f136216h.add(f11);
                    } else {
                        arrayList.add(f11);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                C16877v.E(arrayList, this.f136216h);
                this.f136216h.clear();
            }
            return new b(arrayList);
        }
        throw new NoSuchElementException();
    }
}
