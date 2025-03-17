package com.sugarcube.app.base.ui.dialog;

import I2.C0;
import I2.C4626o0;
import I2.b1;
import OE.n;
import QE.C13430g;
import XH.t;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import com.google.android.material.button.MaterialButton;
import com.sugarcube.app.base.ui.dialog.a;
import fI.C17221b;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tF.C15085j;
import tF.C15086k;
import tF.C15087l;
import tF.C15088m;
import tF.C15089n;
import tF.C15090o;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004)*+,BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006-"}, d2 = {"Lcom/sugarcube/app/base/ui/dialog/ExitDialog;", "Lcom/sugarcube/app/base/ui/dialog/a;", "Landroid/app/Activity;", "activity", "Ljava/util/Locale;", "locale", "", "gravity", "Lcom/sugarcube/app/base/ui/dialog/ExitDialog$a;", "exitMode", "Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnExitConfirmationInteractionsListener;", "exitConfirmationListener", "Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnSaveInteractionsListener;", "saveListener", "Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnLoginInteractionsListener;", "loginListener", "<init>", "(Landroid/app/Activity;Ljava/util/Locale;ILcom/sugarcube/app/base/ui/dialog/ExitDialog$a;Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnExitConfirmationInteractionsListener;Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnSaveInteractionsListener;Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnLoginInteractionsListener;)V", "Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "onCreate", "(Landroid/os/Bundle;)V", "g", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "h", "Lcom/sugarcube/app/base/ui/dialog/ExitDialog$a;", "getExitMode", "()Lcom/sugarcube/app/base/ui/dialog/ExitDialog$a;", "i", "Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnExitConfirmationInteractionsListener;", "j", "Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnSaveInteractionsListener;", "k", "Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnLoginInteractionsListener;", "LQE/g;", "l", "LQE/g;", "binding", "OnExitConfirmationInteractionsListener", "OnSaveInteractionsListener", "OnLoginInteractionsListener", "a", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExitDialog extends a {

    /* renamed from: g  reason: collision with root package name */
    private final Activity f124092g;

    /* renamed from: h  reason: collision with root package name */
    private final a f124093h;

    /* renamed from: i  reason: collision with root package name */
    private final OnExitConfirmationInteractionsListener f124094i;

    /* renamed from: j  reason: collision with root package name */
    private final OnSaveInteractionsListener f124095j;

    /* renamed from: k  reason: collision with root package name */
    private final OnLoginInteractionsListener f124096k;

    /* renamed from: l  reason: collision with root package name */
    private C13430g f124097l;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnExitConfirmationInteractionsListener;", "", "Landroid/app/Dialog;", "dialog", "LXH/N;", "onCancel", "(Landroid/app/Dialog;)V", "onExit", "()V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnExitConfirmationInteractionsListener {
        void onCancel(Dialog dialog);

        void onExit();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnLoginInteractionsListener;", "", "Landroid/app/Dialog;", "dialog", "LXH/N;", "onSignUp", "(Landroid/app/Dialog;)V", "onLogin", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnLoginInteractionsListener {
        void onLogin(Dialog dialog);

        void onSignUp(Dialog dialog);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/app/base/ui/dialog/ExitDialog$OnSaveInteractionsListener;", "", "LXH/N;", "onDiscardDesign", "()V", "Landroid/app/Dialog;", "dialog", "onSaveDesign", "(Landroid/app/Dialog;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnSaveInteractionsListener {
        void onDiscardDesign();

        void onSaveDesign(Dialog dialog);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/app/base/ui/dialog/ExitDialog$a;", "", "<init>", "(Ljava/lang/String;I)V", "CONFIRMATION", "SAVE", "LOGIN", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        CONFIRMATION,
        SAVE,
        LOGIN;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f124098a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.sugarcube.app.base.ui.dialog.ExitDialog$a[] r0 = com.sugarcube.app.base.ui.dialog.ExitDialog.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.sugarcube.app.base.ui.dialog.ExitDialog$a r1 = com.sugarcube.app.base.ui.dialog.ExitDialog.a.CONFIRMATION     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.sugarcube.app.base.ui.dialog.ExitDialog$a r1 = com.sugarcube.app.base.ui.dialog.ExitDialog.a.SAVE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.sugarcube.app.base.ui.dialog.ExitDialog$a r1 = com.sugarcube.app.base.ui.dialog.ExitDialog.a.LOGIN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f124098a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.dialog.ExitDialog.b.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExitDialog(Activity activity, Locale locale, int i10, a aVar, OnExitConfirmationInteractionsListener onExitConfirmationInteractionsListener, OnSaveInteractionsListener onSaveInteractionsListener, OnLoginInteractionsListener onLoginInteractionsListener, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, locale, (i11 & 4) != 0 ? 17 : i10, aVar, (i11 & 16) != 0 ? null : onExitConfirmationInteractionsListener, (i11 & 32) != 0 ? null : onSaveInteractionsListener, (i11 & 64) != 0 ? null : onLoginInteractionsListener);
    }

    /* access modifiers changed from: private */
    public static final void l(ExitDialog exitDialog, View view) {
        OnLoginInteractionsListener onLoginInteractionsListener = exitDialog.f124096k;
        if (onLoginInteractionsListener != null) {
            onLoginInteractionsListener.onLogin(exitDialog);
        }
    }

    /* access modifiers changed from: private */
    public static final void m(ExitDialog exitDialog, View view) {
        OnLoginInteractionsListener onLoginInteractionsListener = exitDialog.f124096k;
        if (onLoginInteractionsListener != null) {
            onLoginInteractionsListener.onSignUp(exitDialog);
        }
    }

    /* access modifiers changed from: private */
    public static final void n(ExitDialog exitDialog, View view) {
        OnExitConfirmationInteractionsListener onExitConfirmationInteractionsListener = exitDialog.f124094i;
        if (onExitConfirmationInteractionsListener != null) {
            onExitConfirmationInteractionsListener.onExit();
        }
    }

    /* access modifiers changed from: private */
    public static final void o(ExitDialog exitDialog, View view) {
        OnExitConfirmationInteractionsListener onExitConfirmationInteractionsListener = exitDialog.f124094i;
        if (onExitConfirmationInteractionsListener != null) {
            onExitConfirmationInteractionsListener.onCancel(exitDialog);
        }
    }

    /* access modifiers changed from: private */
    public static final void p(ExitDialog exitDialog, View view) {
        OnSaveInteractionsListener onSaveInteractionsListener = exitDialog.f124095j;
        if (onSaveInteractionsListener != null) {
            onSaveInteractionsListener.onSaveDesign(exitDialog);
        }
    }

    /* access modifiers changed from: private */
    public static final void q(ExitDialog exitDialog, View view) {
        OnSaveInteractionsListener onSaveInteractionsListener = exitDialog.f124095j;
        if (onSaveInteractionsListener != null) {
            onSaveInteractionsListener.onDiscardDesign();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(32);
            b1 a10 = C4626o0.a(window, window.getDecorView());
            C17542s.i(a10, "getInsetsController(...)");
            a10.e(2);
            a10.a(C0.l.f());
        }
        C13430g c10 = C13430g.c(LayoutInflater.from(this.f124092g));
        setContentView(c10.getRoot());
        int i10 = b.f124098a[this.f124093h.ordinal()];
        if (i10 == 1) {
            c10.f114576e.setText(n.f113260P2);
            c10.f114573b.setText(n.f113236L2);
            MaterialButton materialButton = c10.f114574c;
            materialButton.setText(n.f113442r);
            materialButton.setOnClickListener(new C15085j(this));
            MaterialButton materialButton2 = c10.f114575d;
            materialButton2.setText(n.f113351e);
            materialButton2.setOnClickListener(new C15086k(this));
        } else if (i10 == 2) {
            c10.f114573b.setText(n.f113446r3);
            MaterialButton materialButton3 = c10.f114574c;
            materialButton3.setText(n.f113263Q);
            materialButton3.setOnClickListener(new C15087l(this));
            MaterialButton materialButton4 = c10.f114575d;
            materialButton4.setText(n.f113379i);
            materialButton4.setOnClickListener(new C15088m(this));
        } else if (i10 == 3) {
            c10.f114573b.setText(n.f113425o3);
            MaterialButton materialButton5 = c10.f114574c;
            materialButton5.setText(n.f113191E);
            materialButton5.setOnClickListener(new C15089n(this));
            MaterialButton materialButton6 = c10.f114575d;
            materialButton6.setText(n.f113311Y);
            materialButton6.setOnClickListener(new C15090o(this));
        } else {
            throw new t();
        }
        this.f124097l = c10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExitDialog(Activity activity, Locale locale, int i10, a aVar, OnExitConfirmationInteractionsListener onExitConfirmationInteractionsListener, OnSaveInteractionsListener onSaveInteractionsListener, OnLoginInteractionsListener onLoginInteractionsListener) {
        super(activity, locale, i10, (a.b) null, 8, (DefaultConstructorMarker) null);
        C17542s.j(activity, "activity");
        C17542s.j(locale, "locale");
        C17542s.j(aVar, "exitMode");
        this.f124092g = activity;
        this.f124093h = aVar;
        this.f124094i = onExitConfirmationInteractionsListener;
        this.f124095j = onSaveInteractionsListener;
        this.f124096k = onLoginInteractionsListener;
    }
}
