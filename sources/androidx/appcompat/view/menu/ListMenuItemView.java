package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.M;
import i.C5421a;
import i.C5426f;
import i.C5427g;
import i.C5430j;

public class ListMenuItemView extends LinearLayout implements l.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a  reason: collision with root package name */
    private h f15727a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f15728b;

    /* renamed from: c  reason: collision with root package name */
    private RadioButton f15729c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f15730d;

    /* renamed from: e  reason: collision with root package name */
    private CheckBox f15731e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f15732f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f15733g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f15734h;

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f15735i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f15736j;

    /* renamed from: k  reason: collision with root package name */
    private int f15737k;

    /* renamed from: l  reason: collision with root package name */
    private Context f15738l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f15739m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f15740n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f15741o;

    /* renamed from: p  reason: collision with root package name */
    private LayoutInflater f15742p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f15743q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5421a.f23875E);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f15735i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void d() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C5427g.f24014h, this, false);
        this.f15731e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(C5427g.f24015i, this, false);
        this.f15728b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C5427g.f24017k, this, false);
        this.f15729c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f15742p == null) {
            this.f15742p = LayoutInflater.from(getContext());
        }
        return this.f15742p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f15733g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f15734h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f15734h.getLayoutParams();
            rect.top += this.f15734h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public void c(h hVar, int i10) {
        this.f15727a = hVar;
        setVisibility(hVar.isVisible() ? 0 : 8);
        setTitle(hVar.i(this));
        setCheckable(hVar.isCheckable());
        h(hVar.A(), hVar.g());
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.getContentDescription());
    }

    public boolean e() {
        return false;
    }

    public h getItemData() {
        return this.f15727a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (!z10 || !this.f15727a.A()) ? 8 : 0;
        if (i10 == 0) {
            this.f15732f.setText(this.f15727a.h());
        }
        if (this.f15732f.getVisibility() != i10) {
            this.f15732f.setVisibility(i10);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f15736j);
        TextView textView = (TextView) findViewById(C5426f.f23977C);
        this.f15730d = textView;
        int i10 = this.f15737k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f15738l, i10);
        }
        this.f15732f = (TextView) findViewById(C5426f.f24003w);
        ImageView imageView = (ImageView) findViewById(C5426f.f24006z);
        this.f15733g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f15740n);
        }
        this.f15734h = (ImageView) findViewById(C5426f.f23998r);
        this.f15735i = (LinearLayout) findViewById(C5426f.f23992l);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        if (this.f15728b != null && this.f15739m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f15728b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        View view;
        CompoundButton compoundButton;
        if (z10 || this.f15729c != null || this.f15731e != null) {
            if (this.f15727a.m()) {
                if (this.f15729c == null) {
                    g();
                }
                compoundButton = this.f15729c;
                view = this.f15731e;
            } else {
                if (this.f15731e == null) {
                    d();
                }
                compoundButton = this.f15731e;
                view = this.f15729c;
            }
            if (z10) {
                compoundButton.setChecked(this.f15727a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f15731e;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f15729c;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f15727a.m()) {
            if (this.f15729c == null) {
                g();
            }
            compoundButton = this.f15729c;
        } else {
            if (this.f15731e == null) {
                d();
            }
            compoundButton = this.f15731e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f15743q = z10;
        this.f15739m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f15734h;
        if (imageView != null) {
            imageView.setVisibility((this.f15741o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f15727a.z() || this.f15743q;
        if (z10 || this.f15739m) {
            ImageView imageView = this.f15728b;
            if (imageView != null || drawable != null || this.f15739m) {
                if (imageView == null) {
                    f();
                }
                if (drawable != null || this.f15739m) {
                    ImageView imageView2 = this.f15728b;
                    if (!z10) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.f15728b.getVisibility() != 0) {
                        this.f15728b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f15728b.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f15730d.setText(charSequence);
            if (this.f15730d.getVisibility() != 0) {
                this.f15730d.setVisibility(0);
            }
        } else if (this.f15730d.getVisibility() != 8) {
            this.f15730d.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        M v10 = M.v(getContext(), attributeSet, C5430j.f24119T1, i10, 0);
        this.f15736j = v10.g(C5430j.f24127V1);
        this.f15737k = v10.n(C5430j.f24123U1, -1);
        this.f15739m = v10.a(C5430j.f24131W1, false);
        this.f15738l = context;
        this.f15740n = v10.g(C5430j.f24135X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, C5421a.f23872B, 0);
        this.f15741o = obtainStyledAttributes.hasValue(0);
        v10.x();
        obtainStyledAttributes.recycle();
    }
}
