package l0;

import E1.C4484q;
import E1.I;
import E1.a0;
import E1.r;
import XH.C16807N;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J)\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Ll0/c;", "LE1/I;", "Ll0/f;", "scope", "<init>", "(Ll0/f;)V", "LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;", "LE1/r;", "LE1/q;", "", "height", "a", "(LE1/r;Ljava/util/List;I)I", "width", "j", "d", "h", "Ll0/f;", "getScope", "()Ll0/f;", "", "b", "Z", "getHasLookaheadOccurred", "()Z", "setHasLookaheadOccurred", "(Z)V", "hasLookaheadOccurred", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c implements I {

    /* renamed from: a  reason: collision with root package name */
    private final f f25313a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f25314b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<a0> f25315c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List<? extends a0> list) {
            super(1);
            this.f25315c = list;
        }

        public final void a(a0.a aVar) {
            List<a0> list = this.f25315c;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                a0.a.i(aVar, list.get(i10), 0, 0, 0.0f, 4, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public c(f fVar) {
        this.f25313a = fVar;
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: E1.a0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E1.J i(E1.K r11, java.util.List<? extends E1.H> r12, long r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.size()
            r0.<init>(r1)
            int r1 = r12.size()
            r2 = 0
            r3 = r2
        L_0x000f:
            if (r3 >= r1) goto L_0x0021
            java.lang.Object r4 = r12.get(r3)
            E1.H r4 = (E1.H) r4
            E1.a0 r4 = r4.i0(r13)
            r0.add(r4)
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0021:
            boolean r12 = r0.isEmpty()
            r13 = 0
            r14 = 1
            if (r12 == 0) goto L_0x002b
            r12 = r13
            goto L_0x0051
        L_0x002b:
            java.lang.Object r12 = r0.get(r2)
            r1 = r12
            E1.a0 r1 = (E1.a0) r1
            int r1 = r1.E0()
            int r3 = YH.C16877v.p(r0)
            if (r14 > r3) goto L_0x0051
            r4 = r14
        L_0x003d:
            java.lang.Object r5 = r0.get(r4)
            r6 = r5
            E1.a0 r6 = (E1.a0) r6
            int r6 = r6.E0()
            if (r1 >= r6) goto L_0x004c
            r12 = r5
            r1 = r6
        L_0x004c:
            if (r4 == r3) goto L_0x0051
            int r4 = r4 + 1
            goto L_0x003d
        L_0x0051:
            E1.a0 r12 = (E1.a0) r12
            if (r12 == 0) goto L_0x005b
            int r12 = r12.E0()
            r4 = r12
            goto L_0x005c
        L_0x005b:
            r4 = r2
        L_0x005c:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L_0x0063
            goto L_0x008a
        L_0x0063:
            java.lang.Object r12 = r0.get(r2)
            r13 = r12
            E1.a0 r13 = (E1.a0) r13
            int r13 = r13.z0()
            int r1 = YH.C16877v.p(r0)
            if (r14 > r1) goto L_0x0089
            r3 = r14
        L_0x0075:
            java.lang.Object r5 = r0.get(r3)
            r6 = r5
            E1.a0 r6 = (E1.a0) r6
            int r6 = r6.z0()
            if (r13 >= r6) goto L_0x0084
            r12 = r5
            r13 = r6
        L_0x0084:
            if (r3 == r1) goto L_0x0089
            int r3 = r3 + 1
            goto L_0x0075
        L_0x0089:
            r13 = r12
        L_0x008a:
            E1.a0 r13 = (E1.a0) r13
            if (r13 == 0) goto L_0x0092
            int r2 = r13.z0()
        L_0x0092:
            r5 = r2
            boolean r12 = r11.A0()
            if (r12 == 0) goto L_0x00ad
            r10.f25314b = r14
            l0.f r12 = r10.f25313a
            U0.r0 r12 = r12.a()
            long r13 = c2.s.a(r4, r5)
            c2.r r13 = c2.r.b(r13)
            r12.setValue(r13)
            goto L_0x00c2
        L_0x00ad:
            boolean r12 = r10.f25314b
            if (r12 != 0) goto L_0x00c2
            l0.f r12 = r10.f25313a
            U0.r0 r12 = r12.a()
            long r13 = c2.s.a(r4, r5)
            c2.r r13 = c2.r.b(r13)
            r12.setValue(r13)
        L_0x00c2:
            l0.c$a r7 = new l0.c$a
            r7.<init>(r0)
            r8 = 4
            r9 = 0
            r6 = 0
            r3 = r11
            E1.J r11 = E1.K.v0(r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.c.i(E1.K, java.util.List, long):E1.J");
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
