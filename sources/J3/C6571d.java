package J3;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import t3.C5950a;
import w3.C;

/* renamed from: J3.d  reason: case insensitive filesystem */
public interface C6571d {

    /* renamed from: J3.d$a */
    public interface a {

        /* renamed from: J3.d$a$a  reason: collision with other inner class name */
        public static final class C0589a {

            /* renamed from: a  reason: collision with root package name */
            private final CopyOnWriteArrayList<C0590a> f37256a = new CopyOnWriteArrayList<>();

            /* renamed from: J3.d$a$a$a  reason: collision with other inner class name */
            private static final class C0590a {
                /* access modifiers changed from: private */

                /* renamed from: a  reason: collision with root package name */
                public final Handler f37257a;
                /* access modifiers changed from: private */

                /* renamed from: b  reason: collision with root package name */
                public final a f37258b;
                /* access modifiers changed from: private */

                /* renamed from: c  reason: collision with root package name */
                public boolean f37259c;

                public C0590a(Handler handler, a aVar) {
                    this.f37257a = handler;
                    this.f37258b = aVar;
                }

                public void d() {
                    this.f37259c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                C5950a.e(handler);
                C5950a.e(aVar);
                e(aVar);
                this.f37256a.add(new C0590a(handler, aVar));
            }

            public void c(int i10, long j10, long j11) {
                Iterator<C0590a> it = this.f37256a.iterator();
                while (it.hasNext()) {
                    C0590a next = it.next();
                    if (!next.f37259c) {
                        next.f37257a.post(new C6570c(next, i10, j10, j11));
                    }
                }
            }

            public void e(a aVar) {
                Iterator<C0590a> it = this.f37256a.iterator();
                while (it.hasNext()) {
                    C0590a next = it.next();
                    if (next.f37258b == aVar) {
                        next.d();
                        this.f37256a.remove(next);
                    }
                }
            }
        }

        void G(int i10, long j10, long j11);
    }

    C c();

    void d(a aVar);

    void e(Handler handler, a aVar);
}
