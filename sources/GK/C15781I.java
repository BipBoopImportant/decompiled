package GK;

import WK.C16773h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J)\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LGK/I;", "", "<init>", "()V", "LGK/H;", "webSocket", "LGK/D;", "response", "LXH/N;", "g", "(LGK/H;LGK/D;)V", "", "text", "f", "(LGK/H;Ljava/lang/String;)V", "LWK/h;", "bytes", "e", "(LGK/H;LWK/h;)V", "", "code", "reason", "b", "(LGK/H;ILjava/lang/String;)V", "a", "", "t", "c", "(LGK/H;Ljava/lang/Throwable;LGK/D;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.I  reason: case insensitive filesystem */
public abstract class C15781I {
    public void a(C15780H h10, int i10, String str) {
        C17542s.j(h10, "webSocket");
        C17542s.j(str, "reason");
    }

    public void b(C15780H h10, int i10, String str) {
        C17542s.j(h10, "webSocket");
        C17542s.j(str, "reason");
    }

    public void c(C15780H h10, Throwable th2, C15776D d10) {
        C17542s.j(h10, "webSocket");
        C17542s.j(th2, "t");
    }

    public void e(C15780H h10, C16773h hVar) {
        C17542s.j(h10, "webSocket");
        C17542s.j(hVar, "bytes");
    }

    public void f(C15780H h10, String str) {
        C17542s.j(h10, "webSocket");
        C17542s.j(str, "text");
    }

    public void g(C15780H h10, C15776D d10) {
        C17542s.j(h10, "webSocket");
        C17542s.j(d10, "response");
    }
}
