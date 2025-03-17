package a9;

import G8.g;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.o3  reason: case insensitive filesystem */
public final class C6897o3 {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f42779a;

    /* renamed from: b  reason: collision with root package name */
    public int f42780b;

    /* renamed from: c  reason: collision with root package name */
    public int f42781c;

    /* renamed from: d  reason: collision with root package name */
    public int f42782d;

    public final void a(int i10) {
        int i11 = i10 + this.f42781c;
        Bitmap bitmap = this.f42779a;
        if (bitmap == null) {
            return;
        }
        if (i11 >= bitmap.getHeight()) {
            this.f42779a = null;
            this.f42781c = 0;
        } else if (i11 > 0) {
            Rect rect = new Rect(0, i11, bitmap.getWidth(), bitmap.getHeight());
            this.f42779a = null;
            b(bitmap, rect);
            this.f42781c -= i11;
        }
    }

    public final void b(Bitmap bitmap, Rect rect) {
        C17542s.j(bitmap, "appendBitmap");
        C17542s.j(rect, "appendRect");
        if (rect.width() > 0 && rect.height() > 0) {
            Bitmap bitmap2 = this.f42779a;
            Bitmap createBitmap = bitmap2 != null ? Bitmap.createBitmap(bitmap2.getWidth(), rect.height() + bitmap2.getHeight(), g.j(bitmap2.getConfig())) : null;
            if (createBitmap == null) {
                createBitmap = Bitmap.createBitmap(bitmap.getWidth(), rect.height(), g.j(bitmap.getConfig()));
                C17542s.i(createBitmap, "createBitmap(\n          …fig.orDefault()\n        )");
            }
            Canvas canvas = new Canvas(createBitmap);
            Bitmap bitmap3 = this.f42779a;
            if (bitmap3 != null) {
                canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
            }
            Rect rect2 = new Rect(rect);
            Bitmap bitmap4 = this.f42779a;
            int height = bitmap4 != null ? bitmap4.getHeight() : 0;
            rect2.top = height;
            rect2.bottom = rect.height() + height;
            canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
            this.f42779a = createBitmap;
        }
    }

    public final void c(Bitmap bitmap, Rect rect) {
        C17542s.j(bitmap, "screenshot");
        C17542s.j(rect, "pageRect");
        int i10 = 0;
        Rect rect2 = new Rect(0, rect.top, bitmap.getWidth(), rect.bottom);
        b(bitmap, rect2);
        int height = rect2.height() + this.f42780b;
        this.f42780b = height;
        this.f42782d = height - rect.bottom;
        Bitmap bitmap2 = this.f42779a;
        if (bitmap2 != null) {
            i10 = bitmap2.getHeight();
        }
        this.f42781c = i10 - rect.bottom;
    }
}
