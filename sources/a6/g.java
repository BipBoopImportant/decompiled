package a6;

import QJ.Q;
import T5.r;
import WK.C16772g;
import X5.C6723h;
import X5.C6724i;
import X5.s;
import XH.C16807N;
import XH.y;
import Z5.o;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Size;
import b6.C7074e;
import dI.C17164e;
import eI.C17187b;
import k6.C8442i;
import k6.C8444k;
import k6.C8450q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import l6.C8531c;
import nI.C17631a;
import pI.C17752b;
import r6.C8694b;
import r6.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0016\u0013B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"La6/g;", "LX5/i;", "LX5/s;", "source", "Lk6/q;", "options", "", "enforceMinimumFrameDelay", "<init>", "(LX5/s;Lk6/q;Z)V", "Landroid/graphics/ImageDecoder;", "LXH/N;", "f", "(Landroid/graphics/ImageDecoder;)V", "Landroid/graphics/drawable/Drawable;", "baseDrawable", "h", "(Landroid/graphics/drawable/Drawable;LdI/e;)Ljava/lang/Object;", "LX5/g;", "a", "(LdI/e;)Ljava/lang/Object;", "LX5/s;", "b", "Lk6/q;", "c", "Z", "d", "coil-gif_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements C6724i {

    /* renamed from: d  reason: collision with root package name */
    public static final a f41452d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final s f41453a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C8450q f41454b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f41455c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"La6/g$a;", "", "<init>", "()V", "", "ENCODED_LOOP_COUNT", "I", "coil-gif_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "coil3.gif.AnimatedImageDecoder", f = "AnimatedImageDecoder.kt", l = {59, 100}, m = "decode")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f41457c;

        /* renamed from: d  reason: collision with root package name */
        Object f41458d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f41459e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f41460f;

        /* renamed from: g  reason: collision with root package name */
        int f41461g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f41460f = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f41459e = obj;
            this.f41461g |= Integer.MIN_VALUE;
            return this.f41460f.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/graphics/ImageDecoder;", "decoder", "Landroid/graphics/ImageDecoder$ImageInfo;", "info", "Landroid/graphics/ImageDecoder$Source;", "source", "LXH/N;", "onHeaderDecoded", "(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d implements ImageDecoder$OnHeaderDecodedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f41462a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ K f41463b;

        public d(g gVar, K k10) {
            this.f41462a = gVar;
            this.f41463b = k10;
        }

        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            Size a10 = imageInfo.getSize();
            int width = a10.getWidth();
            int height = a10.getHeight();
            long b10 = C6723h.b(width, height, this.f41462a.f41454b.k(), this.f41462a.f41454b.j(), C8442i.e(this.f41462a.f41454b));
            int c10 = p.c(b10);
            int d10 = p.d(b10);
            if (width > 0 && height > 0 && !(width == c10 && height == d10)) {
                double d11 = C6723h.d(width, height, c10, d10, this.f41462a.f41454b.j());
                K k10 = this.f41463b;
                boolean z10 = d11 < 1.0d;
                k10.f144344a = z10;
                if (z10 || this.f41462a.f41454b.i() == C8531c.EXACT) {
                    imageDecoder.setTargetSize(C17752b.d(((double) width) * d11), C17752b.d(d11 * ((double) height)));
                }
            }
            this.f41462a.f(imageDecoder);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "coil3.gif.AnimatedImageDecoder", f = "AnimatedImageDecoder.kt", l = {136}, m = "wrapDrawable")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f41464c;

        /* renamed from: d  reason: collision with root package name */
        Object f41465d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f41466e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f41467f;

        /* renamed from: g  reason: collision with root package name */
        int f41468g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g gVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f41467f = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f41466e = obj;
            this.f41468g |= Integer.MIN_VALUE;
            return this.f41467f.h((Drawable) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "coil3.gif.AnimatedImageDecoder$wrapDrawable$2", f = "AnimatedImageDecoder.kt", l = {}, m = "invokeSuspend")
    static final class f extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f41469c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Drawable f41470d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f41471e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f41472f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Drawable drawable, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f41470d = drawable;
            this.f41471e = aVar;
            this.f41472f = aVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f41470d, this.f41471e, this.f41472f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f41469c == 0) {
                y.b(obj);
                c.a(this.f41470d).registerAnimationCallback(C7074e.b(this.f41471e, this.f41472f));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public g(s sVar, C8450q qVar, boolean z10) {
        this.f41453a = sVar;
        this.f41454b = qVar;
        this.f41455c = z10;
    }

    /* access modifiers changed from: private */
    public final void f(ImageDecoder imageDecoder) {
        imageDecoder.setAllocator(C8694b.d(C8444k.l(this.f41454b)) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(C8444k.i(this.f41454b) ^ true ? 1 : 0);
        if (C8444k.m(this.f41454b) != null) {
            imageDecoder.setTargetColorSpace(C8444k.m(this.f41454b));
        }
        i a10 = m.a(this.f41454b);
        imageDecoder.setPostProcessor(a10 != null ? C7074e.d(a10) : null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        jI.C17416c.a(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        lI.C17553a.a(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.drawable.Drawable g(a6.g r4, kotlin.jvm.internal.K r5) {
        /*
            X5.s r0 = r4.f41453a
            boolean r1 = r4.f41455c
            X5.s r0 = b6.C7071b.a(r0, r1)
            k6.q r1 = r4.f41454b     // Catch:{ all -> 0x0022 }
            r2 = 1
            android.graphics.ImageDecoder$Source r1 = X5.N.b(r0, r1, r2)     // Catch:{ all -> 0x0022 }
            r2 = 0
            if (r1 != 0) goto L_0x002b
            WK.g r1 = r0.k3()     // Catch:{ all -> 0x0022 }
            java.nio.ByteBuffer r3 = b6.C7074e.g(r1)     // Catch:{ all -> 0x0024 }
            jI.C17416c.a(r1, r2)     // Catch:{ all -> 0x0022 }
            android.graphics.ImageDecoder$Source r1 = android.graphics.ImageDecoder.createSource(r3)     // Catch:{ all -> 0x0022 }
            goto L_0x002b
        L_0x0022:
            r4 = move-exception
            goto L_0x003c
        L_0x0024:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r5 = move-exception
            jI.C17416c.a(r1, r4)     // Catch:{ all -> 0x0022 }
            throw r5     // Catch:{ all -> 0x0022 }
        L_0x002b:
            a6.g$d r3 = new a6.g$d     // Catch:{ all -> 0x0022 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0022 }
            android.graphics.ImageDecoder$OnHeaderDecodedListener r4 = X5.w.a(r3)     // Catch:{ all -> 0x0022 }
            android.graphics.drawable.Drawable r4 = android.graphics.ImageDecoder.decodeDrawable(r1, r4)     // Catch:{ all -> 0x0022 }
            lI.C17553a.a(r0, r2)
            return r4
        L_0x003c:
            throw r4     // Catch:{ all -> 0x003d }
        L_0x003d:
            r5 = move-exception
            lI.C17553a.a(r0, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.g.g(a6.g, kotlin.jvm.internal.K):android.graphics.drawable.Drawable");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(android.graphics.drawable.Drawable r8, dI.C17164e<? super android.graphics.drawable.Drawable> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a6.g.e
            if (r0 == 0) goto L_0x0013
            r0 = r9
            a6.g$e r0 = (a6.g.e) r0
            int r1 = r0.f41468g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f41468g = r1
            goto L_0x0018
        L_0x0013:
            a6.g$e r0 = new a6.g$e
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f41466e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f41468g
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r8 = r0.f41465d
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            java.lang.Object r0 = r0.f41464c
            a6.g r0 = (a6.g) r0
            XH.y.b(r9)
            goto L_0x0087
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            XH.y.b(r9)
            boolean r9 = a6.C6745b.a(r8)
            if (r9 != 0) goto L_0x0043
            return r8
        L_0x0043:
            k6.q r9 = r7.f41454b
            int r9 = a6.m.d(r9)
            r2 = -2
            if (r9 == r2) goto L_0x0059
            android.graphics.drawable.AnimatedImageDrawable r9 = a6.c.a(r8)
            k6.q r2 = r7.f41454b
            int r2 = a6.m.d(r2)
            r9.setRepeatCount(r2)
        L_0x0059:
            k6.q r9 = r7.f41454b
            nI.a r9 = a6.m.c(r9)
            k6.q r2 = r7.f41454b
            nI.a r2 = a6.m.b(r2)
            if (r9 != 0) goto L_0x006c
            if (r2 == 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r0 = r7
            goto L_0x0087
        L_0x006c:
            QJ.P0 r4 = QJ.C16311i0.c()
            QJ.P0 r4 = r4.P0()
            a6.g$f r5 = new a6.g$f
            r6 = 0
            r5.<init>(r8, r9, r2, r6)
            r0.f41464c = r7
            r0.f41465d = r8
            r0.f41468g = r3
            java.lang.Object r9 = QJ.C16310i.g(r4, r5, r0)
            if (r9 != r1) goto L_0x006a
            return r1
        L_0x0087:
            l6.g r9 = new l6.g
            k6.q r0 = r0.f41454b
            l6.f r0 = r0.j()
            r9.<init>(r8, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.g.h(android.graphics.drawable.Drawable, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super X5.C6722g> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a6.g.c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            a6.g$c r0 = (a6.g.c) r0
            int r1 = r0.f41461g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f41461g = r1
            goto L_0x0018
        L_0x0013:
            a6.g$c r0 = new a6.g$c
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f41459e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f41461g
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 == r5) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r0 = r0.f41457c
            kotlin.jvm.internal.K r0 = (kotlin.jvm.internal.K) r0
            XH.y.b(r8)
            goto L_0x0073
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            java.lang.Object r2 = r0.f41458d
            kotlin.jvm.internal.K r2 = (kotlin.jvm.internal.K) r2
            java.lang.Object r5 = r0.f41457c
            a6.g r5 = (a6.g) r5
            XH.y.b(r8)
            goto L_0x0063
        L_0x0045:
            XH.y.b(r8)
            kotlin.jvm.internal.K r8 = new kotlin.jvm.internal.K
            r8.<init>()
            a6.f r2 = new a6.f
            r2.<init>(r7, r8)
            r0.f41457c = r7
            r0.f41458d = r8
            r0.f41461g = r5
            java.lang.Object r2 = QJ.C0.c(r4, r2, r0, r5, r4)
            if (r2 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r5 = r7
            r6 = r2
            r2 = r8
            r8 = r6
        L_0x0063:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            r0.f41457c = r2
            r0.f41458d = r4
            r0.f41461g = r3
            java.lang.Object r8 = r5.h(r8, r0)
            if (r8 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r0 = r2
        L_0x0073:
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            T5.n r8 = T5.u.c(r8)
            boolean r0 = r0.f144344a
            X5.g r1 = new X5.g
            r1.<init>(r8, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.g.a(dI.e):java.lang.Object");
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"La6/g$b;", "LX5/i$a;", "", "enforceMinimumFrameDelay", "<init>", "(Z)V", "LWK/g;", "source", "b", "(LWK/g;)Z", "LZ5/o;", "result", "Lk6/q;", "options", "LT5/r;", "imageLoader", "LX5/i;", "a", "(LZ5/o;Lk6/q;LT5/r;)LX5/i;", "Z", "coil-gif_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C6724i.a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f41456a;

        public b(boolean z10) {
            this.f41456a = z10;
        }

        private final boolean b(C16772g gVar) {
            C6723h hVar = C6723h.f40673a;
            return j.c(hVar, gVar) || j.b(hVar, gVar) || (Build.VERSION.SDK_INT >= 30 && j.a(hVar, gVar));
        }

        public C6724i a(o oVar, C8450q qVar, r rVar) {
            if (!b(oVar.c().k3())) {
                return null;
            }
            return new g(oVar.c(), qVar, this.f41456a);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? Build.VERSION.SDK_INT < 34 : z10);
        }
    }
}
