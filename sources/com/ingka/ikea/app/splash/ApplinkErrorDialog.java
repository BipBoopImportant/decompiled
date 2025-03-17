package com.ingka.ikea.app.splash;

import Bk.a;
import HJ.C15854t;
import Oo.b;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ingka.ikea.core.android.fragments.BaseDialogFragment;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lg.f;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0003R\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u001d8BX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/ingka/ikea/app/splash/ApplinkErrorDialog;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "<init>", "()V", "Landroid/net/Uri;", "uri", "LXH/N;", "w0", "(Landroid/net/Uri;)V", "Landroid/content/Intent;", "intent", "y0", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onDestroyView", "LBk/a;", "M", "LBk/a;", "_binding", "x0", "()LBk/a;", "binding", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApplinkErrorDialog extends BaseDialogFragment {

    /* renamed from: M  reason: collision with root package name */
    private a f92389M;

    /* access modifiers changed from: private */
    public static final void A0(ApplinkErrorDialog applinkErrorDialog, Uri uri, View view) {
        applinkErrorDialog.w0(uri);
    }

    private final void w0(Uri uri) {
        Intent makeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.BROWSABLE");
        makeMainSelectorActivity.setData(uri);
        C17542s.i(makeMainSelectorActivity, "apply(...)");
        y0(makeMainSelectorActivity);
    }

    private final a x0() {
        a aVar = this.f92389M;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void y0(Intent intent) {
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e10) {
            e eVar = e.ERROR;
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
                    String a10 = C11818a.a((String) null, e10);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = ApplinkErrorDialog.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, e10, str3);
                str = str3;
                str2 = str4;
            }
        }
        dismiss();
    }

    /* access modifiers changed from: private */
    public static final void z0(ApplinkErrorDialog applinkErrorDialog, View view) {
        applinkErrorDialog.dismiss();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, f.f75301m);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        a c10 = a.c(layoutInflater);
        this.f92389M = c10;
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        this.f92389M = null;
        super.onDestroyView();
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        x0().f79240f.setText(getString(b.f84843y3));
        TextView textView = x0().f79237c;
        Bundle arguments = getArguments();
        textView.setText(getString(arguments != null ? arguments.getInt("errorMessage") : n.f92434a));
        x0().f79236b.setOnClickListener(new d(this));
        String string = requireArguments().getString("contentUri");
        Uri parse = string != null ? Uri.parse(string) : null;
        if (requireArguments().getBoolean("openInBrowser") && parse != null) {
            Button button = x0().f79239e;
            C17542s.g(button);
            button.setVisibility(0);
            button.setOnClickListener(new e(this, parse));
        }
    }
}
