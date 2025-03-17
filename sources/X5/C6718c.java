package X5;

import T5.r;
import WK.C16770e;
import WK.C16780o;
import WK.N;
import X5.C6724i;
import Z5.o;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bK.h;
import dI.C17164e;
import k6.C8442i;
import k6.C8444k;
import k6.C8450q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l6.C8531c;
import pI.C17752b;
import r6.C8694b;
import r6.p;
import tI.C17978n;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0003\u0013\u0019\u0016B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u0012*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\rH@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"LX5/c;", "LX5/i;", "LX5/s;", "source", "Lk6/q;", "options", "LbK/h;", "parallelismLock", "LX5/o;", "exifOrientationStrategy", "<init>", "(LX5/s;Lk6/q;LbK/h;LX5/o;)V", "Landroid/graphics/BitmapFactory$Options;", "LX5/g;", "e", "(Landroid/graphics/BitmapFactory$Options;)LX5/g;", "LX5/j;", "exifData", "LXH/N;", "c", "(Landroid/graphics/BitmapFactory$Options;LX5/j;)V", "d", "a", "(LdI/e;)Ljava/lang/Object;", "LX5/s;", "b", "Lk6/q;", "LbK/h;", "LX5/o;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: X5.c  reason: case insensitive filesystem */
public final class C6718c implements C6724i {

    /* renamed from: e  reason: collision with root package name */
    public static final a f40655e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final s f40656a;

    /* renamed from: b  reason: collision with root package name */
    private final C8450q f40657b;

    /* renamed from: c  reason: collision with root package name */
    private final h f40658c;

    /* renamed from: d  reason: collision with root package name */
    private final o f40659d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LX5/c$a;", "", "<init>", "()V", "", "DEFAULT_MAX_PARALLELISM", "I", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: X5.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR4\u0010\u0013\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LX5/c$b;", "LWK/o;", "LWK/N;", "delegate", "<init>", "(LWK/N;)V", "LWK/e;", "sink", "", "byteCount", "u0", "(LWK/e;J)J", "Ljava/lang/Exception;", "Lkotlin/Exception;", "value", "b", "Ljava/lang/Exception;", "d", "()Ljava/lang/Exception;", "exception", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: X5.c$b */
    private static final class b extends C16780o {

        /* renamed from: b  reason: collision with root package name */
        private Exception f40660b;

        public b(N n10) {
            super(n10);
        }

        public final Exception d() {
            return this.f40660b;
        }

        public long u0(C16770e eVar, long j10) {
            try {
                return super.u0(eVar, j10);
            } catch (Exception e10) {
                this.f40660b = e10;
                throw e10;
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LX5/c$c;", "LX5/i$a;", "LbK/h;", "parallelismLock", "LX5/o;", "exifOrientationStrategy", "<init>", "(LbK/h;LX5/o;)V", "LZ5/o;", "result", "Lk6/q;", "options", "LT5/r;", "imageLoader", "LX5/i;", "a", "(LZ5/o;Lk6/q;LT5/r;)LX5/i;", "LbK/h;", "b", "LX5/o;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: X5.c$c  reason: collision with other inner class name */
    public static final class C0675c implements C6724i.a {

        /* renamed from: a  reason: collision with root package name */
        private final h f40661a;

        /* renamed from: b  reason: collision with root package name */
        private final o f40662b;

        public C0675c(h hVar, o oVar) {
            this.f40661a = hVar;
            this.f40662b = oVar;
        }

        public C6724i a(o oVar, C8450q qVar, r rVar) {
            return new C6718c(oVar.c(), qVar, this.f40661a, this.f40662b);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "coil3.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", l = {212, 40}, m = "decode")
    /* renamed from: X5.c$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f40663c;

        /* renamed from: d  reason: collision with root package name */
        Object f40664d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f40665e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C6718c f40666f;

        /* renamed from: g  reason: collision with root package name */
        int f40667g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C6718c cVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f40666f = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f40665e = obj;
            this.f40667g |= Integer.MIN_VALUE;
            return this.f40666f.a(this);
        }
    }

    public C6718c(s sVar, C8450q qVar, h hVar, o oVar) {
        this.f40656a = sVar;
        this.f40657b = qVar;
        this.f40658c = hVar;
        this.f40659d = oVar;
    }

    private final void c(BitmapFactory.Options options, C6725j jVar) {
        Bitmap.Config l10 = C8444k.l(this.f40657b);
        if (jVar.b() || q.a(jVar)) {
            l10 = C8694b.e(l10);
        }
        if (C8444k.i(this.f40657b) && l10 == Bitmap.Config.ARGB_8888 && C17542s.e(options.outMimeType, "image/jpeg")) {
            l10 = Bitmap.Config.RGB_565;
        }
        Bitmap.Config config = options.outConfig;
        Bitmap.Config config2 = Bitmap.Config.RGBA_F16;
        if (config == config2 && l10 != Bitmap.Config.HARDWARE) {
            l10 = config2;
        }
        options.inPreferredConfig = l10;
    }

    private final void d(BitmapFactory.Options options, C6725j jVar) {
        BitmapFactory.Options options2 = options;
        boolean z10 = false;
        if (options2.outWidth <= 0 || options2.outHeight <= 0) {
            options2.inSampleSize = 1;
            options2.inScaled = false;
            return;
        }
        int i10 = q.b(jVar) ? options2.outHeight : options2.outWidth;
        int i11 = q.b(jVar) ? options2.outWidth : options2.outHeight;
        long b10 = C6723h.b(i10, i11, this.f40657b.k(), this.f40657b.j(), C8442i.e(this.f40657b));
        int c10 = p.c(b10);
        int d10 = p.d(b10);
        int a10 = C6723h.a(i10, i11, c10, d10, this.f40657b.j());
        options2.inSampleSize = a10;
        double c11 = C6723h.c(((double) i10) / ((double) a10), ((double) i11) / ((double) a10), (double) c10, (double) d10, this.f40657b.j());
        if (this.f40657b.i() == C8531c.INEXACT) {
            c11 = C17978n.g(c11, 1.0d);
        }
        if (c11 == 1.0d) {
            z10 = true;
        }
        options2.inScaled = !z10;
        if (z10) {
            return;
        }
        if (c11 > 1.0d) {
            options2.inDensity = C17752b.d(((double) Integer.MAX_VALUE) / c11);
            options2.inTargetDensity = Integer.MAX_VALUE;
            return;
        }
        options2.inDensity = Integer.MAX_VALUE;
        options2.inTargetDensity = C17752b.d(((double) Integer.MAX_VALUE) * c11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b0, code lost:
        jI.C17416c.a(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X5.C6722g e(android.graphics.BitmapFactory.Options r9) {
        /*
            r8 = this;
            X5.c$b r0 = new X5.c$b
            X5.s r1 = r8.f40656a
            WK.g r1 = r1.k3()
            r0.<init>(r1)
            WK.g r1 = WK.y.d(r0)
            r2 = 1
            r9.inJustDecodeBounds = r2
            WK.g r3 = r1.O()
            java.io.InputStream r3 = r3.q3()
            r4 = 0
            android.graphics.BitmapFactory.decodeStream(r3, r4, r9)
            java.lang.Exception r3 = r0.d()
            if (r3 != 0) goto L_0x00b5
            r3 = 0
            r9.inJustDecodeBounds = r3
            X5.p r5 = X5.p.f40686a
            java.lang.String r6 = r9.outMimeType
            X5.o r7 = r8.f40659d
            X5.j r6 = r5.a(r6, r1, r7)
            java.lang.Exception r7 = r0.d()
            if (r7 != 0) goto L_0x00b4
            r9.inMutable = r3
            k6.q r7 = r8.f40657b
            android.graphics.ColorSpace r7 = k6.C8444k.m(r7)
            if (r7 == 0) goto L_0x0049
            k6.q r7 = r8.f40657b
            android.graphics.ColorSpace r7 = k6.C8444k.m(r7)
            r9.inPreferredColorSpace = r7
        L_0x0049:
            k6.q r7 = r8.f40657b
            boolean r7 = k6.C8444k.o(r7)
            r9.inPremultiplied = r7
            r8.c(r9, r6)
            r8.d(r9, r6)
            java.io.InputStream r7 = r1.q3()     // Catch:{ all -> 0x00ad }
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r7, r4, r9)     // Catch:{ all -> 0x00ad }
            jI.C17416c.a(r1, r4)
            java.lang.Exception r0 = r0.d()
            if (r0 != 0) goto L_0x00ac
            if (r7 == 0) goto L_0x00a4
            k6.q r0 = r8.f40657b
            android.content.Context r0 = r0.c()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.densityDpi
            r7.setDensity(r0)
            android.graphics.Bitmap r0 = r5.b(r7, r6)
            X5.g r1 = new X5.g
            k6.q r4 = r8.f40657b
            android.content.Context r4 = r4.c()
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable
            r5.<init>(r4, r0)
            T5.n r0 = T5.u.c(r5)
            int r4 = r9.inSampleSize
            if (r4 > r2) goto L_0x00a0
            boolean r9 = r9.inScaled
            if (r9 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r2 = r3
        L_0x00a0:
            r1.<init>(r0, r2)
            return r1
        L_0x00a4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the image source (e.g. network, disk, or memory) as it's not encoded as a valid image format."
            r9.<init>(r0)
            throw r9
        L_0x00ac:
            throw r0
        L_0x00ad:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x00af }
        L_0x00af:
            r0 = move-exception
            jI.C17416c.a(r1, r9)
            throw r0
        L_0x00b4:
            throw r7
        L_0x00b5:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X5.C6718c.e(android.graphics.BitmapFactory$Options):X5.g");
    }

    /* access modifiers changed from: private */
    public static final C6722g f(C6718c cVar) {
        return cVar.e(new BitmapFactory.Options());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super X5.C6722g> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X5.C6718c.d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            X5.c$d r0 = (X5.C6718c.d) r0
            int r1 = r0.f40667g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f40667g = r1
            goto L_0x0018
        L_0x0013:
            X5.c$d r0 = new X5.c$d
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f40665e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f40667g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r0 = r0.f40663c
            bK.h r0 = (bK.h) r0
            XH.y.b(r8)     // Catch:{ all -> 0x0030 }
            goto L_0x0070
        L_0x0030:
            r8 = move-exception
            goto L_0x007a
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003a:
            java.lang.Object r2 = r0.f40664d
            bK.h r2 = (bK.h) r2
            java.lang.Object r5 = r0.f40663c
            X5.c r5 = (X5.C6718c) r5
            XH.y.b(r8)
            r8 = r2
            goto L_0x005a
        L_0x0047:
            XH.y.b(r8)
            bK.h r8 = r7.f40658c
            r0.f40663c = r7
            r0.f40664d = r8
            r0.f40667g = r4
            java.lang.Object r2 = r8.b(r0)
            if (r2 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r5 = r7
        L_0x005a:
            X5.b r2 = new X5.b     // Catch:{ all -> 0x0076 }
            r2.<init>(r5)     // Catch:{ all -> 0x0076 }
            r0.f40663c = r8     // Catch:{ all -> 0x0076 }
            r5 = 0
            r0.f40664d = r5     // Catch:{ all -> 0x0076 }
            r0.f40667g = r3     // Catch:{ all -> 0x0076 }
            java.lang.Object r0 = QJ.C0.c(r5, r2, r0, r4, r5)     // Catch:{ all -> 0x0076 }
            if (r0 != r1) goto L_0x006d
            return r1
        L_0x006d:
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x0070:
            X5.g r8 = (X5.C6722g) r8     // Catch:{ all -> 0x0030 }
            r0.release()
            return r8
        L_0x0076:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x007a:
            r0.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X5.C6718c.a(dI.e):java.lang.Object");
    }
}
