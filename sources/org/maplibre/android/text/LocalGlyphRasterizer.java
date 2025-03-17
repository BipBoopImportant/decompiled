package org.maplibre.android.text;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.Keep;

@Keep
public class LocalGlyphRasterizer {
    private final Bitmap bitmap;
    private final Canvas canvas;
    private final Paint paint;

    LocalGlyphRasterizer() {
        Bitmap createBitmap = Bitmap.createBitmap(35, 35, Bitmap.Config.ARGB_8888);
        this.bitmap = createBitmap;
        Paint paint2 = new Paint();
        this.paint = paint2;
        paint2.setAntiAlias(true);
        paint2.setTextSize(24.0f);
        Canvas canvas2 = new Canvas();
        this.canvas = canvas2;
        canvas2.setBitmap(createBitmap);
    }

    /* access modifiers changed from: protected */
    public Bitmap drawGlyphBitmap(String str, boolean z10, char c10) {
        this.paint.setTypeface(Typeface.create(str, z10 ? 1 : 0));
        this.canvas.drawColor(-1);
        this.canvas.drawText(String.valueOf(c10), 5.0f, 25.0f, this.paint);
        return this.bitmap;
    }
}
