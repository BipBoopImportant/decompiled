package GK;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LGK/F;", "", "LGK/a;", "address", "Ljava/net/Proxy;", "proxy", "Ljava/net/InetSocketAddress;", "socketAddress", "<init>", "(LGK/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "", "c", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "LGK/a;", "()LGK/a;", "b", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "Ljava/net/InetSocketAddress;", "d", "()Ljava/net/InetSocketAddress;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.F  reason: case insensitive filesystem */
public final class C15778F {

    /* renamed from: a  reason: collision with root package name */
    private final C15782a f134835a;

    /* renamed from: b  reason: collision with root package name */
    private final Proxy f134836b;

    /* renamed from: c  reason: collision with root package name */
    private final InetSocketAddress f134837c;

    public C15778F(C15782a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        C17542s.j(aVar, PlaceTypes.ADDRESS);
        C17542s.j(proxy, "proxy");
        C17542s.j(inetSocketAddress, "socketAddress");
        this.f134835a = aVar;
        this.f134836b = proxy;
        this.f134837c = inetSocketAddress;
    }

    public final C15782a a() {
        return this.f134835a;
    }

    public final Proxy b() {
        return this.f134836b;
    }

    public final boolean c() {
        return this.f134835a.k() != null && this.f134836b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f134837c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C15778F) {
            C15778F f10 = (C15778F) obj;
            return C17542s.e(f10.f134835a, this.f134835a) && C17542s.e(f10.f134836b, this.f134836b) && C17542s.e(f10.f134837c, this.f134837c);
        }
    }

    public int hashCode() {
        return ((((527 + this.f134835a.hashCode()) * 31) + this.f134836b.hashCode()) * 31) + this.f134837c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f134837c + '}';
    }
}
