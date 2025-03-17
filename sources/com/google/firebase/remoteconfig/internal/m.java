package com.google.firebase.remoteconfig.internal;

import Ic.h;
import Ic.i;
import Ic.j;
import Ic.l;
import android.text.format.DateUtils;
import com.google.firebase.installations.g;
import com.google.firebase.remoteconfig.internal.t;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import mc.C10036b;
import nc.e;
import xa.C8971l;
import xa.C8974o;

public class m {

    /* renamed from: j  reason: collision with root package name */
    public static final long f68769j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k  reason: collision with root package name */
    static final int[] f68770k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    private final e f68771a;

    /* renamed from: b  reason: collision with root package name */
    private final C10036b<Ib.a> f68772b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f68773c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.gms.common.util.e f68774d;

    /* renamed from: e  reason: collision with root package name */
    private final Random f68775e;

    /* renamed from: f  reason: collision with root package name */
    private final f f68776f;

    /* renamed from: g  reason: collision with root package name */
    private final ConfigFetchHttpClient f68777g;

    /* renamed from: h  reason: collision with root package name */
    private final t f68778h;

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, String> f68779i;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Date f68780a;

        /* renamed from: b  reason: collision with root package name */
        private final int f68781b;

        /* renamed from: c  reason: collision with root package name */
        private final g f68782c;

        /* renamed from: d  reason: collision with root package name */
        private final String f68783d;

        private a(Date date, int i10, g gVar, String str) {
            this.f68780a = date;
            this.f68781b = i10;
            this.f68782c = gVar;
            this.f68783d = str;
        }

        public static a a(Date date, g gVar) {
            return new a(date, 1, gVar, (String) null);
        }

        public static a b(g gVar, String str) {
            return new a(gVar.h(), 0, gVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, (g) null, (String) null);
        }

        public g d() {
            return this.f68782c;
        }

        /* access modifiers changed from: package-private */
        public String e() {
            return this.f68783d;
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return this.f68781b;
        }
    }

    public enum b {
        BASE("BASE"),
        REALTIME("REALTIME");
        
        private final String value;

        private b(String str) {
            this.value = str;
        }

        /* access modifiers changed from: package-private */
        public String b() {
            return this.value;
        }
    }

    public m(e eVar, C10036b<Ib.a> bVar, Executor executor, com.google.android.gms.common.util.e eVar2, Random random, f fVar, ConfigFetchHttpClient configFetchHttpClient, t tVar, Map<String, String> map) {
        this.f68771a = eVar;
        this.f68772b = bVar;
        this.f68773c = executor;
        this.f68774d = eVar2;
        this.f68775e = random;
        this.f68776f = fVar;
        this.f68777g = configFetchHttpClient;
        this.f68778h = tVar;
        this.f68779i = map;
    }

    private t.a A(int i10, Date date) {
        if (t(i10)) {
            B(date);
        }
        return this.f68778h.a();
    }

    private void B(Date date) {
        int b10 = this.f68778h.a().b() + 1;
        this.f68778h.l(b10, new Date(date.getTime() + q(b10)));
    }

    private void C(C8971l<a> lVar, Date date) {
        if (lVar.q()) {
            this.f68778h.q(date);
            return;
        }
        Exception l10 = lVar.l();
        if (l10 != null) {
            if (l10 instanceof j) {
                this.f68778h.r();
            } else {
                this.f68778h.p();
            }
        }
    }

    private boolean f(long j10, Date date) {
        Date f10 = this.f68778h.f();
        if (f10.equals(t.f68829f)) {
            return false;
        }
        return date.before(new Date(f10.getTime() + TimeUnit.SECONDS.toMillis(j10)));
    }

    private l g(l lVar) {
        String str;
        int a10 = lVar.a();
        if (a10 == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a10 == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else if (a10 == 429) {
            throw new h("The throttled response from the server was not handled correctly by the FRC SDK.");
        } else if (a10 != 500) {
            switch (a10) {
                case 502:
                case 503:
                case 504:
                    str = "The server is unavailable. Please try again later.";
                    break;
                default:
                    str = "The server returned an unexpected error.";
                    break;
            }
        } else {
            str = "There was an internal server error.";
        }
        int a11 = lVar.a();
        return new l(a11, "Fetch failed: " + str, (Throwable) lVar);
    }

    private String h(long j10) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j10))});
    }

    private a k(String str, String str2, Date date, Map<String, String> map) {
        try {
            a fetch = this.f68777g.fetch(this.f68777g.d(), str, str2, s(), this.f68778h.e(), map, p(), date, this.f68778h.b());
            if (fetch.d() != null) {
                this.f68778h.n(fetch.d().k());
            }
            if (fetch.e() != null) {
                this.f68778h.m(fetch.e());
            }
            this.f68778h.j();
            return fetch;
        } catch (l e10) {
            t.a A10 = A(e10.a(), date);
            if (z(A10, e10.a())) {
                throw new j(A10.a().getTime());
            }
            throw g(e10);
        }
    }

    private C8971l<a> l(String str, String str2, Date date, Map<String, String> map) {
        try {
            a k10 = k(str, str2, date, map);
            return k10.f() != 0 ? C8974o.f(k10) : this.f68776f.k(k10.d()).r(this.f68773c, new l(k10));
        } catch (i e10) {
            return C8974o.e(e10);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public C8971l<a> u(C8971l<g> lVar, long j10, Map<String, String> map) {
        C8971l<TContinuationResult> lVar2;
        Date date = new Date(this.f68774d.a());
        if (lVar.q() && f(j10, date)) {
            return C8974o.f(a.c(date));
        }
        Date o10 = o(date);
        if (o10 != null) {
            lVar2 = C8974o.e(new j(h(o10.getTime() - date.getTime()), o10.getTime()));
        } else {
            C8971l<String> id2 = this.f68771a.getId();
            C8971l<g> a10 = this.f68771a.a(false);
            lVar2 = C8974o.k(id2, a10).j(this.f68773c, new i(this, id2, a10, date, map));
        }
        return lVar2.j(this.f68773c, new j(this, date));
    }

    private Date o(Date date) {
        Date a10 = this.f68778h.a().a();
        if (date.before(a10)) {
            return a10;
        }
        return null;
    }

    private Long p() {
        Ib.a aVar = this.f68772b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.e(true).get("_fot");
    }

    private long q(int i10) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f68770k;
        long millis = timeUnit.toMillis((long) iArr[Math.min(i10, iArr.length) - 1]);
        return (millis / 2) + ((long) this.f68775e.nextInt((int) millis));
    }

    private Map<String, String> s() {
        HashMap hashMap = new HashMap();
        Ib.a aVar = this.f68772b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry next : aVar.e(false).entrySet()) {
            hashMap.put((String) next.getKey(), next.getValue().toString());
        }
        return hashMap;
    }

    private boolean t(int i10) {
        return i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C8971l w(C8971l lVar, C8971l lVar2, Date date, Map map, C8971l lVar3) {
        return !lVar.q() ? C8974o.e(new h("Firebase Installations failed to get installation ID for fetch.", (Throwable) lVar.l())) : !lVar2.q() ? C8974o.e(new h("Firebase Installations failed to get installation auth token for fetch.", (Throwable) lVar2.l())) : l((String) lVar.m(), ((g) lVar2.m()).b(), date, map);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C8971l x(Date date, C8971l lVar) {
        C(lVar, date);
        return lVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C8971l y(Map map, C8971l lVar) {
        return u(lVar, 0, map);
    }

    private boolean z(t.a aVar, int i10) {
        return aVar.b() > 1 || i10 == 429;
    }

    public C8971l<a> i() {
        return j(this.f68778h.h());
    }

    public C8971l<a> j(long j10) {
        HashMap hashMap = new HashMap(this.f68779i);
        hashMap.put("X-Firebase-RC-Fetch-Type", b.BASE.b() + "/" + 1);
        return this.f68776f.e().j(this.f68773c, new h(this, j10, hashMap));
    }

    public C8971l<a> n(b bVar, int i10) {
        HashMap hashMap = new HashMap(this.f68779i);
        hashMap.put("X-Firebase-RC-Fetch-Type", bVar.b() + "/" + i10);
        return this.f68776f.e().j(this.f68773c, new k(this, hashMap));
    }

    public long r() {
        return this.f68778h.g();
    }
}
