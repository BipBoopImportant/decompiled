package uJ;

import EI.C15649h;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: uJ.E  reason: case insensitive filesystem */
public final class C18081E extends H0 {

    /* renamed from: e  reason: collision with root package name */
    public static final a f147811e = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    private final H0 f147812c;

    /* renamed from: d  reason: collision with root package name */
    private final H0 f147813d;

    /* renamed from: uJ.E$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final H0 a(H0 h02, H0 h03) {
            C17542s.j(h02, "first");
            C17542s.j(h03, "second");
            return h02.f() ? h03 : h03.f() ? h02 : new C18081E(h02, h03, (DefaultConstructorMarker) null);
        }

        private a() {
        }
    }

    public /* synthetic */ C18081E(H0 h02, H0 h03, DefaultConstructorMarker defaultConstructorMarker) {
        this(h02, h03);
    }

    public static final H0 i(H0 h02, H0 h03) {
        return f147811e.a(h02, h03);
    }

    public boolean a() {
        return this.f147812c.a() || this.f147813d.a();
    }

    public boolean b() {
        return this.f147812c.b() || this.f147813d.b();
    }

    public C15649h d(C15649h hVar) {
        C17542s.j(hVar, "annotations");
        return this.f147813d.d(this.f147812c.d(hVar));
    }

    public E0 e(C18096U u10) {
        C17542s.j(u10, "key");
        E0 e10 = this.f147812c.e(u10);
        return e10 == null ? this.f147813d.e(u10) : e10;
    }

    public boolean f() {
        return false;
    }

    public C18096U g(C18096U u10, Q0 q02) {
        C17542s.j(u10, "topLevelType");
        C17542s.j(q02, "position");
        return this.f147813d.g(this.f147812c.g(u10, q02), q02);
    }

    private C18081E(H0 h02, H0 h03) {
        this.f147812c = h02;
        this.f147813d = h03;
    }
}
