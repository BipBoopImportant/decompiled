package aB;

import HJ.C15854t;
import QJ.C16310i;
import QJ.F0;
import QJ.M;
import QJ.N;
import QJ.Q;
import QJ.T;
import RA.C13503b;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16511H;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import VA.C13737a;
import VA.C13741e;
import VA.C13750l;
import WA.C13768f;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import ZA.C13872b;
import aA.C13909a;
import bp.C11116a;
import com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \\2\u00020\u0001:\u0001:BW\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001fH@¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001cH@¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0015H@¢\u0006\u0004\b(\u0010\u0019J\u0018\u0010)\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0015H@¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u001cH@¢\u0006\u0004\b*\u0010'J\u0017\u0010-\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020\u001c0/H\u0007¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001cH\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u001c2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020+0K8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010Q\u001a\b\u0012\u0004\u0012\u00020+0/8\u0016X\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bI\u00101R$\u0010W\u001a\u0012\u0012\u0004\u0012\u00020S0Rj\b\u0012\u0004\u0012\u00020S`T8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010[\u001a\u00020X8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006]"}, d2 = {"LaB/f;", "LaB/e;", "LaA/a;", "sessionManager", "LVA/l;", "shoppingListSyncDao", "LQJ/Q;", "appScope", "LQJ/M;", "ioDispatcher", "mainDispatcher", "LaB/a;", "shoppingListEndpoint", "Lbp/a;", "networkAvailabilityObserver", "LVA/a;", "shoppingListDao", "LVA/e;", "shoppingListItemDao", "<init>", "(LaA/a;LVA/l;LQJ/Q;LQJ/M;LQJ/M;LaB/a;Lbp/a;LVA/a;LVA/e;)V", "LWA/g;", "shoppingListEventEntity", "", "U", "(LWA/g;LdI/e;)Ljava/lang/Object;", "", "id", "LXH/N;", "V", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LaB/d;", "exception", "P", "(LaB/d;LdI/e;)Ljava/lang/Object;", "isSuccessful", "R", "(Z)V", "Q", "(LdI/e;)Ljava/lang/Object;", "M", "O", "N", "LbB/f;", "list", "T", "(LbB/f;)V", "LTJ/g;", "S", "()LTJ/g;", "w", "()V", "s", "(Ljava/lang/String;)V", "Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/SyncEventModel;", "syncEventModel", "r", "(Lcom/ingka/ikea/shoppinglist/datalayer/impl/network/model/SyncEventModel;)V", "a", "LaA/a;", "b", "LVA/l;", "c", "LQJ/Q;", "d", "LQJ/M;", "e", "f", "LaB/a;", "g", "Lbp/a;", "h", "LVA/a;", "i", "LVA/e;", "LTJ/A;", "j", "LTJ/A;", "_shoppingListFetchedFlow", "k", "LTJ/g;", "shoppingListFetchedFlow", "Ljava/util/HashSet;", "LRA/b$a;", "Lkotlin/collections/HashSet;", "l", "Ljava/util/HashSet;", "syncListeners", "LQJ/F0;", "m", "LQJ/F0;", "syncEventJob", "n", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements C13915e {

    /* renamed from: n  reason: collision with root package name */
    public static final a f118586n = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C13909a f118587a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C13750l f118588b;

    /* renamed from: c  reason: collision with root package name */
    private final Q f118589c;

    /* renamed from: d  reason: collision with root package name */
    private final M f118590d;

    /* renamed from: e  reason: collision with root package name */
    private final M f118591e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C13911a f118592f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final C11116a f118593g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final C13737a f118594h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final C13741e f118595i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final C16504A<bB.f> f118596j;

    /* renamed from: k  reason: collision with root package name */
    private final C16532g<bB.f> f118597k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final HashSet<C13503b.a> f118598l = new HashSet<>();

    /* renamed from: m  reason: collision with root package name */
    private F0 f118599m = J0.b((F0) null, 1, (Object) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LaB/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListSyncServiceImpl", f = "ShoppingListSyncServiceImpl.kt", l = {301}, m = "addSyncEvent")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f118600c;

        /* renamed from: d  reason: collision with root package name */
        Object f118601d;

        /* renamed from: e  reason: collision with root package name */
        Object f118602e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f118603f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f118604g;

        /* renamed from: h  reason: collision with root package name */
        int f118605h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f118604g = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118603f = obj;
            this.f118605h |= Integer.MIN_VALUE;
            return this.f118604g.M((WA.g) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListSyncServiceImpl$clearSyncEvents$1", f = "ShoppingListSyncServiceImpl.kt", l = {137}, m = "invokeSuspend")
    static final class c extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118606c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f118607d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f118607d = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f118607d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f118606c;
            if (i10 == 0) {
                y.b(obj);
                f fVar = this.f118607d;
                this.f118606c = 1;
                if (fVar.N(this) == f10) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListSyncServiceImpl", f = "ShoppingListSyncServiceImpl.kt", l = {268}, m = "handleError")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f118608c;

        /* renamed from: d  reason: collision with root package name */
        Object f118609d;

        /* renamed from: e  reason: collision with root package name */
        Object f118610e;

        /* renamed from: f  reason: collision with root package name */
        Object f118611f;

        /* renamed from: g  reason: collision with root package name */
        Object f118612g;

        /* renamed from: h  reason: collision with root package name */
        Object f118613h;

        /* renamed from: i  reason: collision with root package name */
        Object f118614i;

        /* renamed from: j  reason: collision with root package name */
        Object f118615j;

        /* renamed from: k  reason: collision with root package name */
        Object f118616k;

        /* renamed from: l  reason: collision with root package name */
        Object f118617l;

        /* renamed from: m  reason: collision with root package name */
        Object f118618m;

        /* renamed from: n  reason: collision with root package name */
        int f118619n;

        /* renamed from: o  reason: collision with root package name */
        int f118620o;

        /* renamed from: p  reason: collision with root package name */
        int f118621p;

        /* renamed from: q  reason: collision with root package name */
        int f118622q;

        /* renamed from: r  reason: collision with root package name */
        int f118623r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f118624s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ f f118625t;

        /* renamed from: u  reason: collision with root package name */
        int f118626u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar, C17164e<? super d> eVar) {
            super(eVar);
            this.f118625t = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118624s = obj;
            this.f118626u |= Integer.MIN_VALUE;
            return this.f118625t.P((C13914d) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListSyncServiceImpl$notifyShoppingListRefreshed$1", f = "ShoppingListSyncServiceImpl.kt", l = {}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118627c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f118628d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f118629e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar, boolean z10, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f118628d = fVar;
            this.f118629e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f118628d, this.f118629e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f118627c == 0) {
                y.b(obj);
                Iterator it = this.f118628d.f118598l.iterator();
                C17542s.i(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    C17542s.i(next, "next(...)");
                    ((C13503b.a) next).a(this.f118629e);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListSyncServiceImpl$observeEventQueue$$inlined$flatMapLatest$1", f = "ShoppingListSyncServiceImpl.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: aB.f$f  reason: collision with other inner class name */
    public static final class C2955f extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super C16807N>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118630c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f118631d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f118632e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f118633f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2955f(C17164e eVar, f fVar) {
            super(3, eVar);
            this.f118633f = fVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super C16807N> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            C2955f fVar = new C2955f(eVar, this.f118633f);
            fVar.f118631d = hVar;
            fVar.f118632e = bool;
            return fVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f118630c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f118631d;
                C16532g J10 = !((Boolean) this.f118632e).booleanValue() ? C16534i.J(C16807N.f139792a) : new h(C16534i.A(C16534i.s(C16534i.g0(this.f118633f.f118593g.b(), new g((C17164e) null, this.f118633f)))), this.f118633f);
                this.f118630c = 1;
                if (C16534i.x(hVar, J10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListSyncServiceImpl$observeEventQueue$lambda$7$$inlined$flatMapLatest$1", f = "ShoppingListSyncServiceImpl.kt", l = {189}, m = "invokeSuspend")
    public static final class g extends kotlin.coroutines.jvm.internal.l implements nI.q<C16533h<? super WA.g>, Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118634c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f118635d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f118636e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f118637f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17164e eVar, f fVar) {
            super(3, eVar);
            this.f118637f = fVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super WA.g> hVar, Boolean bool, C17164e<? super C16807N> eVar) {
            g gVar = new g(eVar, this.f118637f);
            gVar.f118635d = hVar;
            gVar.f118636e = bool;
            return gVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f118634c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f118635d;
                C16532g<WA.g> c10 = ((Boolean) this.f118636e).booleanValue() ? this.f118637f.f118588b.c() : C16534i.J(null);
                this.f118634c = 1;
                if (C16534i.x(hVar, c10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements C16532g<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f118638a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f118639b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f118640a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f118641b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListSyncServiceImpl$observeEventQueue$lambda$7$$inlined$map$1$2", f = "ShoppingListSyncServiceImpl.kt", l = {54, 50}, m = "emit")
            /* renamed from: aB.f$h$a$a  reason: collision with other inner class name */
            public static final class C2956a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f118642c;

                /* renamed from: d  reason: collision with root package name */
                int f118643d;

                /* renamed from: e  reason: collision with root package name */
                Object f118644e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ a f118645f;

                /* renamed from: g  reason: collision with root package name */
                Object f118646g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2956a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f118645f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f118642c = obj;
                    this.f118643d |= Integer.MIN_VALUE;
                    return this.f118645f.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, f fVar) {
                this.f118640a = hVar;
                this.f118641b = fVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:51:0x0103, code lost:
                r0 = th;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:52:0x0104, code lost:
                r13 = r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f3, code lost:
                throw r0;
             */
            /* JADX WARNING: Exception block dominator not found, dom blocks: [B:14:0x004a, B:19:0x005f] */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x0051 A[ExcHandler: CancellationException (r0v22 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:14:0x004a] */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x0077 A[Catch:{ CancellationException -> 0x0051, all -> 0x004e }] */
            /* JADX WARNING: Removed duplicated region for block: B:56:0x0115  */
            /* JADX WARNING: Removed duplicated region for block: B:84:0x01dc  */
            /* JADX WARNING: Removed duplicated region for block: B:87:0x01ef A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r23, dI.C17164e r24) {
                /*
                    r22 = this;
                    r1 = r22
                    r0 = r24
                    boolean r2 = r0 instanceof aB.f.h.a.C2956a
                    if (r2 == 0) goto L_0x0017
                    r2 = r0
                    aB.f$h$a$a r2 = (aB.f.h.a.C2956a) r2
                    int r3 = r2.f118643d
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.f118643d = r3
                    goto L_0x001c
                L_0x0017:
                    aB.f$h$a$a r2 = new aB.f$h$a$a
                    r2.<init>(r1, r0)
                L_0x001c:
                    java.lang.Object r0 = r2.f118642c
                    java.lang.Object r3 = eI.C17187b.f()
                    int r4 = r2.f118643d
                    java.lang.String r5 = "|"
                    java.lang.String r6 = "b"
                    java.lang.String r7 = "m"
                    java.lang.String r8 = "main"
                    r9 = 0
                    r10 = 2
                    r11 = 1
                    if (r4 == 0) goto L_0x0054
                    if (r4 == r11) goto L_0x0042
                    if (r4 != r10) goto L_0x003a
                    XH.y.b(r0)
                    goto L_0x01f0
                L_0x003a:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r2)
                    throw r0
                L_0x0042:
                    java.lang.Object r4 = r2.f118646g
                    TJ.h r4 = (TJ.C16533h) r4
                    java.lang.Object r13 = r2.f118644e
                    aB.f$h$a r13 = (aB.f.h.a) r13
                    XH.y.b(r0)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    goto L_0x006f
                L_0x004e:
                    r0 = move-exception
                    goto L_0x0105
                L_0x0051:
                    r0 = move-exception
                    goto L_0x01f3
                L_0x0054:
                    XH.y.b(r0)
                    TJ.h r4 = r1.f118640a
                    r0 = r23
                    WA.g r0 = (WA.g) r0
                    aB.f r13 = r1.f118641b
                    XH.x$a r14 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0051, all -> 0x0103 }
                    r2.f118644e = r1     // Catch:{ CancellationException -> 0x0051, all -> 0x0103 }
                    r2.f118646g = r4     // Catch:{ CancellationException -> 0x0051, all -> 0x0103 }
                    r2.f118643d = r11     // Catch:{ CancellationException -> 0x0051, all -> 0x0103 }
                    java.lang.Object r0 = r13.U(r0, r2)     // Catch:{ CancellationException -> 0x0051, all -> 0x0103 }
                    if (r0 != r3) goto L_0x006e
                    return r3
                L_0x006e:
                    r13 = r1
                L_0x006f:
                    java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    boolean r0 = r0.booleanValue()     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    if (r0 != 0) goto L_0x00fc
                    java.lang.String r0 = "ShoppingLists"
                    qv.e r15 = qv.e.WARN     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    qv.d r14 = qv.d.f102012a     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    java.util.List r14 = r14.a()     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    java.lang.Iterable r14 = (java.lang.Iterable) r14     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    r10.<init>()     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    java.util.Iterator r14 = r14.iterator()     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                L_0x008c:
                    boolean r16 = r14.hasNext()     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    if (r16 == 0) goto L_0x00a4
                    java.lang.Object r12 = r14.next()     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    r11 = r12
                    qv.b r11 = (qv.C11819b) r11     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    boolean r11 = r11.b(r15, r9)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    if (r11 == 0) goto L_0x00a2
                    r10.add(r12)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                L_0x00a2:
                    r11 = 1
                    goto L_0x008c
                L_0x00a4:
                    java.util.Iterator r10 = r10.iterator()     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    r11 = 0
                    r12 = 0
                L_0x00aa:
                    boolean r14 = r10.hasNext()     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    if (r14 == 0) goto L_0x00fc
                    java.lang.Object r14 = r10.next()     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    qv.b r14 = (qv.C11819b) r14     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    r9 = 0
                    if (r11 != 0) goto L_0x00c6
                    java.lang.String r11 = "Processing event failed, stop processing queue"
                    java.lang.String r11 = qv.C11818a.a(r11, r9)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    if (r11 != 0) goto L_0x00c2
                    goto L_0x00fc
                L_0x00c2:
                    java.lang.String r11 = qv.C11820c.a(r11)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                L_0x00c6:
                    if (r12 != 0) goto L_0x00ed
                    java.lang.Thread r12 = java.lang.Thread.currentThread()     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    java.lang.String r12 = r12.getName()     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    r9 = 1
                    boolean r12 = HJ.C15854t.b0(r12, r8, r9)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    if (r12 == 0) goto L_0x00d9
                    r9 = r7
                    goto L_0x00da
                L_0x00d9:
                    r9 = r6
                L_0x00da:
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    r12.<init>()     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    r12.append(r9)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    r12.append(r5)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    r12.append(r0)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    java.lang.String r9 = r12.toString()     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    r12 = r9
                L_0x00ed:
                    r17 = 0
                    r9 = r15
                    r16 = r12
                    r18 = 0
                    r19 = r11
                    r14.a(r15, r16, r17, r18, r19)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    r15 = r9
                    r9 = 0
                    goto L_0x00aa
                L_0x00fc:
                    XH.N r0 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0051, all -> 0x004e }
                    goto L_0x010f
                L_0x0103:
                    r0 = move-exception
                    r13 = r1
                L_0x0105:
                    XH.x$a r9 = XH.x.f139812b
                    java.lang.Object r0 = XH.y.a(r0)
                    java.lang.Object r0 = XH.x.b(r0)
                L_0x010f:
                    java.lang.Throwable r9 = XH.x.e(r0)
                    if (r9 == 0) goto L_0x01d6
                    aB.f r10 = r13.f118641b
                    qv.e r11 = qv.e.ERROR
                    qv.d r12 = qv.d.f102012a
                    java.util.List r12 = r12.a()
                    java.lang.Iterable r12 = (java.lang.Iterable) r12
                    java.util.ArrayList r13 = new java.util.ArrayList
                    r13.<init>()
                    java.util.Iterator r12 = r12.iterator()
                L_0x012a:
                    boolean r14 = r12.hasNext()
                    if (r14 == 0) goto L_0x0144
                    java.lang.Object r14 = r12.next()
                    r15 = r14
                    qv.b r15 = (qv.C11819b) r15
                    r1 = 0
                    boolean r15 = r15.b(r11, r1)
                    if (r15 == 0) goto L_0x0141
                    r13.add(r14)
                L_0x0141:
                    r1 = r22
                    goto L_0x012a
                L_0x0144:
                    java.util.Iterator r1 = r13.iterator()
                    r12 = 0
                    r13 = 0
                L_0x014a:
                    boolean r14 = r1.hasNext()
                    if (r14 == 0) goto L_0x01d6
                    java.lang.Object r14 = r1.next()
                    qv.b r14 = (qv.C11819b) r14
                    if (r12 != 0) goto L_0x0166
                    java.lang.String r12 = "Unable to process event queue"
                    java.lang.String r12 = qv.C11818a.a(r12, r9)
                    if (r12 != 0) goto L_0x0162
                    goto L_0x01d6
                L_0x0162:
                    java.lang.String r12 = qv.C11820c.a(r12)
                L_0x0166:
                    if (r13 != 0) goto L_0x01bb
                    java.lang.Class r13 = r10.getClass()
                    java.lang.String r13 = r13.getName()
                    kotlin.jvm.internal.C17542s.g(r13)
                    r15 = 36
                    r23 = r1
                    r20 = r6
                    r1 = 2
                    r6 = 0
                    java.lang.String r15 = HJ.C15854t.s1(r13, r15, r6, r1, r6)
                    r21 = r7
                    r7 = 46
                    java.lang.String r7 = HJ.C15854t.o1(r15, r7, r6, r1, r6)
                    int r1 = r7.length()
                    if (r1 != 0) goto L_0x018e
                    goto L_0x0194
                L_0x018e:
                    java.lang.String r1 = "Kt"
                    java.lang.String r13 = HJ.C15854t.P0(r7, r1)
                L_0x0194:
                    java.lang.Thread r1 = java.lang.Thread.currentThread()
                    java.lang.String r1 = r1.getName()
                    r6 = 1
                    boolean r1 = HJ.C15854t.b0(r1, r8, r6)
                    if (r1 == 0) goto L_0x01a6
                    r1 = r21
                    goto L_0x01a8
                L_0x01a6:
                    r1 = r20
                L_0x01a8:
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    r7.append(r1)
                    r7.append(r5)
                    r7.append(r13)
                    java.lang.String r13 = r7.toString()
                    goto L_0x01c2
                L_0x01bb:
                    r23 = r1
                    r20 = r6
                    r21 = r7
                    r6 = 1
                L_0x01c2:
                    r17 = 0
                    r15 = r11
                    r16 = r13
                    r18 = r9
                    r19 = r12
                    r14.a(r15, r16, r17, r18, r19)
                    r1 = r23
                    r6 = r20
                    r7 = r21
                    goto L_0x014a
                L_0x01d6:
                    boolean r1 = XH.x.g(r0)
                    if (r1 == 0) goto L_0x01dd
                    r0 = 0
                L_0x01dd:
                    XH.N r0 = (XH.C16807N) r0
                    XH.N r0 = XH.C16807N.f139792a
                    r1 = 0
                    r2.f118644e = r1
                    r2.f118646g = r1
                    r1 = 2
                    r2.f118643d = r1
                    java.lang.Object r0 = r4.emit(r0, r2)
                    if (r0 != r3) goto L_0x01f0
                    return r3
                L_0x01f0:
                    XH.N r0 = XH.C16807N.f139792a
                    return r0
                L_0x01f3:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: aB.f.h.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public h(C16532g gVar, f fVar) {
            this.f118638a = gVar;
            this.f118639b = fVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f118638a.collect(new a(hVar, this.f118639b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"aB/f$i", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f118647a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(N.a aVar, f fVar) {
            super(aVar);
            this.f118647a = fVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            f fVar = this.f118647a;
            qv.e eVar = qv.e.WARN;
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
                    String a10 = C11818a.a("Unable to replace list", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = fVar.getClass().getName();
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListSyncServiceImpl$onListFetched$3", f = "ShoppingListSyncServiceImpl.kt", l = {331, 333}, m = "invokeSuspend")
    static final class j extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f118648c;

        /* renamed from: d  reason: collision with root package name */
        Object f118649d;

        /* renamed from: e  reason: collision with root package name */
        Object f118650e;

        /* renamed from: f  reason: collision with root package name */
        Object f118651f;

        /* renamed from: g  reason: collision with root package name */
        Object f118652g;

        /* renamed from: h  reason: collision with root package name */
        Object f118653h;

        /* renamed from: i  reason: collision with root package name */
        int f118654i;

        /* renamed from: j  reason: collision with root package name */
        int f118655j;

        /* renamed from: k  reason: collision with root package name */
        int f118656k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ bB.f f118657l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ f f118658m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(bB.f fVar, f fVar2, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f118657l = fVar;
            this.f118658m = fVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new j(this.f118657l, this.f118658m, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            List list;
            Iterable iterable;
            bB.f fVar;
            Iterable iterable2;
            Collection collection;
            Iterator it;
            int i10;
            int i11;
            Object f10 = C17187b.f();
            int i12 = this.f118656k;
            if (i12 == 0) {
                y.b(obj);
                iterable2 = this.f118657l.b();
                fVar = this.f118657l;
                Collection arrayList = new ArrayList(C16877v.y(iterable2, 10));
                it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList.add(C13872b.q((bB.e) it.next(), fVar.a()));
                }
                C13737a B10 = this.f118658m.f118594h;
                C13768f fVar2 = new C13768f(this.f118657l.a(), this.f118657l.c(), this.f118657l.d());
                this.f118648c = arrayList;
                this.f118649d = iterable2;
                this.f118650e = fVar;
                this.f118651f = iterable2;
                this.f118652g = arrayList;
                this.f118653h = it;
                this.f118654i = 0;
                this.f118655j = 0;
                this.f118656k = 1;
                if (B10.f(fVar2, this) == f10) {
                    return f10;
                }
                list = arrayList;
                i11 = 0;
                i10 = 0;
                iterable = iterable2;
                collection = arrayList;
            } else if (i12 == 1) {
                i11 = this.f118655j;
                i10 = this.f118654i;
                it = (Iterator) this.f118653h;
                iterable2 = (Iterable) this.f118651f;
                fVar = (bB.f) this.f118650e;
                iterable = (Iterable) this.f118649d;
                list = (List) this.f118648c;
                y.b(obj);
                collection = (Collection) this.f118652g;
            } else if (i12 == 2) {
                Iterator it2 = (Iterator) this.f118653h;
                Collection collection2 = (Collection) this.f118652g;
                Iterable iterable3 = (Iterable) this.f118651f;
                bB.f fVar3 = (bB.f) this.f118650e;
                Iterable iterable4 = (Iterable) this.f118649d;
                List list2 = (List) this.f118648c;
                y.b(obj);
                return C16807N.f139792a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C13741e D10 = this.f118658m.f118595i;
            String a10 = this.f118657l.a();
            this.f118648c = list;
            this.f118649d = iterable;
            this.f118650e = fVar;
            this.f118651f = iterable2;
            this.f118652g = collection;
            this.f118653h = it;
            this.f118654i = i10;
            this.f118655j = i11;
            this.f118656k = 2;
            if (D10.m(a10, list, this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"aB/f$k", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class k extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f118659a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(N.a aVar, f fVar) {
            super(aVar);
            this.f118659a = fVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            f fVar = this.f118659a;
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
                    String a10 = C11818a.a("postShoppingListSyncEvent failed", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = fVar.getClass().getName();
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListSyncServiceImpl$postShoppingListSyncEvent$2", f = "ShoppingListSyncServiceImpl.kt", l = {173, 179}, m = "invokeSuspend")
    static final class l extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f118660c;

        /* renamed from: d  reason: collision with root package name */
        Object f118661d;

        /* renamed from: e  reason: collision with root package name */
        Object f118662e;

        /* renamed from: f  reason: collision with root package name */
        Object f118663f;

        /* renamed from: g  reason: collision with root package name */
        Object f118664g;

        /* renamed from: h  reason: collision with root package name */
        Object f118665h;

        /* renamed from: i  reason: collision with root package name */
        Object f118666i;

        /* renamed from: j  reason: collision with root package name */
        Object f118667j;

        /* renamed from: k  reason: collision with root package name */
        int f118668k;

        /* renamed from: l  reason: collision with root package name */
        int f118669l;

        /* renamed from: m  reason: collision with root package name */
        int f118670m;

        /* renamed from: n  reason: collision with root package name */
        int f118671n;

        /* renamed from: o  reason: collision with root package name */
        int f118672o;

        /* renamed from: p  reason: collision with root package name */
        int f118673p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ SyncEventModel f118674q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ f f118675r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(SyncEventModel syncEventModel, f fVar, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f118674q = syncEventModel;
            this.f118675r = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new l(this.f118674q, this.f118675r, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) {
            /*
                r29 = this;
                r0 = r29
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f118673p
                java.lang.String r3 = "|"
                java.lang.String r4 = "b"
                java.lang.String r5 = "m"
                java.lang.String r6 = "main"
                java.lang.String r7 = "ShoppingLists"
                r8 = 2
                r10 = 1
                r11 = 0
                if (r2 == 0) goto L_0x0063
                if (r2 == r10) goto L_0x0040
                if (r2 != r8) goto L_0x0038
                java.lang.Object r1 = r0.f118666i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f118665h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f118664g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f118663f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f118662e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f118661d
                com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r1 = (com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel) r1
                java.lang.Object r1 = r0.f118660c
                WA.g r1 = (WA.g) r1
                goto L_0x005c
            L_0x0038:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0040:
                java.lang.Object r1 = r0.f118666i
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r1 = r0.f118665h
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.lang.Object r1 = r0.f118664g
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f118663f
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r1 = r0.f118662e
                qv.e r1 = (qv.e) r1
                java.lang.Object r1 = r0.f118661d
                com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r1 = (com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel) r1
                java.lang.Object r1 = r0.f118660c
                java.lang.String r1 = (java.lang.String) r1
            L_0x005c:
                XH.y.b(r30)
                r21 = r4
                goto L_0x0195
            L_0x0063:
                XH.y.b(r30)
                com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r2 = r0.f118674q
                qv.e r15 = qv.e.DEBUG
                qv.d r12 = qv.d.f102012a
                java.util.List r12 = r12.a()
                java.lang.Iterable r12 = (java.lang.Iterable) r12
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                java.util.Iterator r12 = r12.iterator()
            L_0x007b:
                boolean r13 = r12.hasNext()
                if (r13 == 0) goto L_0x0092
                java.lang.Object r13 = r12.next()
                r9 = r13
                qv.b r9 = (qv.C11819b) r9
                boolean r9 = r9.b(r15, r11)
                if (r9 == 0) goto L_0x007b
                r14.add(r13)
                goto L_0x007b
            L_0x0092:
                java.util.Iterator r9 = r14.iterator()
                r16 = r14
                r12 = 0
                r13 = 0
            L_0x009a:
                boolean r17 = r9.hasNext()
                if (r17 == 0) goto L_0x0117
                java.lang.Object r19 = r9.next()
                r16 = r19
                qv.b r16 = (qv.C11819b) r16
                r8 = 0
                if (r12 != 0) goto L_0x00ce
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r10 = "postShoppingListSyncEvent, eventData: "
                r11.append(r10)
                r11.append(r2)
                java.lang.String r10 = r11.toString()
                java.lang.String r10 = qv.C11818a.a(r10, r8)
                if (r10 != 0) goto L_0x00ca
                r21 = r4
                r20 = r14
                r4 = r15
                r8 = r19
                goto L_0x011e
            L_0x00ca:
                java.lang.String r12 = qv.C11820c.a(r10)
            L_0x00ce:
                r10 = r12
                if (r13 != 0) goto L_0x00f5
                java.lang.Thread r11 = java.lang.Thread.currentThread()
                java.lang.String r11 = r11.getName()
                r12 = 1
                boolean r11 = HJ.C15854t.b0(r11, r6, r12)
                if (r11 == 0) goto L_0x00e2
                r11 = r5
                goto L_0x00e3
            L_0x00e2:
                r11 = r4
            L_0x00e3:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r11)
                r12.append(r3)
                r12.append(r7)
                java.lang.String r13 = r12.toString()
            L_0x00f5:
                r11 = r13
                r17 = 0
                r12 = r16
                r13 = r15
                r20 = r14
                r14 = r11
                r21 = r4
                r4 = r15
                r15 = r17
                r16 = r8
                r17 = r10
                r12.a(r13, r14, r15, r16, r17)
                r15 = r4
                r12 = r10
                r13 = r11
                r16 = r19
                r14 = r20
                r4 = r21
                r8 = 2
                r10 = 1
                r11 = 0
                goto L_0x009a
            L_0x0117:
                r21 = r4
                r20 = r14
                r4 = r15
                r8 = r16
            L_0x011e:
                com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r10 = r0.f118674q
                java.lang.String r10 = r10.b()
                java.lang.String r11 = "event_clear"
                boolean r10 = kotlin.jvm.internal.C17542s.e(r11, r10)
                if (r10 == 0) goto L_0x0155
                aB.f r10 = r0.f118675r
                r0.f118660c = r7
                r0.f118661d = r2
                r0.f118662e = r4
                r0.f118663f = r12
                r0.f118664g = r13
                r11 = r20
                r0.f118665h = r11
                r0.f118666i = r9
                r0.f118667j = r8
                r2 = 0
                r0.f118668k = r2
                r0.f118669l = r2
                r0.f118670m = r2
                r0.f118671n = r2
                r0.f118672o = r2
                r2 = 1
                r0.f118673p = r2
                java.lang.Object r2 = r10.N(r0)
                if (r2 != r1) goto L_0x0195
                return r1
            L_0x0155:
                r11 = r20
                WA.g r10 = new WA.g
                com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r14 = r0.f118674q
                java.lang.String r25 = r14.d()
                com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r14 = r0.f118674q
                r27 = 1
                r28 = 0
                r23 = 0
                r22 = r10
                r26 = r14
                r22.<init>(r23, r25, r26, r27, r28)
                aB.f r14 = r0.f118675r
                r0.f118660c = r10
                r0.f118661d = r2
                r0.f118662e = r4
                r0.f118663f = r12
                r0.f118664g = r13
                r0.f118665h = r11
                r0.f118666i = r9
                r0.f118667j = r8
                r2 = 0
                r0.f118668k = r2
                r0.f118669l = r2
                r0.f118670m = r2
                r0.f118671n = r2
                r0.f118672o = r2
                r2 = 2
                r0.f118673p = r2
                java.lang.Object r2 = r14.M(r10, r0)
                if (r2 != r1) goto L_0x0195
                return r1
            L_0x0195:
                com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r1 = r0.f118674q
                qv.e r2 = qv.e.DEBUG
                qv.d r4 = qv.d.f102012a
                java.util.List r4 = r4.a()
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x01aa:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto L_0x01c2
                java.lang.Object r9 = r4.next()
                r10 = r9
                qv.b r10 = (qv.C11819b) r10
                r11 = 0
                boolean r10 = r10.b(r2, r11)
                if (r10 == 0) goto L_0x01aa
                r8.add(r9)
                goto L_0x01aa
            L_0x01c2:
                java.util.Iterator r4 = r8.iterator()
                r9 = 0
                r18 = 0
            L_0x01c9:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto L_0x022a
                java.lang.Object r8 = r4.next()
                qv.b r8 = (qv.C11819b) r8
                r12 = 0
                if (r9 != 0) goto L_0x01f4
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "sync service request for event processing. with data: "
                r9.append(r10)
                r9.append(r1)
                java.lang.String r9 = r9.toString()
                java.lang.String r9 = qv.C11818a.a(r9, r12)
                if (r9 != 0) goto L_0x01f0
                goto L_0x022a
            L_0x01f0:
                java.lang.String r9 = qv.C11820c.a(r9)
            L_0x01f4:
                r14 = r9
                if (r18 != 0) goto L_0x021f
                java.lang.Thread r9 = java.lang.Thread.currentThread()
                java.lang.String r9 = r9.getName()
                r15 = 1
                boolean r9 = HJ.C15854t.b0(r9, r6, r15)
                if (r9 == 0) goto L_0x0208
                r9 = r5
                goto L_0x020a
            L_0x0208:
                r9 = r21
            L_0x020a:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r9)
                r10.append(r3)
                r10.append(r7)
                java.lang.String r9 = r10.toString()
                r18 = r9
                goto L_0x0220
            L_0x021f:
                r15 = 1
            L_0x0220:
                r11 = 0
                r9 = r2
                r10 = r18
                r13 = r14
                r8.a(r9, r10, r11, r12, r13)
                r9 = r14
                goto L_0x01c9
            L_0x022a:
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: aB.f.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListSyncServiceImpl$processShoppingListEvent$2", f = "ShoppingListSyncServiceImpl.kt", l = {206, 210, 214, 219, 224, 236, 249}, m = "invokeSuspend")
    static final class m extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f118676c;

        /* renamed from: d  reason: collision with root package name */
        Object f118677d;

        /* renamed from: e  reason: collision with root package name */
        Object f118678e;

        /* renamed from: f  reason: collision with root package name */
        Object f118679f;

        /* renamed from: g  reason: collision with root package name */
        Object f118680g;

        /* renamed from: h  reason: collision with root package name */
        Object f118681h;

        /* renamed from: i  reason: collision with root package name */
        Object f118682i;

        /* renamed from: j  reason: collision with root package name */
        Object f118683j;

        /* renamed from: k  reason: collision with root package name */
        Object f118684k;

        /* renamed from: l  reason: collision with root package name */
        Object f118685l;

        /* renamed from: m  reason: collision with root package name */
        Object f118686m;

        /* renamed from: n  reason: collision with root package name */
        Object f118687n;

        /* renamed from: o  reason: collision with root package name */
        Object f118688o;

        /* renamed from: p  reason: collision with root package name */
        Object f118689p;

        /* renamed from: q  reason: collision with root package name */
        Object f118690q;

        /* renamed from: r  reason: collision with root package name */
        int f118691r;

        /* renamed from: s  reason: collision with root package name */
        int f118692s;

        /* renamed from: t  reason: collision with root package name */
        int f118693t;

        /* renamed from: u  reason: collision with root package name */
        int f118694u;

        /* renamed from: v  reason: collision with root package name */
        private /* synthetic */ Object f118695v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ WA.g f118696w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ f f118697x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(WA.g gVar, f fVar, C17164e<? super m> eVar) {
            super(2, eVar);
            this.f118696w = gVar;
            this.f118697x = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            m mVar = new m(this.f118696w, this.f118697x, eVar);
            mVar.f118695v = obj;
            return mVar;
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((m) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v1, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Iterable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Iterable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v44, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v14, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v24, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r42v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v26, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v47, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v48, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v21, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v49, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v23, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v15, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v16, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v24, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v23, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: java.lang.Throwable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v26, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v27, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v18, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v25, resolved type: java.lang.Throwable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v28, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v26, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v29, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v27, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v30, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v31, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v32, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v21, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v31, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v35, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v33, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v65, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v34, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v22, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v38, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v35, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v31, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v32, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v33, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v36, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v24, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v53, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v58, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v37, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v26, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v38, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v54, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v59, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v27, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v38, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v73, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v39, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v28, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v40, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v29, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v39, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v56, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v61, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v41, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v55, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v41, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v42, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v56, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v57, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v80, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v31, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v81, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v13, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v84, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v30, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v46, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v33, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v47, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v47, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v59, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v100, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v48, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v101, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v46, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v104, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v34, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v36, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v76, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v50, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v60, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v118, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v51, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v119, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v49, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v122, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v36, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v38, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v48, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v53, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v61, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v136, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v54, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v137, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v51, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v140, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v38, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v40, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v56, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v41, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v62, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v51, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v77, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v25, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v58, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v63, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v14, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v156, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v59, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v157, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v55, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v160, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v41, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v43, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v61, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v51, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v163, resolved type: java.lang.Iterable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: kotlin.jvm.internal.K} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v89, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v91, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v77, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v78, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v79, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v80, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v92, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v100, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v88, resolved type: java.lang.Object} */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r23v15, types: [boolean] */
        /* JADX WARNING: type inference failed for: r14v36 */
        /* JADX WARNING: type inference failed for: r14v43 */
        /* JADX WARNING: type inference failed for: r23v38, types: [boolean] */
        /* JADX WARNING: type inference failed for: r14v76 */
        /* JADX WARNING: type inference failed for: r14v82 */
        /* JADX WARNING: type inference failed for: r14v84 */
        /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
            r13.f144344a = r11;
            r8.f144344a = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x0532, code lost:
            r32 = r7;
            r7 = r8;
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0547, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x0548, code lost:
            r26 = r4;
            r27 = r5;
            r32 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x00f3, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
            r7 = new java.lang.IllegalStateException("processOtherSLEvent, unknown event: " + r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x0570, code lost:
            r2 = r2;
            r2 = r2;
            r14 = r14;
            r23 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
            r0 = qv.e.ERROR;
            r8 = new java.util.ArrayList();
            r3 = qv.d.f102012a.a().iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0587, code lost:
            if (r3.hasNext() == false) goto L_0x05b1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x0589, code lost:
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
            r9 = r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x00f4, code lost:
            r31 = r3;
            r32 = r6;
            r28 = r8;
            r29 = r9;
            r14 = r18;
            r9 = r19;
            r13 = r21;
            r6 = r23;
            r3 = r2;
            r23 = com.sugarcube.core.logger.DslKt.MAIN_THREAD_NAME;
            r2 = r20;
            r10 = r22;
            r22 = com.sugarcube.core.logger.DslKt.INDICATOR_SEPARATOR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x0595, code lost:
            if (((qv.C11819b) r9).b(r0, false) == false) goto L_0x0583;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x0597, code lost:
            r8.add(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x059b, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x059c, code lost:
            r3 = r2;
            r26 = r4;
            r2 = r5;
            r27 = r2;
            r9 = r7;
            r23 = com.sugarcube.core.logger.DslKt.MAIN_THREAD_NAME;
            r25 = r11;
            r24 = r12;
            r10 = r13;
            r4 = 0;
            r14 = null;
            r15 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x05ad, code lost:
            r13 = r27;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x05b1, code lost:
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
            r3 = r8.iterator();
            r8 = null;
            r9 = null;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x05bb, code lost:
            if (r3.hasNext() == false) goto L_0x05ce;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x05bd, code lost:
            r33 = (qv.C11819b) r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x010f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x05c5, code lost:
            if (r8 != null) goto L_0x05da;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x05c8, code lost:
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
            r8 = qv.C11818a.a((java.lang.String) null, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x05cc, code lost:
            if (r8 != null) goto L_0x05d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x05ce, code lost:
            r23 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x05d6, code lost:
            r8 = qv.C11820c.a(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x05da, code lost:
            if (r9 != null) goto L_0x0662;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x05dc, code lost:
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
            r9 = r5.getClass().getName();
            kotlin.jvm.internal.C17542s.g(r9);
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x05e7, code lost:
            r23 = r2;
            r42 = r3;
            r14 = 36;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x05ef, code lost:
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
            r2 = HJ.C15854t.o1(HJ.C15854t.s1(r9, '$', (java.lang.String) null, 2, (java.lang.Object) null), '.', (java.lang.String) null, 2, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x05fd, code lost:
            if (r2.length() != 0) goto L_0x0602;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x05ff, code lost:
            r14 = r31;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x0602, code lost:
            r14 = r31;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x0604, code lost:
            r2 = r2;
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
            r9 = HJ.C15854t.P0(r2, r14);
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x0615, code lost:
            if (HJ.C15854t.b0(java.lang.Thread.currentThread().getName(), com.sugarcube.core.logger.DslKt.MAIN_THREAD_NAME, true) == false) goto L_0x061a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x0617, code lost:
            r2 = r29;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x061a, code lost:
            r2 = r28;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x061c, code lost:
            r3 = new java.lang.StringBuilder();
            r3.append(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x0624, code lost:
            r2 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x0626, code lost:
            r14 = r14;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
            r3.append(r2);
            r3.append(r9);
            r9 = r3.toString();
            r14 = r14;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x0631, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x0632, code lost:
            r22 = r2;
            r23 = r23;
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x0634, code lost:
            r26 = r4;
            r2 = r5;
            r27 = r2;
            r9 = r7;
            r25 = r11;
            r24 = r12;
            r31 = r14;
            r23 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x0640, code lost:
            r3 = r23;
            r4 = 0;
            r14 = null;
            r15 = 0;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x0645, code lost:
            r23 = com.sugarcube.core.logger.DslKt.MAIN_THREAD_NAME;
            r10 = r13;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x064a, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x064b, code lost:
            r2 = r22;
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x064e, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x064f, code lost:
            r2 = r22;
            r14 = r31;
            r26 = r4;
            r2 = r5;
            r27 = r2;
            r9 = r7;
            r25 = r11;
            r24 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x065e, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x065f, code lost:
            r23 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0662, code lost:
            r23 = r2;
            r42 = r3;
            r2 = r22;
            r14 = r31;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x066a, code lost:
            r33.a(r0, r9, false, r7, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x0677, code lost:
            r3 = r42;
            r22 = r2;
            r31 = r14;
            r2 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x0681, code lost:
            r22 = r22;
            r26 = r4;
            r2 = r5;
            r27 = r2;
            r9 = r7;
            r25 = r11;
            r24 = r12;
            r31 = r31;
            r3 = r23;
            r4 = 0;
            r14 = null;
            r15 = 0;
            r7 = r6;
            r23 = com.sugarcube.core.logger.DslKt.MAIN_THREAD_NAME;
            r6 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x069b, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x069c, code lost:
            r23 = r2;
            r2 = r22;
            r14 = r31;
            r26 = r4;
            r2 = r5;
            r27 = r2;
            r25 = r11;
            r24 = r12;
            r14 = r15;
            r4 = 0;
            r15 = 0;
            r5 = r3;
            r3 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
            r2 = (bB.f) r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x0709, code lost:
            r30 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
            r10.f144344a = true;
            aB.f.J(r0, r2);
            r9 = aB.f.G(r0);
            r1.f118695v = r6;
            r1.f118676c = r8;
            r1.f118677d = r15;
            r1.f118678e = r3;
            r1.f118679f = r7;
            r1.f118680g = r10;
            r1.f118681h = r5;
            r1.f118682i = r0;
            r1.f118683j = r13;
            r1.f118684k = r4;
            r1.f118685l = r2;
            r1.f118686m = r12;
            r1.f118687n = r14;
            r1.f118688o = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x0731, code lost:
            r5 = r30;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
            r1.f118689p = r5;
            r1.f118691r = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x0739, code lost:
            r4 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
            r1.f118692s = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x073d, code lost:
            r11 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:?, code lost:
            r1.f118693t = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x0741, code lost:
            r24 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
            r1.f118694u = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x074a, code lost:
            r3 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x074c, code lost:
            if (r9.emit(r2, r1) != r3) goto L_0x074f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x074e, code lost:
            return r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x074f, code lost:
            r27 = r6;
            r26 = r8;
            r25 = r15;
            r15 = r11;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:204:0x0756, code lost:
            r9 = r12;
            r6 = r13;
            r13 = r10;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x075f, code lost:
            r42 = r2;
            r8 = r9;
            r10 = r13;
            r11 = r24;
            r12 = r25;
            r13 = r26;
            r9 = r7;
            r7 = XH.x.b(XH.C16807N.f139792a);
            r0 = r14;
            r14 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x0770, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x0771, code lost:
            r10 = r13;
            r13 = r6;
            r6 = r7;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x0776, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x0777, code lost:
            r3 = r25;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:212:0x0779, code lost:
            r27 = r6;
            r6 = r7;
            r26 = r8;
            r9 = r12;
            r25 = r15;
            r15 = r11;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x0784, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:214:0x0785, code lost:
            r24 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0788, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:216:0x0789, code lost:
            r11 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x078c, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x078d, code lost:
            r11 = r24;
            r4 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x0792, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x0793, code lost:
            r11 = r24;
            r4 = r26;
            r5 = r30;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x079a, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:0x079b, code lost:
            r5 = r9;
            r11 = r24;
            r4 = r26;
            r24 = r3;
            r3 = r25;
            r2 = r42;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x07a7, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x07a8, code lost:
            r31 = r7;
            r3 = r23;
            r23 = com.sugarcube.core.logger.DslKt.MAIN_THREAD_NAME;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x07ae, code lost:
            r26 = r4;
            r27 = r5;
            r25 = r11;
            r10 = r13;
            r2 = r14;
            r14 = r15;
            r4 = 0;
            r15 = 0;
            r13 = r27;
            r5 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:226:0x07bd, code lost:
            r24 = r12;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:227:0x07c0, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:228:0x07c1, code lost:
            r24 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:0x07c4, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:230:0x07c5, code lost:
            r24 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:231:0x07c7, code lost:
            r23 = com.sugarcube.core.logger.DslKt.MAIN_THREAD_NAME;
            r3 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:232:0x07cb, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x07cc, code lost:
            r24 = r3;
            r22 = com.sugarcube.core.logger.DslKt.INDICATOR_SEPARATOR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x07d1, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x07d2, code lost:
            r24 = r3;
            r22 = com.sugarcube.core.logger.DslKt.INDICATOR_SEPARATOR;
            r23 = com.sugarcube.core.logger.DslKt.MAIN_THREAD_NAME;
            r3 = r2;
            r26 = r4;
            r27 = r5;
            r25 = r11;
            r10 = r13;
            r2 = r14;
            r14 = r15;
            r5 = r24;
            r4 = 0;
            r15 = 0;
            r13 = r42;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:0x080e, code lost:
            if ((r4 instanceof aB.C13914d) != false) goto L_0x0810;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:241:0x0810, code lost:
            r1.f118695v = r14;
            r1.f118676c = r13;
            r1.f118677d = r12;
            r1.f118678e = r11;
            r1.f118679f = r9;
            r1.f118680g = r10;
            r1.f118681h = r7;
            r1.f118682i = r2;
            r1.f118683j = r4;
            r1.f118684k = r4;
            r1.f118685l = r4;
            r1.f118686m = r10;
            r1.f118687n = r8;
            r1.f118688o = r0;
            r1.f118689p = r5;
            r1.f118690q = r7;
            r1.f118691r = 0;
            r1.f118692s = r15;
            r1.f118694u = 6;
            r5 = aB.f.H(r2, (aB.C13914d) r4, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x083f, code lost:
            if (r5 == r3) goto L_0x0841;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:243:0x0841, code lost:
            return r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:244:0x0842, code lost:
            r8 = r10;
            r21 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:245:0x0845, code lost:
            r10.f144344a = ((java.lang.Boolean) r5).booleanValue();
            r6 = r4;
            r4 = r8;
            r8 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:246:0x0853, code lost:
            r0 = qv.e.ERROR;
            r6 = new java.util.ArrayList();
            r5 = qv.d.f102012a.a().iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:248:0x086a, code lost:
            if (r5.hasNext() != false) goto L_0x086c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:249:0x086c, code lost:
            r15 = r5.next();
            r25 = r2;
            r24 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:250:0x087c, code lost:
            if (((qv.C11819b) r15).b(r0, false) != false) goto L_0x087e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:251:0x087e, code lost:
            r6.add(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:252:0x0881, code lost:
            r5 = r24;
            r2 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:253:0x0886, code lost:
            r25 = r2;
            r2 = r6.iterator();
            r6 = null;
            r15 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:255:0x0893, code lost:
            if (r2.hasNext() != false) goto L_0x0895;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:256:0x0895, code lost:
            r33 = (qv.C11819b) r2.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:257:0x089d, code lost:
            if (r6 == null) goto L_0x089f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:258:0x089f, code lost:
            r5 = qv.C11818a.a("exception when processing event: " + r13 + ")", r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:259:0x08b9, code lost:
            if (r5 == null) goto L_0x08bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:261:0x08c1, code lost:
            r6 = qv.C11820c.a(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:262:0x08c6, code lost:
            if (r15 == null) goto L_0x08c8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:263:0x08c8, code lost:
            r5 = r14.getClass().getName();
            kotlin.jvm.internal.C17542s.g(r5);
            r17 = r2;
            r18 = r7;
            r19 = r8;
            r8 = HJ.C15854t.o1(HJ.C15854t.s1(r5, '$', (java.lang.String) null, 2, (java.lang.Object) null), '.', (java.lang.String) null, 2, (java.lang.Object) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:264:0x08eb, code lost:
            if (r8.length() == 0) goto L_0x08ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:265:0x08ed, code lost:
            r8 = r5;
            r5 = r31;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:266:0x08f1, code lost:
            r5 = r31;
            r8 = HJ.C15854t.P0(r8, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:267:0x08f7, code lost:
            r7 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:268:0x0906, code lost:
            if (HJ.C15854t.b0(java.lang.Thread.currentThread().getName(), r7, true) != false) goto L_0x0908;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:269:0x0908, code lost:
            r2 = r29;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:270:0x090b, code lost:
            r2 = r28;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:271:0x090d, code lost:
            r15 = new java.lang.StringBuilder();
            r15.append(r2);
            r2 = r22;
            r15.append(r2);
            r15.append(r8);
            r15 = r15.toString();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:273:0x0925, code lost:
            r17 = r2;
            r18 = r7;
            r19 = r8;
            r2 = r22;
            r7 = r23;
            r5 = r31;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:274:0x0932, code lost:
            r33.a(r0, r15, false, r4, r6);
            r22 = r2;
            r31 = r5;
            r23 = r7;
            r2 = r17;
            r7 = r18;
            r8 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:275:0x094e, code lost:
            r6 = r4;
            r4 = r10;
            r0 = r14;
            r7 = r7;
            r8 = r8;
            r2 = r25;
            r21 = 0;
            r10 = r42;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:276:0x095b, code lost:
            r5 = r21;
            r39 = r2;
            r2 = r0;
            r0 = r4;
            r4 = r39;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:277:0x0964, code lost:
            r25 = r2;
            r18 = r7;
            r19 = r8;
            r2 = r0;
            r0 = r10;
            r5 = r24;
            r4 = r25;
            r10 = r42;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:279:0x0974, code lost:
            if (r0.f144344a != false) goto L_0x0976;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:280:0x0976, code lost:
            r15 = r1.f118697x;
            r23 = r3;
            r3 = r1.f118696w;
            r1.f118695v = r14;
            r1.f118676c = r13;
            r1.f118677d = r12;
            r1.f118678e = r11;
            r1.f118679f = r9;
            r1.f118680g = r0;
            r1.f118681h = r7;
            r1.f118682i = r4;
            r1.f118683j = r6;
            r1.f118684k = r10;
            r1.f118685l = r8;
            r1.f118686m = r2;
            r1.f118691r = r5;
            r1.f118694u = 7;
            r2 = aB.f.z(r15, r3, r1);
            r3 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:281:0x099f, code lost:
            if (r2 == r3) goto L_0x09a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:282:0x09a1, code lost:
            return r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:283:0x09a2, code lost:
            r2 = r9;
            r3 = r13;
            r4 = r32;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:285:0x09aa, code lost:
            if (kotlin.jvm.internal.C17542s.e(r3, r4) != false) goto L_0x09ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:286:0x09ac, code lost:
            aB.f.I(r1.f118697x, r2.f144344a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:288:0x09b9, code lost:
            return kotlin.coroutines.jvm.internal.b.a(r0.f144344a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:289:0x09ba, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x02e8, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x02e9, code lost:
            r22 = com.sugarcube.core.logger.DslKt.INDICATOR_SEPARATOR;
            r23 = com.sugarcube.core.logger.DslKt.MAIN_THREAD_NAME;
            r10 = r27;
            r25 = r30;
            r26 = r31;
            r27 = r32;
            r31 = r3;
            r32 = r6;
            r6 = r28;
            r3 = r2;
            r28 = r8;
            r2 = r13;
            r13 = r24;
            r24 = r29;
            r29 = r9;
            r9 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0457, code lost:
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
            r13.f144344a = r7;
            r14 = r14;
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0459, code lost:
            r7 = r23;
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x045b, code lost:
            r23 = com.sugarcube.core.logger.DslKt.MAIN_THREAD_NAME;
            r39 = r3;
            r3 = r2;
            r2 = r14;
            r14 = r39;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0465, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0466, code lost:
            r39 = r3;
            r3 = r2;
            r2 = r14;
            r14 = r39;
            r40 = r13;
            r13 = r6;
            r6 = r23;
            r23 = com.sugarcube.core.logger.DslKt.MAIN_THREAD_NAME;
            r10 = r40;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0477, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x0478, code lost:
            r26 = r4;
            r27 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x047c, code lost:
            r23 = com.sugarcube.core.logger.DslKt.MAIN_THREAD_NAME;
            r25 = r11;
            r24 = r12;
            r10 = r13;
            r4 = 0;
            r13 = r27;
            r5 = r3;
            r3 = r2;
            r2 = r14;
            r14 = r15;
            r15 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x04dd, code lost:
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
            r13.f144344a = r7;
            r14 = r14;
            r14 = r14;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:109:0x0554] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:112:0x055a] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:114:0x0570] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:118:0x0589] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:141:0x05ef] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:146:0x0604] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:154:0x0626] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:174:0x06b6] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:177:0x06db] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:183:0x0707] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:186:0x070c] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:189:0x0733] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:192:0x073b] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:195:0x073f] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:198:0x0744] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:26:0x02b2] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:57:0x03fa] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:59:0x03fc] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:64:0x040b] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:72:0x0457] */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:7:0x00d8, B:93:0x04e5] */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x010f A[ExcHandler: CancellationException (r0v142 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:7:0x00d8] */
        /* JADX WARNING: Removed duplicated region for block: B:239:0x080c  */
        /* JADX WARNING: Removed duplicated region for block: B:277:0x0964  */
        /* JADX WARNING: Removed duplicated region for block: B:280:0x0976  */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:72:0x0457=Splitter:B:72:0x0457, B:183:0x0707=Splitter:B:183:0x0707, B:205:0x0759=Splitter:B:205:0x0759, B:112:0x055a=Splitter:B:112:0x055a, B:90:0x04dd=Splitter:B:90:0x04dd, B:101:0x052e=Splitter:B:101:0x052e} */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:72:0x0457=Splitter:B:72:0x0457, B:90:0x04dd=Splitter:B:90:0x04dd} */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r42) {
            /*
                r41 = this;
                r1 = r41
                java.lang.Object r2 = eI.C17187b.f()
                int r0 = r1.f118694u
                java.lang.String r3 = "Kt"
                java.lang.String r6 = "event_sync"
                java.lang.String r7 = "|"
                java.lang.String r8 = "b"
                java.lang.String r9 = "m"
                java.lang.String r10 = "main"
                switch(r0) {
                    case 0: goto L_0x0308;
                    case 1: goto L_0x025c;
                    case 2: goto L_0x01ea;
                    case 3: goto L_0x017e;
                    case 4: goto L_0x0112;
                    case 5: goto L_0x0086;
                    case 6: goto L_0x0041;
                    case 7: goto L_0x001f;
                    default: goto L_0x0017;
                }
            L_0x0017:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x001f:
                java.lang.Object r0 = r1.f118682i
                aB.f r0 = (aB.f) r0
                java.lang.Object r0 = r1.f118680g
                kotlin.jvm.internal.K r0 = (kotlin.jvm.internal.K) r0
                java.lang.Object r2 = r1.f118679f
                kotlin.jvm.internal.K r2 = (kotlin.jvm.internal.K) r2
                java.lang.Object r3 = r1.f118678e
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r3 = r1.f118677d
                com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r3 = (com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel) r3
                java.lang.Object r3 = r1.f118676c
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Object r4 = r1.f118695v
                QJ.Q r4 = (QJ.Q) r4
                XH.y.b(r42)
                r4 = r6
                goto L_0x09a6
            L_0x0041:
                int r13 = r1.f118691r
                java.lang.Object r0 = r1.f118688o
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r3 = r1.f118686m
                kotlin.jvm.internal.K r3 = (kotlin.jvm.internal.K) r3
                java.lang.Object r4 = r1.f118685l
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                java.lang.Object r4 = r1.f118684k
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                java.lang.Object r5 = r1.f118683j
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                java.lang.Object r5 = r1.f118682i
                aB.f r5 = (aB.f) r5
                java.lang.Object r7 = r1.f118681h
                java.lang.Object r8 = r1.f118680g
                kotlin.jvm.internal.K r8 = (kotlin.jvm.internal.K) r8
                java.lang.Object r9 = r1.f118679f
                kotlin.jvm.internal.K r9 = (kotlin.jvm.internal.K) r9
                java.lang.Object r10 = r1.f118678e
                java.lang.String r10 = (java.lang.String) r10
                java.lang.Object r11 = r1.f118677d
                com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r11 = (com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel) r11
                java.lang.Object r12 = r1.f118676c
                java.lang.String r12 = (java.lang.String) r12
                java.lang.Object r14 = r1.f118695v
                QJ.Q r14 = (QJ.Q) r14
                XH.y.b(r42)
                r32 = r6
                r21 = r13
                r13 = r12
                r12 = r11
                r11 = r10
                r10 = r3
                r3 = r2
                r2 = r5
                r5 = r42
                goto L_0x0845
            L_0x0086:
                int r15 = r1.f118693t
                int r4 = r1.f118692s
                java.lang.Object r5 = r1.f118689p
                java.lang.Object r0 = r1.f118688o
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r1.f118687n
                r18 = r0
                java.lang.Iterable r18 = (java.lang.Iterable) r18
                java.lang.Object r0 = r1.f118686m
                r19 = r0
                java.lang.String r19 = (java.lang.String) r19
                java.lang.Object r0 = r1.f118685l
                r20 = r0
                java.lang.String r20 = (java.lang.String) r20
                java.lang.Object r0 = r1.f118684k
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f118683j
                r21 = r0
                QJ.Q r21 = (QJ.Q) r21
                java.lang.Object r0 = r1.f118682i
                aB.f r0 = (aB.f) r0
                java.lang.Object r0 = r1.f118681h
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r1.f118680g
                r22 = r0
                kotlin.jvm.internal.K r22 = (kotlin.jvm.internal.K) r22
                java.lang.Object r0 = r1.f118679f
                r23 = r0
                kotlin.jvm.internal.K r23 = (kotlin.jvm.internal.K) r23
                java.lang.Object r0 = r1.f118678e
                r24 = r0
                java.lang.String r24 = (java.lang.String) r24
                java.lang.Object r0 = r1.f118677d
                r25 = r0
                com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r25 = (com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel) r25
                java.lang.Object r0 = r1.f118676c
                r26 = r0
                java.lang.String r26 = (java.lang.String) r26
                java.lang.Object r0 = r1.f118695v
                r27 = r0
                QJ.Q r27 = (QJ.Q) r27
                XH.y.b(r42)     // Catch:{ CancellationException -> 0x010f, all -> 0x00f3 }
                r31 = r3
                r28 = r8
                r29 = r9
                r3 = r18
                r9 = r19
                r14 = r20
                r13 = r22
                r8 = r23
                r11 = 1
                r22 = r7
                r7 = r6
                r6 = r21
                goto L_0x052e
            L_0x00f3:
                r0 = move-exception
                r31 = r3
                r32 = r6
                r28 = r8
                r29 = r9
                r14 = r18
                r9 = r19
                r13 = r21
                r6 = r23
                r3 = r2
                r23 = r10
                r2 = r20
                r10 = r22
                r22 = r7
                goto L_0x07e9
            L_0x010f:
                r0 = move-exception
                goto L_0x09ba
            L_0x0112:
                int r15 = r1.f118693t
                int r4 = r1.f118692s
                java.lang.Object r5 = r1.f118689p
                java.lang.Object r0 = r1.f118688o
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r1.f118687n
                r18 = r0
                java.lang.Iterable r18 = (java.lang.Iterable) r18
                java.lang.Object r0 = r1.f118686m
                r19 = r0
                java.lang.String r19 = (java.lang.String) r19
                java.lang.Object r0 = r1.f118685l
                r20 = r0
                java.lang.String r20 = (java.lang.String) r20
                java.lang.Object r0 = r1.f118684k
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f118683j
                r21 = r0
                QJ.Q r21 = (QJ.Q) r21
                java.lang.Object r0 = r1.f118682i
                aB.f r0 = (aB.f) r0
                java.lang.Object r0 = r1.f118681h
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r1.f118680g
                r22 = r0
                kotlin.jvm.internal.K r22 = (kotlin.jvm.internal.K) r22
                java.lang.Object r0 = r1.f118679f
                r23 = r0
                kotlin.jvm.internal.K r23 = (kotlin.jvm.internal.K) r23
                java.lang.Object r0 = r1.f118678e
                r24 = r0
                java.lang.String r24 = (java.lang.String) r24
                java.lang.Object r0 = r1.f118677d
                r25 = r0
                com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r25 = (com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel) r25
                java.lang.Object r0 = r1.f118676c
                r26 = r0
                java.lang.String r26 = (java.lang.String) r26
                java.lang.Object r0 = r1.f118695v
                r27 = r0
                QJ.Q r27 = (QJ.Q) r27
                XH.y.b(r42)     // Catch:{ CancellationException -> 0x010f, all -> 0x00f3 }
                r31 = r3
                r32 = r6
                r28 = r8
                r29 = r9
                r3 = r18
                r9 = r19
                r14 = r20
                r6 = r21
                r13 = r22
                r22 = r7
                r7 = 1
                goto L_0x0457
            L_0x017e:
                int r15 = r1.f118693t
                int r4 = r1.f118692s
                java.lang.Object r5 = r1.f118689p
                java.lang.Object r0 = r1.f118688o
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r1.f118687n
                r18 = r0
                java.lang.Iterable r18 = (java.lang.Iterable) r18
                java.lang.Object r0 = r1.f118686m
                r19 = r0
                java.lang.String r19 = (java.lang.String) r19
                java.lang.Object r0 = r1.f118685l
                r20 = r0
                java.lang.String r20 = (java.lang.String) r20
                java.lang.Object r0 = r1.f118684k
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f118683j
                r21 = r0
                QJ.Q r21 = (QJ.Q) r21
                java.lang.Object r0 = r1.f118682i
                aB.f r0 = (aB.f) r0
                java.lang.Object r0 = r1.f118681h
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r1.f118680g
                r22 = r0
                kotlin.jvm.internal.K r22 = (kotlin.jvm.internal.K) r22
                java.lang.Object r0 = r1.f118679f
                r23 = r0
                kotlin.jvm.internal.K r23 = (kotlin.jvm.internal.K) r23
                java.lang.Object r0 = r1.f118678e
                r24 = r0
                java.lang.String r24 = (java.lang.String) r24
                java.lang.Object r0 = r1.f118677d
                r25 = r0
                com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r25 = (com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel) r25
                java.lang.Object r0 = r1.f118676c
                r26 = r0
                java.lang.String r26 = (java.lang.String) r26
                java.lang.Object r0 = r1.f118695v
                r27 = r0
                QJ.Q r27 = (QJ.Q) r27
                XH.y.b(r42)     // Catch:{ CancellationException -> 0x010f, all -> 0x00f3 }
                r31 = r3
                r32 = r6
                r28 = r8
                r29 = r9
                r3 = r18
                r9 = r19
                r14 = r20
                r6 = r21
                r13 = r22
                r22 = r7
                r7 = 1
                goto L_0x04dd
            L_0x01ea:
                int r15 = r1.f118693t
                int r4 = r1.f118692s
                java.lang.Object r5 = r1.f118689p
                java.lang.Object r0 = r1.f118688o
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r1.f118687n
                r18 = r0
                java.lang.Iterable r18 = (java.lang.Iterable) r18
                java.lang.Object r0 = r1.f118686m
                r19 = r0
                java.lang.String r19 = (java.lang.String) r19
                java.lang.Object r0 = r1.f118685l
                r20 = r0
                bB.f r20 = (bB.f) r20
                java.lang.Object r0 = r1.f118684k
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f118683j
                r21 = r0
                QJ.Q r21 = (QJ.Q) r21
                java.lang.Object r0 = r1.f118682i
                aB.f r0 = (aB.f) r0
                java.lang.Object r0 = r1.f118681h
                QJ.Q r0 = (QJ.Q) r0
                java.lang.Object r0 = r1.f118680g
                r22 = r0
                kotlin.jvm.internal.K r22 = (kotlin.jvm.internal.K) r22
                java.lang.Object r0 = r1.f118679f
                r23 = r0
                kotlin.jvm.internal.K r23 = (kotlin.jvm.internal.K) r23
                java.lang.Object r0 = r1.f118678e
                r24 = r0
                java.lang.String r24 = (java.lang.String) r24
                java.lang.Object r0 = r1.f118677d
                r25 = r0
                com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r25 = (com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel) r25
                java.lang.Object r0 = r1.f118676c
                r26 = r0
                java.lang.String r26 = (java.lang.String) r26
                java.lang.Object r0 = r1.f118695v
                r27 = r0
                QJ.Q r27 = (QJ.Q) r27
                XH.y.b(r42)     // Catch:{ CancellationException -> 0x010f, all -> 0x00f3 }
                r31 = r3
                r32 = r6
                r28 = r8
                r29 = r9
                r14 = r18
                r12 = r19
                r13 = r21
                r3 = r2
                r2 = r20
                r39 = r22
                r22 = r7
                r7 = r23
                r23 = r10
                r10 = r39
                goto L_0x0756
            L_0x025c:
                int r15 = r1.f118693t
                int r4 = r1.f118692s
                int r0 = r1.f118691r
                java.lang.Object r5 = r1.f118689p
                java.lang.Object r11 = r1.f118688o
                java.util.Iterator r11 = (java.util.Iterator) r11
                java.lang.Object r14 = r1.f118687n
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                java.lang.Object r12 = r1.f118686m
                java.lang.String r12 = (java.lang.String) r12
                java.lang.Object r13 = r1.f118685l
                java.lang.String r13 = (java.lang.String) r13
                r22 = r0
                java.lang.Object r0 = r1.f118684k
                java.lang.String r0 = (java.lang.String) r0
                r23 = r0
                java.lang.Object r0 = r1.f118683j
                r24 = r0
                QJ.Q r24 = (QJ.Q) r24
                java.lang.Object r0 = r1.f118682i
                aB.f r0 = (aB.f) r0
                r25 = r0
                java.lang.Object r0 = r1.f118681h
                QJ.Q r0 = (QJ.Q) r0
                r26 = r0
                java.lang.Object r0 = r1.f118680g
                r27 = r0
                kotlin.jvm.internal.K r27 = (kotlin.jvm.internal.K) r27
                java.lang.Object r0 = r1.f118679f
                r28 = r0
                kotlin.jvm.internal.K r28 = (kotlin.jvm.internal.K) r28
                java.lang.Object r0 = r1.f118678e
                r29 = r0
                java.lang.String r29 = (java.lang.String) r29
                java.lang.Object r0 = r1.f118677d
                r30 = r0
                com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r30 = (com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel) r30
                java.lang.Object r0 = r1.f118676c
                r31 = r0
                java.lang.String r31 = (java.lang.String) r31
                java.lang.Object r0 = r1.f118695v
                r32 = r0
                QJ.Q r32 = (QJ.Q) r32
                XH.y.b(r42)     // Catch:{ CancellationException -> 0x010f, all -> 0x02e8 }
                r0 = r25
                r25 = r2
                r2 = r42
                r42 = r13
                r13 = r24
                r24 = r15
                r15 = r30
                r39 = r31
                r31 = r3
                r3 = r29
                r29 = r9
                r9 = r5
                r5 = r26
                r26 = r4
                r4 = r23
                r23 = r10
                r10 = r27
                r27 = r22
                r22 = r7
                r7 = r28
                r28 = r8
                r8 = r39
                r40 = r32
                r32 = r6
                r6 = r40
                goto L_0x0707
            L_0x02e8:
                r0 = move-exception
                r22 = r7
                r23 = r10
                r10 = r27
                r25 = r30
                r26 = r31
                r27 = r32
                r31 = r3
                r32 = r6
                r6 = r28
                r3 = r2
                r28 = r8
                r2 = r13
                r13 = r24
                r24 = r29
                r29 = r9
                r9 = r12
                goto L_0x07e9
            L_0x0308:
                XH.y.b(r42)
                java.lang.Object r0 = r1.f118695v
                r5 = r0
                QJ.Q r5 = (QJ.Q) r5
                WA.g r0 = r1.f118696w
                com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r0 = r0.c()
                java.lang.String r4 = r0.b()
                WA.g r0 = r1.f118696w
                com.ingka.ikea.shoppinglist.datalayer.impl.network.model.SyncEventModel r11 = r0.c()
                java.lang.String r12 = r11.d()
                WA.g r0 = r1.f118696w
                qv.e r13 = qv.e.DEBUG
                qv.d r14 = qv.d.f102012a
                java.util.List r14 = r14.a()
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                java.util.ArrayList r15 = new java.util.ArrayList
                r15.<init>()
                java.util.Iterator r14 = r14.iterator()
            L_0x0339:
                boolean r22 = r14.hasNext()
                if (r22 == 0) goto L_0x035d
                r28 = r8
                java.lang.Object r8 = r14.next()
                r29 = r9
                r9 = r8
                qv.b r9 = (qv.C11819b) r9
                r42 = r14
                r14 = 0
                boolean r9 = r9.b(r13, r14)
                if (r9 == 0) goto L_0x0356
                r15.add(r8)
            L_0x0356:
                r14 = r42
                r8 = r28
                r9 = r29
                goto L_0x0339
            L_0x035d:
                r28 = r8
                r29 = r9
                java.util.Iterator r8 = r15.iterator()
                r22 = r15
                r9 = 0
                r14 = 0
            L_0x0369:
                boolean r23 = r8.hasNext()
                if (r23 == 0) goto L_0x03e6
                java.lang.Object r30 = r8.next()
                r22 = r30
                qv.b r22 = (qv.C11819b) r22
                r31 = r3
                if (r14 != 0) goto L_0x03a5
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r32 = r6
                java.lang.String r6 = "processEvent, bagId: "
                r3.append(r6)
                r3.append(r12)
                java.lang.String r6 = ", shoppingListEventEntity: "
                r3.append(r6)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                r6 = 0
                java.lang.String r3 = qv.C11818a.a(r3, r6)
                if (r3 != 0) goto L_0x03a0
                r3 = r30
                goto L_0x03ec
            L_0x03a0:
                java.lang.String r14 = qv.C11820c.a(r3)
                goto L_0x03a7
            L_0x03a5:
                r32 = r6
            L_0x03a7:
                if (r9 != 0) goto L_0x03d1
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                r6 = 1
                boolean r3 = HJ.C15854t.b0(r3, r10, r6)
                if (r3 == 0) goto L_0x03bb
                r3 = r29
                goto L_0x03bd
            L_0x03bb:
                r3 = r28
            L_0x03bd:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r3)
                r6.append(r7)
                java.lang.String r3 = "ShoppingLists"
                r6.append(r3)
                java.lang.String r9 = r6.toString()
            L_0x03d1:
                r25 = 0
                r23 = r13
                r24 = r9
                r3 = 0
                r26 = r3
                r27 = r14
                r22.a(r23, r24, r25, r26, r27)
                r22 = r30
                r3 = r31
                r6 = r32
                goto L_0x0369
            L_0x03e6:
                r31 = r3
                r32 = r6
                r3 = r22
            L_0x03ec:
                kotlin.jvm.internal.K r6 = new kotlin.jvm.internal.K
                r6.<init>()
                r42 = r13
                kotlin.jvm.internal.K r13 = new kotlin.jvm.internal.K
                r13.<init>()
                aB.f r0 = r1.f118697x
                XH.x$a r22 = XH.x.f139812b     // Catch:{ CancellationException -> 0x010f, all -> 0x07d1 }
                int r22 = r4.hashCode()     // Catch:{ CancellationException -> 0x010f, all -> 0x07cb }
                switch(r22) {
                    case 31735164: goto L_0x0550;
                    case 984346912: goto L_0x04e1;
                    case 1017463241: goto L_0x048d;
                    case 1113227790: goto L_0x0407;
                    default: goto L_0x0403;
                }
            L_0x0403:
                r22 = r7
                goto L_0x055a
            L_0x0407:
                r22 = r7
                java.lang.String r7 = "event_update"
                boolean r7 = r4.equals(r7)     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                if (r7 != 0) goto L_0x0413
                goto L_0x055a
            L_0x0413:
                aB.a r7 = r0.f118592f     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118695v = r5     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118676c = r4     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118677d = r11     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118678e = r12     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118679f = r6     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118680g = r13     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118681h = r5     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118682i = r0     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118683j = r5     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118684k = r4     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118685l = r14     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118686m = r9     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118687n = r15     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118688o = r8     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118689p = r3     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r8 = 0
                r1.f118691r = r8     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118692s = r8     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118693t = r8     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r0 = 4
                r1.f118694u = r0     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                java.lang.Object r0 = r7.g(r11, r1)     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                if (r0 != r2) goto L_0x0446
                return r2
            L_0x0446:
                r26 = r4
                r27 = r5
                r23 = r6
                r25 = r11
                r24 = r12
                r4 = 0
                r7 = 1
                r6 = r27
                r5 = r3
                r3 = r15
                r15 = 0
            L_0x0457:
                r13.f144344a = r7     // Catch:{ CancellationException -> 0x010f, all -> 0x0465 }
            L_0x0459:
                r7 = r23
            L_0x045b:
                r23 = r10
                r39 = r3
                r3 = r2
                r2 = r14
                r14 = r39
                goto L_0x0759
            L_0x0465:
                r0 = move-exception
                r39 = r3
                r3 = r2
                r2 = r14
                r14 = r39
                r40 = r13
                r13 = r6
                r6 = r23
                r23 = r10
                r10 = r40
                goto L_0x07e9
            L_0x0477:
                r0 = move-exception
                r26 = r4
                r27 = r5
            L_0x047c:
                r23 = r10
                r25 = r11
                r24 = r12
                r10 = r13
                r4 = 0
                r13 = r27
                r5 = r3
                r3 = r2
                r2 = r14
                r14 = r15
                r15 = 0
                goto L_0x07e9
            L_0x048d:
                r22 = r7
                java.lang.String r7 = "event_remove"
                boolean r7 = r4.equals(r7)     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                if (r7 != 0) goto L_0x0499
                goto L_0x055a
            L_0x0499:
                aB.a r7 = r0.f118592f     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118695v = r5     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118676c = r4     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118677d = r11     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118678e = r12     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118679f = r6     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118680g = r13     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118681h = r5     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118682i = r0     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118683j = r5     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118684k = r4     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118685l = r14     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118686m = r9     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118687n = r15     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118688o = r8     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118689p = r3     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r8 = 0
                r1.f118691r = r8     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118692s = r8     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r1.f118693t = r8     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                r0 = 3
                r1.f118694u = r0     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                java.lang.Object r0 = r7.f(r11, r1)     // Catch:{ CancellationException -> 0x010f, all -> 0x0477 }
                if (r0 != r2) goto L_0x04cc
                return r2
            L_0x04cc:
                r26 = r4
                r27 = r5
                r23 = r6
                r25 = r11
                r24 = r12
                r4 = 0
                r7 = 1
                r6 = r27
                r5 = r3
                r3 = r15
                r15 = 0
            L_0x04dd:
                r13.f144344a = r7     // Catch:{ CancellationException -> 0x010f, all -> 0x0465 }
                goto L_0x0459
            L_0x04e1:
                r22 = r7
                r7 = r32
                boolean r23 = r4.equals(r7)     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                if (r23 != 0) goto L_0x04ef
                r32 = r7
                goto L_0x055a
            L_0x04ef:
                r1.f118695v = r5     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                r1.f118676c = r4     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                r1.f118677d = r11     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                r1.f118678e = r12     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                r1.f118679f = r6     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                r1.f118680g = r13     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                r1.f118681h = r5     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                r1.f118682i = r0     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                r1.f118683j = r5     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                r1.f118684k = r4     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                r1.f118685l = r14     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                r1.f118686m = r9     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                r1.f118687n = r15     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                r1.f118688o = r8     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                r1.f118689p = r3     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                r8 = 0
                r1.f118691r = r8     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                r1.f118692s = r8     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                r1.f118693t = r8     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                r8 = 5
                r1.f118694u = r8     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                java.lang.Object r0 = r0.V(r12, r1)     // Catch:{ CancellationException -> 0x010f, all -> 0x0547 }
                if (r0 != r2) goto L_0x051e
                return r2
            L_0x051e:
                r26 = r4
                r27 = r5
                r8 = r6
                r25 = r11
                r24 = r12
                r4 = 0
                r11 = 1
                r6 = r27
                r5 = r3
                r3 = r15
                r15 = 0
            L_0x052e:
                r13.f144344a = r11     // Catch:{ CancellationException -> 0x010f, all -> 0x0537 }
                r8.f144344a = r11     // Catch:{ CancellationException -> 0x010f, all -> 0x0537 }
                r32 = r7
                r7 = r8
                goto L_0x045b
            L_0x0537:
                r0 = move-exception
                r32 = r7
                r23 = r10
                r10 = r13
                r13 = r6
                r6 = r8
                r39 = r3
                r3 = r2
                r2 = r14
                r14 = r39
                goto L_0x07e9
            L_0x0547:
                r0 = move-exception
                r26 = r4
                r27 = r5
                r32 = r7
                goto L_0x047c
            L_0x0550:
                r22 = r7
                java.lang.String r7 = "event_add"
                boolean r7 = r4.equals(r7)     // Catch:{ CancellationException -> 0x010f, all -> 0x07c4 }
                if (r7 != 0) goto L_0x06b2
            L_0x055a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ CancellationException -> 0x010f, all -> 0x069b }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x010f, all -> 0x069b }
                r0.<init>()     // Catch:{ CancellationException -> 0x010f, all -> 0x069b }
                java.lang.String r8 = "processOtherSLEvent, unknown event: "
                r0.append(r8)     // Catch:{ CancellationException -> 0x010f, all -> 0x069b }
                r0.append(r4)     // Catch:{ CancellationException -> 0x010f, all -> 0x069b }
                java.lang.String r0 = r0.toString()     // Catch:{ CancellationException -> 0x010f, all -> 0x069b }
                r7.<init>(r0)     // Catch:{ CancellationException -> 0x010f, all -> 0x069b }
                qv.e r0 = qv.e.ERROR     // Catch:{ CancellationException -> 0x010f, all -> 0x065e }
                qv.d r3 = qv.d.f102012a     // Catch:{ CancellationException -> 0x010f, all -> 0x065e }
                java.util.List r3 = r3.a()     // Catch:{ CancellationException -> 0x010f, all -> 0x065e }
                java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ CancellationException -> 0x010f, all -> 0x065e }
                java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x010f, all -> 0x065e }
                r8.<init>()     // Catch:{ CancellationException -> 0x010f, all -> 0x065e }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ CancellationException -> 0x010f, all -> 0x065e }
            L_0x0583:
                boolean r9 = r3.hasNext()     // Catch:{ CancellationException -> 0x010f, all -> 0x065e }
                if (r9 == 0) goto L_0x05b1
                java.lang.Object r9 = r3.next()     // Catch:{ CancellationException -> 0x010f, all -> 0x059b }
                r14 = r9
                qv.b r14 = (qv.C11819b) r14     // Catch:{ CancellationException -> 0x010f, all -> 0x059b }
                r15 = 0
                boolean r14 = r14.b(r0, r15)     // Catch:{ CancellationException -> 0x010f, all -> 0x059b }
                if (r14 == 0) goto L_0x0583
                r8.add(r9)     // Catch:{ CancellationException -> 0x010f, all -> 0x059b }
                goto L_0x0583
            L_0x059b:
                r0 = move-exception
                r3 = r2
                r26 = r4
                r2 = r5
                r27 = r2
                r9 = r7
                r23 = r10
                r25 = r11
                r24 = r12
                r10 = r13
                r4 = 0
                r14 = 0
                r15 = 0
            L_0x05ad:
                r13 = r27
                goto L_0x07e9
            L_0x05b1:
                java.util.Iterator r3 = r8.iterator()     // Catch:{ CancellationException -> 0x010f, all -> 0x065e }
                r8 = 0
                r9 = 0
            L_0x05b7:
                boolean r14 = r3.hasNext()     // Catch:{ CancellationException -> 0x010f, all -> 0x065e }
                if (r14 == 0) goto L_0x05ce
                java.lang.Object r14 = r3.next()     // Catch:{ CancellationException -> 0x010f, all -> 0x065e }
                r33 = r14
                qv.b r33 = (qv.C11819b) r33     // Catch:{ CancellationException -> 0x010f, all -> 0x065e }
                if (r8 != 0) goto L_0x05da
                r14 = 0
                java.lang.String r8 = qv.C11818a.a(r14, r7)     // Catch:{ CancellationException -> 0x010f, all -> 0x059b }
                if (r8 != 0) goto L_0x05d6
            L_0x05ce:
                r23 = r2
                r2 = r22
                r14 = r31
                goto L_0x0681
            L_0x05d6:
                java.lang.String r8 = qv.C11820c.a(r8)     // Catch:{ CancellationException -> 0x010f, all -> 0x059b }
            L_0x05da:
                if (r9 != 0) goto L_0x0662
                java.lang.Class r9 = r5.getClass()     // Catch:{ CancellationException -> 0x010f, all -> 0x065e }
                java.lang.String r9 = r9.getName()     // Catch:{ CancellationException -> 0x010f, all -> 0x065e }
                kotlin.jvm.internal.C17542s.g(r9)     // Catch:{ CancellationException -> 0x010f, all -> 0x065e }
                r23 = r2
                r42 = r3
                r3 = 0
                r14 = 36
                r15 = 2
                java.lang.String r2 = HJ.C15854t.s1(r9, r14, r3, r15, r3)     // Catch:{ CancellationException -> 0x010f, all -> 0x064e }
                r14 = 46
                java.lang.String r2 = HJ.C15854t.o1(r2, r14, r3, r15, r3)     // Catch:{ CancellationException -> 0x010f, all -> 0x064e }
                int r3 = r2.length()     // Catch:{ CancellationException -> 0x010f, all -> 0x064e }
                if (r3 != 0) goto L_0x0602
                r14 = r31
                goto L_0x0608
            L_0x0602:
                r14 = r31
                java.lang.String r9 = HJ.C15854t.P0(r2, r14)     // Catch:{ CancellationException -> 0x010f, all -> 0x064a }
            L_0x0608:
                java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ CancellationException -> 0x010f, all -> 0x064a }
                java.lang.String r2 = r2.getName()     // Catch:{ CancellationException -> 0x010f, all -> 0x064a }
                r3 = 1
                boolean r2 = HJ.C15854t.b0(r2, r10, r3)     // Catch:{ CancellationException -> 0x010f, all -> 0x064a }
                if (r2 == 0) goto L_0x061a
                r2 = r29
                goto L_0x061c
            L_0x061a:
                r2 = r28
            L_0x061c:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x010f, all -> 0x064a }
                r3.<init>()     // Catch:{ CancellationException -> 0x010f, all -> 0x064a }
                r3.append(r2)     // Catch:{ CancellationException -> 0x010f, all -> 0x064a }
                r2 = r22
                r3.append(r2)     // Catch:{ CancellationException -> 0x010f, all -> 0x0631 }
                r3.append(r9)     // Catch:{ CancellationException -> 0x010f, all -> 0x0631 }
                java.lang.String r9 = r3.toString()     // Catch:{ CancellationException -> 0x010f, all -> 0x0631 }
                goto L_0x066a
            L_0x0631:
                r0 = move-exception
                r22 = r2
            L_0x0634:
                r26 = r4
                r2 = r5
                r27 = r2
                r9 = r7
                r25 = r11
                r24 = r12
                r31 = r14
            L_0x0640:
                r3 = r23
                r4 = 0
                r14 = 0
                r15 = 0
            L_0x0645:
                r23 = r10
                r10 = r13
                goto L_0x05ad
            L_0x064a:
                r0 = move-exception
                r2 = r22
                goto L_0x0634
            L_0x064e:
                r0 = move-exception
            L_0x064f:
                r2 = r22
                r14 = r31
                r26 = r4
                r2 = r5
                r27 = r2
                r9 = r7
                r25 = r11
                r24 = r12
                goto L_0x0640
            L_0x065e:
                r0 = move-exception
                r23 = r2
                goto L_0x064f
            L_0x0662:
                r23 = r2
                r42 = r3
                r2 = r22
                r14 = r31
            L_0x066a:
                r36 = 0
                r34 = r0
                r35 = r9
                r37 = r7
                r38 = r8
                r33.a(r34, r35, r36, r37, r38)     // Catch:{ CancellationException -> 0x010f, all -> 0x0631 }
                r3 = r42
                r22 = r2
                r31 = r14
                r2 = r23
                goto L_0x05b7
            L_0x0681:
                r22 = r2
                r26 = r4
                r2 = r5
                r27 = r2
                r9 = r7
                r25 = r11
                r24 = r12
                r31 = r14
                r3 = r23
                r4 = 0
                r14 = 0
                r15 = 0
                r7 = r6
                r23 = r10
                r6 = r27
                goto L_0x0759
            L_0x069b:
                r0 = move-exception
                r23 = r2
                r2 = r22
                r14 = r31
                r26 = r4
                r2 = r5
                r27 = r2
                r25 = r11
                r24 = r12
                r14 = r15
                r4 = 0
                r15 = 0
                r5 = r3
                r3 = r23
                goto L_0x0645
            L_0x06b2:
                r23 = r2
                r7 = r31
                aB.a r2 = r0.f118592f     // Catch:{ CancellationException -> 0x010f, all -> 0x07c0 }
                r1.f118695v = r5     // Catch:{ CancellationException -> 0x010f, all -> 0x07c0 }
                r1.f118676c = r4     // Catch:{ CancellationException -> 0x010f, all -> 0x07c0 }
                r1.f118677d = r11     // Catch:{ CancellationException -> 0x010f, all -> 0x07c0 }
                r1.f118678e = r12     // Catch:{ CancellationException -> 0x010f, all -> 0x07c0 }
                r1.f118679f = r6     // Catch:{ CancellationException -> 0x010f, all -> 0x07c0 }
                r1.f118680g = r13     // Catch:{ CancellationException -> 0x010f, all -> 0x07c0 }
                r1.f118681h = r5     // Catch:{ CancellationException -> 0x010f, all -> 0x07c0 }
                r1.f118682i = r0     // Catch:{ CancellationException -> 0x010f, all -> 0x07c0 }
                r1.f118683j = r5     // Catch:{ CancellationException -> 0x010f, all -> 0x07c0 }
                r1.f118684k = r4     // Catch:{ CancellationException -> 0x010f, all -> 0x07c0 }
                r1.f118685l = r14     // Catch:{ CancellationException -> 0x010f, all -> 0x07c0 }
                r1.f118686m = r9     // Catch:{ CancellationException -> 0x010f, all -> 0x07c0 }
                r1.f118687n = r15     // Catch:{ CancellationException -> 0x010f, all -> 0x07c0 }
                r1.f118688o = r8     // Catch:{ CancellationException -> 0x010f, all -> 0x07c0 }
                r1.f118689p = r3     // Catch:{ CancellationException -> 0x010f, all -> 0x07c0 }
                r24 = r3
                r3 = 0
                r1.f118691r = r3     // Catch:{ CancellationException -> 0x010f, all -> 0x07a7 }
                r1.f118692s = r3     // Catch:{ CancellationException -> 0x010f, all -> 0x07a7 }
                r1.f118693t = r3     // Catch:{ CancellationException -> 0x010f, all -> 0x07a7 }
                r3 = 1
                r1.f118694u = r3     // Catch:{ CancellationException -> 0x010f, all -> 0x07a7 }
                java.lang.Object r2 = r2.e(r11, r1)     // Catch:{ CancellationException -> 0x010f, all -> 0x07a7 }
                r3 = r23
                if (r2 != r3) goto L_0x06ed
                return r3
            L_0x06ed:
                r25 = r3
                r31 = r7
                r23 = r10
                r3 = r12
                r10 = r13
                r42 = r14
                r14 = r15
                r26 = 0
                r27 = 0
                r13 = r5
                r7 = r6
                r12 = r9
                r15 = r11
                r9 = r24
                r24 = 0
                r6 = r13
                r11 = r8
                r8 = r4
            L_0x0707:
                bB.f r2 = (bB.f) r2     // Catch:{ CancellationException -> 0x010f, all -> 0x079a }
                r30 = r9
                r9 = 1
                r10.f144344a = r9     // Catch:{ CancellationException -> 0x010f, all -> 0x0792 }
                r0.T(r2)     // Catch:{ CancellationException -> 0x010f, all -> 0x0792 }
                TJ.A r9 = r0.f118596j     // Catch:{ CancellationException -> 0x010f, all -> 0x0792 }
                r1.f118695v = r6     // Catch:{ CancellationException -> 0x010f, all -> 0x0792 }
                r1.f118676c = r8     // Catch:{ CancellationException -> 0x010f, all -> 0x0792 }
                r1.f118677d = r15     // Catch:{ CancellationException -> 0x010f, all -> 0x0792 }
                r1.f118678e = r3     // Catch:{ CancellationException -> 0x010f, all -> 0x0792 }
                r1.f118679f = r7     // Catch:{ CancellationException -> 0x010f, all -> 0x0792 }
                r1.f118680g = r10     // Catch:{ CancellationException -> 0x010f, all -> 0x0792 }
                r1.f118681h = r5     // Catch:{ CancellationException -> 0x010f, all -> 0x0792 }
                r1.f118682i = r0     // Catch:{ CancellationException -> 0x010f, all -> 0x0792 }
                r1.f118683j = r13     // Catch:{ CancellationException -> 0x010f, all -> 0x0792 }
                r1.f118684k = r4     // Catch:{ CancellationException -> 0x010f, all -> 0x0792 }
                r1.f118685l = r2     // Catch:{ CancellationException -> 0x010f, all -> 0x0792 }
                r1.f118686m = r12     // Catch:{ CancellationException -> 0x010f, all -> 0x0792 }
                r1.f118687n = r14     // Catch:{ CancellationException -> 0x010f, all -> 0x0792 }
                r1.f118688o = r11     // Catch:{ CancellationException -> 0x010f, all -> 0x0792 }
                r5 = r30
                r1.f118689p = r5     // Catch:{ CancellationException -> 0x010f, all -> 0x078c }
                r0 = r27
                r1.f118691r = r0     // Catch:{ CancellationException -> 0x010f, all -> 0x078c }
                r4 = r26
                r1.f118692s = r4     // Catch:{ CancellationException -> 0x010f, all -> 0x0788 }
                r11 = r24
                r1.f118693t = r11     // Catch:{ CancellationException -> 0x010f, all -> 0x0784 }
                r24 = r3
                r3 = 2
                r1.f118694u = r3     // Catch:{ CancellationException -> 0x010f, all -> 0x0776 }
                java.lang.Object r0 = r9.emit(r2, r1)     // Catch:{ CancellationException -> 0x010f, all -> 0x0776 }
                r3 = r25
                if (r0 != r3) goto L_0x074f
                return r3
            L_0x074f:
                r27 = r6
                r26 = r8
                r25 = r15
                r15 = r11
            L_0x0756:
                r9 = r12
                r6 = r13
                r13 = r10
            L_0x0759:
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x010f, all -> 0x0770 }
                java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x010f, all -> 0x0770 }
                r42 = r2
                r8 = r9
                r10 = r13
                r11 = r24
                r12 = r25
                r13 = r26
                r9 = r7
                r7 = r0
                r0 = r14
                r14 = r27
                goto L_0x0802
            L_0x0770:
                r0 = move-exception
                r10 = r13
                r13 = r6
                r6 = r7
                goto L_0x07e9
            L_0x0776:
                r0 = move-exception
            L_0x0777:
                r3 = r25
            L_0x0779:
                r27 = r6
                r6 = r7
                r26 = r8
                r9 = r12
                r25 = r15
                r15 = r11
                goto L_0x07e9
            L_0x0784:
                r0 = move-exception
            L_0x0785:
                r24 = r3
                goto L_0x0777
            L_0x0788:
                r0 = move-exception
                r11 = r24
                goto L_0x0785
            L_0x078c:
                r0 = move-exception
                r11 = r24
                r4 = r26
                goto L_0x0785
            L_0x0792:
                r0 = move-exception
                r11 = r24
                r4 = r26
                r5 = r30
                goto L_0x0785
            L_0x079a:
                r0 = move-exception
                r5 = r9
                r11 = r24
                r4 = r26
                r24 = r3
                r3 = r25
                r2 = r42
                goto L_0x0779
            L_0x07a7:
                r0 = move-exception
            L_0x07a8:
                r31 = r7
                r3 = r23
                r23 = r10
            L_0x07ae:
                r26 = r4
                r27 = r5
                r25 = r11
                r10 = r13
                r2 = r14
                r14 = r15
                r4 = 0
                r15 = 0
                r13 = r27
                r5 = r24
            L_0x07bd:
                r24 = r12
                goto L_0x07e9
            L_0x07c0:
                r0 = move-exception
                r24 = r3
                goto L_0x07a8
            L_0x07c4:
                r0 = move-exception
                r24 = r3
            L_0x07c7:
                r23 = r10
                r3 = r2
                goto L_0x07ae
            L_0x07cb:
                r0 = move-exception
                r24 = r3
                r22 = r7
                goto L_0x07c7
            L_0x07d1:
                r0 = move-exception
                r24 = r3
                r22 = r7
                r23 = r10
                r3 = r2
                r26 = r4
                r27 = r5
                r25 = r11
                r10 = r13
                r2 = r14
                r14 = r15
                r5 = r24
                r4 = 0
                r15 = 0
                r13 = r42
                goto L_0x07bd
            L_0x07e9:
                XH.x$a r7 = XH.x.f139812b
                java.lang.Object r0 = XH.y.a(r0)
                java.lang.Object r0 = XH.x.b(r0)
                r7 = r0
                r42 = r2
                r8 = r9
                r0 = r14
                r11 = r24
                r12 = r25
                r14 = r27
                r9 = r6
                r6 = r13
                r13 = r26
            L_0x0802:
                aB.f r2 = r1.f118697x
                r24 = r4
                java.lang.Throwable r4 = XH.x.e(r7)
                if (r4 == 0) goto L_0x0964
                boolean r6 = r4 instanceof aB.C13914d
                if (r6 == 0) goto L_0x0853
                r6 = r4
                aB.d r6 = (aB.C13914d) r6
                r1.f118695v = r14
                r1.f118676c = r13
                r1.f118677d = r12
                r1.f118678e = r11
                r1.f118679f = r9
                r1.f118680g = r10
                r1.f118681h = r7
                r1.f118682i = r2
                r1.f118683j = r4
                r1.f118684k = r4
                r1.f118685l = r4
                r1.f118686m = r10
                r1.f118687n = r8
                r1.f118688o = r0
                r1.f118689p = r5
                r1.f118690q = r7
                r5 = 0
                r1.f118691r = r5
                r1.f118692s = r15
                r5 = 6
                r1.f118694u = r5
                java.lang.Object r5 = r2.P(r6, r1)
                if (r5 != r3) goto L_0x0842
                return r3
            L_0x0842:
                r8 = r10
                r21 = 0
            L_0x0845:
                r6 = r5
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                r10.f144344a = r6
                r6 = r4
                r4 = r8
                r8 = r5
                goto L_0x095b
            L_0x0853:
                qv.e r0 = qv.e.ERROR
                qv.d r5 = qv.d.f102012a
                java.util.List r5 = r5.a()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x0866:
                boolean r15 = r5.hasNext()
                if (r15 == 0) goto L_0x0886
                java.lang.Object r15 = r5.next()
                r25 = r2
                r2 = r15
                qv.b r2 = (qv.C11819b) r2
                r24 = r5
                r5 = 0
                boolean r2 = r2.b(r0, r5)
                if (r2 == 0) goto L_0x0881
                r6.add(r15)
            L_0x0881:
                r5 = r24
                r2 = r25
                goto L_0x0866
            L_0x0886:
                r25 = r2
                r5 = 0
                java.util.Iterator r2 = r6.iterator()
                r6 = 0
                r15 = 0
            L_0x088f:
                boolean r21 = r2.hasNext()
                if (r21 == 0) goto L_0x08bb
                java.lang.Object r21 = r2.next()
                r33 = r21
                qv.b r33 = (qv.C11819b) r33
                if (r6 != 0) goto L_0x08c6
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r5 = "exception when processing event: "
                r6.append(r5)
                r6.append(r13)
                java.lang.String r5 = ")"
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                java.lang.String r5 = qv.C11818a.a(r5, r4)
                if (r5 != 0) goto L_0x08c1
            L_0x08bb:
                r18 = r7
                r19 = r8
                goto L_0x094e
            L_0x08c1:
                java.lang.String r5 = qv.C11820c.a(r5)
                r6 = r5
            L_0x08c6:
                if (r15 != 0) goto L_0x0925
                java.lang.Class r5 = r14.getClass()
                java.lang.String r5 = r5.getName()
                kotlin.jvm.internal.C17542s.g(r5)
                r17 = r2
                r18 = r7
                r19 = r8
                r2 = 2
                r7 = 0
                r15 = 36
                java.lang.String r8 = HJ.C15854t.s1(r5, r15, r7, r2, r7)
                r15 = 46
                java.lang.String r8 = HJ.C15854t.o1(r8, r15, r7, r2, r7)
                int r16 = r8.length()
                if (r16 != 0) goto L_0x08f1
                r8 = r5
                r5 = r31
                goto L_0x08f7
            L_0x08f1:
                r5 = r31
                java.lang.String r8 = HJ.C15854t.P0(r8, r5)
            L_0x08f7:
                java.lang.Thread r16 = java.lang.Thread.currentThread()
                java.lang.String r2 = r16.getName()
                r7 = r23
                r15 = 1
                boolean r2 = HJ.C15854t.b0(r2, r7, r15)
                if (r2 == 0) goto L_0x090b
                r2 = r29
                goto L_0x090d
            L_0x090b:
                r2 = r28
            L_0x090d:
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                r15.append(r2)
                r2 = r22
                r15.append(r2)
                r15.append(r8)
                java.lang.String r8 = r15.toString()
                r15 = r8
            L_0x0922:
                r8 = 36
                goto L_0x0932
            L_0x0925:
                r17 = r2
                r18 = r7
                r19 = r8
                r2 = r22
                r7 = r23
                r5 = r31
                goto L_0x0922
            L_0x0932:
                r36 = 0
                r34 = r0
                r35 = r15
                r37 = r4
                r38 = r6
                r33.a(r34, r35, r36, r37, r38)
                r22 = r2
                r31 = r5
                r23 = r7
                r2 = r17
                r7 = r18
                r8 = r19
                r5 = 0
                goto L_0x088f
            L_0x094e:
                r6 = r4
                r4 = r10
                r0 = r14
                r7 = r18
                r8 = r19
                r2 = r25
                r21 = 0
                r10 = r42
            L_0x095b:
                r5 = r21
                r39 = r2
                r2 = r0
                r0 = r4
                r4 = r39
                goto L_0x0972
            L_0x0964:
                r25 = r2
                r18 = r7
                r19 = r8
                r2 = r0
                r0 = r10
                r5 = r24
                r4 = r25
                r10 = r42
            L_0x0972:
                boolean r15 = r0.f144344a
                if (r15 == 0) goto L_0x09b3
                aB.f r15 = r1.f118697x
                r23 = r3
                WA.g r3 = r1.f118696w
                r1.f118695v = r14
                r1.f118676c = r13
                r1.f118677d = r12
                r1.f118678e = r11
                r1.f118679f = r9
                r1.f118680g = r0
                r1.f118681h = r7
                r1.f118682i = r4
                r1.f118683j = r6
                r1.f118684k = r10
                r1.f118685l = r8
                r1.f118686m = r2
                r1.f118691r = r5
                r2 = 7
                r1.f118694u = r2
                java.lang.Object r2 = r15.O(r3, r1)
                r3 = r23
                if (r2 != r3) goto L_0x09a2
                return r3
            L_0x09a2:
                r2 = r9
                r3 = r13
                r4 = r32
            L_0x09a6:
                boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r4)
                if (r3 == 0) goto L_0x09b3
                aB.f r3 = r1.f118697x
                boolean r2 = r2.f144344a
                r3.R(r2)
            L_0x09b3:
                boolean r0 = r0.f144344a
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)
                return r0
            L_0x09ba:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: aB.f.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LbB/f;", "prev", "new", "<anonymous>", "(LbB/f;LbB/f;)LbB/f;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListSyncServiceImpl$shoppingListFetchedFlow$1", f = "ShoppingListSyncServiceImpl.kt", l = {}, m = "invokeSuspend")
    static final class n extends kotlin.coroutines.jvm.internal.l implements nI.q<bB.f, bB.f, C17164e<? super bB.f>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f118698c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f118699d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f118700e;

        n(C17164e<? super n> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(bB.f fVar, bB.f fVar2, C17164e<? super bB.f> eVar) {
            n nVar = new n(eVar);
            nVar.f118699d = fVar;
            nVar.f118700e = fVar2;
            return nVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            C17187b.f();
            if (this.f118698c == 0) {
                y.b(obj);
                bB.f fVar = (bB.f) this.f118699d;
                bB.f fVar2 = (bB.f) this.f118700e;
                if (fVar == null || !C17542s.e(fVar2.a(), fVar.a()) || !fVar2.d().isBefore(fVar.d())) {
                    return fVar2;
                }
                qv.e eVar = qv.e.INFO;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str2 = null;
                String str3 = null;
                for (C11819b bVar : arrayList) {
                    if (str2 == null) {
                        String a10 = C11818a.a("unordered update of the same list, using previously emitted one", (Throwable) null);
                        if (a10 == null) {
                            return fVar;
                        }
                        str2 = C11820c.a(a10);
                    }
                    String str4 = str2;
                    if (str3 == null) {
                        str = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "ShoppingLists";
                    } else {
                        str = str3;
                    }
                    bVar.a(eVar, str, false, (Throwable) null, str4);
                    str2 = str4;
                    str3 = str;
                }
                return fVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class o implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f118701a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f118702a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListSyncServiceImpl$syncShoppingList$$inlined$filter$1$2", f = "ShoppingListSyncServiceImpl.kt", l = {50}, m = "emit")
            /* renamed from: aB.f$o$a$a  reason: collision with other inner class name */
            public static final class C2957a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f118703c;

                /* renamed from: d  reason: collision with root package name */
                int f118704d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f118705e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2957a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f118705e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f118703c = obj;
                    this.f118704d |= Integer.MIN_VALUE;
                    return this.f118705e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f118702a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof aB.f.o.a.C2957a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    aB.f$o$a$a r0 = (aB.f.o.a.C2957a) r0
                    int r1 = r0.f118704d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f118704d = r1
                    goto L_0x0018
                L_0x0013:
                    aB.f$o$a$a r0 = new aB.f$o$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f118703c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f118704d
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
                    TJ.h r6 = r4.f118702a
                    r2 = r5
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto L_0x0048
                    r0.f118704d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0048
                    return r1
                L_0x0048:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: aB.f.o.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public o(C16532g gVar) {
            this.f118701a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f118701a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListSyncServiceImpl$syncShoppingList$2", f = "ShoppingListSyncServiceImpl.kt", l = {148}, m = "invokeSuspend")
    static final class p extends kotlin.coroutines.jvm.internal.l implements nI.p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f118706c;

        /* renamed from: d  reason: collision with root package name */
        Object f118707d;

        /* renamed from: e  reason: collision with root package name */
        Object f118708e;

        /* renamed from: f  reason: collision with root package name */
        Object f118709f;

        /* renamed from: g  reason: collision with root package name */
        Object f118710g;

        /* renamed from: h  reason: collision with root package name */
        Object f118711h;

        /* renamed from: i  reason: collision with root package name */
        Object f118712i;

        /* renamed from: j  reason: collision with root package name */
        Object f118713j;

        /* renamed from: k  reason: collision with root package name */
        Object f118714k;

        /* renamed from: l  reason: collision with root package name */
        int f118715l;

        /* renamed from: m  reason: collision with root package name */
        int f118716m;

        /* renamed from: n  reason: collision with root package name */
        int f118717n;

        /* renamed from: o  reason: collision with root package name */
        int f118718o;

        /* renamed from: p  reason: collision with root package name */
        int f118719p;

        /* renamed from: q  reason: collision with root package name */
        int f118720q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ f f118721r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ String f118722s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(f fVar, String str, C17164e<? super p> eVar) {
            super(2, eVar);
            this.f118721r = fVar;
            this.f118722s = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new p(this.f118721r, this.f118722s, eVar);
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((p) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: qv.b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: java.util.ArrayList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r1 = r22
                java.lang.Object r0 = eI.C17187b.f()
                int r2 = r1.f118720q
                java.lang.String r3 = "|"
                java.lang.String r4 = "b"
                java.lang.String r5 = "m"
                java.lang.String r6 = "main"
                java.lang.String r7 = "ShoppingLists"
                r9 = 1
                r10 = 0
                if (r2 == 0) goto L_0x004b
                if (r2 != r9) goto L_0x0043
                java.lang.Object r0 = r1.f118713j
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r1.f118712i
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r1.f118711h
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f118710g
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f118709f
                qv.e r0 = (qv.e) r0
                java.lang.Object r0 = r1.f118708e
                aB.f r0 = (aB.f) r0
                java.lang.Object r0 = r1.f118707d
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r1.f118706c
                aB.f r0 = (aB.f) r0
                XH.y.b(r23)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                goto L_0x013a
            L_0x003d:
                r0 = move-exception
                goto L_0x0141
            L_0x0040:
                r0 = move-exception
                goto L_0x01eb
            L_0x0043:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x004b:
                XH.y.b(r23)
                java.lang.String r2 = r1.f118722s
                qv.e r15 = qv.e.DEBUG
                qv.d r11 = qv.d.f102012a
                java.util.List r11 = r11.a()
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                java.util.Iterator r11 = r11.iterator()
            L_0x0063:
                boolean r12 = r11.hasNext()
                if (r12 == 0) goto L_0x007a
                java.lang.Object r12 = r11.next()
                r13 = r12
                qv.b r13 = (qv.C11819b) r13
                boolean r13 = r13.b(r15, r10)
                if (r13 == 0) goto L_0x0063
                r14.add(r12)
                goto L_0x0063
            L_0x007a:
                java.util.Iterator r13 = r14.iterator()
                r16 = r14
                r11 = 0
                r12 = 0
            L_0x0082:
                boolean r17 = r13.hasNext()
                if (r17 == 0) goto L_0x0102
                java.lang.Object r17 = r13.next()
                r16 = r17
                qv.b r16 = (qv.C11819b) r16
                r8 = 0
                if (r11 != 0) goto L_0x00b7
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r9 = "sync sl, listId: "
                r10.append(r9)
                r10.append(r2)
                java.lang.String r9 = r10.toString()
                java.lang.String r9 = qv.C11818a.a(r9, r8)
                if (r9 != 0) goto L_0x00b3
                r20 = r13
                r2 = r14
                r21 = r15
                r8 = r17
                goto L_0x0109
            L_0x00b3:
                java.lang.String r11 = qv.C11820c.a(r9)
            L_0x00b7:
                r9 = r11
                if (r12 != 0) goto L_0x00de
                java.lang.Thread r10 = java.lang.Thread.currentThread()
                java.lang.String r10 = r10.getName()
                r11 = 1
                boolean r10 = HJ.C15854t.b0(r10, r6, r11)
                if (r10 == 0) goto L_0x00cb
                r10 = r5
                goto L_0x00cc
            L_0x00cb:
                r10 = r4
            L_0x00cc:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r10)
                r11.append(r3)
                r11.append(r7)
                java.lang.String r12 = r11.toString()
            L_0x00de:
                r10 = r12
                r19 = 0
                r11 = r16
                r12 = r15
                r20 = r13
                r13 = r10
                r23 = r2
                r2 = r14
                r14 = r19
                r21 = r15
                r15 = r8
                r16 = r9
                r11.a(r12, r13, r14, r15, r16)
                r14 = r2
                r11 = r9
                r12 = r10
                r16 = r17
                r13 = r20
                r15 = r21
                r9 = 1
                r10 = 0
                r2 = r23
                goto L_0x0082
            L_0x0102:
                r20 = r13
                r2 = r14
                r21 = r15
                r8 = r16
            L_0x0109:
                aB.f r9 = r1.f118721r
                java.lang.String r10 = r1.f118722s
                XH.x$a r13 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                r1.f118706c = r9     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                r1.f118707d = r10     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                r1.f118708e = r9     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                r13 = r21
                r1.f118709f = r13     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                r1.f118710g = r11     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                r1.f118711h = r12     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                r1.f118712i = r2     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                r2 = r20
                r1.f118713j = r2     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                r1.f118714k = r8     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                r2 = 0
                r1.f118715l = r2     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                r1.f118716m = r2     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                r1.f118717n = r2     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                r1.f118718o = r2     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                r1.f118719p = r2     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                r2 = 1
                r1.f118720q = r2     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                java.lang.Object r2 = r9.V(r10, r1)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                if (r2 != r0) goto L_0x013a
                return r0
            L_0x013a:
                XH.N r0 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0040, all -> 0x003d }
                goto L_0x014b
            L_0x0141:
                XH.x$a r2 = XH.x.f139812b
                java.lang.Object r0 = XH.y.a(r0)
                java.lang.Object r0 = XH.x.b(r0)
            L_0x014b:
                java.lang.String r2 = r1.f118722s
                java.lang.Throwable r0 = XH.x.e(r0)
                if (r0 == 0) goto L_0x01e8
                qv.e r0 = qv.e.DEBUG
                qv.d r8 = qv.d.f102012a
                java.util.List r8 = r8.a()
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.Iterator r8 = r8.iterator()
            L_0x0166:
                boolean r10 = r8.hasNext()
                if (r10 == 0) goto L_0x017e
                java.lang.Object r10 = r8.next()
                r11 = r10
                qv.b r11 = (qv.C11819b) r11
                r12 = 0
                boolean r11 = r11.b(r0, r12)
                if (r11 == 0) goto L_0x0166
                r9.add(r10)
                goto L_0x0166
            L_0x017e:
                java.util.Iterator r14 = r9.iterator()
                r8 = 0
                r18 = 0
            L_0x0185:
                boolean r9 = r14.hasNext()
                if (r9 == 0) goto L_0x01e8
                java.lang.Object r9 = r14.next()
                qv.b r9 = (qv.C11819b) r9
                r12 = 0
                if (r8 != 0) goto L_0x01b0
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r10 = "failed to sync sl, listId: "
                r8.append(r10)
                r8.append(r2)
                java.lang.String r8 = r8.toString()
                java.lang.String r8 = qv.C11818a.a(r8, r12)
                if (r8 != 0) goto L_0x01ac
                goto L_0x01e8
            L_0x01ac:
                java.lang.String r8 = qv.C11820c.a(r8)
            L_0x01b0:
                r15 = r8
                if (r18 != 0) goto L_0x01da
                java.lang.Thread r8 = java.lang.Thread.currentThread()
                java.lang.String r8 = r8.getName()
                r13 = 1
                boolean r8 = HJ.C15854t.b0(r8, r6, r13)
                if (r8 == 0) goto L_0x01c4
                r8 = r5
                goto L_0x01c5
            L_0x01c4:
                r8 = r4
            L_0x01c5:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r8)
                r10.append(r3)
                r10.append(r7)
                java.lang.String r8 = r10.toString()
                r18 = r8
                goto L_0x01db
            L_0x01da:
                r13 = 1
            L_0x01db:
                r11 = 0
                r8 = r9
                r9 = r0
                r10 = r18
                r16 = r13
                r13 = r15
                r8.a(r9, r10, r11, r12, r13)
                r8 = r15
                goto L_0x0185
            L_0x01e8:
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x01eb:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: aB.f.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppinglist.datalayer.impl.network.ShoppingListSyncServiceImpl", f = "ShoppingListSyncServiceImpl.kt", l = {259, 261}, m = "syncShoppingListInternal")
    static final class q extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f118723c;

        /* renamed from: d  reason: collision with root package name */
        Object f118724d;

        /* renamed from: e  reason: collision with root package name */
        Object f118725e;

        /* renamed from: f  reason: collision with root package name */
        Object f118726f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f118727g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f118728h;

        /* renamed from: i  reason: collision with root package name */
        int f118729i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(f fVar, C17164e<? super q> eVar) {
            super(eVar);
            this.f118728h = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f118727g = obj;
            this.f118729i |= Integer.MIN_VALUE;
            return this.f118728h.V((String) null, this);
        }
    }

    public f(C13909a aVar, C13750l lVar, Q q10, M m10, M m11, C13911a aVar2, C11116a aVar3, C13737a aVar4, C13741e eVar) {
        C17542s.j(aVar, "sessionManager");
        C17542s.j(lVar, "shoppingListSyncDao");
        C17542s.j(q10, "appScope");
        C17542s.j(m10, "ioDispatcher");
        C17542s.j(m11, "mainDispatcher");
        C17542s.j(aVar2, "shoppingListEndpoint");
        C17542s.j(aVar3, "networkAvailabilityObserver");
        C17542s.j(aVar4, "shoppingListDao");
        C17542s.j(eVar, "shoppingListItemDao");
        this.f118587a = aVar;
        this.f118588b = lVar;
        this.f118589c = q10;
        this.f118590d = m10;
        this.f118591e = m11;
        this.f118592f = aVar2;
        this.f118593g = aVar3;
        this.f118594h = aVar4;
        this.f118595i = eVar;
        String str = null;
        C16504A<bB.f> b10 = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);
        this.f118596j = b10;
        this.f118597k = C16534i.A(C16534i.Y(C16534i.p(C16534i.U(b10, q10)), null, new n((C17164e<? super n>) null)));
        qv.e eVar2 = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar2, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Sync service init, register observers", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            if (str2 == null) {
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "ShoppingLists";
            }
            bVar.a(eVar2, str2, false, (Throwable) null, str);
        }
        this.f118599m = C16534i.M(S(), this.f118589c);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object M(WA.g r13, dI.C17164e<? super XH.C16807N> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof aB.f.b
            if (r0 == 0) goto L_0x0013
            r0 = r14
            aB.f$b r0 = (aB.f.b) r0
            int r1 = r0.f118605h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f118605h = r1
            goto L_0x0018
        L_0x0013:
            aB.f$b r0 = new aB.f$b
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f118603f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f118605h
            r4 = 1
            if (r3 == 0) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            java.lang.Object r13 = r0.f118602e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f118601d
            WA.g r13 = (WA.g) r13
            java.lang.Object r13 = r0.f118600c
            aB.f r13 = (aB.f) r13
            XH.y.b(r1)     // Catch:{ SQLiteException -> 0x0036 }
            goto L_0x00ff
        L_0x0036:
            r14 = move-exception
            goto L_0x0056
        L_0x0038:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0040:
            XH.y.b(r1)
            VA.l r1 = r12.f118588b     // Catch:{ SQLiteException -> 0x0054 }
            r0.f118600c = r12     // Catch:{ SQLiteException -> 0x0054 }
            r0.f118601d = r13     // Catch:{ SQLiteException -> 0x0054 }
            r0.f118602e = r14     // Catch:{ SQLiteException -> 0x0054 }
            r0.f118605h = r4     // Catch:{ SQLiteException -> 0x0054 }
            java.lang.Object r13 = r1.b(r13, r0)     // Catch:{ SQLiteException -> 0x0054 }
            if (r13 != r2) goto L_0x00ff
            return r2
        L_0x0054:
            r14 = move-exception
            r13 = r12
        L_0x0056:
            qv.e r0 = qv.e.WARN
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0069:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0081
            java.lang.Object r3 = r1.next()
            r5 = r3
            qv.b r5 = (qv.C11819b) r5
            r6 = 0
            boolean r5 = r5.b(r0, r6)
            if (r5 == 0) goto L_0x0069
            r2.add(r3)
            goto L_0x0069
        L_0x0081:
            java.util.Iterator r1 = r2.iterator()
            r2 = 0
            r3 = r2
            r5 = r3
        L_0x0088:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00ff
            java.lang.Object r6 = r1.next()
            qv.b r6 = (qv.C11819b) r6
            if (r3 != 0) goto L_0x00a3
            java.lang.String r3 = "Could not add item, ignoring"
            java.lang.String r3 = qv.C11818a.a(r3, r14)
            if (r3 != 0) goto L_0x009f
            goto L_0x00ff
        L_0x009f:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x00a3:
            if (r5 != 0) goto L_0x00f3
            java.lang.Class r5 = r13.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r7 = 36
            r8 = 2
            java.lang.String r7 = HJ.C15854t.s1(r5, r7, r2, r8, r2)
            r9 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r9, r2, r8, r2)
            int r8 = r7.length()
            if (r8 != 0) goto L_0x00c4
            goto L_0x00ca
        L_0x00c4:
            java.lang.String r5 = "Kt"
            java.lang.String r5 = HJ.C15854t.P0(r7, r5)
        L_0x00ca:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "main"
            boolean r7 = HJ.C15854t.b0(r7, r8, r4)
            if (r7 == 0) goto L_0x00dd
            java.lang.String r7 = "m"
            goto L_0x00df
        L_0x00dd:
            java.lang.String r7 = "b"
        L_0x00df:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = "|"
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
        L_0x00f3:
            r11 = r5
            r8 = 0
            r5 = r6
            r6 = r0
            r7 = r11
            r9 = r14
            r10 = r3
            r5.a(r6, r7, r8, r9, r10)
            r5 = r11
            goto L_0x0088
        L_0x00ff:
            XH.N r13 = XH.C16807N.f139792a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: aB.f.M(WA.g, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final Object N(C17164e<? super C16807N> eVar) {
        Object a10 = this.f118588b.a(eVar);
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final Object O(WA.g gVar, C17164e<? super C16807N> eVar) {
        Object d10 = this.f118588b.d(gVar, eVar);
        return d10 == C17187b.f() ? d10 : C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.util.ArrayList} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object P(aB.C13914d r29, dI.C17164e<? super java.lang.Boolean> r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            boolean r3 = r2 instanceof aB.f.d
            if (r3 == 0) goto L_0x0019
            r3 = r2
            aB.f$d r3 = (aB.f.d) r3
            int r4 = r3.f118626u
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f118626u = r4
            goto L_0x001e
        L_0x0019:
            aB.f$d r3 = new aB.f$d
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f118624s
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f118626u
            r7 = 1
            if (r6 == 0) goto L_0x0060
            if (r6 != r7) goto L_0x0058
            java.lang.Object r1 = r3.f118617l
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r3.f118616k
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r3.f118615j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f118614i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f118613h
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r3.f118612g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f118611f
            aB.d r1 = (aB.C13914d) r1
            java.lang.Object r1 = r3.f118610e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f118609d
            aB.d r1 = (aB.C13914d) r1
            java.lang.Object r1 = r3.f118608c
            aB.f r1 = (aB.f) r1
            XH.y.b(r4)
            goto L_0x0141
        L_0x0058:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0060:
            XH.y.b(r4)
            aB.d$c r4 = aB.C13914d.c.f118585a
            boolean r4 = kotlin.jvm.internal.C17542s.e(r1, r4)
            java.lang.String r6 = "|"
            java.lang.String r8 = "b"
            java.lang.String r9 = "m"
            java.lang.String r10 = "main"
            java.lang.String r11 = "ShoppingLists"
            r13 = 0
            if (r4 == 0) goto L_0x0144
            qv.e r4 = qv.e.DEBUG
            qv.d r14 = qv.d.f102012a
            java.util.List r14 = r14.a()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x0089:
            boolean r16 = r14.hasNext()
            if (r16 == 0) goto L_0x00a1
            java.lang.Object r12 = r14.next()
            r7 = r12
            qv.b r7 = (qv.C11819b) r7
            boolean r7 = r7.b(r4, r13)
            if (r7 == 0) goto L_0x009f
            r15.add(r12)
        L_0x009f:
            r7 = 1
            goto L_0x0089
        L_0x00a1:
            java.util.Iterator r7 = r15.iterator()
            r16 = r15
            r12 = 0
            r14 = 0
        L_0x00a9:
            boolean r17 = r7.hasNext()
            if (r17 == 0) goto L_0x0110
            java.lang.Object r20 = r7.next()
            r16 = r20
            qv.b r16 = (qv.C11819b) r16
            r13 = 0
            r21 = r8
            if (r12 != 0) goto L_0x00ce
            java.lang.String r8 = "Session expired code when processing event"
            java.lang.String r8 = qv.C11818a.a(r8, r13)
            if (r8 != 0) goto L_0x00c9
            r22 = r15
            r6 = r20
            goto L_0x0114
        L_0x00c9:
            java.lang.String r8 = qv.C11820c.a(r8)
            r12 = r8
        L_0x00ce:
            if (r14 != 0) goto L_0x00f6
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            r14 = 1
            boolean r8 = HJ.C15854t.b0(r8, r10, r14)
            if (r8 == 0) goto L_0x00e1
            r8 = r9
            goto L_0x00e3
        L_0x00e1:
            r8 = r21
        L_0x00e3:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r8)
            r14.append(r6)
            r14.append(r11)
            java.lang.String r8 = r14.toString()
            goto L_0x00f7
        L_0x00f6:
            r8 = r14
        L_0x00f7:
            r17 = 0
            r14 = r16
            r22 = r15
            r15 = r4
            r16 = r8
            r18 = r13
            r19 = r12
            r14.a(r15, r16, r17, r18, r19)
            r14 = r8
            r16 = r20
            r8 = r21
            r15 = r22
            r13 = 0
            goto L_0x00a9
        L_0x0110:
            r22 = r15
            r6 = r16
        L_0x0114:
            r3.f118608c = r0
            r3.f118609d = r1
            r3.f118610e = r2
            r3.f118611f = r1
            r3.f118612g = r11
            r3.f118613h = r4
            r3.f118614i = r12
            r3.f118615j = r14
            r1 = r22
            r3.f118616k = r1
            r3.f118617l = r7
            r3.f118618m = r6
            r1 = 0
            r3.f118619n = r1
            r3.f118620o = r1
            r3.f118621p = r1
            r3.f118622q = r1
            r3.f118623r = r1
            r1 = 1
            r3.f118626u = r1
            java.lang.Object r1 = r0.Q(r3)
            if (r1 != r5) goto L_0x0141
            return r5
        L_0x0141:
            r7 = 1
            goto L_0x01e3
        L_0x0144:
            r21 = r8
            aB.d$b r2 = aB.C13914d.b.f118584a
            boolean r2 = kotlin.jvm.internal.C17542s.e(r1, r2)
            if (r2 == 0) goto L_0x01d9
            qv.e r1 = qv.e.DEBUG
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0161:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0179
            java.lang.Object r4 = r2.next()
            r5 = r4
            qv.b r5 = (qv.C11819b) r5
            r7 = 0
            boolean r5 = r5.b(r1, r7)
            if (r5 == 0) goto L_0x0161
            r3.add(r4)
            goto L_0x0161
        L_0x0179:
            r7 = 0
            java.util.Iterator r2 = r3.iterator()
            r12 = 0
            r16 = 0
        L_0x0181:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01e3
            java.lang.Object r3 = r2.next()
            r22 = r3
            qv.b r22 = (qv.C11819b) r22
            r3 = 0
            if (r12 != 0) goto L_0x01a0
            java.lang.String r4 = "Request failed, try again later"
            java.lang.String r4 = qv.C11818a.a(r4, r3)
            if (r4 != 0) goto L_0x019b
            goto L_0x01e3
        L_0x019b:
            java.lang.String r4 = qv.C11820c.a(r4)
            r12 = r4
        L_0x01a0:
            if (r16 != 0) goto L_0x01ca
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            r5 = 1
            boolean r4 = HJ.C15854t.b0(r4, r10, r5)
            if (r4 == 0) goto L_0x01b3
            r4 = r9
            goto L_0x01b5
        L_0x01b3:
            r4 = r21
        L_0x01b5:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r6)
            r8.append(r11)
            java.lang.String r4 = r8.toString()
            r16 = r4
            goto L_0x01cb
        L_0x01ca:
            r5 = 1
        L_0x01cb:
            r25 = 0
            r23 = r1
            r24 = r16
            r26 = r3
            r27 = r12
            r22.a(r23, r24, r25, r26, r27)
            goto L_0x0181
        L_0x01d9:
            r5 = 1
            aB.d$a r2 = aB.C13914d.a.f118583a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r2)
            if (r1 == 0) goto L_0x01e8
            r7 = r5
        L_0x01e3:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r7)
            return r1
        L_0x01e8:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: aB.f.P(aB.d, dI.e):java.lang.Object");
    }

    private final Object Q(C17164e<? super C16807N> eVar) {
        IllegalStateException illegalStateException = new IllegalStateException("notifySessionExpired. Session expired, not handled.");
        qv.e eVar2 = qv.e.WARN;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar2, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a((String) null, illegalStateException);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = f.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar2, str4, false, illegalStateException, str3);
            str = str3;
            str2 = str4;
        }
        Object N10 = N(eVar);
        return N10 == C17187b.f() ? N10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void R(boolean z10) {
        F0 unused = C16314k.d(this.f118589c, this.f118591e, (T) null, new e(this, z10, (C17164e<? super e>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void T(bB.f fVar) {
        qv.e eVar = qv.e.DEBUG;
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
                String a10 = C11818a.a("Replace shopping list : " + fVar.c(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "ShoppingLists";
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        F0 unused = C16314k.d(this.f118589c, this.f118590d.plus(new i(N.f137593c0, this)), (T) null, new j(fVar, this, (C17164e<? super j>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final Object U(WA.g gVar, C17164e<? super Boolean> eVar) {
        return C16310i.g(this.f118590d, new m(gVar, this, (C17164e<? super m>) null), eVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: dI.e<? super XH.N>} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object V(java.lang.String r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof aB.f.q
            if (r0 == 0) goto L_0x0013
            r0 = r8
            aB.f$q r0 = (aB.f.q) r0
            int r1 = r0.f118729i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f118729i = r1
            goto L_0x0018
        L_0x0013:
            aB.f$q r0 = new aB.f$q
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f118727g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f118729i
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0055
            if (r3 == r5) goto L_0x0044
            if (r3 != r4) goto L_0x003c
            java.lang.Object r7 = r0.f118726f
            bB.f r7 = (bB.f) r7
            java.lang.Object r7 = r0.f118725e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f118724d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f118723c
            aB.f r7 = (aB.f) r7
            XH.y.b(r1)
            goto L_0x0082
        L_0x003c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0044:
            java.lang.Object r7 = r0.f118725e
            r8 = r7
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r7 = r0.f118724d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r0.f118723c
            aB.f r3 = (aB.f) r3
            XH.y.b(r1)
            goto L_0x006a
        L_0x0055:
            XH.y.b(r1)
            aB.a r1 = r6.f118592f
            r0.f118723c = r6
            r0.f118724d = r7
            r0.f118725e = r8
            r0.f118729i = r5
            java.lang.Object r1 = r1.h(r7, r0)
            if (r1 != r2) goto L_0x0069
            return r2
        L_0x0069:
            r3 = r6
        L_0x006a:
            bB.f r1 = (bB.f) r1
            r3.T(r1)
            TJ.A<bB.f> r5 = r3.f118596j
            r0.f118723c = r3
            r0.f118724d = r7
            r0.f118725e = r8
            r0.f118726f = r1
            r0.f118729i = r4
            java.lang.Object r7 = r5.emit(r1, r0)
            if (r7 != r2) goto L_0x0082
            return r2
        L_0x0082:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: aB.f.V(java.lang.String, dI.e):java.lang.Object");
    }

    public final C16532g<C16807N> S() {
        return C16534i.g0(this.f118587a.n(), new C2955f((C17164e) null, this));
    }

    public C16532g<bB.f> i() {
        return this.f118597k;
    }

    public void r(SyncEventModel syncEventModel) {
        C17542s.j(syncEventModel, "syncEventModel");
        F0 unused = C16314k.d(this.f118589c, this.f118590d.plus(new k(N.f137593c0, this)), (T) null, new l(syncEventModel, this, (C17164e<? super l>) null), 2, (Object) null);
    }

    public void s(String str) {
        C17542s.j(str, "id");
        C16534i.M(C16534i.R(C16534i.e0(new o(this.f118593g.b()), 1), new p(this, str, (C17164e<? super p>) null)), this.f118589c);
    }

    public void w() {
        F0 unused = C16314k.d(this.f118589c, this.f118590d, (T) null, new c(this, (C17164e<? super c>) null), 2, (Object) null);
    }
}
