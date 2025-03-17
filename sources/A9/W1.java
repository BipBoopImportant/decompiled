package a9;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.Window;
import kotlin.jvm.internal.C17542s;

public final class W1 {
    public static void a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
        C17542s.j(surfaceView, "source");
        C17542s.j(bitmap, "dest");
        C17542s.j(onPixelCopyFinishedListener, "listener");
        if (handler != null) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
            return;
        }
        throw new IllegalArgumentException("surface is not drawn yet");
    }

    public static void b(Window window, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
        C17542s.j(window, "source");
        C17542s.j(bitmap, "dest");
        C17542s.j(onPixelCopyFinishedListener, "listener");
        if (handler != null) {
            PixelCopy.request(window, (Rect) null, bitmap, onPixelCopyFinishedListener, handler);
            return;
        }
        throw new IllegalArgumentException("window is not drawn yet");
    }
}
