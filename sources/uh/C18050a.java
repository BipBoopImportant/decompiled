package uH;

import java.net.ConnectException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LuH/a;", "Ljava/net/ConnectException;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: uH.a  reason: case insensitive filesystem */
public final class C18050a extends ConnectException {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f147778a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18050a(String str, Throwable th2) {
        super(str);
        C17542s.j(str, "message");
        this.f147778a = th2;
    }

    public Throwable getCause() {
        return this.f147778a;
    }
}
