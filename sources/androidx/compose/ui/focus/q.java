package androidx.compose.ui.focus;

import G1.C4508k;
import G1.i0;
import XH.C16807N;
import XH.t;
import androidx.compose.ui.focus.m;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import n1.C5621a;
import n1.C5624d;
import n1.C5636p;
import n1.C5639s;
import n1.C5640t;
import nI.C17631a;
import o1.C5669i;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a \u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a%\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u0003\u001a'\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\f\u001a\u001b\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0003\u001a\u0013\u0010\u0013\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001e\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0018\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u001e\u0010\u0019\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u001e\u0010\u001a\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0017\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "", "j", "(Landroidx/compose/ui/focus/FocusTargetNode;)Z", "Landroidx/compose/ui/focus/d;", "focusDirection", "k", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Ljava/lang/Boolean;", "i", "forced", "refreshFocusEvents", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z", "d", "a", "childNode", "l", "(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusTargetNode;)Z", "m", "n", "(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;", "Ln1/a;", "h", "(Landroidx/compose/ui/focus/FocusTargetNode;I)Ln1/a;", "e", "f", "g", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18869a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f18870b;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004c */
        static {
            /*
                n1.a[] r0 = n1.C5621a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                n1.a r2 = n1.C5621a.None     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                n1.a r3 = n1.C5621a.Redirected     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                n1.a r4 = n1.C5621a.Cancelled     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                n1.a r5 = n1.C5621a.RedirectCancelled     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f18869a = r0
                n1.p[] r0 = n1.C5636p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                n1.p r5 = n1.C5636p.Active     // Catch:{ NoSuchFieldError -> 0x003c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                n1.p r1 = n1.C5636p.Captured     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                n1.p r1 = n1.C5636p.ActiveParent     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                n1.p r1 = n1.C5636p.Inactive     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                f18870b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.q.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f18871c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(FocusTargetNode focusTargetNode) {
            super(0);
            this.f18871c = focusTargetNode;
        }

        public final void invoke() {
            this.f18871c.H2();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f18872c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(FocusTargetNode focusTargetNode) {
            super(0);
            this.f18872c = focusTargetNode;
        }

        public final void invoke() {
            if (this.f18872c.E0().j2()) {
                C5624d.c(this.f18872c);
            }
        }
    }

    private static final boolean a(FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        FocusTargetNode f10 = r.f(focusTargetNode);
        if (f10 != null) {
            return c(f10, z10, z11);
        }
        return true;
    }

    static /* synthetic */ boolean b(FocusTargetNode focusTargetNode, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return a(focusTargetNode, z10, z11);
    }

    public static final boolean c(FocusTargetNode focusTargetNode, boolean z10, boolean z11) {
        int i10 = a.f18870b[focusTargetNode.J2().ordinal()];
        if (i10 == 1) {
            focusTargetNode.P2(C5636p.Inactive);
            if (z11) {
                C5624d.c(focusTargetNode);
            }
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new t();
                }
            } else if (!a(focusTargetNode, z10, z11)) {
                return false;
            } else {
                focusTargetNode.P2(C5636p.Inactive);
                if (z11) {
                    C5624d.c(focusTargetNode);
                }
            }
        } else if (!z10) {
            return z10;
        } else {
            focusTargetNode.P2(C5636p.Inactive);
            if (!z11) {
                return z10;
            }
            C5624d.c(focusTargetNode);
            return z10;
        }
        return true;
    }

    private static final boolean d(FocusTargetNode focusTargetNode) {
        i0.a(focusTargetNode, new b(focusTargetNode));
        int i10 = a.f18870b[focusTargetNode.J2().ordinal()];
        if (i10 != 3 && i10 != 4) {
            return true;
        }
        focusTargetNode.P2(C5636p.Active);
        return true;
    }

    public static final C5621a e(FocusTargetNode focusTargetNode, int i10) {
        int i11 = a.f18870b[focusTargetNode.J2().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return C5621a.Cancelled;
            }
            if (i11 == 3) {
                C5621a e10 = e(n(focusTargetNode), i10);
                if (e10 == C5621a.None) {
                    e10 = null;
                }
                return e10 == null ? g(focusTargetNode, i10) : e10;
            } else if (i11 != 4) {
                throw new t();
            }
        }
        return C5621a.None;
    }

    private static final C5621a f(FocusTargetNode focusTargetNode, int i10) {
        if (!focusTargetNode.f18823o) {
            focusTargetNode.f18823o = true;
            try {
                m invoke = focusTargetNode.H2().x().invoke(d.i(i10));
                m.a aVar = m.f18861b;
                if (invoke == aVar.c()) {
                    focusTargetNode.f18823o = false;
                } else if (invoke == aVar.b()) {
                    return C5621a.Cancelled;
                } else {
                    C5621a aVar2 = invoke.d() ? C5621a.Redirected : C5621a.RedirectCancelled;
                    focusTargetNode.f18823o = false;
                    return aVar2;
                }
            } finally {
                focusTargetNode.f18823o = false;
            }
        }
        return C5621a.None;
    }

    private static final C5621a g(FocusTargetNode focusTargetNode, int i10) {
        if (!focusTargetNode.f18822n) {
            focusTargetNode.f18822n = true;
            try {
                m invoke = focusTargetNode.H2().t().invoke(d.i(i10));
                m.a aVar = m.f18861b;
                if (invoke == aVar.c()) {
                    focusTargetNode.f18822n = false;
                } else if (invoke == aVar.b()) {
                    return C5621a.Cancelled;
                } else {
                    C5621a aVar2 = invoke.d() ? C5621a.Redirected : C5621a.RedirectCancelled;
                    focusTargetNode.f18822n = false;
                    return aVar2;
                }
            } finally {
                focusTargetNode.f18822n = false;
            }
        }
        return C5621a.None;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a8, code lost:
        r5 = r13.m0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final n1.C5621a h(androidx.compose.ui.focus.FocusTargetNode r13, int r14) {
        /*
            n1.p r0 = r13.J2()
            int[] r1 = androidx.compose.ui.focus.q.a.f18870b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L_0x010d
            r2 = 2
            if (r0 == r2) goto L_0x010d
            r3 = 3
            if (r0 == r3) goto L_0x0104
            r4 = 4
            if (r0 != r4) goto L_0x00fe
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = G1.C4502e0.a(r0)
            androidx.compose.ui.d$c r5 = r13.E0()
            boolean r5 = r5.j2()
            if (r5 == 0) goto L_0x00f6
            androidx.compose.ui.d$c r5 = r13.E0()
            androidx.compose.ui.d$c r5 = r5.g2()
            G1.G r13 = G1.C4508k.m(r13)
        L_0x0034:
            r6 = 0
            if (r13 == 0) goto L_0x00b6
            G1.a0 r7 = r13.m0()
            androidx.compose.ui.d$c r7 = r7.k()
            int r7 = r7.Z1()
            r7 = r7 & r0
            if (r7 == 0) goto L_0x00a2
        L_0x0046:
            if (r5 == 0) goto L_0x00a2
            int r7 = r5.e2()
            r7 = r7 & r0
            if (r7 == 0) goto L_0x009d
            r7 = r5
            r8 = r6
        L_0x0051:
            if (r7 == 0) goto L_0x009d
            boolean r9 = r7 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r9 == 0) goto L_0x0059
            goto L_0x00b7
        L_0x0059:
            int r9 = r7.e2()
            r9 = r9 & r0
            if (r9 == 0) goto L_0x0098
            boolean r9 = r7 instanceof G1.C4510m
            if (r9 == 0) goto L_0x0098
            r9 = r7
            G1.m r9 = (G1.C4510m) r9
            androidx.compose.ui.d$c r9 = r9.D2()
            r10 = 0
            r11 = r10
        L_0x006d:
            if (r9 == 0) goto L_0x0095
            int r12 = r9.e2()
            r12 = r12 & r0
            if (r12 == 0) goto L_0x0090
            int r11 = r11 + 1
            if (r11 != r1) goto L_0x007c
            r7 = r9
            goto L_0x0090
        L_0x007c:
            if (r8 != 0) goto L_0x0087
            W0.b r8 = new W0.b
            r12 = 16
            androidx.compose.ui.d$c[] r12 = new androidx.compose.ui.d.c[r12]
            r8.<init>(r12, r10)
        L_0x0087:
            if (r7 == 0) goto L_0x008d
            r8.b(r7)
            r7 = r6
        L_0x008d:
            r8.b(r9)
        L_0x0090:
            androidx.compose.ui.d$c r9 = r9.a2()
            goto L_0x006d
        L_0x0095:
            if (r11 != r1) goto L_0x0098
            goto L_0x0051
        L_0x0098:
            androidx.compose.ui.d$c r7 = G1.C4508k.g(r8)
            goto L_0x0051
        L_0x009d:
            androidx.compose.ui.d$c r5 = r5.g2()
            goto L_0x0046
        L_0x00a2:
            G1.G r13 = r13.q0()
            if (r13 == 0) goto L_0x00b3
            G1.a0 r5 = r13.m0()
            if (r5 == 0) goto L_0x00b3
            androidx.compose.ui.d$c r5 = r5.p()
            goto L_0x0034
        L_0x00b3:
            r5 = r6
            goto L_0x0034
        L_0x00b6:
            r7 = r6
        L_0x00b7:
            androidx.compose.ui.focus.FocusTargetNode r7 = (androidx.compose.ui.focus.FocusTargetNode) r7
            if (r7 != 0) goto L_0x00be
            n1.a r13 = n1.C5621a.None
            return r13
        L_0x00be:
            n1.p r13 = r7.J2()
            int[] r0 = androidx.compose.ui.focus.q.a.f18870b
            int r13 = r13.ordinal()
            r13 = r0[r13]
            if (r13 == r1) goto L_0x00f1
            if (r13 == r2) goto L_0x00ee
            if (r13 == r3) goto L_0x00e9
            if (r13 != r4) goto L_0x00e3
            n1.a r13 = h(r7, r14)
            n1.a r0 = n1.C5621a.None
            if (r13 != r0) goto L_0x00db
            goto L_0x00dc
        L_0x00db:
            r6 = r13
        L_0x00dc:
            if (r6 != 0) goto L_0x00f5
            n1.a r6 = f(r7, r14)
            goto L_0x00f5
        L_0x00e3:
            XH.t r13 = new XH.t
            r13.<init>()
            throw r13
        L_0x00e9:
            n1.a r6 = h(r7, r14)
            goto L_0x00f5
        L_0x00ee:
            n1.a r6 = n1.C5621a.Cancelled
            goto L_0x00f5
        L_0x00f1:
            n1.a r6 = f(r7, r14)
        L_0x00f5:
            return r6
        L_0x00f6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "visitAncestors called on an unattached node"
            r13.<init>(r14)
            throw r13
        L_0x00fe:
            XH.t r13 = new XH.t
            r13.<init>()
            throw r13
        L_0x0104:
            androidx.compose.ui.focus.FocusTargetNode r13 = n(r13)
            n1.a r13 = e(r13, r14)
            return r13
        L_0x010d:
            n1.a r13 = n1.C5621a.None
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.q.h(androidx.compose.ui.focus.FocusTargetNode, int):n1.a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a8, code lost:
        r2 = r5.m0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d7, code lost:
        if (d(r11) != false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f4, code lost:
        if (d(r11) != false) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean i(androidx.compose.ui.focus.FocusTargetNode r11) {
        /*
            n1.p r0 = r11.J2()
            int[] r1 = androidx.compose.ui.focus.q.a.f18870b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L_0x00f6
            r2 = 2
            if (r0 == r2) goto L_0x00f6
            r2 = 3
            r3 = 0
            r4 = 0
            if (r0 == r2) goto L_0x00ea
            r2 = 4
            if (r0 != r2) goto L_0x00e4
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = G1.C4502e0.a(r0)
            androidx.compose.ui.d$c r2 = r11.E0()
            boolean r2 = r2.j2()
            if (r2 == 0) goto L_0x00dc
            androidx.compose.ui.d$c r2 = r11.E0()
            androidx.compose.ui.d$c r2 = r2.g2()
            G1.G r5 = G1.C4508k.m(r11)
        L_0x0036:
            if (r5 == 0) goto L_0x00b5
            G1.a0 r6 = r5.m0()
            androidx.compose.ui.d$c r6 = r6.k()
            int r6 = r6.Z1()
            r6 = r6 & r0
            if (r6 == 0) goto L_0x00a2
        L_0x0047:
            if (r2 == 0) goto L_0x00a2
            int r6 = r2.e2()
            r6 = r6 & r0
            if (r6 == 0) goto L_0x009d
            r6 = r2
            r7 = r3
        L_0x0052:
            if (r6 == 0) goto L_0x009d
            boolean r8 = r6 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r8 == 0) goto L_0x005a
            r3 = r6
            goto L_0x00b5
        L_0x005a:
            int r8 = r6.e2()
            r8 = r8 & r0
            if (r8 == 0) goto L_0x0098
            boolean r8 = r6 instanceof G1.C4510m
            if (r8 == 0) goto L_0x0098
            r8 = r6
            G1.m r8 = (G1.C4510m) r8
            androidx.compose.ui.d$c r8 = r8.D2()
            r9 = r4
        L_0x006d:
            if (r8 == 0) goto L_0x0095
            int r10 = r8.e2()
            r10 = r10 & r0
            if (r10 == 0) goto L_0x0090
            int r9 = r9 + 1
            if (r9 != r1) goto L_0x007c
            r6 = r8
            goto L_0x0090
        L_0x007c:
            if (r7 != 0) goto L_0x0087
            W0.b r7 = new W0.b
            r10 = 16
            androidx.compose.ui.d$c[] r10 = new androidx.compose.ui.d.c[r10]
            r7.<init>(r10, r4)
        L_0x0087:
            if (r6 == 0) goto L_0x008d
            r7.b(r6)
            r6 = r3
        L_0x008d:
            r7.b(r8)
        L_0x0090:
            androidx.compose.ui.d$c r8 = r8.a2()
            goto L_0x006d
        L_0x0095:
            if (r9 != r1) goto L_0x0098
            goto L_0x0052
        L_0x0098:
            androidx.compose.ui.d$c r6 = G1.C4508k.g(r7)
            goto L_0x0052
        L_0x009d:
            androidx.compose.ui.d$c r2 = r2.g2()
            goto L_0x0047
        L_0x00a2:
            G1.G r5 = r5.q0()
            if (r5 == 0) goto L_0x00b3
            G1.a0 r2 = r5.m0()
            if (r2 == 0) goto L_0x00b3
            androidx.compose.ui.d$c r2 = r2.p()
            goto L_0x0036
        L_0x00b3:
            r2 = r3
            goto L_0x0036
        L_0x00b5:
            androidx.compose.ui.focus.FocusTargetNode r3 = (androidx.compose.ui.focus.FocusTargetNode) r3
            if (r3 == 0) goto L_0x00cd
            n1.p r0 = r3.J2()
            boolean r1 = l(r3, r11)
            if (r1 == 0) goto L_0x00f6
            n1.p r2 = r3.J2()
            if (r0 == r2) goto L_0x00f6
            n1.C5624d.c(r3)
            goto L_0x00f6
        L_0x00cd:
            boolean r0 = m(r11)
            if (r0 == 0) goto L_0x00da
            boolean r0 = d(r11)
            if (r0 == 0) goto L_0x00da
            goto L_0x00f6
        L_0x00da:
            r1 = r4
            goto L_0x00f6
        L_0x00dc:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitAncestors called on an unattached node"
            r11.<init>(r0)
            throw r11
        L_0x00e4:
            XH.t r11 = new XH.t
            r11.<init>()
            throw r11
        L_0x00ea:
            boolean r0 = b(r11, r4, r4, r2, r3)
            if (r0 == 0) goto L_0x00da
            boolean r0 = d(r11)
            if (r0 == 0) goto L_0x00da
        L_0x00f6:
            if (r1 == 0) goto L_0x00fb
            n1.C5624d.c(r11)
        L_0x00fb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.q.i(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    public static final boolean j(FocusTargetNode focusTargetNode) {
        Boolean k10 = k(focusTargetNode, d.f18832b.b());
        if (k10 != null) {
            return k10.booleanValue();
        }
        return false;
    }

    public static final Boolean k(FocusTargetNode focusTargetNode, int i10) {
        Boolean bool;
        C5640t d10 = C5639s.d(focusTargetNode);
        c cVar = new c(focusTargetNode);
        try {
            if (d10.f26514c) {
                d10.g();
            }
            d10.f();
            d10.f26513b.b(cVar);
            int i11 = a.f18869a[h(focusTargetNode, i10).ordinal()];
            if (i11 == 1) {
                bool = Boolean.valueOf(i(focusTargetNode));
            } else if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        throw new t();
                    }
                }
                bool = null;
            } else {
                bool = Boolean.TRUE;
            }
            return bool;
        } finally {
            d10.h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0092, code lost:
        r2 = r4.m0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean l(androidx.compose.ui.focus.FocusTargetNode r14, androidx.compose.ui.focus.FocusTargetNode r15) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            int r1 = G1.C4502e0.a(r0)
            androidx.compose.ui.d$c r2 = r15.E0()
            boolean r2 = r2.j2()
            java.lang.String r3 = "visitAncestors called on an unattached node"
            if (r2 == 0) goto L_0x01bf
            androidx.compose.ui.d$c r2 = r15.E0()
            androidx.compose.ui.d$c r2 = r2.g2()
            G1.G r4 = G1.C4508k.m(r15)
        L_0x001e:
            r5 = 16
            r6 = 1
            r7 = 0
            r8 = 0
            if (r4 == 0) goto L_0x00a0
            G1.a0 r9 = r4.m0()
            androidx.compose.ui.d$c r9 = r9.k()
            int r9 = r9.Z1()
            r9 = r9 & r1
            if (r9 == 0) goto L_0x008c
        L_0x0034:
            if (r2 == 0) goto L_0x008c
            int r9 = r2.e2()
            r9 = r9 & r1
            if (r9 == 0) goto L_0x0087
            r9 = r2
            r10 = r8
        L_0x003f:
            if (r9 == 0) goto L_0x0087
            boolean r11 = r9 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r11 == 0) goto L_0x0046
            goto L_0x00a1
        L_0x0046:
            int r11 = r9.e2()
            r11 = r11 & r1
            if (r11 == 0) goto L_0x0082
            boolean r11 = r9 instanceof G1.C4510m
            if (r11 == 0) goto L_0x0082
            r11 = r9
            G1.m r11 = (G1.C4510m) r11
            androidx.compose.ui.d$c r11 = r11.D2()
            r12 = r7
        L_0x0059:
            if (r11 == 0) goto L_0x007f
            int r13 = r11.e2()
            r13 = r13 & r1
            if (r13 == 0) goto L_0x007a
            int r12 = r12 + 1
            if (r12 != r6) goto L_0x0068
            r9 = r11
            goto L_0x007a
        L_0x0068:
            if (r10 != 0) goto L_0x0071
            W0.b r10 = new W0.b
            androidx.compose.ui.d$c[] r13 = new androidx.compose.ui.d.c[r5]
            r10.<init>(r13, r7)
        L_0x0071:
            if (r9 == 0) goto L_0x0077
            r10.b(r9)
            r9 = r8
        L_0x0077:
            r10.b(r11)
        L_0x007a:
            androidx.compose.ui.d$c r11 = r11.a2()
            goto L_0x0059
        L_0x007f:
            if (r12 != r6) goto L_0x0082
            goto L_0x003f
        L_0x0082:
            androidx.compose.ui.d$c r9 = G1.C4508k.g(r10)
            goto L_0x003f
        L_0x0087:
            androidx.compose.ui.d$c r2 = r2.g2()
            goto L_0x0034
        L_0x008c:
            G1.G r4 = r4.q0()
            if (r4 == 0) goto L_0x009d
            G1.a0 r2 = r4.m0()
            if (r2 == 0) goto L_0x009d
            androidx.compose.ui.d$c r2 = r2.p()
            goto L_0x001e
        L_0x009d:
            r2 = r8
            goto L_0x001e
        L_0x00a0:
            r9 = r8
        L_0x00a1:
            boolean r1 = kotlin.jvm.internal.C17542s.e(r9, r14)
            if (r1 == 0) goto L_0x01b7
            n1.p r1 = r14.J2()
            int[] r2 = androidx.compose.ui.focus.q.a.f18870b
            int r1 = r1.ordinal()
            r1 = r2[r1]
            if (r1 == r6) goto L_0x01ab
            r2 = 2
            if (r1 == r2) goto L_0x018d
            r2 = 3
            if (r1 == r2) goto L_0x019b
            r2 = 4
            if (r1 != r2) goto L_0x0195
            int r0 = G1.C4502e0.a(r0)
            androidx.compose.ui.d$c r1 = r14.E0()
            boolean r1 = r1.j2()
            if (r1 == 0) goto L_0x018f
            androidx.compose.ui.d$c r1 = r14.E0()
            androidx.compose.ui.d$c r1 = r1.g2()
            G1.G r2 = G1.C4508k.m(r14)
        L_0x00d8:
            if (r2 == 0) goto L_0x0155
            G1.a0 r3 = r2.m0()
            androidx.compose.ui.d$c r3 = r3.k()
            int r3 = r3.Z1()
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0142
        L_0x00e9:
            if (r1 == 0) goto L_0x0142
            int r3 = r1.e2()
            r3 = r3 & r0
            if (r3 == 0) goto L_0x013d
            r3 = r1
            r4 = r8
        L_0x00f4:
            if (r3 == 0) goto L_0x013d
            boolean r9 = r3 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r9 == 0) goto L_0x00fc
            r8 = r3
            goto L_0x0155
        L_0x00fc:
            int r9 = r3.e2()
            r9 = r9 & r0
            if (r9 == 0) goto L_0x0138
            boolean r9 = r3 instanceof G1.C4510m
            if (r9 == 0) goto L_0x0138
            r9 = r3
            G1.m r9 = (G1.C4510m) r9
            androidx.compose.ui.d$c r9 = r9.D2()
            r10 = r7
        L_0x010f:
            if (r9 == 0) goto L_0x0135
            int r11 = r9.e2()
            r11 = r11 & r0
            if (r11 == 0) goto L_0x0130
            int r10 = r10 + 1
            if (r10 != r6) goto L_0x011e
            r3 = r9
            goto L_0x0130
        L_0x011e:
            if (r4 != 0) goto L_0x0127
            W0.b r4 = new W0.b
            androidx.compose.ui.d$c[] r11 = new androidx.compose.ui.d.c[r5]
            r4.<init>(r11, r7)
        L_0x0127:
            if (r3 == 0) goto L_0x012d
            r4.b(r3)
            r3 = r8
        L_0x012d:
            r4.b(r9)
        L_0x0130:
            androidx.compose.ui.d$c r9 = r9.a2()
            goto L_0x010f
        L_0x0135:
            if (r10 != r6) goto L_0x0138
            goto L_0x00f4
        L_0x0138:
            androidx.compose.ui.d$c r3 = G1.C4508k.g(r4)
            goto L_0x00f4
        L_0x013d:
            androidx.compose.ui.d$c r1 = r1.g2()
            goto L_0x00e9
        L_0x0142:
            G1.G r2 = r2.q0()
            if (r2 == 0) goto L_0x0153
            G1.a0 r1 = r2.m0()
            if (r1 == 0) goto L_0x0153
            androidx.compose.ui.d$c r1 = r1.p()
            goto L_0x00d8
        L_0x0153:
            r1 = r8
            goto L_0x00d8
        L_0x0155:
            androidx.compose.ui.focus.FocusTargetNode r8 = (androidx.compose.ui.focus.FocusTargetNode) r8
            if (r8 != 0) goto L_0x016b
            boolean r0 = m(r14)
            if (r0 == 0) goto L_0x016b
            boolean r6 = d(r15)
            if (r6 == 0) goto L_0x01b6
            n1.p r15 = n1.C5636p.ActiveParent
            r14.P2(r15)
            goto L_0x01b6
        L_0x016b:
            if (r8 == 0) goto L_0x018d
            boolean r0 = l(r8, r14)
            if (r0 == 0) goto L_0x018d
            boolean r6 = l(r14, r15)
            n1.p r14 = r14.J2()
            n1.p r15 = n1.C5636p.ActiveParent
            if (r14 != r15) goto L_0x0185
            if (r6 == 0) goto L_0x01b6
            n1.C5624d.c(r8)
            goto L_0x01b6
        L_0x0185:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Deactivated node is focused"
            r14.<init>(r15)
            throw r14
        L_0x018d:
            r6 = r7
            goto L_0x01b6
        L_0x018f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>(r3)
            throw r14
        L_0x0195:
            XH.t r14 = new XH.t
            r14.<init>()
            throw r14
        L_0x019b:
            n(r14)
            boolean r14 = b(r14, r7, r7, r2, r8)
            if (r14 == 0) goto L_0x018d
            boolean r14 = d(r15)
            if (r14 == 0) goto L_0x018d
            goto L_0x01b6
        L_0x01ab:
            boolean r6 = d(r15)
            if (r6 == 0) goto L_0x01b6
            n1.p r15 = n1.C5636p.ActiveParent
            r14.P2(r15)
        L_0x01b6:
            return r6
        L_0x01b7:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Non child node cannot request focus."
            r14.<init>(r15)
            throw r14
        L_0x01bf:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>(r3)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.q.l(androidx.compose.ui.focus.FocusTargetNode, androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    private static final boolean m(FocusTargetNode focusTargetNode) {
        return C4508k.n(focusTargetNode).getFocusOwner().f((d) null, (C5669i) null);
    }

    private static final FocusTargetNode n(FocusTargetNode focusTargetNode) {
        FocusTargetNode f10 = r.f(focusTargetNode);
        if (f10 != null) {
            return f10;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }
}
