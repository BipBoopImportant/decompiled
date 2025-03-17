package MK;

import GK.C15774B;
import GK.C15775C;
import GK.C15776D;
import GK.C15803v;
import GK.C15804w;
import GK.z;
import HJ.C15850p;
import HK.C15864d;
import LK.e;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0007\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%¨\u0006&"}, d2 = {"LMK/j;", "LGK/w;", "LGK/z;", "client", "<init>", "(LGK/z;)V", "Ljava/io/IOException;", "e", "LLK/e;", "call", "LGK/B;", "userRequest", "", "requestSendStarted", "d", "(Ljava/io/IOException;LLK/e;LGK/B;Z)Z", "(Ljava/io/IOException;LGK/B;)Z", "c", "(Ljava/io/IOException;Z)Z", "LGK/D;", "userResponse", "LLK/c;", "exchange", "b", "(LGK/D;LLK/c;)LGK/B;", "", "method", "a", "(LGK/D;Ljava/lang/String;)LGK/B;", "", "defaultDelay", "f", "(LGK/D;I)I", "LGK/w$a;", "chain", "intercept", "(LGK/w$a;)LGK/D;", "LGK/z;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j implements C15804w {

    /* renamed from: b  reason: collision with root package name */
    public static final a f136474b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final z f136475a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LMK/j$a;", "", "<init>", "()V", "", "MAX_FOLLOW_UPS", "I", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(z zVar) {
        C17542s.j(zVar, "client");
        this.f136475a = zVar;
    }

    private final C15774B a(C15776D d10, String str) {
        String o10;
        C15803v s10;
        C15775C c10 = null;
        if (!this.f136475a.y() || (o10 = C15776D.o(d10, "Location", (String) null, 2, (Object) null)) == null || (s10 = d10.z().k().s(o10)) == null) {
            return null;
        }
        if (!C17542s.e(s10.t(), d10.z().k().t()) && !this.f136475a.z()) {
            return null;
        }
        C15774B.a i10 = d10.z().i();
        if (f.b(str)) {
            int g10 = d10.g();
            f fVar = f.f136460a;
            boolean z10 = fVar.d(str) || g10 == 308 || g10 == 307;
            if (!fVar.c(str) || g10 == 308 || g10 == 307) {
                if (z10) {
                    c10 = d10.z().a();
                }
                i10.g(str, c10);
            } else {
                i10.g("GET", (C15775C) null);
            }
            if (!z10) {
                i10.j("Transfer-Encoding");
                i10.j("Content-Length");
                i10.j("Content-Type");
            }
        }
        if (!C15864d.j(d10.z().k(), s10)) {
            i10.j("Authorization");
        }
        return i10.m(s10).b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r7.h();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final GK.C15774B b(GK.C15776D r6, LK.c r7) {
        /*
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L_0x000e
            LK.f r1 = r7.h()
            if (r1 == 0) goto L_0x000e
            GK.F r1 = r1.C()
            goto L_0x000f
        L_0x000e:
            r1 = r0
        L_0x000f:
            int r2 = r6.g()
            GK.B r3 = r6.z()
            java.lang.String r3 = r3.h()
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto L_0x00df
            r4 = 308(0x134, float:4.32E-43)
            if (r2 == r4) goto L_0x00df
            r4 = 401(0x191, float:5.62E-43)
            if (r2 == r4) goto L_0x00d4
            r4 = 421(0x1a5, float:5.9E-43)
            if (r2 == r4) goto L_0x00ad
            r7 = 503(0x1f7, float:7.05E-43)
            if (r2 == r7) goto L_0x0091
            r7 = 407(0x197, float:5.7E-43)
            if (r2 == r7) goto L_0x006f
            r7 = 408(0x198, float:5.72E-43)
            if (r2 == r7) goto L_0x003b
            switch(r2) {
                case 300: goto L_0x00df;
                case 301: goto L_0x00df;
                case 302: goto L_0x00df;
                case 303: goto L_0x00df;
                default: goto L_0x003a;
            }
        L_0x003a:
            return r0
        L_0x003b:
            GK.z r1 = r5.f136475a
            boolean r1 = r1.P()
            if (r1 != 0) goto L_0x0044
            return r0
        L_0x0044:
            GK.B r1 = r6.z()
            GK.C r1 = r1.a()
            if (r1 == 0) goto L_0x0055
            boolean r1 = r1.g()
            if (r1 == 0) goto L_0x0055
            return r0
        L_0x0055:
            GK.D r1 = r6.v()
            if (r1 == 0) goto L_0x0062
            int r1 = r1.g()
            if (r1 != r7) goto L_0x0062
            return r0
        L_0x0062:
            r7 = 0
            int r7 = r5.f(r6, r7)
            if (r7 <= 0) goto L_0x006a
            return r0
        L_0x006a:
            GK.B r6 = r6.z()
            return r6
        L_0x006f:
            kotlin.jvm.internal.C17542s.g(r1)
            java.net.Proxy r7 = r1.b()
            java.net.Proxy$Type r7 = r7.type()
            java.net.Proxy$Type r0 = java.net.Proxy.Type.HTTP
            if (r7 != r0) goto L_0x0089
            GK.z r7 = r5.f136475a
            GK.b r7 = r7.M()
            GK.B r6 = r7.a(r1, r6)
            return r6
        L_0x0089:
            java.net.ProtocolException r6 = new java.net.ProtocolException
            java.lang.String r7 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r6.<init>(r7)
            throw r6
        L_0x0091:
            GK.D r1 = r6.v()
            if (r1 == 0) goto L_0x009e
            int r1 = r1.g()
            if (r1 != r7) goto L_0x009e
            return r0
        L_0x009e:
            r7 = 2147483647(0x7fffffff, float:NaN)
            int r7 = r5.f(r6, r7)
            if (r7 != 0) goto L_0x00ac
            GK.B r6 = r6.z()
            return r6
        L_0x00ac:
            return r0
        L_0x00ad:
            GK.B r1 = r6.z()
            GK.C r1 = r1.a()
            if (r1 == 0) goto L_0x00be
            boolean r1 = r1.g()
            if (r1 == 0) goto L_0x00be
            return r0
        L_0x00be:
            if (r7 == 0) goto L_0x00d3
            boolean r1 = r7.l()
            if (r1 != 0) goto L_0x00c7
            goto L_0x00d3
        L_0x00c7:
            LK.f r7 = r7.h()
            r7.A()
            GK.B r6 = r6.z()
            return r6
        L_0x00d3:
            return r0
        L_0x00d4:
            GK.z r7 = r5.f136475a
            GK.b r7 = r7.f()
            GK.B r6 = r7.a(r1, r6)
            return r6
        L_0x00df:
            GK.B r6 = r5.a(r6, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: MK.j.b(GK.D, LK.c):GK.B");
    }

    private final boolean c(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException);
    }

    private final boolean d(IOException iOException, e eVar, C15774B b10, boolean z10) {
        if (!this.f136475a.P()) {
            return false;
        }
        return (!z10 || !e(iOException, b10)) && c(iOException, z10) && eVar.D();
    }

    private final boolean e(IOException iOException, C15774B b10) {
        C15775C a10 = b10.a();
        return (a10 != null && a10.g()) || (iOException instanceof FileNotFoundException);
    }

    private final int f(C15776D d10, int i10) {
        String o10 = C15776D.o(d10, "Retry-After", (String) null, 2, (Object) null);
        if (o10 == null) {
            return i10;
        }
        if (!new C15850p("\\d+").i(o10)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(o10);
        C17542s.i(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0 = r0.u().o(r7.u().b((GK.C15777E) null).c()).c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r0 = r1.r();
        r6 = b(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r6 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r0 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r0.m() == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r1.G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        r1.l(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0 = r6.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r0 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (r0.g() == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        r1.l(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0 = r7.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0074, code lost:
        HK.C15864d.m(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0077, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r8 > 20) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (r7 == null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GK.C15776D intercept(GK.C15804w.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            MK.g r11 = (MK.g) r11
            GK.B r0 = r11.l()
            LK.e r1 = r11.h()
            java.util.List r2 = YH.C16877v.n()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L_0x0018:
            r6 = r5
        L_0x0019:
            r1.k(r0, r6)
            boolean r6 = r1.J()     // Catch:{ all -> 0x0042 }
            if (r6 != 0) goto L_0x00d3
            GK.D r0 = r11.b(r0)     // Catch:{ i -> 0x00b4, IOException -> 0x0099 }
            if (r7 == 0) goto L_0x0040
            GK.D$a r0 = r0.u()     // Catch:{ all -> 0x0042 }
            GK.D$a r6 = r7.u()     // Catch:{ all -> 0x0042 }
            GK.D$a r6 = r6.b(r4)     // Catch:{ all -> 0x0042 }
            GK.D r6 = r6.c()     // Catch:{ all -> 0x0042 }
            GK.D$a r0 = r0.o(r6)     // Catch:{ all -> 0x0042 }
            GK.D r0 = r0.c()     // Catch:{ all -> 0x0042 }
        L_0x0040:
            r7 = r0
            goto L_0x0045
        L_0x0042:
            r11 = move-exception
            goto L_0x00db
        L_0x0045:
            LK.c r0 = r1.r()     // Catch:{ all -> 0x0042 }
            GK.B r6 = r10.b(r7, r0)     // Catch:{ all -> 0x0042 }
            if (r6 != 0) goto L_0x005e
            if (r0 == 0) goto L_0x005a
            boolean r11 = r0.m()     // Catch:{ all -> 0x0042 }
            if (r11 == 0) goto L_0x005a
            r1.G()     // Catch:{ all -> 0x0042 }
        L_0x005a:
            r1.l(r3)
            return r7
        L_0x005e:
            GK.C r0 = r6.a()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x006e
            boolean r0 = r0.g()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x006e
            r1.l(r3)
            return r7
        L_0x006e:
            GK.E r0 = r7.c()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0077
            HK.C15864d.m(r0)     // Catch:{ all -> 0x0042 }
        L_0x0077:
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L_0x0082
            r1.l(r5)
            r0 = r6
            goto L_0x0018
        L_0x0082:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch:{ all -> 0x0042 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            r0.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch:{ all -> 0x0042 }
            r0.append(r8)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0042 }
            r11.<init>(r0)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x0099:
            r6 = move-exception
            boolean r9 = r6 instanceof OK.C16171a     // Catch:{ all -> 0x0042 }
            r9 = r9 ^ r5
            boolean r9 = r10.d(r6, r1, r0, r9)     // Catch:{ all -> 0x0042 }
            if (r9 == 0) goto L_0x00af
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0042 }
            java.util.List r2 = YH.C16877v.W0(r2, r6)     // Catch:{ all -> 0x0042 }
        L_0x00a9:
            r1.l(r5)
            r6 = r3
            goto L_0x0019
        L_0x00af:
            java.lang.Throwable r11 = HK.C15864d.c0(r6, r2)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x00b4:
            r6 = move-exception
            java.io.IOException r9 = r6.c()     // Catch:{ all -> 0x0042 }
            boolean r9 = r10.d(r9, r1, r0, r3)     // Catch:{ all -> 0x0042 }
            if (r9 == 0) goto L_0x00ca
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0042 }
            java.io.IOException r6 = r6.b()     // Catch:{ all -> 0x0042 }
            java.util.List r2 = YH.C16877v.W0(r2, r6)     // Catch:{ all -> 0x0042 }
            goto L_0x00a9
        L_0x00ca:
            java.io.IOException r11 = r6.b()     // Catch:{ all -> 0x0042 }
            java.lang.Throwable r11 = HK.C15864d.c0(r11, r2)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x00d3:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "Canceled"
            r11.<init>(r0)     // Catch:{ all -> 0x0042 }
            throw r11     // Catch:{ all -> 0x0042 }
        L_0x00db:
            r1.l(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: MK.j.intercept(GK.w$a):GK.D");
    }
}
