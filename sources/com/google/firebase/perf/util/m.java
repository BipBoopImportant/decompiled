package com.google.firebase.perf.util;

import Ac.a;
import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private static String[] f68674a;

    public static boolean a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        a.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f68674a == null) {
            f68674a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String contains : f68674a) {
            if (host.contains(contains)) {
                return true;
            }
        }
        return false;
    }
}
