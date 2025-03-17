package RK;

import GK.C15773A;
import QK.C16354j;
import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0017¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LRK/c;", "LRK/m;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "isSupported", "()Z", "", "b", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "hostname", "", "LGK/A;", "protocols", "LXH/N;", "c", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi"})
/* renamed from: RK.c  reason: case insensitive filesystem */
public final class C16390c implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final a f138027a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LRK/c$a;", "", "<init>", "()V", "LRK/m;", "a", "()LRK/m;", "", "b", "()Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: RK.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a() {
            if (b()) {
                return new C16390c();
            }
            return null;
        }

        public final boolean b() {
            return C16354j.f137719a.h() && Build.VERSION.SDK_INT >= 29;
        }

        private a() {
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        C17542s.j(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @SuppressLint({"NewApi"})
    public String b(SSLSocket sSLSocket) {
        C17542s.j(sSLSocket, "sslSocket");
        String a10 = sSLSocket.getApplicationProtocol();
        if (a10 == null ? true : C17542s.e(a10, "")) {
            return null;
        }
        return a10;
    }

    @SuppressLint({"NewApi"})
    public void c(SSLSocket sSLSocket, String str, List<? extends C15773A> list) {
        C17542s.j(sSLSocket, "sslSocket");
        C17542s.j(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) C16354j.f137719a.b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }

    public boolean isSupported() {
        return f138027a.b();
    }
}
