package jz;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljz/a;", "", "<init>", "()V", "", "LFn/a$a;", "caasCartItems", "Lrz/g;", "localCartItems", "Lgz/c$b;", "a", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jz.a  reason: case insensitive filesystem */
public final class C14657a {

    /* renamed from: a  reason: collision with root package name */
    private static final C3165a f128049a = new C3165a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljz/a$a;", "", "<init>", "()V", "", "FALLBACK_MAX_QTY", "I", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jz.a$a  reason: collision with other inner class name */
    private static final class C3165a {
        public /* synthetic */ C3165a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3165a() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0056, code lost:
        r4 = r4.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<gz.c.b> a(java.util.List<Fn.a.C1553a> r22, java.util.List<rz.C15014g> r23) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            java.lang.String r2 = "caasCartItems"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            java.lang.String r2 = "localCartItems"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0162
            java.lang.Object r3 = r0.next()
            Fn.a$a r3 = (Fn.a.C1553a) r3
            r4 = r1
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x002c:
            boolean r5 = r4.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x004d
            java.lang.Object r5 = r4.next()
            r7 = r5
            rz.g r7 = (rz.C15014g) r7
            com.ingka.ikea.core.model.product.ProductItem r7 = r7.g()
            java.lang.String r7 = r7.f()
            java.lang.String r8 = r3.c()
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r8)
            if (r7 == 0) goto L_0x002c
            goto L_0x004e
        L_0x004d:
            r5 = r6
        L_0x004e:
            rz.g r5 = (rz.C15014g) r5
            Fn.a$c$c r4 = r3.a()
            if (r4 == 0) goto L_0x0065
            Fn.a$c$c$c r4 = r4.a()
            if (r4 == 0) goto L_0x0065
            double r7 = r4.a()
            java.lang.Double r4 = java.lang.Double.valueOf(r7)
            goto L_0x0066
        L_0x0065:
            r4 = r6
        L_0x0066:
            if (r5 == 0) goto L_0x0094
            java.lang.String r8 = r5.a()
            int r13 = r3.d()
            Fn.a$c$e r5 = r3.b()
            double r9 = r5.b()
            Fn.a$c$e r3 = r3.b()
            double r11 = r3.b()
            if (r4 == 0) goto L_0x0089
            double r3 = r4.doubleValue()
            int r3 = (int) r3
        L_0x0087:
            r14 = r3
            goto L_0x008c
        L_0x0089:
            r3 = 998(0x3e6, float:1.398E-42)
            goto L_0x0087
        L_0x008c:
            gz.c$b r6 = new gz.c$b
            r7 = r6
            r7.<init>(r8, r9, r11, r13, r14)
            goto L_0x015b
        L_0x0094:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.c()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Item "
            r5.append(r7)
            r5.append(r3)
            java.lang.String r3 = " not found in localCart"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            qv.e r3 = qv.e.ERROR
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00c6:
            boolean r8 = r5.hasNext()
            r9 = 0
            if (r8 == 0) goto L_0x00de
            java.lang.Object r8 = r5.next()
            r10 = r8
            qv.b r10 = (qv.C11819b) r10
            boolean r9 = r10.b(r3, r9)
            if (r9 == 0) goto L_0x00c6
            r7.add(r8)
            goto L_0x00c6
        L_0x00de:
            java.util.Iterator r5 = r7.iterator()
            r7 = r6
            r8 = r7
        L_0x00e4:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x015b
            java.lang.Object r10 = r5.next()
            r15 = r10
            qv.b r15 = (qv.C11819b) r15
            if (r7 != 0) goto L_0x00fe
            java.lang.String r7 = qv.C11818a.a(r6, r4)
            if (r7 != 0) goto L_0x00fa
            goto L_0x015b
        L_0x00fa:
            java.lang.String r7 = qv.C11820c.a(r7)
        L_0x00fe:
            if (r8 != 0) goto L_0x014d
            java.lang.Class<jz.a> r8 = jz.C14657a.class
            java.lang.String r8 = r8.getName()
            kotlin.jvm.internal.C17542s.g(r8)
            r10 = 36
            r11 = 2
            java.lang.String r10 = HJ.C15854t.s1(r8, r10, r6, r11, r6)
            r12 = 46
            java.lang.String r10 = HJ.C15854t.o1(r10, r12, r6, r11, r6)
            int r11 = r10.length()
            if (r11 != 0) goto L_0x011d
            goto L_0x0123
        L_0x011d:
            java.lang.String r8 = "Kt"
            java.lang.String r8 = HJ.C15854t.P0(r10, r8)
        L_0x0123:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "main"
            r12 = 1
            boolean r10 = HJ.C15854t.b0(r10, r11, r12)
            if (r10 == 0) goto L_0x0137
            java.lang.String r10 = "m"
            goto L_0x0139
        L_0x0137:
            java.lang.String r10 = "b"
        L_0x0139:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            java.lang.String r10 = "|"
            r11.append(r10)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
        L_0x014d:
            r16 = r3
            r17 = r8
            r18 = r9
            r19 = r4
            r20 = r7
            r15.a(r16, r17, r18, r19, r20)
            goto L_0x00e4
        L_0x015b:
            if (r6 == 0) goto L_0x0019
            r2.add(r6)
            goto L_0x0019
        L_0x0162:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jz.C14657a.a(java.util.List, java.util.List):java.util.List");
    }
}
