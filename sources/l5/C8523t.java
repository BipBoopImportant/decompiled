package l5;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.C7034c;
import androidx.work.C7043l;
import androidx.work.C7055y;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import ob.C10101e;
import r5.C8689a;
import s5.C8731m;
import s5.C8739u;
import t5.C8797H;
import u2.C6012a;
import u5.C8878b;

/* renamed from: l5.t  reason: case insensitive filesystem */
public class C8523t implements C8689a {

    /* renamed from: l  reason: collision with root package name */
    private static final String f54736l = C7055y.i("Processor");

    /* renamed from: a  reason: collision with root package name */
    private PowerManager.WakeLock f54737a = null;

    /* renamed from: b  reason: collision with root package name */
    private Context f54738b;

    /* renamed from: c  reason: collision with root package name */
    private C7034c f54739c;

    /* renamed from: d  reason: collision with root package name */
    private C8878b f54740d;

    /* renamed from: e  reason: collision with root package name */
    private WorkDatabase f54741e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, W> f54742f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private Map<String, W> f54743g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private Map<String, Set<C8528y>> f54744h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private Set<String> f54745i = new HashSet();

    /* renamed from: j  reason: collision with root package name */
    private final List<C8510f> f54746j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private final Object f54747k = new Object();

    public C8523t(Context context, C7034c cVar, C8878b bVar, WorkDatabase workDatabase) {
        this.f54738b = context;
        this.f54739c = cVar;
        this.f54740d = bVar;
        this.f54741e = workDatabase;
    }

    private W f(String str) {
        W remove = this.f54742f.remove(str);
        boolean z10 = remove != null;
        if (!z10) {
            remove = this.f54743g.remove(str);
        }
        this.f54744h.remove(str);
        if (z10) {
            u();
        }
        return remove;
    }

    private W h(String str) {
        W w10 = this.f54742f.get(str);
        return w10 == null ? this.f54743g.get(str) : w10;
    }

    private static boolean i(String str, W w10, int i10) {
        if (w10 != null) {
            w10.o(i10);
            C7055y e10 = C7055y.e();
            String str2 = f54736l;
            e10.a(str2, "WorkerWrapper interrupted for " + str);
            return true;
        }
        C7055y e11 = C7055y.e();
        String str3 = f54736l;
        e11.a(str3, "WorkerWrapper could not be found for " + str);
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(C8731m mVar, boolean z10) {
        synchronized (this.f54747k) {
            try {
                for (C8510f b10 : this.f54746j) {
                    b10.b(mVar, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C8739u m(ArrayList arrayList, String str) {
        arrayList.addAll(this.f54741e.g().a(str));
        return this.f54741e.f().i(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n(C10101e eVar, W w10) {
        boolean z10;
        try {
            z10 = ((Boolean) eVar.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            z10 = true;
        }
        o(w10, z10);
    }

    private void o(W w10, boolean z10) {
        synchronized (this.f54747k) {
            try {
                C8731m l10 = w10.l();
                String b10 = l10.b();
                if (h(b10) == w10) {
                    f(b10);
                }
                C7055y e10 = C7055y.e();
                String str = f54736l;
                e10.a(str, getClass().getSimpleName() + " " + b10 + " executed; reschedule = " + z10);
                for (C8510f b11 : this.f54746j) {
                    b11.b(l10, z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void q(C8731m mVar, boolean z10) {
        this.f54740d.a().execute(new C8522s(this, mVar, z10));
    }

    private void u() {
        synchronized (this.f54747k) {
            try {
                if (this.f54742f.isEmpty()) {
                    this.f54738b.startService(a.g(this.f54738b));
                    PowerManager.WakeLock wakeLock = this.f54737a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f54737a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(String str, C7043l lVar) {
        synchronized (this.f54747k) {
            try {
                C7055y e10 = C7055y.e();
                String str2 = f54736l;
                e10.f(str2, "Moving WorkSpec (" + str + ") to the foreground");
                W remove = this.f54743g.remove(str);
                if (remove != null) {
                    if (this.f54737a == null) {
                        PowerManager.WakeLock b10 = C8797H.b(this.f54738b, "ProcessorForegroundLck");
                        this.f54737a = b10;
                        b10.acquire();
                    }
                    this.f54742f.put(str, remove);
                    C6012a.p(this.f54738b, a.f(this.f54738b, remove.l(), lVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(C8510f fVar) {
        synchronized (this.f54747k) {
            this.f54746j.add(fVar);
        }
    }

    public C8739u g(String str) {
        synchronized (this.f54747k) {
            try {
                W h10 = h(str);
                if (h10 == null) {
                    return null;
                }
                C8739u m10 = h10.m();
                return m10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean j(String str) {
        boolean contains;
        synchronized (this.f54747k) {
            contains = this.f54745i.contains(str);
        }
        return contains;
    }

    public boolean k(String str) {
        boolean z10;
        synchronized (this.f54747k) {
            z10 = h(str) != null;
        }
        return z10;
    }

    public void p(C8510f fVar) {
        synchronized (this.f54747k) {
            this.f54746j.remove(fVar);
        }
    }

    public boolean r(C8528y yVar) {
        return s(yVar, (WorkerParameters.a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean s(l5.C8528y r13, androidx.work.WorkerParameters.a r14) {
        /*
            r12 = this;
            s5.m r0 = r13.a()
            java.lang.String r1 = r0.b()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            androidx.work.impl.WorkDatabase r2 = r12.f54741e
            l5.q r3 = new l5.q
            r3.<init>(r12, r9, r1)
            java.lang.Object r2 = r2.runInTransaction(r3)
            r8 = r2
            s5.u r8 = (s5.C8739u) r8
            r2 = 0
            if (r8 != 0) goto L_0x003c
            androidx.work.y r13 = androidx.work.C7055y.e()
            java.lang.String r14 = f54736l
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Didn't find WorkSpec for id "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r13.k(r14, r1)
            r12.q(r0, r2)
            return r2
        L_0x003c:
            java.lang.Object r10 = r12.f54747k
            monitor-enter(r10)
            boolean r3 = r12.k(r1)     // Catch:{ all -> 0x0088 }
            if (r3 == 0) goto L_0x008f
            java.util.Map<java.lang.String, java.util.Set<l5.y>> r14 = r12.f54744h     // Catch:{ all -> 0x0088 }
            java.lang.Object r14 = r14.get(r1)     // Catch:{ all -> 0x0088 }
            java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x0088 }
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x0088 }
            java.lang.Object r1 = r1.next()     // Catch:{ all -> 0x0088 }
            l5.y r1 = (l5.C8528y) r1     // Catch:{ all -> 0x0088 }
            s5.m r1 = r1.a()     // Catch:{ all -> 0x0088 }
            int r1 = r1.a()     // Catch:{ all -> 0x0088 }
            int r3 = r0.a()     // Catch:{ all -> 0x0088 }
            if (r1 != r3) goto L_0x008a
            r14.add(r13)     // Catch:{ all -> 0x0088 }
            androidx.work.y r13 = androidx.work.C7055y.e()     // Catch:{ all -> 0x0088 }
            java.lang.String r14 = f54736l     // Catch:{ all -> 0x0088 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0088 }
            r1.<init>()     // Catch:{ all -> 0x0088 }
            java.lang.String r3 = "Work "
            r1.append(r3)     // Catch:{ all -> 0x0088 }
            r1.append(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = " is already enqueued for processing"
            r1.append(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0088 }
            r13.a(r14, r0)     // Catch:{ all -> 0x0088 }
            goto L_0x008d
        L_0x0088:
            r13 = move-exception
            goto L_0x0101
        L_0x008a:
            r12.q(r0, r2)     // Catch:{ all -> 0x0088 }
        L_0x008d:
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            return r2
        L_0x008f:
            int r3 = r8.f()     // Catch:{ all -> 0x0088 }
            int r4 = r0.a()     // Catch:{ all -> 0x0088 }
            if (r3 == r4) goto L_0x009e
            r12.q(r0, r2)     // Catch:{ all -> 0x0088 }
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            return r2
        L_0x009e:
            l5.W$a r11 = new l5.W$a     // Catch:{ all -> 0x0088 }
            android.content.Context r3 = r12.f54738b     // Catch:{ all -> 0x0088 }
            androidx.work.c r4 = r12.f54739c     // Catch:{ all -> 0x0088 }
            u5.b r5 = r12.f54740d     // Catch:{ all -> 0x0088 }
            androidx.work.impl.WorkDatabase r7 = r12.f54741e     // Catch:{ all -> 0x0088 }
            r2 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0088 }
            l5.W$a r14 = r11.k(r14)     // Catch:{ all -> 0x0088 }
            l5.W r14 = r14.a()     // Catch:{ all -> 0x0088 }
            ob.e r2 = r14.q()     // Catch:{ all -> 0x0088 }
            l5.r r3 = new l5.r     // Catch:{ all -> 0x0088 }
            r3.<init>(r12, r2, r14)     // Catch:{ all -> 0x0088 }
            u5.b r4 = r12.f54740d     // Catch:{ all -> 0x0088 }
            java.util.concurrent.Executor r4 = r4.a()     // Catch:{ all -> 0x0088 }
            r2.a(r3, r4)     // Catch:{ all -> 0x0088 }
            java.util.Map<java.lang.String, l5.W> r2 = r12.f54743g     // Catch:{ all -> 0x0088 }
            r2.put(r1, r14)     // Catch:{ all -> 0x0088 }
            java.util.HashSet r14 = new java.util.HashSet     // Catch:{ all -> 0x0088 }
            r14.<init>()     // Catch:{ all -> 0x0088 }
            r14.add(r13)     // Catch:{ all -> 0x0088 }
            java.util.Map<java.lang.String, java.util.Set<l5.y>> r13 = r12.f54744h     // Catch:{ all -> 0x0088 }
            r13.put(r1, r14)     // Catch:{ all -> 0x0088 }
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            androidx.work.y r13 = androidx.work.C7055y.e()
            java.lang.String r14 = f54736l
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r12.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = ": processing "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r13.a(r14, r0)
            r13 = 1
            return r13
        L_0x0101:
            monitor-exit(r10)     // Catch:{ all -> 0x0088 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.C8523t.s(l5.y, androidx.work.WorkerParameters$a):boolean");
    }

    public boolean t(String str, int i10) {
        W f10;
        synchronized (this.f54747k) {
            C7055y e10 = C7055y.e();
            String str2 = f54736l;
            e10.a(str2, "Processor cancelling " + str);
            this.f54745i.add(str);
            f10 = f(str);
        }
        return i(str, f10, i10);
    }

    public boolean v(C8528y yVar, int i10) {
        W f10;
        String b10 = yVar.a().b();
        synchronized (this.f54747k) {
            f10 = f(b10);
        }
        return i(b10, f10, i10);
    }

    public boolean w(C8528y yVar, int i10) {
        String b10 = yVar.a().b();
        synchronized (this.f54747k) {
            try {
                if (this.f54742f.get(b10) != null) {
                    C7055y e10 = C7055y.e();
                    String str = f54736l;
                    e10.a(str, "Ignored stopWork. WorkerWrapper " + b10 + " is in foreground");
                    return false;
                }
                Set set = this.f54744h.get(b10);
                if (set != null) {
                    if (set.contains(yVar)) {
                        W f10 = f(b10);
                        return i(b10, f10, i10);
                    }
                }
                return false;
            } finally {
            }
        }
    }
}
