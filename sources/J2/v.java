package J2;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

public class v {
    @Deprecated
    public static void a(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollX(i10);
    }

    @Deprecated
    public static void b(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollY(i10);
    }

    @Deprecated
    public static void c(AccessibilityRecord accessibilityRecord, View view, int i10) {
        accessibilityRecord.setSource(view, i10);
    }
}
