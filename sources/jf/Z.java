package JF;

import OE.C13317i;
import XH.C16807N;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.sugarcube.common.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import w2.C6214h;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\u000b\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000e\u001a\u00020\u0003*\u00020\r¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\u0003*\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0000*\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015\u001a%\u0010\u001a\u001a\u00020\u0003*\u00020\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u0017¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010 \u001a\u00020\u0003*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e¢\u0006\u0004\b \u0010!\u001a7\u0010$\u001a\u00020\u0003*\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010#\u001a\u00020\"2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010(\u001a\u00020\u0003*\u00020\u00062\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060&¢\u0006\u0004\b(\u0010)\u001a\u0011\u0010+\u001a\u00020\u0003*\u00020*¢\u0006\u0004\b+\u0010,\u001a\u0011\u0010-\u001a\u00020\"*\u00020*¢\u0006\u0004\b-\u0010.\u001a\u0019\u00102\u001a\u00020/*\u00020/2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103\u001a#\u00105\u001a\u00020\u0003*\u00020\u00062\u0006\u00104\u001a\u00020\"2\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b5\u00106\u001a\u0019\u00107\u001a\u00020\u0003*\u00020\u00062\u0006\u00104\u001a\u00020\"¢\u0006\u0004\b7\u00108¨\u00069"}, d2 = {"Landroid/app/Activity;", "", "visibility", "LXH/N;", "u", "(Landroid/app/Activity;I)V", "Landroid/view/View;", "left", "top", "right", "bottom", "e", "(Landroid/view/View;IIII)V", "Landroid/widget/ImageView;", "i", "(Landroid/widget/ImageView;)V", "s", "(Landroid/view/View;)V", "r", "(Landroid/app/Activity;)V", "q", "(Landroid/view/View;)Landroid/app/Activity;", "Landroid/widget/EditText;", "Lkotlin/Function1;", "", "afterTextChanged", "h", "(Landroid/widget/EditText;LnI/l;)V", "", "duration", "Lkotlin/Function0;", "onEnd", "k", "(Landroid/view/View;JLnI/a;)V", "", "collapseView", "n", "(Landroid/view/View;JZLnI/a;)V", "", "childrenViews", "g", "(Landroid/view/View;Ljava/util/List;)V", "Landroidx/recyclerview/widget/RecyclerView;", "d", "(Landroidx/recyclerview/widget/RecyclerView;)V", "t", "(Landroidx/recyclerview/widget/RecyclerView;)Z", "", "Landroid/util/DisplayMetrics;", "displayMetrics", "j", "(FLandroid/util/DisplayMetrics;)F", "condition", "w", "(Landroid/view/View;ZJ)V", "v", "(Landroid/view/View;Z)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Z {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"JF/Z$a", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "editable", "LXH/N;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "s", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f111318a;

        a(C17642l<? super String, C16807N> lVar) {
            this.f111318a = lVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f111318a.invoke(String.valueOf(editable));
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            C17542s.j(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            C17542s.j(charSequence, "s");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"JF/Z$b", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "LXH/N;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f111319a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f111320b;

        b(View view, C17631a<C16807N> aVar) {
            this.f111319a = view;
            this.f111320b = aVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f111319a.setVisibility(0);
            C17631a<C16807N> aVar = this.f111320b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"JF/Z$c", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "LXH/N;", "onAnimationStart", "(Landroid/view/animation/Animation;)V", "onAnimationEnd", "onAnimationRepeat", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f111321a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f111322b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f111323c;

        c(View view, boolean z10, C17631a<C16807N> aVar) {
            this.f111321a = view;
            this.f111322b = z10;
            this.f111323c = aVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f111321a.setVisibility(this.f111322b ? 8 : 4);
            C17631a<C16807N> aVar = this.f111323c;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public static final void d(RecyclerView recyclerView) {
        C17542s.j(recyclerView, "<this>");
        i iVar = new i(recyclerView.getContext(), 1);
        Drawable e10 = C6214h.e(recyclerView.getResources(), R.drawable.sc_list_item_divider, (Resources.Theme) null);
        if (e10 != null) {
            iVar.n(e10);
        }
        recyclerView.j(iVar);
    }

    public static final void e(View view, int i10, int i11, int i12, int i13) {
        C17542s.j(view, "<this>");
        new Handler(Looper.getMainLooper()).postDelayed(new W(view, i10, i11, i12, i13), 100);
    }

    /* access modifiers changed from: private */
    public static final void f(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C17542s.h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(i10, i11, i12, i13);
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void g(View view, List<? extends View> list) {
        C17542s.j(view, "<this>");
        C17542s.j(list, "childrenViews");
        float f10 = ((float) 25) * view.getContext().getResources().getDisplayMetrics().density;
        Activity q10 = q(view);
        int e10 = q10 != null ? C13096c.e(q10) : 0;
        if (e10 != 0) {
            float f11 = ((float) e10) + f10;
            Activity q11 = q(view);
            if (q11 == null || !C13096c.f(q11)) {
                f10 = f11;
            }
            for (View e11 : list) {
                e(e11, 0, (int) f10, 0, 0);
            }
        }
    }

    public static final void h(EditText editText, C17642l<? super String, C16807N> lVar) {
        C17542s.j(editText, "<this>");
        C17542s.j(lVar, "afterTextChanged");
        editText.addTextChangedListener(new a(lVar));
    }

    public static final void i(ImageView imageView) {
        C17542s.j(imageView, "<this>");
        imageView.setHasTransientState(true);
        Animation loadAnimation = AnimationUtils.loadAnimation(imageView.getContext(), R.anim.sc_rotate);
        imageView.setAnimation(loadAnimation);
        imageView.startAnimation(loadAnimation);
    }

    public static final float j(float f10, DisplayMetrics displayMetrics) {
        C17542s.j(displayMetrics, "displayMetrics");
        return TypedValue.applyDimension(1, f10, displayMetrics);
    }

    public static final void k(View view, long j10, C17631a<C16807N> aVar) {
        C17542s.j(view, "<this>");
        Activity q10 = q(view);
        if (q10 != null) {
            q10.runOnUiThread(new Y(view, aVar, j10));
        }
    }

    public static /* synthetic */ void l(View view, long j10, C17631a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 100;
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        k(view, j10, aVar);
    }

    /* access modifiers changed from: private */
    public static final void m(View view, C17631a aVar, long j10) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(j10);
            alphaAnimation.setAnimationListener(new b(view, aVar));
            view.startAnimation(alphaAnimation);
        } else if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final void n(View view, long j10, boolean z10, C17631a<C16807N> aVar) {
        C17542s.j(view, "<this>");
        Activity q10 = q(view);
        if (q10 != null) {
            q10.runOnUiThread(new X(view, aVar, j10, z10));
        }
    }

    public static /* synthetic */ void o(View view, long j10, boolean z10, C17631a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 100;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        n(view, j10, z10, aVar);
    }

    /* access modifiers changed from: private */
    public static final void p(View view, C17631a aVar, long j10, boolean z10) {
        if (view.getVisibility() == 0) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(j10);
            alphaAnimation.setAnimationListener(new c(view, z10, aVar));
            view.startAnimation(alphaAnimation);
        } else if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final Activity q(View view) {
        C17542s.j(view, "<this>");
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static final void r(Activity activity) {
        C17542s.j(activity, "<this>");
        Object systemService = activity.getSystemService("input_method");
        C17542s.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View currentFocus = activity.getCurrentFocus();
        inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 0);
    }

    public static final void s(View view) {
        C17542s.j(view, "<this>");
        Object systemService = view.getContext().getSystemService("input_method");
        C17542s.h(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final boolean t(RecyclerView recyclerView) {
        C17542s.j(recyclerView, "<this>");
        return !recyclerView.canScrollVertically(-1);
    }

    public static final void u(Activity activity, int i10) {
        C17542s.j(activity, "<this>");
        Toolbar toolbar = (Toolbar) activity.findViewById(C13317i.f113044l3);
        if (toolbar != null) {
            toolbar.setVisibility(i10 == 0 ? 0 : 8);
        }
        if (!(activity instanceof AppCompatActivity)) {
            return;
        }
        if (i10 == 0) {
            androidx.appcompat.app.a supportActionBar = ((AppCompatActivity) activity).getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.C();
                return;
            }
            return;
        }
        androidx.appcompat.app.a supportActionBar2 = ((AppCompatActivity) activity).getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.l();
        }
    }

    public static final void v(View view, boolean z10) {
        C17542s.j(view, "<this>");
        view.setVisibility(z10 ? 0 : 8);
    }

    public static final void w(View view, boolean z10, long j10) {
        C17542s.j(view, "<this>");
        if (z10) {
            l(view, 0, (C17631a) null, 3, (Object) null);
        } else {
            o(view, 0, true, (C17631a) null, 5, (Object) null);
        }
    }

    public static /* synthetic */ void x(View view, boolean z10, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 100;
        }
        w(view, z10, j10);
    }
}
