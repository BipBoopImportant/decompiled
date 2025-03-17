package Fi;

import HJ.C15854t;
import Hx.c;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import XH.C16807N;
import aA.C13909a;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import tf.C10253a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LFi/f;", "LFi/e;", "LGx/a;", "purchaseHistoryRepository", "Ltf/a;", "killSwitchRepository", "LaA/a;", "sessionManager", "<init>", "(LGx/a;Ltf/a;LaA/a;)V", "LQJ/Q;", "viewModelScope", "", "orderId", "liteId", "LXH/N;", "f", "(LQJ/Q;Ljava/lang/String;Ljava/lang/String;)V", "LTJ/g;", "LHx/c$d$c;", "a", "(LQJ/Q;Ljava/lang/String;Ljava/lang/String;)LTJ/g;", "LGx/a;", "b", "Ltf/a;", "c", "LaA/a;", "LTJ/B;", "d", "LTJ/B;", "flow", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Gx.a f80855a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C10253a f80856b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C13909a f80857c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C16505B<c.d.C2665c> f80858d = C16521S.a(null);

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Fi/f$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f80859a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(N.a aVar, f fVar) {
            super(aVar);
            this.f80859a = fVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            f fVar = this.f80859a;
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Unable to fetch express returns authorization", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = fVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            C16505B b10 = this.f80859a.f80858d;
            do {
                value = b10.getValue();
                c.d.C2665c cVar = (c.d.C2665c) value;
            } while (!b10.e(value, new c.d.C2665c(false, "")));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.usecase.GetExpressReturnActionUseCaseImpl$getExpressReturnAction$2", f = "GetExpressReturnActionUseCase.kt", l = {68, 76}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        boolean f80860c;

        /* renamed from: d  reason: collision with root package name */
        int f80861d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f f80862e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f80863f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f80864g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, String str, String str2, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f80862e = fVar;
            this.f80863f = str;
            this.f80864g = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f80862e, this.f80863f, this.f80864g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x009e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f80861d
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x001f
                if (r1 == r4) goto L_0x001b
                if (r1 != r3) goto L_0x0013
                XH.y.b(r7)
                goto L_0x006b
            L_0x0013:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001b:
                XH.y.b(r7)
                goto L_0x0047
            L_0x001f:
                XH.y.b(r7)
                Fi.f r7 = r6.f80862e
                tf.a r7 = r7.f80856b
                boolean r7 = r7.M()
                if (r7 == 0) goto L_0x004a
                java.lang.String r1 = r6.f80863f
                if (r1 == 0) goto L_0x004a
                Fi.f r1 = r6.f80862e
                Gx.a r1 = r1.f80855a
                java.lang.String r3 = r6.f80863f
                java.lang.String r5 = r6.f80864g
                r6.f80860c = r7
                r6.f80861d = r4
                java.lang.Object r7 = r1.f(r3, r5, r6)
                if (r7 != r0) goto L_0x0047
                return r0
            L_0x0047:
                Gx.b r7 = (Gx.b) r7
                goto L_0x006f
            L_0x004a:
                if (r7 == 0) goto L_0x006e
                Fi.f r1 = r6.f80862e
                aA.a r1 = r1.f80857c
                boolean r1 = r1.isLoggedIn()
                if (r1 == 0) goto L_0x006e
                Fi.f r1 = r6.f80862e
                Gx.a r1 = r1.f80855a
                java.lang.String r5 = r6.f80864g
                r6.f80860c = r7
                r6.f80861d = r3
                java.lang.Object r7 = r1.c(r5, r6)
                if (r7 != r0) goto L_0x006b
                return r0
            L_0x006b:
                Gx.b r7 = (Gx.b) r7
                goto L_0x006f
            L_0x006e:
                r7 = r2
            L_0x006f:
                Fi.f r0 = r6.f80862e
                TJ.B r0 = r0.f80858d
            L_0x0075:
                java.lang.Object r1 = r0.getValue()
                r3 = r1
                Hx.c$d$c r3 = (Hx.c.d.C2665c) r3
                if (r7 == 0) goto L_0x009e
                boolean r3 = r7.b()
                if (r3 != r4) goto L_0x009e
                java.lang.String r3 = r7.a()
                if (r3 == 0) goto L_0x009e
                Hx.c$d$c r3 = new Hx.c$d$c
                java.lang.String r5 = r7.a()
                if (r5 == 0) goto L_0x0096
                r3.<init>(r4, r5)
                goto L_0x009f
            L_0x0096:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Required value was null."
                r7.<init>(r0)
                throw r7
            L_0x009e:
                r3 = r2
            L_0x009f:
                boolean r1 = r0.e(r1, r3)
                if (r1 == 0) goto L_0x0075
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Fi.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public f(Gx.a aVar, C10253a aVar2, C13909a aVar3) {
        C17542s.j(aVar, "purchaseHistoryRepository");
        C17542s.j(aVar2, "killSwitchRepository");
        C17542s.j(aVar3, "sessionManager");
        this.f80855a = aVar;
        this.f80856b = aVar2;
        this.f80857c = aVar3;
    }

    private final void f(Q q10, String str, String str2) {
        F0 unused = C16314k.d(q10, new a(N.f137593c0, this), (T) null, new b(this, str2, str, (C17164e<? super b>) null), 2, (Object) null);
    }

    public C16532g<c.d.C2665c> a(Q q10, String str, String str2) {
        C17542s.j(q10, "viewModelScope");
        C17542s.j(str, "orderId");
        C16505B<c.d.C2665c> b10 = this.f80858d;
        f(q10, str, str2);
        return b10;
    }
}
