package l9;

import WH.C16729a;
import android.content.Context;
import java.util.concurrent.Executor;
import l9.v;
import m9.j;
import m9.l;
import n9.C8591a;
import n9.d;
import r9.C8713c;
import r9.g;
import r9.i;
import s9.f;
import s9.r;
import s9.s;
import s9.w;
import s9.x;
import t9.C8856d;
import t9.C8859g;
import t9.C8860h;
import t9.C8861i;
import t9.C8862j;
import t9.M;
import t9.N;
import t9.X;
import v9.C8905c;
import v9.C8906d;

/* renamed from: l9.e  reason: case insensitive filesystem */
final class C8547e {

    /* renamed from: l9.e$b */
    private static final class b implements v.a {

        /* renamed from: a  reason: collision with root package name */
        private Context f54876a;

        private b() {
        }

        /* renamed from: b */
        public b a(Context context) {
            this.f54876a = (Context) d.b(context);
            return this;
        }

        public v g() {
            d.a(this.f54876a, Context.class);
            return new c(this.f54876a);
        }
    }

    /* renamed from: l9.e$c */
    private static final class c extends v {

        /* renamed from: a  reason: collision with root package name */
        private final c f54877a;

        /* renamed from: b  reason: collision with root package name */
        private C16729a<Executor> f54878b;

        /* renamed from: c  reason: collision with root package name */
        private C16729a<Context> f54879c;

        /* renamed from: d  reason: collision with root package name */
        private C16729a f54880d;

        /* renamed from: e  reason: collision with root package name */
        private C16729a f54881e;

        /* renamed from: f  reason: collision with root package name */
        private C16729a f54882f;

        /* renamed from: g  reason: collision with root package name */
        private C16729a<String> f54883g;

        /* renamed from: h  reason: collision with root package name */
        private C16729a<M> f54884h;

        /* renamed from: i  reason: collision with root package name */
        private C16729a<f> f54885i;

        /* renamed from: j  reason: collision with root package name */
        private C16729a<x> f54886j;

        /* renamed from: k  reason: collision with root package name */
        private C16729a<C8713c> f54887k;

        /* renamed from: l  reason: collision with root package name */
        private C16729a<r> f54888l;

        /* renamed from: m  reason: collision with root package name */
        private C16729a<s9.v> f54889m;

        /* renamed from: n  reason: collision with root package name */
        private C16729a<u> f54890n;

        private void e(Context context) {
            this.f54878b = C8591a.a(k.a());
            n9.b a10 = n9.c.a(context);
            this.f54879c = a10;
            j a11 = j.a(a10, C8905c.a(), C8906d.a());
            this.f54880d = a11;
            this.f54881e = C8591a.a(l.a(this.f54879c, a11));
            this.f54882f = X.a(this.f54879c, C8859g.a(), C8861i.a());
            this.f54883g = C8591a.a(C8860h.a(this.f54879c));
            this.f54884h = C8591a.a(N.a(C8905c.a(), C8906d.a(), C8862j.a(), this.f54882f, this.f54883g));
            g b10 = g.b(C8905c.a());
            this.f54885i = b10;
            i a12 = i.a(this.f54879c, this.f54884h, b10, C8906d.a());
            this.f54886j = a12;
            C16729a<Executor> aVar = this.f54878b;
            C16729a aVar2 = this.f54881e;
            C16729a<M> aVar3 = this.f54884h;
            this.f54887k = r9.d.a(aVar, aVar2, a12, aVar3, aVar3);
            C16729a<Context> aVar4 = this.f54879c;
            C16729a aVar5 = this.f54881e;
            C16729a<M> aVar6 = this.f54884h;
            this.f54888l = s.a(aVar4, aVar5, aVar6, this.f54886j, this.f54878b, aVar6, C8905c.a(), C8906d.a(), this.f54884h);
            C16729a<Executor> aVar7 = this.f54878b;
            C16729a<M> aVar8 = this.f54884h;
            this.f54889m = w.a(aVar7, aVar8, this.f54886j, aVar8);
            this.f54890n = C8591a.a(w.a(C8905c.a(), C8906d.a(), this.f54887k, this.f54888l, this.f54889m));
        }

        /* access modifiers changed from: package-private */
        public C8856d c() {
            return this.f54884h.get();
        }

        /* access modifiers changed from: package-private */
        public u d() {
            return this.f54890n.get();
        }

        private c(Context context) {
            this.f54877a = this;
            e(context);
        }
    }

    public static v.a a() {
        return new b();
    }
}
