package com.ingka.ikea.enlargeimages.impl.presentation;

import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.J0;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import ZC.C13892o;
import android.os.Bundle;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.p;
import tq.h;
import tq.j;
import x3.r;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/enlargeimages/impl/presentation/EnlargeImageFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeDialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "onCreate", "(Landroid/os/Bundle;)V", "u0", "(LU0/m;I)V", "Lx3/r;", "Q", "Lx3/r;", "z0", "()Lx3/r;", "setSimpleCache", "(Lx3/r;)V", "simpleCache", "Ltq/j;", "R", "LXH/o;", "A0", "()Ltq/j;", "viewModel", "enlargeimages-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EnlargeImageFragment extends b {

    /* renamed from: Q  reason: collision with root package name */
    public r f95733Q;

    /* renamed from: R  reason: collision with root package name */
    private final C16824o f95734R;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EnlargeImageFragment f95735a;

        a(EnlargeImageFragment enlargeImageFragment) {
            this.f95735a = enlargeImageFragment;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(EnlargeImageFragment enlargeImageFragment) {
            enlargeImageFragment.dismiss();
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-381162550, i10, -1, "com.ingka.ikea.enlargeimages.impl.presentation.EnlargeImageFragment.DialogContent.<anonymous> (EnlargeImageFragment.kt:39)");
                }
                j y02 = this.f95735a.A0();
                mVar.W(-1198150401);
                boolean F10 = mVar.F(this.f95735a);
                EnlargeImageFragment enlargeImageFragment = this.f95735a;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new a(enlargeImageFragment);
                    mVar.u(D10);
                }
                mVar.P();
                h.i(y02, (C17631a) D10, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f95736c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f95736c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f95736c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f95737c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f95737c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f95737c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f95738c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f95738c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f95738c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f95739c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f95740d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f95739c = aVar;
            this.f95740d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f95739c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f95740d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f95741c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f95742d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f95741c = oVar;
            this.f95742d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f95742d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f95741c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public EnlargeImageFragment() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f95734R = W.b(this, P.b(j.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    /* access modifiers changed from: private */
    public final j A0() {
        return (j) this.f95734R.getValue();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, lg.f.f75301m);
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(-107902838);
        if (C4895p.J()) {
            C4895p.S(-107902838, i10, -1, "com.ingka.ikea.enlargeimages.impl.presentation.EnlargeImageFragment.DialogContent (EnlargeImageFragment.kt:37)");
        }
        C4910x.a(C13892o.H().d(z0()), c1.c.e(-381162550, true, new a(this), mVar, 54), mVar, J0.f13770i | 48);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    public final r z0() {
        r rVar = this.f95733Q;
        if (rVar != null) {
            return rVar;
        }
        C17542s.z("simpleCache");
        return null;
    }
}
