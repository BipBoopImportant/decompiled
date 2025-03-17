package br;

import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import nI.r;
import s0.C5844O;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a=\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LQq/d;", "details", "Lkotlin/Function0;", "LXH/N;", "onChooseRewardClicked", "onNotNowClicked", "Landroidx/compose/ui/d;", "modifier", "g", "(LQq/d;LnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "LQq/f;", "expiringKey", "e", "(LQq/f;Landroidx/compose/ui/d;LU0/m;II)V", "", "title", "description", "j", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/d;LU0/m;II)V", "familyrewards-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Qq.d f90635a;

        a(Qq.d dVar) {
            this.f90635a = dVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1682344372, i10, -1, "com.ingka.ikea.familyrewards.implementation.compose.history.content.ExpiringKeysContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExpiringKeysContent.kt:72)");
                }
                j.j(this.f90635a.c(), this.f90635a.a(), (androidx.compose.ui.d) null, mVar, 0, 4);
                C5844O.a(J.i(androidx.compose.ui.d.f18749a, h.B((float) 16)), mVar, 6);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C17642l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f90636a = new b();

        /* renamed from: a */
        public final Void invoke(Qq.f fVar) {
            C17542s.j(fVar, "it");
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C17642l<Qq.f, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f90637a;

        public c(String str) {
            this.f90637a = str;
        }

        /* renamed from: a */
        public final Object invoke(Qq.f fVar) {
            C17542s.j(fVar, "item");
            String str = this.f90637a;
            if (str != null) {
                String str2 = str + ":" + fVar.f();
                if (str2 != null) {
                    return str2;
                }
            }
            return Long.valueOf(fVar.f());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/a"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f90638c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f90639d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17642l lVar, List list) {
            super(1);
            this.f90638c = lVar;
            this.f90639d = list;
        }

        public final Object a(int i10) {
            return this.f90638c.invoke(this.f90639d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;", "ul/b"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l f90640c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f90641d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17642l lVar, List list) {
            super(1);
            this.f90640c = lVar;
            this.f90641d = list;
        }

        public final Object a(int i10) {
            return this.f90640c.invoke(this.f90641d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f90642c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(List list) {
            super(4);
            this.f90642c = list;
        }

        public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (mVar.V(cVar) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= mVar.d(i10) ? 32 : 16;
            }
            if ((i12 & 147) != 146 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                mVar.W(-477366822);
                j.e((Qq.f) this.f90642c.get(i10), C5116k1.a(TC.e.i(androidx.compose.ui.d.f18749a), "ExpiringKeysContentTestTag-ExpiringKeysRow"), mVar, 0, 0);
                mVar.P();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(Qq.f r59, androidx.compose.ui.d r60, U0.C4889m r61, int r62, int r63) {
        /*
            r0 = r59
            r1 = r62
            r2 = r63
            r3 = -1304745332(0xffffffffb23b2a8c, float:-1.0894507E-8)
            r4 = r61
            U0.m r14 = r4.k(r3)
            r4 = r2 & 1
            r15 = 4
            if (r4 == 0) goto L_0x0017
            r4 = r1 | 6
            goto L_0x0027
        L_0x0017:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x0026
            boolean r4 = r14.F(r0)
            if (r4 == 0) goto L_0x0023
            r4 = r15
            goto L_0x0024
        L_0x0023:
            r4 = 2
        L_0x0024:
            r4 = r4 | r1
            goto L_0x0027
        L_0x0026:
            r4 = r1
        L_0x0027:
            r5 = r2 & 2
            r13 = 32
            if (r5 == 0) goto L_0x0032
            r4 = r4 | 48
        L_0x002f:
            r6 = r60
            goto L_0x0043
        L_0x0032:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x002f
            r6 = r60
            boolean r7 = r14.V(r6)
            if (r7 == 0) goto L_0x0040
            r7 = r13
            goto L_0x0042
        L_0x0040:
            r7 = 16
        L_0x0042:
            r4 = r4 | r7
        L_0x0043:
            r7 = r4 & 19
            r8 = 18
            if (r7 != r8) goto L_0x0056
            boolean r7 = r14.l()
            if (r7 != 0) goto L_0x0050
            goto L_0x0056
        L_0x0050:
            r14.L()
            r12 = r14
            goto L_0x01db
        L_0x0056:
            if (r5 == 0) goto L_0x005c
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r12 = r5
            goto L_0x005d
        L_0x005c:
            r12 = r6
        L_0x005d:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0069
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.familyrewards.implementation.compose.history.content.ExpiringKeyRow (ExpiringKeysContent.kt:121)"
            U0.C4895p.S(r3, r4, r5, r6)
        L_0x0069:
            i1.c$a r3 = i1.C5437c.f24302a
            i1.c$c r3 = r3.i()
            androidx.compose.foundation.layout.d r4 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r4 = r4.f()
            r5 = 48
            E1.I r3 = androidx.compose.foundation.layout.G.b(r4, r3, r14, r5)
            r11 = 0
            int r4 = U0.C4883j.a(r14, r11)
            U0.y r5 = r14.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r14, r12)
            G1.g$a r7 = G1.C4504g.f6515W
            nI.a r8 = r7.a()
            U0.f r9 = r14.m()
            if (r9 != 0) goto L_0x0097
            U0.C4883j.c()
        L_0x0097:
            r14.I()
            boolean r9 = r14.i()
            if (r9 == 0) goto L_0x00a4
            r14.p(r8)
            goto L_0x00a7
        L_0x00a4:
            r14.t()
        L_0x00a7:
            U0.m r8 = U0.F1.a(r14)
            nI.p r9 = r7.c()
            U0.F1.c(r8, r3, r9)
            nI.p r3 = r7.e()
            U0.F1.c(r8, r5, r3)
            nI.p r3 = r7.b()
            boolean r5 = r8.i()
            if (r5 != 0) goto L_0x00d1
            java.lang.Object r5 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r9)
            if (r5 != 0) goto L_0x00df
        L_0x00d1:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r8.u(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.w(r4, r3)
        L_0x00df:
            nI.p r3 = r7.d()
            U0.F1.c(r8, r6, r3)
            s0.N r16 = s0.C5843N.f28726a
            java.lang.String r4 = r59.h()
            tK.v r3 = tK.C18030v.f147664a
            int r9 = tK.C18030v.f147665b
            tK.h r5 = r3.a(r14, r9)
            long r7 = r5.G0()
            TC.b$a$b r5 = TC.C13679b.a.C2856b.f116680a
            r31 = r5
            androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r17 = r10
            androidx.compose.ui.d r6 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            r28 = 0
            r29 = 262128(0x3fff0, float:3.6732E-40)
            r16 = 0
            r56 = r9
            r57 = r10
            r9 = r16
            r16 = 0
            r11 = r16
            r58 = r12
            r12 = r16
            r13 = r16
            r16 = 0
            r60 = r14
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 48
            r26 = r60
            SC.C13607l.j(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            int r4 = r59.g()
            java.lang.String r30 = java.lang.String.valueOf(r4)
            r12 = r60
            r4 = r56
            tK.h r5 = r3.a(r12, r4)
            long r33 = r5.G0()
            S1.C$a r5 = S1.C.f13316b
            S1.C r38 = r5.a()
            r54 = 0
            r55 = 262068(0x3ffb4, float:3.67235E-40)
            r32 = 0
            r35 = 0
            r37 = 0
            r39 = 0
            r40 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r53 = 1572912(0x180030, float:2.204119E-39)
            r52 = r12
            SC.C13607l.j(r30, r31, r32, r33, r35, r37, r38, r39, r40, r42, r43, r44, r45, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            tK.u r5 = tK.C18029u.f147649a
            float r5 = r5.l()
            r6 = r57
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.y(r6, r5)
            r7 = 0
            s0.C5844O.a(r5, r12, r7)
            int r5 = uK.C18146a.f148445g
            t1.c r5 = J1.e.c(r5, r12, r7)
            r7 = 32
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.t(r6, r7)
            tK.h r3 = r3.a(r12, r4)
            long r3 = r3.B0()
            A0.f r7 = A0.g.h()
            androidx.compose.ui.d r3 = androidx.compose.foundation.b.c(r6, r3, r7)
            r4 = 4
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.i(r3, r4)
            r10 = 48
            r11 = 8
            r3 = 0
            r7 = 0
            r4 = r5
            r5 = r3
            r9 = r12
            O0.V.a(r4, r5, r6, r7, r9, r10, r11)
            r12.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x01d9
            U0.C4895p.R()
        L_0x01d9:
            r6 = r58
        L_0x01db:
            U0.Y0 r3 = r12.n()
            if (r3 == 0) goto L_0x01e9
            br.i r4 = new br.i
            r4.<init>(r0, r6, r1, r2)
            r3.a(r4)
        L_0x01e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: br.j.e(Qq.f, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(Qq.f fVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        e(fVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(Qq.d r31, nI.C17631a<XH.C16807N> r32, nI.C17631a<XH.C16807N> r33, androidx.compose.ui.d r34, U0.C4889m r35, int r36, int r37) {
        /*
            r1 = r31
            r15 = r32
            r0 = r33
            r14 = r36
            java.lang.String r2 = "details"
            kotlin.jvm.internal.C17542s.j(r1, r2)
            java.lang.String r2 = "onChooseRewardClicked"
            kotlin.jvm.internal.C17542s.j(r15, r2)
            java.lang.String r2 = "onNotNowClicked"
            kotlin.jvm.internal.C17542s.j(r0, r2)
            r2 = -916837078(0xffffffffc95a2d2a, float:-893650.6)
            r3 = r35
            U0.m r13 = r3.k(r2)
            r3 = r37 & 1
            r12 = 2
            if (r3 == 0) goto L_0x0028
            r3 = r14 | 6
            goto L_0x0038
        L_0x0028:
            r3 = r14 & 6
            if (r3 != 0) goto L_0x0037
            boolean r3 = r13.F(r1)
            if (r3 == 0) goto L_0x0034
            r3 = 4
            goto L_0x0035
        L_0x0034:
            r3 = r12
        L_0x0035:
            r3 = r3 | r14
            goto L_0x0038
        L_0x0037:
            r3 = r14
        L_0x0038:
            r4 = r37 & 2
            if (r4 == 0) goto L_0x003f
            r3 = r3 | 48
            goto L_0x004f
        L_0x003f:
            r4 = r14 & 48
            if (r4 != 0) goto L_0x004f
            boolean r4 = r13.F(r15)
            if (r4 == 0) goto L_0x004c
            r4 = 32
            goto L_0x004e
        L_0x004c:
            r4 = 16
        L_0x004e:
            r3 = r3 | r4
        L_0x004f:
            r4 = r37 & 4
            if (r4 == 0) goto L_0x0056
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0066
        L_0x0056:
            r4 = r14 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0066
            boolean r4 = r13.F(r0)
            if (r4 == 0) goto L_0x0063
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r3 = r3 | r4
        L_0x0066:
            r4 = r37 & 8
            if (r4 == 0) goto L_0x0070
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x006c:
            r7 = r34
        L_0x006e:
            r11 = r3
            goto L_0x0083
        L_0x0070:
            r7 = r14 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x006c
            r7 = r34
            boolean r8 = r13.V(r7)
            if (r8 == 0) goto L_0x007f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r3 = r3 | r8
            goto L_0x006e
        L_0x0083:
            r3 = r11 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r3 != r8) goto L_0x0097
            boolean r3 = r13.l()
            if (r3 != 0) goto L_0x0090
            goto L_0x0097
        L_0x0090:
            r13.L()
            r4 = r7
            r2 = r13
            goto L_0x02a5
        L_0x0097:
            if (r4 == 0) goto L_0x009d
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r10 = r3
            goto L_0x009e
        L_0x009d:
            r10 = r7
        L_0x009e:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00aa
            r3 = -1
            java.lang.String r4 = "com.ingka.ikea.familyrewards.implementation.compose.history.content.ExpiringKeysContent (ExpiringKeysContent.kt:53)"
            U0.C4895p.S(r2, r11, r3, r4)
        L_0x00aa:
            androidx.compose.foundation.layout.d r2 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r2.g()
            i1.c$a r4 = i1.C5437c.f24302a
            i1.c$b r7 = r4.k()
            r9 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r7, r13, r9)
            int r7 = U0.C4883j.a(r13, r9)
            U0.y r8 = r13.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r13, r10)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r5 = r16.a()
            U0.f r18 = r13.m()
            if (r18 != 0) goto L_0x00d6
            U0.C4883j.c()
        L_0x00d6:
            r13.I()
            boolean r18 = r13.i()
            if (r18 == 0) goto L_0x00e3
            r13.p(r5)
            goto L_0x00e6
        L_0x00e3:
            r13.t()
        L_0x00e6:
            U0.m r5 = U0.F1.a(r13)
            nI.p r9 = r16.c()
            U0.F1.c(r5, r3, r9)
            nI.p r3 = r16.e()
            U0.F1.c(r5, r8, r3)
            nI.p r3 = r16.b()
            boolean r8 = r5.i()
            if (r8 != 0) goto L_0x0110
            java.lang.Object r8 = r5.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r9)
            if (r8 != 0) goto L_0x011e
        L_0x0110:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r5.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r5.w(r7, r3)
        L_0x011e:
            nI.p r3 = r16.d()
            U0.F1.c(r5, r6, r3)
            s0.h r3 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r5 = 12
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            r8 = 0
            r7 = 1
            r6 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.k(r9, r8, r5, r7, r6)
            r6 = 40
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.y(r5, r6)
            r6 = 8
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r5, r6)
            float r6 = (float) r12
            float r6 = c2.h.B(r6)
            r12 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.k(r5, r8, r6, r7, r12)
            tK.v r6 = tK.C18030v.f147664a
            int r12 = tK.C18030v.f147665b
            tK.h r6 = r6.a(r13, r12)
            long r7 = r6.m0()
            r6 = 50
            A0.f r6 = A0.g.a(r6)
            androidx.compose.ui.d r5 = androidx.compose.foundation.b.c(r5, r7, r6)
            i1.c$b r4 = r4.g()
            androidx.compose.ui.d r4 = r3.b(r5, r4)
            r5 = 0
            s0.C5844O.a(r4, r13, r5)
            r4 = 16
            float r8 = (float) r4
            float r4 = c2.h.B(r8)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.i(r9, r4)
            r7 = 6
            s0.C5844O.a(r4, r13, r7)
            r4 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.d r16 = r3.a(r9, r4, r5)
            tK.u r3 = tK.C18029u.f147649a
            float r3 = r3.j()
            androidx.compose.foundation.layout.d$f r20 = r2.n(r3)
            r2 = 1534792772(0x5b7b1444, float:7.0672501E16)
            r13.W(r2)
            boolean r2 = r13.F(r1)
            java.lang.Object r3 = r13.D()
            if (r2 != 0) goto L_0x01b0
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x01b8
        L_0x01b0:
            br.f r3 = new br.f
            r3.<init>(r1)
            r13.u(r3)
        L_0x01b8:
            r24 = r3
            nI.l r24 = (nI.C17642l) r24
            r13.P()
            r26 = 0
            r27 = 238(0xee, float:3.34E-43)
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = r13
            t0.C5937b.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r2 = 32
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r9, r2)
            s0.C5844O.a(r2, r13, r7)
            int r2 = Rq.e.f86981b
            r6 = 0
            java.lang.String r2 = J1.j.b(r2, r13, r6)
            SC.N r5 = SC.N.Primary
            java.lang.String r3 = "ExpiringKeysContentTestTag-ChooseRewardButton"
            androidx.compose.ui.d r3 = androidx.compose.ui.platform.C5116k1.a(r9, r3)
            r4 = 1
            r6 = 0
            r12 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r3, r12, r4, r6)
            float r4 = c2.h.B(r8)
            r16 = r10
            r10 = 2
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.k(r3, r4, r12, r10, r6)
            int r4 = r11 << 24
            r17 = 1879048192(0x70000000, float:1.58456325E29)
            r4 = r4 & r17
            r4 = r4 | 3120(0xc30, float:4.372E-42)
            r18 = 500(0x1f4, float:7.0E-43)
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r26 = r4
            r25 = 1
            r4 = r19
            r19 = 0
            r6 = r20
            r7 = r21
            r20 = r8
            r8 = r22
            r28 = r9
            r9 = r23
            r19 = r16
            r16 = r10
            r10 = r24
            r21 = r11
            r11 = r32
            r12 = r13
            r29 = r13
            r13 = r26
            r14 = r18
            SC.L.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            float r2 = c2.h.B(r20)
            r14 = r28
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r14, r2)
            r13 = r29
            r12 = 6
            s0.C5844O.a(r2, r13, r12)
            int r2 = Oo.b.f84522U4
            r3 = 0
            java.lang.String r2 = J1.j.b(r2, r13, r3)
            SC.N r5 = SC.N.Tertiary
            java.lang.String r3 = "ExpiringKeysContentTestTag-NotNowButton"
            androidx.compose.ui.d r3 = androidx.compose.ui.platform.C5116k1.a(r14, r3)
            r4 = 0
            r6 = 1
            r7 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r3, r4, r6, r7)
            float r6 = c2.h.B(r20)
            r8 = 2
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.k(r3, r6, r4, r8, r7)
            int r4 = r21 << 21
            r4 = r4 & r17
            r11 = r4 | 3120(0xc30, float:4.372E-42)
            r16 = 500(0x1f4, float:7.0E-43)
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r17 = r11
            r11 = r33
            r12 = r13
            r30 = r13
            r13 = r17
            r0 = r14
            r14 = r16
            SC.L.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            float r2 = c2.h.B(r20)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r0, r2)
            r2 = r30
            r3 = 6
            s0.C5844O.a(r0, r2, r3)
            r2.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02a3
            U0.C4895p.R()
        L_0x02a3:
            r4 = r19
        L_0x02a5:
            U0.Y0 r7 = r2.n()
            if (r7 == 0) goto L_0x02be
            br.g r8 = new br.g
            r0 = r8
            r1 = r31
            r2 = r32
            r3 = r33
            r5 = r36
            r6 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x02be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: br.j.g(Qq.d, nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(Qq.d dVar, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        x.i(xVar, k.Header, (Object) null, c1.c.c(1682344372, true, new a(dVar)), 2, (Object) null);
        List<Qq.f> b10 = dVar.b();
        b bVar = b.f90636a;
        xVar.e(b10.size(), new d(new c((String) null), b10), new e(bVar, b10), c1.c.c(-632812321, true, new f(b10)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(Qq.d dVar, C17631a aVar, C17631a aVar2, androidx.compose.ui.d dVar2, int i10, int i11, C4889m mVar, int i12) {
        g(dVar, aVar, aVar2, dVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void j(java.lang.String r34, java.lang.String r35, androidx.compose.ui.d r36, U0.C4889m r37, int r38, int r39) {
        /*
            r4 = r38
            r0 = 2
            r1 = 4
            r2 = 6
            r3 = 1661840443(0x630dac3b, float:2.6134014E21)
            r5 = r37
            U0.m r5 = r5.k(r3)
            r6 = r39 & 1
            if (r6 == 0) goto L_0x0017
            r6 = r4 | 6
            r15 = r34
            goto L_0x0029
        L_0x0017:
            r6 = r4 & 6
            r15 = r34
            if (r6 != 0) goto L_0x0028
            boolean r6 = r5.V(r15)
            if (r6 == 0) goto L_0x0025
            r6 = r1
            goto L_0x0026
        L_0x0025:
            r6 = r0
        L_0x0026:
            r6 = r6 | r4
            goto L_0x0029
        L_0x0028:
            r6 = r4
        L_0x0029:
            r0 = r39 & 2
            r14 = 16
            if (r0 == 0) goto L_0x0034
            r6 = r6 | 48
        L_0x0031:
            r0 = r35
            goto L_0x0045
        L_0x0034:
            r0 = r4 & 48
            if (r0 != 0) goto L_0x0031
            r0 = r35
            boolean r7 = r5.V(r0)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0044
        L_0x0043:
            r7 = r14
        L_0x0044:
            r6 = r6 | r7
        L_0x0045:
            r1 = r39 & 4
            if (r1 == 0) goto L_0x004f
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r7 = r36
        L_0x004d:
            r13 = r6
            goto L_0x0062
        L_0x004f:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x004b
            r7 = r36
            boolean r8 = r5.V(r7)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r6 = r6 | r8
            goto L_0x004d
        L_0x0062:
            r6 = r13 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r6 != r8) goto L_0x0077
            boolean r6 = r5.l()
            if (r6 != 0) goto L_0x006f
            goto L_0x0077
        L_0x006f:
            r5.L()
            r31 = r5
            r3 = r7
            goto L_0x0198
        L_0x0077:
            if (r1 == 0) goto L_0x007c
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            goto L_0x007d
        L_0x007c:
            r1 = r7
        L_0x007d:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0089
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.familyrewards.implementation.compose.history.content.ExpiringKeysHeader (ExpiringKeysContent.kt:161)"
            U0.C4895p.S(r3, r13, r6, r7)
        L_0x0089:
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            i1.c$a r6 = i1.C5437c.f24302a
            i1.c$b r6 = r6.k()
            r7 = 0
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r6, r5, r7)
            int r6 = U0.C4883j.a(r5, r7)
            U0.y r7 = r5.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r5, r1)
            G1.g$a r9 = G1.C4504g.f6515W
            nI.a r10 = r9.a()
            U0.f r11 = r5.m()
            if (r11 != 0) goto L_0x00b5
            U0.C4883j.c()
        L_0x00b5:
            r5.I()
            boolean r11 = r5.i()
            if (r11 == 0) goto L_0x00c2
            r5.p(r10)
            goto L_0x00c5
        L_0x00c2:
            r5.t()
        L_0x00c5:
            U0.m r10 = U0.F1.a(r5)
            nI.p r11 = r9.c()
            U0.F1.c(r10, r3, r11)
            nI.p r3 = r9.e()
            U0.F1.c(r10, r7, r3)
            nI.p r3 = r9.b()
            boolean r7 = r10.i()
            if (r7 != 0) goto L_0x00ef
            java.lang.Object r7 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x00fd
        L_0x00ef:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r10.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10.w(r6, r3)
        L_0x00fd:
            nI.p r3 = r9.d()
            U0.F1.c(r10, r8, r3)
            s0.h r3 = s0.C5862h.f28810a
            tK.v r3 = tK.C18030v.f147664a
            int r12 = tK.C18030v.f147665b
            tK.h r6 = r3.a(r5, r12)
            long r8 = r6.G0()
            TC.b$b$a r6 = TC.C13679b.C2857b.a.f116683a
            androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r7 = TC.e.i(r10)
            r11 = r13 & 14
            r28 = r11 | 48
            r29 = 0
            r30 = 262128(0x3fff0, float:3.6732E-40)
            r16 = 0
            r2 = r10
            r10 = r16
            r16 = 0
            r32 = r12
            r12 = r16
            r33 = r13
            r13 = r16
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r36 = r5
            r5 = r34
            r27 = r36
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r5 = 16
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.i(r2, r5)
            r15 = r36
            r6 = 6
            s0.C5844O.a(r5, r15, r6)
            r5 = r32
            tK.h r3 = r3.a(r15, r5)
            long r8 = r3.G0()
            TC.b$a$b r6 = TC.C13679b.a.C2856b.f116680a
            androidx.compose.ui.d r7 = TC.e.i(r2)
            int r2 = r33 >> 3
            r2 = r2 & 14
            r28 = r2 | 48
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r2 = 0
            r31 = r15
            r15 = r2
            r5 = r35
            r27 = r31
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r31.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0197
            U0.C4895p.R()
        L_0x0197:
            r3 = r1
        L_0x0198:
            U0.Y0 r6 = r31.n()
            if (r6 == 0) goto L_0x01af
            br.h r7 = new br.h
            r0 = r7
            r1 = r34
            r2 = r35
            r4 = r38
            r5 = r39
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: br.j.j(java.lang.String, java.lang.String, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N k(String str, String str2, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        j(str, str2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
