package Fz;

import Ez.d;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public final class w implements a {

    /* renamed from: a  reason: collision with root package name */
    private final RecyclerView f110213a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f110214b;

    private w(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f110213a = recyclerView;
        this.f110214b = recyclerView2;
    }

    public static w a(View view) {
        if (view != null) {
            RecyclerView recyclerView = (RecyclerView) view;
            return new w(recyclerView, recyclerView);
        }
        throw new NullPointerException("rootView");
    }

    public static w c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(d.f109656x, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public RecyclerView getRoot() {
        return this.f110213a;
    }
}
