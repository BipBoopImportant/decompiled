package GK;

import GK.C15774B;
import GK.C15776D;
import GK.C15802u;
import HJ.C15854t;
import HK.C15864d;
import JK.C15973b;
import JK.C15974c;
import JK.C15975d;
import KK.e;
import MK.f;
import MK.k;
import PK.C16212a;
import QK.C16354j;
import WK.C16770e;
import WK.C16771f;
import WK.C16772g;
import WK.C16773h;
import WK.C16779n;
import WK.C16780o;
import WK.L;
import WK.N;
import WK.y;
import XH.C16807N;
import YH.C16877v;
import YH.g0;
import com.adjust.sdk.Constants;
import jI.C17416c;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import org.slf4j.Marker;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0004)/\u0010\u0015B!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0018\u00010\fR\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000fH\u0000¢\u0006\u0004\b(\u0010\"R\u001a\u0010-\u001a\u00020\r8\u0000X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00108\u001a\u00020.8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0010\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\u0016\u00109\u001a\u00020.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u00100R\u0016\u0010:\u001a\u00020.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u00100R\u0016\u0010;\u001a\u00020.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00100¨\u0006<"}, d2 = {"LGK/c;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Ljava/io/File;", "directory", "", "maxSize", "LPK/a;", "fileSystem", "<init>", "(Ljava/io/File;JLPK/a;)V", "(Ljava/io/File;J)V", "LJK/d$b;", "LJK/d;", "editor", "LXH/N;", "c", "(LJK/d$b;)V", "LGK/B;", "request", "LGK/D;", "d", "(LGK/B;)LGK/D;", "response", "LJK/b;", "g", "(LGK/D;)LJK/b;", "h", "(LGK/B;)V", "cached", "network", "q", "(LGK/D;LGK/D;)V", "flush", "()V", "close", "LJK/c;", "cacheStrategy", "o", "(LJK/c;)V", "n", "a", "LJK/d;", "getCache$okhttp", "()LJK/d;", "cache", "", "b", "I", "f", "()I", "l", "(I)V", "writeSuccessCount", "e", "i", "writeAbortCount", "networkCount", "hitCount", "requestCount", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.c  reason: case insensitive filesystem */
public final class C15784c implements Closeable, Flushable {

    /* renamed from: g  reason: collision with root package name */
    public static final b f134853g = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C15975d f134854a;

    /* renamed from: b  reason: collision with root package name */
    private int f134855b;

    /* renamed from: c  reason: collision with root package name */
    private int f134856c;

    /* renamed from: d  reason: collision with root package name */
    private int f134857d;

    /* renamed from: e  reason: collision with root package name */
    private int f134858e;

    /* renamed from: f  reason: collision with root package name */
    private int f134859f;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LGK/c$a;", "LGK/E;", "LJK/d$d;", "LJK/d;", "snapshot", "", "contentType", "contentLength", "<init>", "(LJK/d$d;Ljava/lang/String;Ljava/lang/String;)V", "LGK/x;", "h", "()LGK/x;", "", "g", "()J", "LWK/g;", "k3", "()LWK/g;", "c", "LJK/d$d;", "n", "()LJK/d$d;", "d", "Ljava/lang/String;", "e", "f", "LWK/g;", "bodySource", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.c$a */
    private static final class a extends C15777E {

        /* renamed from: c  reason: collision with root package name */
        private final C15975d.C3341d f134860c;

        /* renamed from: d  reason: collision with root package name */
        private final String f134861d;

        /* renamed from: e  reason: collision with root package name */
        private final String f134862e;

        /* renamed from: f  reason: collision with root package name */
        private final C16772g f134863f;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"GK/c$a$a", "LWK/o;", "LXH/N;", "close", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: GK.c$a$a  reason: collision with other inner class name */
        public static final class C3319a extends C16780o {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f134864b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3319a(N n10, a aVar) {
                super(n10);
                this.f134864b = aVar;
            }

            public void close() {
                this.f134864b.n().close();
                super.close();
            }
        }

        public a(C15975d.C3341d dVar, String str, String str2) {
            C17542s.j(dVar, "snapshot");
            this.f134860c = dVar;
            this.f134861d = str;
            this.f134862e = str2;
            this.f134863f = y.d(new C3319a(dVar.d(1), this));
        }

        public long g() {
            String str = this.f134862e;
            if (str != null) {
                return C15864d.Y(str, -1);
            }
            return -1;
        }

        public C15805x h() {
            String str = this.f134861d;
            if (str != null) {
                return C15805x.f135130e.b(str);
            }
            return null;
        }

        public C16772g k3() {
            return this.f134863f;
        }

        public final C15975d.C3341d n() {
            return this.f134860c;
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u00020\u001b*\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u00020\u0004*\u00020\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00138\u0002XT¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00138\u0002XT¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u00138\u0002XT¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\u00138\u0002XT¢\u0006\u0006\n\u0004\b&\u0010#¨\u0006'"}, d2 = {"LGK/c$b;", "", "<init>", "()V", "LGK/u;", "", "", "d", "(LGK/u;)Ljava/util/Set;", "requestHeaders", "responseHeaders", "e", "(LGK/u;LGK/u;)LGK/u;", "LGK/v;", "url", "b", "(LGK/v;)Ljava/lang/String;", "LWK/g;", "source", "", "c", "(LWK/g;)I", "LGK/D;", "cachedResponse", "cachedRequest", "LGK/B;", "newRequest", "", "g", "(LGK/D;LGK/u;LGK/B;)Z", "a", "(LGK/D;)Z", "f", "(LGK/D;)LGK/u;", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.c$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Set<String> d(C15802u uVar) {
            int size = uVar.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (C15854t.H("Vary", uVar.k(i10), true)) {
                    String t10 = uVar.t(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(C15854t.J(V.f144353a));
                    }
                    for (String z12 : C15854t.X0(t10, new char[]{','}, false, 0, 6, (Object) null)) {
                        treeSet.add(C15854t.z1(z12).toString());
                    }
                }
            }
            return treeSet == null ? g0.d() : treeSet;
        }

        private final C15802u e(C15802u uVar, C15802u uVar2) {
            Set<String> d10 = d(uVar2);
            if (d10.isEmpty()) {
                return C15864d.f135357b;
            }
            C15802u.a aVar = new C15802u.a();
            int size = uVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                String k10 = uVar.k(i10);
                if (d10.contains(k10)) {
                    aVar.a(k10, uVar.t(i10));
                }
            }
            return aVar.f();
        }

        public final boolean a(C15776D d10) {
            C17542s.j(d10, "<this>");
            return d(d10.q()).contains(Marker.ANY_MARKER);
        }

        public final String b(C15803v vVar) {
            C17542s.j(vVar, "url");
            return C16773h.f139664d.d(vVar.toString()).P().G();
        }

        public final int c(C16772g gVar) {
            C17542s.j(gVar, "source");
            try {
                long g22 = gVar.g2();
                String Z02 = gVar.Z0();
                if (g22 >= 0 && g22 <= 2147483647L && Z02.length() <= 0) {
                    return (int) g22;
                }
                throw new IOException("expected an int but was \"" + g22 + Z02 + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final C15802u f(C15776D d10) {
            C17542s.j(d10, "<this>");
            C15776D t10 = d10.t();
            C17542s.g(t10);
            return e(t10.z().e(), d10.q());
        }

        public final boolean g(C15776D d10, C15802u uVar, C15774B b10) {
            C17542s.j(d10, "cachedResponse");
            C17542s.j(uVar, "cachedRequest");
            C17542s.j(b10, "newRequest");
            Iterable<String> d11 = d(d10.q());
            if ((d11 instanceof Collection) && ((Collection) d11).isEmpty()) {
                return true;
            }
            for (String str : d11) {
                if (!C17542s.e(uVar.x(str), b10.f(str))) {
                    return false;
                }
            }
            return true;
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016\"\u0004\b\u0014\u0010\u0017¨\u0006\u0019"}, d2 = {"LGK/c$d;", "LJK/b;", "LJK/d$b;", "LJK/d;", "editor", "<init>", "(LGK/c;LJK/d$b;)V", "LXH/N;", "k", "()V", "LWK/L;", "a", "()LWK/L;", "LJK/d$b;", "b", "LWK/L;", "cacheOut", "c", "body", "", "d", "Z", "()Z", "(Z)V", "done", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.c$d */
    private final class d implements C15973b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final C15975d.b f134878a;

        /* renamed from: b  reason: collision with root package name */
        private final L f134879b;

        /* renamed from: c  reason: collision with root package name */
        private final L f134880c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f134881d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15784c f134882e;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"GK/c$d$a", "LWK/n;", "LXH/N;", "close", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: GK.c$d$a */
        public static final class a extends C16779n {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C15784c f134883b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ d f134884c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C15784c cVar, d dVar, L l10) {
                super(l10);
                this.f134883b = cVar;
                this.f134884c = dVar;
            }

            public void close() {
                C15784c cVar = this.f134883b;
                d dVar = this.f134884c;
                synchronized (cVar) {
                    if (!dVar.c()) {
                        dVar.d(true);
                        cVar.l(cVar.f() + 1);
                        super.close();
                        this.f134884c.f134878a.b();
                    }
                }
            }
        }

        public d(C15784c cVar, C15975d.b bVar) {
            C17542s.j(bVar, "editor");
            this.f134882e = cVar;
            this.f134878a = bVar;
            L f10 = bVar.f(1);
            this.f134879b = f10;
            this.f134880c = new a(cVar, this, f10);
        }

        public L a() {
            return this.f134880c;
        }

        public final boolean c() {
            return this.f134881d;
        }

        public final void d(boolean z10) {
            this.f134881d = z10;
        }

        public void k() {
            C15784c cVar = this.f134882e;
            synchronized (cVar) {
                if (!this.f134881d) {
                    this.f134881d = true;
                    cVar.i(cVar.e() + 1);
                    C15864d.m(this.f134879b);
                    try {
                        this.f134878a.a();
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    public C15784c(File file, long j10, C16212a aVar) {
        C17542s.j(file, "directory");
        C17542s.j(aVar, "fileSystem");
        this.f134854a = new C15975d(aVar, file, 201105, 2, j10, e.f135927i);
    }

    private final void c(C15975d.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException unused) {
            }
        }
    }

    public void close() {
        this.f134854a.close();
    }

    public final C15776D d(C15774B b10) {
        C17542s.j(b10, "request");
        try {
            C15975d.C3341d u10 = this.f134854a.u(f134853g.b(b10.k()));
            if (u10 == null) {
                return null;
            }
            try {
                C3320c cVar = new C3320c(u10.d(0));
                C15776D d10 = cVar.d(u10);
                if (cVar.b(b10, d10)) {
                    return d10;
                }
                C15777E c10 = d10.c();
                if (c10 != null) {
                    C15864d.m(c10);
                }
                return null;
            } catch (IOException unused) {
                C15864d.m(u10);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    public final int e() {
        return this.f134856c;
    }

    public final int f() {
        return this.f134855b;
    }

    public void flush() {
        this.f134854a.flush();
    }

    public final C15973b g(C15776D d10) {
        C15975d.b bVar;
        C17542s.j(d10, "response");
        String h10 = d10.z().h();
        if (f.f136460a.a(d10.z().h())) {
            try {
                h(d10.z());
            } catch (IOException unused) {
            }
            return null;
        } else if (!C17542s.e(h10, "GET")) {
            return null;
        } else {
            b bVar2 = f134853g;
            if (bVar2.a(d10)) {
                return null;
            }
            C3320c cVar = new C3320c(d10);
            try {
                bVar = C15975d.t(this.f134854a, bVar2.b(d10.z().k()), 0, 2, (Object) null);
                if (bVar == null) {
                    return null;
                }
                try {
                    cVar.f(bVar);
                    return new d(this, bVar);
                } catch (IOException unused2) {
                    c(bVar);
                    return null;
                }
            } catch (IOException unused3) {
                bVar = null;
                c(bVar);
                return null;
            }
        }
    }

    public final void h(C15774B b10) {
        C17542s.j(b10, "request");
        this.f134854a.h0(f134853g.b(b10.k()));
    }

    public final void i(int i10) {
        this.f134856c = i10;
    }

    public final void l(int i10) {
        this.f134855b = i10;
    }

    public final synchronized void n() {
        this.f134858e++;
    }

    public final synchronized void o(C15974c cVar) {
        try {
            C17542s.j(cVar, "cacheStrategy");
            this.f134859f++;
            if (cVar.b() != null) {
                this.f134857d++;
            } else if (cVar.a() != null) {
                this.f134858e++;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final void q(C15776D d10, C15776D d11) {
        C15975d.b bVar;
        C17542s.j(d10, "cached");
        C17542s.j(d11, "network");
        C3320c cVar = new C3320c(d11);
        C15777E c10 = d10.c();
        C17542s.h(c10, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            bVar = ((a) c10).n().c();
            if (bVar != null) {
                try {
                    cVar.f(bVar);
                    bVar.b();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            bVar = null;
            c(bVar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15784c(File file, long j10) {
        this(file, j10, C16212a.f137205b);
        C17542s.j(file, "directory");
    }

    @Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\b\u0002\u0018\u0000 B2\u00020\u0001:\u0001$B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0015R\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00062\n\u0010 \u001a\u00060\u001fR\u00020\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u00101R\u0014\u00103\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010+R\u0014\u00105\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010(R\u0016\u00109\u001a\u0004\u0018\u0001068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020:8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010A\u001a\u00020\u001c8BX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010@¨\u0006C"}, d2 = {"LGK/c$c;", "", "LWK/N;", "rawSource", "<init>", "(LWK/N;)V", "LGK/D;", "response", "(LGK/D;)V", "LWK/g;", "source", "", "Ljava/security/cert/Certificate;", "c", "(LWK/g;)Ljava/util/List;", "LWK/f;", "sink", "certificates", "LXH/N;", "e", "(LWK/f;Ljava/util/List;)V", "LJK/d$b;", "LJK/d;", "editor", "f", "(LJK/d$b;)V", "LGK/B;", "request", "", "b", "(LGK/B;LGK/D;)Z", "LJK/d$d;", "snapshot", "d", "(LJK/d$d;)LGK/D;", "LGK/v;", "a", "LGK/v;", "url", "LGK/u;", "LGK/u;", "varyHeaders", "", "Ljava/lang/String;", "requestMethod", "LGK/A;", "LGK/A;", "protocol", "", "I", "code", "message", "g", "responseHeaders", "LGK/t;", "h", "LGK/t;", "handshake", "", "i", "J", "sentRequestMillis", "j", "receivedResponseMillis", "()Z", "isHttps", "k", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.c$c  reason: collision with other inner class name */
    private static final class C3320c {

        /* renamed from: k  reason: collision with root package name */
        public static final a f134865k = new a((DefaultConstructorMarker) null);

        /* renamed from: l  reason: collision with root package name */
        private static final String f134866l;

        /* renamed from: m  reason: collision with root package name */
        private static final String f134867m;

        /* renamed from: a  reason: collision with root package name */
        private final C15803v f134868a;

        /* renamed from: b  reason: collision with root package name */
        private final C15802u f134869b;

        /* renamed from: c  reason: collision with root package name */
        private final String f134870c;

        /* renamed from: d  reason: collision with root package name */
        private final C15773A f134871d;

        /* renamed from: e  reason: collision with root package name */
        private final int f134872e;

        /* renamed from: f  reason: collision with root package name */
        private final String f134873f;

        /* renamed from: g  reason: collision with root package name */
        private final C15802u f134874g;

        /* renamed from: h  reason: collision with root package name */
        private final C15801t f134875h;

        /* renamed from: i  reason: collision with root package name */
        private final long f134876i;

        /* renamed from: j  reason: collision with root package name */
        private final long f134877j;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LGK/c$c$a;", "", "<init>", "()V", "", "RECEIVED_MILLIS", "Ljava/lang/String;", "SENT_MILLIS", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: GK.c$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        static {
            StringBuilder sb2 = new StringBuilder();
            C16354j.a aVar = C16354j.f137719a;
            sb2.append(aVar.g().g());
            sb2.append("-Sent-Millis");
            f134866l = sb2.toString();
            f134867m = aVar.g().g() + "-Received-Millis";
        }

        public C3320c(N n10) {
            C15779G g10;
            C17542s.j(n10, "rawSource");
            try {
                C16772g d10 = y.d(n10);
                String Z02 = d10.Z0();
                C15803v f10 = C15803v.f135109k.f(Z02);
                if (f10 != null) {
                    this.f134868a = f10;
                    this.f134870c = d10.Z0();
                    C15802u.a aVar = new C15802u.a();
                    int c10 = C15784c.f134853g.c(d10);
                    for (int i10 = 0; i10 < c10; i10++) {
                        aVar.c(d10.Z0());
                    }
                    this.f134869b = aVar.f();
                    k a10 = k.f136476d.a(d10.Z0());
                    this.f134871d = a10.f136477a;
                    this.f134872e = a10.f136478b;
                    this.f134873f = a10.f136479c;
                    C15802u.a aVar2 = new C15802u.a();
                    int c11 = C15784c.f134853g.c(d10);
                    for (int i11 = 0; i11 < c11; i11++) {
                        aVar2.c(d10.Z0());
                    }
                    String str = f134866l;
                    String g11 = aVar2.g(str);
                    String str2 = f134867m;
                    String g12 = aVar2.g(str2);
                    aVar2.i(str);
                    aVar2.i(str2);
                    long j10 = 0;
                    this.f134876i = g11 != null ? Long.parseLong(g11) : 0;
                    this.f134877j = g12 != null ? Long.parseLong(g12) : j10;
                    this.f134874g = aVar2.f();
                    if (a()) {
                        String Z03 = d10.Z0();
                        if (Z03.length() <= 0) {
                            C15790i b10 = C15790i.f134976b.b(d10.Z0());
                            List<Certificate> c12 = c(d10);
                            List<Certificate> c13 = c(d10);
                            if (!d10.Y1()) {
                                g10 = C15779G.Companion.a(d10.Z0());
                            } else {
                                g10 = C15779G.SSL_3_0;
                            }
                            this.f134875h = C15801t.f135098e.a(g10, b10, c12, c13);
                        } else {
                            throw new IOException("expected \"\" but was \"" + Z03 + '\"');
                        }
                    } else {
                        this.f134875h = null;
                    }
                    C16807N n11 = C16807N.f139792a;
                    C17416c.a(n10, (Throwable) null);
                    return;
                }
                IOException iOException = new IOException("Cache corruption for " + Z02);
                C16354j.f137719a.g().k("cache corruption", 5, iOException);
                throw iOException;
            } catch (Throwable th2) {
                C17416c.a(n10, th);
                throw th2;
            }
        }

        private final boolean a() {
            return C17542s.e(this.f134868a.t(), Constants.SCHEME);
        }

        private final List<Certificate> c(C16772g gVar) {
            int c10 = C15784c.f134853g.c(gVar);
            if (c10 == -1) {
                return C16877v.n();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(c10);
                int i10 = 0;
                while (i10 < c10) {
                    String Z02 = gVar.Z0();
                    C16770e eVar = new C16770e();
                    C16773h a10 = C16773h.f139664d.a(Z02);
                    if (a10 != null) {
                        eVar.j2(a10);
                        arrayList.add(instance.generateCertificate(eVar.q3()));
                        i10++;
                    } else {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void e(C16771f fVar, List<? extends Certificate> list) {
            try {
                fVar.u1((long) list.size()).Z1(10);
                for (Certificate encoded : list) {
                    byte[] encoded2 = encoded.getEncoded();
                    C16773h.a aVar = C16773h.f139664d;
                    C17542s.i(encoded2, "bytes");
                    fVar.D0(C16773h.a.f(aVar, encoded2, 0, 0, 3, (Object) null).a()).Z1(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean b(C15774B b10, C15776D d10) {
            C17542s.j(b10, "request");
            C17542s.j(d10, "response");
            return C17542s.e(this.f134868a, b10.k()) && C17542s.e(this.f134870c, b10.h()) && C15784c.f134853g.g(d10, this.f134869b, b10);
        }

        public final C15776D d(C15975d.C3341d dVar) {
            C17542s.j(dVar, "snapshot");
            String b10 = this.f134874g.b("Content-Type");
            String b11 = this.f134874g.b("Content-Length");
            return new C15776D.a().r(new C15774B.a().m(this.f134868a).g(this.f134870c, (C15775C) null).f(this.f134869b).b()).p(this.f134871d).g(this.f134872e).m(this.f134873f).k(this.f134874g).b(new a(dVar, b10, b11)).i(this.f134875h).s(this.f134876i).q(this.f134877j).c();
        }

        public final void f(C15975d.b bVar) {
            C17542s.j(bVar, "editor");
            C16771f c10 = y.c(bVar.f(0));
            try {
                c10.D0(this.f134868a.toString()).Z1(10);
                c10.D0(this.f134870c).Z1(10);
                c10.u1((long) this.f134869b.size()).Z1(10);
                int size = this.f134869b.size();
                for (int i10 = 0; i10 < size; i10++) {
                    c10.D0(this.f134869b.k(i10)).D0(": ").D0(this.f134869b.t(i10)).Z1(10);
                }
                c10.D0(new k(this.f134871d, this.f134872e, this.f134873f).toString()).Z1(10);
                c10.u1((long) (this.f134874g.size() + 2)).Z1(10);
                int size2 = this.f134874g.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c10.D0(this.f134874g.k(i11)).D0(": ").D0(this.f134874g.t(i11)).Z1(10);
                }
                c10.D0(f134866l).D0(": ").u1(this.f134876i).Z1(10);
                c10.D0(f134867m).D0(": ").u1(this.f134877j).Z1(10);
                if (a()) {
                    c10.Z1(10);
                    C15801t tVar = this.f134875h;
                    C17542s.g(tVar);
                    c10.D0(tVar.a().c()).Z1(10);
                    e(c10, this.f134875h.d());
                    e(c10, this.f134875h.c());
                    c10.D0(this.f134875h.e().b()).Z1(10);
                }
                C16807N n10 = C16807N.f139792a;
                C17416c.a(c10, (Throwable) null);
            } catch (Throwable th2) {
                C17416c.a(c10, th);
                throw th2;
            }
        }

        public C3320c(C15776D d10) {
            C17542s.j(d10, "response");
            this.f134868a = d10.z().k();
            this.f134869b = C15784c.f134853g.f(d10);
            this.f134870c = d10.z().h();
            this.f134871d = d10.w();
            this.f134872e = d10.g();
            this.f134873f = d10.s();
            this.f134874g = d10.q();
            this.f134875h = d10.i();
            this.f134876i = d10.B();
            this.f134877j = d10.x();
        }
    }
}
