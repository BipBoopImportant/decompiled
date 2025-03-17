package tm;

import android.app.Activity;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import um.C12066a;
import um.C12067b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltm/a;", "Lum/a;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lum/b;", "a", "(Landroid/app/Activity;)Lum/b;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tm.a  reason: case insensitive filesystem */
public final class C11924a implements C12066a {
    public C12067b a(Activity activity) {
        C17542s.j(activity, "activity");
        return Build.VERSION.SDK_INT >= 33 ? activity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0 ? C12067b.c.f103848a : activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS") ? C12067b.C2465b.f103847a : C12067b.a.f103846a : C12067b.c.f103848a;
    }
}
