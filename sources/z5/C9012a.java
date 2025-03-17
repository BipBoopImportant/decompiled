package z5;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import y5.C8979b;
import y5.C8980c;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Lz5/a;", "Ly5/c;", "Landroid/database/Cursor;", "cursor", "", "windowSizeBytes", "<init>", "(Landroid/database/Cursor;Ljava/lang/Long;)V", "Ly5/b$b;", "", "a", "()Ljava/lang/Object;", "", "index", "", "getString", "(I)Ljava/lang/String;", "getLong", "(I)Ljava/lang/Long;", "Landroid/database/Cursor;", "sqldelight-android-driver_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z5.a  reason: case insensitive filesystem */
final class C9012a implements C8980c {

    /* renamed from: a  reason: collision with root package name */
    private final Cursor f58391a;

    public C9012a(Cursor cursor, Long l10) {
        C17542s.j(cursor, "cursor");
        this.f58391a = cursor;
        if (Build.VERSION.SDK_INT >= 28 && l10 != null && (cursor instanceof AbstractWindowedCursor)) {
            C9018g.a((AbstractWindowedCursor) cursor, l10.longValue());
        }
    }

    public Object a() {
        return C8979b.C0933b.b(Boolean.valueOf(this.f58391a.moveToNext()));
    }

    public Long getLong(int i10) {
        if (this.f58391a.isNull(i10)) {
            return null;
        }
        return Long.valueOf(this.f58391a.getLong(i10));
    }

    public String getString(int i10) {
        if (this.f58391a.isNull(i10)) {
            return null;
        }
        return this.f58391a.getString(i10);
    }

    public /* bridge */ /* synthetic */ C8979b next() {
        return C8979b.C0933b.a(a());
    }
}
