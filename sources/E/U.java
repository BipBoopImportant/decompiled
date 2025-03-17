package E;

import C.W;
import G.h;
import H2.i;
import O.B;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.impl.g1;
import androidx.camera.core.n;
import java.nio.ByteBuffer;
import java.util.Objects;

public final class U implements n {

    /* renamed from: a  reason: collision with root package name */
    private final Object f5574a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5575b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5576c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f5577d;

    /* renamed from: e  reason: collision with root package name */
    n.a[] f5578e;

    /* renamed from: f  reason: collision with root package name */
    private final W f5579f;

    class a implements n.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5580a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5581b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ByteBuffer f5582c;

        a(int i10, int i11, ByteBuffer byteBuffer) {
            this.f5580a = i10;
            this.f5581b = i11;
            this.f5582c = byteBuffer;
        }

        public int a() {
            return this.f5580a;
        }

        public int b() {
            return this.f5581b;
        }

        public ByteBuffer p() {
            return this.f5582c;
        }
    }

    class b implements W {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f5583a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5584b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Matrix f5585c;

        b(long j10, int i10, Matrix matrix) {
            this.f5583a = j10;
            this.f5584b = i10;
            this.f5585c = matrix;
        }

        public long a() {
            return this.f5583a;
        }

        public g1 b() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        public void c(h.b bVar) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }

        public Matrix d() {
            return new Matrix(this.f5585c);
        }

        public int e() {
            return this.f5584b;
        }
    }

    public U(B<Bitmap> b10) {
        this(b10.c(), b10.b(), b10.f(), b10.g(), b10.a().a());
    }

    private void c() {
        synchronized (this.f5574a) {
            i.j(this.f5578e != null, "The image is closed.");
        }
    }

    private static W d(long j10, int i10, Matrix matrix) {
        return new b(j10, i10, matrix);
    }

    private static n.a e(ByteBuffer byteBuffer, int i10, int i11) {
        return new a(i10, i11, byteBuffer);
    }

    public n.a[] A1() {
        n.a[] aVarArr;
        synchronized (this.f5574a) {
            c();
            n.a[] aVarArr2 = this.f5578e;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    public W F2() {
        W w10;
        synchronized (this.f5574a) {
            c();
            w10 = this.f5579f;
        }
        return w10;
    }

    public void close() {
        synchronized (this.f5574a) {
            c();
            this.f5578e = null;
        }
    }

    public Rect getCropRect() {
        Rect rect;
        synchronized (this.f5574a) {
            c();
            rect = this.f5577d;
        }
        return rect;
    }

    public int getFormat() {
        synchronized (this.f5574a) {
            c();
        }
        return 1;
    }

    public int getHeight() {
        int i10;
        synchronized (this.f5574a) {
            c();
            i10 = this.f5576c;
        }
        return i10;
    }

    public int getWidth() {
        int i10;
        synchronized (this.f5574a) {
            c();
            i10 = this.f5575b;
        }
        return i10;
    }

    public Image k() {
        synchronized (this.f5574a) {
            c();
        }
        return null;
    }

    public void setCropRect(Rect rect) {
        synchronized (this.f5574a) {
            try {
                c();
                if (rect != null) {
                    this.f5577d.set(rect);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public U(Bitmap bitmap, Rect rect, int i10, Matrix matrix, long j10) {
        this(N.b.f(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i10, matrix, j10);
    }

    public U(ByteBuffer byteBuffer, int i10, int i11, int i12, Rect rect, int i13, Matrix matrix, long j10) {
        this.f5574a = new Object();
        this.f5575b = i11;
        this.f5576c = i12;
        this.f5577d = rect;
        this.f5579f = d(j10, i13, matrix);
        byteBuffer.rewind();
        this.f5578e = new n.a[]{e(byteBuffer, i11 * i10, i10)};
    }
}
