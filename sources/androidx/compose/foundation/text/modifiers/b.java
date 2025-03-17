package androidx.compose.foundation.text.modifiers;

import E1.C4468a;
import E1.C4469b;
import E1.C4484q;
import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import G0.g;
import G1.B;
import G1.C4515s;
import G1.E;
import G1.r;
import G1.w0;
import G1.x0;
import L1.v;
import L1.x;
import N1.A;
import N1.C4669d;
import N1.C4679n;
import N1.P;
import N1.Y;
import S1.C4820m;
import XH.C16807N;
import Y1.k;
import Y1.t;
import androidx.compose.ui.d;
import c2.C5267b;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import o1.C5667g;
import o1.C5669i;
import o1.C5670j;
import o1.C5674n;
import p1.C5728l0;
import p1.C5732n0;
import p1.C5747v0;
import p1.C5753y0;
import p1.g1;
import r1.C5817c;
import r1.j;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0001BÇ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0005H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\rH\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b1\u0010+JV\u00102\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b2\u00103Ja\u00104\u001a\u00020\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b4\u00105J-\u0010:\u001a\u00020\r2\u0006\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u0011¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\rH\u0000¢\u0006\u0004\b<\u0010-J\u0013\u0010>\u001a\u00020\r*\u00020=H\u0016¢\u0006\u0004\b>\u0010?J(\u0010G\u001a\u00020F2\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020Dø\u0001\u0000¢\u0006\u0004\bG\u0010HJ&\u0010I\u001a\u00020F*\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020DH\u0016ø\u0001\u0000¢\u0006\u0004\bI\u0010HJ%\u0010N\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0013¢\u0006\u0004\bN\u0010OJ#\u0010P\u001a\u00020\u0013*\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0013H\u0016¢\u0006\u0004\bP\u0010OJ%\u0010R\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010Q\u001a\u00020\u0013¢\u0006\u0004\bR\u0010OJ#\u0010S\u001a\u00020\u0013*\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010Q\u001a\u00020\u0013H\u0016¢\u0006\u0004\bS\u0010OJ%\u0010T\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0013¢\u0006\u0004\bT\u0010OJ#\u0010U\u001a\u00020\u0013*\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010M\u001a\u00020\u0013H\u0016¢\u0006\u0004\bU\u0010OJ%\u0010V\u001a\u00020\u00132\u0006\u0010K\u001a\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010Q\u001a\u00020\u0013¢\u0006\u0004\bV\u0010OJ#\u0010W\u001a\u00020\u0013*\u00020J2\u0006\u0010C\u001a\u00020L2\u0006\u0010Q\u001a\u00020\u0013H\u0016¢\u0006\u0004\bW\u0010OJ\u0015\u0010Z\u001a\u00020\r2\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\u0013\u0010\\\u001a\u00020\r*\u00020XH\u0016¢\u0006\u0004\b\\\u0010[R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\ba\u0010bR$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u001c\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\be\u0010SR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bh\u0010SR\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bi\u0010SR$\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bj\u0010kR,\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010dR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bn\u0010oR$\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\\\u0010dR*\u0010u\u001a\u0010\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020\u0013\u0018\u00010p8\u0002@\u0002X\u000e¢\u0006\f\n\u0004\br\u0010s\u0012\u0004\bt\u0010-R\u0018\u0010x\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bv\u0010wR*\u0010{\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0y\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bz\u0010dR'\u0010\u0001\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\"\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00020&8BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/modifiers/b;", "Landroidx/compose/ui/d$c;", "LG1/B;", "LG1/r;", "LG1/w0;", "LN1/d;", "text", "LN1/Y;", "style", "LS1/m$b;", "fontFamilyResolver", "Lkotlin/Function1;", "LN1/P;", "LXH/N;", "onTextLayout", "LY1/t;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "LN1/d$c;", "LN1/A;", "placeholders", "Lo1/i;", "onPlaceholderLayout", "LG0/g;", "selectionController", "Lp1/y0;", "overrideColor", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "<init>", "(LN1/d;LN1/Y;LS1/m$b;LnI/l;IZIILjava/util/List;LnI/l;LG0/g;Lp1/y0;LnI/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lc2/d;", "density", "LG0/e;", "M2", "(Lc2/d;)LG0/e;", "updatedText", "U2", "(LN1/d;)Z", "O2", "()V", "color", "W2", "(Lp1/y0;LN1/Y;)Z", "Y2", "X2", "(LN1/Y;Ljava/util/List;IIZLS1/m$b;I)Z", "V2", "(LnI/l;LnI/l;LG0/g;LnI/l;)Z", "drawChanged", "textChanged", "layoutChanged", "callbacksChanged", "J2", "(ZZZZ)V", "I2", "LL1/x;", "m0", "(LL1/x;)V", "LE1/K;", "measureScope", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "R2", "(LE1/K;LE1/H;J)LE1/J;", "h", "LE1/r;", "intrinsicMeasureScope", "LE1/q;", "height", "T2", "(LE1/r;LE1/q;I)I", "E", "width", "S2", "I", "Q2", "P", "P2", "w", "Lr1/c;", "contentDrawScope", "K2", "(Lr1/c;)V", "z", "n", "LN1/d;", "o", "LN1/Y;", "p", "LS1/m$b;", "q", "LnI/l;", "r", "s", "Z", "t", "u", "v", "Ljava/util/List;", "x", "LG0/g;", "y", "Lp1/y0;", "", "LE1/a;", "A", "Ljava/util/Map;", "getBaselineCache$annotations", "baselineCache", "B", "LG0/e;", "_layoutCache", "", "C", "semanticsTextLayoutResult", "D", "Landroidx/compose/foundation/text/modifiers/b$a;", "N2", "()Landroidx/compose/foundation/text/modifiers/b$a;", "setTextSubstitution$foundation_release", "(Landroidx/compose/foundation/text/modifiers/b$a;)V", "textSubstitution", "L2", "()LG0/e;", "layoutCache", "a", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends d.c implements B, r, w0 {

    /* renamed from: A  reason: collision with root package name */
    private Map<C4468a, Integer> f18548A;

    /* renamed from: B  reason: collision with root package name */
    private G0.e f18549B;

    /* renamed from: C  reason: collision with root package name */
    private C17642l<? super List<P>, Boolean> f18550C;

    /* renamed from: D  reason: collision with root package name */
    private a f18551D;

    /* renamed from: n  reason: collision with root package name */
    private C4669d f18552n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public Y f18553o;

    /* renamed from: p  reason: collision with root package name */
    private C4820m.b f18554p;

    /* renamed from: q  reason: collision with root package name */
    private C17642l<? super P, C16807N> f18555q;

    /* renamed from: r  reason: collision with root package name */
    private int f18556r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f18557s;

    /* renamed from: t  reason: collision with root package name */
    private int f18558t;

    /* renamed from: u  reason: collision with root package name */
    private int f18559u;

    /* renamed from: v  reason: collision with root package name */
    private List<C4669d.c<A>> f18560v;

    /* renamed from: w  reason: collision with root package name */
    private C17642l<? super List<C5669i>, C16807N> f18561w;

    /* renamed from: x  reason: collision with root package name */
    private g f18562x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public C5753y0 f18563y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public C17642l<? super a, C16807N> f18564z;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LN1/P;", "textLayoutResult", "", "a", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.text.modifiers.b$b  reason: collision with other inner class name */
    static final class C0273b extends C17544u implements C17642l<List<P>, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f18569c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0273b(b bVar) {
            super(1);
            this.f18569c = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x00bd  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Boolean invoke(java.util.List<N1.P> r38) {
            /*
                r37 = this;
                r0 = r37
                androidx.compose.foundation.text.modifiers.b r1 = r0.f18569c
                G0.e r1 = r1.L2()
                N1.P r2 = r1.b()
                if (r2 == 0) goto L_0x00b8
                N1.O r1 = new N1.O
                N1.O r3 = r2.l()
                N1.d r4 = r3.j()
                androidx.compose.foundation.text.modifiers.b r3 = r0.f18569c
                N1.Y r5 = r3.f18553o
                androidx.compose.foundation.text.modifiers.b r3 = r0.f18569c
                p1.y0 r3 = r3.f18563y
                if (r3 == 0) goto L_0x002b
                long r6 = r3.a()
                goto L_0x0031
            L_0x002b:
                p1.v0$a r3 = p1.C5747v0.f27350b
                long r6 = r3.i()
            L_0x0031:
                r35 = 16777214(0xfffffe, float:2.3509884E-38)
                r36 = 0
                r8 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 0
                N1.Y r5 = N1.Y.L(r5, r6, r8, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36)
                N1.O r3 = r2.l()
                java.util.List r6 = r3.g()
                N1.O r3 = r2.l()
                int r7 = r3.e()
                N1.O r3 = r2.l()
                boolean r8 = r3.h()
                N1.O r3 = r2.l()
                int r9 = r3.f()
                N1.O r3 = r2.l()
                c2.d r10 = r3.b()
                N1.O r3 = r2.l()
                c2.t r11 = r3.d()
                N1.O r3 = r2.l()
                S1.m$b r12 = r3.c()
                N1.O r3 = r2.l()
                long r13 = r3.a()
                r15 = 0
                r3 = r1
                r3.<init>((N1.C4669d) r4, (N1.Y) r5, (java.util.List) r6, (int) r7, (boolean) r8, (int) r9, (c2.d) r10, (c2.t) r11, (S1.C4820m.b) r12, (long) r13, (kotlin.jvm.internal.DefaultConstructorMarker) r15)
                r6 = 2
                r7 = 0
                r4 = 0
                N1.P r1 = N1.P.b(r2, r3, r4, r6, r7)
                if (r1 == 0) goto L_0x00b8
                r2 = r38
                r2.add(r1)
                goto L_0x00b9
            L_0x00b8:
                r1 = 0
            L_0x00b9:
                if (r1 == 0) goto L_0x00bd
                r1 = 1
                goto L_0x00be
            L_0x00bd:
                r1 = 0
            L_0x00be:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.b.C0273b.invoke(java.util.List):java.lang.Boolean");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LN1/d;", "updatedText", "", "a", "(LN1/d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<C4669d, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f18570c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.f18570c = bVar;
        }

        /* renamed from: a */
        public final Boolean invoke(C4669d dVar) {
            boolean unused = this.f18570c.U2(dVar);
            this.f18570c.O2();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17642l<Boolean, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f18571c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(1);
            this.f18571c = bVar;
        }

        public final Boolean a(boolean z10) {
            if (this.f18571c.N2() == null) {
                return Boolean.FALSE;
            }
            C17642l D22 = this.f18571c.f18564z;
            if (D22 != null) {
                a N22 = this.f18571c.N2();
                C17542s.g(N22);
                D22.invoke(N22);
            }
            a N23 = this.f18571c.N2();
            if (N23 != null) {
                N23.f(z10);
            }
            this.f18571c.O2();
            return Boolean.TRUE;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f18572c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.f18572c = bVar;
        }

        public final Boolean invoke() {
            this.f18572c.I2();
            this.f18572c.O2();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f18573c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a0 a0Var) {
            super(1);
            this.f18573c = a0Var;
        }

        public final void a(a0.a aVar) {
            a0.a.i(aVar, this.f18573c, 0, 0, 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public /* synthetic */ b(C4669d dVar, Y y10, C4820m.b bVar, C17642l lVar, int i10, boolean z10, int i11, int i12, List list, C17642l lVar2, g gVar, C5753y0 y0Var, C17642l lVar3, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, y10, bVar, lVar, i10, z10, i11, i12, list, lVar2, gVar, y0Var, lVar3);
    }

    /* access modifiers changed from: private */
    public final G0.e L2() {
        if (this.f18549B == null) {
            this.f18549B = new G0.e(this.f18552n, this.f18553o, this.f18554p, this.f18556r, this.f18557s, this.f18558t, this.f18559u, this.f18560v, (DefaultConstructorMarker) null);
        }
        G0.e eVar = this.f18549B;
        C17542s.g(eVar);
        return eVar;
    }

    private final G0.e M2(c2.d dVar) {
        G0.e a10;
        a aVar = this.f18551D;
        if (aVar == null || !aVar.d() || (a10 = aVar.a()) == null) {
            G0.e L22 = L2();
            L22.k(dVar);
            return L22;
        }
        a10.k(dVar);
        return a10;
    }

    /* access modifiers changed from: private */
    public final void O2() {
        x0.b(this);
        E.b(this);
        C4515s.a(this);
    }

    /* access modifiers changed from: private */
    public final boolean U2(C4669d dVar) {
        C16807N n10;
        a aVar = this.f18551D;
        if (aVar == null) {
            a aVar2 = new a(this.f18552n, dVar, false, (G0.e) null, 12, (DefaultConstructorMarker) null);
            G0.e eVar = new G0.e(dVar, this.f18553o, this.f18554p, this.f18556r, this.f18557s, this.f18558t, this.f18559u, this.f18560v, (DefaultConstructorMarker) null);
            eVar.k(L2().a());
            aVar2.e(eVar);
            this.f18551D = aVar2;
            return true;
        } else if (C17542s.e(dVar, aVar.c())) {
            return false;
        } else {
            aVar.g(dVar);
            G0.e a10 = aVar.a();
            if (a10 != null) {
                a10.n(dVar, this.f18553o, this.f18554p, this.f18556r, this.f18557s, this.f18558t, this.f18559u, this.f18560v);
                n10 = C16807N.f139792a;
            } else {
                n10 = null;
            }
            return n10 != null;
        }
    }

    public int E(E1.r rVar, C4484q qVar, int i10) {
        return M2(rVar).i(rVar.getLayoutDirection());
    }

    public int I(E1.r rVar, C4484q qVar, int i10) {
        return M2(rVar).d(i10, rVar.getLayoutDirection());
    }

    public final void I2() {
        this.f18551D = null;
    }

    public final void J2(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (z11 || z12 || z13) {
            L2().n(this.f18552n, this.f18553o, this.f18554p, this.f18556r, this.f18557s, this.f18558t, this.f18559u, this.f18560v);
        }
        if (j2()) {
            if (z11 || (z10 && this.f18550C != null)) {
                x0.b(this);
            }
            if (z11 || z12 || z13) {
                E.b(this);
                C4515s.a(this);
            }
            if (z10) {
                C4515s.a(this);
            }
        }
    }

    public final void K2(C5817c cVar) {
        z(cVar);
    }

    public final a N2() {
        return this.f18551D;
    }

    public int P(E1.r rVar, C4484q qVar, int i10) {
        return M2(rVar).h(rVar.getLayoutDirection());
    }

    public final int P2(E1.r rVar, C4484q qVar, int i10) {
        return w(rVar, qVar, i10);
    }

    public final int Q2(E1.r rVar, C4484q qVar, int i10) {
        return P(rVar, qVar, i10);
    }

    public final J R2(K k10, H h10, long j10) {
        return h(k10, h10, j10);
    }

    public final int S2(E1.r rVar, C4484q qVar, int i10) {
        return I(rVar, qVar, i10);
    }

    public final int T2(E1.r rVar, C4484q qVar, int i10) {
        return E(rVar, qVar, i10);
    }

    public final boolean V2(C17642l<? super P, C16807N> lVar, C17642l<? super List<C5669i>, C16807N> lVar2, g gVar, C17642l<? super a, C16807N> lVar3) {
        boolean z10;
        if (this.f18555q != lVar) {
            this.f18555q = lVar;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f18561w != lVar2) {
            this.f18561w = lVar2;
            z10 = true;
        }
        if (!C17542s.e(this.f18562x, gVar)) {
            this.f18562x = gVar;
            z10 = true;
        }
        if (this.f18564z == lVar3) {
            return z10;
        }
        this.f18564z = lVar3;
        return true;
    }

    public final boolean W2(C5753y0 y0Var, Y y10) {
        boolean e10 = C17542s.e(y0Var, this.f18563y);
        this.f18563y = y0Var;
        return !e10 || !y10.F(this.f18553o);
    }

    public final boolean X2(Y y10, List<C4669d.c<A>> list, int i10, int i11, boolean z10, C4820m.b bVar, int i12) {
        boolean z11 = !this.f18553o.G(y10);
        this.f18553o = y10;
        if (!C17542s.e(this.f18560v, list)) {
            this.f18560v = list;
            z11 = true;
        }
        if (this.f18559u != i10) {
            this.f18559u = i10;
            z11 = true;
        }
        if (this.f18558t != i11) {
            this.f18558t = i11;
            z11 = true;
        }
        if (this.f18557s != z10) {
            this.f18557s = z10;
            z11 = true;
        }
        if (!C17542s.e(this.f18554p, bVar)) {
            this.f18554p = bVar;
            z11 = true;
        }
        if (t.e(this.f18556r, i12)) {
            return z11;
        }
        this.f18556r = i12;
        return true;
    }

    public final boolean Y2(C4669d dVar) {
        boolean e10 = C17542s.e(this.f18552n.j(), dVar.j());
        boolean z10 = !e10 || !C17542s.e(this.f18552n.g(), dVar.g()) || !C17542s.e(this.f18552n.e(), dVar.e()) || !this.f18552n.m(dVar);
        if (z10) {
            this.f18552n = dVar;
        }
        if (!e10) {
            I2();
        }
        return z10;
    }

    public J h(K k10, H h10, long j10) {
        G0.e M22 = M2(k10);
        boolean f10 = M22.f(j10, k10.getLayoutDirection());
        P c10 = M22.c();
        c10.w().j().b();
        if (f10) {
            E.a(this);
            C17642l<? super P, C16807N> lVar = this.f18555q;
            if (lVar != null) {
                lVar.invoke(c10);
            }
            g gVar = this.f18562x;
            if (gVar != null) {
                gVar.e(c10);
            }
            Map<C4468a, Integer> map = this.f18548A;
            if (map == null) {
                map = new LinkedHashMap<>(2);
            }
            map.put(C4469b.a(), Integer.valueOf(Math.round(c10.h())));
            map.put(C4469b.b(), Integer.valueOf(Math.round(c10.k())));
            this.f18548A = map;
        }
        C17642l<? super List<C5669i>, C16807N> lVar2 = this.f18561w;
        if (lVar2 != null) {
            lVar2.invoke(c10.A());
        }
        a0 i02 = h10.i0(C5267b.f23024b.b(c2.r.h(c10.B()), c2.r.h(c10.B()), c2.r.g(c10.B()), c2.r.g(c10.B())));
        int h11 = c2.r.h(c10.B());
        int g10 = c2.r.g(c10.B());
        Map<C4468a, Integer> map2 = this.f18548A;
        C17542s.g(map2);
        return k10.I0(h11, g10, map2, new f(i02));
    }

    public void m0(x xVar) {
        C17642l lVar = this.f18550C;
        if (lVar == null) {
            lVar = new C0273b(this);
            this.f18550C = lVar;
        }
        v.s0(xVar, this.f18552n);
        a aVar = this.f18551D;
        if (aVar != null) {
            v.w0(xVar, aVar.c());
            v.p0(xVar, aVar.d());
        }
        v.y0(xVar, (String) null, new c(this), 1, (Object) null);
        v.E0(xVar, (String) null, new d(this), 1, (Object) null);
        v.d(xVar, (String) null, new e(this), 1, (Object) null);
        v.u(xVar, (String) null, lVar, 1, (Object) null);
    }

    public int w(E1.r rVar, C4484q qVar, int i10) {
        return M2(rVar).d(i10, rVar.getLayoutDirection());
    }

    public void z(C5817c cVar) {
        if (j2()) {
            g gVar = this.f18562x;
            if (gVar != null) {
                gVar.b(cVar);
            }
            C5732n0 e10 = cVar.I1().e();
            P c10 = M2(cVar).c();
            C4679n w10 = c10.w();
            boolean z10 = true;
            boolean z11 = c10.i() && !t.e(this.f18556r, t.f14827a.c());
            if (z11) {
                C5669i c11 = C5670j.c(C5667g.f26701b.c(), C5674n.a((float) c2.r.h(c10.B()), (float) c2.r.g(c10.B())));
                e10.t();
                C5732n0.A(e10, c11, 0, 2, (Object) null);
            }
            try {
                k A10 = this.f18553o.A();
                if (A10 == null) {
                    A10 = k.f14792b.c();
                }
                k kVar = A10;
                g1 x10 = this.f18553o.x();
                if (x10 == null) {
                    x10 = g1.f27310d.a();
                }
                g1 g1Var = x10;
                r1.g i10 = this.f18553o.i();
                if (i10 == null) {
                    i10 = j.f28627a;
                }
                r1.g gVar2 = i10;
                C5728l0 g10 = this.f18553o.g();
                if (g10 != null) {
                    C4679n.F(w10, e10, g10, this.f18553o.d(), g1Var, kVar, gVar2, 0, 64, (Object) null);
                } else {
                    C5753y0 y0Var = this.f18563y;
                    long a10 = y0Var != null ? y0Var.a() : C5747v0.f27350b.i();
                    if (a10 == 16) {
                        a10 = this.f18553o.h() != 16 ? this.f18553o.h() : C5747v0.f27350b.a();
                    }
                    C4679n.D(w10, e10, a10, g1Var, kVar, gVar2, 0, 32, (Object) null);
                }
                a aVar = this.f18551D;
                if (!((aVar == null || !aVar.d()) ? G0.j.a(this.f18552n) : false)) {
                    Collection collection = this.f18560v;
                    if (collection != null && !collection.isEmpty()) {
                        z10 = false;
                    }
                    if (z10) {
                        return;
                    }
                }
                cVar.V1();
            } finally {
                if (z11) {
                    e10.n();
                }
            }
        }
    }

    private b(C4669d dVar, Y y10, C4820m.b bVar, C17642l<? super P, C16807N> lVar, int i10, boolean z10, int i11, int i12, List<C4669d.c<A>> list, C17642l<? super List<C5669i>, C16807N> lVar2, g gVar, C5753y0 y0Var, C17642l<? super a, C16807N> lVar3) {
        this.f18552n = dVar;
        this.f18553o = y10;
        this.f18554p = bVar;
        this.f18555q = lVar;
        this.f18556r = i10;
        this.f18557s = z10;
        this.f18558t = i11;
        this.f18559u = i12;
        this.f18560v = list;
        this.f18561w = lVar2;
        this.f18562x = gVar;
        this.f18563y = y0Var;
        this.f18564z = lVar3;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010 \u001a\u0004\b\u0014\u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text/modifiers/b$a;", "", "LN1/d;", "original", "substitution", "", "isShowingSubstitution", "LG0/e;", "layoutCache", "<init>", "(LN1/d;LN1/d;ZLG0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LN1/d;", "b", "()LN1/d;", "c", "g", "(LN1/d;)V", "Z", "d", "()Z", "f", "(Z)V", "LG0/e;", "()LG0/e;", "e", "(LG0/e;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C4669d f18565a;

        /* renamed from: b  reason: collision with root package name */
        private C4669d f18566b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f18567c;

        /* renamed from: d  reason: collision with root package name */
        private G0.e f18568d;

        public a(C4669d dVar, C4669d dVar2, boolean z10, G0.e eVar) {
            this.f18565a = dVar;
            this.f18566b = dVar2;
            this.f18567c = z10;
            this.f18568d = eVar;
        }

        public final G0.e a() {
            return this.f18568d;
        }

        public final C4669d b() {
            return this.f18565a;
        }

        public final C4669d c() {
            return this.f18566b;
        }

        public final boolean d() {
            return this.f18567c;
        }

        public final void e(G0.e eVar) {
            this.f18568d = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f18565a, aVar.f18565a) && C17542s.e(this.f18566b, aVar.f18566b) && this.f18567c == aVar.f18567c && C17542s.e(this.f18568d, aVar.f18568d);
        }

        public final void f(boolean z10) {
            this.f18567c = z10;
        }

        public final void g(C4669d dVar) {
            this.f18566b = dVar;
        }

        public int hashCode() {
            int hashCode = ((((this.f18565a.hashCode() * 31) + this.f18566b.hashCode()) * 31) + Boolean.hashCode(this.f18567c)) * 31;
            G0.e eVar = this.f18568d;
            return hashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            return "TextSubstitutionValue(original=" + this.f18565a + ", substitution=" + this.f18566b + ", isShowingSubstitution=" + this.f18567c + ", layoutCache=" + this.f18568d + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(C4669d dVar, C4669d dVar2, boolean z10, G0.e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(dVar, dVar2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : eVar);
        }
    }
}
