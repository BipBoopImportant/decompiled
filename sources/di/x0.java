package DI;

import YH.X;
import java.util.Map;
import kotlin.jvm.internal.C17542s;

public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    public static final x0 f133868a = new x0();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<y0, Integer> f133869b;

    /* renamed from: c  reason: collision with root package name */
    private static final h f133870c;

    public static final class a extends y0 {

        /* renamed from: c  reason: collision with root package name */
        public static final a f133871c = new a();

        private a() {
            super("inherited", false);
        }
    }

    public static final class b extends y0 {

        /* renamed from: c  reason: collision with root package name */
        public static final b f133872c = new b();

        private b() {
            super("internal", false);
        }
    }

    public static final class c extends y0 {

        /* renamed from: c  reason: collision with root package name */
        public static final c f133873c = new c();

        private c() {
            super("invisible_fake", false);
        }
    }

    public static final class d extends y0 {

        /* renamed from: c  reason: collision with root package name */
        public static final d f133874c = new d();

        private d() {
            super("local", false);
        }
    }

    public static final class e extends y0 {

        /* renamed from: c  reason: collision with root package name */
        public static final e f133875c = new e();

        private e() {
            super("private", false);
        }
    }

    public static final class f extends y0 {

        /* renamed from: c  reason: collision with root package name */
        public static final f f133876c = new f();

        private f() {
            super("private_to_this", false);
        }

        public String b() {
            return "private/*private to this*/";
        }
    }

    public static final class g extends y0 {

        /* renamed from: c  reason: collision with root package name */
        public static final g f133877c = new g();

        private g() {
            super("protected", true);
        }
    }

    public static final class h extends y0 {

        /* renamed from: c  reason: collision with root package name */
        public static final h f133878c = new h();

        private h() {
            super("public", true);
        }
    }

    public static final class i extends y0 {

        /* renamed from: c  reason: collision with root package name */
        public static final i f133879c = new i();

        private i() {
            super("unknown", false);
        }
    }

    static {
        Map c10 = X.c();
        c10.put(f.f133876c, 0);
        c10.put(e.f133875c, 0);
        c10.put(b.f133872c, 1);
        c10.put(g.f133877c, 1);
        h hVar = h.f133878c;
        c10.put(hVar, 2);
        f133869b = X.b(c10);
        f133870c = hVar;
    }

    private x0() {
    }

    public final Integer a(y0 y0Var, y0 y0Var2) {
        C17542s.j(y0Var, "first");
        C17542s.j(y0Var2, "second");
        if (y0Var == y0Var2) {
            return 0;
        }
        Map<y0, Integer> map = f133869b;
        Integer num = map.get(y0Var);
        Integer num2 = map.get(y0Var2);
        if (num == null || num2 == null || C17542s.e(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(y0 y0Var) {
        C17542s.j(y0Var, "visibility");
        return y0Var == e.f133875c || y0Var == f.f133876c;
    }
}
