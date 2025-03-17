package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import i.C5421a;
import i.C5422b;
import i.C5424d;
import i.C5430j;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f15640a;

    private a(Context context) {
        this.f15640a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f15640a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f15640a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f15640a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f15640a.getResources().getDimensionPixelSize(C5424d.f23922b);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f15640a.obtainStyledAttributes((AttributeSet) null, C5430j.f24145a, C5421a.f23888c, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C5430j.f24190j, 0);
        Resources resources = this.f15640a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C5424d.f23921a));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f15640a.getResources().getBoolean(C5422b.f23912a);
    }

    public boolean h() {
        return true;
    }
}
