package JI;

import DI.x0;
import DI.y0;
import HI.C15817a;
import HI.C15818b;
import HI.C15819c;
import TI.C16494B;
import TI.q;
import YH.C16870n;
import YH.C16877v;
import cJ.C17066c;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;

public abstract class y extends u implements j, C15957A, q {
    public boolean E() {
        return false;
    }

    public int J() {
        return S().getModifiers();
    }

    /* renamed from: R */
    public q Q() {
        Class<?> declaringClass = S().getDeclaringClass();
        C17542s.i(declaringClass, "getDeclaringClass(...)");
        return new q(declaringClass);
    }

    public abstract Member S();

    /* access modifiers changed from: protected */
    public final List<C16494B> T(Type[] typeArr, Annotation[][] annotationArr, boolean z10) {
        String str;
        C17542s.j(typeArr, "parameterTypes");
        C17542s.j(annotationArr, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(typeArr.length);
        List<String> b10 = C15962c.f135770a.b(S());
        int size = b10 != null ? b10.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i10 = 0;
        while (i10 < length) {
            E a10 = E.f135751a.a(typeArr[i10]);
            if (b10 != null) {
                str = (String) C16877v.z0(b10, i10 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i10 + '+' + size + " (name=" + getName() + " type=" + a10 + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new G(a10, annotationArr[i10], str, z10 && i10 == C16870n.n0(typeArr)));
            i10++;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && C17542s.e(S(), ((y) obj).S());
    }

    public boolean g() {
        return Modifier.isStatic(J());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = cJ.C17069f.v(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cJ.C17069f getName() {
        /*
            r1 = this;
            java.lang.reflect.Member r0 = r1.S()
            java.lang.String r0 = r0.getName()
            if (r0 == 0) goto L_0x0010
            cJ.f r0 = cJ.C17069f.v(r0)
            if (r0 != 0) goto L_0x0012
        L_0x0010:
            cJ.f r0 = cJ.C17071h.f141263b
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: JI.y.getName():cJ.f");
    }

    public y0 getVisibility() {
        int J10 = J();
        return Modifier.isPublic(J10) ? x0.h.f133878c : Modifier.isPrivate(J10) ? x0.e.f133875c : Modifier.isProtected(J10) ? Modifier.isStatic(J10) ? C15819c.f135271c : C15818b.f135270c : C15817a.f135269c;
    }

    public int hashCode() {
        return S().hashCode();
    }

    public boolean isAbstract() {
        return Modifier.isAbstract(J());
    }

    public boolean isFinal() {
        return Modifier.isFinal(J());
    }

    public AnnotatedElement s() {
        Member S10 = S();
        C17542s.h(S10, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) S10;
    }

    public String toString() {
        return getClass().getName() + ": " + S();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = JI.k.b((r0 = r0.getDeclaredAnnotations()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<JI.C15966g> getAnnotations() {
        /*
            r1 = this;
            java.lang.reflect.AnnotatedElement r0 = r1.s()
            if (r0 == 0) goto L_0x0012
            java.lang.annotation.Annotation[] r0 = r0.getDeclaredAnnotations()
            if (r0 == 0) goto L_0x0012
            java.util.List r0 = JI.k.b(r0)
            if (r0 != 0) goto L_0x0016
        L_0x0012:
            java.util.List r0 = YH.C16877v.n()
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: JI.y.getAnnotations():java.util.List");
    }

    public C15966g v(C17066c cVar) {
        Annotation[] declaredAnnotations;
        C17542s.j(cVar, "fqName");
        AnnotatedElement s10 = s();
        if (s10 == null || (declaredAnnotations = s10.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, cVar);
    }
}
