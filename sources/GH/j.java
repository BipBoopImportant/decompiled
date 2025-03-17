package gh;

import Ae.e;
import HJ.C15854t;
import KC.s;
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
import XH.y;
import aA.C13909a;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import gh.C9742a;
import gh.i;
import gx.C14521a;
import hx.C14544b;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.t;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import tf.C10253a;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001b¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\u001b¢\u0006\u0004\b!\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0*8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130*8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010,R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e018\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0015058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lgh/j;", "Landroidx/lifecycle/f0;", "LAe/e;", "analytics", "LaA/a;", "sessionManager", "Ltf/a;", "killSwitchRepository", "Lhx/b;", "giftCardRepository", "LKC/s;", "giftCardValidator", "<init>", "(LAe/e;LaA/a;Ltf/a;Lhx/b;LKC/s;)V", "", "loggedIn", "Lix/b;", "giftCard", "isLoading", "Lgh/a;", "error", "Lgh/i;", "G", "(ZLix/b;ZLgh/a;)Lgh/i;", "", "number", "pin", "LXH/N;", "H", "(Ljava/lang/String;Ljava/lang/String;)V", "I", "()V", "E", "J", "m", "LAe/e;", "n", "Ltf/a;", "o", "Lhx/b;", "p", "LKC/s;", "LTJ/B;", "q", "LTJ/B;", "checkBalanceStatePlaceholder", "r", "s", "hasError", "LTJ/g;", "t", "LTJ/g;", "isGiftCardBalanceEnabled", "LTJ/P;", "u", "LTJ/P;", "F", "()LTJ/P;", "checkGiftCardBalanceState", "giftcard-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final e f73122m;

    /* renamed from: n  reason: collision with root package name */
    private final C10253a f73123n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C14544b f73124o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final s f73125p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C16505B<ix.b> f73126q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C16505B<Boolean> f73127r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C16505B<C9742a> f73128s;

    /* renamed from: t  reason: collision with root package name */
    private final C16532g<Boolean> f73129t;

    /* renamed from: u  reason: collision with root package name */
    private final C16519P<i> f73130u;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "loggedIn", "enabled", "Lix/b;", "giftCardStatePlaceHolder", "isLoading", "Lgh/a;", "hasError", "Lgh/i;", "<anonymous>", "(ZZLix/b;ZLgh/a;)Lgh/i;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.mcommerce.giftcard.impl.viewmodel.CheckGiftCardBalanceViewModel$checkGiftCardBalanceState$1", f = "CheckGiftCardBalanceViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements t<Boolean, Boolean, ix.b, Boolean, C9742a, C17164e<? super i>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73131c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f73132d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f73133e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f73134f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ boolean f73135g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f73136h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ j f73137i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar, C17164e<? super a> eVar) {
            super(6, eVar);
            this.f73137i = jVar;
        }

        public final Object i(boolean z10, boolean z11, ix.b bVar, boolean z12, C9742a aVar, C17164e<? super i> eVar) {
            a aVar2 = new a(this.f73137i, eVar);
            aVar2.f73132d = z10;
            aVar2.f73133e = z11;
            aVar2.f73134f = bVar;
            aVar2.f73135g = z12;
            aVar2.f73136h = aVar;
            return aVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f73131c == 0) {
                y.b(obj);
                return !this.f73133e ? i.b.f73117a : this.f73137i.G(this.f73132d, (ix.b) this.f73134f, this.f73135g, (C9742a) this.f73136h);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            return i(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (ix.b) obj3, ((Boolean) obj4).booleanValue(), (C9742a) obj5, (C17164e) obj6);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"gh/j$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f73138a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(N.a aVar, j jVar) {
            super(aVar);
            this.f73138a = jVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object obj;
            C16505B k10 = this.f73138a.f73128s;
            if (C17542s.e(th2, C14521a.C3127a.f127374a)) {
                obj = C9742a.C1275a.f73099a;
            } else {
                if (!C17542s.e(th2, C14521a.b.f127375a)) {
                    j jVar = this.f73138a;
                    qv.e eVar = qv.e.ERROR;
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
                            String a10 = C11818a.a("Unexpected exception", th2);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = jVar.getClass().getName();
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
                }
                obj = C9742a.b.f73100a;
            }
            k10.setValue(obj);
            this.f73138a.f73127r.setValue(Boolean.FALSE);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.mcommerce.giftcard.impl.viewmodel.CheckGiftCardBalanceViewModel$onBalanceCheck$2", f = "CheckGiftCardBalanceViewModel.kt", l = {100, 102}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f73139c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f73140d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f73141e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f73142f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f73143g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(j jVar, String str, String str2, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f73141e = jVar;
            this.f73142f = str;
            this.f73143g = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f73141e, this.f73142f, this.f73143g, eVar);
            cVar.f73140d = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00b5  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f73139c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x002c
                if (r2 == r4) goto L_0x0022
                if (r2 != r3) goto L_0x001a
                java.lang.Object r1 = r0.f73140d
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r18)
                r5 = r18
                goto L_0x007b
            L_0x001a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0022:
                java.lang.Object r1 = r0.f73140d
                QJ.Q r1 = (QJ.Q) r1
                XH.y.b(r18)
                r5 = r18
                goto L_0x0064
            L_0x002c:
                XH.y.b(r18)
                java.lang.Object r2 = r0.f73140d
                QJ.Q r2 = (QJ.Q) r2
                gh.j r5 = r0.f73141e
                TJ.B r5 = r5.f73127r
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
                r5.setValue(r6)
                gh.j r5 = r0.f73141e
                KC.s r5 = r5.f73125p
                java.lang.String r6 = r0.f73142f
                boolean r5 = r5.b(r6)
                if (r5 == 0) goto L_0x0067
                gh.j r5 = r0.f73141e
                hx.b r5 = r5.f73124o
                java.lang.String r6 = r0.f73142f
                java.lang.String r7 = r0.f73143g
                r0.f73140d = r2
                r0.f73139c = r4
                java.lang.Object r5 = r5.a(r6, r7, r0)
                if (r5 != r1) goto L_0x0063
                return r1
            L_0x0063:
                r1 = r2
            L_0x0064:
                ix.b r5 = (ix.b) r5
                goto L_0x007d
            L_0x0067:
                gh.j r5 = r0.f73141e
                hx.b r5 = r5.f73124o
                java.lang.String r6 = r0.f73142f
                r0.f73140d = r2
                r0.f73139c = r3
                java.lang.Object r5 = r5.e(r6, r0)
                if (r5 != r1) goto L_0x007a
                return r1
            L_0x007a:
                r1 = r2
            L_0x007b:
                ix.b r5 = (ix.b) r5
            L_0x007d:
                qv.e r2 = qv.e.DEBUG
                qv.d r6 = qv.d.f102012a
                java.util.List r6 = r6.a()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r6 = r6.iterator()
            L_0x0090:
                boolean r8 = r6.hasNext()
                r12 = 0
                if (r8 == 0) goto L_0x00a8
                java.lang.Object r8 = r6.next()
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                boolean r9 = r9.b(r2, r12)
                if (r9 == 0) goto L_0x0090
                r7.add(r8)
                goto L_0x0090
            L_0x00a8:
                java.util.Iterator r13 = r7.iterator()
                r14 = 0
                r6 = r14
                r7 = r6
            L_0x00af:
                boolean r8 = r13.hasNext()
                if (r8 == 0) goto L_0x013e
                java.lang.Object r8 = r13.next()
                qv.b r8 = (qv.C11819b) r8
                r10 = 0
                if (r6 != 0) goto L_0x00de
                java.lang.String r6 = r5.b()
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r11 = "Found balance, for cardNumber: "
                r9.append(r11)
                r9.append(r6)
                java.lang.String r6 = r9.toString()
                java.lang.String r6 = qv.C11818a.a(r6, r10)
                if (r6 != 0) goto L_0x00da
                goto L_0x013e
            L_0x00da:
                java.lang.String r6 = qv.C11820c.a(r6)
            L_0x00de:
                r15 = r6
                if (r7 != 0) goto L_0x012e
                java.lang.Class r6 = r1.getClass()
                java.lang.String r6 = r6.getName()
                kotlin.jvm.internal.C17542s.g(r6)
                r7 = 36
                java.lang.String r7 = HJ.C15854t.s1(r6, r7, r14, r3, r14)
                r9 = 46
                java.lang.String r7 = HJ.C15854t.o1(r7, r9, r14, r3, r14)
                int r9 = r7.length()
                if (r9 != 0) goto L_0x00ff
                goto L_0x0105
            L_0x00ff:
                java.lang.String r6 = "Kt"
                java.lang.String r6 = HJ.C15854t.P0(r7, r6)
            L_0x0105:
                java.lang.Thread r7 = java.lang.Thread.currentThread()
                java.lang.String r7 = r7.getName()
                java.lang.String r9 = "main"
                boolean r7 = HJ.C15854t.b0(r7, r9, r4)
                if (r7 == 0) goto L_0x0118
                java.lang.String r7 = "m"
                goto L_0x011a
            L_0x0118:
                java.lang.String r7 = "b"
            L_0x011a:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r7)
                java.lang.String r7 = "|"
                r9.append(r7)
                r9.append(r6)
                java.lang.String r7 = r9.toString()
            L_0x012e:
                r16 = r7
                r9 = 0
                r6 = r8
                r7 = r2
                r8 = r16
                r11 = r15
                r6.a(r7, r8, r9, r10, r11)
                r6 = r15
                r7 = r16
                goto L_0x00af
            L_0x013e:
                gh.j r1 = r0.f73141e
                TJ.B r1 = r1.f73126q
                r1.setValue(r5)
                gh.j r1 = r0.f73141e
                TJ.B r1 = r1.f73127r
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r12)
                r1.setValue(r2)
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: gh.j.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f73144a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f73145a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.mcommerce.giftcard.impl.viewmodel.CheckGiftCardBalanceViewModel$special$$inlined$map$1$2", f = "CheckGiftCardBalanceViewModel.kt", l = {50}, m = "emit")
            /* renamed from: gh.j$d$a$a  reason: collision with other inner class name */
            public static final class C1278a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f73146c;

                /* renamed from: d  reason: collision with root package name */
                int f73147d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f73148e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1278a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f73148e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f73146c = obj;
                    this.f73147d |= Integer.MIN_VALUE;
                    return this.f73148e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f73145a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof gh.j.d.a.C1278a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    gh.j$d$a$a r0 = (gh.j.d.a.C1278a) r0
                    int r1 = r0.f73147d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f73147d = r1
                    goto L_0x0018
                L_0x0013:
                    gh.j$d$a$a r0 = new gh.j$d$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f73146c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f73147d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004d
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f73145a
                    com.ingka.ikea.killswitch.model.KillSwitchConfig r5 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r5
                    if (r5 == 0) goto L_0x003f
                    boolean r5 = r5.o()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f73147d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: gh.j.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar) {
            this.f73144a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f73144a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public j(e eVar, C13909a aVar, C10253a aVar2, C14544b bVar, s sVar) {
        C17542s.j(eVar, "analytics");
        C17542s.j(aVar, "sessionManager");
        C17542s.j(aVar2, "killSwitchRepository");
        C17542s.j(bVar, "giftCardRepository");
        C17542s.j(sVar, "giftCardValidator");
        this.f73122m = eVar;
        this.f73123n = aVar2;
        this.f73124o = bVar;
        this.f73125p = sVar;
        C16505B<ix.b> a10 = C16521S.a(null);
        this.f73126q = a10;
        C16505B<Boolean> a11 = C16521S.a(Boolean.FALSE);
        this.f73127r = a11;
        C16505B<C9742a> a12 = C16521S.a(null);
        this.f73128s = a12;
        C16532g<Boolean> s10 = C16534i.s(new d(aVar2.I()));
        this.f73129t = s10;
        this.f73130u = C16534i.c0(C16534i.k(aVar.n(), s10, a10, a11, a12, new a(this, (C17164e<? super a>) null)), g0.a(this), ip.f.a(), G(aVar.isLoggedIn(), a10.getValue(), false, (C9742a) null));
    }

    /* access modifiers changed from: private */
    public final i G(boolean z10, ix.b bVar, boolean z11, C9742a aVar) {
        if (!z10) {
            return i.e.f73121a;
        }
        if (!z10) {
            throw new XH.t();
        } else if (!this.f73125p.a()) {
            return i.d.f73120a;
        } else {
            if (bVar == null) {
                return new i.c(z11, aVar);
            }
            e.c.c(this.f73122m, Ae.j.ACTION_VIEWED.b(), (Map) null, Interaction$Component.CHECK_GIFT_REFUND_CARD_BALANCE, (e.b) null, 8, (Object) null);
            return new i.a(k.a(bVar), bVar);
        }
    }

    public final void E() {
        this.f73128s.setValue(null);
    }

    public final C16519P<i> F() {
        return this.f73130u;
    }

    public final void H(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        C17542s.j(str3, "number");
        C17542s.j(str4, "pin");
        e.c.c(this.f73122m, Ae.j.ACTION_TAP.b(), (Map) null, Interaction$Component.CHECK_GIFT_REFUND_CARD_BALANCE, (e.b) null, 8, (Object) null);
        F0 unused = C16314k.d(g0.a(this), new b(N.f137593c0, this), (T) null, new c(this, str3, str4, (C17164e<? super c>) null), 2, (Object) null);
    }

    public final void I() {
        this.f73126q.setValue(null);
    }

    public final void J() {
        if (C17542s.e(this.f73128s.getValue(), C9742a.b.f73100a)) {
            this.f73128s.setValue(null);
        }
    }
}
