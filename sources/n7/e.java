package N7;

import C7.i;
import C7.k;
import E7.v;
import Y7.l;
import a6.C6745b;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final List<ImageHeaderParser> f39155a;

    /* renamed from: b  reason: collision with root package name */
    private final F7.b f39156b;

    private static final class a implements v<Drawable> {

        /* renamed from: a  reason: collision with root package name */
        private final AnimatedImageDrawable f39157a;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f39157a = animatedImageDrawable;
        }

        public int a() {
            return this.f39157a.getIntrinsicWidth() * this.f39157a.getIntrinsicHeight() * l.i(Bitmap.Config.ARGB_8888) * 2;
        }

        /* renamed from: b */
        public AnimatedImageDrawable get() {
            return this.f39157a;
        }

        public void c() {
            this.f39157a.stop();
            this.f39157a.clearAnimationCallbacks();
        }

        public Class<Drawable> d() {
            return Drawable.class;
        }
    }

    private static final class b implements k<ByteBuffer, Drawable> {

        /* renamed from: a  reason: collision with root package name */
        private final e f39158a;

        b(e eVar) {
            this.f39158a = eVar;
        }

        /* renamed from: c */
        public v<Drawable> a(ByteBuffer byteBuffer, int i10, int i11, i iVar) {
            return this.f39158a.b(ImageDecoder.createSource(byteBuffer), i10, i11, iVar);
        }

        /* renamed from: d */
        public boolean b(ByteBuffer byteBuffer, i iVar) {
            return this.f39158a.d(byteBuffer);
        }
    }

    private static final class c implements k<InputStream, Drawable> {

        /* renamed from: a  reason: collision with root package name */
        private final e f39159a;

        c(e eVar) {
            this.f39159a = eVar;
        }

        /* renamed from: c */
        public v<Drawable> a(InputStream inputStream, int i10, int i11, i iVar) {
            return this.f39159a.b(ImageDecoder.createSource(Y7.a.b(inputStream)), i10, i11, iVar);
        }

        /* renamed from: d */
        public boolean b(InputStream inputStream, i iVar) {
            return this.f39159a.c(inputStream);
        }
    }

    private e(List<ImageHeaderParser> list, F7.b bVar) {
        this.f39155a = list;
        this.f39156b = bVar;
    }

    public static k<ByteBuffer, Drawable> a(List<ImageHeaderParser> list, F7.b bVar) {
        return new b(new e(list, bVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }

    public static k<InputStream, Drawable> f(List<ImageHeaderParser> list, F7.b bVar) {
        return new c(new e(list, bVar));
    }

    /* access modifiers changed from: package-private */
    public v<Drawable> b(ImageDecoder.Source source, int i10, int i11, i iVar) {
        Drawable a10 = ImageDecoder.decodeDrawable(source, new K7.b(i10, i11, iVar));
        if (C6745b.a(a10)) {
            return new a(a6.c.a(a10));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + a10);
    }

    /* access modifiers changed from: package-private */
    public boolean c(InputStream inputStream) {
        return e(com.bumptech.glide.load.a.f(this.f39155a, inputStream, this.f39156b));
    }

    /* access modifiers changed from: package-private */
    public boolean d(ByteBuffer byteBuffer) {
        return e(com.bumptech.glide.load.a.g(this.f39155a, byteBuffer));
    }
}
