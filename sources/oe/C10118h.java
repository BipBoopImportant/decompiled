package oe;

import HJ.C15854t;
import QJ.C16310i;
import QJ.F0;
import QJ.M;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import am.C11070a;
import com.adjust.sdk.AdjustEvent;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import ne.C10089a;
import ne.C10090b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0011B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Loe/h;", "Lne/a;", "Loe/g;", "adjustTrackerContract", "Loe/i;", "adjustWrapper", "Lam/a;", "appApi", "LQJ/M;", "dispatcher", "LQJ/Q;", "applicationScope", "<init>", "(Loe/g;Loe/i;Lam/a;LQJ/M;LQJ/Q;)V", "Lne/b;", "event", "LXH/N;", "a", "(Lne/b;)V", "Loe/g;", "b", "Loe/i;", "c", "Lam/a;", "d", "LQJ/M;", "e", "LQJ/Q;", "getApplicationScope", "()LQJ/Q;", "f", "adjust-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oe.h  reason: case insensitive filesystem */
public final class C10118h implements C10089a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f75714f = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C10117g f75715a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C10119i f75716b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C11070a f75717c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final M f75718d;

    /* renamed from: e  reason: collision with root package name */
    private final Q f75719e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Loe/h$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "adjust-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: oe.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"oe/h$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: oe.h$b */
    public static final class b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10118h f75720a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(N.a aVar, C10118h hVar) {
            super(aVar);
            this.f75720a = hVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C10118h hVar = this.f75720a;
            e eVar = e.DEBUG;
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
                    String a10 = C11818a.a("Something went wrong while sending event to Adjust.", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = hVar.getClass().getName();
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
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.adjust.impl.AdjustTrackerImpl$trackEvent$3", f = "AdjustTrackerImpl.kt", l = {44}, m = "invokeSuspend")
    /* renamed from: oe.h$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f75721c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C10118h f75722d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C10090b f75723e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.adjust.impl.AdjustTrackerImpl$trackEvent$3$1", f = "AdjustTrackerImpl.kt", l = {51}, m = "invokeSuspend")
        /* renamed from: oe.h$c$a */
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f75724c;

            /* renamed from: d  reason: collision with root package name */
            int f75725d;

            /* renamed from: e  reason: collision with root package name */
            private /* synthetic */ Object f75726e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C10118h f75727f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C10090b f75728g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C10118h hVar, C10090b bVar, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f75727f = hVar;
                this.f75728g = bVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f75727f, this.f75728g, eVar);
                aVar.f75726e = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                String str;
                Object f10 = C17187b.f();
                int i10 = this.f75725d;
                if (i10 == 0) {
                    y.b(obj);
                    Q q10 = (Q) this.f75726e;
                    String b10 = this.f75727f.f75717c.b() ? this.f75728g.b() : this.f75728g.c();
                    C16532g<Boolean> b11 = this.f75727f.f75715a.b();
                    this.f75726e = q10;
                    this.f75724c = b10;
                    this.f75725d = 1;
                    obj2 = C16534i.B(b11, this);
                    if (obj2 == f10) {
                        return f10;
                    }
                    str = b10;
                } else if (i10 == 1) {
                    str = (String) this.f75724c;
                    Q q11 = (Q) this.f75726e;
                    y.b(obj);
                    obj2 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str2 = null;
                if (!((Boolean) obj2).booleanValue()) {
                    e eVar = e.DEBUG;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str3 = null;
                    for (C11819b bVar : arrayList) {
                        if (str2 == null) {
                            String a10 = C11818a.a("Adjust SDK is disabled by app, no events will be fired.", (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str2 = C11820c.a(a10);
                        }
                        if (str3 == null) {
                            str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Adjust:Tracker";
                        }
                        String str4 = str3;
                        bVar.a(eVar, str4, false, (Throwable) null, str2);
                        str3 = str4;
                    }
                    return C16807N.f139792a;
                }
                AdjustEvent adjustEvent = new AdjustEvent(str);
                Double d10 = this.f75728g.d();
                if (d10 != null) {
                    adjustEvent.setRevenue(d10.doubleValue(), this.f75727f.f75715a.a());
                }
                Map<String, String> a11 = this.f75728g.a();
                if (a11 != null) {
                    for (Map.Entry next2 : a11.entrySet()) {
                        adjustEvent.addCallbackParameter((String) next2.getKey(), (String) next2.getValue());
                    }
                }
                String e10 = this.f75728g.e();
                if (e10 != null) {
                    adjustEvent.addCallbackParameter("transaction_id", e10);
                    adjustEvent.setOrderId(e10);
                }
                C10090b bVar2 = this.f75728g;
                e eVar2 = e.DEBUG;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next3 : d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar2, true)) {
                        arrayList2.add(next3);
                    }
                }
                String str5 = null;
                for (C11819b bVar3 : arrayList2) {
                    if (str2 == null) {
                        String a12 = C11818a.a("Adjust tracking: " + bVar2 + "(" + str + ")", (Throwable) null);
                        if (a12 == null) {
                            break;
                        }
                        str2 = C11820c.a(a12);
                    }
                    if (str5 == null) {
                        str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Adjust:Tracker";
                    }
                    String str6 = str5;
                    bVar3.a(eVar2, str6, true, (Throwable) null, str2);
                    str5 = str6;
                    eVar2 = eVar2;
                }
                this.f75727f.f75716b.trackEvent(adjustEvent);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C10118h hVar, C10090b bVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f75722d = hVar;
            this.f75723e = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f75722d, this.f75723e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f75721c;
            if (i10 == 0) {
                y.b(obj);
                M e10 = this.f75722d.f75718d;
                a aVar = new a(this.f75722d, this.f75723e, (C17164e<? super a>) null);
                this.f75721c = 1;
                if (C16310i.g(e10, aVar, this) == f10) {
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

    public C10118h(C10117g gVar, C10119i iVar, C11070a aVar, M m10, Q q10) {
        C17542s.j(gVar, "adjustTrackerContract");
        C17542s.j(iVar, "adjustWrapper");
        C17542s.j(aVar, "appApi");
        C17542s.j(m10, "dispatcher");
        C17542s.j(q10, "applicationScope");
        this.f75715a = gVar;
        this.f75716b = iVar;
        this.f75717c = aVar;
        this.f75718d = m10;
        this.f75719e = q10;
    }

    public void a(C10090b bVar) {
        C10090b bVar2 = bVar;
        C17542s.j(bVar2, "event");
        String str = null;
        if (!this.f75716b.b()) {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            for (C11819b bVar3 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Adjust SDK is disabled, no events will be fired.", (Throwable) null);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str2 == null) {
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Adjust:Tracker";
                }
                String str3 = str2;
                bVar3.a(eVar, str3, false, (Throwable) null, str);
                str2 = str3;
            }
            return;
        }
        F0 unused = C16314k.d(this.f75719e, new b(N.f137593c0, this), (T) null, new c(this, bVar2, (C17164e<? super c>) null), 2, (Object) null);
    }
}
