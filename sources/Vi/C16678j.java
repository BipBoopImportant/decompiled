package VI;

import AI.C15429j;
import DI.C15544O;
import DI.C15554a;
import DI.C15558e;
import DI.C15565l;
import DI.C15566m;
import DI.b0;
import EJ.C15669j;
import HJ.C15854t;
import XH.C16807N;
import cJ.C17066c;
import cJ.C17071h;
import kotlin.jvm.internal.C17542s;
import nI.q;
import uJ.C18096U;
import uJ.M0;

/* renamed from: VI.j  reason: case insensitive filesystem */
public final class C16678j {
    public static final String a(C15558e eVar, C16665G<?> g10) {
        C17542s.j(eVar, "klass");
        C17542s.j(g10, "typeMappingConfiguration");
        String b10 = g10.b(eVar);
        if (b10 != null) {
            return b10;
        }
        C15566m b11 = eVar.b();
        C17542s.i(b11, "getContainingDeclaration(...)");
        String m10 = C17071h.b(eVar.getName()).m();
        C17542s.i(m10, "getIdentifier(...)");
        if (b11 instanceof C15544O) {
            C17066c f10 = ((C15544O) b11).f();
            if (f10.c()) {
                return m10;
            }
            return C15854t.P(f10.a(), '.', '/', false, 4, (Object) null) + '/' + m10;
        }
        C15558e eVar2 = b11 instanceof C15558e ? (C15558e) b11 : null;
        if (eVar2 != null) {
            String c10 = g10.c(eVar2);
            if (c10 == null) {
                c10 = a(eVar2, g10);
            }
            return c10 + '$' + m10;
        }
        throw new IllegalArgumentException("Unexpected container: " + b11 + " for " + eVar);
    }

    public static /* synthetic */ String b(C15558e eVar, C16665G g10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            g10 = C16666H.f139319a;
        }
        return a(eVar, g10);
    }

    public static final boolean c(C15554a aVar) {
        C17542s.j(aVar, "descriptor");
        if (aVar instanceof C15565l) {
            return true;
        }
        C18096U returnType = aVar.getReturnType();
        C17542s.g(returnType);
        if (C15429j.D0(returnType)) {
            C18096U returnType2 = aVar.getReturnType();
            C17542s.g(returnType2);
            return !M0.l(returnType2) && !(aVar instanceof b0);
        }
    }

    /* JADX WARNING: type inference failed for: r12v9, types: [DI.m, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T d(uJ.C18096U r8, VI.C16688t<T> r9, VI.C16667I r10, VI.C16665G<? extends T> r11, VI.C16685q<T> r12, nI.q<? super uJ.C18096U, ? super T, ? super VI.C16667I, XH.C16807N> r13) {
        /*
            java.lang.String r0 = "kotlinType"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "mode"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "typeMappingConfiguration"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "writeGenericType"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            uJ.U r1 = r11.d(r8)
            if (r1 == 0) goto L_0x0029
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r8 = d(r1, r2, r3, r4, r5, r6)
            return r8
        L_0x0029:
            boolean r0 = AI.C15428i.r(r8)
            if (r0 == 0) goto L_0x003d
            uJ.f0 r1 = AI.C15436q.a(r8)
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            java.lang.Object r8 = d(r1, r2, r3, r4, r5, r6)
            return r8
        L_0x003d:
            vJ.u r0 = vJ.u.f149076a
            java.lang.Object r1 = VI.C16668J.b(r0, r8, r9, r10)
            if (r1 == 0) goto L_0x0051
            boolean r11 = r10.d()
            java.lang.Object r9 = VI.C16668J.a(r9, r1, r11)
            r13.invoke(r8, r9, r10)
            return r9
        L_0x0051:
            uJ.y0 r1 = r8.N0()
            boolean r2 = r1 instanceof uJ.C18095T
            if (r2 == 0) goto L_0x0077
            uJ.T r1 = (uJ.C18095T) r1
            uJ.U r8 = r1.m()
            if (r8 != 0) goto L_0x0069
            java.util.Collection r8 = r1.a()
            uJ.U r8 = r11.f(r8)
        L_0x0069:
            uJ.U r0 = zJ.C18755d.D(r8)
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.Object r8 = d(r0, r1, r2, r3, r4, r5)
            return r8
        L_0x0077:
            DI.h r1 = r1.e()
            if (r1 == 0) goto L_0x01c3
            boolean r2 = wJ.C18230l.m(r1)
            if (r2 == 0) goto L_0x008f
            java.lang.String r10 = "error/NonExistentClass"
            java.lang.Object r9 = r9.e(r10)
            DI.e r1 = (DI.C15558e) r1
            r11.e(r8, r1)
            return r9
        L_0x008f:
            boolean r2 = r1 instanceof DI.C15558e
            if (r2 == 0) goto L_0x00fe
            boolean r3 = AI.C15429j.d0(r8)
            if (r3 == 0) goto L_0x00fe
            java.util.List r0 = r8.L0()
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L_0x00f6
            java.util.List r8 = r8.L0()
            r0 = 0
            java.lang.Object r8 = r8.get(r0)
            uJ.E0 r8 = (uJ.E0) r8
            uJ.U r2 = r8.getType()
            java.lang.String r0 = "getType(...)"
            kotlin.jvm.internal.C17542s.i(r2, r0)
            uJ.Q0 r0 = r8.c()
            uJ.Q0 r3 = uJ.Q0.IN_VARIANCE
            if (r0 != r3) goto L_0x00c7
            java.lang.String r8 = "java/lang/Object"
            java.lang.Object r8 = r9.e(r8)
            goto L_0x00dc
        L_0x00c7:
            uJ.Q0 r8 = r8.c()
            java.lang.String r0 = "getProjectionKind(...)"
            kotlin.jvm.internal.C17542s.i(r8, r0)
            VI.I r4 = r10.f(r8, r1)
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r8 = d(r2, r3, r4, r5, r6, r7)
        L_0x00dc:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = 91
            r10.append(r11)
            java.lang.String r8 = r9.d(r8)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            java.lang.Object r8 = r9.b(r8)
            return r8
        L_0x00f6:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.String r9 = "arrays must have one type argument"
            r8.<init>(r9)
            throw r8
        L_0x00fe:
            if (r2 == 0) goto L_0x0170
            boolean r2 = gJ.C17280k.b(r1)
            if (r2 == 0) goto L_0x0122
            boolean r2 = r10.c()
            if (r2 != 0) goto L_0x0122
            yJ.i r0 = uJ.C18086J.a(r0, r8)
            r2 = r0
            uJ.U r2 = (uJ.C18096U) r2
            if (r2 == 0) goto L_0x0122
            VI.I r4 = r10.g()
            r3 = r9
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r8 = d(r2, r3, r4, r5, r6, r7)
            return r8
        L_0x0122:
            boolean r12 = r10.e()
            if (r12 == 0) goto L_0x0136
            r12 = r1
            DI.e r12 = (DI.C15558e) r12
            boolean r12 = AI.C15429j.m0(r12)
            if (r12 == 0) goto L_0x0136
            java.lang.Object r9 = r9.f()
            goto L_0x016c
        L_0x0136:
            DI.e r1 = (DI.C15558e) r1
            DI.e r12 = r1.a()
            java.lang.String r0 = "getOriginal(...)"
            kotlin.jvm.internal.C17542s.i(r12, r0)
            java.lang.Object r12 = r11.a(r12)
            if (r12 != 0) goto L_0x016b
            DI.f r12 = r1.h()
            DI.f r2 = DI.C15559f.ENUM_ENTRY
            if (r12 != r2) goto L_0x015b
            DI.m r12 = r1.b()
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.C17542s.h(r12, r1)
            r1 = r12
            DI.e r1 = (DI.C15558e) r1
        L_0x015b:
            DI.e r12 = r1.a()
            kotlin.jvm.internal.C17542s.i(r12, r0)
            java.lang.String r11 = a(r12, r11)
            java.lang.Object r9 = r9.e(r11)
            goto L_0x016c
        L_0x016b:
            r9 = r12
        L_0x016c:
            r13.invoke(r8, r9, r10)
            return r9
        L_0x0170:
            boolean r0 = r1 instanceof DI.n0
            if (r0 == 0) goto L_0x0192
            DI.n0 r1 = (DI.n0) r1
            uJ.U r12 = zJ.C18755d.o(r1)
            boolean r8 = r8.O0()
            if (r8 == 0) goto L_0x0184
            uJ.U r12 = zJ.C18755d.B(r12)
        L_0x0184:
            r0 = r12
            nI.q r5 = EJ.C15669j.l()
            r4 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            java.lang.Object r8 = d(r0, r1, r2, r3, r4, r5)
            return r8
        L_0x0192:
            boolean r0 = r1 instanceof DI.m0
            if (r0 == 0) goto L_0x01ac
            boolean r0 = r10.b()
            if (r0 == 0) goto L_0x01ac
            DI.m0 r1 = (DI.m0) r1
            uJ.f0 r2 = r1.I()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.Object r8 = d(r2, r3, r4, r5, r6, r7)
            return r8
        L_0x01ac:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Unknown type "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        L_0x01c3:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "no descriptor for type constructor of "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: VI.C16678j.d(uJ.U, VI.t, VI.I, VI.G, VI.q, nI.q):java.lang.Object");
    }

    public static /* synthetic */ Object e(C18096U u10, C16688t tVar, C16667I i10, C16665G g10, C16685q qVar, q<Object, Object, Object, C16807N> qVar2, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            qVar2 = C15669j.l();
        }
        return d(u10, tVar, i10, g10, qVar, qVar2);
    }
}
