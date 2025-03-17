package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.i3  reason: case insensitive filesystem */
public interface C7320i3 {
    String a(ContentResolver contentResolver, String str);

    <T extends Map<String, String>> T b(ContentResolver contentResolver, String[] strArr, C7293f3<T> f3Var);
}
