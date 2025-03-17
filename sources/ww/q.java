package Ww;

import Ww.r;
import android.app.Activity;
import android.content.Context;
import androidx.core.app.C5147b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u2.C6012a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroid/app/Activity;", "", "permission", "LWw/r$a;", "b", "(Landroid/app/Activity;Ljava/lang/String;)LWw/r$a;", "Landroid/content/Context;", "", "a", "(Landroid/content/Context;Ljava/lang/String;)Z", "c", "(Landroid/app/Activity;Ljava/lang/String;)Z", "permissions_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q {
    public static final boolean a(Context context, String str) {
        C17542s.j(context, "<this>");
        C17542s.j(str, "permission");
        return C6012a.a(context, str) == 0;
    }

    public static final r.a b(Activity activity, String str) {
        C17542s.j(activity, "<this>");
        C17542s.j(str, "permission");
        return a(activity, str) ? r.a.b.f117719a : new r.a.C2905a(c(activity, str));
    }

    public static final boolean c(Activity activity, String str) {
        C17542s.j(activity, "<this>");
        C17542s.j(str, "permission");
        return C5147b.A(activity, str);
    }
}
