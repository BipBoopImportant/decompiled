package OK;

import GK.C15773A;
import GK.C15774B;
import GK.C15776D;
import GK.C15802u;
import GK.z;
import HK.C15864d;
import LK.f;
import MK.d;
import MK.e;
import MK.g;
import MK.i;
import MK.k;
import WK.L;
import WK.N;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0018B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010,R\u0014\u00100\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010/R\u0016\u00102\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u00101¨\u00063"}, d2 = {"LOK/g;", "LMK/d;", "LGK/z;", "client", "LLK/f;", "connection", "LMK/g;", "chain", "LOK/f;", "http2Connection", "<init>", "(LGK/z;LLK/f;LMK/g;LOK/f;)V", "LGK/B;", "request", "", "contentLength", "LWK/L;", "e", "(LGK/B;J)LWK/L;", "LXH/N;", "c", "(LGK/B;)V", "g", "()V", "a", "", "expectContinue", "LGK/D$a;", "f", "(Z)LGK/D$a;", "LGK/D;", "response", "d", "(LGK/D;)J", "LWK/N;", "h", "(LGK/D;)LWK/N;", "cancel", "LLK/f;", "b", "()LLK/f;", "LMK/g;", "LOK/f;", "LOK/i;", "LOK/i;", "stream", "LGK/A;", "LGK/A;", "protocol", "Z", "canceled", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: OK.g  reason: case insensitive filesystem */
public final class C16177g implements d {

    /* renamed from: g  reason: collision with root package name */
    public static final a f137053g = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final List<String> f137054h = C15864d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final List<String> f137055i = C15864d.w("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    private final f f137056a;

    /* renamed from: b  reason: collision with root package name */
    private final g f137057b;

    /* renamed from: c  reason: collision with root package name */
    private final C16176f f137058c;

    /* renamed from: d  reason: collision with root package name */
    private volatile C16179i f137059d;

    /* renamed from: e  reason: collision with root package name */
    private final C15773A f137060e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f137061f;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00118\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0002XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00118\u0002XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\u00118\u0002XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001d\u001a\u00020\u00118\u0002XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013¨\u0006\u001e"}, d2 = {"LOK/g$a;", "", "<init>", "()V", "LGK/B;", "request", "", "LOK/c;", "a", "(LGK/B;)Ljava/util/List;", "LGK/u;", "headerBlock", "LGK/A;", "protocol", "LGK/D$a;", "b", "(LGK/u;LGK/A;)LGK/D$a;", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", "TE", "TRANSFER_ENCODING", "UPGRADE", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: OK.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<C16173c> a(C15774B b10) {
            C17542s.j(b10, "request");
            C15802u e10 = b10.e();
            ArrayList arrayList = new ArrayList(e10.size() + 4);
            arrayList.add(new C16173c(C16173c.f136943g, b10.h()));
            arrayList.add(new C16173c(C16173c.f136944h, i.f136473a.c(b10.k())));
            String d10 = b10.d("Host");
            if (d10 != null) {
                arrayList.add(new C16173c(C16173c.f136946j, d10));
            }
            arrayList.add(new C16173c(C16173c.f136945i, b10.k().t()));
            int size = e10.size();
            for (int i10 = 0; i10 < size; i10++) {
                String k10 = e10.k(i10);
                Locale locale = Locale.US;
                C17542s.i(locale, CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY);
                String lowerCase = k10.toLowerCase(locale);
                C17542s.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (!C16177g.f137054h.contains(lowerCase) || (C17542s.e(lowerCase, "te") && C17542s.e(e10.t(i10), "trailers"))) {
                    arrayList.add(new C16173c(lowerCase, e10.t(i10)));
                }
            }
            return arrayList;
        }

        public final C15776D.a b(C15802u uVar, C15773A a10) {
            C17542s.j(uVar, "headerBlock");
            C17542s.j(a10, "protocol");
            C15802u.a aVar = new C15802u.a();
            int size = uVar.size();
            k kVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                String k10 = uVar.k(i10);
                String t10 = uVar.t(i10);
                if (C17542s.e(k10, ":status")) {
                    k.a aVar2 = k.f136476d;
                    kVar = aVar2.a("HTTP/1.1 " + t10);
                } else if (!C16177g.f137055i.contains(k10)) {
                    aVar.d(k10, t10);
                }
            }
            if (kVar != null) {
                return new C15776D.a().p(a10).g(kVar.f136478b).m(kVar.f136479c).k(aVar.f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        private a() {
        }
    }

    public C16177g(z zVar, f fVar, g gVar, C16176f fVar2) {
        C17542s.j(zVar, "client");
        C17542s.j(fVar, "connection");
        C17542s.j(gVar, "chain");
        C17542s.j(fVar2, "http2Connection");
        this.f137056a = fVar;
        this.f137057b = gVar;
        this.f137058c = fVar2;
        List<C15773A> K10 = zVar.K();
        C15773A a10 = C15773A.H2_PRIOR_KNOWLEDGE;
        this.f137060e = !K10.contains(a10) ? C15773A.HTTP_2 : a10;
    }

    public void a() {
        C16179i iVar = this.f137059d;
        C17542s.g(iVar);
        iVar.n().close();
    }

    public f b() {
        return this.f137056a;
    }

    public void c(C15774B b10) {
        C17542s.j(b10, "request");
        if (this.f137059d == null) {
            this.f137059d = this.f137058c.E0(f137053g.a(b10), b10.a() != null);
            if (!this.f137061f) {
                C16179i iVar = this.f137059d;
                C17542s.g(iVar);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                iVar.v().g((long) this.f137057b.k(), timeUnit);
                C16179i iVar2 = this.f137059d;
                C17542s.g(iVar2);
                iVar2.E().g((long) this.f137057b.m(), timeUnit);
                return;
            }
            C16179i iVar3 = this.f137059d;
            C17542s.g(iVar3);
            iVar3.f(C16172b.CANCEL);
            throw new IOException("Canceled");
        }
    }

    public void cancel() {
        this.f137061f = true;
        C16179i iVar = this.f137059d;
        if (iVar != null) {
            iVar.f(C16172b.CANCEL);
        }
    }

    public long d(C15776D d10) {
        C17542s.j(d10, "response");
        if (!e.b(d10)) {
            return 0;
        }
        return C15864d.v(d10);
    }

    public L e(C15774B b10, long j10) {
        C17542s.j(b10, "request");
        C16179i iVar = this.f137059d;
        C17542s.g(iVar);
        return iVar.n();
    }

    public C15776D.a f(boolean z10) {
        C16179i iVar = this.f137059d;
        if (iVar != null) {
            C15776D.a b10 = f137053g.b(iVar.C(), this.f137060e);
            if (!z10 || b10.h() != 100) {
                return b10;
            }
            return null;
        }
        throw new IOException("stream wasn't created");
    }

    public void g() {
        this.f137058c.flush();
    }

    public N h(C15776D d10) {
        C17542s.j(d10, "response");
        C16179i iVar = this.f137059d;
        C17542s.g(iVar);
        return iVar.p();
    }
}
