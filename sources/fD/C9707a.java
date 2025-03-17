package fd;

import K9.C6620s;
import Zc.C9399h;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import gd.C9725c;
import ia.G5;
import ia.I5;
import java.nio.ByteBuffer;

/* renamed from: fd.a  reason: case insensitive filesystem */
public class C9707a implements C9399h {

    /* renamed from: a  reason: collision with root package name */
    private volatile Bitmap f72970a;

    /* renamed from: b  reason: collision with root package name */
    private volatile ByteBuffer f72971b;

    /* renamed from: c  reason: collision with root package name */
    private volatile C9708b f72972c;

    /* renamed from: d  reason: collision with root package name */
    private final int f72973d;

    /* renamed from: e  reason: collision with root package name */
    private final int f72974e;

    /* renamed from: f  reason: collision with root package name */
    private final int f72975f;

    /* renamed from: g  reason: collision with root package name */
    private final int f72976g;

    /* renamed from: h  reason: collision with root package name */
    private final Matrix f72977h;

    private C9707a(Bitmap bitmap, int i10) {
        this.f72970a = (Bitmap) C6620s.l(bitmap);
        this.f72973d = bitmap.getWidth();
        this.f72974e = bitmap.getHeight();
        k(i10);
        this.f72975f = i10;
        this.f72976g = -1;
        this.f72977h = null;
    }

    public static C9707a a(Image image, int i10, Matrix matrix) {
        C6620s.b(image.getFormat() == 35, "Only YUV_420_888 is supported now");
        return l(image, i10, matrix);
    }

    private static int k(int i10) {
        boolean z10 = true;
        if (!(i10 == 0 || i10 == 90 || i10 == 180)) {
            if (i10 == 270) {
                i10 = 270;
            } else {
                z10 = false;
            }
        }
        C6620s.b(z10, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i10;
    }

    private static C9707a l(Image image, int i10, Matrix matrix) {
        C9707a aVar;
        int limit;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C6620s.m(image, "Please provide a valid image");
        k(i10);
        boolean z10 = true;
        if (!(image.getFormat() == 256 || image.getFormat() == 35)) {
            z10 = false;
        }
        C6620s.b(z10, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            limit = image.getPlanes()[0].getBuffer().limit();
            aVar = new C9707a(C9725c.d().b(image, i10), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            aVar = new C9707a(image, image.getWidth(), image.getHeight(), i10, matrix);
            limit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        int i11 = limit;
        C9707a aVar2 = aVar;
        m(image.getFormat(), 5, elapsedRealtime, image.getHeight(), image.getWidth(), i11, i10);
        return aVar2;
    }

    private static void m(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        I5.a(G5.b("vision-common"), i10, i11, j10, i12, i13, i14, i15);
    }

    public Bitmap b() {
        return this.f72970a;
    }

    public ByteBuffer c() {
        return this.f72971b;
    }

    public Matrix d() {
        return this.f72977h;
    }

    public int e() {
        return this.f72976g;
    }

    public int f() {
        return this.f72974e;
    }

    public Image g() {
        if (this.f72972c == null) {
            return null;
        }
        return this.f72972c.a();
    }

    public Image.Plane[] h() {
        if (this.f72972c == null) {
            return null;
        }
        return this.f72972c.b();
    }

    public int i() {
        return this.f72975f;
    }

    public int j() {
        return this.f72973d;
    }

    private C9707a(Image image, int i10, int i11, int i12, Matrix matrix) {
        C6620s.l(image);
        this.f72972c = new C9708b(image);
        this.f72973d = i10;
        this.f72974e = i11;
        k(i12);
        this.f72975f = i12;
        this.f72976g = 35;
        this.f72977h = matrix;
    }
}
