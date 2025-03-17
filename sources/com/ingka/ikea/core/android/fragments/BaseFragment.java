package com.ingka.ikea.core.android.fragments;

import XH.C16807N;
import XH.t;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import com.ingka.ikea.core.android.view.BackButton;
import fI.C17221b;
import jC.C14614a;
import jC.h;
import jC.p;
import jC.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001JB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0012\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J!\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u0004JO\u0010!\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b!\u0010\"J4\u0010)\u001a\u00020\u0007*\u00020#2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0001¢\u0006\u0004\b)\u0010*J4\u0010+\u001a\u00020\u0007*\u00020\u00012\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0001¢\u0006\u0004\b+\u0010,J4\u0010.\u001a\u00020\u0007*\u00020-2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0001¢\u0006\u0004\b.\u0010/J$\u00103\u001a\u00020\u00072\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000700H\u0001¢\u0006\u0004\b3\u00104R\u0018\u00107\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u0010%\u001a\u00020$8\u0014XD¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010&\u001a\u00020$8\u0014XD¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b=\u0010;R\u001a\u0010'\u001a\u00020$8\u0014XD¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010;R\u001a\u0010(\u001a\u00020$8\u0014XD¢\u0006\f\n\u0004\b@\u00109\u001a\u0004\bA\u0010;R\u0014\u0010C\u001a\u0002018\u0016X\u0005¢\u0006\u0006\u001a\u0004\b9\u0010BR\u0014\u0010E\u001a\u00020$8\u0016X\u0005¢\u0006\u0006\u001a\u0004\bD\u0010;R\u0014\u0010I\u001a\u00020F8\u0016X\u0005¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/ingka/ikea/core/android/fragments/BaseFragment;", "Landroidx/fragment/app/o;", "LjC/h;", "<init>", "()V", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "LXH/N;", "z0", "(Landroidx/appcompat/widget/Toolbar;)V", "Landroidx/appcompat/app/a;", "actionBar", "", "title", "Lcom/ingka/ikea/core/android/view/BackButton;", "button", "Lcom/ingka/ikea/core/android/fragments/BaseFragment$a;", "mode", "A0", "(Landroidx/appcompat/app/a;Ljava/lang/String;Lcom/ingka/ikea/core/android/view/BackButton;Lcom/ingka/ikea/core/android/fragments/BaseFragment$a;)V", "Landroid/view/View$OnClickListener;", "onActionBarTitleClick", "y0", "(Landroid/view/View$OnClickListener;)V", "x0", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onNavigationClick", "B0", "(Landroidx/appcompat/widget/Toolbar;Ljava/lang/String;Lcom/ingka/ikea/core/android/view/BackButton;Lcom/ingka/ikea/core/android/fragments/BaseFragment$a;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V", "Landroidx/fragment/app/t;", "", "drawUnderStatusBar", "drawUnderNavigationBar", "drawUnderDisplayCutout", "handleImeInsets", "a0", "(Landroidx/fragment/app/t;ZZZZ)V", "c0", "(Landroidx/fragment/app/o;ZZZZ)V", "Landroidx/fragment/app/DialogFragment;", "d", "(Landroidx/fragment/app/DialogFragment;ZZZZ)V", "Lkotlin/Function1;", "LjC/q;", "block", "b", "(LnI/l;)V", "J", "Landroidx/appcompat/widget/Toolbar;", "baseToolbar", "K", "Z", "v0", "()Z", "L", "u0", "M", "t0", "N", "w0", "()LjC/q;", "systemUi", "j0", "isSystemUiInstalled", "LjC/a;", "e0", "()LjC/a;", "drawUnderConfig", "a", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseFragment extends Hilt_BaseFragment implements h {

    /* renamed from: I  reason: collision with root package name */
    private final /* synthetic */ h f94859I = p.a();

    /* renamed from: J  reason: collision with root package name */
    private Toolbar f94860J;

    /* renamed from: K  reason: collision with root package name */
    private final boolean f94861K;

    /* renamed from: L  reason: collision with root package name */
    private final boolean f94862L;

    /* renamed from: M  reason: collision with root package name */
    private final boolean f94863M;

    /* renamed from: N  reason: collision with root package name */
    private final boolean f94864N;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ingka/ikea/core/android/fragments/BaseFragment$a;", "", "<init>", "(Ljava/lang/String;I)V", "REGULAR", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        REGULAR;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f94865a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f94865a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/ingka/ikea/core/android/fragments/BaseFragment$c", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/r$a;", "event", "LXH/N;", "e", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C5218v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseFragment f94866a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f94867b;

        c(BaseFragment baseFragment, View.OnClickListener onClickListener) {
            this.f94866a = baseFragment;
            this.f94867b = onClickListener;
        }

        public void e(C5221y yVar, r.a aVar) {
            C17542s.j(yVar, "source");
            C17542s.j(aVar, "event");
            this.f94866a.x0(this.f94867b);
            this.f94866a.getLifecycle().g(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/ingka/ikea/core/android/fragments/BaseFragment$d", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "LXH/N;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseFragment f94868a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f94869b;

        public d(BaseFragment baseFragment, View.OnClickListener onClickListener) {
            this.f94868a = baseFragment;
            this.f94869b = onClickListener;
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            this.f94868a.y0(this.f94869b);
        }
    }

    private final void A0(androidx.appcompat.app.a aVar, String str, BackButton backButton, a aVar2) {
        if (aVar != null) {
            if (b.f94865a[aVar2.ordinal()] == 1) {
                if (backButton != null) {
                    aVar.x(backButton.getResId());
                    aVar.w(backButton.getContentDescriptionId());
                    aVar.t(true);
                } else {
                    aVar.y(false);
                    aVar.t(false);
                }
                aVar.A(str);
                setHasOptionsMenu(true);
                return;
            }
            throw new t();
        }
    }

    public static /* synthetic */ void C0(BaseFragment baseFragment, Toolbar toolbar, String str, BackButton backButton, a aVar, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, int i10, Object obj) {
        if (obj == null) {
            View.OnClickListener onClickListener3 = null;
            String str2 = (i10 & 2) != 0 ? null : str;
            BackButton backButton2 = (i10 & 4) != 0 ? null : backButton;
            a aVar2 = (i10 & 8) != 0 ? a.REGULAR : aVar;
            View.OnClickListener onClickListener4 = (i10 & 16) != 0 ? null : onClickListener;
            if ((i10 & 32) == 0) {
                onClickListener3 = onClickListener2;
            }
            baseFragment.B0(toolbar, str2, backButton2, aVar2, onClickListener4, onClickListener3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupToolbar");
    }

    /* access modifiers changed from: private */
    public final void x0(View.OnClickListener onClickListener) {
        TextView textView;
        C5191t activity = getActivity();
        if (activity != null && (textView = (TextView) activity.findViewById(Uo.a.f88328i)) != null) {
            textView.setOnClickListener(onClickListener);
            textView.setClickable(onClickListener != null);
        }
    }

    /* access modifiers changed from: private */
    public final void y0(View.OnClickListener onClickListener) {
        if (getLifecycle().d().b(r.b.STARTED)) {
            x0(onClickListener);
        } else {
            getLifecycle().c(new c(this, onClickListener));
        }
    }

    private final void z0(Toolbar toolbar) {
        C5191t activity = getActivity();
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity != null) {
            this.f94860J = toolbar;
            appCompatActivity.setSupportActionBar(toolbar);
            androidx.appcompat.app.a supportActionBar = appCompatActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.w(Oo.b.f84632f);
            }
        }
    }

    public final void B0(Toolbar toolbar, String str, BackButton backButton, a aVar, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        C17542s.j(toolbar, "toolbar");
        C17542s.j(aVar, "mode");
        C5191t activity = getActivity();
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity != null) {
            z0(toolbar);
            A0(appCompatActivity.getSupportActionBar(), str, backButton, aVar);
        }
        if (onClickListener != null) {
            toolbar.setNavigationOnClickListener(onClickListener);
        }
        toolbar.addOnLayoutChangeListener(new d(this, onClickListener2));
    }

    public q Z() {
        return this.f94859I.Z();
    }

    public void a0(C5191t tVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        C17542s.j(tVar, "<this>");
        this.f94859I.a0(tVar, z10, z11, z12, z13);
    }

    public void b(C17642l<? super q, C16807N> lVar) {
        C17542s.j(lVar, "block");
        this.f94859I.b(lVar);
    }

    public void c0(C5187o oVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        C17542s.j(oVar, "<this>");
        this.f94859I.c0(oVar, z10, z11, z12, z13);
    }

    public void d(DialogFragment dialogFragment, boolean z10, boolean z11, boolean z12, boolean z13) {
        C17542s.j(dialogFragment, "<this>");
        this.f94859I.d(dialogFragment, z10, z11, z12, z13);
    }

    public C14614a e0() {
        return this.f94859I.e0();
    }

    public boolean j0() {
        return this.f94859I.j0();
    }

    public void onDestroyView() {
        Toolbar toolbar;
        C5191t activity = getActivity();
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity != null && ((toolbar = (Toolbar) appCompatActivity.findViewById(Uo.a.f88327h)) == null || C17542s.e(toolbar, this.f94860J))) {
            appCompatActivity.setSupportActionBar((Toolbar) null);
        }
        this.f94860J = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        c0(this, v0(), u0(), t0(), w0());
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f94863M;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f94862L;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f94861K;
    }

    /* access modifiers changed from: protected */
    public boolean w0() {
        return this.f94864N;
    }
}
