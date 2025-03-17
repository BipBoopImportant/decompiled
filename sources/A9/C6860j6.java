package a9;

import android.view.Window;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.j6  reason: case insensitive filesystem */
public abstract class C6860j6 implements Runnable {
    private WeakReference<Window> window = new WeakReference<>((Object) null);

    public final WeakReference<Window> getWindow() {
        return this.window;
    }

    public abstract void onDraw(Window window2);

    public void run() {
        Window window2 = this.window.get();
        if (window2 != null) {
            onDraw(window2);
        }
    }

    public final void setWindow(WeakReference<Window> weakReference) {
        C17542s.j(weakReference, "<set-?>");
        this.window = weakReference;
    }
}
