package com.ingka.ikea.app.scanandgoonlineredesign.dialog;

import D2.d;
import Fz.C12913c;
import G2.b;
import XH.C16796C;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ingka.ikea.core.android.fragments.BaseBottomSheetDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lj.C11538e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0003R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/ChildItemInfoWarningDialog;", "Lcom/ingka/ikea/core/android/fragments/BaseBottomSheetDialogFragment;", "<init>", "()V", "LXH/N;", "A0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/widget/LinearLayout;", "z0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/widget/LinearLayout;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "LFz/c;", "L", "LFz/c;", "_binding", "y0", "()LFz/c;", "binding", "M", "a", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChildItemInfoWarningDialog extends BaseBottomSheetDialogFragment {

    /* renamed from: M  reason: collision with root package name */
    public static final a f91313M = new a((DefaultConstructorMarker) null);

    /* renamed from: N  reason: collision with root package name */
    public static final int f91314N = 8;

    /* renamed from: L  reason: collision with root package name */
    private C12913c f91315L;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/ChildItemInfoWarningDialog$a;", "", "<init>", "()V", "", "availabilityText", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/ChildItemInfoWarningDialog;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/ChildItemInfoWarningDialog;", "TAG", "Ljava/lang/String;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChildItemInfoWarningDialog a(String str) {
            C17542s.j(str, "availabilityText");
            ChildItemInfoWarningDialog childItemInfoWarningDialog = new ChildItemInfoWarningDialog();
            childItemInfoWarningDialog.setArguments(d.b(C16796C.a("arg_availability_text", str)));
            return childItemInfoWarningDialog;
        }

        private a() {
        }
    }

    private final void A0() {
        C12913c y02 = y0();
        String string = requireArguments().getString("arg_availability_text");
        if (string != null) {
            y02.f110075b.setText(b.a(string, 0));
            y02.f110076c.setOnClickListener(new C11538e(this));
            return;
        }
        throw new IllegalArgumentException("This dialog needs to be created via newInstance method by passing a text");
    }

    /* access modifiers changed from: private */
    public static final void B0(ChildItemInfoWarningDialog childItemInfoWarningDialog, View view) {
        childItemInfoWarningDialog.dismiss();
    }

    private final C12913c y0() {
        C12913c cVar = this.f91315L;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void onDestroyView() {
        this.f91315L = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        A0();
    }

    /* renamed from: z0 */
    public LinearLayout onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C12913c c10 = C12913c.c(layoutInflater, viewGroup, false);
        this.f91315L = c10;
        LinearLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }
}
