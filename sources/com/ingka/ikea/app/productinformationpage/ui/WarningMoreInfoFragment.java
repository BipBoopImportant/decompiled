package com.ingka.ikea.app.productinformationpage.ui;

import Eo.a;
import HJ.C15854t;
import Rh.i;
import Wh.f;
import Wh.g;
import XH.C16824o;
import XH.C16825p;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C5191t;
import com.ingka.ikea.core.model.product.WarningMoreInfo;
import com.optimizely.ab.config.FeatureVariable;
import com.sugarcube.core.logger.DslKt;
import ii.t0;
import java.util.ArrayList;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0003R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\"8BX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/ui/WarningMoreInfoFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "LXH/N;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "LEo/a;", "R", "LEo/a;", "G0", "()LEo/a;", "setCustomTabsApi", "(LEo/a;)V", "customTabsApi", "LkK/c;", "S", "LkK/c;", "H0", "()LkK/c;", "setJson", "(LkK/c;)V", "json", "LRh/i;", "T", "LRh/i;", "_binding", "Lcom/ingka/ikea/core/model/product/WarningMoreInfo;", "U", "LXH/o;", "I0", "()Lcom/ingka/ikea/core/model/product/WarningMoreInfo;", "safeArgs", "F0", "()LRh/i;", "binding", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WarningMoreInfoFragment extends Hilt_WarningMoreInfoFragment {

    /* renamed from: R  reason: collision with root package name */
    public a f72111R;

    /* renamed from: S  reason: collision with root package name */
    public C17514c f72112S;

    /* renamed from: T  reason: collision with root package name */
    private i f72113T;

    /* renamed from: U  reason: collision with root package name */
    private final C16824o f72114U = C16825p.b(new f(this));

    private final i F0() {
        i iVar = this.f72113T;
        C17542s.g(iVar);
        return iVar;
    }

    private final WarningMoreInfo I0() {
        return (WarningMoreInfo) this.f72114U.getValue();
    }

    /* access modifiers changed from: private */
    public static final void J0(WarningMoreInfoFragment warningMoreInfoFragment, View view) {
        androidx.navigation.fragment.a.a(warningMoreInfoFragment).k0();
    }

    /* access modifiers changed from: private */
    public static final WarningMoreInfo K0(WarningMoreInfoFragment warningMoreInfoFragment) {
        String string = warningMoreInfoFragment.requireArguments().getString("warningMoreInfo");
        if (string != null) {
            C17514c H02 = warningMoreInfoFragment.H0();
            H02.a();
            return (WarningMoreInfo) H02.c(WarningMoreInfo.Companion.serializer(), string);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final a G0() {
        a aVar = this.f72111R;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("customTabsApi");
        return null;
    }

    public final C17514c H0() {
        C17514c cVar = this.f72112S;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z(FeatureVariable.JSON_TYPE);
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f72113T = i.c(layoutInflater, viewGroup, false);
        LinearLayout b10 = F0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        this.f72113T = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) F0().getRoot().findViewById(Uo.a.f88327h);
        C17542s.g(toolbar);
        t0.h(this, toolbar, new g(this), (View.OnClickListener) null);
        if (getActivity() instanceof AppCompatActivity) {
            C5191t activity = getActivity();
            C17542s.h(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            androidx.appcompat.app.a supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A(I0().getTitle());
            }
        }
        Context context = getContext();
        if (context == null) {
            e eVar = e.WARN;
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
                    String a10 = C11818a.a("Context is null", (Throwable) null);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str2 == null) {
                    String name = WarningMoreInfoFragment.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str3 = str2;
                bVar.a(eVar, str3, false, (Throwable) null, str);
                str2 = str3;
            }
            return;
        }
        SpannableStringBuilder b10 = ai.a.b(context, G0(), I0().getImageType(), I0().getText(), I0().getBoldText(), false, I0().getUrlText());
        TextView textView = F0().f63243b;
        textView.setText(b10);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
