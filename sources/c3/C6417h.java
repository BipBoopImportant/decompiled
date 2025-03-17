package C3;

import A3.v1;
import C3.C6407A;
import C3.C6416g;
import C3.C6422m;
import C3.t;
import C3.u;
import J3.i;
import J3.j;
import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kb.C9944Y;
import kb.C9967v;
import kb.C9970y;
import kb.e0;
import q3.A;
import q3.C5797h;
import q3.C5803n;
import q3.C5807s;
import t3.C5950a;
import t3.N;
import t3.q;

/* renamed from: C3.h  reason: case insensitive filesystem */
public class C6417h implements u {

    /* renamed from: b  reason: collision with root package name */
    private final UUID f33610b;

    /* renamed from: c  reason: collision with root package name */
    private final C6407A.c f33611c;

    /* renamed from: d  reason: collision with root package name */
    private final M f33612d;

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, String> f33613e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f33614f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f33615g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f33616h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final g f33617i;

    /* renamed from: j  reason: collision with root package name */
    private final j f33618j;

    /* renamed from: k  reason: collision with root package name */
    private final C0515h f33619k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final long f33620l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final List<C6416g> f33621m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Set<f> f33622n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Set<C6416g> f33623o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public int f33624p;

    /* renamed from: q  reason: collision with root package name */
    private C6407A f33625q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public C6416g f33626r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public C6416g f33627s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public Looper f33628t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public Handler f33629u;

    /* renamed from: v  reason: collision with root package name */
    private int f33630v;

    /* renamed from: w  reason: collision with root package name */
    private byte[] f33631w;

    /* renamed from: x  reason: collision with root package name */
    private v1 f33632x;

    /* renamed from: y  reason: collision with root package name */
    volatile d f33633y;

    /* renamed from: C3.h$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final HashMap<String, String> f33634a = new HashMap<>();

        /* renamed from: b  reason: collision with root package name */
        private UUID f33635b = C5797h.f28132d;

        /* renamed from: c  reason: collision with root package name */
        private C6407A.c f33636c = J.f33562d;

        /* renamed from: d  reason: collision with root package name */
        private boolean f33637d;

        /* renamed from: e  reason: collision with root package name */
        private int[] f33638e = new int[0];

        /* renamed from: f  reason: collision with root package name */
        private boolean f33639f = true;

        /* renamed from: g  reason: collision with root package name */
        private j f33640g = new i();

        /* renamed from: h  reason: collision with root package name */
        private long f33641h = 300000;

        public C6417h a(M m10) {
            return new C6417h(this.f33635b, this.f33636c, m10, this.f33634a, this.f33637d, this.f33638e, this.f33639f, this.f33640g, this.f33641h);
        }

        public b b(j jVar) {
            this.f33640g = (j) C5950a.e(jVar);
            return this;
        }

        public b c(boolean z10) {
            this.f33637d = z10;
            return this;
        }

        public b d(boolean z10) {
            this.f33639f = z10;
            return this;
        }

        public b e(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (!(i10 == 2 || i10 == 1)) {
                    z10 = false;
                }
                C5950a.a(z10);
            }
            this.f33638e = (int[]) iArr.clone();
            return this;
        }

        public b f(UUID uuid, C6407A.c cVar) {
            this.f33635b = (UUID) C5950a.e(uuid);
            this.f33636c = (C6407A.c) C5950a.e(cVar);
            return this;
        }
    }

    /* renamed from: C3.h$c */
    private class c implements C6407A.b {
        private c() {
        }

        public void a(C6407A a10, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) C5950a.e(C6417h.this.f33633y)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: C3.h$d */
    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (C6416g gVar : C6417h.this.f33621m) {
                    if (gVar.u(bArr)) {
                        gVar.C(message.what);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: C3.h$e */
    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* renamed from: C3.h$f */
    private class f implements u.b {

        /* renamed from: b  reason: collision with root package name */
        private final t.a f33644b;

        /* renamed from: c  reason: collision with root package name */
        private C6422m f33645c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f33646d;

        public f(t.a aVar) {
            this.f33644b = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void f(C5807s sVar) {
            if (C6417h.this.f33624p != 0 && !this.f33646d) {
                C6417h hVar = C6417h.this;
                this.f33645c = hVar.t((Looper) C5950a.e(hVar.f33628t), this.f33644b, sVar, false);
                C6417h.this.f33622n.add(this);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void g() {
            if (!this.f33646d) {
                C6422m mVar = this.f33645c;
                if (mVar != null) {
                    mVar.c(this.f33644b);
                }
                C6417h.this.f33622n.remove(this);
                this.f33646d = true;
            }
        }

        public void e(C5807s sVar) {
            ((Handler) C5950a.e(C6417h.this.f33629u)).post(new C6418i(this, sVar));
        }

        public void release() {
            N.W0((Handler) C5950a.e(C6417h.this.f33629u), new C6419j(this));
        }
    }

    /* renamed from: C3.h$g */
    private class g implements C6416g.a {

        /* renamed from: a  reason: collision with root package name */
        private final Set<C6416g> f33648a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        private C6416g f33649b;

        public g() {
        }

        public void a(Exception exc, boolean z10) {
            this.f33649b = null;
            C9967v<C6416g> A10 = C9967v.A(this.f33648a);
            this.f33648a.clear();
            e0<C6416g> q10 = A10.iterator();
            while (q10.hasNext()) {
                q10.next().E(exc, z10);
            }
        }

        public void b(C6416g gVar) {
            this.f33648a.add(gVar);
            if (this.f33649b == null) {
                this.f33649b = gVar;
                gVar.I();
            }
        }

        public void c() {
            this.f33649b = null;
            C9967v<C6416g> A10 = C9967v.A(this.f33648a);
            this.f33648a.clear();
            e0<C6416g> q10 = A10.iterator();
            while (q10.hasNext()) {
                q10.next().D();
            }
        }

        public void d(C6416g gVar) {
            this.f33648a.remove(gVar);
            if (this.f33649b == gVar) {
                this.f33649b = null;
                if (!this.f33648a.isEmpty()) {
                    C6416g next = this.f33648a.iterator().next();
                    this.f33649b = next;
                    next.I();
                }
            }
        }
    }

    /* renamed from: C3.h$h  reason: collision with other inner class name */
    private class C0515h implements C6416g.b {
        private C0515h() {
        }

        public void a(C6416g gVar, int i10) {
            if (i10 == 1 && C6417h.this.f33624p > 0 && C6417h.this.f33620l != -9223372036854775807L) {
                C6417h.this.f33623o.add(gVar);
                ((Handler) C5950a.e(C6417h.this.f33629u)).postAtTime(new C6420k(gVar), gVar, SystemClock.uptimeMillis() + C6417h.this.f33620l);
            } else if (i10 == 0) {
                C6417h.this.f33621m.remove(gVar);
                if (C6417h.this.f33626r == gVar) {
                    C6416g unused = C6417h.this.f33626r = null;
                }
                if (C6417h.this.f33627s == gVar) {
                    C6416g unused2 = C6417h.this.f33627s = null;
                }
                C6417h.this.f33617i.d(gVar);
                if (C6417h.this.f33620l != -9223372036854775807L) {
                    ((Handler) C5950a.e(C6417h.this.f33629u)).removeCallbacksAndMessages(gVar);
                    C6417h.this.f33623o.remove(gVar);
                }
            }
            C6417h.this.C();
        }

        public void b(C6416g gVar, int i10) {
            if (C6417h.this.f33620l != -9223372036854775807L) {
                C6417h.this.f33623o.remove(gVar);
                ((Handler) C5950a.e(C6417h.this.f33629u)).removeCallbacksAndMessages(gVar);
            }
        }
    }

    private C6422m A(int i10, boolean z10) {
        C6407A a10 = (C6407A) C5950a.e(this.f33625q);
        if ((a10.g() == 2 && C6408B.f33556d) || N.M0(this.f33615g, i10) == -1 || a10.g() == 1) {
            return null;
        }
        C6416g gVar = this.f33626r;
        if (gVar == null) {
            C6416g x10 = x(C9967v.E(), true, (t.a) null, z10);
            this.f33621m.add(x10);
            this.f33626r = x10;
        } else {
            gVar.b((t.a) null);
        }
        return this.f33626r;
    }

    private void B(Looper looper) {
        if (this.f33633y == null) {
            this.f33633y = new d(looper);
        }
    }

    /* access modifiers changed from: private */
    public void C() {
        if (this.f33625q != null && this.f33624p == 0 && this.f33621m.isEmpty() && this.f33622n.isEmpty()) {
            ((C6407A) C5950a.e(this.f33625q)).release();
            this.f33625q = null;
        }
    }

    private void D() {
        e0<C6416g> q10 = C9970y.A(this.f33623o).iterator();
        while (q10.hasNext()) {
            q10.next().c((t.a) null);
        }
    }

    private void E() {
        e0<f> q10 = C9970y.A(this.f33622n).iterator();
        while (q10.hasNext()) {
            q10.next().release();
        }
    }

    private void G(C6422m mVar, t.a aVar) {
        mVar.c(aVar);
        if (this.f33620l != -9223372036854775807L) {
            mVar.c((t.a) null);
        }
    }

    private void H(boolean z10) {
        if (z10 && this.f33628t == null) {
            q.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
        } else if (Thread.currentThread() != ((Looper) C5950a.e(this.f33628t)).getThread()) {
            q.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f33628t.getThread().getName(), new IllegalStateException());
        }
    }

    /* access modifiers changed from: private */
    public C6422m t(Looper looper, t.a aVar, C5807s sVar, boolean z10) {
        List<C5803n.b> list;
        B(looper);
        C5803n nVar = sVar.f28248s;
        if (nVar == null) {
            return A(A.k(sVar.f28244o), z10);
        }
        C6416g gVar = null;
        if (this.f33631w == null) {
            list = y((C5803n) C5950a.e(nVar), this.f33610b, false);
            if (list.isEmpty()) {
                e eVar = new e(this.f33610b);
                q.d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new z(new C6422m.a(eVar, 6003));
            }
        } else {
            list = null;
        }
        if (this.f33614f) {
            Iterator<C6416g> it = this.f33621m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C6416g next = it.next();
                if (N.d(next.f33577a, list)) {
                    gVar = next;
                    break;
                }
            }
        } else {
            gVar = this.f33627s;
        }
        if (gVar == null) {
            gVar = x(list, false, aVar, z10);
            if (!this.f33614f) {
                this.f33627s = gVar;
            }
            this.f33621m.add(gVar);
        } else {
            gVar.b(aVar);
        }
        return gVar;
    }

    private static boolean u(C6422m mVar) {
        if (mVar.getState() != 1) {
            return false;
        }
        Throwable cause = ((C6422m.a) C5950a.e(mVar.f())).getCause();
        return (cause instanceof ResourceBusyException) || x.e(cause);
    }

    private boolean v(C5803n nVar) {
        if (this.f33631w != null) {
            return true;
        }
        if (y(nVar, this.f33610b, true).isEmpty()) {
            if (nVar.f28172d != 1 || !nVar.c(0).b(C5797h.f28130b)) {
                return false;
            }
            q.h("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f33610b);
        }
        String str = nVar.f28171c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? N.f29462a >= 25 : !"cbc1".equals(str) && !"cens".equals(str);
    }

    private C6416g w(List<C5803n.b> list, boolean z10, t.a aVar) {
        C5950a.e(this.f33625q);
        List<C5803n.b> list2 = list;
        C6416g gVar = new C6416g(this.f33610b, this.f33625q, this.f33617i, this.f33619k, list2, this.f33630v, this.f33616h | z10, z10, this.f33631w, this.f33613e, this.f33612d, (Looper) C5950a.e(this.f33628t), this.f33618j, (v1) C5950a.e(this.f33632x));
        gVar.b(aVar);
        if (this.f33620l != -9223372036854775807L) {
            gVar.b((t.a) null);
        }
        return gVar;
    }

    private C6416g x(List<C5803n.b> list, boolean z10, t.a aVar, boolean z11) {
        C6416g w10 = w(list, z10, aVar);
        if (u(w10) && !this.f33623o.isEmpty()) {
            D();
            G(w10, aVar);
            w10 = w(list, z10, aVar);
        }
        if (!u(w10) || !z11 || this.f33622n.isEmpty()) {
            return w10;
        }
        E();
        if (!this.f33623o.isEmpty()) {
            D();
        }
        G(w10, aVar);
        return w(list, z10, aVar);
    }

    private static List<C5803n.b> y(C5803n nVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(nVar.f28172d);
        for (int i10 = 0; i10 < nVar.f28172d; i10++) {
            C5803n.b c10 = nVar.c(i10);
            if ((c10.b(uuid) || (C5797h.f28131c.equals(uuid) && c10.b(C5797h.f28130b))) && (c10.f28177e != null || z10)) {
                arrayList.add(c10);
            }
        }
        return arrayList;
    }

    private synchronized void z(Looper looper) {
        try {
            Looper looper2 = this.f33628t;
            if (looper2 == null) {
                this.f33628t = looper;
                this.f33629u = new Handler(looper);
            } else {
                C5950a.g(looper2 == looper);
                C5950a.e(this.f33629u);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public void F(int i10, byte[] bArr) {
        C5950a.g(this.f33621m.isEmpty());
        if (i10 == 1 || i10 == 3) {
            C5950a.e(bArr);
        }
        this.f33630v = i10;
        this.f33631w = bArr;
    }

    public final void d() {
        H(true);
        int i10 = this.f33624p;
        this.f33624p = i10 + 1;
        if (i10 == 0) {
            if (this.f33625q == null) {
                C6407A a10 = this.f33611c.a(this.f33610b);
                this.f33625q = a10;
                a10.a(new c());
            } else if (this.f33620l != -9223372036854775807L) {
                for (int i11 = 0; i11 < this.f33621m.size(); i11++) {
                    this.f33621m.get(i11).b((t.a) null);
                }
            }
        }
    }

    public C6422m e(t.a aVar, C5807s sVar) {
        boolean z10 = false;
        H(false);
        if (this.f33624p > 0) {
            z10 = true;
        }
        C5950a.g(z10);
        C5950a.i(this.f33628t);
        return t(this.f33628t, aVar, sVar, true);
    }

    public u.b f(t.a aVar, C5807s sVar) {
        C5950a.g(this.f33624p > 0);
        C5950a.i(this.f33628t);
        f fVar = new f(aVar);
        fVar.e(sVar);
        return fVar;
    }

    public int g(C5807s sVar) {
        H(false);
        int g10 = ((C6407A) C5950a.e(this.f33625q)).g();
        C5803n nVar = sVar.f28248s;
        if (nVar == null) {
            if (N.M0(this.f33615g, A.k(sVar.f28244o)) != -1) {
                return g10;
            }
            return 0;
        } else if (v(nVar)) {
            return g10;
        } else {
            return 1;
        }
    }

    public void h(Looper looper, v1 v1Var) {
        z(looper);
        this.f33632x = v1Var;
    }

    public final void release() {
        H(true);
        int i10 = this.f33624p - 1;
        this.f33624p = i10;
        if (i10 == 0) {
            if (this.f33620l != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.f33621m);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ((C6416g) arrayList.get(i11)).c((t.a) null);
                }
            }
            E();
            C();
        }
    }

    private C6417h(UUID uuid, C6407A.c cVar, M m10, HashMap<String, String> hashMap, boolean z10, int[] iArr, boolean z11, j jVar, long j10) {
        C5950a.e(uuid);
        C5950a.b(!C5797h.f28130b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f33610b = uuid;
        this.f33611c = cVar;
        this.f33612d = m10;
        this.f33613e = hashMap;
        this.f33614f = z10;
        this.f33615g = iArr;
        this.f33616h = z11;
        this.f33618j = jVar;
        this.f33617i = new g();
        this.f33619k = new C0515h();
        this.f33630v = 0;
        this.f33621m = new ArrayList();
        this.f33622n = C9944Y.h();
        this.f33623o = C9944Y.h();
        this.f33620l = j10;
    }
}
