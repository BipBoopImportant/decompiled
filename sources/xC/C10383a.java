package xc;

import Fb.f;
import WH.C16729a;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.config.a;
import com.google.firebase.perf.session.SessionManager;
import j9.j;
import mc.C10036b;
import nH.C17623b;
import nH.C17627f;
import nc.e;
import wc.C10356e;
import wc.C10358g;
import yc.C10427a;
import yc.C10428b;
import yc.C10429c;
import yc.d;
import yc.g;
import yc.h;

/* renamed from: xc.a  reason: case insensitive filesystem */
public final class C10383a {

    /* renamed from: xc.a$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private C10427a f77703a;

        public b a() {
            C17627f.a(this.f77703a, C10427a.class);
            return new c(this.f77703a);
        }

        public b b(C10427a aVar) {
            this.f77703a = (C10427a) C17627f.b(aVar);
            return this;
        }

        private b() {
        }
    }

    /* renamed from: xc.a$c */
    private static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final c f77704a;

        /* renamed from: b  reason: collision with root package name */
        private C16729a<f> f77705b;

        /* renamed from: c  reason: collision with root package name */
        private C16729a<C10036b<com.google.firebase.remoteconfig.c>> f77706c;

        /* renamed from: d  reason: collision with root package name */
        private C16729a<e> f77707d;

        /* renamed from: e  reason: collision with root package name */
        private C16729a<C10036b<j>> f77708e;

        /* renamed from: f  reason: collision with root package name */
        private C16729a<RemoteConfigManager> f77709f;

        /* renamed from: g  reason: collision with root package name */
        private C16729a<a> f77710g;

        /* renamed from: h  reason: collision with root package name */
        private C16729a<SessionManager> f77711h;

        /* renamed from: i  reason: collision with root package name */
        private C16729a<C10356e> f77712i;

        private void b(C10427a aVar) {
            this.f77705b = C10429c.a(aVar);
            this.f77706c = yc.e.a(aVar);
            this.f77707d = d.a(aVar);
            this.f77708e = h.a(aVar);
            this.f77709f = yc.f.a(aVar);
            this.f77710g = C10428b.a(aVar);
            g a10 = g.a(aVar);
            this.f77711h = a10;
            this.f77712i = C17623b.c(C10358g.a(this.f77705b, this.f77706c, this.f77707d, this.f77708e, this.f77709f, this.f77710g, a10));
        }

        public C10356e a() {
            return this.f77712i.get();
        }

        private c(C10427a aVar) {
            this.f77704a = this;
            b(aVar);
        }
    }

    public static b a() {
        return new b();
    }
}
