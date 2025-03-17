package VI;

import DI.j0;
import bJ.C17046e;
import kotlin.jvm.internal.C17542s;
import qJ.C17837y;
import sJ.C17941r;
import sJ.C17942s;

/* renamed from: VI.z  reason: case insensitive filesystem */
public final class C16694z implements C17942s {

    /* renamed from: b  reason: collision with root package name */
    private final C16692x f139426b;

    /* renamed from: c  reason: collision with root package name */
    private final C17837y<C17046e> f139427c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f139428d;

    /* renamed from: e  reason: collision with root package name */
    private final C17941r f139429e;

    public C16694z(C16692x xVar, C17837y<C17046e> yVar, boolean z10, C17941r rVar) {
        C17542s.j(xVar, "binaryClass");
        C17542s.j(rVar, "abiStability");
        this.f139426b = xVar;
        this.f139427c = yVar;
        this.f139428d = z10;
        this.f139429e = rVar;
    }

    public String a() {
        return "Class '" + this.f139426b.k().a().a() + '\'';
    }

    public j0 b() {
        j0 j0Var = j0.f133843a;
        C17542s.i(j0Var, "NO_SOURCE_FILE");
        return j0Var;
    }

    public final C16692x d() {
        return this.f139426b;
    }

    public String toString() {
        return C16694z.class.getSimpleName() + ": " + this.f139426b;
    }
}
