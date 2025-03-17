package P7;

import A7.a;
import A7.c;
import A7.d;
import A7.e;
import C7.i;
import C7.k;
import Y7.g;
import Y7.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

public class a implements k<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    private static final C0623a f39386f = new C0623a();

    /* renamed from: g  reason: collision with root package name */
    private static final b f39387g = new b();

    /* renamed from: a  reason: collision with root package name */
    private final Context f39388a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ImageHeaderParser> f39389b;

    /* renamed from: c  reason: collision with root package name */
    private final b f39390c;

    /* renamed from: d  reason: collision with root package name */
    private final C0623a f39391d;

    /* renamed from: e  reason: collision with root package name */
    private final b f39392e;

    /* renamed from: P7.a$a  reason: collision with other inner class name */
    static class C0623a {
        C0623a() {
        }

        /* access modifiers changed from: package-private */
        public A7.a a(a.C0503a aVar, c cVar, ByteBuffer byteBuffer, int i10) {
            return new e(aVar, cVar, byteBuffer, i10);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Queue<d> f39393a = l.f(0);

        b() {
        }

        /* access modifiers changed from: package-private */
        public synchronized d a(ByteBuffer byteBuffer) {
            d poll;
            try {
                poll = this.f39393a.poll();
                if (poll == null) {
                    poll = new d();
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
            return poll.p(byteBuffer);
        }

        /* access modifiers changed from: package-private */
        public synchronized void b(d dVar) {
            dVar.a();
            this.f39393a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, F7.d dVar, F7.b bVar) {
        this(context, list, dVar, bVar, f39387g, f39386f);
    }

    private e c(ByteBuffer byteBuffer, int i10, int i11, d dVar, i iVar) {
        long b10 = g.b();
        try {
            c c10 = dVar.c();
            if (c10.b() > 0) {
                if (c10.c() == 0) {
                    Bitmap.Config config = iVar.c(i.f39433a) == C7.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    A7.a a10 = this.f39391d.a(this.f39392e, c10, byteBuffer, e(c10, i10, i11));
                    a10.d(config);
                    a10.b();
                    Bitmap a11 = a10.a();
                    if (a11 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + g.a(b10));
                        }
                        return null;
                    }
                    e eVar = new e(new c(this.f39388a, a10, K7.d.c(), i10, i11, a11));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + g.a(b10));
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + g.a(b10));
            }
        }
    }

    private static int e(c cVar, int i10, int i11) {
        int min = Math.min(cVar.a() / i11, cVar.d() / i10);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return max;
    }

    /* renamed from: d */
    public e a(ByteBuffer byteBuffer, int i10, int i11, i iVar) {
        d a10 = this.f39390c.a(byteBuffer);
        try {
            return c(byteBuffer, i10, i11, a10, iVar);
        } finally {
            this.f39390c.b(a10);
        }
    }

    /* renamed from: f */
    public boolean b(ByteBuffer byteBuffer, i iVar) {
        return !((Boolean) iVar.c(i.f39434b)).booleanValue() && com.bumptech.glide.load.a.g(this.f39389b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    a(Context context, List<ImageHeaderParser> list, F7.d dVar, F7.b bVar, b bVar2, C0623a aVar) {
        this.f39388a = context.getApplicationContext();
        this.f39389b = list;
        this.f39391d = aVar;
        this.f39392e = new b(dVar, bVar);
        this.f39390c = bVar2;
    }
}
