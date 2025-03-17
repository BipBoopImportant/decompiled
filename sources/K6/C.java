package K6;

import android.app.Application;
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

public final class C implements Observer {

    /* renamed from: a  reason: collision with root package name */
    B f37546a;

    /* renamed from: b  reason: collision with root package name */
    boolean f37547b;

    /* renamed from: c  reason: collision with root package name */
    long f37548c;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<D> f37549d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    Future<C6596q<Pair<String, String>, Long, Long>> f37550e;

    /* renamed from: f  reason: collision with root package name */
    AtomicBoolean f37551f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    ArrayList<Pair<Integer, Long>> f37552g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    boolean f37553h;

    /* renamed from: i  reason: collision with root package name */
    private C6585f f37554i;

    class a implements Callable<C6596q<Pair<String, String>, Long, Long>> {
        a() {
        }

        public final /* synthetic */ Object call() {
            return C.this.f();
        }
    }

    public C(Application application, C6585f fVar) {
        C6595p.c("MotionManager", "Initializing motion manager", new Throwable[0]);
        this.f37548c = SystemClock.uptimeMillis();
        this.f37546a = new B(application);
        this.f37554i = fVar;
    }

    /* JADX WARNING: type inference failed for: r22v0, types: [boolean] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d4, code lost:
        r4 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d8, code lost:
        r0 = e;
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x026a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x026b, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0271, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0272, code lost:
        r4 = r1;
        r17 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0276, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0277, code lost:
        r4 = r1;
        r17 = "";
        r16 = 0L;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d3 A[Catch:{ Exception -> 0x00d8, all -> 0x00d3 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:17:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x026a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x002d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public K6.C6596q<android.util.Pair<java.lang.String, java.lang.String>, java.lang.Long, java.lang.Long> f() {
        /*
            r30 = this;
            r1 = r30
            r2 = 0
            java.lang.String r3 = "MotionManager"
            java.lang.String r0 = ":"
            java.util.ArrayList<K6.D> r4 = r1.f37549d
            int r4 = r4.size()
            java.lang.String r5 = ""
            r6 = 0
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            r9 = 1
            if (r4 > r9) goto L_0x0023
            K6.q r0 = new K6.q
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r5, r5)
            r0.<init>(r2, r8, r8)
            return r0
        L_0x0023:
            java.util.concurrent.atomic.AtomicBoolean r4 = r1.f37551f
            boolean r4 = r4.compareAndSet(r2, r9)
            if (r4 != 0) goto L_0x002d
            r0 = 0
            return r0
        L_0x002d:
            long r10 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0276, all -> 0x026a }
            java.util.ArrayList<K6.D> r4 = r1.f37549d     // Catch:{ Exception -> 0x0276, all -> 0x026a }
            int r4 = r4.size()     // Catch:{ Exception -> 0x0276, all -> 0x026a }
            long r12 = (long) r4     // Catch:{ Exception -> 0x0276, all -> 0x026a }
            long r12 = K6.C6594o.c(r12)     // Catch:{ Exception -> 0x0276, all -> 0x026a }
            int r4 = (int) r12     // Catch:{ Exception -> 0x0276, all -> 0x026a }
            float[] r12 = new float[r4]     // Catch:{ Exception -> 0x0276, all -> 0x026a }
            float[] r13 = new float[r4]     // Catch:{ Exception -> 0x0276, all -> 0x026a }
            float[] r14 = new float[r4]     // Catch:{ Exception -> 0x0276, all -> 0x026a }
            float[] r15 = new float[r4]     // Catch:{ Exception -> 0x0276, all -> 0x026a }
            float[] r2 = new float[r4]     // Catch:{ Exception -> 0x0276, all -> 0x026a }
            float[] r9 = new float[r4]     // Catch:{ Exception -> 0x0276, all -> 0x026a }
            float[] r6 = new float[r4]     // Catch:{ Exception -> 0x0276, all -> 0x026a }
            float[] r7 = new float[r4]     // Catch:{ Exception -> 0x0276, all -> 0x026a }
            r16 = r8
            float[] r8 = new float[r4]     // Catch:{ Exception -> 0x0271, all -> 0x026a }
            r17 = r5
            float[] r5 = new float[r4]     // Catch:{ Exception -> 0x026d, all -> 0x026a }
            r18 = r10
            long r10 = r1.f37548c     // Catch:{ Exception -> 0x026d, all -> 0x026a }
            r20 = r10
            java.util.ArrayList<K6.D> r10 = r1.f37549d     // Catch:{ Exception -> 0x026d, all -> 0x026a }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x026d, all -> 0x026a }
            r11 = 0
        L_0x0062:
            boolean r22 = r10.hasNext()     // Catch:{ Exception -> 0x026d, all -> 0x026a }
            if (r22 == 0) goto L_0x0117
            java.lang.Object r22 = r10.next()     // Catch:{ Exception -> 0x0113, all -> 0x00d3 }
            r23 = r10
            r10 = r22
            K6.D r10 = (K6.D) r10     // Catch:{ Exception -> 0x0113, all -> 0x00d3 }
            r22 = r3
            float r3 = r10.f37559d     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r12[r11] = r3     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            float r3 = r10.f37560e     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r13[r11] = r3     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            float r3 = r10.f37561f     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r14[r11] = r3     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            float r3 = r10.f37556a     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r15[r11] = r3     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            float r3 = r10.f37557b     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r2[r11] = r3     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            float r3 = r10.f37558c     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r9[r11] = r3     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            float r3 = r10.f37562g     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r6[r11] = r3     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            float r3 = r10.f37563h     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r7[r11] = r3     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            float r3 = r10.f37564i     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r8[r11] = r3     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r24 = r4
            long r3 = r10.f37565j     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r3 = r3 - r20
            r25 = r7
            r26 = r8
            r7 = 0
            long r3 = java.lang.Math.max(r7, r3)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            boolean r7 = r10.f37567l     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            if (r7 == 0) goto L_0x00df
            if (r11 == 0) goto L_0x00df
            long r3 = r10.f37568m     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r7 = 0
            long r3 = java.lang.Math.max(r7, r3)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.util.ArrayList<android.util.Pair<java.lang.Integer, java.lang.Long>> r7 = r1.f37552g     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            android.util.Pair r8 = new android.util.Pair     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r27 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r29 = r0
            long r0 = r10.f37565j     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r0 = r0 - r20
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r8.<init>(r3, r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r7.add(r8)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r3 = r27
            goto L_0x00e1
        L_0x00d3:
            r0 = move-exception
            r4 = r30
            goto L_0x029f
        L_0x00d8:
            r0 = move-exception
        L_0x00d9:
            r4 = r30
        L_0x00db:
            r5 = r22
            goto L_0x027d
        L_0x00df:
            r29 = r0
        L_0x00e1:
            float r0 = (float) r3     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r5[r11] = r0     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r0 = r12[r11]     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r0 = r13[r11]     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r0 = r14[r11]     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r0 = r15[r11]     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r0 = r2[r11]     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r0 = r9[r11]     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r0 = r6[r11]     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r0 = r25[r11]     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r0 = r26[r11]     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r0 = r10.f37565j     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r3 = 1
            int r11 = r11 + r3
            r3 = r24
            if (r11 < r3) goto L_0x0102
            goto L_0x0120
        L_0x0102:
            r20 = r0
            r4 = r3
            r3 = r22
            r10 = r23
            r7 = r25
            r8 = r26
            r0 = r29
            r1 = r30
            goto L_0x0062
        L_0x0113:
            r0 = move-exception
            r22 = r3
            goto L_0x00d9
        L_0x0117:
            r29 = r0
            r22 = r3
            r3 = r4
            r25 = r7
            r26 = r8
        L_0x0120:
            r0 = 1058642330(0x3f19999a, float:0.6)
            android.util.Pair r1 = K6.C6591l.c(r12, r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            android.util.Pair r4 = K6.C6591l.c(r13, r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            android.util.Pair r7 = K6.C6591l.c(r14, r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            android.util.Pair r8 = K6.C6591l.c(r15, r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            android.util.Pair r2 = K6.C6591l.c(r2, r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            android.util.Pair r9 = K6.C6591l.c(r9, r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            android.util.Pair r6 = K6.C6591l.c(r6, r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r10 = r25
            android.util.Pair r10 = K6.C6591l.c(r10, r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11 = r26
            android.util.Pair r0 = K6.C6591l.c(r11, r0)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11 = 0
            android.util.Pair r5 = K6.C6591l.c(r5, r11)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11.<init>()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Object r12 = r1.first     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11.append(r12)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r12 = r29
            r11.append(r12)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Object r13 = r4.first     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11.append(r13)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11.append(r12)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Object r13 = r7.first     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11.append(r13)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11.append(r12)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Object r13 = r8.first     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11.append(r13)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11.append(r12)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Object r13 = r2.first     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11.append(r13)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11.append(r12)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Object r13 = r9.first     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11.append(r13)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11.append(r12)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Object r13 = r6.first     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11.append(r13)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11.append(r12)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Object r13 = r10.first     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11.append(r13)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11.append(r12)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Object r12 = r0.first     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r11.append(r12)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            android.util.Pair r12 = new android.util.Pair     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Object r5 = r5.first     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r12.<init>(r11, r5)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Object r1 = r1.second     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r13 = r1.longValue()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Object r1 = r4.second     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r4 = r1.longValue()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r13 = r13 + r4
            java.lang.Object r1 = r7.second     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r4 = r1.longValue()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r13 = r13 + r4
            java.lang.Object r1 = r8.second     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r4 = r1.longValue()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r13 = r13 + r4
            java.lang.Object r1 = r2.second     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r13 = r13 + r1
            java.lang.Object r1 = r9.second     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r13 = r13 + r1
            java.lang.Object r1 = r6.second     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r13 = r13 + r1
            java.lang.Object r1 = r10.second     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r13 = r13 + r1
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r13 = r13 + r0
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            long r0 = r0 - r18
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.String r4 = "Motion Event Count: "
            r2.<init>(r4)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r2.append(r3)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            java.lang.String r4 = "/"
            r2.append(r4)     // Catch:{ Exception -> 0x00d8, all -> 0x00d3 }
            r4 = r30
            java.util.ArrayList<K6.D> r5 = r4.f37549d     // Catch:{ Exception -> 0x0267 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x0267 }
            r2.append(r5)     // Catch:{ Exception -> 0x0267 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0267 }
            r5 = 0
            java.lang.Throwable[] r6 = new java.lang.Throwable[r5]     // Catch:{ Exception -> 0x0267 }
            r5 = r22
            K6.C6595p.c(r5, r2, r6)     // Catch:{ Exception -> 0x0265 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0265 }
            java.lang.String r6 = "Motion SDCalc-Time: "
            r2.<init>(r6)     // Catch:{ Exception -> 0x0265 }
            r2.append(r0)     // Catch:{ Exception -> 0x0265 }
            java.lang.String r0 = "ms"
            r2.append(r0)     // Catch:{ Exception -> 0x0265 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0265 }
            r1 = 0
            java.lang.Throwable[] r2 = new java.lang.Throwable[r1]     // Catch:{ Exception -> 0x0265 }
            K6.C6595p.c(r5, r0, r2)     // Catch:{ Exception -> 0x0265 }
            K6.q r0 = new K6.q     // Catch:{ Exception -> 0x0265 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x0265 }
            long r2 = (long) r3     // Catch:{ Exception -> 0x0265 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x0265 }
            r0.<init>(r12, r1, r2)     // Catch:{ Exception -> 0x0265 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f37551f
            r2 = 0
            r1.set(r2)
            return r0
        L_0x0263:
            r0 = move-exception
            goto L_0x029f
        L_0x0265:
            r0 = move-exception
            goto L_0x027d
        L_0x0267:
            r0 = move-exception
            goto L_0x00db
        L_0x026a:
            r0 = move-exception
            r4 = r1
            goto L_0x029f
        L_0x026d:
            r0 = move-exception
            r4 = r1
        L_0x026f:
            r5 = r3
            goto L_0x027d
        L_0x0271:
            r0 = move-exception
            r4 = r1
            r17 = r5
            goto L_0x026f
        L_0x0276:
            r0 = move-exception
            r4 = r1
            r17 = r5
            r16 = r8
            goto L_0x026f
        L_0x027d:
            java.lang.String r1 = "Exception in getting motion events"
            r2 = 1
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x0263 }
            r3 = 0
            r2[r3] = r0     // Catch:{ all -> 0x0263 }
            K6.C6595p.d(r5, r1, r2)     // Catch:{ all -> 0x0263 }
            K6.y.a(r0)     // Catch:{ all -> 0x0263 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.f37551f
            r0.set(r3)
            K6.q r0 = new K6.q
            android.util.Pair r1 = new android.util.Pair
            r2 = r17
            r1.<init>(r2, r2)
            r2 = r16
            r0.<init>(r1, r2, r2)
            return r0
        L_0x029f:
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.f37551f
            r2 = 0
            r1.set(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.C.f():K6.q");
    }

    public final void b() {
        this.f37546a.a();
        this.f37546a.deleteObservers();
    }

    public final long c() {
        return (long) this.f37549d.size();
    }

    public final String d() {
        try {
            StringBuilder sb2 = new StringBuilder();
            Iterator<Pair<Integer, Long>> it = this.f37552g.iterator();
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
            C6595p.e("MotionManager", "Exception in getBackgroundEvent", e10);
            y.a(e10);
            return "";
        }
    }

    public final C6596q<Pair<String, String>, Long, Long> e() {
        Future<C6596q<Pair<String, String>, Long, Long>> future;
        C6596q<Pair<String, String>, Long, Long> qVar = new C6596q<>(new Pair("", ""), 0L, 0L);
        try {
            Future<C6596q<Pair<String, String>, Long, Long>> future2 = this.f37550e;
            if (future2 != null) {
                try {
                    qVar = future2.get();
                } catch (InterruptedException e10) {
                    C6595p.d("MotionManager", "Failed to get motion data: " + e10.getMessage(), new Throwable[0]);
                } catch (ExecutionException e11) {
                    C6595p.d("MotionManager", "Failed to get motion data: " + e11.getMessage(), new Throwable[0]);
                }
            }
            if (qVar != null) {
                return qVar;
            }
            b();
            qVar = f();
            if (qVar != null || (future = this.f37550e) == null) {
                return qVar;
            }
            try {
                return future.get();
            } catch (InterruptedException e12) {
                C6595p.d("MotionManager", "Failed to get motion data: " + e12.getMessage(), new Throwable[0]);
                return qVar;
            } catch (ExecutionException e13) {
                C6595p.d("MotionManager", "Failed to get motion data: " + e13.getMessage(), new Throwable[0]);
                return qVar;
            }
        } catch (Exception e14) {
            C6595p.e("MotionManager", "Exception in MotionManager", e14);
            y.a(e14);
            return qVar;
        }
    }

    public final void update(Observable observable, Object obj) {
        if (obj != null) {
            try {
                if (this.f37549d.size() >= 128) {
                    b();
                    Future<C6596q<Pair<String, String>, Long, Long>> future = this.f37550e;
                    if (future != null && !future.isCancelled()) {
                        if (!this.f37550e.isDone()) {
                            return;
                        }
                    }
                    ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);
                    this.f37550e = newFixedThreadPool.submit(new a());
                    newFixedThreadPool.shutdown();
                    return;
                }
                if (this.f37549d.size() >= 32 && !this.f37553h) {
                    this.f37553h = true;
                    this.f37554i.a();
                }
                this.f37549d.add((D) obj);
            } catch (Exception e10) {
                C6595p.d("MotionManager", "Exception in processing motion event", e10);
                y.a(e10);
            }
        }
    }
}
