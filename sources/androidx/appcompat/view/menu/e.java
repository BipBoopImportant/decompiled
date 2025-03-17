package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.l;
import java.util.ArrayList;

public class e extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    f f15816a;

    /* renamed from: b  reason: collision with root package name */
    private int f15817b = -1;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15818c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f15819d;

    /* renamed from: e  reason: collision with root package name */
    private final LayoutInflater f15820e;

    /* renamed from: f  reason: collision with root package name */
    private final int f15821f;

    public e(f fVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f15819d = z10;
        this.f15820e = layoutInflater;
        this.f15816a = fVar;
        this.f15821f = i10;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a() {
        h x10 = this.f15816a.x();
        if (x10 != null) {
            ArrayList<h> B10 = this.f15816a.B();
            int size = B10.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (B10.get(i10) == x10) {
                    this.f15817b = i10;
                    return;
                }
            }
        }
        this.f15817b = -1;
    }

    public f b() {
        return this.f15816a;
    }

    /* renamed from: c */
    public h getItem(int i10) {
        ArrayList<h> B10 = this.f15819d ? this.f15816a.B() : this.f15816a.G();
        int i11 = this.f15817b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return B10.get(i10);
    }

    public void d(boolean z10) {
        this.f15818c = z10;
    }

    public int getCount() {
        ArrayList<h> B10 = this.f15819d ? this.f15816a.B() : this.f15816a.G();
        return this.f15817b < 0 ? B10.size() : B10.size() - 1;
    }

    public long getItemId(int i10) {
        return (long) i10;
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f15820e.inflate(this.f15821f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f15816a.I() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        l.a aVar = (l.a) view;
        if (this.f15818c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
