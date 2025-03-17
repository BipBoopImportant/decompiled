package J2;

import android.view.accessibility.AccessibilityManager;

public final class c {

    public interface a {
        void onTouchExplorationStateChanged(boolean z10);
    }

    private static final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final a f8808a;

        b(a aVar) {
            this.f8808a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.f8808a.equals(((b) obj).f8808a);
        }

        public int hashCode() {
            return this.f8808a.hashCode();
        }

        public void onTouchExplorationStateChanged(boolean z10) {
            this.f8808a.onTouchExplorationStateChanged(z10);
        }
    }

    @Deprecated
    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new b(aVar));
    }

    @Deprecated
    public static boolean b(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new b(aVar));
    }
}
