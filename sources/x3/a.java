package x3;

import java.io.File;
import java.io.IOException;

public interface a {

    /* renamed from: x3.a$a  reason: collision with other inner class name */
    public static class C0493a extends IOException {
        public C0493a(String str) {
            super(str);
        }

        public C0493a(Throwable th2) {
            super(th2);
        }

        public C0493a(String str, Throwable th2) {
            super(str, th2);
        }
    }

    public interface b {
        void a(a aVar, i iVar);

        void d(a aVar, i iVar);

        void f(a aVar, i iVar, i iVar2);
    }

    File a(String str, long j10, long j11);

    l b(String str);

    void c(String str, m mVar);

    i d(String str, long j10, long j11);

    void e(i iVar);

    void f(i iVar);

    i g(String str, long j10, long j11);

    void h(File file, long j10);
}
