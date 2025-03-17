package lz;

import YH.C16870n;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "a", "(Ljava/lang/Exception;Ljava/lang/String;)Ljava/lang/String;", "datalayer-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final String a(Exception exc, String str) {
        C17542s.j(exc, "<this>");
        C17542s.j(str, "message");
        StackTraceElement[] stackTrace = exc.getStackTrace();
        C17542s.i(stackTrace, "getStackTrace(...)");
        StackTraceElement stackTraceElement = (StackTraceElement) C16870n.h0(stackTrace);
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        if (stackTraceElement != null) {
            message = message + "\nValue expected non null was null from server, check " + stackTraceElement.getFileName() + " " + stackTraceElement.getClassName() + " " + stackTraceElement.getMethodName() + " " + stackTraceElement.getLineNumber();
        }
        return str + " \n " + message;
    }

    public static /* synthetic */ String b(Exception exc, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        return a(exc, str);
    }
}
