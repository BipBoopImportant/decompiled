package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: androidx.transition.e  reason: case insensitive filesystem */
class C7019e {

    /* renamed from: androidx.transition.e$a */
    static class a {
        static <T, V> ObjectAnimator a(T t10, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t10, property, (TypeConverter) null, path);
        }
    }

    static <T> ObjectAnimator a(T t10, Property<T, PointF> property, Path path) {
        return a.a(t10, property, path);
    }
}
