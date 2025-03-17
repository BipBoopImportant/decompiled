package N1;

import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import S1.F;
import U1.e;
import Y1.b;
import Y1.k;
import Y1.m;
import Y1.n;
import Y1.o;
import Y1.p;
import c2.v;
import c2.w;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import p1.C5747v0;
import p1.C5751x0;
import p1.g1;
import p1.h1;
import r1.g;
import r1.j;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aÀ\u0001\u0010\u0002\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010-\u001a\u00020\u00162\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u0001002\b\u00102\u001a\u0004\u0018\u00010\u00102\b\u00104\u001a\u0004\u0018\u000103H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u00105\u001a\u001f\u00107\u001a\u0004\u0018\u00010\u0010*\u00020\u000b2\b\u00106\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b7\u00108\"\u0014\u0010:\u001a\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0001\u00109\"\u0014\u0010;\u001a\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u00109\"\u0014\u0010<\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u00109\"\u0014\u0010=\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u00109\"\u0014\u0010@\u001a\u00020>8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010?\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A"}, d2 = {"Lc2/v;", "a", "b", "", "t", "f", "(JJF)J", "T", "fraction", "d", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "LN1/G;", "start", "stop", "c", "(LN1/G;LN1/G;F)LN1/G;", "LN1/D;", "e", "(LN1/D;LN1/D;F)LN1/D;", "style", "h", "(LN1/G;)LN1/G;", "Lp1/v0;", "color", "Lp1/l0;", "brush", "alpha", "fontSize", "LS1/C;", "fontWeight", "LS1/x;", "fontStyle", "LS1/y;", "fontSynthesis", "LS1/m;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "LY1/a;", "baselineShift", "LY1/o;", "textGeometricTransform", "LU1/e;", "localeList", "background", "LY1/k;", "textDecoration", "Lp1/g1;", "shadow", "platformStyle", "Lr1/g;", "drawStyle", "(LN1/G;JLp1/l0;FJLS1/C;LS1/x;LS1/y;LS1/m;Ljava/lang/String;JLY1/a;LY1/o;LU1/e;JLY1/k;Lp1/g1;LN1/D;Lr1/g;)LN1/G;", "other", "g", "(LN1/G;LN1/D;)LN1/D;", "J", "DefaultFontSize", "DefaultLetterSpacing", "DefaultBackgroundColor", "DefaultColor", "LY1/n;", "LY1/n;", "DefaultColorForegroundStyle", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class H {

    /* renamed from: a  reason: collision with root package name */
    private static final long f9374a = w.i(14);

    /* renamed from: b  reason: collision with root package name */
    private static final long f9375b = w.i(0);

    /* renamed from: c  reason: collision with root package name */
    private static final long f9376c;

    /* renamed from: d  reason: collision with root package name */
    private static final long f9377d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final n f9378e;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LY1/n;", "b", "()LY1/n;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<n> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f9379c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final n invoke() {
            return H.f9378e;
        }
    }

    static {
        C5747v0.a aVar = C5747v0.f27350b;
        f9376c = aVar.h();
        long a10 = aVar.a();
        f9377d = a10;
        f9378e = n.f14805a.b(a10);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x00e4: MOVE  (r14v2 U1.e) = (r37v0 U1.e)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0193  */
    public static final N1.G b(N1.G r21, long r22, p1.C5728l0 r24, float r25, long r26, S1.C r28, S1.C4830x r29, S1.C4831y r30, S1.C4820m r31, java.lang.String r32, long r33, Y1.a r35, Y1.o r36, U1.e r37, long r38, Y1.k r40, p1.g1 r41, N1.D r42, r1.g r43) {
        /*
            r0 = r21
            r1 = r22
            r3 = r24
            r4 = r25
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r35
            r11 = r36
            r12 = r37
            r13 = r38
            r15 = r40
            r0 = r41
            boolean r16 = c2.w.j(r26)
            r17 = 16
            if (r16 != 0) goto L_0x003f
            long r13 = r21.k()
            r11 = r26
            boolean r13 = c2.v.e(r11, r13)
            if (r13 == 0) goto L_0x0033
            goto L_0x0041
        L_0x0033:
            r0 = r21
            r13 = r36
        L_0x0037:
            r11 = r38
        L_0x0039:
            r14 = r42
        L_0x003b:
            r15 = r43
            goto L_0x013f
        L_0x003f:
            r11 = r26
        L_0x0041:
            if (r3 != 0) goto L_0x0055
            int r13 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r13 == 0) goto L_0x0055
            Y1.n r13 = r21.t()
            long r13 = r13.b()
            boolean r13 = p1.C5747v0.q(r1, r13)
            if (r13 == 0) goto L_0x0033
        L_0x0055:
            if (r6 == 0) goto L_0x0061
            S1.x r13 = r21.l()
            boolean r13 = kotlin.jvm.internal.C17542s.e(r6, r13)
            if (r13 == 0) goto L_0x0033
        L_0x0061:
            if (r5 == 0) goto L_0x006d
            S1.C r13 = r21.n()
            boolean r13 = kotlin.jvm.internal.C17542s.e(r5, r13)
            if (r13 == 0) goto L_0x0033
        L_0x006d:
            if (r8 == 0) goto L_0x0075
            S1.m r13 = r21.i()
            if (r8 != r13) goto L_0x0033
        L_0x0075:
            boolean r13 = c2.w.j(r33)
            if (r13 != 0) goto L_0x0088
            long r13 = r21.o()
            r11 = r33
            boolean r13 = c2.v.e(r11, r13)
            if (r13 == 0) goto L_0x0033
            goto L_0x008a
        L_0x0088:
            r11 = r33
        L_0x008a:
            if (r15 == 0) goto L_0x0096
            Y1.k r13 = r21.s()
            boolean r13 = kotlin.jvm.internal.C17542s.e(r15, r13)
            if (r13 == 0) goto L_0x0033
        L_0x0096:
            Y1.n r13 = r21.t()
            p1.l0 r13 = r13.d()
            boolean r13 = kotlin.jvm.internal.C17542s.e(r3, r13)
            if (r13 == 0) goto L_0x0033
            if (r3 == 0) goto L_0x00b2
            Y1.n r13 = r21.t()
            float r13 = r13.a()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x0033
        L_0x00b2:
            if (r7 == 0) goto L_0x00be
            S1.y r13 = r21.m()
            boolean r13 = kotlin.jvm.internal.C17542s.e(r7, r13)
            if (r13 == 0) goto L_0x0033
        L_0x00be:
            if (r9 == 0) goto L_0x00ca
            java.lang.String r13 = r21.j()
            boolean r13 = kotlin.jvm.internal.C17542s.e(r9, r13)
            if (r13 == 0) goto L_0x0033
        L_0x00ca:
            if (r10 == 0) goto L_0x00d6
            Y1.a r13 = r21.e()
            boolean r13 = kotlin.jvm.internal.C17542s.e(r10, r13)
            if (r13 == 0) goto L_0x0033
        L_0x00d6:
            r13 = r36
            if (r13 == 0) goto L_0x00e4
            Y1.o r14 = r21.u()
            boolean r14 = kotlin.jvm.internal.C17542s.e(r13, r14)
            if (r14 == 0) goto L_0x00e7
        L_0x00e4:
            r14 = r37
            goto L_0x00eb
        L_0x00e7:
            r0 = r21
            goto L_0x0037
        L_0x00eb:
            if (r14 == 0) goto L_0x00f7
            U1.e r11 = r21.p()
            boolean r11 = kotlin.jvm.internal.C17542s.e(r14, r11)
            if (r11 == 0) goto L_0x00e7
        L_0x00f7:
            r11 = r38
            int r16 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r16 == 0) goto L_0x010c
            long r14 = r21.d()
            boolean r14 = p1.C5747v0.q(r11, r14)
            if (r14 == 0) goto L_0x0108
            goto L_0x010c
        L_0x0108:
            r0 = r21
            goto L_0x0039
        L_0x010c:
            if (r0 == 0) goto L_0x0118
            p1.g1 r14 = r21.r()
            boolean r14 = kotlin.jvm.internal.C17542s.e(r0, r14)
            if (r14 == 0) goto L_0x0108
        L_0x0118:
            r14 = r42
            if (r14 == 0) goto L_0x0126
            N1.D r15 = r21.q()
            boolean r15 = kotlin.jvm.internal.C17542s.e(r14, r15)
            if (r15 == 0) goto L_0x0129
        L_0x0126:
            r15 = r43
            goto L_0x012d
        L_0x0129:
            r0 = r21
            goto L_0x003b
        L_0x012d:
            if (r15 == 0) goto L_0x013c
            r1.g r0 = r21.h()
            boolean r0 = kotlin.jvm.internal.C17542s.e(r15, r0)
            if (r0 != 0) goto L_0x013c
            r0 = r21
            goto L_0x013f
        L_0x013c:
            r0 = r21
            return r0
        L_0x013f:
            if (r3 == 0) goto L_0x0148
            Y1.n$a r1 = Y1.n.f14805a
            Y1.n r1 = r1.a(r3, r4)
            goto L_0x014e
        L_0x0148:
            Y1.n$a r3 = Y1.n.f14805a
            Y1.n r1 = r3.b(r1)
        L_0x014e:
            Y1.n r2 = r21.t()
            Y1.n r1 = r2.e(r1)
            if (r8 != 0) goto L_0x015d
            S1.m r2 = r21.i()
            goto L_0x015e
        L_0x015d:
            r2 = r8
        L_0x015e:
            boolean r3 = c2.w.j(r26)
            if (r3 != 0) goto L_0x0167
            r3 = r26
            goto L_0x016b
        L_0x0167:
            long r3 = r21.k()
        L_0x016b:
            if (r5 != 0) goto L_0x0171
            S1.C r5 = r21.n()
        L_0x0171:
            if (r6 != 0) goto L_0x0177
            S1.x r6 = r21.l()
        L_0x0177:
            if (r7 != 0) goto L_0x017d
            S1.y r7 = r21.m()
        L_0x017d:
            if (r9 != 0) goto L_0x0184
            java.lang.String r8 = r21.j()
            r9 = r8
        L_0x0184:
            boolean r8 = c2.w.j(r33)
            if (r8 != 0) goto L_0x018d
            r19 = r33
            goto L_0x0191
        L_0x018d:
            long r19 = r21.o()
        L_0x0191:
            if (r10 != 0) goto L_0x0198
            Y1.a r8 = r21.e()
            r10 = r8
        L_0x0198:
            if (r13 != 0) goto L_0x019f
            Y1.o r8 = r21.u()
            r13 = r8
        L_0x019f:
            if (r37 != 0) goto L_0x01a6
            U1.e r8 = r21.p()
            goto L_0x01a8
        L_0x01a6:
            r8 = r37
        L_0x01a8:
            int r16 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r16 == 0) goto L_0x01ad
            goto L_0x01b1
        L_0x01ad:
            long r11 = r21.d()
        L_0x01b1:
            if (r40 != 0) goto L_0x01b8
            Y1.k r16 = r21.s()
            goto L_0x01ba
        L_0x01b8:
            r16 = r40
        L_0x01ba:
            if (r41 != 0) goto L_0x01c1
            p1.g1 r17 = r21.r()
            goto L_0x01c3
        L_0x01c1:
            r17 = r41
        L_0x01c3:
            N1.D r14 = g(r0, r14)
            if (r15 != 0) goto L_0x01ce
            r1.g r0 = r21.h()
            r15 = r0
        L_0x01ce:
            N1.G r0 = new N1.G
            r21 = r0
            r18 = 0
            r41 = r18
            r22 = r1
            r23 = r3
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r2
            r29 = r9
            r30 = r19
            r32 = r10
            r33 = r13
            r34 = r8
            r35 = r11
            r37 = r16
            r38 = r17
            r39 = r14
            r40 = r15
            r21.<init>((Y1.n) r22, (long) r23, (S1.C) r25, (S1.C4830x) r26, (S1.C4831y) r27, (S1.C4820m) r28, (java.lang.String) r29, (long) r30, (Y1.a) r32, (Y1.o) r33, (U1.e) r34, (long) r35, (Y1.k) r37, (p1.g1) r38, (N1.D) r39, (r1.g) r40, (kotlin.jvm.internal.DefaultConstructorMarker) r41)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.H.b(N1.G, long, p1.l0, float, long, S1.C, S1.x, S1.y, S1.m, java.lang.String, long, Y1.a, Y1.o, U1.e, long, Y1.k, p1.g1, N1.D, r1.g):N1.G");
    }

    public static final G c(G g10, G g11, float f10) {
        float f11 = f10;
        n b10 = m.b(g10.t(), g11.t(), f11);
        C4820m mVar = (C4820m) d(g10.i(), g11.i(), f11);
        long f12 = f(g10.k(), g11.k(), f11);
        C n10 = g10.n();
        if (n10 == null) {
            n10 = C.f13316b.d();
        }
        C n11 = g11.n();
        if (n11 == null) {
            n11 = C.f13316b.d();
        }
        C a10 = F.a(n10, n11, f11);
        C4830x xVar = (C4830x) d(g10.l(), g11.l(), f11);
        C4831y yVar = (C4831y) d(g10.m(), g11.m(), f11);
        String str = (String) d(g10.j(), g11.j(), f11);
        long f13 = f(g10.o(), g11.o(), f11);
        Y1.a e10 = g10.e();
        float j10 = e10 != null ? e10.j() : Y1.a.e(0.0f);
        Y1.a e11 = g11.e();
        float a11 = b.a(j10, e11 != null ? e11.j() : Y1.a.e(0.0f), f11);
        o u10 = g10.u();
        if (u10 == null) {
            u10 = o.f14810c.a();
        }
        o u11 = g11.u();
        if (u11 == null) {
            u11 = o.f14810c.a();
        }
        o a12 = p.a(u10, u11, f11);
        e eVar = (e) d(g10.p(), g11.p(), f11);
        o oVar = a12;
        long i10 = C5751x0.i(g10.d(), g11.d(), f11);
        k kVar = (k) d(g10.s(), g11.s(), f11);
        g1 r10 = g10.r();
        if (r10 == null) {
            r10 = new g1(0, 0, 0.0f, 7, (DefaultConstructorMarker) null);
        }
        g1 r11 = g11.r();
        if (r11 == null) {
            r11 = new g1(0, 0, 0.0f, 7, (DefaultConstructorMarker) null);
        }
        return new G(b10, f12, a10, xVar, yVar, mVar, str, f13, Y1.a.d(a11), oVar, eVar, i10, kVar, h1.a(r10, r11, f11), e(g10.q(), g11.q(), f11), (g) d(g10.h(), g11.h(), f11), (DefaultConstructorMarker) null);
    }

    public static final <T> T d(T t10, T t11, float f10) {
        return ((double) f10) < 0.5d ? t10 : t11;
    }

    private static final D e(D d10, D d11, float f10) {
        if (d10 == null && d11 == null) {
            return null;
        }
        if (d10 == null) {
            d10 = D.f9284a.a();
        }
        if (d11 == null) {
            d11 = D.f9284a.a();
        }
        return C4668c.c(d10, d11, f10);
    }

    public static final long f(long j10, long j11, float f10) {
        return (w.j(j10) || w.j(j11)) ? ((v) d(v.b(j10), v.b(j11), f10)).k() : w.k(j10, j11, f10);
    }

    private static final D g(G g10, D d10) {
        return g10.q() == null ? d10 : d10 == null ? g10.q() : g10.q().b(d10);
    }

    public static final G h(G g10) {
        n c10 = g10.t().c(a.f9379c);
        long k10 = w.j(g10.k()) ? f9374a : g10.k();
        C n10 = g10.n();
        if (n10 == null) {
            n10 = C.f13316b.d();
        }
        C c11 = n10;
        C4830x l10 = g10.l();
        C4830x c12 = C4830x.c(l10 != null ? l10.i() : C4830x.f13449b.b());
        C4831y m10 = g10.m();
        C4831y e10 = C4831y.e(m10 != null ? m10.m() : C4831y.f13453b.a());
        C4820m i10 = g10.i();
        if (i10 == null) {
            i10 = C4820m.f13418b.b();
        }
        C4820m mVar = i10;
        String j10 = g10.j();
        if (j10 == null) {
            j10 = "";
        }
        String str = j10;
        long o10 = w.j(g10.o()) ? f9375b : g10.o();
        Y1.a e11 = g10.e();
        Y1.a d10 = Y1.a.d(e11 != null ? e11.j() : Y1.a.f14735b.a());
        o u10 = g10.u();
        if (u10 == null) {
            u10 = o.f14810c.a();
        }
        o oVar = u10;
        e p10 = g10.p();
        if (p10 == null) {
            p10 = e.f14214c.a();
        }
        e eVar = p10;
        long d11 = g10.d();
        if (d11 == 16) {
            d11 = f9376c;
        }
        long j11 = d11;
        k s10 = g10.s();
        if (s10 == null) {
            s10 = k.f14792b.c();
        }
        k kVar = s10;
        g1 r10 = g10.r();
        if (r10 == null) {
            r10 = g1.f27310d.a();
        }
        g1 g1Var = r10;
        D q10 = g10.q();
        g h10 = g10.h();
        if (h10 == null) {
            h10 = j.f28627a;
        }
        return new G(c10, k10, c11, c12, e10, mVar, str, o10, d10, oVar, eVar, j11, kVar, g1Var, q10, h10, (DefaultConstructorMarker) null);
    }
}
