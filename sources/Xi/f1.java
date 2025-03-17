package xI;

import AI.C15432m;
import AI.C15435p;
import CI.C15494a;
import CI.C15496c;
import DI.C15555b;
import DI.C15579z;
import DI.b0;
import DI.c0;
import JI.C15965f;
import MI.C16047H;
import MI.T;
import VI.C16661C;
import bJ.C17045d;
import cJ.C17065b;
import cJ.C17066c;
import gJ.C17277h;
import kJ.C17506e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lJ.C17558e;
import xI.C18648n;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u001e\u0010#\u001a\u0004\u0018\u00010 *\u0006\u0012\u0002\b\u00030\u00198BX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LxI/f1;", "", "<init>", "()V", "LDI/z;", "descriptor", "", "b", "(LDI/z;)Z", "LxI/n$e;", "d", "(LDI/z;)LxI/n$e;", "LDI/b;", "", "e", "(LDI/b;)Ljava/lang/String;", "possiblySubstitutedFunction", "LxI/n;", "g", "(LDI/z;)LxI/n;", "LDI/a0;", "possiblyOverriddenProperty", "LxI/p;", "f", "(LDI/a0;)LxI/p;", "Ljava/lang/Class;", "klass", "LcJ/b;", "c", "(Ljava/lang/Class;)LcJ/b;", "LcJ/b;", "JAVA_LANG_VOID", "LAI/m;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    public static final f1 f152407a = new f1();

    /* renamed from: b  reason: collision with root package name */
    private static final C17065b f152408b = C17065b.f141241d.c(new C17066c("java.lang.Void"));

    private f1() {
    }

    private final C15432m a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return C17558e.j(cls.getSimpleName()).v();
        }
        return null;
    }

    private final boolean b(C15579z zVar) {
        if (C17277h.p(zVar) || C17277h.q(zVar)) {
            return true;
        }
        return C17542s.e(zVar.getName(), C15494a.f133488e.a()) && zVar.j().isEmpty();
    }

    private final C18648n.e d(C15579z zVar) {
        return new C18648n.e(new C17045d.b(e(zVar), C16661C.c(zVar, false, false, 1, (Object) null)));
    }

    private final String e(C15555b bVar) {
        String e10 = T.e(bVar);
        if (e10 != null) {
            return e10;
        }
        if (bVar instanceof b0) {
            String b10 = C17506e.w(bVar).getName().b();
            C17542s.i(b10, "asString(...)");
            return C16047H.b(b10);
        } else if (bVar instanceof c0) {
            String b11 = C17506e.w(bVar).getName().b();
            C17542s.i(b11, "asString(...)");
            return C16047H.e(b11);
        } else {
            String b12 = bVar.getName().b();
            C17542s.i(b12, "asString(...)");
            return b12;
        }
    }

    public final C17065b c(Class<?> cls) {
        C17065b m10;
        C17542s.j(cls, "klass");
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            C17542s.i(componentType, "getComponentType(...)");
            C15432m a10 = a(componentType);
            return a10 != null ? new C17065b(C15435p.f133015A, a10.v()) : C17065b.f141241d.c(C15435p.a.f133106i.m());
        } else if (C17542s.e(cls, Void.TYPE)) {
            return f152408b;
        } else {
            C15432m a11 = a(cls);
            if (a11 != null) {
                return new C17065b(C15435p.f133015A, a11.C());
            }
            C17065b e10 = C15965f.e(cls);
            return (e10.i() || (m10 = C15496c.f133492a.m(e10.a())) == null) ? e10 : m10;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: xI.n$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final xI.C18652p f(DI.a0 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "possiblyOverriddenProperty"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            DI.b r8 = gJ.C17278i.L(r8)
            DI.a0 r8 = (DI.a0) r8
            DI.a0 r1 = r8.a()
            java.lang.String r8 = "getOriginal(...)"
            kotlin.jvm.internal.C17542s.i(r1, r8)
            boolean r8 = r1 instanceof sJ.C17918N
            r0 = 0
            if (r8 == 0) goto L_0x003e
            r8 = r1
            sJ.N r8 = (sJ.C17918N) r8
            XI.n r2 = r8.h0()
            eJ.i$f<XI.n, aJ.a$d> r3 = aJ.C17030a.f140990d
            java.lang.String r4 = "propertySignature"
            kotlin.jvm.internal.C17542s.i(r3, r4)
            java.lang.Object r3 = ZI.e.a(r2, r3)
            aJ.a$d r3 = (aJ.C17030a.d) r3
            if (r3 == 0) goto L_0x00c8
            xI.p$c r6 = new xI.p$c
            ZI.c r4 = r8.J()
            ZI.g r5 = r8.G()
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L_0x003e:
            boolean r8 = r1 instanceof OI.C16164f
            if (r8 == 0) goto L_0x00c8
            r8 = r1
            OI.f r8 = (OI.C16164f) r8
            DI.i0 r2 = r8.i()
            boolean r3 = r2 instanceof SI.C16420a
            if (r3 == 0) goto L_0x0050
            SI.a r2 = (SI.C16420a) r2
            goto L_0x0051
        L_0x0050:
            r2 = r0
        L_0x0051:
            if (r2 == 0) goto L_0x0058
            TI.l r2 = r2.c()
            goto L_0x0059
        L_0x0058:
            r2 = r0
        L_0x0059:
            boolean r3 = r2 instanceof JI.w
            if (r3 == 0) goto L_0x0069
            xI.p$a r8 = new xI.p$a
            JI.w r2 = (JI.w) r2
            java.lang.reflect.Field r0 = r2.S()
            r8.<init>(r0)
            goto L_0x00a3
        L_0x0069:
            boolean r3 = r2 instanceof JI.z
            if (r3 == 0) goto L_0x00a4
            xI.p$b r1 = new xI.p$b
            JI.z r2 = (JI.z) r2
            java.lang.reflect.Method r2 = r2.S()
            DI.c0 r8 = r8.g()
            if (r8 == 0) goto L_0x0080
            DI.i0 r8 = r8.i()
            goto L_0x0081
        L_0x0080:
            r8 = r0
        L_0x0081:
            boolean r3 = r8 instanceof SI.C16420a
            if (r3 == 0) goto L_0x0088
            SI.a r8 = (SI.C16420a) r8
            goto L_0x0089
        L_0x0088:
            r8 = r0
        L_0x0089:
            if (r8 == 0) goto L_0x0090
            TI.l r8 = r8.c()
            goto L_0x0091
        L_0x0090:
            r8 = r0
        L_0x0091:
            boolean r3 = r8 instanceof JI.z
            if (r3 == 0) goto L_0x0098
            JI.z r8 = (JI.z) r8
            goto L_0x0099
        L_0x0098:
            r8 = r0
        L_0x0099:
            if (r8 == 0) goto L_0x009f
            java.lang.reflect.Method r0 = r8.S()
        L_0x009f:
            r1.<init>(r2, r0)
            r8 = r1
        L_0x00a3:
            return r8
        L_0x00a4:
            xI.Y0 r8 = new xI.Y0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Incorrect resolution sequence for Java field "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = " (source = "
            r0.append(r1)
            r0.append(r2)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x00c8:
            DI.b0 r8 = r1.d()
            kotlin.jvm.internal.C17542s.g(r8)
            xI.n$e r8 = r7.d(r8)
            DI.c0 r1 = r1.g()
            if (r1 == 0) goto L_0x00dd
            xI.n$e r0 = r7.d(r1)
        L_0x00dd:
            xI.p$d r1 = new xI.p$d
            r1.<init>(r8, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xI.f1.f(DI.a0):xI.p");
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [TI.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final xI.C18648n g(DI.C15579z r9) {
        /*
            r8 = this;
            java.lang.String r0 = "possiblySubstitutedFunction"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            DI.b r0 = gJ.C17278i.L(r9)
            DI.z r0 = (DI.C15579z) r0
            DI.z r0 = r0.a()
            java.lang.String r1 = "getOriginal(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            boolean r1 = r0 instanceof sJ.C17925b
            r2 = 0
            if (r1 == 0) goto L_0x0141
            r1 = r0
            sJ.t r1 = (sJ.C17943t) r1
            eJ.q r3 = r1.h0()
            boolean r4 = r3 instanceof XI.i
            if (r4 == 0) goto L_0x003d
            bJ.i r4 = bJ.C17050i.f141191a
            r5 = r3
            XI.i r5 = (XI.i) r5
            ZI.c r6 = r1.J()
            ZI.g r7 = r1.G()
            bJ.d$b r4 = r4.e(r5, r6, r7)
            if (r4 == 0) goto L_0x003d
            xI.n$e r9 = new xI.n$e
            r9.<init>(r4)
            return r9
        L_0x003d:
            boolean r4 = r3 instanceof XI.C16831d
            if (r4 == 0) goto L_0x013c
            bJ.i r4 = bJ.C17050i.f141191a
            XI.d r3 = (XI.C16831d) r3
            ZI.c r5 = r1.J()
            ZI.g r1 = r1.G()
            bJ.d$b r1 = r4.b(r3, r5, r1)
            if (r1 == 0) goto L_0x013c
            DI.m r0 = r9.b()
            java.lang.String r3 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.C17542s.i(r0, r3)
            boolean r0 = gJ.C17280k.b(r0)
            if (r0 == 0) goto L_0x0069
            xI.n$e r9 = new xI.n$e
            r9.<init>(r1)
            goto L_0x013b
        L_0x0069:
            DI.m r0 = r9.b()
            kotlin.jvm.internal.C17542s.i(r0, r3)
            boolean r0 = gJ.C17280k.d(r0)
            if (r0 == 0) goto L_0x0136
            DI.l r9 = (DI.C15565l) r9
            boolean r0 = r9.d0()
            java.lang.String r3 = ")V"
            java.lang.String r4 = "constructor-impl"
            java.lang.String r5 = "Invalid signature: "
            r6 = 2
            r7 = 0
            if (r0 == 0) goto L_0x00b4
            java.lang.String r9 = r1.e()
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r4)
            if (r9 == 0) goto L_0x009b
            java.lang.String r9 = r1.d()
            boolean r9 = HJ.C15854t.G(r9, r3, r7, r6, r2)
            if (r9 == 0) goto L_0x009b
            goto L_0x00fe
        L_0x009b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        L_0x00b4:
            java.lang.String r0 = r1.e()
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r4)
            if (r0 == 0) goto L_0x011d
            DI.e r9 = r9.e0()
            java.lang.String r0 = "getConstructedClass(...)"
            kotlin.jvm.internal.C17542s.i(r9, r0)
            java.lang.String r9 = yI.C18731o.u(r9)
            java.lang.String r0 = r1.d()
            boolean r0 = HJ.C15854t.G(r0, r3, r7, r6, r2)
            if (r0 == 0) goto L_0x00f4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r1.d()
            java.lang.String r4 = "V"
            java.lang.String r3 = HJ.C15854t.P0(r3, r4)
            r0.append(r3)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r0 = 1
            bJ.d$b r1 = bJ.C17045d.b.c(r1, r2, r9, r0, r2)
            goto L_0x00fe
        L_0x00f4:
            java.lang.String r0 = r1.d()
            boolean r9 = HJ.C15854t.G(r0, r9, r7, r6, r2)
            if (r9 == 0) goto L_0x0104
        L_0x00fe:
            xI.n$e r9 = new xI.n$e
            r9.<init>(r1)
            goto L_0x013b
        L_0x0104:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        L_0x011d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        L_0x0136:
            xI.n$d r9 = new xI.n$d
            r9.<init>(r1)
        L_0x013b:
            return r9
        L_0x013c:
            xI.n$e r9 = r8.d(r0)
            return r9
        L_0x0141:
            boolean r9 = r0 instanceof OI.C16163e
            if (r9 == 0) goto L_0x0188
            r9 = r0
            OI.e r9 = (OI.C16163e) r9
            DI.i0 r9 = r9.i()
            boolean r1 = r9 instanceof SI.C16420a
            if (r1 == 0) goto L_0x0153
            SI.a r9 = (SI.C16420a) r9
            goto L_0x0154
        L_0x0153:
            r9 = r2
        L_0x0154:
            if (r9 == 0) goto L_0x015b
            TI.l r9 = r9.c()
            goto L_0x015c
        L_0x015b:
            r9 = r2
        L_0x015c:
            boolean r1 = r9 instanceof JI.z
            if (r1 == 0) goto L_0x0163
            r2 = r9
            JI.z r2 = (JI.z) r2
        L_0x0163:
            if (r2 == 0) goto L_0x0171
            java.lang.reflect.Method r9 = r2.S()
            if (r9 == 0) goto L_0x0171
            xI.n$c r0 = new xI.n$c
            r0.<init>(r9)
            return r0
        L_0x0171:
            xI.Y0 r9 = new xI.Y0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Incorrect resolution sequence for Java method "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        L_0x0188:
            boolean r9 = r0 instanceof OI.C16160b
            r1 = 41
            java.lang.String r3 = " ("
            if (r9 == 0) goto L_0x01ed
            r9 = r0
            OI.b r9 = (OI.C16160b) r9
            DI.i0 r9 = r9.i()
            boolean r4 = r9 instanceof SI.C16420a
            if (r4 == 0) goto L_0x019e
            SI.a r9 = (SI.C16420a) r9
            goto L_0x019f
        L_0x019e:
            r9 = r2
        L_0x019f:
            if (r9 == 0) goto L_0x01a5
            TI.l r2 = r9.c()
        L_0x01a5:
            boolean r9 = r2 instanceof JI.t
            if (r9 == 0) goto L_0x01b5
            xI.n$b r9 = new xI.n$b
            JI.t r2 = (JI.t) r2
            java.lang.reflect.Constructor r0 = r2.S()
            r9.<init>(r0)
            goto L_0x01cc
        L_0x01b5:
            boolean r9 = r2 instanceof JI.q
            if (r9 == 0) goto L_0x01cd
            r9 = r2
            JI.q r9 = (JI.q) r9
            boolean r4 = r9.o()
            if (r4 == 0) goto L_0x01cd
            xI.n$a r0 = new xI.n$a
            java.lang.Class r9 = r9.s()
            r0.<init>(r9)
            r9 = r0
        L_0x01cc:
            return r9
        L_0x01cd:
            xI.Y0 r9 = new xI.Y0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Incorrect resolution sequence for Java constructor "
            r4.append(r5)
            r4.append(r0)
            r4.append(r3)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r0 = r4.toString()
            r9.<init>(r0)
            throw r9
        L_0x01ed:
            boolean r9 = r8.b(r0)
            if (r9 == 0) goto L_0x01f8
            xI.n$e r9 = r8.d(r0)
            return r9
        L_0x01f8:
            xI.Y0 r9 = new xI.Y0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Unknown origin of "
            r2.append(r4)
            r2.append(r0)
            r2.append(r3)
            java.lang.Class r0 = r0.getClass()
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: xI.f1.g(DI.z):xI.n");
    }
}
