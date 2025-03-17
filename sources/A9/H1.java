package a9;

import D8.c;
import G8.g;
import S8.a;
import java.util.Map;
import kotlin.jvm.internal.C17542s;

public final class H1 {
    public static final void a(c cVar, String str, Throwable th2) {
        C17542s.j(cVar, "<this>");
        C17542s.j(str, "description");
        cVar.i(th2, str);
        a aVar = a.f39924a;
        String str2 = null;
        String name = th2 != null ? th2.getClass().getName() : null;
        String str3 = name == null ? "" : name;
        String message = th2 != null ? th2.getMessage() : null;
        String str4 = message == null ? "" : message;
        if (th2 != null) {
            str2 = g.b(th2, 0, 1, (Object) null);
        }
        a.d(aVar, str, str3, str4, str2 == null ? "" : str2, (Map) null, 16, (Object) null);
    }
}
