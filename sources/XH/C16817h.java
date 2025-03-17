package XH;

import gI.C17268b;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "", "b", "(Ljava/lang/Throwable;)Ljava/lang/String;", "exception", "LXH/N;", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/ExceptionsKt")
/* renamed from: XH.h  reason: case insensitive filesystem */
class C16817h {
    public static void a(Throwable th2, Throwable th3) {
        C17542s.j(th2, "<this>");
        C17542s.j(th3, "exception");
        if (th2 != th3) {
            C17268b.f143295a.a(th2, th3);
        }
    }

    public static String b(Throwable th2) {
        C17542s.j(th2, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        C17542s.i(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
