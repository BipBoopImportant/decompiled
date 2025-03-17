package tD;

import GD.C12930c;
import GD.C12932e;
import GD.C12933f;
import GD.C12934g;
import GD.C12935h;
import GD.k;
import HD.C12995e;
import HJ.C15835a;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import JD.C13069a;
import JD.C13071c;
import JD.C13073e;
import JD.C13075g;
import JD.C13077i;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import aA.C13909a;
import aA.C13910b;
import am.c;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import uD.C15116a;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001BY\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J3\u00107\u001a\u00020\u001a2\"\u00106\u001a\u001e\b\u0001\u0012\u0004\u0012\u000203\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a04\u0012\u0006\u0012\u0004\u0018\u00010502H\u0002¢\u0006\u0004\b7\u00108J\u0019\u0010;\u001a\u00020\u001a2\b\u0010:\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020=¢\u0006\u0004\b>\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0019\u0010N\u001a\u0004\u0018\u00010.8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020P0O8\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020T0O8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010RR\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020X0W8\u0006¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b@\u0010[R\u0016\u0010_\u001a\u0004\u0018\u0001098BX\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006`"}, d2 = {"LtD/e;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LJD/i;", "getProfileCardsUseCase", "LJD/g;", "getPrepaidCardsUseCase", "LJD/e;", "getClaimedRewardCardsUseCase", "LaA/a;", "sessionManager", "Lam/c;", "clipboardHandler", "LJD/a;", "attachPrepaidCardUseCase", "LJD/c;", "detachPrepaidCardUseCase", "LHD/e;", "viewModelStateToUiStateMapper", "LuD/a;", "walletAnalytics", "<init>", "(Landroidx/lifecycle/U;LJD/i;LJD/g;LJD/e;LaA/a;Lam/c;LJD/a;LJD/c;LHD/e;LuD/a;)V", "LGD/g;", "destination", "LXH/N;", "L", "(LGD/g;)V", "LGD/h$d;", "event", "I", "(LGD/h$d;)V", "LGD/h$e;", "J", "(LGD/h$e;)V", "LGD/h$a;", "G", "(LGD/h$a;)V", "LGD/h$c;", "H", "(LGD/h$c;)V", "LGD/c;", "cardInfo", "C", "(LGD/c;)V", "", "code", "E", "(Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/Function2;", "LQJ/Q;", "LdI/e;", "", "block", "K", "(LnI/p;)V", "LGD/e;", "state", "D", "(LGD/e;)V", "LGD/h;", "M", "(LGD/h;)V", "m", "Lam/c;", "n", "LJD/a;", "o", "LJD/c;", "p", "LHD/e;", "q", "LuD/a;", "r", "Ljava/lang/String;", "getRedemptionCode", "()Ljava/lang/String;", "redemptionCode", "LTJ/B;", "LGD/j;", "s", "LTJ/B;", "viewModelState", "", "t", "retryPrepaid", "LTJ/P;", "LGD/i;", "u", "LTJ/P;", "()LTJ/P;", "uiState", "F", "()LGD/e;", "attachCardState", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tD.e  reason: case insensitive filesystem */
public final class C15068e extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final am.c f131089m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C13069a f131090n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C13071c f131091o;

    /* renamed from: p  reason: collision with root package name */
    private final C12995e f131092p;

    /* renamed from: q  reason: collision with root package name */
    private final C15116a f131093q;

    /* renamed from: r  reason: collision with root package name */
    private final String f131094r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C16505B<GD.j> f131095s;

    /* renamed from: t  reason: collision with root package name */
    private final C16505B<Integer> f131096t;

    /* renamed from: u  reason: collision with root package name */
    private final C16519P<GD.i> f131097u;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGD/f;", "it", "LXH/N;", "<anonymous>", "(LGD/f;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.wallet.impl.WalletViewModel$2", f = "WalletViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: tD.e$a */
    static final class a extends l implements p<C12933f, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f131098c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f131099d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15068e f131100e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C15068e eVar, C17164e<? super a> eVar2) {
            super(2, eVar2);
            this.f131100e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f131100e, eVar);
            aVar.f131099d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(C12933f fVar, C17164e<? super C16807N> eVar) {
            return ((a) create(fVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f131098c == 0) {
                y.b(obj);
                C12933f fVar = (C12933f) this.f131099d;
                C16505B k10 = this.f131100e.f131095s;
                do {
                    value = k10.getValue();
                } while (!k10.e(value, GD.j.b((GD.j) value, (C12934g) null, (C13023e) null, fVar, (C12933f) null, (C12933f) null, (k.b.f) null, false, (C12932e) null, (String) null, 507, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGD/f;", "it", "LXH/N;", "<anonymous>", "(LGD/f;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.wallet.impl.WalletViewModel$4", f = "WalletViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: tD.e$b */
    static final class b extends l implements p<C12933f, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f131101c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f131102d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15068e f131103e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C15068e eVar, C17164e<? super b> eVar2) {
            super(2, eVar2);
            this.f131103e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f131103e, eVar);
            bVar.f131102d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(C12933f fVar, C17164e<? super C16807N> eVar) {
            return ((b) create(fVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f131101c == 0) {
                y.b(obj);
                C12933f fVar = (C12933f) this.f131102d;
                C16505B k10 = this.f131103e.f131095s;
                do {
                    value = k10.getValue();
                } while (!k10.e(value, GD.j.b((GD.j) value, (C12934g) null, (C13023e) null, (C12933f) null, fVar, (C12933f) null, (k.b.f) null, false, (C12932e) null, (String) null, 503, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGD/f;", "it", "LXH/N;", "<anonymous>", "(LGD/f;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.wallet.impl.WalletViewModel$5", f = "WalletViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: tD.e$c */
    static final class c extends l implements p<C12933f, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f131104c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f131105d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15068e f131106e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C15068e eVar, C17164e<? super c> eVar2) {
            super(2, eVar2);
            this.f131106e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f131106e, eVar);
            cVar.f131105d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(C12933f fVar, C17164e<? super C16807N> eVar) {
            return ((c) create(fVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f131104c == 0) {
                y.b(obj);
                C12933f fVar = (C12933f) this.f131105d;
                C16505B k10 = this.f131106e.f131095s;
                do {
                    value = k10.getValue();
                } while (!k10.e(value, GD.j.b((GD.j) value, (C12934g) null, (C13023e) null, (C12933f) null, (C12933f) null, fVar, (k.b.f) null, false, (C12932e) null, (String) null, 495, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.wallet.impl.WalletViewModel$handleAttachCard$1", f = "WalletViewModel.kt", l = {184}, m = "invokeSuspend")
    /* renamed from: tD.e$d */
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f131107c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15068e f131108d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f131109e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: tD.e$d$a */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f131110a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    JD.a$a[] r0 = JD.C13069a.C2695a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    JD.a$a r1 = JD.C13069a.C2695a.Success     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    JD.a$a r1 = JD.C13069a.C2695a.InvalidInput     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    JD.a$a r1 = JD.C13069a.C2695a.Failure     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f131110a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: tD.C15068e.d.a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C15068e eVar, String str, C17164e<? super d> eVar2) {
            super(2, eVar2);
            this.f131108d = eVar;
            this.f131109e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f131108d, this.f131109e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f131107c;
            if (i10 == 0) {
                y.b(obj);
                this.f131108d.D(new C12932e.C2645e(this.f131109e));
                C13069a i11 = this.f131108d.f131090n;
                String str = this.f131109e;
                this.f131107c = 1;
                obj = i11.a(str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = a.f131110a[((C13069a.C2695a) obj).ordinal()];
            if (i12 == 1) {
                this.f131108d.D(new C12932e.a(this.f131109e));
            } else if (i12 == 2) {
                this.f131108d.D(new C12932e.d(this.f131109e));
            } else if (i12 == 3) {
                this.f131108d.D(new C12932e.b(this.f131109e));
            } else {
                throw new t();
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.wallet.impl.WalletViewModel$handleDetachCard$3", f = "WalletViewModel.kt", l = {242}, m = "invokeSuspend")
    /* renamed from: tD.e$e  reason: collision with other inner class name */
    static final class C3243e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f131111c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15068e f131112d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k.b.f f131113e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3243e(C15068e eVar, k.b.f fVar, C17164e<? super C3243e> eVar2) {
            super(2, eVar2);
            this.f131112d = eVar;
            this.f131113e = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C3243e(this.f131112d, this.f131113e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C3243e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f131111c;
            if (i10 == 0) {
                y.b(obj);
                C13071c j10 = this.f131112d.f131091o;
                String e10 = this.f131113e.e();
                this.f131111c = 1;
                obj = j10.a(e10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C13023e a10 = ((Boolean) obj).booleanValue() ? null : C13026h.a(Oo.b.f84853z3);
            C16505B k10 = this.f131112d.f131095s;
            do {
                value = k10.getValue();
            } while (!k10.e(value, GD.j.b((GD.j) value, (C12934g) null, a10, (C12933f) null, (C12933f) null, (C12933f) null, (k.b.f) null, false, (C12932e) null, (String) null, 413, (Object) null)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"tD/e$f", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tD.e$f */
    public static final class f extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15068e f131114a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(N.a aVar, C15068e eVar) {
            super(aVar);
            this.f131114a = eVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C15068e eVar = this.f131114a;
            e eVar2 = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar2, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Launched work failed", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = eVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar2, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.wallet.impl.WalletViewModel$special$$inlined$flatMapLatest$1", f = "WalletViewModel.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: tD.e$g */
    public static final class g extends l implements q<C16533h<? super C12933f>, Integer, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f131115c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f131116d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f131117e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C13075g f131118f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17164e eVar, C13075g gVar) {
            super(3, eVar);
            this.f131118f = gVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C12933f> hVar, Integer num, C17164e<? super C16807N> eVar) {
            g gVar = new g(eVar, this.f131118f);
            gVar.f131116d = hVar;
            gVar.f131117e = num;
            return gVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f131115c;
            if (i10 == 0) {
                y.b(obj);
                ((Number) this.f131117e).intValue();
                C16532g<C12933f> invoke = this.f131118f.invoke();
                this.f131115c = 1;
                if (C16534i.x((C16533h) this.f131116d, invoke, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tD.e$h */
    public static final class h implements C16532g<GD.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f131119a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C12995e f131120b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: tD.e$h$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f131121a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C12995e f131122b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.wallet.impl.WalletViewModel$special$$inlined$map$1$2", f = "WalletViewModel.kt", l = {50}, m = "emit")
            /* renamed from: tD.e$h$a$a  reason: collision with other inner class name */
            public static final class C3244a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f131123c;

                /* renamed from: d  reason: collision with root package name */
                int f131124d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f131125e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3244a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f131125e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f131123c = obj;
                    this.f131124d |= Integer.MIN_VALUE;
                    return this.f131125e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C12995e eVar) {
                this.f131121a = hVar;
                this.f131122b = eVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof tD.C15068e.h.a.C3244a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    tD.e$h$a$a r0 = (tD.C15068e.h.a.C3244a) r0
                    int r1 = r0.f131124d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f131124d = r1
                    goto L_0x0018
                L_0x0013:
                    tD.e$h$a$a r0 = new tD.e$h$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f131123c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f131124d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f131121a
                    GD.j r5 = (GD.j) r5
                    HD.e r2 = r4.f131122b
                    GD.i r5 = r2.b(r5)
                    r0.f131124d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: tD.C15068e.h.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public h(C16532g gVar, C12995e eVar) {
            this.f131119a = gVar;
            this.f131120b = eVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f131119a.collect(new a(hVar, this.f131120b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGD/j;", "it", "LXH/N;", "<anonymous>", "(LGD/j;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.wallet.impl.WalletViewModel$uiState$1", f = "WalletViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: tD.e$i */
    static final class i extends l implements p<GD.j, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f131126c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f131127d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15068e f131128e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C15068e eVar, C17164e<? super i> eVar2) {
            super(2, eVar2);
            this.f131128e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            i iVar = new i(this.f131128e, eVar);
            iVar.f131127d = obj;
            return iVar;
        }

        /* renamed from: i */
        public final Object invoke(GD.j jVar, C17164e<? super C16807N> eVar) {
            return ((i) create(jVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f131126c == 0) {
                y.b(obj);
                GD.j jVar = (GD.j) this.f131127d;
                C15068e eVar = this.f131128e;
                e eVar2 = e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar2, true)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a(jVar.toString(), (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = eVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar2, str4, true, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGD/i;", "it", "LXH/N;", "<anonymous>", "(LGD/i;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.wallet.impl.WalletViewModel$uiState$3", f = "WalletViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: tD.e$j */
    static final class j extends l implements p<GD.i, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f131129c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f131130d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15068e f131131e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C15068e eVar, C17164e<? super j> eVar2) {
            super(2, eVar2);
            this.f131131e = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            j jVar = new j(this.f131131e, eVar);
            jVar.f131130d = obj;
            return jVar;
        }

        /* renamed from: i */
        public final Object invoke(GD.i iVar, C17164e<? super C16807N> eVar) {
            return ((j) create(iVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f131129c == 0) {
                y.b(obj);
                GD.i iVar = (GD.i) this.f131130d;
                C15068e eVar = this.f131131e;
                e eVar2 = e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar2, true)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a(iVar.toString(), (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = eVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar2, str4, true, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C15068e(U u10, C13077i iVar, C13075g gVar, C13073e eVar, C13909a aVar, am.c cVar, C13069a aVar2, C13071c cVar2, C12995e eVar2, C15116a aVar3) {
        GD.j value;
        U u11 = u10;
        C13075g gVar2 = gVar;
        am.c cVar3 = cVar;
        C13069a aVar4 = aVar2;
        C13071c cVar4 = cVar2;
        C12995e eVar3 = eVar2;
        C15116a aVar5 = aVar3;
        C17542s.j(u11, "savedStateHandle");
        C17542s.j(iVar, "getProfileCardsUseCase");
        C17542s.j(gVar2, "getPrepaidCardsUseCase");
        C17542s.j(eVar, "getClaimedRewardCardsUseCase");
        C17542s.j(aVar, "sessionManager");
        C17542s.j(cVar3, "clipboardHandler");
        C17542s.j(aVar4, "attachPrepaidCardUseCase");
        C17542s.j(cVar4, "detachPrepaidCardUseCase");
        C17542s.j(eVar3, "viewModelStateToUiStateMapper");
        C17542s.j(aVar5, "walletAnalytics");
        this.f131089m = cVar3;
        this.f131090n = aVar4;
        this.f131091o = cVar4;
        this.f131092p = eVar3;
        this.f131093q = aVar5;
        String str = (String) u11.f("redemptionCode");
        this.f131094r = str;
        C16505B<GD.j> a10 = C16521S.a(new GD.j((C12934g) null, (C13023e) null, (C12933f) null, (C12933f) null, (C12933f) null, (k.b.f) null, false, (C12932e) null, (String) null, 511, (DefaultConstructorMarker) null));
        this.f131095s = a10;
        C16505B<Integer> a11 = C16521S.a(0);
        this.f131096t = a11;
        this.f131097u = C16534i.c0(C16534i.R(new h(C16534i.R(a10, new i(this, (C17164e<? super i>) null)), eVar3), new j(this, (C17164e<? super j>) null)), g0.a(this), ip.f.a(), eVar3.b(a10.getValue()));
        if (aVar.o() == C13910b.GUEST) {
            do {
                value = a10.getValue();
            } while (!a10.e(value, GD.j.b(value, C12934g.a.f110369a, (C13023e) null, (C12933f) null, (C12933f) null, (C12933f) null, (k.b.f) null, false, (C12932e) null, (String) null, 510, (Object) null)));
            return;
        }
        C16534i.M(C16534i.R(iVar.invoke(), new a(this, (C17164e<? super a>) null)), g0.a(this));
        C16534i.M(C16534i.R(C16534i.g0(a11, new g((C17164e) null, gVar2)), new b(this, (C17164e<? super b>) null)), g0.a(this));
        C16534i.M(C16534i.R(eVar.invoke(), new c(this, (C17164e<? super c>) null)), g0.a(this));
        if (str != null && str.length() != 0) {
            M(new C12935h.a.e(str));
            M(C12935h.a.C2647h.f110377a);
        }
    }

    private final void C(C12930c cVar) {
        GD.j value;
        if (cVar.c()) {
            c.a.a(this.f131089m, cVar.a(), (String) null, 2, (Object) null);
            if (this.f131089m.b()) {
                C16505B<GD.j> b10 = this.f131095s;
                do {
                    value = b10.getValue();
                } while (!b10.e(value, GD.j.b(value, (C12934g) null, C13026h.b(Oo.b.f84620d9, cVar.a()), (C12933f) null, (C12933f) null, (C12933f) null, (k.b.f) null, false, (C12932e) null, (String) null, 509, (Object) null)));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void D(C12932e eVar) {
        GD.j value;
        C16505B<GD.j> b10 = this.f131095s;
        do {
            value = b10.getValue();
        } while (!b10.e(value, GD.j.b(value, (C12934g) null, (C13023e) null, (C12933f) null, (C12933f) null, (C12933f) null, (k.b.f) null, false, eVar, (String) null, 383, (Object) null)));
    }

    private final String E(String str) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (!C15835a.c(charAt)) {
                sb2.append(charAt);
            }
        }
        return sb2.toString();
    }

    private final C12932e F() {
        return this.f131095s.getValue().c();
    }

    /* JADX WARNING: type inference failed for: r15v4, types: [GD.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void G(GD.C12935h.a r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof GD.C12935h.a.c
            r1 = 0
            if (r0 == 0) goto L_0x001b
            uD.a r0 = r14.f131093q
            GD.h$a$c r15 = (GD.C12935h.a.c) r15
            GD.h$a$g r15 = r15.a()
            r0.c(r15)
            GD.e$c r15 = new GD.e$c
            r0 = 1
            r15.<init>(r1, r0, r1)
            r14.D(r15)
            goto L_0x00de
        L_0x001b:
            boolean r0 = r15 instanceof GD.C12935h.a.e
            if (r0 == 0) goto L_0x0033
            GD.e$c r0 = new GD.e$c
            GD.h$a$e r15 = (GD.C12935h.a.e) r15
            java.lang.String r15 = r15.a()
            java.lang.String r15 = r14.E(r15)
            r0.<init>(r15)
            r14.D(r0)
            goto L_0x00de
        L_0x0033:
            boolean r0 = r15 instanceof GD.C12935h.a.C2646a
            if (r0 == 0) goto L_0x003c
            r14.D(r1)
            goto L_0x00de
        L_0x003c:
            boolean r0 = r15 instanceof GD.C12935h.a.C2647h
            if (r0 == 0) goto L_0x0067
            GD.e r15 = r14.F()
            boolean r0 = r15 instanceof GD.C12932e.c
            if (r0 == 0) goto L_0x004b
            GD.e$c r15 = (GD.C12932e.c) r15
            goto L_0x004c
        L_0x004b:
            r15 = r1
        L_0x004c:
            if (r15 == 0) goto L_0x0066
            boolean r0 = r15.a()
            if (r0 != 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r15 = r1
        L_0x0056:
            if (r15 == 0) goto L_0x0066
            java.lang.String r15 = r15.b()
            tD.e$d r0 = new tD.e$d
            r0.<init>(r14, r15, r1)
            r14.K(r0)
            goto L_0x00de
        L_0x0066:
            return
        L_0x0067:
            boolean r0 = r15 instanceof GD.C12935h.a.b
            if (r0 == 0) goto L_0x0086
            GD.e r15 = r14.F()
            if (r15 == 0) goto L_0x0085
            java.lang.String r15 = r15.b()
            if (r15 != 0) goto L_0x0078
            goto L_0x0085
        L_0x0078:
            GD.e$c r0 = new GD.e$c
            java.lang.String r15 = r14.E(r15)
            r0.<init>(r15)
            r14.D(r0)
            goto L_0x00de
        L_0x0085:
            return
        L_0x0086:
            boolean r0 = r15 instanceof GD.C12935h.a.d
            if (r0 == 0) goto L_0x00bb
            GD.e r15 = r14.F()
            boolean r0 = r15 instanceof GD.C12932e.a
            if (r0 == 0) goto L_0x0095
            r1 = r15
            GD.e$a r1 = (GD.C12932e.a) r1
        L_0x0095:
            if (r1 != 0) goto L_0x0098
            return
        L_0x0098:
            TJ.B<GD.j> r0 = r14.f131095s
        L_0x009a:
            java.lang.Object r15 = r0.getValue()
            r2 = r15
            GD.j r2 = (GD.j) r2
            java.lang.String r11 = r1.b()
            r12 = 127(0x7f, float:1.78E-43)
            r13 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            GD.j r2 = GD.j.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r15 = r0.e(r15, r2)
            if (r15 == 0) goto L_0x009a
            goto L_0x00de
        L_0x00bb:
            boolean r15 = r15 instanceof GD.C12935h.a.f
            if (r15 == 0) goto L_0x00df
            TJ.B<GD.j> r15 = r14.f131095s
        L_0x00c1:
            java.lang.Object r0 = r15.getValue()
            r1 = r0
            GD.j r1 = (GD.j) r1
            r11 = 127(0x7f, float:1.78E-43)
            r12 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            GD.j r1 = GD.j.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = r15.e(r0, r1)
            if (r0 == 0) goto L_0x00c1
        L_0x00de:
            return
        L_0x00df:
            XH.t r15 = new XH.t
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: tD.C15068e.G(GD.h$a):void");
    }

    private final void H(C12935h.c cVar) {
        GD.j value;
        GD.j value2;
        GD.j value3;
        if (cVar instanceof C12935h.c.C2648c) {
            if (this.f131095s.getValue().e() == null) {
                C16505B<GD.j> b10 = this.f131095s;
                do {
                    value3 = b10.getValue();
                } while (!b10.e(value3, GD.j.b(value3, (C12934g) null, (C13023e) null, (C12933f) null, (C12933f) null, (C12933f) null, ((C12935h.c.C2648c) cVar).a(), true, (C12932e) null, (String) null, 415, (Object) null)));
            }
        } else if (cVar instanceof C12935h.c.b) {
            k.b.f e10 = this.f131095s.getValue().e();
            if (e10 != null) {
                this.f131093q.b(e10);
                C16505B<GD.j> b11 = this.f131095s;
                do {
                    value2 = b11.getValue();
                } while (!b11.e(value2, GD.j.b(value2, (C12934g) null, (C13023e) null, (C12933f) null, (C12933f) null, (C12933f) null, (k.b.f) null, false, (C12932e) null, (String) null, 447, (Object) null)));
                K(new C3243e(this, e10, (C17164e<? super C3243e>) null));
            }
        } else if (cVar instanceof C12935h.c.a) {
            C16505B<GD.j> b12 = this.f131095s;
            do {
                value = b12.getValue();
            } while (!b12.e(value, GD.j.b(value, (C12934g) null, (C13023e) null, (C12933f) null, (C12933f) null, (C12933f) null, (k.b.f) null, false, (C12932e) null, (String) null, 415, (Object) null)));
        } else {
            throw new t();
        }
    }

    private final void I(C12935h.d dVar) {
        if (dVar instanceof C12935h.d.a) {
            this.f131093q.d(((C12935h.d.a) dVar).a());
            return;
        }
        throw new t();
    }

    private final void J(C12935h.e eVar) {
        if (eVar instanceof C12935h.e.a) {
            this.f131093q.a(((C12935h.e.a) eVar).a());
            return;
        }
        throw new t();
    }

    private final void K(p<? super Q, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        F0 unused = C16314k.d(g0.a(this), new f(N.f137593c0, this), (T) null, pVar, 2, (Object) null);
    }

    private final void L(C12934g gVar) {
        GD.j value;
        C16505B<GD.j> b10 = this.f131095s;
        do {
            value = b10.getValue();
        } while (!b10.e(value, GD.j.b(value, gVar, (C13023e) null, (C12933f) null, (C12933f) null, (C12933f) null, (k.b.f) null, false, (C12932e) null, (String) null, 510, (Object) null)));
    }

    public final void M(C12935h hVar) {
        GD.j value;
        Integer value2;
        GD.j value3;
        C17542s.j(hVar, "event");
        if (hVar instanceof C12935h.d) {
            I((C12935h.d) hVar);
        } else if (hVar instanceof C12935h.e) {
            J((C12935h.e) hVar);
        } else if (hVar instanceof C12935h.a) {
            G((C12935h.a) hVar);
        } else if (hVar instanceof C12935h.c) {
            H((C12935h.c) hVar);
        } else if (hVar instanceof C12935h.b) {
            C(((C12935h.b) hVar).a());
        } else if (hVar == C12935h.f.BackClicked) {
            L(C12934g.a.f110369a);
        } else if (hVar == C12935h.f.NavigationCompleted) {
            C16505B<GD.j> b10 = this.f131095s;
            do {
                value3 = b10.getValue();
            } while (!b10.e(value3, GD.j.b(value3, (C12934g) null, (C13023e) null, (C12933f) null, (C12933f) null, (C12933f) null, (k.b.f) null, false, (C12932e) null, (String) null, 510, (Object) null)));
        } else if (hVar == C12935h.f.RetryPrepaid) {
            C16505B<Integer> b11 = this.f131096t;
            do {
                value2 = b11.getValue();
            } while (!b11.e(value2, Integer.valueOf(value2.intValue() + 1)));
        } else if (hVar == C12935h.f.UpgradeClicked) {
            L(C12934g.b.f110370a);
        } else if (hVar == C12935h.f.UserMessageDismissed) {
            C16505B<GD.j> b12 = this.f131095s;
            do {
                value = b12.getValue();
            } while (!b12.e(value, GD.j.b(value, (C12934g) null, (C13023e) null, (C12933f) null, (C12933f) null, (C12933f) null, (k.b.f) null, false, (C12932e) null, (String) null, 509, (Object) null)));
        } else {
            throw new t();
        }
    }

    public final C16519P<GD.i> m() {
        return this.f131097u;
    }
}
