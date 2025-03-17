package androidx.work;

import androidx.lifecycle.F;
import ob.C10101e;

public interface C {

    /* renamed from: a  reason: collision with root package name */
    public static final b.c f45056a = new b.c();

    /* renamed from: b  reason: collision with root package name */
    public static final b.C0776b f45057b = new b.C0776b();

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f45058a;

            public a(Throwable th2) {
                this.f45058a = th2;
            }

            public String toString() {
                return "FAILURE (" + this.f45058a.getMessage() + ")";
            }
        }

        /* renamed from: androidx.work.C$b$b  reason: collision with other inner class name */
        public static final class C0776b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0776b() {
            }
        }

        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    C10101e<b.c> a();

    F<b> getState();
}
