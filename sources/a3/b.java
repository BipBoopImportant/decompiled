package a3;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.o;

final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f15157a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile Editable.Factory f15158b;

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f15159c;

    @SuppressLint({"PrivateApi"})
    private b() {
        try {
            f15159c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f15158b == null) {
            synchronized (f15157a) {
                try {
                    if (f15158b == null) {
                        f15158b = new b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f15158b;
    }

    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f15159c;
        return cls != null ? o.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
