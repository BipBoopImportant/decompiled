package xI;

import DI.C15566m;
import DI.a0;
import bJ.C17050i;
import gJ.C17278i;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import sJ.C17918N;
import uJ.M0;
import xI.K0;
import yI.C18725i;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\"\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@X\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LxI/K0$a;", "", "isGetter", "LyI/h;", "b", "(LxI/K0$a;Z)LyI/h;", "LDI/a0;", "g", "(LDI/a0;)Z", "", "f", "(LxI/K0$a;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class P0 {
    /* JADX WARNING: type inference failed for: r7v0, types: [xI.K0$a, xI.K0$a<?, ?>] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0119  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final yI.C18724h<?> b(xI.K0.a<?, ?> r7, boolean r8) {
        /*
            xI.d0$a r0 = xI.C18629d0.f152390a
            HJ.p r0 = r0.a()
            xI.K0 r1 = r7.j0()
            java.lang.String r1 = r1.s0()
            boolean r0 = r0.i(r1)
            if (r0 == 0) goto L_0x0017
            yI.l r7 = yI.C18728l.f152741a
            return r7
        L_0x0017:
            xI.f1 r0 = xI.f1.f152407a
            xI.K0 r1 = r7.j0()
            DI.a0 r1 = r1.d0()
            xI.p r0 = r0.f(r1)
            boolean r1 = r0 instanceof xI.C18652p.c
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0169
            xI.p$c r0 = (xI.C18652p.c) r0
            aJ.a$d r1 = r0.f()
            if (r8 == 0) goto L_0x0040
            boolean r4 = r1.B()
            if (r4 == 0) goto L_0x003e
            aJ.a$c r1 = r1.w()
            goto L_0x004a
        L_0x003e:
            r1 = r3
            goto L_0x004a
        L_0x0040:
            boolean r4 = r1.C()
            if (r4 == 0) goto L_0x003e
            aJ.a$c r1 = r1.x()
        L_0x004a:
            if (r1 == 0) goto L_0x0071
            xI.K0 r4 = r7.j0()
            xI.d0 r4 = r4.b0()
            ZI.c r5 = r0.d()
            int r6 = r1.s()
            java.lang.String r5 = r5.getString(r6)
            ZI.c r0 = r0.d()
            int r1 = r1.r()
            java.lang.String r0 = r0.getString(r1)
            java.lang.reflect.Method r0 = r4.I(r5, r0)
            goto L_0x0072
        L_0x0071:
            r0 = r3
        L_0x0072:
            if (r0 != 0) goto L_0x0119
            xI.K0 r0 = r7.j0()
            DI.a0 r0 = r0.d0()
            boolean r0 = gJ.C17280k.e(r0)
            if (r0 == 0) goto L_0x00ee
            xI.K0 r0 = r7.j0()
            DI.a0 r0 = r0.d0()
            DI.u r0 = r0.getVisibility()
            DI.u r1 = DI.C15573t.f133852d
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r0 == 0) goto L_0x00ee
            xI.K0 r8 = r7.j0()
            DI.a0 r8 = r8.d0()
            DI.m r8 = r8.b()
            java.lang.Class r8 = yI.C18731o.s(r8)
            if (r8 == 0) goto L_0x00ce
            xI.K0 r0 = r7.j0()
            DI.a0 r0 = r0.d0()
            java.lang.reflect.Method r8 = yI.C18731o.m(r8, r0)
            if (r8 == 0) goto L_0x00ce
            boolean r0 = r7.g0()
            if (r0 == 0) goto L_0x00c7
            yI.k$a r0 = new yI.k$a
            java.lang.Object r1 = f(r7)
            r0.<init>(r8, r1)
            goto L_0x01a2
        L_0x00c7:
            yI.k$b r0 = new yI.k$b
            r0.<init>(r8)
            goto L_0x01a2
        L_0x00ce:
            xI.Y0 r8 = new xI.Y0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Underlying property of inline class "
            r0.append(r1)
            xI.K0 r7 = r7.j0()
            r0.append(r7)
            java.lang.String r7 = " should have a field"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x00ee:
            xI.K0 r0 = r7.j0()
            java.lang.reflect.Field r0 = r0.r0()
            if (r0 == 0) goto L_0x00fe
            yI.i r0 = c(r7, r8, r0)
            goto L_0x01a2
        L_0x00fe:
            xI.Y0 r8 = new xI.Y0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No accessors or field is found for property "
            r0.append(r1)
            xI.K0 r7 = r7.j0()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x0119:
            int r8 = r0.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 != 0) goto L_0x013b
            boolean r8 = r7.g0()
            if (r8 == 0) goto L_0x0135
            yI.i$h$a r8 = new yI.i$h$a
            java.lang.Object r1 = f(r7)
            r8.<init>(r0, r1)
        L_0x0132:
            r0 = r8
            goto L_0x01a2
        L_0x0135:
            yI.i$h$e r8 = new yI.i$h$e
            r8.<init>(r0)
            goto L_0x0132
        L_0x013b:
            boolean r8 = d(r7)
            if (r8 == 0) goto L_0x0153
            boolean r8 = r7.g0()
            if (r8 == 0) goto L_0x014d
            yI.i$h$b r8 = new yI.i$h$b
            r8.<init>(r0)
            goto L_0x0132
        L_0x014d:
            yI.i$h$f r8 = new yI.i$h$f
            r8.<init>(r0)
            goto L_0x0132
        L_0x0153:
            boolean r8 = r7.g0()
            if (r8 == 0) goto L_0x0163
            yI.i$h$c r8 = new yI.i$h$c
            java.lang.Object r1 = f(r7)
            r8.<init>(r0, r2, r1)
            goto L_0x0132
        L_0x0163:
            yI.i$h$g r8 = new yI.i$h$g
            r8.<init>(r0)
            goto L_0x0132
        L_0x0169:
            boolean r1 = r0 instanceof xI.C18652p.a
            if (r1 == 0) goto L_0x0178
            xI.p$a r0 = (xI.C18652p.a) r0
            java.lang.reflect.Field r0 = r0.b()
            yI.i r0 = c(r7, r8, r0)
            goto L_0x01a2
        L_0x0178:
            boolean r1 = r0 instanceof xI.C18652p.b
            if (r1 == 0) goto L_0x01c7
            if (r8 == 0) goto L_0x0185
            xI.p$b r0 = (xI.C18652p.b) r0
            java.lang.reflect.Method r8 = r0.b()
            goto L_0x018d
        L_0x0185:
            xI.p$b r0 = (xI.C18652p.b) r0
            java.lang.reflect.Method r8 = r0.c()
            if (r8 == 0) goto L_0x01ac
        L_0x018d:
            boolean r0 = r7.g0()
            if (r0 == 0) goto L_0x019d
            yI.i$h$a r0 = new yI.i$h$a
            java.lang.Object r1 = f(r7)
            r0.<init>(r8, r1)
            goto L_0x01a2
        L_0x019d:
            yI.i$h$e r0 = new yI.i$h$e
            r0.<init>(r8)
        L_0x01a2:
            DI.Z r7 = r7.i0()
            r8 = 2
            yI.h r7 = yI.C18731o.j(r0, r7, r2, r8, r3)
            return r7
        L_0x01ac:
            xI.Y0 r7 = new xI.Y0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "No source found for setter of Java method property: "
            r8.append(r1)
            java.lang.reflect.Method r0 = r0.b()
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x01c7:
            boolean r1 = r0 instanceof xI.C18652p.d
            if (r1 == 0) goto L_0x0245
            if (r8 == 0) goto L_0x01d4
            xI.p$d r0 = (xI.C18652p.d) r0
            xI.n$e r8 = r0.b()
            goto L_0x01dc
        L_0x01d4:
            xI.p$d r0 = (xI.C18652p.d) r0
            xI.n$e r8 = r0.c()
            if (r8 == 0) goto L_0x022a
        L_0x01dc:
            xI.K0 r0 = r7.j0()
            xI.d0 r0 = r0.b0()
            java.lang.String r1 = r8.c()
            java.lang.String r8 = r8.b()
            java.lang.reflect.Method r8 = r0.I(r1, r8)
            if (r8 == 0) goto L_0x020f
            int r0 = r8.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            boolean r0 = r7.g0()
            if (r0 == 0) goto L_0x0209
            yI.i$h$a r0 = new yI.i$h$a
            java.lang.Object r7 = f(r7)
            r0.<init>(r8, r7)
            goto L_0x020e
        L_0x0209:
            yI.i$h$e r0 = new yI.i$h$e
            r0.<init>(r8)
        L_0x020e:
            return r0
        L_0x020f:
            xI.Y0 r8 = new xI.Y0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No accessor found for property "
            r0.append(r1)
            xI.K0 r7 = r7.j0()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x022a:
            xI.Y0 r8 = new xI.Y0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No setter found for property "
            r0.append(r1)
            xI.K0 r7 = r7.j0()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x0245:
            XH.t r7 = new XH.t
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: xI.P0.b(xI.K0$a, boolean):yI.h");
    }

    private static final C18725i<Field> c(K0.a<?, ?> aVar, boolean z10, Field field) {
        C18725i<Field> aVar2;
        if (g(aVar.j0().d0()) || !Modifier.isStatic(field.getModifiers())) {
            if (!z10) {
                aVar2 = aVar.g0() ? new C18725i.g.a(field, e(aVar), f(aVar)) : new C18725i.g.c(field, e(aVar));
            } else if (!aVar.g0()) {
                return new C18725i.f.c(field);
            } else {
                aVar2 = new C18725i.f.a(field, f(aVar));
            }
        } else if (d(aVar)) {
            if (z10) {
                return aVar.g0() ? new C18725i.f.b(field) : new C18725i.f.d(field);
            }
            aVar2 = aVar.g0() ? new C18725i.g.b(field, e(aVar)) : new C18725i.g.d(field, e(aVar));
        } else if (z10) {
            return new C18725i.f.e(field);
        } else {
            aVar2 = new C18725i.g.e(field, e(aVar));
        }
        return aVar2;
    }

    private static final boolean d(K0.a<?, ?> aVar) {
        return aVar.j0().d0().getAnnotations().f2(j1.j());
    }

    private static final boolean e(K0.a<?, ?> aVar) {
        return !M0.l(aVar.j0().d0().getType());
    }

    public static final Object f(K0.a<?, ?> aVar) {
        C17542s.j(aVar, "<this>");
        return aVar.j0().n0();
    }

    private static final boolean g(a0 a0Var) {
        C15566m b10 = a0Var.b();
        C17542s.i(b10, "getContainingDeclaration(...)");
        if (!C17278i.x(b10)) {
            return false;
        }
        C15566m b11 = b10.b();
        return (!C17278i.C(b11) && !C17278i.t(b11)) || ((a0Var instanceof C17918N) && C17050i.f(((C17918N) a0Var).h0()));
    }
}
