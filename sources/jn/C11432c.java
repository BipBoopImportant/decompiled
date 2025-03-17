package jn;

import Q4.k;
import TJ.C16532g;
import androidx.room.B;
import androidx.room.C7009f;
import androidx.room.C7014k;
import androidx.room.H;
import androidx.room.x;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import nn.C11655a;

/* renamed from: jn.c  reason: case insensitive filesystem */
public final class C11432c implements C11431b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f98586a;

    /* renamed from: b  reason: collision with root package name */
    private final C7014k<C11433d> f98587b;

    /* renamed from: c  reason: collision with root package name */
    private C11430a f98588c;

    /* renamed from: d  reason: collision with root package name */
    private final H f98589d;

    /* renamed from: jn.c$a */
    class a extends C7014k<C11433d> {
        a(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C11433d dVar) {
            kVar.i2(1, (long) dVar.b());
            kVar.H(2, C11432c.this.f().a(dVar.a()));
            kVar.H(3, C11432c.this.f().a(dVar.d()));
            String b10 = C11432c.this.f().b(dVar.c());
            if (b10 == null) {
                kVar.I2(4);
            } else {
                kVar.H(4, b10);
            }
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR REPLACE INTO `BrowseData` (`id`,`categories`,`rooms`,`promotion`) VALUES (?,?,?,?)";
        }
    }

    /* renamed from: jn.c$b */
    class b extends H {
        b(C11432c cVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM BrowseData";
        }
    }

    /* renamed from: jn.c$c  reason: collision with other inner class name */
    class C2227c implements Callable<C11655a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f98591a;

        C2227c(B b10) {
            this.f98591a = b10;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: nn.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.ingka.ikea.core.model.product.ProductCarousel} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v3 */
        /* JADX WARNING: type inference failed for: r3v7 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public nn.C11655a call() {
            /*
                r6 = this;
                jn.c r0 = jn.C11432c.this
                androidx.room.x r0 = r0.f98586a
                androidx.room.B r1 = r6.f98591a
                r2 = 0
                r3 = 0
                android.database.Cursor r0 = O4.b.e(r0, r1, r2, r3)
                java.lang.String r1 = "categories"
                int r1 = O4.a.d(r0, r1)     // Catch:{ all -> 0x0062 }
                java.lang.String r2 = "rooms"
                int r2 = O4.a.d(r0, r2)     // Catch:{ all -> 0x0062 }
                java.lang.String r4 = "promotion"
                int r4 = O4.a.d(r0, r4)     // Catch:{ all -> 0x0062 }
                boolean r5 = r0.moveToFirst()     // Catch:{ all -> 0x0062 }
                if (r5 == 0) goto L_0x0064
                java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x0062 }
                jn.c r5 = jn.C11432c.this     // Catch:{ all -> 0x0062 }
                jn.a r5 = r5.f()     // Catch:{ all -> 0x0062 }
                java.util.List r1 = r5.c(r1)     // Catch:{ all -> 0x0062 }
                java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x0062 }
                jn.c r5 = jn.C11432c.this     // Catch:{ all -> 0x0062 }
                jn.a r5 = r5.f()     // Catch:{ all -> 0x0062 }
                java.util.List r2 = r5.c(r2)     // Catch:{ all -> 0x0062 }
                boolean r5 = r0.isNull(r4)     // Catch:{ all -> 0x0062 }
                if (r5 == 0) goto L_0x004a
                r4 = r3
                goto L_0x004e
            L_0x004a:
                java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x0062 }
            L_0x004e:
                if (r4 != 0) goto L_0x0051
                goto L_0x005b
            L_0x0051:
                jn.c r3 = jn.C11432c.this     // Catch:{ all -> 0x0062 }
                jn.a r3 = r3.f()     // Catch:{ all -> 0x0062 }
                com.ingka.ikea.core.model.product.ProductCarousel r3 = r3.d(r4)     // Catch:{ all -> 0x0062 }
            L_0x005b:
                nn.a r4 = new nn.a     // Catch:{ all -> 0x0062 }
                r4.<init>(r1, r2, r3)     // Catch:{ all -> 0x0062 }
                r3 = r4
                goto L_0x0064
            L_0x0062:
                r1 = move-exception
                goto L_0x0068
            L_0x0064:
                r0.close()
                return r3
            L_0x0068:
                r0.close()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: jn.C11432c.C2227c.call():nn.a");
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f98591a.h();
        }
    }

    public C11432c(x xVar) {
        this.f98586a = xVar;
        this.f98587b = new a(xVar);
        this.f98589d = new b(this, xVar);
    }

    /* access modifiers changed from: private */
    public synchronized C11430a f() {
        try {
            if (this.f98588c == null) {
                this.f98588c = (C11430a) this.f98586a.getTypeConverter(C11430a.class);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f98588c;
    }

    public static List<Class<?>> g() {
        return Arrays.asList(new Class[]{C11430a.class});
    }

    public C16532g<C11655a> a() {
        return C7009f.a(this.f98586a, false, new String[]{"BrowseData"}, new C2227c(B.e("SELECT * FROM BrowseData", 0)));
    }

    public void b() {
        this.f98586a.assertNotSuspendingTransaction();
        k acquire = this.f98589d.acquire();
        try {
            this.f98586a.beginTransaction();
            acquire.b0();
            this.f98586a.setTransactionSuccessful();
            this.f98586a.endTransaction();
            this.f98589d.release(acquire);
        } catch (Throwable th2) {
            this.f98589d.release(acquire);
            throw th2;
        }
    }

    public void c(C11433d dVar) {
        this.f98586a.assertNotSuspendingTransaction();
        this.f98586a.beginTransaction();
        try {
            this.f98587b.insert(dVar);
            this.f98586a.setTransactionSuccessful();
        } finally {
            this.f98586a.endTransaction();
        }
    }
}
