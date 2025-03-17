package FI;

import DI.C15558e;
import DI.h0;
import kotlin.jvm.internal.C17542s;

/* renamed from: FI.c  reason: case insensitive filesystem */
public interface C15687c {

    /* renamed from: FI.c$a */
    public static final class a implements C15687c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f134402a = new a();

        private a() {
        }

        public boolean b(C15558e eVar, h0 h0Var) {
            C17542s.j(eVar, "classDescriptor");
            C17542s.j(h0Var, "functionDescriptor");
            return true;
        }
    }

    /* renamed from: FI.c$b */
    public static final class b implements C15687c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f134403a = new b();

        private b() {
        }

        public boolean b(C15558e eVar, h0 h0Var) {
            C17542s.j(eVar, "classDescriptor");
            C17542s.j(h0Var, "functionDescriptor");
            return !h0Var.getAnnotations().f2(C15688d.a());
        }
    }

    boolean b(C15558e eVar, h0 h0Var);
}
