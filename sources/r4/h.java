package R4;

import Q4.k;
import android.database.sqlite.SQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LR4/h;", "LR4/g;", "LQ4/k;", "Landroid/database/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteStatement;)V", "", "b0", "()I", "", "v1", "()J", "b", "Landroid/database/sqlite/SQLiteStatement;", "sqlite-framework_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h extends g implements k {

    /* renamed from: b  reason: collision with root package name */
    private final SQLiteStatement f39680b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        C17542s.j(sQLiteStatement, "delegate");
        this.f39680b = sQLiteStatement;
    }

    public int b0() {
        return this.f39680b.executeUpdateDelete();
    }

    public long v1() {
        return this.f39680b.executeInsert();
    }
}
