package o7;

import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import k7.h;
import k7.o;
import k7.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l7.C8533b;
import m7.c;
import m7.e;
import m7.f;
import o7.c;
import o7.o;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 A2\u00020\u0001:\u0001BB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u001d\u0010\r\u001a\u0004\u0018\u00010\f8FX\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u00102\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u000b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b3\u00101R\u0011\u00107\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u00109\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b8\u00101R\u0011\u0010;\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b:\u00101R\u0013\u0010>\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0013\u0010@\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b?\u0010=¨\u0006C"}, d2 = {"Lo7/l;", "Lk7/o;", "Lk7/x;", "sequence", "<init>", "(Lk7/x;)V", "", "toString", "()Ljava/lang/String;", "Lo7/q;", "version", "issuer", "Lo7/j;", "extensions", "o", "(Lo7/q;Lk7/x;Lo7/j;)Lo7/l;", "e", "Lk7/x;", "Lm7/c;", "f", "Lm7/c;", "i", "()Lm7/c;", "tag", "Ll7/b;", "g", "Ll7/b;", "()Ll7/b;", "encoded", "Lk7/h;", "h", "Lk7/h;", "u", "()Lk7/h;", "logger", "", "I", "versionOffset", "j", "LXH/o;", "r", "()Lo7/j;", "B", "()Lo7/q;", "Lo7/c;", "v", "()Lo7/c;", "serialNumber", "w", "()Lk7/x;", "signature", "s", "Lo7/o;", "A", "()Lo7/o;", "validity", "x", "subject", "y", "subjectPublicKeyInfo", "t", "()Lk7/o;", "issuerUniqueIdentifier", "z", "subjectUniqueIdentifier", "k", "a", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends o {

    /* renamed from: k  reason: collision with root package name */
    public static final a f55274k = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private final x f55275e;

    /* renamed from: f  reason: collision with root package name */
    private final c f55276f;

    /* renamed from: g  reason: collision with root package name */
    private final C8533b f55277g;

    /* renamed from: h  reason: collision with root package name */
    private final h f55278h;

    /* renamed from: i  reason: collision with root package name */
    private final int f55279i;

    /* renamed from: j  reason: collision with root package name */
    private final C16824o f55280j;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo7/l$a;", "", "<init>", "()V", "Lk7/x;", "sequence", "Lo7/l;", "a", "(Lk7/x;)Lo7/l;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(x xVar) {
            C17542s.j(xVar, "sequence");
            return new l(xVar, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ l(x xVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(xVar);
    }

    public static /* synthetic */ l p(l lVar, q qVar, x xVar, j jVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qVar = lVar.B();
        }
        if ((i10 & 2) != 0) {
            xVar = lVar.s();
        }
        if ((i10 & 4) != 0) {
            jVar = lVar.r();
        }
        return lVar.o(qVar, xVar, jVar);
    }

    /* access modifiers changed from: private */
    public static final j q(l lVar) {
        Object obj;
        Iterator it = lVar.f55275e.q().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            o oVar = (o) obj;
            if (oVar.i().c() == e.ContextSpecific && oVar.i().d() == f.Constructed) {
                BigInteger e10 = oVar.i().e();
                BigInteger valueOf = BigInteger.valueOf((long) 3);
                C17542s.i(valueOf, "valueOf(...)");
                if (C17542s.e(e10, valueOf)) {
                    break;
                }
            }
        }
        if (obj instanceof j) {
            return (j) obj;
        }
        return null;
    }

    public final o A() {
        o.a aVar = o.f55283h;
        k7.o oVar = this.f55275e.q().get(this.f55279i + 3);
        C17542s.h(oVar, "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.utils.asn1.ASN1Sequence");
        return aVar.a((x) oVar);
    }

    public final q B() {
        k7.o oVar = this.f55275e.q().get(0);
        if (oVar instanceof q) {
            return (q) oVar;
        }
        return null;
    }

    public C8533b g() {
        return this.f55277g;
    }

    public c i() {
        return this.f55276f;
    }

    public final l o(q qVar, x xVar, j jVar) {
        C17542s.j(xVar, "issuer");
        List c10 = C16877v.c();
        if (qVar != null) {
            c10.add(qVar);
        }
        c10.add(v());
        c10.add(w());
        c10.add(xVar);
        c10.add(A());
        c10.add(x());
        c10.add(y());
        k7.o t10 = t();
        if (t10 != null) {
            c10.add(t10);
        }
        k7.o z10 = z();
        if (z10 != null) {
            c10.add(z10);
        }
        if (jVar != null) {
            c10.add(jVar);
        }
        return f55274k.a(x.f54341i.a(new c(e.Universal, f.Constructed, 16, 1), C16877v.a(c10), u()));
    }

    public final j r() {
        return (j) this.f55280j.getValue();
    }

    public final x s() {
        k7.o oVar = this.f55275e.q().get(this.f55279i + 2);
        C17542s.h(oVar, "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.utils.asn1.ASN1Sequence");
        return (x) oVar;
    }

    public final k7.o t() {
        Object obj;
        Iterator it = this.f55275e.q().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            k7.o oVar = (k7.o) obj;
            if (oVar.i().c() == e.ContextSpecific && oVar.i().d() == f.Constructed) {
                BigInteger e10 = oVar.i().e();
                BigInteger valueOf = BigInteger.valueOf(1);
                C17542s.i(valueOf, "valueOf(...)");
                if (C17542s.e(e10, valueOf)) {
                    break;
                }
            }
        }
        return (k7.o) obj;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TbsCertificate\n  version=");
        q B10 = B();
        sb2.append(B10 != null ? B10.p() : 0);
        sb2.append(",\n  serialNumber=");
        sb2.append(v());
        sb2.append("\n  subjectUniqueIdentifier=");
        sb2.append(z());
        sb2.append("\n  extensions=");
        sb2.append(r());
        return sb2.toString();
    }

    public h u() {
        return this.f55278h;
    }

    public final c v() {
        c.a aVar = c.f55252g;
        k7.o oVar = this.f55275e.q().get(this.f55279i);
        C17542s.h(oVar, "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.utils.asn1.ASN1Integer");
        return aVar.a((k7.f) oVar);
    }

    public final x w() {
        k7.o oVar = this.f55275e.q().get(this.f55279i + 1);
        C17542s.h(oVar, "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.utils.asn1.ASN1Sequence");
        return (x) oVar;
    }

    public final x x() {
        k7.o oVar = this.f55275e.q().get(this.f55279i + 4);
        C17542s.h(oVar, "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.utils.asn1.ASN1Sequence");
        return (x) oVar;
    }

    public final x y() {
        k7.o oVar = this.f55275e.q().get(this.f55279i + 5);
        C17542s.h(oVar, "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.utils.asn1.ASN1Sequence");
        return (x) oVar;
    }

    public final k7.o z() {
        Object obj;
        Iterator it = this.f55275e.q().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            k7.o oVar = (k7.o) obj;
            if (oVar.i().c() == e.ContextSpecific && oVar.i().d() == f.Constructed) {
                BigInteger e10 = oVar.i().e();
                BigInteger valueOf = BigInteger.valueOf((long) 2);
                C17542s.i(valueOf, "valueOf(...)");
                if (C17542s.e(e10, valueOf)) {
                    break;
                }
            }
        }
        return (k7.o) obj;
    }

    private l(x xVar) {
        this.f55275e = xVar;
        this.f55276f = xVar.i();
        this.f55277g = xVar.g();
        this.f55278h = xVar.p();
        this.f55279i = xVar.q().get(0) instanceof q ? 1 : 0;
        this.f55280j = C16825p.b(new k(this));
    }
}
