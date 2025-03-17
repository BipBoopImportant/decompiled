package com.ingka.ikea.whatsnew.impl.presentation.fragment;

import KJ.C15985a;
import KJ.C15987c;
import QJ.Q;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.J0;
import U0.P;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import YH.C16877v;
import ZC.C13892o;
import aE.C13936q;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import cE.C14033a;
import cE.C14034b;
import cE.C14035c;
import com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import l3.a;
import nI.C17631a;
import nI.p;
import uI.C18059h;
import x3.r;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u0002"}, d2 = {"Lcom/ingka/ikea/whatsnew/impl/presentation/fragment/WhatsNewBottomSheet;", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;", "<init>", "()V", "LXH/N;", "u0", "(LU0/m;I)V", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "D0", "()Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "LcE/c;", "U", "LXH/o;", "N0", "()LcE/c;", "viewModel", "Lx3/r;", "X", "Lx3/r;", "M0", "()Lx3/r;", "setSimpleCache", "(Lx3/r;)V", "simpleCache", "LcE/a;", "whatsNewMessages", "whatsnew-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WhatsNewBottomSheet extends a {

    /* renamed from: U  reason: collision with root package name */
    private final C16824o f120722U;

    /* renamed from: X  reason: collision with root package name */
    public r f120723X;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.whatsnew.impl.presentation.fragment.WhatsNewBottomSheet$BottomSheetContent$1$1", f = "WhatsNewBottomSheet.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f120724c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ WhatsNewBottomSheet f120725d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(WhatsNewBottomSheet whatsNewBottomSheet, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f120725d = whatsNewBottomSheet;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f120725d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f120724c == 0) {
                y.b(obj);
                this.f120725d.w0();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14033a f120726a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WhatsNewBottomSheet f120727b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<C14033a> f120728c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends C17540p implements C17631a<C16807N> {
            a(Object obj) {
                super(0, obj, WhatsNewBottomSheet.class, "dismissBottomSheet", "dismissBottomSheet()V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                t();
                return C16807N.f139792a;
            }

            public final void t() {
                ((WhatsNewBottomSheet) this.receiver).w0();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.whatsnew.impl.presentation.fragment.WhatsNewBottomSheet$BottomSheetContent$2$2$1", f = "WhatsNewBottomSheet.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.ingka.ikea.whatsnew.impl.presentation.fragment.WhatsNewBottomSheet$b$b  reason: collision with other inner class name */
        static final class C3010b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f120729c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ WhatsNewBottomSheet f120730d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C14033a f120731e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3010b(WhatsNewBottomSheet whatsNewBottomSheet, C14033a aVar, C17164e<? super C3010b> eVar) {
                super(2, eVar);
                this.f120730d = whatsNewBottomSheet;
                this.f120731e = aVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C3010b(this.f120730d, this.f120731e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C3010b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f120729c == 0) {
                    y.b(obj);
                    this.f120730d.x0();
                    C14035c L02 = this.f120730d.N0();
                    Iterable<C14034b> a10 = ((C14033a.c) this.f120731e).a();
                    ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
                    for (C14034b d10 : a10) {
                        arrayList.add(d10.d());
                    }
                    L02.D(arrayList);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        b(C14033a aVar, WhatsNewBottomSheet whatsNewBottomSheet, A1<? extends C14033a> a12) {
            this.f120726a = aVar;
            this.f120727b = whatsNewBottomSheet;
            this.f120728c = a12;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1572659755, i10, -1, "com.ingka.ikea.whatsnew.impl.presentation.fragment.WhatsNewBottomSheet.BottomSheetContent.<anonymous> (WhatsNewBottomSheet.kt:48)");
                }
                C15987c h10 = C15985a.h(((C14033a.c) this.f120726a).a());
                WhatsNewBottomSheet whatsNewBottomSheet = this.f120727b;
                mVar.W(1670321419);
                boolean F10 = mVar.F(whatsNewBottomSheet);
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new a(whatsNewBottomSheet);
                    mVar.u(D10);
                }
                mVar.P();
                C13936q.G(h10, (C17631a) ((C18059h) D10), mVar, 0);
                C14033a I02 = WhatsNewBottomSheet.H0(this.f120728c);
                mVar.W(1670324660);
                boolean F11 = mVar.F(this.f120727b) | mVar.V(this.f120726a);
                WhatsNewBottomSheet whatsNewBottomSheet2 = this.f120727b;
                C14033a aVar = this.f120726a;
                Object D11 = mVar.D();
                if (F11 || D11 == C4889m.f14007a.a()) {
                    D11 = new C3010b(whatsNewBottomSheet2, aVar, (C17164e<? super C3010b>) null);
                    mVar.u(D11);
                }
                mVar.P();
                P.g(I02, (p) D11, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f120732c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f120732c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f120732c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f120733c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f120733c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f120733c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f120734c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f120734c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f120734c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f120735c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f120736d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f120735c = aVar;
            this.f120736d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f120735c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f120736d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f120737c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f120738d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f120737c = oVar;
            this.f120738d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f120738d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f120737c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public WhatsNewBottomSheet() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f120722U = W.b(this, kotlin.jvm.internal.P.b(C14035c.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C14033a H0(A1<? extends C14033a> a12) {
        return (C14033a) a12.getValue();
    }

    /* access modifiers changed from: private */
    public final C14035c N0() {
        return (C14035c) this.f120722U.getValue();
    }

    /* access modifiers changed from: protected */
    public BottomSheetComposeDialogFragment.a D0() {
        return null;
    }

    public final r M0() {
        r rVar = this.f120723X;
        if (rVar != null) {
            return rVar;
        }
        C17542s.z("simpleCache");
        return null;
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(-1155656875);
        if (C4895p.J()) {
            C4895p.S(-1155656875, i10, -1, "com.ingka.ikea.whatsnew.impl.presentation.fragment.WhatsNewBottomSheet.BottomSheetContent (WhatsNewBottomSheet.kt:34)");
        }
        A1<C14033a> c10 = j3.a.c(N0().C(), (C5221y) null, (r.b) null, (C17168i) null, mVar, 0, 7);
        C14033a H02 = H0(c10);
        if (C17542s.e(H02, C14033a.b.f119119a)) {
            mVar.W(-1310833990);
            mVar.P();
        } else if (C17542s.e(H02, C14033a.C2978a.f119118a)) {
            mVar.W(-1310737363);
            C14033a H03 = H0(c10);
            mVar.W(-596469612);
            boolean F10 = mVar.F(this);
            Object D10 = mVar.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new a(this, (C17164e<? super a>) null);
                mVar.u(D10);
            }
            mVar.P();
            P.g(H03, (p) D10, mVar, 0);
            mVar.P();
        } else if (H02 instanceof C14033a.c) {
            mVar.W(-1310549131);
            C4910x.a(C13892o.H().d(M0()), c1.c.e(-1572659755, true, new b(H02, this, c10), mVar, 54), mVar, J0.f13770i | 48);
            mVar.P();
        } else {
            mVar.W(-596476195);
            mVar.P();
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}
