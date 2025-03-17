package IK;

import GK.C15774B;
import GK.C15776D;
import GK.C15778F;
import GK.C15782a;
import GK.C15783b;
import GK.C15789h;
import GK.C15796o;
import GK.C15798q;
import GK.C15803v;
import HJ.C15854t;
import YH.C16877v;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LIK/a;", "LGK/b;", "LGK/q;", "defaultDns", "<init>", "(LGK/q;)V", "Ljava/net/Proxy;", "LGK/v;", "url", "dns", "Ljava/net/InetAddress;", "b", "(Ljava/net/Proxy;LGK/v;LGK/q;)Ljava/net/InetAddress;", "LGK/F;", "route", "LGK/D;", "response", "LGK/B;", "a", "(LGK/F;LGK/D;)LGK/B;", "d", "LGK/q;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: IK.a  reason: case insensitive filesystem */
public final class C15916a implements C15783b {

    /* renamed from: d  reason: collision with root package name */
    private final C15798q f135507d;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: IK.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C3334a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f135508a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f135508a = iArr;
        }
    }

    public C15916a(C15798q qVar) {
        C17542s.j(qVar, "defaultDns");
        this.f135507d = qVar;
    }

    private final InetAddress b(Proxy proxy, C15803v vVar, C15798q qVar) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C3334a.f135508a[type.ordinal()]) == 1) {
            return (InetAddress) C16877v.w0(qVar.a(vVar.i()));
        }
        SocketAddress address = proxy.address();
        C17542s.h(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        C17542s.i(address2, "address() as InetSocketAddress).address");
        return address2;
    }

    public C15774B a(C15778F f10, C15776D d10) {
        Proxy proxy;
        C15798q qVar;
        PasswordAuthentication passwordAuthentication;
        C15782a a10;
        C17542s.j(d10, "response");
        List<C15789h> f11 = d10.f();
        C15774B z10 = d10.z();
        C15803v k10 = z10.k();
        boolean z11 = d10.g() == 407;
        if (f10 == null || (proxy = f10.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C15789h next : f11) {
            if (C15854t.H("Basic", next.c(), true)) {
                if (f10 == null || (a10 = f10.a()) == null || (qVar = a10.c()) == null) {
                    qVar = this.f135507d;
                }
                if (z11) {
                    SocketAddress address = proxy.address();
                    C17542s.h(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    C17542s.i(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, k10, qVar), inetSocketAddress.getPort(), k10.t(), next.b(), next.c(), k10.v(), Authenticator.RequestorType.PROXY);
                } else {
                    String i10 = k10.i();
                    C17542s.i(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(i10, b(proxy, k10, qVar), k10.o(), k10.t(), next.b(), next.c(), k10.v(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthentication != null) {
                    String str = z11 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthentication.getUserName();
                    C17542s.i(userName, "auth.userName");
                    char[] password = passwordAuthentication.getPassword();
                    C17542s.i(password, "auth.password");
                    return z10.i().e(str, C15796o.a(userName, new String(password), next.a())).b();
                }
            }
        }
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15916a(C15798q qVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C15798q.f135087b : qVar);
    }
}
