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

/* renamed from: s5.C  reason: case insensitive filesystem */
public final class C8717C implements C8716B {

    /* renamed from: a  reason: collision with root package name */
    private final x f55861a;

    /* renamed from: b  reason: collision with root package name */
    private final C7014k<C8715A> f55862b;

    /* renamed from: c  reason: collision with root package name */
    private final H f55863c;

    /* renamed from: s5.C$a */
    class a extends C7014k<C8715A> {
        a(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C8715A a10) {
            kVar.H(1, a10.a());
            kVar.H(2, a10.b());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    /* renamed from: s5.C$b */
    class b extends H {
        b(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public C8717C(x xVar) {
        this.f55861a = xVar;
        this.f55862b = new a(xVar);
        this.f55863c = new b(xVar);
    }

    public static List<Class<?>> e() {
        return Collections.emptyList();
    }

    public List<String> a(String str) {
        B e10 = B.e("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        e10.H(1, str);
        this.f55861a.assertNotSuspendingTransaction();
        Cursor e11 = O4.b.e(this.f55861a, e10, false, (CancellationSignal) null);
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

    public void b(C8715A a10) {
        this.f55861a.assertNotSuspendingTransaction();
        this.f55861a.beginTransaction();
        try {
            this.f55862b.insert(a10);
            this.f55861a.setTransactionSuccessful();
        } finally {
            this.f55861a.endTransaction();
        }
    }

    public void c(String str) {
        this.f55861a.assertNotSuspendingTransaction();
        k acquire = this.f55863c.acquire();
        acquire.H(1, str);
        try {
            this.f55861a.beginTransaction();
            acquire.b0();
            this.f55861a.setTransactionSuccessful();
            this.f55861a.endTransaction();
            this.f55863c.release(acquire);
        } catch (Throwable th2) {
            this.f55863c.release(acquire);
            throw th2;
        }
    }
}
