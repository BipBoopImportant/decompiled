package BC;

import BC.C12611a;
import BC.C12612b;
import BC.C12616f;
import CC.C12692a;
import EB.C12832d;
import FB.C12860a;
import FB.C12861b;
import FC.C12865a;
import HJ.C15854t;
import KJ.C15987c;
import QJ.F0;
import QJ.Q;
import QJ.T;
import Ry.f;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.x;
import XH.y;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fI.C17220a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import rz.C15014g;
import sp.C11879a;
import tC.C15063a;
import uC.C15113a;
import uC.C15115c;
import zC.C15329a;
import zC.C15330b;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004BA\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010\u0017J\u000f\u0010!\u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\u0017J\u0017\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00030@8\u0016X\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8BX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"LBC/g;", "Lsp/a;", "LBC/b;", "LBC/f;", "Landroidx/lifecycle/f0;", "LzC/a;", "getTimeslotUseCase", "LRy/f;", "scanAndGoCartRepositoryFactory", "LCC/a;", "horizontalImageContentDataUiMapper", "LzC/b;", "saveSelectedTimeSlotUseCase", "Landroidx/lifecycle/U;", "savedStateHandle", "LtC/a;", "timeSlotPickerAnalytics", "LFB/a;", "localStoreSelectionRepository", "<init>", "(LzC/a;LRy/f;LCC/a;LzC/b;Landroidx/lifecycle/U;LtC/a;LFB/a;)V", "LXH/N;", "J", "()V", "LBC/b$c;", "action", "R", "(LBC/b$c;)V", "LBC/a;", "navAction", "O", "(LBC/a;)V", "P", "N", "LBC/b$e;", "timeSlotSelected", "Q", "(LBC/b$e;)V", "LuC/c;", "timeSlotItem", "", "L", "(LuC/c;)Ljava/lang/Integer;", "M", "(LBC/b;)V", "m", "LzC/a;", "n", "LRy/f;", "o", "LCC/a;", "p", "LzC/b;", "q", "Landroidx/lifecycle/U;", "r", "LtC/a;", "s", "LFB/a;", "LTJ/B;", "LBC/c;", "t", "LTJ/B;", "uiContent", "LTJ/P;", "u", "LTJ/P;", "getState", "()LTJ/P;", "state", "", "K", "()Ljava/lang/String;", "currentStoreId", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: BC.g  reason: case insensitive filesystem */
public final class C12617g extends f0 implements C11879a<C12612b, C12616f> {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C15329a f107814m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final f f107815n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C12692a f107816o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C15330b f107817p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final U f107818q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C15063a f107819r;

    /* renamed from: s  reason: collision with root package name */
    private final C12860a f107820s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final C16505B<C12613c> f107821t;

    /* renamed from: u  reason: collision with root package name */
    private final C16519P<C12616f> f107822u;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.timeslot.impl.feature.presentation.TimeslotPickerViewModel$fetch$1", f = "TimeslotPickerViewModel.kt", l = {91, 94}, m = "invokeSuspend")
    /* renamed from: BC.g$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f107823c;

        /* renamed from: d  reason: collision with root package name */
        Object f107824d;

        /* renamed from: e  reason: collision with root package name */
        Object f107825e;

        /* renamed from: f  reason: collision with root package name */
        Object f107826f;

        /* renamed from: g  reason: collision with root package name */
        Object f107827g;

        /* renamed from: h  reason: collision with root package name */
        int f107828h;

        /* renamed from: i  reason: collision with root package name */
        int f107829i;

        /* renamed from: j  reason: collision with root package name */
        int f107830j;

        /* renamed from: k  reason: collision with root package name */
        private /* synthetic */ Object f107831k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C12617g f107832l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C12617g gVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f107832l = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f107832l, eVar);
            aVar.f107831k = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0129  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                r23 = this;
                r0 = r23
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f107830j
                r3 = 1
                r4 = 2
                r5 = 0
                if (r2 == 0) goto L_0x0050
                if (r2 == r3) goto L_0x003e
                if (r2 != r4) goto L_0x0036
                java.lang.Object r1 = r0.f107827g
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f107826f
                java.util.Collection r1 = (java.util.Collection) r1
                java.lang.Object r1 = r0.f107825e
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f107824d
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f107823c
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r2 = r0.f107831k
                QJ.Q r2 = (QJ.Q) r2
                XH.y.b(r24)
                r6 = r24
                XH.x r6 = (XH.x) r6
                java.lang.Object r6 = r6.j()
                goto L_0x00d6
            L_0x0036:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x003e:
                java.lang.Object r2 = r0.f107825e
                BC.c r2 = (BC.C12613c) r2
                java.lang.Object r2 = r0.f107823c
                TJ.B r2 = (TJ.C16505B) r2
                java.lang.Object r2 = r0.f107831k
                QJ.Q r2 = (QJ.Q) r2
                XH.y.b(r24)
                r6 = r24
                goto L_0x0094
            L_0x0050:
                XH.y.b(r24)
                java.lang.Object r2 = r0.f107831k
                QJ.Q r2 = (QJ.Q) r2
                BC.g r6 = r0.f107832l
                TJ.B r6 = r6.f107821t
            L_0x005d:
                java.lang.Object r7 = r6.getValue()
                r8 = r7
                BC.c r8 = (BC.C12613c) r8
                r13 = 12
                r14 = 0
                r9 = 1
                r10 = 0
                r11 = 0
                r12 = 0
                BC.c r8 = BC.C12613c.b(r8, r9, r10, r11, r12, r13, r14)
                boolean r9 = r6.e(r7, r8)
                if (r9 == 0) goto L_0x005d
                BC.g r9 = r0.f107832l
                Ry.f r9 = r9.f107815n
                Ry.e r9 = r9.invoke()
                r0.f107831k = r2
                r0.f107823c = r6
                r0.f107824d = r7
                r0.f107825e = r8
                r0.f107828h = r5
                r0.f107829i = r5
                r0.f107830j = r3
                java.lang.Object r6 = r9.h(r0)
                if (r6 != r1) goto L_0x0094
                return r1
            L_0x0094:
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r8 = r6.iterator()
            L_0x009f:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L_0x00b6
                java.lang.Object r9 = r8.next()
                r10 = r9
                rz.g r10 = (rz.C15014g) r10
                boolean r10 = rz.J.b(r10)
                if (r10 == 0) goto L_0x009f
                r7.add(r9)
                goto L_0x009f
            L_0x00b6:
                BC.g r9 = r0.f107832l
                zC.a r9 = r9.f107814m
                r0.f107831k = r2
                r0.f107823c = r7
                r0.f107824d = r6
                r0.f107825e = r6
                r0.f107826f = r7
                r0.f107827g = r8
                r0.f107828h = r5
                r0.f107829i = r5
                r0.f107830j = r4
                java.lang.Object r6 = r9.a(r7, r0)
                if (r6 != r1) goto L_0x00d5
                return r1
            L_0x00d5:
                r1 = r7
            L_0x00d6:
                BC.g r7 = r0.f107832l
                boolean r8 = XH.x.h(r6)
                if (r8 == 0) goto L_0x0121
                r15 = r6
                uC.a r15 = (uC.C15113a) r15
                TJ.B r14 = r7.f107821t
            L_0x00e5:
                java.lang.Object r13 = r14.getValue()
                r16 = r13
                BC.c r16 = (BC.C12613c) r16
                BC.d r8 = r16.c()
                CC.a r9 = r7.f107816o
                KJ.c r9 = r9.a(r1)
                r17 = 8
                r18 = 0
                r12 = 0
                r10 = r1
                r11 = r15
                r3 = r13
                r13 = r17
                r4 = r14
                r14 = r18
                BC.d r19 = BC.C12614d.b(r8, r9, r10, r11, r12, r13, r14)
                r21 = 10
                r22 = 0
                r17 = 0
                r20 = 0
                BC.c r8 = BC.C12613c.b(r16, r17, r18, r19, r20, r21, r22)
                boolean r3 = r4.e(r3, r8)
                if (r3 == 0) goto L_0x011d
                goto L_0x0121
            L_0x011d:
                r14 = r4
                r3 = 1
                r4 = 2
                goto L_0x00e5
            L_0x0121:
                BC.g r1 = r0.f107832l
                java.lang.Throwable r3 = XH.x.e(r6)
                if (r3 == 0) goto L_0x01fa
                qv.e r4 = qv.e.WARN
                qv.d r6 = qv.d.f102012a
                java.util.List r6 = r6.a()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r6 = r6.iterator()
            L_0x013c:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x0153
                java.lang.Object r8 = r6.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                boolean r9 = r9.b(r4, r5)
                if (r9 == 0) goto L_0x013c
                r7.add(r8)
                goto L_0x013c
            L_0x0153:
                java.util.Iterator r5 = r7.iterator()
                r6 = 0
                r7 = r6
                r8 = r7
            L_0x015a:
                boolean r9 = r5.hasNext()
                if (r9 == 0) goto L_0x01dd
                java.lang.Object r9 = r5.next()
                qv.b r9 = (qv.C11819b) r9
                if (r7 != 0) goto L_0x0176
                java.lang.String r7 = "Failed to fetch timeslots"
                java.lang.String r7 = qv.C11818a.a(r7, r3)
                if (r7 != 0) goto L_0x0172
                goto L_0x01dd
            L_0x0172:
                java.lang.String r7 = qv.C11820c.a(r7)
            L_0x0176:
                r13 = r7
                if (r8 != 0) goto L_0x01cb
                java.lang.Class r7 = r2.getClass()
                java.lang.String r7 = r7.getName()
                kotlin.jvm.internal.C17542s.g(r7)
                r8 = 36
                r14 = 2
                java.lang.String r8 = HJ.C15854t.s1(r7, r8, r6, r14, r6)
                r10 = 46
                java.lang.String r8 = HJ.C15854t.o1(r8, r10, r6, r14, r6)
                int r10 = r8.length()
                if (r10 != 0) goto L_0x0198
                goto L_0x019e
            L_0x0198:
                java.lang.String r7 = "Kt"
                java.lang.String r7 = HJ.C15854t.P0(r8, r7)
            L_0x019e:
                java.lang.Thread r8 = java.lang.Thread.currentThread()
                java.lang.String r8 = r8.getName()
                java.lang.String r10 = "main"
                r15 = 1
                boolean r8 = HJ.C15854t.b0(r8, r10, r15)
                if (r8 == 0) goto L_0x01b2
                java.lang.String r8 = "m"
                goto L_0x01b4
            L_0x01b2:
                java.lang.String r8 = "b"
            L_0x01b4:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r8)
                java.lang.String r8 = "|"
                r10.append(r8)
                r10.append(r7)
                java.lang.String r8 = r10.toString()
            L_0x01c8:
                r16 = r8
                goto L_0x01ce
            L_0x01cb:
                r14 = 2
                r15 = 1
                goto L_0x01c8
            L_0x01ce:
                r10 = 0
                r7 = r9
                r8 = r4
                r9 = r16
                r11 = r3
                r12 = r13
                r7.a(r8, r9, r10, r11, r12)
                r7 = r13
                r8 = r16
                goto L_0x015a
            L_0x01dd:
                TJ.B r1 = r1.f107821t
            L_0x01e1:
                java.lang.Object r2 = r1.getValue()
                r3 = r2
                BC.c r3 = (BC.C12613c) r3
                BC.e r5 = BC.C12615e.f107809a
                r8 = 12
                r9 = 0
                r4 = 0
                r6 = 0
                r7 = 0
                BC.c r3 = BC.C12613c.b(r3, r4, r5, r6, r7, r8, r9)
                boolean r2 = r1.e(r2, r3)
                if (r2 == 0) goto L_0x01e1
            L_0x01fa:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: BC.C12617g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.timeslot.impl.feature.presentation.TimeslotPickerViewModel$onTimeSlotSelected$1", f = "TimeslotPickerViewModel.kt", l = {163}, m = "invokeSuspend")
    /* renamed from: BC.g$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f107833c;

        /* renamed from: d  reason: collision with root package name */
        int f107834d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f107835e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C12617g f107836f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C12612b.e f107837g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: BC.g$b$a */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f107838a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    FC.a[] r0 = FC.C12865a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    FC.a r1 = FC.C12865a.PAY_AHEAD     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    FC.a r1 = FC.C12865a.FULL_CART     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f107838a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: BC.C12617g.b.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C12617g gVar, C12612b.e eVar, C17164e<? super b> eVar2) {
            super(2, eVar2);
            this.f107836f = gVar;
            this.f107837g = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f107836f, this.f107837g, eVar);
            bVar.f107835e = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Q q10;
            C12865a aVar;
            Object value;
            C12611a aVar2;
            Object f10 = C17187b.f();
            int i10 = this.f107834d;
            if (i10 == 0) {
                y.b(obj);
                q10 = (Q) this.f107835e;
                Integer C10 = this.f107836f.L(this.f107837g.a());
                if (C10 != null) {
                    C12617g gVar = this.f107836f;
                    gVar.f107819r.f(C10.intValue(), this.f107837g.a(), ((C12613c) gVar.f107821t.getValue()).c().c(), gVar.K());
                }
                C17220a<C12865a> b10 = C12865a.b();
                Object f11 = this.f107836f.f107818q.f("type");
                if (f11 != null) {
                    C12865a aVar3 = b10.get(((Number) f11).intValue());
                    C15330b D10 = this.f107836f.f107817p;
                    C15115c a10 = this.f107837g.a();
                    List<C15014g> c10 = ((C12613c) this.f107836f.f107821t.getValue()).c().c();
                    this.f107835e = q10;
                    this.f107833c = aVar3;
                    this.f107834d = 1;
                    Object a11 = D10.a(a10, c10, this);
                    if (a11 == f10) {
                        return f10;
                    }
                    aVar = aVar3;
                    obj2 = a11;
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else if (i10 == 1) {
                aVar = (C12865a) this.f107833c;
                q10 = (Q) this.f107835e;
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C12617g gVar2 = this.f107836f;
            Throwable e10 = x.e(obj2);
            if (e10 == null) {
                String str = (String) obj2;
                int i11 = a.f107838a[aVar.ordinal()];
                if (i11 == 1) {
                    aVar2 = new C12611a.b.C2575b(str);
                } else if (i11 == 2) {
                    aVar2 = new C12611a.b.C2574a(str);
                } else {
                    throw new t();
                }
                gVar2.O(aVar2);
            } else {
                e eVar = e.WARN;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str2 = null;
                String str3 = null;
                for (C11819b bVar : arrayList) {
                    if (str2 == null) {
                        String a12 = C11818a.a((String) null, e10);
                        if (a12 == null) {
                            break;
                        }
                        str2 = C11820c.a(a12);
                    }
                    String str4 = str2;
                    if (str3 == null) {
                        String name = q10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str5 = str3;
                    bVar.a(eVar, str5, false, e10, str4);
                    str2 = str4;
                    str3 = str5;
                }
                C16505B H10 = gVar2.f107821t;
                do {
                    value = H10.getValue();
                } while (!H10.e(value, C12613c.b((C12613c) value, false, C12615e.f107809a, (C12614d) null, (C12611a) null, 13, (Object) null)));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: BC.g$c */
    public static final class c implements C16532g<C12616f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f107839a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: BC.g$c$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f107840a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.timeslot.impl.feature.presentation.TimeslotPickerViewModel$special$$inlined$map$1$2", f = "TimeslotPickerViewModel.kt", l = {50}, m = "emit")
            /* renamed from: BC.g$c$a$a  reason: collision with other inner class name */
            public static final class C2577a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f107841c;

                /* renamed from: d  reason: collision with root package name */
                int f107842d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f107843e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2577a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f107843e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f107841c = obj;
                    this.f107842d |= Integer.MIN_VALUE;
                    return this.f107843e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f107840a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof BC.C12617g.c.a.C2577a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    BC.g$c$a$a r0 = (BC.C12617g.c.a.C2577a) r0
                    int r1 = r0.f107842d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f107842d = r1
                    goto L_0x0018
                L_0x0013:
                    BC.g$c$a$a r0 = new BC.g$c$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f107841c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f107842d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x006e
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f107840a
                    BC.c r6 = (BC.C12613c) r6
                    boolean r2 = r6.e()
                    if (r2 == 0) goto L_0x0048
                    BC.f$b r2 = new BC.f$b
                    BC.a r6 = r6.f()
                    r2.<init>(r6)
                    goto L_0x0065
                L_0x0048:
                    BC.e r2 = r6.d()
                    if (r2 == 0) goto L_0x0058
                    BC.f$a r2 = new BC.f$a
                    BC.a r6 = r6.f()
                    r2.<init>(r6)
                    goto L_0x0065
                L_0x0058:
                    BC.f$c r2 = new BC.f$c
                    BC.d r4 = r6.c()
                    BC.a r6 = r6.f()
                    r2.<init>(r4, r6)
                L_0x0065:
                    r0.f107842d = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L_0x006e
                    return r1
                L_0x006e:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: BC.C12617g.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f107839a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f107839a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LBC/f;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.timeslot.impl.feature.presentation.TimeslotPickerViewModel$state$2", f = "TimeslotPickerViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: BC.g$d */
    static final class d extends l implements p<C16533h<? super C12616f>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f107844c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C12617g f107845d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C12617g gVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f107845d = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f107845d, eVar);
        }

        public final Object invoke(C16533h<? super C12616f> hVar, C17164e<? super C16807N> eVar) {
            return ((d) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f107844c == 0) {
                y.b(obj);
                this.f107845d.J();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C12617g(C15329a aVar, f fVar, C12692a aVar2, C15330b bVar, U u10, C15063a aVar3, C12860a aVar4) {
        C17542s.j(aVar, "getTimeslotUseCase");
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        C17542s.j(aVar2, "horizontalImageContentDataUiMapper");
        C17542s.j(bVar, "saveSelectedTimeSlotUseCase");
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar3, "timeSlotPickerAnalytics");
        C17542s.j(aVar4, "localStoreSelectionRepository");
        this.f107814m = aVar;
        this.f107815n = fVar;
        this.f107816o = aVar2;
        this.f107817p = bVar;
        this.f107818q = u10;
        this.f107819r = aVar3;
        this.f107820s = aVar4;
        C16505B<C12613c> a10 = C16521S.a(new C12613c(false, (C12615e) null, (C12614d) null, (C12611a) null, 15, (DefaultConstructorMarker) null));
        this.f107821t = a10;
        this.f107822u = C16534i.c0(C16534i.S(new c(a10), new d(this, (C17164e<? super d>) null)), g0.a(this), ip.f.a(), new C12616f.b((C12611a) null, 1, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    public final void J() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final String K() {
        C12832d a10 = C12861b.a(this.f107820s);
        if (a10 != null) {
            return a10.e();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = r0.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer L(uC.C15115c r4) {
        /*
            r3 = this;
            TJ.B<BC.c> r0 = r3.f107821t
            java.lang.Object r0 = r0.getValue()
            BC.c r0 = (BC.C12613c) r0
            BC.d r0 = r0.c()
            uC.a r0 = r0.f()
            r1 = 0
            if (r0 == 0) goto L_0x0022
            java.util.List r0 = r0.a()
            if (r0 == 0) goto L_0x0022
            int r4 = r0.indexOf(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0023
        L_0x0022:
            r4 = r1
        L_0x0023:
            if (r4 != 0) goto L_0x0026
            goto L_0x002d
        L_0x0026:
            int r0 = r4.intValue()
            r2 = -1
            if (r0 == r2) goto L_0x002e
        L_0x002d:
            r1 = r4
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: BC.C12617g.L(uC.c):java.lang.Integer");
    }

    private final void N() {
        this.f107819r.e(K());
        O(C12611a.C2573a.f107793a);
    }

    /* access modifiers changed from: private */
    public final void O(C12611a aVar) {
        C12613c value;
        C16505B<C12613c> b10 = this.f107821t;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C12613c.b(value, false, (C12615e) null, (C12614d) null, aVar, 7, (Object) null)));
    }

    private final void P() {
        C12613c value;
        C16505B<C12613c> b10 = this.f107821t;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C12613c.b(value, false, (C12615e) null, (C12614d) null, (C12611a) null, 7, (Object) null)));
    }

    private final void Q(C12612b.e eVar) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new b(this, eVar, (C17164e<? super b>) null), 3, (Object) null);
    }

    private final void R(C12612b.c cVar) {
        C12613c value;
        C12613c cVar2;
        List<C15115c> a10;
        Object obj;
        C15113a f10 = this.f107821t.getValue().c().f();
        C15115c cVar3 = null;
        if (!(f10 == null || (a10 = f10.a()) == null)) {
            Iterator it = a10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C17542s.e(((C15115c) obj).getId(), cVar.a())) {
                    break;
                }
            }
            C15115c cVar4 = (C15115c) obj;
            if (cVar4 != null) {
                Integer L10 = L(cVar4);
                if (L10 != null) {
                    this.f107819r.h(L10.intValue(), cVar4, K());
                }
                cVar3 = cVar4;
            }
        }
        C16505B<C12613c> b10 = this.f107821t;
        do {
            value = b10.getValue();
            cVar2 = value;
        } while (!b10.e(value, C12613c.b(cVar2, false, (C12615e) null, C12614d.b(cVar2.c(), (C15987c) null, (List) null, (C15113a) null, cVar3, 7, (Object) null), (C12611a) null, 11, (Object) null)));
    }

    public void M(C12612b bVar) {
        C17542s.j(bVar, "action");
        if (C17542s.e(bVar, C12612b.C2576b.f107797a)) {
            P();
        } else if (C17542s.e(bVar, C12612b.a.f107796a)) {
            N();
        } else if (bVar instanceof C12612b.c) {
            R((C12612b.c) bVar);
        } else if (C17542s.e(bVar, C12612b.d.f107799a)) {
            J();
        } else if (bVar instanceof C12612b.e) {
            Q((C12612b.e) bVar);
        } else {
            throw new t();
        }
    }

    public C16519P<C12616f> getState() {
        return this.f107822u;
    }
}
