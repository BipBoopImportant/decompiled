package Q4;

import android.app.ActivityManager;
import android.database.Cursor;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LQ4/c;", "", "<init>", "()V", "Landroid/database/Cursor;", "cursor", "Landroid/net/Uri;", "a", "(Landroid/database/Cursor;)Landroid/net/Uri;", "Landroid/app/ActivityManager;", "activityManager", "", "b", "(Landroid/app/ActivityManager;)Z", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f39567a = new c();

    private c() {
    }

    public static final Uri a(Cursor cursor) {
        C17542s.j(cursor, "cursor");
        Uri notificationUri = cursor.getNotificationUri();
        C17542s.i(notificationUri, "cursor.notificationUri");
        return notificationUri;
    }

    public static final boolean b(ActivityManager activityManager) {
        C17542s.j(activityManager, "activityManager");
        return activityManager.isLowRamDevice();
    }
}
