package A1;

import E1.C4488v;
import j0.H;
import j0.L;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u001a\u0010$\u001a\u00020 8\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010&\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"LA1/g;", "", "LE1/v;", "rootCoordinates", "<init>", "(LE1/v;)V", "", "pointerId", "Lj0/L;", "LA1/m;", "hitNodes", "LXH/N;", "f", "(JLj0/L;)V", "LA1/A;", "", "Landroidx/compose/ui/d$c;", "pointerInputNodes", "", "prunePointerIdsAndChangesNotInNodesList", "a", "(JLjava/util/List;Z)V", "LA1/h;", "internalPointerEvent", "isInBounds", "c", "(LA1/h;Z)Z", "b", "()V", "d", "e", "LE1/v;", "LA1/n;", "LA1/n;", "getRoot$ui_release", "()LA1/n;", "root", "Lj0/H;", "Lj0/H;", "hitPointerIdsAndNodes", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A1.g  reason: case insensitive filesystem */
public final class C4340g {

    /* renamed from: a  reason: collision with root package name */
    private final C4488v f4403a;

    /* renamed from: b  reason: collision with root package name */
    private final C4347n f4404b = new C4347n();

    /* renamed from: c  reason: collision with root package name */
    private final H<L<C4346m>> f4405c = new H<>(10);

    public C4340g(C4488v vVar) {
        this.f4403a = vVar;
    }

    private final void f(long j10, L<C4346m> l10) {
        this.f4404b.i(j10, l10);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r18, java.util.List<? extends androidx.compose.ui.d.c> r20, boolean r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            A1.n r3 = r0.f4404b
            j0.H<j0.L<A1.m>> r4 = r0.f4405c
            r4.h()
            int r4 = r20.size()
            r6 = 0
            r7 = r6
            r8 = 1
        L_0x0012:
            if (r7 >= r4) goto L_0x009c
            r9 = r20
            java.lang.Object r10 = r9.get(r7)
            androidx.compose.ui.d$c r10 = (androidx.compose.ui.d.c) r10
            r11 = 0
            if (r8 == 0) goto L_0x006c
            W0.b r12 = r3.g()
            int r13 = r12.r()
            if (r13 <= 0) goto L_0x0043
            java.lang.Object[] r12 = r12.q()
            r14 = r6
        L_0x002e:
            r15 = r12[r14]
            r16 = r15
            A1.m r16 = (A1.C4346m) r16
            androidx.compose.ui.d$c r5 = r16.k()
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r10)
            if (r5 == 0) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            int r14 = r14 + 1
            if (r14 < r13) goto L_0x002e
        L_0x0043:
            r15 = r11
        L_0x0044:
            A1.m r15 = (A1.C4346m) r15
            if (r15 == 0) goto L_0x006b
            r15.n()
            B1.b r3 = r15.l()
            r3.b(r1)
            j0.H<j0.L<A1.m>> r3 = r0.f4405c
            java.lang.Object r5 = r3.c(r1)
            if (r5 != 0) goto L_0x0063
            j0.L r5 = new j0.L
            r10 = 1
            r5.<init>(r6, r10, r11)
            r3.s(r1, r5)
        L_0x0063:
            j0.L r5 = (j0.L) r5
            r5.g(r15)
            r3 = r15
            r13 = 1
            goto L_0x0098
        L_0x006b:
            r8 = r6
        L_0x006c:
            A1.m r5 = new A1.m
            r5.<init>(r10)
            B1.b r10 = r5.l()
            r10.b(r1)
            j0.H<j0.L<A1.m>> r10 = r0.f4405c
            java.lang.Object r12 = r10.c(r1)
            if (r12 != 0) goto L_0x008a
            j0.L r12 = new j0.L
            r13 = 1
            r12.<init>(r6, r13, r11)
            r10.s(r1, r12)
            goto L_0x008b
        L_0x008a:
            r13 = 1
        L_0x008b:
            j0.L r12 = (j0.L) r12
            r12.g(r5)
            W0.b r3 = r3.g()
            r3.b(r5)
            r3 = r5
        L_0x0098:
            int r7 = r7 + 1
            goto L_0x0012
        L_0x009c:
            if (r21 == 0) goto L_0x00e8
            j0.H<j0.L<A1.m>> r1 = r0.f4405c
            long[] r2 = r1.f24652b
            java.lang.Object[] r3 = r1.f24653c
            long[] r1 = r1.f24651a
            int r4 = r1.length
            int r4 = r4 + -2
            if (r4 < 0) goto L_0x00e8
            r5 = r6
        L_0x00ac:
            r7 = r1[r5]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x00e3
            int r9 = r5 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r6
        L_0x00c6:
            if (r11 >= r9) goto L_0x00e1
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.32E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L_0x00dd
            int r12 = r5 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            j0.L r12 = (j0.L) r12
            r0.f(r13, r12)
        L_0x00dd:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L_0x00c6
        L_0x00e1:
            if (r9 != r10) goto L_0x00e8
        L_0x00e3:
            if (r5 == r4) goto L_0x00e8
            int r5 = r5 + 1
            goto L_0x00ac
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.C4340g.a(long, java.util.List, boolean):void");
    }

    public final void b() {
        this.f4404b.c();
    }

    public final boolean c(C4341h hVar, boolean z10) {
        if (!this.f4404b.a(hVar.b(), this.f4403a, hVar, z10)) {
            return false;
        }
        return this.f4404b.e(hVar) || this.f4404b.f(hVar.b(), this.f4403a, hVar, z10);
    }

    public final void d() {
        this.f4404b.d();
        b();
    }

    public final void e() {
        this.f4404b.h();
    }
}
