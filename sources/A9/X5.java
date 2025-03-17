package a9;

import android.graphics.Paint;
import java.util.ArrayList;
import kotlin.jvm.internal.C17542s;

public final class X5 {

    /* renamed from: a  reason: collision with root package name */
    public final F0 f42393a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f42394b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public int f42395c;

    /* renamed from: d  reason: collision with root package name */
    public final Paint f42396d;

    public X5() {
        F0 f02 = new F0();
        C17542s.j(f02, "reusableBitmapProvider");
        this.f42393a = f02;
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        this.f42396d = paint;
    }
}
