package K6;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.Observable;

/* renamed from: K6.b  reason: case insensitive filesystem */
final class C6581b extends Observable implements Window.Callback {

    /* renamed from: b  reason: collision with root package name */
    private static final HandlerThread f37628b = new HandlerThread("CYFTouchManager");

    /* renamed from: c  reason: collision with root package name */
    private static boolean f37629c = false;

    /* renamed from: a  reason: collision with root package name */
    private final Window.Callback f37630a;

    /* renamed from: K6.b$a */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MotionEvent f37631a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37632b;

        a(MotionEvent motionEvent, int i10) {
            this.f37631a = motionEvent;
            this.f37632b = i10;
        }

        public final void run() {
            int i10 = 1;
            C6599u.f37712d = 1;
            C6599u.f37713e = 1;
            C6581b.this.setChanged();
            C6581b bVar = C6581b.this;
            MotionEvent motionEvent = this.f37631a;
            int i11 = this.f37632b;
            if (i11 != 1) {
                i10 = 0;
            }
            bVar.notifyObservers(new C6583d(motionEvent, i10, i11));
        }
    }

    C6581b(Window.Callback callback) {
        this.f37630a = callback;
        if (f37629c) {
            HandlerThread handlerThread = f37628b;
            if (!handlerThread.isAlive()) {
                handlerThread.start();
            }
        }
    }

    private void b(MotionEvent motionEvent, int i10) {
        try {
            if (f37629c) {
                HandlerThread handlerThread = f37628b;
                if (handlerThread.isAlive()) {
                    new Handler(handlerThread.getLooper()).post(new a(motionEvent, i10));
                    return;
                }
            }
            int i11 = 1;
            C6599u.f37712d = 1;
            C6599u.f37713e = 1;
            setChanged();
            if (i10 != 1) {
                i11 = 0;
            }
            notifyObservers(new C6583d(motionEvent, i11, i10));
        } catch (Exception e10) {
            y.a(e10);
        }
    }

    static boolean c() {
        return f37629c;
    }

    @SuppressLint({"NewApi"})
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f37630a.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f37630a.dispatchKeyEvent(keyEvent);
    }

    @SuppressLint({"NewApi"})
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f37630a.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f37630a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (action == 0) {
            b(obtain, 2);
            return this.f37630a.dispatchTouchEvent(motionEvent);
        } else if (action == 1) {
            b(obtain, 3);
            return this.f37630a.dispatchTouchEvent(motionEvent);
        } else if (action == 2) {
            b(obtain, 1);
            return this.f37630a.dispatchTouchEvent(motionEvent);
        } else if (action == 5) {
            b(obtain, 2);
            return this.f37630a.dispatchTouchEvent(motionEvent);
        } else if (action != 6) {
            return this.f37630a.dispatchTouchEvent(motionEvent);
        } else {
            b(obtain, 3);
            return this.f37630a.dispatchTouchEvent(motionEvent);
        }
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f37630a.dispatchTrackballEvent(motionEvent);
    }

    @SuppressLint({"NewApi"})
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f37630a.onActionModeFinished(actionMode);
    }

    @SuppressLint({"NewApi"})
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f37630a.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f37630a.onAttachedToWindow();
    }

    public final void onContentChanged() {
        this.f37630a.onContentChanged();
    }

    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.f37630a.onCreatePanelMenu(i10, menu);
    }

    public final View onCreatePanelView(int i10) {
        return this.f37630a.onCreatePanelView(i10);
    }

    public final void onDetachedFromWindow() {
        this.f37630a.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f37630a.onMenuItemSelected(i10, menuItem);
    }

    public final boolean onMenuOpened(int i10, Menu menu) {
        return this.f37630a.onMenuOpened(i10, menu);
    }

    public final void onPanelClosed(int i10, Menu menu) {
        this.f37630a.onPanelClosed(i10, menu);
    }

    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.f37630a.onPreparePanel(i10, view, menu);
    }

    @SuppressLint({"NewApi"})
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f37630a.onSearchRequested(searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f37630a.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z10) {
        this.f37630a.onWindowFocusChanged(z10);
    }

    @SuppressLint({"NewApi"})
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return this.f37630a.onWindowStartingActionMode(callback, i10);
    }

    public final boolean onSearchRequested() {
        return this.f37630a.onSearchRequested();
    }

    @SuppressLint({"NewApi"})
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f37630a.onWindowStartingActionMode(callback);
    }
}
