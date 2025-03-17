package androidx.compose.foundation.lazy.layout;

import G1.w0;
import G1.x0;
import L1.j;
import L1.x;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p0.v;
import v0.t;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u0013\u0010\u0014\u001a\u00020\u000f*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b \u0010!R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\n\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010-\u001a\u00020\n8BX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8BX\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b2\u0010,¨\u00064"}, d2 = {"Landroidx/compose/foundation/lazy/layout/g;", "Landroidx/compose/ui/d$c;", "LG1/w0;", "Lkotlin/Function0;", "Lv0/t;", "itemProviderLambda", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Lp0/v;", "orientation", "", "userScrollEnabled", "reverseScrolling", "<init>", "(LnI/a;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Lp0/v;ZZ)V", "LXH/N;", "H2", "()V", "G2", "LL1/x;", "m0", "(LL1/x;)V", "n", "LnI/a;", "o", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "p", "Lp0/v;", "q", "Z", "r", "LL1/j;", "s", "LL1/j;", "scrollAxisRange", "Lkotlin/Function1;", "", "", "t", "LnI/l;", "indexForKeyMapping", "u", "scrollToIndexAction", "F2", "()Z", "isVertical", "LL1/b;", "E2", "()LL1/b;", "collectionInfo", "h2", "shouldAutoInvalidate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class g extends d.c implements w0 {
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public C17631a<? extends t> f18352n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public LazyLayoutSemanticState f18353o;

    /* renamed from: p  reason: collision with root package name */
    private v f18354p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f18355q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f18356r;

    /* renamed from: s  reason: collision with root package name */
    private j f18357s;

    /* renamed from: t  reason: collision with root package name */
    private final C17642l<Object, Integer> f18358t = new b(this);

    /* renamed from: u  reason: collision with root package name */
    private C17642l<? super Integer, Boolean> f18359u;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f18360c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(0);
            this.f18360c = gVar;
        }

        /* renamed from: b */
        public final Float invoke() {
            return Float.valueOf((float) (this.f18360c.f18353o.getViewport() - this.f18360c.f18353o.getContentPadding()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "needle", "", "a", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Object, Integer> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f18361c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar) {
            super(1);
            this.f18361c = gVar;
        }

        /* renamed from: a */
        public final Integer invoke(Object obj) {
            t tVar = (t) this.f18361c.f18352n.invoke();
            int a10 = tVar.a();
            int i10 = 0;
            while (true) {
                if (i10 >= a10) {
                    i10 = -1;
                    break;
                } else if (C17542s.e(tVar.d(i10), obj)) {
                    break;
                } else {
                    i10++;
                }
            }
            return Integer.valueOf(i10);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f18362c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar) {
            super(0);
            this.f18362c = gVar;
        }

        /* renamed from: b */
        public final Float invoke() {
            return Float.valueOf(this.f18362c.f18353o.getScrollOffset());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f18363c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(g gVar) {
            super(0);
            this.f18363c = gVar;
        }

        /* renamed from: b */
        public final Float invoke() {
            return Float.valueOf(this.f18363c.f18353o.getMaxScrollOffset());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "", "a", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements C17642l<Integer, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f18364c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", l = {205}, m = "invokeSuspend")
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f18365c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ g f18366d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f18367e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar, int i10, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f18366d = gVar;
                this.f18367e = i10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f18366d, this.f18367e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f18365c;
                if (i10 == 0) {
                    y.b(obj);
                    LazyLayoutSemanticState D22 = this.f18366d.f18353o;
                    int i11 = this.f18367e;
                    this.f18365c = 1;
                    if (D22.scrollToItem(i11, this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(g gVar) {
            super(1);
            this.f18364c = gVar;
        }

        public final Boolean a(int i10) {
            t tVar = (t) this.f18364c.f18352n.invoke();
            if (i10 < 0 || i10 >= tVar.a()) {
                throw new IllegalArgumentException(("Can't scroll to index " + i10 + ", it is out of bounds [0, " + tVar.a() + ')').toString());
            }
            F0 unused = C16314k.d(this.f18364c.c2(), (C17168i) null, (T) null, new a(this.f18364c, i10, (C17164e<? super a>) null), 3, (Object) null);
            return Boolean.TRUE;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public g(C17631a<? extends t> aVar, LazyLayoutSemanticState lazyLayoutSemanticState, v vVar, boolean z10, boolean z11) {
        this.f18352n = aVar;
        this.f18353o = lazyLayoutSemanticState;
        this.f18354p = vVar;
        this.f18355q = z10;
        this.f18356r = z11;
        H2();
    }

    private final L1.b E2() {
        return this.f18353o.collectionInfo();
    }

    private final boolean F2() {
        return this.f18354p == v.Vertical;
    }

    private final void H2() {
        this.f18357s = new j(new c(this), new d(this), this.f18356r);
        this.f18359u = this.f18355q ? new e(this) : null;
    }

    public final void G2(C17631a<? extends t> aVar, LazyLayoutSemanticState lazyLayoutSemanticState, v vVar, boolean z10, boolean z11) {
        this.f18352n = aVar;
        this.f18353o = lazyLayoutSemanticState;
        if (this.f18354p != vVar) {
            this.f18354p = vVar;
            x0.b(this);
        }
        if (this.f18355q != z10 || this.f18356r != z11) {
            this.f18355q = z10;
            this.f18356r = z11;
            H2();
            x0.b(this);
        }
    }

    public boolean h2() {
        return false;
    }

    public void m0(x xVar) {
        L1.v.A0(xVar, true);
        L1.v.w(xVar, this.f18358t);
        if (F2()) {
            j jVar = this.f18357s;
            if (jVar == null) {
                C17542s.z("scrollAxisRange");
                jVar = null;
            }
            L1.v.C0(xVar, jVar);
        } else {
            j jVar2 = this.f18357s;
            if (jVar2 == null) {
                C17542s.z("scrollAxisRange");
                jVar2 = null;
            }
            L1.v.h0(xVar, jVar2);
        }
        C17642l<? super Integer, Boolean> lVar = this.f18359u;
        if (lVar != null) {
            L1.v.Y(xVar, (String) null, lVar, 1, (Object) null);
        }
        L1.v.s(xVar, (String) null, new a(this), 1, (Object) null);
        L1.v.a0(xVar, E2());
    }
}
