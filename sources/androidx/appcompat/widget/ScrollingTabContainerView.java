package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.sugarcube.app.base.data.source.CatalogRepository;
import i.C5421a;

public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: j  reason: collision with root package name */
    private static final Interpolator f16304j = new DecelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    Runnable f16305a;

    /* renamed from: b  reason: collision with root package name */
    private c f16306b;

    /* renamed from: c  reason: collision with root package name */
    LinearLayoutCompat f16307c;

    /* renamed from: d  reason: collision with root package name */
    private Spinner f16308d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f16309e;

    /* renamed from: f  reason: collision with root package name */
    int f16310f;

    /* renamed from: g  reason: collision with root package name */
    int f16311g;

    /* renamed from: h  reason: collision with root package name */
    private int f16312h;

    /* renamed from: i  reason: collision with root package name */
    private int f16313i;

    private class TabView extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        private final int[] f16314a;

        /* renamed from: b  reason: collision with root package name */
        private a.c f16315b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f16316c;

        /* renamed from: d  reason: collision with root package name */
        private ImageView f16317d;

        /* renamed from: e  reason: collision with root package name */
        private View f16318e;

        public TabView(Context context, a.c cVar, boolean z10) {
            super(context, (AttributeSet) null, C5421a.f23889d);
            int[] iArr = {16842964};
            this.f16314a = iArr;
            this.f16315b = cVar;
            M v10 = M.v(context, (AttributeSet) null, iArr, C5421a.f23889d, 0);
            if (v10.s(0)) {
                setBackgroundDrawable(v10.g(0));
            }
            v10.x();
            if (z10) {
                setGravity(8388627);
            }
            c();
        }

        public void a(a.c cVar) {
            this.f16315b = cVar;
            c();
        }

        public a.c b() {
            return this.f16315b;
        }

        public void c() {
            a.c cVar = this.f16315b;
            View b10 = cVar.b();
            CharSequence charSequence = null;
            if (b10 != null) {
                ViewParent parent = b10.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b10);
                    }
                    addView(b10);
                }
                this.f16318e = b10;
                TextView textView = this.f16316c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f16317d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f16317d.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.f16318e;
            if (view != null) {
                removeView(view);
                this.f16318e = null;
            }
            Drawable c10 = cVar.c();
            CharSequence d10 = cVar.d();
            if (c10 != null) {
                if (this.f16317d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f16317d = appCompatImageView;
                }
                this.f16317d.setImageDrawable(c10);
                this.f16317d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f16317d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f16317d.setImageDrawable((Drawable) null);
                }
            }
            boolean isEmpty = TextUtils.isEmpty(d10);
            if (!isEmpty) {
                if (this.f16316c == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, C5421a.f23890e);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f16316c = appCompatTextView;
                }
                this.f16316c.setText(d10);
                this.f16316c.setVisibility(0);
            } else {
                TextView textView2 = this.f16316c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f16316c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f16317d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            if (isEmpty) {
                charSequence = cVar.a();
            }
            S.a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i10, int i11) {
            int i12;
            super.onMeasure(i10, i11);
            if (ScrollingTabContainerView.this.f16310f > 0 && getMeasuredWidth() > (i12 = ScrollingTabContainerView.this.f16310f)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, CatalogRepository.FETCH_FLAG_SDB), i11);
            }
        }

        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f16320a;

        a(View view) {
            this.f16320a = view;
        }

        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.f16320a.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.f16320a.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.f16305a = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        public int getCount() {
            return ScrollingTabContainerView.this.f16307c.getChildCount();
        }

        public Object getItem(int i10) {
            return ((TabView) ScrollingTabContainerView.this.f16307c.getChildAt(i10)).b();
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.c((a.c) getItem(i10), true);
            }
            ((TabView) view).a((a.c) getItem(i10));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        public void onClick(View view) {
            ((TabView) view).b().e();
            int childCount = ScrollingTabContainerView.this.f16307c.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ScrollingTabContainerView.this.f16307c.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private Spinner b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), (AttributeSet) null, C5421a.f23893h);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private boolean d() {
        Spinner spinner = this.f16308d;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (!d()) {
            if (this.f16308d == null) {
                this.f16308d = b();
            }
            removeView(this.f16307c);
            addView(this.f16308d, new ViewGroup.LayoutParams(-2, -1));
            if (this.f16308d.getAdapter() == null) {
                this.f16308d.setAdapter(new b());
            }
            Runnable runnable = this.f16305a;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f16305a = null;
            }
            this.f16308d.setSelection(this.f16313i);
        }
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f16308d);
        addView(this.f16307c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f16308d.getSelectedItemPosition());
        return false;
    }

    public void a(int i10) {
        View childAt = this.f16307c.getChildAt(i10);
        Runnable runnable = this.f16305a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f16305a = aVar;
        post(aVar);
    }

    /* access modifiers changed from: package-private */
    public TabView c(a.c cVar, boolean z10) {
        TabView tabView = new TabView(getContext(), cVar, z10);
        if (z10) {
            tabView.setBackgroundDrawable((Drawable) null);
            tabView.setLayoutParams(new AbsListView.LayoutParams(-1, this.f16312h));
        } else {
            tabView.setFocusable(true);
            if (this.f16306b == null) {
                this.f16306b = new c();
            }
            tabView.setOnClickListener(this.f16306b);
        }
        return tabView;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f16305a;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(getContext());
        setContentHeight(b10.f());
        this.f16311g = b10.e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f16305a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((TabView) view).b().e();
    }

    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = mode == 1073741824;
        setFillViewport(z10);
        int childCount = this.f16307c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f16310f = -1;
        } else {
            if (childCount > 2) {
                this.f16310f = (int) (((float) View.MeasureSpec.getSize(i10)) * 0.4f);
            } else {
                this.f16310f = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f16310f = Math.min(this.f16310f, this.f16311g);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f16312h, CatalogRepository.FETCH_FLAG_SDB);
        if (z10 || !this.f16309e) {
            f();
        } else {
            this.f16307c.measure(0, makeMeasureSpec);
            if (this.f16307c.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                e();
            } else {
                f();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z10 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f16313i);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f16309e = z10;
    }

    public void setContentHeight(int i10) {
        this.f16312h = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f16313i = i10;
        int childCount = this.f16307c.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f16307c.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f16308d;
        if (spinner != null && i10 >= 0) {
            spinner.setSelection(i10);
        }
    }
}
