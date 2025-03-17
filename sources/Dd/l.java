package Dd;

import Jd.e;
import Jd.i;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.A1;
import U0.C4889m;
import U0.M0;
import XH.C16807N;
import XH.x;
import XH.y;
import com.google.gson.JsonElement;
import com.ikea.kompassmap.model.store.FrequentlyAskedPointsOfInterest;
import com.ikea.kompassmap.model.store.StoreData;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import nI.p;
import org.maplibre.geojson.Feature;
import yd.C10455i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LJd/i;", "storeViewModel", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "c", "(LJd/i;Landroidx/compose/ui/d;LU0/m;II)V", "KompassMap_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class l {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 0, 0})
    @f(c = "com.ikea.kompassmap.ui.components.MFAQRowKt$MFAQRow$1$1$1$1$1", f = "MFAQRow.kt", l = {86}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f59131c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FrequentlyAskedPointsOfInterest f59132d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<e> f59133e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f59134f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ StoreData f59135g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FrequentlyAskedPointsOfInterest frequentlyAskedPointsOfInterest, A1<e> a12, i iVar, StoreData storeData, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f59132d = frequentlyAskedPointsOfInterest;
            this.f59133e = a12;
            this.f59134f = iVar;
            this.f59135g = storeData;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f59132d, this.f59133e, this.f59134f, this.f59135g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f59131c;
            if (i10 == 0) {
                y.b(obj);
                A1<e> a12 = this.f59133e;
                i iVar = this.f59134f;
                StoreData storeData = this.f59135g;
                String subTypeId = this.f59132d.getSubTypeId();
                this.f59131c = 1;
                if (l.f(a12, iVar, storeData, subTypeId, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @f(c = "com.ikea.kompassmap.ui.components.MFAQRowKt", f = "MFAQRow.kt", l = {66}, m = "MFAQRow$handleOnClick")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f59136c;

        /* renamed from: d  reason: collision with root package name */
        Object f59137d;

        /* renamed from: e  reason: collision with root package name */
        Object f59138e;

        /* renamed from: f  reason: collision with root package name */
        Object f59139f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f59140g;

        /* renamed from: h  reason: collision with root package name */
        int f59141h;

        b(C17164e<? super b> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f59140g = obj;
            this.f59141h |= Integer.MIN_VALUE;
            return l.f((A1<e>) null, (i) null, (StoreData) null, (String) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(Jd.i r26, androidx.compose.ui.d r27, U0.C4889m r28, int r29, int r30) {
        /*
            r6 = r26
            r7 = r29
            r8 = r30
            r0 = 2
            r9 = 6
            java.lang.String r1 = "storeViewModel"
            kotlin.jvm.internal.C17542s.j(r6, r1)
            r1 = -701922095(0xffffffffd62984d1, float:-4.6596977E13)
            r2 = r28
            U0.m r15 = r2.k(r1)
            r2 = 1
            r3 = r8 & 1
            r4 = 4
            if (r3 == 0) goto L_0x001f
            r3 = r7 | 6
            goto L_0x002f
        L_0x001f:
            r3 = r7 & 6
            if (r3 != 0) goto L_0x002e
            boolean r3 = r15.F(r6)
            if (r3 == 0) goto L_0x002b
            r3 = r4
            goto L_0x002c
        L_0x002b:
            r3 = r0
        L_0x002c:
            r3 = r3 | r7
            goto L_0x002f
        L_0x002e:
            r3 = r7
        L_0x002f:
            r0 = r0 & r8
            if (r0 == 0) goto L_0x0037
            r3 = r3 | 48
        L_0x0034:
            r5 = r27
            goto L_0x0049
        L_0x0037:
            r5 = r7 & 48
            if (r5 != 0) goto L_0x0034
            r5 = r27
            boolean r10 = r15.V(r5)
            if (r10 == 0) goto L_0x0046
            r10 = 32
            goto L_0x0048
        L_0x0046:
            r10 = 16
        L_0x0048:
            r3 = r3 | r10
        L_0x0049:
            r10 = r3 & 19
            r11 = 18
            if (r10 != r11) goto L_0x005c
            boolean r10 = r15.l()
            if (r10 != 0) goto L_0x0056
            goto L_0x005c
        L_0x0056:
            r15.L()
            r3 = r15
            goto L_0x0261
        L_0x005c:
            if (r0 == 0) goto L_0x0063
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r23 = r0
            goto L_0x0065
        L_0x0063:
            r23 = r5
        L_0x0065:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0071
            r0 = -1
            java.lang.String r5 = "com.ikea.kompassmap.ui.components.MFAQRow (MFAQRow.kt:28)"
            U0.C4895p.S(r1, r3, r0, r5)
        L_0x0071:
            r0 = 0
            androidx.compose.foundation.o r17 = androidx.compose.foundation.m.c(r0, r15, r0, r2)
            java.lang.Object r1 = r15.D()
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r1 != r3) goto L_0x0091
            dI.j r1 = dI.C17169j.f142968a
            QJ.Q r1 = U0.P.k(r1, r15)
            U0.B r3 = new U0.B
            r3.<init>(r1)
            r15.u(r3)
            r1 = r3
        L_0x0091:
            U0.B r1 = (U0.B) r1
            QJ.Q r14 = r1.a()
            TJ.B r1 = r26.T()
            r13 = 0
            U0.A1 r12 = U0.p1.b(r1, r13, r15, r0, r2)
            java.lang.Object r1 = r12.getValue()
            Jd.e r1 = (Jd.e) r1
            com.ikea.kompassmap.model.store.StoreData r11 = r1.v()
            r21 = 14
            r22 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r16 = r23
            androidx.compose.ui.d r1 = androidx.compose.foundation.m.b(r16, r17, r18, r19, r20, r21, r22)
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            r3 = 8
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            androidx.compose.foundation.layout.d$f r2 = r2.n(r3)
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$c r3 = r3.l()
            E1.I r2 = androidx.compose.foundation.layout.G.b(r2, r3, r15, r9)
            int r0 = U0.C4883j.a(r15, r0)
            U0.y r3 = r15.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r15, r1)
            G1.g$a r5 = G1.C4504g.f6515W
            nI.a r10 = r5.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x00ec
            U0.C4883j.c()
        L_0x00ec:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x00f9
            r15.p(r10)
            goto L_0x00fc
        L_0x00f9:
            r15.t()
        L_0x00fc:
            U0.m r10 = U0.F1.a(r15)
            nI.p r13 = r5.c()
            U0.F1.c(r10, r2, r13)
            nI.p r2 = r5.e()
            U0.F1.c(r10, r3, r2)
            nI.p r2 = r5.b()
            boolean r3 = r10.i()
            if (r3 != 0) goto L_0x0126
            java.lang.Object r3 = r10.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r13)
            if (r3 != 0) goto L_0x0134
        L_0x0126:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r10.u(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.w(r0, r2)
        L_0x0134:
            nI.p r0 = r5.d()
            U0.F1.c(r10, r1, r0)
            s0.N r0 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            float r13 = (float) r4
            float r1 = c2.h.B(r13)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.y(r0, r1)
            s0.C5844O.a(r0, r15, r9)
            if (r11 == 0) goto L_0x0152
            java.util.List r0 = r11.getFrequentlyAskedPointsOfInterest()
            goto L_0x0153
        L_0x0152:
            r0 = 0
        L_0x0153:
            r1 = -2050507311(0xffffffff85c7bdd1, float:-1.8783598E-35)
            r15.W(r1)
            if (r0 != 0) goto L_0x0160
        L_0x015b:
            r25 = r13
            r3 = r15
            goto L_0x0242
        L_0x0160:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r10 = new java.util.ArrayList
            r1 = 10
            int r1 = YH.C16877v.y(r0, r1)
            r10.<init>(r1)
            java.util.Iterator r22 = r0.iterator()
        L_0x0171:
            boolean r0 = r22.hasNext()
            if (r0 == 0) goto L_0x015b
            java.lang.Object r0 = r22.next()
            r2 = r0
            com.ikea.kompassmap.model.store.FrequentlyAskedPointsOfInterest r2 = (com.ikea.kompassmap.model.store.FrequentlyAskedPointsOfInterest) r2
            java.lang.String r16 = r2.getSubTypeName()
            java.lang.String r0 = r2.getSubTypeId()
            java.lang.Object r1 = r12.getValue()
            Jd.e r1 = (Jd.e) r1
            java.util.List r1 = r1.u()
            java.lang.Object r1 = YH.C16877v.y0(r1)
            org.maplibre.geojson.Feature r1 = (org.maplibre.geojson.Feature) r1
            if (r1 == 0) goto L_0x019f
            java.lang.String r3 = "subtype"
            java.lang.String r1 = e(r1, r3)
            goto L_0x01a0
        L_0x019f:
            r1 = 0
        L_0x01a0:
            boolean r17 = kotlin.jvm.internal.C17542s.e(r0, r1)
            wK.q6$a r5 = new wK.q6$a
            java.lang.String r0 = r2.getSubTypeId()
            yd.i r0 = j(r0)
            if (r0 == 0) goto L_0x01b5
            int r0 = r0.b()
            goto L_0x01bb
        L_0x01b5:
            uK.c r0 = uK.C18148c.Incorrect
            int r0 = r0.m()
        L_0x01bb:
            r5.<init>(r0)
            wK.s6 r18 = wK.C18480s6.Small
            r0 = -1776052699(0xffffffff96239625, float:-1.3214412E-25)
            r15.W(r0)
            boolean r0 = r15.F(r14)
            boolean r1 = r15.V(r12)
            r0 = r0 | r1
            boolean r1 = r15.F(r6)
            r0 = r0 | r1
            boolean r1 = r15.F(r11)
            r0 = r0 | r1
            boolean r1 = r15.V(r2)
            r0 = r0 | r1
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x01f0
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x01ed
            goto L_0x01f0
        L_0x01ed:
            r19 = r5
            goto L_0x0202
        L_0x01f0:
            Dd.j r4 = new Dd.j
            r0 = r4
            r1 = r14
            r3 = r12
            r9 = r4
            r4 = r26
            r19 = r5
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r15.u(r9)
            r1 = r9
        L_0x0202:
            r0 = r1
            nI.a r0 = (nI.C17631a) r0
            r15.P()
            int r1 = wK.C18456q6.a.f151444b
            r2 = 6
            int r1 = r1 << r2
            r2 = 196608(0x30000, float:2.75506E-40)
            r20 = r1 | r2
            r21 = 154(0x9a, float:2.16E-43)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r10
            r10 = r16
            r9 = r11
            r11 = r1
            r1 = r12
            r12 = r19
            r25 = r13
            r24 = 0
            r13 = r2
            r2 = r14
            r14 = r3
            r3 = r15
            r15 = r18
            r16 = r17
            r17 = r4
            r18 = r0
            r19 = r3
            wK.C18444p6.r(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            XH.N r0 = XH.C16807N.f139792a
            r5.add(r0)
            r12 = r1
            r14 = r2
            r15 = r3
            r10 = r5
            r11 = r9
            r13 = r25
            r9 = 6
            goto L_0x0171
        L_0x0242:
            r3.P()
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            float r1 = c2.h.B(r25)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.y(r0, r1)
            r1 = 6
            s0.C5844O.a(r0, r3, r1)
            r3.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x025f
            U0.C4895p.R()
        L_0x025f:
            r5 = r23
        L_0x0261:
            U0.Y0 r0 = r3.n()
            if (r0 == 0) goto L_0x026f
            Dd.k r1 = new Dd.k
            r1.<init>(r6, r5, r7, r8)
            r0.a(r1)
        L_0x026f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dd.l.c(Jd.i, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: org.maplibre.geojson.Feature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: org.maplibre.geojson.Feature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: org.maplibre.geojson.Feature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: org.maplibre.geojson.Feature} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final org.maplibre.geojson.Feature d(com.ikea.kompassmap.model.store.map.Floor r4, java.lang.String r5) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x002b
            java.util.List r4 = r4.getData()
            if (r4 == 0) goto L_0x002b
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x000f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r4.next()
            r2 = r1
            org.maplibre.geojson.Feature r2 = (org.maplibre.geojson.Feature) r2
            java.lang.String r3 = "subtype"
            java.lang.String r2 = e(r2, r3)
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r5)
            if (r2 == 0) goto L_0x000f
            r0 = r1
        L_0x0029:
            org.maplibre.geojson.Feature r0 = (org.maplibre.geojson.Feature) r0
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Dd.l.d(com.ikea.kompassmap.model.store.map.Floor, java.lang.String):org.maplibre.geojson.Feature");
    }

    private static final String e(Feature feature, String str) {
        JsonElement i10 = i(feature.getProperty(str));
        if (i10 != null) {
            return i10.getAsString();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ca, code lost:
        r0.f59136c = r7;
        r0.f59137d = r10;
        r0.f59138e = r8;
        r0.f59139f = r11;
        r0.f59141h = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d8, code lost:
        if (r7.c0(r9, r0) != r1) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00da, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00db, code lost:
        r9 = r10;
        r10 = r7;
        r7 = r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00eb A[EDGE_INSN: B:47:0x00eb->B:40:0x00eb ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object f(U0.A1<Jd.e> r7, Jd.i r8, com.ikea.kompassmap.model.store.StoreData r9, java.lang.String r10, dI.C17164e<? super XH.C16807N> r11) {
        /*
            boolean r0 = r11 instanceof Dd.l.b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            Dd.l$b r0 = (Dd.l.b) r0
            int r1 = r0.f59141h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f59141h = r1
            goto L_0x0018
        L_0x0013:
            Dd.l$b r0 = new Dd.l$b
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.f59140g
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f59141h
            r3 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r7 = r0.f59139f
            org.maplibre.geojson.Feature r7 = (org.maplibre.geojson.Feature) r7
            java.lang.Object r8 = r0.f59138e
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f59137d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.f59136c
            Jd.i r10 = (Jd.i) r10
            XH.y.b(r11)
            goto L_0x00de
        L_0x003a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0042:
            XH.y.b(r11)
            java.lang.Object r11 = r7.getValue()
            Jd.e r11 = (Jd.e) r11
            com.ikea.kompassmap.model.store.map.Floor r11 = r11.m()
            org.maplibre.geojson.Feature r2 = d(r11, r10)
            java.lang.Object r7 = r7.getValue()
            Jd.e r7 = (Jd.e) r7
            nI.l r7 = r7.i()
            yd.o$c r4 = new yd.o$c
            yd.o$b r5 = yd.C10461o.b.MFAQ
            r4.<init>(r10, r5)
            r7.invoke(r4)
            if (r2 == 0) goto L_0x0075
            r8.N(r2)
            java.util.List r7 = YH.C16877v.e(r2)
            r8.F(r7)
            goto L_0x00eb
        L_0x0075:
            if (r9 == 0) goto L_0x00eb
            com.ikea.kompassmap.model.store.map.StoreMap r7 = r9.getMap()
            if (r7 == 0) goto L_0x00eb
            java.util.List r7 = r7.getFloors()
            if (r7 == 0) goto L_0x00eb
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x008e:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x00b1
            java.lang.Object r2 = r7.next()
            r4 = r2
            com.ikea.kompassmap.model.store.map.Floor r4 = (com.ikea.kompassmap.model.store.map.Floor) r4
            java.lang.String r4 = r4.getFloorId()
            if (r11 == 0) goto L_0x00a6
            java.lang.String r5 = r11.getFloorId()
            goto L_0x00a7
        L_0x00a6:
            r5 = 0
        L_0x00a7:
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
            if (r4 != 0) goto L_0x008e
            r9.add(r2)
            goto L_0x008e
        L_0x00b1:
            java.util.Iterator r7 = r9.iterator()
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x00b8:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00eb
            java.lang.Object r9 = r8.next()
            com.ikea.kompassmap.model.store.map.Floor r9 = (com.ikea.kompassmap.model.store.map.Floor) r9
            org.maplibre.geojson.Feature r11 = d(r9, r10)
            if (r11 == 0) goto L_0x00b8
            r0.f59136c = r7
            r0.f59137d = r10
            r0.f59138e = r8
            r0.f59139f = r11
            r0.f59141h = r3
            java.lang.Object r9 = r7.c0(r9, r0)
            if (r9 != r1) goto L_0x00db
            return r1
        L_0x00db:
            r9 = r10
            r10 = r7
            r7 = r11
        L_0x00de:
            r10.N(r7)
            java.util.List r7 = YH.C16877v.e(r7)
            r10.F(r7)
            r7 = r10
            r10 = r9
            goto L_0x00b8
        L_0x00eb:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Dd.l.f(U0.A1, Jd.i, com.ikea.kompassmap.model.store.StoreData, java.lang.String, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final C16807N g(Q q10, FrequentlyAskedPointsOfInterest frequentlyAskedPointsOfInterest, A1 a12, i iVar, StoreData storeData) {
        F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new a(frequentlyAskedPointsOfInterest, a12, iVar, storeData, (C17164e<? super a>) null), 3, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h(i iVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(iVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final JsonElement i(JsonElement jsonElement) {
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return null;
        }
        return jsonElement;
    }

    private static final C10455i j(String str) {
        Object obj;
        try {
            x.a aVar = x.f139812b;
            obj = x.b(C10455i.valueOf(str));
        } catch (Throwable th2) {
            x.a aVar2 = x.f139812b;
            obj = x.b(y.a(th2));
        }
        if (x.g(obj)) {
            obj = null;
        }
        return (C10455i) obj;
    }
}
