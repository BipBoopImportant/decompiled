package Fw;

import Fw.d;
import TJ.C16532g;
import XH.C16807N;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.B;
import androidx.room.C7009f;
import androidx.room.C7013j;
import androidx.room.C7014k;
import androidx.room.H;
import androidx.room.x;
import dI.C17164e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: Fw.c  reason: case insensitive filesystem */
public final class C12910c implements C12909b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f109940a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C7014k<d> f109941b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final e f109942c = new e();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C7013j<d.a.b> f109943d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C7013j<d.a.C2628a> f109944e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final H f109945f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final H f109946g;

    /* renamed from: Fw.c$a */
    class a implements Callable<C16807N> {
        a() {
        }

        /* renamed from: a */
        public C16807N call() {
            Q4.k acquire = C12910c.this.f109946g.acquire();
            try {
                C12910c.this.f109940a.beginTransaction();
                acquire.b0();
                C12910c.this.f109940a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                C12910c.this.f109940a.endTransaction();
                C12910c.this.f109946g.release(acquire);
                return n10;
            } catch (Throwable th2) {
                C12910c.this.f109946g.release(acquire);
                throw th2;
            }
        }
    }

    /* renamed from: Fw.c$b */
    class b implements Callable<d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f109948a;

        b(B b10) {
            this.f109948a = b10;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: Fw.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: Fw.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: Fw.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.Double} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: Fw.d} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: Fw.d} */
        /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Double] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Fw.d call() {
            /*
                r22 = this;
                r1 = r22
                Fw.c r0 = Fw.C12910c.this
                androidx.room.x r0 = r0.f109940a
                androidx.room.B r2 = r1.f109948a
                r3 = 0
                r4 = 0
                android.database.Cursor r2 = O4.b.e(r0, r2, r3, r4)
                java.lang.String r0 = "timeSlotId"
                int r0 = O4.a.d(r2, r0)     // Catch:{ all -> 0x009d }
                java.lang.String r3 = "orderId"
                int r3 = O4.a.d(r2, r3)     // Catch:{ all -> 0x009d }
                java.lang.String r5 = "startTime"
                int r5 = O4.a.d(r2, r5)     // Catch:{ all -> 0x009d }
                java.lang.String r6 = "endTime"
                int r6 = O4.a.d(r2, r6)     // Catch:{ all -> 0x009d }
                java.lang.String r7 = "pickupStatus"
                int r7 = O4.a.d(r2, r7)     // Catch:{ all -> 0x009d }
                java.lang.String r8 = "updatedAt"
                int r8 = O4.a.d(r2, r8)     // Catch:{ all -> 0x009d }
                java.lang.String r9 = "products"
                int r9 = O4.a.d(r2, r9)     // Catch:{ all -> 0x009d }
                java.lang.String r10 = "totalPrice"
                int r10 = O4.a.d(r2, r10)     // Catch:{ all -> 0x009d }
                boolean r11 = r2.moveToFirst()     // Catch:{ all -> 0x009d }
                if (r11 == 0) goto L_0x009f
                java.lang.String r13 = r2.getString(r0)     // Catch:{ all -> 0x009d }
                boolean r0 = r2.isNull(r3)     // Catch:{ all -> 0x009d }
                if (r0 == 0) goto L_0x0052
                r14 = r4
                goto L_0x0057
            L_0x0052:
                java.lang.String r0 = r2.getString(r3)     // Catch:{ all -> 0x009d }
                r14 = r0
            L_0x0057:
                java.lang.String r15 = r2.getString(r5)     // Catch:{ all -> 0x009d }
                java.lang.String r16 = r2.getString(r6)     // Catch:{ all -> 0x009d }
                java.lang.String r17 = r2.getString(r7)     // Catch:{ all -> 0x009d }
                long r18 = r2.getLong(r8)     // Catch:{ all -> 0x009d }
                boolean r0 = r2.isNull(r9)     // Catch:{ all -> 0x009d }
                if (r0 == 0) goto L_0x006f
                r0 = r4
                goto L_0x0073
            L_0x006f:
                java.lang.String r0 = r2.getString(r9)     // Catch:{ all -> 0x009d }
            L_0x0073:
                if (r0 != 0) goto L_0x0078
                r20 = r4
                goto L_0x0084
            L_0x0078:
                Fw.c r3 = Fw.C12910c.this     // Catch:{ all -> 0x009d }
                Fw.e r3 = r3.f109942c     // Catch:{ all -> 0x009d }
                java.util.List r0 = r3.a(r0)     // Catch:{ all -> 0x009d }
                r20 = r0
            L_0x0084:
                boolean r0 = r2.isNull(r10)     // Catch:{ all -> 0x009d }
                if (r0 == 0) goto L_0x008d
            L_0x008a:
                r21 = r4
                goto L_0x0096
            L_0x008d:
                double r3 = r2.getDouble(r10)     // Catch:{ all -> 0x009d }
                java.lang.Double r4 = java.lang.Double.valueOf(r3)     // Catch:{ all -> 0x009d }
                goto L_0x008a
            L_0x0096:
                Fw.d r4 = new Fw.d     // Catch:{ all -> 0x009d }
                r12 = r4
                r12.<init>(r13, r14, r15, r16, r17, r18, r20, r21)     // Catch:{ all -> 0x009d }
                goto L_0x009f
            L_0x009d:
                r0 = move-exception
                goto L_0x00a3
            L_0x009f:
                r2.close()
                return r4
            L_0x00a3:
                r2.close()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Fw.C12910c.b.call():Fw.d");
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f109948a.h();
        }
    }

    /* renamed from: Fw.c$c  reason: collision with other inner class name */
    class C2627c implements Callable<List<d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f109950a;

        C2627c(B b10) {
            this.f109950a = b10;
        }

        /* renamed from: a */
        public List<d> call() {
            Cursor e10 = O4.b.e(C12910c.this.f109940a, this.f109950a, false, (CancellationSignal) null);
            try {
                int d10 = O4.a.d(e10, "timeSlotId");
                int d11 = O4.a.d(e10, "orderId");
                int d12 = O4.a.d(e10, "startTime");
                int d13 = O4.a.d(e10, "endTime");
                int d14 = O4.a.d(e10, "pickupStatus");
                int d15 = O4.a.d(e10, "updatedAt");
                int d16 = O4.a.d(e10, "products");
                int d17 = O4.a.d(e10, "totalPrice");
                ArrayList arrayList = new ArrayList(e10.getCount());
                while (e10.moveToNext()) {
                    String string = e10.getString(d10);
                    String string2 = e10.isNull(d11) ? null : e10.getString(d11);
                    String string3 = e10.getString(d12);
                    String string4 = e10.getString(d13);
                    String string5 = e10.getString(d14);
                    long j10 = e10.getLong(d15);
                    String string6 = e10.isNull(d16) ? null : e10.getString(d16);
                    arrayList.add(new d(string, string2, string3, string4, string5, j10, string6 == null ? null : C12910c.this.f109942c.a(string6), e10.isNull(d17) ? null : Double.valueOf(e10.getDouble(d17))));
                }
                return arrayList;
            } finally {
                e10.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f109950a.h();
        }
    }

    /* renamed from: Fw.c$d */
    class d extends C7014k<d> {
        d(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(Q4.k kVar, d dVar) {
            kVar.H(1, dVar.f());
            if (dVar.d() == null) {
                kVar.I2(2);
            } else {
                kVar.H(2, dVar.d());
            }
            kVar.H(3, dVar.e());
            kVar.H(4, dVar.a());
            kVar.H(5, dVar.b());
            kVar.i2(6, dVar.h());
            String b10 = dVar.c() == null ? null : C12910c.this.f109942c.b(dVar.c());
            if (b10 == null) {
                kVar.I2(7);
            } else {
                kVar.H(7, b10);
            }
            if (dVar.g() == null) {
                kVar.I2(8);
            } else {
                kVar.g0(8, dVar.g().doubleValue());
            }
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR REPLACE INTO `ongoingorders-table` (`timeSlotId`,`orderId`,`startTime`,`endTime`,`pickupStatus`,`updatedAt`,`products`,`totalPrice`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: Fw.c$e */
    class e extends C7013j<d.a.b> {
        e(C12910c cVar, x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(Q4.k kVar, d.a.b bVar) {
            kVar.H(1, bVar.b());
            kVar.H(2, bVar.a());
            kVar.H(3, bVar.b());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "UPDATE OR ABORT `ongoingorders-table` SET `timeSlotId` = ?,`pickupStatus` = ? WHERE `timeSlotId` = ?";
        }
    }

    /* renamed from: Fw.c$f */
    class f extends C7013j<d.a.C2628a> {
        f(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(Q4.k kVar, d.a.C2628a aVar) {
            kVar.H(1, aVar.c());
            kVar.H(2, aVar.a());
            kVar.i2(3, aVar.e());
            kVar.H(4, C12910c.this.f109942c.b(aVar.b()));
            kVar.g0(5, aVar.d());
            kVar.H(6, aVar.c());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "UPDATE OR ABORT `ongoingorders-table` SET `timeSlotId` = ?,`orderId` = ?,`updatedAt` = ?,`products` = ?,`totalPrice` = ? WHERE `timeSlotId` = ?";
        }
    }

    /* renamed from: Fw.c$g */
    class g extends H {
        g(C12910c cVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM `ongoingorders-table` WHERE timeSlotId=?";
        }
    }

    /* renamed from: Fw.c$h */
    class h extends H {
        h(C12910c cVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM `ongoingorders-table`";
        }
    }

    /* renamed from: Fw.c$i */
    class i implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f109954a;

        i(d dVar) {
            this.f109954a = dVar;
        }

        /* renamed from: a */
        public C16807N call() {
            C12910c.this.f109940a.beginTransaction();
            try {
                C12910c.this.f109941b.insert(this.f109954a);
                C12910c.this.f109940a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C12910c.this.f109940a.endTransaction();
            }
        }
    }

    /* renamed from: Fw.c$j */
    class j implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.a.b f109956a;

        j(d.a.b bVar) {
            this.f109956a = bVar;
        }

        /* renamed from: a */
        public C16807N call() {
            C12910c.this.f109940a.beginTransaction();
            try {
                C12910c.this.f109943d.handle(this.f109956a);
                C12910c.this.f109940a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C12910c.this.f109940a.endTransaction();
            }
        }
    }

    /* renamed from: Fw.c$k */
    class k implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d.a.C2628a f109958a;

        k(d.a.C2628a aVar) {
            this.f109958a = aVar;
        }

        /* renamed from: a */
        public C16807N call() {
            C12910c.this.f109940a.beginTransaction();
            try {
                C12910c.this.f109944e.handle(this.f109958a);
                C12910c.this.f109940a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C12910c.this.f109940a.endTransaction();
            }
        }
    }

    /* renamed from: Fw.c$l */
    class l implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f109960a;

        l(String str) {
            this.f109960a = str;
        }

        /* renamed from: a */
        public C16807N call() {
            Q4.k acquire = C12910c.this.f109945f.acquire();
            acquire.H(1, this.f109960a);
            try {
                C12910c.this.f109940a.beginTransaction();
                acquire.b0();
                C12910c.this.f109940a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                C12910c.this.f109940a.endTransaction();
                C12910c.this.f109945f.release(acquire);
                return n10;
            } catch (Throwable th2) {
                C12910c.this.f109945f.release(acquire);
                throw th2;
            }
        }
    }

    public C12910c(x xVar) {
        this.f109940a = xVar;
        this.f109941b = new d(xVar);
        this.f109943d = new e(this, xVar);
        this.f109944e = new f(xVar);
        this.f109945f = new g(this, xVar);
        this.f109946g = new h(this, xVar);
    }

    public static List<Class<?>> m() {
        return Collections.emptyList();
    }

    public Object b(C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f109940a, true, new a(), eVar);
    }

    public Object c(d dVar, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f109940a, true, new i(dVar), eVar);
    }

    public Object d(d.a.b bVar, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f109940a, true, new j(bVar), eVar);
    }

    public Object e(String str, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f109940a, true, new l(str), eVar);
    }

    public Object f(d.a.C2628a aVar, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f109940a, true, new k(aVar), eVar);
    }

    public C16532g<d> get(String str) {
        B e10 = B.e("SELECT * FROM `ongoingorders-table` WHERE timeSlotId=?", 1);
        e10.H(1, str);
        return C7009f.a(this.f109940a, false, new String[]{"ongoingorders-table"}, new b(e10));
    }

    public C16532g<List<d>> getAll() {
        return C7009f.a(this.f109940a, false, new String[]{"ongoingorders-table"}, new C2627c(B.e("SELECT * FROM `ongoingorders-table` ORDER by updatedAt DESC", 0)));
    }
}
