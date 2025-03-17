package yf;

import HJ.C15854t;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import Ya.C9364a;
import Ya.C9365b;
import Ya.C9367d;
import ab.C9404b;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import cb.C9447a;
import cb.C9449c;
import com.google.android.play.core.install.InstallState;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import g.C5312a;
import g.C5314c;
import g.C5318g;
import hn.C11372c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import yf.l;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ#\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001d\u0010\nJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\nJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\nJ\u000f\u0010 \u001a\u00020\bH\u0014¢\u0006\u0004\b \u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001f\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002000%8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010(R\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002000*8\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.R\u0014\u00109\u001a\u0002068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lyf/n;", "Landroidx/lifecycle/f0;", "LYa/b;", "appUpdateManager", "Lhn/c;", "browseSettingsRepository", "<init>", "(LYa/b;Lhn/c;)V", "LXH/N;", "J", "()V", "M", "N", "LYa/a;", "updateInfo", "Lg/c;", "Lg/g;", "activityResultLauncher", "O", "(LYa/a;Lg/c;)V", "Lg/a;", "result", "I", "(Lg/a;)V", "", "bytesDownloaded", "totalBytesToDownload", "E", "(JJ)V", "F", "D", "L", "onCleared", "m", "LYa/b;", "n", "Lhn/c;", "LTJ/B;", "Lyf/l;", "o", "LTJ/B;", "_inAppUpdateState", "LTJ/P;", "p", "LTJ/P;", "G", "()LTJ/P;", "inAppUpdateState", "", "q", "_showAppUpdatedSnackbar", "r", "H", "showAppUpdatedSnackbar", "Lab/b;", "s", "Lab/b;", "listener", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n extends f0 {

    /* renamed from: m  reason: collision with root package name */
    private final C9365b f78042m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C11372c f78043n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C16505B<l> f78044o;

    /* renamed from: p  reason: collision with root package name */
    private final C16519P<l> f78045p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C16505B<Boolean> f78046q;

    /* renamed from: r  reason: collision with root package name */
    private final C16519P<Boolean> f78047r;

    /* renamed from: s  reason: collision with root package name */
    private final C9404b f78048s = new m(this);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.browseandsearch.browseV2.InAppUpdateViewModel$1", f = "InAppUpdateViewModel.kt", l = {71, 72}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f78049c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ n f78050d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f78050d = nVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f78050d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f78049c;
            if (i10 == 0) {
                y.b(obj);
                C11372c i11 = this.f78050d.f78043n;
                this.f78049c = 1;
                obj = i11.b(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else if (i10 == 2) {
                y.b(obj);
                this.f78050d.f78046q.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                C11372c i12 = this.f78050d.f78043n;
                this.f78049c = 2;
                if (i12.a(false, this) == f10) {
                    return f10;
                }
                this.f78050d.f78046q.setValue(kotlin.coroutines.jvm.internal.b.a(true));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.browseandsearch.browseV2.InAppUpdateViewModel$completeUpdate$1", f = "InAppUpdateViewModel.kt", l = {156}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f78051c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ n f78052d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n nVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f78052d = nVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f78052d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f78051c;
            if (i10 == 0) {
                y.b(obj);
                C11372c i11 = this.f78052d.f78043n;
                this.f78051c = 1;
                if (i11.a(true, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcb/c;", "appUpdateResult", "LXH/N;", "<anonymous>", "(Lcb/c;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.browseandsearch.browseV2.InAppUpdateViewModel$requestUpdateFlow$1", f = "InAppUpdateViewModel.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements p<C9449c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f78053c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f78054d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ n f78055e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(n nVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f78055e = nVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f78055e, eVar);
            cVar.f78054d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(C9449c cVar, C17164e<? super C16807N> eVar) {
            return ((c) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f78053c == 0) {
                y.b(obj);
                C9449c cVar = (C9449c) this.f78054d;
                if (cVar instanceof C9449c.a) {
                    this.f78055e.f78044o.setValue(new l.a((C9449c.a) cVar));
                } else if (cVar instanceof C9449c.b) {
                    this.f78055e.F();
                } else if (cVar instanceof C9449c.C1158c) {
                    C9449c.C1158c cVar2 = (C9449c.C1158c) cVar;
                    this.f78055e.E(cVar2.a().a(), cVar2.a().e());
                } else if (C17542s.e(cVar, C9449c.d.f65679a)) {
                    this.f78055e.J();
                } else {
                    throw new t();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "Lcb/c;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.browseandsearch.browseV2.InAppUpdateViewModel$requestUpdateFlow$2", f = "InAppUpdateViewModel.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super C9449c>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f78056c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f78057d;

        d(C17164e<? super d> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super C9449c> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            d dVar = new d(eVar);
            dVar.f78057d = hVar;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f78056c == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f78057d;
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
                        String a10 = C11818a.a("InAppUpdate error", (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
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
                    bVar.a(eVar, str4, false, (Throwable) null, str3);
                    str = str3;
                    str2 = str4;
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public n(C9365b bVar, C11372c cVar) {
        C17542s.j(bVar, "appUpdateManager");
        C17542s.j(cVar, "browseSettingsRepository");
        this.f78042m = bVar;
        this.f78043n = cVar;
        C16505B<l> a10 = C16521S.a(null);
        this.f78044o = a10;
        this.f78045p = C16534i.c(a10);
        C16505B<Boolean> a11 = C16521S.a(Boolean.FALSE);
        this.f78046q = a11;
        this.f78047r = a11;
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void J() {
        this.f78044o.setValue(null);
    }

    /* access modifiers changed from: private */
    public static final void K(n nVar, InstallState installState) {
        C17542s.j(installState, "state");
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
                String a10 = C11818a.a("InAppUpdate state: " + installState, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = nVar.getClass().getName();
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
        int c10 = installState.c();
        if (c10 == 0 || c10 == 5 || c10 == 6) {
            nVar.M();
        }
    }

    private final void M() {
        J();
        N();
    }

    public final void D() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
        this.f78042m.d();
    }

    public final void E(long j10, long j11) {
        this.f78044o.setValue(new l.c(j11 > 0 ? (int) ((j10 * ((long) 100)) / j11) : 0));
    }

    public final void F() {
        this.f78044o.setValue(l.b.f78039a);
    }

    public final C16519P<l> G() {
        return this.f78045p;
    }

    public final C16519P<Boolean> H() {
        return this.f78047r;
    }

    public final void I(C5312a aVar) {
        C17542s.j(aVar, "result");
        int b10 = aVar.b();
        Class<n> cls = n.class;
        if (b10 == -1) {
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
                    String a10 = C11818a.a("User accepted request to update", (Throwable) null);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str2 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str2, false, (Throwable) null, str);
            }
        } else if (b10 == 0) {
            e eVar2 = e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str3 == null) {
                    String a11 = C11818a.a("User denied the request to update.", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str3 = C11820c.a(a11);
                }
                if (str4 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str4, false, (Throwable) null, str3);
            }
            M();
        } else if (b10 != 1) {
            e eVar3 = e.DEBUG;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : qv.d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar3 : arrayList3) {
                if (str5 == null) {
                    String a12 = C11818a.a("Unexpected result code: " + aVar.b(), (Throwable) null);
                    if (a12 == null) {
                        break;
                    }
                    str5 = C11820c.a(a12);
                }
                if (str6 == null) {
                    String name3 = cls.getName();
                    C17542s.g(name3);
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name3;
                }
                String str7 = str6;
                bVar3.a(eVar3, str7, false, (Throwable) null, str5);
                str6 = str7;
            }
            M();
        } else {
            e eVar4 = e.DEBUG;
            ArrayList<C11819b> arrayList4 = new ArrayList<>();
            for (Object next4 : qv.d.f102012a.a()) {
                if (((C11819b) next4).b(eVar4, false)) {
                    arrayList4.add(next4);
                }
            }
            String str8 = null;
            String str9 = null;
            for (C11819b bVar4 : arrayList4) {
                if (str8 == null) {
                    String a13 = C11818a.a("Something failed during the request for user confirmation. For example, the user terminates the app before responding to the request.", (Throwable) null);
                    if (a13 == null) {
                        break;
                    }
                    str8 = C11820c.a(a13);
                }
                if (str9 == null) {
                    String name4 = cls.getName();
                    C17542s.g(name4);
                    String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o15.length() != 0) {
                        name4 = C15854t.P0(o15, "Kt");
                    }
                    str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name4;
                }
                bVar4.a(eVar4, str9, false, (Throwable) null, str8);
            }
            M();
        }
    }

    public final void L() {
        this.f78046q.setValue(Boolean.FALSE);
    }

    public final void N() {
        C16534i.M(C16534i.g(C16534i.R(C9447a.a(this.f78042m), new c(this, (C17164e<? super c>) null)), new d((C17164e<? super d>) null)), g0.a(this));
        this.f78042m.c(this.f78048s);
    }

    public final void O(C9364a aVar, C5314c<C5318g> cVar) {
        C17542s.j(aVar, "updateInfo");
        C17542s.j(cVar, "activityResultLauncher");
        this.f78042m.a(aVar, cVar, C9367d.c(0));
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.f78042m.b(this.f78048s);
        super.onCleared();
    }
}
