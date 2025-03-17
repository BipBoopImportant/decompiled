package VA;

import O4.d;
import TJ.C16532g;
import UA.C13713b;
import UA.C13714c;
import VA.C13737a;
import WA.C13766d;
import WA.C13768f;
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
import j0.C5445a;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import np.C11664a;

/* renamed from: VA.d  reason: case insensitive filesystem */
public final class C13740d implements C13737a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f117172a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C7013j<C13768f> f117173b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final H f117174c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final H f117175d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final H f117176e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final H f117177f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C13714c f117178g = new C13714c();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final androidx.room.l<C13768f> f117179h;

    /* renamed from: VA.d$a */
    class a implements Callable<C16807N> {
        a() {
        }

        /* renamed from: a */
        public C16807N call() {
            Q4.k acquire = C13740d.this.f117175d.acquire();
            try {
                C13740d.this.f117172a.beginTransaction();
                acquire.b0();
                C13740d.this.f117172a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                C13740d.this.f117172a.endTransaction();
                C13740d.this.f117175d.release(acquire);
                return n10;
            } catch (Throwable th2) {
                C13740d.this.f117175d.release(acquire);
                throw th2;
            }
        }
    }

    /* renamed from: VA.d$b */
    class b implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f117181a;

        b(String str) {
            this.f117181a = str;
        }

        /* renamed from: a */
        public C16807N call() {
            Q4.k acquire = C13740d.this.f117176e.acquire();
            acquire.H(1, this.f117181a);
            try {
                C13740d.this.f117172a.beginTransaction();
                acquire.b0();
                C13740d.this.f117172a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                C13740d.this.f117172a.endTransaction();
                C13740d.this.f117176e.release(acquire);
                return n10;
            } catch (Throwable th2) {
                C13740d.this.f117176e.release(acquire);
                throw th2;
            }
        }
    }

    /* renamed from: VA.d$c */
    class c implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Instant f117183a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f117184b;

        c(Instant instant, String str) {
            this.f117183a = instant;
            this.f117184b = str;
        }

        /* renamed from: a */
        public C16807N call() {
            Q4.k acquire = C13740d.this.f117177f.acquire();
            acquire.H(1, C13740d.this.f117178g.a(this.f117183a));
            acquire.H(2, this.f117184b);
            try {
                C13740d.this.f117172a.beginTransaction();
                acquire.b0();
                C13740d.this.f117172a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                C13740d.this.f117172a.endTransaction();
                C13740d.this.f117177f.release(acquire);
                return n10;
            } catch (Throwable th2) {
                C13740d.this.f117177f.release(acquire);
                throw th2;
            }
        }
    }

    /* renamed from: VA.d$d  reason: collision with other inner class name */
    class C2888d implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13768f f117186a;

        C2888d(C13768f fVar) {
            this.f117186a = fVar;
        }

        /* renamed from: a */
        public C16807N call() {
            C13740d.this.f117172a.beginTransaction();
            try {
                C13740d.this.f117179h.c(this.f117186a);
                C13740d.this.f117172a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C13740d.this.f117172a.endTransaction();
            }
        }
    }

    /* renamed from: VA.d$e */
    class e implements Callable<C13768f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f117188a;

        e(B b10) {
            this.f117188a = b10;
        }

        /* renamed from: a */
        public C13768f call() {
            C13768f fVar = null;
            Cursor e10 = O4.b.e(C13740d.this.f117172a, this.f117188a, false, (CancellationSignal) null);
            try {
                int d10 = O4.a.d(e10, "list_id");
                int d11 = O4.a.d(e10, "name");
                int d12 = O4.a.d(e10, "updated_at");
                if (e10.moveToFirst()) {
                    fVar = new C13768f(e10.getString(d10), e10.getString(d11), C13740d.this.f117178g.b(e10.getString(d12)));
                }
                return fVar;
            } finally {
                e10.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f117188a.h();
        }
    }

    /* renamed from: VA.d$f */
    class f implements Callable<List<C13768f>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f117190a;

        f(B b10) {
            this.f117190a = b10;
        }

        /* renamed from: a */
        public List<C13768f> call() {
            Cursor e10 = O4.b.e(C13740d.this.f117172a, this.f117190a, false, (CancellationSignal) null);
            try {
                int d10 = O4.a.d(e10, "list_id");
                int d11 = O4.a.d(e10, "name");
                int d12 = O4.a.d(e10, "updated_at");
                ArrayList arrayList = new ArrayList(e10.getCount());
                while (e10.moveToNext()) {
                    arrayList.add(new C13768f(e10.getString(d10), e10.getString(d11), C13740d.this.f117178g.b(e10.getString(d12))));
                }
                return arrayList;
            } finally {
                e10.close();
                this.f117190a.h();
            }
        }
    }

    /* renamed from: VA.d$g */
    class g implements Callable<List<WA.k>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f117192a;

        g(B b10) {
            this.f117192a = b10;
        }

        /* renamed from: a */
        public List<WA.k> call() {
            Cursor e10;
            C13740d.this.f117172a.beginTransaction();
            try {
                e10 = O4.b.e(C13740d.this.f117172a, this.f117192a, true, (CancellationSignal) null);
                int d10 = O4.a.d(e10, "list_id");
                int d11 = O4.a.d(e10, "name");
                int d12 = O4.a.d(e10, "updated_at");
                C5445a aVar = new C5445a();
                while (e10.moveToNext()) {
                    String string = e10.getString(d10);
                    if (!aVar.containsKey(string)) {
                        aVar.put(string, new ArrayList());
                    }
                }
                e10.moveToPosition(-1);
                C13740d.this.v(aVar);
                ArrayList arrayList = new ArrayList(e10.getCount());
                while (e10.moveToNext()) {
                    arrayList.add(new WA.k(new C13768f(e10.getString(d10), e10.getString(d11), C13740d.this.f117178g.b(e10.getString(d12))), (ArrayList) aVar.get(e10.getString(d10))));
                }
                C13740d.this.f117172a.setTransactionSuccessful();
                e10.close();
                C13740d.this.f117172a.endTransaction();
                return arrayList;
            } catch (Throwable th2) {
                C13740d.this.f117172a.endTransaction();
                throw th2;
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f117192a.h();
        }
    }

    /* renamed from: VA.d$h */
    class h extends C7013j<C13768f> {
        h(C13740d dVar, x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(Q4.k kVar, C13768f fVar) {
            kVar.H(1, fVar.a());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "DELETE FROM `ShoppingLists` WHERE `list_id` = ?";
        }
    }

    /* renamed from: VA.d$i */
    class i extends H {
        i(C13740d dVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE ShoppingLists SET name = ? WHERE list_id = ?";
        }
    }

    /* renamed from: VA.d$j */
    class j extends H {
        j(C13740d dVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM ShoppingLists";
        }
    }

    /* renamed from: VA.d$k */
    class k extends H {
        k(C13740d dVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM ShoppingLists WHERE list_id = ?";
        }
    }

    /* renamed from: VA.d$l */
    class l extends H {
        l(C13740d dVar, x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE ShoppingLists SET updated_at=? WHERE list_id=?";
        }
    }

    /* renamed from: VA.d$m */
    class m extends C7014k<C13768f> {
        m(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(Q4.k kVar, C13768f fVar) {
            kVar.H(1, fVar.a());
            kVar.H(2, fVar.b());
            kVar.H(3, C13740d.this.f117178g.a(fVar.c()));
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT INTO `ShoppingLists` (`list_id`,`name`,`updated_at`) VALUES (?,?,?)";
        }
    }

    /* renamed from: VA.d$n */
    class n extends C7013j<C13768f> {
        n(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(Q4.k kVar, C13768f fVar) {
            kVar.H(1, fVar.a());
            kVar.H(2, fVar.b());
            kVar.H(3, C13740d.this.f117178g.a(fVar.c()));
            kVar.H(4, fVar.a());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "UPDATE `ShoppingLists` SET `list_id` = ?,`name` = ?,`updated_at` = ? WHERE `list_id` = ?";
        }
    }

    /* renamed from: VA.d$o */
    class o implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13768f f117196a;

        o(C13768f fVar) {
            this.f117196a = fVar;
        }

        /* renamed from: a */
        public C16807N call() {
            C13740d.this.f117172a.beginTransaction();
            try {
                C13740d.this.f117173b.handle(this.f117196a);
                C13740d.this.f117172a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C13740d.this.f117172a.endTransaction();
            }
        }
    }

    /* renamed from: VA.d$p */
    class p implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f117198a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f117199b;

        p(String str, String str2) {
            this.f117198a = str;
            this.f117199b = str2;
        }

        /* renamed from: a */
        public C16807N call() {
            Q4.k acquire = C13740d.this.f117174c.acquire();
            acquire.H(1, this.f117198a);
            acquire.H(2, this.f117199b);
            try {
                C13740d.this.f117172a.beginTransaction();
                acquire.b0();
                C13740d.this.f117172a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                C13740d.this.f117172a.endTransaction();
                C13740d.this.f117174c.release(acquire);
                return n10;
            } catch (Throwable th2) {
                C13740d.this.f117174c.release(acquire);
                throw th2;
            }
        }
    }

    public C13740d(x xVar) {
        this.f117172a = xVar;
        this.f117173b = new h(this, xVar);
        this.f117174c = new i(this, xVar);
        this.f117175d = new j(this, xVar);
        this.f117176e = new k(this, xVar);
        this.f117177f = new l(this, xVar);
        this.f117179h = new androidx.room.l<>(new m(xVar), new n(xVar));
    }

    /* access modifiers changed from: private */
    public void v(C5445a<String, ArrayList<WA.h>> aVar) {
        C13766d dVar;
        String str;
        int i10;
        String str2;
        int i11;
        String str3;
        int i12;
        String str4;
        int i13;
        C5445a<String, ArrayList<WA.h>> aVar2 = aVar;
        Set<String> keySet = aVar.keySet();
        if (!keySet.isEmpty()) {
            boolean z10 = true;
            if (aVar.size() > 999) {
                d.a(aVar2, true, new C13738b(this));
                return;
            }
            StringBuilder b10 = O4.e.b();
            b10.append("SELECT `list_id`,`item_no`,`item_type`,`quantity`,`updated_at`,`total_packages`,`online_sellable`,`is_communicated_online`,`is_breathtaking_item`,`is_new_item`,`environmental_fees`,`name`,`description`,`measurement`,`price_unit_text`,`unit_type`,`image_url`,`contextual_image_url`,`energy_label_url` FROM `ShoppingListItems` WHERE `list_id` IN (");
            int size = keySet.size();
            O4.e.a(b10, size);
            b10.append(")");
            B e10 = B.e(b10.toString(), size);
            int i14 = 1;
            for (String H10 : keySet) {
                e10.H(i14, H10);
                i14++;
            }
            boolean z11 = false;
            Cursor e11 = O4.b.e(this.f117172a, e10, false, (CancellationSignal) null);
            try {
                int c10 = O4.a.c(e11, "list_id");
                if (c10 == -1) {
                    e11.close();
                    return;
                }
                while (e11.moveToNext()) {
                    ArrayList arrayList = aVar2.get(e11.getString(c10));
                    if (arrayList != null) {
                        String string = e11.getString(z11 ? 1 : 0);
                        String string2 = e11.getString(z10 ? 1 : 0);
                        String string3 = e11.getString(2);
                        int i15 = e11.getInt(3);
                        Instant b11 = this.f117178g.b(e11.getString(4));
                        int i16 = e11.getInt(5);
                        boolean z12 = e11.getInt(6) != 0 ? z10 : z11;
                        boolean z13 = e11.getInt(7) != 0 ? z10 : z11;
                        boolean z14 = e11.getInt(8) != 0 ? z10 : z11;
                        boolean z15 = e11.getInt(9) != 0 ? z10 : z11;
                        List<C11664a> d10 = C13713b.f116992a.d(e11.getString(10));
                        if (!e11.isNull(11) || !e11.isNull(12) || !e11.isNull(13) || !e11.isNull(14) || !e11.isNull(15) || !e11.isNull(16) || !e11.isNull(17) || !e11.isNull(18)) {
                            String string4 = e11.getString(11);
                            String string5 = e11.getString(12);
                            String string6 = e11.isNull(13) ? null : e11.getString(13);
                            if (e11.isNull(14)) {
                                i10 = 15;
                                str = null;
                            } else {
                                str = e11.getString(14);
                                i10 = 15;
                            }
                            if (e11.isNull(i10)) {
                                i11 = 16;
                                str2 = null;
                            } else {
                                str2 = e11.getString(i10);
                                i11 = 16;
                            }
                            if (e11.isNull(i11)) {
                                i12 = 17;
                                str3 = null;
                            } else {
                                str3 = e11.getString(i11);
                                i12 = 17;
                            }
                            if (e11.isNull(i12)) {
                                i13 = 18;
                                str4 = null;
                            } else {
                                str4 = e11.getString(i12);
                                i13 = 18;
                            }
                            dVar = new C13766d(string4, string5, string6, str, str2, str3, str4, e11.isNull(i13) ? null : e11.getString(i13));
                        } else {
                            dVar = null;
                        }
                        arrayList.add(new WA.h(string, string2, string3, i15, b11, i16, z12, z13, z14, z15, d10, dVar));
                    }
                    z11 = false;
                    z10 = true;
                }
                e11.close();
            } catch (Throwable th2) {
                e11.close();
                throw th2;
            }
        }
    }

    public static List<Class<?>> w() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C16807N x(C5445a aVar) {
        v(aVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object y(List list, C17164e eVar) {
        return C13737a.C2886a.a(this, list, eVar);
    }

    public Object b(C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f117172a, true, new a(), eVar);
    }

    public C16532g<C13768f> e(String str) {
        B e10 = B.e("SELECT * FROM ShoppingLists WHERE list_id = ?", 1);
        e10.H(1, str);
        return C7009f.a(this.f117172a, false, new String[]{"ShoppingLists"}, new e(e10));
    }

    public Object f(C13768f fVar, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f117172a, true, new C2888d(fVar), eVar);
    }

    public Object g(C17164e<? super List<C13768f>> eVar) {
        B e10 = B.e("SELECT * FROM ShoppingLists ORDER BY name", 0);
        return C7009f.b(this.f117172a, false, O4.b.a(), new f(e10), eVar);
    }

    public Object h(C13768f fVar, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f117172a, true, new o(fVar), eVar);
    }

    public Object i(String str, String str2, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f117172a, true, new p(str2, str), eVar);
    }

    public Object j(String str, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f117172a, true, new b(str), eVar);
    }

    public Object k(String str, Instant instant, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f117172a, true, new c(instant, str), eVar);
    }

    public C16532g<List<WA.k>> l() {
        return C7009f.a(this.f117172a, true, new String[]{"ShoppingListItems", "ShoppingLists"}, new g(B.e("SELECT * FROM ShoppingLists", 0)));
    }

    public Object m(List<C13768f> list, C17164e<? super C16807N> eVar) {
        return y.d(this.f117172a, new C13739c(this, list), eVar);
    }
}
