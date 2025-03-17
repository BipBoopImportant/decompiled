package xk;

import HJ.C15854t;
import KJ.C15987c;
import QA.C13349a;
import QJ.F0;
import QJ.M;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.x;
import XH.y;
import YH.X;
import aA.C13909a;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsRoutes$AllLists;
import com.ingka.ikea.core.model.Media;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import gB.C14504f;
import jB.C14612a;
import jB.C14613b;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kB.C14669a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sp.C11880b;
import vB.C15129b;
import vB.C15130c;
import wk.C12276a;
import x4.O;
import xk.C12315a;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002BS\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b \u0010\u001cJ\u0015\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00108\u001a\b\u0012\u0004\u0012\u00020\u0003038\u0016X\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8BX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lxk/c;", "Landroidx/lifecycle/f0;", "Lsp/b;", "Lxk/b;", "Landroidx/lifecycle/U;", "savedStateHandle", "LjB/b;", "shoppingListRepository", "LQJ/M;", "ioDispatcher", "Lwk/a;", "shoppingListAnalytics", "LvB/c;", "getShoppingListsCarouselUseCase", "LkB/a;", "fetchListsTask", "LaA/a;", "sessionManager", "LSl/e;", "getStaticImageUseCase", "LjB/a;", "shoppingListCardSizeRepository", "<init>", "(Landroidx/lifecycle/U;LjB/b;LQJ/M;Lwk/a;LvB/c;LkB/a;LaA/a;LSl/e;LjB/a;)V", "", "newListName", "LXH/N;", "E", "(Ljava/lang/String;)V", "D", "()V", "listId", "G", "LgB/f;", "cardSizeSelected", "H", "(LgB/f;)V", "m", "LjB/b;", "n", "LQJ/M;", "o", "Lwk/a;", "p", "LSl/e;", "q", "LjB/a;", "LTJ/B;", "r", "LTJ/B;", "_state", "LTJ/P;", "s", "LTJ/P;", "getState", "()LTJ/P;", "state", "Lcom/ingka/ikea/app/shoppinglist/navigation/ShoppingListsRoutes$AllLists;", "t", "Lcom/ingka/ikea/app/shoppinglist/navigation/ShoppingListsRoutes$AllLists;", "route", "LQA/a;", "F", "()LQA/a;", "listMode", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends f0 implements C11880b<C12316b> {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C14613b f106010m;

    /* renamed from: n  reason: collision with root package name */
    private final M f106011n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C12276a f106012o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Sl.e f106013p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C14612a f106014q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C16505B<C12316b> f106015r;

    /* renamed from: s  reason: collision with root package name */
    private final C16519P<C12316b> f106016s;

    /* renamed from: t  reason: collision with root package name */
    private final ShoppingListsRoutes$AllLists f106017t;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isLoading", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.lists.presentation.ShoppingListsViewModel$1", f = "ShoppingListsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106018c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f106019d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f106020e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f106020e = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f106020e, eVar);
            aVar.f106019d = ((Boolean) obj).booleanValue();
            return aVar;
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((a) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f106018c == 0) {
                y.b(obj);
                boolean z10 = this.f106019d;
                C16505B C10 = this.f106020e.f106015r;
                do {
                    value = C10.getValue();
                } while (!C10.e(value, C12316b.b((C12316b) value, z10, (C15987c) null, (C12315a) null, false, (Media.Image) null, (C14504f) null, 62, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LvB/b;", "carouselShoppingListState", "LXH/N;", "<anonymous>", "(LvB/b;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.lists.presentation.ShoppingListsViewModel$2", f = "ShoppingListsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<C15129b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106021c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f106022d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f106023e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f106023e = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f106023e, eVar);
            bVar.f106022d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(C15129b bVar, C17164e<? super C16807N> eVar) {
            return ((b) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f106021c == 0) {
                y.b(obj);
                C15129b bVar = (C15129b) this.f106022d;
                C16505B C10 = this.f106023e.f106015r;
                do {
                    value = C10.getValue();
                } while (!C10.e(value, C12316b.b((C12316b) value, false, bVar.a(), (C12315a) null, false, (Media.Image) null, (C14504f) null, 61, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isSignedIn", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.lists.presentation.ShoppingListsViewModel$3", f = "ShoppingListsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: xk.c$c  reason: collision with other inner class name */
    static final class C2519c extends l implements p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106024c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f106025d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f106026e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2519c(c cVar, C17164e<? super C2519c> eVar) {
            super(2, eVar);
            this.f106026e = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C2519c cVar = new C2519c(this.f106026e, eVar);
            cVar.f106025d = ((Boolean) obj).booleanValue();
            return cVar;
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((C2519c) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f106024c == 0) {
                y.b(obj);
                boolean z10 = this.f106025d;
                C16505B C10 = this.f106026e.f106015r;
                do {
                    value = C10.getValue();
                } while (!C10.e(value, C12316b.b((C12316b) value, false, (C15987c) null, (C12315a) null, z10, (Media.Image) null, (C14504f) null, 55, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.lists.presentation.ShoppingListsViewModel$4", f = "ShoppingListsViewModel.kt", l = {84}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106027c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f106028d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f106028d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f106028d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f106027c;
            if (i10 == 0) {
                y.b(obj);
                Sl.e h10 = this.f106028d.f106013p;
                this.f106027c = 1;
                obj = h10.a("wayfindingShoppingListTabEmptyImage", this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Media.Image image = (Media.Image) obj;
            if (image != null) {
                C16505B C10 = this.f106028d.f106015r;
                do {
                    value = C10.getValue();
                } while (!C10.e(value, C12316b.b((C12316b) value, false, (C15987c) null, (C12315a) null, false, image, (C14504f) null, 47, (Object) null)));
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LgB/f;", "selectedCardSize", "LXH/N;", "<anonymous>", "(LgB/f;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.lists.presentation.ShoppingListsViewModel$5", f = "ShoppingListsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class e extends l implements p<C14504f, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106029c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f106030d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f106031e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f106031e = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f106031e, eVar);
            eVar2.f106030d = obj;
            return eVar2;
        }

        /* renamed from: i */
        public final Object invoke(C14504f fVar, C17164e<? super C16807N> eVar) {
            return ((e) create(fVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f106029c == 0) {
                y.b(obj);
                C14504f fVar = (C14504f) this.f106030d;
                C16505B C10 = this.f106031e.f106015r;
                do {
                    value = C10.getValue();
                } while (!C10.e(value, C12316b.b((C12316b) value, false, (C15987c) null, (C12315a) null, false, (Media.Image) null, fVar, 31, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f106032a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                QA.a[] r0 = QA.C13349a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                QA.a r1 = QA.C13349a.ONLINE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                QA.a r1 = QA.C13349a.STORE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f106032a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xk.c.f.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.lists.presentation.ShoppingListsViewModel$createShoppingList$1", f = "ShoppingListsViewModel.kt", l = {100}, m = "invokeSuspend")
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f106033c;

        /* renamed from: d  reason: collision with root package name */
        Object f106034d;

        /* renamed from: e  reason: collision with root package name */
        Object f106035e;

        /* renamed from: f  reason: collision with root package name */
        Object f106036f;

        /* renamed from: g  reason: collision with root package name */
        int f106037g;

        /* renamed from: h  reason: collision with root package name */
        int f106038h;

        /* renamed from: i  reason: collision with root package name */
        int f106039i;

        /* renamed from: j  reason: collision with root package name */
        private /* synthetic */ Object f106040j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ c f106041k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ String f106042l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar, String str, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f106041k = cVar;
            this.f106042l = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f106041k, this.f106042l, eVar);
            gVar.f106040j = obj;
            return gVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Q q10;
            Object obj2;
            Object value;
            Object value2;
            Object value3;
            Object obj3;
            Object value4;
            Object f10 = C17187b.f();
            int i10 = this.f106039i;
            if (i10 == 0) {
                y.b(obj);
                q10 = (Q) this.f106040j;
                C16505B C10 = this.f106041k.f106015r;
                do {
                    value4 = C10.getValue();
                } while (!C10.e(value4, C12316b.b((C12316b) value4, true, (C15987c) null, (C12315a) null, false, (Media.Image) null, (C14504f) null, 62, (Object) null)));
                c cVar = this.f106041k;
                String str = this.f106042l;
                x.a aVar = x.f139812b;
                C14613b k10 = cVar.f106010m;
                this.f106040j = q10;
                this.f106033c = q10;
                this.f106034d = cVar;
                this.f106035e = str;
                this.f106036f = q10;
                this.f106037g = 0;
                this.f106038h = 0;
                this.f106039i = 1;
                obj3 = k10.a(str, this);
                if (obj3 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Q q11 = (Q) this.f106036f;
                String str2 = (String) this.f106035e;
                c cVar2 = (c) this.f106034d;
                Q q12 = (Q) this.f106033c;
                q10 = (Q) this.f106040j;
                try {
                    y.b(obj);
                    obj3 = obj;
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Throwable th2) {
                    x.a aVar2 = x.f139812b;
                    obj2 = x.b(y.a(th2));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = x.b((String) obj3);
            c cVar3 = this.f106041k;
            Throwable e11 = x.e(obj2);
            if (e11 != null) {
                qv.e eVar = qv.e.WARN;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str3 = null;
                String str4 = null;
                for (C11819b bVar : arrayList) {
                    if (str3 == null) {
                        String a10 = C11818a.a("Create List operation failed", e11);
                        if (a10 == null) {
                            break;
                        }
                        str3 = C11820c.a(a10);
                    }
                    String str5 = str3;
                    if (str4 == null) {
                        String name = q10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str6 = str4;
                    bVar.a(eVar, str6, false, e11, str5);
                    str3 = str5;
                    str4 = str6;
                }
                C16505B C11 = cVar3.f106015r;
                do {
                    value3 = C11.getValue();
                } while (!C11.e(value3, C12316b.b((C12316b) value3, false, (C15987c) null, new C12315a.C2518a(e11), false, (Media.Image) null, (C14504f) null, 59, (Object) null)));
            }
            c cVar4 = this.f106041k;
            String str7 = this.f106042l;
            if (x.h(obj2)) {
                String str8 = (String) obj2;
                C16505B C12 = cVar4.f106015r;
                do {
                    value2 = C12.getValue();
                } while (!C12.e(value2, C12316b.b((C12316b) value2, false, (C15987c) null, new C12315a.b(str7), false, (Media.Image) null, (C14504f) null, 59, (Object) null)));
            }
            C16505B C13 = this.f106041k.f106015r;
            do {
                value = C13.getValue();
            } while (!C13.e(value, C12316b.b((C12316b) value, false, (C15987c) null, (C12315a) null, false, (Media.Image) null, (C14504f) null, 62, (Object) null)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.lists.presentation.ShoppingListsViewModel$updateSelectedCardSize$1", f = "ShoppingListsViewModel.kt", l = {130}, m = "invokeSuspend")
    static final class h extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f106043c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f106044d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C14504f f106045e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar, C14504f fVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f106044d = cVar;
            this.f106045e = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f106044d, this.f106045e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f106043c;
            if (i10 == 0) {
                y.b(obj);
                this.f106044d.f106012o.b(this.f106045e);
                C14612a j10 = this.f106044d.f106014q;
                C14504f fVar = this.f106045e;
                this.f106043c = 1;
                if (j10.b(fVar, this) == f10) {
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

    public c(U u10, C14613b bVar, M m10, C12276a aVar, C15130c cVar, C14669a aVar2, C13909a aVar3, Sl.e eVar, C14612a aVar4) {
        U u11 = u10;
        C14613b bVar2 = bVar;
        M m11 = m10;
        C12276a aVar5 = aVar;
        C15130c cVar2 = cVar;
        Sl.e eVar2 = eVar;
        C14612a aVar6 = aVar4;
        C17542s.j(u11, "savedStateHandle");
        C17542s.j(bVar2, "shoppingListRepository");
        C17542s.j(m11, "ioDispatcher");
        C17542s.j(aVar5, "shoppingListAnalytics");
        C17542s.j(cVar2, "getShoppingListsCarouselUseCase");
        C17542s.j(aVar2, "fetchListsTask");
        C17542s.j(aVar3, "sessionManager");
        C17542s.j(eVar2, "getStaticImageUseCase");
        C17542s.j(aVar6, "shoppingListCardSizeRepository");
        this.f106010m = bVar2;
        this.f106011n = m11;
        this.f106012o = aVar5;
        this.f106013p = eVar2;
        this.f106014q = aVar6;
        C16505B<C12316b> a10 = C16521S.a(new C12316b(false, (C15987c) null, (C12315a) null, false, (Media.Image) null, (C14504f) null, 63, (DefaultConstructorMarker) null));
        this.f106015r = a10;
        this.f106016s = a10;
        this.f106017t = (ShoppingListsRoutes$AllLists) O.a(u11, P.b(ShoppingListsRoutes$AllLists.class), X.j());
        aVar2.execute();
        C16534i.M(C16534i.R(bVar.p(), new a(this, (C17164e<? super a>) null)), g0.a(this));
        int i10 = f.f106032a[F().ordinal()];
        boolean z10 = true;
        if (i10 == 1) {
            z10 = false;
        } else if (i10 != 2) {
            throw new t();
        }
        C16534i.M(C16534i.R(C16534i.L(cVar2.a(z10), m11), new b(this, (C17164e<? super b>) null)), g0.a(this));
        C16534i.M(C16534i.R(aVar3.n(), new C2519c(this, (C17164e<? super C2519c>) null)), g0.a(this));
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new d(this, (C17164e<? super d>) null), 3, (Object) null);
        C16534i.M(C16534i.R(aVar4.a(), new e(this, (C17164e<? super e>) null)), g0.a(this));
    }

    private final C13349a F() {
        return C13349a.Companion.a(this.f106017t.a());
    }

    public final void D() {
        C12316b value;
        C16505B<C12316b> b10 = this.f106015r;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C12316b.b(value, false, (C15987c) null, (C12315a) null, false, (Media.Image) null, (C14504f) null, 59, (Object) null)));
    }

    public final void E(String str) {
        C17542s.j(str, "newListName");
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new g(this, str, (C17164e<? super g>) null), 3, (Object) null);
    }

    public final void G(String str) {
        C17542s.j(str, "listId");
        this.f106012o.a(str);
    }

    public final void H(C14504f fVar) {
        C17542s.j(fVar, "cardSizeSelected");
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new h(this, fVar, (C17164e<? super h>) null), 3, (Object) null);
    }

    public C16519P<C12316b> getState() {
        return this.f106016s;
    }
}
