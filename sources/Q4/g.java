package Q4;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b!\u0010\"JE\u0010'\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u00022\u0012\u0010&\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010%\u0018\u00010$H&¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b)\u0010*J)\u0010,\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010+\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010%0$H&¢\u0006\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u000fR\u0016\u00101\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\r8gX¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u000fR(\u00108\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000205\u0018\u0001048fX¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u00069À\u0006\u0001"}, d2 = {"LQ4/g;", "Ljava/io/Closeable;", "", "sql", "LQ4/k;", "M1", "(Ljava/lang/String;)LQ4/k;", "LXH/N;", "P", "()V", "x0", "J0", "v0", "", "N2", "()Z", "query", "Landroid/database/Cursor;", "u2", "(Ljava/lang/String;)Landroid/database/Cursor;", "LQ4/j;", "l3", "(LQ4/j;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "s1", "(LQ4/j;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "", "x2", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "whereClause", "", "", "whereArgs", "l2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "T", "(Ljava/lang/String;)V", "bindArgs", "w0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "isOpen", "m", "()Ljava/lang/String;", "path", "a3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "R", "()Ljava/util/List;", "attachedDbs", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface g extends Closeable {
    void J0();

    k M1(String str);

    boolean N2();

    void P();

    List<Pair<String, String>> R();

    void T(String str);

    boolean a3();

    boolean isOpen();

    int l2(String str, int i10, ContentValues contentValues, String str2, Object[] objArr);

    Cursor l3(j jVar);

    String m();

    Cursor s1(j jVar, CancellationSignal cancellationSignal);

    Cursor u2(String str);

    void v0();

    void w0(String str, Object[] objArr);

    void x0();

    long x2(String str, int i10, ContentValues contentValues);
}
