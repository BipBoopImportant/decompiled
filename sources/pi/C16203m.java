package PI;

import DI.C15566m;
import DI.n0;
import EJ.C15660a;
import QI.c0;
import TI.y;
import TI.z;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import tJ.C17988h;

/* renamed from: PI.m  reason: case insensitive filesystem */
public final class C16203m implements C16206p {

    /* renamed from: a  reason: collision with root package name */
    private final C16201k f137193a;

    /* renamed from: b  reason: collision with root package name */
    private final C15566m f137194b;

    /* renamed from: c  reason: collision with root package name */
    private final int f137195c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<y, Integer> f137196d;

    /* renamed from: e  reason: collision with root package name */
    private final C17988h<y, c0> f137197e;

    public C16203m(C16201k kVar, C15566m mVar, z zVar, int i10) {
        C17542s.j(kVar, "c");
        C17542s.j(mVar, "containingDeclaration");
        C17542s.j(zVar, "typeParameterOwner");
        this.f137193a = kVar;
        this.f137194b = mVar;
        this.f137195c = i10;
        this.f137196d = C15660a.d(zVar.getTypeParameters());
        this.f137197e = kVar.e().e(new C16202l(this));
    }

    /* access modifiers changed from: private */
    public static final c0 c(C16203m mVar, y yVar) {
        C17542s.j(yVar, "typeParameter");
        Integer num = mVar.f137196d.get(yVar);
        if (num == null) {
            return null;
        }
        return new c0(C16193c.k(C16193c.d(mVar.f137193a, mVar), mVar.f137194b.getAnnotations()), yVar, mVar.f137195c + num.intValue(), mVar.f137194b);
    }

    public n0 a(y yVar) {
        C17542s.j(yVar, "javaTypeParameter");
        c0 invoke = this.f137197e.invoke(yVar);
        return invoke != null ? invoke : this.f137193a.f().a(yVar);
    }
}
