package or;

import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import dI.C17164e;
import eI.C17187b;
import jr.C11450b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kr.h;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lor/n;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lnr/h;", "getRewardFlowUseCase", "Ljr/b;", "mapper", "<init>", "(Landroidx/lifecycle/U;Lnr/h;Ljr/b;)V", "", "m", "Ljava/lang/String;", "rewardId", "LTJ/P;", "Lkr/h;", "n", "LTJ/P;", "()LTJ/P;", "uiState", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final String f100752m;

    /* renamed from: n  reason: collision with root package name */
    private final C16519P<h> f100753n;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C16532g<h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f100754a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C11450b f100755b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: or.n$a$a  reason: collision with other inner class name */
        public static final class C2362a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f100756a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C11450b f100757b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.familyrewards.implementation.viewmodel.RewardBottomSheetViewModel$special$$inlined$map$1$2", f = "RewardBottomSheetViewModel.kt", l = {50}, m = "emit")
            /* renamed from: or.n$a$a$a  reason: collision with other inner class name */
            public static final class C2363a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f100758c;

                /* renamed from: d  reason: collision with root package name */
                int f100759d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2362a f100760e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2363a(C2362a aVar, C17164e eVar) {
                    super(eVar);
                    this.f100760e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f100758c = obj;
                    this.f100759d |= Integer.MIN_VALUE;
                    return this.f100760e.emit((Object) null, this);
                }
            }

            public C2362a(C16533h hVar, C11450b bVar) {
                this.f100756a = hVar;
                this.f100757b = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof or.n.a.C2362a.C2363a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    or.n$a$a$a r0 = (or.n.a.C2362a.C2363a) r0
                    int r1 = r0.f100759d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f100759d = r1
                    goto L_0x0018
                L_0x0013:
                    or.n$a$a$a r0 = new or.n$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f100758c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f100759d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x005f
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f100756a
                    nr.h$a r5 = (nr.h.a) r5
                    boolean r2 = r5 instanceof nr.h.a.C2309a
                    if (r2 == 0) goto L_0x003f
                    kr.h$a r5 = kr.h.a.f99165a
                    goto L_0x0056
                L_0x003f:
                    boolean r2 = r5 instanceof nr.h.a.b
                    if (r2 == 0) goto L_0x0046
                    kr.h$d r5 = kr.h.d.f99171a
                    goto L_0x0056
                L_0x0046:
                    boolean r2 = r5 instanceof nr.h.a.c
                    if (r2 == 0) goto L_0x0062
                    jr.b r2 = r4.f100757b
                    nr.h$a$c r5 = (nr.h.a.c) r5
                    Qq.g r5 = r5.a()
                    kr.h r5 = r2.a(r5)
                L_0x0056:
                    r0.f100759d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x005f
                    return r1
                L_0x005f:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                L_0x0062:
                    XH.t r5 = new XH.t
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: or.n.a.C2362a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar, C11450b bVar) {
            this.f100754a = gVar;
            this.f100755b = bVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f100754a.collect(new C2362a(hVar, this.f100755b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public n(U u10, nr.h hVar, C11450b bVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(hVar, "getRewardFlowUseCase");
        C17542s.j(bVar, "mapper");
        Object f10 = u10.f("rewardId");
        if (f10 != null) {
            String str = (String) f10;
            this.f100752m = str;
            this.f100753n = C16534i.c0(new a(hVar.a(str), bVar), g0.a(this), ip.f.a(), h.d.f99171a);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final C16519P<h> m() {
        return this.f100753n;
    }
}
