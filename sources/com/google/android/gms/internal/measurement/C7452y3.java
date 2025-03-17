package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import j0.C5445a;

/* renamed from: com.google.android.gms.internal.measurement.y3  reason: case insensitive filesystem */
public final class C7452y3 {

    /* renamed from: a  reason: collision with root package name */
    private static final C5445a<String, Uri> f49152a = new C5445a<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (C7452y3.class) {
            C5445a<String, Uri> aVar = f49152a;
            uri = aVar.get(str);
            if (uri == null) {
                String encode = Uri.encode(str);
                uri = Uri.parse("content://com.google.android.gms.phenotype/" + encode);
                aVar.put(str, uri);
            }
        }
        return uri;
    }

    public static String b(Context context, String str) {
        if (!str.contains("#")) {
            String packageName = context.getPackageName();
            return str + "#" + "" + packageName;
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
    }

    public static boolean c(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }
}
