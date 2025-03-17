package LK;

import GK.C15793l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"LLK/b;", "", "", "LGK/l;", "connectionSpecs", "<init>", "(Ljava/util/List;)V", "Ljavax/net/ssl/SSLSocket;", "socket", "", "c", "(Ljavax/net/ssl/SSLSocket;)Z", "sslSocket", "a", "(Ljavax/net/ssl/SSLSocket;)LGK/l;", "Ljava/io/IOException;", "e", "b", "(Ljava/io/IOException;)Z", "Ljava/util/List;", "", "I", "nextModeIndex", "Z", "isFallbackPossible", "d", "isFallback", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: LK.b  reason: case insensitive filesystem */
public final class C16030b {

    /* renamed from: a  reason: collision with root package name */
    private final List<C15793l> f136119a;

    /* renamed from: b  reason: collision with root package name */
    private int f136120b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f136121c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f136122d;

    public C16030b(List<C15793l> list) {
        C17542s.j(list, "connectionSpecs");
        this.f136119a = list;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int size = this.f136119a.size();
        for (int i10 = this.f136120b; i10 < size; i10++) {
            if (this.f136119a.get(i10).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final C15793l a(SSLSocket sSLSocket) {
        C15793l lVar;
        C17542s.j(sSLSocket, "sslSocket");
        int i10 = this.f136120b;
        int size = this.f136119a.size();
        while (true) {
            if (i10 >= size) {
                lVar = null;
                break;
            }
            lVar = this.f136119a.get(i10);
            if (lVar.e(sSLSocket)) {
                this.f136120b = i10 + 1;
                break;
            }
            i10++;
        }
        if (lVar != null) {
            this.f136121c = c(sSLSocket);
            lVar.c(sSLSocket, this.f136122d);
            return lVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f136122d);
        sb2.append(", modes=");
        sb2.append(this.f136119a);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        C17542s.g(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        C17542s.i(arrays, "toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean b(IOException iOException) {
        C17542s.j(iOException, "e");
        this.f136122d = true;
        return this.f136121c && !(iOException instanceof ProtocolException) && !(iOException instanceof InterruptedIOException) && (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) && (iOException instanceof SSLException);
    }
}
