package L7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

interface t {

    public static final class a implements t {

        /* renamed from: a  reason: collision with root package name */
        private final ByteBuffer f38431a;

        /* renamed from: b  reason: collision with root package name */
        private final List<ImageHeaderParser> f38432b;

        /* renamed from: c  reason: collision with root package name */
        private final F7.b f38433c;

        a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, F7.b bVar) {
            this.f38431a = byteBuffer;
            this.f38432b = list;
            this.f38433c = bVar;
        }

        private InputStream e() {
            return Y7.a.g(Y7.a.d(this.f38431a));
        }

        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), (Rect) null, options);
        }

        public void b() {
        }

        public int c() {
            return com.bumptech.glide.load.a.c(this.f38432b, Y7.a.d(this.f38431a), this.f38433c);
        }

        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.g(this.f38432b, Y7.a.d(this.f38431a));
        }
    }

    public static final class b implements t {

        /* renamed from: a  reason: collision with root package name */
        private final k f38434a;

        /* renamed from: b  reason: collision with root package name */
        private final F7.b f38435b;

        /* renamed from: c  reason: collision with root package name */
        private final List<ImageHeaderParser> f38436c;

        b(InputStream inputStream, List<ImageHeaderParser> list, F7.b bVar) {
            this.f38435b = (F7.b) Y7.k.d(bVar);
            this.f38436c = (List) Y7.k.d(list);
            this.f38434a = new k(inputStream, bVar);
        }

        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f38434a.a(), (Rect) null, options);
        }

        public void b() {
            this.f38434a.c();
        }

        public int c() {
            return com.bumptech.glide.load.a.b(this.f38436c, this.f38434a.a(), this.f38435b);
        }

        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.f(this.f38436c, this.f38434a.a(), this.f38435b);
        }
    }

    public static final class c implements t {

        /* renamed from: a  reason: collision with root package name */
        private final F7.b f38437a;

        /* renamed from: b  reason: collision with root package name */
        private final List<ImageHeaderParser> f38438b;

        /* renamed from: c  reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f38439c;

        c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, F7.b bVar) {
            this.f38437a = (F7.b) Y7.k.d(bVar);
            this.f38438b = (List) Y7.k.d(list);
            this.f38439c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f38439c.a().getFileDescriptor(), (Rect) null, options);
        }

        public void b() {
        }

        public int c() {
            return com.bumptech.glide.load.a.a(this.f38438b, this.f38439c, this.f38437a);
        }

        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.e(this.f38438b, this.f38439c, this.f38437a);
        }
    }

    Bitmap a(BitmapFactory.Options options);

    void b();

    int c();

    ImageHeaderParser.ImageType d();
}
