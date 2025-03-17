package S8;

import D8.c;
import X8.b;
import a9.C6887n1;
import a9.C6935t2;
import a9.Y6;
import com.contentsquare.android.internal.core.logmonitor.processing.LogContext;
import com.contentsquare.android.internal.core.logmonitor.processing.LogError;
import com.contentsquare.android.internal.core.logmonitor.processing.LogMessage;
import com.contentsquare.android.internal.core.logmonitor.processing.LogXpf;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJK\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LS8/a;", "", "<init>", "()V", "", "description", "", "additionalContext", "LXH/N;", "e", "(Ljava/lang/String;Ljava/util/Map;)V", "errorType", "errorMessage", "stacktrace", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "LD8/c;", "b", "LD8/c;", "logger", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f39924a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final c f39925b = new c("LogMonitor");

    private a() {
    }

    public static /* synthetic */ void b(a aVar, String str, String str2, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            map = null;
        }
        aVar.a(str, str2, map);
    }

    public static /* synthetic */ void d(a aVar, String str, String str2, String str3, String str4, Map map, int i10, Object obj) {
        String str5 = (i10 & 2) != 0 ? "" : str2;
        String str6 = (i10 & 4) != 0 ? "" : str3;
        String str7 = (i10 & 8) != 0 ? "" : str4;
        if ((i10 & 16) != 0) {
            map = null;
        }
        aVar.c(str, str5, str6, str7, map);
    }

    public final void a(String str, String str2, Map<String, ? extends Object> map) {
        C6887n1 k10;
        C17542s.j(str, "description");
        C17542s.j(str2, "stacktrace");
        try {
            com.contentsquare.android.internal.core.logmonitor.processing.a aVar = com.contentsquare.android.internal.core.logmonitor.processing.a.CRITICAL;
            LogContext logContext = new LogContext(str, Y6.a(map));
            String str3 = C6935t2.f42866a;
            LogMessage logMessage = new LogMessage(aVar, str2, logContext, str3 != null ? new LogXpf(str3, C6935t2.f42867b, C6935t2.f42868c) : null, 8);
            b i10 = b.i();
            if (i10 != null && (k10 = i10.k()) != null) {
                k10.a(logMessage);
            }
        } catch (IllegalStateException e10) {
            c cVar = f39925b;
            cVar.h("Failed to save crash log: " + e10.getMessage());
        }
    }

    public final void c(String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        C6887n1 k10;
        C17542s.j(str, "description");
        C17542s.j(str2, "errorType");
        C17542s.j(str3, "errorMessage");
        C17542s.j(str4, "stacktrace");
        try {
            com.contentsquare.android.internal.core.logmonitor.processing.a aVar = com.contentsquare.android.internal.core.logmonitor.processing.a.ERROR;
            LogContext logContext = new LogContext(str, Y6.a(map));
            LogError logError = new LogError(str2, str3);
            String str5 = C6935t2.f42866a;
            LogMessage logMessage = new LogMessage(aVar, str4, logContext, logError, str5 != null ? new LogXpf(str5, C6935t2.f42867b, C6935t2.f42868c) : null);
            b i10 = b.i();
            if (i10 != null && (k10 = i10.k()) != null) {
                k10.a(logMessage);
            }
        } catch (IllegalStateException e10) {
            c cVar = f39925b;
            cVar.h("Failed to save error log: " + e10.getMessage());
        }
    }

    public final void e(String str, Map<String, ? extends Object> map) {
        C6887n1 k10;
        C17542s.j(str, "description");
        try {
            com.contentsquare.android.internal.core.logmonitor.processing.a aVar = com.contentsquare.android.internal.core.logmonitor.processing.a.WARN;
            LogContext logContext = new LogContext(str, Y6.a(map));
            String str2 = C6935t2.f42866a;
            LogMessage logMessage = new LogMessage(aVar, (String) null, logContext, str2 != null ? new LogXpf(str2, C6935t2.f42867b, C6935t2.f42868c) : null, 10);
            b i10 = b.i();
            if (i10 != null && (k10 = i10.k()) != null) {
                k10.a(logMessage);
            }
        } catch (IllegalStateException e10) {
            c cVar = f39925b;
            cVar.h("Failed to save warning log: " + e10.getMessage());
        }
    }
}
