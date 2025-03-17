package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.c;
import i.C5421a;
import j.C5443a;
import n.C5577b;

public class AppCompatSpinner extends Spinner {
    @SuppressLint({"ResourceType"})

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f16089i = {16843505};

    /* renamed from: a  reason: collision with root package name */
    private final C4990b f16090a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f16091b;

    /* renamed from: c  reason: collision with root package name */
    private A f16092c;

    /* renamed from: d  reason: collision with root package name */
    private SpinnerAdapter f16093d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f16094e;

    /* renamed from: f  reason: collision with root package name */
    private h f16095f;

    /* renamed from: g  reason: collision with root package name */
    int f16096g;

    /* renamed from: h  reason: collision with root package name */
    final Rect f16097h;

    class a extends A {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ f f16098j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, f fVar) {
            super(view);
            this.f16098j = fVar;
        }

        public C5577b b() {
            return this.f16098j;
        }

        public boolean c() {
            if (AppCompatSpinner.this.getInternalPopup().b()) {
                return true;
            }
            AppCompatSpinner.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().b()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    private static final class c {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!H2.c.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    class d implements h, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        androidx.appcompat.app.c f16101a;

        /* renamed from: b  reason: collision with root package name */
        private ListAdapter f16102b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f16103c;

        d() {
        }

        public boolean b() {
            androidx.appcompat.app.c cVar = this.f16101a;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        public void c(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public int d() {
            return 0;
        }

        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f16101a;
            if (cVar != null) {
                cVar.dismiss();
                this.f16101a = null;
            }
        }

        public void f(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public CharSequence g() {
            return this.f16103c;
        }

        public Drawable h() {
            return null;
        }

        public void i(CharSequence charSequence) {
            this.f16103c = charSequence;
        }

        public void j(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public void k(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public void l(int i10, int i11) {
            if (this.f16102b != null) {
                c.a aVar = new c.a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f16103c;
                if (charSequence != null) {
                    aVar.setTitle(charSequence);
                }
                androidx.appcompat.app.c create = aVar.m(this.f16102b, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
                this.f16101a = create;
                ListView k10 = create.k();
                k10.setTextDirection(i10);
                k10.setTextAlignment(i11);
                this.f16101a.show();
            }
        }

        public int m() {
            return 0;
        }

        public void n(ListAdapter listAdapter) {
            this.f16102b = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner.this.setSelection(i10);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick((View) null, i10, this.f16102b.getItemId(i10));
            }
            dismiss();
        }
    }

    private static class e implements ListAdapter, SpinnerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private SpinnerAdapter f16105a;

        /* renamed from: b  reason: collision with root package name */
        private ListAdapter f16106b;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f16105a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f16106b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            } else if (spinnerAdapter instanceof I) {
                I i10 = (I) spinnerAdapter;
                if (i10.getDropDownViewTheme() == null) {
                    i10.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f16106b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f16105a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f16105a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f16105a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f16105a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i10);
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f16105a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f16106b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f16105a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f16105a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class f extends B implements h {

        /* renamed from: I  reason: collision with root package name */
        private CharSequence f16107I;

        /* renamed from: J  reason: collision with root package name */
        ListAdapter f16108J;

        /* renamed from: K  reason: collision with root package name */
        private final Rect f16109K = new Rect();

        /* renamed from: L  reason: collision with root package name */
        private int f16110L;

        class a implements AdapterView.OnItemClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AppCompatSpinner f16112a;

            a(AppCompatSpinner appCompatSpinner) {
                this.f16112a = appCompatSpinner;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    AppCompatSpinner.this.performItemClick(view, i10, fVar.f16108J.getItemId(i10));
                }
                f.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.V(AppCompatSpinner.this)) {
                    f.this.dismiss();
                    return;
                }
                f.this.T();
                f.super.a();
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f16115a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f16115a = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f16115a);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            D(AppCompatSpinner.this);
            J(true);
            P(0);
            L(new a(AppCompatSpinner.this));
        }

        /* access modifiers changed from: package-private */
        public void T() {
            int i10;
            Drawable h10 = h();
            if (h10 != null) {
                h10.getPadding(AppCompatSpinner.this.f16097h);
                i10 = U.b(AppCompatSpinner.this) ? AppCompatSpinner.this.f16097h.right : -AppCompatSpinner.this.f16097h.left;
            } else {
                Rect rect = AppCompatSpinner.this.f16097h;
                rect.right = 0;
                rect.left = 0;
                i10 = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i11 = appCompatSpinner.f16096g;
            if (i11 == -2) {
                int a10 = appCompatSpinner.a((SpinnerAdapter) this.f16108J, h());
                int i12 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f16097h;
                int i13 = (i12 - rect2.left) - rect2.right;
                if (a10 > i13) {
                    a10 = i13;
                }
                F(Math.max(a10, (width - paddingLeft) - paddingRight));
            } else if (i11 == -1) {
                F((width - paddingLeft) - paddingRight);
            } else {
                F(i11);
            }
            f(U.b(AppCompatSpinner.this) ? i10 + (((width - paddingRight) - z()) - U()) : i10 + paddingLeft + U());
        }

        public int U() {
            return this.f16110L;
        }

        /* access modifiers changed from: package-private */
        public boolean V(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f16109K);
        }

        public CharSequence g() {
            return this.f16107I;
        }

        public void i(CharSequence charSequence) {
            this.f16107I = charSequence;
        }

        public void k(int i10) {
            this.f16110L = i10;
        }

        public void l(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean b10 = b();
            T();
            I(2);
            super.a();
            ListView p10 = p();
            p10.setChoiceMode(1);
            p10.setTextDirection(i10);
            p10.setTextAlignment(i11);
            Q(AppCompatSpinner.this.getSelectedItemPosition());
            if (!b10 && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                K(new c(bVar));
            }
        }

        public void n(ListAdapter listAdapter) {
            super.n(listAdapter);
            this.f16108J = listAdapter;
        }
    }

    static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        boolean f16117a;

        class a implements Parcelable.Creator<g> {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            /* renamed from: b */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f16117a ? (byte) 1 : 0);
        }

        g(Parcel parcel) {
            super(parcel);
            this.f16117a = parcel.readByte() != 0;
        }
    }

    interface h {
        boolean b();

        void c(Drawable drawable);

        int d();

        void dismiss();

        void f(int i10);

        CharSequence g();

        Drawable h();

        void i(CharSequence charSequence);

        void j(int i10);

        void k(int i10);

        void l(int i10, int i11);

        int m();

        void n(ListAdapter listAdapter);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5421a.f23881K);
    }

    /* access modifiers changed from: package-private */
    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.f16097h);
        Rect rect = this.f16097h;
        return i11 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f16095f.l(getTextDirection(), getTextAlignment());
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C4990b bVar = this.f16090a;
        if (bVar != null) {
            bVar.b();
        }
    }

    public int getDropDownHorizontalOffset() {
        h hVar = this.f16095f;
        return hVar != null ? hVar.d() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        h hVar = this.f16095f;
        return hVar != null ? hVar.m() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.f16095f != null ? this.f16096g : super.getDropDownWidth();
    }

    /* access modifiers changed from: package-private */
    public final h getInternalPopup() {
        return this.f16095f;
    }

    public Drawable getPopupBackground() {
        h hVar = this.f16095f;
        return hVar != null ? hVar.h() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f16091b;
    }

    public CharSequence getPrompt() {
        h hVar = this.f16095f;
        return hVar != null ? hVar.g() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C4990b bVar = this.f16090a;
        if (bVar != null) {
            return bVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C4990b bVar = this.f16090a;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f16095f;
        if (hVar != null && hVar.b()) {
            this.f16095f.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f16095f != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (gVar.f16117a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        h hVar = this.f16095f;
        gVar.f16117a = hVar != null && hVar.b();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        A a10 = this.f16092c;
        if (a10 == null || !a10.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        h hVar = this.f16095f;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.b()) {
            return true;
        }
        b();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C4990b bVar = this.f16090a;
        if (bVar != null) {
            bVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C4990b bVar = this.f16090a;
        if (bVar != null) {
            bVar.g(i10);
        }
    }

    public void setDropDownHorizontalOffset(int i10) {
        h hVar = this.f16095f;
        if (hVar != null) {
            hVar.k(i10);
            this.f16095f.f(i10);
            return;
        }
        super.setDropDownHorizontalOffset(i10);
    }

    public void setDropDownVerticalOffset(int i10) {
        h hVar = this.f16095f;
        if (hVar != null) {
            hVar.j(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    public void setDropDownWidth(int i10) {
        if (this.f16095f != null) {
            this.f16096g = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f16095f;
        if (hVar != null) {
            hVar.c(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(C5443a.b(getPopupContext(), i10));
    }

    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f16095f;
        if (hVar != null) {
            hVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C4990b bVar = this.f16090a;
        if (bVar != null) {
            bVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C4990b bVar = this.f16090a;
        if (bVar != null) {
            bVar.j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f16094e) {
            this.f16093d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f16095f != null) {
            Context context = this.f16091b;
            if (context == null) {
                context = getContext();
            }
            this.f16095f.n(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r11 != null) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f16097h = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.H.a(r6, r0)
            int[] r0 = i.C5430j.f24178g2
            r1 = 0
            androidx.appcompat.widget.M r0 = androidx.appcompat.widget.M.v(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.b r2 = new androidx.appcompat.widget.b
            r2.<init>(r6)
            r6.f16090a = r2
            if (r11 == 0) goto L_0x0029
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
            r6.f16091b = r2
            goto L_0x003b
        L_0x0029:
            int r11 = i.C5430j.f24203l2
            int r11 = r0.n(r11, r1)
            if (r11 == 0) goto L_0x0039
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r7, (int) r11)
            r6.f16091b = r2
            goto L_0x003b
        L_0x0039:
            r6.f16091b = r7
        L_0x003b:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x006d
            int[] r11 = f16089i     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0053 }
            if (r3 == 0) goto L_0x0055
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0055
        L_0x0050:
            r7 = move-exception
            r2 = r11
            goto L_0x0067
        L_0x0053:
            r3 = move-exception
            goto L_0x005d
        L_0x0055:
            r11.recycle()
            goto L_0x006d
        L_0x0059:
            r7 = move-exception
            goto L_0x0067
        L_0x005b:
            r3 = move-exception
            r11 = r2
        L_0x005d:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0050 }
            if (r11 == 0) goto L_0x006d
            goto L_0x0055
        L_0x0067:
            if (r2 == 0) goto L_0x006c
            r2.recycle()
        L_0x006c:
            throw r7
        L_0x006d:
            r11 = 1
            if (r10 == 0) goto L_0x00aa
            if (r10 == r11) goto L_0x0073
            goto L_0x00ba
        L_0x0073:
            androidx.appcompat.widget.AppCompatSpinner$f r10 = new androidx.appcompat.widget.AppCompatSpinner$f
            android.content.Context r3 = r6.f16091b
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f16091b
            int[] r4 = i.C5430j.f24178g2
            androidx.appcompat.widget.M r1 = androidx.appcompat.widget.M.v(r3, r8, r4, r9, r1)
            int r3 = i.C5430j.f24198k2
            r4 = -2
            int r3 = r1.m(r3, r4)
            r6.f16096g = r3
            int r3 = i.C5430j.f24188i2
            android.graphics.drawable.Drawable r3 = r1.g(r3)
            r10.c(r3)
            int r3 = i.C5430j.f24193j2
            java.lang.String r3 = r0.o(r3)
            r10.i(r3)
            r1.x()
            r6.f16095f = r10
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r6, r10)
            r6.f16092c = r1
            goto L_0x00ba
        L_0x00aa:
            androidx.appcompat.widget.AppCompatSpinner$d r10 = new androidx.appcompat.widget.AppCompatSpinner$d
            r10.<init>()
            r6.f16095f = r10
            int r1 = i.C5430j.f24193j2
            java.lang.String r1 = r0.o(r1)
            r10.i(r1)
        L_0x00ba:
            int r10 = i.C5430j.f24183h2
            java.lang.CharSequence[] r10 = r0.q(r10)
            if (r10 == 0) goto L_0x00d2
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = i.C5427g.f24023q
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00d2:
            r0.x()
            r6.f16094e = r11
            android.widget.SpinnerAdapter r7 = r6.f16093d
            if (r7 == 0) goto L_0x00e0
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f16093d = r2
        L_0x00e0:
            androidx.appcompat.widget.b r7 = r6.f16090a
            r7.e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
