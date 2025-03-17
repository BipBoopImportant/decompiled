package It;

import EB.C12832d;
import FB.C12860a;
import It.C10738a;
import It.C10739b;
import QJ.F0;
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
import androidx.lifecycle.U;
import androidx.lifecycle.g0;
import com.ingka.ikea.instore.impl.navigation.InstoreRoutes$ChangeStoreDialog;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.p;
import nu.g;
import nu.n;
import su.C11891a;
import x4.O;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00020$0(8\u0016X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u0004\u0018\u0001028\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00104R\u0014\u00109\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00104R\u0014\u0010;\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u00104¨\u0006<"}, d2 = {"LIt/h;", "LIt/g;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lnu/g;", "getStoreAndScanAndGoCartUseCase", "LFB/a;", "localStoreSelectionRepository", "Lnu/n;", "updateStoreUseCase", "Lsu/a;", "wayfindingAnalytics", "<init>", "(Landroidx/lifecycle/U;Lnu/g;LFB/a;Lnu/n;Lsu/a;)V", "Lnu/g$a;", "result", "LXH/N;", "K", "(Lnu/g$a;)V", "", "sendDialogActionAnalytics", "J", "(Z)V", "LIt/a;", "action", "L", "(LIt/a;)V", "m", "Lnu/g;", "n", "LFB/a;", "o", "Lnu/n;", "p", "Lsu/a;", "LTJ/B;", "LIt/f;", "q", "LTJ/B;", "_state", "LTJ/P;", "r", "LTJ/P;", "getState", "()LTJ/P;", "state", "Lcom/ingka/ikea/instore/impl/navigation/InstoreRoutes$ChangeStoreDialog;", "s", "Lcom/ingka/ikea/instore/impl/navigation/InstoreRoutes$ChangeStoreDialog;", "route", "", "t", "Ljava/lang/String;", "storeId", "u", "itemId", "v", "confirmUri", "w", "deniedUri", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: It.h  reason: case insensitive filesystem */
public final class C10745h extends C10744g {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final g f82309m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C12860a f82310n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final n f82311o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C11891a f82312p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C16505B<C10743f> f82313q;

    /* renamed from: r  reason: collision with root package name */
    private final C16519P<C10743f> f82314r;

    /* renamed from: s  reason: collision with root package name */
    private final InstoreRoutes$ChangeStoreDialog f82315s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final String f82316t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final String f82317u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final String f82318v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final String f82319w;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.presentation.InstoreAppLinkChangeStoreViewModelImpl$1", f = "InstoreAppLinkChangeStoreViewModel.kt", l = {56}, m = "invokeSuspend")
    /* renamed from: It.h$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f82320c;

        /* renamed from: d  reason: collision with root package name */
        Object f82321d;

        /* renamed from: e  reason: collision with root package name */
        int f82322e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C10745h f82323f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C10745h hVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f82323f = hVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f82323f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C10745h hVar;
            Object f10 = C17187b.f();
            int i10 = this.f82322e;
            if (i10 == 0) {
                y.b(obj);
                C12832d c10 = this.f82323f.f82310n.c();
                if (c10 == null || C17542s.e(c10.e(), this.f82323f.f82316t)) {
                    this.f82323f.J(false);
                    return C16807N.f139792a;
                }
                C10745h hVar2 = this.f82323f;
                g k10 = hVar2.f82309m;
                String E10 = this.f82323f.f82316t;
                this.f82320c = c10;
                this.f82321d = hVar2;
                this.f82322e = 1;
                obj = k10.a(E10, this);
                if (obj == f10) {
                    return f10;
                }
                hVar = hVar2;
            } else if (i10 == 1) {
                hVar = (C10745h) this.f82321d;
                C12832d dVar = (C12832d) this.f82320c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar.K((g.a) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.presentation.InstoreAppLinkChangeStoreViewModelImpl$doChangeStore$1", f = "InstoreAppLinkChangeStoreViewModel.kt", l = {107}, m = "invokeSuspend")
    /* renamed from: It.h$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f82324c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C10745h f82325d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f82326e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C10745h hVar, boolean z10, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f82325d = hVar;
            this.f82326e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f82325d, this.f82326e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object value;
            Object value2;
            Object f10 = C17187b.f();
            int i10 = this.f82324c;
            if (i10 == 0) {
                y.b(obj);
                n F10 = this.f82325d.f82311o;
                String E10 = this.f82325d.f82316t;
                this.f82324c = 1;
                obj2 = F10.m12invokegIAlus(E10, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z10 = this.f82326e;
            C10745h hVar = this.f82325d;
            Throwable e10 = x.e(obj2);
            if (e10 == null) {
                C16807N n10 = (C16807N) obj2;
                if (z10) {
                    hVar.f82312p.h(hVar.f82316t, hVar.f82317u, true);
                }
                C16505B H10 = hVar.f82313q;
                do {
                    value2 = H10.getValue();
                } while (!H10.e(value2, C10743f.b((C10743f) value2, (C10739b) null, new C10740c(hVar.f82318v), 1, (Object) null)));
            } else {
                C11891a G10 = hVar.f82312p;
                String E11 = hVar.f82316t;
                String C10 = hVar.f82317u;
                String message = e10.getMessage();
                if (message == null) {
                    message = "";
                }
                G10.g(E11, C10, message);
                C16505B H11 = hVar.f82313q;
                do {
                    value = H11.getValue();
                } while (!H11.e(value, C10743f.b((C10743f) value, (C10739b) null, new C10741d(hVar.f82319w), 1, (Object) null)));
            }
            return C16807N.f139792a;
        }
    }

    public C10745h(U u10, g gVar, C12860a aVar, n nVar, C11891a aVar2) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(gVar, "getStoreAndScanAndGoCartUseCase");
        C17542s.j(aVar, "localStoreSelectionRepository");
        C17542s.j(nVar, "updateStoreUseCase");
        C17542s.j(aVar2, "wayfindingAnalytics");
        this.f82309m = gVar;
        this.f82310n = aVar;
        this.f82311o = nVar;
        this.f82312p = aVar2;
        C16505B<C10743f> a10 = C16521S.a(new C10743f((C10739b) null, (C10742e) null, 3, (DefaultConstructorMarker) null));
        this.f82313q = a10;
        this.f82314r = C16534i.c(a10);
        InstoreRoutes$ChangeStoreDialog instoreRoutes$ChangeStoreDialog = (InstoreRoutes$ChangeStoreDialog) O.a(u10, P.b(InstoreRoutes$ChangeStoreDialog.class), X.j());
        this.f82315s = instoreRoutes$ChangeStoreDialog;
        this.f82316t = instoreRoutes$ChangeStoreDialog.e();
        this.f82317u = instoreRoutes$ChangeStoreDialog.d();
        this.f82318v = instoreRoutes$ChangeStoreDialog.b();
        this.f82319w = instoreRoutes$ChangeStoreDialog.c();
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void J(boolean z10) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new b(this, z10, (C17164e<? super b>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void K(g.a aVar) {
        C10743f value;
        C10743f value2;
        if (aVar != null) {
            C16505B<C10743f> b10 = this.f82313q;
            do {
                value2 = b10.getValue();
            } while (!b10.e(value2, C10743f.b(value2, new C10739b.C1614b(aVar.b(), aVar.c(), aVar.a()), (C10742e) null, 2, (Object) null)));
            return;
        }
        C16505B<C10743f> b11 = this.f82313q;
        do {
            value = b11.getValue();
        } while (!b11.e(value, C10743f.b(value, (C10739b) null, new C10741d(this.f82319w), 1, (Object) null)));
    }

    /* renamed from: L */
    public void b(C10738a aVar) {
        C10743f value;
        C10743f value2;
        C17542s.j(aVar, "action");
        if (C17542s.e(aVar, C10738a.C1613a.f82298a)) {
            J(true);
        } else if (C17542s.e(aVar, C10738a.b.f82299a)) {
            this.f82312p.h(this.f82316t, this.f82317u, false);
            C16505B<C10743f> b10 = this.f82313q;
            do {
                value2 = b10.getValue();
            } while (!b10.e(value2, C10743f.b(value2, (C10739b) null, new C10741d(this.f82319w), 1, (Object) null)));
        } else if (C17542s.e(aVar, C10738a.c.f82300a)) {
            C16505B<C10743f> b11 = this.f82313q;
            do {
                value = b11.getValue();
            } while (!b11.e(value, C10743f.b(value, (C10739b) null, (C10742e) null, 1, (Object) null)));
        } else {
            throw new t();
        }
    }

    public C16519P<C10743f> getState() {
        return this.f82314r;
    }
}
