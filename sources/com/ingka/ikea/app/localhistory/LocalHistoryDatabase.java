package com.ingka.ikea.app.localhistory;

import Q4.g;
import android.content.Context;
import androidx.room.w;
import androidx.room.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000 \n2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/app/localhistory/LocalHistoryDatabase;", "Landroidx/room/x;", "<init>", "()V", "LNg/a;", "d", "()LNg/a;", "LNg/c;", "e", "()LNg/c;", "a", "localhistory_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class LocalHistoryDatabase extends x {

    /* renamed from: a  reason: collision with root package name */
    public static final d f72020a = new d((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final N4.b f72021b = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final N4.b f72022c = new b();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final N4.b f72023d = new c();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/app/localhistory/LocalHistoryDatabase$a", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "localhistory_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends N4.b {
        a() {
            super(1, 2);
        }

        public void migrate(g gVar) {
            C17542s.j(gVar, "database");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/app/localhistory/LocalHistoryDatabase$b", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "localhistory_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends N4.b {
        b() {
            super(2, 3);
        }

        public void migrate(g gVar) {
            C17542s.j(gVar, "database");
            gVar.T("ALTER TABLE `localRecentItems` ADD COLUMN `productName` TEXT NOT NULL DEFAULT ''");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/ingka/ikea/app/localhistory/LocalHistoryDatabase$c", "LN4/b;", "LQ4/g;", "database", "LXH/N;", "migrate", "(LQ4/g;)V", "localhistory_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends N4.b {
        c() {
            super(3, 4);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0082, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0083, code lost:
            jI.C17416c.a(r0, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0086, code lost:
            throw r1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0010 */
        /* JADX WARNING: Removed duplicated region for block: B:4:0x0016  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void migrate(Q4.g r9) {
            /*
                r8 = this;
                java.lang.String r0 = "database"
                kotlin.jvm.internal.C17542s.j(r9, r0)
                java.lang.String r0 = "CREATE TABLE `localRecentItems_new` (`itemNo` TEXT NOT NULL, `imageUrl` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `productName` TEXT NOT NULL, PRIMARY KEY(`itemNo`))"
                r9.T(r0)
                java.lang.String r0 = "SELECT productId, imageUrl, timestamp, productName from localRecentItems"
                android.database.Cursor r0 = r9.u2(r0)
            L_0x0010:
                boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x006e }
                if (r1 == 0) goto L_0x0070
                r1 = 0
                java.lang.String r2 = r0.getString(r1)     // Catch:{ Exception -> 0x0010 }
                java.lang.String r3 = "getString(...)"
                kotlin.jvm.internal.C17542s.i(r2, r3)     // Catch:{ Exception -> 0x0010 }
                java.lang.String r3 = ","
                java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch:{ Exception -> 0x0010 }
                r6 = 6
                r7 = 0
                r4 = 0
                r5 = 0
                java.util.List r2 = HJ.C15854t.Y0(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0010 }
                java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ Exception -> 0x0010 }
                java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0010 }
                java.lang.Object[] r2 = r2.toArray(r3)     // Catch:{ Exception -> 0x0010 }
                java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ Exception -> 0x0010 }
                java.lang.String r3 = "localRecentItems_new"
                android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ Exception -> 0x0010 }
                r4.<init>()     // Catch:{ Exception -> 0x0010 }
                java.lang.String r5 = "itemNo"
                r6 = 1
                r2 = r2[r6]     // Catch:{ Exception -> 0x0010 }
                r4.put(r5, r2)     // Catch:{ Exception -> 0x0010 }
                java.lang.String r2 = "imageUrl"
                java.lang.String r5 = r0.getString(r6)     // Catch:{ Exception -> 0x0010 }
                r4.put(r2, r5)     // Catch:{ Exception -> 0x0010 }
                java.lang.String r2 = "timestamp"
                r5 = 2
                long r5 = r0.getLong(r5)     // Catch:{ Exception -> 0x0010 }
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0010 }
                r4.put(r2, r5)     // Catch:{ Exception -> 0x0010 }
                java.lang.String r2 = "productName"
                r5 = 3
                java.lang.String r5 = r0.getString(r5)     // Catch:{ Exception -> 0x0010 }
                r4.put(r2, r5)     // Catch:{ Exception -> 0x0010 }
                XH.N r2 = XH.C16807N.f139792a     // Catch:{ Exception -> 0x0010 }
                r9.x2(r3, r1, r4)     // Catch:{ Exception -> 0x0010 }
                goto L_0x0010
            L_0x006e:
                r9 = move-exception
                goto L_0x0081
            L_0x0070:
                XH.N r1 = XH.C16807N.f139792a     // Catch:{ all -> 0x006e }
                r1 = 0
                jI.C17416c.a(r0, r1)
                java.lang.String r0 = "DROP TABLE localRecentItems"
                r9.T(r0)
                java.lang.String r0 = "ALTER TABLE localRecentItems_new RENAME TO localRecentItems"
                r9.T(r0)
                return
            L_0x0081:
                throw r9     // Catch:{ all -> 0x0082 }
            L_0x0082:
                r1 = move-exception
                jI.C17416c.a(r0, r9)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.localhistory.LocalHistoryDatabase.c.migrate(Q4.g):void");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\f\u0010\rR \u0010\u000f\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u000b\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0010\u0010\rR \u0010\u0012\u001a\u00020\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u000b\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0013\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/ingka/ikea/app/localhistory/LocalHistoryDatabase$d;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/ingka/ikea/app/localhistory/LocalHistoryDatabase;", "a", "(Landroid/content/Context;)Lcom/ingka/ikea/app/localhistory/LocalHistoryDatabase;", "LN4/b;", "MIGRATION_1_2", "LN4/b;", "b", "()LN4/b;", "getMIGRATION_1_2$annotations", "MIGRATION_2_3", "c", "getMIGRATION_2_3$annotations", "MIGRATION_3_4", "d", "getMIGRATION_3_4$annotations", "localhistory_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LocalHistoryDatabase a(Context context) {
            C17542s.j(context, "context");
            Context applicationContext = context.getApplicationContext();
            C17542s.i(applicationContext, "getApplicationContext(...)");
            return w.a(applicationContext, LocalHistoryDatabase.class, "local-history-db").b(b()).b(c()).b(d()).e();
        }

        public final N4.b b() {
            return LocalHistoryDatabase.f72021b;
        }

        public final N4.b c() {
            return LocalHistoryDatabase.f72022c;
        }

        public final N4.b d() {
            return LocalHistoryDatabase.f72023d;
        }

        private d() {
        }
    }

    public abstract Ng.a d();

    public abstract Ng.c e();
}
