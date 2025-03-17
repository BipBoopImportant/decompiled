package org.maplibre.android.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.widget.ImageView;
import androidx.core.widget.e;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import org.maplibre.android.g;

public class b {
    public static String a(int i10) {
        Locale locale = Locale.US;
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(locale);
        decimalFormat.applyPattern("#.###");
        return String.format(locale, "rgba(%d, %d, %d, %s)", new Object[]{Integer.valueOf((i10 >> 16) & 255), Integer.valueOf((i10 >> 8) & 255), Integer.valueOf(i10 & 255), decimalFormat.format((double) (((float) ((i10 >> 24) & 255)) / 255.0f))});
    }

    private static int b(Context context, int i10) {
        return context.getResources().getColor(i10, context.getTheme());
    }

    public static int c(Context context) {
        try {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(context.getResources().getIdentifier("colorPrimary", "attrs", context.getPackageName()), typedValue, true);
            return typedValue.data;
        } catch (Exception unused) {
            return b(context, g.f145510a);
        }
    }

    public static ColorStateList d(int i10) {
        return new ColorStateList(new int[][]{new int[]{16842919}, new int[0]}, new int[]{i10, i10});
    }

    public static void e(ImageView imageView, int i10) {
        e.c(imageView, d(i10));
    }
}
