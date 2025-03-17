package com.contentsquare.android.sdk;

import D8.c;
import XH.C16807N;
import XH.x;
import a9.C6944u3;
import a9.C6952v3;
import a9.C6960w3;
import a9.D3;
import a9.H1;
import a9.J3;
import a9.L4;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import b8.m;
import b8.n;
import b8.p;
import com.contentsquare.android.sdk.C7156v0;
import com.contentsquare.android.sdk.k1;
import dI.C17164e;
import dI.C17170k;
import eI.C17187b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;

@SuppressLint({"ValidFragment"})
public final class c1 extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public final c f47343a = new c("DialogManager");

    /* renamed from: b  reason: collision with root package name */
    public View f47344b;

    /* renamed from: c  reason: collision with root package name */
    public View f47345c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f47346d;

    /* renamed from: e  reason: collision with root package name */
    public ProgressBar f47347e;

    /* renamed from: f  reason: collision with root package name */
    public ProgressBar f47348f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f47349g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f47350h;

    /* renamed from: i  reason: collision with root package name */
    public View f47351i;

    /* renamed from: j  reason: collision with root package name */
    public Button f47352j;

    /* renamed from: k  reason: collision with root package name */
    public Button f47353k;

    /* renamed from: l  reason: collision with root package name */
    public D3 f47354l;

    /* renamed from: m  reason: collision with root package name */
    public b f47355m;

    /* renamed from: n  reason: collision with root package name */
    public J3 f47356n;

    public static final class a extends C17544u implements C17642l<D3, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c1 f47357c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c1 c1Var) {
            super(1);
            this.f47357c = c1Var;
        }

        public final Object invoke(Object obj) {
            D3 d32 = (D3) obj;
            C17542s.j(d32, "it");
            this.f47357c.c(d32);
            return C16807N.f139792a;
        }
    }

    public static final class b extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ C17164e<C16807N> f47358c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17170k kVar) {
            super(0);
            this.f47358c = kVar;
        }

        public final Object invoke() {
            C17164e<C16807N> eVar = this.f47358c;
            x.a aVar = x.f139812b;
            C16807N n10 = C16807N.f139792a;
            eVar.resumeWith(x.b(n10));
            return n10;
        }
    }

    public static final void d(L4 l42, View view) {
        C17542s.j(l42, "$config");
        l42.f42129b.invoke();
    }

    public static void e(Button button, L4 l42) {
        C16807N n10;
        if (l42 != null) {
            if (button != null) {
                button.setText(l42.f42128a);
            }
            if (button != null) {
                button.setOnClickListener(new C6952v3(l42));
            }
            if (button != null) {
                button.setVisibility(0);
            }
            n10 = C16807N.f139792a;
        } else {
            n10 = null;
        }
        if (n10 == null && button != null) {
            button.setVisibility(8);
        }
    }

    public static final void f(c1 c1Var) {
        C17542s.j(c1Var, "this$0");
        c1Var.dismiss();
    }

    public static final void g(c1 c1Var, Dialog dialog, DialogInterface dialogInterface) {
        C16807N n10;
        C17542s.j(c1Var, "this$0");
        b bVar = c1Var.f47355m;
        if (bVar != null) {
            bVar.invoke();
            n10 = C16807N.f139792a;
        } else {
            n10 = null;
        }
        if (n10 == null) {
            dialog.dismiss();
        }
    }

    public final Object a(Activity activity, J3 j32, C17164e<? super C16807N> eVar) {
        C17170k kVar = new C17170k(C17187b.c(eVar));
        if (!isAdded()) {
            this.f47356n = j32;
            show(activity.getFragmentManager(), "ContentSquare Dialog");
            j32.a(new a(this));
            this.f47355m = new b(kVar);
        }
        Object a10 = kVar.a();
        if (a10 == C17187b.f()) {
            h.c(eVar);
        }
        return a10 == C17187b.f() ? a10 : C16807N.f139792a;
    }

    public final void b() {
        View view = this.f47344b;
        if (view != null) {
            view.postDelayed(new C6960w3(this), 1500);
        }
    }

    public final void c(D3 d32) {
        this.f47354l = d32;
        k1 k1Var = d32.f41952a;
        if (k1Var instanceof k1.a) {
            TextView textView = this.f47346d;
            if (textView != null) {
                textView.setText(((k1.a) k1Var).f47484a);
            }
        } else if (k1Var instanceof k1.b) {
            TextView textView2 = this.f47346d;
            if (textView2 != null) {
                textView2.setText(((k1.b) k1Var).f47485a);
            }
        } else {
            TextView textView3 = this.f47346d;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        }
        TextView textView4 = this.f47346d;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        k1 k1Var2 = d32.f41953b;
        if (k1Var2 instanceof k1.a) {
            TextView textView5 = this.f47350h;
            if (textView5 != null) {
                textView5.setText(((k1.a) k1Var2).f47484a);
            }
        } else if (k1Var2 instanceof k1.b) {
            TextView textView6 = this.f47350h;
            if (textView6 != null) {
                textView6.setText(((k1.b) k1Var2).f47485a);
            }
        } else {
            TextView textView7 = this.f47350h;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
        }
        TextView textView8 = this.f47350h;
        if (textView8 != null) {
            textView8.setVisibility(0);
        }
        C7156v0 v0Var = d32.f41954c;
        if (v0Var instanceof C7156v0.a) {
            ProgressBar progressBar = this.f47347e;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            ImageView imageView = this.f47349g;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ProgressBar progressBar2 = this.f47348f;
            if (progressBar2 != null) {
                progressBar2.setVisibility(0);
            }
        } else if (v0Var instanceof C7156v0.c) {
            ProgressBar progressBar3 = this.f47348f;
            if (progressBar3 != null) {
                progressBar3.setVisibility(8);
            }
            ImageView imageView2 = this.f47349g;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            ProgressBar progressBar4 = this.f47347e;
            if (progressBar4 != null) {
                progressBar4.setVisibility(0);
            }
            ProgressBar progressBar5 = this.f47347e;
            if (progressBar5 != null) {
                progressBar5.setProgress(((C7156v0.c) v0Var).f47661a);
            }
        } else if (v0Var instanceof C7156v0.b) {
            ProgressBar progressBar6 = this.f47347e;
            if (progressBar6 != null) {
                progressBar6.setVisibility(8);
            }
            ProgressBar progressBar7 = this.f47348f;
            if (progressBar7 != null) {
                progressBar7.setVisibility(8);
            }
            ImageView imageView3 = this.f47349g;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            ImageView imageView4 = this.f47349g;
            if (imageView4 != null) {
                imageView4.setImageResource(((C7156v0.b) v0Var).f47660a);
            }
        } else {
            ProgressBar progressBar8 = this.f47347e;
            if (progressBar8 != null) {
                progressBar8.setVisibility(8);
            }
            ProgressBar progressBar9 = this.f47348f;
            if (progressBar9 != null) {
                progressBar9.setVisibility(8);
            }
            ImageView imageView5 = this.f47349g;
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
        }
        L4 l42 = d32.f41955d;
        L4 l43 = d32.f41956e;
        e(this.f47352j, l42);
        e(this.f47353k, l43);
        if (l42 == null && l43 == null) {
            View view = this.f47351i;
            if (view != null) {
                view.setVisibility(8);
            }
        } else {
            View view2 = this.f47351i;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        View view3 = this.f47345c;
        if (view3 != null) {
            view3.setVisibility(0);
        }
    }

    public final void dismiss() {
        this.f47354l = null;
        TextView textView = this.f47346d;
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = this.f47350h;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        View view = this.f47351i;
        if (view != null) {
            view.setVisibility(8);
        }
        Button button = this.f47352j;
        if (button != null) {
            button.setVisibility(8);
        }
        Button button2 = this.f47353k;
        if (button2 != null) {
            button2.setVisibility(8);
        }
        ProgressBar progressBar = this.f47347e;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        ProgressBar progressBar2 = this.f47348f;
        if (progressBar2 != null) {
            progressBar2.setVisibility(8);
        }
        ImageView imageView = this.f47349g;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ProgressBar progressBar3 = this.f47347e;
        if (progressBar3 != null) {
            progressBar3.setProgress(0);
        }
        if (isAdded()) {
            try {
                super.dismiss();
            } catch (IllegalStateException e10) {
                H1.a(this.f47343a, "Dismiss of DialogManager failed", e10);
            }
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        setCancelable(false);
        onCreateDialog.setOnShowListener(new C6944u3(this, onCreateDialog));
        C17542s.i(onCreateDialog, "super.onCreateDialog(sav…)\n            }\n        }");
        return onCreateDialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        View inflate = layoutInflater.cloneInContext(new ContextThemeWrapper(layoutInflater.getContext(), p.f45620a)).inflate(n.f45585d, viewGroup, true);
        View findViewById = inflate.findViewById(m.f45545P);
        findViewById.setVisibility(4);
        this.f47345c = findViewById;
        this.f47346d = (TextView) inflate.findViewById(m.f45555Z);
        this.f47347e = (ProgressBar) inflate.findViewById(m.f45547R);
        this.f47348f = (ProgressBar) inflate.findViewById(m.f45557b);
        this.f47349g = (ImageView) inflate.findViewById(m.f45546Q);
        this.f47350h = (TextView) inflate.findViewById(m.f45554Y);
        this.f47351i = inflate.findViewById(m.f45556a);
        this.f47352j = (Button) inflate.findViewById(m.f45549T);
        this.f47353k = (Button) inflate.findViewById(m.f45550U);
        this.f47344b = inflate;
        D3 d32 = this.f47354l;
        if (d32 != null) {
            c(d32);
        }
        return this.f47344b;
    }

    public final void onDetach() {
        super.onDetach();
        J3 j32 = this.f47356n;
        if (j32 != null) {
            j32.a();
        }
    }
}
