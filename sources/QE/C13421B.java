package QE;

import OE.C13317i;
import OE.C13318j;
import X4.a;
import X4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;

/* renamed from: QE.B  reason: case insensitive filesystem */
public final class C13421B implements a {

    /* renamed from: a  reason: collision with root package name */
    private final NestedScrollView f114321a;

    /* renamed from: b  reason: collision with root package name */
    public final NestedScrollView f114322b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f114323c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f114324d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f114325e;

    private C13421B(NestedScrollView nestedScrollView, NestedScrollView nestedScrollView2, TextView textView, TextView textView2, TextView textView3) {
        this.f114321a = nestedScrollView;
        this.f114322b = nestedScrollView2;
        this.f114323c = textView;
        this.f114324d = textView2;
        this.f114325e = textView3;
    }

    public static C13421B a(View view) {
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        int i10 = C13317i.f112929M;
        TextView textView = (TextView) b.a(view, i10);
        if (textView != null) {
            i10 = C13317i.f112933N;
            TextView textView2 = (TextView) b.a(view, i10);
            if (textView2 != null) {
                i10 = C13317i.f113094x0;
                TextView textView3 = (TextView) b.a(view, i10);
                if (textView3 != null) {
                    return new C13421B(nestedScrollView, nestedScrollView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static C13421B c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(C13318j.f113159z, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    /* renamed from: b */
    public NestedScrollView getRoot() {
        return this.f114321a;
    }
}
