package RK;

import GK.z;
import HJ.C15854t;
import KK.e;
import OK.C16175e;
import YH.X;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0003R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001c"}, d2 = {"LRK/e;", "", "<init>", "()V", "", "loggerName", "d", "(Ljava/lang/String;)Ljava/lang/String;", "logger", "tag", "LXH/N;", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "", "logLevel", "message", "", "t", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "b", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "configuredLoggers", "", "Ljava/util/Map;", "knownLoggers", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: RK.e  reason: case insensitive filesystem */
public final class C16392e {

    /* renamed from: a  reason: collision with root package name */
    public static final C16392e f138031a = new C16392e();

    /* renamed from: b  reason: collision with root package name */
    private static final CopyOnWriteArraySet<Logger> f138032b = new CopyOnWriteArraySet<>();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, String> f138033c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<z> cls = z.class;
        Package packageR = cls.getPackage();
        String name = packageR != null ? packageR.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = cls.getName();
        C17542s.i(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = C16175e.class.getName();
        C17542s.i(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = e.class.getName();
        C17542s.i(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f138033c = X.x(linkedHashMap);
    }

    private C16392e() {
    }

    private final void c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f138032b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C16393f.f138034a);
        }
    }

    private final String d(String str) {
        String str2 = f138033c.get(str);
        return str2 == null ? C15854t.K1(str, 23) : str2;
    }

    public final void a(String str, int i10, String str2, Throwable th2) {
        int min;
        C17542s.j(str, "loggerName");
        C17542s.j(str2, "message");
        String d10 = d(str);
        if (Log.isLoggable(d10, i10)) {
            if (th2 != null) {
                str2 = str2 + 10 + Log.getStackTraceString(th2);
            }
            int length = str2.length();
            int i11 = 0;
            while (i11 < length) {
                int r02 = C15854t.r0(str2, 10, i11, false, 4, (Object) null);
                if (r02 == -1) {
                    r02 = length;
                }
                while (true) {
                    min = Math.min(r02, i11 + 4000);
                    String substring = str2.substring(i11, min);
                    C17542s.i(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i10, d10, substring);
                    if (min >= r02) {
                        break;
                    }
                    i11 = min;
                }
                i11 = min + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry next : f138033c.entrySet()) {
            c((String) next.getKey(), (String) next.getValue());
        }
    }
}
