package LK;

import GK.C15778F;
import GK.C15782a;
import GK.C15799r;
import GK.C15803v;
import GK.z;
import HK.C15864d;
import LK.j;
import MK.g;
import OK.C16171a;
import OK.C16172b;
import OK.n;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0017\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0015\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\r\u0010$\u001a\u00020\u0011¢\u0006\u0004\b$\u0010(J\u0015\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010-R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00102R\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u00104R\u0018\u00108\u001a\u0004\u0018\u0001068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u00107R\u0016\u0010:\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u00109R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u00109R\u0016\u0010=\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u00109R\u0018\u0010@\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, d2 = {"LLK/d;", "", "LLK/g;", "connectionPool", "LGK/a;", "address", "LLK/e;", "call", "LGK/r;", "eventListener", "<init>", "(LLK/g;LGK/a;LLK/e;LGK/r;)V", "", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "", "connectionRetryEnabled", "doExtensiveHealthChecks", "LLK/f;", "c", "(IIIIZZ)LLK/f;", "b", "(IIIIZ)LLK/f;", "LGK/F;", "f", "()LGK/F;", "LGK/z;", "client", "LMK/g;", "chain", "LMK/d;", "a", "(LGK/z;LMK/g;)LMK/d;", "Ljava/io/IOException;", "e", "LXH/N;", "h", "(Ljava/io/IOException;)V", "()Z", "LGK/v;", "url", "g", "(LGK/v;)Z", "LLK/g;", "LGK/a;", "d", "()LGK/a;", "LLK/e;", "LGK/r;", "LLK/j$b;", "LLK/j$b;", "routeSelection", "LLK/j;", "LLK/j;", "routeSelector", "I", "refusedStreamCount", "connectionShutdownCount", "i", "otherFailureCount", "j", "LGK/F;", "nextRouteToTry", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final g f136141a;

    /* renamed from: b  reason: collision with root package name */
    private final C15782a f136142b;

    /* renamed from: c  reason: collision with root package name */
    private final e f136143c;

    /* renamed from: d  reason: collision with root package name */
    private final C15799r f136144d;

    /* renamed from: e  reason: collision with root package name */
    private j.b f136145e;

    /* renamed from: f  reason: collision with root package name */
    private j f136146f;

    /* renamed from: g  reason: collision with root package name */
    private int f136147g;

    /* renamed from: h  reason: collision with root package name */
    private int f136148h;

    /* renamed from: i  reason: collision with root package name */
    private int f136149i;

    /* renamed from: j  reason: collision with root package name */
    private C15778F f136150j;

    public d(g gVar, C15782a aVar, e eVar, C15799r rVar) {
        C17542s.j(gVar, "connectionPool");
        C17542s.j(aVar, PlaceTypes.ADDRESS);
        C17542s.j(eVar, "call");
        C17542s.j(rVar, "eventListener");
        this.f136141a = gVar;
        this.f136142b = aVar;
        this.f136143c = eVar;
        this.f136144d = rVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final LK.f b(int r15, int r16, int r17, int r18, boolean r19) {
        /*
            r14 = this;
            r1 = r14
            LK.e r0 = r1.f136143c
            boolean r0 = r0.J()
            if (r0 != 0) goto L_0x0171
            LK.e r0 = r1.f136143c
            LK.f r2 = r0.n()
            r3 = 0
            if (r2 == 0) goto L_0x005b
            monitor-enter(r2)
            boolean r0 = r2.s()     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0030
            GK.F r0 = r2.C()     // Catch:{ all -> 0x002e }
            GK.a r0 = r0.a()     // Catch:{ all -> 0x002e }
            GK.v r0 = r0.l()     // Catch:{ all -> 0x002e }
            boolean r0 = r14.g(r0)     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            r0 = r3
            goto L_0x0036
        L_0x002e:
            r0 = move-exception
            goto L_0x0059
        L_0x0030:
            LK.e r0 = r1.f136143c     // Catch:{ all -> 0x002e }
            java.net.Socket r0 = r0.C()     // Catch:{ all -> 0x002e }
        L_0x0036:
            XH.N r4 = XH.C16807N.f139792a     // Catch:{ all -> 0x002e }
            monitor-exit(r2)
            LK.e r4 = r1.f136143c
            LK.f r4 = r4.n()
            if (r4 == 0) goto L_0x004c
            if (r0 != 0) goto L_0x0044
            return r2
        L_0x0044:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x004c:
            if (r0 == 0) goto L_0x0051
            HK.C15864d.n(r0)
        L_0x0051:
            GK.r r0 = r1.f136144d
            LK.e r4 = r1.f136143c
            r0.l(r4, r2)
            goto L_0x005b
        L_0x0059:
            monitor-exit(r2)
            throw r0
        L_0x005b:
            r0 = 0
            r1.f136147g = r0
            r1.f136148h = r0
            r1.f136149i = r0
            LK.g r2 = r1.f136141a
            GK.a r4 = r1.f136142b
            LK.e r5 = r1.f136143c
            boolean r2 = r2.a(r4, r5, r3, r0)
            if (r2 == 0) goto L_0x007f
            LK.e r0 = r1.f136143c
            LK.f r0 = r0.n()
            kotlin.jvm.internal.C17542s.g(r0)
            GK.r r2 = r1.f136144d
            LK.e r3 = r1.f136143c
            r2.k(r3, r0)
            return r0
        L_0x007f:
            GK.F r2 = r1.f136150j
            if (r2 == 0) goto L_0x008a
            kotlin.jvm.internal.C17542s.g(r2)
            r1.f136150j = r3
        L_0x0088:
            r4 = r3
            goto L_0x00ef
        L_0x008a:
            LK.j$b r2 = r1.f136145e
            if (r2 == 0) goto L_0x00a1
            kotlin.jvm.internal.C17542s.g(r2)
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x00a1
            LK.j$b r0 = r1.f136145e
            kotlin.jvm.internal.C17542s.g(r0)
            GK.F r2 = r0.c()
            goto L_0x0088
        L_0x00a1:
            LK.j r2 = r1.f136146f
            if (r2 != 0) goto L_0x00bc
            LK.j r2 = new LK.j
            GK.a r4 = r1.f136142b
            LK.e r5 = r1.f136143c
            GK.z r5 = r5.m()
            LK.h r5 = r5.A()
            LK.e r6 = r1.f136143c
            GK.r r7 = r1.f136144d
            r2.<init>(r4, r5, r6, r7)
            r1.f136146f = r2
        L_0x00bc:
            LK.j$b r2 = r2.c()
            r1.f136145e = r2
            java.util.List r4 = r2.a()
            LK.e r5 = r1.f136143c
            boolean r5 = r5.J()
            if (r5 != 0) goto L_0x0169
            LK.g r5 = r1.f136141a
            GK.a r6 = r1.f136142b
            LK.e r7 = r1.f136143c
            boolean r0 = r5.a(r6, r7, r4, r0)
            if (r0 == 0) goto L_0x00eb
            LK.e r0 = r1.f136143c
            LK.f r0 = r0.n()
            kotlin.jvm.internal.C17542s.g(r0)
            GK.r r2 = r1.f136144d
            LK.e r3 = r1.f136143c
            r2.k(r3, r0)
            return r0
        L_0x00eb:
            GK.F r2 = r2.c()
        L_0x00ef:
            LK.f r13 = new LK.f
            LK.g r0 = r1.f136141a
            r13.<init>(r0, r2)
            LK.e r0 = r1.f136143c
            r0.E(r13)
            LK.e r11 = r1.f136143c     // Catch:{ all -> 0x0162 }
            GK.r r12 = r1.f136144d     // Catch:{ all -> 0x0162 }
            r5 = r13
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r5.i(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0162 }
            LK.e r0 = r1.f136143c
            r0.E(r3)
            LK.e r0 = r1.f136143c
            GK.z r0 = r0.m()
            LK.h r0 = r0.A()
            GK.F r3 = r13.C()
            r0.a(r3)
            LK.g r0 = r1.f136141a
            GK.a r3 = r1.f136142b
            LK.e r5 = r1.f136143c
            r6 = 1
            boolean r0 = r0.a(r3, r5, r4, r6)
            if (r0 == 0) goto L_0x0149
            LK.e r0 = r1.f136143c
            LK.f r0 = r0.n()
            kotlin.jvm.internal.C17542s.g(r0)
            r1.f136150j = r2
            java.net.Socket r2 = r13.c()
            HK.C15864d.n(r2)
            GK.r r2 = r1.f136144d
            LK.e r3 = r1.f136143c
            r2.k(r3, r0)
            return r0
        L_0x0149:
            monitor-enter(r13)
            LK.g r0 = r1.f136141a     // Catch:{ all -> 0x015f }
            r0.f(r13)     // Catch:{ all -> 0x015f }
            LK.e r0 = r1.f136143c     // Catch:{ all -> 0x015f }
            r0.c(r13)     // Catch:{ all -> 0x015f }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x015f }
            monitor-exit(r13)
            GK.r r0 = r1.f136144d
            LK.e r2 = r1.f136143c
            r0.k(r2, r13)
            return r13
        L_0x015f:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x0162:
            r0 = move-exception
            LK.e r2 = r1.f136143c
            r2.E(r3)
            throw r0
        L_0x0169:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        L_0x0171:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: LK.d.b(int, int, int, int, boolean):LK.f");
    }

    private final f c(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        while (true) {
            f b10 = b(i10, i11, i12, i13, z10);
            if (b10.w(z11)) {
                return b10;
            }
            b10.B();
            if (this.f136150j == null) {
                j.b bVar = this.f136145e;
                boolean z12 = true;
                if (bVar != null ? bVar.b() : true) {
                    continue;
                } else {
                    j jVar = this.f136146f;
                    if (jVar != null) {
                        z12 = jVar.a();
                    }
                    if (!z12) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final C15778F f() {
        f n10;
        if (this.f136147g > 1 || this.f136148h > 1 || this.f136149i > 0 || (n10 = this.f136143c.n()) == null) {
            return null;
        }
        synchronized (n10) {
            if (n10.t() != 0) {
                return null;
            }
            if (!C15864d.j(n10.C().a().l(), this.f136142b.l())) {
                return null;
            }
            C15778F C10 = n10.C();
            return C10;
        }
    }

    public final MK.d a(z zVar, g gVar) {
        C17542s.j(zVar, "client");
        C17542s.j(gVar, "chain");
        try {
            return c(gVar.i(), gVar.k(), gVar.m(), zVar.I(), zVar.P(), !C17542s.e(gVar.l().h(), "GET")).y(zVar, gVar);
        } catch (i e10) {
            h(e10.c());
            throw e10;
        } catch (IOException e11) {
            h(e11);
            throw new i(e11);
        }
    }

    public final C15782a d() {
        return this.f136142b;
    }

    public final boolean e() {
        j jVar;
        if (this.f136147g == 0 && this.f136148h == 0 && this.f136149i == 0) {
            return false;
        }
        if (this.f136150j != null) {
            return true;
        }
        C15778F f10 = f();
        if (f10 != null) {
            this.f136150j = f10;
            return true;
        }
        j.b bVar = this.f136145e;
        if ((bVar == null || !bVar.b()) && (jVar = this.f136146f) != null) {
            return jVar.a();
        }
        return true;
    }

    public final boolean g(C15803v vVar) {
        C17542s.j(vVar, "url");
        C15803v l10 = this.f136142b.l();
        return vVar.o() == l10.o() && C17542s.e(vVar.i(), l10.i());
    }

    public final void h(IOException iOException) {
        C17542s.j(iOException, "e");
        this.f136150j = null;
        if ((iOException instanceof n) && ((n) iOException).f137123a == C16172b.REFUSED_STREAM) {
            this.f136147g++;
        } else if (iOException instanceof C16171a) {
            this.f136148h++;
        } else {
            this.f136149i++;
        }
    }
}
