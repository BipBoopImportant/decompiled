package LK;

import XH.C16816g;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00038\u0006@BX\u000e¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"LLK/i;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "firstConnectException", "<init>", "(Ljava/io/IOException;)V", "e", "LXH/N;", "a", "Ljava/io/IOException;", "b", "()Ljava/io/IOException;", "<set-?>", "c", "lastConnectException", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final IOException f136206a;

    /* renamed from: b  reason: collision with root package name */
    private IOException f136207b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(IOException iOException) {
        super(iOException);
        C17542s.j(iOException, "firstConnectException");
        this.f136206a = iOException;
        this.f136207b = iOException;
    }

    public final void a(IOException iOException) {
        C17542s.j(iOException, "e");
        C16816g.a(this.f136206a, iOException);
        this.f136207b = iOException;
    }

    public final IOException b() {
        return this.f136206a;
    }

    public final IOException c() {
        return this.f136207b;
    }
}
