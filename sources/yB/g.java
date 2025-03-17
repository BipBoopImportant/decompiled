package Yb;

import Qb.C9251i;
import Qb.E;
import Qb.F;
import Qb.G;
import Qb.K;
import Qb.c0;
import Rb.f;
import Vb.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import xa.C8970k;
import xa.C8971l;
import xa.C8972m;
import xa.C8974o;

public class g implements j {

    /* renamed from: a  reason: collision with root package name */
    private final Context f64913a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final k f64914b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final h f64915c;

    /* renamed from: d  reason: collision with root package name */
    private final E f64916d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final a f64917e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final l f64918f;

    /* renamed from: g  reason: collision with root package name */
    private final F f64919g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final AtomicReference<d> f64920h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReference<C8972m<d>> f64921i = new AtomicReference<>(new C8972m());

    class a implements C8970k<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f64922a;

        a(f fVar) {
            this.f64922a = fVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ JSONObject b() {
            return g.this.f64918f.a(g.this.f64914b, true);
        }

        /* renamed from: c */
        public C8971l<Void> then(Void voidR) {
            JSONObject jSONObject = (JSONObject) this.f64922a.f63184d.c().submit(new f(this)).get();
            if (jSONObject != null) {
                d b10 = g.this.f64915c.b(jSONObject);
                g.this.f64917e.c(b10.f64901c, jSONObject);
                g.this.q(jSONObject, "Loaded settings: ");
                g gVar = g.this;
                boolean unused = gVar.r(gVar.f64914b.f64930f);
                g.this.f64920h.set(b10);
                ((C8972m) g.this.f64921i.get()).e(b10);
            }
            return C8974o.f(null);
        }
    }

    g(Context context, k kVar, E e10, h hVar, a aVar, l lVar, F f10) {
        AtomicReference<d> atomicReference = new AtomicReference<>();
        this.f64920h = atomicReference;
        this.f64913a = context;
        this.f64914b = kVar;
        this.f64916d = e10;
        this.f64915c = hVar;
        this.f64917e = aVar;
        this.f64918f = lVar;
        this.f64919g = f10;
        atomicReference.set(b.b(e10));
    }

    public static g l(Context context, String str, K k10, b bVar, String str2, String str3, Wb.g gVar, F f10) {
        String g10 = k10.g();
        c0 c0Var = new c0();
        String str4 = str3;
        return new g(context, new k(str, k10.h(), k10.i(), k10.j(), k10, C9251i.h(C9251i.m(context), str, str4, str2), str4, str2, G.b(g10).j()), c0Var, new h(c0Var), new a(gVar), new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", new Object[]{str}), bVar), f10);
    }

    private d m(e eVar) {
        d dVar = null;
        try {
            if (e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                return null;
            }
            JSONObject b10 = this.f64917e.b();
            if (b10 != null) {
                d b11 = this.f64915c.b(b10);
                if (b11 != null) {
                    q(b10, "Loaded cached settings: ");
                    long a10 = this.f64916d.a();
                    if (!e.IGNORE_CACHE_EXPIRATION.equals(eVar)) {
                        if (b11.a(a10)) {
                            Nb.g.f().i("Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        Nb.g.f().i("Returning cached settings.");
                        return b11;
                    } catch (Exception e10) {
                        e = e10;
                        dVar = b11;
                        Nb.g.f().e("Failed to get cached settings", e);
                        return dVar;
                    }
                } else {
                    Nb.g.f().e("Failed to parse cached settings data.", (Throwable) null);
                    return null;
                }
            } else {
                Nb.g.f().b("No cached settings data found.");
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            Nb.g.f().e("Failed to get cached settings", e);
            return dVar;
        }
    }

    private String n() {
        return C9251i.q(this.f64913a).getString("existing_instance_identifier", "");
    }

    /* access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        Nb.g f10 = Nb.g.f();
        f10.b(str + jSONObject.toString());
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    public boolean r(String str) {
        SharedPreferences.Editor edit = C9251i.q(this.f64913a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    public C8971l<d> a() {
        return this.f64921i.get().a();
    }

    public d b() {
        return this.f64920h.get();
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return !n().equals(this.f64914b.f64930f);
    }

    public C8971l<Void> o(f fVar) {
        return p(e.USE_CACHE, fVar);
    }

    public C8971l<Void> p(e eVar, f fVar) {
        d m10;
        if (k() || (m10 = m(eVar)) == null) {
            d m11 = m(e.IGNORE_CACHE_EXPIRATION);
            if (m11 != null) {
                this.f64920h.set(m11);
                this.f64921i.get().e(m11);
            }
            return this.f64919g.k().r(fVar.f63181a, new a(fVar));
        }
        this.f64920h.set(m10);
        this.f64921i.get().e(m10);
        return C8974o.f(null);
    }
}
