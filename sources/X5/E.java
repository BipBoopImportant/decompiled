package X5;

import T5.r;
import X5.C6724i;
import Z5.o;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;
import bK.h;
import dI.C17164e;
import k6.C8442i;
import k6.C8444k;
import k6.C8450q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.K;
import l6.C8531c;
import pI.C17752b;
import r6.C8694b;
import r6.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LX5/E;", "LX5/i;", "Landroid/graphics/ImageDecoder$Source;", "source", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Lk6/q;", "options", "LbK/h;", "parallelismLock", "<init>", "(Landroid/graphics/ImageDecoder$Source;Ljava/lang/AutoCloseable;Lk6/q;LbK/h;)V", "Landroid/graphics/ImageDecoder;", "LXH/N;", "e", "(Landroid/graphics/ImageDecoder;)V", "LX5/g;", "a", "(LdI/e;)Ljava/lang/Object;", "Landroid/graphics/ImageDecoder$Source;", "b", "Ljava/lang/AutoCloseable;", "c", "Lk6/q;", "d", "LbK/h;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class E implements C6724i {

    /* renamed from: a  reason: collision with root package name */
    private final ImageDecoder.Source f40640a;

    /* renamed from: b  reason: collision with root package name */
    private final AutoCloseable f40641b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C8450q f40642c;

    /* renamed from: d  reason: collision with root package name */
    private final h f40643d;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LX5/E$a;", "LX5/i$a;", "LbK/h;", "parallelismLock", "<init>", "(LbK/h;)V", "Lk6/q;", "options", "", "b", "(Lk6/q;)Z", "LZ5/o;", "result", "LT5/r;", "imageLoader", "LX5/i;", "a", "(LZ5/o;Lk6/q;LT5/r;)LX5/i;", "LbK/h;", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C6724i.a {

        /* renamed from: a  reason: collision with root package name */
        private final h f40644a;

        public a(h hVar) {
            this.f40644a = hVar;
        }

        private final boolean b(C8450q qVar) {
            Bitmap.Config l10 = C8444k.l(qVar);
            return l10 == Bitmap.Config.ARGB_8888 || l10 == Bitmap.Config.HARDWARE;
        }

        public C6724i a(o oVar, C8450q qVar, r rVar) {
            ImageDecoder.Source b10;
            if (b(qVar) && (b10 = N.b(oVar.c(), qVar, false)) != null) {
                return new E(b10, oVar.c(), qVar, this.f40644a);
            }
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "coil3.decode.StaticImageDecoder", f = "StaticImageDecoder.kt", l = {168}, m = "decode")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f40645c;

        /* renamed from: d  reason: collision with root package name */
        Object f40646d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f40647e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ E f40648f;

        /* renamed from: g  reason: collision with root package name */
        int f40649g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(E e10, C17164e<? super b> eVar) {
            super(eVar);
            this.f40648f = e10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f40647e = obj;
            this.f40649g |= Integer.MIN_VALUE;
            return this.f40648f.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", "info", "Landroid/graphics/ImageDecoder$Source;", "source", "LXH/N;", "onHeaderDecoded", "(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c implements ImageDecoder$OnHeaderDecodedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ E f40650a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ K f40651b;

        public c(E e10, K k10) {
            this.f40650a = e10;
            this.f40651b = k10;
        }

        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            Size a10 = imageInfo.getSize();
            int width = a10.getWidth();
            int height = a10.getHeight();
            long b10 = C6723h.b(width, height, this.f40650a.f40642c.k(), this.f40650a.f40642c.j(), C8442i.e(this.f40650a.f40642c));
            int c10 = p.c(b10);
            int d10 = p.d(b10);
            if (width > 0 && height > 0 && !(width == c10 && height == d10)) {
                double d11 = C6723h.d(width, height, c10, d10, this.f40650a.f40642c.j());
                K k10 = this.f40651b;
                boolean z10 = d11 < 1.0d;
                k10.f144344a = z10;
                if (z10 || this.f40650a.f40642c.i() == C8531c.EXACT) {
                    imageDecoder.setTargetSize(C17752b.d(((double) width) * d11), C17752b.d(d11 * ((double) height)));
                }
            }
            this.f40650a.e(imageDecoder);
        }
    }

    public E(ImageDecoder.Source source, AutoCloseable autoCloseable, C8450q qVar, h hVar) {
        this.f40640a = source;
        this.f40641b = autoCloseable;
        this.f40642c = qVar;
        this.f40643d = hVar;
    }

    /* access modifiers changed from: private */
    public final void e(ImageDecoder imageDecoder) {
        imageDecoder.setOnPartialImageListener(new D());
        imageDecoder.setAllocator(C8694b.d(C8444k.l(this.f40642c)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(C8444k.i(this.f40642c) ^ true ? 1 : 0);
        if (C8444k.m(this.f40642c) != null) {
            imageDecoder.setTargetColorSpace(C8444k.m(this.f40642c));
        }
        imageDecoder.setUnpremultipliedRequired(!C8444k.o(this.f40642c));
    }

    /* access modifiers changed from: private */
    public static final boolean f(ImageDecoder.DecodeException decodeException) {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        lI.C17553a.a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super X5.C6722g> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X5.E.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            X5.E$b r0 = (X5.E$b) r0
            int r1 = r0.f40649g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f40649g = r1
            goto L_0x0018
        L_0x0013:
            X5.E$b r0 = new X5.E$b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f40647e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f40649g
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f40646d
            bK.h r1 = (bK.h) r1
            java.lang.Object r0 = r0.f40645c
            X5.E r0 = (X5.E) r0
            XH.y.b(r8)
            goto L_0x004d
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            XH.y.b(r8)
            bK.h r8 = r7.f40643d
            r0.f40645c = r7
            r0.f40646d = r8
            r0.f40649g = r3
            java.lang.Object r0 = r8.b(r0)
            if (r0 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r7
            r1 = r8
        L_0x004d:
            java.lang.AutoCloseable r8 = r0.f40641b     // Catch:{ all -> 0x0077 }
            kotlin.jvm.internal.K r2 = new kotlin.jvm.internal.K     // Catch:{ all -> 0x0079 }
            r2.<init>()     // Catch:{ all -> 0x0079 }
            android.graphics.ImageDecoder$Source r4 = r0.f40640a     // Catch:{ all -> 0x0079 }
            X5.E$c r5 = new X5.E$c     // Catch:{ all -> 0x0079 }
            r5.<init>(r0, r2)     // Catch:{ all -> 0x0079 }
            android.graphics.ImageDecoder$OnHeaderDecodedListener r0 = X5.w.a(r5)     // Catch:{ all -> 0x0079 }
            android.graphics.Bitmap r0 = android.graphics.ImageDecoder.decodeBitmap(r4, r0)     // Catch:{ all -> 0x0079 }
            X5.g r4 = new X5.g     // Catch:{ all -> 0x0079 }
            r5 = 0
            r6 = 0
            T5.a r0 = T5.u.d(r0, r5, r3, r6)     // Catch:{ all -> 0x0079 }
            boolean r2 = r2.f144344a     // Catch:{ all -> 0x0079 }
            r4.<init>(r0, r2)     // Catch:{ all -> 0x0079 }
            lI.C17553a.a(r8, r6)     // Catch:{ all -> 0x0077 }
            r1.release()
            return r4
        L_0x0077:
            r8 = move-exception
            goto L_0x0080
        L_0x0079:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r2 = move-exception
            lI.C17553a.a(r8, r0)     // Catch:{ all -> 0x0077 }
            throw r2     // Catch:{ all -> 0x0077 }
        L_0x0080:
            r1.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X5.E.a(dI.e):java.lang.Object");
    }
}
