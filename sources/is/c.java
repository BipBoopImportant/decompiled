package Is;

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
import androidx.room.y;
import dI.C17164e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public final class c extends a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f82002a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C7014k<e> f82003b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final d f82004c = new d();

    /* renamed from: d  reason: collision with root package name */
    private final C7013j<e> f82005d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final H f82006e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final H f82007f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final H f82008g;

    class a implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f82009a;

        a(String str) {
            this.f82009a = str;
        }

        /* renamed from: a */
        public C16807N call() {
            Q4.k acquire = c.this.f82008g.acquire();
            acquire.H(1, this.f82009a);
            try {
                c.this.f82002a.beginTransaction();
                acquire.b0();
                c.this.f82002a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                c.this.f82002a.endTransaction();
                c.this.f82008g.release(acquire);
                return n10;
            } catch (Throwable th2) {
                c.this.f82008g.release(acquire);
                throw th2;
            }
        }
    }

    class b implements Callable<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f82011a;

        b(B b10) {
            this.f82011a = b10;
        }

        /* renamed from: a */
        public e call() {
            e eVar = null;
            Cursor e10 = O4.b.e(c.this.f82002a, this.f82011a, false, (CancellationSignal) null);
            try {
                int d10 = O4.a.d(e10, "messageId");
                int d11 = O4.a.d(e10, "title");
                int d12 = O4.a.d(e10, "body");
                int d13 = O4.a.d(e10, "createdAt");
                int d14 = O4.a.d(e10, "updatedAt");
                int d15 = O4.a.d(e10, "imageUrl");
                int d16 = O4.a.d(e10, "imageAltText");
                int d17 = O4.a.d(e10, "read");
                int d18 = O4.a.d(e10, "source");
                int d19 = O4.a.d(e10, "purpose");
                int d20 = O4.a.d(e10, "featureName");
                int d21 = O4.a.d(e10, "featureVersion");
                int d22 = O4.a.d(e10, "data");
                if (e10.moveToFirst()) {
                    eVar = new e(e10.getString(d10), e10.getString(d11), e10.getString(d12), e10.getString(d13), e10.getString(d14), e10.getString(d15), e10.getString(d16), e10.getInt(d17) != 0, c.this.f82004c.d(e10.getString(d18)), e10.getString(d19), e10.getString(d20), e10.getInt(d21), c.this.f82004c.c(e10.getString(d22)));
                }
                return eVar;
            } finally {
                e10.close();
                this.f82011a.h();
            }
        }
    }

    /* renamed from: Is.c$c  reason: collision with other inner class name */
    class C1609c implements Callable<List<e>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f82013a;

        C1609c(B b10) {
            this.f82013a = b10;
        }

        /* renamed from: a */
        public List<e> call() {
            Cursor e10 = O4.b.e(c.this.f82002a, this.f82013a, false, (CancellationSignal) null);
            try {
                int d10 = O4.a.d(e10, "messageId");
                int d11 = O4.a.d(e10, "title");
                int d12 = O4.a.d(e10, "body");
                int d13 = O4.a.d(e10, "createdAt");
                int d14 = O4.a.d(e10, "updatedAt");
                int d15 = O4.a.d(e10, "imageUrl");
                int d16 = O4.a.d(e10, "imageAltText");
                int d17 = O4.a.d(e10, "read");
                int d18 = O4.a.d(e10, "source");
                int d19 = O4.a.d(e10, "purpose");
                int d20 = O4.a.d(e10, "featureName");
                int d21 = O4.a.d(e10, "featureVersion");
                int d22 = O4.a.d(e10, "data");
                ArrayList arrayList = new ArrayList(e10.getCount());
                while (e10.moveToNext()) {
                    String string = e10.getString(d10);
                    int i10 = d10;
                    int i11 = d22;
                    d22 = i11;
                    arrayList.add(new e(string, e10.getString(d11), e10.getString(d12), e10.getString(d13), e10.getString(d14), e10.getString(d15), e10.getString(d16), e10.getInt(d17) != 0, c.this.f82004c.d(e10.getString(d18)), e10.getString(d19), e10.getString(d20), e10.getInt(d21), c.this.f82004c.c(e10.getString(i11))));
                    d10 = i10;
                }
                return arrayList;
            } finally {
                e10.close();
                this.f82013a.h();
            }
        }
    }

    class d implements Callable<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f82015a;

        d(B b10) {
            this.f82015a = b10;
        }

        /* renamed from: a */
        public Integer call() {
            Cursor e10 = O4.b.e(c.this.f82002a, this.f82015a, false, (CancellationSignal) null);
            try {
                return e10.moveToFirst() ? Integer.valueOf(e10.getInt(0)) : 0;
            } finally {
                e10.close();
                this.f82015a.h();
            }
        }
    }

    class e implements Callable<List<e>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f82017a;

        e(B b10) {
            this.f82017a = b10;
        }

        /* renamed from: a */
        public List<e> call() {
            Cursor e10 = O4.b.e(c.this.f82002a, this.f82017a, false, (CancellationSignal) null);
            try {
                int d10 = O4.a.d(e10, "messageId");
                int d11 = O4.a.d(e10, "title");
                int d12 = O4.a.d(e10, "body");
                int d13 = O4.a.d(e10, "createdAt");
                int d14 = O4.a.d(e10, "updatedAt");
                int d15 = O4.a.d(e10, "imageUrl");
                int d16 = O4.a.d(e10, "imageAltText");
                int d17 = O4.a.d(e10, "read");
                int d18 = O4.a.d(e10, "source");
                int d19 = O4.a.d(e10, "purpose");
                int d20 = O4.a.d(e10, "featureName");
                int d21 = O4.a.d(e10, "featureVersion");
                int d22 = O4.a.d(e10, "data");
                ArrayList arrayList = new ArrayList(e10.getCount());
                while (e10.moveToNext()) {
                    String string = e10.getString(d10);
                    int i10 = d10;
                    int i11 = d22;
                    d22 = i11;
                    arrayList.add(new e(string, e10.getString(d11), e10.getString(d12), e10.getString(d13), e10.getString(d14), e10.getString(d15), e10.getString(d16), e10.getInt(d17) != 0, c.this.f82004c.d(e10.getString(d18)), e10.getString(d19), e10.getString(d20), e10.getInt(d21), c.this.f82004c.c(e10.getString(i11))));
                    d10 = i10;
                }
                return arrayList;
            } finally {
                e10.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f82017a.h();
        }
    }

    class f implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f82019a;

        f(List list) {
            this.f82019a = list;
        }

        /* renamed from: a */
        public C16807N call() {
            StringBuilder b10 = O4.e.b();
            b10.append("DELETE FROM InboxNotification WHERE source IN (");
            O4.e.a(b10, this.f82019a.size());
            b10.append(")");
            Q4.k compileStatement = c.this.f82002a.compileStatement(b10.toString());
            int i10 = 1;
            for (Ps.g a10 : this.f82019a) {
                compileStatement.H(i10, c.this.f82004c.a(a10));
                i10++;
            }
            c.this.f82002a.beginTransaction();
            try {
                compileStatement.b0();
                c.this.f82002a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                c.this.f82002a.endTransaction();
            }
        }
    }

    class g extends C7014k<e> {
        g(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(Q4.k kVar, e eVar) {
            kVar.H(1, eVar.j());
            kVar.H(2, eVar.n());
            kVar.H(3, eVar.c());
            kVar.H(4, eVar.d());
            kVar.H(5, eVar.o());
            kVar.H(6, eVar.i());
            kVar.H(7, eVar.h());
            kVar.i2(8, eVar.l() ? 1 : 0);
            kVar.H(9, c.this.f82004c.a(eVar.m()));
            kVar.H(10, eVar.k());
            kVar.H(11, eVar.f());
            kVar.i2(12, (long) eVar.g());
            kVar.H(13, c.this.f82004c.b(eVar.e()));
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR REPLACE INTO `InboxNotification` (`messageId`,`title`,`body`,`createdAt`,`updatedAt`,`imageUrl`,`imageAltText`,`read`,`source`,`purpose`,`featureName`,`featureVersion`,`data`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    class h extends C7013j<e> {
        h(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(Q4.k kVar, e eVar) {
            kVar.H(1, eVar.j());
            kVar.H(2, eVar.n());
            kVar.H(3, eVar.c());
            kVar.H(4, eVar.d());
            kVar.H(5, eVar.o());
            kVar.H(6, eVar.i());
            kVar.H(7, eVar.h());
            kVar.i2(8, eVar.l() ? 1 : 0);
            kVar.H(9, c.this.f82004c.a(eVar.m()));
            kVar.H(10, eVar.k());
            kVar.H(11, eVar.f());
            kVar.i2(12, (long) eVar.g());
            kVar.H(13, c.this.f82004c.b(eVar.e()));
            kVar.H(14, eVar.j());
            kVar.H(15, eVar.f());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "UPDATE OR REPLACE `InboxNotification` SET `messageId` = ?,`title` = ?,`body` = ?,`createdAt` = ?,`updatedAt` = ?,`imageUrl` = ?,`imageAltText` = ?,`read` = ?,`source` = ?,`purpose` = ?,`featureName` = ?,`featureVersion` = ?,`data` = ? WHERE `messageId` = ? AND `featureName` = ?";
        }
    }

    class i extends H {
        i(c cVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM InboxNotification";
        }
    }

    class j extends H {
        j(c cVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE InboxNotification SET read = ? WHERE messageId = ? AND featureName = ?";
        }
    }

    class k extends H {
        k(c cVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM InboxNotification WHERE featureName = ?";
        }
    }

    class l implements Callable<List<Long>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f82023a;

        l(List list) {
            this.f82023a = list;
        }

        /* renamed from: a */
        public List<Long> call() {
            c.this.f82002a.beginTransaction();
            try {
                List<Long> insertAndReturnIdsList = c.this.f82003b.insertAndReturnIdsList(this.f82023a);
                c.this.f82002a.setTransactionSuccessful();
                return insertAndReturnIdsList;
            } finally {
                c.this.f82002a.endTransaction();
            }
        }
    }

    class m implements Callable<C16807N> {
        m() {
        }

        /* renamed from: a */
        public C16807N call() {
            Q4.k acquire = c.this.f82006e.acquire();
            try {
                c.this.f82002a.beginTransaction();
                acquire.b0();
                c.this.f82002a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                c.this.f82002a.endTransaction();
                c.this.f82006e.release(acquire);
                return n10;
            } catch (Throwable th2) {
                c.this.f82006e.release(acquire);
                throw th2;
            }
        }
    }

    class n implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f82026a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f82027b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f82028c;

        n(boolean z10, String str, String str2) {
            this.f82026a = z10;
            this.f82027b = str;
            this.f82028c = str2;
        }

        /* renamed from: a */
        public C16807N call() {
            Q4.k acquire = c.this.f82007f.acquire();
            acquire.i2(1, this.f82026a ? 1 : 0);
            acquire.H(2, this.f82027b);
            acquire.H(3, this.f82028c);
            try {
                c.this.f82002a.beginTransaction();
                acquire.b0();
                c.this.f82002a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                c.this.f82002a.endTransaction();
                c.this.f82007f.release(acquire);
                return n10;
            } catch (Throwable th2) {
                c.this.f82007f.release(acquire);
                throw th2;
            }
        }
    }

    public c(x xVar) {
        this.f82002a = xVar;
        this.f82003b = new g(xVar);
        this.f82005d = new h(xVar);
        this.f82006e = new i(this, xVar);
        this.f82007f = new j(this, xVar);
        this.f82008g = new k(this, xVar);
    }

    public static List<Class<?>> u() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object v(String str, List list, boolean z10, C17164e eVar) {
        return super.i(str, list, z10, eVar);
    }

    public Object a(C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f82002a, true, new m(), eVar);
    }

    public Object b(String str, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f82002a, true, new a(str), eVar);
    }

    public Object c(List<? extends Ps.g> list, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f82002a, true, new f(list), eVar);
    }

    public C16532g<List<e>> d() {
        return C7009f.a(this.f82002a, false, new String[]{"InboxNotification"}, new e(B.e("SELECT * FROM InboxNotification", 0)));
    }

    public Object e(String str, C17164e<? super List<e>> eVar) {
        B e10 = B.e("SELECT * FROM InboxNotification WHERE featureName = ?", 1);
        e10.H(1, str);
        return C7009f.b(this.f82002a, false, O4.b.a(), new C1609c(e10), eVar);
    }

    public Object f(String str, String str2, C17164e<? super e> eVar) {
        B e10 = B.e("SELECT * FROM InboxNotification WHERE messageId = ? AND featureName = ?", 2);
        e10.H(1, str);
        e10.H(2, str2);
        return C7009f.b(this.f82002a, false, O4.b.a(), new b(e10), eVar);
    }

    public Object g(C17164e<? super Integer> eVar) {
        B e10 = B.e("SELECT COUNT(*) FROM InboxNotification WHERE read = 0", 0);
        return C7009f.b(this.f82002a, false, O4.b.a(), new d(e10), eVar);
    }

    public Object h(List<e> list, C17164e<? super List<Long>> eVar) {
        return C7009f.c(this.f82002a, true, new l(list), eVar);
    }

    public Object i(String str, List<e> list, boolean z10, C17164e<? super Js.a> eVar) {
        return y.d(this.f82002a, new b(this, str, list, z10), eVar);
    }

    public Object k(String str, String str2, boolean z10, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f82002a, true, new n(z10, str, str2), eVar);
    }
}
