package jq;

import I2.C4600b0;
import XH.C16807N;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import com.google.android.material.appbar.AppBarLayout;
import com.ingka.ikea.core.android.fragments.BaseFragment;
import com.ingka.ikea.core.android.view.BackButton;
import jC.C14617d;
import jC.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/core/android/fragments/BaseFragment;", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/view/View$OnClickListener;", "onNavigationClick", "onActionBarTitleClick", "LXH/N;", "f", "(Lcom/ingka/ikea/core/android/fragments/BaseFragment;Landroidx/appcompat/widget/Toolbar;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V", "e", "(Lcom/ingka/ikea/core/android/fragments/BaseFragment;Landroid/view/View$OnClickListener;)V", "d", "energylabel-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"jq/t$a", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/r$a;", "event", "LXH/N;", "e", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V", "energylabel-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C5218v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseFragment f98681a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f98682b;

        a(BaseFragment baseFragment, View.OnClickListener onClickListener) {
            this.f98681a = baseFragment;
            this.f98682b = onClickListener;
        }

        public void e(C5221y yVar, r.a aVar) {
            C17542s.j(yVar, "source");
            C17542s.j(aVar, "event");
            t.d(this.f98681a, this.f98682b);
            this.f98681a.getLifecycle().g(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"jq/t$b", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "LXH/N;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseFragment f98683a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f98684b;

        public b(BaseFragment baseFragment, View.OnClickListener onClickListener) {
            this.f98683a = baseFragment;
            this.f98684b = onClickListener;
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            t.e(this.f98683a, this.f98684b);
        }
    }

    /* access modifiers changed from: private */
    public static final void d(BaseFragment baseFragment, View.OnClickListener onClickListener) {
        TextView textView;
        C5191t activity = baseFragment.getActivity();
        if (activity != null && (textView = (TextView) activity.findViewById(Uo.a.f88328i)) != null) {
            textView.setOnClickListener(onClickListener);
            textView.setClickable(onClickListener != null);
            textView.setImportantForAccessibility(2);
        }
    }

    /* access modifiers changed from: private */
    public static final void e(BaseFragment baseFragment, View.OnClickListener onClickListener) {
        if (baseFragment.getLifecycle().d().b(r.b.STARTED)) {
            d(baseFragment, onClickListener);
        } else {
            baseFragment.getLifecycle().c(new a(baseFragment, onClickListener));
        }
    }

    public static final void f(BaseFragment baseFragment, Toolbar toolbar, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        C17542s.j(baseFragment, "<this>");
        C17542s.j(toolbar, "toolbar");
        baseFragment.b(new s(toolbar));
        C4600b0.K0(toolbar, "toolbar");
        C5191t activity = baseFragment.getActivity();
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity != null) {
            appCompatActivity.setSupportActionBar(toolbar);
            toolbar.setNavigationOnClickListener(onClickListener);
            toolbar.addOnLayoutChangeListener(new b(baseFragment, onClickListener2));
            androidx.appcompat.app.a supportActionBar = appCompatActivity.getSupportActionBar();
            if (supportActionBar != null) {
                BackButton backButton = BackButton.BACK;
                supportActionBar.x(backButton.getResId());
                supportActionBar.t(true);
                supportActionBar.w(backButton.getContentDescriptionId());
                supportActionBar.y(true);
                supportActionBar.t(true);
                baseFragment.setHasOptionsMenu(true);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(Toolbar toolbar, q qVar) {
        C17542s.j(qVar, "$this$systemUi");
        ViewParent parent = toolbar.getParent();
        C17542s.h(parent, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
        qVar.e((AppBarLayout) parent, C14617d.Padding);
        return C16807N.f139792a;
    }
}
