package androidx.appcompat.widget;

import I2.C4618k0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.sugarcube.app.base.data.source.CatalogRepository;
import i.C5421a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k.C5487a;
import y2.C6260a;

class DropDownListView extends ListView {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f16186a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    private int f16187b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f16188c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f16189d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f16190e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f16191f;

    /* renamed from: g  reason: collision with root package name */
    private d f16192g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f16193h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f16194i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f16195j;

    /* renamed from: k  reason: collision with root package name */
    private C4618k0 f16196k;

    /* renamed from: l  reason: collision with root package name */
    private androidx.core.widget.f f16197l;

    /* renamed from: m  reason: collision with root package name */
    f f16198m;

    static class a {
        static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        private static Method f16199a;

        /* renamed from: b  reason: collision with root package name */
        private static Method f16200b;

        /* renamed from: c  reason: collision with root package name */
        private static Method f16201c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f16202d = true;

        static {
            Class<AdapterView> cls = AdapterView.class;
            Class<AbsListView> cls2 = AbsListView.class;
            try {
                Class cls3 = Integer.TYPE;
                Class cls4 = Boolean.TYPE;
                Class cls5 = Float.TYPE;
                Method declaredMethod = cls2.getDeclaredMethod("positionSelector", new Class[]{cls3, View.class, cls4, cls5, cls5});
                f16199a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = cls.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls3});
                f16200b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = cls.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls3});
                f16201c = declaredMethod3;
                declaredMethod3.setAccessible(true);
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }

        static boolean a() {
            return f16202d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        static void b(DropDownListView dropDownListView, int i10, View view) {
            try {
                f16199a.invoke(dropDownListView, new Object[]{Integer.valueOf(i10), view, Boolean.FALSE, -1, -1});
                f16200b.invoke(dropDownListView, new Object[]{Integer.valueOf(i10)});
                f16201c.invoke(dropDownListView, new Object[]{Integer.valueOf(i10)});
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
    }

    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    private static class d extends C5487a {

        /* renamed from: b  reason: collision with root package name */
        private boolean f16203b = true;

        d(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        public void b(boolean z10) {
            this.f16203b = z10;
        }

        public void draw(Canvas canvas) {
            if (this.f16203b) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f10, float f11) {
            if (this.f16203b) {
                super.setHotspot(f10, f11);
            }
        }

        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f16203b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f16203b) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f16203b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    static class e {

        /* renamed from: a  reason: collision with root package name */
        private static final Field f16204a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f16204a = field;
        }

        static boolean a(AbsListView absListView) {
            Field field = f16204a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z10) {
            Field field = f16204a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z10));
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private class f implements Runnable {
        f() {
        }

        public void a() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.f16198m = null;
            dropDownListView.removeCallbacks(this);
        }

        public void b() {
            DropDownListView.this.post(this);
        }

        public void run() {
            DropDownListView dropDownListView = DropDownListView.this;
            dropDownListView.f16198m = null;
            dropDownListView.drawableStateChanged();
        }
    }

    DropDownListView(Context context, boolean z10) {
        super(context, (AttributeSet) null, C5421a.f23872B);
        this.f16194i = z10;
        setCacheColorHint(0);
    }

    private void a() {
        this.f16195j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f16191f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C4618k0 k0Var = this.f16196k;
        if (k0Var != null) {
            k0Var.c();
            this.f16196k = null;
        }
    }

    private void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (!this.f16186a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f16186a);
            selector.draw(canvas);
        }
    }

    private void f(int i10, View view) {
        Rect rect = this.f16186a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f16187b;
        rect.top -= this.f16188c;
        rect.right += this.f16189d;
        rect.bottom += this.f16190e;
        boolean j10 = j();
        if (view.isEnabled() != j10) {
            k(!j10);
            if (i10 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void g(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = true;
        boolean z11 = (selector == null || i10 == -1) ? false : true;
        if (z11) {
            selector.setVisible(false, false);
        }
        f(i10, view);
        if (z11) {
            Rect rect = this.f16186a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z10 = false;
            }
            selector.setVisible(z10, false);
            C6260a.k(selector, exactCenterX, exactCenterY);
        }
    }

    private void h(int i10, View view, float f10, float f11) {
        g(i10, view);
        Drawable selector = getSelector();
        if (selector != null && i10 != -1) {
            C6260a.k(selector, f10, f11);
        }
    }

    private void i(View view, int i10, float f10, float f11) {
        View childAt;
        this.f16195j = true;
        a.a(this, f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f16191f;
        if (!(i11 == -1 || (childAt = getChildAt(i11 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f16191f = i10;
        a.a(view, f10 - ((float) view.getLeft()), f11 - ((float) view.getTop()));
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i10, view, f10, f11);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean j() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this) : e.a(this);
    }

    private void k(boolean z10) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z10);
        } else {
            e.b(this, z10);
        }
    }

    private boolean l() {
        return this.f16195j;
    }

    private void m() {
        Drawable selector = getSelector();
        if (selector != null && l() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.f16192g;
        if (dVar != null) {
            dVar.b(z10);
        }
    }

    public int d(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i15 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        View view = null;
        while (i16 < count) {
            int itemViewType = adapter.getItemViewType(i16);
            if (itemViewType != i17) {
                view = null;
                i17 = itemViewType;
            }
            view = adapter.getView(i16, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i19 = layoutParams.height;
            view.measure(i10, i19 > 0 ? View.MeasureSpec.makeMeasureSpec(i19, CatalogRepository.FETCH_FLAG_SDB) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i16 > 0) {
                i15 += dividerHeight;
            }
            i15 += view.getMeasuredHeight();
            if (i15 >= i13) {
                return (i14 < 0 || i16 <= i14 || i18 <= 0 || i15 == i13) ? i13 : i18;
            }
            if (i14 >= 0 && i16 >= i14) {
                i18 = i15;
            }
            i16++;
        }
        return i15;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f16198m == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r3 = r1
            r9 = r2
            goto L_0x0046
        L_0x0011:
            r9 = r2
            r3 = r9
            goto L_0x0046
        L_0x0014:
            r3 = r1
            goto L_0x0017
        L_0x0016:
            r3 = r2
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = r1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r1) goto L_0x000e
            r7.b(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.f r9 = r7.f16197l
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.f r9 = new androidx.core.widget.f
            r9.<init>(r7)
            r7.f16197l = r9
        L_0x005a:
            androidx.core.widget.f r9 = r7.f16197l
            r9.m(r1)
            androidx.core.widget.f r9 = r7.f16197l
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.f r8 = r7.f16197l
            if (r8 == 0) goto L_0x006c
            r8.m(r2)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.DropDownListView.e(android.view.MotionEvent, int):boolean");
    }

    public boolean hasFocus() {
        return this.f16194i || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f16194i || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f16194i || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f16194i && this.f16193h) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f16198m = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f16198m == null) {
            f fVar = new f();
            this.f16198m = fVar;
            fVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !b.a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.b(this, pointToPosition, childAt);
                    }
                }
                m();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f16191f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f16198m;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z10) {
        this.f16193h = z10;
    }

    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f16192g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f16187b = rect.left;
        this.f16188c = rect.top;
        this.f16189d = rect.right;
        this.f16190e = rect.bottom;
    }
}
