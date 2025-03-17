package Kh;

import android.view.View;
import android.widget.FrameLayout;
import com.ingka.ikea.app.pointofinterest.fragments.PointsOfInterestFragment;

public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PointsOfInterestFragment f61557a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f61558b;

    public /* synthetic */ h(PointsOfInterestFragment pointsOfInterestFragment, FrameLayout frameLayout) {
        this.f61557a = pointsOfInterestFragment;
        this.f61558b = frameLayout;
    }

    public final void onClick(View view) {
        PointsOfInterestFragment.k2(this.f61557a, this.f61558b, view);
    }
}
