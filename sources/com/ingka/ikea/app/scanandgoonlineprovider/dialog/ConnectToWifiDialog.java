package com.ingka.ikea.app.scanandgoonlineprovider.dialog;

import Ae.e;
import Ar.j;
import EB.C12832d;
import Ez.f;
import FB.C12860a;
import Fz.m;
import HJ.C15854t;
import Ti.C10934a;
import Ti.C10935b;
import XH.C16796C;
import YH.X;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5197z;
import com.google.android.material.snackbar.Snackbar;
import com.google.ar.core.ImageMetadata;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u0003R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0018\u00106\u001a\u0004\u0018\u0001038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u0002038BX\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineprovider/dialog/ConnectToWifiDialog;", "Lcom/ingka/ikea/core/android/fragments/BaseBottomSheetDialogFragment;", "<init>", "()V", "LXH/N;", "D0", "J0", "H0", "I0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/constraintlayout/widget/ConstraintLayout;", "E0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "dismiss", "LAe/e;", "O", "LAe/e;", "z0", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "LFB/a;", "P", "LFB/a;", "C0", "()LFB/a;", "setLocalStoreSelectionRepository", "(LFB/a;)V", "localStoreSelectionRepository", "LAr/j;", "Q", "LAr/j;", "B0", "()LAr/j;", "setFeedback$scanandgo_implementation_release", "(LAr/j;)V", "feedback", "LFz/m;", "R", "LFz/m;", "_binding", "", "S", "Z", "hasLaunchedSettings", "A0", "()LFz/m;", "binding", "T", "a", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConnectToWifiDialog extends Hilt_ConnectToWifiDialog {

    /* renamed from: T  reason: collision with root package name */
    public static final a f91152T = new a((DefaultConstructorMarker) null);

    /* renamed from: U  reason: collision with root package name */
    public static final int f91153U = 8;

    /* renamed from: O  reason: collision with root package name */
    public e f91154O;

    /* renamed from: P  reason: collision with root package name */
    public C12860a f91155P;

    /* renamed from: Q  reason: collision with root package name */
    public j f91156Q;

    /* renamed from: R  reason: collision with root package name */
    private m f91157R;

    /* renamed from: S  reason: collision with root package name */
    private boolean f91158S;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineprovider/dialog/ConnectToWifiDialog$a;", "", "<init>", "()V", "", "FRAGMENT_RESULT_KEY_WIFI_DIALOG", "Ljava/lang/String;", "OPEN_SETTINGS_BUNDLE_KEY", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final m A0() {
        m mVar = this.f91157R;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void D0() {
        PackageManager packageManager = requireContext().getPackageManager();
        Intent intent = new Intent("android.settings.WIRELESS_SETTINGS");
        if (packageManager.resolveActivity(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != null) {
            startActivity(intent);
            return;
        }
        qv.e eVar = qv.e.WARN;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("There was no activity found to handle Settings.ACTION_WIRELESS_SETTINGS", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = ConnectToWifiDialog.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        j B02 = B0();
        ConstraintLayout b10 = A0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        String string = getString(f.f109706j0);
        C17542s.i(string, "getString(...)");
        Snackbar s10 = j.a.s(B02, b10, string, (String) null, 0, (View) null, (C17631a) null, (C17642l) null, 116, (Object) null);
        if (s10 != null) {
            s10.b0();
        }
    }

    /* access modifiers changed from: private */
    public static final void F0(ConnectToWifiDialog connectToWifiDialog, View view) {
        connectToWifiDialog.I0();
        connectToWifiDialog.D0();
        connectToWifiDialog.f91158S = true;
        connectToWifiDialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void G0(ConnectToWifiDialog connectToWifiDialog, View view) {
        connectToWifiDialog.f91158S = false;
        connectToWifiDialog.dismiss();
    }

    private final void H0() {
        C12832d c10 = C0().c();
        e.c.c(z0(), Ae.j.SHOP_AND_GO_VIEWED.b(), X.f(C16796C.a("store_id", c10 != null ? c10.e() : null)), Interaction$Component.SHOP_AND_GO_CONNECTION_DIALOGUE, (e.b) null, 8, (Object) null);
    }

    private final void I0() {
        C12832d c10 = C0().c();
        e.c.c(z0(), Ae.j.SHOP_AND_GO_TAP.b(), X.f(C16796C.a("store_id", c10 != null ? c10.e() : null)), Interaction$Component.SHOP_AND_GO_OPEN_SETTINGS, (e.b) null, 8, (Object) null);
    }

    private final void J0() {
        C5197z.c(this, "fr_res_key_wifi", D2.d.b(C16796C.a("fr_open_settings_bundle_key", Boolean.valueOf(this.f91158S))));
    }

    public final j B0() {
        j jVar = this.f91156Q;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final C12860a C0() {
        C12860a aVar = this.f91155P;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("localStoreSelectionRepository");
        return null;
    }

    /* renamed from: E0 */
    public ConstraintLayout onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        m c10 = m.c(layoutInflater, viewGroup, false);
        this.f91157R = c10;
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void dismiss() {
        J0();
        super.dismiss();
    }

    public void onCancel(DialogInterface dialogInterface) {
        C17542s.j(dialogInterface, "dialog");
        J0();
        super.onCancel(dialogInterface);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        H0();
        m A02 = A0();
        A02.f110154e.setOnClickListener(new C10934a(this));
        A02.f110151b.setOnClickListener(new C10935b(this));
    }

    public final e z0() {
        e eVar = this.f91154O;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }
}
