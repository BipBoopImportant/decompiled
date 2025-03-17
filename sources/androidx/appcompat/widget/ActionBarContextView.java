package androidx.appcompat.widget;

import I2.C4600b0;
import I2.C4618k0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.f;
import com.sugarcube.app.base.data.source.CatalogRepository;
import i.C5421a;
import i.C5426f;
import i.C5427g;
import i.C5430j;

public class ActionBarContextView extends AbsActionBarView {

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f15958i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f15959j;

    /* renamed from: k  reason: collision with root package name */
    private View f15960k;

    /* renamed from: l  reason: collision with root package name */
    private View f15961l;

    /* renamed from: m  reason: collision with root package name */
    private View f15962m;

    /* renamed from: n  reason: collision with root package name */
    private LinearLayout f15963n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f15964o;

    /* renamed from: p  reason: collision with root package name */
    private TextView f15965p;

    /* renamed from: q  reason: collision with root package name */
    private int f15966q;

    /* renamed from: r  reason: collision with root package name */
    private int f15967r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f15968s;

    /* renamed from: t  reason: collision with root package name */
    private int f15969t;

    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f15970a;

        a(b bVar) {
            this.f15970a = bVar;
        }

        public void onClick(View view) {
            this.f15970a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void i() {
        if (this.f15963n == null) {
            LayoutInflater.from(getContext()).inflate(C5427g.f24007a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f15963n = linearLayout;
            this.f15964o = (TextView) linearLayout.findViewById(C5426f.f23985e);
            this.f15965p = (TextView) this.f15963n.findViewById(C5426f.f23984d);
            if (this.f15966q != 0) {
                this.f15964o.setTextAppearance(getContext(), this.f15966q);
            }
            if (this.f15967r != 0) {
                this.f15965p.setTextAppearance(getContext(), this.f15967r);
            }
        }
        this.f15964o.setText(this.f15958i);
        this.f15965p.setText(this.f15959j);
        boolean isEmpty = TextUtils.isEmpty(this.f15958i);
        boolean isEmpty2 = TextUtils.isEmpty(this.f15959j);
        int i10 = 8;
        this.f15965p.setVisibility(!isEmpty2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f15963n;
        if (!isEmpty || !isEmpty2) {
            i10 = 0;
        }
        linearLayout2.setVisibility(i10);
        if (this.f15963n.getParent() == null) {
            addView(this.f15963n);
        }
    }

    public /* bridge */ /* synthetic */ C4618k0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f15960k == null) {
            k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f15959j;
    }

    public CharSequence getTitle() {
        return this.f15958i;
    }

    public void h(b bVar) {
        View view = this.f15960k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f15969t, this, false);
            this.f15960k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f15960k);
        }
        View findViewById = this.f15960k.findViewById(C5426f.f23989i);
        this.f15961l = findViewById;
        findViewById.setOnClickListener(new a(bVar));
        f fVar = (f) bVar.e();
        ActionMenuPresenter actionMenuPresenter = this.f15940d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.A();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f15940d = actionMenuPresenter2;
        actionMenuPresenter2.L(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        fVar.c(this.f15940d, this.f15938b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f15940d.q(this);
        this.f15939c = actionMenuView;
        actionMenuView.setBackground((Drawable) null);
        addView(this.f15939c, layoutParams);
    }

    public boolean j() {
        return this.f15968s;
    }

    public void k() {
        removeAllViews();
        this.f15962m = null;
        this.f15939c = null;
        this.f15940d = null;
        View view = this.f15961l;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public boolean l() {
        ActionMenuPresenter actionMenuPresenter = this.f15940d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.M();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f15940d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.D();
            this.f15940d.E();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean b10 = U.b(this);
        int paddingRight = b10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f15960k;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f15960k.getLayoutParams();
            int i14 = b10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = b10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d10 = AbsActionBarView.d(paddingRight, i14, b10);
            paddingRight = AbsActionBarView.d(d10 + e(this.f15960k, d10, paddingTop, paddingTop2, b10), i15, b10);
        }
        int i16 = paddingRight;
        LinearLayout linearLayout = this.f15963n;
        if (!(linearLayout == null || this.f15962m != null || linearLayout.getVisibility() == 8)) {
            i16 += e(this.f15963n, i16, paddingTop, paddingTop2, b10);
        }
        int i17 = i16;
        View view2 = this.f15962m;
        if (view2 != null) {
            e(view2, i17, paddingTop, paddingTop2, b10);
        }
        int paddingLeft = b10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f15939c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b10);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = CatalogRepository.FETCH_FLAG_SDB;
        if (mode != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i11) != 0) {
            int size = View.MeasureSpec.getSize(i10);
            int i13 = this.f15941e;
            if (i13 <= 0) {
                i13 = View.MeasureSpec.getSize(i11);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i14 = i13 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
            View view = this.f15960k;
            if (view != null) {
                int c10 = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f15960k.getLayoutParams();
                paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f15939c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f15939c, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f15963n;
            if (linearLayout != null && this.f15962m == null) {
                if (this.f15968s) {
                    this.f15963n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f15963n.getMeasuredWidth();
                    boolean z10 = measuredWidth <= paddingLeft;
                    if (z10) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f15963n.setVisibility(z10 ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f15962m;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i15 = layoutParams.width;
                int i16 = i15 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i15 >= 0) {
                    paddingLeft = Math.min(i15, paddingLeft);
                }
                int i17 = layoutParams.height;
                if (i17 == -2) {
                    i12 = Integer.MIN_VALUE;
                }
                if (i17 >= 0) {
                    i14 = Math.min(i17, i14);
                }
                this.f15962m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i16), View.MeasureSpec.makeMeasureSpec(i14, i12));
            }
            if (this.f15941e <= 0) {
                int childCount = getChildCount();
                int i18 = 0;
                for (int i19 = 0; i19 < childCount; i19++) {
                    int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i18) {
                        i18 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i18);
                return;
            }
            setMeasuredDimension(size, i13);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i10) {
        this.f15941e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f15962m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f15962m = view;
        if (!(view == null || (linearLayout = this.f15963n) == null)) {
            removeView(linearLayout);
            this.f15963n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f15959j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f15958i = charSequence;
        i();
        C4600b0.s0(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f15968s) {
            requestLayout();
        }
        this.f15968s = z10;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5421a.f23895j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        M v10 = M.v(context, attributeSet, C5430j.f24265y, i10, 0);
        setBackground(v10.g(C5430j.f24270z));
        this.f15966q = v10.n(C5430j.f24053D, 0);
        this.f15967r = v10.n(C5430j.f24049C, 0);
        this.f15941e = v10.m(C5430j.f24045B, 0);
        this.f15969t = v10.n(C5430j.f24040A, C5427g.f24010d);
        v10.x();
    }
}
