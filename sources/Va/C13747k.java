package VA;

import O4.a;
import O4.b;
import Q4.k;
import TJ.C16532g;
import UA.C13713b;
import UA.C13714c;
import UA.C13715d;
import VA.C13741e;
import WA.C13763a;
import WA.C13764b;
import WA.C13765c;
import WA.C13766d;
import WA.C13767e;
import XH.C16807N;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C7009f;
import androidx.room.C7013j;
import androidx.room.C7014k;
import androidx.room.H;
import dI.C17164e;
import j0.C5445a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: VA.k  reason: case insensitive filesystem */
public final class C13747k implements C13741e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final androidx.room.x f117292a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final H f117293b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final H f117294c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final H f117295d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final H f117296e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final androidx.room.l<WA.h> f117297f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C13714c f117298g = new C13714c();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final androidx.room.l<C13763a> f117299h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final androidx.room.l<C13764b> f117300i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final androidx.room.l<C13767e> f117301j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final C13715d f117302k = new C13715d();

    /* renamed from: VA.k$A */
    class A extends C7013j<C13763a> {
        A(C13747k kVar, androidx.room.x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C13763a aVar) {
            kVar.H(1, aVar.c());
            kVar.H(2, aVar.b());
            kVar.i2(3, (long) aVar.a());
            kVar.i2(4, (long) aVar.e());
            C13766d d10 = aVar.d();
            if (d10 != null) {
                kVar.H(5, d10.f());
                kVar.H(6, d10.b());
                if (d10.e() == null) {
                    kVar.I2(7);
                } else {
                    kVar.H(7, d10.e());
                }
                if (d10.g() == null) {
                    kVar.I2(8);
                } else {
                    kVar.H(8, d10.g());
                }
                if (d10.h() == null) {
                    kVar.I2(9);
                } else {
                    kVar.H(9, d10.h());
                }
                if (d10.d() == null) {
                    kVar.I2(10);
                } else {
                    kVar.H(10, d10.d());
                }
                if (d10.a() == null) {
                    kVar.I2(11);
                } else {
                    kVar.H(11, d10.a());
                }
                if (d10.c() == null) {
                    kVar.I2(12);
                } else {
                    kVar.H(12, d10.c());
                }
            } else {
                kVar.I2(5);
                kVar.I2(6);
                kVar.I2(7);
                kVar.I2(8);
                kVar.I2(9);
                kVar.I2(10);
                kVar.I2(11);
                kVar.I2(12);
            }
            kVar.H(13, aVar.c());
            kVar.H(14, aVar.b());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "UPDATE `ArticleDetails` SET `parent_item_no` = ?,`parent_article_item_no` = ?,`number_of_packages` = ?,`quantity_per_item` = ?,`name` = ?,`description` = ?,`measurement` = ?,`price_unit_text` = ?,`unit_type` = ?,`image_url` = ?,`contextual_image_url` = ?,`energy_label_url` = ? WHERE `parent_item_no` = ? AND `parent_article_item_no` = ?";
        }
    }

    /* renamed from: VA.k$B */
    class B extends C7014k<C13764b> {
        B(C13747k kVar, androidx.room.x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C13764b bVar) {
            kVar.H(1, bVar.a());
            kVar.H(2, bVar.c());
            kVar.H(3, bVar.b());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT INTO `ArticleItems` (`item_no`,`parent_item_no`,`list_id`) VALUES (?,?,?)";
        }
    }

    /* renamed from: VA.k$a  reason: case insensitive filesystem */
    class C13748a extends C7013j<C13764b> {
        C13748a(C13747k kVar, androidx.room.x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C13764b bVar) {
            kVar.H(1, bVar.a());
            kVar.H(2, bVar.c());
            kVar.H(3, bVar.b());
            kVar.H(4, bVar.a());
            kVar.H(5, bVar.b());
            kVar.H(6, bVar.c());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "UPDATE `ArticleItems` SET `item_no` = ?,`parent_item_no` = ?,`list_id` = ? WHERE `item_no` = ? AND `list_id` = ? AND `parent_item_no` = ?";
        }
    }

    /* renamed from: VA.k$b  reason: case insensitive filesystem */
    class C13749b extends C7014k<C13767e> {
        C13749b(androidx.room.x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C13767e eVar) {
            kVar.H(1, eVar.c());
            kVar.H(2, eVar.g());
            kVar.g0(3, eVar.e());
            kVar.g0(4, eVar.f());
            if (eVar.a() == null) {
                kVar.I2(5);
            } else {
                kVar.H(5, eVar.a());
            }
            String a10 = eVar.h() == null ? null : C13747k.this.f117302k.a(eVar.h());
            if (a10 == null) {
                kVar.I2(6);
            } else {
                kVar.H(6, a10);
            }
            if (eVar.d() == null) {
                kVar.I2(7);
            } else {
                kVar.g0(7, eVar.d().doubleValue());
            }
            if (eVar.b() == null) {
                kVar.I2(8);
            } else {
                kVar.g0(8, eVar.b().doubleValue());
            }
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT INTO `SalesPrices` (`parent_item_no`,`type`,`price`,`tax`,`comparison_price`,`valid_until`,`previous_price`,`lowest_previous_price`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: VA.k$c */
    class c extends C7013j<C13767e> {
        c(androidx.room.x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C13767e eVar) {
            kVar.H(1, eVar.c());
            kVar.H(2, eVar.g());
            kVar.g0(3, eVar.e());
            kVar.g0(4, eVar.f());
            if (eVar.a() == null) {
                kVar.I2(5);
            } else {
                kVar.H(5, eVar.a());
            }
            String a10 = eVar.h() == null ? null : C13747k.this.f117302k.a(eVar.h());
            if (a10 == null) {
                kVar.I2(6);
            } else {
                kVar.H(6, a10);
            }
            if (eVar.d() == null) {
                kVar.I2(7);
            } else {
                kVar.g0(7, eVar.d().doubleValue());
            }
            if (eVar.b() == null) {
                kVar.I2(8);
            } else {
                kVar.g0(8, eVar.b().doubleValue());
            }
            kVar.H(9, eVar.c());
            kVar.H(10, eVar.g());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "UPDATE `SalesPrices` SET `parent_item_no` = ?,`type` = ?,`price` = ?,`tax` = ?,`comparison_price` = ?,`valid_until` = ?,`previous_price` = ?,`lowest_previous_price` = ? WHERE `parent_item_no` = ? AND `type` = ?";
        }
    }

    /* renamed from: VA.k$d */
    class d implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f117305a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f117306b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f117307c;

        d(int i10, String str, String str2) {
            this.f117305a = i10;
            this.f117306b = str;
            this.f117307c = str2;
        }

        /* renamed from: a */
        public C16807N call() {
            k acquire = C13747k.this.f117293b.acquire();
            acquire.i2(1, (long) this.f117305a);
            acquire.H(2, this.f117306b);
            acquire.H(3, this.f117307c);
            try {
                C13747k.this.f117292a.beginTransaction();
                acquire.b0();
                C13747k.this.f117292a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                C13747k.this.f117292a.endTransaction();
                C13747k.this.f117293b.release(acquire);
                return n10;
            } catch (Throwable th2) {
                C13747k.this.f117293b.release(acquire);
                throw th2;
            }
        }
    }

    /* renamed from: VA.k$e */
    class e implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f117309a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f117310b;

        e(String str, String str2) {
            this.f117309a = str;
            this.f117310b = str2;
        }

        /* renamed from: a */
        public C16807N call() {
            k acquire = C13747k.this.f117294c.acquire();
            acquire.H(1, this.f117309a);
            acquire.H(2, this.f117310b);
            try {
                C13747k.this.f117292a.beginTransaction();
                acquire.b0();
                C13747k.this.f117292a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                C13747k.this.f117292a.endTransaction();
                C13747k.this.f117294c.release(acquire);
                return n10;
            } catch (Throwable th2) {
                C13747k.this.f117294c.release(acquire);
                throw th2;
            }
        }
    }

    /* renamed from: VA.k$f */
    class f implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f117312a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f117313b;

        f(String str, String str2) {
            this.f117312a = str;
            this.f117313b = str2;
        }

        /* renamed from: a */
        public C16807N call() {
            k acquire = C13747k.this.f117295d.acquire();
            acquire.H(1, this.f117312a);
            acquire.H(2, this.f117313b);
            try {
                C13747k.this.f117292a.beginTransaction();
                acquire.b0();
                C13747k.this.f117292a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                C13747k.this.f117292a.endTransaction();
                C13747k.this.f117295d.release(acquire);
                return n10;
            } catch (Throwable th2) {
                C13747k.this.f117295d.release(acquire);
                throw th2;
            }
        }
    }

    /* renamed from: VA.k$g */
    class g implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f117315a;

        g(String str) {
            this.f117315a = str;
        }

        /* renamed from: a */
        public C16807N call() {
            k acquire = C13747k.this.f117296e.acquire();
            acquire.H(1, this.f117315a);
            try {
                C13747k.this.f117292a.beginTransaction();
                acquire.b0();
                C13747k.this.f117292a.setTransactionSuccessful();
                C16807N n10 = C16807N.f139792a;
                C13747k.this.f117292a.endTransaction();
                C13747k.this.f117296e.release(acquire);
                return n10;
            } catch (Throwable th2) {
                C13747k.this.f117296e.release(acquire);
                throw th2;
            }
        }
    }

    /* renamed from: VA.k$h */
    class h implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WA.h f117317a;

        h(WA.h hVar) {
            this.f117317a = hVar;
        }

        /* renamed from: a */
        public C16807N call() {
            C13747k.this.f117292a.beginTransaction();
            try {
                C13747k.this.f117297f.c(this.f117317a);
                C13747k.this.f117292a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C13747k.this.f117292a.endTransaction();
            }
        }
    }

    /* renamed from: VA.k$i */
    class i implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13763a f117319a;

        i(C13763a aVar) {
            this.f117319a = aVar;
        }

        /* renamed from: a */
        public C16807N call() {
            C13747k.this.f117292a.beginTransaction();
            try {
                C13747k.this.f117299h.c(this.f117319a);
                C13747k.this.f117292a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C13747k.this.f117292a.endTransaction();
            }
        }
    }

    /* renamed from: VA.k$j */
    class j implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13764b f117321a;

        j(C13764b bVar) {
            this.f117321a = bVar;
        }

        /* renamed from: a */
        public C16807N call() {
            C13747k.this.f117292a.beginTransaction();
            try {
                C13747k.this.f117300i.c(this.f117321a);
                C13747k.this.f117292a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C13747k.this.f117292a.endTransaction();
            }
        }
    }

    /* renamed from: VA.k$k  reason: collision with other inner class name */
    class C2894k extends H {
        C2894k(C13747k kVar, androidx.room.x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE ShoppingListItems SET quantity=? WHERE item_no=? AND list_id=?";
        }
    }

    /* renamed from: VA.k$l */
    class l implements Callable<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13767e f117323a;

        l(C13767e eVar) {
            this.f117323a = eVar;
        }

        /* renamed from: a */
        public C16807N call() {
            C13747k.this.f117292a.beginTransaction();
            try {
                C13747k.this.f117301j.c(this.f117323a);
                C13747k.this.f117292a.setTransactionSuccessful();
                return C16807N.f139792a;
            } finally {
                C13747k.this.f117292a.endTransaction();
            }
        }
    }

    /* renamed from: VA.k$m */
    class m implements Callable<List<WA.h>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.room.B f117325a;

        m(androidx.room.B b10) {
            this.f117325a = b10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:50:0x017b A[Catch:{ all -> 0x0149 }] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x017e A[Catch:{ all -> 0x0149 }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x018a A[Catch:{ all -> 0x0149 }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x018d A[Catch:{ all -> 0x0149 }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0199 A[Catch:{ all -> 0x0149 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x019c A[Catch:{ all -> 0x0149 }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x01a8 A[Catch:{ all -> 0x0149 }] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x01ab A[Catch:{ all -> 0x0149 }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01b7 A[Catch:{ all -> 0x0149 }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x01ba A[Catch:{ all -> 0x0149 }] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x01c6 A[Catch:{ all -> 0x0149 }] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01c9 A[Catch:{ all -> 0x0149 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<WA.h> call() {
            /*
                r46 = this;
                r1 = r46
                VA.k r0 = VA.C13747k.this
                androidx.room.x r0 = r0.f117292a
                androidx.room.B r2 = r1.f117325a
                r3 = 0
                r4 = 0
                android.database.Cursor r2 = O4.b.e(r0, r2, r3, r4)
                java.lang.String r0 = "list_id"
                int r0 = O4.a.d(r2, r0)     // Catch:{ all -> 0x0149 }
                java.lang.String r5 = "item_no"
                int r5 = O4.a.d(r2, r5)     // Catch:{ all -> 0x0149 }
                java.lang.String r6 = "item_type"
                int r6 = O4.a.d(r2, r6)     // Catch:{ all -> 0x0149 }
                java.lang.String r7 = "quantity"
                int r7 = O4.a.d(r2, r7)     // Catch:{ all -> 0x0149 }
                java.lang.String r8 = "updated_at"
                int r8 = O4.a.d(r2, r8)     // Catch:{ all -> 0x0149 }
                java.lang.String r9 = "total_packages"
                int r9 = O4.a.d(r2, r9)     // Catch:{ all -> 0x0149 }
                java.lang.String r10 = "online_sellable"
                int r10 = O4.a.d(r2, r10)     // Catch:{ all -> 0x0149 }
                java.lang.String r11 = "is_communicated_online"
                int r11 = O4.a.d(r2, r11)     // Catch:{ all -> 0x0149 }
                java.lang.String r12 = "is_breathtaking_item"
                int r12 = O4.a.d(r2, r12)     // Catch:{ all -> 0x0149 }
                java.lang.String r13 = "is_new_item"
                int r13 = O4.a.d(r2, r13)     // Catch:{ all -> 0x0149 }
                java.lang.String r14 = "environmental_fees"
                int r14 = O4.a.d(r2, r14)     // Catch:{ all -> 0x0149 }
                java.lang.String r15 = "name"
                int r15 = O4.a.d(r2, r15)     // Catch:{ all -> 0x0149 }
                java.lang.String r3 = "description"
                int r3 = O4.a.d(r2, r3)     // Catch:{ all -> 0x0149 }
                java.lang.String r4 = "measurement"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x0149 }
                r16 = r4
                java.lang.String r4 = "price_unit_text"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x0149 }
                r17 = r4
                java.lang.String r4 = "unit_type"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x0149 }
                r18 = r4
                java.lang.String r4 = "image_url"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x0149 }
                r19 = r4
                java.lang.String r4 = "contextual_image_url"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x0149 }
                r20 = r4
                java.lang.String r4 = "energy_label_url"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x0149 }
                r21 = r4
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0149 }
                r22 = r3
                int r3 = r2.getCount()     // Catch:{ all -> 0x0149 }
                r4.<init>(r3)     // Catch:{ all -> 0x0149 }
            L_0x0099:
                boolean r3 = r2.moveToNext()     // Catch:{ all -> 0x0149 }
                if (r3 == 0) goto L_0x01fe
                java.lang.String r24 = r2.getString(r0)     // Catch:{ all -> 0x0149 }
                java.lang.String r25 = r2.getString(r5)     // Catch:{ all -> 0x0149 }
                java.lang.String r26 = r2.getString(r6)     // Catch:{ all -> 0x0149 }
                int r27 = r2.getInt(r7)     // Catch:{ all -> 0x0149 }
                java.lang.String r3 = r2.getString(r8)     // Catch:{ all -> 0x0149 }
                r36 = r0
                VA.k r0 = VA.C13747k.this     // Catch:{ all -> 0x0149 }
                UA.c r0 = r0.f117298g     // Catch:{ all -> 0x0149 }
                java.time.Instant r28 = r0.b(r3)     // Catch:{ all -> 0x0149 }
                int r29 = r2.getInt(r9)     // Catch:{ all -> 0x0149 }
                int r0 = r2.getInt(r10)     // Catch:{ all -> 0x0149 }
                r3 = 1
                if (r0 == 0) goto L_0x00cd
                r30 = r3
                goto L_0x00cf
            L_0x00cd:
                r30 = 0
            L_0x00cf:
                int r0 = r2.getInt(r11)     // Catch:{ all -> 0x0149 }
                if (r0 == 0) goto L_0x00d8
                r31 = r3
                goto L_0x00da
            L_0x00d8:
                r31 = 0
            L_0x00da:
                int r0 = r2.getInt(r12)     // Catch:{ all -> 0x0149 }
                if (r0 == 0) goto L_0x00e3
                r32 = r3
                goto L_0x00e5
            L_0x00e3:
                r32 = 0
            L_0x00e5:
                int r0 = r2.getInt(r13)     // Catch:{ all -> 0x0149 }
                if (r0 == 0) goto L_0x00ee
                r33 = r3
                goto L_0x00f0
            L_0x00ee:
                r33 = 0
            L_0x00f0:
                java.lang.String r0 = r2.getString(r14)     // Catch:{ all -> 0x0149 }
                UA.b r3 = UA.C13713b.f116992a     // Catch:{ all -> 0x0149 }
                java.util.List r34 = r3.d(r0)     // Catch:{ all -> 0x0149 }
                boolean r0 = r2.isNull(r15)     // Catch:{ all -> 0x0149 }
                if (r0 == 0) goto L_0x0168
                r0 = r22
                boolean r3 = r2.isNull(r0)     // Catch:{ all -> 0x0149 }
                if (r3 == 0) goto L_0x0165
                r3 = r16
                boolean r16 = r2.isNull(r3)     // Catch:{ all -> 0x0149 }
                if (r16 == 0) goto L_0x0160
                r16 = r5
                r5 = r17
                boolean r17 = r2.isNull(r5)     // Catch:{ all -> 0x0149 }
                if (r17 == 0) goto L_0x015b
                r17 = r6
                r6 = r18
                boolean r18 = r2.isNull(r6)     // Catch:{ all -> 0x0149 }
                if (r18 == 0) goto L_0x0156
                r18 = r7
                r7 = r19
                boolean r19 = r2.isNull(r7)     // Catch:{ all -> 0x0149 }
                if (r19 == 0) goto L_0x0151
                r19 = r8
                r8 = r20
                boolean r20 = r2.isNull(r8)     // Catch:{ all -> 0x0149 }
                if (r20 == 0) goto L_0x014c
                r20 = r9
                r9 = r21
                boolean r21 = r2.isNull(r9)     // Catch:{ all -> 0x0149 }
                if (r21 != 0) goto L_0x0143
                goto L_0x016d
            L_0x0143:
                r22 = r0
                r35 = 0
                goto L_0x01da
            L_0x0149:
                r0 = move-exception
                goto L_0x0207
            L_0x014c:
                r20 = r9
                r9 = r21
                goto L_0x016d
            L_0x0151:
                r19 = r8
                r8 = r20
                goto L_0x014c
            L_0x0156:
                r18 = r7
                r7 = r19
                goto L_0x0151
            L_0x015b:
                r17 = r6
                r6 = r18
                goto L_0x0156
            L_0x0160:
                r16 = r5
                r5 = r17
                goto L_0x015b
            L_0x0165:
                r3 = r16
                goto L_0x0160
            L_0x0168:
                r3 = r16
                r0 = r22
                goto L_0x0160
            L_0x016d:
                java.lang.String r38 = r2.getString(r15)     // Catch:{ all -> 0x0149 }
                java.lang.String r39 = r2.getString(r0)     // Catch:{ all -> 0x0149 }
                boolean r21 = r2.isNull(r3)     // Catch:{ all -> 0x0149 }
                if (r21 == 0) goto L_0x017e
                r40 = 0
                goto L_0x0184
            L_0x017e:
                java.lang.String r21 = r2.getString(r3)     // Catch:{ all -> 0x0149 }
                r40 = r21
            L_0x0184:
                boolean r21 = r2.isNull(r5)     // Catch:{ all -> 0x0149 }
                if (r21 == 0) goto L_0x018d
                r41 = 0
                goto L_0x0193
            L_0x018d:
                java.lang.String r21 = r2.getString(r5)     // Catch:{ all -> 0x0149 }
                r41 = r21
            L_0x0193:
                boolean r21 = r2.isNull(r6)     // Catch:{ all -> 0x0149 }
                if (r21 == 0) goto L_0x019c
                r42 = 0
                goto L_0x01a2
            L_0x019c:
                java.lang.String r21 = r2.getString(r6)     // Catch:{ all -> 0x0149 }
                r42 = r21
            L_0x01a2:
                boolean r21 = r2.isNull(r7)     // Catch:{ all -> 0x0149 }
                if (r21 == 0) goto L_0x01ab
                r43 = 0
                goto L_0x01b1
            L_0x01ab:
                java.lang.String r21 = r2.getString(r7)     // Catch:{ all -> 0x0149 }
                r43 = r21
            L_0x01b1:
                boolean r21 = r2.isNull(r8)     // Catch:{ all -> 0x0149 }
                if (r21 == 0) goto L_0x01ba
                r44 = 0
                goto L_0x01c0
            L_0x01ba:
                java.lang.String r21 = r2.getString(r8)     // Catch:{ all -> 0x0149 }
                r44 = r21
            L_0x01c0:
                boolean r21 = r2.isNull(r9)     // Catch:{ all -> 0x0149 }
                if (r21 == 0) goto L_0x01c9
                r45 = 0
                goto L_0x01cf
            L_0x01c9:
                java.lang.String r21 = r2.getString(r9)     // Catch:{ all -> 0x0149 }
                r45 = r21
            L_0x01cf:
                WA.d r21 = new WA.d     // Catch:{ all -> 0x0149 }
                r37 = r21
                r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ all -> 0x0149 }
                r22 = r0
                r35 = r21
            L_0x01da:
                WA.h r0 = new WA.h     // Catch:{ all -> 0x0149 }
                r23 = r0
                r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0149 }
                r4.add(r0)     // Catch:{ all -> 0x0149 }
                r21 = r9
                r9 = r20
                r0 = r36
                r20 = r8
                r8 = r19
                r19 = r7
                r7 = r18
                r18 = r6
                r6 = r17
                r17 = r5
                r5 = r16
                r16 = r3
                goto L_0x0099
            L_0x01fe:
                r2.close()
                androidx.room.B r0 = r1.f117325a
                r0.h()
                return r4
            L_0x0207:
                r2.close()
                androidx.room.B r2 = r1.f117325a
                r2.h()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: VA.C13747k.m.call():java.util.List");
        }
    }

    /* renamed from: VA.k$n */
    class n implements Callable<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.room.B f117327a;

        n(androidx.room.B b10) {
            this.f117327a = b10;
        }

        /* renamed from: a */
        public Integer call() {
            Cursor e10 = b.e(C13747k.this.f117292a, this.f117327a, false, (CancellationSignal) null);
            try {
                return e10.moveToFirst() ? Integer.valueOf(e10.getInt(0)) : 0;
            } finally {
                e10.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f117327a.h();
        }
    }

    /* renamed from: VA.k$o */
    class o implements Callable<List<String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.room.B f117329a;

        o(androidx.room.B b10) {
            this.f117329a = b10;
        }

        /* renamed from: a */
        public List<String> call() {
            Cursor e10 = b.e(C13747k.this.f117292a, this.f117329a, false, (CancellationSignal) null);
            try {
                ArrayList arrayList = new ArrayList(e10.getCount());
                while (e10.moveToNext()) {
                    arrayList.add(e10.getString(0));
                }
                return arrayList;
            } finally {
                e10.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f117329a.h();
        }
    }

    /* renamed from: VA.k$p */
    class p implements Callable<List<WA.j>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.room.B f117331a;

        p(androidx.room.B b10) {
            this.f117331a = b10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:61:0x01bc A[Catch:{ all -> 0x00b9, all -> 0x0270 }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x01bf A[Catch:{ all -> 0x00b9, all -> 0x0270 }] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x01cb A[Catch:{ all -> 0x00b9, all -> 0x0270 }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01ce A[Catch:{ all -> 0x00b9, all -> 0x0270 }] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x01da A[Catch:{ all -> 0x00b9, all -> 0x0270 }] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x01dd A[Catch:{ all -> 0x00b9, all -> 0x0270 }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01e9 A[Catch:{ all -> 0x00b9, all -> 0x0270 }] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01ec A[Catch:{ all -> 0x00b9, all -> 0x0270 }] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x01f8 A[Catch:{ all -> 0x00b9, all -> 0x0270 }] */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01fb A[Catch:{ all -> 0x00b9, all -> 0x0270 }] */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0207 A[Catch:{ all -> 0x00b9, all -> 0x0270 }] */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x020a A[Catch:{ all -> 0x00b9, all -> 0x0270 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<WA.j> call() {
            /*
                r48 = this;
                r1 = r48
                VA.k r0 = VA.C13747k.this
                androidx.room.x r0 = r0.f117292a
                r0.beginTransaction()
                VA.k r0 = VA.C13747k.this     // Catch:{ all -> 0x0270 }
                androidx.room.x r0 = r0.f117292a     // Catch:{ all -> 0x0270 }
                androidx.room.B r2 = r1.f117331a     // Catch:{ all -> 0x0270 }
                r3 = 1
                r4 = 0
                android.database.Cursor r2 = O4.b.e(r0, r2, r3, r4)     // Catch:{ all -> 0x0270 }
                java.lang.String r0 = "list_id"
                int r0 = O4.a.d(r2, r0)     // Catch:{ all -> 0x00b9 }
                java.lang.String r5 = "item_no"
                int r5 = O4.a.d(r2, r5)     // Catch:{ all -> 0x00b9 }
                java.lang.String r6 = "item_type"
                int r6 = O4.a.d(r2, r6)     // Catch:{ all -> 0x00b9 }
                java.lang.String r7 = "quantity"
                int r7 = O4.a.d(r2, r7)     // Catch:{ all -> 0x00b9 }
                java.lang.String r8 = "updated_at"
                int r8 = O4.a.d(r2, r8)     // Catch:{ all -> 0x00b9 }
                java.lang.String r9 = "total_packages"
                int r9 = O4.a.d(r2, r9)     // Catch:{ all -> 0x00b9 }
                java.lang.String r10 = "online_sellable"
                int r10 = O4.a.d(r2, r10)     // Catch:{ all -> 0x00b9 }
                java.lang.String r11 = "is_communicated_online"
                int r11 = O4.a.d(r2, r11)     // Catch:{ all -> 0x00b9 }
                java.lang.String r12 = "is_breathtaking_item"
                int r12 = O4.a.d(r2, r12)     // Catch:{ all -> 0x00b9 }
                java.lang.String r13 = "is_new_item"
                int r13 = O4.a.d(r2, r13)     // Catch:{ all -> 0x00b9 }
                java.lang.String r14 = "environmental_fees"
                int r14 = O4.a.d(r2, r14)     // Catch:{ all -> 0x00b9 }
                java.lang.String r15 = "name"
                int r15 = O4.a.d(r2, r15)     // Catch:{ all -> 0x00b9 }
                java.lang.String r3 = "description"
                int r3 = O4.a.d(r2, r3)     // Catch:{ all -> 0x00b9 }
                java.lang.String r4 = "measurement"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x00b9 }
                r16 = r4
                java.lang.String r4 = "price_unit_text"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x00b9 }
                r17 = r4
                java.lang.String r4 = "unit_type"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x00b9 }
                r18 = r4
                java.lang.String r4 = "image_url"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x00b9 }
                r19 = r4
                java.lang.String r4 = "contextual_image_url"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x00b9 }
                r20 = r4
                java.lang.String r4 = "energy_label_url"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x00b9 }
                r21 = r4
                j0.a r4 = new j0.a     // Catch:{ all -> 0x00b9 }
                r4.<init>()     // Catch:{ all -> 0x00b9 }
            L_0x009c:
                boolean r22 = r2.moveToNext()     // Catch:{ all -> 0x00b9 }
                if (r22 == 0) goto L_0x00c3
                r22 = r3
                java.lang.String r3 = r2.getString(r5)     // Catch:{ all -> 0x00b9 }
                boolean r23 = r4.containsKey(r3)     // Catch:{ all -> 0x00b9 }
                if (r23 != 0) goto L_0x00bc
                r23 = r15
                java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x00b9 }
                r15.<init>()     // Catch:{ all -> 0x00b9 }
                r4.put(r3, r15)     // Catch:{ all -> 0x00b9 }
                goto L_0x00be
            L_0x00b9:
                r0 = move-exception
                goto L_0x0272
            L_0x00bc:
                r23 = r15
            L_0x00be:
                r3 = r22
                r15 = r23
                goto L_0x009c
            L_0x00c3:
                r22 = r3
                r23 = r15
                r3 = -1
                r2.moveToPosition(r3)     // Catch:{ all -> 0x00b9 }
                VA.k r3 = VA.C13747k.this     // Catch:{ all -> 0x00b9 }
                r3.N(r4)     // Catch:{ all -> 0x00b9 }
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00b9 }
                int r15 = r2.getCount()     // Catch:{ all -> 0x00b9 }
                r3.<init>(r15)     // Catch:{ all -> 0x00b9 }
            L_0x00d9:
                boolean r15 = r2.moveToNext()     // Catch:{ all -> 0x00b9 }
                if (r15 == 0) goto L_0x025a
                java.lang.String r25 = r2.getString(r0)     // Catch:{ all -> 0x00b9 }
                java.lang.String r26 = r2.getString(r5)     // Catch:{ all -> 0x00b9 }
                java.lang.String r27 = r2.getString(r6)     // Catch:{ all -> 0x00b9 }
                int r28 = r2.getInt(r7)     // Catch:{ all -> 0x00b9 }
                java.lang.String r15 = r2.getString(r8)     // Catch:{ all -> 0x00b9 }
                r37 = r0
                VA.k r0 = VA.C13747k.this     // Catch:{ all -> 0x00b9 }
                UA.c r0 = r0.f117298g     // Catch:{ all -> 0x00b9 }
                java.time.Instant r29 = r0.b(r15)     // Catch:{ all -> 0x00b9 }
                int r30 = r2.getInt(r9)     // Catch:{ all -> 0x00b9 }
                int r0 = r2.getInt(r10)     // Catch:{ all -> 0x00b9 }
                r15 = 0
                if (r0 == 0) goto L_0x010d
                r31 = 1
                goto L_0x010f
            L_0x010d:
                r31 = r15
            L_0x010f:
                int r0 = r2.getInt(r11)     // Catch:{ all -> 0x00b9 }
                if (r0 == 0) goto L_0x0118
                r32 = 1
                goto L_0x011a
            L_0x0118:
                r32 = r15
            L_0x011a:
                int r0 = r2.getInt(r12)     // Catch:{ all -> 0x00b9 }
                if (r0 == 0) goto L_0x0123
                r33 = 1
                goto L_0x0125
            L_0x0123:
                r33 = r15
            L_0x0125:
                int r0 = r2.getInt(r13)     // Catch:{ all -> 0x00b9 }
                if (r0 == 0) goto L_0x012e
                r34 = 1
                goto L_0x0130
            L_0x012e:
                r34 = r15
            L_0x0130:
                java.lang.String r0 = r2.getString(r14)     // Catch:{ all -> 0x00b9 }
                UA.b r15 = UA.C13713b.f116992a     // Catch:{ all -> 0x00b9 }
                java.util.List r35 = r15.d(r0)     // Catch:{ all -> 0x00b9 }
                r0 = r23
                boolean r15 = r2.isNull(r0)     // Catch:{ all -> 0x00b9 }
                if (r15 == 0) goto L_0x01ab
                r15 = r22
                boolean r22 = r2.isNull(r15)     // Catch:{ all -> 0x00b9 }
                if (r22 == 0) goto L_0x01a6
                r22 = r6
                r6 = r16
                boolean r16 = r2.isNull(r6)     // Catch:{ all -> 0x00b9 }
                if (r16 == 0) goto L_0x01a1
                r16 = r7
                r7 = r17
                boolean r17 = r2.isNull(r7)     // Catch:{ all -> 0x00b9 }
                if (r17 == 0) goto L_0x019c
                r17 = r8
                r8 = r18
                boolean r18 = r2.isNull(r8)     // Catch:{ all -> 0x00b9 }
                if (r18 == 0) goto L_0x0197
                r18 = r9
                r9 = r19
                boolean r19 = r2.isNull(r9)     // Catch:{ all -> 0x00b9 }
                if (r19 == 0) goto L_0x0192
                r19 = r10
                r10 = r20
                boolean r20 = r2.isNull(r10)     // Catch:{ all -> 0x00b9 }
                if (r20 == 0) goto L_0x018d
                r20 = r11
                r11 = r21
                boolean r21 = r2.isNull(r11)     // Catch:{ all -> 0x00b9 }
                if (r21 != 0) goto L_0x0187
                goto L_0x01ae
            L_0x0187:
                r23 = r0
                r36 = 0
                goto L_0x021b
            L_0x018d:
                r20 = r11
                r11 = r21
                goto L_0x01ae
            L_0x0192:
                r19 = r10
                r10 = r20
                goto L_0x018d
            L_0x0197:
                r18 = r9
                r9 = r19
                goto L_0x0192
            L_0x019c:
                r17 = r8
                r8 = r18
                goto L_0x0197
            L_0x01a1:
                r16 = r7
                r7 = r17
                goto L_0x019c
            L_0x01a6:
                r22 = r6
                r6 = r16
                goto L_0x01a1
            L_0x01ab:
                r15 = r22
                goto L_0x01a6
            L_0x01ae:
                java.lang.String r39 = r2.getString(r0)     // Catch:{ all -> 0x00b9 }
                java.lang.String r40 = r2.getString(r15)     // Catch:{ all -> 0x00b9 }
                boolean r21 = r2.isNull(r6)     // Catch:{ all -> 0x00b9 }
                if (r21 == 0) goto L_0x01bf
                r41 = 0
                goto L_0x01c5
            L_0x01bf:
                java.lang.String r21 = r2.getString(r6)     // Catch:{ all -> 0x00b9 }
                r41 = r21
            L_0x01c5:
                boolean r21 = r2.isNull(r7)     // Catch:{ all -> 0x00b9 }
                if (r21 == 0) goto L_0x01ce
                r42 = 0
                goto L_0x01d4
            L_0x01ce:
                java.lang.String r21 = r2.getString(r7)     // Catch:{ all -> 0x00b9 }
                r42 = r21
            L_0x01d4:
                boolean r21 = r2.isNull(r8)     // Catch:{ all -> 0x00b9 }
                if (r21 == 0) goto L_0x01dd
                r43 = 0
                goto L_0x01e3
            L_0x01dd:
                java.lang.String r21 = r2.getString(r8)     // Catch:{ all -> 0x00b9 }
                r43 = r21
            L_0x01e3:
                boolean r21 = r2.isNull(r9)     // Catch:{ all -> 0x00b9 }
                if (r21 == 0) goto L_0x01ec
                r44 = 0
                goto L_0x01f2
            L_0x01ec:
                java.lang.String r21 = r2.getString(r9)     // Catch:{ all -> 0x00b9 }
                r44 = r21
            L_0x01f2:
                boolean r21 = r2.isNull(r10)     // Catch:{ all -> 0x00b9 }
                if (r21 == 0) goto L_0x01fb
                r45 = 0
                goto L_0x0201
            L_0x01fb:
                java.lang.String r21 = r2.getString(r10)     // Catch:{ all -> 0x00b9 }
                r45 = r21
            L_0x0201:
                boolean r21 = r2.isNull(r11)     // Catch:{ all -> 0x00b9 }
                if (r21 == 0) goto L_0x020a
                r46 = 0
                goto L_0x0210
            L_0x020a:
                java.lang.String r21 = r2.getString(r11)     // Catch:{ all -> 0x00b9 }
                r46 = r21
            L_0x0210:
                WA.d r21 = new WA.d     // Catch:{ all -> 0x00b9 }
                r38 = r21
                r38.<init>(r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x00b9 }
                r23 = r0
                r36 = r21
            L_0x021b:
                WA.h r0 = new WA.h     // Catch:{ all -> 0x00b9 }
                r24 = r0
                r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x00b9 }
                r21 = r6
                java.lang.String r6 = r2.getString(r5)     // Catch:{ all -> 0x00b9 }
                java.lang.Object r6 = r4.get(r6)     // Catch:{ all -> 0x00b9 }
                java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x00b9 }
                r24 = r4
                WA.j r4 = new WA.j     // Catch:{ all -> 0x00b9 }
                r4.<init>(r0, r6)     // Catch:{ all -> 0x00b9 }
                r3.add(r4)     // Catch:{ all -> 0x00b9 }
                r6 = r22
                r4 = r24
                r0 = r37
                r22 = r15
                r47 = r17
                r17 = r7
                r7 = r16
                r16 = r21
                r21 = r11
                r11 = r20
                r20 = r10
                r10 = r19
                r19 = r9
                r9 = r18
                r18 = r8
                r8 = r47
                goto L_0x00d9
            L_0x025a:
                VA.k r0 = VA.C13747k.this     // Catch:{ all -> 0x00b9 }
                androidx.room.x r0 = r0.f117292a     // Catch:{ all -> 0x00b9 }
                r0.setTransactionSuccessful()     // Catch:{ all -> 0x00b9 }
                r2.close()     // Catch:{ all -> 0x0270 }
                VA.k r0 = VA.C13747k.this
                androidx.room.x r0 = r0.f117292a
                r0.endTransaction()
                return r3
            L_0x0270:
                r0 = move-exception
                goto L_0x0276
            L_0x0272:
                r2.close()     // Catch:{ all -> 0x0270 }
                throw r0     // Catch:{ all -> 0x0270 }
            L_0x0276:
                VA.k r2 = VA.C13747k.this
                androidx.room.x r2 = r2.f117292a
                r2.endTransaction()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: VA.C13747k.p.call():java.util.List");
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f117331a.h();
        }
    }

    /* renamed from: VA.k$q */
    class q implements Callable<List<C13764b>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.room.B f117333a;

        q(androidx.room.B b10) {
            this.f117333a = b10;
        }

        /* renamed from: a */
        public List<C13764b> call() {
            Cursor e10 = b.e(C13747k.this.f117292a, this.f117333a, false, (CancellationSignal) null);
            try {
                int d10 = a.d(e10, "item_no");
                int d11 = a.d(e10, "parent_item_no");
                int d12 = a.d(e10, "list_id");
                ArrayList arrayList = new ArrayList(e10.getCount());
                while (e10.moveToNext()) {
                    arrayList.add(new C13764b(e10.getString(d10), e10.getString(d11), e10.getString(d12)));
                }
                return arrayList;
            } finally {
                e10.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f117333a.h();
        }
    }

    /* renamed from: VA.k$r */
    class r implements Callable<C13763a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.room.B f117335a;

        r(androidx.room.B b10) {
            this.f117335a = b10;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: WA.a} */
        /* JADX WARNING: type inference failed for: r4v0 */
        /* JADX WARNING: type inference failed for: r4v3 */
        /* JADX WARNING: type inference failed for: r4v5 */
        /* JADX WARNING: type inference failed for: r4v6 */
        /* JADX WARNING: type inference failed for: r21v2, types: [WA.d] */
        /* JADX WARNING: type inference failed for: r16v1, types: [WA.a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public WA.C13763a call() {
            /*
                r30 = this;
                r1 = r30
                VA.k r0 = VA.C13747k.this
                androidx.room.x r0 = r0.f117292a
                androidx.room.B r2 = r1.f117335a
                r3 = 0
                r4 = 0
                android.database.Cursor r2 = O4.b.e(r0, r2, r3, r4)
                java.lang.String r0 = "parent_item_no"
                int r0 = O4.a.d(r2, r0)     // Catch:{ all -> 0x00a3 }
                java.lang.String r3 = "parent_article_item_no"
                int r3 = O4.a.d(r2, r3)     // Catch:{ all -> 0x00a3 }
                java.lang.String r5 = "number_of_packages"
                int r5 = O4.a.d(r2, r5)     // Catch:{ all -> 0x00a3 }
                java.lang.String r6 = "quantity_per_item"
                int r6 = O4.a.d(r2, r6)     // Catch:{ all -> 0x00a3 }
                java.lang.String r7 = "name"
                int r7 = O4.a.d(r2, r7)     // Catch:{ all -> 0x00a3 }
                java.lang.String r8 = "description"
                int r8 = O4.a.d(r2, r8)     // Catch:{ all -> 0x00a3 }
                java.lang.String r9 = "measurement"
                int r9 = O4.a.d(r2, r9)     // Catch:{ all -> 0x00a3 }
                java.lang.String r10 = "price_unit_text"
                int r10 = O4.a.d(r2, r10)     // Catch:{ all -> 0x00a3 }
                java.lang.String r11 = "unit_type"
                int r11 = O4.a.d(r2, r11)     // Catch:{ all -> 0x00a3 }
                java.lang.String r12 = "image_url"
                int r12 = O4.a.d(r2, r12)     // Catch:{ all -> 0x00a3 }
                java.lang.String r13 = "contextual_image_url"
                int r13 = O4.a.d(r2, r13)     // Catch:{ all -> 0x00a3 }
                java.lang.String r14 = "energy_label_url"
                int r14 = O4.a.d(r2, r14)     // Catch:{ all -> 0x00a3 }
                boolean r15 = r2.moveToFirst()     // Catch:{ all -> 0x00a3 }
                if (r15 == 0) goto L_0x0116
                java.lang.String r17 = r2.getString(r0)     // Catch:{ all -> 0x00a3 }
                java.lang.String r18 = r2.getString(r3)     // Catch:{ all -> 0x00a3 }
                int r19 = r2.getInt(r5)     // Catch:{ all -> 0x00a3 }
                int r20 = r2.getInt(r6)     // Catch:{ all -> 0x00a3 }
                boolean r0 = r2.isNull(r7)     // Catch:{ all -> 0x00a3 }
                if (r0 == 0) goto L_0x00a6
                boolean r0 = r2.isNull(r8)     // Catch:{ all -> 0x00a3 }
                if (r0 == 0) goto L_0x00a6
                boolean r0 = r2.isNull(r9)     // Catch:{ all -> 0x00a3 }
                if (r0 == 0) goto L_0x00a6
                boolean r0 = r2.isNull(r10)     // Catch:{ all -> 0x00a3 }
                if (r0 == 0) goto L_0x00a6
                boolean r0 = r2.isNull(r11)     // Catch:{ all -> 0x00a3 }
                if (r0 == 0) goto L_0x00a6
                boolean r0 = r2.isNull(r12)     // Catch:{ all -> 0x00a3 }
                if (r0 == 0) goto L_0x00a6
                boolean r0 = r2.isNull(r13)     // Catch:{ all -> 0x00a3 }
                if (r0 == 0) goto L_0x00a6
                boolean r0 = r2.isNull(r14)     // Catch:{ all -> 0x00a3 }
                if (r0 != 0) goto L_0x009f
                goto L_0x00a6
            L_0x009f:
                r21 = r4
                goto L_0x010f
            L_0x00a3:
                r0 = move-exception
                goto L_0x011f
            L_0x00a6:
                java.lang.String r22 = r2.getString(r7)     // Catch:{ all -> 0x00a3 }
                java.lang.String r23 = r2.getString(r8)     // Catch:{ all -> 0x00a3 }
                boolean r0 = r2.isNull(r9)     // Catch:{ all -> 0x00a3 }
                if (r0 == 0) goto L_0x00b7
                r24 = r4
                goto L_0x00bd
            L_0x00b7:
                java.lang.String r0 = r2.getString(r9)     // Catch:{ all -> 0x00a3 }
                r24 = r0
            L_0x00bd:
                boolean r0 = r2.isNull(r10)     // Catch:{ all -> 0x00a3 }
                if (r0 == 0) goto L_0x00c6
                r25 = r4
                goto L_0x00cc
            L_0x00c6:
                java.lang.String r0 = r2.getString(r10)     // Catch:{ all -> 0x00a3 }
                r25 = r0
            L_0x00cc:
                boolean r0 = r2.isNull(r11)     // Catch:{ all -> 0x00a3 }
                if (r0 == 0) goto L_0x00d5
                r26 = r4
                goto L_0x00db
            L_0x00d5:
                java.lang.String r0 = r2.getString(r11)     // Catch:{ all -> 0x00a3 }
                r26 = r0
            L_0x00db:
                boolean r0 = r2.isNull(r12)     // Catch:{ all -> 0x00a3 }
                if (r0 == 0) goto L_0x00e4
                r27 = r4
                goto L_0x00ea
            L_0x00e4:
                java.lang.String r0 = r2.getString(r12)     // Catch:{ all -> 0x00a3 }
                r27 = r0
            L_0x00ea:
                boolean r0 = r2.isNull(r13)     // Catch:{ all -> 0x00a3 }
                if (r0 == 0) goto L_0x00f3
                r28 = r4
                goto L_0x00f9
            L_0x00f3:
                java.lang.String r0 = r2.getString(r13)     // Catch:{ all -> 0x00a3 }
                r28 = r0
            L_0x00f9:
                boolean r0 = r2.isNull(r14)     // Catch:{ all -> 0x00a3 }
                if (r0 == 0) goto L_0x0102
            L_0x00ff:
                r29 = r4
                goto L_0x0107
            L_0x0102:
                java.lang.String r4 = r2.getString(r14)     // Catch:{ all -> 0x00a3 }
                goto L_0x00ff
            L_0x0107:
                WA.d r4 = new WA.d     // Catch:{ all -> 0x00a3 }
                r21 = r4
                r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x00a3 }
                goto L_0x009f
            L_0x010f:
                WA.a r4 = new WA.a     // Catch:{ all -> 0x00a3 }
                r16 = r4
                r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x00a3 }
            L_0x0116:
                r2.close()
                androidx.room.B r0 = r1.f117335a
                r0.h()
                return r4
            L_0x011f:
                r2.close()
                androidx.room.B r2 = r1.f117335a
                r2.h()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: VA.C13747k.r.call():WA.a");
        }
    }

    /* renamed from: VA.k$s */
    class s implements Callable<List<WA.h>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.room.B f117337a;

        s(androidx.room.B b10) {
            this.f117337a = b10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:53:0x0184 A[Catch:{ all -> 0x0152, all -> 0x021d }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0187 A[Catch:{ all -> 0x0152, all -> 0x021d }] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0193 A[Catch:{ all -> 0x0152, all -> 0x021d }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0196 A[Catch:{ all -> 0x0152, all -> 0x021d }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x01a2 A[Catch:{ all -> 0x0152, all -> 0x021d }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x01a5 A[Catch:{ all -> 0x0152, all -> 0x021d }] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x01b1 A[Catch:{ all -> 0x0152, all -> 0x021d }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01b4 A[Catch:{ all -> 0x0152, all -> 0x021d }] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x01c0 A[Catch:{ all -> 0x0152, all -> 0x021d }] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x01c3 A[Catch:{ all -> 0x0152, all -> 0x021d }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01cf A[Catch:{ all -> 0x0152, all -> 0x021d }] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01d2 A[Catch:{ all -> 0x0152, all -> 0x021d }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<WA.h> call() {
            /*
                r46 = this;
                r1 = r46
                VA.k r0 = VA.C13747k.this
                androidx.room.x r0 = r0.f117292a
                r0.beginTransaction()
                VA.k r0 = VA.C13747k.this     // Catch:{ all -> 0x021d }
                androidx.room.x r0 = r0.f117292a     // Catch:{ all -> 0x021d }
                androidx.room.B r2 = r1.f117337a     // Catch:{ all -> 0x021d }
                r3 = 0
                r4 = 0
                android.database.Cursor r2 = O4.b.e(r0, r2, r3, r4)     // Catch:{ all -> 0x021d }
                java.lang.String r0 = "list_id"
                int r0 = O4.a.d(r2, r0)     // Catch:{ all -> 0x0152 }
                java.lang.String r5 = "item_no"
                int r5 = O4.a.d(r2, r5)     // Catch:{ all -> 0x0152 }
                java.lang.String r6 = "item_type"
                int r6 = O4.a.d(r2, r6)     // Catch:{ all -> 0x0152 }
                java.lang.String r7 = "quantity"
                int r7 = O4.a.d(r2, r7)     // Catch:{ all -> 0x0152 }
                java.lang.String r8 = "updated_at"
                int r8 = O4.a.d(r2, r8)     // Catch:{ all -> 0x0152 }
                java.lang.String r9 = "total_packages"
                int r9 = O4.a.d(r2, r9)     // Catch:{ all -> 0x0152 }
                java.lang.String r10 = "online_sellable"
                int r10 = O4.a.d(r2, r10)     // Catch:{ all -> 0x0152 }
                java.lang.String r11 = "is_communicated_online"
                int r11 = O4.a.d(r2, r11)     // Catch:{ all -> 0x0152 }
                java.lang.String r12 = "is_breathtaking_item"
                int r12 = O4.a.d(r2, r12)     // Catch:{ all -> 0x0152 }
                java.lang.String r13 = "is_new_item"
                int r13 = O4.a.d(r2, r13)     // Catch:{ all -> 0x0152 }
                java.lang.String r14 = "environmental_fees"
                int r14 = O4.a.d(r2, r14)     // Catch:{ all -> 0x0152 }
                java.lang.String r15 = "name"
                int r15 = O4.a.d(r2, r15)     // Catch:{ all -> 0x0152 }
                java.lang.String r3 = "description"
                int r3 = O4.a.d(r2, r3)     // Catch:{ all -> 0x0152 }
                java.lang.String r4 = "measurement"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x0152 }
                r16 = r4
                java.lang.String r4 = "price_unit_text"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x0152 }
                r17 = r4
                java.lang.String r4 = "unit_type"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x0152 }
                r18 = r4
                java.lang.String r4 = "image_url"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x0152 }
                r19 = r4
                java.lang.String r4 = "contextual_image_url"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x0152 }
                r20 = r4
                java.lang.String r4 = "energy_label_url"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x0152 }
                r21 = r4
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0152 }
                r22 = r3
                int r3 = r2.getCount()     // Catch:{ all -> 0x0152 }
                r4.<init>(r3)     // Catch:{ all -> 0x0152 }
            L_0x00a2:
                boolean r3 = r2.moveToNext()     // Catch:{ all -> 0x0152 }
                if (r3 == 0) goto L_0x0207
                java.lang.String r24 = r2.getString(r0)     // Catch:{ all -> 0x0152 }
                java.lang.String r25 = r2.getString(r5)     // Catch:{ all -> 0x0152 }
                java.lang.String r26 = r2.getString(r6)     // Catch:{ all -> 0x0152 }
                int r27 = r2.getInt(r7)     // Catch:{ all -> 0x0152 }
                java.lang.String r3 = r2.getString(r8)     // Catch:{ all -> 0x0152 }
                r36 = r0
                VA.k r0 = VA.C13747k.this     // Catch:{ all -> 0x0152 }
                UA.c r0 = r0.f117298g     // Catch:{ all -> 0x0152 }
                java.time.Instant r28 = r0.b(r3)     // Catch:{ all -> 0x0152 }
                int r29 = r2.getInt(r9)     // Catch:{ all -> 0x0152 }
                int r0 = r2.getInt(r10)     // Catch:{ all -> 0x0152 }
                r3 = 1
                if (r0 == 0) goto L_0x00d6
                r30 = r3
                goto L_0x00d8
            L_0x00d6:
                r30 = 0
            L_0x00d8:
                int r0 = r2.getInt(r11)     // Catch:{ all -> 0x0152 }
                if (r0 == 0) goto L_0x00e1
                r31 = r3
                goto L_0x00e3
            L_0x00e1:
                r31 = 0
            L_0x00e3:
                int r0 = r2.getInt(r12)     // Catch:{ all -> 0x0152 }
                if (r0 == 0) goto L_0x00ec
                r32 = r3
                goto L_0x00ee
            L_0x00ec:
                r32 = 0
            L_0x00ee:
                int r0 = r2.getInt(r13)     // Catch:{ all -> 0x0152 }
                if (r0 == 0) goto L_0x00f7
                r33 = r3
                goto L_0x00f9
            L_0x00f7:
                r33 = 0
            L_0x00f9:
                java.lang.String r0 = r2.getString(r14)     // Catch:{ all -> 0x0152 }
                UA.b r3 = UA.C13713b.f116992a     // Catch:{ all -> 0x0152 }
                java.util.List r34 = r3.d(r0)     // Catch:{ all -> 0x0152 }
                boolean r0 = r2.isNull(r15)     // Catch:{ all -> 0x0152 }
                if (r0 == 0) goto L_0x0171
                r0 = r22
                boolean r3 = r2.isNull(r0)     // Catch:{ all -> 0x0152 }
                if (r3 == 0) goto L_0x016e
                r3 = r16
                boolean r16 = r2.isNull(r3)     // Catch:{ all -> 0x0152 }
                if (r16 == 0) goto L_0x0169
                r16 = r5
                r5 = r17
                boolean r17 = r2.isNull(r5)     // Catch:{ all -> 0x0152 }
                if (r17 == 0) goto L_0x0164
                r17 = r6
                r6 = r18
                boolean r18 = r2.isNull(r6)     // Catch:{ all -> 0x0152 }
                if (r18 == 0) goto L_0x015f
                r18 = r7
                r7 = r19
                boolean r19 = r2.isNull(r7)     // Catch:{ all -> 0x0152 }
                if (r19 == 0) goto L_0x015a
                r19 = r8
                r8 = r20
                boolean r20 = r2.isNull(r8)     // Catch:{ all -> 0x0152 }
                if (r20 == 0) goto L_0x0155
                r20 = r9
                r9 = r21
                boolean r21 = r2.isNull(r9)     // Catch:{ all -> 0x0152 }
                if (r21 != 0) goto L_0x014c
                goto L_0x0176
            L_0x014c:
                r22 = r0
                r35 = 0
                goto L_0x01e3
            L_0x0152:
                r0 = move-exception
                goto L_0x021f
            L_0x0155:
                r20 = r9
                r9 = r21
                goto L_0x0176
            L_0x015a:
                r19 = r8
                r8 = r20
                goto L_0x0155
            L_0x015f:
                r18 = r7
                r7 = r19
                goto L_0x015a
            L_0x0164:
                r17 = r6
                r6 = r18
                goto L_0x015f
            L_0x0169:
                r16 = r5
                r5 = r17
                goto L_0x0164
            L_0x016e:
                r3 = r16
                goto L_0x0169
            L_0x0171:
                r3 = r16
                r0 = r22
                goto L_0x0169
            L_0x0176:
                java.lang.String r38 = r2.getString(r15)     // Catch:{ all -> 0x0152 }
                java.lang.String r39 = r2.getString(r0)     // Catch:{ all -> 0x0152 }
                boolean r21 = r2.isNull(r3)     // Catch:{ all -> 0x0152 }
                if (r21 == 0) goto L_0x0187
                r40 = 0
                goto L_0x018d
            L_0x0187:
                java.lang.String r21 = r2.getString(r3)     // Catch:{ all -> 0x0152 }
                r40 = r21
            L_0x018d:
                boolean r21 = r2.isNull(r5)     // Catch:{ all -> 0x0152 }
                if (r21 == 0) goto L_0x0196
                r41 = 0
                goto L_0x019c
            L_0x0196:
                java.lang.String r21 = r2.getString(r5)     // Catch:{ all -> 0x0152 }
                r41 = r21
            L_0x019c:
                boolean r21 = r2.isNull(r6)     // Catch:{ all -> 0x0152 }
                if (r21 == 0) goto L_0x01a5
                r42 = 0
                goto L_0x01ab
            L_0x01a5:
                java.lang.String r21 = r2.getString(r6)     // Catch:{ all -> 0x0152 }
                r42 = r21
            L_0x01ab:
                boolean r21 = r2.isNull(r7)     // Catch:{ all -> 0x0152 }
                if (r21 == 0) goto L_0x01b4
                r43 = 0
                goto L_0x01ba
            L_0x01b4:
                java.lang.String r21 = r2.getString(r7)     // Catch:{ all -> 0x0152 }
                r43 = r21
            L_0x01ba:
                boolean r21 = r2.isNull(r8)     // Catch:{ all -> 0x0152 }
                if (r21 == 0) goto L_0x01c3
                r44 = 0
                goto L_0x01c9
            L_0x01c3:
                java.lang.String r21 = r2.getString(r8)     // Catch:{ all -> 0x0152 }
                r44 = r21
            L_0x01c9:
                boolean r21 = r2.isNull(r9)     // Catch:{ all -> 0x0152 }
                if (r21 == 0) goto L_0x01d2
                r45 = 0
                goto L_0x01d8
            L_0x01d2:
                java.lang.String r21 = r2.getString(r9)     // Catch:{ all -> 0x0152 }
                r45 = r21
            L_0x01d8:
                WA.d r21 = new WA.d     // Catch:{ all -> 0x0152 }
                r37 = r21
                r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ all -> 0x0152 }
                r22 = r0
                r35 = r21
            L_0x01e3:
                WA.h r0 = new WA.h     // Catch:{ all -> 0x0152 }
                r23 = r0
                r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0152 }
                r4.add(r0)     // Catch:{ all -> 0x0152 }
                r21 = r9
                r9 = r20
                r0 = r36
                r20 = r8
                r8 = r19
                r19 = r7
                r7 = r18
                r18 = r6
                r6 = r17
                r17 = r5
                r5 = r16
                r16 = r3
                goto L_0x00a2
            L_0x0207:
                VA.k r0 = VA.C13747k.this     // Catch:{ all -> 0x0152 }
                androidx.room.x r0 = r0.f117292a     // Catch:{ all -> 0x0152 }
                r0.setTransactionSuccessful()     // Catch:{ all -> 0x0152 }
                r2.close()     // Catch:{ all -> 0x021d }
                VA.k r0 = VA.C13747k.this
                androidx.room.x r0 = r0.f117292a
                r0.endTransaction()
                return r4
            L_0x021d:
                r0 = move-exception
                goto L_0x0223
            L_0x021f:
                r2.close()     // Catch:{ all -> 0x021d }
                throw r0     // Catch:{ all -> 0x021d }
            L_0x0223:
                VA.k r2 = VA.C13747k.this
                androidx.room.x r2 = r2.f117292a
                r2.endTransaction()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: VA.C13747k.s.call():java.util.List");
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f117337a.h();
        }
    }

    /* renamed from: VA.k$t */
    class t implements Callable<WA.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.room.B f117339a;

        t(androidx.room.B b10) {
            this.f117339a = b10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:50:0x0153 A[Catch:{ all -> 0x0133, all -> 0x01cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0156 A[Catch:{ all -> 0x0133, all -> 0x01cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0162 A[Catch:{ all -> 0x0133, all -> 0x01cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0165 A[Catch:{ all -> 0x0133, all -> 0x01cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0171 A[Catch:{ all -> 0x0133, all -> 0x01cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0174 A[Catch:{ all -> 0x0133, all -> 0x01cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0180 A[Catch:{ all -> 0x0133, all -> 0x01cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0183 A[Catch:{ all -> 0x0133, all -> 0x01cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x018f A[Catch:{ all -> 0x0133, all -> 0x01cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0192 A[Catch:{ all -> 0x0133, all -> 0x01cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x019e A[Catch:{ all -> 0x0133, all -> 0x01cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01a1 A[Catch:{ all -> 0x0133, all -> 0x01cf }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public WA.h call() {
            /*
                r43 = this;
                r1 = r43
                VA.k r0 = VA.C13747k.this
                androidx.room.x r0 = r0.f117292a
                r0.beginTransaction()
                VA.k r0 = VA.C13747k.this     // Catch:{ all -> 0x01cf }
                androidx.room.x r0 = r0.f117292a     // Catch:{ all -> 0x01cf }
                androidx.room.B r2 = r1.f117339a     // Catch:{ all -> 0x01cf }
                r3 = 0
                r4 = 0
                android.database.Cursor r2 = O4.b.e(r0, r2, r3, r4)     // Catch:{ all -> 0x01cf }
                java.lang.String r0 = "list_id"
                int r0 = O4.a.d(r2, r0)     // Catch:{ all -> 0x0133 }
                java.lang.String r5 = "item_no"
                int r5 = O4.a.d(r2, r5)     // Catch:{ all -> 0x0133 }
                java.lang.String r6 = "item_type"
                int r6 = O4.a.d(r2, r6)     // Catch:{ all -> 0x0133 }
                java.lang.String r7 = "quantity"
                int r7 = O4.a.d(r2, r7)     // Catch:{ all -> 0x0133 }
                java.lang.String r8 = "updated_at"
                int r8 = O4.a.d(r2, r8)     // Catch:{ all -> 0x0133 }
                java.lang.String r9 = "total_packages"
                int r9 = O4.a.d(r2, r9)     // Catch:{ all -> 0x0133 }
                java.lang.String r10 = "online_sellable"
                int r10 = O4.a.d(r2, r10)     // Catch:{ all -> 0x0133 }
                java.lang.String r11 = "is_communicated_online"
                int r11 = O4.a.d(r2, r11)     // Catch:{ all -> 0x0133 }
                java.lang.String r12 = "is_breathtaking_item"
                int r12 = O4.a.d(r2, r12)     // Catch:{ all -> 0x0133 }
                java.lang.String r13 = "is_new_item"
                int r13 = O4.a.d(r2, r13)     // Catch:{ all -> 0x0133 }
                java.lang.String r14 = "environmental_fees"
                int r14 = O4.a.d(r2, r14)     // Catch:{ all -> 0x0133 }
                java.lang.String r15 = "name"
                int r15 = O4.a.d(r2, r15)     // Catch:{ all -> 0x0133 }
                java.lang.String r3 = "description"
                int r3 = O4.a.d(r2, r3)     // Catch:{ all -> 0x0133 }
                java.lang.String r4 = "measurement"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x0133 }
                r16 = r4
                java.lang.String r4 = "price_unit_text"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x0133 }
                r17 = r4
                java.lang.String r4 = "unit_type"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x0133 }
                r18 = r4
                java.lang.String r4 = "image_url"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x0133 }
                r19 = r4
                java.lang.String r4 = "contextual_image_url"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x0133 }
                r20 = r4
                java.lang.String r4 = "energy_label_url"
                int r4 = O4.a.d(r2, r4)     // Catch:{ all -> 0x0133 }
                boolean r21 = r2.moveToFirst()     // Catch:{ all -> 0x0133 }
                if (r21 == 0) goto L_0x01b8
                java.lang.String r23 = r2.getString(r0)     // Catch:{ all -> 0x0133 }
                java.lang.String r24 = r2.getString(r5)     // Catch:{ all -> 0x0133 }
                java.lang.String r25 = r2.getString(r6)     // Catch:{ all -> 0x0133 }
                int r26 = r2.getInt(r7)     // Catch:{ all -> 0x0133 }
                java.lang.String r0 = r2.getString(r8)     // Catch:{ all -> 0x0133 }
                VA.k r5 = VA.C13747k.this     // Catch:{ all -> 0x0133 }
                UA.c r5 = r5.f117298g     // Catch:{ all -> 0x0133 }
                java.time.Instant r27 = r5.b(r0)     // Catch:{ all -> 0x0133 }
                int r28 = r2.getInt(r9)     // Catch:{ all -> 0x0133 }
                int r0 = r2.getInt(r10)     // Catch:{ all -> 0x0133 }
                r5 = 1
                if (r0 == 0) goto L_0x00c7
                r29 = r5
                goto L_0x00c9
            L_0x00c7:
                r29 = 0
            L_0x00c9:
                int r0 = r2.getInt(r11)     // Catch:{ all -> 0x0133 }
                if (r0 == 0) goto L_0x00d2
                r30 = r5
                goto L_0x00d4
            L_0x00d2:
                r30 = 0
            L_0x00d4:
                int r0 = r2.getInt(r12)     // Catch:{ all -> 0x0133 }
                if (r0 == 0) goto L_0x00dd
                r31 = r5
                goto L_0x00df
            L_0x00dd:
                r31 = 0
            L_0x00df:
                int r0 = r2.getInt(r13)     // Catch:{ all -> 0x0133 }
                if (r0 == 0) goto L_0x00e8
                r32 = r5
                goto L_0x00ea
            L_0x00e8:
                r32 = 0
            L_0x00ea:
                java.lang.String r0 = r2.getString(r14)     // Catch:{ all -> 0x0133 }
                UA.b r5 = UA.C13713b.f116992a     // Catch:{ all -> 0x0133 }
                java.util.List r33 = r5.d(r0)     // Catch:{ all -> 0x0133 }
                boolean r0 = r2.isNull(r15)     // Catch:{ all -> 0x0133 }
                if (r0 == 0) goto L_0x0142
                boolean r0 = r2.isNull(r3)     // Catch:{ all -> 0x0133 }
                if (r0 == 0) goto L_0x0142
                r0 = r16
                boolean r5 = r2.isNull(r0)     // Catch:{ all -> 0x0133 }
                if (r5 == 0) goto L_0x013f
                r5 = r17
                boolean r6 = r2.isNull(r5)     // Catch:{ all -> 0x0133 }
                if (r6 == 0) goto L_0x013c
                r6 = r18
                boolean r7 = r2.isNull(r6)     // Catch:{ all -> 0x0133 }
                if (r7 == 0) goto L_0x0139
                r7 = r19
                boolean r8 = r2.isNull(r7)     // Catch:{ all -> 0x0133 }
                if (r8 == 0) goto L_0x0136
                r8 = r20
                boolean r9 = r2.isNull(r8)     // Catch:{ all -> 0x0133 }
                if (r9 == 0) goto L_0x0145
                boolean r9 = r2.isNull(r4)     // Catch:{ all -> 0x0133 }
                if (r9 != 0) goto L_0x012f
                goto L_0x0145
            L_0x012f:
                r34 = 0
                goto L_0x01b0
            L_0x0133:
                r0 = move-exception
                goto L_0x01d1
            L_0x0136:
                r8 = r20
                goto L_0x0145
            L_0x0139:
                r7 = r19
                goto L_0x0136
            L_0x013c:
                r6 = r18
                goto L_0x0139
            L_0x013f:
                r5 = r17
                goto L_0x013c
            L_0x0142:
                r0 = r16
                goto L_0x013f
            L_0x0145:
                java.lang.String r35 = r2.getString(r15)     // Catch:{ all -> 0x0133 }
                java.lang.String r36 = r2.getString(r3)     // Catch:{ all -> 0x0133 }
                boolean r3 = r2.isNull(r0)     // Catch:{ all -> 0x0133 }
                if (r3 == 0) goto L_0x0156
                r37 = 0
                goto L_0x015c
            L_0x0156:
                java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0133 }
                r37 = r0
            L_0x015c:
                boolean r0 = r2.isNull(r5)     // Catch:{ all -> 0x0133 }
                if (r0 == 0) goto L_0x0165
                r38 = 0
                goto L_0x016b
            L_0x0165:
                java.lang.String r0 = r2.getString(r5)     // Catch:{ all -> 0x0133 }
                r38 = r0
            L_0x016b:
                boolean r0 = r2.isNull(r6)     // Catch:{ all -> 0x0133 }
                if (r0 == 0) goto L_0x0174
                r39 = 0
                goto L_0x017a
            L_0x0174:
                java.lang.String r0 = r2.getString(r6)     // Catch:{ all -> 0x0133 }
                r39 = r0
            L_0x017a:
                boolean r0 = r2.isNull(r7)     // Catch:{ all -> 0x0133 }
                if (r0 == 0) goto L_0x0183
                r40 = 0
                goto L_0x0189
            L_0x0183:
                java.lang.String r0 = r2.getString(r7)     // Catch:{ all -> 0x0133 }
                r40 = r0
            L_0x0189:
                boolean r0 = r2.isNull(r8)     // Catch:{ all -> 0x0133 }
                if (r0 == 0) goto L_0x0192
                r41 = 0
                goto L_0x0198
            L_0x0192:
                java.lang.String r0 = r2.getString(r8)     // Catch:{ all -> 0x0133 }
                r41 = r0
            L_0x0198:
                boolean r0 = r2.isNull(r4)     // Catch:{ all -> 0x0133 }
                if (r0 == 0) goto L_0x01a1
                r42 = 0
                goto L_0x01a7
            L_0x01a1:
                java.lang.String r4 = r2.getString(r4)     // Catch:{ all -> 0x0133 }
                r42 = r4
            L_0x01a7:
                WA.d r4 = new WA.d     // Catch:{ all -> 0x0133 }
                r34 = r4
                r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x0133 }
                r34 = r4
            L_0x01b0:
                WA.h r4 = new WA.h     // Catch:{ all -> 0x0133 }
                r22 = r4
                r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0133 }
                goto L_0x01b9
            L_0x01b8:
                r4 = 0
            L_0x01b9:
                VA.k r0 = VA.C13747k.this     // Catch:{ all -> 0x0133 }
                androidx.room.x r0 = r0.f117292a     // Catch:{ all -> 0x0133 }
                r0.setTransactionSuccessful()     // Catch:{ all -> 0x0133 }
                r2.close()     // Catch:{ all -> 0x01cf }
                VA.k r0 = VA.C13747k.this
                androidx.room.x r0 = r0.f117292a
                r0.endTransaction()
                return r4
            L_0x01cf:
                r0 = move-exception
                goto L_0x01d5
            L_0x01d1:
                r2.close()     // Catch:{ all -> 0x01cf }
                throw r0     // Catch:{ all -> 0x01cf }
            L_0x01d5:
                VA.k r2 = VA.C13747k.this
                androidx.room.x r2 = r2.f117292a
                r2.endTransaction()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: VA.C13747k.t.call():WA.h");
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f117339a.h();
        }
    }

    /* renamed from: VA.k$u */
    class u extends H {
        u(C13747k kVar, androidx.room.x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM ShoppingListItems WHERE item_no=? AND list_id=?";
        }
    }

    /* renamed from: VA.k$v */
    class v extends H {
        v(C13747k kVar, androidx.room.x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM ArticleItems WHERE parent_item_no=? AND list_id=?";
        }
    }

    /* renamed from: VA.k$w */
    class w extends H {
        w(C13747k kVar, androidx.room.x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM ShoppingListItems WHERE list_id = ?";
        }
    }

    /* renamed from: VA.k$x */
    class x extends C7014k<WA.h> {
        x(androidx.room.x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, WA.h hVar) {
            kVar.H(1, hVar.d());
            kVar.H(2, hVar.b());
            kVar.H(3, hVar.c());
            kVar.i2(4, (long) hVar.g());
            kVar.H(5, C13747k.this.f117298g.a(hVar.i()));
            kVar.i2(6, (long) hVar.h());
            kVar.i2(7, hVar.e() ? 1 : 0);
            kVar.i2(8, hVar.k() ? 1 : 0);
            kVar.i2(9, hVar.j() ? 1 : 0);
            kVar.i2(10, hVar.l() ? 1 : 0);
            kVar.H(11, C13713b.f116992a.f(hVar.a()));
            C13766d f10 = hVar.f();
            if (f10 != null) {
                kVar.H(12, f10.f());
                kVar.H(13, f10.b());
                if (f10.e() == null) {
                    kVar.I2(14);
                } else {
                    kVar.H(14, f10.e());
                }
                if (f10.g() == null) {
                    kVar.I2(15);
                } else {
                    kVar.H(15, f10.g());
                }
                if (f10.h() == null) {
                    kVar.I2(16);
                } else {
                    kVar.H(16, f10.h());
                }
                if (f10.d() == null) {
                    kVar.I2(17);
                } else {
                    kVar.H(17, f10.d());
                }
                if (f10.a() == null) {
                    kVar.I2(18);
                } else {
                    kVar.H(18, f10.a());
                }
                if (f10.c() == null) {
                    kVar.I2(19);
                } else {
                    kVar.H(19, f10.c());
                }
            } else {
                kVar.I2(12);
                kVar.I2(13);
                kVar.I2(14);
                kVar.I2(15);
                kVar.I2(16);
                kVar.I2(17);
                kVar.I2(18);
                kVar.I2(19);
            }
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT INTO `ShoppingListItems` (`list_id`,`item_no`,`item_type`,`quantity`,`updated_at`,`total_packages`,`online_sellable`,`is_communicated_online`,`is_breathtaking_item`,`is_new_item`,`environmental_fees`,`name`,`description`,`measurement`,`price_unit_text`,`unit_type`,`image_url`,`contextual_image_url`,`energy_label_url`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* renamed from: VA.k$y */
    class y extends C7013j<WA.h> {
        y(androidx.room.x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, WA.h hVar) {
            kVar.H(1, hVar.d());
            kVar.H(2, hVar.b());
            kVar.H(3, hVar.c());
            kVar.i2(4, (long) hVar.g());
            kVar.H(5, C13747k.this.f117298g.a(hVar.i()));
            kVar.i2(6, (long) hVar.h());
            kVar.i2(7, hVar.e() ? 1 : 0);
            kVar.i2(8, hVar.k() ? 1 : 0);
            kVar.i2(9, hVar.j() ? 1 : 0);
            kVar.i2(10, hVar.l() ? 1 : 0);
            kVar.H(11, C13713b.f116992a.f(hVar.a()));
            C13766d f10 = hVar.f();
            if (f10 != null) {
                kVar.H(12, f10.f());
                kVar.H(13, f10.b());
                if (f10.e() == null) {
                    kVar.I2(14);
                } else {
                    kVar.H(14, f10.e());
                }
                if (f10.g() == null) {
                    kVar.I2(15);
                } else {
                    kVar.H(15, f10.g());
                }
                if (f10.h() == null) {
                    kVar.I2(16);
                } else {
                    kVar.H(16, f10.h());
                }
                if (f10.d() == null) {
                    kVar.I2(17);
                } else {
                    kVar.H(17, f10.d());
                }
                if (f10.a() == null) {
                    kVar.I2(18);
                } else {
                    kVar.H(18, f10.a());
                }
                if (f10.c() == null) {
                    kVar.I2(19);
                } else {
                    kVar.H(19, f10.c());
                }
            } else {
                kVar.I2(12);
                kVar.I2(13);
                kVar.I2(14);
                kVar.I2(15);
                kVar.I2(16);
                kVar.I2(17);
                kVar.I2(18);
                kVar.I2(19);
            }
            kVar.H(20, hVar.b());
            kVar.H(21, hVar.d());
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "UPDATE `ShoppingListItems` SET `list_id` = ?,`item_no` = ?,`item_type` = ?,`quantity` = ?,`updated_at` = ?,`total_packages` = ?,`online_sellable` = ?,`is_communicated_online` = ?,`is_breathtaking_item` = ?,`is_new_item` = ?,`environmental_fees` = ?,`name` = ?,`description` = ?,`measurement` = ?,`price_unit_text` = ?,`unit_type` = ?,`image_url` = ?,`contextual_image_url` = ?,`energy_label_url` = ? WHERE `item_no` = ? AND `list_id` = ?";
        }
    }

    /* renamed from: VA.k$z */
    class z extends C7014k<C13763a> {
        z(C13747k kVar, androidx.room.x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(k kVar, C13763a aVar) {
            kVar.H(1, aVar.c());
            kVar.H(2, aVar.b());
            kVar.i2(3, (long) aVar.a());
            kVar.i2(4, (long) aVar.e());
            C13766d d10 = aVar.d();
            if (d10 != null) {
                kVar.H(5, d10.f());
                kVar.H(6, d10.b());
                if (d10.e() == null) {
                    kVar.I2(7);
                } else {
                    kVar.H(7, d10.e());
                }
                if (d10.g() == null) {
                    kVar.I2(8);
                } else {
                    kVar.H(8, d10.g());
                }
                if (d10.h() == null) {
                    kVar.I2(9);
                } else {
                    kVar.H(9, d10.h());
                }
                if (d10.d() == null) {
                    kVar.I2(10);
                } else {
                    kVar.H(10, d10.d());
                }
                if (d10.a() == null) {
                    kVar.I2(11);
                } else {
                    kVar.H(11, d10.a());
                }
                if (d10.c() == null) {
                    kVar.I2(12);
                } else {
                    kVar.H(12, d10.c());
                }
            } else {
                kVar.I2(5);
                kVar.I2(6);
                kVar.I2(7);
                kVar.I2(8);
                kVar.I2(9);
                kVar.I2(10);
                kVar.I2(11);
                kVar.I2(12);
            }
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT INTO `ArticleDetails` (`parent_item_no`,`parent_article_item_no`,`number_of_packages`,`quantity_per_item`,`name`,`description`,`measurement`,`price_unit_text`,`unit_type`,`image_url`,`contextual_image_url`,`energy_label_url`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    public C13747k(androidx.room.x xVar) {
        this.f117292a = xVar;
        this.f117293b = new C2894k(this, xVar);
        this.f117294c = new u(this, xVar);
        this.f117295d = new v(this, xVar);
        this.f117296e = new w(this, xVar);
        this.f117297f = new androidx.room.l<>(new x(xVar), new y(xVar));
        this.f117299h = new androidx.room.l<>(new z(this, xVar), new A(this, xVar));
        this.f117300i = new androidx.room.l<>(new B(this, xVar), new C13748a(this, xVar));
        this.f117301j = new androidx.room.l<>(new C13749b(xVar), new c(xVar));
    }

    /* access modifiers changed from: private */
    public void N(C5445a<String, ArrayList<C13767e>> aVar) {
        C5445a<String, ArrayList<C13767e>> aVar2 = aVar;
        Set<String> keySet = aVar.keySet();
        if (!keySet.isEmpty()) {
            if (aVar.size() > 999) {
                O4.d.a(aVar2, true, new C13743g(this));
                return;
            }
            StringBuilder b10 = O4.e.b();
            b10.append("SELECT `parent_item_no`,`type`,`price`,`tax`,`comparison_price`,`valid_until`,`previous_price`,`lowest_previous_price` FROM `SalesPrices` WHERE `parent_item_no` IN (");
            int size = keySet.size();
            O4.e.a(b10, size);
            b10.append(")");
            androidx.room.B e10 = androidx.room.B.e(b10.toString(), size);
            int i10 = 1;
            for (String H10 : keySet) {
                e10.H(i10, H10);
                i10++;
            }
            int i11 = 0;
            Cursor e11 = b.e(this.f117292a, e10, false, (CancellationSignal) null);
            try {
                int c10 = a.c(e11, "parent_item_no");
                if (c10 != -1) {
                    while (e11.moveToNext()) {
                        ArrayList arrayList = aVar2.get(e11.getString(c10));
                        if (arrayList != null) {
                            String string = e11.getString(i11);
                            String string2 = e11.getString(1);
                            double d10 = e11.getDouble(2);
                            double d11 = e11.getDouble(3);
                            String string3 = e11.isNull(4) ? null : e11.getString(4);
                            String string4 = e11.isNull(5) ? null : e11.getString(5);
                            arrayList.add(new C13767e(string, string2, d10, d11, string3, string4 == null ? null : this.f117302k.b(string4), e11.isNull(6) ? null : Double.valueOf(e11.getDouble(6)), e11.isNull(7) ? null : Double.valueOf(e11.getDouble(7))));
                        }
                        i11 = 0;
                    }
                    e11.close();
                }
            } finally {
                e11.close();
            }
        }
    }

    public static List<Class<?>> O() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C16807N P(C5445a aVar) {
        N(aVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object Q(List list, C17164e eVar) {
        return C13741e.a.c(this, list, eVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object R(List list, C17164e eVar) {
        return C13741e.a.d(this, list, eVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object S(String str, String str2, C17164e eVar) {
        return C13741e.a.e(this, str, str2, eVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object T(String str, List list, C17164e eVar) {
        return C13741e.a.f(this, str, list, eVar);
    }

    public C16532g<WA.h> b(String str, String str2) {
        androidx.room.B e10 = androidx.room.B.e("SELECT * FROM ShoppingListItems WHERE list_id = ? AND item_no= ?", 2);
        e10.H(1, str);
        e10.H(2, str2);
        return C7009f.a(this.f117292a, true, new String[]{"ShoppingListItems"}, new t(e10));
    }

    public C16532g<List<C13764b>> c(String str, String str2) {
        androidx.room.B e10 = androidx.room.B.e("\n            SELECT * FROM ArticleItems\n            WHERE list_id=? \n            AND parent_item_no=?\n        ", 2);
        e10.H(1, str);
        e10.H(2, str2);
        return C7009f.a(this.f117292a, false, new String[]{"ArticleItems"}, new q(e10));
    }

    public C16532g<List<WA.j>> d(String str) {
        androidx.room.B e10 = androidx.room.B.e("SELECT * FROM ShoppingListItems WHERE list_id=?", 1);
        e10.H(1, str);
        return C7009f.a(this.f117292a, true, new String[]{"SalesPrices", "ShoppingListItems"}, new p(e10));
    }

    public Object e(List<WA.i> list, C17164e<? super C16807N> eVar) {
        return androidx.room.y.d(this.f117292a, new C13742f(this, list), eVar);
    }

    public C16532g<List<WA.i>> f(String str) {
        return C13741e.a.b(this, str);
    }

    public Object g(C13764b bVar, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f117292a, true, new j(bVar), eVar);
    }

    public C16532g<List<WA.h>> h(String str) {
        androidx.room.B e10 = androidx.room.B.e("SELECT * FROM ShoppingListItems WHERE list_id = ?", 1);
        e10.H(1, str);
        return C7009f.a(this.f117292a, true, new String[]{"ShoppingListItems"}, new s(e10));
    }

    public Object i(C13767e eVar, C17164e<? super C16807N> eVar2) {
        return C7009f.c(this.f117292a, true, new l(eVar), eVar2);
    }

    public Object j(String str, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f117292a, true, new g(str), eVar);
    }

    public Object k(WA.h hVar, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f117292a, true, new h(hVar), eVar);
    }

    public Object l(String str, String str2, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f117292a, true, new e(str, str2), eVar);
    }

    public Object m(String str, List<WA.i> list, C17164e<? super C16807N> eVar) {
        return androidx.room.y.d(this.f117292a, new C13746j(this, str, list), eVar);
    }

    public Object n(String str, int i10, String str2, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f117292a, true, new d(i10, str, str2), eVar);
    }

    public Object o(String str, String str2, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f117292a, true, new f(str, str2), eVar);
    }

    public C16532g<List<C13765c>> p(String str, String str2) {
        return C13741e.a.a(this, str, str2);
    }

    public Object q(C13763a aVar, C17164e<? super C16807N> eVar) {
        return C7009f.c(this.f117292a, true, new i(aVar), eVar);
    }

    public Object r(String str, String str2, C17164e<? super C13763a> eVar) {
        androidx.room.B e10 = androidx.room.B.e("\n            SELECT * FROM ArticleDetails \n            WHERE parent_item_no=? \n            AND parent_article_item_no=?\n        ", 2);
        e10.H(1, str);
        e10.H(2, str2);
        return C7009f.b(this.f117292a, false, b.a(), new r(e10), eVar);
    }

    public Object s(int i10, C17164e<? super List<WA.h>> eVar) {
        androidx.room.B e10 = androidx.room.B.e("SELECT * FROM ShoppingListItems GROUP BY item_no ORDER BY RANDOM() LIMIT ?", 1);
        e10.i2(1, (long) i10);
        return C7009f.b(this.f117292a, false, b.a(), new m(e10), eVar);
    }

    public C16532g<List<String>> t() {
        return C7009f.a(this.f117292a, false, new String[]{"ShoppingListItems"}, new o(androidx.room.B.e("SELECT DISTINCT item_no FROM ShoppingListItems", 0)));
    }

    public C16532g<Integer> u(String str) {
        androidx.room.B e10 = androidx.room.B.e("SELECT COUNT(item_no) FROM ShoppingListItems WHERE item_no=?", 1);
        e10.H(1, str);
        return C7009f.a(this.f117292a, false, new String[]{"ShoppingListItems"}, new n(e10));
    }

    public Object v(String str, String str2, C17164e<? super C16807N> eVar) {
        return androidx.room.y.d(this.f117292a, new C13744h(this, str, str2), eVar);
    }

    public Object w(List<WA.h> list, C17164e<? super C16807N> eVar) {
        return androidx.room.y.d(this.f117292a, new C13745i(this, list), eVar);
    }
}
