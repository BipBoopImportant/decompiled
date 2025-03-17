package com.ingka.ikea.informationmessage.impl;

import D2.d;
import QJ.Q;
import U0.C4889m;
import U0.C4895p;
import XH.C16796C;
import XH.C16807N;
import XH.y;
import com.ingka.ikea.informationmessage.InformationMessageNavigation;
import com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import nI.C17631a;
import nI.p;
import uI.C18064m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/informationmessage/impl/InformationBottomSheetFragment;", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;", "<init>", "()V", "LXH/N;", "u0", "(LU0/m;I)V", "", "L0", "()Ljava/lang/Void;", "Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a;", "R", "LXo/a;", "K0", "()Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a;", "content", "S", "b", "informationmessage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InformationBottomSheetFragment extends BottomSheetComposeDialogFragment {

    /* renamed from: S  reason: collision with root package name */
    public static final b f96148S = new b((DefaultConstructorMarker) null);

    /* renamed from: T  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f96149T = {P.h(new G(InformationBottomSheetFragment.class, "content", "getContent()Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$BottomSheetContent;", 0))};

    /* renamed from: U  reason: collision with root package name */
    public static final int f96150U = Xo.a.f89218b;

    /* renamed from: R  reason: collision with root package name */
    private final Xo.a f96151R = new Xo.a("content_key");

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.informationmessage.impl.InformationBottomSheetFragment$BottomSheetContent$2$1", f = "InformationBottomSheetFragment.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f96152c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ InformationBottomSheetFragment f96153d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(InformationBottomSheetFragment informationBottomSheetFragment, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f96153d = informationBottomSheetFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f96153d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f96152c == 0) {
                y.b(obj);
                this.f96153d.x0();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/informationmessage/impl/InformationBottomSheetFragment$b;", "", "<init>", "()V", "Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a;", "content", "Lcom/ingka/ikea/informationmessage/impl/InformationBottomSheetFragment;", "a", "(Lcom/ingka/ikea/informationmessage/InformationMessageNavigation$Data$a;)Lcom/ingka/ikea/informationmessage/impl/InformationBottomSheetFragment;", "", "CONTENT_KEY", "Ljava/lang/String;", "informationmessage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InformationBottomSheetFragment a(InformationMessageNavigation.Data.a aVar) {
            C17542s.j(aVar, "content");
            InformationBottomSheetFragment informationBottomSheetFragment = new InformationBottomSheetFragment();
            informationBottomSheetFragment.setArguments(d.b(C16796C.a("content_key", aVar)));
            return informationBottomSheetFragment;
        }

        private b() {
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N I0(InformationBottomSheetFragment informationBottomSheetFragment) {
        informationBottomSheetFragment.w0();
        return C16807N.f139792a;
    }

    private final InformationMessageNavigation.Data.a K0() {
        return (InformationMessageNavigation.Data.a) this.f96151R.a(this, f96149T[0]);
    }

    public /* bridge */ /* synthetic */ BottomSheetComposeDialogFragment.a D0() {
        return (BottomSheetComposeDialogFragment.a) L0();
    }

    /* access modifiers changed from: protected */
    public Void L0() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(-675543509);
        if (C4895p.J()) {
            C4895p.S(-675543509, i10, -1, "com.ingka.ikea.informationmessage.impl.InformationBottomSheetFragment.BottomSheetContent (InformationBottomSheetFragment.kt:22)");
        }
        InformationMessageNavigation.Data.a K02 = K0();
        mVar.W(-492731033);
        int i11 = (i10 & 14) ^ 6;
        boolean z10 = true;
        boolean z11 = (i11 > 4 && mVar.F(this)) || (i10 & 6) == 4;
        Object D10 = mVar.D();
        if (z11 || D10 == C4889m.f14007a.a()) {
            D10 = new Rs.a(this);
            mVar.u(D10);
        }
        mVar.P();
        Ss.b.b(K02, (C17631a) D10, mVar, 0);
        C16807N n10 = C16807N.f139792a;
        mVar.W(-492728034);
        if ((i11 <= 4 || !mVar.F(this)) && (i10 & 6) != 4) {
            z10 = false;
        }
        Object D11 = mVar.D();
        if (z10 || D11 == C4889m.f14007a.a()) {
            D11 = new a(this, (C17164e<? super a>) null);
            mVar.u(D11);
        }
        mVar.P();
        U0.P.g(n10, (p) D11, mVar, 6);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}
