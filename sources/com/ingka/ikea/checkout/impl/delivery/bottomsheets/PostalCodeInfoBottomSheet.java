package com.ingka.ikea.checkout.impl.delivery.bottomsheets;

import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16796C;
import XH.C16807N;
import Yn.k0;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.fragment.app.C5197z;
import c1.c;
import com.ingka.ikea.checkout.impl.delivery.bottomsheets.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/PostalCodeInfoBottomSheet;", "Lcom/ingka/ikea/core/android/fragments/BaseBottomSheetDialogFragment;", "<init>", "()V", "LXH/N;", "y0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "O", "a", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PostalCodeInfoBottomSheet extends d {

    /* renamed from: O  reason: collision with root package name */
    public static final a f94506O = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/PostalCodeInfoBottomSheet$a;", "", "<init>", "()V", "Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/PostalCodeInfoBottomSheet;", "a", "()Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/PostalCodeInfoBottomSheet;", "", "TAG", "Ljava/lang/String;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PostalCodeInfoBottomSheet a() {
            return new PostalCodeInfoBottomSheet();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PostalCodeInfoBottomSheet f94507a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ PostalCodeInfoBottomSheet f94508a;

            a(PostalCodeInfoBottomSheet postalCodeInfoBottomSheet) {
                this.f94508a = postalCodeInfoBottomSheet;
            }

            /* access modifiers changed from: private */
            public static final C16807N e(PostalCodeInfoBottomSheet postalCodeInfoBottomSheet) {
                postalCodeInfoBottomSheet.y0();
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N f(PostalCodeInfoBottomSheet postalCodeInfoBottomSheet) {
                postalCodeInfoBottomSheet.dismiss();
                return C16807N.f139792a;
            }

            public final void c(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-114940527, i10, -1, "com.ingka.ikea.checkout.impl.delivery.bottomsheets.PostalCodeInfoBottomSheet.onCreateView.<anonymous>.<anonymous>.<anonymous> (PostalCodeInfoBottomSheet.kt:36)");
                    }
                    mVar.W(-319207671);
                    boolean V10 = mVar.V(this.f94508a);
                    PostalCodeInfoBottomSheet postalCodeInfoBottomSheet = this.f94508a;
                    Object D10 = mVar.D();
                    if (V10 || D10 == C4889m.f14007a.a()) {
                        D10 = new h(postalCodeInfoBottomSheet);
                        mVar.u(D10);
                    }
                    C17631a aVar = (C17631a) D10;
                    mVar.P();
                    mVar.W(-319203970);
                    boolean V11 = mVar.V(this.f94508a);
                    PostalCodeInfoBottomSheet postalCodeInfoBottomSheet2 = this.f94508a;
                    Object D11 = mVar.D();
                    if (V11 || D11 == C4889m.f14007a.a()) {
                        D11 = new i(postalCodeInfoBottomSheet2);
                        mVar.u(D11);
                    }
                    mVar.P();
                    k0.b(aVar, (C17631a) D11, mVar, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                c((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        b(PostalCodeInfoBottomSheet postalCodeInfoBottomSheet) {
            this.f94507a = postalCodeInfoBottomSheet;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1875702692, i10, -1, "com.ingka.ikea.checkout.impl.delivery.bottomsheets.PostalCodeInfoBottomSheet.onCreateView.<anonymous>.<anonymous> (PostalCodeInfoBottomSheet.kt:35)");
                }
                e.c((d) null, c.e(-114940527, true, new a(this.f94507a), mVar, 54), mVar, 48, 1);
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

    /* access modifiers changed from: private */
    public final void y0() {
        C5197z.c(this, "PostalCodeInfoBottomSheetResultRequestKey", D2.d.b(C16796C.a("PostalCodeInfoBottomSheetResultBundleKey", g.a.f94548a)));
        dismiss();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(s1.d.f19581b);
        composeView.setContent(c.c(1875702692, true, new b(this)));
        return composeView;
    }
}
