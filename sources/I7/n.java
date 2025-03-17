package I7;

import Y7.h;
import Y7.l;
import java.util.Queue;

public class n<A, B> {

    /* renamed from: a  reason: collision with root package name */
    private final h<b<A>, B> f37031a;

    class a extends h<b<A>, B> {
        a(long j10) {
            super(j10);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public void j(b<A> bVar, B b10) {
            bVar.c();
        }
    }

    static final class b<A> {

        /* renamed from: d  reason: collision with root package name */
        private static final Queue<b<?>> f37033d = l.f(0);

        /* renamed from: a  reason: collision with root package name */
        private int f37034a;

        /* renamed from: b  reason: collision with root package name */
        private int f37035b;

        /* renamed from: c  reason: collision with root package name */
        private A f37036c;

        private b() {
        }

        static <A> b<A> a(A a10, int i10, int i11) {
            b<A> poll;
            Queue<b<?>> queue = f37033d;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new b<>();
            }
            poll.b(a10, i10, i11);
            return poll;
        }

        private void b(A a10, int i10, int i11) {
            this.f37036c = a10;
            this.f37035b = i10;
            this.f37034a = i11;
        }

        public void c() {
            Queue<b<?>> queue = f37033d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f37035b == bVar.f37035b && this.f37034a == bVar.f37034a && this.f37036c.equals(bVar.f37036c);
        }

        public int hashCode() {
            return (((this.f37034a * 31) + this.f37035b) * 31) + this.f37036c.hashCode();
        }
    }

    public n(long j10) {
        this.f37031a = new a(j10);
    }

    public B a(A a10, int i10, int i11) {
        b a11 = b.a(a10, i10, i11);
        B g10 = this.f37031a.g(a11);
        a11.c();
        return g10;
    }

    public void b(A a10, int i10, int i11, B b10) {
        this.f37031a.k(b.a(a10, i10, i11), b10);
    }
}
