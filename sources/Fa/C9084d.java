package Fa;

import Ea.C9072f;
import android.util.Property;
import android.view.ViewGroup;

/* renamed from: Fa.d  reason: case insensitive filesystem */
public class C9084d extends Property<ViewGroup, Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final Property<ViewGroup, Float> f60377a = new C9084d("childrenAlpha");

    private C9084d(String str) {
        super(Float.class, str);
    }

    /* renamed from: a */
    public Float get(ViewGroup viewGroup) {
        Float f10 = (Float) viewGroup.getTag(C9072f.f59464G);
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    /* renamed from: b */
    public void set(ViewGroup viewGroup, Float f10) {
        float floatValue = f10.floatValue();
        viewGroup.setTag(C9072f.f59464G, f10);
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup.getChildAt(i10).setAlpha(floatValue);
        }
    }
}
