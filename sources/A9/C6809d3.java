package a9;

import D8.c;
import android.graphics.Bitmap;
import android.os.Build;
import java.io.ByteArrayOutputStream;

/* renamed from: a9.d3  reason: case insensitive filesystem */
public final class C6809d3 {

    /* renamed from: a  reason: collision with root package name */
    public final c f42507a = new c("BitmapCompressorReusable");

    public static void a(Bitmap bitmap, int i10, ByteArrayOutputStream byteArrayOutputStream) {
        bitmap.compress(Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.WEBP, i10, byteArrayOutputStream);
    }
}
