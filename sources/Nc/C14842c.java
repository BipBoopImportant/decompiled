package nC;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.Window;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0010¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", "Landroid/view/Window;", "a", "(Landroid/content/Context;)Landroid/view/Window;", "systemui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: nC.c  reason: case insensitive filesystem */
public final class C14842c {
    public static final Window a(Context context) {
        C17542s.j(context, "<this>");
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            C17542s.i(context, "getBaseContext(...)");
        }
        return ((Activity) context).getWindow();
    }
}
