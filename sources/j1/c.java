package J1;

import U0.C4889m;
import U0.C4895p;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import p1.J0;
import p1.O;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp1/J0$a;", "Landroid/content/res/Resources;", "res", "", "id", "Lp1/J0;", "b", "(Lp1/J0$a;Landroid/content/res/Resources;I)Lp1/J0;", "a", "(Lp1/J0$a;ILU0/m;I)Lp1/J0;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {
    public static final J0 a(J0.a aVar, int i10, C4889m mVar, int i11) {
        if (C4895p.J()) {
            C4895p.S(-304919470, i11, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        Context context = (Context) mVar.Q(AndroidCompositionLocals_androidKt.g());
        Object D10 = mVar.D();
        C4889m.a aVar2 = C4889m.f14007a;
        if (D10 == aVar2.a()) {
            D10 = new TypedValue();
            mVar.u(D10);
        }
        TypedValue typedValue = (TypedValue) D10;
        context.getResources().getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        C17542s.g(charSequence);
        boolean V10 = mVar.V(charSequence.toString());
        Object D11 = mVar.D();
        if (V10 || D11 == aVar2.a()) {
            D11 = b(aVar, context.getResources(), i10);
            mVar.u(D11);
        }
        J0 j02 = (J0) D11;
        if (C4895p.J()) {
            C4895p.R();
        }
        return j02;
    }

    public static final J0 b(J0.a aVar, Resources resources, int i10) {
        Drawable drawable = resources.getDrawable(i10, (Resources.Theme) null);
        C17542s.h(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return O.c(((BitmapDrawable) drawable).getBitmap());
    }
}
