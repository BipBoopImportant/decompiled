package QJ;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001b\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LQJ/k1;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "LQJ/G;", "", "message", "LQJ/F0;", "coroutine", "<init>", "(Ljava/lang/String;LQJ/F0;)V", "(Ljava/lang/String;)V", "b", "()LQJ/k1;", "a", "LQJ/F0;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k1 extends CancellationException implements C16289G<k1> {

    /* renamed from: a  reason: collision with root package name */
    public final transient F0 f137644a;

    public k1(String str, F0 f02) {
        super(str);
        this.f137644a = f02;
    }

    /* renamed from: b */
    public k1 a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        k1 k1Var = new k1(message, this.f137644a);
        k1Var.initCause(this);
        return k1Var;
    }

    public k1(String str) {
        this(str, (F0) null);
    }
}
