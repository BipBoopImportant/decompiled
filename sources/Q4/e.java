package Q4;

import android.database.Cursor;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LQ4/e;", "", "<init>", "()V", "Landroid/database/Cursor;", "cursor", "Landroid/os/Bundle;", "extras", "LXH/N;", "a", "(Landroid/database/Cursor;Landroid/os/Bundle;)V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f39569a = new e();

    private e() {
    }

    public static final void a(Cursor cursor, Bundle bundle) {
        C17542s.j(cursor, "cursor");
        C17542s.j(bundle, "extras");
        cursor.setExtras(bundle);
    }
}
