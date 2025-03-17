package com.ingka.ikea.scanandgo.dialog.termsandconditions;

import Lg.d;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.C5197z;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import wz.C15196a;
import wz.C15197b;
import xz.c;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0019B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR+\u0010\u0017\u001a\u0012\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u0011\u0018\u00010\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/ingka/ikea/scanandgo/dialog/termsandconditions/TermsAndConditionsBottomSheetDialog;", "Lcom/ingka/ikea/app/uicomponents/fragment/DelegateBottomSheet;", "<init>", "()V", "LXH/N;", "J0", "F0", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LLg/d;", "y0", "()LLg/d;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "kotlin.jvm.PlatformType", "T", "LXH/o;", "H0", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "behavior", "U", "a", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TermsAndConditionsBottomSheetDialog extends Hilt_TermsAndConditionsBottomSheetDialog {

    /* renamed from: U  reason: collision with root package name */
    public static final a f120191U = new a((DefaultConstructorMarker) null);

    /* renamed from: X  reason: collision with root package name */
    public static final int f120192X = 8;

    /* renamed from: T  reason: collision with root package name */
    private final C16824o f120193T = C16825p.b(new C15196a(this));

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/scanandgo/dialog/termsandconditions/TermsAndConditionsBottomSheetDialog$a;", "", "<init>", "()V", "", "FRAGMENT_RESULT_KEY", "Ljava/lang/String;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void F0() {
        Bundle bundle = Bundle.EMPTY;
        C17542s.i(bundle, "EMPTY");
        C5197z.c(this, "TACBSD_fragment_result_key", bundle);
        dismiss();
    }

    /* access modifiers changed from: private */
    public static final BottomSheetBehavior G0(TermsAndConditionsBottomSheetDialog termsAndConditionsBottomSheetDialog) {
        Dialog dialog = termsAndConditionsBottomSheetDialog.getDialog();
        com.google.android.material.bottomsheet.a aVar = dialog instanceof com.google.android.material.bottomsheet.a ? (com.google.android.material.bottomsheet.a) dialog : null;
        if (aVar != null) {
            return aVar.o();
        }
        return null;
    }

    private final BottomSheetBehavior<FrameLayout> H0() {
        return (BottomSheetBehavior) this.f120193T.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N I0(TermsAndConditionsBottomSheetDialog termsAndConditionsBottomSheetDialog) {
        termsAndConditionsBottomSheetDialog.F0();
        return C16807N.f139792a;
    }

    private final void J0() {
        d.q(A0(), C16877v.e(xz.d.f132132a), false, (C17642l) null, 6, (Object) null);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        J0();
        BottomSheetBehavior<FrameLayout> H02 = H0();
        if (H02 != null) {
            H02.W0(true);
        }
        BottomSheetBehavior<FrameLayout> H03 = H0();
        if (H03 != null) {
            H03.X0(3);
        }
    }

    /* access modifiers changed from: protected */
    public d y0() {
        return new d((Lg.a<?>[]) new Lg.a[]{new c(new C15197b(this))});
    }
}
