package t9;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

final class W extends SQLiteOpenHelper {

    /* renamed from: c  reason: collision with root package name */
    private static final String f56693c = ("INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")");

    /* renamed from: d  reason: collision with root package name */
    static int f56694d = 7;

    /* renamed from: e  reason: collision with root package name */
    private static final a f56695e;

    /* renamed from: f  reason: collision with root package name */
    private static final a f56696f;

    /* renamed from: g  reason: collision with root package name */
    private static final a f56697g;

    /* renamed from: h  reason: collision with root package name */
    private static final a f56698h;

    /* renamed from: i  reason: collision with root package name */
    private static final a f56699i;

    /* renamed from: j  reason: collision with root package name */
    private static final a f56700j;

    /* renamed from: k  reason: collision with root package name */
    private static final a f56701k;

    /* renamed from: l  reason: collision with root package name */
    private static final List<a> f56702l;

    /* renamed from: a  reason: collision with root package name */
    private final int f56703a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f56704b = false;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        O o10 = new O();
        f56695e = o10;
        P p10 = new P();
        f56696f = p10;
        Q q10 = new Q();
        f56697g = q10;
        S s10 = new S();
        f56698h = s10;
        T t10 = new T();
        f56699i = t10;
        U u10 = new U();
        f56700j = u10;
        V v10 = new V();
        f56701k = v10;
        f56702l = Arrays.asList(new a[]{o10, p10, q10, s10, t10, u10, v10});
    }

    W(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f56703a = i10;
    }

    private void l(SQLiteDatabase sQLiteDatabase) {
        if (!this.f56704b) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void o(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void s(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void t(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f56693c);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void v(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    private void w(SQLiteDatabase sQLiteDatabase, int i10) {
        l(sQLiteDatabase);
        x(sQLiteDatabase, 0, i10);
    }

    private void x(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f56702l;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                f56702l.get(i10).a(sQLiteDatabase);
                i10++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i10 + " to " + i11 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f56704b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        w(sQLiteDatabase, this.f56703a);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        w(sQLiteDatabase, i11);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        l(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        l(sQLiteDatabase);
        x(sQLiteDatabase, i10, i11);
    }
}
