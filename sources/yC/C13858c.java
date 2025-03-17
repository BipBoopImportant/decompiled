package YC;

import android.content.Context;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001b\u0010\u0007\u001a\u00020\u0001*\u00020\u00008G¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\b"}, d2 = {"Landroid/content/Context;", "", "b", "(Landroid/content/Context;)Z", "a", "isDarkModeSupported$annotations", "(Landroid/content/Context;)V", "isDarkModeSupported", "ui-mode_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: YC.c  reason: case insensitive filesystem */
public final class C13858c {
    public static final boolean a(Context context) {
        C17542s.j(context, "<this>");
        return Build.VERSION.SDK_INT >= 31;
    }

    public static final boolean b(Context context) {
        C17542s.j(context, "<this>");
        return a(context) && (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
