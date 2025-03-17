package Uj;

import EB.C12832d;
import FB.C12860a;
import FB.C12861b;
import HJ.C15854t;
import Kj.a;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import Tj.A;
import Tj.C10942g;
import Tj.C10943h;
import XH.C16807N;
import XH.t;
import XH.y;
import aj.C11063c;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.r;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import dj.C11193a;
import eI.C17187b;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import jj.C11418a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rz.B;
import rz.C;
import rz.C15007A;
import sj.C11854e;
import tz.C15100a;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0006|}~\u0001Bk\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001eH\u0014¢\u0006\u0004\b#\u0010\"J\u0017\u0010%\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0002¢\u0006\u0004\b'\u0010\"J\u000f\u0010(\u001a\u00020\u001eH\u0002¢\u0006\u0004\b(\u0010\"J\u000f\u0010)\u001a\u00020\u001eH\u0002¢\u0006\u0004\b)\u0010\"J\u000f\u0010*\u001a\u00020\u001eH\u0002¢\u0006\u0004\b*\u0010\"J\u000f\u0010+\u001a\u00020\u001eH\u0002¢\u0006\u0004\b+\u0010\"J'\u00101\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u001e2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u0019\u00109\u001a\u0004\u0018\u0001082\u0006\u00104\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020;H\u0002¢\u0006\u0004\b>\u0010=J\u000f\u0010?\u001a\u00020;H\u0002¢\u0006\u0004\b?\u0010=J\u000f\u0010@\u001a\u00020\u001eH\u0002¢\u0006\u0004\b@\u0010\"J\u0010\u0010A\u001a\u00020,H@¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010XR(\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Z0Y8\u0000X\u0004¢\u0006\u0012\n\u0004\b[\u0010\\\u0012\u0004\b_\u0010\"\u001a\u0004\b]\u0010^R\u001c\u0010c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010a0Y8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010\\R&\u0010h\u001a\b\u0012\u0004\u0012\u00020d0Y8\u0000X\u0004¢\u0006\u0012\n\u0004\be\u0010\\\u0012\u0004\bg\u0010\"\u001a\u0004\bf\u0010^R\u001c\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010i0Y8\u0002X\u0004¢\u0006\u0006\n\u0004\bj\u0010\\R\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020l0Y8\u0002X\u0004¢\u0006\u0006\n\u0004\bm\u0010\\R\u001d\u0010t\u001a\b\u0012\u0004\u0012\u00020l0o8\u0006¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0018\u0010w\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010{\u001a\u00060xR\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\by\u0010z¨\u0006\u0001"}, d2 = {"LUj/k;", "Landroidx/lifecycle/f0;", "LTj/g;", "checkoutPaymentCompletedUseCase", "LFB/a;", "localStoreSelectionRepository", "LTj/A;", "scanAndGoCancelOrderUseCase", "Ljj/a;", "statusPollInterval", "LDz/a;", "shouldGiveFeedbackUseCase", "Ltz/a;", "getProfileStateUseCase", "LTj/h;", "checkoutUseCase", "LOz/b;", "scanAndGoCleanUpUseCase", "Ldj/a;", "checkoutStatusUseCase", "Lsj/e;", "vibrationFeedback", "Laj/c;", "checkoutAnalytics", "Landroidx/lifecycle/U;", "savedStateHandle", "<init>", "(LTj/g;LFB/a;LTj/A;Ljj/a;LDz/a;Ltz/a;LTj/h;LOz/b;Ldj/a;Lsj/e;Laj/c;Landroidx/lifecycle/U;)V", "LUj/k$c;", "action", "LXH/N;", "X", "(LUj/k$c;)V", "i0", "()V", "onCleared", "LUj/k$c$d;", "W", "(LUj/k$c$d;)V", "e0", "b0", "c0", "Y", "g0", "", "orderId", "", "startTimeInMillis", "pollDelayInterval", "h0", "(Ljava/lang/String;JJ)V", "Lrz/C$c;", "status", "d0", "(Lrz/C$c;)V", "Lrz/C$b;", "LKj/a$b;", "R", "(Lrz/C$b;)LKj/a$b;", "LQJ/F0;", "a0", "()LQJ/F0;", "Z", "f0", "j0", "T", "(LdI/e;)Ljava/lang/Object;", "m", "LTj/g;", "n", "LFB/a;", "o", "LTj/A;", "p", "Ljj/a;", "q", "LDz/a;", "r", "Ltz/a;", "s", "LTj/h;", "t", "LOz/b;", "u", "Ldj/a;", "v", "Lsj/e;", "w", "Laj/c;", "LTJ/B;", "LUj/k$f;", "x", "LTJ/B;", "V", "()LTJ/B;", "getUiEvent$scanandgo_implementation_release$annotations", "uiEvent", "LUj/k$e;", "y", "errorFlow", "LKj/a;", "z", "S", "getCheckoutState$scanandgo_implementation_release$annotations", "checkoutState", "Lrz/A;", "A", "checkout", "LUj/k$d;", "B", "_uiData", "LTJ/P;", "C", "LTJ/P;", "U", "()LTJ/P;", "uiData", "D", "LQJ/F0;", "pollStatusJob", "LUj/k$b;", "E", "LUj/k$b;", "lifecycleObserver", "d", "e", "f", "c", "b", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final C16505B<C15007A> f88123A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final C16505B<d> f88124B;

    /* renamed from: C  reason: collision with root package name */
    private final C16519P<d> f88125C;

    /* renamed from: D  reason: collision with root package name */
    private F0 f88126D;

    /* renamed from: E  reason: collision with root package name */
    private final b f88127E = new b();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C10942g f88128m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C12860a f88129n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final A f88130o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C11418a f88131p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Dz.a f88132q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C15100a f88133r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C10943h f88134s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final Oz.b f88135t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C11193a f88136u;

    /* renamed from: v  reason: collision with root package name */
    private final C11854e f88137v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final C11063c f88138w;

    /* renamed from: x  reason: collision with root package name */
    private final C16505B<f> f88139x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final C16505B<e> f88140y;

    /* renamed from: z  reason: collision with root package name */
    private final C16505B<Kj.a> f88141z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.ScanAndGoCheckoutViewModel$1", f = "ScanAndGoCheckoutViewModel.kt", l = {131, 141, 171}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f88142c;

        /* renamed from: d  reason: collision with root package name */
        Object f88143d;

        /* renamed from: e  reason: collision with root package name */
        Object f88144e;

        /* renamed from: f  reason: collision with root package name */
        Object f88145f;

        /* renamed from: g  reason: collision with root package name */
        Object f88146g;

        /* renamed from: h  reason: collision with root package name */
        Object f88147h;

        /* renamed from: i  reason: collision with root package name */
        Object f88148i;

        /* renamed from: j  reason: collision with root package name */
        Object f88149j;

        /* renamed from: k  reason: collision with root package name */
        int f88150k;

        /* renamed from: l  reason: collision with root package name */
        int f88151l;

        /* renamed from: m  reason: collision with root package name */
        int f88152m;

        /* renamed from: n  reason: collision with root package name */
        int f88153n;

        /* renamed from: o  reason: collision with root package name */
        private /* synthetic */ Object f88154o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ k f88155p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ U f88156q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar, U u10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f88155p = kVar;
            this.f88156q = u10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f88155p, this.f88156q, eVar);
            aVar.f88154o = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x010f  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0153  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                r23 = this;
                r0 = r23
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f88153n
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x006f
                if (r2 == r5) goto L_0x0064
                if (r2 == r4) goto L_0x003d
                if (r2 != r3) goto L_0x0035
                java.lang.Object r1 = r0.f88149j
                Uj.k$e r1 = (Uj.k.e) r1
                java.lang.Object r1 = r0.f88147h
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                java.lang.Object r1 = r0.f88146g
                Uj.k r1 = (Uj.k) r1
                java.lang.Object r1 = r0.f88145f
                Uj.k r1 = (Uj.k) r1
                java.lang.Object r1 = r0.f88143d
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f88142c
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f88154o
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r24)
                goto L_0x026d
            L_0x0035:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003d:
                int r2 = r0.f88150k
                java.lang.Object r7 = r0.f88147h
                Uj.k$d r7 = (Uj.k.d) r7
                java.lang.Object r7 = r0.f88146g
                Uj.k$d r7 = (Uj.k.d) r7
                java.lang.Object r7 = r0.f88144e
                TJ.B r7 = (TJ.C16505B) r7
                java.lang.Object r7 = r0.f88143d
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r8 = r0.f88142c
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r9 = r0.f88154o
                QJ.Q r9 = (QJ.Q) r9
                XH.y.b(r24)
                r10 = r24
                XH.x r10 = (XH.x) r10
                java.lang.Object r10 = r10.j()
                goto L_0x0107
            L_0x0064:
                java.lang.Object r2 = r0.f88154o
                QJ.Q r2 = (QJ.Q) r2
                XH.y.b(r24)
                r7 = r24
            L_0x006d:
                r9 = r2
                goto L_0x0087
            L_0x006f:
                XH.y.b(r24)
                java.lang.Object r2 = r0.f88154o
                QJ.Q r2 = (QJ.Q) r2
                Uj.k r7 = r0.f88155p
                tz.a r7 = r7.f88133r
                r0.f88154o = r2
                r0.f88153n = r5
                java.lang.Object r7 = r7.a(r0)
                if (r7 != r1) goto L_0x006d
                return r1
            L_0x0087:
                rz.K r7 = (rz.K) r7
                java.lang.String r8 = r7.a()
                androidx.lifecycle.U r2 = r0.f88156q
                java.lang.String r7 = "timeSlotId"
                java.lang.Object r2 = r2.f(r7)
                r7 = r2
                java.lang.String r7 = (java.lang.String) r7
                androidx.lifecycle.U r2 = r0.f88156q
                java.lang.String r10 = "earlyPayment"
                java.lang.Object r2 = r2.f(r10)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                if (r2 == 0) goto L_0x00a9
                boolean r2 = r2.booleanValue()
                goto L_0x00aa
            L_0x00a9:
                r2 = r6
            L_0x00aa:
                Uj.k r10 = r0.f88155p
                TJ.B r15 = r10.f88124B
            L_0x00b0:
                java.lang.Object r14 = r15.getValue()
                r13 = r14
                Uj.k$d r13 = (Uj.k.d) r13
                int r10 = r8.length()
                if (r10 <= 0) goto L_0x00bf
                r12 = r5
                goto L_0x00c0
            L_0x00bf:
                r12 = r6
            L_0x00c0:
                r18 = 29
                r19 = 0
                r11 = 0
                r16 = 0
                r17 = 0
                r20 = 0
                r10 = r13
                r3 = r13
                r13 = r16
                r5 = r14
                r14 = r17
                r4 = r15
                r15 = r20
                r16 = r7
                r17 = r2
                Uj.k$d r10 = Uj.k.d.b(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                boolean r11 = r4.e(r5, r10)
                if (r11 == 0) goto L_0x0270
                Uj.k r11 = r0.f88155p
                Tj.h r11 = r11.f88134s
                r0.f88154o = r9
                r0.f88142c = r8
                r0.f88143d = r7
                r0.f88144e = r4
                r0.f88145f = r5
                r0.f88146g = r3
                r0.f88147h = r10
                r0.f88150k = r2
                r0.f88151l = r6
                r0.f88152m = r6
                r3 = 2
                r0.f88153n = r3
                java.lang.Object r10 = r11.a(r8, r7, r2, r0)
                if (r10 != r1) goto L_0x0107
                return r1
            L_0x0107:
                Uj.k r3 = r0.f88155p
                java.lang.Throwable r4 = XH.x.e(r10)
                if (r4 != 0) goto L_0x0153
                r5 = r10
                rz.A r5 = (rz.C15007A) r5
                TJ.B r11 = r3.S()
            L_0x0116:
                java.lang.Object r1 = r11.getValue()
                r2 = r1
                Kj.a r2 = (Kj.a) r2
                Kj.a$e r2 = Kj.a.e.f82802a
                boolean r1 = r11.e(r1, r2)
                if (r1 == 0) goto L_0x0116
                TJ.B r1 = r3.f88123A
            L_0x0129:
                java.lang.Object r2 = r1.getValue()
                r4 = r2
                rz.A r4 = (rz.C15007A) r4
                boolean r2 = r1.e(r2, r5)
                if (r2 == 0) goto L_0x0129
                java.lang.String r12 = r5.c()
                long r13 = r5.d()
                jj.a r1 = r3.f88131p
                long r15 = r1.b()
                r11 = r3
                r11.h0(r12, r13, r15)
                aj.c r1 = r3.f88138w
                r1.j()
                goto L_0x026d
            L_0x0153:
                boolean r5 = r4 instanceof Tj.C10943h.a
                if (r5 == 0) goto L_0x0188
                r5 = r4
                Tj.h$a r5 = (Tj.C10943h.a) r5
                boolean r11 = r5 instanceof Tj.C10943h.a.C1821a
                if (r11 == 0) goto L_0x0162
                Uj.k$e$c r11 = Uj.k.e.c.f88176a
                goto L_0x0248
            L_0x0162:
                Tj.h$a$b$a r11 = Tj.C10943h.a.b.C1822a.f87536a
                boolean r11 = kotlin.jvm.internal.C17542s.e(r5, r11)
                if (r11 == 0) goto L_0x016e
                Uj.k$e$a r11 = Uj.k.e.a.f88174a
                goto L_0x0248
            L_0x016e:
                Tj.h$a$b$b r11 = Tj.C10943h.a.b.C1823b.f87537a
                boolean r11 = kotlin.jvm.internal.C17542s.e(r5, r11)
                if (r11 == 0) goto L_0x017a
                Uj.k$e$e r11 = Uj.k.e.C1847e.f88178a
                goto L_0x0248
            L_0x017a:
                boolean r11 = r5 instanceof Tj.C10943h.a.c
                if (r11 == 0) goto L_0x0182
                Uj.k$e$d r11 = Uj.k.e.d.f88177a
                goto L_0x0248
            L_0x0182:
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            L_0x0188:
                qv.e r5 = qv.e.ERROR
                qv.d r11 = qv.d.f102012a
                java.util.List r11 = r11.a()
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r11 = r11.iterator()
            L_0x019b:
                boolean r13 = r11.hasNext()
                if (r13 == 0) goto L_0x01b2
                java.lang.Object r13 = r11.next()
                r14 = r13
                qv.b r14 = (qv.C11819b) r14
                boolean r14 = r14.b(r5, r6)
                if (r14 == 0) goto L_0x019b
                r12.add(r13)
                goto L_0x019b
            L_0x01b2:
                java.util.Iterator r17 = r12.iterator()
                r15 = 0
                r11 = r15
                r12 = r11
            L_0x01b9:
                boolean r13 = r17.hasNext()
                if (r13 == 0) goto L_0x0245
                java.lang.Object r13 = r17.next()
                qv.b r13 = (qv.C11819b) r13
                if (r11 != 0) goto L_0x01d3
                java.lang.String r11 = qv.C11818a.a(r15, r4)
                if (r11 != 0) goto L_0x01cf
                goto L_0x0245
            L_0x01cf:
                java.lang.String r11 = qv.C11820c.a(r11)
            L_0x01d3:
                r18 = r11
                if (r12 != 0) goto L_0x0228
                java.lang.Class r11 = r9.getClass()
                java.lang.String r11 = r11.getName()
                kotlin.jvm.internal.C17542s.g(r11)
                r12 = 36
                r14 = 2
                java.lang.String r12 = HJ.C15854t.s1(r11, r12, r15, r14, r15)
                r6 = 46
                java.lang.String r6 = HJ.C15854t.o1(r12, r6, r15, r14, r15)
                int r12 = r6.length()
                if (r12 != 0) goto L_0x01f6
                goto L_0x01fc
            L_0x01f6:
                java.lang.String r11 = "Kt"
                java.lang.String r11 = HJ.C15854t.P0(r6, r11)
            L_0x01fc:
                java.lang.Thread r6 = java.lang.Thread.currentThread()
                java.lang.String r6 = r6.getName()
                java.lang.String r12 = "main"
                r14 = 1
                boolean r6 = HJ.C15854t.b0(r6, r12, r14)
                if (r6 == 0) goto L_0x0210
                java.lang.String r6 = "m"
                goto L_0x0212
            L_0x0210:
                java.lang.String r6 = "b"
            L_0x0212:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r6)
                java.lang.String r6 = "|"
                r12.append(r6)
                r12.append(r11)
                java.lang.String r12 = r12.toString()
            L_0x0226:
                r6 = r12
                goto L_0x022a
            L_0x0228:
                r14 = 1
                goto L_0x0226
            L_0x022a:
                r16 = 0
                r11 = r13
                r12 = r5
                r13 = r6
                r21 = r14
                r20 = 2
                r14 = r16
                r22 = r15
                r15 = r4
                r16 = r18
                r11.a(r12, r13, r14, r15, r16)
                r12 = r6
                r11 = r18
                r15 = r22
                r6 = 0
                goto L_0x01b9
            L_0x0245:
                Uj.k$e$c r11 = Uj.k.e.c.f88176a
                r5 = r9
            L_0x0248:
                TJ.B r6 = r3.f88140y
                r0.f88154o = r9
                r0.f88142c = r8
                r0.f88143d = r7
                r0.f88144e = r10
                r0.f88145f = r3
                r0.f88146g = r3
                r0.f88147h = r4
                r0.f88148i = r5
                r0.f88149j = r11
                r0.f88150k = r2
                r3 = 0
                r0.f88151l = r3
                r5 = 3
                r0.f88153n = r5
                java.lang.Object r2 = r6.emit(r11, r0)
                if (r2 != r1) goto L_0x026d
                return r1
            L_0x026d:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            L_0x0270:
                r21 = 1
                r15 = r4
                r5 = r21
                r3 = 3
                r4 = 2
                goto L_0x00b0
            */
            throw new UnsupportedOperationException("Method not decompiled: Uj.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"LUj/k$b;", "Landroidx/lifecycle/h;", "<init>", "(LUj/k;)V", "Landroidx/lifecycle/y;", "owner", "LXH/N;", "onPause", "(Landroidx/lifecycle/y;)V", "onResume", "onDestroy", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b implements C5205h {
        public b() {
        }

        public void onDestroy(C5221y yVar) {
            C17542s.j(yVar, "owner");
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("onDestroy", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = b.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            super.onDestroy(yVar);
            k.this.i0();
        }

        public void onPause(C5221y yVar) {
            C17542s.j(yVar, "owner");
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("OnPause", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = b.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            super.onPause(yVar);
            C15007A a11 = (C15007A) k.this.f88123A.getValue();
            if (a11 != null) {
                k kVar = k.this;
                kVar.h0(a11.c(), a11.d(), kVar.f88131p.a());
            }
        }

        public void onResume(C5221y yVar) {
            C17542s.j(yVar, "owner");
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("onResume", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = b.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            super.onResume(yVar);
            C15007A a11 = (C15007A) k.this.f88123A.getValue();
            if (a11 != null) {
                k kVar = k.this;
                kVar.h0(a11.c(), a11.d(), kVar.f88131p.b());
            }
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LUj/k$c;", "", "<init>", "()V", "d", "e", "i", "a", "c", "b", "h", "f", "g", "LUj/k$c$a;", "LUj/k$c$b;", "LUj/k$c$c;", "LUj/k$c$d;", "LUj/k$c$e;", "LUj/k$c$f;", "LUj/k$c$g;", "LUj/k$c$h;", "LUj/k$c$i;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/k$c$a;", "LUj/k$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final a f88158a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1427280485;
            }

            public String toString() {
                return "ClearUiError";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/k$c$b;", "LUj/k$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final b f88159a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1427387127;
            }

            public String toString() {
                return "ClearUiEvent";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/k$c$c;", "LUj/k$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Uj.k$c$c  reason: collision with other inner class name */
        public static final class C1846c extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final C1846c f88160a = new C1846c();

            private C1846c() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1846c);
            }

            public int hashCode() {
                return -1378277894;
            }

            public String toString() {
                return "HandleStoreClosing";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LUj/k$c$d;", "LUj/k$c;", "Landroidx/lifecycle/r;", "lifecycle", "<init>", "(Landroidx/lifecycle/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/lifecycle/r;", "()Landroidx/lifecycle/r;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d extends c {

            /* renamed from: a  reason: collision with root package name */
            private final r f88161a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(r rVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(rVar, "lifecycle");
                this.f88161a = rVar;
            }

            public final r a() {
                return this.f88161a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && C17542s.e(this.f88161a, ((d) obj).f88161a);
            }

            public int hashCode() {
                return this.f88161a.hashCode();
            }

            public String toString() {
                r rVar = this.f88161a;
                return "Initialize(lifecycle=" + rVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/k$c$e;", "LUj/k$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final e f88162a = new e();

            private e() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -1905141762;
            }

            public String toString() {
                return "OnBackPressed";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/k$c$f;", "LUj/k$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class f extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final f f88163a = new f();

            private f() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return 1267585692;
            }

            public String toString() {
                return "OnContinueShoppingClick";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/k$c$g;", "LUj/k$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class g extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final g f88164a = new g();

            private g() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return 1789002409;
            }

            public String toString() {
                return "OnDoneClick";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/k$c$h;", "LUj/k$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class h extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final h f88165a = new h();

            private h() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof h);
            }

            public int hashCode() {
                return 1303903277;
            }

            public String toString() {
                return "OnPopBackStack";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/k$c$i;", "LUj/k$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class i extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final i f88166a = new i();

            private i() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof i);
            }

            public int hashCode() {
                return 450361143;
            }

            public String toString() {
                return "ViewFamilyCard";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J^\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b\"\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b-\u0010!¨\u0006."}, d2 = {"LUj/k$d;", "", "Lrz/A;", "scanAndGoCheckout", "", "hasFamilyCard", "LUj/k$e;", "uiError", "LKj/a;", "checkoutState", "LUj/k$f;", "uiEvent", "", "timeSlotId", "isEarlyPayment", "<init>", "(Lrz/A;ZLUj/k$e;LKj/a;LUj/k$f;Ljava/lang/String;Z)V", "a", "(Lrz/A;ZLUj/k$e;LKj/a;LUj/k$f;Ljava/lang/String;Z)LUj/k$d;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lrz/A;", "e", "()Lrz/A;", "b", "Z", "d", "()Z", "c", "LUj/k$e;", "g", "()LUj/k$e;", "LKj/a;", "()LKj/a;", "LUj/k$f;", "h", "()LUj/k$f;", "f", "Ljava/lang/String;", "i", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final C15007A f88167a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f88168b;

        /* renamed from: c  reason: collision with root package name */
        private final e f88169c;

        /* renamed from: d  reason: collision with root package name */
        private final Kj.a f88170d;

        /* renamed from: e  reason: collision with root package name */
        private final f f88171e;

        /* renamed from: f  reason: collision with root package name */
        private final String f88172f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f88173g;

        public d() {
            this((C15007A) null, false, (e) null, (Kj.a) null, (f) null, (String) null, false, 127, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ d b(d dVar, C15007A a10, boolean z10, e eVar, Kj.a aVar, f fVar, String str, boolean z11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                a10 = dVar.f88167a;
            }
            if ((i10 & 2) != 0) {
                z10 = dVar.f88168b;
            }
            boolean z12 = z10;
            if ((i10 & 4) != 0) {
                eVar = dVar.f88169c;
            }
            e eVar2 = eVar;
            if ((i10 & 8) != 0) {
                aVar = dVar.f88170d;
            }
            Kj.a aVar2 = aVar;
            if ((i10 & 16) != 0) {
                fVar = dVar.f88171e;
            }
            f fVar2 = fVar;
            if ((i10 & 32) != 0) {
                str = dVar.f88172f;
            }
            String str2 = str;
            if ((i10 & 64) != 0) {
                z11 = dVar.f88173g;
            }
            return dVar.a(a10, z12, eVar2, aVar2, fVar2, str2, z11);
        }

        public final d a(C15007A a10, boolean z10, e eVar, Kj.a aVar, f fVar, String str, boolean z11) {
            C17542s.j(aVar, "checkoutState");
            return new d(a10, z10, eVar, aVar, fVar, str, z11);
        }

        public final Kj.a c() {
            return this.f88170d;
        }

        public final boolean d() {
            return this.f88168b;
        }

        public final C15007A e() {
            return this.f88167a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f88167a, dVar.f88167a) && this.f88168b == dVar.f88168b && C17542s.e(this.f88169c, dVar.f88169c) && C17542s.e(this.f88170d, dVar.f88170d) && C17542s.e(this.f88171e, dVar.f88171e) && C17542s.e(this.f88172f, dVar.f88172f) && this.f88173g == dVar.f88173g;
        }

        public final String f() {
            return this.f88172f;
        }

        public final e g() {
            return this.f88169c;
        }

        public final f h() {
            return this.f88171e;
        }

        public int hashCode() {
            C15007A a10 = this.f88167a;
            int i10 = 0;
            int hashCode = (((a10 == null ? 0 : a10.hashCode()) * 31) + Boolean.hashCode(this.f88168b)) * 31;
            e eVar = this.f88169c;
            int hashCode2 = (((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + this.f88170d.hashCode()) * 31;
            f fVar = this.f88171e;
            int hashCode3 = (hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            String str = this.f88172f;
            if (str != null) {
                i10 = str.hashCode();
            }
            return ((hashCode3 + i10) * 31) + Boolean.hashCode(this.f88173g);
        }

        public final boolean i() {
            return this.f88173g;
        }

        public String toString() {
            C15007A a10 = this.f88167a;
            boolean z10 = this.f88168b;
            e eVar = this.f88169c;
            Kj.a aVar = this.f88170d;
            f fVar = this.f88171e;
            String str = this.f88172f;
            boolean z11 = this.f88173g;
            return "UiData(scanAndGoCheckout=" + a10 + ", hasFamilyCard=" + z10 + ", uiError=" + eVar + ", checkoutState=" + aVar + ", uiEvent=" + fVar + ", timeSlotId=" + str + ", isEarlyPayment=" + z11 + ")";
        }

        public d(C15007A a10, boolean z10, e eVar, Kj.a aVar, f fVar, String str, boolean z11) {
            C17542s.j(aVar, "checkoutState");
            this.f88167a = a10;
            this.f88168b = z10;
            this.f88169c = eVar;
            this.f88170d = aVar;
            this.f88171e = fVar;
            this.f88172f = str;
            this.f88173g = z11;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ d(rz.C15007A r7, boolean r8, Uj.k.e r9, Kj.a r10, Uj.k.f r11, java.lang.String r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            /*
                r6 = this;
                r15 = r14 & 1
                r0 = 0
                if (r15 == 0) goto L_0x0007
                r15 = r0
                goto L_0x0008
            L_0x0007:
                r15 = r7
            L_0x0008:
                r7 = r14 & 2
                r1 = 0
                if (r7 == 0) goto L_0x000f
                r2 = r1
                goto L_0x0010
            L_0x000f:
                r2 = r8
            L_0x0010:
                r7 = r14 & 4
                if (r7 == 0) goto L_0x0016
                r3 = r0
                goto L_0x0017
            L_0x0016:
                r3 = r9
            L_0x0017:
                r7 = r14 & 8
                if (r7 == 0) goto L_0x001d
                Kj.a$a r10 = Kj.a.C1635a.f82779a
            L_0x001d:
                r4 = r10
                r7 = r14 & 16
                if (r7 == 0) goto L_0x0024
                r5 = r0
                goto L_0x0025
            L_0x0024:
                r5 = r11
            L_0x0025:
                r7 = r14 & 32
                if (r7 == 0) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r0 = r12
            L_0x002b:
                r7 = r14 & 64
                if (r7 == 0) goto L_0x0031
                r14 = r1
                goto L_0x0032
            L_0x0031:
                r14 = r13
            L_0x0032:
                r7 = r6
                r8 = r15
                r9 = r2
                r10 = r3
                r11 = r4
                r12 = r5
                r13 = r0
                r7.<init>(r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Uj.k.d.<init>(rz.A, boolean, Uj.k$e, Kj.a, Uj.k$f, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LUj/k$e;", "", "<init>", "()V", "c", "a", "e", "d", "b", "LUj/k$e$a;", "LUj/k$e$b;", "LUj/k$e$c;", "LUj/k$e$d;", "LUj/k$e$e;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class e {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/k$e$a;", "LUj/k$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends e {

            /* renamed from: a  reason: collision with root package name */
            public static final a f88174a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1156410362;
            }

            public String toString() {
                return "BadWifi";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LUj/k$e$b;", "LUj/k$e;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends e {

            /* renamed from: a  reason: collision with root package name */
            private final String f88175a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "message");
                this.f88175a = str;
            }

            public final String a() {
                return this.f88175a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f88175a, ((b) obj).f88175a);
            }

            public int hashCode() {
                return this.f88175a.hashCode();
            }

            public String toString() {
                String str = this.f88175a;
                return "CheckoutStatusError(message=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/k$e$c;", "LUj/k$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends e {

            /* renamed from: a  reason: collision with root package name */
            public static final c f88176a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1751291697;
            }

            public String toString() {
                return "GenericError";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/k$e$d;", "LUj/k$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d extends e {

            /* renamed from: a  reason: collision with root package name */
            public static final d f88177a = new d();

            private d() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 1096978669;
            }

            public String toString() {
                return "StoreClosed";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/k$e$e;", "LUj/k$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Uj.k$e$e  reason: collision with other inner class name */
        public static final class C1847e extends e {

            /* renamed from: a  reason: collision with root package name */
            public static final C1847e f88178a = new C1847e();

            private C1847e() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1847e);
            }

            public int hashCode() {
                return 1865017337;
            }

            public String toString() {
                return "SuggestWifi";
            }
        }

        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private e() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LUj/k$f;", "", "<init>", "()V", "a", "b", "c", "e", "d", "LUj/k$f$a;", "LUj/k$f$b;", "LUj/k$f$c;", "LUj/k$f$d;", "LUj/k$f$e;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class f {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/k$f$a;", "LUj/k$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends f {

            /* renamed from: a  reason: collision with root package name */
            public static final a f88179a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 95503011;
            }

            public String toString() {
                return "Cancelled";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LUj/k$f$b;", "LUj/k$f;", "", "hasOder", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends f {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f88180a;

            public b(boolean z10) {
                super((DefaultConstructorMarker) null);
                this.f88180a = z10;
            }

            public final boolean a() {
                return this.f88180a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f88180a == ((b) obj).f88180a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f88180a);
            }

            public String toString() {
                boolean z10 = this.f88180a;
                return "Finished(hasOder=" + z10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LUj/k$f$c;", "LUj/k$f;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends f {

            /* renamed from: a  reason: collision with root package name */
            private final String f88181a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "message");
                this.f88181a = str;
            }

            public final String a() {
                return this.f88181a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f88181a, ((c) obj).f88181a);
            }

            public int hashCode() {
                return this.f88181a.hashCode();
            }

            public String toString() {
                String str = this.f88181a;
                return "NotCancellable(message=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/k$f$d;", "LUj/k$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d extends f {

            /* renamed from: a  reason: collision with root package name */
            public static final d f88182a = new d();

            private d() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 1157286910;
            }

            public String toString() {
                return "PopBackStack";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LUj/k$f$e;", "LUj/k$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e extends f {

            /* renamed from: a  reason: collision with root package name */
            public static final e f88183a = new e();

            private e() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return 1073987935;
            }

            public String toString() {
                return "ShowFamilyCard";
            }
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private f() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.ScanAndGoCheckoutViewModel", f = "ScanAndGoCheckoutViewModel.kt", l = {409}, m = "getStoreId")
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f88184c;

        /* renamed from: d  reason: collision with root package name */
        Object f88185d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f88186e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k f88187f;

        /* renamed from: g  reason: collision with root package name */
        int f88188g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(k kVar, C17164e<? super g> eVar) {
            super(eVar);
            this.f88187f = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f88186e = obj;
            this.f88188g |= Integer.MIN_VALUE;
            return this.f88187f.T(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.ScanAndGoCheckoutViewModel$onBackPressed$1", f = "ScanAndGoCheckoutViewModel.kt", l = {236}, m = "invokeSuspend")
    static final class h extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f88189c;

        /* renamed from: d  reason: collision with root package name */
        Object f88190d;

        /* renamed from: e  reason: collision with root package name */
        int f88191e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k f88192f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(k kVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f88192f = kVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f88192f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C16505B<f> V10;
            f value;
            C11063c cVar;
            B f10;
            Object f11 = C17187b.f();
            int i10 = this.f88191e;
            boolean z10 = true;
            if (i10 == 0) {
                y.b(obj);
                Kj.a value2 = this.f88192f.S().getValue();
                if (value2 instanceof a.d) {
                    obj2 = new f.c(((a.d) value2).d());
                } else if (value2 instanceof a.c) {
                    C11063c j10 = this.f88192f.f88138w;
                    k kVar = this.f88192f;
                    this.f88189c = value2;
                    this.f88190d = j10;
                    this.f88191e = 1;
                    obj = kVar.T(this);
                    if (obj == f11) {
                        return f11;
                    }
                    cVar = j10;
                } else if (value2 instanceof a.C1635a) {
                    obj2 = f.a.f88179a;
                } else if ((value2 instanceof a.b) || (value2 instanceof a.e)) {
                    C15007A a10 = (C15007A) this.f88192f.f88123A.getValue();
                    if (!(a10 == null || (f10 = a10.f()) == null)) {
                        this.f88192f.f88130o.a(f10);
                    }
                    obj2 = f.a.f88179a;
                } else {
                    throw new t();
                }
                V10 = this.f88192f.V();
                do {
                    value = V10.getValue();
                    f fVar = value;
                } while (!V10.e(value, obj2));
                return C16807N.f139792a;
            } else if (i10 == 1) {
                cVar = (C11063c) this.f88190d;
                Kj.a aVar = (Kj.a) this.f88189c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) obj;
            Kj.a value3 = this.f88192f.S().getValue();
            B b10 = null;
            a.c cVar2 = value3 instanceof a.c ? (a.c) value3 : null;
            cVar.d(str, cVar2 != null ? cVar2.f() : null, this.f88192f.U().getValue().f());
            C15007A e10 = this.f88192f.U().getValue().e();
            if (e10 != null) {
                b10 = e10.f();
            }
            if (b10 == null) {
                z10 = false;
            }
            obj2 = new f.b(z10);
            V10 = this.f88192f.V();
            do {
                value = V10.getValue();
                f fVar2 = value;
            } while (!V10.e(value, obj2));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.ScanAndGoCheckoutViewModel$onClearUiError$1", f = "ScanAndGoCheckoutViewModel.kt", l = {393}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f88193c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f88194d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(k kVar, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f88194d = kVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f88194d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f88193c;
            if (i10 == 0) {
                y.b(obj);
                C16505B E10 = this.f88194d.f88140y;
                this.f88193c = 1;
                if (E10.emit(null, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.ScanAndGoCheckoutViewModel$onClearUiEvent$1", f = "ScanAndGoCheckoutViewModel.kt", l = {390}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f88195c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f88196d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(k kVar, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f88196d = kVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new j(this.f88196d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f88195c;
            if (i10 == 0) {
                y.b(obj);
                C16505B<f> V10 = this.f88196d.V();
                this.f88195c = 1;
                if (V10.emit(null, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.ScanAndGoCheckoutViewModel$onContinueShoppingClick$1", f = "ScanAndGoCheckoutViewModel.kt", l = {206}, m = "invokeSuspend")
    /* renamed from: Uj.k$k  reason: collision with other inner class name */
    static final class C1848k extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f88197c;

        /* renamed from: d  reason: collision with root package name */
        int f88198d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f88199e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1848k(k kVar, C17164e<? super C1848k> eVar) {
            super(2, eVar);
            this.f88199e = kVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C1848k(this.f88199e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C1848k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C11063c cVar;
            Object f10 = C17187b.f();
            int i10 = this.f88198d;
            if (i10 == 0) {
                y.b(obj);
                C11063c j10 = this.f88199e.f88138w;
                k kVar = this.f88199e;
                this.f88197c = j10;
                this.f88198d = 1;
                Object L10 = kVar.T(this);
                if (L10 == f10) {
                    return f10;
                }
                cVar = j10;
                obj = L10;
            } else if (i10 == 1) {
                cVar = (C11063c) this.f88197c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) obj;
            Kj.a value = this.f88199e.S().getValue();
            a.c.C1636a aVar = null;
            a.c cVar2 = value instanceof a.c ? (a.c) value : null;
            if (cVar2 != null) {
                aVar = cVar2.f();
            }
            cVar.c(str, aVar, this.f88199e.U().getValue().f());
            this.f88199e.e0();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.ScanAndGoCheckoutViewModel$onDoneClick$1", f = "ScanAndGoCheckoutViewModel.kt", l = {217}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f88200c;

        /* renamed from: d  reason: collision with root package name */
        int f88201d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f88202e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(k kVar, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f88202e = kVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new l(this.f88202e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C11063c cVar;
            Object f10 = C17187b.f();
            int i10 = this.f88201d;
            if (i10 == 0) {
                y.b(obj);
                C11063c j10 = this.f88202e.f88138w;
                k kVar = this.f88202e;
                this.f88200c = j10;
                this.f88201d = 1;
                Object L10 = kVar.T(this);
                if (L10 == f10) {
                    return f10;
                }
                cVar = j10;
                obj = L10;
            } else if (i10 == 1) {
                cVar = (C11063c) this.f88200c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) obj;
            Kj.a value = this.f88202e.S().getValue();
            a.c.C1636a aVar = null;
            a.c cVar2 = value instanceof a.c ? (a.c) value : null;
            if (cVar2 != null) {
                aVar = cVar2.f();
            }
            cVar.c(str, aVar, this.f88202e.U().getValue().f());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.ScanAndGoCheckoutViewModel$onPaymentCompleted$1", f = "ScanAndGoCheckoutViewModel.kt", l = {340, 354, 351}, m = "invokeSuspend")
    static final class m extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f88203c;

        /* renamed from: d  reason: collision with root package name */
        Object f88204d;

        /* renamed from: e  reason: collision with root package name */
        Object f88205e;

        /* renamed from: f  reason: collision with root package name */
        Object f88206f;

        /* renamed from: g  reason: collision with root package name */
        Object f88207g;

        /* renamed from: h  reason: collision with root package name */
        Object f88208h;

        /* renamed from: i  reason: collision with root package name */
        Object f88209i;

        /* renamed from: j  reason: collision with root package name */
        Object f88210j;

        /* renamed from: k  reason: collision with root package name */
        Object f88211k;

        /* renamed from: l  reason: collision with root package name */
        Object f88212l;

        /* renamed from: m  reason: collision with root package name */
        Object f88213m;

        /* renamed from: n  reason: collision with root package name */
        boolean f88214n;

        /* renamed from: o  reason: collision with root package name */
        int f88215o;

        /* renamed from: p  reason: collision with root package name */
        int f88216p;

        /* renamed from: q  reason: collision with root package name */
        int f88217q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ k f88218r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f88219s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ C.c f88220t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(k kVar, boolean z10, C.c cVar, C17164e<? super m> eVar) {
            super(2, eVar);
            this.f88218r = kVar;
            this.f88219s = z10;
            this.f88220t = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new m(this.f88218r, this.f88219s, this.f88220t, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((m) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x013c  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0188  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r8 = r22
                java.lang.Object r9 = eI.C17187b.f()
                int r0 = r8.f88217q
                r10 = 0
                r11 = 3
                r12 = 2
                r1 = 1
                if (r0 == 0) goto L_0x00a7
                if (r0 == r1) goto L_0x00a1
                if (r0 == r12) goto L_0x0059
                if (r0 != r11) goto L_0x0051
                int r0 = r8.f88215o
                boolean r1 = r8.f88214n
                java.lang.Object r2 = r8.f88212l
                Tj.g r2 = (Tj.C10942g) r2
                java.lang.Object r2 = r8.f88211k
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r2 = r8.f88210j
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r2 = r8.f88209i
                Kj.a r2 = (Kj.a) r2
                java.lang.Object r2 = r8.f88208h
                java.lang.Object r3 = r8.f88207g
                rz.C$c r3 = (rz.C.c) r3
                java.lang.Object r4 = r8.f88206f
                Uj.k r4 = (Uj.k) r4
                java.lang.Object r5 = r8.f88205e
                TJ.B r5 = (TJ.C16505B) r5
                java.lang.Object r6 = r8.f88204d
                yz.a r6 = (yz.C15324a) r6
                java.lang.Object r7 = r8.f88203c
                java.lang.String r7 = (java.lang.String) r7
                XH.y.b(r23)
                r13 = r2
                r2 = r5
                r15 = r7
                r10 = r11
                r5 = r1
                r1 = r6
                r6 = r0
                r0 = r23
                r19 = r4
                r4 = r3
                r3 = r19
                goto L_0x017d
            L_0x0051:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0059:
                int r0 = r8.f88216p
                int r1 = r8.f88215o
                boolean r2 = r8.f88214n
                java.lang.Object r3 = r8.f88212l
                Tj.g r3 = (Tj.C10942g) r3
                java.lang.Object r4 = r8.f88211k
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r5 = r8.f88210j
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r6 = r8.f88209i
                Kj.a r6 = (Kj.a) r6
                java.lang.Object r7 = r8.f88208h
                java.lang.Object r13 = r8.f88207g
                rz.C$c r13 = (rz.C.c) r13
                java.lang.Object r14 = r8.f88206f
                Uj.k r14 = (Uj.k) r14
                java.lang.Object r15 = r8.f88205e
                TJ.B r15 = (TJ.C16505B) r15
                java.lang.Object r11 = r8.f88204d
                yz.a r11 = (yz.C15324a) r11
                java.lang.Object r12 = r8.f88203c
                java.lang.String r12 = (java.lang.String) r12
                XH.y.b(r23)
                r10 = r6
                r6 = r14
                r14 = r23
                r19 = r1
                r1 = r0
                r0 = r3
                r3 = r11
                r11 = r19
                r20 = r12
                r12 = r2
                r2 = r5
                r5 = r15
                r15 = r20
                r21 = r13
                r13 = r7
                r7 = r21
                goto L_0x012a
            L_0x00a1:
                XH.y.b(r23)
                r0 = r23
                goto L_0x00b5
            L_0x00a7:
                XH.y.b(r23)
                Uj.k r0 = r8.f88218r
                r8.f88217q = r1
                java.lang.Object r0 = r0.T(r8)
                if (r0 != r9) goto L_0x00b5
                return r9
            L_0x00b5:
                java.lang.String r0 = (java.lang.String) r0
                boolean r1 = r8.f88219s
                if (r1 == 0) goto L_0x00be
                yz.a$a r1 = yz.C15324a.C3270a.f132353a
                goto L_0x00c3
            L_0x00be:
                yz.a$b r1 = new yz.a$b
                r1.<init>(r0)
            L_0x00c3:
                Uj.k r2 = r8.f88218r
                Dz.a r2 = r2.f88132q
                r2.a(r1)
                Uj.k r2 = r8.f88218r
                TJ.B r2 = r2.S()
                Uj.k r3 = r8.f88218r
                rz.C$c r4 = r8.f88220t
                boolean r5 = r8.f88219s
                r6 = r10
            L_0x00d9:
                java.lang.Object r7 = r2.getValue()
                r11 = r7
                Kj.a r11 = (Kj.a) r11
                Tj.g r12 = r3.f88128m
                TJ.P r13 = r3.U()
                java.lang.Object r13 = r13.getValue()
                Uj.k$d r13 = (Uj.k.d) r13
                java.lang.String r13 = r13.f()
                tz.a r14 = r3.f88133r
                r8.f88203c = r0
                r8.f88204d = r1
                r8.f88205e = r2
                r8.f88206f = r3
                r8.f88207g = r4
                r8.f88208h = r7
                r8.f88209i = r11
                r8.f88210j = r13
                r8.f88211k = r0
                r8.f88212l = r12
                r8.f88214n = r5
                r8.f88215o = r6
                r8.f88216p = r10
                r15 = 2
                r8.f88217q = r15
                java.lang.Object r14 = r14.a(r8)
                if (r14 != r9) goto L_0x011a
                return r9
            L_0x011a:
                r15 = r0
                r0 = r12
                r12 = r5
                r5 = r2
                r2 = r13
                r13 = r7
                r7 = r4
                r4 = r15
                r19 = r3
                r3 = r1
                r1 = r10
                r10 = r11
                r11 = r6
                r6 = r19
            L_0x012a:
                r17 = r14
                rz.K r17 = (rz.K) r17
                java.lang.String r17 = r17.a()
                TJ.B r18 = r6.f88123A
                java.lang.Object r18 = r18.getValue()
                if (r18 == 0) goto L_0x018c
                rz.A r18 = (rz.C15007A) r18
                r8.f88203c = r15
                r8.f88204d = r3
                r8.f88205e = r5
                r8.f88206f = r6
                r8.f88207g = r7
                r8.f88208h = r13
                r8.f88209i = r10
                r8.f88210j = r2
                r8.f88211k = r4
                r8.f88212l = r0
                r8.f88213m = r14
                r8.f88214n = r12
                r8.f88215o = r11
                r8.f88216p = r1
                r10 = 3
                r8.f88217q = r10
                r1 = r4
                r14 = r3
                r3 = r17
                r4 = r18
                r16 = r5
                r5 = r7
                r17 = r6
                r6 = r12
                r18 = r7
                r7 = r22
                java.lang.Object r0 = r0.h(r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L_0x0174
                return r9
            L_0x0174:
                r6 = r11
                r5 = r12
                r1 = r14
                r2 = r16
                r3 = r17
                r4 = r18
            L_0x017d:
                Kj.a r0 = (Kj.a) r0
                boolean r0 = r2.e(r13, r0)
                if (r0 == 0) goto L_0x0188
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x0188:
                r0 = r15
                r10 = 0
                goto L_0x00d9
            L_0x018c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Required value was null."
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Uj.k.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.ScanAndGoCheckoutViewModel$onStoreClosing$1", f = "ScanAndGoCheckoutViewModel.kt", l = {397}, m = "invokeSuspend")
    static final class n extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f88221c;

        /* renamed from: d  reason: collision with root package name */
        int f88222d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f88223e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(k kVar, C17164e<? super n> eVar) {
            super(2, eVar);
            this.f88223e = kVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new n(this.f88223e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((n) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f88222d;
            if (i10 == 0) {
                y.b(obj);
                Oz.b I10 = this.f88223e.f88135t;
                C12832d a10 = C12861b.a(this.f88223e.f88129n);
                String e10 = a10 != null ? a10.e() : null;
                this.f88221c = a10;
                this.f88222d = 1;
                if (I10.a(e10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C12832d dVar = (C12832d) this.f88221c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.ScanAndGoCheckoutViewModel$pollOrderStatus$1", f = "ScanAndGoCheckoutViewModel.kt", l = {282, 285, 284}, m = "invokeSuspend")
    static final class o extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f88224c;

        /* renamed from: d  reason: collision with root package name */
        Object f88225d;

        /* renamed from: e  reason: collision with root package name */
        Object f88226e;

        /* renamed from: f  reason: collision with root package name */
        Object f88227f;

        /* renamed from: g  reason: collision with root package name */
        Object f88228g;

        /* renamed from: h  reason: collision with root package name */
        Object f88229h;

        /* renamed from: i  reason: collision with root package name */
        long f88230i;

        /* renamed from: j  reason: collision with root package name */
        long f88231j;

        /* renamed from: k  reason: collision with root package name */
        int f88232k;

        /* renamed from: l  reason: collision with root package name */
        int f88233l;

        /* renamed from: m  reason: collision with root package name */
        int f88234m;

        /* renamed from: n  reason: collision with root package name */
        private /* synthetic */ Object f88235n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ k f88236o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ long f88237p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ String f88238q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ long f88239r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(k kVar, long j10, String str, long j11, C17164e<? super o> eVar) {
            super(2, eVar);
            this.f88236o = kVar;
            this.f88237p = j10;
            this.f88238q = str;
            this.f88239r = j11;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            o oVar = new o(this.f88236o, this.f88237p, this.f88238q, this.f88239r, eVar);
            oVar.f88235n = obj;
            return oVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((o) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v9, resolved type: QJ.Q} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v5, resolved type: QJ.Q} */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:5|(3:6|7|8)|57|58|(4:61|(2:63|220)(1:219)|217|59)|218|66|(7:69|(3:71|(1:221)|74)|(13:76|77|(1:79)(3:80|81|82)|83|84|85|86|(1:88)(1:89)|90|91|92|93|94)(1:103)|104|105|106|67)|222|73|109|(4:112|(2:114|226)(1:225)|223|110)|224|115|(2:116|(4:118|(3:120|(2:228|122)|123)|(6:125|(1:127)(1:128)|129|(1:131)(1:132)|133|229)(1:230)|134)(1:227))|135|(2:143|(2:146|(4:155|(3:157|(1:158)|233)|161|162)(6:148|(1:150)|151|(1:152)|232|154))(1:145))(2:137|(4:139|(1:140)|231|142))|160|180|(1:212)(3:182|(6:184|(4:187|(2:189|237)(1:236)|234|185)|235|190|(7:193|(3:195|(1:238)|197)|198|(5:200|(1:202)|203|(1:205)(1:206)|207)(1:209)|208|210|191)|239)(0)|211)|213) */
        /* JADX WARNING: Can't wrap try/catch for region: R(9:47|48|49|50|51|52|53|(1:55)(20:56|57|58|(1:59)|218|66|(1:67)|222|73|109|(1:110)|224|115|(3:116|(0)(0)|134)|135|(0)(0)|160|180|(0)(0)|213)|55) */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x02c5, code lost:
            r14 = r20;
            r9 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x02ca, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x02cb, code lost:
            r14 = r20;
            r9 = r26;
            r8 = r30;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x02f2, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0060, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x0440, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x0441, code lost:
            r14 = r20;
            r9 = r26;
            r11 = r30;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0449, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x044a, code lost:
            r14 = r20;
            r11 = r24;
            r9 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x046d, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:214:0x0571, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0224, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0225, code lost:
            r14 = r20;
            r9 = r26;
            r11 = r30;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x02bc, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x02bd, code lost:
            r11 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x02c0, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x02c1, code lost:
            r14 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x02c4, code lost:
            r0 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x030e A[Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x032c A[Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0060 A[ExcHandler: CancellationException (r0v56 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:57:0x01f8] */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x03a4 A[Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x03bf A[Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:182:0x0497  */
        /* JADX WARNING: Removed duplicated region for block: B:212:0x055e  */
        /* JADX WARNING: Removed duplicated region for block: B:215:0x0572  */
        /* JADX WARNING: Removed duplicated region for block: B:227:0x03a0 A[EDGE_INSN: B:227:0x03a0->B:135:0x03a0 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x012b  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0186  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x01b5 A[Catch:{ CancellationException -> 0x0060, all -> 0x0453 }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0213 A[Catch:{ CancellationException -> 0x0060, all -> 0x0224 }] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0239 A[Catch:{ CancellationException -> 0x0060, all -> 0x0224 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r46) {
            /*
                r45 = this;
                r9 = r45
                java.lang.Object r10 = eI.C17187b.f()
                int r0 = r9.f88234m
                r11 = 3
                java.lang.String r12 = "|"
                java.lang.String r13 = "b"
                java.lang.String r14 = "m"
                java.lang.String r15 = "main"
                java.lang.String r8 = "Kt"
                r5 = 1
                r3 = 2
                if (r0 == 0) goto L_0x0109
                if (r0 == r5) goto L_0x00bf
                if (r0 == r3) goto L_0x006b
                if (r0 != r11) goto L_0x0063
                long r0 = r9.f88230i
                java.lang.Object r2 = r9.f88228g
                dj.a r2 = (dj.C11193a) r2
                java.lang.Object r2 = r9.f88227f
                QJ.Q r2 = (QJ.Q) r2
                java.lang.Object r6 = r9.f88226e
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r6 = r9.f88225d
                Uj.k r6 = (Uj.k) r6
                java.lang.Object r7 = r9.f88224c
                QJ.Q r7 = (QJ.Q) r7
                java.lang.Object r7 = r9.f88235n
                QJ.Q r7 = (QJ.Q) r7
                XH.y.b(r46)     // Catch:{ CancellationException -> 0x0060, all -> 0x0054 }
                r17 = r2
                r9 = r3
                r30 = r8
                r16 = r11
                r20 = r12
                r21 = r13
                r25 = r14
                r26 = r15
                r11 = 0
                r12 = 36
                r13 = 0
                r14 = 46
                r2 = r0
                r1 = r46
                goto L_0x01f8
            L_0x0054:
                r0 = move-exception
                r16 = r11
                r21 = r13
                r25 = r14
                r9 = r15
                r11 = r8
                r14 = r12
                goto L_0x0487
            L_0x0060:
                r0 = move-exception
                goto L_0x0571
            L_0x0063:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x006b:
                int r0 = r9.f88233l
                int r1 = r9.f88232k
                long r6 = r9.f88231j
                r20 = r12
                long r11 = r9.f88230i
                java.lang.Object r2 = r9.f88228g
                dj.a r2 = (dj.C11193a) r2
                java.lang.Object r3 = r9.f88227f
                QJ.Q r3 = (QJ.Q) r3
                java.lang.Object r5 = r9.f88226e
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r4 = r9.f88225d
                Uj.k r4 = (Uj.k) r4
                r24 = r0
                java.lang.Object r0 = r9.f88224c
                QJ.Q r0 = (QJ.Q) r0
                r25 = r0
                java.lang.Object r0 = r9.f88235n
                r26 = r0
                QJ.Q r26 = (QJ.Q) r26
                XH.y.b(r46)     // Catch:{ CancellationException -> 0x0060, all -> 0x00b0 }
                r21 = r13
                r0 = r25
                r25 = r14
                r13 = r6
                r7 = r4
                r6 = r5
                r4 = r46
                r5 = r1
                r1 = r24
                r24 = r8
                r8 = r3
                r3 = 2
                r41 = r26
                r26 = r15
                r15 = r41
                goto L_0x019d
            L_0x00b0:
                r0 = move-exception
                r11 = r8
                r21 = r13
                r25 = r14
                r9 = r15
                r14 = r20
                r7 = r26
            L_0x00bb:
                r16 = 3
                goto L_0x0487
            L_0x00bf:
                r20 = r12
                int r0 = r9.f88233l
                int r1 = r9.f88232k
                long r2 = r9.f88231j
                long r4 = r9.f88230i
                java.lang.Object r6 = r9.f88227f
                QJ.Q r6 = (QJ.Q) r6
                java.lang.Object r7 = r9.f88226e
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r11 = r9.f88225d
                Uj.k r11 = (Uj.k) r11
                java.lang.Object r12 = r9.f88224c
                QJ.Q r12 = (QJ.Q) r12
                r24 = r0
                java.lang.Object r0 = r9.f88235n
                r25 = r0
                QJ.Q r25 = (QJ.Q) r25
                XH.y.b(r46)     // Catch:{ CancellationException -> 0x0060, all -> 0x00fa }
                r46 = r11
                r0 = r12
                r11 = r25
                r12 = r7
                r41 = r2
                r2 = r1
                r1 = r24
                r24 = r8
                r43 = r4
                r5 = r6
                r3 = r41
                r6 = r43
                goto L_0x015e
            L_0x00fa:
                r0 = move-exception
                r11 = r8
                r21 = r13
                r9 = r15
                r7 = r25
                r16 = 3
                r25 = r14
                r14 = r20
                goto L_0x0487
            L_0x0109:
                r20 = r12
                XH.y.b(r46)
                java.lang.Object r0 = r9.f88235n
                QJ.Q r0 = (QJ.Q) r0
                r7 = r0
            L_0x0113:
                boolean r0 = QJ.S.h(r7)
                if (r0 == 0) goto L_0x0572
                Uj.k r0 = r9.f88236o
                TJ.B r0 = r0.S()
                java.lang.Object r0 = r0.getValue()
                Kj.a r0 = (Kj.a) r0
                boolean r0 = r0.b()
                if (r0 == 0) goto L_0x0572
                long r4 = r9.f88237p
                Uj.k r11 = r9.f88236o
                java.lang.String r0 = r9.f88238q
                long r2 = r9.f88239r
                XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0060, all -> 0x047c }
                r9.f88235n = r7     // Catch:{ CancellationException -> 0x0060, all -> 0x047c }
                r9.f88224c = r7     // Catch:{ CancellationException -> 0x0060, all -> 0x047c }
                r9.f88225d = r11     // Catch:{ CancellationException -> 0x0060, all -> 0x047c }
                r9.f88226e = r0     // Catch:{ CancellationException -> 0x0060, all -> 0x047c }
                r9.f88227f = r7     // Catch:{ CancellationException -> 0x0060, all -> 0x047c }
                r9.f88230i = r4     // Catch:{ CancellationException -> 0x0060, all -> 0x047c }
                r9.f88231j = r2     // Catch:{ CancellationException -> 0x0060, all -> 0x047c }
                r6 = 0
                r9.f88232k = r6     // Catch:{ CancellationException -> 0x0060, all -> 0x047c }
                r9.f88233l = r6     // Catch:{ CancellationException -> 0x0060, all -> 0x047c }
                r12 = 1
                r9.f88234m = r12     // Catch:{ CancellationException -> 0x0060, all -> 0x047c }
                java.lang.Object r1 = QJ.C16297b0.b(r4, r9)     // Catch:{ CancellationException -> 0x0060, all -> 0x047c }
                if (r1 != r10) goto L_0x0152
                return r10
            L_0x0152:
                r12 = r0
                r1 = r6
                r0 = r7
                r24 = r8
                r46 = r11
                r11 = r0
                r6 = r4
                r5 = r11
                r3 = r2
                r2 = r1
            L_0x015e:
                dj.a r8 = r46.f88136u     // Catch:{ CancellationException -> 0x0060, all -> 0x046f }
                r9.f88235n = r11     // Catch:{ CancellationException -> 0x0060, all -> 0x046f }
                r9.f88224c = r0     // Catch:{ CancellationException -> 0x0060, all -> 0x046f }
                r25 = r0
                r0 = r46
                r9.f88225d = r0     // Catch:{ CancellationException -> 0x0060, all -> 0x046f }
                r9.f88226e = r12     // Catch:{ CancellationException -> 0x0060, all -> 0x046f }
                r9.f88227f = r5     // Catch:{ CancellationException -> 0x0060, all -> 0x046f }
                r9.f88228g = r8     // Catch:{ CancellationException -> 0x0060, all -> 0x046f }
                r9.f88230i = r6     // Catch:{ CancellationException -> 0x0060, all -> 0x046f }
                r9.f88231j = r3     // Catch:{ CancellationException -> 0x0060, all -> 0x046f }
                r9.f88232k = r2     // Catch:{ CancellationException -> 0x0060, all -> 0x046f }
                r9.f88233l = r1     // Catch:{ CancellationException -> 0x0060, all -> 0x046f }
                r27 = r3
                r3 = 2
                r9.f88234m = r3     // Catch:{ CancellationException -> 0x0060, all -> 0x046f }
                java.lang.Object r4 = r0.T(r9)     // Catch:{ CancellationException -> 0x0060, all -> 0x046f }
                if (r4 != r10) goto L_0x0186
                return r10
            L_0x0186:
                r21 = r13
                r26 = r15
                r15 = r11
                r41 = r6
                r7 = r0
                r6 = r12
                r0 = r25
                r11 = r41
                r25 = r14
                r13 = r27
                r43 = r5
                r5 = r2
                r2 = r8
                r8 = r43
            L_0x019d:
                r27 = r4
                java.lang.String r27 = (java.lang.String) r27     // Catch:{ CancellationException -> 0x0060, all -> 0x0453 }
                TJ.B r28 = r7.S()     // Catch:{ CancellationException -> 0x0060, all -> 0x0453 }
                java.lang.Object r28 = r28.getValue()     // Catch:{ CancellationException -> 0x0060, all -> 0x0453 }
                Kj.a r28 = (Kj.a) r28     // Catch:{ CancellationException -> 0x0060, all -> 0x0453 }
                TJ.B r29 = r7.f88123A     // Catch:{ CancellationException -> 0x0060, all -> 0x0453 }
                java.lang.Object r29 = r29.getValue()     // Catch:{ CancellationException -> 0x0060, all -> 0x0453 }
                if (r29 == 0) goto L_0x045d
                rz.A r29 = (rz.C15007A) r29     // Catch:{ CancellationException -> 0x0060, all -> 0x0453 }
                r9.f88235n = r15     // Catch:{ CancellationException -> 0x0060, all -> 0x0453 }
                r9.f88224c = r0     // Catch:{ CancellationException -> 0x0060, all -> 0x0453 }
                r9.f88225d = r7     // Catch:{ CancellationException -> 0x0060, all -> 0x0453 }
                r9.f88226e = r6     // Catch:{ CancellationException -> 0x0060, all -> 0x0453 }
                r9.f88227f = r8     // Catch:{ CancellationException -> 0x0060, all -> 0x0453 }
                r9.f88228g = r2     // Catch:{ CancellationException -> 0x0060, all -> 0x0453 }
                r9.f88229h = r4     // Catch:{ CancellationException -> 0x0060, all -> 0x0453 }
                r9.f88230i = r11     // Catch:{ CancellationException -> 0x0060, all -> 0x0453 }
                r9.f88231j = r13     // Catch:{ CancellationException -> 0x0060, all -> 0x0453 }
                r9.f88232k = r5     // Catch:{ CancellationException -> 0x0060, all -> 0x0453 }
                r9.f88233l = r1     // Catch:{ CancellationException -> 0x0060, all -> 0x0453 }
                r4 = 3
                r9.f88234m = r4     // Catch:{ CancellationException -> 0x0060, all -> 0x0449 }
                r1 = r2
                r5 = 0
                r2 = r27
                r9 = r3
                r3 = r6
                r16 = r4
                r22 = r11
                r6 = 0
                r11 = r5
                r4 = r13
                r13 = r6
                r12 = 36
                r6 = r28
                r0 = r7
                r14 = 46
                r7 = r29
                r17 = r8
                r30 = r24
                r8 = r45
                java.lang.Object r1 = r1.a(r2, r3, r4, r6, r7, r8)     // Catch:{ CancellationException -> 0x0060, all -> 0x0440 }
                if (r1 != r10) goto L_0x01f4
                return r10
            L_0x01f4:
                r6 = r0
                r7 = r15
                r2 = r22
            L_0x01f8:
                rz.C r1 = (rz.C) r1     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                qv.e r0 = qv.e.DEBUG     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                qv.d r4 = qv.d.f102012a     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                java.util.List r4 = r4.a()     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                r5.<init>()     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
            L_0x020d:
                boolean r8 = r4.hasNext()     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                if (r8 == 0) goto L_0x022d
                java.lang.Object r8 = r4.next()     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                r15 = r8
                qv.b r15 = (qv.C11819b) r15     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                boolean r15 = r15.b(r0, r13)     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                if (r15 == 0) goto L_0x020d
                r5.add(r8)     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                goto L_0x020d
            L_0x0224:
                r0 = move-exception
                r14 = r20
                r9 = r26
                r11 = r30
                goto L_0x0487
            L_0x022d:
                java.util.Iterator r4 = r5.iterator()     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                r5 = r11
                r8 = r5
            L_0x0233:
                boolean r15 = r4.hasNext()     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                if (r15 == 0) goto L_0x025b
                java.lang.Object r15 = r4.next()     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                r31 = r15
                qv.b r31 = (qv.C11819b) r31     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                r15 = 0
                if (r5 != 0) goto L_0x0267
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                r5.<init>()     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                java.lang.String r13 = "Poll Interval: "
                r5.append(r13)     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                r5.append(r2)     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                java.lang.String r5 = r5.toString()     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                java.lang.String r5 = qv.C11818a.a(r5, r15)     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
                if (r5 != 0) goto L_0x0263
            L_0x025b:
                r14 = r20
                r9 = r26
                r11 = r30
                goto L_0x02f5
            L_0x0263:
                java.lang.String r5 = qv.C11820c.a(r5)     // Catch:{ CancellationException -> 0x0060, all -> 0x0224 }
            L_0x0267:
                if (r8 != 0) goto L_0x02d2
                java.lang.Class r8 = r17.getClass()     // Catch:{ CancellationException -> 0x0060, all -> 0x02ca }
                java.lang.String r8 = r8.getName()     // Catch:{ CancellationException -> 0x0060, all -> 0x02ca }
                kotlin.jvm.internal.C17542s.g(r8)     // Catch:{ CancellationException -> 0x0060, all -> 0x02ca }
                java.lang.String r13 = HJ.C15854t.s1(r8, r12, r11, r9, r11)     // Catch:{ CancellationException -> 0x0060, all -> 0x02ca }
                java.lang.String r13 = HJ.C15854t.o1(r13, r14, r11, r9, r11)     // Catch:{ CancellationException -> 0x0060, all -> 0x02ca }
                int r18 = r13.length()     // Catch:{ CancellationException -> 0x0060, all -> 0x02ca }
                if (r18 != 0) goto L_0x0286
                r13 = r8
                r8 = r30
                goto L_0x028c
            L_0x0286:
                r8 = r30
                java.lang.String r13 = HJ.C15854t.P0(r13, r8)     // Catch:{ CancellationException -> 0x0060, all -> 0x02c4 }
            L_0x028c:
                java.lang.Thread r18 = java.lang.Thread.currentThread()     // Catch:{ CancellationException -> 0x0060, all -> 0x02c4 }
                java.lang.String r14 = r18.getName()     // Catch:{ CancellationException -> 0x0060, all -> 0x02c4 }
                r9 = r26
                r11 = 1
                boolean r14 = HJ.C15854t.b0(r14, r9, r11)     // Catch:{ CancellationException -> 0x0060, all -> 0x02c0 }
                if (r14 == 0) goto L_0x02a0
                r14 = r25
                goto L_0x02a2
            L_0x02a0:
                r14 = r21
            L_0x02a2:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0060, all -> 0x02c0 }
                r11.<init>()     // Catch:{ CancellationException -> 0x0060, all -> 0x02c0 }
                r11.append(r14)     // Catch:{ CancellationException -> 0x0060, all -> 0x02c0 }
                r14 = r20
                r11.append(r14)     // Catch:{ CancellationException -> 0x0060, all -> 0x02bc }
                r11.append(r13)     // Catch:{ CancellationException -> 0x0060, all -> 0x02bc }
                java.lang.String r11 = r11.toString()     // Catch:{ CancellationException -> 0x0060, all -> 0x02bc }
                r41 = r11
                r11 = r8
                r8 = r41
                goto L_0x02d8
            L_0x02bc:
                r0 = move-exception
            L_0x02bd:
                r11 = r8
                goto L_0x0487
            L_0x02c0:
                r0 = move-exception
                r14 = r20
                goto L_0x02bd
            L_0x02c4:
                r0 = move-exception
                r14 = r20
                r9 = r26
                goto L_0x02bd
            L_0x02ca:
                r0 = move-exception
                r14 = r20
                r9 = r26
                r8 = r30
                goto L_0x02bd
            L_0x02d2:
                r14 = r20
                r9 = r26
                r11 = r30
            L_0x02d8:
                r34 = 0
                r32 = r0
                r33 = r8
                r35 = r15
                r36 = r5
                r31.a(r32, r33, r34, r35, r36)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r26 = r9
                r30 = r11
                r20 = r14
                r9 = 2
                r11 = 0
                r13 = 0
                r14 = 46
                goto L_0x0233
            L_0x02f2:
                r0 = move-exception
                goto L_0x0487
            L_0x02f5:
                qv.e r0 = qv.e.DEBUG     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                qv.d r2 = qv.d.f102012a     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                java.util.List r2 = r2.a()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r3.<init>()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
            L_0x0308:
                boolean r4 = r2.hasNext()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                if (r4 == 0) goto L_0x0320
                java.lang.Object r4 = r2.next()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r5 = r4
                qv.b r5 = (qv.C11819b) r5     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r8 = 0
                boolean r5 = r5.b(r0, r8)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                if (r5 == 0) goto L_0x0308
                r3.add(r4)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                goto L_0x0308
            L_0x0320:
                java.util.Iterator r2 = r3.iterator()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r3 = 0
                r4 = 0
            L_0x0326:
                boolean r5 = r2.hasNext()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                if (r5 == 0) goto L_0x03a0
                java.lang.Object r5 = r2.next()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r35 = r5
                qv.b r35 = (qv.C11819b) r35     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r5 = 0
                if (r3 != 0) goto L_0x0346
                java.lang.String r3 = r1.toString()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                java.lang.String r3 = qv.C11818a.a(r3, r5)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                if (r3 != 0) goto L_0x0342
                goto L_0x03a0
            L_0x0342:
                java.lang.String r3 = qv.C11820c.a(r3)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
            L_0x0346:
                if (r4 != 0) goto L_0x0390
                java.lang.Class r4 = r17.getClass()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                java.lang.String r4 = r4.getName()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                kotlin.jvm.internal.C17542s.g(r4)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r8 = 2
                r13 = 0
                java.lang.String r15 = HJ.C15854t.s1(r4, r12, r13, r8, r13)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r12 = 46
                java.lang.String r15 = HJ.C15854t.o1(r15, r12, r13, r8, r13)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                int r8 = r15.length()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                if (r8 != 0) goto L_0x0366
                goto L_0x036a
            L_0x0366:
                java.lang.String r4 = HJ.C15854t.P0(r15, r11)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
            L_0x036a:
                java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                java.lang.String r8 = r8.getName()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r12 = 1
                boolean r8 = HJ.C15854t.b0(r8, r9, r12)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                if (r8 == 0) goto L_0x037c
                r8 = r25
                goto L_0x037e
            L_0x037c:
                r8 = r21
            L_0x037e:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r12.<init>()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r12.append(r8)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r12.append(r14)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r12.append(r4)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                java.lang.String r4 = r12.toString()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
            L_0x0390:
                r38 = 0
                r36 = r0
                r37 = r4
                r39 = r5
                r40 = r3
                r35.a(r36, r37, r38, r39, r40)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r12 = 36
                goto L_0x0326
            L_0x03a0:
                boolean r0 = r1 instanceof rz.C.b     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                if (r0 == 0) goto L_0x03bf
                rz.C$b r1 = (rz.C.b) r1     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                Kj.a$b r0 = r6.R(r1)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                if (r0 == 0) goto L_0x0432
                TJ.B r1 = r6.S()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
            L_0x03b0:
                java.lang.Object r2 = r1.getValue()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r3 = r2
                Kj.a r3 = (Kj.a) r3     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                boolean r2 = r1.e(r2, r0)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                if (r2 == 0) goto L_0x03b0
                goto L_0x0432
            L_0x03bf:
                boolean r0 = r1 instanceof rz.C.c     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                if (r0 == 0) goto L_0x03c9
                rz.C$c r1 = (rz.C.c) r1     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r6.d0(r1)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                goto L_0x0432
            L_0x03c9:
                boolean r0 = r1 instanceof rz.C.d     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                if (r0 == 0) goto L_0x0417
                TJ.B r0 = r6.S()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                java.lang.Object r0 = r0.getValue()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                boolean r0 = r0 instanceof Kj.a.d     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                if (r0 != 0) goto L_0x03e3
                r6.j0()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                aj.c r0 = r6.f88138w     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r0.e()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
            L_0x03e3:
                TJ.B r0 = r6.S()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
            L_0x03e7:
                java.lang.Object r2 = r0.getValue()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r3 = r2
                Kj.a r3 = (Kj.a) r3     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                Kj.a$d r3 = new Kj.a$d     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r4 = r1
                rz.C$d r4 = (rz.C.d) r4     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                java.lang.String r31 = r4.c()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r4 = r1
                rz.C$d r4 = (rz.C.d) r4     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                java.lang.String r32 = r4.a()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r4 = r1
                rz.C$d r4 = (rz.C.d) r4     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                java.lang.String r33 = r4.b()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r35 = 8
                r36 = 0
                r34 = 0
                r30 = r3
                r30.<init>(r31, r32, r33, r34, r35, r36)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                boolean r2 = r0.e(r2, r3)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                if (r2 == 0) goto L_0x03e7
                goto L_0x0432
            L_0x0417:
                rz.C$e r0 = rz.C.e.f130717a     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                boolean r0 = kotlin.jvm.internal.C17542s.e(r1, r0)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                if (r0 == 0) goto L_0x043a
                TJ.B r0 = r6.S()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
            L_0x0423:
                java.lang.Object r1 = r0.getValue()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r2 = r1
                Kj.a r2 = (Kj.a) r2     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                Kj.a$e r2 = Kj.a.e.f82802a     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                boolean r1 = r0.e(r1, r2)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                if (r1 == 0) goto L_0x0423
            L_0x0432:
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                goto L_0x0491
            L_0x043a:
                XH.t r0 = new XH.t     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                r0.<init>()     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
                throw r0     // Catch:{ CancellationException -> 0x0060, all -> 0x02f2 }
            L_0x0440:
                r0 = move-exception
                r14 = r20
                r9 = r26
                r11 = r30
            L_0x0447:
                r7 = r15
                goto L_0x0487
            L_0x0449:
                r0 = move-exception
                r16 = r4
                r14 = r20
                r11 = r24
                r9 = r26
                goto L_0x0447
            L_0x0453:
                r0 = move-exception
                r14 = r20
                r11 = r24
                r9 = r26
                r16 = 3
                goto L_0x0447
            L_0x045d:
                r14 = r20
                r11 = r24
                r9 = r26
                r16 = 3
                java.lang.String r0 = "Required value was null."
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ CancellationException -> 0x0060, all -> 0x046d }
                r1.<init>(r0)     // Catch:{ CancellationException -> 0x0060, all -> 0x046d }
                throw r1     // Catch:{ CancellationException -> 0x0060, all -> 0x046d }
            L_0x046d:
                r0 = move-exception
                goto L_0x0447
            L_0x046f:
                r0 = move-exception
                r7 = r11
                r21 = r13
                r25 = r14
                r9 = r15
                r14 = r20
                r11 = r24
                goto L_0x00bb
            L_0x047c:
                r0 = move-exception
                r11 = r8
                r21 = r13
                r25 = r14
                r9 = r15
                r14 = r20
                goto L_0x00bb
            L_0x0487:
                XH.x$a r1 = XH.x.f139812b
                java.lang.Object r0 = XH.y.a(r0)
                java.lang.Object r0 = XH.x.b(r0)
            L_0x0491:
                java.lang.Throwable r0 = XH.x.e(r0)
                if (r0 == 0) goto L_0x055e
                boolean r1 = r0 instanceof java.util.concurrent.CancellationException
                if (r1 != 0) goto L_0x0554
                qv.e r8 = qv.e.WARN
                qv.d r1 = qv.d.f102012a
                java.util.List r1 = r1.a()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x04ae:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x04c6
                java.lang.Object r3 = r1.next()
                r4 = r3
                qv.b r4 = (qv.C11819b) r4
                r12 = 0
                boolean r4 = r4.b(r8, r12)
                if (r4 == 0) goto L_0x04ae
                r2.add(r3)
                goto L_0x04ae
            L_0x04c6:
                r12 = 0
                java.util.Iterator r13 = r2.iterator()
                r1 = 0
                r2 = 0
            L_0x04cd:
                boolean r3 = r13.hasNext()
                if (r3 == 0) goto L_0x0554
                java.lang.Object r3 = r13.next()
                qv.b r3 = (qv.C11819b) r3
                if (r2 != 0) goto L_0x04e9
                java.lang.String r2 = "Error while polling order status"
                java.lang.String r2 = qv.C11818a.a(r2, r0)
                if (r2 != 0) goto L_0x04e5
                goto L_0x0554
            L_0x04e5:
                java.lang.String r2 = qv.C11820c.a(r2)
            L_0x04e9:
                r15 = r2
                if (r1 != 0) goto L_0x0539
                java.lang.Class r1 = r7.getClass()
                java.lang.String r1 = r1.getName()
                kotlin.jvm.internal.C17542s.g(r1)
                r4 = 0
                r5 = 2
                r6 = 36
                java.lang.String r2 = HJ.C15854t.s1(r1, r6, r4, r5, r4)
                r12 = 46
                java.lang.String r2 = HJ.C15854t.o1(r2, r12, r4, r5, r4)
                int r17 = r2.length()
                if (r17 != 0) goto L_0x050c
                goto L_0x0510
            L_0x050c:
                java.lang.String r1 = HJ.C15854t.P0(r2, r11)
            L_0x0510:
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                java.lang.String r2 = r2.getName()
                r12 = 1
                boolean r2 = HJ.C15854t.b0(r2, r9, r12)
                if (r2 == 0) goto L_0x0522
                r2 = r25
                goto L_0x0524
            L_0x0522:
                r2 = r21
            L_0x0524:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                r4.append(r14)
                r4.append(r1)
                java.lang.String r1 = r4.toString()
            L_0x0536:
                r17 = r1
                goto L_0x053e
            L_0x0539:
                r5 = 2
                r6 = 36
                r12 = 1
                goto L_0x0536
            L_0x053e:
                r4 = 0
                r1 = r3
                r2 = r8
                r3 = r17
                r19 = 0
                r20 = r5
                r5 = r0
                r22 = r6
                r6 = r15
                r1.a(r2, r3, r4, r5, r6)
                r2 = r15
                r1 = r17
                r12 = 0
                goto L_0x04cd
            L_0x0554:
                r12 = 1
                r19 = 0
                r20 = 2
                r22 = 36
                XH.N r0 = XH.C16807N.f139792a
                goto L_0x0565
            L_0x055e:
                r12 = 1
                r19 = 0
                r20 = 2
                r22 = 36
            L_0x0565:
                r15 = r9
                r8 = r11
                r20 = r14
                r13 = r21
                r14 = r25
                r9 = r45
                goto L_0x0113
            L_0x0571:
                throw r0
            L_0x0572:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Uj.k.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LUj/k$d;", "data", "Lrz/A;", "checkout", "LUj/k$e;", "error", "LKj/a;", "checkoutState", "LUj/k$f;", "uiEvent", "<anonymous>", "(LUj/k$d;Lrz/A;LUj/k$e;LKj/a;LUj/k$f;)LUj/k$d;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.viewmodel.ScanAndGoCheckoutViewModel$uiData$1", f = "ScanAndGoCheckoutViewModel.kt", l = {}, m = "invokeSuspend")
    static final class p extends kotlin.coroutines.jvm.internal.l implements nI.t<d, C15007A, e, Kj.a, f, C17164e<? super d>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f88240c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f88241d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f88242e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f88243f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f88244g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f88245h;

        p(C17164e<? super p> eVar) {
            super(6, eVar);
        }

        /* renamed from: i */
        public final Object o(d dVar, C15007A a10, e eVar, Kj.a aVar, f fVar, C17164e<? super d> eVar2) {
            p pVar = new p(eVar2);
            pVar.f88241d = dVar;
            pVar.f88242e = a10;
            pVar.f88243f = eVar;
            pVar.f88244g = aVar;
            pVar.f88245h = fVar;
            return pVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f88240c == 0) {
                y.b(obj);
                return d.b((d) this.f88241d, (C15007A) this.f88242e, false, (e) this.f88243f, (Kj.a) this.f88244g, (f) this.f88245h, (String) null, false, 98, (Object) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public k(C10942g gVar, C12860a aVar, A a10, C11418a aVar2, Dz.a aVar3, C15100a aVar4, C10943h hVar, Oz.b bVar, C11193a aVar5, C11854e eVar, C11063c cVar, U u10) {
        C10942g gVar2 = gVar;
        C12860a aVar6 = aVar;
        A a11 = a10;
        C11418a aVar7 = aVar2;
        Dz.a aVar8 = aVar3;
        C15100a aVar9 = aVar4;
        C10943h hVar2 = hVar;
        Oz.b bVar2 = bVar;
        C11193a aVar10 = aVar5;
        C11854e eVar2 = eVar;
        C11063c cVar2 = cVar;
        U u11 = u10;
        C17542s.j(gVar2, "checkoutPaymentCompletedUseCase");
        C17542s.j(aVar6, "localStoreSelectionRepository");
        C17542s.j(a11, "scanAndGoCancelOrderUseCase");
        C17542s.j(aVar7, "statusPollInterval");
        C17542s.j(aVar8, "shouldGiveFeedbackUseCase");
        C17542s.j(aVar9, "getProfileStateUseCase");
        C17542s.j(hVar2, "checkoutUseCase");
        C17542s.j(bVar2, "scanAndGoCleanUpUseCase");
        C17542s.j(aVar10, "checkoutStatusUseCase");
        C17542s.j(eVar2, "vibrationFeedback");
        C17542s.j(cVar2, "checkoutAnalytics");
        C17542s.j(u11, "savedStateHandle");
        this.f88128m = gVar2;
        this.f88129n = aVar6;
        this.f88130o = a11;
        this.f88131p = aVar7;
        this.f88132q = aVar8;
        this.f88133r = aVar9;
        this.f88134s = hVar2;
        this.f88135t = bVar2;
        this.f88136u = aVar10;
        this.f88137v = eVar2;
        this.f88138w = cVar2;
        C16505B<f> a12 = C16521S.a(null);
        this.f88139x = a12;
        C16505B<e> a13 = C16521S.a(null);
        this.f88140y = a13;
        C16505B<Kj.a> a14 = C16521S.a(a.C1635a.f82779a);
        this.f88141z = a14;
        C16505B<C15007A> a15 = C16521S.a(null);
        this.f88123A = a15;
        C16505B<d> a16 = C16521S.a(new d((C15007A) null, false, (e) null, (Kj.a) null, (f) null, (String) null, false, 127, (DefaultConstructorMarker) null));
        this.f88124B = a16;
        this.f88125C = C16534i.c0(C16534i.k(a16, a15, a13, a14, a12, new p((C17164e<? super p>) null)), g0.a(this), ip.f.a(), new d((C15007A) null, false, (e) null, (Kj.a) null, (f) null, (String) null, false, 127, (DefaultConstructorMarker) null));
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, u11, (C17164e<? super a>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final a.b R(C.b bVar) {
        if (bVar instanceof C.b.a) {
            C15007A value = this.f88123A.getValue();
            if (value != null) {
                B f10 = value.f();
                if (f10 != null) {
                    this.f88130o.a(f10);
                }
                return new a.b(((C.b.a) bVar).a(), false, 2, (DefaultConstructorMarker) null);
            }
            throw new IllegalArgumentException("Required value was null.");
        } else if (bVar instanceof C.b.C3232b) {
            return null;
        } else {
            if (bVar instanceof C.b.c) {
                this.f88140y.setValue(new e.b(((C.b.c) bVar).a()));
                return null;
            }
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object T(dI.C17164e<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Uj.k.g
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Uj.k$g r0 = (Uj.k.g) r0
            int r1 = r0.f88188g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f88188g = r1
            goto L_0x0018
        L_0x0013:
            Uj.k$g r0 = new Uj.k$g
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f88186e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f88188g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f88185d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f88184c
            Uj.k r6 = (Uj.k) r6
            XH.y.b(r1)
            goto L_0x0053
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            FB.a r1 = r5.f88129n
            TJ.g r1 = r1.b()
            TJ.g r1 = TJ.C16534i.A(r1)
            r0.f88184c = r5
            r0.f88185d = r6
            r0.f88188g = r4
            java.lang.Object r1 = TJ.C16534i.B(r1, r0)
            if (r1 != r2) goto L_0x0053
            return r2
        L_0x0053:
            EB.d r1 = (EB.C12832d) r1
            java.lang.String r6 = r1.e()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Uj.k.T(dI.e):java.lang.Object");
    }

    private final void W(c.d dVar) {
        dVar.a().c(this.f88127E);
    }

    private final void Y() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new h(this, (C17164e<? super h>) null), 3, (Object) null);
    }

    private final F0 Z() {
        return C16314k.d(g0.a(this), (C17168i) null, (T) null, new i(this, (C17164e<? super i>) null), 3, (Object) null);
    }

    private final F0 a0() {
        return C16314k.d(g0.a(this), (C17168i) null, (T) null, new j(this, (C17164e<? super j>) null), 3, (Object) null);
    }

    private final void b0() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C1848k(this, (C17164e<? super C1848k>) null), 3, (Object) null);
    }

    private final void c0() {
        B b10 = null;
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new l(this, (C17164e<? super l>) null), 3, (Object) null);
        C16505B<f> b11 = this.f88139x;
        C15007A e10 = this.f88125C.getValue().e();
        if (e10 != null) {
            b10 = e10.f();
        }
        b11.setValue(new f.b(b10 != null));
    }

    /* access modifiers changed from: private */
    public final void d0(C.c cVar) {
        i0();
        j0();
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new m(this, this.f88124B.getValue().i(), cVar, (C17164e<? super m>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void e0() {
        this.f88139x.setValue(f.d.f88182a);
    }

    private final F0 f0() {
        return C16314k.d(g0.a(this), (C17168i) null, (T) null, new n(this, (C17164e<? super n>) null), 3, (Object) null);
    }

    private final void g0() {
        this.f88138w.i(this.f88141z.getValue().a());
        this.f88139x.setValue(f.e.f88183a);
    }

    /* access modifiers changed from: private */
    public final void h0(String str, long j10, long j11) {
        i0();
        this.f88126D = C16314k.d(g0.a(this), (C17168i) null, (T) null, new o(this, j11, str, j10, (C17164e<? super o>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void j0() {
        this.f88137v.a(C11854e.a.f102378a.a());
    }

    public final C16505B<Kj.a> S() {
        return this.f88141z;
    }

    public final C16519P<d> U() {
        return this.f88125C;
    }

    public final C16505B<f> V() {
        return this.f88139x;
    }

    public final void X(c cVar) {
        C17542s.j(cVar, "action");
        if (cVar instanceof c.d) {
            W((c.d) cVar);
        } else if (C17542s.e(cVar, c.e.f88162a)) {
            Y();
        } else if (C17542s.e(cVar, c.i.f88166a)) {
            g0();
        } else if (C17542s.e(cVar, c.a.f88158a)) {
            Z();
        } else if (C17542s.e(cVar, c.C1846c.f88160a)) {
            f0();
        } else if (C17542s.e(cVar, c.b.f88159a)) {
            a0();
        } else if (C17542s.e(cVar, c.h.f88165a)) {
            e0();
        } else if (C17542s.e(cVar, c.f.f88163a)) {
            b0();
        } else if (C17542s.e(cVar, c.g.f88164a)) {
            c0();
        } else {
            throw new t();
        }
    }

    public final void i0() {
        F0 f02 = this.f88126D;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        i0();
        super.onCleared();
    }
}
