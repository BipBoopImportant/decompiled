package MI;

import AI.C15429j;
import DI.C15554a;
import DI.C15555b;
import DI.C15558e;
import DI.C15579z;
import DI.u0;
import MI.U;
import OI.C16161c;
import OI.C16163e;
import VI.C16661C;
import VI.C16687s;
import XH.v;
import YH.C16877v;
import cJ.C17069f;
import gJ.C17279j;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uJ.C18096U;
import zJ.C18755d;

public final class z implements C17279j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f136406a = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: type inference failed for: r6v6, types: [DI.h] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final boolean b(DI.C15579z r6) {
            /*
                r5 = this;
                java.util.List r0 = r6.j()
                int r0 = r0.size()
                r1 = 0
                r2 = 1
                if (r0 == r2) goto L_0x000d
                return r1
            L_0x000d:
                DI.m r0 = r6.b()
                boolean r3 = r0 instanceof DI.C15558e
                r4 = 0
                if (r3 == 0) goto L_0x0019
                DI.e r0 = (DI.C15558e) r0
                goto L_0x001a
            L_0x0019:
                r0 = r4
            L_0x001a:
                if (r0 != 0) goto L_0x001d
                return r1
            L_0x001d:
                java.util.List r6 = r6.j()
                java.lang.String r3 = "getValueParameters(...)"
                kotlin.jvm.internal.C17542s.i(r6, r3)
                java.lang.Object r6 = YH.C16877v.b1(r6)
                DI.u0 r6 = (DI.u0) r6
                uJ.U r6 = r6.getType()
                uJ.y0 r6 = r6.N0()
                DI.h r6 = r6.e()
                boolean r3 = r6 instanceof DI.C15558e
                if (r3 == 0) goto L_0x003f
                r4 = r6
                DI.e r4 = (DI.C15558e) r4
            L_0x003f:
                if (r4 != 0) goto L_0x0042
                return r1
            L_0x0042:
                boolean r6 = AI.C15429j.s0(r0)
                if (r6 == 0) goto L_0x0057
                cJ.c r6 = kJ.C17506e.o(r0)
                cJ.c r0 = kJ.C17506e.o(r4)
                boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r0)
                if (r6 == 0) goto L_0x0057
                r1 = r2
            L_0x0057:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: MI.z.a.b(DI.z):boolean");
        }

        private final C16687s c(C15579z zVar, u0 u0Var) {
            if (C16661C.e(zVar) || b(zVar)) {
                C18096U type = u0Var.getType();
                C17542s.i(type, "getType(...)");
                return C16661C.g(C18755d.B(type));
            }
            C18096U type2 = u0Var.getType();
            C17542s.i(type2, "getType(...)");
            return C16661C.g(type2);
        }

        public final boolean a(C15554a aVar, C15554a aVar2) {
            C17542s.j(aVar, "superDescriptor");
            C17542s.j(aVar2, "subDescriptor");
            if ((aVar2 instanceof C16163e) && (aVar instanceof C15579z)) {
                C16163e eVar = (C16163e) aVar2;
                eVar.j().size();
                C15579z zVar = (C15579z) aVar;
                zVar.j().size();
                List<u0> j10 = eVar.a().j();
                C17542s.i(j10, "getValueParameters(...)");
                List<u0> j11 = zVar.a().j();
                C17542s.i(j11, "getValueParameters(...)");
                for (v vVar : C16877v.D1(j10, j11)) {
                    u0 u0Var = (u0) vVar.a();
                    u0 u0Var2 = (u0) vVar.b();
                    C17542s.g(u0Var);
                    boolean z10 = c((C15579z) aVar2, u0Var) instanceof C16687s.d;
                    C17542s.g(u0Var2);
                    if (z10 != (c(zVar, u0Var2) instanceof C16687s.d)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private a() {
        }
    }

    private final boolean c(C15554a aVar, C15554a aVar2, C15558e eVar) {
        if ((aVar instanceof C15555b) && (aVar2 instanceof C15579z) && !C15429j.h0(aVar2)) {
            C16065i iVar = C16065i.f136375o;
            C15579z zVar = (C15579z) aVar2;
            C17069f name = zVar.getName();
            C17542s.i(name, "getName(...)");
            if (!iVar.n(name)) {
                U.a aVar3 = U.f136347a;
                C17069f name2 = zVar.getName();
                C17542s.i(name2, "getName(...)");
                if (!aVar3.k(name2)) {
                    return false;
                }
            }
            C15555b j10 = T.j((C15555b) aVar);
            boolean z10 = aVar instanceof C15579z;
            C15579z zVar2 = z10 ? (C15579z) aVar : null;
            if (!(zVar2 != null && zVar.D0() == zVar2.D0()) && (j10 == null || !zVar.D0())) {
                return true;
            }
            if ((eVar instanceof C16161c) && zVar.t0() == null && j10 != null && !T.l(eVar, j10)) {
                if ((j10 instanceof C15579z) && z10 && C16065i.l((C15579z) j10) != null) {
                    String c10 = C16661C.c(zVar, false, false, 2, (Object) null);
                    C15579z a10 = ((C15579z) aVar).a();
                    C17542s.i(a10, "getOriginal(...)");
                    if (C17542s.e(c10, C16661C.c(a10, false, false, 2, (Object) null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public C17279j.a a() {
        return C17279j.a.CONFLICTS_ONLY;
    }

    public C17279j.b b(C15554a aVar, C15554a aVar2, C15558e eVar) {
        C17542s.j(aVar, "superDescriptor");
        C17542s.j(aVar2, "subDescriptor");
        return c(aVar, aVar2, eVar) ? C17279j.b.INCOMPATIBLE : f136406a.a(aVar, aVar2) ? C17279j.b.INCOMPATIBLE : C17279j.b.UNKNOWN;
    }
}
