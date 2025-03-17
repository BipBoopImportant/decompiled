package MI;

import XH.C16822m;
import cJ.C17066c;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

/* renamed from: MI.D  reason: case insensitive filesystem */
public final class C16043D {

    /* renamed from: d  reason: collision with root package name */
    public static final b f136271d = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C16043D f136272e = new C16043D(C16041B.b((C16822m) null, 1, (Object) null), a.f136276a);

    /* renamed from: a  reason: collision with root package name */
    private final C16046G f136273a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<C17066c, C16054O> f136274b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f136275c;

    /* renamed from: MI.D$a */
    /* synthetic */ class a extends C17540p implements C17642l<C17066c, C16054O> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f136276a = new a();

        a() {
            super(1, C16041B.class, "getDefaultReportLevelForAnnotation", "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;", 1);
        }

        /* renamed from: t */
        public final C16054O invoke(C17066c cVar) {
            C17542s.j(cVar, "p0");
            return C16041B.d(cVar);
        }
    }

    /* renamed from: MI.D$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C16043D a() {
            return C16043D.f136272e;
        }

        private b() {
        }
    }

    public C16043D(C16046G g10, C17642l<? super C17066c, ? extends C16054O> lVar) {
        C17542s.j(g10, "jsr305");
        C17542s.j(lVar, "getReportLevelForAnnotation");
        this.f136273a = g10;
        this.f136274b = lVar;
        this.f136275c = g10.f() || lVar.invoke(C16041B.e()) == C16054O.IGNORE;
    }

    public final boolean b() {
        return this.f136275c;
    }

    public final C17642l<C17066c, C16054O> c() {
        return this.f136274b;
    }

    public final C16046G d() {
        return this.f136273a;
    }

    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f136273a + ", getReportLevelForAnnotation=" + this.f136274b + ')';
    }
}
