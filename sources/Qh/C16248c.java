package QH;

import java.nio.charset.MalformedInputException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LQH/c;", "Ljava/nio/charset/MalformedInputException;", "", "message", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "_message", "getMessage", "()Ljava/lang/String;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: QH.c  reason: case insensitive filesystem */
public class C16248c extends MalformedInputException {

    /* renamed from: a  reason: collision with root package name */
    private final String f137401a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16248c(String str) {
        super(0);
        C17542s.j(str, "message");
        this.f137401a = str;
    }

    public String getMessage() {
        return this.f137401a;
    }
}
