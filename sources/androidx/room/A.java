package androidx.room;

import Q4.g;
import Q4.h;
import XH.C16814e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0017\u0018\u0000 \u00172\u00020\u0001:\u0003\u001f\u0012\u001bB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ'\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001e¨\u0006 "}, d2 = {"Landroidx/room/A;", "LQ4/h$a;", "Landroidx/room/h;", "configuration", "Landroidx/room/A$b;", "delegate", "", "identityHash", "legacyHash", "<init>", "(Landroidx/room/h;Landroidx/room/A$b;Ljava/lang/String;Ljava/lang/String;)V", "LQ4/g;", "db", "LXH/N;", "h", "(LQ4/g;)V", "j", "i", "b", "d", "", "oldVersion", "newVersion", "g", "(LQ4/g;II)V", "e", "f", "c", "Landroidx/room/h;", "Landroidx/room/A$b;", "Ljava/lang/String;", "a", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class A extends h.a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f44201g = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private C7011h f44202c;

    /* renamed from: d  reason: collision with root package name */
    private final b f44203d;

    /* renamed from: e  reason: collision with root package name */
    private final String f44204e;

    /* renamed from: f  reason: collision with root package name */
    private final String f44205f;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Landroidx/room/A$a;", "", "<init>", "()V", "LQ4/g;", "db", "", "b", "(LQ4/g;)Z", "a", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            jI.C17416c.a(r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(Q4.g r3) {
            /*
                r2 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.C17542s.j(r3, r0)
                java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
                android.database.Cursor r3 = r3.u2(r0)
                boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x001a }
                r1 = 0
                if (r0 == 0) goto L_0x001c
                int r0 = r3.getInt(r1)     // Catch:{ all -> 0x001a }
                if (r0 != 0) goto L_0x001c
                r1 = 1
                goto L_0x001c
            L_0x001a:
                r0 = move-exception
                goto L_0x0021
            L_0x001c:
                r0 = 0
                jI.C17416c.a(r3, r0)
                return r1
            L_0x0021:
                throw r0     // Catch:{ all -> 0x0022 }
            L_0x0022:
                r1 = move-exception
                jI.C17416c.a(r3, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.A.a.a(Q4.g):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            jI.C17416c.a(r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b(Q4.g r3) {
            /*
                r2 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.C17542s.j(r3, r0)
                java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
                android.database.Cursor r3 = r3.u2(r0)
                boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x001a }
                r1 = 0
                if (r0 == 0) goto L_0x001c
                int r0 = r3.getInt(r1)     // Catch:{ all -> 0x001a }
                if (r0 == 0) goto L_0x001c
                r1 = 1
                goto L_0x001c
            L_0x001a:
                r0 = move-exception
                goto L_0x0021
            L_0x001c:
                r0 = 0
                jI.C17416c.a(r3, r0)
                return r1
            L_0x0021:
                throw r0     // Catch:{ all -> 0x0022 }
            L_0x0022:
                r1 = move-exception
                jI.C17416c.a(r3, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.A.a.b(Q4.g):boolean");
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/room/A$b;", "", "", "version", "<init>", "(I)V", "LQ4/g;", "db", "LXH/N;", "dropAllTables", "(LQ4/g;)V", "createAllTables", "onOpen", "onCreate", "validateMigration", "Landroidx/room/A$c;", "onValidateSchema", "(LQ4/g;)Landroidx/room/A$c;", "onPreMigrate", "onPostMigrate", "I", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b {
        public final int version;

        public b(int i10) {
            this.version = i10;
        }

        public abstract void createAllTables(g gVar);

        public abstract void dropAllTables(g gVar);

        public abstract void onCreate(g gVar);

        public abstract void onOpen(g gVar);

        public void onPostMigrate(g gVar) {
            C17542s.j(gVar, "db");
        }

        public void onPreMigrate(g gVar) {
            C17542s.j(gVar, "db");
        }

        public c onValidateSchema(g gVar) {
            C17542s.j(gVar, "db");
            validateMigration(gVar);
            return new c(true, (String) null);
        }

        /* access modifiers changed from: protected */
        @C16814e
        public void validateMigration(g gVar) {
            C17542s.j(gVar, "db");
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/room/A$c;", "", "", "isValid", "", "expectedFoundMsg", "<init>", "(ZLjava/lang/String;)V", "a", "Z", "b", "Ljava/lang/String;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f44206a;

        /* renamed from: b  reason: collision with root package name */
        public final String f44207b;

        public c(boolean z10, String str) {
            this.f44206a = z10;
            this.f44207b = str;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public A(C7011h hVar, b bVar, String str, String str2) {
        super(bVar.version);
        C17542s.j(hVar, "configuration");
        C17542s.j(bVar, "delegate");
        C17542s.j(str, "identityHash");
        C17542s.j(str2, "legacyHash");
        this.f44202c = hVar;
        this.f44203d = bVar;
        this.f44204e = str;
        this.f44205f = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        jI.C17416c.a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void h(Q4.g r4) {
        /*
            r3 = this;
            androidx.room.A$a r0 = f44201g
            boolean r0 = r0.b(r4)
            if (r0 == 0) goto L_0x005e
            Q4.a r0 = new Q4.a
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r0.<init>(r1)
            android.database.Cursor r4 = r4.l3(r0)
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0020 }
            r1 = 0
            if (r0 == 0) goto L_0x0022
            r0 = 0
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x0020 }
            goto L_0x0023
        L_0x0020:
            r0 = move-exception
            goto L_0x0058
        L_0x0022:
            r0 = r1
        L_0x0023:
            jI.C17416c.a(r4, r1)
            java.lang.String r4 = r3.f44204e
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r0)
            if (r4 != 0) goto L_0x0070
            java.lang.String r4 = r3.f44205f
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r0)
            if (r4 == 0) goto L_0x0037
            goto L_0x0070
        L_0x0037:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r1.append(r2)
            java.lang.String r2 = r3.f44204e
            r1.append(r2)
            java.lang.String r2 = ", found: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L_0x0058:
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r1 = move-exception
            jI.C17416c.a(r4, r0)
            throw r1
        L_0x005e:
            androidx.room.A$b r0 = r3.f44203d
            androidx.room.A$c r0 = r0.onValidateSchema(r4)
            boolean r1 = r0.f44206a
            if (r1 == 0) goto L_0x0071
            androidx.room.A$b r0 = r3.f44203d
            r0.onPostMigrate(r4)
            r3.j(r4)
        L_0x0070:
            return
        L_0x0071:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r1.append(r2)
            java.lang.String r0 = r0.f44207b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.A.h(Q4.g):void");
    }

    private final void i(g gVar) {
        gVar.T("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(g gVar) {
        i(gVar);
        gVar.T(z.a(this.f44204e));
    }

    public void b(g gVar) {
        C17542s.j(gVar, "db");
        super.b(gVar);
    }

    public void d(g gVar) {
        C17542s.j(gVar, "db");
        boolean a10 = f44201g.a(gVar);
        this.f44203d.createAllTables(gVar);
        if (!a10) {
            c onValidateSchema = this.f44203d.onValidateSchema(gVar);
            if (!onValidateSchema.f44206a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f44207b);
            }
        }
        j(gVar);
        this.f44203d.onCreate(gVar);
    }

    public void e(g gVar, int i10, int i11) {
        C17542s.j(gVar, "db");
        g(gVar, i10, i11);
    }

    public void f(g gVar) {
        C17542s.j(gVar, "db");
        super.f(gVar);
        h(gVar);
        this.f44203d.onOpen(gVar);
        this.f44202c = null;
    }

    public void g(g gVar, int i10, int i11) {
        List<N4.b> d10;
        C17542s.j(gVar, "db");
        C7011h hVar = this.f44202c;
        if (hVar == null || (d10 = hVar.f44337d.d(i10, i11)) == null) {
            C7011h hVar2 = this.f44202c;
            if (hVar2 == null || hVar2.a(i10, i11)) {
                throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f44203d.dropAllTables(gVar);
            this.f44203d.createAllTables(gVar);
            return;
        }
        this.f44203d.onPreMigrate(gVar);
        for (N4.b migrate : d10) {
            migrate.migrate(gVar);
        }
        c onValidateSchema = this.f44203d.onValidateSchema(gVar);
        if (onValidateSchema.f44206a) {
            this.f44203d.onPostMigrate(gVar);
            j(gVar);
            return;
        }
        throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.f44207b);
    }
}
