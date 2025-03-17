package androidx.compose.ui.focus;

import E1.C4475h;
import E1.C4476i;
import F1.h;
import G1.C4502e0;
import G1.C4505h;
import G1.C4508k;
import G1.C4510m;
import G1.V;
import G1.h0;
import G1.i0;
import XH.C16807N;
import XH.C16820k;
import XH.t;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.O;
import n1.C5624d;
import n1.C5636p;
import n1.C5637q;
import n1.C5639s;
import n1.C5640t;
import nI.C17631a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001*B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0007R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u00118\u0016XD¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u001dR*\u0010%\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00178V@VX\u000e¢\u0006\u0012\u0012\u0004\b$\u0010\u0007\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0013\u0010)\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "LG1/h;", "Ln1/q;", "LG1/h0;", "LF1/h;", "Landroidx/compose/ui/d$c;", "<init>", "()V", "LXH/N;", "K2", "H0", "n2", "Landroidx/compose/ui/focus/i;", "H2", "()Landroidx/compose/ui/focus/i;", "G2", "O2", "", "n", "Z", "isProcessingCustomExit", "o", "isProcessingCustomEnter", "Ln1/p;", "p", "Ln1/p;", "committedFocusState", "q", "h2", "()Z", "shouldAutoInvalidate", "value", "J2", "()Ln1/p;", "P2", "(Ln1/p;)V", "getFocusState$annotations", "focusState", "LE1/h;", "I2", "()LE1/h;", "beyondBoundsLayoutParent", "FocusTargetElement", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FocusTargetNode extends d.c implements C4505h, C5637q, h0, h {
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f18822n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public boolean f18823o;

    /* renamed from: p  reason: collision with root package name */
    private C5636p f18824p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f18825q;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode$FocusTargetElement;", "LG1/V;", "Landroidx/compose/ui/focus/FocusTargetNode;", "<init>", "()V", "c", "()Landroidx/compose/ui/focus/FocusTargetNode;", "node", "LXH/N;", "f", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FocusTargetElement extends V<FocusTargetNode> {

        /* renamed from: d  reason: collision with root package name */
        public static final FocusTargetElement f18826d = new FocusTargetElement();

        private FocusTargetElement() {
        }

        /* renamed from: c */
        public FocusTargetNode a() {
            return new FocusTargetNode();
        }

        public boolean equals(Object obj) {
            return obj == this;
        }

        /* renamed from: f */
        public void b(FocusTargetNode focusTargetNode) {
        }

        public int hashCode() {
            return 1739042953;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18827a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                n1.p[] r0 = n1.C5636p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                n1.p r1 = n1.C5636p.Active     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                n1.p r1 = n1.C5636p.Captured     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                n1.p r1 = n1.C5636p.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                n1.p r1 = n1.C5636p.Inactive     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f18827a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O<i> f18828c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ FocusTargetNode f18829d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(O<i> o10, FocusTargetNode focusTargetNode) {
            super(0);
            this.f18828c = o10;
            this.f18829d = focusTargetNode;
        }

        public final void invoke() {
            this.f18828c.f144348a = this.f18829d.H2();
        }
    }

    private final void K2() {
        if (!N2(this)) {
            C5640t d10 = C5639s.d(this);
            try {
                if (d10.f26514c) {
                    d10.g();
                }
                d10.f();
                P2((!M2(this) || !L2(this)) ? C5636p.Inactive : C5636p.ActiveParent);
                C16807N n10 = C16807N.f139792a;
                d10.h();
            } catch (Throwable th2) {
                d10.h();
                throw th2;
            }
        } else {
            throw new IllegalStateException("Re-initializing focus target node.");
        }
    }

    private static final boolean L2(FocusTargetNode focusTargetNode) {
        int a10 = C4502e0.a(1024);
        if (!focusTargetNode.E0().j2()) {
            D1.a.b("visitSubtreeIf called on an unattached node");
        }
        W0.b bVar = new W0.b(new d.c[16], 0);
        d.c a22 = focusTargetNode.E0().a2();
        if (a22 == null) {
            C4508k.c(bVar, focusTargetNode.E0());
        } else {
            bVar.b(a22);
        }
        while (bVar.v()) {
            d.c cVar = (d.c) bVar.B(bVar.r() - 1);
            if ((cVar.Z1() & a10) != 0) {
                for (d.c cVar2 = cVar; cVar2 != null; cVar2 = cVar2.a2()) {
                    if ((cVar2.e2() & a10) != 0) {
                        d.c cVar3 = cVar2;
                        W0.b bVar2 = null;
                        while (cVar3 != null) {
                            if (cVar3 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) cVar3;
                                if (N2(focusTargetNode2)) {
                                    int i10 = a.f18827a[focusTargetNode2.J2().ordinal()];
                                    if (i10 == 1 || i10 == 2 || i10 == 3) {
                                        return true;
                                    }
                                    if (i10 == 4) {
                                        return false;
                                    }
                                    throw new t();
                                }
                            } else if ((cVar3.e2() & a10) != 0 && (cVar3 instanceof C4510m)) {
                                int i11 = 0;
                                for (d.c D22 = ((C4510m) cVar3).D2(); D22 != null; D22 = D22.a2()) {
                                    if ((D22.e2() & a10) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVar3 = D22;
                                        } else {
                                            if (bVar2 == null) {
                                                bVar2 = new W0.b(new d.c[16], 0);
                                            }
                                            if (cVar3 != null) {
                                                bVar2.b(cVar3);
                                                cVar3 = null;
                                            }
                                            bVar2.b(D22);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVar3 = C4508k.g(bVar2);
                        }
                        continue;
                    }
                }
                continue;
            }
            C4508k.c(bVar, cVar);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b8, code lost:
        r1 = r10.m0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean M2(androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = G1.C4502e0.a(r0)
            androidx.compose.ui.d$c r1 = r10.E0()
            boolean r1 = r1.j2()
            if (r1 == 0) goto L_0x00c8
            androidx.compose.ui.d$c r1 = r10.E0()
            androidx.compose.ui.d$c r1 = r1.g2()
            G1.G r10 = G1.C4508k.m(r10)
        L_0x001c:
            r2 = 0
            if (r10 == 0) goto L_0x00c7
            G1.a0 r3 = r10.m0()
            androidx.compose.ui.d$c r3 = r3.k()
            int r3 = r3.Z1()
            r3 = r3 & r0
            r4 = 0
            if (r3 == 0) goto L_0x00b2
        L_0x002f:
            if (r1 == 0) goto L_0x00b2
            int r3 = r1.e2()
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00ac
            r3 = r1
            r5 = r4
        L_0x003a:
            if (r3 == 0) goto L_0x00ac
            boolean r6 = r3 instanceof androidx.compose.ui.focus.FocusTargetNode
            r7 = 1
            if (r6 == 0) goto L_0x0069
            androidx.compose.ui.focus.FocusTargetNode r3 = (androidx.compose.ui.focus.FocusTargetNode) r3
            boolean r6 = N2(r3)
            if (r6 == 0) goto L_0x00a7
            n1.p r10 = r3.J2()
            int[] r0 = androidx.compose.ui.focus.FocusTargetNode.a.f18827a
            int r10 = r10.ordinal()
            r10 = r0[r10]
            if (r10 == r7) goto L_0x0068
            r0 = 2
            if (r10 == r0) goto L_0x0068
            r0 = 3
            if (r10 == r0) goto L_0x0067
            r0 = 4
            if (r10 != r0) goto L_0x0061
            goto L_0x0068
        L_0x0061:
            XH.t r10 = new XH.t
            r10.<init>()
            throw r10
        L_0x0067:
            r2 = r7
        L_0x0068:
            return r2
        L_0x0069:
            int r6 = r3.e2()
            r6 = r6 & r0
            if (r6 == 0) goto L_0x00a7
            boolean r6 = r3 instanceof G1.C4510m
            if (r6 == 0) goto L_0x00a7
            r6 = r3
            G1.m r6 = (G1.C4510m) r6
            androidx.compose.ui.d$c r6 = r6.D2()
            r8 = r2
        L_0x007c:
            if (r6 == 0) goto L_0x00a4
            int r9 = r6.e2()
            r9 = r9 & r0
            if (r9 == 0) goto L_0x009f
            int r8 = r8 + 1
            if (r8 != r7) goto L_0x008b
            r3 = r6
            goto L_0x009f
        L_0x008b:
            if (r5 != 0) goto L_0x0096
            W0.b r5 = new W0.b
            r9 = 16
            androidx.compose.ui.d$c[] r9 = new androidx.compose.ui.d.c[r9]
            r5.<init>(r9, r2)
        L_0x0096:
            if (r3 == 0) goto L_0x009c
            r5.b(r3)
            r3 = r4
        L_0x009c:
            r5.b(r6)
        L_0x009f:
            androidx.compose.ui.d$c r6 = r6.a2()
            goto L_0x007c
        L_0x00a4:
            if (r8 != r7) goto L_0x00a7
            goto L_0x003a
        L_0x00a7:
            androidx.compose.ui.d$c r3 = G1.C4508k.g(r5)
            goto L_0x003a
        L_0x00ac:
            androidx.compose.ui.d$c r1 = r1.g2()
            goto L_0x002f
        L_0x00b2:
            G1.G r10 = r10.q0()
            if (r10 == 0) goto L_0x00c4
            G1.a0 r1 = r10.m0()
            if (r1 == 0) goto L_0x00c4
            androidx.compose.ui.d$c r1 = r1.p()
            goto L_0x001c
        L_0x00c4:
            r1 = r4
            goto L_0x001c
        L_0x00c7:
            return r2
        L_0x00c8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "visitAncestors called on an unattached node"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.M2(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    private static final boolean N2(FocusTargetNode focusTargetNode) {
        return focusTargetNode.f18824p != null;
    }

    public final void G2() {
        C5636p i10 = C5639s.d(this).i(this);
        if (i10 != null) {
            this.f18824p = i10;
        } else {
            D1.a.c("committing a node that was not updated in the current transaction");
            throw new C16820k();
        }
    }

    public void H0() {
        C5636p J22 = J2();
        O2();
        if (J22 != J2()) {
            C5624d.c(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b4, code lost:
        r5 = r6.m0();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.focus.i H2() {
        /*
            r15 = this;
            androidx.compose.ui.focus.j r0 = new androidx.compose.ui.focus.j
            r0.<init>()
            r1 = 2048(0x800, float:2.87E-42)
            int r1 = G1.C4502e0.a(r1)
            r2 = 1024(0x400, float:1.435E-42)
            int r2 = G1.C4502e0.a(r2)
            androidx.compose.ui.d$c r3 = r15.E0()
            r4 = r1 | r2
            androidx.compose.ui.d$c r5 = r15.E0()
            boolean r5 = r5.j2()
            if (r5 == 0) goto L_0x00c4
            androidx.compose.ui.d$c r5 = r15.E0()
            G1.G r6 = G1.C4508k.m(r15)
        L_0x0029:
            if (r6 == 0) goto L_0x00c3
            G1.a0 r7 = r6.m0()
            androidx.compose.ui.d$c r7 = r7.k()
            int r7 = r7.Z1()
            r7 = r7 & r4
            r8 = 0
            if (r7 == 0) goto L_0x00ae
        L_0x003b:
            if (r5 == 0) goto L_0x00ae
            int r7 = r5.e2()
            r7 = r7 & r4
            if (r7 == 0) goto L_0x00a9
            if (r5 == r3) goto L_0x004f
            int r7 = r5.e2()
            r7 = r7 & r2
            if (r7 == 0) goto L_0x004f
            goto L_0x00c3
        L_0x004f:
            int r7 = r5.e2()
            r7 = r7 & r1
            if (r7 == 0) goto L_0x00a9
            r7 = r5
            r9 = r8
        L_0x0058:
            if (r7 == 0) goto L_0x00a9
            boolean r10 = r7 instanceof n1.C5630j
            if (r10 == 0) goto L_0x0064
            n1.j r7 = (n1.C5630j) r7
            r7.m1(r0)
            goto L_0x00a4
        L_0x0064:
            int r10 = r7.e2()
            r10 = r10 & r1
            if (r10 == 0) goto L_0x00a4
            boolean r10 = r7 instanceof G1.C4510m
            if (r10 == 0) goto L_0x00a4
            r10 = r7
            G1.m r10 = (G1.C4510m) r10
            androidx.compose.ui.d$c r10 = r10.D2()
            r11 = 0
            r12 = r11
        L_0x0078:
            r13 = 1
            if (r10 == 0) goto L_0x00a1
            int r14 = r10.e2()
            r14 = r14 & r1
            if (r14 == 0) goto L_0x009c
            int r12 = r12 + 1
            if (r12 != r13) goto L_0x0088
            r7 = r10
            goto L_0x009c
        L_0x0088:
            if (r9 != 0) goto L_0x0093
            W0.b r9 = new W0.b
            r13 = 16
            androidx.compose.ui.d$c[] r13 = new androidx.compose.ui.d.c[r13]
            r9.<init>(r13, r11)
        L_0x0093:
            if (r7 == 0) goto L_0x0099
            r9.b(r7)
            r7 = r8
        L_0x0099:
            r9.b(r10)
        L_0x009c:
            androidx.compose.ui.d$c r10 = r10.a2()
            goto L_0x0078
        L_0x00a1:
            if (r12 != r13) goto L_0x00a4
            goto L_0x0058
        L_0x00a4:
            androidx.compose.ui.d$c r7 = G1.C4508k.g(r9)
            goto L_0x0058
        L_0x00a9:
            androidx.compose.ui.d$c r5 = r5.g2()
            goto L_0x003b
        L_0x00ae:
            G1.G r6 = r6.q0()
            if (r6 == 0) goto L_0x00c0
            G1.a0 r5 = r6.m0()
            if (r5 == 0) goto L_0x00c0
            androidx.compose.ui.d$c r5 = r5.p()
            goto L_0x0029
        L_0x00c0:
            r5 = r8
            goto L_0x0029
        L_0x00c3:
            return r0
        L_0x00c4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "visitAncestors called on an unattached node"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTargetNode.H2():androidx.compose.ui.focus.i");
    }

    public final C4475h I2() {
        return (C4475h) c(C4476i.a());
    }

    public C5636p J2() {
        C5636p i10;
        C5640t a10 = C5639s.b(this);
        if (a10 != null && (i10 = a10.i(this)) != null) {
            return i10;
        }
        C5636p pVar = this.f18824p;
        return pVar == null ? C5636p.Inactive : pVar;
    }

    public final void O2() {
        i iVar;
        if (this.f18824p == null) {
            K2();
        }
        int i10 = a.f18827a[J2().ordinal()];
        if (i10 == 1 || i10 == 2) {
            O o10 = new O();
            i0.a(this, new b(o10, this));
            T t10 = o10.f144348a;
            if (t10 == null) {
                C17542s.z("focusProperties");
                iVar = null;
            } else {
                iVar = (i) t10;
            }
            if (!iVar.y()) {
                C4508k.n(this).getFocusOwner().r(true);
            }
        }
    }

    public void P2(C5636p pVar) {
        C5639s.d(this).j(this, pVar);
    }

    public boolean h2() {
        return this.f18825q;
    }

    public void n2() {
        int i10 = a.f18827a[J2().ordinal()];
        if (i10 == 1 || i10 == 2) {
            C4508k.n(this).getFocusOwner().j(true, true, false, d.f18832b.c());
            C5639s.c(this);
        } else if (i10 == 3) {
            C5640t d10 = C5639s.d(this);
            try {
                if (d10.f26514c) {
                    d10.g();
                }
                d10.f();
                P2(C5636p.Inactive);
                C16807N n10 = C16807N.f139792a;
                d10.h();
            } catch (Throwable th2) {
                d10.h();
                throw th2;
            }
        }
        this.f18824p = null;
    }
}
