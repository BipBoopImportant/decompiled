package J2;

import android.annotation.SuppressLint;
import android.view.accessibility.AccessibilityEvent;

public final class b {
    @SuppressLint({"WrongConstant"})
    @Deprecated
    public static int a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @Deprecated
    public static void b(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }
}
