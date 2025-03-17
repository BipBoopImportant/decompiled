package Z4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

public final class b extends RecyclerView.G {
    private b(FrameLayout frameLayout) {
        super(frameLayout);
    }

    static b c(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new b(frameLayout);
    }

    /* access modifiers changed from: package-private */
    public FrameLayout d() {
        return (FrameLayout) this.itemView;
    }
}
