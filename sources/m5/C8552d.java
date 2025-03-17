package m5;

import androidx.work.L;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l5.C8528y;
import l5.K;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lm5/d;", "", "Landroidx/work/L;", "runnableScheduler", "Ll5/K;", "launcher", "", "timeoutMs", "<init>", "(Landroidx/work/L;Ll5/K;J)V", "Ll5/y;", "token", "LXH/N;", "c", "(Ll5/y;)V", "b", "a", "Landroidx/work/L;", "Ll5/K;", "J", "d", "Ljava/lang/Object;", "lock", "", "Ljava/lang/Runnable;", "e", "Ljava/util/Map;", "tracked", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m5.d  reason: case insensitive filesystem */
public final class C8552d {

    /* renamed from: a  reason: collision with root package name */
    private final L f54998a;

    /* renamed from: b  reason: collision with root package name */
    private final K f54999b;

    /* renamed from: c  reason: collision with root package name */
    private final long f55000c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f55001d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<C8528y, Runnable> f55002e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8552d(L l10, K k10) {
        this(l10, k10, 0, 4, (DefaultConstructorMarker) null);
        C17542s.j(l10, "runnableScheduler");
        C17542s.j(k10, "launcher");
    }

    /* access modifiers changed from: private */
    public static final void d(C8552d dVar, C8528y yVar) {
        dVar.f54999b.d(yVar, 3);
    }

    public final void b(C8528y yVar) {
        Runnable remove;
        C17542s.j(yVar, "token");
        synchronized (this.f55001d) {
            remove = this.f55002e.remove(yVar);
        }
        if (remove != null) {
            this.f54998a.a(remove);
        }
    }

    public final void c(C8528y yVar) {
        C17542s.j(yVar, "token");
        C8551c cVar = new C8551c(this, yVar);
        synchronized (this.f55001d) {
            Runnable put = this.f55002e.put(yVar, cVar);
        }
        this.f54998a.b(this.f55000c, cVar);
    }

    public C8552d(L l10, K k10, long j10) {
        C17542s.j(l10, "runnableScheduler");
        C17542s.j(k10, "launcher");
        this.f54998a = l10;
        this.f54999b = k10;
        this.f55000c = j10;
        this.f55001d = new Object();
        this.f55002e = new LinkedHashMap();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8552d(L l10, K k10, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(l10, k10, (i10 & 4) != 0 ? TimeUnit.MINUTES.toMillis(90) : j10);
    }
}
