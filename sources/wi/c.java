package wI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uI.C18060i;
import uI.C18064m;
import uI.C18068q;
import uI.C18075x;
import xI.K0;
import xI.U0;
import xI.j1;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\b\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\f\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"/\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\r8F¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LuI/m;", "Ljava/lang/reflect/Field;", "b", "(LuI/m;)Ljava/lang/reflect/Field;", "javaField", "Ljava/lang/reflect/Method;", "c", "(LuI/m;)Ljava/lang/reflect/Method;", "javaGetter", "LuI/i;", "e", "(LuI/i;)Ljava/lang/reflect/Method;", "javaSetter", "LuI/h;", "d", "(LuI/h;)Ljava/lang/reflect/Method;", "javaMethod", "T", "Ljava/lang/reflect/Constructor;", "a", "(LuI/h;)Ljava/lang/reflect/Constructor;", "getJavaConstructor$annotations", "(LuI/h;)V", "javaConstructor", "LuI/q;", "Ljava/lang/reflect/Type;", "f", "(LuI/q;)Ljava/lang/reflect/Type;", "javaType", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = r2.a0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.reflect.Constructor<T> a(uI.C18059h<? extends T> r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            xI.A r2 = xI.j1.b(r2)
            r0 = 0
            if (r2 == 0) goto L_0x0017
            yI.h r2 = r2.a0()
            if (r2 == 0) goto L_0x0017
            java.lang.reflect.Member r2 = r2.b()
            goto L_0x0018
        L_0x0017:
            r2 = r0
        L_0x0018:
            boolean r1 = r2 instanceof java.lang.reflect.Constructor
            if (r1 == 0) goto L_0x001f
            r0 = r2
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wI.c.a(uI.h):java.lang.reflect.Constructor");
    }

    public static final Field b(C18064m<?> mVar) {
        C17542s.j(mVar, "<this>");
        K0<?> d10 = j1.d(mVar);
        if (d10 != null) {
            return d10.r0();
        }
        return null;
    }

    public static final Method c(C18064m<?> mVar) {
        C17542s.j(mVar, "<this>");
        return d(mVar.d());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r2 = r2.a0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.reflect.Method d(uI.C18059h<?> r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            xI.A r2 = xI.j1.b(r2)
            r0 = 0
            if (r2 == 0) goto L_0x0017
            yI.h r2 = r2.a0()
            if (r2 == 0) goto L_0x0017
            java.lang.reflect.Member r2 = r2.b()
            goto L_0x0018
        L_0x0017:
            r2 = r0
        L_0x0018:
            boolean r1 = r2 instanceof java.lang.reflect.Method
            if (r1 == 0) goto L_0x001f
            r0 = r2
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wI.c.d(uI.h):java.lang.reflect.Method");
    }

    public static final Method e(C18060i<?> iVar) {
        C17542s.j(iVar, "<this>");
        return d(iVar.g());
    }

    public static final Type f(C18068q qVar) {
        C17542s.j(qVar, "<this>");
        Type q10 = ((U0) qVar).q();
        return q10 == null ? C18075x.f(qVar) : q10;
    }
}
