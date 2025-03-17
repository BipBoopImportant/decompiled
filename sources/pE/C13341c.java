package PE;

import XH.C16807N;
import XH.v;
import YE.C13868b;
import YE.e;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.Image;
import android.util.Log;
import com.google.ar.core.CameraIntrinsics;
import com.sugarcube.core.logger.AnyKt;
import fF.C14453e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\r\u001a\u0004\u0018\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0018\u001a\u00020\u0017*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\t2\u0016\u0010\u0016\u001a\u0012\u0012\b\u0012\u00060\u0013j\u0002`\u0014\u0012\u0004\u0012\u00020\u00150\u0012¢\u0006\u0004\b\u0018\u0010\u0019\u001a1\u0010\u001a\u001a\u00020\u0017*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0016\u001a\u0012\u0012\b\u0012\u00060\u0013j\u0002`\u0014\u0012\u0004\u0012\u00020\u00150\u0012¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001d\u001a\u00020\u001c*\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001e\u001a'\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!*\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u0017¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Landroid/media/Image;", "Landroid/content/Context;", "context", "Landroid/graphics/Bitmap;", "b", "(Landroid/media/Image;Landroid/content/Context;)Landroid/graphics/Bitmap;", "e", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "", "", "width", "height", "spaceBetween", "d", "(Ljava/util/List;ILjava/lang/Integer;I)Landroid/graphics/Bitmap;", "Ljava/io/File;", "file", "quality", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "LXH/N;", "recordException", "", "f", "(Landroid/graphics/Bitmap;Ljava/io/File;ILnI/l;)Z", "h", "(Landroid/graphics/Bitmap;Ljava/io/File;LnI/l;)Z", "", "i", "(Ljava/io/File;)Ljava/lang/String;", "Lcom/google/ar/core/CameraIntrinsics;", "isRotated", "LXH/v;", "", "c", "(Lcom/google/ar/core/CameraIntrinsics;Z)LXH/v;", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: PE.c  reason: case insensitive filesystem */
public final class C13341c {
    public static final Bitmap b(Image image, Context context) {
        C17542s.j(image, "<this>");
        C17542s.j(context, "context");
        Bitmap createBitmap = Bitmap.createBitmap(image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
        C17542s.i(createBitmap, "createBitmap(...)");
        new C14453e(context).b(image, new Rect(0, 0, image.getWidth(), image.getHeight()), createBitmap);
        return createBitmap;
    }

    public static final v<Float, Float> c(CameraIntrinsics cameraIntrinsics, boolean z10) {
        C17542s.j(cameraIntrinsics, "<this>");
        float f10 = cameraIntrinsics.getFocalLength()[0];
        float f11 = cameraIntrinsics.getFocalLength()[1];
        float f12 = cameraIntrinsics.getPrincipalPoint()[0];
        float f13 = cameraIntrinsics.getPrincipalPoint()[1];
        float atan2 = ((float) Math.atan2((double) f12, (double) f10)) * 57.29578f * 2.0f;
        float atan22 = ((float) Math.atan2((double) f13, (double) f11)) * 57.29578f * 2.0f;
        v<Float, Float> vVar = z10 ? new v<>(Float.valueOf(atan22), Float.valueOf(atan2)) : new v<>(Float.valueOf(atan2), Float.valueOf(atan22));
        Float c10 = vVar.c();
        Float d10 = vVar.d();
        String arrays = Arrays.toString(cameraIntrinsics.getImageDimensions());
        C17542s.i(arrays, "toString(...)");
        String str = "CameraIntrinsics.fov(" + z10 + ")=[" + c10 + "," + d10 + "] [" + f10 + "," + f11 + "," + f12 + "," + f13 + "] " + arrays;
        Log.d(AnyKt.SUGARCUBE_TAG, str);
        C13868b.f118106a.b(str, e.Capture);
        return vVar;
    }

    public static final Bitmap d(List<Bitmap> list, int i10, Integer num, int i11) {
        C17542s.j(list, "<this>");
        if (list.size() <= 0) {
            return null;
        }
        int size = ((list.size() - 1) * i11) + i10;
        int intValue = num != null ? num.intValue() : (int) (((float) size) / 2.0f);
        Bitmap createBitmap = Bitmap.createBitmap(size, intValue, Bitmap.Config.ARGB_8888);
        C17542s.i(createBitmap, "createBitmap(...)");
        Paint paint = new Paint(7);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect(0, 0, canvas.getWidth(), canvas.getHeight());
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(0);
        C16807N n10 = C16807N.f139792a;
        canvas.drawRect(rect, paint2);
        int size2 = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size2) {
            Bitmap bitmap = list.get(i12);
            canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(i13, 0, ((i10 / list.size()) + i13) - (i12 >= list.size() + -1 ? 0 : i11), intValue), paint);
            i13 += (i10 / list.size()) + i11;
            i12++;
        }
        return createBitmap;
    }

    public static final Bitmap e(Bitmap bitmap) {
        Bitmap createBitmap;
        C17542s.j(bitmap, "<this>");
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null || (createBitmap = Bitmap.createBitmap(height, width, config)) == null) {
            return bitmap;
        }
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect(0, 0, height, width);
        Matrix matrix = new Matrix();
        float exactCenterX = rect.exactCenterX();
        float exactCenterY = rect.exactCenterY();
        matrix.postTranslate((float) ((-bitmap.getWidth()) / 2), (float) ((-bitmap.getHeight()) / 2));
        matrix.postRotate(90.0f);
        matrix.postTranslate(exactCenterX, exactCenterY);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        matrix.reset();
        return createBitmap;
    }

    public static final boolean f(Bitmap bitmap, File file, int i10, C17642l<? super Exception, C16807N> lVar) {
        Bitmap createBitmap;
        C17542s.j(bitmap, "<this>");
        C17542s.j(file, "file");
        C17542s.j(lVar, "recordException");
        Bitmap.Config config = bitmap.getConfig();
        if (config == null || (createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config)) == null) {
            return false;
        }
        createBitmap.eraseColor(-1);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            createBitmap.compress(Bitmap.CompressFormat.JPEG, i10, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            lVar.invoke(e10);
            return false;
        }
    }

    public static /* synthetic */ boolean g(Bitmap bitmap, File file, int i10, C17642l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 100;
        }
        return f(bitmap, file, i10, lVar);
    }

    public static final boolean h(Bitmap bitmap, File file, C17642l<? super Exception, C16807N> lVar) {
        C17542s.j(bitmap, "<this>");
        C17542s.j(file, "file");
        C17542s.j(lVar, "recordException");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            lVar.invoke(e10);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        jI.C17416c.a(r1, r14);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String i(java.io.File r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r14)
            PE.c$a r14 = new PE.c$a     // Catch:{ all -> 0x003c }
            r14.<init>(r0)     // Catch:{ all -> 0x003c }
            r2 = 0
            r3 = 2
            r4 = 0
            jI.C17415b.b(r1, r14, r2, r3, r4)     // Catch:{ all -> 0x003c }
            XH.N r14 = XH.C16807N.f139792a     // Catch:{ all -> 0x003c }
            jI.C17416c.a(r1, r4)
            byte[] r5 = r0.digest()
            java.lang.String r14 = "digest(...)"
            kotlin.jvm.internal.C17542s.i(r5, r14)
            PE.b r11 = new PE.b
            r11.<init>()
            r12 = 30
            r13 = 0
            java.lang.String r6 = ""
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r14 = YH.C16870n.B0(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        L_0x003c:
            r14 = move-exception
            throw r14     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            jI.C17416c.a(r1, r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: PE.C13341c.i(java.io.File):java.lang.String");
    }

    /* access modifiers changed from: private */
    public static final CharSequence j(byte b10) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        C17542s.i(format, "format(...)");
        return format;
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\nJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"PE/c$a", "Ljava/io/OutputStream;", "", "b", "LXH/N;", "write", "(I)V", "", "off", "len", "([BII)V", "([B)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: PE.c$a */
    public static final class a extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MessageDigest f114036a;

        a(MessageDigest messageDigest) {
            this.f114036a = messageDigest;
        }

        public void write(int i10) {
            MessageDigest messageDigest = this.f114036a;
            C17542s.h(Integer.valueOf(i10), "null cannot be cast to non-null type kotlin.Byte");
            messageDigest.update(new byte[]{((Byte) Integer.valueOf(i10)).byteValue()});
        }

        public void write(byte[] bArr, int i10, int i11) {
            if (bArr != null) {
                this.f114036a.update(bArr, i10, i11);
            }
        }

        public void write(byte[] bArr) {
            if (bArr != null) {
                this.f114036a.update(bArr);
            }
        }
    }
}
