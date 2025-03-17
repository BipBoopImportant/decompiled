package oK;

import QJ.M;
import QJ.Q;
import V4.a;
import XH.C16807N;
import XH.y;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import c2.s;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nK.C17673d;
import nK.C17679j;
import oK.C17715h;
import p1.b1;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001\u0014B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e*\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u001a\u0010\"\u001a\u00020\u000e8VX\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0019\u0010!\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"LoK/a;", "LoK/h;", "LnK/j;", "imageSource", "LnK/d;", "imageOptions", "Landroid/graphics/BitmapRegionDecoder;", "decoder", "LoK/d;", "exif", "LQJ/M;", "dispatcher", "<init>", "(LnK/j;LnK/d;Landroid/graphics/BitmapRegionDecoder;LoK/d;LQJ/M;)V", "Lc2/r;", "e", "(Landroid/graphics/BitmapRegionDecoder;)J", "LoK/j;", "region", "Lt1/c;", "b", "(LoK/j;LdI/e;)Ljava/lang/Object;", "LXH/N;", "close", "()V", "a", "LnK/j;", "LnK/d;", "c", "Landroid/graphics/BitmapRegionDecoder;", "d", "LoK/d;", "LQJ/M;", "()J", "imageSize", "f", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oK.a  reason: case insensitive filesystem */
public final class C17708a implements C17715h {

    /* renamed from: f  reason: collision with root package name */
    public static final b f145298f = new b((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f145299g = 8;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final C17715h.a f145300h = C4235a.f145306a;

    /* renamed from: a  reason: collision with root package name */
    private final C17679j f145301a;

    /* renamed from: b  reason: collision with root package name */
    private final C17673d f145302b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final BitmapRegionDecoder f145303c;

    /* renamed from: d  reason: collision with root package name */
    private final C17711d f145304d;

    /* renamed from: e  reason: collision with root package name */
    private final M f145305e;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LoK/h$b;", "params", "LoK/h;", "a", "(LoK/h$b;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oK.a$a  reason: collision with other inner class name */
    static final class C4235a implements C17715h.a {

        /* renamed from: a  reason: collision with root package name */
        public static final C4235a f145306a = new C4235a();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "Landroid/graphics/BitmapRegionDecoder;", "<anonymous>", "(LQJ/Q;)Landroid/graphics/BitmapRegionDecoder;"}, k = 3, mv = {1, 9, 0})
        @f(c = "me.saket.telephoto.subsamplingimage.internal.AndroidImageRegionDecoder$Companion$Factory$1$1", f = "AndroidImageRegionDecoder.kt", l = {96}, m = "invokeSuspend")
        /* renamed from: oK.a$a$a  reason: collision with other inner class name */
        static final class C4236a extends l implements p<Q, C17164e<? super BitmapRegionDecoder>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f145307c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17715h.b f145308d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4236a(C17715h.b bVar, C17164e<? super C4236a> eVar) {
                super(2, eVar);
                this.f145308d = bVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C4236a(this.f145308d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super BitmapRegionDecoder> eVar) {
                return ((C4236a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f145307c;
                if (i10 == 0) {
                    y.b(obj);
                    C17679j d10 = this.f145308d.d();
                    Context a10 = this.f145308d.a();
                    this.f145307c = 1;
                    obj = d10.h2(a10, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @f(c = "me.saket.telephoto.subsamplingimage.internal.AndroidImageRegionDecoder$Companion$Factory$1", f = "AndroidImageRegionDecoder.kt", l = {95}, m = "create")
        /* renamed from: oK.a$a$b */
        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            Object f145309c;

            /* renamed from: d  reason: collision with root package name */
            Object f145310d;

            /* renamed from: e  reason: collision with root package name */
            Object f145311e;

            /* renamed from: f  reason: collision with root package name */
            Object f145312f;

            /* renamed from: g  reason: collision with root package name */
            /* synthetic */ Object f145313g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C4235a f145314h;

            /* renamed from: i  reason: collision with root package name */
            int f145315i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C4235a aVar, C17164e<? super b> eVar) {
                super(eVar);
                this.f145314h = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f145313g = obj;
                this.f145315i |= Integer.MIN_VALUE;
                return this.f145314h.a((C17715h.b) null, this);
            }
        }

        C4235a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(oK.C17715h.b r13, dI.C17164e<? super oK.C17715h> r14) {
            /*
                r12 = this;
                boolean r0 = r14 instanceof oK.C17708a.C4235a.b
                if (r0 == 0) goto L_0x0013
                r0 = r14
                oK.a$a$b r0 = (oK.C17708a.C4235a.b) r0
                int r1 = r0.f145315i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f145315i = r1
                goto L_0x0018
            L_0x0013:
                oK.a$a$b r0 = new oK.a$a$b
                r0.<init>(r12, r14)
            L_0x0018:
                java.lang.Object r14 = r0.f145313g
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f145315i
                r3 = 1
                if (r2 == 0) goto L_0x0045
                if (r2 != r3) goto L_0x003d
                java.lang.Object r13 = r0.f145312f
                nK.d r13 = (nK.C17673d) r13
                java.lang.Object r1 = r0.f145311e
                nK.j r1 = (nK.C17679j) r1
                java.lang.Object r2 = r0.f145310d
                QJ.M r2 = (QJ.M) r2
                java.lang.Object r0 = r0.f145309c
                oK.h$b r0 = (oK.C17715h.b) r0
                XH.y.b(r14)
                r7 = r13
                r13 = r0
                r6 = r1
                r10 = r2
                goto L_0x0073
            L_0x003d:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L_0x0045:
                XH.y.b(r14)
                QJ.M r14 = QJ.C16311i0.b()
                QJ.M r2 = r14.K0(r3)
                nK.j r14 = r13.d()
                nK.d r4 = r13.c()
                oK.a$a$a r5 = new oK.a$a$a
                r6 = 0
                r5.<init>(r13, r6)
                r0.f145309c = r13
                r0.f145310d = r2
                r0.f145311e = r14
                r0.f145312f = r4
                r0.f145315i = r3
                java.lang.Object r0 = QJ.C16310i.g(r2, r5, r0)
                if (r0 != r1) goto L_0x006f
                return r1
            L_0x006f:
                r6 = r14
                r14 = r0
                r10 = r2
                r7 = r4
            L_0x0073:
                r8 = r14
                android.graphics.BitmapRegionDecoder r8 = (android.graphics.BitmapRegionDecoder) r8
                oK.d r9 = r13.b()
                oK.a r13 = new oK.a
                r11 = 0
                r5 = r13
                r5.<init>(r6, r7, r8, r9, r10, r11)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: oK.C17708a.C4235a.a(oK.h$b, dI.e):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LoK/a$b;", "", "<init>", "()V", "LoK/h$a;", "Factory", "LoK/h$a;", "a", "()LoK/h$a;", "getFactory$annotations", "sub-sampling-image_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oK.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17715h.a a() {
            return C17708a.f145300h;
        }

        private b() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oK.a$c */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f145316a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                oK.d$b[] r0 = oK.C17711d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                oK.d$b r1 = oK.C17711d.b.Orientation90     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                oK.d$b r1 = oK.C17711d.b.Orientation270     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f145316a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: oK.C17708a.c.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @f(c = "me.saket.telephoto.subsamplingimage.internal.AndroidImageRegionDecoder", f = "AndroidImageRegionDecoder.kt", l = {50}, m = "decodeRegion")
    /* renamed from: oK.a$d */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f145317c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f145318d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17708a f145319e;

        /* renamed from: f  reason: collision with root package name */
        int f145320f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17708a aVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f145319e = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f145318d = obj;
            this.f145320f |= Integer.MIN_VALUE;
            return this.f145319e.b((C17717j) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "<anonymous>", "(LQJ/Q;)Landroid/graphics/Bitmap;"}, k = 3, mv = {1, 9, 0})
    @f(c = "me.saket.telephoto.subsamplingimage.internal.AndroidImageRegionDecoder$decodeRegion$bitmap$1", f = "AndroidImageRegionDecoder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: oK.a$e */
    static final class e extends l implements p<Q, C17164e<? super Bitmap>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f145321c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17708a f145322d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c2.p f145323e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ BitmapFactory.Options f145324f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C17708a aVar, c2.p pVar, BitmapFactory.Options options, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f145322d = aVar;
            this.f145323e = pVar;
            this.f145324f = options;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f145322d, this.f145323e, this.f145324f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Bitmap> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f145321c == 0) {
                y.b(obj);
                C17708a aVar = this.f145322d;
                c2.p pVar = this.f145323e;
                BitmapFactory.Options options = this.f145324f;
                a.c("decodeRegion");
                try {
                    return aVar.f145303c.decodeRegion(b1.a(pVar), options);
                } finally {
                    a.f();
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public /* synthetic */ C17708a(C17679j jVar, C17673d dVar, BitmapRegionDecoder bitmapRegionDecoder, C17711d dVar2, M m10, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, dVar, bitmapRegionDecoder, dVar2, m10);
    }

    private final long e(BitmapRegionDecoder bitmapRegionDecoder) {
        int i10 = c.f145316a[this.f145304d.a().ordinal()];
        boolean z10 = true;
        if (!(i10 == 1 || i10 == 2)) {
            z10 = false;
        }
        return s.a(z10 ? bitmapRegionDecoder.getHeight() : bitmapRegionDecoder.getWidth(), z10 ? bitmapRegionDecoder.getWidth() : bitmapRegionDecoder.getHeight());
    }

    public long a() {
        return e(this.f145303c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(oK.C17717j r9, dI.C17164e<? super t1.C5942c> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof oK.C17708a.d
            if (r0 == 0) goto L_0x0013
            r0 = r10
            oK.a$d r0 = (oK.C17708a.d) r0
            int r1 = r0.f145320f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f145320f = r1
            goto L_0x0018
        L_0x0013:
            oK.a$d r0 = new oK.a$d
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f145318d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f145320f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r9 = r0.f145317c
            oK.a r9 = (oK.C17708a) r9
            XH.y.b(r10)
            goto L_0x008c
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0035:
            XH.y.b(r10)
            android.graphics.BitmapFactory$Options r10 = new android.graphics.BitmapFactory$Options
            r10.<init>()
            int r2 = r9.b()
            r10.inSampleSize = r2
            nK.d r2 = r8.f145302b
            int r2 = r2.c()
            android.graphics.Bitmap$Config r2 = nK.C17674e.b(r2)
            r10.inPreferredConfig = r2
            nK.d r2 = r8.f145302b
            android.graphics.ColorSpace r2 = r2.b()
            r10.inPreferredColorSpace = r2
            c2.p r9 = r9.a()
            oK.d r2 = r8.f145304d
            oK.d$b r2 = r2.a()
            int r2 = r2.b()
            int r2 = -r2
            c2.n$a r4 = c2.n.f23044b
            long r4 = r4.a()
            long r6 = r8.a()
            c2.p r4 = c2.q.a(r4, r6)
            c2.p r9 = oK.p.g(r9, r2, r4)
            QJ.M r2 = r8.f145305e
            oK.a$e r4 = new oK.a$e
            r5 = 0
            r4.<init>(r8, r9, r10, r5)
            r0.f145317c = r8
            r0.f145320f = r3
            java.lang.Object r10 = QJ.C16310i.g(r2, r4, r0)
            if (r10 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r9 = r8
        L_0x008c:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            if (r10 == 0) goto L_0x009c
            oK.o r0 = new oK.o
            oK.d r9 = r9.f145304d
            oK.d$b r9 = r9.a()
            r0.<init>(r10, r9)
            return r0
        L_0x009c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            nK.j r9 = r9.f145301a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BitmapRegionDecoder returned a null bitmap. Image format may not be supported: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = "."
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: oK.C17708a.b(oK.j, dI.e):java.lang.Object");
    }

    public void close() {
    }

    private C17708a(C17679j jVar, C17673d dVar, BitmapRegionDecoder bitmapRegionDecoder, C17711d dVar2, M m10) {
        this.f145301a = jVar;
        this.f145302b = dVar;
        this.f145303c = bitmapRegionDecoder;
        this.f145304d = dVar2;
        this.f145305e = m10;
    }
}
