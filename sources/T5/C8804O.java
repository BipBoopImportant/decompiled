package t5;

import androidx.work.C7055y;
import androidx.work.L;
import java.util.HashMap;
import java.util.Map;
import s5.C8731m;

/* renamed from: t5.O  reason: case insensitive filesystem */
public class C8804O {

    /* renamed from: e  reason: collision with root package name */
    private static final String f56598e = C7055y.i("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    final L f56599a;

    /* renamed from: b  reason: collision with root package name */
    final Map<C8731m, b> f56600b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map<C8731m, a> f56601c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    final Object f56602d = new Object();

    /* renamed from: t5.O$a */
    public interface a {
        void a(C8731m mVar);
    }

    /* renamed from: t5.O$b */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final C8804O f56603a;

        /* renamed from: b  reason: collision with root package name */
        private final C8731m f56604b;

        b(C8804O o10, C8731m mVar) {
            this.f56603a = o10;
            this.f56604b = mVar;
        }

        public void run() {
            synchronized (this.f56603a.f56602d) {
                try {
                    if (this.f56603a.f56600b.remove(this.f56604b) != null) {
                        a remove = this.f56603a.f56601c.remove(this.f56604b);
                        if (remove != null) {
                            remove.a(this.f56604b);
                        }
                    } else {
                        C7055y.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f56604b}));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public C8804O(L l10) {
        this.f56599a = l10;
    }

    public void a(C8731m mVar, long j10, a aVar) {
        synchronized (this.f56602d) {
            C7055y e10 = C7055y.e();
            String str = f56598e;
            e10.a(str, "Starting timer for " + mVar);
            b(mVar);
            b bVar = new b(this, mVar);
            this.f56600b.put(mVar, bVar);
            this.f56601c.put(mVar, aVar);
            this.f56599a.b(j10, bVar);
        }
    }

    public void b(C8731m mVar) {
        synchronized (this.f56602d) {
            try {
                if (this.f56600b.remove(mVar) != null) {
                    C7055y e10 = C7055y.e();
                    String str = f56598e;
                    e10.a(str, "Stopping timer for " + mVar);
                    this.f56601c.remove(mVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
