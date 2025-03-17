package E5;

import WK.C16772g;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.exifinterface.media.a;
import java.io.InputStream;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"LE5/l;", "", "<init>", "()V", "", "mimeType", "LWK/g;", "source", "LE5/k;", "policy", "LE5/i;", "a", "(Ljava/lang/String;LWK/g;LE5/k;)LE5/i;", "Landroid/graphics/Bitmap;", "inBitmap", "exifData", "b", "(Landroid/graphics/Bitmap;LE5/i;)Landroid/graphics/Bitmap;", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "PAINT", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f34888a = new l();

    /* renamed from: b  reason: collision with root package name */
    private static final Paint f34889b = new Paint(3);

    private l() {
    }

    public final i a(String str, C16772g gVar, k kVar) {
        if (!m.c(kVar, str)) {
            return i.f34883d;
        }
        a aVar = new a((InputStream) new j(gVar.O().q3()));
        return new i(aVar.D(), aVar.s());
    }

    public final Bitmap b(Bitmap bitmap, i iVar) {
        if (!iVar.b() && !m.a(iVar)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width = ((float) bitmap.getWidth()) / 2.0f;
        float height = ((float) bitmap.getHeight()) / 2.0f;
        if (iVar.b()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (m.a(iVar)) {
            matrix.postRotate((float) iVar.a(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        float f10 = rectF.left;
        if (!(f10 == 0.0f && rectF.top == 0.0f)) {
            matrix.postTranslate(-f10, -rectF.top);
        }
        Bitmap createBitmap = m.b(iVar) ? Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), S5.a.c(bitmap)) : Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), S5.a.c(bitmap));
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, f34889b);
        bitmap.recycle();
        return createBitmap;
    }
}
