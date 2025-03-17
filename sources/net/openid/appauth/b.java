package net.openid.appauth;

import AK.g;
import android.text.TextUtils;
import java.util.LinkedHashSet;

final class b {
    public static String a(Iterable<String> iterable) {
        if (iterable == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String next : iterable) {
            g.a(!TextUtils.isEmpty(next), "individual scopes cannot be null or empty");
            linkedHashSet.add(next);
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return TextUtils.join(" ", linkedHashSet);
    }
}
