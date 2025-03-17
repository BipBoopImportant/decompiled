package pC;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\n"}, d2 = {"LpC/c;", "LpC/b;", "<init>", "()V", "", "a", "J", "()J", "taskExecutionTimeout", "b", "taskscheduler-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pC.c  reason: case insensitive filesystem */
public final class C14912c implements C14911b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f130260b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final long f130261c;

    /* renamed from: d  reason: collision with root package name */
    private static final long f130262d;

    /* renamed from: a  reason: collision with root package name */
    private final long f130263a = f130262d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LpC/c$a;", "", "<init>", "()V", "", "DEBUG_TIMEOUT_MILLIS", "J", "RELEASE_TIMEOUT_MILLIS", "taskscheduler-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pC.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f130261c = timeUnit.toMillis(1);
        f130262d = timeUnit.toMillis(2);
    }

    public long a() {
        return this.f130263a;
    }
}
