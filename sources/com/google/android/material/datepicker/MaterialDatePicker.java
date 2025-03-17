package com.google.android.material.datepicker;

import Ea.C9068b;
import Ea.C9070d;
import Ea.C9071e;
import Ea.C9072f;
import Ea.C9074h;
import Ea.C9076j;
import Ea.C9077k;
import Ea.C9078l;
import I2.C0;
import I2.C4597a;
import I2.C4600b0;
import I2.I;
import Ma.C9139a;
import Ua.C9286g;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Q;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.v;
import j.C5443a;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class MaterialDatePicker<S> extends DialogFragment {

    /* renamed from: H0  reason: collision with root package name */
    static final Object f66525H0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: I0  reason: collision with root package name */
    static final Object f66526I0 = "CANCEL_BUTTON_TAG";

    /* renamed from: J0  reason: collision with root package name */
    static final Object f66527J0 = "TOGGLE_BUTTON_TAG";

    /* renamed from: A0  reason: collision with root package name */
    private TextView f66528A0;

    /* renamed from: B0  reason: collision with root package name */
    private CheckableImageButton f66529B0;

    /* renamed from: C0  reason: collision with root package name */
    private C9286g f66530C0;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public final LinkedHashSet<p<? super S>> f66531D = new LinkedHashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: D0  reason: collision with root package name */
    public Button f66532D0;
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f66533E = new LinkedHashSet<>();

    /* renamed from: E0  reason: collision with root package name */
    private boolean f66534E0;

    /* renamed from: F  reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f66535F = new LinkedHashSet<>();

    /* renamed from: F0  reason: collision with root package name */
    private CharSequence f66536F0;

    /* renamed from: G  reason: collision with root package name */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f66537G = new LinkedHashSet<>();

    /* renamed from: G0  reason: collision with root package name */
    private CharSequence f66538G0;

    /* renamed from: H  reason: collision with root package name */
    private int f66539H;

    /* renamed from: I  reason: collision with root package name */
    private i<S> f66540I;

    /* renamed from: J  reason: collision with root package name */
    private u<S> f66541J;

    /* renamed from: K  reason: collision with root package name */
    private a f66542K;

    /* renamed from: L  reason: collision with root package name */
    private m f66543L;

    /* renamed from: M  reason: collision with root package name */
    private MaterialCalendar<S> f66544M;

    /* renamed from: N  reason: collision with root package name */
    private int f66545N;

    /* renamed from: O  reason: collision with root package name */
    private CharSequence f66546O;

    /* renamed from: P  reason: collision with root package name */
    private boolean f66547P;

    /* renamed from: Q  reason: collision with root package name */
    private int f66548Q;

    /* renamed from: R  reason: collision with root package name */
    private int f66549R;

    /* renamed from: S  reason: collision with root package name */
    private CharSequence f66550S;

    /* renamed from: T  reason: collision with root package name */
    private int f66551T;

    /* renamed from: U  reason: collision with root package name */
    private CharSequence f66552U;

    /* renamed from: X  reason: collision with root package name */
    private int f66553X;

    /* renamed from: Y  reason: collision with root package name */
    private CharSequence f66554Y;

    /* renamed from: Z  reason: collision with root package name */
    private int f66555Z;

    /* renamed from: y0  reason: collision with root package name */
    private CharSequence f66556y0;

    /* renamed from: z0  reason: collision with root package name */
    private TextView f66557z0;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f66531D.iterator();
            while (it.hasNext()) {
                ((p) it.next()).a(MaterialDatePicker.this.s0());
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        public void onClick(View view) {
            Iterator it = MaterialDatePicker.this.f66533E.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            MaterialDatePicker.this.dismiss();
        }
    }

    class c implements I {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f66560a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f66561b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f66562c;

        c(int i10, View view, int i11) {
            this.f66560a = i10;
            this.f66561b = view;
            this.f66562c = i11;
        }

        public C0 a(View view, C0 c02) {
            int i10 = c02.f(C0.l.h()).f31837b;
            if (this.f66560a >= 0) {
                this.f66561b.getLayoutParams().height = this.f66560a + i10;
                View view2 = this.f66561b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f66561b;
            view3.setPadding(view3.getPaddingLeft(), this.f66562c + i10, this.f66561b.getPaddingRight(), this.f66561b.getPaddingBottom());
            return c02;
        }
    }

    class d extends t<S> {
        d() {
        }

        public void a() {
            MaterialDatePicker.this.f66532D0.setEnabled(false);
        }

        public void b(S s10) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            materialDatePicker.C0(materialDatePicker.q0());
            MaterialDatePicker.this.f66532D0.setEnabled(MaterialDatePicker.this.m0().J2());
        }
    }

    public static final class e<S> {

        /* renamed from: a  reason: collision with root package name */
        final i<S> f66565a;

        /* renamed from: b  reason: collision with root package name */
        int f66566b = 0;

        /* renamed from: c  reason: collision with root package name */
        a f66567c;

        /* renamed from: d  reason: collision with root package name */
        m f66568d;

        /* renamed from: e  reason: collision with root package name */
        int f66569e = 0;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f66570f = null;

        /* renamed from: g  reason: collision with root package name */
        int f66571g = 0;

        /* renamed from: h  reason: collision with root package name */
        CharSequence f66572h = null;

        /* renamed from: i  reason: collision with root package name */
        int f66573i = 0;

        /* renamed from: j  reason: collision with root package name */
        CharSequence f66574j = null;

        /* renamed from: k  reason: collision with root package name */
        int f66575k = 0;

        /* renamed from: l  reason: collision with root package name */
        CharSequence f66576l = null;

        /* renamed from: m  reason: collision with root package name */
        int f66577m = 0;

        /* renamed from: n  reason: collision with root package name */
        CharSequence f66578n = null;

        /* renamed from: o  reason: collision with root package name */
        S f66579o = null;

        /* renamed from: p  reason: collision with root package name */
        int f66580p = 0;

        private e(i<S> iVar) {
            this.f66565a = iVar;
        }

        private q b() {
            if (!this.f66565a.Q2().isEmpty()) {
                q j10 = q.j(this.f66565a.Q2().iterator().next().longValue());
                if (d(j10, this.f66567c)) {
                    return j10;
                }
            }
            q m10 = q.m();
            return d(m10, this.f66567c) ? m10 : this.f66567c.l();
        }

        public static e<Long> c() {
            return new e<>(new v());
        }

        private static boolean d(q qVar, a aVar) {
            return qVar.compareTo(aVar.l()) >= 0 && qVar.compareTo(aVar.h()) <= 0;
        }

        public MaterialDatePicker<S> a() {
            if (this.f66567c == null) {
                this.f66567c = new a.b().a();
            }
            if (this.f66569e == 0) {
                this.f66569e = this.f66565a.F0();
            }
            S s10 = this.f66579o;
            if (s10 != null) {
                this.f66565a.N1(s10);
            }
            if (this.f66567c.k() == null) {
                this.f66567c.o(b());
            }
            return MaterialDatePicker.z0(this);
        }

        public e<S> e(a aVar) {
            this.f66567c = aVar;
            return this;
        }

        public e<S> f(S s10) {
            this.f66579o = s10;
            return this;
        }
    }

    static boolean A0(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Ra.b.d(context, C9068b.f59297C, MaterialCalendar.class.getCanonicalName()), new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    private void B0() {
        int t02 = t0(requireContext());
        MaterialCalendar<S> E02 = MaterialCalendar.E0(m0(), t02, this.f66542K, this.f66543L);
        this.f66544M = E02;
        u uVar = E02;
        if (this.f66548Q == 1) {
            uVar = MaterialTextInputPicker.n0(m0(), t02, this.f66542K);
        }
        this.f66541J = uVar;
        D0();
        C0(q0());
        Q s10 = getChildFragmentManager().s();
        s10.s(C9072f.f59458A, this.f66541J);
        s10.l();
        this.f66541J.q(new d());
    }

    private void D0() {
        this.f66557z0.setText((this.f66548Q != 1 || !w0()) ? this.f66536F0 : this.f66538G0);
    }

    private void E0(CheckableImageButton checkableImageButton) {
        this.f66529B0.setContentDescription(this.f66548Q == 1 ? checkableImageButton.getContext().getString(C9076j.f59552I) : checkableImageButton.getContext().getString(C9076j.f59554K));
    }

    /* access modifiers changed from: private */
    public i<S> m0() {
        if (this.f66540I == null) {
            this.f66540I = (i) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f66540I;
    }

    private static CharSequence n0(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] split = TextUtils.split(String.valueOf(charSequence), "\n");
        return split.length > 1 ? split[0] : charSequence;
    }

    private String o0() {
        return m0().P0(requireContext());
    }

    private static int r0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C9070d.f59403c0);
        int i10 = q.m().f66637d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C9070d.f59407e0) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(C9070d.f59413h0));
    }

    private int t0(Context context) {
        int i10 = this.f66539H;
        return i10 != 0 ? i10 : m0().T0(context);
    }

    private void u0(Context context) {
        this.f66529B0.setTag(f66527J0);
        this.f66529B0.setImageDrawable(x(context));
        this.f66529B0.setChecked(this.f66548Q != 0);
        C4600b0.p0(this.f66529B0, (C4597a) null);
        E0(this.f66529B0);
        this.f66529B0.setOnClickListener(new o(this));
    }

    static boolean v0(Context context) {
        return A0(context, 16843277);
    }

    private boolean w0() {
        return getResources().getConfiguration().orientation == 2;
    }

    private static Drawable x(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C5443a.b(context, C9071e.f59449d));
        stateListDrawable.addState(new int[0], C5443a.b(context, C9071e.f59450e));
        return stateListDrawable;
    }

    static boolean x0(Context context) {
        return A0(context, C9068b.f59317W);
    }

    private void y(Window window) {
        if (!this.f66534E0) {
            View findViewById = requireView().findViewById(C9072f.f59491i);
            com.google.android.material.internal.e.a(window, true, v.e(findViewById), (Integer) null);
            C4600b0.E0(findViewById, new c(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
            this.f66534E0 = true;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y0(View view) {
        this.f66532D0.setEnabled(m0().J2());
        this.f66529B0.toggle();
        int i10 = 1;
        if (this.f66548Q == 1) {
            i10 = 0;
        }
        this.f66548Q = i10;
        E0(this.f66529B0);
        B0();
    }

    static <S> MaterialDatePicker<S> z0(e<S> eVar) {
        MaterialDatePicker<S> materialDatePicker = new MaterialDatePicker<>();
        Bundle bundle = new Bundle();
        bundle.putInt("OVERRIDE_THEME_RES_ID", eVar.f66566b);
        bundle.putParcelable("DATE_SELECTOR_KEY", eVar.f66565a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", eVar.f66567c);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", eVar.f66568d);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", eVar.f66569e);
        bundle.putCharSequence("TITLE_TEXT_KEY", eVar.f66570f);
        bundle.putInt("INPUT_MODE_KEY", eVar.f66580p);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", eVar.f66571g);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", eVar.f66572h);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", eVar.f66573i);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", eVar.f66574j);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", eVar.f66575k);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", eVar.f66576l);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", eVar.f66577m);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", eVar.f66578n);
        materialDatePicker.setArguments(bundle);
        return materialDatePicker;
    }

    /* access modifiers changed from: package-private */
    public void C0(String str) {
        this.f66528A0.setContentDescription(o0());
        this.f66528A0.setText(str);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f66535F.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f66539H = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f66540I = (i) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f66542K = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f66543L = (m) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f66545N = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f66546O = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f66548Q = bundle.getInt("INPUT_MODE_KEY");
        this.f66549R = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f66550S = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f66551T = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f66552U = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f66553X = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f66554Y = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f66555Z = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f66556y0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f66546O;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.f66545N);
        }
        this.f66536F0 = charSequence;
        this.f66538G0 = n0(charSequence);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), t0(requireContext()));
        Context context = dialog.getContext();
        this.f66547P = v0(context);
        this.f66530C0 = new C9286g(context, (AttributeSet) null, C9068b.f59297C, C9077k.f59587D);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C9078l.f59804R3, C9068b.f59297C, C9077k.f59587D);
        int color = obtainStyledAttributes.getColor(C9078l.f59814S3, 0);
        obtainStyledAttributes.recycle();
        this.f66530C0.Q(context);
        this.f66530C0.b0(ColorStateList.valueOf(color));
        this.f66530C0.a0(C4600b0.u(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f66547P ? C9074h.f59515D : C9074h.f59514C, viewGroup);
        Context context = inflate.getContext();
        m mVar = this.f66543L;
        if (mVar != null) {
            mVar.h(context);
        }
        if (this.f66547P) {
            inflate.findViewById(C9072f.f59458A).setLayoutParams(new LinearLayout.LayoutParams(r0(context), -2));
        } else {
            inflate.findViewById(C9072f.f59459B).setLayoutParams(new LinearLayout.LayoutParams(r0(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(C9072f.f59465H);
        this.f66528A0 = textView;
        C4600b0.r0(textView, 1);
        this.f66529B0 = (CheckableImageButton) inflate.findViewById(C9072f.f59466I);
        this.f66557z0 = (TextView) inflate.findViewById(C9072f.f59468K);
        u0(context);
        this.f66532D0 = (Button) inflate.findViewById(C9072f.f59486d);
        if (m0().J2()) {
            this.f66532D0.setEnabled(true);
        } else {
            this.f66532D0.setEnabled(false);
        }
        this.f66532D0.setTag(f66525H0);
        CharSequence charSequence = this.f66550S;
        if (charSequence != null) {
            this.f66532D0.setText(charSequence);
        } else {
            int i10 = this.f66549R;
            if (i10 != 0) {
                this.f66532D0.setText(i10);
            }
        }
        CharSequence charSequence2 = this.f66552U;
        if (charSequence2 != null) {
            this.f66532D0.setContentDescription(charSequence2);
        } else if (this.f66551T != 0) {
            this.f66532D0.setContentDescription(getContext().getResources().getText(this.f66551T));
        }
        this.f66532D0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(C9072f.f59483a);
        button.setTag(f66526I0);
        CharSequence charSequence3 = this.f66554Y;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i11 = this.f66553X;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        CharSequence charSequence4 = this.f66556y0;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f66555Z != 0) {
            button.setContentDescription(getContext().getResources().getText(this.f66555Z));
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f66537G.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f66539H);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f66540I);
        a.b bVar = new a.b(this.f66542K);
        MaterialCalendar<S> materialCalendar = this.f66544M;
        q z02 = materialCalendar == null ? null : materialCalendar.z0();
        if (z02 != null) {
            bVar.c(z02.f66639f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f66543L);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f66545N);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f66546O);
        bundle.putInt("INPUT_MODE_KEY", this.f66548Q);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f66549R);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f66550S);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f66551T);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f66552U);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f66553X);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f66554Y);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f66555Z);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f66556y0);
    }

    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f66547P) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f66530C0);
            y(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(C9070d.f59411g0);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f66530C0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new C9139a(requireDialog(), rect));
        }
        B0();
    }

    public void onStop() {
        this.f66541J.m0();
        super.onStop();
    }

    public String q0() {
        return m0().F1(getContext());
    }

    public final S s0() {
        return m0().W2();
    }

    public boolean v(DialogInterface.OnCancelListener onCancelListener) {
        return this.f66535F.add(onCancelListener);
    }

    public boolean w(p<? super S> pVar) {
        return this.f66531D.add(pVar);
    }
}
