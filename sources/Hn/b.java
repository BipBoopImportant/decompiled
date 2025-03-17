package Hn;

import Fn.b;
import Hn.d;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import com.ingka.ikea.app.caasremote.models.CartResponseRemoteModel;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nH@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000eH@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0016\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00150\rH@¢\u0006\u0004\b\u0016\u0010\u0011J\u001e\u0010\u0018\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\rH@¢\u0006\u0004\b\u0018\u0010\u0011J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0015H@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nH@¢\u0006\u0004\b\u001c\u0010\fJ\u0010\u0010\u001d\u001a\u00020\nH@¢\u0006\u0004\b\u001d\u0010\fJ\u0018\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0015H@¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\nH@¢\u0006\u0004\b \u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010$¨\u0006%"}, d2 = {"LHn/b;", "LFn/g;", "LHn/c;", "caasNetworkWrapper", "LJn/d;", "cartOnlineModelMapper", "LKn/a;", "logSerializationExceptionUseCase", "<init>", "(LHn/c;LJn/d;LKn/a;)V", "LFn/b$b;", "h", "(LdI/e;)Ljava/lang/Object;", "", "LFn/f;", "items", "addItems", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "item", "n", "(LFn/f;LdI/e;)Ljava/lang/Object;", "", "k", "codes", "l", "code", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "m", "j", "sourceUserId", "i", "c", "a", "LHn/c;", "LJn/d;", "LKn/a;", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements Fn.g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f81402a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Jn.d f81403b;

    /* renamed from: c  reason: collision with root package name */
    private final Kn.a f81404c;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$b;", "<anonymous>", "()LFn/b$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteOnlineSourceImpl$addEmployeeConsent$2", f = "CaasRemoteOnlineSourceImpl.kt", l = {106}, m = "invokeSuspend")
    static final class a extends l implements C17642l<C17164e<? super b.C1565b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81405c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f81406d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(1, eVar);
            this.f81406d = bVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new a(this.f81406d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.C1565b> eVar) {
            return ((a) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81405c;
            if (i10 == 0) {
                y.b(obj);
                c a10 = this.f81406d.f81402a;
                d.c cVar = d.c.f81653c;
                this.f81405c = 1;
                obj = c.b(a10, cVar, (String) null, this, 2, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f81406d.f81403b.a((CartResponseRemoteModel) obj);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$b;", "<anonymous>", "()LFn/b$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteOnlineSourceImpl$addItems$2", f = "CaasRemoteOnlineSourceImpl.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: Hn.b$b  reason: collision with other inner class name */
    static final class C1589b extends l implements C17642l<C17164e<? super b.C1565b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81407c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f81408d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<Fn.f> f81409e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1589b(b bVar, List<Fn.f> list, C17164e<? super C1589b> eVar) {
            super(1, eVar);
            this.f81408d = bVar;
            this.f81409e = list;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new C1589b(this.f81408d, this.f81409e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.C1565b> eVar) {
            return ((C1589b) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81407c;
            if (i10 == 0) {
                y.b(obj);
                c a10 = this.f81408d.f81402a;
                List<Fn.f> list = this.f81409e;
                d.c cVar = d.c.f81653c;
                this.f81407c = 1;
                obj = c.d(a10, list, cVar, (String) null, this, 4, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f81408d.f81403b.a((CartResponseRemoteModel) obj);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$b;", "<anonymous>", "()LFn/b$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteOnlineSourceImpl$clearCart$2", f = "CaasRemoteOnlineSourceImpl.kt", l = {140}, m = "invokeSuspend")
    static final class c extends l implements C17642l<C17164e<? super b.C1565b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81410c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f81411d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, C17164e<? super c> eVar) {
            super(1, eVar);
            this.f81411d = bVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new c(this.f81411d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.C1565b> eVar) {
            return ((c) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81410c;
            if (i10 == 0) {
                y.b(obj);
                c a10 = this.f81411d.f81402a;
                d.c cVar = d.c.f81653c;
                this.f81410c = 1;
                obj = c.f(a10, cVar, (String) null, this, 2, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f81411d.f81403b.a((CartResponseRemoteModel) obj);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$b;", "<anonymous>", "()LFn/b$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteOnlineSourceImpl$deleteDiscount$2", f = "CaasRemoteOnlineSourceImpl.kt", l = {94}, m = "invokeSuspend")
    static final class d extends l implements C17642l<C17164e<? super b.C1565b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f81412c;

        /* renamed from: d  reason: collision with root package name */
        Object f81413d;

        /* renamed from: e  reason: collision with root package name */
        int f81414e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f81415f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f81416g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, String str, C17164e<? super d> eVar) {
            super(1, eVar);
            this.f81415f = bVar;
            this.f81416g = str;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new d(this.f81415f, this.f81416g, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.C1565b> eVar) {
            return ((d) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81414e;
            if (i10 == 0) {
                y.b(obj);
                c a10 = this.f81415f.f81402a;
                d.c cVar = d.c.f81653c;
                String str = this.f81416g;
                this.f81412c = a10;
                this.f81413d = cVar;
                this.f81414e = 1;
                obj = c.h(a10, str, cVar, (String) null, this, 4, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                d.c cVar2 = (d.c) this.f81413d;
                c cVar3 = (c) this.f81412c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f81415f.f81403b.a((CartResponseRemoteModel) obj);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$b;", "<anonymous>", "()LFn/b$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteOnlineSourceImpl$deleteEmployeeConsent$2", f = "CaasRemoteOnlineSourceImpl.kt", l = {117}, m = "invokeSuspend")
    static final class e extends l implements C17642l<C17164e<? super b.C1565b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81417c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f81418d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, C17164e<? super e> eVar) {
            super(1, eVar);
            this.f81418d = bVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new e(this.f81418d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.C1565b> eVar) {
            return ((e) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81417c;
            if (i10 == 0) {
                y.b(obj);
                c a10 = this.f81418d.f81402a;
                d.c cVar = d.c.f81653c;
                this.f81417c = 1;
                obj = c.j(a10, cVar, (String) null, this, 2, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f81418d.f81403b.a((CartResponseRemoteModel) obj);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$b;", "<anonymous>", "()LFn/b$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteOnlineSourceImpl$deleteItems$2", f = "CaasRemoteOnlineSourceImpl.kt", l = {68}, m = "invokeSuspend")
    static final class f extends l implements C17642l<C17164e<? super b.C1565b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81419c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f81420d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<String> f81421e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, List<String> list, C17164e<? super f> eVar) {
            super(1, eVar);
            this.f81420d = bVar;
            this.f81421e = list;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new f(this.f81420d, this.f81421e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.C1565b> eVar) {
            return ((f) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81419c;
            if (i10 == 0) {
                y.b(obj);
                c a10 = this.f81420d.f81402a;
                List<String> list = this.f81421e;
                d.c cVar = d.c.f81653c;
                this.f81419c = 1;
                obj = c.l(a10, list, cVar, (String) null, this, 4, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f81420d.f81403b.a((CartResponseRemoteModel) obj);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$b;", "<anonymous>", "()LFn/b$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteOnlineSourceImpl$fetchCart$2", f = "CaasRemoteOnlineSourceImpl.kt", l = {28}, m = "invokeSuspend")
    static final class g extends l implements C17642l<C17164e<? super b.C1565b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81422c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f81423d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, C17164e<? super g> eVar) {
            super(1, eVar);
            this.f81423d = bVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new g(this.f81423d, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.C1565b> eVar) {
            return ((g) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81422c;
            if (i10 == 0) {
                y.b(obj);
                c a10 = this.f81423d.f81402a;
                d.c cVar = d.c.f81653c;
                this.f81422c = 1;
                obj = c.n(a10, cVar, (String) null, this, 2, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CartResponseRemoteModel cartResponseRemoteModel = (CartResponseRemoteModel) obj;
            if (cartResponseRemoteModel != null) {
                return this.f81423d.f81403b.a(cartResponseRemoteModel);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$b;", "<anonymous>", "()LFn/b$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteOnlineSourceImpl$mergeCart$2", f = "CaasRemoteOnlineSourceImpl.kt", l = {129}, m = "invokeSuspend")
    static final class h extends l implements C17642l<C17164e<? super b.C1565b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f81424c;

        /* renamed from: d  reason: collision with root package name */
        Object f81425d;

        /* renamed from: e  reason: collision with root package name */
        int f81426e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f81427f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f81428g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar, String str, C17164e<? super h> eVar) {
            super(1, eVar);
            this.f81427f = bVar;
            this.f81428g = str;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new h(this.f81427f, this.f81428g, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.C1565b> eVar) {
            return ((h) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81426e;
            if (i10 == 0) {
                y.b(obj);
                c a10 = this.f81427f.f81402a;
                d.c cVar = d.c.f81653c;
                String str = this.f81428g;
                this.f81424c = a10;
                this.f81425d = cVar;
                this.f81426e = 1;
                obj = c.q(a10, str, cVar, (String) null, this, 4, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                d.c cVar2 = (d.c) this.f81425d;
                c cVar3 = (c) this.f81424c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f81427f.f81403b.a((CartResponseRemoteModel) obj);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$b;", "<anonymous>", "()LFn/b$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteOnlineSourceImpl$putDiscount$2", f = "CaasRemoteOnlineSourceImpl.kt", l = {81}, m = "invokeSuspend")
    static final class i extends l implements C17642l<C17164e<? super b.C1565b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81429c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f81430d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<String> f81431e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar, List<String> list, C17164e<? super i> eVar) {
            super(1, eVar);
            this.f81430d = bVar;
            this.f81431e = list;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new i(this.f81430d, this.f81431e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.C1565b> eVar) {
            return ((i) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81429c;
            if (i10 == 0) {
                y.b(obj);
                c a10 = this.f81430d.f81402a;
                List<String> list = this.f81431e;
                d.c cVar = d.c.f81653c;
                this.f81429c = 1;
                obj = c.u(a10, list, cVar, (String) null, this, 4, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f81430d.f81403b.a((CartResponseRemoteModel) obj);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$b;", "<anonymous>", "()LFn/b$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteOnlineSourceImpl$updateItems$2", f = "CaasRemoteOnlineSourceImpl.kt", l = {55}, m = "invokeSuspend")
    static final class j extends l implements C17642l<C17164e<? super b.C1565b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81432c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f81433d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Fn.f f81434e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar, Fn.f fVar, C17164e<? super j> eVar) {
            super(1, eVar);
            this.f81433d = bVar;
            this.f81434e = fVar;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new j(this.f81433d, this.f81434e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.C1565b> eVar) {
            return ((j) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81432c;
            if (i10 == 0) {
                y.b(obj);
                c a10 = this.f81433d.f81402a;
                List e10 = C16877v.e(this.f81434e);
                d.c cVar = d.c.f81653c;
                this.f81432c = 1;
                obj = c.w(a10, e10, cVar, (String) null, this, 4, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f81433d.f81403b.a((CartResponseRemoteModel) obj);
        }
    }

    public b(c cVar, Jn.d dVar, Kn.a aVar) {
        C17542s.j(cVar, "caasNetworkWrapper");
        C17542s.j(dVar, "cartOnlineModelMapper");
        C17542s.j(aVar, "logSerializationExceptionUseCase");
        this.f81402a = cVar;
        this.f81403b = dVar;
        this.f81404c = aVar;
    }

    public Object addItems(List<Fn.f> list, C17164e<? super b.C1565b> eVar) {
        return this.f81404c.a(new C1589b(this, list, (C17164e<? super C1589b>) null), eVar);
    }

    public Object b(String str, C17164e<? super b.C1565b> eVar) {
        return this.f81404c.a(new d(this, str, (C17164e<? super d>) null), eVar);
    }

    public Object c(C17164e<? super b.C1565b> eVar) {
        return this.f81404c.a(new c(this, (C17164e<? super c>) null), eVar);
    }

    public Object h(C17164e<? super b.C1565b> eVar) {
        return this.f81404c.a(new g(this, (C17164e<? super g>) null), eVar);
    }

    public Object i(String str, C17164e<? super b.C1565b> eVar) {
        return this.f81404c.a(new h(this, str, (C17164e<? super h>) null), eVar);
    }

    public Object j(C17164e<? super b.C1565b> eVar) {
        return this.f81404c.a(new e(this, (C17164e<? super e>) null), eVar);
    }

    public Object k(List<String> list, C17164e<? super b.C1565b> eVar) {
        return this.f81404c.a(new f(this, list, (C17164e<? super f>) null), eVar);
    }

    public Object l(List<String> list, C17164e<? super b.C1565b> eVar) {
        return this.f81404c.a(new i(this, list, (C17164e<? super i>) null), eVar);
    }

    public Object m(C17164e<? super b.C1565b> eVar) {
        return this.f81404c.a(new a(this, (C17164e<? super a>) null), eVar);
    }

    public Object n(Fn.f fVar, C17164e<? super b.C1565b> eVar) {
        return this.f81404c.a(new j(this, fVar, (C17164e<? super j>) null), eVar);
    }
}
