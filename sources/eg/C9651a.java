package eg;

import Il.a;
import KJ.C15985a;
import KJ.C15987c;
import Op.B0;
import Op.C10828d;
import Op.C10850o;
import Op.C10867x;
import Op.d1;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.core.model.product.ProductItem;
import dI.C17164e;
import dI.C17168i;
import dg.d;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001(B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0013\u0010&¨\u0006)"}, d2 = {"Leg/a;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "Ldg/d;", "getReplacementRecommendationsUseCase", "LIl/a;", "appConfigApi", "<init>", "(Landroidx/lifecycle/U;Ldg/d;LIl/a;)V", "LXH/N;", "F", "()V", "", "LOp/d;", "LKJ/c;", "LOp/d1;", "E", "(Ljava/util/List;)LKJ/c;", "m", "Ldg/d;", "n", "LIl/a;", "", "o", "Ljava/lang/String;", "itemNo", "LTJ/B;", "p", "LTJ/B;", "items", "", "q", "loading", "LTJ/P;", "Leg/a$a;", "r", "LTJ/P;", "()LTJ/P;", "uiState", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eg.a  reason: case insensitive filesystem */
public final class C9651a extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final d f72666m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final a f72667n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final String f72668o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C16505B<List<C10828d>> f72669p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C16505B<Boolean> f72670q;

    /* renamed from: r  reason: collision with root package name */
    private final C16519P<C1245a> f72671r;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Leg/a$a;", "", "LKJ/c;", "LOp/d1;", "recommendedProducts", "", "loading", "<init>", "(LKJ/c;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "b", "()LKJ/c;", "Z", "()Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eg.a$a  reason: collision with other inner class name */
    public static final class C1245a {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<d1> f72672a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f72673b;

        public C1245a() {
            this((C15987c) null, false, 3, (DefaultConstructorMarker) null);
        }

        public final boolean a() {
            return this.f72673b;
        }

        public final C15987c<d1> b() {
            return this.f72672a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1245a)) {
                return false;
            }
            C1245a aVar = (C1245a) obj;
            return C17542s.e(this.f72672a, aVar.f72672a) && this.f72673b == aVar.f72673b;
        }

        public int hashCode() {
            return (this.f72672a.hashCode() * 31) + Boolean.hashCode(this.f72673b);
        }

        public String toString() {
            C15987c<d1> cVar = this.f72672a;
            boolean z10 = this.f72673b;
            return "ReplacementProductsUiState(recommendedProducts=" + cVar + ", loading=" + z10 + ")";
        }

        public C1245a(C15987c<d1> cVar, boolean z10) {
            C17542s.j(cVar, "recommendedProducts");
            this.f72672a = cVar;
            this.f72673b = z10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C1245a(C15987c cVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C15985a.a() : cVar, (i10 & 2) != 0 ? false : z10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.impl.presentation.viewmodel.ReplacementRecommendationsViewModel$loadItems$1", f = "ReplacementRecommendationsViewModel.kt", l = {62}, m = "invokeSuspend")
    /* renamed from: eg.a$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f72674c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C9651a f72675d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C9651a aVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f72675d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f72675d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f72674c;
            if (i10 == 0) {
                y.b(obj);
                d j10 = this.f72675d.f72666m;
                String k10 = this.f72675d.f72668o;
                this.f72674c = 1;
                obj = j10.a(k10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16505B C10 = this.f72675d.f72669p;
            Iterable<ProductItem> iterable = (List) obj;
            C9651a aVar = this.f72675d;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (ProductItem h10 : iterable) {
                arrayList.add(B0.h(h10, aVar.f72667n.s(), false, false, false, false, 30, (Object) null));
            }
            C10.setValue(arrayList);
            this.f72675d.f72670q.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "LOp/d;", "items", "", "loading", "Leg/a$a;", "<anonymous>", "(Ljava/util/List;Z)Leg/a$a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.impl.presentation.viewmodel.ReplacementRecommendationsViewModel$uiState$1", f = "ReplacementRecommendationsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: eg.a$c */
    static final class c extends l implements q<List<? extends C10828d>, Boolean, C17164e<? super C1245a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f72676c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f72677d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f72678e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C9651a f72679f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C9651a aVar, C17164e<? super c> eVar) {
            super(3, eVar);
            this.f72679f = aVar;
        }

        public final Object i(List<C10828d> list, boolean z10, C17164e<? super C1245a> eVar) {
            c cVar = new c(this.f72679f, eVar);
            cVar.f72677d = list;
            cVar.f72678e = z10;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((List) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f72676c == 0) {
                y.b(obj);
                return new C1245a(this.f72679f.E((List) this.f72677d), this.f72678e);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C9651a(U u10, d dVar, a aVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(dVar, "getReplacementRecommendationsUseCase");
        C17542s.j(aVar, "appConfigApi");
        this.f72666m = dVar;
        this.f72667n = aVar;
        Object f10 = u10.f("itemNo");
        if (f10 != null) {
            this.f72668o = (String) f10;
            C16505B<List<C10828d>> a10 = C16521S.a(C16877v.n());
            this.f72669p = a10;
            C16505B<Boolean> a11 = C16521S.a(Boolean.TRUE);
            this.f72670q = a11;
            this.f72671r = C16534i.c0(C16534i.n(a10, a11, new c(this, (C17164e<? super c>) null)), g0.a(this), ip.f.a(), new C1245a((C15987c) null, true, 1, (DefaultConstructorMarker) null));
            F();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final C15987c<d1> E(List<C10828d> list) {
        Iterable<C10828d> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C10828d d1Var : iterable) {
            arrayList.add(new d1((C10850o.a) null, new C10867x(false, false), d1Var, this.f72667n.s(), this.f72667n.w()));
        }
        return C15985a.h(arrayList);
    }

    private final void F() {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
    }

    public final C16519P<C1245a> m() {
        return this.f72671r;
    }
}
