package Ma;

import Ea.C9068b;
import Ea.C9077k;
import Ea.C9078l;
import I2.C4600b0;
import La.C9138a;
import Ra.b;
import Ua.C9286g;
import Xa.C9359a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.appcompat.app.c;
import androidx.appcompat.view.d;

/* renamed from: Ma.b  reason: case insensitive filesystem */
public class C9140b extends c.a {

    /* renamed from: e  reason: collision with root package name */
    private static final int f61696e = C9068b.f59321a;

    /* renamed from: f  reason: collision with root package name */
    private static final int f61697f = C9077k.f59592b;

    /* renamed from: g  reason: collision with root package name */
    private static final int f61698g = C9068b.f59361z;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f61699c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f61700d;

    public C9140b(Context context) {
        this(context, 0);
    }

    private static Context q(Context context) {
        int r10 = r(context);
        Context c10 = C9359a.c(context, (AttributeSet) null, f61696e, f61697f);
        return r10 == 0 ? c10 : new d(c10, r10);
    }

    private static int r(Context context) {
        TypedValue a10 = b.a(context, f61698g);
        if (a10 == null) {
            return 0;
        }
        return a10.data;
    }

    private static int s(Context context, int i10) {
        return i10 == 0 ? r(context) : i10;
    }

    /* renamed from: A */
    public C9140b g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (C9140b) super.g(charSequence, onClickListener);
    }

    public C9140b B(int i10, DialogInterface.OnClickListener onClickListener) {
        return (C9140b) super.h(i10, onClickListener);
    }

    /* renamed from: C */
    public C9140b i(DialogInterface.OnCancelListener onCancelListener) {
        return (C9140b) super.i(onCancelListener);
    }

    public C9140b D(DialogInterface.OnDismissListener onDismissListener) {
        return (C9140b) super.j(onDismissListener);
    }

    /* renamed from: E */
    public C9140b k(DialogInterface.OnKeyListener onKeyListener) {
        return (C9140b) super.k(onKeyListener);
    }

    /* renamed from: F */
    public C9140b setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (C9140b) super.setPositiveButton(i10, onClickListener);
    }

    /* renamed from: G */
    public C9140b l(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (C9140b) super.l(charSequence, onClickListener);
    }

    /* renamed from: H */
    public C9140b m(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
        return (C9140b) super.m(listAdapter, i10, onClickListener);
    }

    public C9140b I(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
        return (C9140b) super.n(charSequenceArr, i10, onClickListener);
    }

    public C9140b J(int i10) {
        return (C9140b) super.o(i10);
    }

    /* renamed from: K */
    public C9140b setTitle(CharSequence charSequence) {
        return (C9140b) super.setTitle(charSequence);
    }

    /* renamed from: L */
    public C9140b setView(View view) {
        return (C9140b) super.setView(view);
    }

    public c create() {
        c create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f61699c;
        if (drawable instanceof C9286g) {
            ((C9286g) drawable).a0(C4600b0.u(decorView));
        }
        window.setBackgroundDrawable(C9141c.b(this.f61699c, this.f61700d));
        decorView.setOnTouchListener(new C9139a(create, this.f61700d));
        return create;
    }

    /* renamed from: t */
    public C9140b a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (C9140b) super.a(listAdapter, onClickListener);
    }

    public C9140b u(boolean z10) {
        return (C9140b) super.b(z10);
    }

    /* renamed from: v */
    public C9140b c(View view) {
        return (C9140b) super.c(view);
    }

    /* renamed from: w */
    public C9140b d(Drawable drawable) {
        return (C9140b) super.d(drawable);
    }

    public C9140b x(int i10) {
        return (C9140b) super.e(i10);
    }

    /* renamed from: y */
    public C9140b f(CharSequence charSequence) {
        return (C9140b) super.f(charSequence);
    }

    /* renamed from: z */
    public C9140b setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (C9140b) super.setNegativeButton(i10, onClickListener);
    }

    public C9140b(Context context, int i10) {
        super(q(context), s(context, i10));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i11 = f61696e;
        int i12 = f61697f;
        this.f61700d = C9141c.a(context2, i11, i12);
        int c10 = C9138a.c(context2, C9068b.f59352q, getClass().getCanonicalName());
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes((AttributeSet) null, C9078l.f59916c3, i11, i12);
        int color = obtainStyledAttributes.getColor(C9078l.f59971h3, c10);
        obtainStyledAttributes.recycle();
        C9286g gVar = new C9286g(context2, (AttributeSet) null, i11, i12);
        gVar.Q(context2);
        gVar.b0(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(16844145, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                gVar.Y(dimension);
            }
        }
        this.f61699c = gVar;
    }
}
