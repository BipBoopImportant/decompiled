package RK;

import GK.C15773A;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a¨\u0006\u001c"}, d2 = {"LRK/l;", "LRK/m;", "LRK/l$a;", "socketAdapterFactory", "<init>", "(LRK/l$a;)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "d", "(Ljavax/net/ssl/SSLSocket;)LRK/m;", "", "isSupported", "()Z", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "", "hostname", "", "LGK/A;", "protocols", "LXH/N;", "c", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "b", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "LRK/l$a;", "LRK/m;", "delegate", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    private final a f138051a;

    /* renamed from: b  reason: collision with root package name */
    private m f138052b;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LRK/l$a;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "LRK/m;", "b", "(Ljavax/net/ssl/SSLSocket;)LRK/m;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        boolean a(SSLSocket sSLSocket);

        m b(SSLSocket sSLSocket);
    }

    public l(a aVar) {
        C17542s.j(aVar, "socketAdapterFactory");
        this.f138051a = aVar;
    }

    private final synchronized m d(SSLSocket sSLSocket) {
        try {
            if (this.f138052b == null && this.f138051a.a(sSLSocket)) {
                this.f138052b = this.f138051a.b(sSLSocket);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f138052b;
    }

    public boolean a(SSLSocket sSLSocket) {
        C17542s.j(sSLSocket, "sslSocket");
        return this.f138051a.a(sSLSocket);
    }

    public String b(SSLSocket sSLSocket) {
        C17542s.j(sSLSocket, "sslSocket");
        m d10 = d(sSLSocket);
        if (d10 != null) {
            return d10.b(sSLSocket);
        }
        return null;
    }

    public void c(SSLSocket sSLSocket, String str, List<? extends C15773A> list) {
        C17542s.j(sSLSocket, "sslSocket");
        C17542s.j(list, "protocols");
        m d10 = d(sSLSocket);
        if (d10 != null) {
            d10.c(sSLSocket, str, list);
        }
    }

    public boolean isSupported() {
        return true;
    }
}
