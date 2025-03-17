package N;

import C.C4391e0;
import G.h;
import H2.i;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.n;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

public final class b {

    public static final class a extends Exception {

        /* renamed from: a  reason: collision with root package name */
        private final C0131a f9156a;

        /* renamed from: N.b$a$a  reason: collision with other inner class name */
        public enum C0131a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        a(String str, C0131a aVar) {
            super(str);
            this.f9156a = aVar;
        }
    }

    public static Rect a(Size size, Rational rational) {
        int i10;
        if (!i(rational)) {
            C4391e0.l("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f10 = (float) width;
        float f11 = (float) height;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i11 = 0;
        if (rational.floatValue() > f10 / f11) {
            int round = Math.round((f10 / ((float) numerator)) * ((float) denominator));
            int i12 = round;
            i10 = (height - round) / 2;
            height = i12;
        } else {
            int round2 = Math.round((f11 / ((float) denominator)) * ((float) numerator));
            int i13 = (width - round2) / 2;
            width = round2;
            i10 = 0;
            i11 = i13;
        }
        return new Rect(i11, i10, width + i11, height + i10);
    }

    public static Bitmap b(n nVar) {
        int format = nVar.getFormat();
        if (format == 1) {
            return e(nVar);
        }
        if (format == 35) {
            return ImageProcessingUtil.f(nVar);
        }
        if (format == 256 || format == 4101) {
            return c(nVar);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + nVar.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
    }

    private static Bitmap c(n nVar) {
        byte[] k10 = k(nVar);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(k10, 0, k10.length, (BitmapFactory.Options) null);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static Bitmap d(n.a[] aVarArr, int i10, int i11) {
        boolean z10 = true;
        i.b(aVarArr.length == 1, "Expect a single plane");
        i.b(aVarArr[0].b() == 4, "Expect pixelStride=4");
        if (aVarArr[0].a() != i10 * 4) {
            z10 = false;
        }
        i.b(z10, "Expect rowStride=width*4");
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        aVarArr[0].p().rewind();
        ImageProcessingUtil.j(createBitmap, aVarArr[0].p(), aVarArr[0].a());
        return createBitmap;
    }

    private static Bitmap e(n nVar) {
        Bitmap createBitmap = Bitmap.createBitmap(nVar.getWidth(), nVar.getHeight(), Bitmap.Config.ARGB_8888);
        nVar.A1()[0].p().rewind();
        ImageProcessingUtil.j(createBitmap, nVar.A1()[0].p(), nVar.A1()[0].a());
        return createBitmap;
    }

    public static ByteBuffer f(Bitmap bitmap) {
        i.b(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.i(bitmap, allocateDirect, bitmap.getRowBytes());
        allocateDirect.rewind();
        return allocateDirect;
    }

    public static Rational g(int i10, Rational rational) {
        return (i10 == 90 || i10 == 270) ? h(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    private static Rational h(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean i(Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && !rational.isNaN();
    }

    public static boolean j(int i10) {
        return i10 == 256 || i10 == 4101;
    }

    public static byte[] k(n nVar) {
        if (j(nVar.getFormat())) {
            ByteBuffer p10 = nVar.A1()[0].p();
            byte[] bArr = new byte[p10.capacity()];
            p10.rewind();
            p10.get(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + nVar.getFormat());
    }

    public static Bitmap l(Bitmap bitmap, int i10) {
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i10);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static byte[] m(n nVar, Rect rect, int i10, int i11) {
        if (nVar.getFormat() == 35) {
            YuvImage yuvImage = new YuvImage(n(nVar), 17, nVar.getWidth(), nVar.getHeight(), (int[]) null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            G.i iVar = new G.i(byteArrayOutputStream, h.b(nVar, i11));
            if (rect == null) {
                rect = new Rect(0, 0, nVar.getWidth(), nVar.getHeight());
            }
            if (yuvImage.compressToJpeg(rect, i10, iVar)) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new a("YuvImage failed to encode jpeg.", a.C0131a.ENCODE_FAILED);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + nVar.getFormat());
    }

    public static byte[] n(n nVar) {
        n.a aVar = nVar.A1()[0];
        n.a aVar2 = nVar.A1()[1];
        n.a aVar3 = nVar.A1()[2];
        ByteBuffer p10 = aVar.p();
        ByteBuffer p11 = aVar2.p();
        ByteBuffer p12 = aVar3.p();
        p10.rewind();
        p11.rewind();
        p12.rewind();
        int remaining = p10.remaining();
        byte[] bArr = new byte[(((nVar.getWidth() * nVar.getHeight()) / 2) + remaining)];
        int i10 = 0;
        for (int i11 = 0; i11 < nVar.getHeight(); i11++) {
            p10.get(bArr, i10, nVar.getWidth());
            i10 += nVar.getWidth();
            p10.position(Math.min(remaining, (p10.position() - nVar.getWidth()) + aVar.a()));
        }
        int height = nVar.getHeight() / 2;
        int width = nVar.getWidth() / 2;
        int a10 = aVar3.a();
        int a11 = aVar2.a();
        int b10 = aVar3.b();
        int b11 = aVar2.b();
        byte[] bArr2 = new byte[a10];
        byte[] bArr3 = new byte[a11];
        for (int i12 = 0; i12 < height; i12++) {
            p12.get(bArr2, 0, Math.min(a10, p12.remaining()));
            p11.get(bArr3, 0, Math.min(a11, p11.remaining()));
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < width; i15++) {
                int i16 = i10 + 1;
                bArr[i10] = bArr2[i13];
                i10 += 2;
                bArr[i16] = bArr3[i14];
                i13 += b10;
                i14 += b11;
            }
        }
        return bArr;
    }
}
