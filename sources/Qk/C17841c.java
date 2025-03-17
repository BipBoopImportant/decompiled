package qK;

import F5.a;
import GK.C15802u;
import IJ.C15906b;
import IJ.C15908d;
import IJ.C15909e;
import N5.h;
import N5.i;
import N5.m;
import N5.n;
import N5.q;
import N5.r;
import O5.j;
import QJ.Q;
import R5.a;
import R5.c;
import U0.C4899r0;
import U0.o1;
import XH.C16807N;
import XH.y;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import dI.C17164e;
import eI.C17187b;
import g9.C7897a;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.saket.telephoto.zoomable.o;
import nI.p;
import nK.C17679j;
import rK.v;
import t1.C5942c;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH@¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u0013*\u00020\u000fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fH@¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R+\u00100\u001a\u00020)2\u0006\u0010*\u001a\u00020)8@@@X\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"LqK/c;", "LrK/v;", "LN5/h;", "request", "LB5/h;", "imageLoader", "LO5/j;", "sizeResolver", "<init>", "(LN5/h;LB5/h;LO5/j;)V", "", "skipMemoryCache", "LXH/N;", "k", "(ZLdI/e;)Ljava/lang/Object;", "LN5/i;", "LqK/c$a;", "j", "(LN5/i;LdI/e;)Ljava/lang/Object;", "LIJ/b;", "f", "(LN5/i;)J", "Landroid/net/Uri;", "h", "(LN5/h;)Landroid/net/Uri;", "Landroid/graphics/drawable/Drawable;", "Lt1/c;", "e", "(Landroid/graphics/drawable/Drawable;)Lt1/c;", "a", "(LdI/e;)Ljava/lang/Object;", "b", "LN5/h;", "getRequest$coil_release", "()LN5/h;", "c", "LB5/h;", "getImageLoader$coil_release", "()LB5/h;", "d", "LO5/j;", "Lme/saket/telephoto/zoomable/o$d;", "<set-?>", "LU0/r0;", "g", "()Lme/saket/telephoto/zoomable/o$d;", "i", "(Lme/saket/telephoto/zoomable/o$d;)V", "resolved", "coil_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qK.c  reason: case insensitive filesystem */
public final class C17841c extends v {

    /* renamed from: b  reason: collision with root package name */
    private final h f146628b;

    /* renamed from: c  reason: collision with root package name */
    private final B5.h f146629c;

    /* renamed from: d  reason: collision with root package name */
    private final j f146630d;

    /* renamed from: e  reason: collision with root package name */
    private final C4899r0 f146631e = u1.e(new o.d((o.b) null, 0, (C5942c) null, 6, (DefaultConstructorMarker) null), (o1) null, 2, (Object) null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"LqK/c$a;", "", "a", "b", "LqK/c$a$a;", "LqK/c$a$b;", "coil_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qK.c$a */
    private interface a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LqK/c$a$a;", "LqK/c$a;", "LnK/j;", "source", "<init>", "(LnK/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LnK/j;", "()LnK/j;", "coil_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: qK.c$a$a  reason: collision with other inner class name */
        public static final class C4265a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final C17679j f146632a;

            public C4265a(C17679j jVar) {
                C17542s.j(jVar, "source");
                this.f146632a = jVar;
            }

            public final C17679j a() {
                return this.f146632a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4265a) && C17542s.e(this.f146632a, ((C4265a) obj).f146632a);
            }

            public int hashCode() {
                return this.f146632a.hashCode();
            }

            public String toString() {
                C17679j jVar = this.f146632a;
                return "EligibleForSubSampling(source=" + jVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LqK/c$a$b;", "LqK/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "coil_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: qK.c$a$b */
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f146633a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 945936809;
            }

            public String toString() {
                return "ImageDeletedOnlyFromDiskCache";
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qK.c$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f146634a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f146635b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f146636c;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|11|12|13|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                N5.b[] r0 = N5.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                N5.b r2 = N5.b.ENABLED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                N5.b r2 = N5.b.READ_ONLY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                N5.b r2 = N5.b.WRITE_ONLY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                N5.b r2 = N5.b.DISABLED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r3 = 4
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f146634a = r0
                O5.e[] r0 = O5.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                O5.e r2 = O5.e.EXACT     // Catch:{ NoSuchFieldError -> 0x003c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                f146635b = r0
                E5.e[] r0 = E5.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                E5.e r2 = E5.e.MEMORY_CACHE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                f146636c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qK.C17841c.b.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "me.saket.telephoto.zoomable.coil.Resolver", f = "CoilImageSource.kt", l = {185, 204, 220}, m = "toSubSamplingImageSource")
    /* renamed from: qK.c$c  reason: collision with other inner class name */
    static final class C4266c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f146637c;

        /* renamed from: d  reason: collision with root package name */
        Object f146638d;

        /* renamed from: e  reason: collision with root package name */
        Object f146639e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f146640f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17841c f146641g;

        /* renamed from: h  reason: collision with root package name */
        int f146642h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4266c(C17841c cVar, C17164e<? super C4266c> eVar) {
            super(eVar);
            this.f146641g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146640f = obj;
            this.f146642h |= Integer.MIN_VALUE;
            return this.f146641g.j((i) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LF5/a$c;", "<anonymous>", "(LQJ/Q;)LF5/a$c;"}, k = 3, mv = {1, 9, 0})
    @kotlin.coroutines.jvm.internal.f(c = "me.saket.telephoto.zoomable.coil.Resolver$toSubSamplingImageSource$source$snapshot$1", f = "CoilImageSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: qK.c$d */
    static final class d extends l implements p<Q, C17164e<? super a.c>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f146643c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ F5.a f146644d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f146645e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(F5.a aVar, i iVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f146644d = aVar;
            this.f146645e = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f146644d, this.f146645e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super a.c> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f146643c == 0) {
                y.b(obj);
                F5.a aVar = this.f146644d;
                String d10 = ((q) this.f146645e).d();
                C17542s.g(d10);
                return aVar.t(d10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"qK/c$e", "LP5/a;", "Landroid/graphics/drawable/Drawable;", "placeholder", "LXH/N;", "d", "(Landroid/graphics/drawable/Drawable;)V", "error", "e", "result", "b", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qK.c$e */
    public static final class e implements P5.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17841c f146646a;

        public e(C17841c cVar) {
            this.f146646a = cVar;
        }

        public void b(Drawable drawable) {
        }

        public void d(Drawable drawable) {
            C17841c cVar = this.f146646a;
            cVar.i(me.saket.telephoto.zoomable.p.b(cVar.g(), (o.b) null, 0, drawable != null ? this.f146646a.e(drawable) : null, 3, (Object) null));
        }

        public void e(Drawable drawable) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "me.saket.telephoto.zoomable.coil.Resolver", f = "CoilImageSource.kt", l = {101, 138, 147}, m = "work")
    /* renamed from: qK.c$f */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f146647c;

        /* renamed from: d  reason: collision with root package name */
        Object f146648d;

        /* renamed from: e  reason: collision with root package name */
        boolean f146649e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f146650f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C17841c f146651g;

        /* renamed from: h  reason: collision with root package name */
        int f146652h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C17841c cVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f146651g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146650f = obj;
            this.f146652h |= Integer.MIN_VALUE;
            return this.f146651g.k(false, this);
        }
    }

    public C17841c(h hVar, B5.h hVar2, j jVar) {
        C17542s.j(hVar, "request");
        C17542s.j(hVar2, "imageLoader");
        C17542s.j(jVar, "sizeResolver");
        this.f146628b = hVar;
        this.f146629c = hVar2;
        this.f146630d = jVar;
    }

    /* access modifiers changed from: private */
    public final C5942c e(Drawable drawable) {
        Drawable mutate = drawable.mutate();
        C17542s.i(mutate, "mutate(...)");
        return new C7897a(mutate);
    }

    private final long f(i iVar) {
        c.a P10 = iVar.b().P();
        if (!(iVar instanceof q) || !(P10 instanceof a.C0634a)) {
            return C15906b.f135496b.c();
        }
        C15906b.a aVar = C15906b.f135496b;
        return C15908d.s(((a.C0634a) P10).b(), C15909e.MILLISECONDS);
    }

    private final Uri h(h hVar) {
        m mVar = r1;
        m mVar2 = new m(this.f146628b.l(), (Bitmap.Config) null, (ColorSpace) null, (O5.i) null, (O5.h) null, false, false, false, (String) null, (C15802u) null, (r) null, (n) null, (N5.b) null, (N5.b) null, (N5.b) null, 32766, (DefaultConstructorMarker) null);
        Object g10 = this.f146629c.getComponents().g(hVar.m(), mVar);
        if (g10 instanceof Uri) {
            return (Uri) g10;
        }
        if (g10 instanceof File) {
            return Uri.parse(((File) g10).getPath());
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(N5.i r12, dI.C17164e<? super qK.C17841c.a> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof qK.C17841c.C4266c
            if (r0 == 0) goto L_0x0013
            r0 = r13
            qK.c$c r0 = (qK.C17841c.C4266c) r0
            int r1 = r0.f146642h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146642h = r1
            goto L_0x0018
        L_0x0013:
            qK.c$c r0 = new qK.c$c
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f146640f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f146642h
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x005e
            if (r2 == r6) goto L_0x004e
            if (r2 == r5) goto L_0x003e
            if (r2 != r4) goto L_0x0036
            java.lang.Object r12 = r0.f146637c
            nK.j r12 = (nK.C17679j) r12
            XH.y.b(r13)
            goto L_0x0165
        L_0x0036:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003e:
            java.lang.Object r12 = r0.f146638d
            nK.j r12 = (nK.C17679j) r12
            java.lang.Object r2 = r0.f146637c
            N5.i r2 = (N5.i) r2
            XH.y.b(r13)
            r10 = r2
            r2 = r12
            r12 = r10
            goto L_0x013c
        L_0x004e:
            java.lang.Object r12 = r0.f146639e
            p1.J0 r12 = (p1.J0) r12
            java.lang.Object r2 = r0.f146638d
            N5.i r2 = (N5.i) r2
            java.lang.Object r5 = r0.f146637c
            N5.i r5 = (N5.i) r5
            XH.y.b(r13)
            goto L_0x00b4
        L_0x005e:
            XH.y.b(r13)
            boolean r13 = r12 instanceof N5.q
            if (r13 == 0) goto L_0x0175
            r13 = r12
            N5.q r13 = (N5.q) r13
            android.graphics.drawable.Drawable r2 = r13.a()
            boolean r2 = r2 instanceof android.graphics.drawable.BitmapDrawable
            if (r2 == 0) goto L_0x0175
            android.graphics.drawable.Drawable r2 = r13.a()
            boolean r8 = r2 instanceof android.graphics.drawable.BitmapDrawable
            if (r8 == 0) goto L_0x007b
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            goto L_0x007c
        L_0x007b:
            r2 = r7
        L_0x007c:
            if (r2 == 0) goto L_0x0089
            android.graphics.Bitmap r2 = r2.getBitmap()
            if (r2 == 0) goto L_0x0089
            p1.J0 r2 = p1.O.c(r2)
            goto L_0x008a
        L_0x0089:
            r2 = r7
        L_0x008a:
            java.lang.String r8 = r13.d()
            if (r8 == 0) goto L_0x00ff
            B5.h r13 = r11.f146629c
            F5.a r13 = r13.a()
            kotlin.jvm.internal.C17542s.g(r13)
            QJ.M r5 = QJ.C16311i0.b()
            qK.c$d r8 = new qK.c$d
            r8.<init>(r13, r12, r7)
            r0.f146637c = r12
            r0.f146638d = r12
            r0.f146639e = r2
            r0.f146642h = r6
            java.lang.Object r13 = QJ.C16310i.g(r5, r8, r0)
            if (r13 != r1) goto L_0x00b1
            return r1
        L_0x00b1:
            r5 = r12
            r12 = r2
            r2 = r5
        L_0x00b4:
            F5.a$c r13 = (F5.a.c) r13
            if (r13 != 0) goto L_0x00ef
            r12 = r2
            N5.q r12 = (N5.q) r12
            E5.e r12 = r12.c()
            int[] r13 = qK.C17841c.b.f146636c
            int r12 = r12.ordinal()
            r12 = r13[r12]
            if (r12 != r6) goto L_0x00cc
            qK.c$a$b r12 = qK.C17841c.a.b.f146633a
            return r12
        L_0x00cc:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            N5.h r13 = r2.b()
            java.lang.Object r13 = r13.m()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Coil returned an image that is missing from its disk cache for "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L_0x00ef:
            nK.j$a r2 = nK.C17679j.f144946v0
            WK.E r8 = r13.getData()
            qK.b r9 = new qK.b
            r9.<init>(r13)
            nK.j r12 = r2.b(r8, r12, r9)
            goto L_0x014c
        L_0x00ff:
            E5.e r8 = r13.c()
            E5.e r9 = E5.e.DISK
            if (r8 == r9) goto L_0x010d
            E5.e r9 = E5.e.MEMORY_CACHE
            if (r8 != r9) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            return r7
        L_0x010d:
            N5.h r8 = r12.b()
            android.net.Uri r8 = r11.h(r8)
            if (r8 == 0) goto L_0x014a
            nK.j$a r9 = nK.C17679j.f144946v0
            nK.j r2 = r9.a(r8, r2)
            if (r2 == 0) goto L_0x014a
            E5.e r13 = r13.c()
            E5.e r8 = E5.e.MEMORY_CACHE
            if (r13 != r8) goto L_0x0147
            N5.h r13 = r12.b()
            android.content.Context r13 = r13.l()
            r0.f146637c = r12
            r0.f146638d = r2
            r0.f146642h = r5
            java.lang.Object r13 = oK.C17713f.b(r2, r13, r0)
            if (r13 != r1) goto L_0x013c
            return r1
        L_0x013c:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L_0x0147
            qK.c$a$b r12 = qK.C17841c.a.b.f146633a
            return r12
        L_0x0147:
            r5 = r12
            r12 = r2
            goto L_0x014c
        L_0x014a:
            r5 = r12
            r12 = r7
        L_0x014c:
            if (r12 == 0) goto L_0x016e
            N5.h r13 = r5.b()
            android.content.Context r13 = r13.l()
            r0.f146637c = r12
            r0.f146638d = r7
            r0.f146639e = r7
            r0.f146642h = r4
            java.lang.Object r13 = oK.C17713f.a(r12, r13, r0)
            if (r13 != r1) goto L_0x0165
            return r1
        L_0x0165:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != r6) goto L_0x016e
            r3 = r6
        L_0x016e:
            if (r3 == 0) goto L_0x0175
            qK.c$a$a r7 = new qK.c$a$a
            r7.<init>(r12)
        L_0x0175:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qK.C17841c.j(N5.i, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(boolean r18, dI.C17164e<? super XH.C16807N> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof qK.C17841c.f
            if (r3 == 0) goto L_0x0019
            r3 = r2
            qK.c$f r3 = (qK.C17841c.f) r3
            int r4 = r3.f146652h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f146652h = r4
            goto L_0x001e
        L_0x0019:
            qK.c$f r3 = new qK.c$f
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f146650f
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r3.f146652h
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            if (r5 == 0) goto L_0x0059
            if (r5 == r9) goto L_0x004e
            if (r5 == r7) goto L_0x003f
            if (r5 != r6) goto L_0x0037
            XH.y.b(r2)
            goto L_0x0185
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003f:
            boolean r1 = r3.f146649e
            java.lang.Object r5 = r3.f146648d
            N5.i r5 = (N5.i) r5
            java.lang.Object r7 = r3.f146647c
            qK.c r7 = (qK.C17841c) r7
            XH.y.b(r2)
            goto L_0x0113
        L_0x004e:
            boolean r1 = r3.f146649e
            java.lang.Object r5 = r3.f146647c
            qK.c r5 = (qK.C17841c) r5
            XH.y.b(r2)
            goto L_0x00fc
        L_0x0059:
            XH.y.b(r2)
            B5.h r2 = r0.f146629c
            B5.h$a r2 = r2.e()
            r5 = 0
            B5.h$a r2 = r2.h(r5)
            B5.h r2 = r2.d()
            N5.h r5 = r0.f146628b
            N5.h$a r5 = N5.h.R(r5, r8, r9, r8)
            N5.h r10 = r0.f146628b
            N5.d r10 = r10.q()
            O5.j r10 = r10.m()
            if (r10 != 0) goto L_0x007f
            O5.j r10 = r0.f146630d
        L_0x007f:
            N5.h$a r5 = r5.m(r10)
            N5.h r10 = r0.f146628b
            N5.b r10 = r10.s()
            int[] r11 = qK.C17841c.b.f146634a
            int r10 = r10.ordinal()
            r10 = r11[r10]
            if (r10 == r9) goto L_0x00a7
            if (r10 == r7) goto L_0x00a4
            if (r10 == r6) goto L_0x00a1
            r11 = 4
            if (r10 != r11) goto L_0x009b
            goto L_0x00a1
        L_0x009b:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        L_0x00a1:
            N5.b r10 = N5.b.WRITE_ONLY
            goto L_0x00a9
        L_0x00a4:
            N5.b r10 = N5.b.ENABLED
            goto L_0x00a9
        L_0x00a7:
            N5.b r10 = N5.b.ENABLED
        L_0x00a9:
            N5.h$a r5 = r5.d(r10)
            if (r1 == 0) goto L_0x00b2
            N5.b r10 = N5.b.WRITE_ONLY
            goto L_0x00b8
        L_0x00b2:
            N5.h r10 = r0.f146628b
            N5.b r10 = r10.C()
        L_0x00b8:
            N5.h$a r5 = r5.f(r10)
            qK.c$e r10 = new qK.c$e
            r10.<init>(r0)
            N5.h$a r5 = r5.n(r10)
            N5.h r10 = r0.f146628b
            N5.d r10 = r10.q()
            O5.e r10 = r10.k()
            if (r10 != 0) goto L_0x00d3
            r10 = -1
            goto L_0x00db
        L_0x00d3:
            int[] r11 = qK.C17841c.b.f146635b
            int r10 = r10.ordinal()
            r10 = r11[r10]
        L_0x00db:
            if (r10 != r9) goto L_0x00e4
            N5.h r10 = r0.f146628b
            O5.e r10 = r10.H()
            goto L_0x00e6
        L_0x00e4:
            O5.e r10 = O5.e.INEXACT
        L_0x00e6:
            N5.h$a r5 = r5.g(r10)
            N5.h r5 = r5.a()
            r3.f146647c = r0
            r3.f146649e = r1
            r3.f146652h = r9
            java.lang.Object r2 = r2.c(r5, r3)
            if (r2 != r4) goto L_0x00fb
            return r4
        L_0x00fb:
            r5 = r0
        L_0x00fc:
            N5.i r2 = (N5.i) r2
            r3.f146647c = r5
            r3.f146648d = r2
            r3.f146649e = r1
            r3.f146652h = r7
            java.lang.Object r7 = r5.j(r2, r3)
            if (r7 != r4) goto L_0x010d
            return r4
        L_0x010d:
            r16 = r5
            r5 = r2
            r2 = r7
            r7 = r16
        L_0x0113:
            qK.c$a r2 = (qK.C17841c.a) r2
            if (r2 != 0) goto L_0x0119
            r1 = r8
            goto L_0x0123
        L_0x0119:
            boolean r10 = r2 instanceof qK.C17841c.a.C4265a
            if (r10 == 0) goto L_0x0172
            qK.c$a$a r2 = (qK.C17841c.a.C4265a) r2
            nK.j r1 = r2.a()
        L_0x0123:
            me.saket.telephoto.zoomable.o$d r9 = r7.g()
            long r11 = r7.f(r5)
            boolean r2 = r5 instanceof N5.q
            if (r2 == 0) goto L_0x0152
            if (r1 == 0) goto L_0x0152
            me.saket.telephoto.zoomable.o$e r2 = new me.saket.telephoto.zoomable.o$e
            N5.q r5 = (N5.q) r5
            android.graphics.drawable.Drawable r3 = r5.a()
            java.lang.String r4 = "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable"
            kotlin.jvm.internal.C17542s.h(r3, r4)
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            android.graphics.Bitmap r3 = r3.getBitmap()
            java.lang.String r4 = "getBitmap(...)"
            kotlin.jvm.internal.C17542s.i(r3, r4)
            nK.d r3 = nK.C17674e.a(r3)
            r2.<init>(r1, r3)
            r10 = r2
            goto L_0x0165
        L_0x0152:
            android.graphics.drawable.Drawable r1 = r5.a()
            if (r1 == 0) goto L_0x015c
            t1.c r8 = r7.e(r1)
        L_0x015c:
            t1.c r1 = me.saket.telephoto.zoomable.o.c.b(r8)
            me.saket.telephoto.zoomable.o$c r1 = me.saket.telephoto.zoomable.o.c.a(r1)
            r10 = r1
        L_0x0165:
            r14 = 4
            r15 = 0
            r13 = 0
            me.saket.telephoto.zoomable.o$d r1 = me.saket.telephoto.zoomable.p.b(r9, r10, r11, r13, r14, r15)
            r7.i(r1)
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x0172:
            boolean r2 = r2 instanceof qK.C17841c.a.b
            if (r2 == 0) goto L_0x0190
            if (r1 != 0) goto L_0x0188
            r3.f146647c = r8
            r3.f146648d = r8
            r3.f146652h = r6
            java.lang.Object r1 = r7.k(r9, r3)
            if (r1 != r4) goto L_0x0185
            return r4
        L_0x0185:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        L_0x0188:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Coil returned an image that is missing from both its memory and disk caches"
            r1.<init>(r2)
            throw r1
        L_0x0190:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qK.C17841c.k(boolean, dI.e):java.lang.Object");
    }

    public Object a(C17164e<? super C16807N> eVar) {
        Object k10 = k(false, eVar);
        return k10 == C17187b.f() ? k10 : C16807N.f139792a;
    }

    public final o.d g() {
        return (o.d) this.f146631e.getValue();
    }

    public final void i(o.d dVar) {
        C17542s.j(dVar, "<set-?>");
        this.f146631e.setValue(dVar);
    }
}
