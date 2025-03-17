package K9;

import android.net.Uri;

public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Uri f37939a;

    /* renamed from: b  reason: collision with root package name */
    private static final Uri f37940b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f37941c = 0;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f37939a = parse;
        f37940b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
