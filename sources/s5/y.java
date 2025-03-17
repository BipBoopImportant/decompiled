package s5;

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
import androidx.work.C7032a;
import androidx.work.C7036e;
import androidx.work.C7037f;
import androidx.work.C7056z;
import androidx.work.Q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import s5.C8739u;
import t5.C8831z;

public final class y implements v {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final x f55955a;

    /* renamed from: b  reason: collision with root package name */
    private final C7014k<C8739u> f55956b;

    /* renamed from: c  reason: collision with root package name */
    private final C7013j<C8739u> f55957c;

    /* renamed from: d  reason: collision with root package name */
    private final H f55958d;

    /* renamed from: e  reason: collision with root package name */
    private final H f55959e;

    /* renamed from: f  reason: collision with root package name */
    private final H f55960f;

    /* renamed from: g  reason: collision with root package name */
    private final H f55961g;

    /* renamed from: h  reason: collision with root package name */
    private final H f55962h;

    /* renamed from: i  reason: collision with root package name */
    private final H f55963i;

    /* renamed from: j  reason: collision with root package name */
    private final H f55964j;

    /* renamed from: k  reason: collision with root package name */
    private final H f55965k;

    /* renamed from: l  reason: collision with root package name */
    private final H f55966l;

    /* renamed from: m  reason: collision with root package name */
    private final H f55967m;

    /* renamed from: n  reason: collision with root package name */
    private final H f55968n;

    /* renamed from: o  reason: collision with root package name */
    private final H f55969o;

    /* renamed from: p  reason: collision with root package name */
    private final H f55970p;

    /* renamed from: q  reason: collision with root package name */
    private final H f55971q;

    /* renamed from: r  reason: collision with root package name */
    private final H f55972r;

    class a extends H {
        a(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    class b extends H {
        b(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        }
    }

    class c extends H {
        c(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        }
    }

    class d extends H {
        d(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    class e extends H {
        e(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    class f extends H {
        f(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    class g extends H {
        g(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    class h extends H {
        h(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET stop_reason=? WHERE id=?";
        }
    }

    class i extends C7014k<C8739u> {
        i(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(Q4.k kVar, C8739u uVar) {
            kVar.H(1, uVar.f55910a);
            C8718D d10 = C8718D.f55866a;
            kVar.i2(2, (long) C8718D.k(uVar.f55911b));
            kVar.H(3, uVar.f55912c);
            kVar.H(4, uVar.f55913d);
            kVar.o2(5, C7037f.j(uVar.f55914e));
            kVar.o2(6, C7037f.j(uVar.f55915f));
            kVar.i2(7, uVar.f55916g);
            kVar.i2(8, uVar.f55917h);
            kVar.i2(9, uVar.f55918i);
            kVar.i2(10, (long) uVar.f55920k);
            kVar.i2(11, (long) C8718D.a(uVar.f55921l));
            kVar.i2(12, uVar.f55922m);
            kVar.i2(13, uVar.f55923n);
            kVar.i2(14, uVar.f55924o);
            kVar.i2(15, uVar.f55925p);
            kVar.i2(16, uVar.f55926q ? 1 : 0);
            kVar.i2(17, (long) C8718D.i(uVar.f55927r));
            kVar.i2(18, (long) uVar.i());
            kVar.i2(19, (long) uVar.f());
            kVar.i2(20, uVar.g());
            kVar.i2(21, (long) uVar.h());
            kVar.i2(22, (long) uVar.j());
            if (uVar.k() == null) {
                kVar.I2(23);
            } else {
                kVar.H(23, uVar.k());
            }
            C7036e eVar = uVar.f55919j;
            kVar.i2(24, (long) C8718D.h(eVar.f()));
            kVar.o2(25, C8718D.c(eVar.e()));
            kVar.i2(26, eVar.i() ? 1 : 0);
            kVar.i2(27, eVar.j() ? 1 : 0);
            kVar.i2(28, eVar.h() ? 1 : 0);
            kVar.i2(29, eVar.k() ? 1 : 0);
            kVar.i2(30, eVar.b());
            kVar.i2(31, eVar.a());
            kVar.o2(32, C8718D.j(eVar.c()));
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    class j implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ B f55982a;

        j(B b10) {
            this.f55982a = b10;
        }

        /* renamed from: a */
        public Boolean call() {
            Boolean bool;
            boolean z10 = false;
            Cursor e10 = O4.b.e(y.this.f55955a, this.f55982a, false, (CancellationSignal) null);
            try {
                if (e10.moveToFirst()) {
                    if (e10.getInt(0) != 0) {
                        z10 = true;
                    }
                    bool = Boolean.valueOf(z10);
                } else {
                    bool = Boolean.FALSE;
                }
                return bool;
            } finally {
                e10.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f55982a.h();
        }
    }

    class k extends C7013j<C8739u> {
        k(x xVar) {
            super(xVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void bind(Q4.k kVar, C8739u uVar) {
            kVar.H(1, uVar.f55910a);
            C8718D d10 = C8718D.f55866a;
            kVar.i2(2, (long) C8718D.k(uVar.f55911b));
            kVar.H(3, uVar.f55912c);
            kVar.H(4, uVar.f55913d);
            kVar.o2(5, C7037f.j(uVar.f55914e));
            kVar.o2(6, C7037f.j(uVar.f55915f));
            kVar.i2(7, uVar.f55916g);
            kVar.i2(8, uVar.f55917h);
            kVar.i2(9, uVar.f55918i);
            kVar.i2(10, (long) uVar.f55920k);
            kVar.i2(11, (long) C8718D.a(uVar.f55921l));
            kVar.i2(12, uVar.f55922m);
            kVar.i2(13, uVar.f55923n);
            kVar.i2(14, uVar.f55924o);
            kVar.i2(15, uVar.f55925p);
            kVar.i2(16, uVar.f55926q ? 1 : 0);
            kVar.i2(17, (long) C8718D.i(uVar.f55927r));
            kVar.i2(18, (long) uVar.i());
            kVar.i2(19, (long) uVar.f());
            kVar.i2(20, uVar.g());
            kVar.i2(21, (long) uVar.h());
            kVar.i2(22, (long) uVar.j());
            if (uVar.k() == null) {
                kVar.I2(23);
            } else {
                kVar.H(23, uVar.k());
            }
            C7036e eVar = uVar.f55919j;
            kVar.i2(24, (long) C8718D.h(eVar.f()));
            kVar.o2(25, C8718D.c(eVar.e()));
            kVar.i2(26, eVar.i() ? 1 : 0);
            kVar.i2(27, eVar.j() ? 1 : 0);
            kVar.i2(28, eVar.h() ? 1 : 0);
            kVar.i2(29, eVar.k() ? 1 : 0);
            kVar.i2(30, eVar.b());
            kVar.i2(31, eVar.a());
            kVar.o2(32, C8718D.j(eVar.c()));
            kVar.H(33, uVar.f55910a);
        }

        /* access modifiers changed from: protected */
        public String createQuery() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    class l extends H {
        l(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    class m extends H {
        m(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    class n extends H {
        n(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        }
    }

    class o extends H {
        o(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    class p extends H {
        p(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    class q extends H {
        q(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    class r extends H {
        r(x xVar) {
            super(xVar);
        }

        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public y(x xVar) {
        this.f55955a = xVar;
        this.f55956b = new i(xVar);
        this.f55957c = new k(xVar);
        this.f55958d = new l(xVar);
        this.f55959e = new m(xVar);
        this.f55960f = new n(xVar);
        this.f55961g = new o(xVar);
        this.f55962h = new p(xVar);
        this.f55963i = new q(xVar);
        this.f55964j = new r(xVar);
        this.f55965k = new a(xVar);
        this.f55966l = new b(xVar);
        this.f55967m = new c(xVar);
        this.f55968n = new d(xVar);
        this.f55969o = new e(xVar);
        this.f55970p = new f(xVar);
        this.f55971q = new g(xVar);
        this.f55972r = new h(xVar);
    }

    private void G(HashMap<String, ArrayList<C7037f>> hashMap) {
        Set<String> keySet = hashMap.keySet();
        if (!keySet.isEmpty()) {
            if (hashMap.size() > 999) {
                O4.d.b(hashMap, true, new x(this));
                return;
            }
            StringBuilder b10 = O4.e.b();
            b10.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size = keySet.size();
            O4.e.a(b10, size);
            b10.append(")");
            B e10 = B.e(b10.toString(), size);
            int i10 = 1;
            for (String H10 : keySet) {
                e10.H(i10, H10);
                i10++;
            }
            Cursor e11 = O4.b.e(this.f55955a, e10, false, (CancellationSignal) null);
            try {
                int c10 = O4.a.c(e11, "work_spec_id");
                if (c10 != -1) {
                    while (e11.moveToNext()) {
                        ArrayList arrayList = hashMap.get(e11.getString(c10));
                        if (arrayList != null) {
                            arrayList.add(C7037f.b(e11.getBlob(0)));
                        }
                    }
                    e11.close();
                }
            } finally {
                e11.close();
            }
        }
    }

    private void H(HashMap<String, ArrayList<String>> hashMap) {
        Set<String> keySet = hashMap.keySet();
        if (!keySet.isEmpty()) {
            if (hashMap.size() > 999) {
                O4.d.b(hashMap, true, new w(this));
                return;
            }
            StringBuilder b10 = O4.e.b();
            b10.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size = keySet.size();
            O4.e.a(b10, size);
            b10.append(")");
            B e10 = B.e(b10.toString(), size);
            int i10 = 1;
            for (String H10 : keySet) {
                e10.H(i10, H10);
                i10++;
            }
            Cursor e11 = O4.b.e(this.f55955a, e10, false, (CancellationSignal) null);
            try {
                int c10 = O4.a.c(e11, "work_spec_id");
                if (c10 != -1) {
                    while (e11.moveToNext()) {
                        ArrayList arrayList = hashMap.get(e11.getString(c10));
                        if (arrayList != null) {
                            arrayList.add(e11.getString(0));
                        }
                    }
                    e11.close();
                }
            } finally {
                e11.close();
            }
        }
    }

    public static List<Class<?>> J() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C16807N K(HashMap hashMap) {
        G(hashMap);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C16807N L(HashMap hashMap) {
        H(hashMap);
        return C16807N.f139792a;
    }

    public int A(String str) {
        this.f55955a.assertNotSuspendingTransaction();
        Q4.k acquire = this.f55965k.acquire();
        acquire.H(1, str);
        try {
            this.f55955a.beginTransaction();
            int b02 = acquire.b0();
            this.f55955a.setTransactionSuccessful();
            this.f55955a.endTransaction();
            this.f55965k.release(acquire);
            return b02;
        } catch (Throwable th2) {
            this.f55965k.release(acquire);
            throw th2;
        }
    }

    public int B(String str) {
        this.f55955a.assertNotSuspendingTransaction();
        Q4.k acquire = this.f55964j.acquire();
        acquire.H(1, str);
        try {
            this.f55955a.beginTransaction();
            int b02 = acquire.b0();
            this.f55955a.setTransactionSuccessful();
            this.f55955a.endTransaction();
            this.f55964j.release(acquire);
            return b02;
        } catch (Throwable th2) {
            this.f55964j.release(acquire);
            throw th2;
        }
    }

    public int C() {
        int i10 = 0;
        B e10 = B.e("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.f55955a.assertNotSuspendingTransaction();
        Cursor e11 = O4.b.e(this.f55955a, e10, false, (CancellationSignal) null);
        try {
            if (e11.moveToFirst()) {
                i10 = e11.getInt(0);
            }
            return i10;
        } finally {
            e11.close();
            e10.h();
        }
    }

    public void D(String str, int i10) {
        this.f55955a.assertNotSuspendingTransaction();
        Q4.k acquire = this.f55967m.acquire();
        acquire.H(1, str);
        acquire.i2(2, (long) i10);
        try {
            this.f55955a.beginTransaction();
            acquire.b0();
            this.f55955a.setTransactionSuccessful();
            this.f55955a.endTransaction();
            this.f55967m.release(acquire);
        } catch (Throwable th2) {
            this.f55967m.release(acquire);
            throw th2;
        }
    }

    public void a(String str) {
        this.f55955a.assertNotSuspendingTransaction();
        Q4.k acquire = this.f55958d.acquire();
        acquire.H(1, str);
        try {
            this.f55955a.beginTransaction();
            acquire.b0();
            this.f55955a.setTransactionSuccessful();
            this.f55955a.endTransaction();
            this.f55958d.release(acquire);
        } catch (Throwable th2) {
            this.f55958d.release(acquire);
            throw th2;
        }
    }

    public void b(String str) {
        this.f55955a.assertNotSuspendingTransaction();
        Q4.k acquire = this.f55961g.acquire();
        acquire.H(1, str);
        try {
            this.f55955a.beginTransaction();
            acquire.b0();
            this.f55955a.setTransactionSuccessful();
            this.f55955a.endTransaction();
            this.f55961g.release(acquire);
        } catch (Throwable th2) {
            this.f55961g.release(acquire);
            throw th2;
        }
    }

    public List<C8739u> c(long j10) {
        B b10;
        boolean z10;
        int i10;
        String str;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        B e10 = B.e("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        e10.i2(1, j10);
        this.f55955a.assertNotSuspendingTransaction();
        Cursor e11 = O4.b.e(this.f55955a, e10, false, (CancellationSignal) null);
        try {
            int d10 = O4.a.d(e11, "id");
            int d11 = O4.a.d(e11, "state");
            int d12 = O4.a.d(e11, "worker_class_name");
            int d13 = O4.a.d(e11, "input_merger_class_name");
            int d14 = O4.a.d(e11, "input");
            int d15 = O4.a.d(e11, "output");
            int d16 = O4.a.d(e11, "initial_delay");
            int d17 = O4.a.d(e11, "interval_duration");
            int d18 = O4.a.d(e11, "flex_duration");
            int d19 = O4.a.d(e11, "run_attempt_count");
            int d20 = O4.a.d(e11, "backoff_policy");
            int d21 = O4.a.d(e11, "backoff_delay_duration");
            int d22 = O4.a.d(e11, "last_enqueue_time");
            int d23 = O4.a.d(e11, "minimum_retention_duration");
            b10 = e10;
            try {
                int d24 = O4.a.d(e11, "schedule_requested_at");
                int d25 = O4.a.d(e11, "run_in_foreground");
                int d26 = O4.a.d(e11, "out_of_quota_policy");
                int d27 = O4.a.d(e11, "period_count");
                int d28 = O4.a.d(e11, "generation");
                int d29 = O4.a.d(e11, "next_schedule_time_override");
                int d30 = O4.a.d(e11, "next_schedule_time_override_generation");
                int d31 = O4.a.d(e11, "stop_reason");
                int d32 = O4.a.d(e11, "trace_tag");
                int d33 = O4.a.d(e11, "required_network_type");
                int d34 = O4.a.d(e11, "required_network_request");
                int d35 = O4.a.d(e11, "requires_charging");
                int d36 = O4.a.d(e11, "requires_device_idle");
                int d37 = O4.a.d(e11, "requires_battery_not_low");
                int d38 = O4.a.d(e11, "requires_storage_not_low");
                int d39 = O4.a.d(e11, "trigger_content_update_delay");
                int d40 = O4.a.d(e11, "trigger_max_content_delay");
                int d41 = O4.a.d(e11, "content_uri_triggers");
                int i16 = d23;
                ArrayList arrayList = new ArrayList(e11.getCount());
                while (e11.moveToNext()) {
                    String string = e11.getString(d10);
                    Q.c g10 = C8718D.g(e11.getInt(d11));
                    String string2 = e11.getString(d12);
                    String string3 = e11.getString(d13);
                    C7037f b11 = C7037f.b(e11.getBlob(d14));
                    C7037f b12 = C7037f.b(e11.getBlob(d15));
                    long j11 = e11.getLong(d16);
                    long j12 = e11.getLong(d17);
                    long j13 = e11.getLong(d18);
                    int i17 = e11.getInt(d19);
                    C7032a d42 = C8718D.d(e11.getInt(d20));
                    long j14 = e11.getLong(d21);
                    long j15 = e11.getLong(d22);
                    int i18 = i16;
                    long j16 = e11.getLong(i18);
                    int i19 = d10;
                    int i20 = d24;
                    long j17 = e11.getLong(i20);
                    d24 = i20;
                    int i21 = d25;
                    if (e11.getInt(i21) != 0) {
                        d25 = i21;
                        i10 = d26;
                        z10 = true;
                    } else {
                        d25 = i21;
                        i10 = d26;
                        z10 = false;
                    }
                    androidx.work.H f10 = C8718D.f(e11.getInt(i10));
                    d26 = i10;
                    int i22 = d27;
                    int i23 = e11.getInt(i22);
                    d27 = i22;
                    int i24 = d28;
                    int i25 = e11.getInt(i24);
                    d28 = i24;
                    int i26 = d29;
                    long j18 = e11.getLong(i26);
                    d29 = i26;
                    int i27 = d30;
                    int i28 = e11.getInt(i27);
                    d30 = i27;
                    int i29 = d31;
                    int i30 = e11.getInt(i29);
                    d31 = i29;
                    int i31 = d32;
                    if (e11.isNull(i31)) {
                        d32 = i31;
                        i11 = d33;
                        str = null;
                    } else {
                        str = e11.getString(i31);
                        d32 = i31;
                        i11 = d33;
                    }
                    C7056z e12 = C8718D.e(e11.getInt(i11));
                    d33 = i11;
                    int i32 = d34;
                    C8831z l10 = C8718D.l(e11.getBlob(i32));
                    d34 = i32;
                    int i33 = d35;
                    if (e11.getInt(i33) != 0) {
                        d35 = i33;
                        i12 = d36;
                        z11 = true;
                    } else {
                        d35 = i33;
                        i12 = d36;
                        z11 = false;
                    }
                    if (e11.getInt(i12) != 0) {
                        d36 = i12;
                        i13 = d37;
                        z12 = true;
                    } else {
                        d36 = i12;
                        i13 = d37;
                        z12 = false;
                    }
                    if (e11.getInt(i13) != 0) {
                        d37 = i13;
                        i14 = d38;
                        z13 = true;
                    } else {
                        d37 = i13;
                        i14 = d38;
                        z13 = false;
                    }
                    if (e11.getInt(i14) != 0) {
                        d38 = i14;
                        i15 = d39;
                        z14 = true;
                    } else {
                        d38 = i14;
                        i15 = d39;
                        z14 = false;
                    }
                    long j19 = e11.getLong(i15);
                    d39 = i15;
                    int i34 = d40;
                    long j20 = e11.getLong(i34);
                    d40 = i34;
                    int i35 = d41;
                    d41 = i35;
                    arrayList.add(new C8739u(string, g10, string2, string3, b11, b12, j11, j12, j13, new C7036e(l10, e12, z11, z12, z13, z14, j19, j20, C8718D.b(e11.getBlob(i35))), i17, d42, j14, j15, j16, j17, z10, f10, i23, i25, j18, i28, i30, str));
                    d10 = i19;
                    i16 = i18;
                }
                e11.close();
                b10.h();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                e11.close();
                b10.h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            b10 = e10;
            e11.close();
            b10.h();
            throw th;
        }
    }

    public void d(String str, int i10) {
        this.f55955a.assertNotSuspendingTransaction();
        Q4.k acquire = this.f55972r.acquire();
        acquire.i2(1, (long) i10);
        acquire.H(2, str);
        try {
            this.f55955a.beginTransaction();
            acquire.b0();
            this.f55955a.setTransactionSuccessful();
            this.f55955a.endTransaction();
            this.f55972r.release(acquire);
        } catch (Throwable th2) {
            this.f55972r.release(acquire);
            throw th2;
        }
    }

    public List<C8739u> e() {
        B b10;
        boolean z10;
        int i10;
        String str;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        B e10 = B.e("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f55955a.assertNotSuspendingTransaction();
        Cursor e11 = O4.b.e(this.f55955a, e10, false, (CancellationSignal) null);
        try {
            int d10 = O4.a.d(e11, "id");
            int d11 = O4.a.d(e11, "state");
            int d12 = O4.a.d(e11, "worker_class_name");
            int d13 = O4.a.d(e11, "input_merger_class_name");
            int d14 = O4.a.d(e11, "input");
            int d15 = O4.a.d(e11, "output");
            int d16 = O4.a.d(e11, "initial_delay");
            int d17 = O4.a.d(e11, "interval_duration");
            int d18 = O4.a.d(e11, "flex_duration");
            int d19 = O4.a.d(e11, "run_attempt_count");
            int d20 = O4.a.d(e11, "backoff_policy");
            int d21 = O4.a.d(e11, "backoff_delay_duration");
            int d22 = O4.a.d(e11, "last_enqueue_time");
            int d23 = O4.a.d(e11, "minimum_retention_duration");
            b10 = e10;
            try {
                int d24 = O4.a.d(e11, "schedule_requested_at");
                int d25 = O4.a.d(e11, "run_in_foreground");
                int d26 = O4.a.d(e11, "out_of_quota_policy");
                int d27 = O4.a.d(e11, "period_count");
                int d28 = O4.a.d(e11, "generation");
                int d29 = O4.a.d(e11, "next_schedule_time_override");
                int d30 = O4.a.d(e11, "next_schedule_time_override_generation");
                int d31 = O4.a.d(e11, "stop_reason");
                int d32 = O4.a.d(e11, "trace_tag");
                int d33 = O4.a.d(e11, "required_network_type");
                int d34 = O4.a.d(e11, "required_network_request");
                int d35 = O4.a.d(e11, "requires_charging");
                int d36 = O4.a.d(e11, "requires_device_idle");
                int d37 = O4.a.d(e11, "requires_battery_not_low");
                int d38 = O4.a.d(e11, "requires_storage_not_low");
                int d39 = O4.a.d(e11, "trigger_content_update_delay");
                int d40 = O4.a.d(e11, "trigger_max_content_delay");
                int d41 = O4.a.d(e11, "content_uri_triggers");
                int i16 = d23;
                ArrayList arrayList = new ArrayList(e11.getCount());
                while (e11.moveToNext()) {
                    String string = e11.getString(d10);
                    Q.c g10 = C8718D.g(e11.getInt(d11));
                    String string2 = e11.getString(d12);
                    String string3 = e11.getString(d13);
                    C7037f b11 = C7037f.b(e11.getBlob(d14));
                    C7037f b12 = C7037f.b(e11.getBlob(d15));
                    long j10 = e11.getLong(d16);
                    long j11 = e11.getLong(d17);
                    long j12 = e11.getLong(d18);
                    int i17 = e11.getInt(d19);
                    C7032a d42 = C8718D.d(e11.getInt(d20));
                    long j13 = e11.getLong(d21);
                    long j14 = e11.getLong(d22);
                    int i18 = i16;
                    long j15 = e11.getLong(i18);
                    int i19 = d10;
                    int i20 = d24;
                    long j16 = e11.getLong(i20);
                    d24 = i20;
                    int i21 = d25;
                    if (e11.getInt(i21) != 0) {
                        d25 = i21;
                        i10 = d26;
                        z10 = true;
                    } else {
                        d25 = i21;
                        i10 = d26;
                        z10 = false;
                    }
                    androidx.work.H f10 = C8718D.f(e11.getInt(i10));
                    d26 = i10;
                    int i22 = d27;
                    int i23 = e11.getInt(i22);
                    d27 = i22;
                    int i24 = d28;
                    int i25 = e11.getInt(i24);
                    d28 = i24;
                    int i26 = d29;
                    long j17 = e11.getLong(i26);
                    d29 = i26;
                    int i27 = d30;
                    int i28 = e11.getInt(i27);
                    d30 = i27;
                    int i29 = d31;
                    int i30 = e11.getInt(i29);
                    d31 = i29;
                    int i31 = d32;
                    if (e11.isNull(i31)) {
                        d32 = i31;
                        i11 = d33;
                        str = null;
                    } else {
                        str = e11.getString(i31);
                        d32 = i31;
                        i11 = d33;
                    }
                    C7056z e12 = C8718D.e(e11.getInt(i11));
                    d33 = i11;
                    int i32 = d34;
                    C8831z l10 = C8718D.l(e11.getBlob(i32));
                    d34 = i32;
                    int i33 = d35;
                    if (e11.getInt(i33) != 0) {
                        d35 = i33;
                        i12 = d36;
                        z11 = true;
                    } else {
                        d35 = i33;
                        i12 = d36;
                        z11 = false;
                    }
                    if (e11.getInt(i12) != 0) {
                        d36 = i12;
                        i13 = d37;
                        z12 = true;
                    } else {
                        d36 = i12;
                        i13 = d37;
                        z12 = false;
                    }
                    if (e11.getInt(i13) != 0) {
                        d37 = i13;
                        i14 = d38;
                        z13 = true;
                    } else {
                        d37 = i13;
                        i14 = d38;
                        z13 = false;
                    }
                    if (e11.getInt(i14) != 0) {
                        d38 = i14;
                        i15 = d39;
                        z14 = true;
                    } else {
                        d38 = i14;
                        i15 = d39;
                        z14 = false;
                    }
                    long j18 = e11.getLong(i15);
                    d39 = i15;
                    int i34 = d40;
                    long j19 = e11.getLong(i34);
                    d40 = i34;
                    int i35 = d41;
                    d41 = i35;
                    arrayList.add(new C8739u(string, g10, string2, string3, b11, b12, j10, j11, j12, new C7036e(l10, e12, z11, z12, z13, z14, j18, j19, C8718D.b(e11.getBlob(i35))), i17, d42, j13, j14, j15, j16, z10, f10, i23, i25, j17, i28, i30, str));
                    d10 = i19;
                    i16 = i18;
                }
                e11.close();
                b10.h();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                e11.close();
                b10.h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            b10 = e10;
            e11.close();
            b10.h();
            throw th;
        }
    }

    public List<String> f(String str) {
        B e10 = B.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        e10.H(1, str);
        this.f55955a.assertNotSuspendingTransaction();
        Cursor e11 = O4.b.e(this.f55955a, e10, false, (CancellationSignal) null);
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

    public C8739u.c g(String str) {
        Cursor e10;
        B e11 = B.e("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=?", 1);
        e11.H(1, str);
        this.f55955a.assertNotSuspendingTransaction();
        this.f55955a.beginTransaction();
        try {
            C8739u.c cVar = null;
            e10 = O4.b.e(this.f55955a, e11, true, (CancellationSignal) null);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            while (e10.moveToNext()) {
                String string = e10.getString(0);
                if (!hashMap.containsKey(string)) {
                    hashMap.put(string, new ArrayList());
                }
                String string2 = e10.getString(0);
                if (!hashMap2.containsKey(string2)) {
                    hashMap2.put(string2, new ArrayList());
                }
            }
            e10.moveToPosition(-1);
            H(hashMap);
            G(hashMap2);
            if (e10.moveToFirst()) {
                String string3 = e10.getString(0);
                Q.c g10 = C8718D.g(e10.getInt(1));
                C7037f b10 = C7037f.b(e10.getBlob(2));
                int i10 = e10.getInt(3);
                int i11 = e10.getInt(4);
                cVar = new C8739u.c(string3, g10, b10, e10.getLong(14), e10.getLong(15), e10.getLong(16), new C7036e(C8718D.l(e10.getBlob(6)), C8718D.e(e10.getInt(5)), e10.getInt(7) != 0, e10.getInt(8) != 0, e10.getInt(9) != 0, e10.getInt(10) != 0, e10.getLong(11), e10.getLong(12), C8718D.b(e10.getBlob(13))), i10, C8718D.d(e10.getInt(17)), e10.getLong(18), e10.getLong(19), e10.getInt(20), i11, e10.getLong(21), e10.getInt(22), (ArrayList) hashMap.get(e10.getString(0)), (ArrayList) hashMap2.get(e10.getString(0)));
            }
            this.f55955a.setTransactionSuccessful();
            e10.close();
            e11.h();
            this.f55955a.endTransaction();
            return cVar;
        } catch (Throwable th2) {
            this.f55955a.endTransaction();
            throw th2;
        }
    }

    public Q.c h(String str) {
        B e10 = B.e("SELECT state FROM workspec WHERE id=?", 1);
        e10.H(1, str);
        this.f55955a.assertNotSuspendingTransaction();
        Q.c cVar = null;
        Cursor e11 = O4.b.e(this.f55955a, e10, false, (CancellationSignal) null);
        try {
            if (e11.moveToFirst()) {
                Integer valueOf = e11.isNull(0) ? null : Integer.valueOf(e11.getInt(0));
                if (valueOf != null) {
                    C8718D d10 = C8718D.f55866a;
                    cVar = C8718D.g(valueOf.intValue());
                }
            }
            return cVar;
        } finally {
            e11.close();
            e10.h();
        }
    }

    public C8739u i(String str) {
        B b10;
        C8739u uVar;
        boolean z10;
        int i10;
        String str2;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        B e10 = B.e("SELECT * FROM workspec WHERE id=?", 1);
        e10.H(1, str);
        this.f55955a.assertNotSuspendingTransaction();
        Cursor e11 = O4.b.e(this.f55955a, e10, false, (CancellationSignal) null);
        try {
            int d10 = O4.a.d(e11, "id");
            int d11 = O4.a.d(e11, "state");
            int d12 = O4.a.d(e11, "worker_class_name");
            int d13 = O4.a.d(e11, "input_merger_class_name");
            int d14 = O4.a.d(e11, "input");
            int d15 = O4.a.d(e11, "output");
            int d16 = O4.a.d(e11, "initial_delay");
            int d17 = O4.a.d(e11, "interval_duration");
            int d18 = O4.a.d(e11, "flex_duration");
            int d19 = O4.a.d(e11, "run_attempt_count");
            int d20 = O4.a.d(e11, "backoff_policy");
            int d21 = O4.a.d(e11, "backoff_delay_duration");
            int d22 = O4.a.d(e11, "last_enqueue_time");
            int d23 = O4.a.d(e11, "minimum_retention_duration");
            b10 = e10;
            try {
                int d24 = O4.a.d(e11, "schedule_requested_at");
                int d25 = O4.a.d(e11, "run_in_foreground");
                int d26 = O4.a.d(e11, "out_of_quota_policy");
                int d27 = O4.a.d(e11, "period_count");
                int d28 = O4.a.d(e11, "generation");
                int d29 = O4.a.d(e11, "next_schedule_time_override");
                int d30 = O4.a.d(e11, "next_schedule_time_override_generation");
                int d31 = O4.a.d(e11, "stop_reason");
                int d32 = O4.a.d(e11, "trace_tag");
                int d33 = O4.a.d(e11, "required_network_type");
                int d34 = O4.a.d(e11, "required_network_request");
                int d35 = O4.a.d(e11, "requires_charging");
                int d36 = O4.a.d(e11, "requires_device_idle");
                int d37 = O4.a.d(e11, "requires_battery_not_low");
                int d38 = O4.a.d(e11, "requires_storage_not_low");
                int d39 = O4.a.d(e11, "trigger_content_update_delay");
                int d40 = O4.a.d(e11, "trigger_max_content_delay");
                int d41 = O4.a.d(e11, "content_uri_triggers");
                if (e11.moveToFirst()) {
                    String string = e11.getString(d10);
                    Q.c g10 = C8718D.g(e11.getInt(d11));
                    String string2 = e11.getString(d12);
                    String string3 = e11.getString(d13);
                    C7037f b11 = C7037f.b(e11.getBlob(d14));
                    C7037f b12 = C7037f.b(e11.getBlob(d15));
                    long j10 = e11.getLong(d16);
                    long j11 = e11.getLong(d17);
                    long j12 = e11.getLong(d18);
                    int i16 = e11.getInt(d19);
                    C7032a d42 = C8718D.d(e11.getInt(d20));
                    long j13 = e11.getLong(d21);
                    long j14 = e11.getLong(d22);
                    long j15 = e11.getLong(d23);
                    long j16 = e11.getLong(d24);
                    if (e11.getInt(d25) != 0) {
                        i10 = d26;
                        z10 = true;
                    } else {
                        i10 = d26;
                        z10 = false;
                    }
                    androidx.work.H f10 = C8718D.f(e11.getInt(i10));
                    int i17 = e11.getInt(d27);
                    int i18 = e11.getInt(d28);
                    long j17 = e11.getLong(d29);
                    int i19 = e11.getInt(d30);
                    int i20 = e11.getInt(d31);
                    int i21 = d32;
                    if (e11.isNull(i21)) {
                        i11 = d33;
                        str2 = null;
                    } else {
                        str2 = e11.getString(i21);
                        i11 = d33;
                    }
                    C7056z e12 = C8718D.e(e11.getInt(i11));
                    C8831z l10 = C8718D.l(e11.getBlob(d34));
                    if (e11.getInt(d35) != 0) {
                        i12 = d36;
                        z11 = true;
                    } else {
                        i12 = d36;
                        z11 = false;
                    }
                    if (e11.getInt(i12) != 0) {
                        i13 = d37;
                        z12 = true;
                    } else {
                        i13 = d37;
                        z12 = false;
                    }
                    if (e11.getInt(i13) != 0) {
                        i14 = d38;
                        z13 = true;
                    } else {
                        i14 = d38;
                        z13 = false;
                    }
                    if (e11.getInt(i14) != 0) {
                        i15 = d39;
                        z14 = true;
                    } else {
                        i15 = d39;
                        z14 = false;
                    }
                    uVar = new C8739u(string, g10, string2, string3, b11, b12, j10, j11, j12, new C7036e(l10, e12, z11, z12, z13, z14, e11.getLong(i15), e11.getLong(d40), C8718D.b(e11.getBlob(d41))), i16, d42, j13, j14, j15, j16, z10, f10, i17, i18, j17, i19, i20, str2);
                } else {
                    uVar = null;
                }
                e11.close();
                b10.h();
                return uVar;
            } catch (Throwable th2) {
                th = th2;
                e11.close();
                b10.h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            b10 = e10;
            e11.close();
            b10.h();
            throw th;
        }
    }

    public int j(String str) {
        this.f55955a.assertNotSuspendingTransaction();
        Q4.k acquire = this.f55960f.acquire();
        acquire.H(1, str);
        try {
            this.f55955a.beginTransaction();
            int b02 = acquire.b0();
            this.f55955a.setTransactionSuccessful();
            this.f55955a.endTransaction();
            this.f55960f.release(acquire);
            return b02;
        } catch (Throwable th2) {
            this.f55960f.release(acquire);
            throw th2;
        }
    }

    public List<String> k(String str) {
        B e10 = B.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        e10.H(1, str);
        this.f55955a.assertNotSuspendingTransaction();
        Cursor e11 = O4.b.e(this.f55955a, e10, false, (CancellationSignal) null);
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

    public List<C7037f> l(String str) {
        B e10 = B.e("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        e10.H(1, str);
        this.f55955a.assertNotSuspendingTransaction();
        Cursor e11 = O4.b.e(this.f55955a, e10, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(e11.getCount());
            while (e11.moveToNext()) {
                arrayList.add(C7037f.b(e11.getBlob(0)));
            }
            return arrayList;
        } finally {
            e11.close();
            e10.h();
        }
    }

    public List<C8739u.c> m(String str) {
        Cursor e10;
        B e11 = B.e("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        e11.H(1, str);
        this.f55955a.assertNotSuspendingTransaction();
        this.f55955a.beginTransaction();
        try {
            e10 = O4.b.e(this.f55955a, e11, true, (CancellationSignal) null);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            while (e10.moveToNext()) {
                String string = e10.getString(0);
                if (!hashMap.containsKey(string)) {
                    hashMap.put(string, new ArrayList());
                }
                String string2 = e10.getString(0);
                if (!hashMap2.containsKey(string2)) {
                    hashMap2.put(string2, new ArrayList());
                }
            }
            e10.moveToPosition(-1);
            H(hashMap);
            G(hashMap2);
            ArrayList arrayList = new ArrayList(e10.getCount());
            while (e10.moveToNext()) {
                String string3 = e10.getString(0);
                Q.c g10 = C8718D.g(e10.getInt(1));
                C7037f b10 = C7037f.b(e10.getBlob(2));
                int i10 = e10.getInt(3);
                int i11 = e10.getInt(4);
                arrayList.add(new C8739u.c(string3, g10, b10, e10.getLong(14), e10.getLong(15), e10.getLong(16), new C7036e(C8718D.l(e10.getBlob(6)), C8718D.e(e10.getInt(5)), e10.getInt(7) != 0, e10.getInt(8) != 0, e10.getInt(9) != 0, e10.getInt(10) != 0, e10.getLong(11), e10.getLong(12), C8718D.b(e10.getBlob(13))), i10, C8718D.d(e10.getInt(17)), e10.getLong(18), e10.getLong(19), e10.getInt(20), i11, e10.getLong(21), e10.getInt(22), (ArrayList) hashMap.get(e10.getString(0)), (ArrayList) hashMap2.get(e10.getString(0))));
            }
            this.f55955a.setTransactionSuccessful();
            e10.close();
            e11.h();
            this.f55955a.endTransaction();
            return arrayList;
        } catch (Throwable th2) {
            this.f55955a.endTransaction();
            throw th2;
        }
    }

    public List<C8739u> n(int i10) {
        B b10;
        boolean z10;
        int i11;
        String str;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        int i16;
        B e10 = B.e("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        e10.i2(1, (long) i10);
        this.f55955a.assertNotSuspendingTransaction();
        Cursor e11 = O4.b.e(this.f55955a, e10, false, (CancellationSignal) null);
        try {
            int d10 = O4.a.d(e11, "id");
            int d11 = O4.a.d(e11, "state");
            int d12 = O4.a.d(e11, "worker_class_name");
            int d13 = O4.a.d(e11, "input_merger_class_name");
            int d14 = O4.a.d(e11, "input");
            int d15 = O4.a.d(e11, "output");
            int d16 = O4.a.d(e11, "initial_delay");
            int d17 = O4.a.d(e11, "interval_duration");
            int d18 = O4.a.d(e11, "flex_duration");
            int d19 = O4.a.d(e11, "run_attempt_count");
            int d20 = O4.a.d(e11, "backoff_policy");
            int d21 = O4.a.d(e11, "backoff_delay_duration");
            int d22 = O4.a.d(e11, "last_enqueue_time");
            int d23 = O4.a.d(e11, "minimum_retention_duration");
            b10 = e10;
            try {
                int d24 = O4.a.d(e11, "schedule_requested_at");
                int d25 = O4.a.d(e11, "run_in_foreground");
                int d26 = O4.a.d(e11, "out_of_quota_policy");
                int d27 = O4.a.d(e11, "period_count");
                int d28 = O4.a.d(e11, "generation");
                int d29 = O4.a.d(e11, "next_schedule_time_override");
                int d30 = O4.a.d(e11, "next_schedule_time_override_generation");
                int d31 = O4.a.d(e11, "stop_reason");
                int d32 = O4.a.d(e11, "trace_tag");
                int d33 = O4.a.d(e11, "required_network_type");
                int d34 = O4.a.d(e11, "required_network_request");
                int d35 = O4.a.d(e11, "requires_charging");
                int d36 = O4.a.d(e11, "requires_device_idle");
                int d37 = O4.a.d(e11, "requires_battery_not_low");
                int d38 = O4.a.d(e11, "requires_storage_not_low");
                int d39 = O4.a.d(e11, "trigger_content_update_delay");
                int d40 = O4.a.d(e11, "trigger_max_content_delay");
                int d41 = O4.a.d(e11, "content_uri_triggers");
                int i17 = d23;
                ArrayList arrayList = new ArrayList(e11.getCount());
                while (e11.moveToNext()) {
                    String string = e11.getString(d10);
                    Q.c g10 = C8718D.g(e11.getInt(d11));
                    String string2 = e11.getString(d12);
                    String string3 = e11.getString(d13);
                    C7037f b11 = C7037f.b(e11.getBlob(d14));
                    C7037f b12 = C7037f.b(e11.getBlob(d15));
                    long j10 = e11.getLong(d16);
                    long j11 = e11.getLong(d17);
                    long j12 = e11.getLong(d18);
                    int i18 = e11.getInt(d19);
                    C7032a d42 = C8718D.d(e11.getInt(d20));
                    long j13 = e11.getLong(d21);
                    long j14 = e11.getLong(d22);
                    int i19 = i17;
                    long j15 = e11.getLong(i19);
                    int i20 = d10;
                    int i21 = d24;
                    long j16 = e11.getLong(i21);
                    d24 = i21;
                    int i22 = d25;
                    if (e11.getInt(i22) != 0) {
                        d25 = i22;
                        i11 = d26;
                        z10 = true;
                    } else {
                        d25 = i22;
                        i11 = d26;
                        z10 = false;
                    }
                    androidx.work.H f10 = C8718D.f(e11.getInt(i11));
                    d26 = i11;
                    int i23 = d27;
                    int i24 = e11.getInt(i23);
                    d27 = i23;
                    int i25 = d28;
                    int i26 = e11.getInt(i25);
                    d28 = i25;
                    int i27 = d29;
                    long j17 = e11.getLong(i27);
                    d29 = i27;
                    int i28 = d30;
                    int i29 = e11.getInt(i28);
                    d30 = i28;
                    int i30 = d31;
                    int i31 = e11.getInt(i30);
                    d31 = i30;
                    int i32 = d32;
                    if (e11.isNull(i32)) {
                        d32 = i32;
                        i12 = d33;
                        str = null;
                    } else {
                        str = e11.getString(i32);
                        d32 = i32;
                        i12 = d33;
                    }
                    C7056z e12 = C8718D.e(e11.getInt(i12));
                    d33 = i12;
                    int i33 = d34;
                    C8831z l10 = C8718D.l(e11.getBlob(i33));
                    d34 = i33;
                    int i34 = d35;
                    if (e11.getInt(i34) != 0) {
                        d35 = i34;
                        i13 = d36;
                        z11 = true;
                    } else {
                        d35 = i34;
                        i13 = d36;
                        z11 = false;
                    }
                    if (e11.getInt(i13) != 0) {
                        d36 = i13;
                        i14 = d37;
                        z12 = true;
                    } else {
                        d36 = i13;
                        i14 = d37;
                        z12 = false;
                    }
                    if (e11.getInt(i14) != 0) {
                        d37 = i14;
                        i15 = d38;
                        z13 = true;
                    } else {
                        d37 = i14;
                        i15 = d38;
                        z13 = false;
                    }
                    if (e11.getInt(i15) != 0) {
                        d38 = i15;
                        i16 = d39;
                        z14 = true;
                    } else {
                        d38 = i15;
                        i16 = d39;
                        z14 = false;
                    }
                    long j18 = e11.getLong(i16);
                    d39 = i16;
                    int i35 = d40;
                    long j19 = e11.getLong(i35);
                    d40 = i35;
                    int i36 = d41;
                    d41 = i36;
                    arrayList.add(new C8739u(string, g10, string2, string3, b11, b12, j10, j11, j12, new C7036e(l10, e12, z11, z12, z13, z14, j18, j19, C8718D.b(e11.getBlob(i36))), i18, d42, j13, j14, j15, j16, z10, f10, i24, i26, j17, i29, i31, str));
                    d10 = i20;
                    i17 = i19;
                }
                e11.close();
                b10.h();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                e11.close();
                b10.h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            b10 = e10;
            e11.close();
            b10.h();
            throw th;
        }
    }

    public int o() {
        this.f55955a.assertNotSuspendingTransaction();
        Q4.k acquire = this.f55969o.acquire();
        try {
            this.f55955a.beginTransaction();
            int b02 = acquire.b0();
            this.f55955a.setTransactionSuccessful();
            this.f55955a.endTransaction();
            this.f55969o.release(acquire);
            return b02;
        } catch (Throwable th2) {
            this.f55969o.release(acquire);
            throw th2;
        }
    }

    public void p(C8739u uVar) {
        this.f55955a.assertNotSuspendingTransaction();
        this.f55955a.beginTransaction();
        try {
            this.f55957c.handle(uVar);
            this.f55955a.setTransactionSuccessful();
        } finally {
            this.f55955a.endTransaction();
        }
    }

    public void q(C8739u uVar) {
        this.f55955a.assertNotSuspendingTransaction();
        this.f55955a.beginTransaction();
        try {
            this.f55956b.insert(uVar);
            this.f55955a.setTransactionSuccessful();
        } finally {
            this.f55955a.endTransaction();
        }
    }

    public int r(String str, long j10) {
        this.f55955a.assertNotSuspendingTransaction();
        Q4.k acquire = this.f55968n.acquire();
        acquire.i2(1, j10);
        acquire.H(2, str);
        try {
            this.f55955a.beginTransaction();
            int b02 = acquire.b0();
            this.f55955a.setTransactionSuccessful();
            this.f55955a.endTransaction();
            this.f55968n.release(acquire);
            return b02;
        } catch (Throwable th2) {
            this.f55968n.release(acquire);
            throw th2;
        }
    }

    public List<C8739u.b> s(String str) {
        B e10 = B.e("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        e10.H(1, str);
        this.f55955a.assertNotSuspendingTransaction();
        Cursor e11 = O4.b.e(this.f55955a, e10, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(e11.getCount());
            while (e11.moveToNext()) {
                arrayList.add(new C8739u.b(e11.getString(0), C8718D.g(e11.getInt(1))));
            }
            return arrayList;
        } finally {
            e11.close();
            e10.h();
        }
    }

    public C16532g<Boolean> t() {
        return C7009f.a(this.f55955a, false, new String[]{"workspec"}, new j(B.e("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0)));
    }

    public List<C8739u> u(int i10) {
        B b10;
        boolean z10;
        int i11;
        String str;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        int i16;
        B e10 = B.e("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        e10.i2(1, (long) i10);
        this.f55955a.assertNotSuspendingTransaction();
        Cursor e11 = O4.b.e(this.f55955a, e10, false, (CancellationSignal) null);
        try {
            int d10 = O4.a.d(e11, "id");
            int d11 = O4.a.d(e11, "state");
            int d12 = O4.a.d(e11, "worker_class_name");
            int d13 = O4.a.d(e11, "input_merger_class_name");
            int d14 = O4.a.d(e11, "input");
            int d15 = O4.a.d(e11, "output");
            int d16 = O4.a.d(e11, "initial_delay");
            int d17 = O4.a.d(e11, "interval_duration");
            int d18 = O4.a.d(e11, "flex_duration");
            int d19 = O4.a.d(e11, "run_attempt_count");
            int d20 = O4.a.d(e11, "backoff_policy");
            int d21 = O4.a.d(e11, "backoff_delay_duration");
            int d22 = O4.a.d(e11, "last_enqueue_time");
            int d23 = O4.a.d(e11, "minimum_retention_duration");
            b10 = e10;
            try {
                int d24 = O4.a.d(e11, "schedule_requested_at");
                int d25 = O4.a.d(e11, "run_in_foreground");
                int d26 = O4.a.d(e11, "out_of_quota_policy");
                int d27 = O4.a.d(e11, "period_count");
                int d28 = O4.a.d(e11, "generation");
                int d29 = O4.a.d(e11, "next_schedule_time_override");
                int d30 = O4.a.d(e11, "next_schedule_time_override_generation");
                int d31 = O4.a.d(e11, "stop_reason");
                int d32 = O4.a.d(e11, "trace_tag");
                int d33 = O4.a.d(e11, "required_network_type");
                int d34 = O4.a.d(e11, "required_network_request");
                int d35 = O4.a.d(e11, "requires_charging");
                int d36 = O4.a.d(e11, "requires_device_idle");
                int d37 = O4.a.d(e11, "requires_battery_not_low");
                int d38 = O4.a.d(e11, "requires_storage_not_low");
                int d39 = O4.a.d(e11, "trigger_content_update_delay");
                int d40 = O4.a.d(e11, "trigger_max_content_delay");
                int d41 = O4.a.d(e11, "content_uri_triggers");
                int i17 = d23;
                ArrayList arrayList = new ArrayList(e11.getCount());
                while (e11.moveToNext()) {
                    String string = e11.getString(d10);
                    Q.c g10 = C8718D.g(e11.getInt(d11));
                    String string2 = e11.getString(d12);
                    String string3 = e11.getString(d13);
                    C7037f b11 = C7037f.b(e11.getBlob(d14));
                    C7037f b12 = C7037f.b(e11.getBlob(d15));
                    long j10 = e11.getLong(d16);
                    long j11 = e11.getLong(d17);
                    long j12 = e11.getLong(d18);
                    int i18 = e11.getInt(d19);
                    C7032a d42 = C8718D.d(e11.getInt(d20));
                    long j13 = e11.getLong(d21);
                    long j14 = e11.getLong(d22);
                    int i19 = i17;
                    long j15 = e11.getLong(i19);
                    int i20 = d10;
                    int i21 = d24;
                    long j16 = e11.getLong(i21);
                    d24 = i21;
                    int i22 = d25;
                    if (e11.getInt(i22) != 0) {
                        d25 = i22;
                        i11 = d26;
                        z10 = true;
                    } else {
                        d25 = i22;
                        i11 = d26;
                        z10 = false;
                    }
                    androidx.work.H f10 = C8718D.f(e11.getInt(i11));
                    d26 = i11;
                    int i23 = d27;
                    int i24 = e11.getInt(i23);
                    d27 = i23;
                    int i25 = d28;
                    int i26 = e11.getInt(i25);
                    d28 = i25;
                    int i27 = d29;
                    long j17 = e11.getLong(i27);
                    d29 = i27;
                    int i28 = d30;
                    int i29 = e11.getInt(i28);
                    d30 = i28;
                    int i30 = d31;
                    int i31 = e11.getInt(i30);
                    d31 = i30;
                    int i32 = d32;
                    if (e11.isNull(i32)) {
                        d32 = i32;
                        i12 = d33;
                        str = null;
                    } else {
                        str = e11.getString(i32);
                        d32 = i32;
                        i12 = d33;
                    }
                    C7056z e12 = C8718D.e(e11.getInt(i12));
                    d33 = i12;
                    int i33 = d34;
                    C8831z l10 = C8718D.l(e11.getBlob(i33));
                    d34 = i33;
                    int i34 = d35;
                    if (e11.getInt(i34) != 0) {
                        d35 = i34;
                        i13 = d36;
                        z11 = true;
                    } else {
                        d35 = i34;
                        i13 = d36;
                        z11 = false;
                    }
                    if (e11.getInt(i13) != 0) {
                        d36 = i13;
                        i14 = d37;
                        z12 = true;
                    } else {
                        d36 = i13;
                        i14 = d37;
                        z12 = false;
                    }
                    if (e11.getInt(i14) != 0) {
                        d37 = i14;
                        i15 = d38;
                        z13 = true;
                    } else {
                        d37 = i14;
                        i15 = d38;
                        z13 = false;
                    }
                    if (e11.getInt(i15) != 0) {
                        d38 = i15;
                        i16 = d39;
                        z14 = true;
                    } else {
                        d38 = i15;
                        i16 = d39;
                        z14 = false;
                    }
                    long j18 = e11.getLong(i16);
                    d39 = i16;
                    int i35 = d40;
                    long j19 = e11.getLong(i35);
                    d40 = i35;
                    int i36 = d41;
                    d41 = i36;
                    arrayList.add(new C8739u(string, g10, string2, string3, b11, b12, j10, j11, j12, new C7036e(l10, e12, z11, z12, z13, z14, j18, j19, C8718D.b(e11.getBlob(i36))), i18, d42, j13, j14, j15, j16, z10, f10, i24, i26, j17, i29, i31, str));
                    d10 = i20;
                    i17 = i19;
                }
                e11.close();
                b10.h();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                e11.close();
                b10.h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            b10 = e10;
            e11.close();
            b10.h();
            throw th;
        }
    }

    public int v(Q.c cVar, String str) {
        this.f55955a.assertNotSuspendingTransaction();
        Q4.k acquire = this.f55959e.acquire();
        acquire.i2(1, (long) C8718D.k(cVar));
        acquire.H(2, str);
        try {
            this.f55955a.beginTransaction();
            int b02 = acquire.b0();
            this.f55955a.setTransactionSuccessful();
            this.f55955a.endTransaction();
            this.f55959e.release(acquire);
            return b02;
        } catch (Throwable th2) {
            this.f55959e.release(acquire);
            throw th2;
        }
    }

    public void w(String str, C7037f fVar) {
        this.f55955a.assertNotSuspendingTransaction();
        Q4.k acquire = this.f55962h.acquire();
        acquire.o2(1, C7037f.j(fVar));
        acquire.H(2, str);
        try {
            this.f55955a.beginTransaction();
            acquire.b0();
            this.f55955a.setTransactionSuccessful();
            this.f55955a.endTransaction();
            this.f55962h.release(acquire);
        } catch (Throwable th2) {
            this.f55962h.release(acquire);
            throw th2;
        }
    }

    public void x(String str, long j10) {
        this.f55955a.assertNotSuspendingTransaction();
        Q4.k acquire = this.f55963i.acquire();
        acquire.i2(1, j10);
        acquire.H(2, str);
        try {
            this.f55955a.beginTransaction();
            acquire.b0();
            this.f55955a.setTransactionSuccessful();
            this.f55955a.endTransaction();
            this.f55963i.release(acquire);
        } catch (Throwable th2) {
            this.f55963i.release(acquire);
            throw th2;
        }
    }

    public List<C8739u> y() {
        B b10;
        boolean z10;
        int i10;
        String str;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        B e10 = B.e("SELECT * FROM workspec WHERE state=1", 0);
        this.f55955a.assertNotSuspendingTransaction();
        Cursor e11 = O4.b.e(this.f55955a, e10, false, (CancellationSignal) null);
        try {
            int d10 = O4.a.d(e11, "id");
            int d11 = O4.a.d(e11, "state");
            int d12 = O4.a.d(e11, "worker_class_name");
            int d13 = O4.a.d(e11, "input_merger_class_name");
            int d14 = O4.a.d(e11, "input");
            int d15 = O4.a.d(e11, "output");
            int d16 = O4.a.d(e11, "initial_delay");
            int d17 = O4.a.d(e11, "interval_duration");
            int d18 = O4.a.d(e11, "flex_duration");
            int d19 = O4.a.d(e11, "run_attempt_count");
            int d20 = O4.a.d(e11, "backoff_policy");
            int d21 = O4.a.d(e11, "backoff_delay_duration");
            int d22 = O4.a.d(e11, "last_enqueue_time");
            int d23 = O4.a.d(e11, "minimum_retention_duration");
            b10 = e10;
            try {
                int d24 = O4.a.d(e11, "schedule_requested_at");
                int d25 = O4.a.d(e11, "run_in_foreground");
                int d26 = O4.a.d(e11, "out_of_quota_policy");
                int d27 = O4.a.d(e11, "period_count");
                int d28 = O4.a.d(e11, "generation");
                int d29 = O4.a.d(e11, "next_schedule_time_override");
                int d30 = O4.a.d(e11, "next_schedule_time_override_generation");
                int d31 = O4.a.d(e11, "stop_reason");
                int d32 = O4.a.d(e11, "trace_tag");
                int d33 = O4.a.d(e11, "required_network_type");
                int d34 = O4.a.d(e11, "required_network_request");
                int d35 = O4.a.d(e11, "requires_charging");
                int d36 = O4.a.d(e11, "requires_device_idle");
                int d37 = O4.a.d(e11, "requires_battery_not_low");
                int d38 = O4.a.d(e11, "requires_storage_not_low");
                int d39 = O4.a.d(e11, "trigger_content_update_delay");
                int d40 = O4.a.d(e11, "trigger_max_content_delay");
                int d41 = O4.a.d(e11, "content_uri_triggers");
                int i16 = d23;
                ArrayList arrayList = new ArrayList(e11.getCount());
                while (e11.moveToNext()) {
                    String string = e11.getString(d10);
                    Q.c g10 = C8718D.g(e11.getInt(d11));
                    String string2 = e11.getString(d12);
                    String string3 = e11.getString(d13);
                    C7037f b11 = C7037f.b(e11.getBlob(d14));
                    C7037f b12 = C7037f.b(e11.getBlob(d15));
                    long j10 = e11.getLong(d16);
                    long j11 = e11.getLong(d17);
                    long j12 = e11.getLong(d18);
                    int i17 = e11.getInt(d19);
                    C7032a d42 = C8718D.d(e11.getInt(d20));
                    long j13 = e11.getLong(d21);
                    long j14 = e11.getLong(d22);
                    int i18 = i16;
                    long j15 = e11.getLong(i18);
                    int i19 = d10;
                    int i20 = d24;
                    long j16 = e11.getLong(i20);
                    d24 = i20;
                    int i21 = d25;
                    if (e11.getInt(i21) != 0) {
                        d25 = i21;
                        i10 = d26;
                        z10 = true;
                    } else {
                        d25 = i21;
                        i10 = d26;
                        z10 = false;
                    }
                    androidx.work.H f10 = C8718D.f(e11.getInt(i10));
                    d26 = i10;
                    int i22 = d27;
                    int i23 = e11.getInt(i22);
                    d27 = i22;
                    int i24 = d28;
                    int i25 = e11.getInt(i24);
                    d28 = i24;
                    int i26 = d29;
                    long j17 = e11.getLong(i26);
                    d29 = i26;
                    int i27 = d30;
                    int i28 = e11.getInt(i27);
                    d30 = i27;
                    int i29 = d31;
                    int i30 = e11.getInt(i29);
                    d31 = i29;
                    int i31 = d32;
                    if (e11.isNull(i31)) {
                        d32 = i31;
                        i11 = d33;
                        str = null;
                    } else {
                        str = e11.getString(i31);
                        d32 = i31;
                        i11 = d33;
                    }
                    C7056z e12 = C8718D.e(e11.getInt(i11));
                    d33 = i11;
                    int i32 = d34;
                    C8831z l10 = C8718D.l(e11.getBlob(i32));
                    d34 = i32;
                    int i33 = d35;
                    if (e11.getInt(i33) != 0) {
                        d35 = i33;
                        i12 = d36;
                        z11 = true;
                    } else {
                        d35 = i33;
                        i12 = d36;
                        z11 = false;
                    }
                    if (e11.getInt(i12) != 0) {
                        d36 = i12;
                        i13 = d37;
                        z12 = true;
                    } else {
                        d36 = i12;
                        i13 = d37;
                        z12 = false;
                    }
                    if (e11.getInt(i13) != 0) {
                        d37 = i13;
                        i14 = d38;
                        z13 = true;
                    } else {
                        d37 = i13;
                        i14 = d38;
                        z13 = false;
                    }
                    if (e11.getInt(i14) != 0) {
                        d38 = i14;
                        i15 = d39;
                        z14 = true;
                    } else {
                        d38 = i14;
                        i15 = d39;
                        z14 = false;
                    }
                    long j18 = e11.getLong(i15);
                    d39 = i15;
                    int i34 = d40;
                    long j19 = e11.getLong(i34);
                    d40 = i34;
                    int i35 = d41;
                    d41 = i35;
                    arrayList.add(new C8739u(string, g10, string2, string3, b11, b12, j10, j11, j12, new C7036e(l10, e12, z11, z12, z13, z14, j18, j19, C8718D.b(e11.getBlob(i35))), i17, d42, j13, j14, j15, j16, z10, f10, i23, i25, j17, i28, i30, str));
                    d10 = i19;
                    i16 = i18;
                }
                e11.close();
                b10.h();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                e11.close();
                b10.h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            b10 = e10;
            e11.close();
            b10.h();
            throw th;
        }
    }

    public List<C8739u> z() {
        B b10;
        boolean z10;
        int i10;
        String str;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        B e10 = B.e("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.f55955a.assertNotSuspendingTransaction();
        Cursor e11 = O4.b.e(this.f55955a, e10, false, (CancellationSignal) null);
        try {
            int d10 = O4.a.d(e11, "id");
            int d11 = O4.a.d(e11, "state");
            int d12 = O4.a.d(e11, "worker_class_name");
            int d13 = O4.a.d(e11, "input_merger_class_name");
            int d14 = O4.a.d(e11, "input");
            int d15 = O4.a.d(e11, "output");
            int d16 = O4.a.d(e11, "initial_delay");
            int d17 = O4.a.d(e11, "interval_duration");
            int d18 = O4.a.d(e11, "flex_duration");
            int d19 = O4.a.d(e11, "run_attempt_count");
            int d20 = O4.a.d(e11, "backoff_policy");
            int d21 = O4.a.d(e11, "backoff_delay_duration");
            int d22 = O4.a.d(e11, "last_enqueue_time");
            int d23 = O4.a.d(e11, "minimum_retention_duration");
            b10 = e10;
            try {
                int d24 = O4.a.d(e11, "schedule_requested_at");
                int d25 = O4.a.d(e11, "run_in_foreground");
                int d26 = O4.a.d(e11, "out_of_quota_policy");
                int d27 = O4.a.d(e11, "period_count");
                int d28 = O4.a.d(e11, "generation");
                int d29 = O4.a.d(e11, "next_schedule_time_override");
                int d30 = O4.a.d(e11, "next_schedule_time_override_generation");
                int d31 = O4.a.d(e11, "stop_reason");
                int d32 = O4.a.d(e11, "trace_tag");
                int d33 = O4.a.d(e11, "required_network_type");
                int d34 = O4.a.d(e11, "required_network_request");
                int d35 = O4.a.d(e11, "requires_charging");
                int d36 = O4.a.d(e11, "requires_device_idle");
                int d37 = O4.a.d(e11, "requires_battery_not_low");
                int d38 = O4.a.d(e11, "requires_storage_not_low");
                int d39 = O4.a.d(e11, "trigger_content_update_delay");
                int d40 = O4.a.d(e11, "trigger_max_content_delay");
                int d41 = O4.a.d(e11, "content_uri_triggers");
                int i16 = d23;
                ArrayList arrayList = new ArrayList(e11.getCount());
                while (e11.moveToNext()) {
                    String string = e11.getString(d10);
                    Q.c g10 = C8718D.g(e11.getInt(d11));
                    String string2 = e11.getString(d12);
                    String string3 = e11.getString(d13);
                    C7037f b11 = C7037f.b(e11.getBlob(d14));
                    C7037f b12 = C7037f.b(e11.getBlob(d15));
                    long j10 = e11.getLong(d16);
                    long j11 = e11.getLong(d17);
                    long j12 = e11.getLong(d18);
                    int i17 = e11.getInt(d19);
                    C7032a d42 = C8718D.d(e11.getInt(d20));
                    long j13 = e11.getLong(d21);
                    long j14 = e11.getLong(d22);
                    int i18 = i16;
                    long j15 = e11.getLong(i18);
                    int i19 = d10;
                    int i20 = d24;
                    long j16 = e11.getLong(i20);
                    d24 = i20;
                    int i21 = d25;
                    if (e11.getInt(i21) != 0) {
                        d25 = i21;
                        i10 = d26;
                        z10 = true;
                    } else {
                        d25 = i21;
                        i10 = d26;
                        z10 = false;
                    }
                    androidx.work.H f10 = C8718D.f(e11.getInt(i10));
                    d26 = i10;
                    int i22 = d27;
                    int i23 = e11.getInt(i22);
                    d27 = i22;
                    int i24 = d28;
                    int i25 = e11.getInt(i24);
                    d28 = i24;
                    int i26 = d29;
                    long j17 = e11.getLong(i26);
                    d29 = i26;
                    int i27 = d30;
                    int i28 = e11.getInt(i27);
                    d30 = i27;
                    int i29 = d31;
                    int i30 = e11.getInt(i29);
                    d31 = i29;
                    int i31 = d32;
                    if (e11.isNull(i31)) {
                        d32 = i31;
                        i11 = d33;
                        str = null;
                    } else {
                        str = e11.getString(i31);
                        d32 = i31;
                        i11 = d33;
                    }
                    C7056z e12 = C8718D.e(e11.getInt(i11));
                    d33 = i11;
                    int i32 = d34;
                    C8831z l10 = C8718D.l(e11.getBlob(i32));
                    d34 = i32;
                    int i33 = d35;
                    if (e11.getInt(i33) != 0) {
                        d35 = i33;
                        i12 = d36;
                        z11 = true;
                    } else {
                        d35 = i33;
                        i12 = d36;
                        z11 = false;
                    }
                    if (e11.getInt(i12) != 0) {
                        d36 = i12;
                        i13 = d37;
                        z12 = true;
                    } else {
                        d36 = i12;
                        i13 = d37;
                        z12 = false;
                    }
                    if (e11.getInt(i13) != 0) {
                        d37 = i13;
                        i14 = d38;
                        z13 = true;
                    } else {
                        d37 = i13;
                        i14 = d38;
                        z13 = false;
                    }
                    if (e11.getInt(i14) != 0) {
                        d38 = i14;
                        i15 = d39;
                        z14 = true;
                    } else {
                        d38 = i14;
                        i15 = d39;
                        z14 = false;
                    }
                    long j18 = e11.getLong(i15);
                    d39 = i15;
                    int i34 = d40;
                    long j19 = e11.getLong(i34);
                    d40 = i34;
                    int i35 = d41;
                    d41 = i35;
                    arrayList.add(new C8739u(string, g10, string2, string3, b11, b12, j10, j11, j12, new C7036e(l10, e12, z11, z12, z13, z14, j18, j19, C8718D.b(e11.getBlob(i35))), i17, d42, j13, j14, j15, j16, z10, f10, i23, i25, j17, i28, i30, str));
                    d10 = i19;
                    i16 = i18;
                }
                e11.close();
                b10.h();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                e11.close();
                b10.h();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            b10 = e10;
            e11.close();
            b10.h();
            throw th;
        }
    }
}
