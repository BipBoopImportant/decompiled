package K6;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

public final class U {

    /* renamed from: a  reason: collision with root package name */
    final b f37618a = new b(this, (byte) 0);

    /* renamed from: b  reason: collision with root package name */
    ArrayList<z> f37619b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    AtomicBoolean f37620c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    Future<Pair<String, Long>> f37621d;

    /* renamed from: e  reason: collision with root package name */
    public int f37622e;

    /* renamed from: f  reason: collision with root package name */
    public long f37623f;

    class a implements Callable<Pair<String, Long>> {
        a() {
        }

        public final /* synthetic */ Object call() {
            return U.this.c();
        }
    }

    U() {
        a();
    }

    private void d() {
        Future<Pair<String, Long>> future = this.f37621d;
        if (future != null) {
            if (!future.isCancelled() && !this.f37621d.isDone()) {
                this.f37621d.cancel(true);
            }
            this.f37621d = null;
        }
    }

    public final void a() {
        this.f37618a.f37625a = SystemClock.uptimeMillis();
        this.f37622e = 0;
        this.f37623f = 0;
        this.f37619b.clear();
        d();
    }

    public final Pair<String, Long> b() {
        Future<Pair<String, Long>> future;
        Pair<String, Long> pair = new Pair<>("", 0L);
        try {
            Future<Pair<String, Long>> future2 = this.f37621d;
            if (future2 != null) {
                try {
                    pair = future2.get();
                } catch (InterruptedException e10) {
                    C6595p.d("TextChangeManager", "Failed to get Text data: " + e10.getMessage(), new Throwable[0]);
                } catch (ExecutionException e11) {
                    C6595p.d("TextChangeManager", "Failed to get Text data: " + e11.getMessage(), new Throwable[0]);
                }
            }
            if (pair != null) {
                return pair;
            }
            pair = c();
            if (pair != null || (future = this.f37621d) == null) {
                return pair;
            }
            try {
                return future.get();
            } catch (InterruptedException e12) {
                C6595p.d("TextChangeManager", "Failed to get Text data: " + e12.getMessage(), new Throwable[0]);
                return pair;
            } catch (ExecutionException e13) {
                C6595p.d("TextChangeManager", "Failed to get Text data: " + e13.getMessage(), new Throwable[0]);
                return pair;
            }
        } catch (Exception e14) {
            C6595p.d("TextChangeManager", "Exception in processing text event", e14);
            y.a(e14);
            return pair;
        }
    }

    /* access modifiers changed from: package-private */
    public final Pair<String, Long> c() {
        long j10 = 0;
        String str = "";
        if (this.f37619b.size() == 0) {
            return new Pair<>(str, 0L);
        }
        if (!this.f37620c.compareAndSet(false, true)) {
            return null;
        }
        Iterator<z> it = this.f37619b.iterator();
        while (it.hasNext()) {
            z next = it.next();
            String str2 = next.f37737b + "," + Long.valueOf(next.f37736a) + "," + next.f37738c;
            if (next.f37739d) {
                str2 = str2 + ",1";
            }
            str = str + (str2 + ";");
            j10 += next.f37736a + P.b(next.f37737b) + ((long) next.f37738c);
            SystemClock.uptimeMillis();
            String str3 = C6599u.f37710b;
            this.f37619b.size();
        }
        this.f37620c.set(false);
        return new Pair<>(str, Long.valueOf(j10));
    }

    class b implements Observer {

        /* renamed from: a  reason: collision with root package name */
        long f37625a;

        /* renamed from: b  reason: collision with root package name */
        private int f37626b;

        private b() {
            this.f37626b = -1;
        }

        public final void update(Observable observable, Object obj) {
            try {
                U u10 = U.this;
                u10.f37623f++;
                if (obj != null && u10.f37619b.size() < 50 && !U.this.f37620c.get()) {
                    z zVar = (z) obj;
                    z zVar2 = new z(zVar.f37736a - this.f37625a, zVar.f37737b, zVar.f37738c, zVar.f37739d);
                    int i10 = this.f37626b;
                    int i11 = zVar.f37738c;
                    if (i10 != i11) {
                        U.this.f37622e = 0;
                        this.f37626b = i11;
                    }
                    U u11 = U.this;
                    int i12 = u11.f37622e;
                    if (i12 < 9) {
                        u11.f37622e = i12 + 1;
                        u11.f37619b.add(zVar2);
                    }
                    this.f37625a = zVar.f37736a;
                    if (U.this.f37619b.size() >= 50) {
                        U u12 = U.this;
                        Future<Pair<String, Long>> future = u12.f37621d;
                        if (future == null || future.isCancelled() || u12.f37621d.isDone()) {
                            ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);
                            u12.f37621d = newFixedThreadPool.submit(new a());
                            newFixedThreadPool.shutdown();
                        }
                    }
                }
            } catch (Exception e10) {
                C6595p.d("TextChangeManager", "Exception in processing text change event", e10);
                y.a(e10);
            }
        }

        /* synthetic */ b(U u10, byte b10) {
            this();
        }
    }
}
