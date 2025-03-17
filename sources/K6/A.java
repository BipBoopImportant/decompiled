package K6;

import K6.C6580a;
import android.app.Application;
import android.hardware.Sensor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import org.slf4j.Marker;

public final class A implements C6585f {

    /* renamed from: o  reason: collision with root package name */
    private static final ArrayList<Integer> f37503o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    private static boolean f37504p = false;

    /* renamed from: q  reason: collision with root package name */
    private static boolean f37505q = false;

    /* renamed from: r  reason: collision with root package name */
    private static boolean f37506r = false;

    /* renamed from: a  reason: collision with root package name */
    public U f37507a = null;

    /* renamed from: b  reason: collision with root package name */
    public C f37508b = null;

    /* renamed from: c  reason: collision with root package name */
    public H f37509c = null;

    /* renamed from: d  reason: collision with root package name */
    public C6582c f37510d = null;

    /* renamed from: e  reason: collision with root package name */
    private C6598t f37511e = null;

    /* renamed from: f  reason: collision with root package name */
    public w f37512f = null;

    /* renamed from: g  reason: collision with root package name */
    private S f37513g = null;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public AtomicBoolean f37514h = new AtomicBoolean(false);

    /* renamed from: i  reason: collision with root package name */
    private Handler f37515i = null;

    /* renamed from: j  reason: collision with root package name */
    private int f37516j;

    /* renamed from: k  reason: collision with root package name */
    private Date f37517k = null;

    /* renamed from: l  reason: collision with root package name */
    private boolean f37518l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f37519m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f37520n = true;

    class a extends TimerTask {
        a() {
        }

        public final void run() {
            A.this.b();
            A.this.f37514h.compareAndSet(true, false);
        }
    }

    class b implements Runnable {
        b() {
        }

        public final void run() {
            if (com.cyberfend.cyfsecurity.a.l()) {
                A.this.r();
                A.this.o();
                A.this.q();
                A.this.m();
            }
        }
    }

    private void h(String str) {
        C6580a.C0597a aVar = com.cyberfend.cyfsecurity.a.f47786e;
        if (aVar != null && !this.f37519m) {
            this.f37519m = true;
            aVar.a(str);
        }
    }

    public static synchronized boolean i(Window window) {
        synchronized (A.class) {
            int hashCode = window.hashCode();
            int i10 = 0;
            while (true) {
                ArrayList<Integer> arrayList = f37503o;
                if (i10 >= arrayList.size()) {
                    arrayList.add(Integer.valueOf(hashCode));
                    return false;
                } else if (hashCode == arrayList.get(i10).intValue()) {
                    return true;
                } else {
                    i10++;
                }
            }
        }
    }

    private synchronized void k(Application application, String str, String str2) {
        if (application != null) {
            try {
                if (this.f37512f != null) {
                    this.f37517k = new Date();
                    w wVar = this.f37512f;
                    try {
                        wVar.f37724b = application;
                        wVar.f37726d = str;
                        wVar.f37727e = str2;
                        wVar.a();
                    } catch (Exception e10) {
                        y.a(e10);
                    }
                }
            } catch (Exception e11) {
                y.a(e11);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0500  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x056c A[Catch:{ Exception -> 0x059d }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x05a5 A[Catch:{ Exception -> 0x059d }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x05df A[Catch:{ Exception -> 0x05f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x060e A[Catch:{ Exception -> 0x05f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01cd A[Catch:{ Exception -> 0x01ca }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x049b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String u() {
        /*
            r46 = this;
            r1 = r46
            java.lang.String r0 = "dm_unr"
            java.lang.String r2 = "do_unr"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Building sensor data: "
            r3.<init>(r4)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            java.lang.Throwable[] r5 = new java.lang.Throwable[r4]
            java.lang.String r6 = "CYFManager"
            K6.C6595p.c(r6, r3, r5)
            long r7 = android.os.SystemClock.uptimeMillis()
            java.lang.String r3 = K6.x.f37735c
            java.lang.String r5 = "default_performance"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0034
            java.lang.String r3 = K6.I.a()
            K6.x.f37735c = r3
        L_0x0034:
            android.os.Handler r3 = r1.f37515i
            if (r3 != 0) goto L_0x0049
            android.os.Looper r3 = android.os.Looper.myLooper()
            if (r3 != 0) goto L_0x0042
            android.os.Looper r3 = android.os.Looper.getMainLooper()
        L_0x0042:
            android.os.Handler r5 = new android.os.Handler
            r5.<init>(r3)
            r1.f37515i = r5
        L_0x0049:
            K6.a$a r3 = com.cyberfend.cyfsecurity.a.f47786e
            if (r3 == 0) goto L_0x0050
            java.lang.String r3 = "1"
            goto L_0x0052
        L_0x0050:
            java.lang.String r3 = "0"
        L_0x0052:
            K6.C r5 = r1.f37508b
            long r9 = r5.c()
            r11 = 32
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            java.lang.String r9 = "$"
            r10 = 1
            java.lang.String r13 = ""
            if (r5 >= 0) goto L_0x00d4
            K6.H r5 = r1.f37509c
            long r14 = r5.c()
            int r5 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r5 >= 0) goto L_0x00d4
            K6.h r5 = K6.C6587h.a()
            java.lang.String r5 = r5.f37689b
            if (r5 == 0) goto L_0x00d4
            K6.h r0 = K6.C6587h.a()
            java.lang.String r0 = r0.f37689b
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.f37514h
            boolean r2 = r2.compareAndSet(r4, r10)
            if (r2 == 0) goto L_0x0099
            java.lang.String r2 = "Refresh Sensor data"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r4]
            K6.C6595p.e(r6, r2, r3)
            java.util.Timer r2 = new java.util.Timer
            r2.<init>()
            K6.A$a r3 = new K6.A$a
            r3.<init>()
            r4 = 5000(0x1388, double:2.4703E-320)
            r2.schedule(r3, r4)
        L_0x0099:
            K6.w r2 = r1.f37512f
            if (r2 == 0) goto L_0x00a2
            java.lang.String r2 = r2.f37727e
            if (r2 == 0) goto L_0x00a2
            r13 = r2
        L_0x00a2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r9)
            K6.g r0 = K6.C6586g.q()
            java.lang.String r0 = r0.r()
            r2.append(r0)
            r2.append(r9)
            K6.e r0 = K6.C6584e.s()
            java.lang.String r0 = r0.u()
            r2.append(r0)
            r2.append(r9)
            r2.append(r13)
            java.lang.String r0 = r2.toString()
            r46.v()
            return r0
        L_0x00d4:
            K6.S r5 = r1.f37513g
            java.lang.String r14 = ","
            if (r5 == 0) goto L_0x0107
            java.lang.String r15 = r5.f37609c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r5.f37610d
            r10.append(r11)
            r10.append(r14)
            java.lang.String r11 = r5.f37611e
            r10.append(r11)
            r10.append(r14)
            java.lang.String r11 = r5.f37612f
            r10.append(r11)
            r10.append(r14)
            java.lang.String r5 = r5.f37613g
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            java.lang.String r10 = K6.S.a()
            goto L_0x010b
        L_0x0107:
            java.lang.String r15 = "-1"
            r10 = r13
            r5 = r15
        L_0x010b:
            int r11 = K6.P.a(r15)
            java.util.Random r12 = new java.util.Random
            r12.<init>()
            int r12 = r12.nextInt()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            long r16 = K6.C6599u.f37709a
            r18 = 2
            long r16 = r16 / r18
            java.lang.String r4 = java.lang.String.valueOf(r16)
            r16 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            r0.append(r14)
            r0.append(r11)
            r0.append(r14)
            r0.append(r12)
            r0.append(r14)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            K6.H r4 = r1.f37509c
            K6.q r4 = r4.e()
            K6.C r11 = r1.f37508b
            K6.q r11 = r11.e()
            K6.H r12 = r1.f37509c
            java.lang.String r12 = r12.d()
            K6.C r15 = r1.f37508b
            java.lang.String r15 = r15.d()
            r17 = r2
            android.util.Pair r2 = new android.util.Pair
            r20 = r5
            r19 = r6
            r5 = 0
            r21 = r9
            java.lang.Long r9 = java.lang.Long.valueOf(r5)
            r2.<init>(r13, r9)
            K6.c r9 = r1.f37510d
            if (r9 == 0) goto L_0x0179
            android.util.Pair r2 = r9.a()
        L_0x0179:
            android.util.Pair r9 = new android.util.Pair
            r22 = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r9.<init>(r13, r3)
            K6.U r3 = r1.f37507a
            if (r3 == 0) goto L_0x018c
            android.util.Pair r9 = r3.b()
        L_0x018c:
            java.lang.Object r3 = r9.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r2.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = K6.x.f37733a
            r23 = r15
            K6.t r15 = r1.f37511e
            if (r15 == 0) goto L_0x01a3
            java.lang.String r15 = r15.a()
            r24 = r12
            goto L_0x01a6
        L_0x01a3:
            r24 = r12
            r15 = r13
        L_0x01a6:
            K6.H r12 = r1.f37509c     // Catch:{ Exception -> 0x01bd }
            r25 = r5
            K6.G r5 = r12.f37597a     // Catch:{ Exception -> 0x01b0 }
            boolean r5 = r5.f37592k     // Catch:{ Exception -> 0x01b0 }
            if (r5 == 0) goto L_0x01b3
        L_0x01b0:
            r5 = r17
            goto L_0x01c0
        L_0x01b3:
            boolean r5 = r12.f37598b     // Catch:{ Exception -> 0x01b0 }
            if (r5 != 0) goto L_0x01ba
            java.lang.String r5 = "do_dis"
            goto L_0x01c0
        L_0x01ba:
            java.lang.String r5 = "do_en"
            goto L_0x01c0
        L_0x01bd:
            r25 = r5
            goto L_0x01b0
        L_0x01c0:
            K6.C r12 = r1.f37508b     // Catch:{ Exception -> 0x01d7 }
            r17 = r3
            K6.B r3 = r12.f37546a     // Catch:{ Exception -> 0x01ca }
            boolean r3 = r3.f37532j     // Catch:{ Exception -> 0x01ca }
            if (r3 == 0) goto L_0x01cd
        L_0x01ca:
            r3 = r16
            goto L_0x01da
        L_0x01cd:
            boolean r3 = r12.f37547b     // Catch:{ Exception -> 0x01ca }
            if (r3 != 0) goto L_0x01d4
            java.lang.String r3 = "dm_dis"
            goto L_0x01da
        L_0x01d4:
            java.lang.String r3 = "dm_en"
            goto L_0x01da
        L_0x01d7:
            r17 = r3
            goto L_0x01ca
        L_0x01da:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            r12.append(r14)
            r12.append(r3)
            r12.append(r14)
            java.lang.String r3 = "t_en"
            r12.append(r3)
            java.lang.String r3 = r12.toString()
            long r26 = android.os.SystemClock.uptimeMillis()
            long r26 = r26 - r7
            r28 = 1000(0x3e8, double:4.94E-321)
            r30 = r7
            long r7 = r26 * r28
            android.os.Looper r5 = android.os.Looper.myLooper()
            android.os.Looper r12 = android.os.Looper.getMainLooper()
            if (r5 == r12) goto L_0x020c
            r5 = 1
            goto L_0x020d
        L_0x020c:
            r5 = 0
        L_0x020d:
            boolean r12 = K6.C6581b.c()
            r16 = r10
            java.lang.Object r10 = r9.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r26 = r10.longValue()
            java.lang.Object r10 = r2.second
            java.lang.Long r10 = (java.lang.Long) r10
            long r32 = r10.longValue()
            long r26 = r26 + r32
            B r10 = r4.f37703b
            java.lang.Long r10 = (java.lang.Long) r10
            long r32 = r10.longValue()
            long r26 = r26 + r32
            B r10 = r11.f37703b
            java.lang.Long r10 = (java.lang.Long) r10
            long r32 = r10.longValue()
            r34 = r12
            r10 = r13
            long r12 = r26 + r32
            long r26 = java.lang.System.currentTimeMillis()
            long r32 = K6.C6599u.f37709a
            r36 = r5
            r35 = r6
            long r5 = r26 - r32
            r26 = r15
            K6.U r15 = r1.f37507a
            r32 = r7
            if (r15 == 0) goto L_0x0253
            long r7 = r15.f37623f
            goto L_0x0255
        L_0x0253:
            r7 = 0
        L_0x0255:
            K6.c r15 = r1.f37510d
            r27 = r0
            if (r15 == 0) goto L_0x025e
            long r0 = r15.f37637d
            goto L_0x0260
        L_0x025e:
            r0 = 0
        L_0x0260:
            int r15 = (int) r12
            long r37 = r7 + r0
            r39 = r3
            C r3 = r4.f37704c
            java.lang.Long r3 = (java.lang.Long) r3
            long r40 = r3.longValue()
            long r37 = r37 + r40
            C r3 = r11.f37704c
            java.lang.Long r3 = (java.lang.Long) r3
            long r40 = r3.longValue()
            r42 = r0
            long r0 = r37 + r40
            int r0 = (int) r0
            int r1 = (int) r5
            r37 = r7
            long r7 = (long) r15
            r3 = 32
            long r7 = r7 << r3
            r40 = r5
            long r5 = (long) r0
            r44 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r44
            long r5 = r5 | r7
            long r0 = K6.C6589j.a(r5, r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Object r5 = r9.second
            r3.append(r5)
            r3.append(r14)
            java.lang.Object r2 = r2.second
            r3.append(r2)
            r3.append(r14)
            B r2 = r4.f37703b
            r3.append(r2)
            r3.append(r14)
            B r2 = r11.f37703b
            r3.append(r2)
            r3.append(r14)
            r3.append(r12)
            r3.append(r14)
            r5 = r40
            r3.append(r5)
            r3.append(r14)
            r7 = r37
            r3.append(r7)
            r3.append(r14)
            r5 = r42
            r3.append(r5)
            r3.append(r14)
            C r2 = r4.f37704c
            r3.append(r2)
            r3.append(r14)
            C r2 = r11.f37704c
            r3.append(r2)
            r3.append(r14)
            long r5 = K6.C6599u.f37714f
            long r5 = r5 * r28
            r3.append(r5)
            r3.append(r14)
            r5 = r32
            r3.append(r5)
            r3.append(r14)
            int r2 = K6.C6599u.f37715g
            r3.append(r2)
            r3.append(r14)
            r3.append(r0)
            r3.append(r14)
            long r0 = K6.C6599u.f37709a
            r3.append(r0)
            r3.append(r14)
            int r0 = r46.t()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = r36
            r1.append(r2)
            r1.append(r14)
            r2 = r34
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            A r2 = r4.f37702a
            r3 = r2
            android.util.Pair r3 = (android.util.Pair) r3
            java.lang.Object r3 = r3.first
            java.lang.String r3 = (java.lang.String) r3
            android.util.Pair r2 = (android.util.Pair) r2
            java.lang.Object r2 = r2.second
            java.lang.String r2 = (java.lang.String) r2
            A r5 = r11.f37702a
            r6 = r5
            android.util.Pair r6 = (android.util.Pair) r6
            java.lang.Object r6 = r6.first
            java.lang.String r6 = (java.lang.String) r6
            android.util.Pair r5 = (android.util.Pair) r5
            java.lang.Object r5 = r5.second
            java.lang.String r5 = (java.lang.String) r5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            android.util.Pair r8 = new android.util.Pair
            java.lang.String r9 = "3.3.8-rc2"
            r8.<init>(r10, r9)
            r7.add(r8)
            r8 = r46
            K6.w r9 = r8.f37512f
            if (r9 == 0) goto L_0x0377
            java.lang.String r9 = r9.d()
            if (r9 == 0) goto L_0x0377
            android.util.Pair r9 = new android.util.Pair
            K6.w r12 = r8.f37512f
            java.lang.String r12 = r12.d()
            java.lang.String r13 = "-90"
            r9.<init>(r13, r12)
            r7.add(r9)
        L_0x0377:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            android.util.Pair r12 = new android.util.Pair
            java.lang.String r13 = "-70"
            r12.<init>(r13, r10)
            r9.put(r13, r12)
            android.util.Pair r12 = new android.util.Pair
            java.lang.String r13 = "-80"
            r12.<init>(r13, r10)
            r9.put(r13, r12)
            android.util.Pair r12 = new android.util.Pair
            java.lang.String r13 = "-121"
            r12.<init>(r13, r10)
            r9.put(r13, r12)
            android.util.Pair r12 = new android.util.Pair
            java.lang.String r13 = "-100"
            r14 = r27
            r12.<init>(r13, r14)
            r9.put(r13, r12)
            android.util.Pair r12 = new android.util.Pair
            java.lang.String r13 = "-101"
            r14 = r39
            r12.<init>(r13, r14)
            r9.put(r13, r12)
            android.util.Pair r12 = new android.util.Pair
            java.lang.String r13 = "-102"
            r14 = r35
            r12.<init>(r13, r14)
            r9.put(r13, r12)
            android.util.Pair r12 = new android.util.Pair
            java.lang.String r13 = "-103"
            r15 = r26
            r12.<init>(r13, r15)
            r9.put(r13, r12)
            android.util.Pair r12 = new android.util.Pair
            java.lang.String r13 = "-104"
            r14 = r16
            r12.<init>(r13, r14)
            r9.put(r13, r12)
            android.util.Pair r12 = new android.util.Pair
            java.lang.String r13 = "-108"
            r14 = r17
            r12.<init>(r13, r14)
            r9.put(r13, r12)
            android.util.Pair r12 = new android.util.Pair
            java.lang.String r13 = "-112"
            java.lang.String r14 = K6.x.f37735c
            r12.<init>(r13, r14)
            java.lang.String r13 = "-112"
            r9.put(r13, r12)
            android.util.Pair r12 = new android.util.Pair
            java.lang.String r13 = "-115"
            r12.<init>(r13, r0)
            java.lang.String r0 = "-115"
            r9.put(r0, r12)
            android.util.Pair r0 = new android.util.Pair
            java.lang.String r12 = "-117"
            r13 = r25
            r0.<init>(r12, r13)
            java.lang.String r12 = "-117"
            r9.put(r12, r0)
            android.util.Pair r0 = new android.util.Pair
            java.lang.String r12 = "-120"
            java.lang.String r13 = K6.x.f37734b
            r0.<init>(r12, r13)
            java.lang.String r12 = "-120"
            r9.put(r12, r0)
            android.util.Pair r0 = new android.util.Pair
            java.lang.String r12 = "-144"
            r0.<init>(r12, r2)
            java.lang.String r2 = "-144"
            r9.put(r2, r0)
            android.util.Pair r0 = new android.util.Pair
            java.lang.String r2 = "-160"
            r12 = r24
            r0.<init>(r2, r12)
            java.lang.String r2 = "-160"
            r9.put(r2, r0)
            android.util.Pair r0 = new android.util.Pair
            java.lang.String r2 = "-142"
            r0.<init>(r2, r3)
            java.lang.String r2 = "-142"
            r9.put(r2, r0)
            android.util.Pair r0 = new android.util.Pair
            java.lang.String r2 = "-145"
            r0.<init>(r2, r5)
            java.lang.String r2 = "-145"
            r9.put(r2, r0)
            android.util.Pair r0 = new android.util.Pair
            java.lang.String r2 = "-161"
            r3 = r23
            r0.<init>(r2, r3)
            java.lang.String r2 = "-161"
            r9.put(r2, r0)
            android.util.Pair r0 = new android.util.Pair
            java.lang.String r2 = "-143"
            r0.<init>(r2, r6)
            java.lang.String r2 = "-143"
            r9.put(r2, r0)
            android.util.Pair r0 = new android.util.Pair
            java.lang.String r2 = "-150"
            r0.<init>(r2, r1)
            java.lang.String r1 = "-150"
            r9.put(r1, r0)
            android.util.Pair r0 = new android.util.Pair
            java.lang.String r1 = "-163"
            r15 = r20
            r0.<init>(r1, r15)
            java.lang.String r1 = "-163"
            r9.put(r1, r0)
            android.util.Pair r0 = new android.util.Pair
            java.lang.String r1 = "-240"
            r3 = r22
            r0.<init>(r1, r3)
            java.lang.String r1 = "-240"
            r9.put(r1, r0)
            K6.w r0 = r8.f37512f
            r1 = 0
            if (r0 == 0) goto L_0x0498
            K6.v r0 = r0.f37725c
            java.lang.String[] r0 = r0.f37717a
            if (r0 == 0) goto L_0x0498
            goto L_0x0499
        L_0x0498:
            r0 = r1
        L_0x0499:
            if (r0 == 0) goto L_0x04b7
            int r2 = r0.length
            r3 = 0
        L_0x049d:
            if (r3 >= r2) goto L_0x04cf
            r5 = r0[r3]
            boolean r6 = r9.containsKey(r5)
            if (r6 == 0) goto L_0x04b4
            java.lang.Object r6 = r9.get(r5)
            if (r6 == 0) goto L_0x04b4
            java.lang.Object r5 = r9.get(r5)
            r7.add(r5)
        L_0x04b4:
            int r3 = r3 + 1
            goto L_0x049d
        L_0x04b7:
            java.util.Collection r0 = r9.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x04bf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x04cf
            java.lang.Object r2 = r0.next()
            android.util.Pair r2 = (android.util.Pair) r2
            r7.add(r2)
            goto L_0x04bf
        L_0x04cf:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r30
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "Plain-BuildSensorData-Time: "
            r0.<init>(r5)
            r0.append(r2)
            java.lang.String r2 = "ms"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r2 = r19
            K6.C6595p.c(r2, r0, r3)
            com.cyberfend.cyfsecurity.SensorDataBuilder.a()
            boolean r0 = com.cyberfend.cyfsecurity.SensorDataBuilder.f47780b
            if (r0 != 0) goto L_0x0500
            com.cyberfend.cyfsecurity.SensorDataBuilder r0 = com.cyberfend.cyfsecurity.SensorDataBuilder.a()
            java.lang.String r0 = r0.buildN(r7)
            goto L_0x0501
        L_0x0500:
            r0 = r1
        L_0x0501:
            C r2 = r4.f37704c
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r5 = 32
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x051b
            C r2 = r11.f37704c
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x052e
        L_0x051b:
            K6.h r2 = K6.C6587h.a()
            r2.f37689b = r0
            java.lang.Thread r3 = new java.lang.Thread
            K6.h$b r5 = new K6.h$b
            r5.<init>()
            r3.<init>(r5)
            r3.start()
        L_0x052e:
            K6.w r2 = r8.f37512f
            if (r2 == 0) goto L_0x0537
            java.lang.String r2 = r2.f37727e
            if (r2 == 0) goto L_0x0537
            goto L_0x0538
        L_0x0537:
            r2 = r10
        L_0x0538:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r0 = r21
            r3.append(r0)
            K6.g r5 = K6.C6586g.q()
            java.lang.String r5 = r5.r()
            r3.append(r5)
            r3.append(r0)
            K6.e r5 = K6.C6584e.s()
            java.lang.String r5 = r5.u()
            r3.append(r5)
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            K6.c r0 = r8.f37510d     // Catch:{ Exception -> 0x059d }
            if (r0 == 0) goto L_0x05a1
            r3 = 0
            r0.f37635b = r3     // Catch:{ Exception -> 0x059d }
            r0.f37636c = r3     // Catch:{ Exception -> 0x059d }
            r5 = 0
            r0.f37637d = r5     // Catch:{ Exception -> 0x059d }
            r0.f37638e = r10     // Catch:{ Exception -> 0x059d }
            r0.f37642i = r5     // Catch:{ Exception -> 0x059d }
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x059d }
            r0.f37634a = r5     // Catch:{ Exception -> 0x059d }
            java.util.ArrayList<K6.i> r3 = r0.f37639f     // Catch:{ Exception -> 0x059d }
            r3.clear()     // Catch:{ Exception -> 0x059d }
            java.util.concurrent.Future<android.util.Pair<java.lang.String, java.lang.Long>> r3 = r0.f37640g     // Catch:{ Exception -> 0x059d }
            if (r3 == 0) goto L_0x05a1
            boolean r3 = r3.isCancelled()     // Catch:{ Exception -> 0x059d }
            if (r3 != 0) goto L_0x059f
            java.util.concurrent.Future<android.util.Pair<java.lang.String, java.lang.Long>> r3 = r0.f37640g     // Catch:{ Exception -> 0x059d }
            boolean r3 = r3.isDone()     // Catch:{ Exception -> 0x059d }
            if (r3 != 0) goto L_0x059f
            java.util.concurrent.Future<android.util.Pair<java.lang.String, java.lang.Long>> r3 = r0.f37640g     // Catch:{ Exception -> 0x059d }
            r5 = 1
            r3.cancel(r5)     // Catch:{ Exception -> 0x059d }
            goto L_0x059f
        L_0x059d:
            r0 = move-exception
            goto L_0x05af
        L_0x059f:
            r0.f37640g = r1     // Catch:{ Exception -> 0x059d }
        L_0x05a1:
            K6.U r0 = r8.f37507a     // Catch:{ Exception -> 0x059d }
            if (r0 == 0) goto L_0x05a8
            r0.a()     // Catch:{ Exception -> 0x059d }
        L_0x05a8:
            K6.x.a()     // Catch:{ Exception -> 0x059d }
            K6.C6599u.a()     // Catch:{ Exception -> 0x059d }
            goto L_0x05b2
        L_0x05af:
            K6.y.a(r0)
        L_0x05b2:
            C r0 = r4.f37704c
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            r5 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x05ce
            C r0 = r11.f37704c
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            r5 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x062d
        L_0x05ce:
            K6.H r0 = r8.f37509c     // Catch:{ Exception -> 0x05f4 }
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x05f4 }
            r0.f37599c = r3     // Catch:{ Exception -> 0x05f4 }
            java.util.ArrayList<K6.F> r3 = r0.f37600d     // Catch:{ Exception -> 0x05f4 }
            r3.clear()     // Catch:{ Exception -> 0x05f4 }
            java.util.concurrent.Future<K6.q<android.util.Pair<java.lang.String, java.lang.String>, java.lang.Long, java.lang.Long>> r3 = r0.f37602f     // Catch:{ Exception -> 0x05f4 }
            if (r3 == 0) goto L_0x05f8
            boolean r3 = r3.isCancelled()     // Catch:{ Exception -> 0x05f4 }
            if (r3 != 0) goto L_0x05f6
            java.util.concurrent.Future<K6.q<android.util.Pair<java.lang.String, java.lang.String>, java.lang.Long, java.lang.Long>> r3 = r0.f37602f     // Catch:{ Exception -> 0x05f4 }
            boolean r3 = r3.isDone()     // Catch:{ Exception -> 0x05f4 }
            if (r3 != 0) goto L_0x05f6
            java.util.concurrent.Future<K6.q<android.util.Pair<java.lang.String, java.lang.String>, java.lang.Long, java.lang.Long>> r3 = r0.f37602f     // Catch:{ Exception -> 0x05f4 }
            r4 = 1
            r3.cancel(r4)     // Catch:{ Exception -> 0x05f4 }
            goto L_0x05f6
        L_0x05f4:
            r0 = move-exception
            goto L_0x062a
        L_0x05f6:
            r0.f37602f = r1     // Catch:{ Exception -> 0x05f4 }
        L_0x05f8:
            java.util.ArrayList<android.util.Pair<java.lang.Integer, java.lang.Long>> r0 = r0.f37601e     // Catch:{ Exception -> 0x05f4 }
            r0.clear()     // Catch:{ Exception -> 0x05f4 }
            K6.C r0 = r8.f37508b     // Catch:{ Exception -> 0x05f4 }
            long r3 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x05f4 }
            r0.f37548c = r3     // Catch:{ Exception -> 0x05f4 }
            java.util.ArrayList<K6.D> r3 = r0.f37549d     // Catch:{ Exception -> 0x05f4 }
            r3.clear()     // Catch:{ Exception -> 0x05f4 }
            java.util.concurrent.Future<K6.q<android.util.Pair<java.lang.String, java.lang.String>, java.lang.Long, java.lang.Long>> r3 = r0.f37550e     // Catch:{ Exception -> 0x05f4 }
            if (r3 == 0) goto L_0x0624
            boolean r3 = r3.isCancelled()     // Catch:{ Exception -> 0x05f4 }
            if (r3 != 0) goto L_0x0622
            java.util.concurrent.Future<K6.q<android.util.Pair<java.lang.String, java.lang.String>, java.lang.Long, java.lang.Long>> r3 = r0.f37550e     // Catch:{ Exception -> 0x05f4 }
            boolean r3 = r3.isDone()     // Catch:{ Exception -> 0x05f4 }
            if (r3 != 0) goto L_0x0622
            java.util.concurrent.Future<K6.q<android.util.Pair<java.lang.String, java.lang.String>, java.lang.Long, java.lang.Long>> r3 = r0.f37550e     // Catch:{ Exception -> 0x05f4 }
            r4 = 1
            r3.cancel(r4)     // Catch:{ Exception -> 0x05f4 }
        L_0x0622:
            r0.f37550e = r1     // Catch:{ Exception -> 0x05f4 }
        L_0x0624:
            java.util.ArrayList<android.util.Pair<java.lang.Integer, java.lang.Long>> r0 = r0.f37552g     // Catch:{ Exception -> 0x05f4 }
            r0.clear()     // Catch:{ Exception -> 0x05f4 }
            goto L_0x062d
        L_0x062a:
            K6.y.a(r0)
        L_0x062d:
            r46.v()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.A.u():java.lang.String");
    }

    private void v() {
        this.f37515i.post(new b());
    }

    public final void a() {
        C c10;
        H h10;
        C6580a.C0597a aVar = com.cyberfend.cyfsecurity.a.f47786e;
        if (aVar != null && !this.f37519m && (c10 = this.f37508b) != null && (h10 = this.f37509c) != null && c10.f37553h && h10.f37604h && f37505q && f37504p) {
            boolean z10 = this.f37520n;
            if ((z10 && f37506r) || !z10) {
                aVar.b();
                this.f37519m = true;
            }
        }
    }

    public final synchronized String b() {
        String str = "CYFManager";
        try {
            C6595p.c(str, "Getting sensor data", new Throwable[0]);
            if (this.f37508b != null) {
                if (this.f37509c != null) {
                    str = u();
                    C6595p.c("CYFManager", "Sensor Data: ".concat(String.valueOf(str)), new Throwable[0]);
                    return str;
                }
            }
            C6595p.e("CYFManager", "AkamaiBMP SDK is not initialized", new Throwable[0]);
            return "default-mobile";
        } catch (Exception e10) {
            C6595p.e("CYFManager", "Failed to get sensor data", e10);
            y.a(e10);
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final synchronized void d(int i10) {
        this.f37516j = i10;
    }

    public final synchronized void e(Application application) {
        if (this.f37509c == null) {
            this.f37509c = new H(application, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void f(android.app.Application r2, java.lang.String r3, java.lang.String r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L_0x0025
            boolean r0 = f37506r     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0025
            K6.w r0 = r1.f37512f     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r1)
            return
        L_0x000d:
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x0023 }
            r0.<init>()     // Catch:{ all -> 0x0023 }
            r1.f37517k = r0     // Catch:{ all -> 0x0023 }
            K6.w r0 = new K6.w     // Catch:{ all -> 0x0023 }
            r0.<init>(r2, r3, r4)     // Catch:{ all -> 0x0023 }
            r1.f37512f = r0     // Catch:{ all -> 0x0023 }
            r2 = 1
            f37506r = r2     // Catch:{ all -> 0x0023 }
            r1.a()     // Catch:{ all -> 0x0023 }
            monitor-exit(r1)
            return
        L_0x0023:
            r2 = move-exception
            goto L_0x002e
        L_0x0025:
            boolean r0 = f37506r     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x002c
            r1.k(r2, r3, r4)     // Catch:{ all -> 0x0023 }
        L_0x002c:
            monitor-exit(r1)
            return
        L_0x002e:
            monitor-exit(r1)     // Catch:{ all -> 0x0023 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.A.f(android.app.Application, java.lang.String, java.lang.String):void");
    }

    public final void g(ViewGroup viewGroup) {
        try {
            ArrayList<View> a10 = J.a(viewGroup);
            for (int i10 = 0; i10 < a10.size(); i10++) {
                View view = a10.get(i10);
                if (view instanceof EditText) {
                    if (!this.f37518l) {
                        this.f37507a = new U();
                        this.f37518l = true;
                    }
                    U u10 = this.f37507a;
                    EditText editText = (EditText) view;
                    C6595p.c("TextChangeManager", "Listening on edit text: " + editText.getId(), new Throwable[0]);
                    int a11 = P.a(String.valueOf(editText.getId()));
                    if (!x.f37733a.toLowerCase().contains(Integer.toString(a11).toLowerCase())) {
                        x.f37733a += a11 + ";";
                    }
                    if (!((editText.getInputType() & 129) == 129 || (editText.getInputType() & 18) == 18 || (editText.getInputType() & 145) == 145)) {
                        if ((editText.getInputType() & 225) != 225) {
                            T t10 = new T(a11, false);
                            editText.addTextChangedListener(t10);
                            t10.addObserver(u10.f37618a);
                        }
                    }
                    T t11 = new T(a11, true);
                    editText.addTextChangedListener(t11);
                    t11.addObserver(u10.f37618a);
                }
            }
        } catch (Exception e10) {
            C6595p.e("CYFManager", "Exception in creating text listener", e10);
            y.a(e10);
        }
    }

    public final synchronized void j(Application application) {
        if (this.f37508b == null) {
            this.f37508b = new C(application, this);
        }
    }

    public final void l(Window window) {
        try {
            if (this.f37510d == null) {
                this.f37510d = new C6582c();
            }
            C6582c cVar = this.f37510d;
            C6595p.c("TouchManager", "Listening on window", new Throwable[0]);
            cVar.f37634a = SystemClock.uptimeMillis();
            C6581b bVar = new C6581b(window.getCallback());
            window.setCallback(bVar);
            bVar.addObserver(cVar);
        } catch (Exception e10) {
            C6595p.e("CYFManager", "Exception in creating touch manager", e10);
            y.a(e10);
        }
    }

    public final void m() {
        try {
            H h10 = this.f37509c;
            if (h10.f37600d.size() < 128 && !h10.f37603g.get()) {
                G g10 = h10.f37597a;
                g10.f37583b = g10.f37582a.getDefaultSensor(1);
                g10.f37584c = g10.f37582a.getDefaultSensor(2);
                HandlerThread handlerThread = new HandlerThread("CYFOrientationListener");
                g10.f37586e = handlerThread;
                handlerThread.start();
                Handler handler = new Handler(g10.f37586e.getLooper());
                g10.f37587f = g10.f37582a.registerListener(g10, g10.f37583b, 1, handler);
                g10.f37588g = g10.f37582a.registerListener(g10, g10.f37584c, 1, handler);
                Sensor defaultSensor = g10.f37582a.getDefaultSensor(9);
                g10.f37585d = defaultSensor;
                boolean registerListener = g10.f37582a.registerListener(g10, defaultSensor, 1, handler);
                g10.f37589h = registerListener;
                if (registerListener) {
                    g10.f37582a.unregisterListener(g10, g10.f37583b);
                    g10.f37587f = false;
                    C6599u.f37715g = 1;
                } else {
                    C6599u.f37715g = 0;
                }
                g10.f37596o = true;
                g10.f37593l = SystemClock.uptimeMillis();
                if ((g10.f37587f || g10.f37589h) && g10.f37588g) {
                    h10.f37598b = true;
                    h10.f37597a.addObserver(h10);
                    return;
                }
                C6595p.e("OrientationListener", "Failed to register orientation listener", new Throwable[0]);
                g10.a();
                C6595p.e("OrientationManager", "Orientation listener registration failed", new Throwable[0]);
            }
        } catch (Exception e10) {
            h(e10.getMessage());
            C6595p.e("CYFManager", "Exception in starting orientation manager", e10);
            y.a(e10);
        }
    }

    public final synchronized void n(Application application) {
        if (!f37505q) {
            C6598t tVar = new C6598t();
            this.f37511e = tVar;
            application.registerActivityLifecycleCallbacks(tVar);
            f37505q = true;
            a();
        }
    }

    public final synchronized void o() {
        try {
            this.f37509c.b();
        } catch (Exception e10) {
            C6595p.e("CYFManager", "Exception in stopping orientation manager", e10);
            y.a(e10);
        }
    }

    public final synchronized void p(Application application) {
        if (!f37504p && application != null) {
            try {
                S s10 = new S();
                this.f37513g = s10;
                long uptimeMillis = SystemClock.uptimeMillis();
                s10.f37609c = Q.c(application);
                s10.f37610d = ((TelephonyManager) application.getSystemService("phone")).getSimOperatorName();
                new O();
                s10.f37611e = String.join(Marker.ANY_NON_NULL_MARKER, O.c(application, application.getPackageName()));
                s10.f37612f = Q.g(application);
                s10.f37613g = Q.b();
                C6599u.f37714f = SystemClock.uptimeMillis() - uptimeMillis;
                C6595p.c("CYFSystemInfoManager", "DeviceInfo-Time: " + C6599u.f37714f + "ms", new Throwable[0]);
                f37504p = true;
                a();
            } catch (Exception e10) {
                y.a(e10);
                h(e10.getMessage());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ba, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void q() {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            monitor-enter(r7)
            K6.C r2 = r7.f37508b     // Catch:{ Exception -> 0x0097 }
            java.util.ArrayList<K6.D> r3 = r2.f37549d     // Catch:{ Exception -> 0x0097 }
            int r3 = r3.size()     // Catch:{ Exception -> 0x0097 }
            r4 = 128(0x80, float:1.794E-43)
            if (r3 >= r4) goto L_0x00b9
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.f37551f     // Catch:{ Exception -> 0x0097 }
            boolean r3 = r3.get()     // Catch:{ Exception -> 0x0097 }
            if (r3 != 0) goto L_0x00b9
            K6.B r3 = r2.f37546a     // Catch:{ Exception -> 0x0097 }
            android.hardware.SensorManager r4 = r3.f37523a     // Catch:{ Exception -> 0x0097 }
            android.hardware.Sensor r4 = r4.getDefaultSensor(r1)     // Catch:{ Exception -> 0x0097 }
            r3.f37524b = r4     // Catch:{ Exception -> 0x0097 }
            android.hardware.SensorManager r4 = r3.f37523a     // Catch:{ Exception -> 0x0097 }
            r5 = 4
            android.hardware.Sensor r4 = r4.getDefaultSensor(r5)     // Catch:{ Exception -> 0x0097 }
            r3.f37525c = r4     // Catch:{ Exception -> 0x0097 }
            android.os.HandlerThread r4 = new android.os.HandlerThread     // Catch:{ Exception -> 0x0097 }
            java.lang.String r5 = "CYFMotionListener"
            r4.<init>(r5)     // Catch:{ Exception -> 0x0097 }
            r3.f37526d = r4     // Catch:{ Exception -> 0x0097 }
            r4.start()     // Catch:{ Exception -> 0x0097 }
            android.os.Handler r4 = new android.os.Handler     // Catch:{ Exception -> 0x0097 }
            android.os.HandlerThread r5 = r3.f37526d     // Catch:{ Exception -> 0x0097 }
            android.os.Looper r5 = r5.getLooper()     // Catch:{ Exception -> 0x0097 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0097 }
            android.hardware.SensorManager r5 = r3.f37523a     // Catch:{ Exception -> 0x0097 }
            android.hardware.Sensor r6 = r3.f37524b     // Catch:{ Exception -> 0x0097 }
            boolean r5 = r5.registerListener(r3, r6, r1, r4)     // Catch:{ Exception -> 0x0097 }
            r3.f37528f = r5     // Catch:{ Exception -> 0x0097 }
            android.hardware.SensorManager r5 = r3.f37523a     // Catch:{ Exception -> 0x0097 }
            android.hardware.Sensor r6 = r3.f37525c     // Catch:{ Exception -> 0x0097 }
            boolean r4 = r5.registerListener(r3, r6, r1, r4)     // Catch:{ Exception -> 0x0097 }
            r3.f37529g = r4     // Catch:{ Exception -> 0x0097 }
            java.lang.String r4 = "MotionListener"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0097 }
            java.lang.String r6 = "GyroScope status "
            r5.<init>(r6)     // Catch:{ Exception -> 0x0097 }
            boolean r6 = r3.f37529g     // Catch:{ Exception -> 0x0097 }
            r5.append(r6)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r6 = " and Accelerometer status "
            r5.append(r6)     // Catch:{ Exception -> 0x0097 }
            boolean r6 = r3.f37528f     // Catch:{ Exception -> 0x0097 }
            r5.append(r6)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0097 }
            java.lang.Throwable[] r6 = new java.lang.Throwable[r0]     // Catch:{ Exception -> 0x0097 }
            K6.C6595p.c(r4, r5, r6)     // Catch:{ Exception -> 0x0097 }
            boolean r4 = r3.f37528f     // Catch:{ Exception -> 0x0097 }
            if (r4 != 0) goto L_0x0099
            boolean r5 = r3.f37529g     // Catch:{ Exception -> 0x0097 }
            if (r5 != 0) goto L_0x0099
            java.lang.String r2 = "MotionListener"
            java.lang.String r4 = "Failed to register motion listener"
            java.lang.Throwable[] r5 = new java.lang.Throwable[r0]     // Catch:{ Exception -> 0x0097 }
            K6.C6595p.e(r2, r4, r5)     // Catch:{ Exception -> 0x0097 }
            r3.a()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r2 = "MotionManager"
            java.lang.String r3 = "Motion listener registration failed"
            java.lang.Throwable[] r4 = new java.lang.Throwable[r0]     // Catch:{ Exception -> 0x0097 }
            K6.C6595p.e(r2, r3, r4)     // Catch:{ Exception -> 0x0097 }
            monitor-exit(r7)
            return
        L_0x0095:
            r0 = move-exception
            goto L_0x00d2
        L_0x0097:
            r2 = move-exception
            goto L_0x00bb
        L_0x0099:
            r4 = r4 ^ r1
            r3.f37531i = r4     // Catch:{ Exception -> 0x0097 }
            boolean r4 = r3.f37529g     // Catch:{ Exception -> 0x0097 }
            r4 = r4 ^ r1
            r3.f37530h = r4     // Catch:{ Exception -> 0x0097 }
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0097 }
            r3.f37527e = r4     // Catch:{ Exception -> 0x0097 }
            long r4 = java.lang.System.nanoTime()     // Catch:{ Exception -> 0x0097 }
            float r4 = (float) r4     // Catch:{ Exception -> 0x0097 }
            r3.f37542t = r4     // Catch:{ Exception -> 0x0097 }
            r3.f37544v = r0     // Catch:{ Exception -> 0x0097 }
            r3.f37545w = r1     // Catch:{ Exception -> 0x0097 }
            r2.f37547b = r1     // Catch:{ Exception -> 0x0097 }
            K6.B r3 = r2.f37546a     // Catch:{ Exception -> 0x0097 }
            r3.addObserver(r2)     // Catch:{ Exception -> 0x0097 }
        L_0x00b9:
            monitor-exit(r7)
            return
        L_0x00bb:
            java.lang.String r3 = r2.getMessage()     // Catch:{ all -> 0x0095 }
            r7.h(r3)     // Catch:{ all -> 0x0095 }
            java.lang.String r3 = "CYFManager"
            java.lang.String r4 = "Exception in starting motion manager"
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]     // Catch:{ all -> 0x0095 }
            r1[r0] = r2     // Catch:{ all -> 0x0095 }
            K6.C6595p.e(r3, r4, r1)     // Catch:{ all -> 0x0095 }
            K6.y.a(r2)     // Catch:{ all -> 0x0095 }
            monitor-exit(r7)
            return
        L_0x00d2:
            monitor-exit(r7)     // Catch:{ all -> 0x0095 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.A.q():void");
    }

    public final synchronized void r() {
        try {
            this.f37508b.b();
        } catch (Exception e10) {
            C6595p.e("CYFManager", "Exception in stopping motion manager", e10);
            y.a(e10);
        }
    }

    public final synchronized Boolean s() {
        if (this.f37517k == null) {
            return Boolean.FALSE;
        }
        Date date = new Date();
        date.getTime();
        this.f37517k.getTime();
        if ((date.getTime() - this.f37517k.getTime()) / 1000 > 300) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* access modifiers changed from: package-private */
    public final synchronized int t() {
        return this.f37516j;
    }
}
