package WK;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LWK/M;", "LWK/c;", "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "Ljava/io/IOException;", "cause", "x", "(Ljava/io/IOException;)Ljava/io/IOException;", "LXH/N;", "B", "()V", "o", "Ljava/net/Socket;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class M extends C16768c {

    /* renamed from: o  reason: collision with root package name */
    private final Socket f139624o;

    public M(Socket socket) {
        C17542s.j(socket, "socket");
        this.f139624o = socket;
    }

    /* access modifiers changed from: protected */
    public void B() {
        try {
            this.f139624o.close();
        } catch (Exception e10) {
            Logger a10 = z.f139718a;
            Level level = Level.WARNING;
            a10.log(level, "Failed to close timed out socket " + this.f139624o, e10);
        } catch (AssertionError e11) {
            if (y.e(e11)) {
                Logger a11 = z.f139718a;
                Level level2 = Level.WARNING;
                a11.log(level2, "Failed to close timed out socket " + this.f139624o, e11);
                return;
            }
            throw e11;
        }
    }

    /* access modifiers changed from: protected */
    public IOException x(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
