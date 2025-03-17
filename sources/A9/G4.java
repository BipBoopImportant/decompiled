package a9;

import G8.g;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Base64;
import com.contentsquare.android.sdk.C7153u;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.C17542s;

public final class G4 {
    public static final String a(G4 g42, Rect rect, Bitmap bitmap) {
        g42.getClass();
        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), g.j(bitmap.getConfig()));
        C17542s.i(createBitmap, "createBitmap(\n          …fig.orDefault()\n        )");
        Canvas canvas = new Canvas(createBitmap);
        Rect rect2 = new Rect(rect);
        rect2.offsetTo(0, 0);
        canvas.drawBitmap(bitmap, rect, rect2, (Paint) null);
        C17542s.j(createBitmap, "bitmap");
        if (createBitmap.getHeight() <= 0 || createBitmap.getWidth() <= 0) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C17542s.i(byteArray, "stream.toByteArray()");
        C17542s.j(byteArray, "imageByteArray");
        String encodeToString = Base64.encodeToString(byteArray, 2);
        C17542s.i(encodeToString, "encodeToString(imageByteArray, Base64.NO_WRAP)");
        return encodeToString;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(com.contentsquare.android.sdk.C7153u r4, a9.C6977y4 r5, a9.C6914q4 r6) {
        /*
            r6.invoke(r4)
            java.util.List<com.contentsquare.android.sdk.u> r0 = r4.f47641c
            if (r0 == 0) goto L_0x002a
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r0.next()
            java.lang.Object r3 = r5.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0010
            r1.add(r2)
            goto L_0x0010
        L_0x002a:
            r1 = 0
        L_0x002b:
            if (r1 != 0) goto L_0x0031
            java.util.List r1 = YH.C16877v.n()
        L_0x0031:
            java.util.Iterator r0 = r1.iterator()
        L_0x0035:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r0.next()
            com.contentsquare.android.sdk.u r2 = (com.contentsquare.android.sdk.C7153u) r2
            c(r2, r5, r6)
            goto L_0x0035
        L_0x0045:
            r4.f47641c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.G4.c(com.contentsquare.android.sdk.u, a9.y4, a9.q4):void");
    }

    public final void b(B0 b02, Rect rect, Bitmap bitmap, C7153u uVar) {
        C17542s.j(b02, "context");
        C17542s.j(rect, "rootViewRect");
        C17542s.j(bitmap, "screenshot");
        C17542s.j(uVar, "containerViewJson");
        C17542s.j(b02, "context");
        C17542s.j(rect, "rootViewRect");
        C17542s.j(bitmap, "screenshot");
        C6977y4 y4Var = new C6977y4(bitmap.getHeight() - (rect.bottom - b02.f41923a.bottom));
        C17542s.j(b02, "context");
        C17542s.j(rect, "rootViewRect");
        C17542s.j(bitmap, "screenshot");
        c(uVar, y4Var, new C6914q4(bitmap.getHeight() - (rect.bottom - b02.f41923a.bottom), this, bitmap));
    }
}
