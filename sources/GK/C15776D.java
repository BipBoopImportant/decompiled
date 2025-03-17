package GK;

import GK.C15802u;
import LK.c;
import MK.e;
import YH.C16877v;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001*B}\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\r\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b#\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007¢\u0006\f\n\u0004\b7\u0010@\u001a\u0004\b2\u0010AR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b;\u0010C\u001a\u0004\b9\u0010ER\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bG\u0010ER\u0017\u0010\u0014\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0015\u001a\u00020\u00138\u0007¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bM\u0010KR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0001X\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bB\u0010PR\u0018\u0010S\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010RR\u0011\u0010W\u001a\u00020T8F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0011\u0010Y\u001a\u00020Q8G¢\u0006\u0006\u001a\u0004\b5\u0010X¨\u0006Z"}, d2 = {"LGK/D;", "Ljava/io/Closeable;", "LGK/B;", "request", "LGK/A;", "protocol", "", "message", "", "code", "LGK/t;", "handshake", "LGK/u;", "headers", "LGK/E;", "body", "networkResponse", "cacheResponse", "priorResponse", "", "sentRequestAtMillis", "receivedResponseAtMillis", "LLK/c;", "exchange", "<init>", "(LGK/B;LGK/A;Ljava/lang/String;ILGK/t;LGK/u;LGK/E;LGK/D;LGK/D;LGK/D;JJLLK/c;)V", "name", "defaultValue", "n", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "LGK/D$a;", "u", "()LGK/D$a;", "", "LGK/h;", "f", "()Ljava/util/List;", "LXH/N;", "close", "()V", "toString", "()Ljava/lang/String;", "a", "LGK/B;", "z", "()LGK/B;", "b", "LGK/A;", "w", "()LGK/A;", "c", "Ljava/lang/String;", "s", "d", "I", "g", "()I", "e", "LGK/t;", "i", "()LGK/t;", "LGK/u;", "q", "()LGK/u;", "LGK/E;", "()LGK/E;", "h", "LGK/D;", "t", "()LGK/D;", "j", "v", "k", "J", "B", "()J", "l", "x", "m", "LLK/c;", "()LLK/c;", "LGK/d;", "LGK/d;", "lazyCacheControl", "", "e1", "()Z", "isSuccessful", "()LGK/d;", "cacheControl", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GK.D  reason: case insensitive filesystem */
public final class C15776D implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final C15774B f134799a;

    /* renamed from: b  reason: collision with root package name */
    private final C15773A f134800b;

    /* renamed from: c  reason: collision with root package name */
    private final String f134801c;

    /* renamed from: d  reason: collision with root package name */
    private final int f134802d;

    /* renamed from: e  reason: collision with root package name */
    private final C15801t f134803e;

    /* renamed from: f  reason: collision with root package name */
    private final C15802u f134804f;

    /* renamed from: g  reason: collision with root package name */
    private final C15777E f134805g;

    /* renamed from: h  reason: collision with root package name */
    private final C15776D f134806h;

    /* renamed from: i  reason: collision with root package name */
    private final C15776D f134807i;

    /* renamed from: j  reason: collision with root package name */
    private final C15776D f134808j;

    /* renamed from: k  reason: collision with root package name */
    private final long f134809k;

    /* renamed from: l  reason: collision with root package name */
    private final long f134810l;

    /* renamed from: m  reason: collision with root package name */
    private final c f134811m;

    /* renamed from: n  reason: collision with root package name */
    private C15785d f134812n;

    public C15776D(C15774B b10, C15773A a10, String str, int i10, C15801t tVar, C15802u uVar, C15777E e10, C15776D d10, C15776D d11, C15776D d12, long j10, long j11, c cVar) {
        C17542s.j(b10, "request");
        C17542s.j(a10, "protocol");
        C17542s.j(str, "message");
        C17542s.j(uVar, "headers");
        this.f134799a = b10;
        this.f134800b = a10;
        this.f134801c = str;
        this.f134802d = i10;
        this.f134803e = tVar;
        this.f134804f = uVar;
        this.f134805g = e10;
        this.f134806h = d10;
        this.f134807i = d11;
        this.f134808j = d12;
        this.f134809k = j10;
        this.f134810l = j11;
        this.f134811m = cVar;
    }

    public static /* synthetic */ String o(C15776D d10, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return d10.n(str, str2);
    }

    public final long B() {
        return this.f134809k;
    }

    public final C15777E c() {
        return this.f134805g;
    }

    public void close() {
        C15777E e10 = this.f134805g;
        if (e10 != null) {
            e10.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final C15785d d() {
        C15785d dVar = this.f134812n;
        if (dVar != null) {
            return dVar;
        }
        C15785d b10 = C15785d.f134885n.b(this.f134804f);
        this.f134812n = b10;
        return b10;
    }

    public final C15776D e() {
        return this.f134807i;
    }

    public final boolean e1() {
        int i10 = this.f134802d;
        return 200 <= i10 && i10 < 300;
    }

    public final List<C15789h> f() {
        String str;
        C15802u uVar = this.f134804f;
        int i10 = this.f134802d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else if (i10 != 407) {
            return C16877v.n();
        } else {
            str = "Proxy-Authenticate";
        }
        return e.a(uVar, str);
    }

    public final int g() {
        return this.f134802d;
    }

    public final c h() {
        return this.f134811m;
    }

    public final C15801t i() {
        return this.f134803e;
    }

    public final String l(String str) {
        C17542s.j(str, "name");
        return o(this, str, (String) null, 2, (Object) null);
    }

    public final String n(String str, String str2) {
        C17542s.j(str, "name");
        String b10 = this.f134804f.b(str);
        return b10 == null ? str2 : b10;
    }

    public final C15802u q() {
        return this.f134804f;
    }

    public final String s() {
        return this.f134801c;
    }

    public final C15776D t() {
        return this.f134806h;
    }

    public String toString() {
        return "Response{protocol=" + this.f134800b + ", code=" + this.f134802d + ", message=" + this.f134801c + ", url=" + this.f134799a.k() + '}';
    }

    public final a u() {
        return new a(this);
    }

    public final C15776D v() {
        return this.f134808j;
    }

    public final C15773A w() {
        return this.f134800b;
    }

    public final long x() {
        return this.f134810l;
    }

    public final C15774B z() {
        return this.f134799a;
    }

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J!\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u00002\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010-\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u00100\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b0\u0010.J\u0019\u00102\u001a\u00020\u00002\b\u00101\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b2\u0010.J\u0017\u00105\u001a\u00020\u00002\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00002\u0006\u00107\u001a\u000203H\u0016¢\u0006\u0004\b8\u00106J\u0017\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u000209H\u0000¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010>R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b#\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b*\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\u0016\u001a\u00020\u00158\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b=\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b0\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\f\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010%\u001a\u00020X8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\n\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010)\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR$\u0010,\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bJ\u0010c\u001a\u0004\bd\u0010>\"\u0004\be\u0010\u0006R$\u0010/\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010c\u001a\u0004\bf\u0010>\"\u0004\bg\u0010\u0006R$\u00101\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b!\u0010c\u001a\u0004\bh\u0010>\"\u0004\bi\u0010\u0006R\"\u00104\u001a\u0002038\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b&\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u00107\u001a\u0002038\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b;\u0010j\u001a\u0004\bo\u0010l\"\u0004\bp\u0010nR$\u0010u\u001a\u0004\u0018\u0001098\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010<¨\u0006v"}, d2 = {"LGK/D$a;", "", "<init>", "()V", "LGK/D;", "response", "(LGK/D;)V", "", "name", "LXH/N;", "f", "(Ljava/lang/String;LGK/D;)V", "e", "LGK/B;", "request", "r", "(LGK/B;)LGK/D$a;", "LGK/A;", "protocol", "p", "(LGK/A;)LGK/D$a;", "", "code", "g", "(I)LGK/D$a;", "message", "m", "(Ljava/lang/String;)LGK/D$a;", "LGK/t;", "handshake", "i", "(LGK/t;)LGK/D$a;", "value", "j", "(Ljava/lang/String;Ljava/lang/String;)LGK/D$a;", "a", "LGK/u;", "headers", "k", "(LGK/u;)LGK/D$a;", "LGK/E;", "body", "b", "(LGK/E;)LGK/D$a;", "networkResponse", "n", "(LGK/D;)LGK/D$a;", "cacheResponse", "d", "priorResponse", "o", "", "sentRequestAtMillis", "s", "(J)LGK/D$a;", "receivedResponseAtMillis", "q", "LLK/c;", "deferredTrailers", "l", "(LLK/c;)V", "c", "()LGK/D;", "LGK/B;", "getRequest$okhttp", "()LGK/B;", "setRequest$okhttp", "(LGK/B;)V", "LGK/A;", "getProtocol$okhttp", "()LGK/A;", "setProtocol$okhttp", "(LGK/A;)V", "I", "h", "()I", "setCode$okhttp", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "setMessage$okhttp", "(Ljava/lang/String;)V", "LGK/t;", "getHandshake$okhttp", "()LGK/t;", "setHandshake$okhttp", "(LGK/t;)V", "LGK/u$a;", "LGK/u$a;", "getHeaders$okhttp", "()LGK/u$a;", "setHeaders$okhttp", "(LGK/u$a;)V", "LGK/E;", "getBody$okhttp", "()LGK/E;", "setBody$okhttp", "(LGK/E;)V", "LGK/D;", "getNetworkResponse$okhttp", "setNetworkResponse$okhttp", "getCacheResponse$okhttp", "setCacheResponse$okhttp", "getPriorResponse$okhttp", "setPriorResponse$okhttp", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "LLK/c;", "getExchange$okhttp", "()LLK/c;", "setExchange$okhttp", "exchange", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GK.D$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private C15774B f134813a;

        /* renamed from: b  reason: collision with root package name */
        private C15773A f134814b;

        /* renamed from: c  reason: collision with root package name */
        private int f134815c;

        /* renamed from: d  reason: collision with root package name */
        private String f134816d;

        /* renamed from: e  reason: collision with root package name */
        private C15801t f134817e;

        /* renamed from: f  reason: collision with root package name */
        private C15802u.a f134818f;

        /* renamed from: g  reason: collision with root package name */
        private C15777E f134819g;

        /* renamed from: h  reason: collision with root package name */
        private C15776D f134820h;

        /* renamed from: i  reason: collision with root package name */
        private C15776D f134821i;

        /* renamed from: j  reason: collision with root package name */
        private C15776D f134822j;

        /* renamed from: k  reason: collision with root package name */
        private long f134823k;

        /* renamed from: l  reason: collision with root package name */
        private long f134824l;

        /* renamed from: m  reason: collision with root package name */
        private c f134825m;

        public a() {
            this.f134815c = -1;
            this.f134818f = new C15802u.a();
        }

        private final void e(C15776D d10) {
            if (d10 != null && d10.c() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        private final void f(String str, C15776D d10) {
            if (d10 == null) {
                return;
            }
            if (d10.c() != null) {
                throw new IllegalArgumentException((str + ".body != null").toString());
            } else if (d10.t() != null) {
                throw new IllegalArgumentException((str + ".networkResponse != null").toString());
            } else if (d10.e() != null) {
                throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
            } else if (d10.v() != null) {
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        public a a(String str, String str2) {
            C17542s.j(str, "name");
            C17542s.j(str2, "value");
            this.f134818f.a(str, str2);
            return this;
        }

        public a b(C15777E e10) {
            this.f134819g = e10;
            return this;
        }

        public C15776D c() {
            int i10 = this.f134815c;
            if (i10 >= 0) {
                C15774B b10 = this.f134813a;
                if (b10 != null) {
                    C15773A a10 = this.f134814b;
                    if (a10 != null) {
                        String str = this.f134816d;
                        if (str != null) {
                            return new C15776D(b10, a10, str, i10, this.f134817e, this.f134818f.f(), this.f134819g, this.f134820h, this.f134821i, this.f134822j, this.f134823k, this.f134824l, this.f134825m);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("protocol == null");
                }
                throw new IllegalStateException("request == null");
            }
            throw new IllegalStateException(("code < 0: " + this.f134815c).toString());
        }

        public a d(C15776D d10) {
            f("cacheResponse", d10);
            this.f134821i = d10;
            return this;
        }

        public a g(int i10) {
            this.f134815c = i10;
            return this;
        }

        public final int h() {
            return this.f134815c;
        }

        public a i(C15801t tVar) {
            this.f134817e = tVar;
            return this;
        }

        public a j(String str, String str2) {
            C17542s.j(str, "name");
            C17542s.j(str2, "value");
            this.f134818f.j(str, str2);
            return this;
        }

        public a k(C15802u uVar) {
            C17542s.j(uVar, "headers");
            this.f134818f = uVar.p();
            return this;
        }

        public final void l(c cVar) {
            C17542s.j(cVar, "deferredTrailers");
            this.f134825m = cVar;
        }

        public a m(String str) {
            C17542s.j(str, "message");
            this.f134816d = str;
            return this;
        }

        public a n(C15776D d10) {
            f("networkResponse", d10);
            this.f134820h = d10;
            return this;
        }

        public a o(C15776D d10) {
            e(d10);
            this.f134822j = d10;
            return this;
        }

        public a p(C15773A a10) {
            C17542s.j(a10, "protocol");
            this.f134814b = a10;
            return this;
        }

        public a q(long j10) {
            this.f134824l = j10;
            return this;
        }

        public a r(C15774B b10) {
            C17542s.j(b10, "request");
            this.f134813a = b10;
            return this;
        }

        public a s(long j10) {
            this.f134823k = j10;
            return this;
        }

        public a(C15776D d10) {
            C17542s.j(d10, "response");
            this.f134815c = -1;
            this.f134813a = d10.z();
            this.f134814b = d10.w();
            this.f134815c = d10.g();
            this.f134816d = d10.s();
            this.f134817e = d10.i();
            this.f134818f = d10.q().p();
            this.f134819g = d10.c();
            this.f134820h = d10.t();
            this.f134821i = d10.e();
            this.f134822j = d10.v();
            this.f134823k = d10.B();
            this.f134824l = d10.x();
            this.f134825m = d10.h();
        }
    }
}
