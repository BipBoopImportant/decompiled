package MI;

import DI.C15554a;
import DI.C15558e;
import DI.d0;
import DI.h0;
import DI.n0;
import DI.u0;
import GJ.C15765h;
import GJ.C15768k;
import OI.C16163e;
import RI.i;
import RI.k;
import YH.C16877v;
import gJ.C17279j;
import gJ.C17284o;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uJ.C18096U;
import uJ.D0;

/* renamed from: MI.q  reason: case insensitive filesystem */
public final class C16073q implements C17279j {

    /* renamed from: MI.q$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f136386a;

        static {
            int[] iArr = new int[C17284o.i.a.values().length];
            try {
                iArr[C17284o.i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f136386a = iArr;
        }
    }

    /* access modifiers changed from: private */
    public static final C18096U d(u0 u0Var) {
        return u0Var.getType();
    }

    public C17279j.a a() {
        return C17279j.a.SUCCESS_ONLY;
    }

    public C17279j.b b(C15554a aVar, C15554a aVar2, C15558e eVar) {
        C17542s.j(aVar, "superDescriptor");
        C17542s.j(aVar2, "subDescriptor");
        if (aVar2 instanceof C16163e) {
            C16163e eVar2 = (C16163e) aVar2;
            List<n0> typeParameters = eVar2.getTypeParameters();
            C17542s.i(typeParameters, "getTypeParameters(...)");
            if (typeParameters.isEmpty()) {
                C17284o.i w10 = C17284o.w(aVar, aVar2);
                if ((w10 != null ? w10.c() : null) != null) {
                    return C17279j.b.UNKNOWN;
                }
                List<u0> j10 = eVar2.j();
                C17542s.i(j10, "getValueParameters(...)");
                C15765h S10 = C15768k.S(C16877v.h0(j10), C16072p.f136385a);
                C18096U returnType = eVar2.getReturnType();
                C17542s.g(returnType);
                C15765h W10 = C15768k.W(S10, returnType);
                d0 O10 = eVar2.O();
                for (C18096U u10 : C15768k.V(W10, C16877v.r(O10 != null ? O10.getType() : null))) {
                    if (!u10.L0().isEmpty() && !(u10.Q0() instanceof k)) {
                        return C17279j.b.UNKNOWN;
                    }
                }
                C15554a aVar3 = (C15554a) aVar.c(new i((D0) null, 1, (DefaultConstructorMarker) null).c());
                if (aVar3 == null) {
                    return C17279j.b.UNKNOWN;
                }
                if (aVar3 instanceof h0) {
                    h0 h0Var = (h0) aVar3;
                    List<n0> typeParameters2 = h0Var.getTypeParameters();
                    C17542s.i(typeParameters2, "getTypeParameters(...)");
                    if (!typeParameters2.isEmpty()) {
                        aVar3 = h0Var.x().r(C16877v.n()).g();
                        C17542s.g(aVar3);
                    }
                }
                C17284o.i.a c10 = C17284o.f143311f.F(aVar3, aVar2, false).c();
                C17542s.i(c10, "getResult(...)");
                return a.f136386a[c10.ordinal()] == 1 ? C17279j.b.OVERRIDABLE : C17279j.b.UNKNOWN;
            }
        }
        return C17279j.b.UNKNOWN;
    }
}
