package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.f;
import java.lang.reflect.Method;

public class MenuPopupWindow extends B implements C {

    /* renamed from: J  reason: collision with root package name */
    private static Method f16273J;

    /* renamed from: I  reason: collision with root package name */
    private C f16274I;

    public static class MenuDropDownListView extends DropDownListView {

        /* renamed from: n  reason: collision with root package name */
        final int f16275n;

        /* renamed from: o  reason: collision with root package name */
        final int f16276o;

        /* renamed from: p  reason: collision with root package name */
        private C f16277p;

        /* renamed from: q  reason: collision with root package name */
        private MenuItem f16278q;

        public MenuDropDownListView(Context context, boolean z10) {
            super(context, z10);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f16275n = 21;
                this.f16276o = 22;
                return;
            }
            this.f16275n = 22;
            this.f16276o = 21;
        }

        public /* bridge */ /* synthetic */ int d(int i10, int i11, int i12, int i13, int i14) {
            return super.d(i10, i11, i12, i13, i14);
        }

        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i10) {
            return super.e(motionEvent, i10);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
            r2 = (r2 = pointToPosition((int) r5.getX(), (int) r5.getY())) - r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onHoverEvent(android.view.MotionEvent r5) {
            /*
                r4 = this;
                androidx.appcompat.widget.C r0 = r4.f16277p
                if (r0 == 0) goto L_0x005c
                android.widget.ListAdapter r0 = r4.getAdapter()
                boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
                if (r1 == 0) goto L_0x0019
                android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
                int r1 = r0.getHeadersCount()
                android.widget.ListAdapter r0 = r0.getWrappedAdapter()
                androidx.appcompat.view.menu.e r0 = (androidx.appcompat.view.menu.e) r0
                goto L_0x001c
            L_0x0019:
                androidx.appcompat.view.menu.e r0 = (androidx.appcompat.view.menu.e) r0
                r1 = 0
            L_0x001c:
                int r2 = r5.getAction()
                r3 = 10
                if (r2 == r3) goto L_0x0043
                float r2 = r5.getX()
                int r2 = (int) r2
                float r3 = r5.getY()
                int r3 = (int) r3
                int r2 = r4.pointToPosition(r2, r3)
                r3 = -1
                if (r2 == r3) goto L_0x0043
                int r2 = r2 - r1
                if (r2 < 0) goto L_0x0043
                int r1 = r0.getCount()
                if (r2 >= r1) goto L_0x0043
                androidx.appcompat.view.menu.h r1 = r0.getItem(r2)
                goto L_0x0044
            L_0x0043:
                r1 = 0
            L_0x0044:
                android.view.MenuItem r2 = r4.f16278q
                if (r2 == r1) goto L_0x005c
                androidx.appcompat.view.menu.f r0 = r0.b()
                if (r2 == 0) goto L_0x0053
                androidx.appcompat.widget.C r3 = r4.f16277p
                r3.o(r0, r2)
            L_0x0053:
                r4.f16278q = r1
                if (r1 == 0) goto L_0x005c
                androidx.appcompat.widget.C r2 = r4.f16277p
                r2.e(r0, r1)
            L_0x005c:
                boolean r5 = super.onHoverEvent(r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.MenuPopupWindow.MenuDropDownListView.onHoverEvent(android.view.MotionEvent):boolean");
        }

        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f16275n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i10 != this.f16276o) {
                return super.onKeyDown(i10, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                (adapter instanceof HeaderViewListAdapter ? (e) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (e) adapter).b().e(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(C c10) {
            this.f16277p = c10;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class b {
        static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f16273J = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public MenuPopupWindow(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public void S(Object obj) {
        a.a(this.f16131F, (Transition) obj);
    }

    public void T(Object obj) {
        a.b(this.f16131F, (Transition) obj);
    }

    public void U(C c10) {
        this.f16274I = c10;
    }

    public void V(boolean z10) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f16273J;
            if (method != null) {
                try {
                    method.invoke(this.f16131F, new Object[]{Boolean.valueOf(z10)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            b.a(this.f16131F, z10);
        }
    }

    public void e(f fVar, MenuItem menuItem) {
        C c10 = this.f16274I;
        if (c10 != null) {
            c10.e(fVar, menuItem);
        }
    }

    public void o(f fVar, MenuItem menuItem) {
        C c10 = this.f16274I;
        if (c10 != null) {
            c10.o(fVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    public DropDownListView s(Context context, boolean z10) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z10);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
