package K6;

import android.app.Application;
import android.hardware.SensorManager;
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

public final class H implements Observer {

    /* renamed from: a  reason: collision with root package name */
    G f37597a;

    /* renamed from: b  reason: collision with root package name */
    boolean f37598b;

    /* renamed from: c  reason: collision with root package name */
    long f37599c;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<F> f37600d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<Pair<Integer, Long>> f37601e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    Future<C6596q<Pair<String, String>, Long, Long>> f37602f;

    /* renamed from: g  reason: collision with root package name */
    AtomicBoolean f37603g = new AtomicBoolean(false);

    /* renamed from: h  reason: collision with root package name */
    boolean f37604h;

    /* renamed from: i  reason: collision with root package name */
    private C6585f f37605i;

    class a implements Callable<C6596q<Pair<String, String>, Long, Long>> {
        a() {
        }

        public final /* synthetic */ Object call() {
            return H.this.f();
        }
    }

    public H(Application application, C6585f fVar) {
        C6595p.c("OrientationManager", "Initializing orientation manager", new Throwable[0]);
        this.f37599c = SystemClock.uptimeMillis();
        this.f37597a = new G(application);
        this.f37605i = fVar;
    }

    /* access modifiers changed from: private */
    public C6596q<Pair<String, String>, Long, Long> f() {
        String str;
        Long l10;
        long j10;
        float[] fArr;
        String str2 = "";
        long j11 = 0L;
        if (this.f37600d.size() <= 1) {
            return new C6596q<>(new Pair(str2, str2), 0L, 0L);
        }
        if (!this.f37603g.compareAndSet(false, true)) {
            return null;
        }
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            int c10 = (int) C6594o.c((long) this.f37600d.size());
            float[] fArr2 = new float[c10];
            float[] fArr3 = new float[c10];
            float[] fArr4 = new float[c10];
            float[] fArr5 = new float[c10];
            long j12 = this.f37599c;
            Iterator<F> it = this.f37600d.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    String str3 = str2;
                    Long l11 = j11;
                    j10 = uptimeMillis;
                    break;
                }
                F next = it.next();
                Iterator<F> it2 = it;
                l10 = j11;
                try {
                    fArr = new float[9];
                    str = str2;
                } catch (Exception e10) {
                    e = e10;
                    str = str2;
                    try {
                        C6595p.d("OrientationManager", "Exception in getting orientation events", e);
                        y.a(e);
                        this.f37603g.set(false);
                        String str4 = str;
                        Pair pair = new Pair(str4, str4);
                        Long l12 = l10;
                        return new C6596q<>(pair, l12, l12);
                    } catch (Throwable th2) {
                        this.f37603g.set(false);
                        throw th2;
                    }
                }
                try {
                    j10 = uptimeMillis;
                    if (SensorManager.getRotationMatrix(fArr, new float[9], next.f37576a, next.f37577b)) {
                        float[] fArr6 = new float[3];
                        SensorManager.getOrientation(fArr, fArr6);
                        float degrees = (float) Math.toDegrees((double) fArr6[1]);
                        float degrees2 = (float) Math.toDegrees((double) fArr6[2]);
                        float degrees3 = ((float) Math.toDegrees((double) fArr6[0])) * -1.0f;
                        if (degrees3 < 0.0f) {
                            degrees3 += 360.0f;
                        }
                        fArr2[i10] = degrees3;
                        fArr3[i10] = degrees * -1.0f;
                        fArr4[i10] = degrees2;
                        long max = Math.max(0, next.f37578c - j12);
                        if (next.f37580e && i10 != 0) {
                            this.f37601e.add(new Pair(Integer.valueOf(i10), Long.valueOf(next.f37578c - j12)));
                            max = Math.max(0, next.f37581f);
                        }
                        fArr5[i10] = (float) max;
                        SystemClock.uptimeMillis();
                        float f10 = fArr2[i10];
                        float f11 = fArr3[i10];
                        float f12 = fArr4[i10];
                    } else {
                        fArr2[i10] = 0.0f;
                        fArr3[i10] = 0.0f;
                        fArr4[i10] = 0.0f;
                        C6595p.d("OrientationManager", "Failed to get rotation matrix", new Throwable[0]);
                    }
                    j12 = next.f37578c;
                    int i11 = i10 + 1;
                    if (i11 >= c10) {
                        break;
                    }
                    i10 = i11;
                    it = it2;
                    j11 = l10;
                    str2 = str;
                    uptimeMillis = j10;
                } catch (Exception e11) {
                    e = e11;
                    C6595p.d("OrientationManager", "Exception in getting orientation events", e);
                    y.a(e);
                    this.f37603g.set(false);
                    String str42 = str;
                    Pair pair2 = new Pair(str42, str42);
                    Long l122 = l10;
                    return new C6596q<>(pair2, l122, l122);
                }
            }
            Pair<String, Long> c11 = C6591l.c(fArr2, 0.6f);
            Pair<String, Long> c12 = C6591l.c(fArr3, 0.6f);
            Pair<String, Long> c13 = C6591l.c(fArr4, 0.6f);
            Pair pair3 = new Pair(((String) c11.first) + ":" + ((String) c12.first) + ":" + ((String) c13.first), C6591l.c(fArr5, 0.0f).first);
            long longValue = ((Long) c11.second).longValue() + ((Long) c12.second).longValue() + ((Long) c13.second).longValue();
            StringBuilder sb2 = new StringBuilder("Orientation Event Count: ");
            sb2.append(c10);
            sb2.append("/");
            sb2.append(this.f37600d.size());
            C6595p.c("OrientationManager", sb2.toString(), new Throwable[0]);
            C6595p.c("OrientationManager", "Orientation SDCalc-Time: " + (SystemClock.uptimeMillis() - j10) + "ms", new Throwable[0]);
            C6596q<Pair<String, String>, Long, Long> qVar = new C6596q<>(pair3, Long.valueOf(longValue), Long.valueOf((long) c10));
            this.f37603g.set(false);
            return qVar;
        } catch (Exception e12) {
            e = e12;
            str = str2;
            l10 = 0L;
            C6595p.d("OrientationManager", "Exception in getting orientation events", e);
            y.a(e);
            this.f37603g.set(false);
            String str422 = str;
            Pair pair22 = new Pair(str422, str422);
            Long l1222 = l10;
            return new C6596q<>(pair22, l1222, l1222);
        }
    }

    public final void b() {
        this.f37597a.a();
        this.f37597a.deleteObservers();
    }

    public final long c() {
        return (long) this.f37600d.size();
    }

    public final String d() {
        try {
            StringBuilder sb2 = new StringBuilder();
            Iterator<Pair<Integer, Long>> it = this.f37601e.iterator();
            while (it.hasNext()) {
                Pair next = it.next();
                sb2.append(next.first);
                sb2.append(",");
                sb2.append(next.second);
                sb2.append(";");
            }
            if (sb2.length() > 0) {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            return sb2.toString();
        } catch (Exception e10) {
            C6595p.e("OrientationManager", "Exception in getBackgroundEvent", e10);
            y.a(e10);
            return "";
        }
    }

    public final C6596q<Pair<String, String>, Long, Long> e() {
        Future<C6596q<Pair<String, String>, Long, Long>> future;
        C6596q<Pair<String, String>, Long, Long> qVar = new C6596q<>(new Pair("", ""), 0L, 0L);
        try {
            Future<C6596q<Pair<String, String>, Long, Long>> future2 = this.f37602f;
            if (future2 != null) {
                try {
                    qVar = future2.get();
                } catch (InterruptedException e10) {
                    C6595p.d("OrientationManager", "Failed to get orientation data: " + e10.getMessage(), new Throwable[0]);
                } catch (ExecutionException e11) {
                    C6595p.d("OrientationManager", "Failed to get orientation data: " + e11.getMessage(), new Throwable[0]);
                }
            }
            if (qVar != null) {
                return qVar;
            }
            b();
            qVar = f();
            if (qVar != null || (future = this.f37602f) == null) {
                return qVar;
            }
            try {
                return future.get();
            } catch (InterruptedException e12) {
                C6595p.d("OrientationManager", "Failed to get orientation data: " + e12.getMessage(), new Throwable[0]);
                return qVar;
            } catch (ExecutionException e13) {
                C6595p.d("OrientationManager", "Failed to get orientation data: " + e13.getMessage(), new Throwable[0]);
                return qVar;
            }
        } catch (Exception e14) {
            C6595p.e("OrientationManager", "Exception in OrientationManager", e14);
            y.a(e14);
            return qVar;
        }
    }

    public final void update(Observable observable, Object obj) {
        if (obj != null) {
            try {
                if (this.f37600d.size() >= 128) {
                    b();
                    Future<C6596q<Pair<String, String>, Long, Long>> future = this.f37602f;
                    if (future != null && !future.isCancelled()) {
                        if (!this.f37602f.isDone()) {
                            return;
                        }
                    }
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);
                    this.f37602f = newFixedThreadPool.submit(new a());
                    newFixedThreadPool.shutdown();
                    return;
                }
                if (this.f37600d.size() >= 32 && !this.f37604h) {
                    this.f37604h = true;
                    this.f37605i.a();
                }
                this.f37600d.add((F) obj);
            } catch (Exception e10) {
                C6595p.d("OrientationManager", "Exception in processing orientation event", e10);
                y.a(e10);
            }
        }
    }
}
