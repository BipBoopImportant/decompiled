package Ds;

import Ds.z;
import HJ.C15854t;
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
import YH.C16877v;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import bI.C17035a;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.q;
import pv.C11781a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import rs.C11844a;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0013\u0010\"¨\u0006$"}, d2 = {"LDs/D;", "Landroidx/lifecycle/f0;", "LQs/a;", "getAllNotificationSettingsUseCase", "LQs/c;", "updateNotificationSettingUseCase", "Lpv/a;", "localNotification", "LDs/A;", "notificationSettingsMapper", "Lrs/a;", "inboxAnalytics", "<init>", "(LQs/a;LQs/c;Lpv/a;LDs/A;Lrs/a;)V", "LDs/z;", "event", "LXH/N;", "i", "(LDs/z;)V", "m", "LQs/c;", "n", "Lpv/a;", "o", "Lrs/a;", "LTJ/B;", "", "p", "LTJ/B;", "hasPermissionFlow", "LTJ/P;", "LDs/C;", "q", "LTJ/P;", "()LTJ/P;", "uiState", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class D extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Qs.c f80173m;

    /* renamed from: n  reason: collision with root package name */
    private final C11781a f80174n;

    /* renamed from: o  reason: collision with root package name */
    private final C11844a f80175o;

    /* renamed from: p  reason: collision with root package name */
    private final C16505B<Boolean> f80176p;

    /* renamed from: q  reason: collision with root package name */
    private final C16519P<C> f80177q;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ds/D$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ D f80178a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(N.a aVar, D d10) {
            super(aVar);
            this.f80178a = d10;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            D d10 = this.f80178a;
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
                    String a10 = C11818a.a("Failed to update notification setting.", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = d10.getClass().getName();
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
    @f(c = "com.ingka.ikea.inbox.impl.viewmodel.NotificationSettingsViewModel$onEvent$2", f = "NotificationSettingsViewModel.kt", l = {67}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80179c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ D f80180d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z f80181e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(D d10, z zVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f80180d = d10;
            this.f80181e = zVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f80180d, this.f80181e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f80179c;
            if (i10 == 0) {
                y.b(obj);
                this.f80179c = 1;
                if (this.f80180d.f80173m.a(((z.a) this.f80181e).a(), !((z.a) this.f80181e).a().a(), this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "LPs/f;", "notifications", "", "hasPermission", "LDs/C;", "<anonymous>", "(Ljava/util/List;Z)LDs/C;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.inbox.impl.viewmodel.NotificationSettingsViewModel$uiState$1", f = "NotificationSettingsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements q<List<? extends Ps.f>, Boolean, C17164e<? super C>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80182c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f80183d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f80184e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ A f80185f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements Comparator {
            public final int compare(T t10, T t11) {
                return C17035a.e(Integer.valueOf(((y) t10).i()), Integer.valueOf(((y) t11).i()));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(A a10, C17164e<? super c> eVar) {
            super(3, eVar);
            this.f80185f = a10;
        }

        public final Object i(List<? extends Ps.f> list, boolean z10, C17164e<? super C> eVar) {
            c cVar = new c(this.f80185f, eVar);
            cVar.f80183d = list;
            cVar.f80184e = z10;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((List) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f80182c == 0) {
                y.b(obj);
                boolean z10 = this.f80184e;
                Iterable<Ps.f> iterable = (List) this.f80183d;
                A a10 = this.f80185f;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (Ps.f a11 : iterable) {
                    arrayList.add(a10.a(a11));
                }
                return new C(C16877v.g1(arrayList, new a()), z10);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public D(Qs.a aVar, Qs.c cVar, C11781a aVar2, A a10, C11844a aVar3) {
        C17542s.j(aVar, "getAllNotificationSettingsUseCase");
        C17542s.j(cVar, "updateNotificationSettingUseCase");
        C17542s.j(aVar2, "localNotification");
        C17542s.j(a10, "notificationSettingsMapper");
        C17542s.j(aVar3, "inboxAnalytics");
        this.f80173m = cVar;
        this.f80174n = aVar2;
        this.f80175o = aVar3;
        C16505B<Boolean> a11 = C16521S.a(Boolean.valueOf(aVar2.a()));
        this.f80176p = a11;
        this.f80177q = C16534i.c0(C16534i.n(aVar.invoke(), a11, new c(a10, (C17164e<? super c>) null)), g0.a(this), ip.f.a(), new C((List) null, false, 3, (DefaultConstructorMarker) null));
    }

    public final void i(z zVar) {
        C17542s.j(zVar, "event");
        if (zVar instanceof z.a) {
            F0 unused = C16314k.d(g0.a(this), new a(N.f137593c0, this), (T) null, new b(this, zVar, (C17164e<? super b>) null), 2, (Object) null);
            this.f80175o.c(((z.a) zVar).a());
        } else if (C17542s.e(zVar, z.b.f80314a)) {
            this.f80176p.setValue(Boolean.valueOf(this.f80174n.a()));
        } else {
            throw new t();
        }
    }

    public final C16519P<C> m() {
        return this.f80177q;
    }
}
