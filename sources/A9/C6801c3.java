package a9;

import G8.g;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.c3  reason: case insensitive filesystem */
public final class C6801c3 implements C6966x1<B0> {
    public final Bitmap a(Bitmap bitmap, Bitmap bitmap2, B0 b02) {
        Bitmap.Config config;
        C17542s.j(bitmap2, "screenshot");
        C17542s.j(b02, "context");
        C17542s.j(b02, "context");
        C17542s.j(bitmap2, "appendBitmap");
        int width = bitmap != null ? bitmap.getWidth() : 0;
        int height = bitmap != null ? bitmap.getHeight() : 0;
        if (bitmap == null || (config = bitmap.getConfig()) == null) {
            config = bitmap2.getConfig();
        }
        C17542s.i(config, "currentBitmap?.config ?: appendBitmap.config");
        C17542s.j(b02, "context");
        C17542s.j(bitmap2, "appendBitmap");
        Rect rect = b02.f41923a;
        Rect rect2 = b02.f41927e ? new Rect(0, 0, bitmap2.getWidth(), rect.bottom) : b02.f41926d ? new Rect(0, (((b02.f41925c - 1) * rect.height()) + rect.top) - b02.f41924b, bitmap2.getWidth(), bitmap2.getHeight()) : new Rect(0, rect.top, bitmap2.getWidth(), rect.bottom);
        if (rect2.width() <= 0 || rect2.height() <= 0) {
            return bitmap;
        }
        C17542s.j(rect2, "appendRect");
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(width, rect2.width()), rect2.height() + height, g.j(config));
        C17542s.i(createBitmap, "createBitmap(\n          …fig.orDefault()\n        )");
        Canvas canvas = new Canvas(createBitmap);
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, (float) rect2.height(), (Paint) null);
        }
        Rect rect3 = new Rect(rect2);
        rect3.offsetTo(0, 0);
        canvas.drawBitmap(bitmap2, rect2, rect3, (Paint) null);
        return createBitmap;
    }
}
