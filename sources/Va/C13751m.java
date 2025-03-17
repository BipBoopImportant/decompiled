package VA;

import Q4.k;
import TJ.C16532g;
import WA.l;
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
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: VA.m  reason: case insensitive filesystem */
public final class C13751m implements C13750l {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f117343a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C7014k<WA.g> f117344b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final l f117345c = new l();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C7013j<WA.g> f117346d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final H f117347e;

    /* renamed from: VA.m$a */
    class a extends C7014k<WA.g> {
        a(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, WA.g gVar) {
            kVar.i2(1, gVar.a());
            kVar.H(2, gVar.b());
            kVar.H(3, C13751m.this.f117345c.a(gVar.c()));
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR REPLACE INTO `ShoppingListEvents` (`id`,`list_id`,`event`) VALUES (nullif(?, 0),?,?)";
        }
    }

    /* renamed from: VA.m$b */
    class b extends C7013j<WA.g> {
        b(C13751m mVar, x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, WA.g gVar) {
            kVar.i2(1, gVar.a());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "DELETE FROM `ShoppingListEvents` WHERE `id` = ?";
        }
    }

    /* renamed from: VA.m$c */
    class c extends H {
        c(C13751m mVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM ShoppingListEvents";
        }
    }

    /* renamed from: VA.m$d */
    class d implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WA.g f117349a;

        d(WA.g gVar) {
            this.f117349a = gVar;
        }

        /* renamed from: a */
        public C16807N call() {
            C13751m.this.f117343a.beginTransaction();
            try {
                C13751m.this.f117344b.insert(this.f117349a);
                C13751m.this.f117343a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C13751m.this.f117343a.endTransaction();
            }
        }
    }

    /* renamed from: VA.m$e */
    class e implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WA.g f117351a;

        e(WA.g gVar) {
            this.f117351a = gVar;
        }

        /* renamed from: a */
        public C16807N call() {
            C13751m.this.f117343a.beginTransaction();
            try {
                C13751m.this.f117346d.handle(this.f117351a);
                C13751m.this.f117343a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C13751m.this.f117343a.endTransaction();
            }
        }
    }

    /* renamed from: VA.m$f */
    class f implements Callable<C16807N> {
        f() {
        }

        /* renamed from: a */
        public C16807N call() {
            k acquire = C13751m.this.f117347e.acquire();
            try {
                C13751m.this.f117343a.beginTransaction();
                acquire.b0();
                C13751m.this.f117343a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                C13751m.this.f117343a.endTransaction();
                C13751m.this.f117347e.release(acquire);
                return n10;
            } catch (Throwable th2) {
                C13751m.this.f117347e.release(acquire);
                throw th2;
            }
        }
    }

    /* renamed from: VA.m$g */
    class g implements Callable<WA.g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f117354a;

        g(B b10) {
            this.f117354a = b10;
        }

        /* renamed from: a */
        public WA.g call() {
            WA.g gVar = null;
            Cursor e10 = O4.b.e(C13751m.this.f117343a, this.f117354a, false, (CancellationSignal) null);
            try {
                int d10 = O4.a.d(e10, "id");
                int d11 = O4.a.d(e10, "list_id");
                int d12 = O4.a.d(e10, "event");
                if (e10.moveToFirst()) {
                    gVar = new WA.g(e10.getLong(d10), e10.getString(d11), C13751m.this.f117345c.b(e10.getString(d12)));
                }
                return gVar;
            } finally {
                e10.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f117354a.h();
        }
    }

    public C13751m(x xVar) {
        this.f117343a = xVar;
        this.f117344b = new a(xVar);
        this.f117346d = new b(this, xVar);
        this.f117347e = new c(this, xVar);
    }

    public static List<Class<?>> j() {
        return Collections.emptyList();
    }

    public Object a(C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f117343a, true, new f(), eVar);
    }

    public Object b(WA.g gVar, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f117343a, true, new d(gVar), eVar);
    }

    public C16532g<WA.g> c() {
        return C7009f.a(this.f117343a, false, new String[]{"ShoppingListEvents"}, new g(B.e("SELECT * FROM ShoppingListEvents ORDER BY id ASC LIMIT 1", 0)));
    }

    public Object d(WA.g gVar, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f117343a, true, new e(gVar), eVar);
    }
}
