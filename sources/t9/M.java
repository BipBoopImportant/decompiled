package t9;

import WH.C16729a;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import j9.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import l9.h;
import l9.i;
import l9.p;
import o9.C8611a;
import o9.C8612b;
import o9.C8613c;
import o9.C8614d;
import o9.C8615e;
import o9.C8616f;
import p9.C8639a;
import u9.C8887a;
import u9.C8888b;
import v9.C8903a;
import w9.C8934a;

public class M implements C8856d, C8888b, C8855c {

    /* renamed from: f  reason: collision with root package name */
    private static final j9.c f56680f = j9.c.b("proto");

    /* renamed from: a  reason: collision with root package name */
    private final W f56681a;

    /* renamed from: b  reason: collision with root package name */
    private final C8903a f56682b;

    /* renamed from: c  reason: collision with root package name */
    private final C8903a f56683c;

    /* renamed from: d  reason: collision with root package name */
    private final C8857e f56684d;

    /* renamed from: e  reason: collision with root package name */
    private final C16729a<String> f56685e;

    interface b<T, U> {
        U apply(T t10);
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        final String f56686a;

        /* renamed from: b  reason: collision with root package name */
        final String f56687b;

        private c(String str, String str2) {
            this.f56686a = str;
            this.f56687b = str2;
        }
    }

    interface d<T> {
        T a();
    }

    M(C8903a aVar, C8903a aVar2, C8857e eVar, W w10, C16729a<String> aVar3) {
        this.f56681a = w10;
        this.f56682b = aVar;
        this.f56683c = aVar2;
        this.f56684d = eVar;
        this.f56685e = aVar3;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List D1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(p.a().b(cursor.getString(1)).d(C8934a.b(cursor.getInt(2))).c(y2(cursor.getString(3))).a());
        }
        return arrayList;
    }

    private byte[] E2(long j10) {
        return (byte[]) M2(E0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, (String) null, (String) null, "sequence_num"), new C8842B());
    }

    private C8612b F0() {
        return C8612b.b().b(C8615e.c().b(A0()).c(C8857e.f56721a.f()).a()).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List F1(p pVar, SQLiteDatabase sQLiteDatabase) {
        List<C8863k> r22 = r2(sQLiteDatabase, pVar, this.f56684d.d());
        for (f fVar : f.values()) {
            if (fVar != pVar.d()) {
                int d10 = this.f56684d.d() - r22.size();
                if (d10 <= 0) {
                    break;
                }
                r22.addAll(r2(sQLiteDatabase, pVar.f(fVar), d10));
            }
        }
        return R0(r22, t2(sQLiteDatabase, r22));
    }

    private <T> T G2(d<T> dVar, b<Throwable, T> bVar) {
        long a10 = this.f56683c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f56683c.a() >= ((long) this.f56684d.b()) + a10) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50);
            }
        }
    }

    private static j9.c H2(String str) {
        return str == null ? f56680f : j9.c.b(str);
    }

    private long I0() {
        return E0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C8611a I1(Map map, C8611a.C0887a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C8613c.b o02 = o0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C8613c.c().c(o02).b(j10).a());
        }
        z2(aVar, map);
        return aVar.e(N0()).d(F0()).c(this.f56685e.get()).b();
    }

    private static String J2(Iterable<C8863k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<C8863k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    private long K0() {
        return E0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C8611a L1(String str, Map map, C8611a.C0887a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C8611a) M2(sQLiteDatabase.rawQuery(str, new String[0]), new C8841A(this, map, aVar));
    }

    static <T> T M2(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    private C8616f N0() {
        return (C8616f) P0(new C8843C(this.f56682b.a()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object N1(List list, p pVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z10 = false;
            long j10 = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z10 = true;
            }
            i.a o10 = i.a().n(cursor.getString(1)).i(cursor.getLong(2)).o(cursor.getLong(3));
            if (z10) {
                o10.h(new h(H2(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                o10.h(new h(H2(cursor.getString(4)), E2(j10)));
            }
            if (!cursor.isNull(6)) {
                o10.g(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                o10.l(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                o10.m(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                o10.j(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                o10.k(cursor.getBlob(11));
            }
            list.add(C8863k.a(j10, pVar, o10.d()));
        }
        return null;
    }

    private Long O0(SQLiteDatabase sQLiteDatabase, p pVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{pVar.b(), String.valueOf(C8934a.a(pVar.d()))}));
        if (pVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) M2(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), (String) null, (String) null, (String) null), new C8866n());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object P1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    private boolean Q0() {
        return I0() * K0() >= this.f56684d.f();
    }

    private List<C8863k> R0(List<C8863k> list, Map<Long, Set<c>> map) {
        ListIterator<C8863k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            C8863k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.c()))) {
                i.a p10 = next.b().p();
                for (c cVar : map.get(Long.valueOf(next.c()))) {
                    p10.c(cVar.f56686a, cVar.f56687b);
                }
                listIterator.set(C8863k.a(next.c(), next.d(), p10.d()));
            }
        }
        return list;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object S0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            f((long) i10, C8613c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer T0(long j10, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j10)};
        M2(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new C8870s(this));
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Long U1(i iVar, p pVar, SQLiteDatabase sQLiteDatabase) {
        if (Q0()) {
            f(1, C8613c.b.CACHE_FULL, iVar.n());
            return -1L;
        }
        long t02 = t0(sQLiteDatabase, pVar);
        int e10 = this.f56684d.e();
        byte[] a10 = iVar.e().a();
        boolean z10 = a10.length <= e10;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(t02));
        contentValues.put("transport_name", iVar.n());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.o()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? a10 : new byte[0]);
        contentValues.put("product_id", iVar.l());
        contentValues.put("pseudonymous_id", iVar.m());
        contentValues.put("experiment_ids_clear_blob", iVar.g());
        contentValues.put("experiment_ids_encrypted_blob", iVar.h());
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(((double) a10.length) / ((double) e10));
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(a10, (i10 - 1) * e10, Math.min(i10 * e10, a10.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues2);
            }
        }
        for (Map.Entry next : iVar.k().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) next.getKey());
            contentValues3.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ byte[] W1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object X0(Throwable th2) {
        throw new C8887a("Timed out while trying to acquire the lock.", th2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SQLiteDatabase Y0(Throwable th2) {
        throw new C8887a("Timed out while trying to open db.", th2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Long a1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object c2(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            f((long) i10, C8613c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object e2(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        M2(sQLiteDatabase.rawQuery(str2, (String[]) null), new C8873v(this));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean f2(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C8616f h1(long j10, SQLiteDatabase sQLiteDatabase) {
        return (C8616f) M2(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new C8844D(j10));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Long k1(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object m2(String str, C8613c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) M2(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.d())}), new y())).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.d()));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", (String) null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.d())});
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object n2(long j10, p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(C8934a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put("priority", Integer.valueOf(C8934a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        return null;
    }

    private C8613c.b o0(int i10) {
        C8613c.b bVar = C8613c.b.REASON_UNKNOWN;
        if (i10 == bVar.d()) {
            return bVar;
        }
        C8613c.b bVar2 = C8613c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.d()) {
            return bVar2;
        }
        C8613c.b bVar3 = C8613c.b.CACHE_FULL;
        if (i10 == bVar3.d()) {
            return bVar3;
        }
        C8613c.b bVar4 = C8613c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.d()) {
            return bVar4;
        }
        C8613c.b bVar5 = C8613c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.d()) {
            return bVar5;
        }
        C8613c.b bVar6 = C8613c.b.INVALID_PAYLOD;
        if (i10 == bVar6.d()) {
            return bVar6;
        }
        C8613c.b bVar7 = C8613c.b.SERVER_ERROR;
        if (i10 == bVar7.d()) {
            return bVar7;
        }
        C8639a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean o1(p pVar, SQLiteDatabase sQLiteDatabase) {
        Long O02 = O0(sQLiteDatabase, pVar);
        return O02 == null ? Boolean.FALSE : (Boolean) M2(E0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{O02.toString()}), new C8872u());
    }

    private void p0(SQLiteDatabase sQLiteDatabase) {
        G2(new C8864l(sQLiteDatabase), new C8874w());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object p2(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f56682b.a()).execute();
        return null;
    }

    private List<C8863k> r2(SQLiteDatabase sQLiteDatabase, p pVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long O02 = O0(sQLiteDatabase, pVar);
        if (O02 == null) {
            return arrayList;
        }
        M2(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{O02.toString()}, (String) null, (String) null, (String) null, String.valueOf(i10)), new C8875x(this, arrayList, pVar));
        return arrayList;
    }

    private long t0(SQLiteDatabase sQLiteDatabase, p pVar) {
        Long O02 = O0(sQLiteDatabase, pVar);
        if (O02 != null) {
            return O02.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put("priority", Integer.valueOf(C8934a.a(pVar.d())));
        contentValues.put("next_request_ms", 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
    }

    private Map<Long, Set<c>> t2(SQLiteDatabase sQLiteDatabase, List<C8863k> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(list.get(i10).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        M2(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), (String[]) null, (String) null, (String) null, (String) null), new z(hashMap));
        return hashMap;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List y1(SQLiteDatabase sQLiteDatabase) {
        return (List) M2(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new C8851K());
    }

    private static byte[] y2(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void z2(C8611a.C0887a aVar, Map<String, List<C8613c>> map) {
        for (Map.Entry next : map.entrySet()) {
            aVar.a(C8614d.c().c((String) next.getKey()).b((List) next.getValue()).a());
        }
    }

    /* access modifiers changed from: package-private */
    public long A0() {
        return I0() * K0();
    }

    /* access modifiers changed from: package-private */
    public SQLiteDatabase E0() {
        W w10 = this.f56681a;
        Objects.requireNonNull(w10);
        return (SQLiteDatabase) G2(new C8845E(w10), new C8846F());
    }

    /* access modifiers changed from: package-private */
    public <T> T P0(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase E02 = E0();
        E02.beginTransaction();
        try {
            T apply = bVar.apply(E02);
            E02.setTransactionSuccessful();
            return apply;
        } finally {
            E02.endTransaction();
        }
    }

    public void Q(Iterable<C8863k> iterable) {
        if (iterable.iterator().hasNext()) {
            E0().compileStatement("DELETE FROM events WHERE _id in " + J2(iterable)).execute();
        }
    }

    public void Z2(p pVar, long j10) {
        P0(new C8868p(j10, pVar));
    }

    public void c() {
        P0(new C8869q(this));
    }

    public int cleanUp() {
        return ((Integer) P0(new C8850J(this, this.f56682b.a() - this.f56684d.c()))).intValue();
    }

    public void close() {
        this.f56681a.close();
    }

    public <T> T d(C8888b.a<T> aVar) {
        SQLiteDatabase E02 = E0();
        p0(E02);
        try {
            T execute = aVar.execute();
            E02.setTransactionSuccessful();
            return execute;
        } finally {
            E02.endTransaction();
        }
    }

    public C8611a e() {
        return (C8611a) P0(new C8871t(this, "SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new HashMap(), C8611a.e()));
    }

    public void f(long j10, C8613c.b bVar, String str) {
        P0(new r(str, bVar, j10));
    }

    public C8863k g1(p pVar, i iVar) {
        C8639a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.n(), pVar.b());
        long longValue = ((Long) P0(new C8849I(this, iVar, pVar))).longValue();
        if (longValue < 1) {
            return null;
        }
        return C8863k.a(longValue, pVar, iVar);
    }

    public boolean j1(p pVar) {
        return ((Boolean) P0(new C8867o(this, pVar))).booleanValue();
    }

    public Iterable<p> k0() {
        return (Iterable) P0(new C8847G());
    }

    public long p1(p pVar) {
        return ((Long) M2(E0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(C8934a.a(pVar.d()))}), new C8848H())).longValue();
    }

    public void r1(Iterable<C8863k> iterable) {
        if (iterable.iterator().hasNext()) {
            P0(new C8852L(this, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + J2(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
    }

    public Iterable<C8863k> s0(p pVar) {
        return (Iterable) P0(new C8865m(this, pVar));
    }
}
