package x3;

import android.net.Uri;

public interface l {
    static Uri a(l lVar) {
        String d10 = lVar.d("exo_redir", (String) null);
        if (d10 == null) {
            return null;
        }
        return Uri.parse(d10);
    }

    static long c(l lVar) {
        return lVar.b("exo_len", -1);
    }

    long b(String str, long j10);

    String d(String str, String str2);
}
