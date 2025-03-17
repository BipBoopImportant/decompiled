package JK;

import GK.C15774B;
import GK.C15776D;
import GK.C15785d;
import GK.C15802u;
import HJ.C15854t;
import HK.C15864d;
import MK.c;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0002\b\nB\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"LJK/c;", "", "LGK/B;", "networkRequest", "LGK/D;", "cacheResponse", "<init>", "(LGK/B;LGK/D;)V", "a", "LGK/B;", "b", "()LGK/B;", "LGK/D;", "()LGK/D;", "c", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: JK.c  reason: case insensitive filesystem */
public final class C15974c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f135817c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C15774B f135818a;

    /* renamed from: b  reason: collision with root package name */
    private final C15776D f135819b;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LJK/c$a;", "", "<init>", "()V", "LGK/D;", "response", "LGK/B;", "request", "", "a", "(LGK/D;LGK/B;)Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: JK.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(C15776D d10, C15774B b10) {
            C17542s.j(d10, "response");
            C17542s.j(b10, "request");
            int g10 = d10.g();
            if (!(g10 == 200 || g10 == 410 || g10 == 414 || g10 == 501 || g10 == 203 || g10 == 204)) {
                if (g10 != 307) {
                    if (!(g10 == 308 || g10 == 404 || g10 == 405)) {
                        switch (g10) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (C15776D.o(d10, "Expires", (String) null, 2, (Object) null) == null && d10.d().c() == -1 && !d10.d().b() && !d10.d().a()) {
                    return false;
                }
            }
            return !d10.d().h() && !b10.b().h();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0018\u0010#\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0018\u0010%\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0016R\u0016\u0010)\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010\u0016R\u0018\u0010+\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"LJK/c$b;", "", "", "nowMillis", "LGK/B;", "request", "LGK/D;", "cacheResponse", "<init>", "(JLGK/B;LGK/D;)V", "", "f", "()Z", "LJK/c;", "c", "()LJK/c;", "d", "()J", "a", "e", "(LGK/B;)Z", "b", "J", "LGK/B;", "getRequest$okhttp", "()LGK/B;", "LGK/D;", "Ljava/util/Date;", "Ljava/util/Date;", "servedDate", "", "Ljava/lang/String;", "servedDateString", "lastModified", "g", "lastModifiedString", "h", "expires", "i", "sentRequestMillis", "j", "receivedResponseMillis", "k", "etag", "", "l", "I", "ageSeconds", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: JK.c$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final long f135820a;

        /* renamed from: b  reason: collision with root package name */
        private final C15774B f135821b;

        /* renamed from: c  reason: collision with root package name */
        private final C15776D f135822c;

        /* renamed from: d  reason: collision with root package name */
        private Date f135823d;

        /* renamed from: e  reason: collision with root package name */
        private String f135824e;

        /* renamed from: f  reason: collision with root package name */
        private Date f135825f;

        /* renamed from: g  reason: collision with root package name */
        private String f135826g;

        /* renamed from: h  reason: collision with root package name */
        private Date f135827h;

        /* renamed from: i  reason: collision with root package name */
        private long f135828i;

        /* renamed from: j  reason: collision with root package name */
        private long f135829j;

        /* renamed from: k  reason: collision with root package name */
        private String f135830k;

        /* renamed from: l  reason: collision with root package name */
        private int f135831l = -1;

        public b(long j10, C15774B b10, C15776D d10) {
            C17542s.j(b10, "request");
            this.f135820a = j10;
            this.f135821b = b10;
            this.f135822c = d10;
            if (d10 != null) {
                this.f135828i = d10.B();
                this.f135829j = d10.x();
                C15802u q10 = d10.q();
                int size = q10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String k10 = q10.k(i10);
                    String t10 = q10.t(i10);
                    if (C15854t.H(k10, "Date", true)) {
                        this.f135823d = c.a(t10);
                        this.f135824e = t10;
                    } else if (C15854t.H(k10, "Expires", true)) {
                        this.f135827h = c.a(t10);
                    } else if (C15854t.H(k10, "Last-Modified", true)) {
                        this.f135825f = c.a(t10);
                        this.f135826g = t10;
                    } else if (C15854t.H(k10, "ETag", true)) {
                        this.f135830k = t10;
                    } else if (C15854t.H(k10, "Age", true)) {
                        this.f135831l = C15864d.Z(t10, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f135823d;
            long j10 = 0;
            if (date != null) {
                j10 = Math.max(0, this.f135829j - date.getTime());
            }
            int i10 = this.f135831l;
            if (i10 != -1) {
                j10 = Math.max(j10, TimeUnit.SECONDS.toMillis((long) i10));
            }
            long j11 = this.f135829j;
            return j10 + (j11 - this.f135828i) + (this.f135820a - j11);
        }

        private final C15974c c() {
            String str;
            if (this.f135822c == null) {
                return new C15974c(this.f135821b, (C15776D) null);
            }
            if (this.f135821b.g() && this.f135822c.i() == null) {
                return new C15974c(this.f135821b, (C15776D) null);
            }
            if (!C15974c.f135817c.a(this.f135822c, this.f135821b)) {
                return new C15974c(this.f135821b, (C15776D) null);
            }
            C15785d b10 = this.f135821b.b();
            if (b10.g() || e(this.f135821b)) {
                return new C15974c(this.f135821b, (C15776D) null);
            }
            C15785d d10 = this.f135822c.d();
            long a10 = a();
            long d11 = d();
            if (b10.c() != -1) {
                d11 = Math.min(d11, TimeUnit.SECONDS.toMillis((long) b10.c()));
            }
            long j10 = 0;
            long millis = b10.e() != -1 ? TimeUnit.SECONDS.toMillis((long) b10.e()) : 0;
            if (!d10.f() && b10.d() != -1) {
                j10 = TimeUnit.SECONDS.toMillis((long) b10.d());
            }
            if (!d10.g()) {
                long j11 = millis + a10;
                if (j11 < j10 + d11) {
                    C15776D.a u10 = this.f135822c.u();
                    if (j11 >= d11) {
                        u10.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a10 > 86400000 && f()) {
                        u10.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C15974c((C15774B) null, u10.c());
                }
            }
            String str2 = this.f135830k;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f135825f != null) {
                    str2 = this.f135826g;
                } else if (this.f135823d == null) {
                    return new C15974c(this.f135821b, (C15776D) null);
                } else {
                    str2 = this.f135824e;
                }
                str = "If-Modified-Since";
            }
            C15802u.a p10 = this.f135821b.e().p();
            C17542s.g(str2);
            p10.d(str, str2);
            return new C15974c(this.f135821b.i().f(p10.f()).b(), this.f135822c);
        }

        private final long d() {
            C15776D d10 = this.f135822c;
            C17542s.g(d10);
            C15785d d11 = d10.d();
            if (d11.c() != -1) {
                return TimeUnit.SECONDS.toMillis((long) d11.c());
            }
            Date date = this.f135827h;
            if (date != null) {
                Date date2 = this.f135823d;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f135829j);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f135825f == null || this.f135822c.z().k().p() != null) {
                return 0;
            } else {
                Date date3 = this.f135823d;
                long time2 = date3 != null ? date3.getTime() : this.f135828i;
                Date date4 = this.f135825f;
                C17542s.g(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
                return 0;
            }
        }

        private final boolean e(C15774B b10) {
            return (b10.d("If-Modified-Since") == null && b10.d("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            C15776D d10 = this.f135822c;
            C17542s.g(d10);
            return d10.d().c() == -1 && this.f135827h == null;
        }

        public final C15974c b() {
            C15974c c10 = c();
            return (c10.b() == null || !this.f135821b.b().i()) ? c10 : new C15974c((C15774B) null, (C15776D) null);
        }
    }

    public C15974c(C15774B b10, C15776D d10) {
        this.f135818a = b10;
        this.f135819b = d10;
    }

    public final C15776D a() {
        return this.f135819b;
    }

    public final C15774B b() {
        return this.f135818a;
    }
}
