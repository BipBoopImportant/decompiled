package Cc;

import Ac.a;
import Gc.h;
import android.content.Context;
import com.adjust.sdk.Constants;
import com.google.firebase.perf.util.m;
import java.net.URI;

final class c extends e {

    /* renamed from: c  reason: collision with root package name */
    private static final a f58966c = a.e();

    /* renamed from: a  reason: collision with root package name */
    private final h f58967a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f58968b;

    c(h hVar, Context context) {
        this.f58968b = context;
        this.f58967a = hVar;
    }

    private URI g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            f58966c.k("getResultUrl throws exception %s", e10.getMessage());
            return null;
        }
    }

    private boolean h(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return m.a(uri, context);
    }

    private boolean i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    private boolean j(String str) {
        return i(str);
    }

    private boolean k(String str) {
        return str != null && !i(str) && str.length() <= 255;
    }

    private boolean m(int i10) {
        return i10 > 0;
    }

    private boolean n(long j10) {
        return j10 >= 0;
    }

    private boolean o(int i10) {
        return i10 == -1 || i10 > 0;
    }

    private boolean p(String str) {
        if (str == null) {
            return false;
        }
        return "http".equalsIgnoreCase(str) || Constants.SCHEME.equalsIgnoreCase(str);
    }

    private boolean q(long j10) {
        return j10 >= 0;
    }

    private boolean r(String str) {
        return str == null;
    }

    public boolean c() {
        if (j(this.f58967a.K())) {
            a aVar = f58966c;
            aVar.j("URL is missing:" + this.f58967a.K());
            return false;
        }
        URI g10 = g(this.f58967a.K());
        if (g10 == null) {
            f58966c.j("URL cannot be parsed");
            return false;
        } else if (!h(g10, this.f58968b)) {
            a aVar2 = f58966c;
            aVar2.j("URL fails allowlist rule: " + g10);
            return false;
        } else if (!k(g10.getHost())) {
            f58966c.j("URL host is null or invalid");
            return false;
        } else if (!p(g10.getScheme())) {
            f58966c.j("URL scheme is null or invalid");
            return false;
        } else if (!r(g10.getUserInfo())) {
            f58966c.j("URL user info is null");
            return false;
        } else if (!o(g10.getPort())) {
            f58966c.j("URL port is less than or equal to 0");
            return false;
        } else {
            if (!l(this.f58967a.M() ? this.f58967a.B() : null)) {
                a aVar3 = f58966c;
                aVar3.j("HTTP Method is null or invalid: " + this.f58967a.B());
                return false;
            } else if (this.f58967a.N() && !m(this.f58967a.C())) {
                a aVar4 = f58966c;
                aVar4.j("HTTP ResponseCode is a negative value:" + this.f58967a.C());
                return false;
            } else if (this.f58967a.O() && !n(this.f58967a.E())) {
                a aVar5 = f58966c;
                aVar5.j("Request Payload is a negative value:" + this.f58967a.E());
                return false;
            } else if (this.f58967a.P() && !n(this.f58967a.G())) {
                a aVar6 = f58966c;
                aVar6.j("Response Payload is a negative value:" + this.f58967a.G());
                return false;
            } else if (!this.f58967a.L() || this.f58967a.z() <= 0) {
                a aVar7 = f58966c;
                aVar7.j("Start time of the request is null, or zero, or a negative value:" + this.f58967a.z());
                return false;
            } else if (this.f58967a.Q() && !q(this.f58967a.H())) {
                a aVar8 = f58966c;
                aVar8.j("Time to complete the request is a negative value:" + this.f58967a.H());
                return false;
            } else if (this.f58967a.S() && !q(this.f58967a.J())) {
                a aVar9 = f58966c;
                aVar9.j("Time from the start of the request to the start of the response is null or a negative value:" + this.f58967a.J());
                return false;
            } else if (!this.f58967a.R() || this.f58967a.I() <= 0) {
                a aVar10 = f58966c;
                aVar10.j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f58967a.I());
                return false;
            } else if (this.f58967a.N()) {
                return true;
            } else {
                f58966c.j("Did not receive a HTTP Response Code");
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean l(h.d dVar) {
        return (dVar == null || dVar == h.d.HTTP_METHOD_UNKNOWN) ? false : true;
    }
}
