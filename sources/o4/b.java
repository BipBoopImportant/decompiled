package O4;

import HJ.C15854t;
import Q4.g;
import Q4.j;
import XH.C16807N;
import YH.C16877v;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.x;
import jI.C17416c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001a/\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/room/x;", "db", "LQ4/j;", "sqLiteQuery", "", "maybeCopy", "Landroid/os/CancellationSignal;", "signal", "Landroid/database/Cursor;", "e", "(Landroidx/room/x;LQ4/j;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;", "LQ4/g;", "LXH/N;", "b", "(LQ4/g;)V", "", "tableName", "c", "(LQ4/g;Ljava/lang/String;)V", "Ljava/io/File;", "databaseFile", "", "f", "(Ljava/io/File;)I", "a", "()Landroid/os/CancellationSignal;", "cursor", "d", "(Landroid/database/Cursor;)Ljava/lang/String;", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final CancellationSignal a() {
        return Q4.b.b();
    }

    public static final void b(g gVar) {
        C17542s.j(gVar, "db");
        List c10 = C16877v.c();
        Cursor u22 = gVar.u2("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (u22.moveToNext()) {
            try {
                c10.add(u22.getString(0));
            } catch (Throwable th2) {
                C17416c.a(u22, th);
                throw th2;
            }
        }
        C16807N n10 = C16807N.f139792a;
        C17416c.a(u22, (Throwable) null);
        for (String str : C16877v.a(c10)) {
            C17542s.i(str, "triggerName");
            if (C15854t.W(str, "room_fts_content_sync_", false, 2, (Object) null)) {
                gVar.T("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        jI.C17416c.a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(Q4.g r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "db"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "tableName"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PRAGMA foreign_key_check(`"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = "`)"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            android.database.Cursor r2 = r2.u2(r3)
            int r3 = r2.getCount()     // Catch:{ all -> 0x0031 }
            if (r3 > 0) goto L_0x0033
            XH.N r3 = XH.C16807N.f139792a     // Catch:{ all -> 0x0031 }
            r3 = 0
            jI.C17416c.a(r2, r3)
            return
        L_0x0031:
            r3 = move-exception
            goto L_0x003d
        L_0x0033:
            java.lang.String r3 = d(r2)     // Catch:{ all -> 0x0031 }
            android.database.sqlite.SQLiteConstraintException r0 = new android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x0031 }
            r0.<init>(r3)     // Catch:{ all -> 0x0031 }
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x003d:
            throw r3     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            jI.C17416c.a(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.b.c(Q4.g, java.lang.String):void");
    }

    private static final String d(Cursor cursor) {
        StringBuilder sb2 = new StringBuilder();
        int count = cursor.getCount();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            if (cursor.isFirst()) {
                sb2.append("Foreign key violation(s) detected in '");
                sb2.append(cursor.getString(0));
                sb2.append("'.\n");
            }
            String string = cursor.getString(3);
            if (!linkedHashMap.containsKey(string)) {
                C17542s.i(string, "constraintIndex");
                String string2 = cursor.getString(2);
                C17542s.i(string2, "cursor.getString(2)");
                linkedHashMap.put(string, string2);
            }
        }
        sb2.append("Number of different violations discovered: ");
        sb2.append(linkedHashMap.keySet().size());
        sb2.append("\n");
        sb2.append("Number of rows in violation: ");
        sb2.append(count);
        sb2.append("\n");
        sb2.append("Violation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            sb2.append("\tParent Table = ");
            sb2.append((String) entry.getValue());
            sb2.append(", Foreign Key Constraint Index = ");
            sb2.append((String) entry.getKey());
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final Cursor e(x xVar, j jVar, boolean z10, CancellationSignal cancellationSignal) {
        C17542s.j(xVar, "db");
        C17542s.j(jVar, "sqLiteQuery");
        Cursor query = xVar.query(jVar, cancellationSignal);
        if (!z10 || !(query instanceof AbstractWindowedCursor)) {
            return query;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? a.a(query) : query;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        jI.C17416c.a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int f(java.io.File r8) {
        /*
            java.lang.String r0 = "databaseFile"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r8)
            java.nio.channels.FileChannel r8 = r0.getChannel()
            r0 = 4
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ all -> 0x0033 }
            r4 = 4
            r6 = 1
            r2 = 60
            r1 = r8
            r1.tryLock(r2, r4, r6)     // Catch:{ all -> 0x0033 }
            r1 = 60
            r8.position(r1)     // Catch:{ all -> 0x0033 }
            int r1 = r8.read(r7)     // Catch:{ all -> 0x0033 }
            if (r1 != r0) goto L_0x0035
            r7.rewind()     // Catch:{ all -> 0x0033 }
            int r0 = r7.getInt()     // Catch:{ all -> 0x0033 }
            r1 = 0
            jI.C17416c.a(r8, r1)
            return r0
        L_0x0033:
            r0 = move-exception
            goto L_0x003d
        L_0x0035:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "Bad database header, unable to read 4 bytes at offset 60"
            r0.<init>(r1)     // Catch:{ all -> 0x0033 }
            throw r0     // Catch:{ all -> 0x0033 }
        L_0x003d:
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r1 = move-exception
            jI.C17416c.a(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.b.f(java.io.File):int");
    }
}
