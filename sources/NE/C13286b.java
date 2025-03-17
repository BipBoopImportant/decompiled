package NE;

import com.squareup.moshi.f;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LNE/b;", "Lcom/squareup/moshi/f$e;", "<init>", "()V", "Ljava/lang/reflect/Type;", "type", "", "", "annotations", "Lcom/squareup/moshi/t;", "moshi", "Lcom/squareup/moshi/f;", "a", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lcom/squareup/moshi/t;)Lcom/squareup/moshi/f;", "moshi-kotlin"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: NE.b  reason: case insensitive filesystem */
public final class C13286b implements f.e {
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0204, code lost:
        if (r3 == null) goto L_0x0209;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.squareup.moshi.f<?> a(java.lang.reflect.Type r27, java.util.Set<? extends java.lang.annotation.Annotation> r28, com.squareup.moshi.t r29) {
        /*
            r26 = this;
            r1 = r27
            r0 = r28
            r2 = r29
            java.lang.String r3 = "type"
            kotlin.jvm.internal.C17542s.j(r1, r3)
            java.lang.String r3 = "annotations"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            java.lang.String r3 = "moshi"
            kotlin.jvm.internal.C17542s.j(r2, r3)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r3 = 0
            if (r0 != 0) goto L_0x001f
            return r3
        L_0x001f:
            java.lang.Class r4 = com.squareup.moshi.x.a(r27)
            boolean r0 = r4.isInterface()
            if (r0 == 0) goto L_0x002a
            return r3
        L_0x002a:
            boolean r0 = r4.isEnum()
            if (r0 == 0) goto L_0x0031
            return r3
        L_0x0031:
            java.lang.Class r0 = NE.c.f112451a
            boolean r0 = r4.isAnnotationPresent(r0)
            if (r0 != 0) goto L_0x003c
            return r3
        L_0x003c:
            boolean r0 = ME.c.i(r4)
            if (r0 == 0) goto L_0x0043
            return r3
        L_0x0043:
            com.squareup.moshi.f r0 = ME.c.d(r2, r1, r4)     // Catch:{ RuntimeException -> 0x004a }
            if (r0 == 0) goto L_0x0054
            return r0
        L_0x004a:
            r0 = move-exception
            r5 = r0
            java.lang.Throwable r0 = r5.getCause()
            boolean r0 = r0 instanceof java.lang.ClassNotFoundException
            if (r0 == 0) goto L_0x0452
        L_0x0054:
            boolean r0 = r4.isLocalClass()
            if (r0 != 0) goto L_0x0433
            uI.d r0 = mI.C17603a.e(r4)
            boolean r5 = r0.isAbstract()
            if (r5 != 0) goto L_0x0414
            boolean r5 = r0.n()
            if (r5 != 0) goto L_0x03f5
            java.lang.Object r5 = r0.p()
            if (r5 != 0) goto L_0x03d6
            boolean r5 = r0.c()
            if (r5 != 0) goto L_0x03b2
            uI.h r5 = vI.C18192e.d(r0)
            if (r5 != 0) goto L_0x007d
            return r3
        L_0x007d:
            java.util.List r6 = r5.getParameters()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r7 = 10
            int r8 = YH.C16877v.y(r6, r7)
            int r8 = YH.X.e(r8)
            r9 = 16
            int r8 = tI.C17978n.e(r8, r9)
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L_0x009c:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00b1
            java.lang.Object r8 = r6.next()
            r10 = r8
            uI.l r10 = (uI.C18063l) r10
            java.lang.String r10 = r10.getName()
            r9.put(r10, r8)
            goto L_0x009c
        L_0x00b1:
            r6 = 1
            wI.C18217a.b(r5, r6)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.Collection r0 = vI.C18192e.c(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x00c2:
            boolean r10 = r0.hasNext()
            r11 = 0
            if (r10 == 0) goto L_0x02df
            java.lang.Object r10 = r0.next()
            r15 = r10
            uI.o r15 = (uI.C18066o) r15
            java.lang.String r10 = r15.getName()
            java.lang.Object r10 = r9.get(r10)
            uI.l r10 = (uI.C18063l) r10
            wI.C18217a.b(r15, r6)
            java.util.List r12 = r15.getAnnotations()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x00e7:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00f9
            java.lang.Object r13 = r12.next()
            r14 = r13
            java.lang.annotation.Annotation r14 = (java.lang.annotation.Annotation) r14
            boolean r14 = r14 instanceof com.squareup.moshi.e
            if (r14 == 0) goto L_0x00e7
            goto L_0x00fa
        L_0x00f9:
            r13 = r3
        L_0x00fa:
            com.squareup.moshi.e r13 = (com.squareup.moshi.e) r13
            java.util.List r12 = r15.getAnnotations()
            java.util.Collection r12 = (java.util.Collection) r12
            java.util.List r12 = YH.C16877v.w1(r12)
            if (r10 == 0) goto L_0x0137
            r14 = r12
            java.util.Collection r14 = (java.util.Collection) r14
            java.util.List r16 = r10.getAnnotations()
            r3 = r16
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            YH.C16877v.E(r14, r3)
            if (r13 != 0) goto L_0x0137
            java.util.List r3 = r10.getAnnotations()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0122:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x0134
            java.lang.Object r13 = r3.next()
            r14 = r13
            java.lang.annotation.Annotation r14 = (java.lang.annotation.Annotation) r14
            boolean r14 = r14 instanceof com.squareup.moshi.e
            if (r14 == 0) goto L_0x0122
            goto L_0x0135
        L_0x0134:
            r13 = 0
        L_0x0135:
            com.squareup.moshi.e r13 = (com.squareup.moshi.e) r13
        L_0x0137:
            java.lang.reflect.Field r3 = wI.c.b(r15)
            if (r3 == 0) goto L_0x0142
            int r3 = r3.getModifiers()
            goto L_0x0143
        L_0x0142:
            r3 = r11
        L_0x0143:
            boolean r3 = java.lang.reflect.Modifier.isTransient(r3)
            if (r3 == 0) goto L_0x0170
            if (r10 == 0) goto L_0x016d
            boolean r3 = r10.B()
            if (r3 == 0) goto L_0x0152
            goto L_0x016d
        L_0x0152:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No default value for transient constructor "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x016d:
            r3 = 0
            goto L_0x00c2
        L_0x0170:
            if (r13 == 0) goto L_0x019c
            boolean r3 = r13.ignore()
            if (r3 != r6) goto L_0x019c
            if (r10 == 0) goto L_0x016d
            boolean r3 = r10.B()
            if (r3 == 0) goto L_0x0181
            goto L_0x016d
        L_0x0181:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No default value for ignored constructor "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x019c:
            if (r10 == 0) goto L_0x01ec
            uI.q r3 = r10.getType()
            uI.q r14 = r15.getReturnType()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r14)
            if (r3 == 0) goto L_0x01ad
            goto L_0x01ec
        L_0x01ad:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = r15.getName()
            r0.append(r1)
            java.lang.String r1 = "' has a constructor parameter of type "
            r0.append(r1)
            kotlin.jvm.internal.C17542s.g(r10)
            uI.q r1 = r10.getType()
            r0.append(r1)
            java.lang.String r1 = " but a property of type "
            r0.append(r1)
            uI.q r1 = r15.getReturnType()
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x01ec:
            boolean r3 = r15 instanceof uI.C18062k
            if (r3 != 0) goto L_0x01f2
            if (r10 == 0) goto L_0x016d
        L_0x01f2:
            if (r13 == 0) goto L_0x0209
            java.lang.String r3 = r13.name()
            if (r3 == 0) goto L_0x0209
            java.lang.String r13 = "\u0000"
            boolean r13 = kotlin.jvm.internal.C17542s.e(r3, r13)
            if (r13 != 0) goto L_0x0203
            goto L_0x0204
        L_0x0203:
            r3 = 0
        L_0x0204:
            if (r3 != 0) goto L_0x0207
            goto L_0x0209
        L_0x0207:
            r13 = r3
            goto L_0x020e
        L_0x0209:
            java.lang.String r3 = r15.getName()
            goto L_0x0207
        L_0x020e:
            uI.q r3 = r15.getReturnType()
            uI.f r3 = r3.e()
            boolean r14 = r3 instanceof uI.C18055d
            if (r14 == 0) goto L_0x0287
            uI.d r3 = (uI.C18055d) r3
            boolean r14 = r3.v()
            if (r14 == 0) goto L_0x027e
            java.lang.Class r3 = mI.C17603a.b(r3)
            uI.q r14 = r15.getReturnType()
            java.util.List r14 = r14.i()
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x0235
            goto L_0x0293
        L_0x0235:
            uI.q r14 = r15.getReturnType()
            java.util.List r14 = r14.i()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x0248:
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L_0x026a
            java.lang.Object r16 = r14.next()
            uI.s r16 = (uI.C18070s) r16
            uI.q r16 = r16.c()
            if (r16 == 0) goto L_0x0261
            java.lang.reflect.Type r16 = wI.c.f(r16)
            r7 = r16
            goto L_0x0262
        L_0x0261:
            r7 = 0
        L_0x0262:
            if (r7 == 0) goto L_0x0267
            r6.add(r7)
        L_0x0267:
            r7 = 10
            goto L_0x0248
        L_0x026a:
            java.lang.reflect.Type[] r7 = new java.lang.reflect.Type[r11]
            java.lang.Object[] r6 = r6.toArray(r7)
            java.lang.reflect.Type[] r6 = (java.lang.reflect.Type[]) r6
            int r7 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.reflect.Type[] r6 = (java.lang.reflect.Type[]) r6
            java.lang.reflect.ParameterizedType r3 = com.squareup.moshi.w.j(r3, r6)
            goto L_0x0293
        L_0x027e:
            uI.q r3 = r15.getReturnType()
            java.lang.reflect.Type r3 = wI.c.f(r3)
            goto L_0x0293
        L_0x0287:
            boolean r3 = r3 instanceof uI.C18069r
            if (r3 == 0) goto L_0x02d7
            uI.q r3 = r15.getReturnType()
            java.lang.reflect.Type r3 = wI.c.f(r3)
        L_0x0293:
            java.lang.reflect.Type r3 = ME.c.p(r1, r4, r3)
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.annotation.Annotation[] r6 = new java.lang.annotation.Annotation[r11]
            java.lang.Object[] r6 = r12.toArray(r6)
            java.lang.annotation.Annotation[] r6 = (java.lang.annotation.Annotation[]) r6
            java.util.Set r6 = ME.c.k(r6)
            java.lang.String r7 = r15.getName()
            com.squareup.moshi.f r14 = r2.f(r3, r6, r7)
            java.lang.String r3 = r15.getName()
            NE.a$a r6 = new NE.a$a
            java.lang.String r7 = "adapter"
            kotlin.jvm.internal.C17542s.i(r14, r7)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Any, kotlin.Any?>"
            kotlin.jvm.internal.C17542s.h(r15, r7)
            if (r10 == 0) goto L_0x02c6
            int r7 = r10.getIndex()
        L_0x02c3:
            r17 = r7
            goto L_0x02c8
        L_0x02c6:
            r7 = -1
            goto L_0x02c3
        L_0x02c8:
            r12 = r6
            r16 = r10
            r12.<init>(r13, r14, r15, r16, r17)
            r8.put(r3, r6)
            r3 = 0
            r6 = 1
            r7 = 10
            goto L_0x00c2
        L_0x02d7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not possible!"
            r0.<init>(r1)
            throw r0
        L_0x02df:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r5.getParameters()
            java.util.Iterator r1 = r1.iterator()
        L_0x02ec:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x032e
            java.lang.Object r2 = r1.next()
            uI.l r2 = (uI.C18063l) r2
            java.lang.String r3 = r2.getName()
            java.util.Map r4 = kotlin.jvm.internal.W.d(r8)
            java.lang.Object r3 = r4.remove(r3)
            NE.a$a r3 = (NE.C13285a.C2764a) r3
            if (r3 != 0) goto L_0x032a
            boolean r4 = r2.B()
            if (r4 == 0) goto L_0x030f
            goto L_0x032a
        L_0x030f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No property for required constructor "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x032a:
            r0.add(r3)
            goto L_0x02ec
        L_0x032e:
            int r1 = r0.size()
            java.util.Set r2 = r8.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x033a:
            r23 = r1
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0366
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            r18 = r1
            NE.a$a r18 = (NE.C13285a.C2764a) r18
            int r1 = r23 + 1
            r24 = 15
            r25 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            NE.a$a r3 = NE.C13285a.C2764a.b(r18, r19, r20, r21, r22, r23, r24, r25)
            r0.add(r3)
            goto L_0x033a
        L_0x0366:
            java.util.List r1 = YH.C16877v.t0(r0)
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = YH.C16877v.y(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x037c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0390
            java.lang.Object r4 = r2.next()
            NE.a$a r4 = (NE.C13285a.C2764a) r4
            java.lang.String r4 = r4.e()
            r3.add(r4)
            goto L_0x037c
        L_0x0390:
            java.lang.String[] r2 = new java.lang.String[r11]
            java.lang.Object[] r2 = r3.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            com.squareup.moshi.k$a r2 = com.squareup.moshi.k.a.a(r2)
            NE.a r3 = new NE.a
            java.lang.String r4 = "options"
            kotlin.jvm.internal.C17542s.i(r2, r4)
            r3.<init>(r5, r0, r1, r2)
            com.squareup.moshi.f r0 = r3.nullSafe()
            return r0
        L_0x03b2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot reflectively serialize sealed class "
            r0.append(r1)
            java.lang.String r1 = r4.getName()
            r0.append(r1)
            java.lang.String r1 = ". Please register an adapter."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x03d6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot serialize object declaration "
            r0.append(r1)
            java.lang.String r1 = r4.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x03f5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot serialize inner class "
            r0.append(r1)
            java.lang.String r1 = r4.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0414:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot serialize abstract class "
            r0.append(r1)
            java.lang.String r1 = r4.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0433:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot serialize local class or object expression "
            r0.append(r1)
            java.lang.String r1 = r4.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0452:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: NE.C13286b.a(java.lang.reflect.Type, java.util.Set, com.squareup.moshi.t):com.squareup.moshi.f");
    }
}
