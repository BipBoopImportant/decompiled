package ju;

import am.h;
import androidx.work.C7032a;
import androidx.work.C7036e;
import androidx.work.C7037f;
import androidx.work.C7042k;
import androidx.work.H;
import com.ingka.ikea.instore.impl.storemode.cleanup.StoreModeCleanupWorker;
import eE.C14397a;
import eE.C14400d;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lju/b;", "Lju/a;", "LeE/d;", "workScheduler", "Lam/h;", "timeProvider", "<init>", "(LeE/d;Lam/h;)V", "LXH/N;", "a", "()V", "LeE/d;", "b", "Lam/h;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ju.b  reason: case insensitive filesystem */
public final class C11455b implements C11454a {

    /* renamed from: a  reason: collision with root package name */
    private final C14400d f98755a;

    /* renamed from: b  reason: collision with root package name */
    private final h f98756b;

    public C11455b(C14400d dVar, h hVar) {
        C17542s.j(dVar, "workScheduler");
        C17542s.j(hVar, "timeProvider");
        this.f98755a = dVar;
        this.f98756b = hVar;
    }

    public void a() {
        Date date = new Date(this.f98756b.c());
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.setLenient(true);
        instance.add(5, 1);
        instance.set(11, 0);
        instance.set(12, 1);
        instance.set(13, 0);
        this.f98755a.b(P.b(StoreModeCleanupWorker.class), new C14397a("StoreModeCleanUpTask", (C7032a) null, 0, (C7036e) null, instance.getTime().getTime() - date.getTime(), (C7037f) null, (H) null, 110, (DefaultConstructorMarker) null), C7042k.KEEP);
    }
}
