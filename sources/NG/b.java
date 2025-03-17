package Ng;

import Q4.k;
import TJ.C16532g;
import XH.C16807N;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.B;
import androidx.room.C7009f;
import androidx.room.C7014k;
import androidx.room.H;
import androidx.room.x;
import dI.C17164e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public final class b extends a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f62020a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C7014k<Pg.a> f62021b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final H f62022c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final H f62023d;

    class a extends C7014k<Pg.a> {
        a(b bVar, x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, Pg.a aVar) {
            kVar.H(1, aVar.b());
            kVar.H(2, aVar.a());
            kVar.i2(3, aVar.d());
            kVar.H(4, aVar.c());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR REPLACE INTO `localRecentItems` (`itemNo`,`imageUrl`,`timestamp`,`productName`) VALUES (?,?,?,?)";
        }
    }

    /* renamed from: Ng.b$b  reason: collision with other inner class name */
    class C1046b extends H {
        C1046b(b bVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM LocalRecentItems WHERE timestamp <=?";
        }
    }

    class c extends H {
        c(b bVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM LocalRecentItems";
        }
    }

    class d implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Pg.a f62024a;

        d(Pg.a aVar) {
            this.f62024a = aVar;
        }

        /* renamed from: a */
        public C16807N call() {
            b.this.f62020a.beginTransaction();
            try {
                b.this.f62021b.insert(this.f62024a);
                b.this.f62020a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                b.this.f62020a.endTransaction();
            }
        }
    }

    class e implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f62026a;

        e(long j10) {
            this.f62026a = j10;
        }

        /* renamed from: a */
        public C16807N call() {
            k acquire = b.this.f62022c.acquire();
            acquire.i2(1, this.f62026a);
            try {
                b.this.f62020a.beginTransaction();
                acquire.b0();
                b.this.f62020a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                b.this.f62020a.endTransaction();
                b.this.f62022c.release(acquire);
                return n10;
            } catch (Throwable th2) {
                b.this.f62022c.release(acquire);
                throw th2;
            }
        }
    }

    class f implements Callable<C16807N> {
        f() {
        }

        /* renamed from: a */
        public C16807N call() {
            k acquire = b.this.f62023d.acquire();
            try {
                b.this.f62020a.beginTransaction();
                acquire.b0();
                b.this.f62020a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                b.this.f62020a.endTransaction();
                b.this.f62023d.release(acquire);
                return n10;
            } catch (Throwable th2) {
                b.this.f62023d.release(acquire);
                throw th2;
            }
        }
    }

    class g implements Callable<List<Pg.a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f62029a;

        g(B b10) {
            this.f62029a = b10;
        }

        /* renamed from: a */
        public List<Pg.a> call() {
            Cursor e10 = O4.b.e(b.this.f62020a, this.f62029a, false, (CancellationSignal) null);
            try {
                int d10 = O4.a.d(e10, "itemNo");
                int d11 = O4.a.d(e10, "imageUrl");
                int d12 = O4.a.d(e10, "timestamp");
                int d13 = O4.a.d(e10, "productName");
                ArrayList arrayList = new ArrayList(e10.getCount());
                while (e10.moveToNext()) {
                    arrayList.add(new Pg.a(e10.getString(d10), e10.getString(d11), e10.getLong(d12), e10.getString(d13)));
                }
                return arrayList;
            } finally {
                e10.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f62029a.h();
        }
    }

    class h implements Callable<List<Pg.a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f62031a;

        h(B b10) {
            this.f62031a = b10;
        }

        /* renamed from: a */
        public List<Pg.a> call() {
            Cursor e10 = O4.b.e(b.this.f62020a, this.f62031a, false, (CancellationSignal) null);
            try {
                int d10 = O4.a.d(e10, "itemNo");
                int d11 = O4.a.d(e10, "imageUrl");
                int d12 = O4.a.d(e10, "timestamp");
                int d13 = O4.a.d(e10, "productName");
                ArrayList arrayList = new ArrayList(e10.getCount());
                while (e10.moveToNext()) {
                    arrayList.add(new Pg.a(e10.getString(d10), e10.getString(d11), e10.getLong(d12), e10.getString(d13)));
                }
                return arrayList;
            } finally {
                e10.close();
                this.f62031a.h();
            }
        }
    }

    public b(x xVar) {
        this.f62020a = xVar;
        this.f62021b = new a(this, xVar);
        this.f62022c = new C1046b(this, xVar);
        this.f62023d = new c(this, xVar);
    }

    public static List<Class<?>> j() {
        return Collections.emptyList();
    }

    public C16532g<List<Pg.a>> a() {
        return C7009f.a(this.f62020a, false, new String[]{"LocalRecentItems"}, new g(B.e("SELECT * FROM LocalRecentItems ORDER BY timestamp DESC", 0)));
    }

    public Object b(int i10, C17164e<? super List<Pg.a>> eVar) {
        B e10 = B.e("SELECT * FROM LocalRecentItems ORDER BY timestamp DESC LIMIT ?", 1);
        e10.i2(1, (long) i10);
        return C7009f.b(this.f62020a, false, O4.b.a(), new h(e10), eVar);
    }

    public Object c(Pg.a aVar, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f62020a, true, new d(aVar), eVar);
    }

    public Object d(C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f62020a, true, new f(), eVar);
    }

    public Object e(long j10, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f62020a, true, new e(j10), eVar);
    }
}
