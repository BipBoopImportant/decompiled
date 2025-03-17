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
import androidx.room.l;
import androidx.room.x;
import dI.C17164e;
import gz.C14524b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: fz.d  reason: case insensitive filesystem */
public final class C14491d implements C14490c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f127204a;

    /* renamed from: b  reason: collision with root package name */
    private final C7013j<C14524b> f127205b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final H f127206c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final l<C14524b> f127207d;

    /* renamed from: fz.d$a */
    class a implements Callable<List<C14524b>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f127208a;

        a(B b10) {
            this.f127208a = b10;
        }

        /* renamed from: a */
        public List<C14524b> call() {
            Cursor e10 = O4.b.e(C14491d.this.f127204a, this.f127208a, false, (CancellationSignal) null);
            try {
                int d10 = O4.a.d(e10, "title");
                int d11 = O4.a.d(e10, "coupon");
                int d12 = O4.a.d(e10, "rawValue");
                ArrayList arrayList = new ArrayList(e10.getCount());
                while (e10.moveToNext()) {
                    arrayList.add(new C14524b(e10.getString(d10), e10.isNull(d11) ? null : e10.getString(d11), e10.getDouble(d12)));
                }
                return arrayList;
            } finally {
                e10.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f127208a.h();
        }
    }

    /* renamed from: fz.d$b */
    class b extends C7013j<C14524b> {
        b(C14491d dVar, x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C14524b bVar) {
            kVar.H(1, bVar.c());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "DELETE FROM `scan_and_go_cart_discounts` WHERE `title` = ?";
        }
    }

    /* renamed from: fz.d$c */
    class c extends H {
        c(C14491d dVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM scan_and_go_cart_discounts";
        }
    }

    /* renamed from: fz.d$d  reason: collision with other inner class name */
    class C3113d extends C7014k<C14524b> {
        C3113d(C14491d dVar, x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C14524b bVar) {
            kVar.H(1, bVar.c());
            if (bVar.a() == null) {
                kVar.I2(2);
            } else {
                kVar.H(2, bVar.a());
            }
            kVar.g0(3, bVar.b());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT INTO `scan_and_go_cart_discounts` (`title`,`coupon`,`rawValue`) VALUES (?,?,?)";
        }
    }

    /* renamed from: fz.d$e */
    class e extends C7013j<C14524b> {
        e(C14491d dVar, x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C14524b bVar) {
            kVar.H(1, bVar.c());
            if (bVar.a() == null) {
                kVar.I2(2);
            } else {
                kVar.H(2, bVar.a());
            }
            kVar.g0(3, bVar.b());
            kVar.H(4, bVar.c());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "UPDATE `scan_and_go_cart_discounts` SET `title` = ?,`coupon` = ?,`rawValue` = ? WHERE `title` = ?";
        }
    }

    /* renamed from: fz.d$f */
    class f implements Callable<C16807N> {
        f() {
        }

        /* renamed from: a */
        public C16807N call() {
            k acquire = C14491d.this.f127206c.acquire();
            try {
                C14491d.this.f127204a.beginTransaction();
                acquire.b0();
                C14491d.this.f127204a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                C14491d.this.f127204a.endTransaction();
                C14491d.this.f127206c.release(acquire);
                return n10;
            } catch (Throwable th2) {
                C14491d.this.f127206c.release(acquire);
                throw th2;
            }
        }
    }

    /* renamed from: fz.d$g */
    class g implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f127211a;

        g(List list) {
            this.f127211a = list;
        }

        /* renamed from: a */
        public C16807N call() {
            C14491d.this.f127204a.beginTransaction();
            try {
                C14491d.this.f127207d.b(this.f127211a);
                C14491d.this.f127204a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C14491d.this.f127204a.endTransaction();
            }
        }
    }

    public C14491d(x xVar) {
        this.f127204a = xVar;
        this.f127205b = new b(this, xVar);
        this.f127206c = new c(this, xVar);
        this.f127207d = new l<>(new C3113d(this, xVar), new e(this, xVar));
    }

    public static List<Class<?>> g() {
        return Collections.emptyList();
    }

    public C16532g<List<C14524b>> a() {
        return C7009f.a(this.f127204a, false, new String[]{"scan_and_go_cart_discounts"}, new a(B.e("SELECT * FROM scan_and_go_cart_discounts", 0)));
    }

    public Object b(C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f127204a, true, new f(), eVar);
    }

    public Object c(List<C14524b> list, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f127204a, true, new g(list), eVar);
    }
}
