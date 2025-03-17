package w3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.exifinterface.media.a;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import q3.B;

/* renamed from: w3.c  reason: case insensitive filesystem */
public final class C6219c {
    public static Bitmap a(byte[] bArr, int i10, BitmapFactory.Options options, int i11) {
        if (i11 != -1) {
            if (options == null) {
                options = new BitmapFactory.Options();
            }
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i10, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int max = Math.max(options.outWidth, options.outHeight); max > i11; max /= 2) {
                options.inSampleSize *= 2;
            }
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i10, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (decodeByteArray != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                a aVar = new a((InputStream) byteArrayInputStream);
                byteArrayInputStream.close();
                int s10 = aVar.s();
                if (s10 == 0) {
                    return decodeByteArray;
                }
                Matrix matrix = new Matrix();
                matrix.postRotate((float) s10);
                return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            throw B.a("Could not decode image data", new IllegalStateException());
        }
        throw th;
    }
}
