package X5;

import WK.C16772g;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.exifinterface.media.a;
import java.io.InputStream;
import kotlin.Metadata;
import r6.C8694b;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"LX5/p;", "", "<init>", "()V", "", "mimeType", "LWK/g;", "source", "LX5/o;", "strategy", "LX5/j;", "a", "(Ljava/lang/String;LWK/g;LX5/o;)LX5/j;", "Landroid/graphics/Bitmap;", "inBitmap", "exifData", "b", "(Landroid/graphics/Bitmap;LX5/j;)Landroid/graphics/Bitmap;", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f40686a = new p();

    /* renamed from: b  reason: collision with root package name */
    private static final Paint f40687b = new Paint(3);

    private p() {
    }

    public final C6725j a(String str, C16772g gVar, o oVar) {
        if (!oVar.c(str, gVar)) {
            return C6725j.f40676d;
        }
        a aVar = new a((InputStream) new C6726k(gVar.O().q3()));
        return new C6725j(aVar.D(), aVar.s());
    }

    public final Bitmap b(Bitmap bitmap, C6725j jVar) {
        if (!jVar.b() && !q.a(jVar)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = ((float) bitmap.getWidth()) / 2.0f;
        float height = ((float) bitmap.getHeight()) / 2.0f;
        if (jVar.b()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (q.a(jVar)) {
            matrix.postRotate((float) jVar.a(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        float f10 = rectF.left;
        if (!(f10 == 0.0f && rectF.top == 0.0f)) {
            matrix.postTranslate(-f10, -rectF.top);
        }
        Bitmap createBitmap = q.b(jVar) ? Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), C8694b.c(bitmap)) : Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), C8694b.c(bitmap));
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, f40687b);
        bitmap.recycle();
        return createBitmap;
    }
}
