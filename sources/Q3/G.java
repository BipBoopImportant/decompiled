package q3;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;
import t3.N;

public final class G {

    /* renamed from: a  reason: collision with root package name */
    private final Object f27885a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final PriorityQueue<Integer> f27886b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c  reason: collision with root package name */
    private int f27887c = Integer.MIN_VALUE;

    public static class a extends IOException {
        public a(int i10, int i11) {
            super("Priority too low [priority=" + i10 + ", highest=" + i11 + "]");
        }
    }

    public void a(int i10) {
        synchronized (this.f27885a) {
            this.f27886b.add(Integer.valueOf(i10));
            this.f27887c = Math.max(this.f27887c, i10);
        }
    }

    public void b(int i10) {
        synchronized (this.f27885a) {
            try {
                if (this.f27887c != i10) {
                    throw new a(i10, this.f27887c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(int i10) {
        synchronized (this.f27885a) {
            this.f27886b.remove(Integer.valueOf(i10));
            this.f27887c = this.f27886b.isEmpty() ? Integer.MIN_VALUE : ((Integer) N.i(this.f27886b.peek())).intValue();
            this.f27885a.notifyAll();
        }
    }
}
