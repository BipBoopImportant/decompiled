package L3;

import L3.C6635E;
import L3.p;
import L3.s;
import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.exoplayer.C5233j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import jb.r;
import kb.C9967v;
import q3.C5798i;
import q3.C5801l;
import q3.C5807s;
import q3.F;
import q3.I;
import q3.O;
import q3.P;
import q3.Q;
import q3.S;
import q3.t;
import t3.C5950a;
import t3.C5953d;
import t3.C5962m;
import t3.D;
import t3.N;

public final class i implements Q.a {
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final Executor f38141r = new C6642g();

    /* renamed from: a  reason: collision with root package name */
    private final Context f38142a;

    /* renamed from: b  reason: collision with root package name */
    private final d f38143b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final p f38144c;

    /* renamed from: d  reason: collision with root package name */
    private final s f38145d;

    /* renamed from: e  reason: collision with root package name */
    private final F.a f38146e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final List<Object> f38147f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C6635E f38148g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C5953d f38149h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArraySet<e> f38150i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public C5807s f38151j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public o f38152k;

    /* renamed from: l  reason: collision with root package name */
    private C5962m f38153l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public F f38154m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public Pair<Surface, D> f38155n;

    /* renamed from: o  reason: collision with root package name */
    private int f38156o;

    /* renamed from: p  reason: collision with root package name */
    private int f38157p;

    /* renamed from: q  reason: collision with root package name */
    private long f38158q;

    public static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final Context f38159a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final p f38160b;

        /* renamed from: c  reason: collision with root package name */
        private P.a f38161c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public F.a f38162d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public List<Object> f38163e = C9967v.E();
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public C5953d f38164f = C5953d.f29483a;

        /* renamed from: g  reason: collision with root package name */
        private boolean f38165g;

        public b(Context context, p pVar) {
            this.f38159a = context.getApplicationContext();
            this.f38160b = pVar;
        }

        public i f() {
            C5950a.g(!this.f38165g);
            if (this.f38162d == null) {
                if (this.f38161c == null) {
                    this.f38161c = new f();
                }
                this.f38162d = new g(this.f38161c);
            }
            i iVar = new i(this);
            this.f38165g = true;
            return iVar;
        }

        public b g(C5953d dVar) {
            this.f38164f = dVar;
            return this;
        }
    }

    private final class c implements s.a {
        private c() {
        }

        public void e(S s10) {
            C5807s unused = i.this.f38151j = new C5807s.b().x0(s10.f28068a).c0(s10.f28069b).s0("video/raw").M();
            Iterator it = i.this.f38150i.iterator();
            while (it.hasNext()) {
                ((e) it.next()).b(i.this, s10);
            }
        }

        public void f() {
            Iterator it = i.this.f38150i.iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(i.this);
            }
            ((F) C5950a.i(i.this.f38154m)).b(-2);
        }

        public void g(long j10, long j11, long j12, boolean z10) {
            if (z10 && i.this.f38155n != null) {
                Iterator it = i.this.f38150i.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).c(i.this);
                }
            }
            if (i.this.f38152k != null) {
                i.this.f38152k.g(j11, i.this.f38149h.b(), i.this.f38151j == null ? new C5807s.b().M() : i.this.f38151j, (MediaFormat) null);
            }
            ((F) C5950a.i(i.this.f38154m)).b(j10);
        }
    }

    private final class d implements C6635E, e {

        /* renamed from: a  reason: collision with root package name */
        private final int f38167a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<Object> f38168b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        private final p.a f38169c = new p.a();

        /* renamed from: d  reason: collision with root package name */
        private P f38170d;

        /* renamed from: e  reason: collision with root package name */
        private C5807s f38171e;

        /* renamed from: f  reason: collision with root package name */
        private int f38172f;

        /* renamed from: g  reason: collision with root package name */
        private long f38173g;

        /* renamed from: h  reason: collision with root package name */
        private long f38174h;

        /* renamed from: i  reason: collision with root package name */
        private long f38175i;

        /* renamed from: j  reason: collision with root package name */
        private long f38176j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f38177k;

        /* renamed from: l  reason: collision with root package name */
        private long f38178l = -9223372036854775807L;

        /* renamed from: m  reason: collision with root package name */
        private long f38179m = -9223372036854775807L;

        /* renamed from: n  reason: collision with root package name */
        private boolean f38180n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f38181o;

        /* renamed from: p  reason: collision with root package name */
        private long f38182p;

        /* renamed from: q  reason: collision with root package name */
        private C6635E.a f38183q = C6635E.a.f38059a;

        /* renamed from: r  reason: collision with root package name */
        private Executor f38184r = i.f38141r;

        public d(Context context) {
            this.f38167a = N.c0(context);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void C(C6635E.a aVar) {
            aVar.c(this);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void D(C6635E.a aVar) {
            aVar.b((C6635E) C5950a.i(this));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void E(C6635E.a aVar, S s10) {
            aVar.a(this, s10);
        }

        private void F() {
            if (this.f38171e != null) {
                ArrayList arrayList = new ArrayList(this.f38168b);
                C5807s sVar = (C5807s) C5950a.e(this.f38171e);
                ((P) C5950a.i(this.f38170d)).a(this.f38172f, arrayList, new t.b(i.z(sVar.f28218C), sVar.f28251v, sVar.f28252w).b(sVar.f28255z).a());
                this.f38178l = -9223372036854775807L;
            }
        }

        private void G(long j10) {
            if (this.f38177k) {
                i.this.I(this.f38175i, j10, this.f38174h);
                this.f38177k = false;
            }
        }

        public void A(boolean z10) {
            if (isInitialized()) {
                this.f38170d.flush();
            }
            this.f38180n = false;
            this.f38178l = -9223372036854775807L;
            this.f38179m = -9223372036854775807L;
            i.this.y(z10);
            this.f38182p = -9223372036854775807L;
        }

        public void B(boolean z10) {
            i.this.f38148g.B(z10);
        }

        public void H(List<Object> list) {
            this.f38168b.clear();
            this.f38168b.addAll(list);
            this.f38168b.addAll(i.this.f38147f);
        }

        public void a(i iVar) {
            this.f38184r.execute(new l(this, this.f38183q));
        }

        public void b(i iVar, S s10) {
            this.f38184r.execute(new j(this, this.f38183q, s10));
        }

        public void c(i iVar) {
            this.f38184r.execute(new k(this, this.f38183q));
        }

        public boolean d() {
            if (isInitialized()) {
                long j10 = this.f38178l;
                return j10 != -9223372036854775807L && i.this.B(j10);
            }
        }

        public void h() {
            i.this.f38148g.h();
        }

        public Surface i() {
            C5950a.g(isInitialized());
            return ((P) C5950a.i(this.f38170d)).i();
        }

        public boolean isInitialized() {
            return this.f38170d != null;
        }

        public void j(float f10) {
            i.this.M(f10);
        }

        public void k(long j10, long j11) {
            try {
                i.this.K(j10, j11);
            } catch (C5233j e10) {
                C5807s sVar = this.f38171e;
                if (sVar == null) {
                    sVar = new C5807s.b().M();
                }
                throw new C6635E.c(e10, sVar);
            }
        }

        public boolean l(long j10, boolean z10, long j11, long j12, C6635E.b bVar) {
            C5950a.g(isInitialized());
            long j13 = j10 - this.f38175i;
            try {
                if (i.this.f38144c.c(j13, j11, j12, this.f38173g, z10, this.f38169c) == 4) {
                    return false;
                }
                if (j13 >= this.f38176j || z10) {
                    k(j11, j12);
                    if (this.f38181o) {
                        long j14 = this.f38182p;
                        if (j14 != -9223372036854775807L && !i.this.B(j14)) {
                            return false;
                        }
                        F();
                        this.f38181o = false;
                        this.f38182p = -9223372036854775807L;
                    }
                    if (((P) C5950a.i(this.f38170d)).c() >= this.f38167a || !((P) C5950a.i(this.f38170d)).b()) {
                        return false;
                    }
                    G(j13);
                    this.f38179m = j13;
                    if (z10) {
                        this.f38178l = j13;
                    }
                    bVar.a(1000 * j10);
                    return true;
                }
                bVar.b();
                return true;
            } catch (C5233j e10) {
                throw new C6635E.c(e10, (C5807s) C5950a.i(this.f38171e));
            }
        }

        public void m(long j10, long j11, long j12, long j13) {
            this.f38177k |= (this.f38174h == j11 && this.f38175i == j12) ? false : true;
            this.f38173g = j10;
            this.f38174h = j11;
            this.f38175i = j12;
            this.f38176j = j13;
        }

        public void n(Surface surface, D d10) {
            i.this.L(surface, d10);
        }

        public void o() {
            i.this.f38148g.o();
        }

        public void p(List<Object> list) {
            if (!this.f38168b.equals(list)) {
                H(list);
                F();
            }
        }

        public void q(o oVar) {
            i.this.N(oVar);
        }

        public void r(C6635E.a aVar, Executor executor) {
            this.f38183q = aVar;
            this.f38184r = executor;
        }

        public void release() {
            i.this.J();
        }

        public boolean s(boolean z10) {
            return i.this.E(z10 && isInitialized());
        }

        public void t(boolean z10) {
            i.this.f38148g.t(z10);
        }

        public void u() {
            i.this.f38148g.u();
        }

        public void v(C5807s sVar) {
            C5950a.g(!isInitialized());
            this.f38170d = i.this.C(sVar);
        }

        public void w(int i10, C5807s sVar) {
            C5950a.g(isInitialized());
            if (i10 == 1 || i10 == 2) {
                i.this.f38144c.p(sVar.f28253x);
                this.f38172f = i10;
                this.f38171e = sVar;
                boolean z10 = false;
                if (!this.f38180n) {
                    F();
                    this.f38180n = true;
                    this.f38181o = false;
                    this.f38182p = -9223372036854775807L;
                    return;
                }
                if (this.f38179m != -9223372036854775807L) {
                    z10 = true;
                }
                C5950a.g(z10);
                this.f38181o = true;
                this.f38182p = this.f38179m;
                return;
            }
            throw new UnsupportedOperationException("Unsupported input type " + i10);
        }

        public void x() {
            i.this.f38148g.x();
        }

        public void y(int i10) {
            i.this.f38148g.y(i10);
        }

        public void z() {
            i.this.x();
        }
    }

    public interface e {
        void a(i iVar);

        void b(i iVar, S s10);

        void c(i iVar);
    }

    private static final class f implements P.a {

        /* renamed from: a  reason: collision with root package name */
        private static final r<P.a> f38186a = jb.s.a(new m());

        private f() {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ P.a b() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (P.a) C5950a.e(cls.getMethod("build", (Class[]) null).invoke(cls.getConstructor((Class[]) null).newInstance((Object[]) null), (Object[]) null));
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    private static final class g implements F.a {

        /* renamed from: a  reason: collision with root package name */
        private final P.a f38187a;

        public g(P.a aVar) {
            this.f38187a = aVar;
        }

        public F a(Context context, C5798i iVar, C5801l lVar, Q.a aVar, Executor executor, List<Object> list, long j10) {
            try {
                try {
                    return ((F.a) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(new Class[]{P.a.class}).newInstance(new Object[]{this.f38187a})).a(context, iVar, lVar, aVar, executor, list, j10);
                } catch (Exception e10) {
                    e = e10;
                    throw O.a(e);
                }
            } catch (Exception e11) {
                e = e11;
                throw O.a(e);
            }
        }
    }

    /* access modifiers changed from: private */
    public boolean B(long j10) {
        return this.f38156o == 0 && this.f38145d.d(j10);
    }

    /* access modifiers changed from: private */
    public P C(C5807s sVar) {
        C5950a.g(this.f38157p == 0);
        C5798i z10 = z(sVar.f28218C);
        if (z10.f28144c == 7 && N.f29462a < 34) {
            z10 = z10.a().e(6).a();
        }
        C5798i iVar = z10;
        C5962m e10 = this.f38149h.e((Looper) C5950a.i(Looper.myLooper()), (Handler.Callback) null);
        this.f38153l = e10;
        try {
            F.a aVar = this.f38146e;
            Context context = this.f38142a;
            C5801l lVar = C5801l.f28155a;
            Objects.requireNonNull(e10);
            this.f38154m = aVar.a(context, iVar, lVar, this, new C6643h(e10), C9967v.E(), 0);
            Pair<Surface, D> pair = this.f38155n;
            if (pair != null) {
                D d10 = (D) pair.second;
                H((Surface) pair.first, d10.b(), d10.a());
            }
            this.f38154m.c(0);
            this.f38148g.v(sVar);
            this.f38157p = 1;
            return this.f38154m.a(0);
        } catch (O e11) {
            throw new C6635E.c(e11, sVar);
        }
    }

    private boolean D() {
        return this.f38157p == 1;
    }

    /* access modifiers changed from: private */
    public boolean E(boolean z10) {
        return this.f38148g.s(z10 && this.f38156o == 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F() {
        this.f38156o--;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void G(Runnable runnable) {
    }

    private void H(Surface surface, int i10, int i11) {
        F f10 = this.f38154m;
        if (f10 != null) {
            if (surface != null) {
                f10.d(new I(surface, i10, i11));
                this.f38148g.n(surface, new D(i10, i11));
                return;
            }
            f10.d((I) null);
            this.f38148g.z();
        }
    }

    /* access modifiers changed from: private */
    public void I(long j10, long j11, long j12) {
        this.f38158q = j10;
        this.f38145d.h(j11, j12);
    }

    /* access modifiers changed from: private */
    public void K(long j10, long j11) {
        this.f38145d.i(j10, j11);
    }

    /* access modifiers changed from: private */
    public void M(float f10) {
        this.f38148g.j(f10);
    }

    /* access modifiers changed from: private */
    public void N(o oVar) {
        this.f38152k = oVar;
    }

    /* access modifiers changed from: private */
    public void y(boolean z10) {
        if (D()) {
            this.f38156o++;
            this.f38148g.A(z10);
            ((C5962m) C5950a.i(this.f38153l)).h(new C6641f(this));
        }
    }

    /* access modifiers changed from: private */
    public static C5798i z(C5798i iVar) {
        return (iVar == null || !iVar.g()) ? C5798i.f28134h : iVar;
    }

    public C6635E A() {
        return this.f38143b;
    }

    public void J() {
        if (this.f38157p != 2) {
            C5962m mVar = this.f38153l;
            if (mVar != null) {
                mVar.e((Object) null);
            }
            F f10 = this.f38154m;
            if (f10 != null) {
                f10.release();
            }
            this.f38155n = null;
            this.f38157p = 2;
        }
    }

    public void L(Surface surface, D d10) {
        Pair<Surface, D> pair = this.f38155n;
        if (pair == null || !((Surface) pair.first).equals(surface) || !((D) this.f38155n.second).equals(d10)) {
            this.f38155n = Pair.create(surface, d10);
            H(surface, d10.b(), d10.a());
        }
    }

    public void w(e eVar) {
        this.f38150i.add(eVar);
    }

    public void x() {
        D d10 = D.f29444c;
        H((Surface) null, d10.b(), d10.a());
        this.f38155n = null;
    }

    private i(b bVar) {
        Context a10 = bVar.f38159a;
        this.f38142a = a10;
        d dVar = new d(a10);
        this.f38143b = dVar;
        C5953d b10 = bVar.f38164f;
        this.f38149h = b10;
        p c10 = bVar.f38160b;
        this.f38144c = c10;
        c10.o(b10);
        s sVar = new s(new c(), c10);
        this.f38145d = sVar;
        this.f38146e = (F.a) C5950a.i(bVar.f38162d);
        this.f38147f = bVar.f38163e;
        this.f38148g = new C6636a(c10, sVar);
        this.f38150i = new CopyOnWriteArraySet<>();
        this.f38157p = 0;
        w(dVar);
    }
}
