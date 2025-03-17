package com.ingka.ikea.checkout.impl.ui;

import D2.d;
import HJ.C15854t;
import XH.C16796C;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C5197z;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ingka.ikea.checkout.impl.l0;
import com.ingka.ikea.checkout.impl.m0;
import com.ingka.ikea.checkout.impl.ui.a;
import com.sugarcube.core.logger.DslKt;
import fI.C17221b;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg.f;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import vo.C12198a;
import vo.C12199b;
import vo.c;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/ingka/ikea/checkout/impl/ui/FullscreenErrorDialogFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "<init>", "()V", "Landroid/view/View;", "view", "", "contactUri", "LXH/N;", "y0", "(Landroid/view/View;Ljava/lang/String;)V", "Lcom/ingka/ikea/checkout/impl/ui/a;", "result", "B0", "(Lcom/ingka/ikea/checkout/impl/ui/a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "", "P", "Z", "hasSetResultValue", "Q", "a", "b", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FullscreenErrorDialogFragment extends Hilt_FullscreenErrorDialogFragment {

    /* renamed from: Q  reason: collision with root package name */
    public static final a f94672Q = new a((DefaultConstructorMarker) null);

    /* renamed from: R  reason: collision with root package name */
    public static final int f94673R = 8;

    /* renamed from: P  reason: collision with root package name */
    private boolean f94674P;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00068\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/ingka/ikea/checkout/impl/ui/FullscreenErrorDialogFragment$a;", "", "<init>", "()V", "Lcom/ingka/ikea/checkout/impl/ui/FullscreenErrorDialogFragment$b;", "errorDialogType", "", "title", "description", "buttonText", "contactUri", "Lcom/ingka/ikea/checkout/impl/ui/FullscreenErrorDialogFragment;", "a", "(Lcom/ingka/ikea/checkout/impl/ui/FullscreenErrorDialogFragment$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ingka/ikea/checkout/impl/ui/FullscreenErrorDialogFragment;", "TAG", "Ljava/lang/String;", "ERROR_DIALOG_TYPE_KEY", "ERROR_TITLE_KEY", "ERROR_DESCRIPTION_KEY", "ERROR_BUTTON_TEXT_KEY", "ERROR_DIALOG_CONTACT_URI_KEY", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FullscreenErrorDialogFragment a(b bVar, String str, String str2, String str3, String str4) {
            C17542s.j(bVar, "errorDialogType");
            C17542s.j(str, "title");
            C17542s.j(str2, "description");
            C17542s.j(str3, "buttonText");
            FullscreenErrorDialogFragment fullscreenErrorDialogFragment = new FullscreenErrorDialogFragment();
            fullscreenErrorDialogFragment.setArguments(d.b(C16796C.a("error_dialog_type_key", bVar), C16796C.a("error_title_key", str), C16796C.a("error_DESCRIPTION_key", str2), C16796C.a("error_button_text_key", str3), C16796C.a("error_dialog_contact_uri_key", str4)));
            return fullscreenErrorDialogFragment;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/checkout/impl/ui/FullscreenErrorDialogFragment$b;", "", "<init>", "(Ljava/lang/String;I)V", "GENERIC_ERROR", "POSTAL_CODE_ERROR", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        GENERIC_ERROR,
        POSTAL_CODE_ERROR;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    /* access modifiers changed from: private */
    public static final void A0(FullscreenErrorDialogFragment fullscreenErrorDialogFragment, View view) {
        fullscreenErrorDialogFragment.B0(a.b.f94680a);
    }

    private final void B0(a aVar) {
        if (!this.f94674P) {
            C5197z.c(this, "FullscreenErrorDialogFragmentRequestKey", d.b(C16796C.a("FullscreenErrorDialogFragmentBundleKey", aVar)));
            this.f94674P = true;
        }
    }

    /* access modifiers changed from: private */
    public static final void x0(FullscreenErrorDialogFragment fullscreenErrorDialogFragment, b bVar, View view) {
        fullscreenErrorDialogFragment.B0(new a.C2108a(bVar));
        fullscreenErrorDialogFragment.dismiss();
    }

    private final void y0(View view, String str) {
        if (str != null && !C15854t.v0(str)) {
            TextView textView = (TextView) view.findViewById(l0.f94612d);
            textView.setPaintFlags(textView.getPaintFlags() | 8);
            textView.setOnClickListener(new C12199b(str));
            textView.setVisibility(0);
            ((TextView) view.findViewById(l0.f94620l)).setVisibility(0);
        }
        FloatingActionButton floatingActionButton = (FloatingActionButton) view.findViewById(l0.f94611c);
        floatingActionButton.s();
        floatingActionButton.setOnClickListener(new c(this));
    }

    /* access modifiers changed from: private */
    public static final void z0(String str, View view) {
        Context context = view.getContext();
        C17542s.i(context, "getContext(...)");
        Xo.c.c(context, str);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, f.f75301m);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        return layoutInflater.inflate(m0.f94623b, viewGroup, false);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C17542s.j(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        B0(a.b.f94680a);
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
        b bVar;
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("error_dialog_type_key");
            if (!(serializable instanceof b)) {
                serializable = null;
            }
            bVar = (b) serializable;
        } else {
            bVar = null;
        }
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("error_title_key") : null;
        Bundle arguments3 = getArguments();
        String string2 = arguments3 != null ? arguments3.getString("error_DESCRIPTION_key") : null;
        Bundle arguments4 = getArguments();
        String string3 = arguments4 != null ? arguments4.getString("error_button_text_key") : null;
        Bundle arguments5 = getArguments();
        String string4 = arguments5 != null ? arguments5.getString("error_button_text_key") : null;
        if (bVar == null || string == null || string2 == null || string3 == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Incomplete arguments");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str2 == null) {
                    String name = FullscreenErrorDialogFragment.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar2.a(eVar, str2, false, illegalArgumentException, str);
            }
            return;
        }
        Button button = (Button) view.findViewById(l0.f94614f);
        button.setText(string3);
        button.setOnClickListener(new C12198a(this, bVar));
        ((TextView) view.findViewById(l0.f94615g)).setText(string);
        ((TextView) view.findViewById(l0.f94616h)).setText(string2);
        if (bVar == b.POSTAL_CODE_ERROR) {
            y0(view, string4);
        }
    }
}
