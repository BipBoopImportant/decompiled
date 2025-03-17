package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.sugarcube.app.base.data.source.CatalogRepository;
import r.C5808a;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final int f16583a = getResources().getDimensionPixelOffset(C5808a.f28586b);

    /* renamed from: b  reason: collision with root package name */
    private final int f16584b = getResources().getDimensionPixelOffset(C5808a.f28585a);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f16583a * 2), this.f16584b), CatalogRepository.FETCH_FLAG_SDB), i11);
    }
}
