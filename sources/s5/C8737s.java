package s5;

import Q4.k;
import androidx.room.C7014k;
import androidx.room.H;
import androidx.room.x;
import androidx.work.C7037f;
import java.util.Collections;
import java.util.List;

/* renamed from: s5.s  reason: case insensitive filesystem */
public final class C8737s implements C8736r {

    /* renamed from: a  reason: collision with root package name */
    private final x f55900a;

    /* renamed from: b  reason: collision with root package name */
    private final C7014k<C8735q> f55901b;

    /* renamed from: c  reason: collision with root package name */
    private final H f55902c;

    /* renamed from: d  reason: collision with root package name */
    private final H f55903d;

    /* renamed from: s5.s$a */
    class a extends C7014k<C8735q> {
        a(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C8735q qVar) {
            kVar.H(1, qVar.b());
            kVar.o2(2, C7037f.j(qVar.a()));
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    /* renamed from: s5.s$b */
    class b extends H {
        b(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: s5.s$c */
    class c extends H {
        c(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C8737s(x xVar) {
        this.f55900a = xVar;
        this.f55901b = new a(xVar);
        this.f55902c = new b(xVar);
        this.f55903d = new c(xVar);
    }

    public static List<Class<?>> d() {
        return Collections.emptyList();
    }

    public void a(String str) {
        this.f55900a.assertNotSuspendingTransaction();
        k acquire = this.f55902c.acquire();
        acquire.H(1, str);
        try {
            this.f55900a.beginTransaction();
            acquire.b0();
            this.f55900a.setTransactionSuccessful();
            this.f55900a.endTransaction();
            this.f55902c.release(acquire);
        } catch (Throwable th2) {
            this.f55902c.release(acquire);
            throw th2;
        }
    }

    public void b(C8735q qVar) {
        this.f55900a.assertNotSuspendingTransaction();
        this.f55900a.beginTransaction();
        try {
            this.f55901b.insert(qVar);
            this.f55900a.setTransactionSuccessful();
        } finally {
            this.f55900a.endTransaction();
        }
    }

    public void c() {
        this.f55900a.assertNotSuspendingTransaction();
        k acquire = this.f55903d.acquire();
        try {
            this.f55900a.beginTransaction();
            acquire.b0();
            this.f55900a.setTransactionSuccessful();
            this.f55900a.endTransaction();
            this.f55903d.release(acquire);
        } catch (Throwable th2) {
            this.f55903d.release(acquire);
            throw th2;
        }
    }
}
