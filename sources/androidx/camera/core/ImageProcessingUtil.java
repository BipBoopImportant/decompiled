package androidx.camera.core;

import C.C4391e0;
import C.X;
import C.Y;
import H2.i;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.impl.C5048t0;
import java.nio.ByteBuffer;
import java.util.Locale;

public final class ImageProcessingUtil {

    /* renamed from: a  reason: collision with root package name */
    private static int f16651a;

    enum a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static boolean c(n nVar) {
        if (!l(nVar)) {
            C4391e0.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return false;
        } else if (d(nVar) != a.ERROR_CONVERSION) {
            return true;
        } else {
            C4391e0.c("ImageProcessingUtil", "One pixel shift for YUV failure");
            return false;
        }
    }

    private static a d(n nVar) {
        int width = nVar.getWidth();
        int height = nVar.getHeight();
        int a10 = nVar.A1()[0].a();
        int a11 = nVar.A1()[1].a();
        int a12 = nVar.A1()[2].a();
        int b10 = nVar.A1()[0].b();
        int b11 = nVar.A1()[1].b();
        return nativeShiftPixel(nVar.A1()[0].p(), a10, nVar.A1()[1].p(), a11, nVar.A1()[2].p(), a12, b10, b11, width, height, b10, b11, b11) != 0 ? a.ERROR_CONVERSION : a.SUCCESS;
    }

    public static n e(C5048t0 t0Var, byte[] bArr) {
        i.a(t0Var.c() == 256);
        i.g(bArr);
        Surface surface = t0Var.getSurface();
        i.g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            C4391e0.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
            return null;
        }
        n b10 = t0Var.b();
        if (b10 == null) {
            C4391e0.c("ImageProcessingUtil", "Failed to get acquire JPEG image.");
        }
        return b10;
    }

    public static Bitmap f(n nVar) {
        if (nVar.getFormat() == 35) {
            int width = nVar.getWidth();
            int height = nVar.getHeight();
            int a10 = nVar.A1()[0].a();
            int a11 = nVar.A1()[1].a();
            int a12 = nVar.A1()[2].a();
            int b10 = nVar.A1()[0].b();
            int b11 = nVar.A1()[1].b();
            Bitmap createBitmap = Bitmap.createBitmap(nVar.getWidth(), nVar.getHeight(), Bitmap.Config.ARGB_8888);
            int rowBytes = createBitmap.getRowBytes();
            if (nativeConvertAndroid420ToBitmap(nVar.A1()[0].p(), a10, nVar.A1()[1].p(), a11, nVar.A1()[2].p(), a12, b10, b11, createBitmap, rowBytes, width, height) == 0) {
                return createBitmap;
            }
            throw new UnsupportedOperationException("YUV to RGB conversion failed");
        }
        throw new IllegalArgumentException("Input image format must be YUV_420_888");
    }

    public static n g(n nVar, C5048t0 t0Var, ByteBuffer byteBuffer, int i10, boolean z10) {
        if (!l(nVar)) {
            C4391e0.c("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!k(i10)) {
            C4391e0.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        } else if (h(nVar, t0Var.getSurface(), byteBuffer, i10, z10) == a.ERROR_CONVERSION) {
            C4391e0.c("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        } else {
            if (Log.isLoggable("MH", 3)) {
                C4391e0.a("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(f16651a)}));
                f16651a++;
            }
            n b10 = t0Var.b();
            if (b10 == null) {
                C4391e0.c("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
                return null;
            }
            s sVar = new s(b10);
            sVar.c(new Y(b10, nVar));
            return sVar;
        }
    }

    private static a h(n nVar, Surface surface, ByteBuffer byteBuffer, int i10, boolean z10) {
        int width = nVar.getWidth();
        int height = nVar.getHeight();
        int a10 = nVar.A1()[0].a();
        int a11 = nVar.A1()[1].a();
        int a12 = nVar.A1()[2].a();
        int b10 = nVar.A1()[0].b();
        int b11 = nVar.A1()[1].b();
        return nativeConvertAndroid420ToABGR(nVar.A1()[0].p(), a10, nVar.A1()[1].p(), a11, nVar.A1()[2].p(), a12, b10, b11, surface, byteBuffer, width, height, z10 ? b10 : 0, z10 ? b11 : 0, z10 ? b11 : 0, i10) != 0 ? a.ERROR_CONVERSION : a.SUCCESS;
    }

    public static void i(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i10, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void j(Bitmap bitmap, ByteBuffer byteBuffer, int i10) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i10, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    private static boolean k(int i10) {
        return i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270;
    }

    private static boolean l(n nVar) {
        return nVar.getFormat() == 35 && nVar.A1().length == 3;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void m(n nVar, n nVar2, n nVar3) {
        if (nVar != null && nVar2 != null) {
            nVar2.close();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void n(n nVar, n nVar2, n nVar3) {
        if (nVar != null && nVar2 != null) {
            nVar2.close();
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Surface surface, ByteBuffer byteBuffer4, int i15, int i16, int i17, int i18, int i19, int i20);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, Bitmap bitmap, int i15, int i16, int i17);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i10, int i11, int i12, int i13, boolean z10);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, ByteBuffer byteBuffer4, int i14, int i15, ByteBuffer byteBuffer5, int i16, int i17, ByteBuffer byteBuffer6, int i18, int i19, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i20, int i21, int i22);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    public static n o(n nVar, C5048t0 t0Var, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        if (!l(nVar)) {
            C4391e0.c("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        } else if (!k(i10)) {
            C4391e0.c("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        } else {
            a aVar = a.ERROR_CONVERSION;
            if ((i10 > 0 ? p(nVar, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i10) : aVar) == aVar) {
                C4391e0.c("ImageProcessingUtil", "rotate YUV failure");
                return null;
            }
            n b10 = t0Var.b();
            if (b10 == null) {
                C4391e0.c("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
                return null;
            }
            s sVar = new s(b10);
            sVar.c(new X(b10, nVar));
            return sVar;
        }
    }

    private static a p(n nVar, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i10) {
        int width = nVar.getWidth();
        int height = nVar.getHeight();
        int a10 = nVar.A1()[0].a();
        int a11 = nVar.A1()[1].a();
        int a12 = nVar.A1()[2].a();
        int b10 = nVar.A1()[1].b();
        Image b11 = K.a.b(imageWriter);
        if (b11 == null) {
            return a.ERROR_CONVERSION;
        }
        Image image = b11;
        Image image2 = image;
        if (nativeRotateYUV(nVar.A1()[0].p(), a10, nVar.A1()[1].p(), a11, nVar.A1()[2].p(), a12, b10, b11.getPlanes()[0].getBuffer(), b11.getPlanes()[0].getRowStride(), b11.getPlanes()[0].getPixelStride(), b11.getPlanes()[1].getBuffer(), b11.getPlanes()[1].getRowStride(), b11.getPlanes()[1].getPixelStride(), b11.getPlanes()[2].getBuffer(), b11.getPlanes()[2].getRowStride(), image.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i10) != 0) {
            return a.ERROR_CONVERSION;
        }
        K.a.d(imageWriter, image2);
        return a.SUCCESS;
    }

    public static boolean q(Surface surface, byte[] bArr) {
        i.g(bArr);
        i.g(surface);
        if (nativeWriteJpegToSurface(bArr, surface) == 0) {
            return true;
        }
        C4391e0.c("ImageProcessingUtil", "Failed to enqueue JPEG image.");
        return false;
    }
}
