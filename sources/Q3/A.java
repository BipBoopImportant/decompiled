package q3;

import android.text.TextUtils;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import com.sugarcube.app.base.data.source.CatalogRepository;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jb.C9892c;
import org.maplibre.android.log.Logger;
import t3.C5950a;
import t3.N;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayList<a> f27838a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f27839b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f27840a;

        /* renamed from: b  reason: collision with root package name */
        public final String f27841b;

        /* renamed from: c  reason: collision with root package name */
        public final int f27842c;
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f27843a;

        /* renamed from: b  reason: collision with root package name */
        public final int f27844b;

        public b(int i10, int i11) {
            this.f27843a = i10;
            this.f27844b = i11;
        }

        public int a() {
            int i10 = this.f27844b;
            if (i10 == 2) {
                return 10;
            }
            if (i10 == 5) {
                return 11;
            }
            if (i10 == 29) {
                return 12;
            }
            if (i10 != 42) {
                return i10 != 22 ? i10 != 23 ? 0 : 15 : CatalogRepository.FETCH_FLAG_SDB;
            }
            return 16;
        }
    }

    public static boolean a(String str, String str2) {
        b i10;
        if (str == null) {
            return false;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c10 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c10 = 10;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            case 3:
                if (str2 == null || (i10 = i(str2)) == null) {
                    return false;
                }
                int a10 = i10.a();
                return (a10 == 0 || a10 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean b(String str, String str2) {
        return d(str, str2) != null;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (String g10 : N.j1(str)) {
            String g11 = g(g10);
            if (g11 != null && n(g11)) {
                return g11;
            }
        }
        return null;
    }

    public static String d(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] j12 = N.j1(str);
        StringBuilder sb2 = new StringBuilder();
        for (String str3 : j12) {
            if (str2.equals(g(str3))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str3);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    private static String e(String str) {
        int size = f27838a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f27838a.get(i10);
            if (str.startsWith(aVar.f27841b)) {
                return aVar.f27840a;
            }
        }
        return null;
    }

    public static int f(String str, String str2) {
        b i10;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 4;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 5;
                    break;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c10 = 8;
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c10 = 9;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c10 = 10;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (i10 = i(str2)) == null) {
                    return 0;
                }
                return i10.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 30;
            case 7:
                return 6;
            case 8:
                return 9;
            case 9:
                return 20;
            case 10:
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    public static String g(String str) {
        b i10;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String e10 = C9892c.e(str.trim());
        if (e10.startsWith("avc1") || e10.startsWith("avc3")) {
            return "video/avc";
        }
        if (e10.startsWith("hev1") || e10.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (e10.startsWith("dvav") || e10.startsWith("dva1") || e10.startsWith("dvhe") || e10.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (e10.startsWith("av01")) {
            return "video/av01";
        }
        if (e10.startsWith("vp9") || e10.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (e10.startsWith("vp8") || e10.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!e10.startsWith("mp4a")) {
            return e10.startsWith("mha1") ? "audio/mha1" : e10.startsWith("mhm1") ? "audio/mhm1" : (e10.startsWith("ac-3") || e10.startsWith("dac3")) ? "audio/ac3" : (e10.startsWith("ec-3") || e10.startsWith("dec3")) ? "audio/eac3" : e10.startsWith("ec+3") ? "audio/eac3-joc" : (e10.startsWith("ac-4") || e10.startsWith("dac4")) ? "audio/ac4" : e10.startsWith("dtsc") ? "audio/vnd.dts" : e10.startsWith("dtse") ? "audio/vnd.dts.hd;profile=lbr" : (e10.startsWith("dtsh") || e10.startsWith("dtsl")) ? "audio/vnd.dts.hd" : e10.startsWith("dtsx") ? "audio/vnd.dts.uhd;profile=p2" : e10.startsWith("opus") ? "audio/opus" : e10.startsWith("vorbis") ? "audio/vorbis" : e10.startsWith("flac") ? "audio/flac" : e10.startsWith("stpp") ? "application/ttml+xml" : e10.startsWith("wvtt") ? "text/vtt" : e10.contains("cea708") ? "application/cea-708" : (e10.contains("eia608") || e10.contains("cea608")) ? "application/cea-608" : e(e10);
        }
        if (e10.startsWith("mp4a.") && (i10 = i(e10)) != null) {
            str2 = h(i10.f27843a);
        }
        return str2 == null ? "audio/mp4a-latm" : str2;
    }

    public static String h(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 221) {
            return "audio/vorbis";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case Logger.NONE /*99*/:
            case CheckoutActivity.RESULT_OK /*100*/:
            case CheckoutActivity.RESULT_CANCELED /*101*/:
                return "video/mpeg2";
            case CheckoutActivity.RESULT_ERROR /*102*/:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    static b i(String str) {
        Matcher matcher = f27839b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) C5950a.e(matcher.group(1));
        String group = matcher.group(2);
        try {
            return new b(Integer.parseInt(str2, 16), group != null ? Integer.parseInt(group) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static String j(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int k(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (n(str)) {
            return 1;
        }
        if (q(str)) {
            return 2;
        }
        if (p(str)) {
            return 3;
        }
        if (o(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return l(str);
    }

    private static int l(String str) {
        int size = f27838a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = f27838a.get(i10);
            if (str.equals(aVar.f27840a)) {
                return aVar.f27842c;
            }
        }
        return -1;
    }

    public static String m(String str) {
        if (str == null) {
            return null;
        }
        for (String g10 : N.j1(str)) {
            String g11 = g(g10);
            if (g11 != null && q(g11)) {
                return g11;
            }
        }
        return null;
    }

    public static boolean n(String str) {
        return "audio".equals(j(str));
    }

    public static boolean o(String str) {
        return "image".equals(j(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean p(String str) {
        return "text".equals(j(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean q(String str) {
        return "video".equals(j(str));
    }

    public static String r(String str) {
        if (str == null) {
            return null;
        }
        String e10 = C9892c.e(str);
        e10.hashCode();
        char c10 = 65535;
        switch (e10.hashCode()) {
            case -1833600100:
                if (e10.equals("video/x-mvhevc")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1007807498:
                if (e10.equals("audio/x-flac")) {
                    c10 = 1;
                    break;
                }
                break;
            case -979095690:
                if (e10.equals("application/x-mpegurl")) {
                    c10 = 2;
                    break;
                }
                break;
            case -586683234:
                if (e10.equals("audio/x-wav")) {
                    c10 = 3;
                    break;
                }
                break;
            case -432836268:
                if (e10.equals("audio/mpeg-l1")) {
                    c10 = 4;
                    break;
                }
                break;
            case -432836267:
                if (e10.equals("audio/mpeg-l2")) {
                    c10 = 5;
                    break;
                }
                break;
            case 187090231:
                if (e10.equals("audio/mp3")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return "video/mv-hevc";
            case 1:
                return "audio/flac";
            case 2:
                return "application/x-mpegURL";
            case 3:
                return "audio/wav";
            case 4:
                return "audio/mpeg-L1";
            case 5:
                return "audio/mpeg-L2";
            case 6:
                return "audio/mpeg";
            default:
                return e10;
        }
    }
}
