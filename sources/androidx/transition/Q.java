package androidx.transition;

import android.view.View;

public abstract class Q extends u {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f44631a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    private static int d(y yVar, int i10) {
        int[] iArr;
        if (yVar == null || (iArr = (int[]) yVar.f44774a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i10];
    }

    public void a(y yVar) {
        View view = yVar.f44775b;
        Integer num = (Integer) yVar.f44774a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        yVar.f44774a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = round;
        iArr[0] = round + (view.getWidth() / 2);
        int round2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = round2;
        iArr[1] = round2 + (view.getHeight() / 2);
        yVar.f44774a.put("android:visibilityPropagation:center", iArr);
    }

    public String[] b() {
        return f44631a;
    }

    public int e(y yVar) {
        Integer num;
        if (yVar == null || (num = (Integer) yVar.f44774a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(y yVar) {
        return d(yVar, 0);
    }

    public int g(y yVar) {
        return d(yVar, 1);
    }
}
