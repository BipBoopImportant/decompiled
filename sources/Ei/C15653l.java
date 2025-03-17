package EI;

import AI.C15429j;
import DI.i0;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import cJ.C17066c;
import cJ.C17069f;
import iJ.C17373g;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uJ.C18096U;
import uJ.C18113f0;

/* renamed from: EI.l  reason: case insensitive filesystem */
public final class C15653l implements C15644c {

    /* renamed from: a  reason: collision with root package name */
    private final C15429j f134236a;

    /* renamed from: b  reason: collision with root package name */
    private final C17066c f134237b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<C17069f, C17373g<?>> f134238c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f134239d;

    /* renamed from: e  reason: collision with root package name */
    private final C16824o f134240e;

    public C15653l(C15429j jVar, C17066c cVar, Map<C17069f, ? extends C17373g<?>> map, boolean z10) {
        C17542s.j(jVar, "builtIns");
        C17542s.j(cVar, "fqName");
        C17542s.j(map, "allValueArguments");
        this.f134236a = jVar;
        this.f134237b = cVar;
        this.f134238c = map;
        this.f134239d = z10;
        this.f134240e = C16825p.a(s.PUBLICATION, new C15652k(this));
    }

    /* access modifiers changed from: private */
    public static final C18113f0 c(C15653l lVar) {
        return lVar.f134236a.p(lVar.f()).r();
    }

    public Map<C17069f, C17373g<?>> a() {
        return this.f134238c;
    }

    public C17066c f() {
        return this.f134237b;
    }

    public C18096U getType() {
        Object value = this.f134240e.getValue();
        C17542s.i(value, "getValue(...)");
        return (C18096U) value;
    }

    public i0 i() {
        i0 i0Var = i0.f133841a;
        C17542s.i(i0Var, "NO_SOURCE");
        return i0Var;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15653l(C15429j jVar, C17066c cVar, Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, cVar, map, (i10 & 8) != 0 ? false : z10);
    }
}
