package m;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: m.a  reason: case insensitive filesystem */
public class C5521a implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    private Locale f25501a;

    public C5521a(Context context) {
        this.f25501a = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f25501a);
        }
        return null;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i10, Rect rect) {
    }
}
