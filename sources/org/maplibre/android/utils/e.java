package org.maplibre.android.utils;

import android.graphics.Typeface;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.maplibre.android.c;
import org.maplibre.android.log.Logger;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f146104a;

    static {
        ArrayList arrayList = new ArrayList();
        f146104a = arrayList;
        arrayList.add("sans-serif");
        arrayList.add("serif");
        arrayList.add("monospace");
    }

    public static String a(String... strArr) {
        if (strArr.length == 0) {
            return null;
        }
        List<String> b10 = b();
        for (String str : strArr) {
            if (b10.contains(str)) {
                return str;
            }
        }
        Logger.i("Mbgl-FontUtils", String.format("Couldn't map font family for local ideograph, using %s instead", new Object[]{"sans-serif"}));
        return "sans-serif";
    }

    private static List<String> b() {
        ArrayList arrayList = new ArrayList();
        try {
            Typeface create = Typeface.create(Typeface.DEFAULT, 0);
            Field declaredField = Typeface.class.getDeclaredField("sSystemFontMap");
            declaredField.setAccessible(true);
            arrayList.addAll(((Map) declaredField.get(create)).keySet());
        } catch (Exception e10) {
            Logger.e("Mbgl-FontUtils", "Couldn't load fonts from Typeface", e10);
            c.c("Couldn't load fonts from Typeface", e10);
        }
        return arrayList;
    }
}
