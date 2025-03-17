package RI;

import DI.n0;
import YH.g0;
import java.util.Set;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uJ.C18085I;
import uJ.C18113f0;
import uJ.L0;

/* renamed from: RI.a  reason: case insensitive filesystem */
public final class C16377a extends C18085I {

    /* renamed from: d  reason: collision with root package name */
    private final L0 f137989d;

    /* renamed from: e  reason: collision with root package name */
    private final C16379c f137990e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f137991f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f137992g;

    /* renamed from: h  reason: collision with root package name */
    private final Set<n0> f137993h;

    /* renamed from: i  reason: collision with root package name */
    private final C18113f0 f137994i;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16377a(L0 l02, C16379c cVar, boolean z10, boolean z11, Set set, C18113f0 f0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(l02, (i10 & 2) != 0 ? C16379c.INFLEXIBLE : cVar, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : set, (i10 & 32) != 0 ? null : f0Var);
    }

    public static /* synthetic */ C16377a f(C16377a aVar, L0 l02, C16379c cVar, boolean z10, boolean z11, Set<n0> set, C18113f0 f0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l02 = aVar.f137989d;
        }
        if ((i10 & 2) != 0) {
            cVar = aVar.f137990e;
        }
        C16379c cVar2 = cVar;
        if ((i10 & 4) != 0) {
            z10 = aVar.f137991f;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = aVar.f137992g;
        }
        boolean z13 = z11;
        if ((i10 & 16) != 0) {
            set = aVar.f137993h;
        }
        Set<n0> set2 = set;
        if ((i10 & 32) != 0) {
            f0Var = aVar.f137994i;
        }
        return aVar.e(l02, cVar2, z12, z13, set2, f0Var);
    }

    public C18113f0 a() {
        return this.f137994i;
    }

    public L0 b() {
        return this.f137989d;
    }

    public Set<n0> c() {
        return this.f137993h;
    }

    public final C16377a e(L0 l02, C16379c cVar, boolean z10, boolean z11, Set<? extends n0> set, C18113f0 f0Var) {
        C17542s.j(l02, "howThisTypeIsUsed");
        C17542s.j(cVar, "flexibility");
        return new C16377a(l02, cVar, z10, z11, set, f0Var);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C16377a)) {
            return false;
        }
        C16377a aVar = (C16377a) obj;
        return C17542s.e(aVar.a(), a()) && aVar.b() == b() && aVar.f137990e == this.f137990e && aVar.f137991f == this.f137991f && aVar.f137992g == this.f137992g;
    }

    public final C16379c g() {
        return this.f137990e;
    }

    public final boolean h() {
        return this.f137992g;
    }

    public int hashCode() {
        C18113f0 a10 = a();
        int hashCode = a10 != null ? a10.hashCode() : 0;
        int hashCode2 = hashCode + (hashCode * 31) + b().hashCode();
        int hashCode3 = hashCode2 + (hashCode2 * 31) + this.f137990e.hashCode();
        int i10 = hashCode3 + (hashCode3 * 31) + (this.f137991f ? 1 : 0);
        return i10 + (i10 * 31) + (this.f137992g ? 1 : 0);
    }

    public final boolean i() {
        return this.f137991f;
    }

    public final C16377a j(boolean z10) {
        return f(this, (L0) null, (C16379c) null, z10, false, (Set) null, (C18113f0) null, 59, (Object) null);
    }

    public C16377a k(C18113f0 f0Var) {
        return f(this, (L0) null, (C16379c) null, false, false, (Set) null, f0Var, 31, (Object) null);
    }

    public final C16377a l(C16379c cVar) {
        C17542s.j(cVar, "flexibility");
        return f(this, (L0) null, cVar, false, false, (Set) null, (C18113f0) null, 61, (Object) null);
    }

    /* renamed from: m */
    public C16377a d(n0 n0Var) {
        C17542s.j(n0Var, "typeParameter");
        return f(this, (L0) null, (C16379c) null, false, false, c() != null ? g0.l(c(), n0Var) : g0.c(n0Var), (C18113f0) null, 47, (Object) null);
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f137989d + ", flexibility=" + this.f137990e + ", isRaw=" + this.f137991f + ", isForAnnotationParameter=" + this.f137992g + ", visitedTypeParameters=" + this.f137993h + ", defaultType=" + this.f137994i + ')';
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16377a(L0 l02, C16379c cVar, boolean z10, boolean z11, Set<? extends n0> set, C18113f0 f0Var) {
        super(l02, set, f0Var);
        C17542s.j(l02, "howThisTypeIsUsed");
        C17542s.j(cVar, "flexibility");
        this.f137989d = l02;
        this.f137990e = cVar;
        this.f137991f = z10;
        this.f137992g = z11;
        this.f137993h = set;
        this.f137994i = f0Var;
    }
}
