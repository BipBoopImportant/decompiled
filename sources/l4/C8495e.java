package l4;

import java.util.ArrayDeque;
import k4.C8427k;
import k4.C8428l;
import k4.C8432p;
import k4.q;
import t3.C5950a;
import t3.N;
import y3.g;

/* renamed from: l4.e  reason: case insensitive filesystem */
abstract class C8495e implements C8428l {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<b> f54587a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<q> f54588b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<b> f54589c;

    /* renamed from: d  reason: collision with root package name */
    private b f54590d;

    /* renamed from: e  reason: collision with root package name */
    private long f54591e;

    /* renamed from: f  reason: collision with root package name */
    private long f54592f;

    /* renamed from: g  reason: collision with root package name */
    private long f54593g;

    /* renamed from: l4.e$b */
    private static final class b extends C8432p implements Comparable<b> {
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public long f54594k;

        private b() {
        }

        /* renamed from: Q */
        public int compareTo(b bVar) {
            if (D() != bVar.D()) {
                return D() ? 1 : -1;
            }
            long j10 = this.f32281f - bVar.f32281f;
            if (j10 == 0) {
                j10 = this.f54594k - bVar.f54594k;
                if (j10 == 0) {
                    return 0;
                }
            }
            return j10 > 0 ? 1 : -1;
        }
    }

    /* renamed from: l4.e$c */
    private static final class c extends q {

        /* renamed from: g  reason: collision with root package name */
        private g.a<c> f54595g;

        public c(g.a<c> aVar) {
            this.f54595g = aVar;
        }

        public final void J() {
            this.f54595g.a(this);
        }
    }

    public C8495e() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f54587a.add(new b());
        }
        this.f54588b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f54588b.add(new c(new C8494d(this)));
        }
        this.f54589c = new ArrayDeque<>();
        this.f54593g = -9223372036854775807L;
    }

    private void o(b bVar) {
        bVar.v();
        this.f54587a.add(bVar);
    }

    public void b(long j10) {
        this.f54591e = j10;
    }

    public final void d(long j10) {
        this.f54593g = j10;
    }

    public void flush() {
        this.f54592f = 0;
        this.f54591e = 0;
        while (!this.f54589c.isEmpty()) {
            o((b) N.i(this.f54589c.poll()));
        }
        b bVar = this.f54590d;
        if (bVar != null) {
            o(bVar);
            this.f54590d = null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract C8427k g();

    /* access modifiers changed from: protected */
    public abstract void h(C8432p pVar);

    /* renamed from: i */
    public C8432p e() {
        C5950a.g(this.f54590d == null);
        if (this.f54587a.isEmpty()) {
            return null;
        }
        b pollFirst = this.f54587a.pollFirst();
        this.f54590d = pollFirst;
        return pollFirst;
    }

    /* renamed from: j */
    public q a() {
        if (this.f54588b.isEmpty()) {
            return null;
        }
        while (!this.f54589c.isEmpty() && ((b) N.i(this.f54589c.peek())).f32281f <= this.f54591e) {
            b bVar = (b) N.i(this.f54589c.poll());
            if (bVar.D()) {
                q qVar = (q) N.i(this.f54588b.pollFirst());
                qVar.n(4);
                o(bVar);
                return qVar;
            }
            h(bVar);
            if (m()) {
                C8427k g10 = g();
                q qVar2 = (q) N.i(this.f54588b.pollFirst());
                qVar2.K(bVar.f32281f, g10, Long.MAX_VALUE);
                o(bVar);
                return qVar2;
            }
            o(bVar);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final q k() {
        return this.f54588b.pollFirst();
    }

    /* access modifiers changed from: protected */
    public final long l() {
        return this.f54591e;
    }

    /* access modifiers changed from: protected */
    public abstract boolean m();

    /* renamed from: n */
    public void c(C8432p pVar) {
        C5950a.a(pVar == this.f54590d);
        b bVar = (b) pVar;
        long j10 = bVar.f32281f;
        if (j10 != Long.MIN_VALUE) {
            long j11 = this.f54593g;
            if (j11 != -9223372036854775807L && j10 < j11) {
                o(bVar);
                this.f54590d = null;
            }
        }
        long j12 = this.f54592f;
        this.f54592f = 1 + j12;
        long unused = bVar.f54594k = j12;
        this.f54589c.add(bVar);
        this.f54590d = null;
    }

    /* access modifiers changed from: protected */
    public void p(q qVar) {
        qVar.v();
        this.f54588b.add(qVar);
    }

    public void release() {
    }
}
