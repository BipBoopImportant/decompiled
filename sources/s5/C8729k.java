package s5;

import Q4.k;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.B;
import androidx.room.C7014k;
import androidx.room.H;
import androidx.room.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: s5.k  reason: case insensitive filesystem */
public final class C8729k implements C8728j {

    /* renamed from: a  reason: collision with root package name */
    private final x f55884a;

    /* renamed from: b  reason: collision with root package name */
    private final C7014k<C8727i> f55885b;

    /* renamed from: c  reason: collision with root package name */
    private final H f55886c;

    /* renamed from: d  reason: collision with root package name */
    private final H f55887d;

    /* renamed from: s5.k$a */
    class a extends C7014k<C8727i> {
        a(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C8727i iVar) {
            kVar.H(1, iVar.f55881a);
            kVar.i2(2, (long) iVar.a());
            kVar.i2(3, (long) iVar.f55883c);
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }
    }

    /* renamed from: s5.k$b */
    class b extends H {
        b(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* renamed from: s5.k$c */
    class c extends H {
        c(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C8729k(x xVar) {
        this.f55884a = xVar;
        this.f55885b = new a(xVar);
        this.f55886c = new b(xVar);
        this.f55887d = new c(xVar);
    }

    public static List<Class<?>> h() {
        return Collections.emptyList();
    }

    public void b(C8727i iVar) {
        this.f55884a.assertNotSuspendingTransaction();
        this.f55884a.beginTransaction();
        try {
            this.f55885b.insert(iVar);
            this.f55884a.setTransactionSuccessful();
        } finally {
            this.f55884a.endTransaction();
        }
    }

    public C8727i d(String str, int i10) {
        B e10 = B.e("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        e10.H(1, str);
        e10.i2(2, (long) i10);
        this.f55884a.assertNotSuspendingTransaction();
        C8727i iVar = null;
        Cursor e11 = O4.b.e(this.f55884a, e10, false, (CancellationSignal) null);
        try {
            int d10 = O4.a.d(e11, "work_spec_id");
            int d11 = O4.a.d(e11, "generation");
            int d12 = O4.a.d(e11, "system_id");
            if (e11.moveToFirst()) {
                iVar = new C8727i(e11.getString(d10), e11.getInt(d11), e11.getInt(d12));
            }
            return iVar;
        } finally {
            e11.close();
            e10.h();
        }
    }

    public List<String> e() {
        B e10 = B.e("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f55884a.assertNotSuspendingTransaction();
        Cursor e11 = O4.b.e(this.f55884a, e10, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(e11.getCount());
            while (e11.moveToNext()) {
                arrayList.add(e11.getString(0));
            }
            return arrayList;
        } finally {
            e11.close();
            e10.h();
        }
    }

    public void f(String str, int i10) {
        this.f55884a.assertNotSuspendingTransaction();
        k acquire = this.f55886c.acquire();
        acquire.H(1, str);
        acquire.i2(2, (long) i10);
        try {
            this.f55884a.beginTransaction();
            acquire.b0();
            this.f55884a.setTransactionSuccessful();
            this.f55884a.endTransaction();
            this.f55886c.release(acquire);
        } catch (Throwable th2) {
            this.f55886c.release(acquire);
            throw th2;
        }
    }

    public void g(String str) {
        this.f55884a.assertNotSuspendingTransaction();
        k acquire = this.f55887d.acquire();
        acquire.H(1, str);
        try {
            this.f55884a.beginTransaction();
            acquire.b0();
            this.f55884a.setTransactionSuccessful();
            this.f55884a.endTransaction();
            this.f55887d.release(acquire);
        } catch (Throwable th2) {
            this.f55887d.release(acquire);
            throw th2;
        }
    }
}
