package com.ingka.ikea.app.scanandgoonlineredesign.dialog;

import Fz.j;
import Lg.d;
import Vi.B;
import Vi.C;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5197z;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lj.C11543j;
import lj.C11544k;
import nI.C17642l;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 82\u00020\u0001:\u00019B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0003R\"\u0010!\u001a\u00020\u001a8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010)\u001a\u0012\u0012\f\u0012\n $*\u0004\u0018\u00010#0#\u0018\u00010\"8BX\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u00020*8BX\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u00020.8BX\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/EmailCollectionBottomSheetDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "LXH/N;", "D0", "", "email", "B0", "(Ljava/lang/String;)V", "", "C0", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "LSy/a;", "J", "LSy/a;", "x0", "()LSy/a;", "setAnalytics$scanandgo_implementation_release", "(LSy/a;)V", "analytics", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "kotlin.jvm.PlatformType", "K", "LXH/o;", "y0", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "behavior", "LFz/j;", "L", "LFz/j;", "_binding", "LLg/d;", "M", "LLg/d;", "_delegatingAdapter", "z0", "()LFz/j;", "binding", "A0", "()LLg/d;", "delegatingAdapter", "N", "a", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmailCollectionBottomSheetDialog extends Hilt_EmailCollectionBottomSheetDialog {

    /* renamed from: N  reason: collision with root package name */
    public static final a f91323N = new a((DefaultConstructorMarker) null);

    /* renamed from: O  reason: collision with root package name */
    public static final int f91324O = 8;

    /* renamed from: J  reason: collision with root package name */
    public Sy.a f91325J;

    /* renamed from: K  reason: collision with root package name */
    private final C16824o f91326K = C16825p.b(new C11544k(this));

    /* renamed from: L  reason: collision with root package name */
    private j f91327L;

    /* renamed from: M  reason: collision with root package name */
    private d f91328M;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/EmailCollectionBottomSheetDialog$a;", "", "<init>", "()V", "", "hasTerms", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/EmailCollectionBottomSheetDialog;", "a", "(Z)Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/EmailCollectionBottomSheetDialog;", "", "FRAGMENT_RESULT_KEY", "Ljava/lang/String;", "BUNDLE_EMAIL_KEY", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EmailCollectionBottomSheetDialog a(boolean z10) {
            EmailCollectionBottomSheetDialog emailCollectionBottomSheetDialog = new EmailCollectionBottomSheetDialog();
            emailCollectionBottomSheetDialog.setArguments(D2.d.b(C16796C.a("bundle-key-has-terms", Boolean.valueOf(z10))));
            return emailCollectionBottomSheetDialog;
        }

        private a() {
        }
    }

    private final d A0() {
        d dVar = this.f91328M;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void B0(String str) {
        C5197z.c(this, "REBSD_fragment_result_key", D2.d.b(C16796C.a("REBSD_result_email_key", str)));
        x0().a();
        dismiss();
    }

    private final boolean C0() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("bundle-key-has-terms");
        }
        return false;
    }

    private final void D0() {
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.f91328M = new d((Lg.a<?>[]) new Lg.a[]{new B(C5222z.a(viewLifecycleOwner), new C11543j(this))});
        RecyclerView recyclerView = z0().f110139c;
        recyclerView.setAdapter(A0());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        d.q(A0(), C16877v.e(new C(C0(), (String) null, 2, (DefaultConstructorMarker) null)), true, (C17642l) null, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N E0(EmailCollectionBottomSheetDialog emailCollectionBottomSheetDialog, String str) {
        C17542s.j(str, "email");
        emailCollectionBottomSheetDialog.B0(str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final BottomSheetBehavior w0(EmailCollectionBottomSheetDialog emailCollectionBottomSheetDialog) {
        Dialog dialog = emailCollectionBottomSheetDialog.getDialog();
        com.google.android.material.bottomsheet.a aVar = dialog instanceof com.google.android.material.bottomsheet.a ? (com.google.android.material.bottomsheet.a) dialog : null;
        if (aVar != null) {
            return aVar.o();
        }
        return null;
    }

    private final BottomSheetBehavior<FrameLayout> y0() {
        return (BottomSheetBehavior) this.f91326K.getValue();
    }

    private final j z0() {
        j jVar = this.f91327L;
        C17542s.g(jVar);
        return jVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        this.f91327L = j.c(layoutInflater, viewGroup, false);
        ConstraintLayout b10 = z0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        this.f91327L = null;
        this.f91328M = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        D0();
        BottomSheetBehavior<FrameLayout> y02 = y0();
        if (y02 != null) {
            y02.W0(true);
        }
        BottomSheetBehavior<FrameLayout> y03 = y0();
        if (y03 != null) {
            y03.X0(3);
        }
        x0().I();
    }

    public final Sy.a x0() {
        Sy.a aVar = this.f91325J;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("analytics");
        return null;
    }
}
