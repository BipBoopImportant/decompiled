package u3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import t3.B;
import t3.C5950a;
import t3.N;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final b f30159a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<B> f30160b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<a> f30161c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    private final PriorityQueue<a> f30162d = new PriorityQueue<>();

    /* renamed from: e  reason: collision with root package name */
    private int f30163e = -1;

    /* renamed from: f  reason: collision with root package name */
    private a f30164f;

    private static final class a implements Comparable<a> {

        /* renamed from: a  reason: collision with root package name */
        public final List<B> f30165a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public long f30166b = -9223372036854775807L;

        /* renamed from: a */
        public int compareTo(a aVar) {
            return Long.compare(this.f30166b, aVar.f30166b);
        }

        public void b(long j10, B b10) {
            C5950a.a(j10 != -9223372036854775807L);
            C5950a.g(this.f30165a.isEmpty());
            this.f30166b = j10;
            this.f30165a.add(b10);
        }
    }

    public interface b {
        void a(long j10, B b10);
    }

    public g(b bVar) {
        this.f30159a = bVar;
    }

    private B b(B b10) {
        B b11 = this.f30160b.isEmpty() ? new B() : this.f30160b.pop();
        b11.S(b10.a());
        System.arraycopy(b10.e(), b10.f(), b11.e(), 0, b11.a());
        return b11;
    }

    private void d(int i10) {
        while (this.f30162d.size() > i10) {
            a aVar = (a) N.i(this.f30162d.poll());
            for (int i11 = 0; i11 < aVar.f30165a.size(); i11++) {
                this.f30159a.a(aVar.f30166b, aVar.f30165a.get(i11));
                this.f30160b.push(aVar.f30165a.get(i11));
            }
            aVar.f30165a.clear();
            a aVar2 = this.f30164f;
            if (aVar2 != null && aVar2.f30166b == aVar.f30166b) {
                this.f30164f = null;
            }
            this.f30161c.push(aVar);
        }
    }

    public void a(long j10, B b10) {
        int i10 = this.f30163e;
        if (i10 == 0 || (i10 != -1 && this.f30162d.size() >= this.f30163e && j10 < ((a) N.i(this.f30162d.peek())).f30166b)) {
            this.f30159a.a(j10, b10);
            return;
        }
        B b11 = b(b10);
        a aVar = this.f30164f;
        if (aVar == null || j10 != aVar.f30166b) {
            a aVar2 = this.f30161c.isEmpty() ? new a() : this.f30161c.pop();
            aVar2.b(j10, b11);
            this.f30162d.add(aVar2);
            this.f30164f = aVar2;
            int i11 = this.f30163e;
            if (i11 != -1) {
                d(i11);
                return;
            }
            return;
        }
        aVar.f30165a.add(b11);
    }

    public void c() {
        d(0);
    }

    public int e() {
        return this.f30163e;
    }

    public void f(int i10) {
        C5950a.g(i10 >= 0);
        this.f30163e = i10;
        d(i10);
    }
}
