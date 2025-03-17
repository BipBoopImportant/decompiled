package Z1;

import GJ.C15765h;
import Z1.c;
import a2.C4985a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import mI.C17604b;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a5\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0014\u0010\u0005\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "Ljava/lang/Class;", "La2/a;", "a", "(Ljava/lang/String;)Ljava/lang/Class;", "parameterProviderClass", "", "parameterProviderIndex", "", "", "b", "(Ljava/lang/Class;I)[Ljava/lang/Object;", "classToCheck", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "LGJ/h;", "size", "c", "(LGJ/h;I)[Ljava/lang/Object;", "ui-tooling_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {
    public static final Class<? extends C4985a<?>> a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            c.a aVar = c.f14957a;
            aVar.a("Unable to find PreviewProvider '" + str + '\'', e10);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r5 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object[] b(java.lang.Class<? extends a2.C4985a<?>> r9, int r10) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x0089
            java.lang.reflect.Constructor[] r9 = r9.getConstructors()     // Catch:{ c -> 0x0081 }
            int r1 = r9.length     // Catch:{ c -> 0x0081 }
            r2 = 0
            r3 = r0
            r4 = r3
            r5 = r2
        L_0x000c:
            r6 = 1
            if (r3 >= r1) goto L_0x0021
            r7 = r9[r3]     // Catch:{ c -> 0x0081 }
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch:{ c -> 0x0081 }
            int r8 = r8.length     // Catch:{ c -> 0x0081 }
            if (r8 != 0) goto L_0x001e
            if (r4 == 0) goto L_0x001c
        L_0x001a:
            r5 = r2
            goto L_0x0024
        L_0x001c:
            r4 = r6
            r5 = r7
        L_0x001e:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0021:
            if (r4 != 0) goto L_0x0024
            goto L_0x001a
        L_0x0024:
            if (r5 == 0) goto L_0x0079
            r5.setAccessible(r6)     // Catch:{ c -> 0x0081 }
            java.lang.Object r9 = r5.newInstance(r2)     // Catch:{ c -> 0x0081 }
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>"
            kotlin.jvm.internal.C17542s.h(r9, r1)     // Catch:{ c -> 0x0081 }
            a2.a r9 = (a2.C4985a) r9     // Catch:{ c -> 0x0081 }
            if (r10 >= 0) goto L_0x0043
            GJ.h r10 = r9.getValues()     // Catch:{ c -> 0x0081 }
            int r9 = r9.getCount()     // Catch:{ c -> 0x0081 }
            java.lang.Object[] r9 = c(r10, r9)     // Catch:{ c -> 0x0081 }
            return r9
        L_0x0043:
            GJ.h r9 = r9.getValues()     // Catch:{ c -> 0x0081 }
            java.lang.Object r9 = GJ.C15768k.E(r9, r10)     // Catch:{ c -> 0x0081 }
            java.util.List r9 = YH.C16877v.e(r9)     // Catch:{ c -> 0x0081 }
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch:{ c -> 0x0081 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ c -> 0x0081 }
            r1 = 10
            int r1 = YH.C16877v.y(r9, r1)     // Catch:{ c -> 0x0081 }
            r10.<init>(r1)     // Catch:{ c -> 0x0081 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ c -> 0x0081 }
        L_0x0060:
            boolean r1 = r9.hasNext()     // Catch:{ c -> 0x0081 }
            if (r1 == 0) goto L_0x0072
            java.lang.Object r1 = r9.next()     // Catch:{ c -> 0x0081 }
            java.lang.Object r1 = d(r1)     // Catch:{ c -> 0x0081 }
            r10.add(r1)     // Catch:{ c -> 0x0081 }
            goto L_0x0060
        L_0x0072:
            java.lang.Object[] r9 = new java.lang.Object[r0]     // Catch:{ c -> 0x0081 }
            java.lang.Object[] r9 = r10.toArray(r9)     // Catch:{ c -> 0x0081 }
            return r9
        L_0x0079:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ c -> 0x0081 }
            java.lang.String r10 = "PreviewParameterProvider constructor can not have parameters"
            r9.<init>(r10)     // Catch:{ c -> 0x0081 }
            throw r9     // Catch:{ c -> 0x0081 }
        L_0x0081:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle."
            r9.<init>(r10)
            throw r9
        L_0x0089:
            java.lang.Object[] r9 = new java.lang.Object[r0]
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.d.b(java.lang.Class, int):java.lang.Object[]");
    }

    private static final Object[] c(C15765h<? extends Object> hVar, int i10) {
        Iterator<? extends Object> it = hVar.iterator();
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = it.next();
        }
        return objArr;
    }

    private static final Object d(Object obj) {
        if (obj != null) {
            for (Annotation annotation : obj.getClass().getAnnotations()) {
                if (annotation instanceof C17604b) {
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        if (field.getType().isPrimitive()) {
                            Field declaredField = obj.getClass().getDeclaredField(field.getName());
                            declaredField.setAccessible(true);
                            return declaredField.get(obj);
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
            }
        }
        return obj;
    }
}
