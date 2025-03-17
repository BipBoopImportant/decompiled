package H5;

import B5.h;
import E5.e;
import E5.o;
import E5.r;
import F5.a;
import GK.C15774B;
import GK.C15776D;
import GK.C15777E;
import GK.C15785d;
import GK.C15786e;
import GK.C15805x;
import H5.i;
import HJ.C15854t;
import N5.m;
import S5.j;
import WK.C16777l;
import XH.C16824o;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.adjust.sdk.Constants;
import dI.C17164e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 12\u00020\u0001:\u00024-B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u0004\u0018\u00010\u0017*\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020#*\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020#*\u00020&H\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010*\u001a\u00020)*\u00020\u0015H\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,H@¢\u0006\u0004\b-\u0010.J#\u00101\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010/H\u0001¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u00106R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010:R\u0014\u0010>\u001a\u00020<8BX\u0004¢\u0006\u0006\u001a\u0004\b8\u0010=¨\u0006?"}, d2 = {"LH5/k;", "LH5/i;", "", "url", "LN5/m;", "options", "LXH/o;", "LGK/e$a;", "callFactory", "LF5/a;", "diskCache", "", "respectCacheHeaders", "<init>", "(Ljava/lang/String;LN5/m;LXH/o;LXH/o;Z)V", "LF5/a$c;", "i", "()LF5/a$c;", "snapshot", "LGK/B;", "request", "LGK/D;", "response", "LM5/c;", "cacheResponse", "n", "(LF5/a$c;LGK/B;LGK/D;LM5/c;)LF5/a$c;", "h", "()LGK/B;", "c", "(LGK/B;LdI/e;)Ljava/lang/Object;", "g", "(LGK/B;LGK/D;)Z", "j", "(LF5/a$c;)LM5/c;", "LE5/o;", "l", "(LF5/a$c;)LE5/o;", "LGK/E;", "m", "(LGK/E;)LE5/o;", "LE5/e;", "k", "(LGK/D;)LE5/e;", "LH5/h;", "a", "(LdI/e;)Ljava/lang/Object;", "LGK/x;", "contentType", "f", "(Ljava/lang/String;LGK/x;)Ljava/lang/String;", "Ljava/lang/String;", "b", "LN5/m;", "LXH/o;", "d", "e", "Z", "()Ljava/lang/String;", "diskCacheKey", "LWK/l;", "()LWK/l;", "fileSystem", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements i {

    /* renamed from: f  reason: collision with root package name */
    public static final a f36417f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    private static final C15785d f36418g = new C15785d.a().e().f().a();

    /* renamed from: h  reason: collision with root package name */
    private static final C15785d f36419h = new C15785d.a().e().g().a();

    /* renamed from: a  reason: collision with root package name */
    private final String f36420a;

    /* renamed from: b  reason: collision with root package name */
    private final m f36421b;

    /* renamed from: c  reason: collision with root package name */
    private final C16824o<C15786e.a> f36422c;

    /* renamed from: d  reason: collision with root package name */
    private final C16824o<F5.a> f36423d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f36424e;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LH5/k$a;", "", "<init>", "()V", "", "MIME_TYPE_TEXT_PLAIN", "Ljava/lang/String;", "LGK/d;", "CACHE_CONTROL_FORCE_NETWORK_NO_CACHE", "LGK/d;", "CACHE_CONTROL_NO_NETWORK_NO_CACHE", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u0019"}, d2 = {"LH5/k$b;", "LH5/i$a;", "Landroid/net/Uri;", "LXH/o;", "LGK/e$a;", "callFactory", "LF5/a;", "diskCache", "", "respectCacheHeaders", "<init>", "(LXH/o;LXH/o;Z)V", "data", "c", "(Landroid/net/Uri;)Z", "LN5/m;", "options", "LB5/h;", "imageLoader", "LH5/i;", "b", "(Landroid/net/Uri;LN5/m;LB5/h;)LH5/i;", "a", "LXH/o;", "Z", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements i.a<Uri> {

        /* renamed from: a  reason: collision with root package name */
        private final C16824o<C15786e.a> f36425a;

        /* renamed from: b  reason: collision with root package name */
        private final C16824o<F5.a> f36426b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f36427c;

        public b(C16824o<? extends C15786e.a> oVar, C16824o<? extends F5.a> oVar2, boolean z10) {
            this.f36425a = oVar;
            this.f36426b = oVar2;
            this.f36427c = z10;
        }

        private final boolean c(Uri uri) {
            return C17542s.e(uri.getScheme(), "http") || C17542s.e(uri.getScheme(), Constants.SCHEME);
        }

        /* renamed from: b */
        public i a(Uri uri, m mVar, h hVar) {
            if (!c(uri)) {
                return null;
            }
            return new k(uri.toString(), mVar, this.f36425a, this.f36426b, this.f36427c);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @f(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {224}, m = "executeNetworkRequest")
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f36428c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f36429d;

        /* renamed from: e  reason: collision with root package name */
        int f36430e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(k kVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f36429d = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f36428c = obj;
            this.f36430e |= Integer.MIN_VALUE;
            return this.f36429d.c((C15774B) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @f(c = "coil.fetch.HttpUriFetcher", f = "HttpUriFetcher.kt", l = {77, 106}, m = "fetch")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f36431c;

        /* renamed from: d  reason: collision with root package name */
        Object f36432d;

        /* renamed from: e  reason: collision with root package name */
        Object f36433e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f36434f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ k f36435g;

        /* renamed from: h  reason: collision with root package name */
        int f36436h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(k kVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f36435g = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f36434f = obj;
            this.f36436h |= Integer.MIN_VALUE;
            return this.f36435g.a(this);
        }
    }

    public k(String str, m mVar, C16824o<? extends C15786e.a> oVar, C16824o<? extends F5.a> oVar2, boolean z10) {
        this.f36420a = str;
        this.f36421b = mVar;
        this.f36422c = oVar;
        this.f36423d = oVar2;
        this.f36424e = z10;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(GK.C15774B r5, dI.C17164e<? super GK.C15776D> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof H5.k.c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            H5.k$c r0 = (H5.k.c) r0
            int r1 = r0.f36430e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f36430e = r1
            goto L_0x0018
        L_0x0013:
            H5.k$c r0 = new H5.k$c
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f36428c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f36430e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            XH.y.b(r6)
            goto L_0x0072
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            XH.y.b(r6)
            boolean r6 = S5.j.t()
            if (r6 == 0) goto L_0x005d
            N5.m r6 = r4.f36421b
            N5.b r6 = r6.k()
            boolean r6 = r6.b()
            if (r6 != 0) goto L_0x0057
            XH.o<GK.e$a> r6 = r4.f36422c
            java.lang.Object r6 = r6.getValue()
            GK.e$a r6 = (GK.C15786e.a) r6
            GK.e r5 = r6.b(r5)
            GK.D r5 = com.google.firebase.perf.network.FirebasePerfOkHttpClient.execute(r5)
            goto L_0x0075
        L_0x0057:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L_0x005d:
            XH.o<GK.e$a> r6 = r4.f36422c
            java.lang.Object r6 = r6.getValue()
            GK.e$a r6 = (GK.C15786e.a) r6
            GK.e r5 = r6.b(r5)
            r0.f36430e = r3
            java.lang.Object r6 = S5.b.a(r5, r0)
            if (r6 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r5 = r6
            GK.D r5 = (GK.C15776D) r5
        L_0x0075:
            boolean r6 = r5.e1()
            if (r6 != 0) goto L_0x0092
            int r6 = r5.g()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto L_0x0092
            GK.E r6 = r5.c()
            if (r6 == 0) goto L_0x008c
            S5.j.d(r6)
        L_0x008c:
            M5.f r6 = new M5.f
            r6.<init>(r5)
            throw r6
        L_0x0092:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.k.c(GK.B, dI.e):java.lang.Object");
    }

    private final String d() {
        String h10 = this.f36421b.h();
        return h10 == null ? this.f36420a : h10;
    }

    private final C16777l e() {
        F5.a value = this.f36423d.getValue();
        C17542s.g(value);
        return value.r();
    }

    private final boolean g(C15774B b10, C15776D d10) {
        return this.f36421b.i().j() && (!this.f36424e || M5.d.f38507c.b(b10, d10));
    }

    private final C15774B h() {
        C15774B.a f10 = new C15774B.a().n(this.f36420a).f(this.f36421b.j());
        for (Map.Entry next : this.f36421b.o().a().entrySet()) {
            Object key = next.getKey();
            C17542s.h(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            f10.k((Class) key, next.getValue());
        }
        boolean b10 = this.f36421b.i().b();
        boolean b11 = this.f36421b.k().b();
        if (!b11 && b10) {
            f10.c(C15785d.f134887p);
        } else if (!b11 || b10) {
            if (!b11 && !b10) {
                f10.c(f36419h);
            }
        } else if (this.f36421b.i().j()) {
            f10.c(C15785d.f134886o);
        } else {
            f10.c(f36418g);
        }
        return f10.b();
    }

    private final a.c i() {
        F5.a value;
        if (!this.f36421b.i().b() || (value = this.f36423d.getValue()) == null) {
            return null;
        }
        return value.t(d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f A[Catch:{ IOException -> 0x0031 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[Catch:{ IOException -> 0x0031 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final M5.c j(F5.a.c r3) {
        /*
            r2 = this;
            r0 = 0
            WK.l r1 = r2.e()     // Catch:{ IOException -> 0x0031 }
            WK.E r3 = r3.j()     // Catch:{ IOException -> 0x0031 }
            WK.N r3 = r1.B(r3)     // Catch:{ IOException -> 0x0031 }
            WK.g r3 = WK.y.d(r3)     // Catch:{ IOException -> 0x0031 }
            M5.c r1 = new M5.c     // Catch:{ all -> 0x0020 }
            r1.<init>((WK.C16772g) r3)     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x001e
            r3.close()     // Catch:{ all -> 0x001c }
            goto L_0x001e
        L_0x001c:
            r3 = move-exception
            goto L_0x002d
        L_0x001e:
            r3 = r0
            goto L_0x002d
        L_0x0020:
            r1 = move-exception
            if (r3 == 0) goto L_0x002b
            r3.close()     // Catch:{ all -> 0x0027 }
            goto L_0x002b
        L_0x0027:
            r3 = move-exception
            XH.C16816g.a(r1, r3)     // Catch:{ IOException -> 0x0031 }
        L_0x002b:
            r3 = r1
            r1 = r0
        L_0x002d:
            if (r3 != 0) goto L_0x0030
            return r1
        L_0x0030:
            throw r3     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.k.j(F5.a$c):M5.c");
    }

    private final e k(C15776D d10) {
        return d10.t() != null ? e.NETWORK : e.DISK;
    }

    private final o l(a.c cVar) {
        return r.g(cVar.getData(), e(), d(), cVar);
    }

    private final o m(C15777E e10) {
        return r.e(e10.k3(), this.f36421b.g());
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00bc A[Catch:{ Exception -> 0x0082, all -> 0x007f }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f9 A[Catch:{ Exception -> 0x0082, all -> 0x007f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final F5.a.c n(F5.a.c r5, GK.C15774B r6, GK.C15776D r7, M5.c r8) {
        /*
            r4 = this;
            boolean r6 = r4.g(r6, r7)
            r0 = 0
            if (r6 != 0) goto L_0x000d
            if (r5 == 0) goto L_0x000c
            S5.j.d(r5)
        L_0x000c:
            return r0
        L_0x000d:
            if (r5 == 0) goto L_0x0014
            F5.a$b r5 = r5.I()
            goto L_0x0028
        L_0x0014:
            XH.o<F5.a> r5 = r4.f36423d
            java.lang.Object r5 = r5.getValue()
            F5.a r5 = (F5.a) r5
            if (r5 == 0) goto L_0x0027
            java.lang.String r6 = r4.d()
            F5.a$b r5 = r5.s(r6)
            goto L_0x0028
        L_0x0027:
            r5 = r0
        L_0x0028:
            if (r5 != 0) goto L_0x002b
            return r0
        L_0x002b:
            int r6 = r7.g()     // Catch:{ Exception -> 0x0082 }
            r1 = 304(0x130, float:4.26E-43)
            r2 = 0
            if (r6 != r1) goto L_0x008a
            if (r8 == 0) goto L_0x008a
            GK.D$a r6 = r7.u()     // Catch:{ Exception -> 0x0082 }
            M5.d$a r1 = M5.d.f38507c     // Catch:{ Exception -> 0x0082 }
            GK.u r8 = r8.h()     // Catch:{ Exception -> 0x0082 }
            GK.u r3 = r7.q()     // Catch:{ Exception -> 0x0082 }
            GK.u r8 = r1.a(r8, r3)     // Catch:{ Exception -> 0x0082 }
            GK.D$a r6 = r6.k(r8)     // Catch:{ Exception -> 0x0082 }
            GK.D r6 = r6.c()     // Catch:{ Exception -> 0x0082 }
            WK.l r8 = r4.e()     // Catch:{ Exception -> 0x0082 }
            WK.E r1 = r5.j()     // Catch:{ Exception -> 0x0082 }
            WK.L r8 = r8.z(r1, r2)     // Catch:{ Exception -> 0x0082 }
            WK.f r8 = WK.y.c(r8)     // Catch:{ Exception -> 0x0082 }
            M5.c r1 = new M5.c     // Catch:{ all -> 0x0072 }
            r1.<init>((GK.C15776D) r6)     // Catch:{ all -> 0x0072 }
            r1.k(r8)     // Catch:{ all -> 0x0072 }
            XH.N r6 = XH.C16807N.f139792a     // Catch:{ all -> 0x0072 }
            if (r8 == 0) goto L_0x0085
            r8.close()     // Catch:{ all -> 0x0070 }
            goto L_0x0085
        L_0x0070:
            r0 = move-exception
            goto L_0x0085
        L_0x0072:
            r6 = move-exception
            r0 = r6
            if (r8 == 0) goto L_0x0085
            r8.close()     // Catch:{ all -> 0x007a }
            goto L_0x0085
        L_0x007a:
            r6 = move-exception
            XH.C16816g.a(r0, r6)     // Catch:{ Exception -> 0x0082 }
            goto L_0x0085
        L_0x007f:
            r5 = move-exception
            goto L_0x00fe
        L_0x0082:
            r6 = move-exception
            goto L_0x00fa
        L_0x0085:
            if (r0 != 0) goto L_0x0089
            goto L_0x00f0
        L_0x0089:
            throw r0     // Catch:{ Exception -> 0x0082 }
        L_0x008a:
            WK.l r6 = r4.e()     // Catch:{ Exception -> 0x0082 }
            WK.E r8 = r5.j()     // Catch:{ Exception -> 0x0082 }
            WK.L r6 = r6.z(r8, r2)     // Catch:{ Exception -> 0x0082 }
            WK.f r6 = WK.y.c(r6)     // Catch:{ Exception -> 0x0082 }
            M5.c r8 = new M5.c     // Catch:{ all -> 0x00ae }
            r8.<init>((GK.C15776D) r7)     // Catch:{ all -> 0x00ae }
            r8.k(r6)     // Catch:{ all -> 0x00ae }
            XH.N r8 = XH.C16807N.f139792a     // Catch:{ all -> 0x00ae }
            if (r6 == 0) goto L_0x00ac
            r6.close()     // Catch:{ all -> 0x00aa }
            goto L_0x00ac
        L_0x00aa:
            r6 = move-exception
            goto L_0x00ba
        L_0x00ac:
            r6 = r0
            goto L_0x00ba
        L_0x00ae:
            r8 = move-exception
            if (r6 == 0) goto L_0x00b9
            r6.close()     // Catch:{ all -> 0x00b5 }
            goto L_0x00b9
        L_0x00b5:
            r6 = move-exception
            XH.C16816g.a(r8, r6)     // Catch:{ Exception -> 0x0082 }
        L_0x00b9:
            r6 = r8
        L_0x00ba:
            if (r6 != 0) goto L_0x00f9
            WK.l r6 = r4.e()     // Catch:{ Exception -> 0x0082 }
            WK.E r8 = r5.getData()     // Catch:{ Exception -> 0x0082 }
            WK.L r6 = r6.z(r8, r2)     // Catch:{ Exception -> 0x0082 }
            WK.f r6 = WK.y.c(r6)     // Catch:{ Exception -> 0x0082 }
            GK.E r8 = r7.c()     // Catch:{ all -> 0x00e2 }
            kotlin.jvm.internal.C17542s.g(r8)     // Catch:{ all -> 0x00e2 }
            WK.g r8 = r8.k3()     // Catch:{ all -> 0x00e2 }
            r8.L2(r6)     // Catch:{ all -> 0x00e2 }
            if (r6 == 0) goto L_0x00ee
            r6.close()     // Catch:{ all -> 0x00e0 }
            goto L_0x00ee
        L_0x00e0:
            r0 = move-exception
            goto L_0x00ee
        L_0x00e2:
            r8 = move-exception
            r0 = r8
            if (r6 == 0) goto L_0x00ee
            r6.close()     // Catch:{ all -> 0x00ea }
            goto L_0x00ee
        L_0x00ea:
            r6 = move-exception
            XH.C16816g.a(r0, r6)     // Catch:{ Exception -> 0x0082 }
        L_0x00ee:
            if (r0 != 0) goto L_0x00f8
        L_0x00f0:
            F5.a$c r5 = r5.l()     // Catch:{ Exception -> 0x0082 }
            S5.j.d(r7)
            return r5
        L_0x00f8:
            throw r0     // Catch:{ Exception -> 0x0082 }
        L_0x00f9:
            throw r6     // Catch:{ Exception -> 0x0082 }
        L_0x00fa:
            S5.j.a(r5)     // Catch:{ all -> 0x007f }
            throw r6     // Catch:{ all -> 0x007f }
        L_0x00fe:
            S5.j.d(r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.k.n(F5.a$c, GK.B, GK.D, M5.c):F5.a$c");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012c A[Catch:{ Exception -> 0x013f }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014d A[Catch:{ Exception -> 0x013f }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super H5.h> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof H5.k.d
            if (r0 == 0) goto L_0x0013
            r0 = r12
            H5.k$d r0 = (H5.k.d) r0
            int r1 = r0.f36436h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f36436h = r1
            goto L_0x0018
        L_0x0013:
            H5.k$d r0 = new H5.k$d
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f36434f
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f36436h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x005c
            if (r2 == r4) goto L_0x0045
            if (r2 != r3) goto L_0x003d
            java.lang.Object r1 = r0.f36433e
            GK.D r1 = (GK.C15776D) r1
            java.lang.Object r2 = r0.f36432d
            F5.a$c r2 = (F5.a.c) r2
            java.lang.Object r0 = r0.f36431c
            H5.k r0 = (H5.k) r0
            XH.y.b(r12)     // Catch:{ Exception -> 0x003a }
            goto L_0x018a
        L_0x003a:
            r12 = move-exception
            goto L_0x01a8
        L_0x003d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x0045:
            java.lang.Object r2 = r0.f36433e
            M5.d r2 = (M5.d) r2
            java.lang.Object r4 = r0.f36432d
            F5.a$c r4 = (F5.a.c) r4
            java.lang.Object r6 = r0.f36431c
            H5.k r6 = (H5.k) r6
            XH.y.b(r12)     // Catch:{ Exception -> 0x0059 }
            r10 = r4
            r4 = r2
            r2 = r10
            goto L_0x0118
        L_0x0059:
            r12 = move-exception
            goto L_0x01ae
        L_0x005c:
            XH.y.b(r12)
            F5.a$c r12 = r11.i()
            if (r12 == 0) goto L_0x00f0
            WK.l r2 = r11.e()     // Catch:{ Exception -> 0x0094 }
            WK.E r6 = r12.j()     // Catch:{ Exception -> 0x0094 }
            WK.k r2 = r2.s(r6)     // Catch:{ Exception -> 0x0094 }
            java.lang.Long r2 = r2.d()     // Catch:{ Exception -> 0x0094 }
            if (r2 != 0) goto L_0x0078
            goto L_0x0099
        L_0x0078:
            long r6 = r2.longValue()     // Catch:{ Exception -> 0x0094 }
            r8 = 0
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0099
            H5.m r0 = new H5.m     // Catch:{ Exception -> 0x0094 }
            E5.o r1 = r11.l(r12)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r2 = r11.f36420a     // Catch:{ Exception -> 0x0094 }
            java.lang.String r2 = r11.f(r2, r5)     // Catch:{ Exception -> 0x0094 }
            E5.e r3 = E5.e.DISK     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x0094 }
            return r0
        L_0x0094:
            r0 = move-exception
            r4 = r12
            r12 = r0
            goto L_0x01ae
        L_0x0099:
            boolean r2 = r11.f36424e     // Catch:{ Exception -> 0x0094 }
            if (r2 == 0) goto L_0x00d4
            M5.d$b r2 = new M5.d$b     // Catch:{ Exception -> 0x0094 }
            GK.B r6 = r11.h()     // Catch:{ Exception -> 0x0094 }
            M5.c r7 = r11.j(r12)     // Catch:{ Exception -> 0x0094 }
            r2.<init>(r6, r7)     // Catch:{ Exception -> 0x0094 }
            M5.d r2 = r2.b()     // Catch:{ Exception -> 0x0094 }
            GK.B r6 = r2.b()     // Catch:{ Exception -> 0x0094 }
            if (r6 != 0) goto L_0x00fd
            M5.c r6 = r2.a()     // Catch:{ Exception -> 0x0094 }
            if (r6 == 0) goto L_0x00fd
            H5.m r0 = new H5.m     // Catch:{ Exception -> 0x0094 }
            E5.o r1 = r11.l(r12)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r3 = r11.f36420a     // Catch:{ Exception -> 0x0094 }
            M5.c r2 = r2.a()     // Catch:{ Exception -> 0x0094 }
            GK.x r2 = r2.f()     // Catch:{ Exception -> 0x0094 }
            java.lang.String r2 = r11.f(r3, r2)     // Catch:{ Exception -> 0x0094 }
            E5.e r3 = E5.e.DISK     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x0094 }
            return r0
        L_0x00d4:
            H5.m r0 = new H5.m     // Catch:{ Exception -> 0x0094 }
            E5.o r1 = r11.l(r12)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r2 = r11.f36420a     // Catch:{ Exception -> 0x0094 }
            M5.c r3 = r11.j(r12)     // Catch:{ Exception -> 0x0094 }
            if (r3 == 0) goto L_0x00e6
            GK.x r5 = r3.f()     // Catch:{ Exception -> 0x0094 }
        L_0x00e6:
            java.lang.String r2 = r11.f(r2, r5)     // Catch:{ Exception -> 0x0094 }
            E5.e r3 = E5.e.DISK     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x0094 }
            return r0
        L_0x00f0:
            M5.d$b r2 = new M5.d$b     // Catch:{ Exception -> 0x0094 }
            GK.B r6 = r11.h()     // Catch:{ Exception -> 0x0094 }
            r2.<init>(r6, r5)     // Catch:{ Exception -> 0x0094 }
            M5.d r2 = r2.b()     // Catch:{ Exception -> 0x0094 }
        L_0x00fd:
            GK.B r6 = r2.b()     // Catch:{ Exception -> 0x0094 }
            kotlin.jvm.internal.C17542s.g(r6)     // Catch:{ Exception -> 0x0094 }
            r0.f36431c = r11     // Catch:{ Exception -> 0x0094 }
            r0.f36432d = r12     // Catch:{ Exception -> 0x0094 }
            r0.f36433e = r2     // Catch:{ Exception -> 0x0094 }
            r0.f36436h = r4     // Catch:{ Exception -> 0x0094 }
            java.lang.Object r4 = r11.c(r6, r0)     // Catch:{ Exception -> 0x0094 }
            if (r4 != r1) goto L_0x0113
            return r1
        L_0x0113:
            r6 = r11
            r10 = r2
            r2 = r12
            r12 = r4
            r4 = r10
        L_0x0118:
            GK.D r12 = (GK.C15776D) r12     // Catch:{ Exception -> 0x01ac }
            GK.E r7 = S5.j.A(r12)     // Catch:{ Exception -> 0x01ac }
            GK.B r8 = r4.b()     // Catch:{ Exception -> 0x013f }
            M5.c r4 = r4.a()     // Catch:{ Exception -> 0x013f }
            F5.a$c r2 = r6.n(r2, r8, r12, r4)     // Catch:{ Exception -> 0x013f }
            if (r2 == 0) goto L_0x014d
            H5.m r0 = new H5.m     // Catch:{ Exception -> 0x013f }
            E5.o r1 = r6.l(r2)     // Catch:{ Exception -> 0x013f }
            java.lang.String r3 = r6.f36420a     // Catch:{ Exception -> 0x013f }
            M5.c r4 = r6.j(r2)     // Catch:{ Exception -> 0x013f }
            if (r4 == 0) goto L_0x0143
            GK.x r5 = r4.f()     // Catch:{ Exception -> 0x013f }
            goto L_0x0143
        L_0x013f:
            r0 = move-exception
            r1 = r12
            r12 = r0
            goto L_0x01a8
        L_0x0143:
            java.lang.String r3 = r6.f(r3, r5)     // Catch:{ Exception -> 0x013f }
            E5.e r4 = E5.e.NETWORK     // Catch:{ Exception -> 0x013f }
            r0.<init>(r1, r3, r4)     // Catch:{ Exception -> 0x013f }
            return r0
        L_0x014d:
            WK.g r4 = r7.k3()     // Catch:{ Exception -> 0x013f }
            r8 = 1
            boolean r4 = r4.V0(r8)     // Catch:{ Exception -> 0x013f }
            if (r4 == 0) goto L_0x0171
            H5.m r0 = new H5.m     // Catch:{ Exception -> 0x013f }
            E5.o r1 = r6.m(r7)     // Catch:{ Exception -> 0x013f }
            java.lang.String r3 = r6.f36420a     // Catch:{ Exception -> 0x013f }
            GK.x r4 = r7.h()     // Catch:{ Exception -> 0x013f }
            java.lang.String r3 = r6.f(r3, r4)     // Catch:{ Exception -> 0x013f }
            E5.e r4 = r6.k(r12)     // Catch:{ Exception -> 0x013f }
            r0.<init>(r1, r3, r4)     // Catch:{ Exception -> 0x013f }
            return r0
        L_0x0171:
            S5.j.d(r12)     // Catch:{ Exception -> 0x013f }
            GK.B r4 = r6.h()     // Catch:{ Exception -> 0x013f }
            r0.f36431c = r6     // Catch:{ Exception -> 0x013f }
            r0.f36432d = r2     // Catch:{ Exception -> 0x013f }
            r0.f36433e = r12     // Catch:{ Exception -> 0x013f }
            r0.f36436h = r3     // Catch:{ Exception -> 0x013f }
            java.lang.Object r0 = r6.c(r4, r0)     // Catch:{ Exception -> 0x013f }
            if (r0 != r1) goto L_0x0187
            return r1
        L_0x0187:
            r1 = r12
            r12 = r0
            r0 = r6
        L_0x018a:
            GK.D r12 = (GK.C15776D) r12     // Catch:{ Exception -> 0x003a }
            GK.E r1 = S5.j.A(r12)     // Catch:{ Exception -> 0x013f }
            H5.m r3 = new H5.m     // Catch:{ Exception -> 0x013f }
            E5.o r4 = r0.m(r1)     // Catch:{ Exception -> 0x013f }
            java.lang.String r5 = r0.f36420a     // Catch:{ Exception -> 0x013f }
            GK.x r1 = r1.h()     // Catch:{ Exception -> 0x013f }
            java.lang.String r1 = r0.f(r5, r1)     // Catch:{ Exception -> 0x013f }
            E5.e r0 = r0.k(r12)     // Catch:{ Exception -> 0x013f }
            r3.<init>(r4, r1, r0)     // Catch:{ Exception -> 0x013f }
            return r3
        L_0x01a8:
            S5.j.d(r1)     // Catch:{ Exception -> 0x01ac }
            throw r12     // Catch:{ Exception -> 0x01ac }
        L_0x01ac:
            r12 = move-exception
            r4 = r2
        L_0x01ae:
            if (r4 == 0) goto L_0x01b3
            S5.j.d(r4)
        L_0x01b3:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.k.a(dI.e):java.lang.Object");
    }

    public final String f(String str, C15805x xVar) {
        String k10;
        String xVar2 = xVar != null ? xVar.toString() : null;
        if ((xVar2 == null || C15854t.W(xVar2, "text/plain", false, 2, (Object) null)) && (k10 = j.k(MimeTypeMap.getSingleton(), str)) != null) {
            return k10;
        }
        if (xVar2 != null) {
            return C15854t.s1(xVar2, ';', (String) null, 2, (Object) null);
        }
        return null;
    }
}
