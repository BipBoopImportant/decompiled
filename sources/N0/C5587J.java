package n0;

import E1.C4488v;
import E1.C4489w;
import G1.C4508k;
import G1.C4509l;
import G1.C4516t;
import G1.h0;
import G1.i0;
import G1.r;
import G1.w0;
import L1.x;
import QJ.F0;
import QJ.Q;
import QJ.T;
import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import SJ.C16438n;
import U0.A1;
import U0.C4899r0;
import U0.p1;
import XH.C16807N;
import android.view.View;
import androidx.compose.ui.d;
import c2.h;
import c2.k;
import c2.s;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import o1.C5667g;
import r1.C5817c;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0001\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u0001\u0010\u001f\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00102\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0016¢\u0006\u0004\b!\u0010\u001cJ\u000f\u0010\"\u001a\u00020\fH\u0016¢\u0006\u0004\b\"\u0010\u001cJ\u000f\u0010#\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010\u001cJ\u0013\u0010%\u001a\u00020\f*\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020\f*\u00020+H\u0016¢\u0006\u0004\b,\u0010-R.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R0\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR(\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bL\u0010;\u001a\u0004\bM\u0010=\"\u0004\bN\u0010?R(\u0010\u0015\u001a\u00020\u00138\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010;\u001a\u0004\bO\u0010=\"\u0004\bP\u0010?R\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bQ\u0010A\u001a\u0004\bR\u0010C\"\u0004\bS\u0010ER\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010bR/\u0010i\u001a\u0004\u0018\u00010'2\b\u0010d\u001a\u0004\u0018\u00010'8B@BX\u0002¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\b[\u0010g\"\u0004\bh\u0010*R\u001e\u0010m\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010j8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u001c\u0010o\u001a\u00020\b8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bn\u0010GR\u001e\u0010s\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bq\u0010rR\u001e\u0010w\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u001a\u0010y\u001a\u00020\b8BX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bx\u0010I\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006z"}, d2 = {"Ln0/J;", "Landroidx/compose/ui/d$c;", "LG1/t;", "LG1/r;", "LG1/w0;", "LG1/h0;", "Lkotlin/Function1;", "Lc2/d;", "Lo1/g;", "sourceCenter", "magnifierCenter", "Lc2/k;", "LXH/N;", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Lc2/h;", "cornerRadius", "elevation", "clippingEnabled", "Ln0/W;", "platformMagnifierFactory", "<init>", "(LnI/l;LnI/l;LnI/l;FZJFFZLn0/W;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "I2", "()V", "L2", "M2", "K2", "(LnI/l;LnI/l;FZJFFZLnI/l;Ln0/W;)V", "m2", "n2", "H0", "Lr1/c;", "z", "(Lr1/c;)V", "LE1/v;", "coordinates", "u", "(LE1/v;)V", "LL1/x;", "m0", "(LL1/x;)V", "n", "LnI/l;", "getSourceCenter", "()LnI/l;", "setSourceCenter", "(LnI/l;)V", "o", "getMagnifierCenter", "setMagnifierCenter", "p", "getOnSizeChanged", "setOnSizeChanged", "q", "F", "getZoom", "()F", "setZoom", "(F)V", "r", "Z", "getUseTextDefault", "()Z", "setUseTextDefault", "(Z)V", "s", "J", "getSize-MYxV2XQ", "()J", "setSize-EaSLcWc", "(J)V", "t", "getCornerRadius-D9Ej5fM", "setCornerRadius-0680j_4", "getElevation-D9Ej5fM", "setElevation-0680j_4", "v", "getClippingEnabled", "setClippingEnabled", "w", "Ln0/W;", "getPlatformMagnifierFactory", "()Ln0/W;", "setPlatformMagnifierFactory", "(Ln0/W;)V", "Landroid/view/View;", "x", "Landroid/view/View;", "view", "y", "Lc2/d;", "density", "Ln0/V;", "Ln0/V;", "magnifier", "<set-?>", "A", "LU0/r0;", "()LE1/v;", "J2", "layoutCoordinates", "LU0/A1;", "B", "LU0/A1;", "anchorPositionInRootState", "C", "sourceCenterInRoot", "Lc2/r;", "D", "Lc2/r;", "previousSize", "LSJ/j;", "E", "LSJ/j;", "drawSignalChannel", "H2", "anchorPositionInRoot", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.J  reason: case insensitive filesystem */
public final class C5587J extends d.c implements C4516t, r, w0, h0 {

    /* renamed from: A  reason: collision with root package name */
    private final C4899r0 f26331A;

    /* renamed from: B  reason: collision with root package name */
    private A1<C5667g> f26332B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public long f26333C;

    /* renamed from: D  reason: collision with root package name */
    private c2.r f26334D;
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public C16434j<C16807N> f26335E;

    /* renamed from: n  reason: collision with root package name */
    private C17642l<? super c2.d, C5667g> f26336n;

    /* renamed from: o  reason: collision with root package name */
    private C17642l<? super c2.d, C5667g> f26337o;

    /* renamed from: p  reason: collision with root package name */
    private C17642l<? super k, C16807N> f26338p;

    /* renamed from: q  reason: collision with root package name */
    private float f26339q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f26340r;

    /* renamed from: s  reason: collision with root package name */
    private long f26341s;

    /* renamed from: t  reason: collision with root package name */
    private float f26342t;

    /* renamed from: u  reason: collision with root package name */
    private float f26343u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f26344v;

    /* renamed from: w  reason: collision with root package name */
    private W f26345w;

    /* renamed from: x  reason: collision with root package name */
    private View f26346x;

    /* renamed from: y  reason: collision with root package name */
    private c2.d f26347y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public V f26348z;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo1/g;", "b", "()J"}, k = 3, mv = {1, 8, 0})
    /* renamed from: n0.J$a */
    static final class a extends C17544u implements C17631a<C5667g> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5587J f26349c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5587J j10) {
            super(0);
            this.f26349c = j10;
        }

        public final long b() {
            C4488v D22 = this.f26349c.x();
            return D22 != null ? C4489w.f(D22) : C5667g.f26701b.b();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C5667g.d(b());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo1/g;", "b", "()J"}, k = 3, mv = {1, 8, 0})
    /* renamed from: n0.J$b */
    static final class b extends C17544u implements C17631a<C5667g> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5587J f26350c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C5587J j10) {
            super(0);
            this.f26350c = j10;
        }

        public final long b() {
            return this.f26350c.f26333C;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C5667g.d(b());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", l = {380, 384}, m = "invokeSuspend")
    /* renamed from: n0.J$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f26351c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5587J f26352d;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: n0.J$c$a */
        static final class a extends C17544u implements C17642l<Long, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f26353c = new a();

            a() {
                super(1);
            }

            public final void a(long j10) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).longValue());
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5587J j10, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f26352d = j10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f26352d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r4.f26351c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x001e
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                XH.y.b(r5)
                goto L_0x0045
            L_0x0012:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x001a:
                XH.y.b(r5)
                goto L_0x0032
            L_0x001e:
                XH.y.b(r5)
            L_0x0021:
                n0.J r5 = r4.f26352d
                SJ.j r5 = r5.f26335E
                if (r5 == 0) goto L_0x0032
                r4.f26351c = r3
                java.lang.Object r5 = r5.j(r4)
                if (r5 != r0) goto L_0x0032
                return r0
            L_0x0032:
                n0.J r5 = r4.f26352d
                n0.V r5 = r5.f26348z
                if (r5 == 0) goto L_0x0021
                n0.J$c$a r5 = n0.C5587J.c.a.f26353c
                r4.f26351c = r2
                java.lang.Object r5 = U0.C4884j0.b(r5, r4)
                if (r5 != r0) goto L_0x0045
                return r0
            L_0x0045:
                n0.J r5 = r4.f26352d
                n0.V r5 = r5.f26348z
                if (r5 == 0) goto L_0x0021
                r5.c()
                goto L_0x0021
            */
            throw new UnsupportedOperationException("Method not decompiled: n0.C5587J.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: n0.J$d */
    static final class d extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5587J f26354c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C5587J j10) {
            super(0);
            this.f26354c = j10;
        }

        public final void invoke() {
            this.f26354c.L2();
        }
    }

    public /* synthetic */ C5587J(C17642l lVar, C17642l lVar2, C17642l lVar3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, W w10, DefaultConstructorMarker defaultConstructorMarker) {
        this(lVar, lVar2, lVar3, f10, z10, j10, f11, f12, z11, w10);
    }

    private final long H2() {
        if (this.f26332B == null) {
            this.f26332B = p1.e(new a(this));
        }
        A1<C5667g> a12 = this.f26332B;
        return a12 != null ? a12.getValue().v() : C5667g.f26701b.b();
    }

    private final void I2() {
        V v10 = this.f26348z;
        if (v10 != null) {
            v10.dismiss();
        }
        View view = this.f26346x;
        if (view == null) {
            view = C4509l.a(this);
        }
        View view2 = view;
        this.f26346x = view2;
        c2.d dVar = this.f26347y;
        if (dVar == null) {
            dVar = C4508k.i(this);
        }
        c2.d dVar2 = dVar;
        this.f26347y = dVar2;
        this.f26348z = this.f26345w.a(view2, this.f26340r, this.f26341s, this.f26342t, this.f26343u, this.f26344v, dVar2, this.f26339q);
        M2();
    }

    private final void J2(C4488v vVar) {
        this.f26331A.setValue(vVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L2() {
        /*
            r8 = this;
            c2.d r0 = r8.f26347y
            if (r0 != 0) goto L_0x000a
            c2.d r0 = G1.C4508k.i(r8)
            r8.f26347y = r0
        L_0x000a:
            nI.l<? super c2.d, o1.g> r1 = r8.f26336n
            java.lang.Object r1 = r1.invoke(r0)
            o1.g r1 = (o1.C5667g) r1
            long r1 = r1.v()
            boolean r3 = o1.C5668h.c(r1)
            if (r3 == 0) goto L_0x007b
            long r3 = r8.H2()
            boolean r3 = o1.C5668h.c(r3)
            if (r3 == 0) goto L_0x007b
            long r3 = r8.H2()
            long r1 = o1.C5667g.r(r3, r1)
            r8.f26333C = r1
            nI.l<? super c2.d, o1.g> r1 = r8.f26337o
            if (r1 == 0) goto L_0x005e
            java.lang.Object r0 = r1.invoke(r0)
            o1.g r0 = (o1.C5667g) r0
            long r0 = r0.v()
            o1.g r0 = o1.C5667g.d(r0)
            long r1 = r0.v()
            boolean r1 = o1.C5668h.c(r1)
            if (r1 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            if (r0 == 0) goto L_0x005e
            long r0 = r0.v()
            long r2 = r8.H2()
            long r0 = o1.C5667g.r(r2, r0)
        L_0x005c:
            r5 = r0
            goto L_0x0065
        L_0x005e:
            o1.g$a r0 = o1.C5667g.f26701b
            long r0 = r0.b()
            goto L_0x005c
        L_0x0065:
            n0.V r0 = r8.f26348z
            if (r0 != 0) goto L_0x006c
            r8.I2()
        L_0x006c:
            n0.V r2 = r8.f26348z
            if (r2 == 0) goto L_0x0077
            long r3 = r8.f26333C
            float r7 = r8.f26339q
            r2.b(r3, r5, r7)
        L_0x0077:
            r8.M2()
            return
        L_0x007b:
            o1.g$a r0 = o1.C5667g.f26701b
            long r0 = r0.b()
            r8.f26333C = r0
            n0.V r0 = r8.f26348z
            if (r0 == 0) goto L_0x008a
            r0.dismiss()
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.C5587J.L2():void");
    }

    private final void M2() {
        c2.d dVar;
        V v10 = this.f26348z;
        if (v10 != null && (dVar = this.f26347y) != null && !c2.r.e(v10.a(), this.f26334D)) {
            C17642l<? super k, C16807N> lVar = this.f26338p;
            if (lVar != null) {
                lVar.invoke(k.c(dVar.X(s.d(v10.a()))));
            }
            this.f26334D = c2.r.b(v10.a());
        }
    }

    /* access modifiers changed from: private */
    public final C4488v x() {
        return (C4488v) this.f26331A.getValue();
    }

    public void H0() {
        i0.a(this, new d(this));
    }

    public final void K2(C17642l<? super c2.d, C5667g> lVar, C17642l<? super c2.d, C5667g> lVar2, float f10, boolean z10, long j10, float f11, float f12, boolean z11, C17642l<? super k, C16807N> lVar3, W w10) {
        float f13 = f10;
        boolean z12 = z10;
        long j11 = j10;
        float f14 = f11;
        float f15 = f12;
        boolean z13 = z11;
        W w11 = w10;
        float f16 = this.f26339q;
        long j12 = this.f26341s;
        float f17 = this.f26342t;
        boolean z14 = this.f26340r;
        float f18 = this.f26343u;
        boolean z15 = this.f26344v;
        W w12 = this.f26345w;
        View view = this.f26346x;
        c2.d dVar = this.f26347y;
        this.f26336n = lVar;
        this.f26337o = lVar2;
        this.f26339q = f13;
        this.f26340r = z12;
        this.f26341s = j11;
        this.f26342t = f14;
        this.f26343u = f15;
        this.f26344v = z13;
        this.f26338p = lVar3;
        this.f26345w = w11;
        View a10 = C4509l.a(this);
        c2.d i10 = C4508k.i(this);
        if (this.f26348z != null && ((!C5588K.a(f13, f16) && !w10.b()) || !k.f(j11, j12) || !h.D(f14, f17) || !h.D(f15, f18) || z12 != z14 || z13 != z15 || !C17542s.e(w11, w12) || !C17542s.e(a10, view) || !C17542s.e(i10, dVar))) {
            I2();
        }
        L2();
    }

    public void m0(x xVar) {
        xVar.b(C5588K.b(), new b(this));
    }

    public void m2() {
        H0();
        this.f26335E = C16437m.b(0, (C16428d) null, (C17642l) null, 7, (Object) null);
        F0 unused = C16314k.d(c2(), (C17168i) null, (T) null, new c(this, (C17164e<? super c>) null), 3, (Object) null);
    }

    public void n2() {
        V v10 = this.f26348z;
        if (v10 != null) {
            v10.dismiss();
        }
        this.f26348z = null;
    }

    public void u(C4488v vVar) {
        J2(vVar);
    }

    public void z(C5817c cVar) {
        cVar.V1();
        C16434j<C16807N> jVar = this.f26335E;
        if (jVar != null) {
            C16438n.b(jVar.k(C16807N.f139792a));
        }
    }

    private C5587J(C17642l<? super c2.d, C5667g> lVar, C17642l<? super c2.d, C5667g> lVar2, C17642l<? super k, C16807N> lVar3, float f10, boolean z10, long j10, float f11, float f12, boolean z11, W w10) {
        this.f26336n = lVar;
        this.f26337o = lVar2;
        this.f26338p = lVar3;
        this.f26339q = f10;
        this.f26340r = z10;
        this.f26341s = j10;
        this.f26342t = f11;
        this.f26343u = f12;
        this.f26344v = z11;
        this.f26345w = w10;
        this.f26331A = p1.i(null, p1.k());
        this.f26333C = C5667g.f26701b.b();
    }
}
