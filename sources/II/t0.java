package ii;

import HJ.C15854t;
import I2.C4600b0;
import XH.C16807N;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import com.google.android.material.appbar.AppBarLayout;
import com.ingka.ikea.core.android.fragments.BaseFragment;
import com.ingka.ikea.core.android.view.BackButton;
import com.sugarcube.core.logger.DslKt;
import jC.C14617d;
import jC.q;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\n\"\u001a\u0010\u0010\u001a\u0004\u0018\u00010\r*\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/ingka/ikea/core/android/fragments/BaseFragment;", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/view/View$OnClickListener;", "onNavigationClick", "onActionBarTitleClick", "LXH/N;", "h", "(Lcom/ingka/ikea/core/android/fragments/BaseFragment;Landroidx/appcompat/widget/Toolbar;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V", "g", "(Lcom/ingka/ikea/core/android/fragments/BaseFragment;Landroid/view/View$OnClickListener;)V", "f", "Landroidx/fragment/app/o;", "Landroidx/appcompat/app/a;", "e", "(Landroidx/fragment/app/o;)Landroidx/appcompat/app/a;", "supportActionBar", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t0 {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ii/t0$a", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/r$a;", "event", "LXH/N;", "e", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C5218v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseFragment f74754a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f74755b;

        a(BaseFragment baseFragment, View.OnClickListener onClickListener) {
            this.f74754a = baseFragment;
            this.f74755b = onClickListener;
        }

        public void e(C5221y yVar, r.a aVar) {
            C17542s.j(yVar, "source");
            C17542s.j(aVar, "event");
            t0.f(this.f74754a, this.f74755b);
            this.f74754a.getLifecycle().g(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"ii/t0$b", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "LXH/N;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "core-ktx_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseFragment f74756a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f74757b;

        public b(BaseFragment baseFragment, View.OnClickListener onClickListener) {
            this.f74756a = baseFragment;
            this.f74757b = onClickListener;
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            t0.g(this.f74756a, this.f74757b);
        }
    }

    /* access modifiers changed from: private */
    public static final androidx.appcompat.app.a e(C5187o oVar) {
        C5191t activity = oVar.getActivity();
        if (activity == null) {
            return null;
        }
        if (activity instanceof AppCompatActivity) {
            return ((AppCompatActivity) activity).getSupportActionBar();
        }
        IllegalStateException illegalStateException = new IllegalStateException("Running in wrong type of Activity");
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
                String a10 = C11818a.a((String) null, illegalStateException);
                if (a10 == null) {
                    return null;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = oVar.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, illegalStateException, str3);
            str = str3;
            str2 = str4;
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final void f(BaseFragment baseFragment, View.OnClickListener onClickListener) {
        TextView textView;
        C5191t activity = baseFragment.getActivity();
        if (activity != null && (textView = (TextView) activity.findViewById(Uo.a.f88328i)) != null) {
            textView.setOnClickListener(onClickListener);
            textView.setClickable(onClickListener != null);
            textView.setImportantForAccessibility(2);
        }
    }

    /* access modifiers changed from: private */
    public static final void g(BaseFragment baseFragment, View.OnClickListener onClickListener) {
        if (baseFragment.getLifecycle().d().b(r.b.STARTED)) {
            f(baseFragment, onClickListener);
        } else {
            baseFragment.getLifecycle().c(new a(baseFragment, onClickListener));
        }
    }

    public static final void h(BaseFragment baseFragment, Toolbar toolbar, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        C17542s.j(baseFragment, "<this>");
        C17542s.j(toolbar, "toolbar");
        baseFragment.b(new s0(toolbar));
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
    public static final C16807N i(Toolbar toolbar, q qVar) {
        C17542s.j(qVar, "$this$systemUi");
        ViewParent parent = toolbar.getParent();
        C17542s.h(parent, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
        qVar.e((AppBarLayout) parent, C14617d.Padding);
        return C16807N.f139792a;
    }
}
