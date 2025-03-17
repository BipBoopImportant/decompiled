package gu;

import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.x;
import XH.y;
import aA.C13909a;
import dI.C17164e;
import eI.C17187b;
import gt.C11357e;
import jt.b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lgu/b;", "Lgu/a;", "Lgt/e;", "storeEventsRepository", "LaA/a;", "sessionManager", "<init>", "(Lgt/e;LaA/a;)V", "", "storeId", "eventId", "LTJ/g;", "LXH/x;", "Ljt/b;", "a", "(Ljava/lang/String;Ljava/lang/String;)LTJ/g;", "Lgt/e;", "", "b", "LTJ/g;", "isLoggedInFlow", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gu.b  reason: case insensitive filesystem */
public final class C11361b implements C11360a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C11357e f98028a;

    /* renamed from: b  reason: collision with root package name */
    private final C16532g<Boolean> f98029b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljt/b;", "event", "", "<unused var>", "LXH/x;", "<anonymous>", "(Ljt/b;Z)LXH/x;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.storeevents.usecase.GetStoreEventUseCaseImpl$invoke$1", f = "GetStoreEventUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: gu.b$a */
    static final class a extends l implements q<b, Boolean, C17164e<? super x<? extends b>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f98030c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f98031d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f98032e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, C17164e<? super a> eVar) {
            super(3, eVar);
            this.f98032e = str;
        }

        public final Object i(b bVar, boolean z10, C17164e<? super x<b>> eVar) {
            a aVar = new a(this.f98032e, eVar);
            aVar.f98031d = bVar;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((b) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C17187b.f();
            if (this.f98030c == 0) {
                y.b(obj);
                b bVar = (b) this.f98031d;
                if (bVar != null) {
                    obj2 = x.b(bVar);
                } else {
                    x.a aVar = x.f139812b;
                    String str = this.f98032e;
                    obj2 = x.b(y.a(new Throwable("No event available for given id " + str)));
                }
                return x.a(obj2);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LTJ/h;", "LXH/x;", "Ljt/b;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.storeevents.usecase.GetStoreEventUseCaseImpl$invoke$2", f = "GetStoreEventUseCase.kt", l = {48}, m = "invokeSuspend")
    /* renamed from: gu.b$b  reason: collision with other inner class name */
    static final class C2198b extends l implements q<C16533h<? super x<? extends b>>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f98033c;

        /* renamed from: d  reason: collision with root package name */
        int f98034d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f98035e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f98036f;

        C2198b(C17164e<? super C2198b> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super x<b>> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            C2198b bVar = new C2198b(eVar);
            bVar.f98035e = hVar;
            bVar.f98036f = th2;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f98034d;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f98035e;
                Throwable th2 = (Throwable) this.f98036f;
                x.a aVar = x.f139812b;
                x a10 = x.a(x.b(y.a(th2)));
                this.f98035e = hVar;
                this.f98036f = th2;
                this.f98033c = aVar;
                this.f98034d = 1;
                if (hVar.emit(a10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                x.a aVar2 = (x.a) this.f98033c;
                Throwable th3 = (Throwable) this.f98036f;
                C16533h hVar2 = (C16533h) this.f98035e;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "previous", "current", "LXH/N;", "<anonymous>", "(ZZ)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.storeevents.usecase.GetStoreEventUseCaseImpl$isLoggedInFlow$1", f = "GetStoreEventUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: gu.b$c */
    static final class c extends l implements q<Boolean, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f98037c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f98038d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f98039e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11361b f98040f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C11361b bVar, C17164e<? super c> eVar) {
            super(3, eVar);
            this.f98040f = bVar;
        }

        public final Object i(boolean z10, boolean z11, C17164e<? super C16807N> eVar) {
            c cVar = new c(this.f98040f, eVar);
            cVar.f98038d = z10;
            cVar.f98039e = z11;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f98037c == 0) {
                y.b(obj);
                if (this.f98038d != this.f98039e) {
                    this.f98040f.f98028a.a(false);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C11361b(C11357e eVar, C13909a aVar) {
        C17542s.j(eVar, "storeEventsRepository");
        C17542s.j(aVar, "sessionManager");
        this.f98028a = eVar;
        this.f98029b = Ot.a.a(aVar.n(), new c(this, (C17164e<? super c>) null));
    }

    public C16532g<x<b>> a(String str, String str2) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "eventId");
        return C16534i.g(C16534i.n(this.f98028a.d(str, str2), this.f98029b, new a(str2, (C17164e<? super a>) null)), new C2198b((C17164e<? super C2198b>) null));
    }
}
