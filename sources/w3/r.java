package w3;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import jb.C9892c;

public class r extends h {

    /* renamed from: b  reason: collision with root package name */
    public final k f31499b;

    /* renamed from: c  reason: collision with root package name */
    public final int f31500c;

    public r(k kVar, int i10, int i11) {
        super(b(i10, i11));
        this.f31499b = kVar;
        this.f31500c = i11;
    }

    private static int b(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static r c(IOException iOException, k kVar, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !C9892c.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new q(iOException, kVar) : new r(iOException, kVar, i11, i10);
    }

    public r(String str, k kVar, int i10, int i11) {
        super(str, b(i10, i11));
        this.f31499b = kVar;
        this.f31500c = i11;
    }

    public r(IOException iOException, k kVar, int i10, int i11) {
        super((Throwable) iOException, b(i10, i11));
        this.f31499b = kVar;
        this.f31500c = i11;
    }

    public r(String str, IOException iOException, k kVar, int i10, int i11) {
        super(str, iOException, b(i10, i11));
        this.f31499b = kVar;
        this.f31500c = i11;
    }
}
