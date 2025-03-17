package fB;

import HJ.C15854t;
import QJ.Q;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.x;
import XH.y;
import bp.C11116a;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import jB.C14613b;
import java.util.ArrayList;
import kB.C14669a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LfB/a;", "LkB/a;", "Lbp/a;", "networkAvailabilityObserver", "LjB/b;", "shoppingListRepository", "LQJ/Q;", "appScope", "<init>", "(Lbp/a;LjB/b;LQJ/Q;)V", "LXH/N;", "execute", "()V", "a", "Lbp/a;", "b", "LjB/b;", "c", "LQJ/Q;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fB.a  reason: case insensitive filesystem */
public final class C14441a implements C14669a {

    /* renamed from: a  reason: collision with root package name */
    private final C11116a f126863a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C14613b f126864b;

    /* renamed from: c  reason: collision with root package name */
    private final Q f126865c;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fB.a$a  reason: collision with other inner class name */
    public static final class C3104a implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f126866a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: fB.a$a$a  reason: collision with other inner class name */
        public static final class C3105a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f126867a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.task.FetchListsTaskImpl$execute$$inlined$filter$1$2", f = "FetchListsTaskImpl.kt", l = {50}, m = "emit")
            /* renamed from: fB.a$a$a$a  reason: collision with other inner class name */
            public static final class C3106a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f126868c;

                /* renamed from: d  reason: collision with root package name */
                int f126869d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C3105a f126870e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C3106a(C3105a aVar, C17164e eVar) {
                    super(eVar);
                    this.f126870e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f126868c = obj;
                    this.f126869d |= Integer.MIN_VALUE;
                    return this.f126870e.emit((Object) null, this);
                }
            }

            public C3105a(C16533h hVar) {
                this.f126867a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof fB.C14441a.C3104a.C3105a.C3106a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    fB.a$a$a$a r0 = (fB.C14441a.C3104a.C3105a.C3106a) r0
                    int r1 = r0.f126869d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f126869d = r1
                    goto L_0x0018
                L_0x0013:
                    fB.a$a$a$a r0 = new fB.a$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f126868c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f126869d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0048
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f126867a
                    r2 = r5
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto L_0x0048
                    r0.f126869d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0048
                    return r1
                L_0x0048:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: fB.C14441a.C3104a.C3105a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C3104a(C16532g gVar) {
            this.f126866a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f126866a.collect(new C3105a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.task.FetchListsTaskImpl$execute$2", f = "FetchListsTaskImpl.kt", l = {32}, m = "invokeSuspend")
    /* renamed from: fB.a$b */
    static final class b extends l implements p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f126871c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14441a f126872d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C14441a aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f126872d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f126872d, eVar);
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((b) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f126871c;
            if (i10 == 0) {
                y.b(obj);
                C14613b a10 = this.f126872d.f126864b;
                this.f126871c = 1;
                obj2 = a10.h(this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C14441a aVar = this.f126872d;
            if (x.e(obj2) != null) {
                e eVar = e.DEBUG;
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
                        String a11 = C11818a.a("failed to sync lists", (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str = C11820c.a(a11);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = aVar.getClass().getName();
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
            }
            return C16807N.f139792a;
        }
    }

    public C14441a(C11116a aVar, C14613b bVar, Q q10) {
        C17542s.j(aVar, "networkAvailabilityObserver");
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(q10, "appScope");
        this.f126863a = aVar;
        this.f126864b = bVar;
        this.f126865c = q10;
    }

    public void execute() {
        C16534i.M(C16534i.R(C16534i.e0(new C3104a(this.f126863a.b()), 1), new b(this, (C17164e<? super b>) null)), this.f126865c);
    }
}
