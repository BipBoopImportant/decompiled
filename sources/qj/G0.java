package QJ;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8@X\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LQJ/G0;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "LQJ/G;", "", "message", "", "cause", "LQJ/F0;", "job", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;LQJ/F0;)V", "fillInStackTrace", "()Ljava/lang/Throwable;", "b", "()LQJ/G0;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "LQJ/F0;", "_job", "c", "()LQJ/F0;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class G0 extends CancellationException implements C16289G<G0> {

    /* renamed from: a  reason: collision with root package name */
    private final transient F0 f137564a;

    public G0(String str, Throwable th2, F0 f02) {
        super(str);
        this.f137564a = f02;
        if (th2 != null) {
            initCause(th2);
        }
    }

    /* renamed from: b */
    public G0 a() {
        return null;
    }

    public final F0 c() {
        F0 f02 = this.f137564a;
        return f02 == null ? R0.f137599a : f02;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof G0) {
                G0 g02 = (G0) obj;
                if (!C17542s.e(g02.getMessage(), getMessage()) || !C17542s.e(g02.c(), c()) || !C17542s.e(g02.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C17542s.g(message);
        int hashCode = message.hashCode() * 31;
        F0 c10 = c();
        int i10 = 0;
        int hashCode2 = (hashCode + (c10 != null ? c10.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i10 = cause.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return super.toString() + "; job=" + c();
    }
}
