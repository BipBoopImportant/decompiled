package gu;

import EB.C12832d;
import FB.C12860a;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import aA.C13909a;
import dI.C17164e;
import eI.C17187b;
import gt.C11357e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import nI.r;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u0019"}, d2 = {"Lgu/d;", "Lgu/c;", "Lgt/e;", "storeEventsRepository", "LFB/a;", "localStoreSelectionRepository", "LaA/a;", "sessionManager", "<init>", "(Lgt/e;LFB/a;LaA/a;)V", "", "storeId", "LTJ/g;", "", "Ljt/b;", "a", "(Ljava/lang/String;)LTJ/g;", "Lgt/e;", "LEB/d;", "b", "LTJ/g;", "currentStoreFlow", "", "c", "isLoggedInFlow", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gu.d  reason: case insensitive filesystem */
public final class C11363d implements C11362c {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C11357e f98041a;

    /* renamed from: b  reason: collision with root package name */
    private final C16532g<C12832d> f98042b;

    /* renamed from: c  reason: collision with root package name */
    private final C16532g<Boolean> f98043c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LEB/d;", "previous", "current", "LXH/N;", "<anonymous>", "(LEB/d;LEB/d;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.storeevents.usecase.GetStoreEventsUseCaseImpl$currentStoreFlow$1", f = "GetStoreEventsUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: gu.d$a */
    static final class a extends l implements q<C12832d, C12832d, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f98044c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f98045d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f98046e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11363d f98047f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C11363d dVar, C17164e<? super a> eVar) {
            super(3, eVar);
            this.f98047f = dVar;
        }

        /* renamed from: i */
        public final Object invoke(C12832d dVar, C12832d dVar2, C17164e<? super C16807N> eVar) {
            a aVar = new a(this.f98047f, eVar);
            aVar.f98045d = dVar;
            aVar.f98046e = dVar2;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f98044c == 0) {
                y.b(obj);
                if (!C17542s.e(((C12832d) this.f98045d).e(), ((C12832d) this.f98046e).e())) {
                    this.f98047f.f98041a.a(false);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Ljt/b;", "events", "", "<unused var>", "LEB/d;", "<anonymous>", "(Ljava/util/List;ZLEB/d;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.storeevents.usecase.GetStoreEventsUseCaseImpl$invoke$1", f = "GetStoreEventsUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: gu.d$b */
    static final class b extends l implements r<List<? extends jt.b>, Boolean, C12832d, C17164e<? super List<? extends jt.b>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f98048c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f98049d;

        b(C17164e<? super b> eVar) {
            super(4, eVar);
        }

        public final Object i(List<jt.b> list, boolean z10, C12832d dVar, C17164e<? super List<jt.b>> eVar) {
            b bVar = new b(eVar);
            bVar.f98049d = list;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f98048c == 0) {
                y.b(obj);
                return (List) this.f98049d;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i((List) obj, ((Boolean) obj2).booleanValue(), (C12832d) obj3, (C17164e) obj4);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LTJ/h;", "", "Ljt/b;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.storeevents.usecase.GetStoreEventsUseCaseImpl$invoke$2", f = "GetStoreEventsUseCase.kt", l = {55}, m = "invokeSuspend")
    /* renamed from: gu.d$c */
    static final class c extends l implements q<C16533h<? super List<? extends jt.b>>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f98050c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f98051d;

        c(C17164e<? super c> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super List<jt.b>> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            c cVar = new c(eVar);
            cVar.f98051d = hVar;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f98050c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f98051d;
                List n10 = C16877v.n();
                this.f98051d = hVar;
                this.f98050c = 1;
                if (hVar.emit(n10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f98051d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "previous", "current", "LXH/N;", "<anonymous>", "(ZZ)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.storeevents.usecase.GetStoreEventsUseCaseImpl$isLoggedInFlow$1", f = "GetStoreEventsUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: gu.d$d  reason: collision with other inner class name */
    static final class C2199d extends l implements q<Boolean, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f98052c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f98053d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f98054e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11363d f98055f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2199d(C11363d dVar, C17164e<? super C2199d> eVar) {
            super(3, eVar);
            this.f98055f = dVar;
        }

        public final Object i(boolean z10, boolean z11, C17164e<? super C16807N> eVar) {
            C2199d dVar = new C2199d(this.f98055f, eVar);
            dVar.f98053d = z10;
            dVar.f98054e = z11;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f98052c == 0) {
                y.b(obj);
                if (this.f98053d != this.f98054e) {
                    this.f98055f.f98041a.a(false);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C11363d(C11357e eVar, C12860a aVar, C13909a aVar2) {
        C17542s.j(eVar, "storeEventsRepository");
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(aVar2, "sessionManager");
        this.f98041a = eVar;
        this.f98042b = Ot.a.a(C16534i.A(aVar.b()), new a(this, (C17164e<? super a>) null));
        this.f98043c = Ot.a.a(aVar2.n(), new C2199d(this, (C17164e<? super C2199d>) null));
    }

    public C16532g<List<jt.b>> a(String str) {
        C17542s.j(str, "storeId");
        return C16534i.g(C16534i.m(this.f98041a.c(str), this.f98043c, this.f98042b, new b((C17164e<? super b>) null)), new c((C17164e<? super c>) null));
    }
}
