package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.S;
import com.sugarcube.app.base.data.source.CatalogRepository;
import i.C5430j;
import n.C5577b;

public class ActionMenuItemView extends AppCompatTextView implements l.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: a  reason: collision with root package name */
    h f15712a;

    /* renamed from: b  reason: collision with root package name */
    private CharSequence f15713b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f15714c;

    /* renamed from: d  reason: collision with root package name */
    f.b f15715d;

    /* renamed from: e  reason: collision with root package name */
    private A f15716e;

    /* renamed from: f  reason: collision with root package name */
    b f15717f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15718g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15719h;

    /* renamed from: i  reason: collision with root package name */
    private int f15720i;

    /* renamed from: j  reason: collision with root package name */
    private int f15721j;

    /* renamed from: k  reason: collision with root package name */
    private int f15722k;

    private class a extends A {
        public a() {
            super(ActionMenuItemView.this);
        }

        public C5577b b() {
            b bVar = ActionMenuItemView.this.f15717f;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.f$b r1 = r0.f15715d
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.h r0 = r0.f15712a
                boolean r0 = r1.d(r0)
                if (r0 == 0) goto L_0x001c
                n.b r0 = r3.b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.b()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.a.c():boolean");
        }
    }

    public static abstract class b {
        public abstract C5577b a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void g() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f15713b);
        if (this.f15714c != null && (!this.f15712a.B() || (!this.f15718g && !this.f15719h))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence = null;
        setText(z12 ? this.f15713b : null);
        CharSequence contentDescription = this.f15712a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f15712a.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f15712a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z12) {
                charSequence = this.f15712a.getTitle();
            }
            S.a(this, charSequence);
            return;
        }
        S.a(this, tooltipText);
    }

    public boolean a() {
        return d();
    }

    public boolean b() {
        return d() && this.f15712a.getIcon() == null;
    }

    public void c(h hVar, int i10) {
        this.f15712a = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.i(this));
        setId(hVar.getItemId());
        setVisibility(hVar.isVisible() ? 0 : 8);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.f15716e == null) {
            this.f15716e = new a();
        }
    }

    public boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    public boolean e() {
        return true;
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    public h getItemData() {
        return this.f15712a;
    }

    public void onClick(View view) {
        f.b bVar = this.f15715d;
        if (bVar != null) {
            bVar.d(this.f15712a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f15718g = f();
        g();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean d10 = d();
        if (d10 && (i12 = this.f15721j) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f15720i) : this.f15720i;
        if (mode != 1073741824 && this.f15720i > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, CatalogRepository.FETCH_FLAG_SDB), i11);
        }
        if (!d10 && this.f15714c != null) {
            super.setPadding((getMeasuredWidth() - this.f15714c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        A a10;
        if (!this.f15712a.hasSubMenu() || (a10 = this.f15716e) == null || !a10.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f15719h != z10) {
            this.f15719h = z10;
            h hVar = this.f15712a;
            if (hVar != null) {
                hVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f15714c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f15722k;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i10) / ((float) intrinsicWidth)));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i10) / ((float) intrinsicHeight)));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        g();
    }

    public void setItemInvoker(f.b bVar) {
        this.f15715d = bVar;
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f15721j = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f15717f = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f15713b = charSequence;
        g();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f15718g = f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5430j.f24250v, i10, 0);
        this.f15720i = obtainStyledAttributes.getDimensionPixelSize(C5430j.f24255w, 0);
        obtainStyledAttributes.recycle();
        this.f15722k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f15721j = -1;
        setSaveEnabled(false);
    }
}
