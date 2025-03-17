package Vl;

import YH.C16877v;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LVl/c;", "LVl/b;", "<init>", "()V", "", "appLink", "fallbackDesktopUri", "utmSource", "utmMedium", "utmCampaign", "utmContent", "guid", "fallbackOverride", "utmTerm", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "linkit-Implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {
    public String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        String str10 = str;
        C17542s.j(str, "appLink");
        String str11 = str2;
        C17542s.j(str2, "fallbackDesktopUri");
        C17542s.j(str3, "utmSource");
        C17542s.j(str4, "utmMedium");
        C17542s.j(str5, "utmCampaign");
        String str12 = str6;
        C17542s.j(str12, "utmContent");
        String str13 = str7;
        C17542s.j(str13, "guid");
        C17542s.j(str8, "fallbackOverride");
        String str14 = str9;
        C17542s.j(str14, "utmTerm");
        return d.b(C16877v.G0(C16877v.q(Uri.decode(str), Uri.decode(str2), str3, str4, str5, str12, str13, Uri.decode(str8), str14), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null));
    }
}
