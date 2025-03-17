package tH;

import AH.C15413d;
import EH.C15627l;
import EH.C15637v;
import GK.C15773A;
import GK.C15774B;
import GK.C15776D;
import GK.C15786e;
import GK.C15802u;
import GK.z;
import HJ.C15854t;
import QJ.C16324p;
import XH.C16807N;
import XH.t;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import dI.C17164e;
import eI.C17187b;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;
import vH.C18185x;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"LGK/z;", "LGK/B;", "request", "LAH/d;", "requestData", "LGK/D;", "b", "(LGK/z;LGK/B;LAH/d;LdI/e;)Ljava/lang/Object;", "LGK/u;", "LEH/l;", "c", "(LGK/u;)LEH/l;", "LGK/A;", "LEH/v;", "d", "(LGK/A;)LEH/v;", "Ljava/io/IOException;", "origin", "", "f", "(LAH/d;Ljava/io/IOException;)Ljava/lang/Throwable;", "", "e", "(Ljava/io/IOException;)Z", "ktor-client-okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f147306a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                GK.A[] r0 = GK.C15773A.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                GK.A r1 = GK.C15773A.HTTP_1_0     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                GK.A r1 = GK.C15773A.HTTP_1_1     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                GK.A r1 = GK.C15773A.SPDY_3     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                GK.A r1 = GK.C15773A.HTTP_2     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                GK.A r1 = GK.C15773A.H2_PRIOR_KNOWLEDGE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                GK.A r1 = GK.C15773A.QUIC     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f147306a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tH.h.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Throwable, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C15786e f147307c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C15786e eVar) {
            super(1);
            this.f147307c = eVar;
        }

        public final void a(Throwable th2) {
            this.f147307c.cancel();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\n0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u001a\u0010\u0010\u001a\u00020\f8\u0016XD¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"tH/h$c", "LEH/l;", "", "name", "", "c", "(Ljava/lang/String;)Ljava/util/List;", "", "names", "()Ljava/util/Set;", "", "a", "", "Z", "b", "()Z", "caseInsensitiveName", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements C15627l {

        /* renamed from: c  reason: collision with root package name */
        private final boolean f147308c = true;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15802u f147309d;

        c(C15802u uVar) {
            this.f147309d = uVar;
        }

        public Set<Map.Entry<String, List<String>>> a() {
            return this.f147309d.s().entrySet();
        }

        public boolean b() {
            return this.f147308c;
        }

        public List<String> c(String str) {
            C17542s.j(str, "name");
            List<String> x10 = this.f147309d.x(str);
            if (!x10.isEmpty()) {
                return x10;
            }
            return null;
        }

        public void d(p<? super String, ? super List<String>, C16807N> pVar) {
            C15627l.b.a(this, pVar);
        }

        public String get(String str) {
            return C15627l.b.b(this, str);
        }

        public Set<String> names() {
            return this.f147309d.m();
        }
    }

    public static final Object b(z zVar, C15774B b10, C15413d dVar, C17164e<? super C15776D> eVar) {
        C16324p pVar = new C16324p(C17187b.c(eVar), 1);
        pVar.C();
        C15786e b11 = zVar.b(b10);
        FirebasePerfOkHttpClient.enqueue(b11, new C17959b(dVar, pVar));
        pVar.K(new b(b11));
        Object w10 = pVar.w();
        if (w10 == C17187b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return w10;
    }

    public static final C15627l c(C15802u uVar) {
        C17542s.j(uVar, "<this>");
        return new c(uVar);
    }

    public static final C15637v d(C15773A a10) {
        C17542s.j(a10, "<this>");
        switch (a.f147306a[a10.ordinal()]) {
            case 1:
                return C15637v.f134150d.a();
            case 2:
                return C15637v.f134150d.b();
            case 3:
                return C15637v.f134150d.e();
            case 4:
                return C15637v.f134150d.c();
            case 5:
                return C15637v.f134150d.c();
            case 6:
                return C15637v.f134150d.d();
            default:
                throw new t();
        }
    }

    private static final boolean e(IOException iOException) {
        String message = iOException.getMessage();
        return message != null && C15854t.b0(message, "connect", true);
    }

    /* access modifiers changed from: private */
    public static final Throwable f(C15413d dVar, IOException iOException) {
        Throwable a10;
        if (iOException instanceof i) {
            a10 = iOException.getCause();
            if (a10 == null) {
                return iOException;
            }
        } else if (!(iOException instanceof SocketTimeoutException)) {
            return iOException;
        } else {
            a10 = e(iOException) ? C18185x.a(dVar, iOException) : C18185x.b(dVar, iOException);
        }
        return a10;
    }
}
