package com.google.firebase.perf.config;

import android.content.Context;
import com.google.firebase.perf.util.f;
import com.google.firebase.perf.util.g;
import com.google.firebase.perf.util.o;
import wc.C10352a;

public class a {

    /* renamed from: d  reason: collision with root package name */
    private static final Ac.a f68526d = Ac.a.e();

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f68527e;

    /* renamed from: a  reason: collision with root package name */
    private final RemoteConfigManager f68528a;

    /* renamed from: b  reason: collision with root package name */
    private f f68529b;

    /* renamed from: c  reason: collision with root package name */
    private x f68530c;

    public a(RemoteConfigManager remoteConfigManager, f fVar, x xVar) {
        this.f68528a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f68529b = fVar == null ? new f() : fVar;
        this.f68530c = xVar == null ? x.f() : xVar;
    }

    private boolean H(long j10) {
        return j10 >= 0;
    }

    private boolean I(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String trim : str.split(";")) {
            if (trim.trim().equals(C10352a.f77590b)) {
                return true;
            }
        }
        return false;
    }

    private boolean J(long j10) {
        return j10 >= 0;
    }

    private boolean L(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    private boolean M(long j10) {
        return j10 > 0;
    }

    private boolean N(long j10) {
        return j10 > 0;
    }

    private g<Boolean> b(v<Boolean> vVar) {
        return this.f68530c.c(vVar.a());
    }

    private g<Double> c(v<Double> vVar) {
        return this.f68530c.d(vVar.a());
    }

    private g<Long> d(v<Long> vVar) {
        return this.f68530c.g(vVar.a());
    }

    private g<String> e(v<String> vVar) {
        return this.f68530c.h(vVar.a());
    }

    public static synchronized a g() {
        a aVar;
        synchronized (a.class) {
            try {
                if (f68527e == null) {
                    f68527e = new a((RemoteConfigManager) null, (f) null, (x) null);
                }
                aVar = f68527e;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return aVar;
    }

    private boolean k() {
        l e10 = l.e();
        g<Boolean> b10 = b(e10);
        g<Boolean> u10 = u(e10);
        if (!u10.d()) {
            return b10.d() ? b10.c().booleanValue() : e10.d().booleanValue();
        }
        if (this.f68528a.isLastFetchFailed()) {
            return false;
        }
        Boolean c10 = u10.c();
        if (b10 == null || !b10.d() || b10.c() != c10) {
            this.f68530c.n(e10.a(), c10.booleanValue());
        }
        return c10.booleanValue();
    }

    private boolean l() {
        k e10 = k.e();
        g<String> e11 = e(e10);
        g<String> x10 = x(e10);
        if (!x10.d()) {
            return e11.d() ? I(e11.c()) : I(e10.d());
        }
        String c10 = x10.c();
        if (e11 == null || !e11.d() || !e11.c().equals(c10)) {
            this.f68530c.m(e10.a(), c10);
        }
        return I(c10);
    }

    private g<Boolean> n(v<Boolean> vVar) {
        return this.f68529b.b(vVar.b());
    }

    private g<Double> o(v<Double> vVar) {
        return this.f68529b.c(vVar.b());
    }

    private g<Long> p(v<Long> vVar) {
        return this.f68529b.e(vVar.b());
    }

    private g<Boolean> u(v<Boolean> vVar) {
        return this.f68528a.getBoolean(vVar.c());
    }

    private g<Double> v(v<Double> vVar) {
        return this.f68528a.getDouble(vVar.c());
    }

    private g<Long> w(v<Long> vVar) {
        return this.f68528a.getLong(vVar.c());
    }

    private g<String> x(v<String> vVar) {
        return this.f68528a.getString(vVar.c());
    }

    public long A() {
        o e10 = o.e();
        g<Long> p10 = p(e10);
        if (p10.d() && M(p10.c().longValue())) {
            return p10.c().longValue();
        }
        g<Long> w10 = w(e10);
        if (!w10.d() || !M(w10.c().longValue())) {
            g<Long> d10 = d(e10);
            return (!d10.d() || !M(d10.c().longValue())) ? e10.d().longValue() : d10.c().longValue();
        }
        this.f68530c.l(e10.a(), w10.c().longValue());
        return w10.c().longValue();
    }

    public long B() {
        p e10 = p.e();
        g<Long> p10 = p(e10);
        if (p10.d() && J(p10.c().longValue())) {
            return p10.c().longValue();
        }
        g<Long> w10 = w(e10);
        if (!w10.d() || !J(w10.c().longValue())) {
            g<Long> d10 = d(e10);
            return (!d10.d() || !J(d10.c().longValue())) ? e10.d().longValue() : d10.c().longValue();
        }
        this.f68530c.l(e10.a(), w10.c().longValue());
        return w10.c().longValue();
    }

    public long C() {
        q f10 = q.f();
        g<Long> p10 = p(f10);
        if (p10.d() && J(p10.c().longValue())) {
            return p10.c().longValue();
        }
        g<Long> w10 = w(f10);
        if (!w10.d() || !J(w10.c().longValue())) {
            g<Long> d10 = d(f10);
            return (!d10.d() || !J(d10.c().longValue())) ? this.f68528a.isLastFetchFailed() ? f10.e().longValue() : f10.d().longValue() : d10.c().longValue();
        }
        this.f68530c.l(f10.a(), w10.c().longValue());
        return w10.c().longValue();
    }

    public double D() {
        r f10 = r.f();
        g<Double> o10 = o(f10);
        if (o10.d()) {
            double doubleValue = o10.c().doubleValue() / 100.0d;
            if (L(doubleValue)) {
                return doubleValue;
            }
        }
        g<Double> v10 = v(f10);
        if (!v10.d() || !L(v10.c().doubleValue())) {
            g<Double> c10 = c(f10);
            return (!c10.d() || !L(c10.c().doubleValue())) ? this.f68528a.isLastFetchFailed() ? f10.e().doubleValue() : f10.d().doubleValue() : c10.c().doubleValue();
        }
        this.f68530c.k(f10.a(), v10.c().doubleValue());
        return v10.c().doubleValue();
    }

    public long E() {
        s e10 = s.e();
        g<Long> w10 = w(e10);
        if (!w10.d() || !H(w10.c().longValue())) {
            g<Long> d10 = d(e10);
            return (!d10.d() || !H(d10.c().longValue())) ? e10.d().longValue() : d10.c().longValue();
        }
        this.f68530c.l(e10.a(), w10.c().longValue());
        return w10.c().longValue();
    }

    public long F() {
        t e10 = t.e();
        g<Long> w10 = w(e10);
        if (!w10.d() || !H(w10.c().longValue())) {
            g<Long> d10 = d(e10);
            return (!d10.d() || !H(d10.c().longValue())) ? e10.d().longValue() : d10.c().longValue();
        }
        this.f68530c.l(e10.a(), w10.c().longValue());
        return w10.c().longValue();
    }

    public double G() {
        u f10 = u.f();
        g<Double> v10 = v(f10);
        if (!v10.d() || !L(v10.c().doubleValue())) {
            g<Double> c10 = c(f10);
            return (!c10.d() || !L(c10.c().doubleValue())) ? this.f68528a.isLastFetchFailed() ? f10.e().doubleValue() : f10.d().doubleValue() : c10.c().doubleValue();
        }
        this.f68530c.k(f10.a(), v10.c().doubleValue());
        return v10.c().doubleValue();
    }

    public boolean K() {
        Boolean j10 = j();
        return (j10 == null || j10.booleanValue()) && m();
    }

    public void O(Context context) {
        f68526d.i(o.b(context));
        this.f68530c.j(context);
    }

    public void P(Boolean bool) {
        String a10;
        if (i().booleanValue() || (a10 = c.d().a()) == null) {
            return;
        }
        if (bool != null) {
            this.f68530c.n(a10, Boolean.TRUE.equals(bool));
        } else {
            this.f68530c.b(a10);
        }
    }

    public void Q(f fVar) {
        this.f68529b = fVar;
    }

    public String a() {
        String f10;
        f e10 = f.e();
        if (C10352a.f77589a.booleanValue()) {
            return e10.d();
        }
        String c10 = e10.c();
        long j10 = -1;
        if (c10 != null) {
            j10 = ((Long) this.f68528a.getRemoteConfigValueOrDefault(c10, -1L)).longValue();
        }
        String a10 = e10.a();
        if (!f.g(j10) || (f10 = f.f(j10)) == null) {
            g<String> e11 = e(e10);
            return e11.d() ? e11.c() : e10.d();
        }
        this.f68530c.m(a10, f10);
        return f10;
    }

    public double f() {
        e e10 = e.e();
        g<Double> o10 = o(e10);
        if (o10.d()) {
            double doubleValue = o10.c().doubleValue() / 100.0d;
            if (L(doubleValue)) {
                return doubleValue;
            }
        }
        g<Double> v10 = v(e10);
        if (!v10.d() || !L(v10.c().doubleValue())) {
            g<Double> c10 = c(e10);
            return (!c10.d() || !L(c10.c().doubleValue())) ? e10.d().doubleValue() : c10.c().doubleValue();
        }
        this.f68530c.k(e10.a(), v10.c().doubleValue());
        return v10.c().doubleValue();
    }

    public boolean h() {
        d e10 = d.e();
        g<Boolean> n10 = n(e10);
        if (n10.d()) {
            return n10.c().booleanValue();
        }
        g<Boolean> u10 = u(e10);
        if (u10.d()) {
            this.f68530c.n(e10.a(), u10.c().booleanValue());
            return u10.c().booleanValue();
        }
        g<Boolean> b10 = b(e10);
        return b10.d() ? b10.c().booleanValue() : e10.d().booleanValue();
    }

    public Boolean i() {
        b e10 = b.e();
        g<Boolean> n10 = n(e10);
        return n10.d() ? n10.c() : e10.d();
    }

    public Boolean j() {
        if (i().booleanValue()) {
            return Boolean.FALSE;
        }
        c d10 = c.d();
        g<Boolean> b10 = b(d10);
        if (b10.d()) {
            return b10.c();
        }
        g<Boolean> n10 = n(d10);
        if (n10.d()) {
            return n10.c();
        }
        return null;
    }

    public boolean m() {
        return k() && !l();
    }

    public long q() {
        g e10 = g.e();
        g<Long> w10 = w(e10);
        if (!w10.d() || !H(w10.c().longValue())) {
            g<Long> d10 = d(e10);
            return (!d10.d() || !H(d10.c().longValue())) ? e10.d().longValue() : d10.c().longValue();
        }
        this.f68530c.l(e10.a(), w10.c().longValue());
        return w10.c().longValue();
    }

    public long r() {
        h e10 = h.e();
        g<Long> w10 = w(e10);
        if (!w10.d() || !H(w10.c().longValue())) {
            g<Long> d10 = d(e10);
            return (!d10.d() || !H(d10.c().longValue())) ? e10.d().longValue() : d10.c().longValue();
        }
        this.f68530c.l(e10.a(), w10.c().longValue());
        return w10.c().longValue();
    }

    public double s() {
        i f10 = i.f();
        g<Double> v10 = v(f10);
        if (!v10.d() || !L(v10.c().doubleValue())) {
            g<Double> c10 = c(f10);
            return (!c10.d() || !L(c10.c().doubleValue())) ? this.f68528a.isLastFetchFailed() ? f10.e().doubleValue() : f10.d().doubleValue() : c10.c().doubleValue();
        }
        this.f68530c.k(f10.a(), v10.c().doubleValue());
        return v10.c().doubleValue();
    }

    public long t() {
        j e10 = j.e();
        g<Long> w10 = w(e10);
        if (!w10.d() || !N(w10.c().longValue())) {
            g<Long> d10 = d(e10);
            return (!d10.d() || !N(d10.c().longValue())) ? e10.d().longValue() : d10.c().longValue();
        }
        this.f68530c.l(e10.a(), w10.c().longValue());
        return w10.c().longValue();
    }

    public long y() {
        m e10 = m.e();
        g<Long> p10 = p(e10);
        if (p10.d() && J(p10.c().longValue())) {
            return p10.c().longValue();
        }
        g<Long> w10 = w(e10);
        if (!w10.d() || !J(w10.c().longValue())) {
            g<Long> d10 = d(e10);
            return (!d10.d() || !J(d10.c().longValue())) ? e10.d().longValue() : d10.c().longValue();
        }
        this.f68530c.l(e10.a(), w10.c().longValue());
        return w10.c().longValue();
    }

    public long z() {
        n f10 = n.f();
        g<Long> p10 = p(f10);
        if (p10.d() && J(p10.c().longValue())) {
            return p10.c().longValue();
        }
        g<Long> w10 = w(f10);
        if (!w10.d() || !J(w10.c().longValue())) {
            g<Long> d10 = d(f10);
            return (!d10.d() || !J(d10.c().longValue())) ? this.f68528a.isLastFetchFailed() ? f10.e().longValue() : f10.d().longValue() : d10.c().longValue();
        }
        this.f68530c.l(f10.a(), w10.c().longValue());
        return w10.c().longValue();
    }
}
