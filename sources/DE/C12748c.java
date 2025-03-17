package DE;

import com.optimizely.ab.event.internal.payload.EventBatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: DE.c  reason: case insensitive filesystem */
public class C12748c {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f108609a = LoggerFactory.getLogger((Class<?>) C12748c.class);

    /* renamed from: b  reason: collision with root package name */
    public static final EventBatch.ClientEngine f108610b;

    /* renamed from: c  reason: collision with root package name */
    private static EventBatch.ClientEngine f108611c;

    static {
        EventBatch.ClientEngine clientEngine = EventBatch.ClientEngine.JAVA_SDK;
        f108610b = clientEngine;
        f108611c = clientEngine;
    }

    private C12748c() {
    }

    public static EventBatch.ClientEngine a() {
        return f108611c;
    }

    public static void b(EventBatch.ClientEngine clientEngine) {
        if (clientEngine == null) {
            f108609a.warn("ClientEngine cannot be null, defaulting to {}", (Object) f108611c.getClientEngineValue());
            return;
        }
        f108609a.info("Setting Optimizely client engine to {}", (Object) clientEngine.getClientEngineValue());
        f108611c = clientEngine;
    }
}
