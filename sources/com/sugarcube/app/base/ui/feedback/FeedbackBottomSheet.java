package com.sugarcube.app.base.ui.feedback;

import Ea.C9072f;
import JF.Z;
import OE.n;
import QE.C13444v;
import XH.C16807N;
import XH.t;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar;
import com.sugarcube.common.R;
import fI.C17221b;
import j.C5443a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import wF.C15188a;
import wF.C15189b;
import wF.C15190c;
import wF.C15191d;
import wF.f;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0003-./B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u00060"}, d2 = {"Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "LXH/N;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "LQE/v;", "J", "LQE/v;", "binding", "Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;", "K", "Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;", "currentSmileRating", "", "L", "Ljava/lang/String;", "currentTextFeedback", "Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$OnFeedbackEnteredListener;", "M", "Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$OnFeedbackEnteredListener;", "listener", "Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$b;", "N", "Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$b;", "feedbackType", "O", "b", "OnFeedbackEnteredListener", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FeedbackBottomSheet extends Hilt_FeedbackBottomSheet {

    /* renamed from: O  reason: collision with root package name */
    public static final a f124149O = new a((DefaultConstructorMarker) null);

    /* renamed from: P  reason: collision with root package name */
    public static final int f124150P = 8;

    /* renamed from: J  reason: collision with root package name */
    private C13444v f124151J;

    /* renamed from: K  reason: collision with root package name */
    private FeedbackSmileRatingBar.a f124152K;
    /* access modifiers changed from: private */

    /* renamed from: L  reason: collision with root package name */
    public String f124153L;
    /* access modifiers changed from: private */

    /* renamed from: M  reason: collision with root package name */
    public OnFeedbackEnteredListener f124154M;
    /* access modifiers changed from: private */

    /* renamed from: N  reason: collision with root package name */
    public b f124155N;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$OnFeedbackEnteredListener;", "", "Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;", "smileRating", "", "feedback", "LXH/N;", "onFeedbackEntered", "(Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;Ljava/lang/String;)V", "onFeedbackDismissed", "()V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnFeedbackEnteredListener {
        void onFeedbackDismissed();

        void onFeedbackEntered(FeedbackSmileRatingBar.a aVar, String str);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$a;", "", "<init>", "()V", "Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$OnFeedbackEnteredListener;", "listener", "Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$b;", "feedbackType", "Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet;", "a", "(Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$OnFeedbackEnteredListener;Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$b;)Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet;", "", "TAG", "Ljava/lang/String;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FeedbackBottomSheet a(OnFeedbackEnteredListener onFeedbackEnteredListener, b bVar) {
            C17542s.j(onFeedbackEnteredListener, "listener");
            C17542s.j(bVar, "feedbackType");
            FeedbackBottomSheet feedbackBottomSheet = new FeedbackBottomSheet();
            feedbackBottomSheet.f124154M = onFeedbackEnteredListener;
            feedbackBottomSheet.f124155N = bVar;
            return feedbackBottomSheet;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$b;", "", "<init>", "(Ljava/lang/String;I)V", "FEEDBACK_CAPTURE", "FEEDBACK_DESIGN", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        FEEDBACK_CAPTURE,
        FEEDBACK_DESIGN;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f124156a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet$b[] r0 = com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet$b r1 = com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet.b.FEEDBACK_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet$b r1 = com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet.b.FEEDBACK_DESIGN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f124156a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet.c.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements C17642l<String, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FeedbackBottomSheet f124157a;

        d(FeedbackBottomSheet feedbackBottomSheet) {
            this.f124157a = feedbackBottomSheet;
        }

        public final void a(String str) {
            C17542s.j(str, "it");
            this.f124157a.f124153L = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"com/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$e", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "LXH/N;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextInputEditText f124158a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FeedbackBottomSheet f124159b;

        public e(TextInputEditText textInputEditText, FeedbackBottomSheet feedbackBottomSheet) {
            this.f124158a = textInputEditText;
            this.f124159b = feedbackBottomSheet;
        }

        public void afterTextChanged(Editable editable) {
            C17542s.g(this.f124158a);
            Z.h(this.f124158a, new d(this.f124159b));
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* access modifiers changed from: private */
    public static final void D0(DialogInterface dialogInterface) {
        C17542s.h(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        FrameLayout frameLayout = (FrameLayout) ((com.google.android.material.bottomsheet.a) dialogInterface).findViewById(C9072f.f59488f);
        if (frameLayout != null) {
            BottomSheetBehavior q02 = BottomSheetBehavior.q0(frameLayout);
            q02.W0(true);
            q02.X0(3);
        }
    }

    /* access modifiers changed from: private */
    public static final void E0(FeedbackBottomSheet feedbackBottomSheet, MaterialButton materialButton, View view) {
        FeedbackSmileRatingBar.a aVar = feedbackBottomSheet.f124152K;
        if (aVar != null) {
            materialButton.setOnClickListener((View.OnClickListener) null);
            OnFeedbackEnteredListener onFeedbackEnteredListener = feedbackBottomSheet.f124154M;
            if (onFeedbackEnteredListener != null) {
                onFeedbackEnteredListener.onFeedbackEntered(aVar, feedbackBottomSheet.f124153L);
            }
            C17542s.g(materialButton);
            Z.s(materialButton);
            materialButton.setText(materialButton.getContext().getString(n.f113309X3));
            materialButton.setIcon(C5443a.b(materialButton.getContext(), R.drawable.sc_ic_checkmark));
            materialButton.getHandler().postDelayed(new f(feedbackBottomSheet), TimeUnit.SECONDS.toMillis(2));
        }
    }

    /* access modifiers changed from: private */
    public static final void F0(FeedbackBottomSheet feedbackBottomSheet) {
        feedbackBottomSheet.dismiss();
    }

    /* access modifiers changed from: private */
    public static final boolean G0(C13444v vVar, View view, MotionEvent motionEvent) {
        vVar.f114734f.clearFocus();
        return false;
    }

    /* access modifiers changed from: private */
    public static final void H0(FeedbackBottomSheet feedbackBottomSheet, C13444v vVar, FeedbackSmileRatingBar.a aVar) {
        C17542s.j(aVar, "it");
        feedbackBottomSheet.f124152K = aVar;
        Group group = vVar.f114738j;
        if (group.getVisibility() != 0) {
            group.setVisibility(0);
        }
        vVar.f114737i.setEnabled(true);
    }

    /* access modifiers changed from: private */
    public static final void I0(C13444v vVar, TextInputEditText textInputEditText, View view, boolean z10) {
        vVar.f114735g.setCounterEnabled(z10);
        if (!z10) {
            C17542s.g(textInputEditText);
            Z.s(textInputEditText);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C17542s.h(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) onCreateDialog;
        aVar.setOnShowListener(new wF.e());
        return aVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C13444v c10 = C13444v.c(layoutInflater, viewGroup, false);
        this.f124151J = c10;
        if (c10 == null) {
            C17542s.z("binding");
            c10 = null;
        }
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C17542s.j(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        OnFeedbackEnteredListener onFeedbackEnteredListener = this.f124154M;
        if (onFeedbackEnteredListener != null) {
            onFeedbackEnteredListener.onFeedbackDismissed();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(View view, Bundle bundle) {
        int i10;
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        C13444v vVar = this.f124151J;
        if (vVar == null) {
            C17542s.z("binding");
            vVar = null;
        }
        vVar.getRoot().setOnTouchListener(new C15188a(vVar));
        b bVar = this.f124155N;
        if (bVar != null) {
            TextView textView = vVar.f114736h;
            int i11 = c.f124156a[bVar.ordinal()];
            if (i11 == 1) {
                i10 = n.f113303W3;
            } else if (i11 == 2) {
                i10 = n.f113297V3;
            } else {
                throw new t();
            }
            textView.setText(i10);
        }
        vVar.f114733e.setListener(new C15189b(this, vVar));
        TextInputEditText textInputEditText = vVar.f114734f;
        textInputEditText.setImeOptions(6);
        textInputEditText.setRawInputType(1);
        C17542s.g(textInputEditText);
        textInputEditText.addTextChangedListener(new e(textInputEditText, this));
        textInputEditText.setOnFocusChangeListener(new C15190c(vVar, textInputEditText));
        MaterialButton materialButton = vVar.f114737i;
        materialButton.setOnClickListener(new C15191d(this, materialButton));
    }
}
