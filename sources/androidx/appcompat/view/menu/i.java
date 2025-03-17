package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import n.C5577b;

abstract class i implements C5577b, k, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    private Rect f15885a;

    i() {
    }

    protected static e A(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (e) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (e) listAdapter;
    }

    protected static int q(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    protected static boolean z(f fVar) {
        int size = fVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = fVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public boolean d(f fVar, h hVar) {
        return false;
    }

    public int getId() {
        return 0;
    }

    public boolean k(f fVar, h hVar) {
        return false;
    }

    public void l(Context context, f fVar) {
    }

    public abstract void m(f fVar);

    /* access modifiers changed from: protected */
    public boolean n() {
        return true;
    }

    public Rect o() {
        return this.f15885a;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        A(listAdapter).f15816a.P((MenuItem) listAdapter.getItem(i10), this, n() ? 0 : 4);
    }

    public abstract void r(View view);

    public void s(Rect rect) {
        this.f15885a = rect;
    }

    public abstract void t(boolean z10);

    public abstract void u(int i10);

    public abstract void v(int i10);

    public abstract void w(PopupWindow.OnDismissListener onDismissListener);

    public abstract void x(boolean z10);

    public abstract void y(int i10);
}
