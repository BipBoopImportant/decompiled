package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class w {
    static int a(RecyclerView.C c10, t tVar, View view, View view2, RecyclerView.q qVar, boolean z10) {
        if (qVar.l0() == 0 || c10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(qVar.E0(view) - qVar.E0(view2)) + 1;
        }
        return Math.min(tVar.n(), tVar.d(view2) - tVar.g(view));
    }

    static int b(RecyclerView.C c10, t tVar, View view, View view2, RecyclerView.q qVar, boolean z10, boolean z11) {
        if (qVar.l0() == 0 || c10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z11 ? Math.max(0, (c10.b() - Math.max(qVar.E0(view), qVar.E0(view2))) - 1) : Math.max(0, Math.min(qVar.E0(view), qVar.E0(view2)));
        if (!z10) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(tVar.d(view2) - tVar.g(view))) / ((float) (Math.abs(qVar.E0(view) - qVar.E0(view2)) + 1)))) + ((float) (tVar.m() - tVar.g(view))));
    }

    static int c(RecyclerView.C c10, t tVar, View view, View view2, RecyclerView.q qVar, boolean z10) {
        if (qVar.l0() == 0 || c10.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return c10.b();
        }
        return (int) ((((float) (tVar.d(view2) - tVar.g(view))) / ((float) (Math.abs(qVar.E0(view) - qVar.E0(view2)) + 1))) * ((float) c10.b()));
    }
}
