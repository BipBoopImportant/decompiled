package vJ;

import XH.t;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import uJ.C18087K;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18113f0;
import uJ.C18136r;
import uJ.O0;
import uJ.P0;
import yJ.C18740i;

public abstract class f extends C18136r {

    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f149049a = new a();

        private a() {
        }
    }

    /* synthetic */ class b extends C17540p implements C17642l<C18740i, P0> {
        b(Object obj) {
            super(1, obj, f.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0);
        }

        /* renamed from: t */
        public final P0 invoke(C18740i iVar) {
            C17542s.j(iVar, "p0");
            return ((f) this.receiver).a(iVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: uJ.P0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: uJ.T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: uJ.U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: uJ.T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: uJ.T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: uJ.U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: uJ.P0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: uJ.U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: uJ.U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: uJ.P0} */
    /* JADX WARNING: type inference failed for: r3v3, types: [uJ.T] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final uJ.C18113f0 c(uJ.C18113f0 r15) {
        /*
            r14 = this;
            uJ.y0 r0 = r15.N0()
            boolean r1 = r0 instanceof hJ.C17332c
            r2 = 10
            r3 = 0
            if (r1 == 0) goto L_0x0081
            hJ.c r0 = (hJ.C17332c) r0
            uJ.E0 r1 = r0.d()
            uJ.Q0 r4 = r1.c()
            uJ.Q0 r5 = uJ.Q0.IN_VARIANCE
            if (r4 != r5) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r1 = r3
        L_0x001b:
            if (r1 == 0) goto L_0x0027
            uJ.U r1 = r1.getType()
            if (r1 == 0) goto L_0x0027
            uJ.P0 r3 = r1.Q0()
        L_0x0027:
            r7 = r3
            vJ.n r1 = r0.h()
            if (r1 != 0) goto L_0x0065
            uJ.E0 r9 = r0.d()
            java.util.Collection r1 = r0.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r10 = new java.util.ArrayList
            int r2 = YH.C16877v.y(r1, r2)
            r10.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x0045:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0059
            java.lang.Object r2 = r1.next()
            uJ.U r2 = (uJ.C18096U) r2
            uJ.P0 r2 = r2.Q0()
            r10.add(r2)
            goto L_0x0045
        L_0x0059:
            vJ.n r1 = new vJ.n
            r11 = 0
            r12 = 4
            r13 = 0
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            r0.j(r1)
        L_0x0065:
            vJ.i r1 = new vJ.i
            yJ.b r5 = yJ.C18733b.FOR_SUBTYPING
            vJ.n r6 = r0.h()
            kotlin.jvm.internal.C17542s.g(r6)
            uJ.u0 r8 = r15.M0()
            boolean r9 = r15.O0()
            r11 = 32
            r12 = 0
            r10 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        L_0x0081:
            boolean r1 = r0 instanceof iJ.C17385s
            r4 = 0
            if (r1 == 0) goto L_0x00ce
            iJ.s r0 = (iJ.C17385s) r0
            java.util.Collection r0 = r0.a()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = YH.C16877v.y(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x009b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00b8
            java.lang.Object r2 = r0.next()
            uJ.U r2 = (uJ.C18096U) r2
            boolean r3 = r15.O0()
            uJ.U r2 = uJ.M0.p(r2, r3)
            java.lang.String r3 = "makeNullableAsSpecified(...)"
            kotlin.jvm.internal.C17542s.i(r2, r3)
            r1.add(r2)
            goto L_0x009b
        L_0x00b8:
            uJ.T r0 = new uJ.T
            r0.<init>(r1)
            uJ.u0 r1 = r15.M0()
            java.util.List r2 = YH.C16877v.n()
            nJ.k r15 = r15.q()
            uJ.f0 r15 = uJ.C18099X.m(r1, r0, r2, r4, r15)
            return r15
        L_0x00ce:
            boolean r1 = r0 instanceof uJ.C18095T
            if (r1 == 0) goto L_0x0120
            boolean r1 = r15.O0()
            if (r1 == 0) goto L_0x0120
            uJ.T r0 = (uJ.C18095T) r0
            java.util.Collection r15 = r0.a()
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = YH.C16877v.y(r15, r2)
            r1.<init>(r2)
            java.util.Iterator r15 = r15.iterator()
        L_0x00ed:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x0102
            java.lang.Object r2 = r15.next()
            uJ.U r2 = (uJ.C18096U) r2
            uJ.U r2 = zJ.C18755d.B(r2)
            r1.add(r2)
            r4 = 1
            goto L_0x00ed
        L_0x0102:
            if (r4 != 0) goto L_0x0105
            goto L_0x0118
        L_0x0105:
            uJ.U r15 = r0.m()
            if (r15 == 0) goto L_0x010f
            uJ.U r3 = zJ.C18755d.B(r15)
        L_0x010f:
            uJ.T r15 = new uJ.T
            r15.<init>(r1)
            uJ.T r3 = r15.t(r3)
        L_0x0118:
            if (r3 != 0) goto L_0x011b
            goto L_0x011c
        L_0x011b:
            r0 = r3
        L_0x011c:
            uJ.f0 r15 = r0.k()
        L_0x0120:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: vJ.f.c(uJ.f0):uJ.f0");
    }

    /* renamed from: b */
    public P0 a(C18740i iVar) {
        P0 p02;
        C17542s.j(iVar, "type");
        if (iVar instanceof C18096U) {
            P0 Q02 = ((C18096U) iVar).Q0();
            if (Q02 instanceof C18113f0) {
                p02 = c((C18113f0) Q02);
            } else if (Q02 instanceof C18087K) {
                C18087K k10 = (C18087K) Q02;
                C18113f0 c10 = c(k10.V0());
                C18113f0 c11 = c(k10.W0());
                p02 = (c10 == k10.V0() && c11 == k10.W0()) ? Q02 : C18099X.e(c10, c11);
            } else {
                throw new t();
            }
            return O0.c(p02, Q02, new b(this));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
