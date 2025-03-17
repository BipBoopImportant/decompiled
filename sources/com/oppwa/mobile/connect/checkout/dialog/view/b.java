package com.oppwa.mobile.connect.checkout.dialog.view;

import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;

class b {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Typeface> f121341a = new HashMap<>();

    private static Typeface a(Context context, String str) {
        if (str == null) {
            return null;
        }
        try {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), String.format("fonts/%s.ttf", new Object[]{str}));
            f121341a.put(str, createFromAsset);
            return createFromAsset;
        } catch (Exception unused) {
            return null;
        }
    }

    static Typeface b(Context context, String str) {
        HashMap<String, Typeface> hashMap = f121341a;
        return hashMap.containsKey(str) ? hashMap.get(str) : a(context, str);
    }
}
