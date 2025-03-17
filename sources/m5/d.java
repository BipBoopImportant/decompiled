package M5;

import GK.C15774B;
import GK.C15776D;
import GK.C15785d;
import GK.C15802u;
import HJ.C15854t;
import S5.j;
import S5.u;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Marker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\n\bB\u001d\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"LM5/d;", "", "LGK/B;", "networkRequest", "LM5/c;", "cacheResponse", "<init>", "(LGK/B;LM5/c;)V", "a", "LGK/B;", "b", "()LGK/B;", "LM5/c;", "()LM5/c;", "c", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f38507c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C15774B f38508a;

    /* renamed from: b  reason: collision with root package name */
    private final c f38509b;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LM5/d$a;", "", "<init>", "()V", "", "name", "", "e", "(Ljava/lang/String;)Z", "d", "LGK/B;", "request", "LGK/D;", "response", "b", "(LGK/B;LGK/D;)Z", "LM5/c;", "c", "(LGK/B;LM5/c;)Z", "LGK/u;", "cachedHeaders", "networkHeaders", "a", "(LGK/u;LGK/u;)LGK/u;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean d(String str) {
            return C15854t.H("Content-Length", str, true) || C15854t.H("Content-Encoding", str, true) || C15854t.H("Content-Type", str, true);
        }

        private final boolean e(String str) {
            return !C15854t.H("Connection", str, true) && !C15854t.H("Keep-Alive", str, true) && !C15854t.H("Proxy-Authenticate", str, true) && !C15854t.H("Proxy-Authorization", str, true) && !C15854t.H("TE", str, true) && !C15854t.H("Trailers", str, true) && !C15854t.H("Transfer-Encoding", str, true) && !C15854t.H("Upgrade", str, true);
        }

        public final C15802u a(C15802u uVar, C15802u uVar2) {
            C15802u.a aVar = new C15802u.a();
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String k10 = uVar.k(i10);
                String t10 = uVar.t(i10);
                if ((!C15854t.H("Warning", k10, true) || !C15854t.W(t10, "1", false, 2, (Object) null)) && (d(k10) || !e(k10) || uVar2.b(k10) == null)) {
                    aVar.e(k10, t10);
                }
            }
            int size2 = uVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String k11 = uVar2.k(i11);
                if (!d(k11) && e(k11)) {
                    aVar.e(k11, uVar2.t(i11));
                }
            }
            return aVar.f();
        }

        public final boolean b(C15774B b10, C15776D d10) {
            return !b10.b().h() && !d10.d().h() && !C17542s.e(d10.q().b("Vary"), Marker.ANY_MARKER);
        }

        public final boolean c(C15774B b10, c cVar) {
            return !b10.b().h() && !cVar.e().h() && !C17542s.e(cVar.h().b("Vary"), Marker.ANY_MARKER);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"LM5/d$b;", "", "LGK/B;", "request", "LM5/c;", "cacheResponse", "<init>", "(LGK/B;LM5/c;)V", "", "c", "()J", "a", "", "d", "(LGK/B;)Z", "LM5/d;", "b", "()LM5/d;", "LGK/B;", "LM5/c;", "Ljava/util/Date;", "Ljava/util/Date;", "servedDate", "", "Ljava/lang/String;", "servedDateString", "e", "lastModified", "f", "lastModifiedString", "g", "expires", "h", "J", "sentRequestMillis", "i", "receivedResponseMillis", "j", "etag", "", "k", "I", "ageSeconds", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C15774B f38510a;

        /* renamed from: b  reason: collision with root package name */
        private final c f38511b;

        /* renamed from: c  reason: collision with root package name */
        private Date f38512c;

        /* renamed from: d  reason: collision with root package name */
        private String f38513d;

        /* renamed from: e  reason: collision with root package name */
        private Date f38514e;

        /* renamed from: f  reason: collision with root package name */
        private String f38515f;

        /* renamed from: g  reason: collision with root package name */
        private Date f38516g;

        /* renamed from: h  reason: collision with root package name */
        private long f38517h;

        /* renamed from: i  reason: collision with root package name */
        private long f38518i;

        /* renamed from: j  reason: collision with root package name */
        private String f38519j;

        /* renamed from: k  reason: collision with root package name */
        private int f38520k = -1;

        public b(C15774B b10, c cVar) {
            this.f38510a = b10;
            this.f38511b = cVar;
            if (cVar != null) {
                this.f38517h = cVar.i();
                this.f38518i = cVar.g();
                C15802u h10 = cVar.h();
                int size = h10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String k10 = h10.k(i10);
                    if (C15854t.H(k10, "Date", true)) {
                        this.f38512c = h10.i("Date");
                        this.f38513d = h10.t(i10);
                    } else if (C15854t.H(k10, "Expires", true)) {
                        this.f38516g = h10.i("Expires");
                    } else if (C15854t.H(k10, "Last-Modified", true)) {
                        this.f38514e = h10.i("Last-Modified");
                        this.f38515f = h10.t(i10);
                    } else if (C15854t.H(k10, "ETag", true)) {
                        this.f38519j = h10.t(i10);
                    } else if (C15854t.H(k10, "Age", true)) {
                        this.f38520k = j.B(h10.t(i10), -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f38512c;
            long j10 = 0;
            if (date != null) {
                j10 = Math.max(0, this.f38518i - date.getTime());
            }
            int i10 = this.f38520k;
            if (i10 != -1) {
                j10 = Math.max(j10, TimeUnit.SECONDS.toMillis((long) i10));
            }
            return j10 + (this.f38518i - this.f38517h) + (u.f39913a.a() - this.f38518i);
        }

        private final long c() {
            c cVar = this.f38511b;
            C17542s.g(cVar);
            C15785d e10 = cVar.e();
            if (e10.c() != -1) {
                return TimeUnit.SECONDS.toMillis((long) e10.c());
            }
            Date date = this.f38516g;
            if (date != null) {
                Date date2 = this.f38512c;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f38518i);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f38514e == null || this.f38510a.k().p() != null) {
                return 0;
            } else {
                Date date3 = this.f38512c;
                long time2 = date3 != null ? date3.getTime() : this.f38517h;
                Date date4 = this.f38514e;
                C17542s.g(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
                return 0;
            }
        }

        private final boolean d(C15774B b10) {
            return (b10.d("If-Modified-Since") == null && b10.d("If-None-Match") == null) ? false : true;
        }

        public final d b() {
            String str;
            if (this.f38511b == null) {
                return new d(this.f38510a, (c) null, (DefaultConstructorMarker) null);
            }
            if (this.f38510a.g() && !this.f38511b.j()) {
                return new d(this.f38510a, (c) null, (DefaultConstructorMarker) null);
            }
            C15785d e10 = this.f38511b.e();
            if (!d.f38507c.c(this.f38510a, this.f38511b)) {
                return new d(this.f38510a, (c) null, (DefaultConstructorMarker) null);
            }
            C15785d b10 = this.f38510a.b();
            if (b10.g() || d(this.f38510a)) {
                return new d(this.f38510a, (c) null, (DefaultConstructorMarker) null);
            }
            long a10 = a();
            long c10 = c();
            if (b10.c() != -1) {
                c10 = Math.min(c10, TimeUnit.SECONDS.toMillis((long) b10.c()));
            }
            long j10 = 0;
            long millis = b10.e() != -1 ? TimeUnit.SECONDS.toMillis((long) b10.e()) : 0;
            if (!e10.f() && b10.d() != -1) {
                j10 = TimeUnit.SECONDS.toMillis((long) b10.d());
            }
            if (!e10.g() && a10 + millis < c10 + j10) {
                return new d((C15774B) null, this.f38511b, (DefaultConstructorMarker) null);
            }
            String str2 = this.f38519j;
            if (str2 != null) {
                C17542s.g(str2);
                str = "If-None-Match";
            } else {
                str = "If-Modified-Since";
                if (this.f38514e != null) {
                    str2 = this.f38515f;
                    C17542s.g(str2);
                } else if (this.f38512c == null) {
                    return new d(this.f38510a, (c) null, (DefaultConstructorMarker) null);
                } else {
                    str2 = this.f38513d;
                    C17542s.g(str2);
                }
            }
            return new d(this.f38510a.i().a(str, str2).b(), this.f38511b, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ d(C15774B b10, c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(b10, cVar);
    }

    public final c a() {
        return this.f38509b;
    }

    public final C15774B b() {
        return this.f38508a;
    }

    private d(C15774B b10, c cVar) {
        this.f38508a = b10;
        this.f38509b = cVar;
    }
}
