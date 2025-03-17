package a9;

import YH.C16877v;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import b8.i;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.k2  reason: case insensitive filesystem */
public final class C6864k2 implements Window.Callback {

    /* renamed from: d  reason: collision with root package name */
    public static final c f42643d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final a f42644e = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final WeakHashMap f42645f = new WeakHashMap();

    /* renamed from: g  reason: collision with root package name */
    public static List<? extends WeakReference<O6>> f42646g = C16877v.n();

    /* renamed from: a  reason: collision with root package name */
    public final c f42647a;

    /* renamed from: b  reason: collision with root package name */
    public final Window.Callback f42648b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f42649c;

    /* renamed from: a9.k2$a */
    public static final class a implements Window.Callback {
        public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
            C17542s.j(motionEvent, "event");
            return false;
        }

        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            C17542s.j(keyEvent, "event");
            return false;
        }

        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            C17542s.j(keyEvent, "event");
            return false;
        }

        public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            C17542s.j(accessibilityEvent, "event");
            return false;
        }

        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            C17542s.j(motionEvent, "event");
            return false;
        }

        public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
            C17542s.j(motionEvent, "event");
            return false;
        }

        public final void onActionModeFinished(ActionMode actionMode) {
            C17542s.j(actionMode, "mode");
        }

        public final void onActionModeStarted(ActionMode actionMode) {
            C17542s.j(actionMode, "mode");
        }

        public final void onAttachedToWindow() {
        }

        public final void onContentChanged() {
        }

        public final boolean onCreatePanelMenu(int i10, Menu menu) {
            C17542s.j(menu, "menu");
            return false;
        }

        public final View onCreatePanelView(int i10) {
            return null;
        }

        public final void onDetachedFromWindow() {
        }

        public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
            C17542s.j(menuItem, "item");
            return false;
        }

        public final boolean onMenuOpened(int i10, Menu menu) {
            C17542s.j(menu, "menu");
            return false;
        }

        public final void onPanelClosed(int i10, Menu menu) {
            C17542s.j(menu, "menu");
        }

        public final boolean onPreparePanel(int i10, View view, Menu menu) {
            C17542s.j(menu, "menu");
            return false;
        }

        public final boolean onSearchRequested() {
            return false;
        }

        public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
            C17542s.j(layoutParams, "attrs");
        }

        public final void onWindowFocusChanged(boolean z10) {
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            C17542s.j(callback, "callback");
            return null;
        }

        public final boolean onSearchRequested(SearchEvent searchEvent) {
            C17542s.j(searchEvent, "searchEvent");
            return false;
        }

        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            C17542s.j(callback, "callback");
            return null;
        }
    }

    /* renamed from: a9.k2$b */
    public static final class b {
        public static void a(Window window) {
            c cVar = C6864k2.f42643d;
            C17542s.j(window, "window");
            C17542s.j(cVar, "staticProvider");
            C17542s.j(window, "window");
            C17542s.j(cVar, "staticProvider");
            if (!(window.getCallback() instanceof C6864k2)) {
                for (C6864k2 k2Var : C6864k2.f42645f.keySet()) {
                    k2Var.f42649c = false;
                }
                C6864k2 k2Var2 = new C6864k2(window.getCallback());
                WeakHashMap weakHashMap = C6864k2.f42645f;
                Boolean bool = Boolean.TRUE;
                C17542s.i(bool, "TRUE");
                weakHashMap.put(k2Var2, bool);
                window.setCallback(k2Var2);
            }
        }
    }

    /* renamed from: a9.k2$c */
    public static final class c {
    }

    public C6864k2(Window.Callback callback) {
        c cVar = f42643d;
        C17542s.j(cVar, "staticProvider");
        this.f42647a = cVar;
        this.f42648b = callback == null ? f42644e : callback;
        this.f42649c = true;
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C17542s.j(motionEvent, "event");
        return this.f42648b.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C17542s.j(keyEvent, "event");
        return this.f42648b.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C17542s.j(keyEvent, "event");
        return this.f42648b.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C17542s.j(accessibilityEvent, "event");
        return this.f42648b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C17542s.j(motionEvent, "event");
        if (this.f42649c) {
            this.f42647a.getClass();
            C17542s.j(motionEvent, "event");
            i.i(motionEvent);
            this.f42647a.getClass();
            C17542s.j(motionEvent, "event");
            for (WeakReference weakReference : f42646g) {
                O6 o62 = (O6) weakReference.get();
                if (o62 != null) {
                    o62.a(motionEvent);
                }
            }
        }
        return this.f42648b.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        C17542s.j(motionEvent, "event");
        return this.f42648b.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        C17542s.j(actionMode, "mode");
        this.f42648b.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        C17542s.j(actionMode, "mode");
        this.f42648b.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f42648b.onAttachedToWindow();
    }

    public final void onContentChanged() {
        this.f42648b.onContentChanged();
    }

    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        C17542s.j(menu, "menu");
        return this.f42648b.onCreatePanelMenu(i10, menu);
    }

    public final View onCreatePanelView(int i10) {
        return this.f42648b.onCreatePanelView(i10);
    }

    public final void onDetachedFromWindow() {
        this.f42648b.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        C17542s.j(menuItem, "item");
        return this.f42648b.onMenuItemSelected(i10, menuItem);
    }

    public final boolean onMenuOpened(int i10, Menu menu) {
        C17542s.j(menu, "menu");
        return this.f42648b.onMenuOpened(i10, menu);
    }

    public final void onPanelClosed(int i10, Menu menu) {
        C17542s.j(menu, "menu");
        this.f42648b.onPanelClosed(i10, menu);
    }

    public final void onPointerCaptureChanged(boolean z10) {
        this.f42648b.onPointerCaptureChanged(z10);
    }

    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        C17542s.j(menu, "menu");
        return this.f42648b.onPreparePanel(i10, view, menu);
    }

    public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
        C17542s.j(list, "data");
        this.f42648b.onProvideKeyboardShortcuts(list, menu, i10);
    }

    public final boolean onSearchRequested() {
        return this.f42648b.onSearchRequested();
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        C17542s.j(layoutParams, "attrs");
        this.f42648b.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z10) {
        this.f42648b.onWindowFocusChanged(z10);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        C17542s.j(callback, "callback");
        return this.f42648b.onWindowStartingActionMode(callback);
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        C17542s.j(searchEvent, "searchEvent");
        return this.f42648b.onSearchRequested(searchEvent);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        C17542s.j(callback, "callback");
        return this.f42648b.onWindowStartingActionMode(callback, i10);
    }
}
