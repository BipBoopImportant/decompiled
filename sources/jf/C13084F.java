package JF;

import Ea.C9072f;
import I2.C0;
import I2.C4626o0;
import I2.b1;
import Ma.C9140b;
import OE.C13316h;
import OE.n;
import QE.C13429f;
import QE.N;
import XH.C16807N;
import XH.v;
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.c;
import androidx.lifecycle.r;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.sugarcube.app.base.ui.dialog.ExitDialog;
import com.sugarcube.app.base.ui.dialog.a;
import com.sugarcube.app.base.ui.feedback.FeedbackBottomSheet;
import com.sugarcube.app.base.ui.feedback.FeedbackDialog;
import com.sugarcube.common.R;
import com.sugarcube.core.logger.AnyKt;
import j.C5443a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0001\u0010\u000e\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u00070\u00062\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001aE\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012\u001ac\u0010\u0013\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u00062\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014\u001ac\u0010\u0018\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u00062\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0011\u0010\u001a\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0001\u0010\"\u001a\u0004\u0018\u00010!*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0005\u001a\u00020\u00012\u001c\b\u0002\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n\u0018\u00010\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00152\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n\u0018\u00010\u00062\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\"\u0010#\u001a7\u0010,\u001a\u00020+*\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\b\b\u0003\u0010(\u001a\u00020\u00152\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b,\u0010-\u001a!\u00102\u001a\u00020\b*\u00020.2\u0006\u0010'\u001a\u00020/2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103\u001a!\u00106\u001a\u000205*\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u000204¢\u0006\u0004\b6\u00107\u001a!\u00109\u001a\u000205*\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u000208¢\u0006\u0004\b9\u0010:\u001a!\u0010<\u001a\u000205*\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020;¢\u0006\u0004\b<\u0010=\u001a\u0019\u0010@\u001a\u00020\b*\u00020>2\u0006\u0010?\u001a\u00020\u0015¢\u0006\u0004\b@\u0010A¨\u0006B"}, d2 = {"Landroid/app/Activity;", "", "title", "defaultText", "hintText", "message", "LXH/v;", "Lkotlin/Function1;", "LXH/N;", "ok", "Lkotlin/Function0;", "cancel", "", "cancelable", "B", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LXH/v;LXH/v;Z)V", "Landroidx/appcompat/app/c;", "k", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;LXH/v;Z)Landroidx/appcompat/app/c;", "m", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;LXH/v;LXH/v;Z)V", "", "titleResId", "messageResId", "l", "(Landroid/app/Activity;IILXH/v;LXH/v;Z)V", "j", "(Landroid/app/Activity;)V", "", "icon", "isCancelledOnTouchOutside", "Landroid/content/DialogInterface$OnDismissListener;", "onDismissListener", "Landroid/app/Dialog;", "x", "(Landroid/app/Activity;Ljava/lang/Integer;Ljava/lang/String;LXH/v;ILXH/v;ZLandroid/content/DialogInterface$OnDismissListener;)Landroid/app/Dialog;", "Ljava/util/Locale;", "locale", "Lcom/sugarcube/app/base/ui/feedback/FeedbackDialog$OnFeedbackEnteredListener;", "listener", "gravity", "Lcom/sugarcube/app/base/ui/dialog/a$b;", "offset", "Lcom/sugarcube/app/base/ui/feedback/FeedbackDialog;", "G", "(Landroid/app/Activity;Ljava/util/Locale;Lcom/sugarcube/app/base/ui/feedback/FeedbackDialog$OnFeedbackEnteredListener;ILcom/sugarcube/app/base/ui/dialog/a$b;)Lcom/sugarcube/app/base/ui/feedback/FeedbackDialog;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$OnFeedbackEnteredListener;", "Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$b;", "feedbackType", "t", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$OnFeedbackEnteredListener;Lcom/sugarcube/app/base/ui/feedback/FeedbackBottomSheet$b;)V", "Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnExitConfirmationInteractionsListener;", "Lcom/sugarcube/app/base/ui/dialog/ExitDialog;", "w", "(Landroid/app/Activity;Ljava/util/Locale;Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnExitConfirmationInteractionsListener;)Lcom/sugarcube/app/base/ui/dialog/ExitDialog;", "Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnSaveInteractionsListener;", "v", "(Landroid/app/Activity;Ljava/util/Locale;Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnSaveInteractionsListener;)Lcom/sugarcube/app/base/ui/dialog/ExitDialog;", "Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnLoginInteractionsListener;", "u", "(Landroid/app/Activity;Ljava/util/Locale;Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnLoginInteractionsListener;)Lcom/sugarcube/app/base/ui/dialog/ExitDialog;", "Lcom/google/android/material/bottomsheet/a;", "wrapHeight", "i", "(Lcom/google/android/material/bottomsheet/a;I)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: JF.F  reason: case insensitive filesystem */
public final class C13084F {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "LXH/N;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: JF.F$a */
    public static final class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f111288a;

        public a(c cVar) {
            this.f111288a = cVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f111288a.j(-1).setEnabled(true);
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* access modifiers changed from: private */
    public static final void A(v vVar, O o10, View view) {
        ((C17631a) vVar.d()).invoke();
        Dialog dialog = (Dialog) o10.f144348a;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public static final void B(Activity activity, String str, String str2, String str3, String str4, v<String, ? extends C17642l<? super String, C16807N>> vVar, v<String, ? extends C17631a<C16807N>> vVar2, boolean z10) {
        C17542s.j(activity, "<this>");
        C17542s.j(str, "title");
        C17542s.j(vVar, "ok");
        O o10 = new O();
        C13429f c10 = C13429f.c(LayoutInflater.from(activity));
        LinearLayout b10 = c10.getRoot();
        b10.setOnClickListener(new C13118z(b10, o10));
        T t10 = c10.f114566c;
        t10.setText(str2);
        t10.setHint(str3);
        o10.f144348a = t10;
        TextView textView = c10.f114565b;
        if (str4 != null) {
            textView.setText(str4);
        } else {
            textView.setVisibility(8);
        }
        C17542s.i(c10, "apply(...)");
        C9140b bVar = new C9140b(activity, R.style.AlertDialogTheme);
        bVar.setTitle(str);
        bVar.u(z10);
        bVar.setView(c10.getRoot());
        bVar.l(vVar.c(), new C13079A(vVar, o10));
        if (vVar2 != null) {
            bVar.g(vVar2.c(), new C13080B(vVar2));
        }
        c create = bVar.create();
        Window window = create.getWindow();
        if (window != null) {
            window.setSoftInputMode(32);
            b1 a10 = C4626o0.a(window, window.getDecorView());
            C17542s.i(a10, "getInsetsController(...)");
            a10.e(2);
            a10.a(C0.l.f());
        }
        TextView textView2 = (TextView) o10.f144348a;
        if (textView2 != null) {
            textView2.addTextChangedListener(new a(create));
        }
        create.show();
    }

    public static /* synthetic */ void C(Activity activity, String str, String str2, String str3, String str4, v vVar, v vVar2, boolean z10, int i10, Object obj) {
        B(activity, str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, str4, vVar, vVar2, (i10 & 64) != 0 ? false : z10);
    }

    /* access modifiers changed from: private */
    public static final void D(v vVar, O o10, DialogInterface dialogInterface, int i10) {
        C17642l lVar = (C17642l) vVar.d();
        TextView textView = (TextView) o10.f144348a;
        lVar.invoke(String.valueOf(textView != null ? textView.getText() : null));
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void E(v vVar, DialogInterface dialogInterface, int i10) {
        ((C17631a) vVar.d()).invoke();
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void F(LinearLayout linearLayout, O o10, View view) {
        C17542s.g(linearLayout);
        Z.s(linearLayout);
        TextView textView = (TextView) o10.f144348a;
        if (textView != null) {
            textView.clearFocus();
        }
        linearLayout.requestFocus();
    }

    public static final FeedbackDialog G(Activity activity, Locale locale, FeedbackDialog.OnFeedbackEnteredListener onFeedbackEnteredListener, int i10, a.b bVar) {
        C17542s.j(activity, "<this>");
        C17542s.j(locale, "locale");
        C17542s.j(onFeedbackEnteredListener, "listener");
        FeedbackDialog feedbackDialog = new FeedbackDialog(activity, locale, i10, bVar, onFeedbackEnteredListener);
        feedbackDialog.show();
        return feedbackDialog;
    }

    public static /* synthetic */ FeedbackDialog H(Activity activity, Locale locale, FeedbackDialog.OnFeedbackEnteredListener onFeedbackEnteredListener, int i10, a.b bVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 8388693;
        }
        if ((i11 & 8) != 0) {
            bVar = null;
        }
        return G(activity, locale, onFeedbackEnteredListener, i10, bVar);
    }

    public static final void i(com.google.android.material.bottomsheet.a aVar, int i10) {
        C17542s.j(aVar, "<this>");
        DisplayMetrics displayMetrics = aVar.getContext().getResources().getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        int i11 = displayMetrics.heightPixels;
        Integer valueOf = Integer.valueOf(i11 - (aVar.getContext().getTheme().resolveAttribute(16843499, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, displayMetrics) : 0));
        if (i10 <= valueOf.intValue()) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : i10;
        float f10 = (((float) intValue) * 1.0f) / ((float) i11);
        if (f10 <= 0.0f || f10 >= 1.0f) {
            f10 = 0.5f;
        }
        FrameLayout frameLayout = (FrameLayout) aVar.findViewById(C9072f.f59488f);
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.height = intValue;
            if (intValue == i10) {
                frameLayout.setY(frameLayout.getY() + ((float) 24));
            }
            frameLayout.setLayoutParams(layoutParams);
        }
        BottomSheetBehavior<FrameLayout> o10 = aVar.o();
        o10.X0(6);
        o10.W0(true);
        o10.O0(f10);
    }

    public static final void j(Activity activity) {
        C17542s.j(activity, "<this>");
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(activity.getString(n.f113364f5))));
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(activity.getString(n.f113371g5))));
        }
    }

    public static final c k(Activity activity, String str, String str2, v<String, ? extends C17631a<C16807N>> vVar, boolean z10) {
        C17542s.j(activity, "<this>");
        C17542s.j(str, "title");
        C17542s.j(str2, "message");
        C17542s.j(vVar, "ok");
        C9140b G10 = new C9140b(activity, R.style.AlertDialogTheme).setTitle(str).f(str2).u(z10).l(vVar.c(), new C13083E(vVar));
        C17542s.i(G10, "setPositiveButton(...)");
        c create = G10.create();
        C17542s.i(create, "create(...)");
        return create;
    }

    public static final void l(Activity activity, int i10, int i11, v<String, ? extends C17631a<C16807N>> vVar, v<String, ? extends C17631a<C16807N>> vVar2, boolean z10) {
        C17542s.j(activity, "<this>");
        C17542s.j(vVar, "ok");
        String string = activity.getString(i10);
        C17542s.i(string, "getString(...)");
        String string2 = activity.getString(i11);
        C17542s.i(string2, "getString(...)");
        m(activity, string, string2, vVar, vVar2, z10);
    }

    public static final void m(Activity activity, String str, String str2, v<String, ? extends C17631a<C16807N>> vVar, v<String, ? extends C17631a<C16807N>> vVar2, boolean z10) {
        C17542s.j(activity, "<this>");
        C17542s.j(str, "title");
        C17542s.j(str2, "message");
        C17542s.j(vVar, "ok");
        C9140b G10 = new C9140b(activity, R.style.AlertDialogTheme).setTitle(str).f(str2).u(z10).l(vVar.c(), new C13116x(vVar));
        C17542s.i(G10, "setPositiveButton(...)");
        if (vVar2 != null) {
            G10.g(vVar2.c(), new C13117y(vVar2));
        }
        G10.create().show();
    }

    public static /* synthetic */ c n(Activity activity, String str, String str2, v vVar, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return k(activity, str, str2, vVar, z10);
    }

    public static /* synthetic */ void o(Activity activity, int i10, int i11, v vVar, v vVar2, boolean z10, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            vVar2 = null;
        }
        v vVar3 = vVar2;
        if ((i12 & 16) != 0) {
            z10 = false;
        }
        l(activity, i10, i11, vVar, vVar3, z10);
    }

    public static /* synthetic */ void p(Activity activity, String str, String str2, v vVar, v vVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            vVar2 = null;
        }
        v vVar3 = vVar2;
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        m(activity, str, str2, vVar, vVar3, z10);
    }

    /* access modifiers changed from: private */
    public static final void q(v vVar, DialogInterface dialogInterface, int i10) {
        ((C17631a) vVar.d()).invoke();
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void r(v vVar, DialogInterface dialogInterface, int i10) {
        ((C17631a) vVar.d()).invoke();
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void s(v vVar, DialogInterface dialogInterface, int i10) {
        ((C17631a) vVar.d()).invoke();
        dialogInterface.dismiss();
    }

    public static final void t(AppCompatActivity appCompatActivity, FeedbackBottomSheet.OnFeedbackEnteredListener onFeedbackEnteredListener, FeedbackBottomSheet.b bVar) {
        C17542s.j(appCompatActivity, "<this>");
        C17542s.j(onFeedbackEnteredListener, "listener");
        C17542s.j(bVar, "feedbackType");
        if (appCompatActivity.getLifecycle().d().b(r.b.RESUMED)) {
            FeedbackBottomSheet.f124149O.a(onFeedbackEnteredListener, bVar).show(appCompatActivity.getSupportFragmentManager(), "FeedbackBottomSheet");
        } else {
            Log.d(AnyKt.SUGARCUBE_TAG, "Can not show feedback prompt (activity not RESUMED)");
        }
    }

    public static final ExitDialog u(Activity activity, Locale locale, ExitDialog.OnLoginInteractionsListener onLoginInteractionsListener) {
        C17542s.j(activity, "<this>");
        C17542s.j(locale, "locale");
        C17542s.j(onLoginInteractionsListener, "listener");
        ExitDialog exitDialog = new ExitDialog(activity, locale, 0, ExitDialog.a.LOGIN, (ExitDialog.OnExitConfirmationInteractionsListener) null, (ExitDialog.OnSaveInteractionsListener) null, onLoginInteractionsListener, 52, (DefaultConstructorMarker) null);
        exitDialog.show();
        return exitDialog;
    }

    public static final ExitDialog v(Activity activity, Locale locale, ExitDialog.OnSaveInteractionsListener onSaveInteractionsListener) {
        C17542s.j(activity, "<this>");
        C17542s.j(locale, "locale");
        C17542s.j(onSaveInteractionsListener, "listener");
        ExitDialog exitDialog = new ExitDialog(activity, locale, 0, ExitDialog.a.SAVE, (ExitDialog.OnExitConfirmationInteractionsListener) null, onSaveInteractionsListener, (ExitDialog.OnLoginInteractionsListener) null, 84, (DefaultConstructorMarker) null);
        exitDialog.show();
        return exitDialog;
    }

    public static final ExitDialog w(Activity activity, Locale locale, ExitDialog.OnExitConfirmationInteractionsListener onExitConfirmationInteractionsListener) {
        C17542s.j(activity, "<this>");
        C17542s.j(locale, "locale");
        C17542s.j(onExitConfirmationInteractionsListener, "listener");
        ExitDialog exitDialog = new ExitDialog(activity, locale, 0, ExitDialog.a.CONFIRMATION, onExitConfirmationInteractionsListener, (ExitDialog.OnSaveInteractionsListener) null, (ExitDialog.OnLoginInteractionsListener) null, 100, (DefaultConstructorMarker) null);
        exitDialog.show();
        return exitDialog;
    }

    public static final Dialog x(Activity activity, Integer num, String str, v<? extends CharSequence, ? extends C17631a<C16807N>> vVar, int i10, v<? extends CharSequence, ? extends C17631a<C16807N>> vVar2, boolean z10, DialogInterface.OnDismissListener onDismissListener) {
        Dialog dialog;
        C17542s.j(activity, "<this>");
        C17542s.j(str, "message");
        O o10 = new O();
        N c10 = N.c(LayoutInflater.from(activity));
        T dialog2 = new Dialog(c10.getRoot().getContext(), R.style.NagScreenStyle);
        dialog2.requestWindowFeature(1);
        dialog2.setCancelable(z10);
        dialog2.setCanceledOnTouchOutside(z10);
        dialog2.setContentView(c10.getRoot());
        o10.f144348a = dialog2;
        if (num != null) {
            c10.f114414e.setText(num.intValue());
        }
        c10.f114413d.setText(str);
        c10.f114412c.setBackground(C5443a.b(c10.getRoot().getContext(), i10));
        if (vVar != null) {
            MaterialButton materialButton = c10.f114415f;
            materialButton.setText((CharSequence) vVar.c());
            materialButton.setVisibility(0);
            materialButton.setOnClickListener(new C13081C(vVar, o10));
        }
        if (vVar2 != null) {
            c10.f114411b.setText((CharSequence) vVar2.c());
            c10.f114411b.setVisibility(0);
            c10.f114411b.setOnClickListener(new C13082D(vVar2, o10));
        }
        if (!(onDismissListener == null || (dialog = (Dialog) o10.f144348a) == null)) {
            dialog.setOnDismissListener(onDismissListener);
        }
        Dialog dialog3 = (Dialog) o10.f144348a;
        if (dialog3 != null) {
            dialog3.show();
        }
        return (Dialog) o10.f144348a;
    }

    public static /* synthetic */ Dialog y(Activity activity, Integer num, String str, v vVar, int i10, v vVar2, boolean z10, DialogInterface.OnDismissListener onDismissListener, int i11, Object obj) {
        return x(activity, num, str, (i11 & 4) != 0 ? null : vVar, (i11 & 8) != 0 ? C13316h.f112824F : i10, (i11 & 16) != 0 ? null : vVar2, (i11 & 32) != 0 ? true : z10, (i11 & 64) != 0 ? null : onDismissListener);
    }

    /* access modifiers changed from: private */
    public static final void z(v vVar, O o10, View view) {
        ((C17631a) vVar.d()).invoke();
        Dialog dialog = (Dialog) o10.f144348a;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
