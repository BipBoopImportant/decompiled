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

public final class d implements c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f62033a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C7014k<Pg.b> f62034b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final H f62035c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final H f62036d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final H f62037e;

    class a implements Callable<List<Pg.b>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f62038a;

        a(B b10) {
            this.f62038a = b10;
        }

        /* renamed from: a */
        public List<Pg.b> call() {
            Cursor e10 = O4.b.e(d.this.f62033a, this.f62038a, false, (CancellationSignal) null);
            try {
                int d10 = O4.a.d(e10, "searchPhrase");
                int d11 = O4.a.d(e10, "timeStamp");
                ArrayList arrayList = new ArrayList(e10.getCount());
                while (e10.moveToNext()) {
                    arrayList.add(new Pg.b(e10.getString(d10), e10.getLong(d11)));
                }
                return arrayList;
            } finally {
                e10.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f62038a.h();
        }
    }

    class b extends C7014k<Pg.b> {
        b(d dVar, x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, Pg.b bVar) {
            kVar.H(1, bVar.a());
            kVar.i2(2, bVar.b());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR REPLACE INTO `localRecentSearch` (`searchPhrase`,`timeStamp`) VALUES (?,?)";
        }
    }

    class c extends H {
        c(d dVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM localRecentSearch WHERE timeStamp <=?";
        }
    }

    /* renamed from: Ng.d$d  reason: collision with other inner class name */
    class C1047d extends H {
        C1047d(d dVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM localRecentSearch WHERE searchPhrase = ?";
        }
    }

    class e extends H {
        e(d dVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM localRecentSearch";
        }
    }

    class f implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Pg.b f62040a;

        f(Pg.b bVar) {
            this.f62040a = bVar;
        }

        /* renamed from: a */
        public C16807N call() {
            d.this.f62033a.beginTransaction();
            try {
                d.this.f62034b.insert(this.f62040a);
                d.this.f62033a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                d.this.f62033a.endTransaction();
            }
        }
    }

    class g implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f62042a;

        g(long j10) {
            this.f62042a = j10;
        }

        /* renamed from: a */
        public C16807N call() {
            k acquire = d.this.f62035c.acquire();
            acquire.i2(1, this.f62042a);
            try {
                d.this.f62033a.beginTransaction();
                acquire.b0();
                d.this.f62033a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                d.this.f62033a.endTransaction();
                d.this.f62035c.release(acquire);
                return n10;
            } catch (Throwable th2) {
                d.this.f62035c.release(acquire);
                throw th2;
            }
        }
    }

    class h implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f62044a;

        h(String str) {
            this.f62044a = str;
        }

        /* renamed from: a */
        public C16807N call() {
            k acquire = d.this.f62036d.acquire();
            acquire.H(1, this.f62044a);
            try {
                d.this.f62033a.beginTransaction();
                acquire.b0();
                d.this.f62033a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                d.this.f62033a.endTransaction();
                d.this.f62036d.release(acquire);
                return n10;
            } catch (Throwable th2) {
                d.this.f62036d.release(acquire);
                throw th2;
            }
        }
    }

    class i implements Callable<C16807N> {
        i() {
        }

        /* renamed from: a */
        public C16807N call() {
            k acquire = d.this.f62037e.acquire();
            try {
                d.this.f62033a.beginTransaction();
                acquire.b0();
                d.this.f62033a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                d.this.f62033a.endTransaction();
                d.this.f62037e.release(acquire);
                return n10;
            } catch (Throwable th2) {
                d.this.f62037e.release(acquire);
                throw th2;
            }
        }
    }

    public d(x xVar) {
        this.f62033a = xVar;
        this.f62034b = new b(this, xVar);
        this.f62035c = new c(this, xVar);
        this.f62036d = new C1047d(this, xVar);
        this.f62037e = new e(this, xVar);
    }

    public static List<Class<?>> k() {
        return Collections.emptyList();
    }

    public Object a(C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f62033a, true, new i(), eVar);
    }

    public C16532g<List<Pg.b>> b(int i10) {
        B e10 = B.e("SELECT * FROM localRecentSearch ORDER BY timeStamp DESC LIMIT ?", 1);
        e10.i2(1, (long) i10);
        return C7009f.a(this.f62033a, false, new String[]{"localRecentSearch"}, new a(e10));
    }

    public Object c(String str, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f62033a, true, new h(str), eVar);
    }

    public Object d(long j10, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f62033a, true, new g(j10), eVar);
    }

    public Object e(Pg.b bVar, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f62033a, true, new f(bVar), eVar);
    }
}
