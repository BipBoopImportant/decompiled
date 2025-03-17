package ya;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.Image;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.nio.ByteBuffer;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f58070a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f58071b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f58072c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final c f58073a = new c();

        @RecentlyNonNull
        public c a() {
            if (this.f58073a.f58071b != null || this.f58073a.f58072c != null) {
                return this.f58073a;
            }
            C0938c unused = this.f58073a.getClass();
            throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
        }

        @RecentlyNonNull
        public a b(int i10) {
            int unused = this.f58073a.c().f58076c = i10;
            return this;
        }

        @RecentlyNonNull
        public a c(@RecentlyNonNull ByteBuffer byteBuffer, int i10, int i11, int i12) {
            if (byteBuffer == null) {
                throw new IllegalArgumentException("Null image data supplied.");
            } else if (byteBuffer.capacity() < i10 * i11) {
                throw new IllegalArgumentException("Invalid image data size.");
            } else if (i12 == 16 || i12 == 17 || i12 == 842094169) {
                ByteBuffer unused = this.f58073a.f58071b = byteBuffer;
                b c10 = this.f58073a.c();
                int unused2 = c10.f58074a = i10;
                int unused3 = c10.f58075b = i11;
                int unused4 = c10.f58079f = i12;
                return this;
            } else {
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Unsupported image format: ");
                sb2.append(i12);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        @RecentlyNonNull
        public a d(int i10) {
            int unused = this.f58073a.c().f58078e = i10;
            return this;
        }

        @RecentlyNonNull
        public a e(long j10) {
            long unused = this.f58073a.c().f58077d = j10;
            return this;
        }
    }

    /* renamed from: ya.c$c  reason: collision with other inner class name */
    private static class C0938c {
    }

    private c() {
        this.f58070a = new b();
        this.f58071b = null;
        this.f58072c = null;
    }

    @RecentlyNullable
    public Bitmap a() {
        return this.f58072c;
    }

    @RecentlyNullable
    public ByteBuffer b() {
        Bitmap bitmap = this.f58072c;
        if (bitmap == null) {
            return this.f58071b;
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = this.f58072c.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        this.f58072c.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((int) ((((float) Color.red(iArr[i11])) * 0.299f) + (((float) Color.green(iArr[i11])) * 0.587f) + (((float) Color.blue(iArr[i11])) * 0.114f)));
        }
        return ByteBuffer.wrap(bArr);
    }

    @RecentlyNonNull
    public b c() {
        return this.f58070a;
    }

    @RecentlyNullable
    public Image.Plane[] d() {
        return null;
    }

    public static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f58074a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f58075b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f58076c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public long f58077d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f58078e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f58079f = -1;

        public b() {
        }

        public int a() {
            return this.f58079f;
        }

        public int b() {
            return this.f58075b;
        }

        public int c() {
            return this.f58076c;
        }

        public int d() {
            return this.f58078e;
        }

        public long e() {
            return this.f58077d;
        }

        public int f() {
            return this.f58074a;
        }

        public final void i() {
            if (this.f58078e % 2 != 0) {
                int i10 = this.f58074a;
                this.f58074a = this.f58075b;
                this.f58075b = i10;
            }
            this.f58078e = 0;
        }

        public b(@RecentlyNonNull b bVar) {
            this.f58074a = bVar.f();
            this.f58075b = bVar.b();
            this.f58076c = bVar.c();
            this.f58077d = bVar.e();
            this.f58078e = bVar.d();
            this.f58079f = bVar.a();
        }
    }
}
