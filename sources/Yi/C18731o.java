package yI;

import AI.C15429j;
import DI.C15539J;
import DI.C15555b;
import DI.C15558e;
import DI.C15561h;
import DI.C15565l;
import DI.C15566m;
import DI.d0;
import DI.u0;
import XH.v;
import YH.C16877v;
import bJ.C17043b;
import cJ.C17065b;
import cJ.C17069f;
import gJ.C17280k;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kJ.C17506e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17603a;
import nI.C17642l;
import uJ.C18096U;
import uJ.C18113f0;
import uJ.I0;
import uJ.M0;
import xI.Y0;
import xI.j1;
import zJ.C18755d;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0014\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00110\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\u0011*\u00020\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a=\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\n\b\u0000\u0010 *\u0004\u0018\u00010\u0016*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\u0011*\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010&\u001a\u00020\t*\u0006\u0012\u0002\b\u00030%2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010(\u001a\u00020\t*\u0006\u0012\u0002\b\u00030%2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010'\u001a\u0019\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010%*\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010%*\u0004\u0018\u00010+H\u0000¢\u0006\u0004\b,\u0010-\u001a\u001f\u0010/\u001a\u0004\u0018\u00010.*\u0004\u0018\u00010.2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b/\u00100\"\u001a\u00103\u001a\u0004\u0018\u00010\u001b*\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"LDI/h;", "", "u", "(LDI/h;)Ljava/lang/String;", "LuJ/f0;", "type", "LDI/b;", "descriptor", "", "Ljava/lang/reflect/Method;", "p", "(LuJ/f0;LDI/b;)Ljava/util/List;", "n", "(LuJ/f0;)Ljava/util/List;", "LyI/h;", "", "expectedArgsSize", "", "isDefault", "LXH/N;", "g", "(LyI/h;ILDI/b;Z)V", "Ljava/lang/reflect/Member;", "member", "Lkotlin/Function1;", "LDI/e;", "isSpecificClass", "LuJ/U;", "r", "(LDI/b;Ljava/lang/reflect/Member;LnI/l;)Ljava/util/List;", "a", "(Ljava/lang/reflect/Member;)Z", "M", "i", "(LyI/h;LDI/b;Z)LyI/h;", "q", "(LDI/b;)Z", "Ljava/lang/Class;", "m", "(Ljava/lang/Class;LDI/b;)Ljava/lang/reflect/Method;", "k", "t", "(LuJ/U;)Ljava/lang/Class;", "LDI/m;", "s", "(LDI/m;)Ljava/lang/Class;", "", "h", "(Ljava/lang/Object;LDI/b;)Ljava/lang/Object;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yI.o  reason: case insensitive filesystem */
public final class C18731o {
    private static final boolean a(Member member) {
        Class<?> declaringClass = member.getDeclaringClass();
        if (declaringClass == null) {
            return false;
        }
        return !C17603a.e(declaringClass).v();
    }

    /* access modifiers changed from: private */
    public static final void g(C18724h<?> hVar, int i10, C15555b bVar, boolean z10) {
        if (C18726j.a(hVar) != i10) {
            throw new Y0("Inconsistent number of parameters in the descriptor and Java reflection object: " + C18726j.a(hVar) + " != " + i10 + "\nCalling: " + bVar + "\nParameter types: " + hVar.a() + ")\nDefault: " + z10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r2 = m((r0 = t((r0 = l(r2)))), r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object h(java.lang.Object r1, DI.C15555b r2) {
        /*
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            boolean r0 = r2 instanceof DI.a0
            if (r0 == 0) goto L_0x0013
            r0 = r2
            DI.v0 r0 = (DI.v0) r0
            boolean r0 = gJ.C17280k.e(r0)
            if (r0 == 0) goto L_0x0013
            return r1
        L_0x0013:
            uJ.U r0 = l(r2)
            if (r0 == 0) goto L_0x002b
            java.lang.Class r0 = t(r0)
            if (r0 == 0) goto L_0x002b
            java.lang.reflect.Method r2 = m(r0, r2)
            if (r2 != 0) goto L_0x0026
            goto L_0x002b
        L_0x0026:
            r0 = 0
            java.lang.Object r1 = r2.invoke(r1, r0)
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yI.C18731o.h(java.lang.Object, DI.b):java.lang.Object");
    }

    public static final <M extends Member> C18724h<M> i(C18724h<? extends M> hVar, C15555b bVar, boolean z10) {
        C17542s.j(hVar, "<this>");
        C17542s.j(bVar, "descriptor");
        if (!C17280k.a(bVar)) {
            List<d0> y02 = bVar.y0();
            C17542s.i(y02, "getContextReceiverParameters(...)");
            Iterable iterable = y02;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C18096U type = ((d0) it.next()).getType();
                    C17542s.i(type, "getType(...)");
                    if (C17280k.h(type)) {
                        break;
                    }
                }
            }
            List<u0> j10 = bVar.j();
            C17542s.i(j10, "getValueParameters(...)");
            Iterable iterable2 = j10;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it2 = iterable2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C18096U type2 = ((u0) it2.next()).getType();
                    C17542s.i(type2, "getType(...)");
                    if (C17280k.h(type2)) {
                        break;
                    }
                }
            }
            C18096U returnType = bVar.getReturnType();
            if ((returnType == null || !C17280k.c(returnType)) && !q(bVar)) {
                return hVar;
            }
        }
        return new C18730n(bVar, hVar, z10);
    }

    public static /* synthetic */ C18724h j(C18724h hVar, C15555b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return i(hVar, bVar, z10);
    }

    /* access modifiers changed from: private */
    public static final Method k(Class<?> cls, C15555b bVar) {
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", new Class[]{m(cls, bVar).getReturnType()});
            C17542s.g(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new Y0("No box method found in inline class: " + cls + " (calling " + bVar + ')');
        }
    }

    private static final C18096U l(C15555b bVar) {
        d0 O10 = bVar.O();
        d0 L10 = bVar.L();
        if (O10 != null) {
            return O10.getType();
        }
        if (L10 != null) {
            if (bVar instanceof C15565l) {
                return L10.getType();
            }
            C15566m b10 = bVar.b();
            C15558e eVar = b10 instanceof C15558e ? (C15558e) b10 : null;
            if (eVar != null) {
                return eVar.r();
            }
        }
        return null;
    }

    public static final Method m(Class<?> cls, C15555b bVar) {
        C17542s.j(cls, "<this>");
        C17542s.j(bVar, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", (Class[]) null);
            C17542s.g(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new Y0("No unbox method found in inline class: " + cls + " (calling " + bVar + ')');
        }
    }

    public static final List<Method> n(C18113f0 f0Var) {
        C17542s.j(f0Var, "type");
        List<String> o10 = o(I0.a(f0Var));
        if (o10 == null) {
            return null;
        }
        Iterable<String> iterable = o10;
        ArrayList<String> arrayList = new ArrayList<>(C16877v.y(iterable, 10));
        for (String str : iterable) {
            arrayList.add("unbox-impl-" + str);
        }
        C15561h e10 = f0Var.N0().e();
        C17542s.h(e10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class<?> q10 = j1.q((C15558e) e10);
        C17542s.g(q10);
        ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
        for (String declaredMethod : arrayList) {
            arrayList2.add(q10.getDeclaredMethod(declaredMethod, (Class[]) null));
        }
        return arrayList2;
    }

    private static final List<String> o(C18113f0 f0Var) {
        List list;
        if (!C17280k.i(f0Var)) {
            return null;
        }
        C15561h e10 = f0Var.N0().e();
        C17542s.h(e10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        C15539J<C18113f0> t10 = C17506e.t((C15558e) e10);
        C17542s.g(t10);
        ArrayList arrayList = new ArrayList();
        for (v vVar : t10.c()) {
            C17069f fVar = (C17069f) vVar.a();
            Iterable o10 = o((C18113f0) vVar.b());
            if (o10 != null) {
                Iterable<String> iterable = o10;
                list = new ArrayList(C16877v.y(iterable, 10));
                for (String str : iterable) {
                    list.add(fVar.m() + '-' + str);
                }
            } else {
                list = C16877v.e(fVar.m());
            }
            C16877v.E(arrayList, list);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final List<Method> p(C18113f0 f0Var, C15555b bVar) {
        Method m10;
        List<Method> n10 = n(f0Var);
        if (n10 != null) {
            return n10;
        }
        Class<?> t10 = t(f0Var);
        if (t10 == null || (m10 = m(t10, bVar)) == null) {
            return null;
        }
        return C16877v.e(m10);
    }

    private static final boolean q(C15555b bVar) {
        C18096U l10 = l(bVar);
        return l10 != null && C17280k.h(l10);
    }

    /* access modifiers changed from: private */
    public static final List<C18096U> r(C15555b bVar, Member member, C17642l<? super C15558e, Boolean> lVar) {
        ArrayList arrayList = new ArrayList();
        d0 O10 = bVar.O();
        C18096U type = O10 != null ? O10.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (bVar instanceof C15565l) {
            C15558e e02 = ((C15565l) bVar).e0();
            C17542s.i(e02, "getConstructedClass(...)");
            if (e02.n()) {
                C15566m b10 = e02.b();
                C17542s.h(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                arrayList.add(((C15558e) b10).r());
            }
        } else {
            C15566m b11 = bVar.b();
            C17542s.i(b11, "getContainingDeclaration(...)");
            if ((b11 instanceof C15558e) && lVar.invoke(b11).booleanValue()) {
                if (member == null || !a(member)) {
                    arrayList.add(((C15558e) b11).r());
                } else {
                    C18113f0 r10 = ((C15558e) b11).r();
                    C17542s.i(r10, "getDefaultType(...)");
                    arrayList.add(C18755d.B(r10));
                }
            }
        }
        List<u0> j10 = bVar.j();
        C17542s.i(j10, "getValueParameters(...)");
        for (u0 type2 : j10) {
            arrayList.add(type2.getType());
        }
        return arrayList;
    }

    public static final Class<?> s(C15566m mVar) {
        if (!(mVar instanceof C15558e) || !C17280k.b(mVar)) {
            return null;
        }
        C15558e eVar = (C15558e) mVar;
        Class<?> q10 = j1.q(eVar);
        if (q10 != null) {
            return q10;
        }
        throw new Y0("Class object for the class " + eVar.getName() + " cannot be found (classId=" + C17506e.n((C15561h) mVar) + ')');
    }

    /* access modifiers changed from: private */
    public static final Class<?> t(C18096U u10) {
        Class<?> s10 = s(u10.N0().e());
        if (s10 == null) {
            return null;
        }
        if (!M0.l(u10)) {
            return s10;
        }
        C18096U k10 = C17280k.k(u10);
        if (k10 != null && !M0.l(k10) && !C15429j.t0(k10)) {
            return s10;
        }
        return null;
    }

    public static final String u(C15561h hVar) {
        C17542s.j(hVar, "<this>");
        C17065b n10 = C17506e.n(hVar);
        C17542s.g(n10);
        return C17043b.b(n10.b());
    }
}
