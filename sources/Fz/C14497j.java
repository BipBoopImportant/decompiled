package fz;

import Q4.k;
import XH.C16807N;
import androidx.room.B;
import androidx.room.C7009f;
import androidx.room.C7014k;
import androidx.room.x;
import dI.C17164e;
import ez.C14437a;
import gz.f;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: fz.j  reason: case insensitive filesystem */
public final class C14497j implements C14496i {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f127243a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C7014k<f> f127244b;

    /* renamed from: c  reason: collision with root package name */
    private C14437a f127245c;

    /* renamed from: fz.j$a */
    class a extends C7014k<f> {
        a(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, f fVar) {
            kVar.H(1, fVar.a());
            String d10 = C14497j.this.f().d(fVar.c());
            if (d10 == null) {
                kVar.I2(2);
            } else {
                kVar.H(2, d10);
            }
            String g10 = C14497j.this.f().g(fVar.b());
            if (g10 == null) {
                kVar.I2(3);
            } else {
                kVar.H(3, g10);
            }
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR REPLACE INTO `scan_and_go_scan_type` (`barcode`,`scanType`,`productAssortmentSpecialType`) VALUES (?,?,?)";
        }
    }

    /* renamed from: fz.j$b */
    class b implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f127247a;

        b(f fVar) {
            this.f127247a = fVar;
        }

        /* renamed from: a */
        public C16807N call() {
            C14497j.this.f127243a.beginTransaction();
            try {
                C14497j.this.f127244b.insert(this.f127247a);
                C14497j.this.f127243a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C14497j.this.f127243a.endTransaction();
            }
        }
    }

    /* renamed from: fz.j$c */
    class c implements Callable<f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f127249a;

        c(B b10) {
            this.f127249a = b10;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: gz.f} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v4 */
        /* JADX WARNING: type inference failed for: r3v6 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public gz.f call() {
            /*
                r6 = this;
                fz.j r0 = fz.C14497j.this
                androidx.room.x r0 = r0.f127243a
                androidx.room.B r1 = r6.f127249a
                r2 = 0
                r3 = 0
                android.database.Cursor r0 = O4.b.e(r0, r1, r2, r3)
                java.lang.String r1 = "barcode"
                int r1 = O4.a.d(r0, r1)     // Catch:{ all -> 0x005c }
                java.lang.String r2 = "scanType"
                int r2 = O4.a.d(r0, r2)     // Catch:{ all -> 0x005c }
                java.lang.String r4 = "productAssortmentSpecialType"
                int r4 = O4.a.d(r0, r4)     // Catch:{ all -> 0x005c }
                boolean r5 = r0.moveToFirst()     // Catch:{ all -> 0x005c }
                if (r5 == 0) goto L_0x005e
                java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x005c }
                boolean r5 = r0.isNull(r2)     // Catch:{ all -> 0x005c }
                if (r5 == 0) goto L_0x0032
                r2 = r3
                goto L_0x0036
            L_0x0032:
                java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x005c }
            L_0x0036:
                fz.j r5 = fz.C14497j.this     // Catch:{ all -> 0x005c }
                ez.a r5 = r5.f()     // Catch:{ all -> 0x005c }
                rz.O r2 = r5.i(r2)     // Catch:{ all -> 0x005c }
                boolean r5 = r0.isNull(r4)     // Catch:{ all -> 0x005c }
                if (r5 == 0) goto L_0x0047
                goto L_0x004b
            L_0x0047:
                java.lang.String r3 = r0.getString(r4)     // Catch:{ all -> 0x005c }
            L_0x004b:
                fz.j r4 = fz.C14497j.this     // Catch:{ all -> 0x005c }
                ez.a r4 = r4.f()     // Catch:{ all -> 0x005c }
                Sy.a$b r3 = r4.a(r3)     // Catch:{ all -> 0x005c }
                gz.f r4 = new gz.f     // Catch:{ all -> 0x005c }
                r4.<init>(r1, r2, r3)     // Catch:{ all -> 0x005c }
                r3 = r4
                goto L_0x005e
            L_0x005c:
                r1 = move-exception
                goto L_0x0067
            L_0x005e:
                r0.close()
                androidx.room.B r0 = r6.f127249a
                r0.h()
                return r3
            L_0x0067:
                r0.close()
                androidx.room.B r0 = r6.f127249a
                r0.h()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: fz.C14497j.c.call():gz.f");
        }
    }

    public C14497j(x xVar) {
        this.f127243a = xVar;
        this.f127244b = new a(xVar);
    }

    /* access modifiers changed from: private */
    public synchronized C14437a f() {
        try {
            if (this.f127245c == null) {
                this.f127245c = (C14437a) this.f127243a.getTypeConverter(C14437a.class);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f127245c;
    }

    public static List<Class<?>> g() {
        return Arrays.asList(new Class[]{C14437a.class});
    }

    public Object a(String str, C17164e<? super f> eVar) {
        B e10 = B.e("\n        SELECT * FROM scan_and_go_scan_type \n        WHERE barcode LIKE ? \n    ", 1);
        e10.H(1, str);
        return C7009f.b(this.f127243a, false, O4.b.a(), new c(e10), eVar);
    }

    public Object b(f fVar, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f127243a, true, new b(fVar), eVar);
    }
}
