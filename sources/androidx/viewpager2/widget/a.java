package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f44999b;

    /* renamed from: a  reason: collision with root package name */
    private LinearLayoutManager f45000a;

    /* renamed from: androidx.viewpager2.widget.a$a  reason: collision with other inner class name */
    class C0773a implements Comparator<int[]> {
        C0773a() {
        }

        /* renamed from: a */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f44999b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    a(LinearLayoutManager linearLayoutManager) {
        this.f45000a = linearLayoutManager;
    }

    private boolean a() {
        int top;
        int i10;
        int bottom;
        int i11;
        int l02 = this.f45000a.l0();
        if (l02 == 0) {
            return true;
        }
        boolean z10 = this.f45000a.M2() == 0;
        int[] iArr = new int[2];
        iArr[1] = 2;
        iArr[0] = l02;
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        int i12 = 0;
        while (i12 < l02) {
            View k02 = this.f45000a.k0(i12);
            if (k02 != null) {
                ViewGroup.LayoutParams layoutParams = k02.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f44999b;
                int[] iArr3 = iArr2[i12];
                if (z10) {
                    top = k02.getLeft();
                    i10 = marginLayoutParams.leftMargin;
                } else {
                    top = k02.getTop();
                    i10 = marginLayoutParams.topMargin;
                }
                iArr3[0] = top - i10;
                int[] iArr4 = iArr2[i12];
                if (z10) {
                    bottom = k02.getRight();
                    i11 = marginLayoutParams.rightMargin;
                } else {
                    bottom = k02.getBottom();
                    i11 = marginLayoutParams.bottomMargin;
                }
                iArr4[1] = bottom + i11;
                i12++;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr2, new C0773a());
        for (int i13 = 1; i13 < l02; i13++) {
            if (iArr2[i13 - 1][1] != iArr2[i13][0]) {
                return false;
            }
        }
        int[] iArr5 = iArr2[0];
        int i14 = iArr5[1];
        int i15 = iArr5[0];
        return i15 <= 0 && iArr2[l02 - 1][1] >= i14 - i15;
    }

    private boolean b() {
        int l02 = this.f45000a.l0();
        for (int i10 = 0; i10 < l02; i10++) {
            if (c(this.f45000a.k0(i10))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (c(viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return (!a() || this.f45000a.l0() <= 1) && b();
    }
}
