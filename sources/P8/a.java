package P8;

import E8.c;
import a9.C6799c1;
import a9.C6815e1;
import a9.D6;
import a9.V;
import a9.W5;
import com.contentsquare.android.sdk.C7117c;
import com.contentsquare.android.sdk.C7131j;
import com.contentsquare.android.sdk.C7133k;
import com.contentsquare.android.sdk.G;
import com.contentsquare.android.sdk.Z0;
import com.contentsquare.android.sdk.t1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u8.C8886a;
import v8.b;
import x8.C8958b;
import y8.C8992a;
import y8.C8993b;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u000eJM\u0010%\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020#\u0018\u00010\"H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J)\u00102\u001a\u00020\f\"\b\b\u0000\u0010/*\u00020#2\u0006\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00028\u0000H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0005H\u0016¢\u0006\u0004\b5\u0010\tJ\u000f\u00106\u001a\u00020\u0007H\u0016¢\u0006\u0004\b6\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020'088\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010B\u001a\u0004\u0018\u00010\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0016\u0010E\u001a\u0004\u0018\u00010C8VX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010DR\u0016\u0010H\u001a\u0004\u0018\u00010<8VX\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0016\u0010K\u001a\u0004\u0018\u00010I8VX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010J¨\u0006L"}, d2 = {"LP8/a;", "Lx8/b;", "LE8/c$b;", "<init>", "()V", "", "flag", "", "q", "(Ljava/lang/String;)Z", "Ly8/a;", "crash", "LXH/N;", "h", "(Ly8/a;)V", "Ly8/b;", "networkEvent", "j", "(Ly8/b;)V", "m", "", "g", "()Ljava/util/List;", "", "crashData", "p", "([B)V", "l", "Lx8/b$c;", "logLevel", "description", "errorType", "errorMessage", "stacktrace", "", "", "additional", "f", "(Lx8/b$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lx8/b$a;", "listener", "k", "(Lx8/b$a;)V", "LE8/b;", "key", "o", "(LE8/b;)V", "T", "name", "value", "e", "(Ljava/lang/String;Ljava/lang/Object;)V", "featureFlag", "c", "n", "()Z", "", "a", "Ljava/util/List;", "configurationListeners", "Lv8/b;", "b", "Lv8/b;", "lazyScreenViewTracker", "i", "()Ljava/lang/String;", "userId", "", "()Ljava/lang/Integer;", "sessionId", "d", "()Lv8/b;", "screenViewTracker", "LA8/b;", "()LA8/b;", "configuration", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements C8958b, c.b {

    /* renamed from: a  reason: collision with root package name */
    private final List<C8958b.a> f39438a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private b f39439b;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: P8.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0624a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39440a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                x8.b$c[] r0 = x8.C8958b.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                x8.b$c r1 = x8.C8958b.c.WARN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                x8.b$c r1 = x8.C8958b.c.ERROR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                x8.b$c r1 = x8.C8958b.c.CRITICAL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f39440a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: P8.a.C0624a.<clinit>():void");
        }
    }

    public a() {
        c f10;
        C8886a a10 = C8886a.f56874d.a();
        if (a10 != null && (f10 = a10.f()) != null) {
            f10.n(this);
        }
    }

    private final boolean q(String str) {
        return D6.a(C8886a.f56874d.a(), str);
    }

    public A8.b a() {
        C8886a a10 = C8886a.f56874d.a();
        if (a10 != null) {
            return a10.c();
        }
        return null;
    }

    public Integer b() {
        C7117c m10;
        X8.b i10 = X8.b.i();
        if (i10 == null || (m10 = i10.m()) == null) {
            return null;
        }
        return Integer.valueOf(m10.f47324k);
    }

    public boolean c(String str) {
        t1 l10;
        C17542s.j(str, "featureFlag");
        X8.b i10 = X8.b.i();
        if (i10 == null || (l10 = i10.l()) == null || !l10.f47638f) {
            return false;
        }
        return q(str);
    }

    public b d() {
        C8886a a10 = C8886a.f56874d.a();
        c f10 = a10 != null ? a10.f() : null;
        if (this.f39439b == null && f10 != null) {
            this.f39439b = new b(f10);
        }
        return this.f39439b;
    }

    public <T> void e(String str, T t10) {
        C17542s.j(str, "name");
        C17542s.j(t10, "value");
        U8.a.f40370a.d(str, t10);
    }

    public void f(C8958b.c cVar, String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        C17542s.j(cVar, "logLevel");
        C17542s.j(str, "description");
        C17542s.j(str2, "errorType");
        C17542s.j(str3, "errorMessage");
        C17542s.j(str4, "stacktrace");
        int i10 = C0624a.f39440a[cVar.ordinal()];
        if (i10 == 1) {
            S8.a.f39924a.e(str, map);
        } else if (i10 == 2) {
            S8.a.f39924a.c(str, str2, str3, str4, map);
        } else if (i10 == 3) {
            S8.a.f39924a.a(str, str4, map);
        }
    }

    public List<String> g() {
        return Q8.a.f39639a.b();
    }

    public void h(C8992a aVar) {
        C17542s.j(aVar, "crash");
        C7131j jVar = C7131j.f47442k;
        if (jVar != null) {
            long b10 = aVar.b();
            long o10 = aVar.a().o();
            long p10 = aVar.a().p();
            String o11 = aVar.a().n().o();
            C17542s.i(o11, "crash.data.context.errorSource");
            V v10 = new V(b10, o10, p10, o11);
            C17542s.j(v10, "event");
            jVar.f47456j.addCrashAndSaveToDisk(v10);
        }
    }

    public String i() {
        C6815e1 r10;
        X8.b i10 = X8.b.i();
        if (i10 == null || (r10 = i10.r()) == null) {
            return null;
        }
        return r10.a();
    }

    public void j(C8993b bVar) {
        C17542s.j(bVar, "networkEvent");
        C7131j jVar = C7131j.f47442k;
        if (jVar != null) {
            W5 w52 = new W5(bVar);
            C17542s.j(w52, "event");
            jVar.f47447a.a(w52);
        }
    }

    public void k(C8958b.a aVar) {
        C17542s.j(aVar, "listener");
        this.f39438a.add(aVar);
    }

    public void l(C8992a aVar) {
        C17542s.j(aVar, "crash");
        Q8.a.f39639a.e(aVar.a());
    }

    public void m(C8993b bVar) {
        C6799c1 f10;
        C17542s.j(bVar, "networkEvent");
        X8.c c10 = X8.c.c();
        if (c10 != null && (f10 = c10.f()) != null) {
            G g10 = f10.f42476a;
            g10.getClass();
            C17542s.j(bVar, "event");
            C7133k d10 = g10.f46981k.d();
            C17542s.i(d10, "csApplicationModule.eventsBuildersFactory");
            Z0.a aVar = (Z0.a) C7133k.b(d10, 21);
            aVar.f47267l = bVar.h();
            aVar.f47266k = bVar.E();
            aVar.f47270o = bVar.C();
            aVar.f47268m = bVar.t();
            aVar.f47269n = bVar.y();
            aVar.f47271p = bVar.z();
            aVar.f47272q = bVar.j();
            aVar.f47273r = bVar.n();
            g10.f46973c.a(aVar);
        }
    }

    public boolean n() {
        c f10;
        C8886a a10 = C8886a.f56874d.a();
        if (a10 == null || (f10 = a10.f()) == null) {
            return false;
        }
        return f10.b(E8.b.LOCAL_LOG_VISUALIZER_MODE, false);
    }

    public void o(E8.b bVar) {
        C17542s.j(bVar, "key");
        for (C8958b.a aVar : this.f39438a) {
            if (bVar == E8.b.RAW_CONFIGURATION_AS_JSON || bVar == E8.b.TRACKING_ENABLE) {
                aVar.a(bVar);
            }
        }
    }

    public void p(byte[] bArr) {
        C17542s.j(bArr, "crashData");
        Q8.a.f39639a.d(bArr);
    }
}
