package BI;

import AI.C15435p;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17069f;
import kotlin.jvm.internal.C17542s;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    private final C17066c f133283a;

    /* renamed from: b  reason: collision with root package name */
    private final String f133284b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f133285c;

    /* renamed from: d  reason: collision with root package name */
    private final C17065b f133286d;

    public static final class a extends f {

        /* renamed from: e  reason: collision with root package name */
        public static final a f133287e = new a();

        private a() {
            super(C15435p.f133015A, "Function", false, (C17065b) null);
        }
    }

    public static final class b extends f {

        /* renamed from: e  reason: collision with root package name */
        public static final b f133288e = new b();

        private b() {
            super(C15435p.f133046x, "KFunction", true, (C17065b) null);
        }
    }

    public static final class c extends f {

        /* renamed from: e  reason: collision with root package name */
        public static final c f133289e = new c();

        private c() {
            super(C15435p.f133046x, "KSuspendFunction", true, (C17065b) null);
        }
    }

    public static final class d extends f {

        /* renamed from: e  reason: collision with root package name */
        public static final d f133290e = new d();

        private d() {
            super(C15435p.f133041s, "SuspendFunction", false, (C17065b) null);
        }
    }

    public f(C17066c cVar, String str, boolean z10, C17065b bVar) {
        C17542s.j(cVar, "packageFqName");
        C17542s.j(str, "classNamePrefix");
        this.f133283a = cVar;
        this.f133284b = str;
        this.f133285c = z10;
        this.f133286d = bVar;
    }

    public final String a() {
        return this.f133284b;
    }

    public final C17066c b() {
        return this.f133283a;
    }

    public final C17069f c(int i10) {
        C17069f v10 = C17069f.v(this.f133284b + i10);
        C17542s.i(v10, "identifier(...)");
        return v10;
    }

    public String toString() {
        return this.f133283a + '.' + this.f133284b + 'N';
    }
}
