package fy;

import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.reassurance.impl.network.a;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fy.C14487e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\"B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\r\u0010 ¨\u0006#"}, d2 = {"Lfy/a;", "Landroidx/lifecycle/f0;", "Lcom/ingka/ikea/reassurance/impl/network/a;", "reassuranceRemoteDataSource", "<init>", "(Lcom/ingka/ikea/reassurance/impl/network/a;)V", "LXH/N;", "C", "()V", "Lfy/a$a;", "action", "D", "(Lfy/a$a;)V", "m", "Lcom/ingka/ikea/reassurance/impl/network/a;", "LTJ/B;", "", "n", "LTJ/B;", "loading", "Lfy/e$a;", "o", "content", "LIC/e;", "p", "message", "q", "showError", "LTJ/P;", "Lfy/e;", "r", "LTJ/P;", "()LTJ/P;", "uiState", "a", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fy.a  reason: case insensitive filesystem */
public final class C14483a extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final a f127144m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C16505B<Boolean> f127145n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C16505B<C14487e.a> f127146o;

    /* renamed from: p  reason: collision with root package name */
    private final C16505B<C13023e> f127147p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C16505B<Boolean> f127148q;

    /* renamed from: r  reason: collision with root package name */
    private final C16519P<C14487e> f127149r;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lfy/a$a;", "", "<init>", "()V", "a", "b", "Lfy/a$a$a;", "Lfy/a$a$b;", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fy.a$a  reason: collision with other inner class name */
    public static abstract class C3110a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfy/a$a$a;", "Lfy/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: fy.a$a$a  reason: collision with other inner class name */
        public static final class C3111a extends C3110a {

            /* renamed from: a  reason: collision with root package name */
            public static final C3111a f127150a = new C3111a();

            private C3111a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C3111a);
            }

            public int hashCode() {
                return -1130813947;
            }

            public String toString() {
                return "ClearMessage";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfy/a$a$b;", "Lfy/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "reassurance-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: fy.a$a$b */
        public static final class b extends C3110a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f127151a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -653736591;
            }

            public String toString() {
                return "OpenUriError";
            }
        }

        public /* synthetic */ C3110a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3110a() {
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"fy/a$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fy.a$b */
    public static final class b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14483a f127152a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(N.a aVar, C14483a aVar2) {
            super(aVar);
            this.f127152a = aVar2;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C14483a aVar = this.f127152a;
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
                    String a10 = C11818a.a("Error fetching reassurance", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
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
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f127152a.f127148q.setValue(Boolean.TRUE);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.reassurance.impl.viewmodel.ReassuranceViewModel$fetch$2", f = "ReassuranceViewModel.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: fy.a$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f127153c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14483a f127154d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C14483a aVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f127154d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f127154d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f127153c;
            if (i10 == 0) {
                y.b(obj);
                this.f127154d.f127145n.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                a j10 = this.f127154d.f127144m;
                this.f127153c = 1;
                obj = j10.a(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    this.f127154d.f127145n.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f127154d.f127146o.setValue(new C14487e.a(C15985a.h((List) obj), (C13023e) null, 2, (DefaultConstructorMarker) null));
            this.f127154d.f127145n.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lfy/e$a;", "content", "LIC/e;", "message", "", "loading", "showError", "Lfy/e;", "<anonymous>", "(Lfy/e$a;LIC/e;ZZ)Lfy/e;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.reassurance.impl.viewmodel.ReassuranceViewModel$uiState$1", f = "ReassuranceViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: fy.a$d */
    static final class d extends l implements s<C14487e.a, C13023e, Boolean, Boolean, C17164e<? super C14487e>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f127155c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f127156d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f127157e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f127158f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ boolean f127159g;

        d(C17164e<? super d> eVar) {
            super(5, eVar);
        }

        public final Object i(C14487e.a aVar, C13023e eVar, boolean z10, boolean z11, C17164e<? super C14487e> eVar2) {
            d dVar = new d(eVar2);
            dVar.f127156d = aVar;
            dVar.f127157e = eVar;
            dVar.f127158f = z10;
            dVar.f127159g = z11;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f127155c == 0) {
                y.b(obj);
                C14487e.a aVar = (C14487e.a) this.f127156d;
                return this.f127159g ? C14487e.b.f127164a : this.f127158f ? C14487e.c.f127165a : aVar != null ? new C14487e.a(aVar.b(), (C13023e) this.f127157e) : C14487e.c.f127165a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return i((C14487e.a) obj, (C13023e) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), (C17164e) obj5);
        }
    }

    public C14483a(a aVar) {
        C17542s.j(aVar, "reassuranceRemoteDataSource");
        this.f127144m = aVar;
        Boolean bool = Boolean.FALSE;
        C16505B<Boolean> a10 = C16521S.a(bool);
        this.f127145n = a10;
        C16505B<C14487e.a> a11 = C16521S.a(null);
        this.f127146o = a11;
        C16505B<C13023e> a12 = C16521S.a(null);
        this.f127147p = a12;
        C16505B<Boolean> a13 = C16521S.a(bool);
        this.f127148q = a13;
        this.f127149r = C16534i.c0(C16534i.l(a11, a12, a10, a13, new d((C17164e<? super d>) null)), g0.a(this), ip.f.a(), C14487e.c.f127165a);
        C();
    }

    private final void C() {
        F0 unused = C16314k.d(g0.a(this), new b(N.f137593c0, this), (T) null, new c(this, (C17164e<? super c>) null), 2, (Object) null);
    }

    public final void D(C3110a aVar) {
        C17542s.j(aVar, "action");
        if (aVar instanceof C3110a.b) {
            this.f127147p.setValue(C13026h.a(Oo.b.f84812v3));
        } else if (C17542s.e(aVar, C3110a.C3111a.f127150a)) {
            this.f127147p.setValue(null);
        } else {
            throw new t();
        }
    }

    public final C16519P<C14487e> m() {
        return this.f127149r;
    }
}
