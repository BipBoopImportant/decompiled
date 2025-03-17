package Q4;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.CancellationSignal;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJK\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0010\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00120\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\rH\u0007¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LQ4/b;", "", "<init>", "()V", "Landroid/os/CancellationSignal;", "cancellationSignal", "LXH/N;", "a", "(Landroid/os/CancellationSignal;)V", "b", "()Landroid/os/CancellationSignal;", "Ljava/io/File;", "file", "", "c", "(Ljava/io/File;)Z", "Landroid/database/sqlite/SQLiteDatabase;", "sQLiteDatabase", "", "sql", "", "selectionArgs", "editTable", "Landroid/database/sqlite/SQLiteDatabase$CursorFactory;", "cursorFactory", "Landroid/database/Cursor;", "e", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/Cursor;", "d", "(Landroid/database/sqlite/SQLiteDatabase;)Z", "Landroid/database/sqlite/SQLiteOpenHelper;", "sQLiteOpenHelper", "enabled", "f", "(Landroid/database/sqlite/SQLiteOpenHelper;Z)V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f39566a = new b();

    private b() {
    }

    public static final void a(CancellationSignal cancellationSignal) {
        C17542s.j(cancellationSignal, "cancellationSignal");
        cancellationSignal.cancel();
    }

    public static final CancellationSignal b() {
        return new CancellationSignal();
    }

    public static final boolean c(File file) {
        C17542s.j(file, "file");
        return SQLiteDatabase.deleteDatabase(file);
    }

    public static final boolean d(SQLiteDatabase sQLiteDatabase) {
        C17542s.j(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public static final Cursor e(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, CancellationSignal cancellationSignal, SQLiteDatabase.CursorFactory cursorFactory) {
        C17542s.j(sQLiteDatabase, "sQLiteDatabase");
        C17542s.j(str, "sql");
        C17542s.j(strArr, "selectionArgs");
        C17542s.j(cancellationSignal, "cancellationSignal");
        C17542s.j(cursorFactory, "cursorFactory");
        Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, str, strArr, str2, cancellationSignal);
        C17542s.i(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
        return rawQueryWithFactory;
    }

    public static final void f(SQLiteOpenHelper sQLiteOpenHelper, boolean z10) {
        C17542s.j(sQLiteOpenHelper, "sQLiteOpenHelper");
        sQLiteOpenHelper.setWriteAheadLoggingEnabled(z10);
    }
}
