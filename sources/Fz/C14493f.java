package fz;

import Q4.k;
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
import ez.C14437a;
import gz.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import rz.X;

/* renamed from: fz.f  reason: case insensitive filesystem */
public final class C14493f implements C14492e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f127213a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C7014k<gz.d> f127214b;

    /* renamed from: c  reason: collision with root package name */
    private C14437a f127215c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C7014k<gz.d> f127216d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final C7013j<d.b> f127217e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final H f127218f;

    /* renamed from: fz.f$a */
    class a extends C7014k<gz.d> {
        a(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, gz.d dVar) {
            kVar.H(1, dVar.a());
            kVar.i2(2, dVar.c() ? 1 : 0);
            gz.g b10 = dVar.b();
            if (b10 != null) {
                String j10 = C14493f.this.l().j(b10.a());
                if (j10 == null) {
                    kVar.I2(3);
                } else {
                    kVar.H(3, j10);
                }
            } else {
                kVar.I2(3);
            }
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR IGNORE INTO `scan_and_go_coupon` (`coupon`,`validated`,`skippedEnum`) VALUES (?,?,?)";
        }
    }

    /* renamed from: fz.f$b */
    class b extends C7014k<gz.d> {
        b(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, gz.d dVar) {
            kVar.H(1, dVar.a());
            kVar.i2(2, dVar.c() ? 1 : 0);
            gz.g b10 = dVar.b();
            if (b10 != null) {
                String j10 = C14493f.this.l().j(b10.a());
                if (j10 == null) {
                    kVar.I2(3);
                } else {
                    kVar.H(3, j10);
                }
            } else {
                kVar.I2(3);
            }
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR REPLACE INTO `scan_and_go_coupon` (`coupon`,`validated`,`skippedEnum`) VALUES (?,?,?)";
        }
    }

    /* renamed from: fz.f$c */
    class c extends C7013j<d.b> {
        c(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, d.b bVar) {
            kVar.H(1, bVar.a());
            kVar.i2(2, bVar.c() ? 1 : 0);
            gz.g b10 = bVar.b();
            if (b10 != null) {
                String j10 = C14493f.this.l().j(b10.a());
                if (j10 == null) {
                    kVar.I2(3);
                } else {
                    kVar.H(3, j10);
                }
            } else {
                kVar.I2(3);
            }
            kVar.H(4, bVar.a());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "UPDATE OR REPLACE `scan_and_go_coupon` SET `coupon` = ?,`validated` = ?,`skippedEnum` = ? WHERE `coupon` = ?";
        }
    }

    /* renamed from: fz.f$d */
    class d extends H {
        d(C14493f fVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM scan_and_go_coupon WHERE coupon = ?";
        }
    }

    /* renamed from: fz.f$e */
    class e implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ gz.d f127222a;

        e(gz.d dVar) {
            this.f127222a = dVar;
        }

        /* renamed from: a */
        public C16807N call() {
            C14493f.this.f127213a.beginTransaction();
            try {
                C14493f.this.f127214b.insert(this.f127222a);
                C14493f.this.f127213a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C14493f.this.f127213a.endTransaction();
            }
        }
    }

    /* renamed from: fz.f$f  reason: collision with other inner class name */
    class C3114f implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f127224a;

        C3114f(List list) {
            this.f127224a = list;
        }

        /* renamed from: a */
        public C16807N call() {
            C14493f.this.f127213a.beginTransaction();
            try {
                C14493f.this.f127216d.insert(this.f127224a);
                C14493f.this.f127213a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C14493f.this.f127213a.endTransaction();
            }
        }
    }

    /* renamed from: fz.f$g */
    class g implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f127226a;

        g(List list) {
            this.f127226a = list;
        }

        /* renamed from: a */
        public C16807N call() {
            C14493f.this.f127213a.beginTransaction();
            try {
                C14493f.this.f127217e.handleMultiple(this.f127226a);
                C14493f.this.f127213a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C14493f.this.f127213a.endTransaction();
            }
        }
    }

    /* renamed from: fz.f$h */
    class h implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f127228a;

        h(String str) {
            this.f127228a = str;
        }

        /* renamed from: a */
        public C16807N call() {
            k acquire = C14493f.this.f127218f.acquire();
            acquire.H(1, this.f127228a);
            try {
                C14493f.this.f127213a.beginTransaction();
                acquire.b0();
                C14493f.this.f127213a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                C14493f.this.f127213a.endTransaction();
                C14493f.this.f127218f.release(acquire);
                return n10;
            } catch (Throwable th2) {
                C14493f.this.f127218f.release(acquire);
                throw th2;
            }
        }
    }

    /* renamed from: fz.f$i */
    class i implements Callable<List<gz.d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f127230a;

        i(B b10) {
            this.f127230a = b10;
        }

        /* renamed from: a */
        public List<gz.d> call() {
            gz.g gVar;
            Cursor e10 = O4.b.e(C14493f.this.f127213a, this.f127230a, false, (CancellationSignal) null);
            try {
                int d10 = O4.a.d(e10, "coupon");
                int d11 = O4.a.d(e10, "validated");
                int d12 = O4.a.d(e10, "skippedEnum");
                ArrayList arrayList = new ArrayList(e10.getCount());
                while (e10.moveToNext()) {
                    String string = e10.getString(d10);
                    boolean z10 = e10.getInt(d11) != 0;
                    if (!e10.isNull(d12)) {
                        X e11 = C14493f.this.l().e(e10.isNull(d12) ? null : e10.getString(d12));
                        if (e11 != null) {
                            gVar = new gz.g(e11);
                        } else {
                            throw new IllegalStateException("Expected NON-NULL 'com.ingka.ikea.scanandgo.datalayer.model.SkippedCouponReason', but it was NULL.");
                        }
                    } else {
                        gVar = null;
                    }
                    arrayList.add(new gz.d(string, z10, gVar));
                }
                e10.close();
                return arrayList;
            } catch (Throwable th2) {
                e10.close();
                throw th2;
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f127230a.h();
        }
    }

    public C14493f(x xVar) {
        this.f127213a = xVar;
        this.f127214b = new a(xVar);
        this.f127216d = new b(xVar);
        this.f127217e = new c(xVar);
        this.f127218f = new d(this, xVar);
    }

    /* access modifiers changed from: private */
    public synchronized C14437a l() {
        try {
            if (this.f127215c == null) {
                this.f127215c = (C14437a) this.f127213a.getTypeConverter(C14437a.class);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f127215c;
    }

    public static List<Class<?>> m() {
        return Arrays.asList(new Class[]{C14437a.class});
    }

    public C16532g<List<gz.d>> a() {
        return C7009f.a(this.f127213a, false, new String[]{"scan_and_go_coupon"}, new i(B.e("SELECT * FROM scan_and_go_coupon", 0)));
    }

    public Object b(List<d.b> list, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f127213a, true, new g(list), eVar);
    }

    public Object c(List<gz.d> list, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f127213a, true, new C3114f(list), eVar);
    }

    public Object d(gz.d dVar, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f127213a, true, new e(dVar), eVar);
    }

    public Object e(String str, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f127213a, true, new h(str), eVar);
    }
}
