package Bc;

import Ac.a;
import Dc.d;
import Fc.k;
import Gc.h;
import com.google.firebase.perf.application.b;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class g extends b implements Ec.b {

    /* renamed from: i  reason: collision with root package name */
    private static final a f58895i = a.e();

    /* renamed from: a  reason: collision with root package name */
    private final List<Ec.a> f58896a;

    /* renamed from: b  reason: collision with root package name */
    private final GaugeManager f58897b;

    /* renamed from: c  reason: collision with root package name */
    private final k f58898c;

    /* renamed from: d  reason: collision with root package name */
    private final h.b f58899d;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference<Ec.b> f58900e;

    /* renamed from: f  reason: collision with root package name */
    private String f58901f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f58902g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f58903h;

    private g(k kVar) {
        this(kVar, com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public static g c(k kVar) {
        return new g(kVar);
    }

    private boolean g() {
        return this.f58899d.I();
    }

    private boolean h() {
        return this.f58899d.L();
    }

    private static boolean i(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt > 127) {
                return false;
            }
        }
        return true;
    }

    public void a(Ec.a aVar) {
        if (aVar == null) {
            f58895i.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else if (g() && !h()) {
            this.f58896a.add(aVar);
        }
    }

    public h b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f58900e);
        unregisterForAppState();
        Gc.k[] b10 = Ec.a.b(d());
        if (b10 != null) {
            this.f58899d.E(Arrays.asList(b10));
        }
        h hVar = (h) this.f58899d.g();
        if (!d.c(this.f58901f)) {
            f58895i.a("Dropping network request from a 'User-Agent' that is not allowed");
            return hVar;
        } else if (!this.f58902g) {
            this.f58898c.B(hVar, getAppState());
            this.f58902g = true;
            return hVar;
        } else {
            if (this.f58903h) {
                f58895i.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return hVar;
        }
    }

    /* access modifiers changed from: package-private */
    public List<Ec.a> d() {
        List<Ec.a> unmodifiableList;
        synchronized (this.f58896a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Ec.a next : this.f58896a) {
                    if (next != null) {
                        arrayList.add(next);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } finally {
            }
        }
        return unmodifiableList;
    }

    public long e() {
        return this.f58899d.H();
    }

    public boolean f() {
        return this.f58899d.K();
    }

    public g j(String str) {
        h.d dVar;
        if (str != null) {
            h.d dVar2 = h.d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            char c10 = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c10 = 8;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    dVar = h.d.OPTIONS;
                    break;
                case 1:
                    dVar = h.d.GET;
                    break;
                case 2:
                    dVar = h.d.PUT;
                    break;
                case 3:
                    dVar = h.d.HEAD;
                    break;
                case 4:
                    dVar = h.d.POST;
                    break;
                case 5:
                    dVar = h.d.PATCH;
                    break;
                case 6:
                    dVar = h.d.TRACE;
                    break;
                case 7:
                    dVar = h.d.CONNECT;
                    break;
                case 8:
                    dVar = h.d.DELETE;
                    break;
                default:
                    dVar = h.d.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f58899d.N(dVar);
        }
        return this;
    }

    public g k(int i10) {
        this.f58899d.O(i10);
        return this;
    }

    public g l() {
        this.f58899d.P(h.e.GENERIC_CLIENT_ERROR);
        return this;
    }

    public g m(long j10) {
        this.f58899d.Q(j10);
        return this;
    }

    public g n(long j10) {
        Ec.a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f58900e);
        this.f58899d.M(j10);
        a(perfSession);
        if (perfSession.e()) {
            this.f58897b.collectGaugeMetricOnce(perfSession.d());
        }
        return this;
    }

    public g o(String str) {
        if (str == null) {
            this.f58899d.G();
            return this;
        }
        if (i(str)) {
            this.f58899d.R(str);
        } else {
            a aVar = f58895i;
            aVar.j("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    public g p(long j10) {
        this.f58899d.S(j10);
        return this;
    }

    public g q(long j10) {
        this.f58899d.T(j10);
        return this;
    }

    public g r(long j10) {
        this.f58899d.V(j10);
        if (SessionManager.getInstance().perfSession().e()) {
            this.f58897b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
        return this;
    }

    public g s(long j10) {
        this.f58899d.W(j10);
        return this;
    }

    public g t(String str) {
        if (str != null) {
            this.f58899d.X(o.e(o.d(str), 2000));
        }
        return this;
    }

    public g u(String str) {
        this.f58901f = str;
        return this;
    }

    public g(k kVar, com.google.firebase.perf.application.a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f58899d = h.T();
        this.f58900e = new WeakReference<>(this);
        this.f58898c = kVar;
        this.f58897b = gaugeManager;
        this.f58896a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }
}
