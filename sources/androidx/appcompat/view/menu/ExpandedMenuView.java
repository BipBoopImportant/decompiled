package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.M;

public final class ExpandedMenuView extends ListView implements f.b, l, AdapterView.OnItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f15724c = {16842964, 16843049};

    /* renamed from: a  reason: collision with root package name */
    private f f15725a;

    /* renamed from: b  reason: collision with root package name */
    private int f15726b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public void a(f fVar) {
        this.f15725a = fVar;
    }

    public boolean d(h hVar) {
        return this.f15725a.O(hVar, 0);
    }

    public int getWindowAnimations() {
        return this.f15726b;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        d((h) getAdapter().getItem(i10));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        M v10 = M.v(context, attributeSet, f15724c, i10, 0);
        if (v10.s(0)) {
            setBackgroundDrawable(v10.g(0));
        }
        if (v10.s(1)) {
            setDivider(v10.g(1));
        }
        v10.x();
    }
}
