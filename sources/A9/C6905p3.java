package a9;

import G8.g;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.jvm.internal.C17542s;
import pI.C17752b;
import tI.C17978n;

/* renamed from: a9.p3  reason: case insensitive filesystem */
public final class C6905p3 {

    /* renamed from: a  reason: collision with root package name */
    public int f42792a;

    /* renamed from: b  reason: collision with root package name */
    public int f42793b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f42794c;

    /* renamed from: d  reason: collision with root package name */
    public int f42795d;

    public final void a(Bitmap bitmap, Rect rect) {
        Bitmap.Config config;
        Bitmap bitmap2;
        int i10;
        C17542s.j(bitmap, "appendBitmap");
        C17542s.j(rect, "appendRect");
        if (rect.width() > 0 && rect.height() > 0) {
            Bitmap bitmap3 = this.f42794c;
            if (bitmap3 == null || (config = bitmap3.getConfig()) == null) {
                config = bitmap.getConfig();
            }
            C17542s.i(config, "bitmap?.config ?: appendBitmap.config");
            int height = rect.height() + this.f42795d;
            int i11 = this.f42793b;
            if (height <= i11) {
                bitmap2 = Bitmap.createBitmap(rect.width(), rect.height() + this.f42795d, g.j(config));
                C17542s.i(bitmap2, "{\n        Bitmap.createB…Default()\n        )\n    }");
            } else {
                bitmap2 = Bitmap.createBitmap(C17978n.m(C17752b.e(((float) rect.width()) * (((float) i11) / ((float) (rect.height() + this.f42795d)))), 1, this.f42792a), this.f42793b, g.j(config));
                C17542s.i(bitmap2, "{\n        val scale = ma…Default()\n        )\n    }");
            }
            Canvas canvas = new Canvas(bitmap2);
            float height2 = ((float) canvas.getHeight()) / ((float) (rect.height() + this.f42795d));
            Bitmap bitmap4 = this.f42794c;
            if (bitmap4 != null) {
                Rect rect2 = new Rect(0, 0, bitmap4.getWidth(), bitmap4.getHeight());
                Rect rect3 = new Rect(0, 0, canvas.getWidth(), C17752b.e(((float) this.f42795d) * height2));
                canvas.drawBitmap(bitmap4, rect2, rect3, (Paint) null);
                i10 = rect3.bottom;
            } else {
                i10 = 0;
            }
            canvas.drawBitmap(bitmap, rect, new Rect(0, i10, canvas.getWidth(), canvas.getHeight()), (Paint) null);
            this.f42794c = bitmap2;
            this.f42795d = rect.height() + this.f42795d;
        }
    }
}
