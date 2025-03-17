package R4;

import Q4.g;
import Q4.j;
import Q4.k;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.r;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 C2\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&JE\u0010+\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\b\u0010'\u001a\u0004\u0018\u00010\u00062\u0012\u0010*\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010)\u0018\u00010(H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b-\u0010.J)\u00100\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010/\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010)0(H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u0010\rJ\u0015\u00104\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u0002¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0013R\u0016\u0010;\u001a\u0004\u0018\u00010\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u00118WX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0013R(\u0010B\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060?\u0018\u00010>8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006D"}, d2 = {"LR4/c;", "LQ4/g;", "Landroid/database/sqlite/SQLiteDatabase;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "sql", "LQ4/k;", "M1", "(Ljava/lang/String;)LQ4/k;", "LXH/N;", "P", "()V", "x0", "J0", "v0", "", "N2", "()Z", "query", "Landroid/database/Cursor;", "u2", "(Ljava/lang/String;)Landroid/database/Cursor;", "LQ4/j;", "l3", "(LQ4/j;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "s1", "(LQ4/j;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "", "x2", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "whereClause", "", "", "whereArgs", "l2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "T", "(Ljava/lang/String;)V", "bindArgs", "w0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "close", "sqLiteDatabase", "e", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "a", "Landroid/database/sqlite/SQLiteDatabase;", "isOpen", "m", "()Ljava/lang/String;", "path", "a3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "R", "()Ljava/util/List;", "attachedDbs", "b", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements g {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39651b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f39652c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f39653d = new String[0];

    /* renamed from: a  reason: collision with root package name */
    private final SQLiteDatabase f39654a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"LR4/c$a;", "", "<init>", "()V", "", "", "CONFLICT_VALUES", "[Ljava/lang/String;", "EMPTY_STRING_ARRAY", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroid/database/sqlite/SQLiteDatabase;", "<anonymous parameter 0>", "Landroid/database/sqlite/SQLiteCursorDriver;", "masterQuery", "", "editTable", "Landroid/database/sqlite/SQLiteQuery;", "sqLiteQuery", "Landroid/database/sqlite/SQLiteCursor;", "a", "(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/sqlite/SQLiteCursor;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements r<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f39655c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(4);
            this.f39655c = jVar;
        }

        /* renamed from: a */
        public final SQLiteCursor l(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            j jVar = this.f39655c;
            C17542s.g(sQLiteQuery);
            jVar.d(new g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        C17542s.j(sQLiteDatabase, "delegate");
        this.f39654a = sQLiteDatabase;
    }

    /* access modifiers changed from: private */
    public static final Cursor f(r rVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        C17542s.j(rVar, "$tmp0");
        return (Cursor) rVar.l(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* access modifiers changed from: private */
    public static final Cursor g(j jVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        C17542s.j(jVar, "$query");
        C17542s.g(sQLiteQuery);
        jVar.d(new g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public void J0() {
        this.f39654a.endTransaction();
    }

    public k M1(String str) {
        C17542s.j(str, "sql");
        SQLiteStatement compileStatement = this.f39654a.compileStatement(str);
        C17542s.i(compileStatement, "delegate.compileStatement(sql)");
        return new h(compileStatement);
    }

    public boolean N2() {
        return this.f39654a.inTransaction();
    }

    public void P() {
        this.f39654a.beginTransaction();
    }

    public List<Pair<String, String>> R() {
        return this.f39654a.getAttachedDbs();
    }

    public void T(String str) {
        C17542s.j(str, "sql");
        this.f39654a.execSQL(str);
    }

    public boolean a3() {
        return Q4.b.d(this.f39654a);
    }

    public void close() {
        this.f39654a.close();
    }

    public final boolean e(SQLiteDatabase sQLiteDatabase) {
        C17542s.j(sQLiteDatabase, "sqLiteDatabase");
        return C17542s.e(this.f39654a, sQLiteDatabase);
    }

    public boolean isOpen() {
        return this.f39654a.isOpen();
    }

    public int l2(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
        C17542s.j(str, "table");
        C17542s.j(contentValues, "values");
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            int length = objArr == null ? size : objArr.length + size;
            Object[] objArr2 = new Object[length];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("UPDATE ");
            sb2.append(f39652c[i10]);
            sb2.append(str);
            sb2.append(" SET ");
            int i11 = 0;
            for (String next : contentValues.keySet()) {
                sb2.append(i11 > 0 ? "," : "");
                sb2.append(next);
                objArr2[i11] = contentValues.get(next);
                sb2.append("=?");
                i11++;
            }
            if (objArr != null) {
                for (int i12 = size; i12 < length; i12++) {
                    objArr2[i12] = objArr[i12 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb2.append(" WHERE ");
                sb2.append(str2);
            }
            String sb3 = sb2.toString();
            C17542s.i(sb3, "StringBuilder().apply(builderAction).toString()");
            k M12 = M1(sb3);
            Q4.a.f39563c.b(M12, objArr2);
            return M12.b0();
        }
        throw new IllegalArgumentException("Empty values");
    }

    public Cursor l3(j jVar) {
        C17542s.j(jVar, "query");
        Cursor rawQueryWithFactory = this.f39654a.rawQueryWithFactory(new b(new b(jVar)), jVar.c(), f39653d, (String) null);
        C17542s.i(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public String m() {
        return this.f39654a.getPath();
    }

    public Cursor s1(j jVar, CancellationSignal cancellationSignal) {
        C17542s.j(jVar, "query");
        SQLiteDatabase sQLiteDatabase = this.f39654a;
        String c10 = jVar.c();
        String[] strArr = f39653d;
        C17542s.g(cancellationSignal);
        return Q4.b.e(sQLiteDatabase, c10, strArr, (String) null, cancellationSignal, new a(jVar));
    }

    public Cursor u2(String str) {
        C17542s.j(str, "query");
        return l3(new Q4.a(str));
    }

    public void v0() {
        this.f39654a.setTransactionSuccessful();
    }

    public void w0(String str, Object[] objArr) {
        C17542s.j(str, "sql");
        C17542s.j(objArr, "bindArgs");
        this.f39654a.execSQL(str, objArr);
    }

    public void x0() {
        this.f39654a.beginTransactionNonExclusive();
    }

    public long x2(String str, int i10, ContentValues contentValues) {
        C17542s.j(str, "table");
        C17542s.j(contentValues, "values");
        return this.f39654a.insertWithOnConflict(str, (String) null, contentValues, i10);
    }
}
