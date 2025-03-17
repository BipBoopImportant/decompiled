package y0;

import E1.C4488v;
import G1.C4507j;
import G1.C4508k;
import XH.C16807N;
import androidx.compose.foundation.relocation.b;
import c2.s;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import o1.C5669i;
import o1.C5674n;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LG1/j;", "Lo1/i;", "rect", "LXH/N;", "a", "(LG1/j;Lo1/i;LdI/e;)Ljava/lang/Object;", "foundation_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/foundation/relocation/ScrollIntoView")
/* renamed from: y0.f  reason: case insensitive filesystem */
final /* synthetic */ class C6252f {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo1/i;", "b", "()Lo1/i;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: y0.f$a */
    static final class a extends C17544u implements C17631a<C5669i> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5669i f31968c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4488v f31969d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5669i iVar, C4488v vVar) {
            super(0);
            this.f31968c = iVar;
            this.f31969d = vVar;
        }

        /* renamed from: b */
        public final C5669i invoke() {
            C5669i iVar = this.f31968c;
            if (iVar != null) {
                return iVar;
            }
            C4488v vVar = this.f31969d;
            if (!vVar.c()) {
                vVar = null;
            }
            if (vVar != null) {
                return C5674n.c(s.d(vVar.a()));
            }
            return null;
        }
    }

    public static final Object a(C4507j jVar, C5669i iVar, C17164e<? super C16807N> eVar) {
        if (!jVar.E0().j2()) {
            return C16807N.f139792a;
        }
        C4488v k10 = C4508k.k(jVar);
        C6247a c10 = b.c(jVar);
        if (c10 == null) {
            return C16807N.f139792a;
        }
        Object z02 = c10.z0(k10, new a(iVar, k10), eVar);
        return z02 == C17187b.f() ? z02 : C16807N.f139792a;
    }

    public static /* synthetic */ Object b(C4507j jVar, C5669i iVar, C17164e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = null;
        }
        return C6251e.a(jVar, iVar, eVar);
    }
}
