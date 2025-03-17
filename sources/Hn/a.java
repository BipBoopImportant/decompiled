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

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH@¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH@¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H@¢\u0006\u0004\b\u0018\u0010\u0014J&\u0010\u001a\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\f\u001a\u00020\u000bH@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH@¢\u0006\u0004\b\u001f\u0010\u000fJ \u0010!\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH@¢\u0006\u0004\b!\u0010\u001eJ\u0018\u0010\"\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH@¢\u0006\u0004\b\"\u0010\u000fJ\u0018\u0010#\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH@¢\u0006\u0004\b#\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u001a\u0010+\u001a\u00020'8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"LHn/a;", "LFn/e;", "", "LHn/c;", "caasNetworkWrapper", "LJn/c;", "cartInstoreModelMapper", "LKn/a;", "logSerializationExceptionUseCase", "<init>", "(LHn/c;LJn/c;LKn/a;)V", "", "storeId", "LFn/b$a;", "h", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "", "LFn/f;", "items", "i", "(Ljava/lang/String;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "item", "e", "(LFn/f;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "c", "codes", "b", "(Ljava/util/List;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "code", "f", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "a", "sourceUserId", "j", "d", "g", "LHn/c;", "LJn/c;", "LKn/a;", "LHn/d;", "LHn/d;", "m", "()LHn/d;", "fetchCartConfig", "caas-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Fn.e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f81358a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Jn.c f81359b;

    /* renamed from: c  reason: collision with root package name */
    private final Kn.a f81360c;

    /* renamed from: d  reason: collision with root package name */
    private final d f81361d = d.b.f81647c;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$a;", "<anonymous>", "()LFn/b$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteInStoreSourceImpl$addEmployeeConsent$2", f = "CaasRemoteInStoreSourceImpl.kt", l = {143}, m = "invokeSuspend")
    /* renamed from: Hn.a$a  reason: collision with other inner class name */
    static final class C1588a extends l implements C17642l<C17164e<? super b.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81362c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f81363d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f81364e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1588a(a aVar, String str, C17164e<? super C1588a> eVar) {
            super(1, eVar);
            this.f81363d = aVar;
            this.f81364e = str;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new C1588a(this.f81363d, this.f81364e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.a> eVar) {
            return ((C1588a) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81362c;
            if (i10 == 0) {
                y.b(obj);
                c k10 = this.f81363d.f81358a;
                d m10 = this.f81363d.m();
                String str = this.f81364e;
                this.f81362c = 1;
                obj = k10.a(m10, str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f81363d.f81359b.a((CartResponseRemoteModel) obj);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$a;", "<anonymous>", "()LFn/b$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteInStoreSourceImpl$addItems$2", f = "CaasRemoteInStoreSourceImpl.kt", l = {42}, m = "invokeSuspend")
    static final class b extends l implements C17642l<C17164e<? super b.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81365c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f81366d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<Fn.f> f81367e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f81368f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, List<Fn.f> list, String str, C17164e<? super b> eVar) {
            super(1, eVar);
            this.f81366d = aVar;
            this.f81367e = list;
            this.f81368f = str;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new b(this.f81366d, this.f81367e, this.f81368f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.a> eVar) {
            return ((b) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81365c;
            if (i10 == 0) {
                y.b(obj);
                c k10 = this.f81366d.f81358a;
                List<Fn.f> list = this.f81367e;
                d m10 = this.f81366d.m();
                String str = this.f81368f;
                this.f81365c = 1;
                obj = k10.c(list, m10, str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f81366d.f81359b.a((CartResponseRemoteModel) obj);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$a;", "<anonymous>", "()LFn/b$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteInStoreSourceImpl$clearCart$2", f = "CaasRemoteInStoreSourceImpl.kt", l = {116}, m = "invokeSuspend")
    static final class c extends l implements C17642l<C17164e<? super b.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81369c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f81370d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f81371e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, String str, C17164e<? super c> eVar) {
            super(1, eVar);
            this.f81370d = aVar;
            this.f81371e = str;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new c(this.f81370d, this.f81371e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.a> eVar) {
            return ((c) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81369c;
            if (i10 == 0) {
                y.b(obj);
                c k10 = this.f81370d.f81358a;
                d m10 = this.f81370d.m();
                String str = this.f81371e;
                this.f81369c = 1;
                obj = k10.e(m10, str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f81370d.f81359b.a((CartResponseRemoteModel) obj);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$a;", "<anonymous>", "()LFn/b$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteInStoreSourceImpl$deleteDiscount$2", f = "CaasRemoteInStoreSourceImpl.kt", l = {102}, m = "invokeSuspend")
    static final class d extends l implements C17642l<C17164e<? super b.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f81372c;

        /* renamed from: d  reason: collision with root package name */
        Object f81373d;

        /* renamed from: e  reason: collision with root package name */
        int f81374e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f81375f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f81376g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f81377h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, String str, String str2, C17164e<? super d> eVar) {
            super(1, eVar);
            this.f81375f = aVar;
            this.f81376g = str;
            this.f81377h = str2;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new d(this.f81375f, this.f81376g, this.f81377h, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.a> eVar) {
            return ((d) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81374e;
            if (i10 == 0) {
                y.b(obj);
                c k10 = this.f81375f.f81358a;
                d m10 = this.f81375f.m();
                String str = this.f81376g;
                String str2 = this.f81377h;
                this.f81372c = k10;
                this.f81373d = m10;
                this.f81374e = 1;
                obj = k10.g(str, m10, str2, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                d dVar = (d) this.f81373d;
                c cVar = (c) this.f81372c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f81375f.f81359b.a((CartResponseRemoteModel) obj);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$a;", "<anonymous>", "()LFn/b$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteInStoreSourceImpl$deleteEmployeeConsent$2", f = "CaasRemoteInStoreSourceImpl.kt", l = {152}, m = "invokeSuspend")
    static final class e extends l implements C17642l<C17164e<? super b.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81378c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f81379d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f81380e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, String str, C17164e<? super e> eVar) {
            super(1, eVar);
            this.f81379d = aVar;
            this.f81380e = str;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new e(this.f81379d, this.f81380e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.a> eVar) {
            return ((e) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81378c;
            if (i10 == 0) {
                y.b(obj);
                c k10 = this.f81379d.f81358a;
                d m10 = this.f81379d.m();
                String str = this.f81380e;
                this.f81378c = 1;
                obj = k10.i(m10, str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f81379d.f81359b.a((CartResponseRemoteModel) obj);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$a;", "<anonymous>", "()LFn/b$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteInStoreSourceImpl$deleteItems$2", f = "CaasRemoteInStoreSourceImpl.kt", l = {72}, m = "invokeSuspend")
    static final class f extends l implements C17642l<C17164e<? super b.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81381c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f81382d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<String> f81383e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f81384f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar, List<String> list, String str, C17164e<? super f> eVar) {
            super(1, eVar);
            this.f81382d = aVar;
            this.f81383e = list;
            this.f81384f = str;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new f(this.f81382d, this.f81383e, this.f81384f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.a> eVar) {
            return ((f) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81381c;
            if (i10 == 0) {
                y.b(obj);
                c k10 = this.f81382d.f81358a;
                List<String> list = this.f81383e;
                d m10 = this.f81382d.m();
                String str = this.f81384f;
                this.f81381c = 1;
                obj = k10.k(list, m10, str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f81382d.f81359b.a((CartResponseRemoteModel) obj);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$a;", "<anonymous>", "()LFn/b$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteInStoreSourceImpl$fetchCart$2", f = "CaasRemoteInStoreSourceImpl.kt", l = {26}, m = "invokeSuspend")
    static final class g extends l implements C17642l<C17164e<? super b.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81385c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f81386d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f81387e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, String str, C17164e<? super g> eVar) {
            super(1, eVar);
            this.f81386d = aVar;
            this.f81387e = str;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new g(this.f81386d, this.f81387e, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.a> eVar) {
            return ((g) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81385c;
            if (i10 == 0) {
                y.b(obj);
                c k10 = this.f81386d.f81358a;
                d m10 = this.f81386d.m();
                String str = this.f81387e;
                this.f81385c = 1;
                obj = k10.m(m10, str, this);
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
                return this.f81386d.f81359b.a(cartResponseRemoteModel);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$a;", "<anonymous>", "()LFn/b$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteInStoreSourceImpl$mergeCart$2", f = "CaasRemoteInStoreSourceImpl.kt", l = {130}, m = "invokeSuspend")
    static final class h extends l implements C17642l<C17164e<? super b.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f81388c;

        /* renamed from: d  reason: collision with root package name */
        Object f81389d;

        /* renamed from: e  reason: collision with root package name */
        int f81390e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f81391f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f81392g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f81393h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar, String str, String str2, C17164e<? super h> eVar) {
            super(1, eVar);
            this.f81391f = aVar;
            this.f81392g = str;
            this.f81393h = str2;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new h(this.f81391f, this.f81392g, this.f81393h, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.a> eVar) {
            return ((h) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81390e;
            if (i10 == 0) {
                y.b(obj);
                c k10 = this.f81391f.f81358a;
                d m10 = this.f81391f.m();
                String str = this.f81392g;
                String str2 = this.f81393h;
                this.f81388c = k10;
                this.f81389d = m10;
                this.f81390e = 1;
                obj = k10.p(str, m10, str2, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                d dVar = (d) this.f81389d;
                c cVar = (c) this.f81388c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f81391f.f81359b.a((CartResponseRemoteModel) obj);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$a;", "<anonymous>", "()LFn/b$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteInStoreSourceImpl$putDiscount$2", f = "CaasRemoteInStoreSourceImpl.kt", l = {87}, m = "invokeSuspend")
    static final class i extends l implements C17642l<C17164e<? super b.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81394c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f81395d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<String> f81396e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f81397f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(a aVar, List<String> list, String str, C17164e<? super i> eVar) {
            super(1, eVar);
            this.f81395d = aVar;
            this.f81396e = list;
            this.f81397f = str;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new i(this.f81395d, this.f81396e, this.f81397f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.a> eVar) {
            return ((i) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81394c;
            if (i10 == 0) {
                y.b(obj);
                c k10 = this.f81395d.f81358a;
                List<String> list = this.f81396e;
                d m10 = this.f81395d.m();
                String str = this.f81397f;
                this.f81394c = 1;
                obj = k10.t(list, m10, str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f81395d.f81359b.a((CartResponseRemoteModel) obj);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LFn/b$a;", "<anonymous>", "()LFn/b$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.caas.impl.network.CaasRemoteInStoreSourceImpl$updateItems$2", f = "CaasRemoteInStoreSourceImpl.kt", l = {57}, m = "invokeSuspend")
    static final class j extends l implements C17642l<C17164e<? super b.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f81398c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f81399d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Fn.f f81400e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f81401f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(a aVar, Fn.f fVar, String str, C17164e<? super j> eVar) {
            super(1, eVar);
            this.f81399d = aVar;
            this.f81400e = fVar;
            this.f81401f = str;
        }

        public final C17164e<C16807N> create(C17164e<?> eVar) {
            return new j(this.f81399d, this.f81400e, this.f81401f, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C17164e<? super b.a> eVar) {
            return ((j) create(eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f81398c;
            if (i10 == 0) {
                y.b(obj);
                c k10 = this.f81399d.f81358a;
                List e10 = C16877v.e(this.f81400e);
                d m10 = this.f81399d.m();
                String str = this.f81401f;
                this.f81398c = 1;
                obj = k10.v(e10, m10, str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return this.f81399d.f81359b.a((CartResponseRemoteModel) obj);
        }
    }

    public a(c cVar, Jn.c cVar2, Kn.a aVar) {
        C17542s.j(cVar, "caasNetworkWrapper");
        C17542s.j(cVar2, "cartInstoreModelMapper");
        C17542s.j(aVar, "logSerializationExceptionUseCase");
        this.f81358a = cVar;
        this.f81359b = cVar2;
        this.f81360c = aVar;
    }

    public Object a(String str, C17164e<? super b.a> eVar) {
        return this.f81360c.a(new c(this, str, (C17164e<? super c>) null), eVar);
    }

    public Object b(List<String> list, String str, C17164e<? super b.a> eVar) {
        return this.f81360c.a(new i(this, list, str, (C17164e<? super i>) null), eVar);
    }

    public Object c(String str, List<String> list, C17164e<? super b.a> eVar) {
        return this.f81360c.a(new f(this, list, str, (C17164e<? super f>) null), eVar);
    }

    public Object d(String str, C17164e<? super b.a> eVar) {
        return this.f81360c.a(new C1588a(this, str, (C17164e<? super C1588a>) null), eVar);
    }

    public Object e(Fn.f fVar, String str, C17164e<? super b.a> eVar) {
        return this.f81360c.a(new j(this, fVar, str, (C17164e<? super j>) null), eVar);
    }

    public Object f(String str, String str2, C17164e<? super b.a> eVar) {
        return this.f81360c.a(new d(this, str, str2, (C17164e<? super d>) null), eVar);
    }

    public Object g(String str, C17164e<? super b.a> eVar) {
        return this.f81360c.a(new e(this, str, (C17164e<? super e>) null), eVar);
    }

    public Object h(String str, C17164e<? super b.a> eVar) {
        return this.f81360c.a(new g(this, str, (C17164e<? super g>) null), eVar);
    }

    public Object i(String str, List<Fn.f> list, C17164e<? super b.a> eVar) {
        return this.f81360c.a(new b(this, list, str, (C17164e<? super b>) null), eVar);
    }

    public Object j(String str, String str2, C17164e<? super b.a> eVar) {
        return this.f81360c.a(new h(this, str2, str, (C17164e<? super h>) null), eVar);
    }

    public d m() {
        return this.f81361d;
    }
}
