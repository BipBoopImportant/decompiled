package RK;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003¨\u0006\u000b"}, d2 = {"LRK/f;", "Ljava/util/logging/Handler;", "<init>", "()V", "Ljava/util/logging/LogRecord;", "record", "LXH/N;", "publish", "(Ljava/util/logging/LogRecord;)V", "flush", "close", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: RK.f  reason: case insensitive filesystem */
public final class C16393f extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final C16393f f138034a = new C16393f();

    private C16393f() {
    }

    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        C17542s.j(logRecord, "record");
        C16392e eVar = C16392e.f138031a;
        String loggerName = logRecord.getLoggerName();
        C17542s.i(loggerName, "record.loggerName");
        int a10 = C16394g.b(logRecord);
        String message = logRecord.getMessage();
        C17542s.i(message, "record.message");
        eVar.a(loggerName, a10, message, logRecord.getThrown());
    }
}
