package pi;

import Ln.d;
import Q4.k;
import TJ.C16532g;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.B;
import androidx.room.C7009f;
import androidx.room.C7014k;
import androidx.room.H;
import androidx.room.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public final class b extends a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f75956a;

    /* renamed from: b  reason: collision with root package name */
    private final C7014k<c> f75957b;

    /* renamed from: c  reason: collision with root package name */
    private final H f75958c;

    class a extends C7014k<c> {
        a(b bVar, x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, c cVar) {
            kVar.H(1, cVar.a());
            kVar.H(2, cVar.b());
            kVar.i2(3, (long) cVar.c());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR REPLACE INTO `CartItems` (`ProductNumber`,`ProductType`,`Quantity`) VALUES (?,?,?)";
        }
    }

    /* renamed from: pi.b$b  reason: collision with other inner class name */
    class C1395b extends H {
        C1395b(b bVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM CartItems";
        }
    }

    class c implements Callable<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f75959a;

        c(B b10) {
            this.f75959a = b10;
        }

        /* renamed from: a */
        public Integer call() {
            Cursor e10 = O4.b.e(b.this.f75956a, this.f75959a, false, (CancellationSignal) null);
            try {
                return e10.moveToFirst() ? Integer.valueOf(e10.getInt(0)) : 0;
            } finally {
                e10.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f75959a.h();
        }
    }

    public b(x xVar) {
        this.f75956a = xVar;
        this.f75957b = new a(this, xVar);
        this.f75958c = new C1395b(this, xVar);
    }

    public static List<Class<?>> h() {
        return Collections.emptyList();
    }

    public void a() {
        this.f75956a.assertNotSuspendingTransaction();
        k acquire = this.f75958c.acquire();
        try {
            this.f75956a.beginTransaction();
            acquire.b0();
            this.f75956a.setTransactionSuccessful();
            this.f75956a.endTransaction();
            this.f75958c.release(acquire);
        } catch (Throwable th2) {
            this.f75958c.release(acquire);
            throw th2;
        }
    }

    public List<c> b() {
        B e10 = B.e("SELECT * FROM CartItems", 0);
        this.f75956a.assertNotSuspendingTransaction();
        Cursor e11 = O4.b.e(this.f75956a, e10, false, (CancellationSignal) null);
        try {
            int d10 = O4.a.d(e11, "ProductNumber");
            int d11 = O4.a.d(e11, "ProductType");
            int d12 = O4.a.d(e11, "Quantity");
            ArrayList arrayList = new ArrayList(e11.getCount());
            while (e11.moveToNext()) {
                arrayList.add(new c(e11.getString(d10), e11.getString(d11), e11.getInt(d12)));
            }
            return arrayList;
        } finally {
            e11.close();
            e10.h();
        }
    }

    public C16532g<Integer> c() {
        return C7009f.a(this.f75956a, false, new String[]{"CartItems"}, new c(B.e("SELECT TOTAL(Quantity) FROM CartItems", 0)));
    }

    public void d(List<c> list) {
        this.f75956a.assertNotSuspendingTransaction();
        this.f75956a.beginTransaction();
        try {
            this.f75957b.insert(list);
            this.f75956a.setTransactionSuccessful();
        } finally {
            this.f75956a.endTransaction();
        }
    }

    public void e(List<d> list) {
        this.f75956a.beginTransaction();
        try {
            super.e(list);
            this.f75956a.setTransactionSuccessful();
        } finally {
            this.f75956a.endTransaction();
        }
    }
}
