package androidx.compose.animation;

import E1.C4484q;
import E1.I;
import E1.a0;
import E1.r;
import XH.C16807N;
import YH.C16877v;
import c2.n;
import c2.s;
import c2.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J)\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/b;", "LE1/I;", "Landroidx/compose/animation/e;", "rootScope", "<init>", "(Landroidx/compose/animation/e;)V", "LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;", "LE1/r;", "LE1/q;", "", "height", "a", "(LE1/r;Ljava/util/List;I)I", "width", "j", "d", "h", "Landroidx/compose/animation/e;", "b", "()Landroidx/compose/animation/e;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b implements I {

    /* renamed from: a  reason: collision with root package name */
    private final e<?> f17326a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0[] f17327c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f17328d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f17329e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f17330f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(a0[] a0VarArr, b bVar, int i10, int i11) {
            super(1);
            this.f17327c = a0VarArr;
            this.f17328d = bVar;
            this.f17329e = i10;
            this.f17330f = i11;
        }

        public final void a(a0.a aVar) {
            a0[] a0VarArr = this.f17327c;
            b bVar = this.f17328d;
            int i10 = this.f17329e;
            int i11 = this.f17330f;
            for (a0 a0Var : a0VarArr) {
                if (a0Var != null) {
                    long a10 = bVar.b().o().a(s.a(a0Var.E0(), a0Var.z0()), s.a(i10, i11), t.Ltr);
                    a0.a.i(aVar, a0Var, n.h(a10), n.i(a10), 0.0f, 4, (Object) null);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public b(e<?> eVar) {
        this.f17326a = eVar;
    }

    public int a(r rVar, List<? extends C4484q> list, int i10) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((C4484q) list.get(0)).g0(i10));
            int p10 = C16877v.p(list);
            int i11 = 1;
            if (1 <= p10) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((C4484q) list.get(i11)).g0(i10));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i11 == p10) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final e<?> b() {
        return this.f17326a;
    }

    public int d(r rVar, List<? extends C4484q> list, int i10) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((C4484q) list.get(0)).h0(i10));
            int p10 = C16877v.p(list);
            int i11 = 1;
            if (1 <= p10) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((C4484q) list.get(i11)).h0(i10));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i11 == p10) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int h(r rVar, List<? extends C4484q> list, int i10) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((C4484q) list.get(0)).x(i10));
            int p10 = C16877v.p(list);
            int i11 = 1;
            if (1 <= p10) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((C4484q) list.get(i11)).x(i10));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i11 == p10) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: androidx.compose.animation.e$a} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [E1.a0] */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r12v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E1.J i(E1.K r21, java.util.List<? extends E1.H> r22, long r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r23
            r4 = 1
            int r5 = r22.size()
            E1.a0[] r6 = new E1.a0[r5]
            c2.r$a r7 = c2.r.f23053b
            long r7 = r7.a()
            int r9 = r22.size()
            r10 = 0
            r11 = r10
        L_0x0019:
            r12 = 0
            if (r11 >= r9) goto L_0x004c
            java.lang.Object r13 = r1.get(r11)
            E1.H r13 = (E1.H) r13
            java.lang.Object r14 = r13.h()
            boolean r15 = r14 instanceof androidx.compose.animation.e.a
            if (r15 == 0) goto L_0x002d
            r12 = r14
            androidx.compose.animation.e$a r12 = (androidx.compose.animation.e.a) r12
        L_0x002d:
            if (r12 == 0) goto L_0x004a
            boolean r12 = r12.a()
            if (r12 != r4) goto L_0x004a
            E1.a0 r7 = r13.i0(r2)
            int r8 = r7.E0()
            int r12 = r7.z0()
            long r12 = c2.s.a(r8, r12)
            XH.N r8 = XH.C16807N.f139792a
            r6[r11] = r7
            r7 = r12
        L_0x004a:
            int r11 = r11 + r4
            goto L_0x0019
        L_0x004c:
            int r9 = r22.size()
            r11 = r10
        L_0x0051:
            if (r11 >= r9) goto L_0x0065
            java.lang.Object r13 = r1.get(r11)
            E1.H r13 = (E1.H) r13
            r14 = r6[r11]
            if (r14 != 0) goto L_0x0063
            E1.a0 r13 = r13.i0(r2)
            r6[r11] = r13
        L_0x0063:
            int r11 = r11 + r4
            goto L_0x0051
        L_0x0065:
            boolean r1 = r21.A0()
            if (r1 == 0) goto L_0x0071
            int r1 = c2.r.h(r7)
        L_0x006f:
            r14 = r1
            goto L_0x00b0
        L_0x0071:
            if (r5 != 0) goto L_0x0075
            r1 = r12
            goto L_0x00a8
        L_0x0075:
            r1 = r6[r10]
            int r2 = YH.C16870n.n0(r6)
            if (r2 != 0) goto L_0x007e
            goto L_0x00a8
        L_0x007e:
            if (r1 == 0) goto L_0x0085
            int r3 = r1.E0()
            goto L_0x0086
        L_0x0085:
            r3 = r10
        L_0x0086:
            tI.j r9 = new tI.j
            r9.<init>(r4, r2)
            YH.U r2 = r9.iterator()
        L_0x008f:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x00a8
            int r9 = r2.c()
            r9 = r6[r9]
            if (r9 == 0) goto L_0x00a2
            int r11 = r9.E0()
            goto L_0x00a3
        L_0x00a2:
            r11 = r10
        L_0x00a3:
            if (r3 >= r11) goto L_0x008f
            r1 = r9
            r3 = r11
            goto L_0x008f
        L_0x00a8:
            if (r1 == 0) goto L_0x00af
            int r1 = r1.E0()
            goto L_0x006f
        L_0x00af:
            r14 = r10
        L_0x00b0:
            boolean r1 = r21.A0()
            if (r1 == 0) goto L_0x00bc
            int r10 = c2.r.g(r7)
        L_0x00ba:
            r15 = r10
            goto L_0x00f9
        L_0x00bc:
            if (r5 != 0) goto L_0x00bf
            goto L_0x00f2
        L_0x00bf:
            r12 = r6[r10]
            int r1 = YH.C16870n.n0(r6)
            if (r1 != 0) goto L_0x00c8
            goto L_0x00f2
        L_0x00c8:
            if (r12 == 0) goto L_0x00cf
            int r2 = r12.z0()
            goto L_0x00d0
        L_0x00cf:
            r2 = r10
        L_0x00d0:
            tI.j r3 = new tI.j
            r3.<init>(r4, r1)
            YH.U r1 = r3.iterator()
        L_0x00d9:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00f2
            int r3 = r1.c()
            r3 = r6[r3]
            if (r3 == 0) goto L_0x00ec
            int r4 = r3.z0()
            goto L_0x00ed
        L_0x00ec:
            r4 = r10
        L_0x00ed:
            if (r2 >= r4) goto L_0x00d9
            r12 = r3
            r2 = r4
            goto L_0x00d9
        L_0x00f2:
            if (r12 == 0) goto L_0x00ba
            int r10 = r12.z0()
            goto L_0x00ba
        L_0x00f9:
            boolean r1 = r21.A0()
            if (r1 != 0) goto L_0x0108
            androidx.compose.animation.e<?> r1 = r0.f17326a
            long r2 = c2.s.a(r14, r15)
            r1.y(r2)
        L_0x0108:
            androidx.compose.animation.b$a r1 = new androidx.compose.animation.b$a
            r1.<init>(r6, r0, r14, r15)
            r18 = 4
            r19 = 0
            r16 = 0
            r13 = r21
            r17 = r1
            E1.J r1 = E1.K.v0(r13, r14, r15, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.b.i(E1.K, java.util.List, long):E1.J");
    }

    public int j(r rVar, List<? extends C4484q> list, int i10) {
        Integer num;
        if (list.isEmpty()) {
            num = null;
        } else {
            num = Integer.valueOf(((C4484q) list.get(0)).V(i10));
            int p10 = C16877v.p(list);
            int i11 = 1;
            if (1 <= p10) {
                while (true) {
                    Integer valueOf = Integer.valueOf(((C4484q) list.get(i11)).V(i10));
                    if (valueOf.compareTo(num) > 0) {
                        num = valueOf;
                    }
                    if (i11 == p10) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
