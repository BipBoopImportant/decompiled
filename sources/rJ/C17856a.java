package rJ;

import HJ.C15854t;
import cJ.C17066c;
import kotlin.jvm.internal.C17542s;
import pJ.C17755a;

/* renamed from: rJ.a  reason: case insensitive filesystem */
public final class C17856a extends C17755a {

    /* renamed from: r  reason: collision with root package name */
    public static final C17856a f146679r = new C17856a();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C17856a() {
        /*
            r18 = this;
            r0 = r18
            eJ.g r2 = eJ.C17196g.d()
            r1 = r2
            YI.C16883b.a(r2)
            java.lang.String r3 = "apply(...)"
            kotlin.jvm.internal.C17542s.i(r2, r3)
            eJ.i$f<XI.l, java.lang.Integer> r3 = YI.C16883b.f140476a
            r2 = r3
            java.lang.String r4 = "packageFqName"
            kotlin.jvm.internal.C17542s.i(r3, r4)
            eJ.i$f<XI.d, java.util.List<XI.b>> r4 = YI.C16883b.f140478c
            r3 = r4
            java.lang.String r5 = "constructorAnnotation"
            kotlin.jvm.internal.C17542s.i(r4, r5)
            eJ.i$f<XI.c, java.util.List<XI.b>> r5 = YI.C16883b.f140477b
            r4 = r5
            java.lang.String r6 = "classAnnotation"
            kotlin.jvm.internal.C17542s.i(r5, r6)
            eJ.i$f<XI.i, java.util.List<XI.b>> r6 = YI.C16883b.f140479d
            r5 = r6
            java.lang.String r7 = "functionAnnotation"
            kotlin.jvm.internal.C17542s.i(r6, r7)
            eJ.i$f<XI.n, java.util.List<XI.b>> r6 = YI.C16883b.f140480e
            r7 = r6
            java.lang.String r8 = "propertyAnnotation"
            kotlin.jvm.internal.C17542s.i(r6, r8)
            eJ.i$f<XI.n, java.util.List<XI.b>> r6 = YI.C16883b.f140481f
            r8 = r6
            java.lang.String r9 = "propertyGetterAnnotation"
            kotlin.jvm.internal.C17542s.i(r6, r9)
            eJ.i$f<XI.n, java.util.List<XI.b>> r6 = YI.C16883b.f140482g
            r9 = r6
            java.lang.String r10 = "propertySetterAnnotation"
            kotlin.jvm.internal.C17542s.i(r6, r10)
            eJ.i$f<XI.g, java.util.List<XI.b>> r6 = YI.C16883b.f140484i
            r13 = r6
            java.lang.String r10 = "enumEntryAnnotation"
            kotlin.jvm.internal.C17542s.i(r6, r10)
            eJ.i$f<XI.n, XI.b$b$c> r6 = YI.C16883b.f140483h
            r14 = r6
            java.lang.String r10 = "compileTimeValue"
            kotlin.jvm.internal.C17542s.i(r6, r10)
            eJ.i$f<XI.u, java.util.List<XI.b>> r6 = YI.C16883b.f140485j
            r15 = r6
            java.lang.String r10 = "parameterAnnotation"
            kotlin.jvm.internal.C17542s.i(r6, r10)
            eJ.i$f<XI.q, java.util.List<XI.b>> r6 = YI.C16883b.f140486k
            r16 = r6
            java.lang.String r10 = "typeAnnotation"
            kotlin.jvm.internal.C17542s.i(r6, r10)
            eJ.i$f<XI.s, java.util.List<XI.b>> r6 = YI.C16883b.f140487l
            r17 = r6
            java.lang.String r10 = "typeParameterAnnotation"
            kotlin.jvm.internal.C17542s.i(r6, r10)
            r6 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rJ.C17856a.<init>():void");
    }

    private final String s(C17066c cVar) {
        if (cVar.c()) {
            return "default-package";
        }
        String b10 = cVar.f().b();
        C17542s.i(b10, "asString(...)");
        return b10;
    }

    public final String q(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        return s(cVar) + ".kotlin_builtins";
    }

    public final String r(C17066c cVar) {
        C17542s.j(cVar, "fqName");
        return C15854t.P(cVar.a(), '.', '/', false, 4, (Object) null) + '/' + q(cVar);
    }
}
