package Ds;

import Cs.h;
import QJ.F0;
import QJ.Q;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import dI.C17164e;
import eI.C17187b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import nI.q;
import rs.C11844a;
import ys.C12502a;
import ys.C12503b;
import ys.C12505d;
import ys.C12506e;
import ys.C12507f;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0012H@¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001d\u001a\u00020\u00122\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010\u0014J\u0018\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H@¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0012H\u0002¢\u0006\u0004\b$\u0010\u0014J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010\u0014J\u0010\u0010*\u001a\u00020\u0012H@¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\u0012H@¢\u0006\u0004\b+\u0010\u0018J\u000f\u0010,\u001a\u00020\u0012H\u0002¢\u0006\u0004\b,\u0010\u0014J\u0017\u0010/\u001a\u00020\u00122\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0012H\u0002¢\u0006\u0004\b1\u0010\u0014J\u0019\u00102\u001a\u0004\u0018\u00010\u001b2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00122\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00122\u0006\u00105\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0012H\u0002¢\u0006\u0004\b;\u0010\u0014J\u0015\u0010?\u001a\u00020>2\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b?\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010Q\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u0002040R8\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u0002080V8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bA\u0010Y¨\u0006["}, d2 = {"LDs/k;", "Landroidx/lifecycle/f0;", "LBs/g;", "getNotificationMessagesUseCase", "LBs/k;", "refreshInboxSourcesUseCase", "LBs/a;", "clearNewNotificationsStatus", "LBs/i;", "markNotificationAsRead", "Lrs/a;", "inboxAnalytics", "LCs/d;", "notificationOptInFeature", "Lzs/i;", "inboxNotificationUriMapper", "<init>", "(LBs/g;LBs/k;LBs/a;LBs/i;Lrs/a;LCs/d;Lzs/i;)V", "LXH/N;", "g0", "()V", "n0", "F0", "A0", "(LdI/e;)Ljava/lang/Object;", "LCs/h;", "", "Lys/d;", "resource", "u0", "(LCs/h;)V", "f0", "", "id", "h0", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "q0", "Lys/b$f;", "result", "m0", "(Lys/b$f;)V", "l0", "o0", "p0", "r0", "Lys/a;", "destination", "s0", "(Lys/a;)V", "E0", "e0", "(Ljava/lang/String;)Lys/d;", "LDs/o;", "state", "y0", "(LDs/o;)V", "Lys/e;", "w0", "(Lys/e;)V", "c0", "Lys/b;", "event", "LQJ/F0;", "t0", "(Lys/b;)LQJ/F0;", "m", "LBs/g;", "n", "LBs/k;", "o", "LBs/a;", "p", "LBs/i;", "q", "Lrs/a;", "r", "LCs/d;", "s", "Lzs/i;", "t", "LQJ/F0;", "collectFlowsJob", "LTJ/B;", "u", "LTJ/B;", "viewModelState", "LTJ/P;", "v", "LTJ/P;", "()LTJ/P;", "uiState", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Bs.g f80194m;

    /* renamed from: n  reason: collision with root package name */
    private final Bs.k f80195n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Bs.a f80196o;

    /* renamed from: p  reason: collision with root package name */
    private final Bs.i f80197p;

    /* renamed from: q  reason: collision with root package name */
    private final C11844a f80198q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final Cs.d f80199r;

    /* renamed from: s  reason: collision with root package name */
    private final zs.i f80200s;

    /* renamed from: t  reason: collision with root package name */
    private F0 f80201t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C16505B<o> f80202u;

    /* renamed from: v  reason: collision with root package name */
    private final C16519P<C12506e> f80203v;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inbox.impl.viewmodel.InboxViewModel$1", f = "InboxViewModel.kt", l = {71}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80204c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f80205d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f80205d = kVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f80205d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f80204c;
            if (i10 == 0) {
                y.b(obj);
                k kVar = this.f80205d;
                this.f80204c = 1;
                if (kVar.A0(this) == f10) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inbox.impl.viewmodel.InboxViewModel$2", f = "InboxViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80206c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f80207d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f80208e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f80208e = kVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f80208e, eVar);
            bVar.f80207d = ((Boolean) obj).booleanValue();
            return bVar;
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((b) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f80206c == 0) {
                y.b(obj);
                boolean z10 = this.f80207d;
                C16505B N10 = this.f80208e.f80202u;
                do {
                    value = N10.getValue();
                } while (!N10.e(value, o.b((o) value, (List) null, (C12507f) null, false, (C12502a) null, false, false, false, z10, 127, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f80209a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                ys.b$f[] r0 = ys.C12503b.f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ys.b$f r1 = ys.C12503b.f.Granted     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ys.b$f r1 = ys.C12503b.f.FirstDeny     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ys.b$f r1 = ys.C12503b.f.SecondDeny     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ys.b$f r1 = ys.C12503b.f.Blocked     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f80209a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ds.k.c.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inbox.impl.viewmodel.InboxViewModel$clearEntryPointBadge$2", f = "InboxViewModel.kt", l = {314}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80210c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f80211d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(k kVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f80211d = kVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f80211d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f80210c;
            if (i10 == 0) {
                y.b(obj);
                Bs.a K10 = this.f80211d.f80196o;
                this.f80210c = 1;
                if (K10.a(this) == f10) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inbox.impl.viewmodel.InboxViewModel", f = "InboxViewModel.kt", l = {184, 193}, m = "handleMessageClicked")
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f80212c;

        /* renamed from: d  reason: collision with root package name */
        Object f80213d;

        /* renamed from: e  reason: collision with root package name */
        Object f80214e;

        /* renamed from: f  reason: collision with root package name */
        Object f80215f;

        /* renamed from: g  reason: collision with root package name */
        Object f80216g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f80217h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ k f80218i;

        /* renamed from: j  reason: collision with root package name */
        int f80219j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(k kVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f80218i = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f80217h = obj;
            this.f80219j |= Integer.MIN_VALUE;
            return this.f80218i.h0((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inbox.impl.viewmodel.InboxViewModel", f = "InboxViewModel.kt", l = {252}, m = "handleRefreshRequested")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f80220c;

        /* renamed from: d  reason: collision with root package name */
        Object f80221d;

        /* renamed from: e  reason: collision with root package name */
        Object f80222e;

        /* renamed from: f  reason: collision with root package name */
        Object f80223f;

        /* renamed from: g  reason: collision with root package name */
        Object f80224g;

        /* renamed from: h  reason: collision with root package name */
        Object f80225h;

        /* renamed from: i  reason: collision with root package name */
        Object f80226i;

        /* renamed from: j  reason: collision with root package name */
        int f80227j;

        /* renamed from: k  reason: collision with root package name */
        int f80228k;

        /* renamed from: l  reason: collision with root package name */
        int f80229l;

        /* renamed from: m  reason: collision with root package name */
        int f80230m;

        /* renamed from: n  reason: collision with root package name */
        int f80231n;

        /* renamed from: o  reason: collision with root package name */
        /* synthetic */ Object f80232o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ k f80233p;

        /* renamed from: q  reason: collision with root package name */
        int f80234q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(k kVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f80233p = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f80232o = obj;
            this.f80234q |= Integer.MIN_VALUE;
            return this.f80233p.o0(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inbox.impl.viewmodel.InboxViewModel$onEvent$1", f = "InboxViewModel.kt", l = {83, 84, 85}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f80235c;

        /* renamed from: d  reason: collision with root package name */
        int f80236d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C12503b f80237e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k f80238f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C12503b bVar, k kVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f80237e = bVar;
            this.f80238f = kVar;
        }

        /* access modifiers changed from: private */
        public static final String j(C12503b bVar) {
            return "Event received: " + bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f80237e, this.f80238f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f80236d;
            if (i10 == 0) {
                y.b(obj);
                n.c((qv.e) null, (Throwable) null, false, new l(this.f80237e), 7, (Object) null);
                C12503b bVar = this.f80237e;
                if (bVar instanceof C12503b.e) {
                    this.f80238f.l0();
                } else if (bVar instanceof C12503b.a) {
                    this.f80238f.f0();
                } else if (bVar instanceof C12503b.d) {
                    k kVar = this.f80238f;
                    String a10 = ((C12503b.d) bVar).a();
                    this.f80235c = bVar;
                    this.f80236d = 1;
                    if (kVar.h0(a10, this) == f10) {
                        return f10;
                    }
                } else if (bVar instanceof C12503b.i) {
                    k kVar2 = this.f80238f;
                    this.f80235c = bVar;
                    this.f80236d = 2;
                    if (kVar2.o0(this) == f10) {
                        return f10;
                    }
                } else if (bVar instanceof C12503b.j) {
                    k kVar3 = this.f80238f;
                    this.f80235c = bVar;
                    this.f80236d = 3;
                    if (kVar3.p0(this) == f10) {
                        return f10;
                    }
                } else if (bVar instanceof C12503b.k) {
                    this.f80238f.q0();
                } else if (bVar instanceof C12503b.l) {
                    this.f80238f.r0();
                } else if (bVar instanceof C12503b.f) {
                    this.f80238f.m0((C12503b.f) bVar);
                } else if (bVar instanceof C12503b.g) {
                    this.f80238f.n0();
                } else if (bVar instanceof C12503b.c) {
                    this.f80238f.g0();
                } else if (bVar instanceof C12503b.C2553b) {
                    this.f80238f.f80199r.c();
                } else if (bVar instanceof C12503b.h) {
                    this.f80238f.f80199r.b();
                } else {
                    throw new t();
                }
            } else if (i10 == 1 || i10 == 2 || i10 == 3) {
                C12503b bVar2 = (C12503b) this.f80235c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inbox.impl.viewmodel.InboxViewModel", f = "InboxViewModel.kt", l = {125}, m = "refreshNotificationsSources")
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f80239c;

        /* renamed from: d  reason: collision with root package name */
        Object f80240d;

        /* renamed from: e  reason: collision with root package name */
        Object f80241e;

        /* renamed from: f  reason: collision with root package name */
        Object f80242f;

        /* renamed from: g  reason: collision with root package name */
        Object f80243g;

        /* renamed from: h  reason: collision with root package name */
        Object f80244h;

        /* renamed from: i  reason: collision with root package name */
        Object f80245i;

        /* renamed from: j  reason: collision with root package name */
        int f80246j;

        /* renamed from: k  reason: collision with root package name */
        int f80247k;

        /* renamed from: l  reason: collision with root package name */
        int f80248l;

        /* renamed from: m  reason: collision with root package name */
        int f80249m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f80250n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ k f80251o;

        /* renamed from: p  reason: collision with root package name */
        int f80252p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(k kVar, C17164e<? super h> eVar) {
            super(eVar);
            this.f80251o = kVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f80250n = obj;
            this.f80252p |= Integer.MIN_VALUE;
            return this.f80251o.A0(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements C16532g<C12506e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f80253a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f80254a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inbox.impl.viewmodel.InboxViewModel$special$$inlined$map$1$2", f = "InboxViewModel.kt", l = {50}, m = "emit")
            /* renamed from: Ds.k$i$a$a  reason: collision with other inner class name */
            public static final class C1513a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f80255c;

                /* renamed from: d  reason: collision with root package name */
                int f80256d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f80257e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1513a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f80257e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f80255c = obj;
                    this.f80256d |= Integer.MIN_VALUE;
                    return this.f80257e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f80254a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Ds.k.i.a.C1513a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Ds.k$i$a$a r0 = (Ds.k.i.a.C1513a) r0
                    int r1 = r0.f80256d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f80256d = r1
                    goto L_0x0018
                L_0x0013:
                    Ds.k$i$a$a r0 = new Ds.k$i$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f80255c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f80256d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f80254a
                    Ds.o r5 = (Ds.o) r5
                    ys.e r5 = Ds.p.a(r5)
                    r0.f80256d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Ds.k.i.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public i(C16532g gVar) {
            this.f80253a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f80253a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inbox.impl.viewmodel.InboxViewModel$startCollecting$2", f = "InboxViewModel.kt", l = {}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80258c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f80259d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f80260e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends C17525a implements p<Cs.h<? extends List<? extends C12505d>>, C17164e<? super C16807N>, Object> {
            a(Object obj) {
                super(2, obj, k.class, "onNotificationsCollected", "onNotificationsCollected(Lcom/ingka/ikea/inbox/impl/util/Resource;)V", 4);
            }

            /* renamed from: a */
            public final Object invoke(Cs.h<? extends List<C12505d>> hVar, C17164e<? super C16807N> eVar) {
                return ((k) this.f144363a).u0(hVar);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LTJ/h;", "LCs/h;", "", "Lys/d;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inbox.impl.viewmodel.InboxViewModel$startCollecting$2$2", f = "InboxViewModel.kt", l = {}, m = "invokeSuspend")
        static final class b extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super Cs.h<? extends List<? extends C12505d>>>, Throwable, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f80261c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f80262d;

            b(C17164e<? super b> eVar) {
                super(3, eVar);
            }

            public final Object invoke(C16533h<? super Cs.h<? extends List<C12505d>>> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
                b bVar = new b(eVar);
                bVar.f80262d = th2;
                return bVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f80261c == 0) {
                    y.b(obj);
                    n.c(qv.e.WARN, (Throwable) this.f80262d, false, (C17631a) null, 12, (Object) null);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(k kVar, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f80260e = kVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            j jVar = new j(this.f80260e, eVar);
            jVar.f80259d = obj;
            return jVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f80258c == 0) {
                y.b(obj);
                C16534i.M(C16534i.g(C16534i.R(Cs.i.a(this.f80260e.f80194m.invoke()), new a(this.f80260e)), new b((C17164e<? super b>) null)), (Q) this.f80259d);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ds.k$k  reason: collision with other inner class name */
    /* synthetic */ class C1514k extends C17525a implements p<o, C17164e<? super C16807N>, Object> {
        C1514k(Object obj) {
            super(2, obj, k.class, "onViewModelStateEmitted", "onViewModelStateEmitted(Lcom/ingka/ikea/inbox/impl/viewmodel/InboxViewModelState;)V", 4);
        }

        /* renamed from: a */
        public final Object invoke(o oVar, C17164e<? super C16807N> eVar) {
            return ((k) this.f144363a).y0(oVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class l extends C17525a implements p<C12506e, C17164e<? super C16807N>, Object> {
        l(Object obj) {
            super(2, obj, k.class, "onUiStateEmitted", "onUiStateEmitted(Lcom/ingka/ikea/inbox/impl/model/Inbox$UiState;)V", 4);
        }

        /* renamed from: a */
        public final Object invoke(C12506e eVar, C17164e<? super C16807N> eVar2) {
            return ((k) this.f144363a).w0(eVar);
        }
    }

    public k(Bs.g gVar, Bs.k kVar, Bs.a aVar, Bs.i iVar, C11844a aVar2, Cs.d dVar, zs.i iVar2) {
        Bs.g gVar2 = gVar;
        Bs.k kVar2 = kVar;
        Bs.a aVar3 = aVar;
        Bs.i iVar3 = iVar;
        C11844a aVar4 = aVar2;
        Cs.d dVar2 = dVar;
        zs.i iVar4 = iVar2;
        C17542s.j(gVar2, "getNotificationMessagesUseCase");
        C17542s.j(kVar2, "refreshInboxSourcesUseCase");
        C17542s.j(aVar3, "clearNewNotificationsStatus");
        C17542s.j(iVar3, "markNotificationAsRead");
        C17542s.j(aVar4, "inboxAnalytics");
        C17542s.j(dVar2, "notificationOptInFeature");
        C17542s.j(iVar4, "inboxNotificationUriMapper");
        this.f80194m = gVar2;
        this.f80195n = kVar2;
        this.f80196o = aVar3;
        this.f80197p = iVar3;
        this.f80198q = aVar4;
        this.f80199r = dVar2;
        this.f80200s = iVar4;
        C16505B<o> a10 = C16521S.a(new o((List) null, (C12507f) null, false, (C12502a) null, false, false, false, dVar.isEnabled(), 127, (DefaultConstructorMarker) null));
        this.f80202u = a10;
        this.f80203v = C16534i.c0(C16534i.R(new i(C16534i.R(a10, new C1514k(this))), new l(this)), g0.a(this), ip.f.a(), new C12506e.d((C12502a) null, (C12507f) null, 3, (DefaultConstructorMarker) null));
        F0();
        Cs.a.b(this, new a(this, (C17164e<? super a>) null));
        C16534i.M(C16534i.R(dVar.a(), new b(this, (C17164e<? super b>) null)), g0.a(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: Ds.k} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b5 A[Catch:{ all -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cb A[Catch:{ all -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0(dI.C17164e<? super XH.C16807N> r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            boolean r2 = r0 instanceof Ds.k.h
            if (r2 == 0) goto L_0x0017
            r2 = r0
            Ds.k$h r2 = (Ds.k.h) r2
            int r3 = r2.f80252p
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f80252p = r3
            goto L_0x001c
        L_0x0017:
            Ds.k$h r2 = new Ds.k$h
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f80250n
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f80252p
            r6 = 1
            if (r5 == 0) goto L_0x0057
            if (r5 != r6) goto L_0x004f
            java.lang.Object r0 = r2.f80245i
            Ds.o r0 = (Ds.o) r0
            java.lang.Object r0 = r2.f80244h
            Ds.o r0 = (Ds.o) r0
            java.lang.Object r0 = r2.f80242f
            TJ.B r0 = (TJ.C16505B) r0
            java.lang.Object r0 = r2.f80241e
            TJ.B r0 = (TJ.C16505B) r0
            java.lang.Object r0 = r2.f80240d
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f80239c
            r2 = r0
            Ds.k r2 = (Ds.k) r2
            XH.y.b(r3)     // Catch:{ all -> 0x004c }
            XH.x r3 = (XH.x) r3     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r3.j()     // Catch:{ all -> 0x004c }
            goto L_0x00af
        L_0x004c:
            r0 = move-exception
            goto L_0x011a
        L_0x004f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0057:
            XH.y.b(r3)
            Ds.d r10 = new Ds.d
            r10.<init>()
            r11 = 7
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            Ds.n.c(r7, r8, r9, r10, r11, r12)
            TJ.B<Ds.o> r3 = r1.f80202u
        L_0x0069:
            java.lang.Object r5 = r3.getValue()
            r15 = r5
            Ds.o r15 = (Ds.o) r15
            r16 = 223(0xdf, float:3.12E-43)
            r17 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 1
            r14 = 0
            r18 = 0
            r7 = r15
            r6 = r15
            r15 = r18
            Ds.o r7 = Ds.o.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r8 = r3.e(r5, r7)
            if (r8 == 0) goto L_0x013a
            Bs.k r8 = r1.f80195n     // Catch:{ all -> 0x0118 }
            r2.f80239c = r1     // Catch:{ all -> 0x0118 }
            r2.f80240d = r0     // Catch:{ all -> 0x0118 }
            r2.f80241e = r3     // Catch:{ all -> 0x0118 }
            r2.f80242f = r3     // Catch:{ all -> 0x0118 }
            r2.f80243g = r5     // Catch:{ all -> 0x0118 }
            r2.f80244h = r7     // Catch:{ all -> 0x0118 }
            r2.f80245i = r6     // Catch:{ all -> 0x0118 }
            r0 = 0
            r2.f80246j = r0     // Catch:{ all -> 0x0118 }
            r2.f80247k = r0     // Catch:{ all -> 0x0118 }
            r2.f80248l = r0     // Catch:{ all -> 0x0118 }
            r2.f80249m = r0     // Catch:{ all -> 0x0118 }
            r5 = 1
            r2.f80252p = r5     // Catch:{ all -> 0x0118 }
            java.lang.Object r0 = r8.a(r0, r2)     // Catch:{ all -> 0x0118 }
            if (r0 != r4) goto L_0x00ae
            return r4
        L_0x00ae:
            r2 = r1
        L_0x00af:
            boolean r3 = XH.x.h(r0)     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x00c5
            r3 = r0
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x004c }
            Ds.e r7 = new Ds.e     // Catch:{ all -> 0x004c }
            r7.<init>()     // Catch:{ all -> 0x004c }
            r8 = 7
            r9 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            Ds.n.c(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x004c }
        L_0x00c5:
            java.lang.Throwable r0 = XH.x.e(r0)     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x00f7
            Ds.f r6 = new Ds.f     // Catch:{ all -> 0x004c }
            r6.<init>()     // Catch:{ all -> 0x004c }
            r7 = 7
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            Ds.n.c(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004c }
            TJ.B<Ds.o> r0 = r2.f80202u     // Catch:{ all -> 0x004c }
        L_0x00da:
            java.lang.Object r3 = r0.getValue()     // Catch:{ all -> 0x004c }
            r4 = r3
            Ds.o r4 = (Ds.o) r4     // Catch:{ all -> 0x004c }
            ys.f$c r6 = ys.C12507f.c.f107265a     // Catch:{ all -> 0x004c }
            r13 = 249(0xf9, float:3.49E-43)
            r14 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            Ds.o r4 = Ds.o.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x004c }
            boolean r3 = r0.e(r3, r4)     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x00da
        L_0x00f7:
            TJ.B<Ds.o> r0 = r2.f80202u
        L_0x00f9:
            java.lang.Object r2 = r0.getValue()
            r3 = r2
            Ds.o r3 = (Ds.o) r3
            r12 = 223(0xdf, float:3.12E-43)
            r13 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            Ds.o r3 = Ds.o.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r2 = r0.e(r2, r3)
            if (r2 == 0) goto L_0x00f9
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x0118:
            r0 = move-exception
            r2 = r1
        L_0x011a:
            TJ.B<Ds.o> r2 = r2.f80202u
        L_0x011c:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            Ds.o r4 = (Ds.o) r4
            r13 = 223(0xdf, float:3.12E-43)
            r14 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            Ds.o r4 = Ds.o.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r3 = r2.e(r3, r4)
            if (r3 != 0) goto L_0x0139
            goto L_0x011c
        L_0x0139:
            throw r0
        L_0x013a:
            r6 = 1
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: Ds.k.A0(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final String B0() {
        return "Refreshing sources";
    }

    /* access modifiers changed from: private */
    public static final String C0() {
        return "Refreshing finished successfully";
    }

    /* access modifiers changed from: private */
    public static final String D0() {
        return "Refreshing failed";
    }

    private final void E0() {
        F0 f02 = this.f80201t;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        this.f80201t = null;
        F0();
    }

    private final void F0() {
        o value;
        if (this.f80201t == null) {
            C16505B<o> b10 = this.f80202u;
            do {
                value = b10.getValue();
            } while (!b10.e(value, o.b(value, (List) null, (C12507f) null, false, (C12502a) null, true, false, false, false, 239, (Object) null)));
            this.f80201t = Cs.a.b(this, new j(this, (C17164e<? super j>) null));
        }
    }

    private final void c0() {
        n.c((qv.e) null, (Throwable) null, false, new C10665g(), 7, (Object) null);
        Cs.a.b(this, new d(this, (C17164e<? super d>) null));
    }

    /* access modifiers changed from: private */
    public static final String d0() {
        return "Clearing New Notification Status";
    }

    private final C12505d e0(String str) {
        Object obj;
        Iterator it = this.f80202u.getValue().d().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((C12505d) obj).getId(), str)) {
                break;
            }
        }
        return (C12505d) obj;
    }

    /* access modifiers changed from: private */
    public final void f0() {
        this.f80198q.a();
        s0(C12502a.C2552a.f107212a);
    }

    /* access modifiers changed from: private */
    public final void g0() {
        s0(C12502a.c.f107214a);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h0(java.lang.String r14, dI.C17164e<? super XH.C16807N> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof Ds.k.e
            if (r0 == 0) goto L_0x0013
            r0 = r15
            Ds.k$e r0 = (Ds.k.e) r0
            int r1 = r0.f80219j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f80219j = r1
            goto L_0x0018
        L_0x0013:
            Ds.k$e r0 = new Ds.k$e
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f80217h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f80219j
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0066
            if (r3 == r5) goto L_0x0049
            if (r3 != r4) goto L_0x0041
            java.lang.Object r14 = r0.f80216g
            ys.d r14 = (ys.C12505d) r14
            java.lang.Object r14 = r0.f80215f
            ys.d r14 = (ys.C12505d) r14
            java.lang.Object r14 = r0.f80214e
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r14 = r0.f80213d
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r0.f80212c
            Ds.k r15 = (Ds.k) r15
            XH.y.b(r1)
            goto L_0x00da
        L_0x0041:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0049:
            java.lang.Object r14 = r0.f80216g
            ys.d r14 = (ys.C12505d) r14
            java.lang.Object r15 = r0.f80215f
            ys.d r15 = (ys.C12505d) r15
            java.lang.Object r3 = r0.f80214e
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r5 = r0.f80213d
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.f80212c
            Ds.k r6 = (Ds.k) r6
            XH.y.b(r1)
            r1 = r14
            r14 = r5
            r12 = r3
            r3 = r15
            r15 = r12
            goto L_0x00ae
        L_0x0066:
            XH.y.b(r1)
            ys.d r1 = r13.e0(r14)
            if (r1 != 0) goto L_0x0080
            qv.e r6 = qv.e.WARN
            Ds.h r9 = new Ds.h
            r9.<init>(r14)
            r10 = 6
            r11 = 0
            r7 = 0
            r8 = 0
            Ds.n.c(r6, r7, r8, r9, r10, r11)
            XH.N r14 = XH.C16807N.f139792a
            return r14
        L_0x0080:
            boolean r3 = r1.p()
            if (r3 != 0) goto L_0x00b2
            Ds.i r9 = new Ds.i
            r9.<init>(r14)
            r10 = 7
            r11 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            Ds.n.c(r6, r7, r8, r9, r10, r11)
            Bs.i r3 = r13.f80197p
            Ps.b r6 = r1.n()
            r0.f80212c = r13
            r0.f80213d = r14
            r0.f80214e = r15
            r0.f80215f = r1
            r0.f80216g = r1
            r0.f80219j = r5
            java.lang.Object r3 = r3.a(r6, r0)
            if (r3 != r2) goto L_0x00ac
            return r2
        L_0x00ac:
            r6 = r13
            r3 = r1
        L_0x00ae:
            r5 = r1
            r1 = r15
            r15 = r6
            goto L_0x00b6
        L_0x00b2:
            r3 = r1
            r5 = r3
            r1 = r15
            r15 = r13
        L_0x00b6:
            rs.a r6 = r15.f80198q
            java.lang.String r7 = r3.o()
            rs.c r8 = rs.c.INBOX
            r6.f(r14, r7, r8)
            zs.i r6 = r15.f80200s
            Ps.b r7 = r3.n()
            r0.f80212c = r15
            r0.f80213d = r14
            r0.f80214e = r1
            r0.f80215f = r3
            r0.f80216g = r5
            r0.f80219j = r4
            java.lang.Object r1 = r6.b(r7, r0)
            if (r1 != r2) goto L_0x00da
            return r2
        L_0x00da:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x00ec
            Ds.j r5 = new Ds.j
            r5.<init>(r14)
            r6 = 7
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            Ds.n.c(r2, r3, r4, r5, r6, r7)
            goto L_0x00f4
        L_0x00ec:
            ys.a$b r14 = new ys.a$b
            r14.<init>(r1)
            r15.s0(r14)
        L_0x00f4:
            XH.N r14 = XH.C16807N.f139792a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: Ds.k.h0(java.lang.String, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final String i0(String str) {
        return "Clicked " + str + " but it's not in the list of notifications";
    }

    /* access modifiers changed from: private */
    public static final String j0(String str) {
        return "Marking notification " + str + " as read";
    }

    /* access modifiers changed from: private */
    public static final String k0(String str) {
        return "Uri for notification " + str + " was null";
    }

    /* access modifiers changed from: private */
    public final void l0() {
        o value;
        C16505B<o> b10 = this.f80202u;
        do {
            value = b10.getValue();
        } while (!b10.e(value, o.b(value, (List) null, (C12507f) null, false, (C12502a) null, false, false, false, false, 247, (Object) null)));
    }

    /* access modifiers changed from: private */
    public final void m0(C12503b.f fVar) {
        o value;
        this.f80198q.e(fVar);
        int i10 = c.f80209a[fVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            this.f80199r.b();
        } else if (i10 == 3 || i10 == 4) {
            C16505B<o> b10 = this.f80202u;
            do {
                value = b10.getValue();
            } while (!b10.e(value, o.b(value, (List) null, C12507f.b.f107261a, false, (C12502a) null, false, false, false, false, 249, (Object) null)));
            this.f80199r.b();
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public final void n0() {
        this.f80198q.b();
        s0(C12502a.d.f107215a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: Ds.k} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o0(dI.C17164e<? super XH.C16807N> r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            boolean r2 = r0 instanceof Ds.k.f
            if (r2 == 0) goto L_0x0017
            r2 = r0
            Ds.k$f r2 = (Ds.k.f) r2
            int r3 = r2.f80234q
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f80234q = r3
            goto L_0x001c
        L_0x0017:
            Ds.k$f r2 = new Ds.k$f
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f80232o
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f80234q
            r6 = 1
            if (r5 == 0) goto L_0x0052
            if (r5 != r6) goto L_0x004a
            java.lang.Object r0 = r2.f80226i
            Ds.o r0 = (Ds.o) r0
            java.lang.Object r0 = r2.f80225h
            Ds.o r0 = (Ds.o) r0
            java.lang.Object r0 = r2.f80223f
            TJ.B r0 = (TJ.C16505B) r0
            java.lang.Object r0 = r2.f80222e
            TJ.B r0 = (TJ.C16505B) r0
            java.lang.Object r0 = r2.f80221d
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f80220c
            r2 = r0
            Ds.k r2 = (Ds.k) r2
            XH.y.b(r3)     // Catch:{ all -> 0x0047 }
            goto L_0x00ce
        L_0x0047:
            r0 = move-exception
            goto L_0x00f1
        L_0x004a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0052:
            XH.y.b(r3)
            TJ.B<Ds.o> r3 = r1.f80202u
            java.lang.Object r3 = r3.getValue()
            Ds.o r3 = (Ds.o) r3
            boolean r3 = r3.h()
            if (r3 == 0) goto L_0x0066
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x0066:
            TJ.B<Ds.o> r3 = r1.f80202u     // Catch:{ all -> 0x00a8 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00a8 }
            Ds.o r3 = (Ds.o) r3     // Catch:{ all -> 0x00a8 }
            ys.f r3 = r3.f()     // Catch:{ all -> 0x00a8 }
            r5 = 0
            if (r3 == 0) goto L_0x0077
            r3 = r6
            goto L_0x0078
        L_0x0077:
            r3 = r5
        L_0x0078:
            TJ.B<Ds.o> r7 = r1.f80202u     // Catch:{ all -> 0x00a8 }
        L_0x007a:
            java.lang.Object r8 = r7.getValue()     // Catch:{ all -> 0x00a8 }
            r15 = r8
            Ds.o r15 = (Ds.o) r15     // Catch:{ all -> 0x00a8 }
            r18 = 185(0xb9, float:2.59E-43)
            r19 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 1
            r20 = 0
            r9 = r15
            r6 = r15
            r15 = r16
            r16 = r17
            r17 = r20
            Ds.o r9 = Ds.o.b(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00a8 }
            boolean r10 = r7.e(r8, r9)     // Catch:{ all -> 0x00a8 }
            if (r10 == 0) goto L_0x00ef
            if (r3 == 0) goto L_0x00ab
            r21.E0()     // Catch:{ all -> 0x00a8 }
            goto L_0x00ab
        L_0x00a8:
            r0 = move-exception
            r2 = r1
            goto L_0x00f1
        L_0x00ab:
            r2.f80220c = r1     // Catch:{ all -> 0x00a8 }
            r2.f80221d = r0     // Catch:{ all -> 0x00a8 }
            r2.f80222e = r7     // Catch:{ all -> 0x00a8 }
            r2.f80223f = r7     // Catch:{ all -> 0x00a8 }
            r2.f80224g = r8     // Catch:{ all -> 0x00a8 }
            r2.f80225h = r9     // Catch:{ all -> 0x00a8 }
            r2.f80226i = r6     // Catch:{ all -> 0x00a8 }
            r2.f80227j = r3     // Catch:{ all -> 0x00a8 }
            r2.f80228k = r5     // Catch:{ all -> 0x00a8 }
            r2.f80229l = r5     // Catch:{ all -> 0x00a8 }
            r2.f80230m = r5     // Catch:{ all -> 0x00a8 }
            r2.f80231n = r5     // Catch:{ all -> 0x00a8 }
            r6 = 1
            r2.f80234q = r6     // Catch:{ all -> 0x00a8 }
            java.lang.Object r0 = r1.A0(r2)     // Catch:{ all -> 0x00a8 }
            if (r0 != r4) goto L_0x00cd
            return r4
        L_0x00cd:
            r2 = r1
        L_0x00ce:
            TJ.B<Ds.o> r0 = r2.f80202u
        L_0x00d0:
            java.lang.Object r2 = r0.getValue()
            r3 = r2
            Ds.o r3 = (Ds.o) r3
            r12 = 191(0xbf, float:2.68E-43)
            r13 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            Ds.o r3 = Ds.o.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r2 = r0.e(r2, r3)
            if (r2 == 0) goto L_0x00d0
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x00ef:
            r6 = 1
            goto L_0x007a
        L_0x00f1:
            TJ.B<Ds.o> r2 = r2.f80202u
        L_0x00f3:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            Ds.o r4 = (Ds.o) r4
            r13 = 191(0xbf, float:2.68E-43)
            r14 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            Ds.o r4 = Ds.o.b(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r3 = r2.e(r3, r4)
            if (r3 != 0) goto L_0x0110
            goto L_0x00f3
        L_0x0110:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ds.k.o0(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object p0(C17164e<? super C16807N> eVar) {
        o value;
        C16505B<o> b10 = this.f80202u;
        do {
            value = b10.getValue();
        } while (!b10.e(value, o.b(value, (List) null, (C12507f) null, false, (C12502a) null, false, false, false, false, 249, (Object) null)));
        E0();
        Object A02 = A0(eVar);
        return A02 == C17187b.f() ? A02 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void q0() {
        o value;
        C16505B<o> b10 = this.f80202u;
        do {
            value = b10.getValue();
        } while (!b10.e(value, o.b(value, (List) null, (C12507f) null, true, C12502a.e.f107216a, false, false, false, false, 243, (Object) null)));
    }

    /* access modifiers changed from: private */
    public final void r0() {
        o value;
        C16505B<o> b10 = this.f80202u;
        do {
            value = b10.getValue();
        } while (!b10.e(value, o.b(value, (List) null, (C12507f) null, true, (C12502a) null, false, false, false, false, 251, (Object) null)));
    }

    private final void s0(C12502a aVar) {
        o value;
        C16505B<o> b10 = this.f80202u;
        do {
            value = b10.getValue();
        } while (!b10.e(value, o.b(value, (List) null, (C12507f) null, false, aVar, false, false, false, false, 247, (Object) null)));
    }

    /* access modifiers changed from: private */
    public final void u0(Cs.h<? extends List<C12505d>> hVar) {
        o value;
        o value2;
        o value3;
        n.c((qv.e) null, (Throwable) null, false, new C10659a(hVar), 7, (Object) null);
        if (hVar instanceof h.b) {
            C16505B<o> b10 = this.f80202u;
            do {
                value3 = b10.getValue();
            } while (!b10.e(value3, o.b(value3, (List) null, (C12507f) null, false, (C12502a) null, true, false, false, false, 239, (Object) null)));
        } else if (hVar instanceof h.c) {
            C16505B<o> b11 = this.f80202u;
            do {
                value2 = b11.getValue();
            } while (!b11.e(value2, o.b(value2, (List) ((h.c) hVar).a(), (C12507f) null, false, (C12502a) null, false, false, false, false, 238, (Object) null)));
        } else if (hVar instanceof h.a) {
            n.c((qv.e) null, ((h.a) hVar).a(), false, (C17631a) null, 13, (Object) null);
            C16505B<o> b12 = this.f80202u;
            do {
                value = b12.getValue();
            } while (!b12.e(value, o.b(value, (List) null, C12507f.c.f107265a, false, (C12502a) null, false, false, false, false, 233, (Object) null)));
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public static final String v0(Cs.h hVar) {
        return "COLLECTED notifications " + hVar;
    }

    /* access modifiers changed from: private */
    public final void w0(C12506e eVar) {
        n.c((qv.e) null, (Throwable) null, true, new C10660b(eVar), 3, (Object) null);
        if (!(eVar instanceof C12506e.c) && !(eVar instanceof C12506e.d)) {
            if (eVar instanceof C12506e.b) {
                c0();
            } else if (!(eVar instanceof C12506e.a)) {
                throw new t();
            } else if (!((C12506e.a) eVar).g()) {
                c0();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final String x0(C12506e eVar) {
        return "EMIT UiState: " + eVar;
    }

    /* access modifiers changed from: private */
    public final void y0(o oVar) {
        n.c((qv.e) null, (Throwable) null, true, new C10661c(oVar), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final String z0(o oVar) {
        return "EMIT ViewModelState: " + oVar;
    }

    public final C16519P<C12506e> m() {
        return this.f80203v;
    }

    public final F0 t0(C12503b bVar) {
        C17542s.j(bVar, "event");
        return Cs.a.b(this, new g(bVar, this, (C17164e<? super g>) null));
    }
}
