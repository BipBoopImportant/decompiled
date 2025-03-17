package Vx;

import android.app.NotificationChannel;
import android.content.Context;
import androidx.core.app.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"LVx/d;", "LVx/c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "channel", "", "b", "(Ljava/lang/String;)Z", "a", "()Z", "Landroid/content/Context;", "Landroidx/core/app/s;", "Landroidx/core/app/s;", "notificationCompat", "pushnotification-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f117449a;

    /* renamed from: b  reason: collision with root package name */
    private final s f117450b;

    public d(Context context) {
        C17542s.j(context, "context");
        this.f117449a = context;
        s g10 = s.g(context);
        C17542s.i(g10, "from(...)");
        this.f117450b = g10;
    }

    public boolean a() {
        return this.f117450b.a();
    }

    public boolean b(String str) {
        C17542s.j(str, "channel");
        NotificationChannel i10 = this.f117450b.i(str);
        return i10 != null && i10.getImportance() == 0;
    }
}
