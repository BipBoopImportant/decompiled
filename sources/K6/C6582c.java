package K6;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: K6.c  reason: case insensitive filesystem */
public final class C6582c implements Observer {

    /* renamed from: a  reason: collision with root package name */
    long f37634a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f37635b;

    /* renamed from: c  reason: collision with root package name */
    public int f37636c;

    /* renamed from: d  reason: collision with root package name */
    public long f37637d = 0;

    /* renamed from: e  reason: collision with root package name */
    String f37638e = "";

    /* renamed from: f  reason: collision with root package name */
    ArrayList<C6588i> f37639f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    Future<Pair<String, Long>> f37640g;

    /* renamed from: h  reason: collision with root package name */
    private AtomicBoolean f37641h = new AtomicBoolean(false);

    /* renamed from: i  reason: collision with root package name */
    long f37642i;

    /* renamed from: K6.c$a */
    class a implements Callable<Pair<String, Long>> {
        a() {
        }

        public final /* synthetic */ Object call() {
            return C6582c.this.c();
        }
    }

    C6582c() {
    }

    /* access modifiers changed from: private */
    public Pair<String, Long> c() {
        if (this.f37639f.size() == 0) {
            return new Pair<>("", 0L);
        }
        if (!this.f37641h.compareAndSet(false, true)) {
            return null;
        }
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            Iterator<C6588i> it = this.f37639f.iterator();
            while (it.hasNext()) {
                C6588i next = it.next();
                this.f37638e += (next.f37692a + "," + next.f37698g + ",0,0," + next.f37694c + ",1," + next.f37697f + ",-1;");
                this.f37642i += next.f37698g + ((long) next.f37692a);
            }
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            C6595p.c("TouchManager", "Touch Event Count: " + this.f37639f.size() + " (move: " + this.f37635b + ", updown: " + this.f37636c + ")", new Throwable[0]);
            StringBuilder sb2 = new StringBuilder("Touch SDCalc-Time: ");
            sb2.append(uptimeMillis2);
            sb2.append("ms");
            C6595p.c("TouchManager", sb2.toString(), new Throwable[0]);
            Pair<String, Long> pair = new Pair<>(this.f37638e, Long.valueOf(this.f37642i));
            this.f37641h.set(false);
            return pair;
        } catch (Exception e10) {
            C6595p.d("TouchManager", "Exception in getting touch events", e10);
            y.a(e10);
            this.f37641h.set(false);
            return new Pair<>("", 0L);
        } catch (Throwable th2) {
            this.f37641h.set(false);
            throw th2;
        }
    }

    public final Pair<String, Long> a() {
        Future<Pair<String, Long>> future;
        Pair<String, Long> pair = new Pair<>("", 0L);
        Future<Pair<String, Long>> future2 = this.f37640g;
        if (future2 != null) {
            try {
                pair = future2.get();
            } catch (InterruptedException e10) {
                C6595p.d("TouchManager", "Failed to get touch data: " + e10.getMessage(), new Throwable[0]);
            } catch (ExecutionException e11) {
                C6595p.d("TouchManager", "Failed to get touch data: " + e11.getMessage(), new Throwable[0]);
            }
        }
        if (pair != null) {
            return pair;
        }
        Pair<String, Long> c10 = c();
        if (c10 != null || (future = this.f37640g) == null) {
            return c10;
        }
        try {
            return future.get();
        } catch (InterruptedException e12) {
            C6595p.d("TouchManager", "Failed to get touch data: " + e12.getMessage(), new Throwable[0]);
            return c10;
        } catch (ExecutionException e13) {
            C6595p.d("TouchManager", "Failed to get touch data: " + e13.getMessage(), new Throwable[0]);
            return c10;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033 A[Catch:{ Exception -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064 A[Catch:{ Exception -> 0x0028 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void update(java.util.Observable r13, java.lang.Object r14) {
        /*
            r12 = this;
            r13 = 0
            r0 = 1
            if (r14 == 0) goto L_0x00cf
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.f37641h     // Catch:{ Exception -> 0x0028 }
            boolean r1 = r1.get()     // Catch:{ Exception -> 0x0028 }
            if (r1 == 0) goto L_0x000e
            goto L_0x00cf
        L_0x000e:
            long r1 = r12.f37637d     // Catch:{ Exception -> 0x0028 }
            r3 = 1
            long r1 = r1 + r3
            r12.f37637d = r1     // Catch:{ Exception -> 0x0028 }
            K6.d r14 = (K6.C6583d) r14     // Catch:{ Exception -> 0x0028 }
            android.view.MotionEvent r1 = r14.f37644a     // Catch:{ Exception -> 0x0028 }
            int r1 = r1.getPointerCount()     // Catch:{ Exception -> 0x0028 }
            int r2 = r14.f37646c     // Catch:{ Exception -> 0x0028 }
            r9 = 50
            if (r2 != r0) goto L_0x002b
            int r3 = r12.f37635b     // Catch:{ Exception -> 0x0028 }
            if (r3 < r9) goto L_0x0031
            goto L_0x002b
        L_0x0028:
            r14 = move-exception
            goto L_0x00c1
        L_0x002b:
            if (r2 == r0) goto L_0x00c0
            int r3 = r12.f37636c     // Catch:{ Exception -> 0x0028 }
            if (r3 >= r9) goto L_0x00c0
        L_0x0031:
            if (r2 != r0) goto L_0x0060
            r10 = r13
        L_0x0034:
            if (r10 >= r1) goto L_0x0060
            int r2 = r12.f37635b     // Catch:{ Exception -> 0x0028 }
            if (r2 >= r9) goto L_0x005e
            K6.i r11 = new K6.i     // Catch:{ Exception -> 0x0028 }
            int r3 = r14.f37645b     // Catch:{ Exception -> 0x0028 }
            android.view.MotionEvent r2 = r14.f37644a     // Catch:{ Exception -> 0x0028 }
            long r4 = r2.getEventTime()     // Catch:{ Exception -> 0x0028 }
            long r6 = r12.f37634a     // Catch:{ Exception -> 0x0028 }
            long r4 = r4 - r6
            int r6 = r14.f37646c     // Catch:{ Exception -> 0x0028 }
            android.view.MotionEvent r2 = r14.f37644a     // Catch:{ Exception -> 0x0028 }
            int r8 = r2.getToolType(r10)     // Catch:{ Exception -> 0x0028 }
            r2 = r11
            r7 = r1
            r2.<init>(r3, r4, r6, r7, r8)     // Catch:{ Exception -> 0x0028 }
            java.util.ArrayList<K6.i> r2 = r12.f37639f     // Catch:{ Exception -> 0x0028 }
            r2.add(r11)     // Catch:{ Exception -> 0x0028 }
            int r2 = r12.f37635b     // Catch:{ Exception -> 0x0028 }
            int r2 = r2 + r0
            r12.f37635b = r2     // Catch:{ Exception -> 0x0028 }
        L_0x005e:
            int r10 = r10 + r0
            goto L_0x0034
        L_0x0060:
            int r2 = r14.f37646c     // Catch:{ Exception -> 0x0028 }
            if (r2 == r0) goto L_0x008c
            K6.i r10 = new K6.i     // Catch:{ Exception -> 0x0028 }
            int r3 = r14.f37645b     // Catch:{ Exception -> 0x0028 }
            android.view.MotionEvent r2 = r14.f37644a     // Catch:{ Exception -> 0x0028 }
            long r4 = r2.getEventTime()     // Catch:{ Exception -> 0x0028 }
            long r6 = r12.f37634a     // Catch:{ Exception -> 0x0028 }
            long r4 = r4 - r6
            int r6 = r14.f37646c     // Catch:{ Exception -> 0x0028 }
            android.view.MotionEvent r2 = r14.f37644a     // Catch:{ Exception -> 0x0028 }
            int r7 = r2.getActionIndex()     // Catch:{ Exception -> 0x0028 }
            int r8 = r2.getToolType(r7)     // Catch:{ Exception -> 0x0028 }
            r2 = r10
            r7 = r1
            r2.<init>(r3, r4, r6, r7, r8)     // Catch:{ Exception -> 0x0028 }
            java.util.ArrayList<K6.i> r1 = r12.f37639f     // Catch:{ Exception -> 0x0028 }
            r1.add(r10)     // Catch:{ Exception -> 0x0028 }
            int r1 = r12.f37636c     // Catch:{ Exception -> 0x0028 }
            int r1 = r1 + r0
            r12.f37636c = r1     // Catch:{ Exception -> 0x0028 }
        L_0x008c:
            int r1 = r12.f37635b     // Catch:{ Exception -> 0x0028 }
            if (r1 < r9) goto L_0x00b8
            int r1 = r12.f37636c     // Catch:{ Exception -> 0x0028 }
            if (r1 < r9) goto L_0x00b8
            java.util.concurrent.Future<android.util.Pair<java.lang.String, java.lang.Long>> r1 = r12.f37640g     // Catch:{ Exception -> 0x0028 }
            if (r1 == 0) goto L_0x00a6
            boolean r1 = r1.isCancelled()     // Catch:{ Exception -> 0x0028 }
            if (r1 != 0) goto L_0x00a6
            java.util.concurrent.Future<android.util.Pair<java.lang.String, java.lang.Long>> r1 = r12.f37640g     // Catch:{ Exception -> 0x0028 }
            boolean r1 = r1.isDone()     // Catch:{ Exception -> 0x0028 }
            if (r1 == 0) goto L_0x00b8
        L_0x00a6:
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newFixedThreadPool(r0)     // Catch:{ Exception -> 0x0028 }
            K6.c$a r2 = new K6.c$a     // Catch:{ Exception -> 0x0028 }
            r2.<init>()     // Catch:{ Exception -> 0x0028 }
            java.util.concurrent.Future r2 = r1.submit(r2)     // Catch:{ Exception -> 0x0028 }
            r12.f37640g = r2     // Catch:{ Exception -> 0x0028 }
            r1.shutdown()     // Catch:{ Exception -> 0x0028 }
        L_0x00b8:
            android.view.MotionEvent r14 = r14.f37644a     // Catch:{ Exception -> 0x0028 }
            long r1 = r14.getEventTime()     // Catch:{ Exception -> 0x0028 }
            r12.f37634a = r1     // Catch:{ Exception -> 0x0028 }
        L_0x00c0:
            return
        L_0x00c1:
            java.lang.String r1 = "Exception in processing touch event"
            java.lang.Throwable[] r0 = new java.lang.Throwable[r0]
            r0[r13] = r14
            java.lang.String r13 = "TouchManager"
            K6.C6595p.d(r13, r1, r0)
            K6.y.a(r14)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.C6582c.update(java.util.Observable, java.lang.Object):void");
    }
}
