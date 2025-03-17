package M5;

import GK.C15776D;
import GK.C15785d;
import GK.C15802u;
import GK.C15805x;
import S5.j;
import WK.C16771f;
import WK.C16772g;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00148FX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010&\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010+\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"LM5/c;", "", "LWK/g;", "source", "<init>", "(LWK/g;)V", "LGK/D;", "response", "(LGK/D;)V", "LWK/f;", "sink", "LXH/N;", "k", "(LWK/f;)V", "LGK/d;", "a", "LXH/o;", "e", "()LGK/d;", "cacheControl", "LGK/x;", "b", "f", "()LGK/x;", "contentType", "", "c", "J", "i", "()J", "sentRequestAtMillis", "d", "g", "receivedResponseAtMillis", "", "Z", "j", "()Z", "isTls", "LGK/u;", "LGK/u;", "h", "()LGK/u;", "responseHeaders", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final C16824o f38501a;

    /* renamed from: b  reason: collision with root package name */
    private final C16824o f38502b;

    /* renamed from: c  reason: collision with root package name */
    private final long f38503c;

    /* renamed from: d  reason: collision with root package name */
    private final long f38504d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f38505e;

    /* renamed from: f  reason: collision with root package name */
    private final C15802u f38506f;

    public c(C16772g gVar) {
        s sVar = s.NONE;
        this.f38501a = C16825p.a(sVar, new a(this));
        this.f38502b = C16825p.a(sVar, new b(this));
        this.f38503c = Long.parseLong(gVar.Z0());
        this.f38504d = Long.parseLong(gVar.Z0());
        this.f38505e = Integer.parseInt(gVar.Z0()) > 0;
        int parseInt = Integer.parseInt(gVar.Z0());
        C15802u.a aVar = new C15802u.a();
        for (int i10 = 0; i10 < parseInt; i10++) {
            j.b(aVar, gVar.Z0());
        }
        this.f38506f = aVar.f();
    }

    /* access modifiers changed from: private */
    public static final C15785d c(c cVar) {
        return C15785d.f134885n.b(cVar.f38506f);
    }

    /* access modifiers changed from: private */
    public static final C15805x d(c cVar) {
        String b10 = cVar.f38506f.b("Content-Type");
        if (b10 != null) {
            return C15805x.f135130e.b(b10);
        }
        return null;
    }

    public final C15785d e() {
        return (C15785d) this.f38501a.getValue();
    }

    public final C15805x f() {
        return (C15805x) this.f38502b.getValue();
    }

    public final long g() {
        return this.f38504d;
    }

    public final C15802u h() {
        return this.f38506f;
    }

    public final long i() {
        return this.f38503c;
    }

    public final boolean j() {
        return this.f38505e;
    }

    public final void k(C16771f fVar) {
        fVar.u1(this.f38503c).Z1(10);
        fVar.u1(this.f38504d).Z1(10);
        fVar.u1(this.f38505e ? 1 : 0).Z1(10);
        fVar.u1((long) this.f38506f.size()).Z1(10);
        int size = this.f38506f.size();
        for (int i10 = 0; i10 < size; i10++) {
            fVar.D0(this.f38506f.k(i10)).D0(": ").D0(this.f38506f.t(i10)).Z1(10);
        }
    }

    public c(C15776D d10) {
        s sVar = s.NONE;
        this.f38501a = C16825p.a(sVar, new a(this));
        this.f38502b = C16825p.a(sVar, new b(this));
        this.f38503c = d10.B();
        this.f38504d = d10.x();
        this.f38505e = d10.i() != null;
        this.f38506f = d10.q();
    }
}
