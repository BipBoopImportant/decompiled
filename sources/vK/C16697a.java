package VK;

import GK.C15774B;
import GK.C15775C;
import GK.C15776D;
import GK.C15777E;
import GK.C15791j;
import GK.C15802u;
import GK.C15804w;
import GK.C15805x;
import HJ.C15854t;
import MK.e;
import QK.C16354j;
import WK.C16770e;
import WK.C16772g;
import WK.r;
import YH.g0;
import jI.C17416c;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u000e\u001cB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR*\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00108\u0006@GX\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b\u001c\u0010#¨\u0006$"}, d2 = {"LVK/a;", "LGK/w;", "LVK/a$b;", "logger", "<init>", "(LVK/a$b;)V", "LGK/u;", "headers", "", "i", "LXH/N;", "c", "(LGK/u;I)V", "", "a", "(LGK/u;)Z", "LVK/a$a;", "level", "d", "(LVK/a$a;)LVK/a;", "LGK/w$a;", "chain", "LGK/D;", "intercept", "(LGK/w$a;)LGK/D;", "LVK/a$b;", "", "", "b", "Ljava/util/Set;", "headersToRedact", "<set-?>", "LVK/a$a;", "getLevel", "()LVK/a$a;", "(LVK/a$a;)V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: VK.a  reason: case insensitive filesystem */
public final class C16697a implements C15804w {

    /* renamed from: a  reason: collision with root package name */
    private final b f139431a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Set<String> f139432b;

    /* renamed from: c  reason: collision with root package name */
    private volatile C3418a f139433c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LVK/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: VK.a$a  reason: collision with other inner class name */
    public enum C3418a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LVK/a$b;", "", "", "message", "LXH/N;", "log", "(Ljava/lang/String;)V", "a", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: VK.a$b */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final C3419a f139434a = C3419a.f139436a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f139435b = new C3419a.C3420a();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\b"}, d2 = {"LVK/a$b$a;", "", "<init>", "()V", "LVK/a$b;", "DEFAULT", "LVK/a$b;", "a", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: VK.a$b$a  reason: collision with other inner class name */
        public static final class C3419a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ C3419a f139436a = new C3419a();

            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LVK/a$b$a$a;", "LVK/a$b;", "<init>", "()V", "", "message", "LXH/N;", "log", "(Ljava/lang/String;)V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 48)
            /* renamed from: VK.a$b$a$a  reason: collision with other inner class name */
            private static final class C3420a implements b {
                public void log(String str) {
                    C17542s.j(str, "message");
                    C16354j.l(C16354j.f137719a.g(), str, 0, (Throwable) null, 6, (Object) null);
                }
            }

            private C3419a() {
            }
        }

        void log(String str);
    }

    public C16697a(b bVar) {
        C17542s.j(bVar, "logger");
        this.f139431a = bVar;
        this.f139432b = g0.d();
        this.f139433c = C3418a.NONE;
    }

    private final boolean a(C15802u uVar) {
        String b10 = uVar.b("Content-Encoding");
        return b10 != null && !C15854t.H(b10, "identity", true) && !C15854t.H(b10, "gzip", true);
    }

    private final void c(C15802u uVar, int i10) {
        String t10 = this.f139432b.contains(uVar.k(i10)) ? "██" : uVar.t(i10);
        b bVar = this.f139431a;
        bVar.log(uVar.k(i10) + ": " + t10);
    }

    public final void b(C3418a aVar) {
        C17542s.j(aVar, "<set-?>");
        this.f139433c = aVar;
    }

    public final C16697a d(C3418a aVar) {
        C17542s.j(aVar, "level");
        this.f139433c = aVar;
        return this;
    }

    public C15776D intercept(C15804w.a aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        char c10;
        String str5;
        Charset charset;
        Throwable th2;
        Charset charset2;
        C15804w.a aVar2 = aVar;
        C17542s.j(aVar2, "chain");
        C3418a aVar3 = this.f139433c;
        C15774B t10 = aVar.t();
        if (aVar3 == C3418a.NONE) {
            return aVar2.b(t10);
        }
        boolean z10 = aVar3 == C3418a.BODY;
        boolean z11 = z10 || aVar3 == C3418a.HEADERS;
        C15775C a10 = t10.a();
        C15791j d10 = aVar.d();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--> ");
        sb2.append(t10.h());
        sb2.append(' ');
        sb2.append(t10.k());
        if (d10 != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(' ');
            sb3.append(d10.a());
            str = sb3.toString();
        } else {
            str = "";
        }
        sb2.append(str);
        String sb4 = sb2.toString();
        if (!z11 && a10 != null) {
            sb4 = sb4 + " (" + a10.a() + "-byte body)";
        }
        this.f139431a.log(sb4);
        if (z11) {
            C15802u e10 = t10.e();
            if (a10 != null) {
                C15805x b10 = a10.b();
                if (b10 != null && e10.b("Content-Type") == null) {
                    this.f139431a.log("Content-Type: " + b10);
                }
                if (a10.a() != -1 && e10.b("Content-Length") == null) {
                    this.f139431a.log("Content-Length: " + a10.a());
                }
            }
            int size = e10.size();
            for (int i10 = 0; i10 < size; i10++) {
                c(e10, i10);
            }
            if (!z10 || a10 == null) {
                this.f139431a.log("--> END " + t10.h());
            } else if (a(t10.e())) {
                this.f139431a.log("--> END " + t10.h() + " (encoded body omitted)");
            } else if (a10.f()) {
                this.f139431a.log("--> END " + t10.h() + " (duplex request body omitted)");
            } else if (a10.g()) {
                this.f139431a.log("--> END " + t10.h() + " (one-shot body omitted)");
            } else {
                C16770e eVar = new C16770e();
                a10.h(eVar);
                C15805x b11 = a10.b();
                if (b11 == null || (charset2 = b11.c(StandardCharsets.UTF_8)) == null) {
                    charset2 = StandardCharsets.UTF_8;
                    C17542s.i(charset2, "UTF_8");
                }
                this.f139431a.log("");
                if (C16698b.a(eVar)) {
                    this.f139431a.log(eVar.w2(charset2));
                    this.f139431a.log("--> END " + t10.h() + " (" + a10.a() + "-byte body)");
                } else {
                    this.f139431a.log("--> END " + t10.h() + " (binary " + a10.a() + "-byte body omitted)");
                }
            }
        }
        long nanoTime = System.nanoTime();
        try {
            C15776D b12 = aVar2.b(t10);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            C15777E c11 = b12.c();
            C17542s.g(c11);
            long g10 = c11.g();
            if (g10 != -1) {
                str2 = g10 + "-byte";
            } else {
                str2 = "unknown-length";
            }
            b bVar = this.f139431a;
            String str6 = "-byte body)";
            StringBuilder sb5 = new StringBuilder();
            long j10 = g10;
            sb5.append("<-- ");
            sb5.append(b12.g());
            if (b12.s().length() == 0) {
                str3 = "-byte body omitted)";
                str4 = "";
                c10 = ' ';
            } else {
                String s10 = b12.s();
                StringBuilder sb6 = new StringBuilder();
                str3 = "-byte body omitted)";
                c10 = ' ';
                sb6.append(' ');
                sb6.append(s10);
                str4 = sb6.toString();
            }
            sb5.append(str4);
            sb5.append(c10);
            sb5.append(b12.z().k());
            sb5.append(" (");
            sb5.append(millis);
            sb5.append("ms");
            if (!z11) {
                str5 = ", " + str2 + " body";
            } else {
                str5 = "";
            }
            sb5.append(str5);
            sb5.append(')');
            bVar.log(sb5.toString());
            if (z11) {
                C15802u q10 = b12.q();
                int size2 = q10.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c(q10, i11);
                }
                if (!z10 || !e.b(b12)) {
                    this.f139431a.log("<-- END HTTP");
                } else if (a(b12.q())) {
                    this.f139431a.log("<-- END HTTP (encoded body omitted)");
                } else {
                    C16772g k32 = c11.k3();
                    k32.V0(Long.MAX_VALUE);
                    C16770e p10 = k32.p();
                    Long l10 = null;
                    if (C15854t.H("gzip", q10.b("Content-Encoding"), true)) {
                        Long valueOf = Long.valueOf(p10.size());
                        r rVar = new r(p10.clone());
                        try {
                            p10 = new C16770e();
                            p10.Y(rVar);
                            C17416c.a(rVar, (Throwable) null);
                            l10 = valueOf;
                        } catch (Throwable th3) {
                            Throwable th4 = th3;
                            C17416c.a(rVar, th2);
                            throw th4;
                        }
                    }
                    C15805x h10 = c11.h();
                    if (h10 == null || (charset = h10.c(StandardCharsets.UTF_8)) == null) {
                        charset = StandardCharsets.UTF_8;
                        C17542s.i(charset, "UTF_8");
                    }
                    if (!C16698b.a(p10)) {
                        this.f139431a.log("");
                        this.f139431a.log("<-- END HTTP (binary " + p10.size() + str3);
                        return b12;
                    }
                    if (j10 != 0) {
                        this.f139431a.log("");
                        this.f139431a.log(p10.clone().w2(charset));
                    }
                    if (l10 != null) {
                        this.f139431a.log("<-- END HTTP (" + p10.size() + "-byte, " + l10 + "-gzipped-byte body)");
                    } else {
                        this.f139431a.log("<-- END HTTP (" + p10.size() + str6);
                    }
                }
            }
            return b12;
        } catch (Exception e11) {
            Exception exc = e11;
            this.f139431a.log("<-- HTTP FAILED: " + exc);
            throw exc;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16697a(b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? b.f139435b : bVar);
    }
}
