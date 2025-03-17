package t3;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.oppwa.mobile.connect.BuildConfig;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import com.sugarcube.core.logger.DslKt;
import java.io.Closeable;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import jb.C9892c;
import mb.C10030a;
import mb.C10033d;
import nb.C10079i;
import q3.C5807s;
import q3.E;

public final class N {

    /* renamed from: a  reason: collision with root package name */
    public static final int f29462a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f29463b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f29464c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f29465d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f29466e;

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f29467f = new byte[0];

    /* renamed from: g  reason: collision with root package name */
    public static final long[] f29468g = new long[0];

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f29469h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f29470i = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: j  reason: collision with root package name */
    private static final Pattern f29471j = Pattern.compile("%([A-Fa-f0-9]{2})");

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f29472k = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);

    /* renamed from: l  reason: collision with root package name */
    private static HashMap<String, String> f29473l;

    /* renamed from: m  reason: collision with root package name */
    private static final String[] f29474m = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: n  reason: collision with root package name */
    private static final String[] f29475n = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: o  reason: collision with root package name */
    private static final int[] f29476o = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: p  reason: collision with root package name */
    private static final int[] f29477p = {0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f29478q = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, CheckoutActivity.RESULT_CANCELED, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, ModuleDescriptor.MODULE_VERSION, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, CheckoutActivity.RESULT_ERROR, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};

    static {
        int i10 = Build.VERSION.SDK_INT;
        f29462a = i10;
        String str = Build.DEVICE;
        f29463b = str;
        String str2 = Build.MANUFACTURER;
        f29464c = str2;
        String str3 = Build.MODEL;
        f29465d = str3;
        f29466e = str + ", " + str3 + ", " + str2 + ", " + i10;
    }

    public static Handler A() {
        return B((Handler.Callback) null);
    }

    public static String A0(int i10) {
        return Integer.toString(i10, 36);
    }

    public static Handler B(Handler.Callback callback) {
        return z((Looper) C5950a.i(Looper.myLooper()), callback);
    }

    public static boolean B0(Context context) {
        return f29462a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static Handler C() {
        return D((Handler.Callback) null);
    }

    public static boolean C0(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1487656890:
                if (str.equals("image/avif")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1487464693:
                if (str.equals("image/heic")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1487464690:
                if (str.equals("image/heif")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1487394660:
                if (str.equals("image/jpeg")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1487018032:
                if (str.equals("image/webp")) {
                    c10 = 4;
                    break;
                }
                break;
            case -879272239:
                if (str.equals("image/bmp")) {
                    c10 = 5;
                    break;
                }
                break;
            case -879258763:
                if (str.equals("image/png")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return f29462a >= 34;
            case 1:
            case 2:
                return f29462a >= 26;
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    public static Handler D(Handler.Callback callback) {
        return z(U(), callback);
    }

    public static boolean D0(int i10) {
        return i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    private static HashMap<String, String> E() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f29474m.length);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f29474m;
            if (i10 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    public static boolean E0(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static long F(long j10, int i10) {
        return b1(j10, (long) i10, 1000000, RoundingMode.UP);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (jb.C9892c.a(r2, "rmx3231") == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean F0(android.content.Context r2) {
        /*
            int r0 = f29462a
            r1 = 29
            if (r0 < r1) goto L_0x0035
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            int r2 = r2.targetSdkVersion
            if (r2 < r1) goto L_0x0035
            r2 = 30
            if (r0 != r2) goto L_0x0024
            java.lang.String r2 = f29465d
            java.lang.String r1 = "moto g(20)"
            boolean r1 = jb.C9892c.a(r2, r1)
            if (r1 != 0) goto L_0x0035
            java.lang.String r1 = "rmx3231"
            boolean r2 = jb.C9892c.a(r2, r1)
            if (r2 != 0) goto L_0x0035
        L_0x0024:
            r2 = 34
            if (r0 != r2) goto L_0x0033
            java.lang.String r2 = f29465d
            java.lang.String r0 = "sm-x200"
            boolean r2 = jb.C9892c.a(r2, r0)
            if (r2 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r2 = 0
            goto L_0x0036
        L_0x0035:
            r2 = 1
        L_0x0036:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.N.F0(android.content.Context):boolean");
    }

    public static String G(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static boolean G0(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static String H(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static boolean H0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static String I(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, StandardCharsets.UTF_8);
    }

    public static boolean I0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static int J(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static boolean J0(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static int K(int i10) {
        if (i10 == 20) {
            return 30;
        }
        if (i10 == 22) {
            return 31;
        }
        if (i10 == 30) {
            return 34;
        }
        switch (i10) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i10) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Thread K0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static AudioFormat L(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Thread L0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    @SuppressLint({"InlinedApi"})
    public static int M(int i10) {
        if (i10 == 10) {
            return f29462a >= 32 ? 737532 : 6396;
        }
        if (i10 == 12) {
            return 743676;
        }
        if (i10 == 24) {
            return f29462a >= 32 ? 67108860 : 0;
        }
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    public static int M0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public static String N(int i10) {
        if (i10 == 0) {
            return "undefined";
        }
        if (i10 == 1) {
            return "original";
        }
        if (i10 == 2) {
            return "depth-linear";
        }
        if (i10 == 3) {
            return "depth-inverse";
        }
        if (i10 == 4) {
            return "depth metadata";
        }
        throw new IllegalStateException("Unsupported auxiliary track type");
    }

    private static String N0(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = f29475n;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                return strArr[i10 + 1] + str.substring(strArr[i10].length());
            }
            i10 += 2;
        }
    }

    public static E.b O(E e10, E.b bVar) {
        boolean f10 = e10.f();
        boolean U10 = e10.U();
        boolean P10 = e10.P();
        boolean s10 = e10.s();
        boolean j02 = e10.j0();
        boolean x10 = e10.x();
        boolean q10 = e10.z().q();
        boolean z10 = false;
        E.b.a d10 = new E.b.a().b(bVar).d(4, !f10).d(5, U10 && !f10).d(6, P10 && !f10).d(7, !q10 && (P10 || !j02 || U10) && !f10).d(8, s10 && !f10).d(9, !q10 && (s10 || (j02 && x10)) && !f10).d(10, !f10).d(11, U10 && !f10);
        if (U10 && !f10) {
            z10 = true;
        }
        return d10.d(12, z10).e();
    }

    public static <T> void O0(List<T> list, int i10, int i11, int i12) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i13 = (i11 - i10) - 1; i13 >= 0; i13--) {
            arrayDeque.addFirst(list.remove(i10 + i13));
        }
        list.addAll(Math.min(i12, list.size()), arrayDeque);
    }

    public static int P(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static long P0(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static int Q(int i10) {
        if (i10 != 2) {
            if (i10 == 3) {
                return 1;
            }
            if (i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 22) {
                        if (i10 != 268435456) {
                            if (i10 != 1342177280) {
                                if (i10 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static ExecutorService Q0(String str) {
        return Executors.newSingleThreadExecutor(new M(str));
    }

    public static String R(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return C9892c.f(networkCountryIso);
            }
        }
        return C9892c.f(Locale.getDefault().getCountry());
    }

    public static ScheduledExecutorService R0(String str) {
        return Executors.newSingleThreadScheduledExecutor(new L(str));
    }

    public static Point S(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) C5950a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return T(context, display);
    }

    public static String S0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String e10 = C9892c.e(str);
        String str2 = i1(e10, "-")[0];
        if (f29473l == null) {
            f29473l = E();
        }
        String str3 = f29473l.get(str2);
        if (str3 != null) {
            e10 = str3 + e10.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? N0(e10) : e10;
    }

    public static Point T(Context context, Display display) {
        if (display.getDisplayId() == 0 && I0(context)) {
            String q02 = f29462a < 28 ? q0("sys.display-size") : q0("vendor.display-size");
            if (!TextUtils.isEmpty(q02)) {
                try {
                    String[] h12 = h1(q02.trim(), "x");
                    if (h12.length == 2) {
                        int parseInt = Integer.parseInt(h12[0]);
                        int parseInt2 = Integer.parseInt(h12[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                q.c("Util", "Invalid display size: " + q02);
            }
            if ("Sony".equals(f29464c) && f29465d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (f29462a >= 23) {
            W(display, point);
        } else {
            display.getRealSize(point);
        }
        return point;
    }

    public static <T> T[] T0(T[] tArr, T[] tArr2) {
        T[] copyOf = Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, copyOf, tArr.length, tArr2.length);
        return copyOf;
    }

    public static Looper U() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static <T> T[] U0(T[] tArr, int i10) {
        C5950a.a(i10 <= tArr.length);
        return Arrays.copyOf(tArr, i10);
    }

    public static Locale V() {
        return f29462a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    public static <T> T[] V0(T[] tArr, int i10, int i11) {
        boolean z10 = false;
        C5950a.a(i10 >= 0);
        if (i11 <= tArr.length) {
            z10 = true;
        }
        C5950a.a(z10);
        return Arrays.copyOfRange(tArr, i10, i11);
    }

    private static void W(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static boolean W0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static Drawable X(Context context, Resources resources, int i10) {
        return resources.getDrawable(i10, context.getTheme());
    }

    public static boolean X0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static int Y(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return 6003;
        }
        switch (i10) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i10) {
                    case BuildConfig.MIN_SDK_VERSION /*24*/:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static long Y0(long j10, int i10) {
        return b1(j10, 1000000, (long) i10, RoundingMode.DOWN);
    }

    public static int Z(String str) {
        String[] h12;
        int length;
        if (str == null || (length = h12.length) < 2) {
            return 0;
        }
        String str2 = (h12 = h1(str, "_"))[length - 1];
        boolean z10 = length >= 3 && "neg".equals(h12[length - 2]);
        try {
            int parseInt = Integer.parseInt((String) C5950a.e(str2));
            return z10 ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static long Z0(long j10, long j11, long j12) {
        return b1(j10, j11, j12, RoundingMode.DOWN);
    }

    public static String a0(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static void a1(long[] jArr, long j10, long j11) {
        d1(jArr, j10, j11, RoundingMode.DOWN);
    }

    public static String b0(Locale locale) {
        return locale.toLanguageTag();
    }

    public static long b1(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0;
        }
        int i10 = (j12 > j11 ? 1 : (j12 == j11 ? 0 : -1));
        if (i10 >= 0 && j12 % j11 == 0) {
            return C10033d.b(j10, C10033d.b(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (i10 < 0 && j11 % j12 == 0) {
            return C10033d.d(j10, C10033d.b(j11, j12, RoundingMode.UNNECESSARY));
        }
        int i11 = (j12 > j10 ? 1 : (j12 == j10 ? 0 : -1));
        return (i11 < 0 || j12 % j10 != 0) ? (i11 >= 0 || j10 % j12 != 0) ? c1(j10, j11, j12, roundingMode) : C10033d.d(j11, C10033d.b(j10, j12, RoundingMode.UNNECESSARY)) : C10033d.b(j11, C10033d.b(j12, j10, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long c(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    public static int c0(Context context) {
        return F0(context) ? 1 : 5;
    }

    private static long c1(long j10, long j11, long j12, RoundingMode roundingMode) {
        long d10 = C10033d.d(j10, j11);
        if (d10 != Long.MAX_VALUE && d10 != Long.MIN_VALUE) {
            return C10033d.b(d10, j12, roundingMode);
        }
        long c10 = C10033d.c(Math.abs(j11), Math.abs(j12));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long b10 = C10033d.b(j11, c10, roundingMode2);
        long b11 = C10033d.b(j12, c10, roundingMode2);
        long c11 = C10033d.c(Math.abs(j10), Math.abs(b11));
        long b12 = C10033d.b(j10, c11, roundingMode2);
        long b13 = C10033d.b(b11, c11, roundingMode2);
        long d11 = C10033d.d(b12, b10);
        if (d11 != Long.MAX_VALUE && d11 != Long.MIN_VALUE) {
            return C10033d.b(d11, b13, roundingMode);
        }
        double d12 = ((double) b12) * (((double) b10) / ((double) b13));
        if (d12 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d12 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return C10030a.f(d12, roundingMode);
    }

    @Deprecated
    public static boolean d(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static long d0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(((double) j10) * ((double) f10));
    }

    public static void d1(long[] jArr, long j10, long j11, RoundingMode roundingMode) {
        long[] jArr2 = jArr;
        long j12 = j10;
        long j13 = j11;
        RoundingMode roundingMode2 = roundingMode;
        if (j12 == 0) {
            Arrays.fill(jArr2, 0);
            return;
        }
        int i10 = (j13 > j12 ? 1 : (j13 == j12 ? 0 : -1));
        int i11 = 0;
        if (i10 >= 0 && j13 % j12 == 0) {
            long b10 = C10033d.b(j13, j12, RoundingMode.UNNECESSARY);
            while (i11 < jArr2.length) {
                jArr2[i11] = C10033d.b(jArr2[i11], b10, roundingMode2);
                i11++;
            }
        } else if (i10 >= 0 || j12 % j13 != 0) {
            for (int i12 = 0; i12 < jArr2.length; i12++) {
                long j14 = jArr2[i12];
                if (j14 != 0) {
                    if (j13 >= j14 && j13 % j14 == 0) {
                        jArr2[i12] = C10033d.b(j12, C10033d.b(j13, j14, RoundingMode.UNNECESSARY), roundingMode2);
                    } else if (j13 >= j14 || j14 % j13 != 0) {
                        jArr2[i12] = c1(j14, j10, j11, roundingMode);
                    } else {
                        jArr2[i12] = C10033d.d(j12, C10033d.b(j14, j13, RoundingMode.UNNECESSARY));
                    }
                }
            }
        } else {
            long b11 = C10033d.b(j12, j13, RoundingMode.UNNECESSARY);
            while (i11 < jArr2.length) {
                jArr2[i11] = C10033d.d(jArr2[i11], b11);
                i11++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int e(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0008
            int r5 = ~r0
            goto L_0x001a
        L_0x0008:
            int r1 = r0 + 1
            int r2 = r4.length
            if (r1 >= r2) goto L_0x0015
            r2 = r4[r1]
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0015
            r0 = r1
            goto L_0x0008
        L_0x0015:
            if (r7 == 0) goto L_0x0019
            r5 = r0
            goto L_0x001a
        L_0x0019:
            r5 = r1
        L_0x001a:
            if (r8 == 0) goto L_0x0023
            int r4 = r4.length
            int r4 = r4 + -1
            int r5 = java.lang.Math.min(r4, r5)
        L_0x0023:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.N.e(long[], long, boolean, boolean):int");
    }

    public static long e0(long j10) {
        return j10 == -9223372036854775807L ? System.currentTimeMillis() : j10 + SystemClock.elapsedRealtime();
    }

    public static boolean e1(E e10, boolean z10) {
        if (e10 == null || !e10.H() || e10.V() == 1 || e10.V() == 4) {
            return true;
        }
        return z10 && e10.y() != 0;
    }

    public static int f(r rVar, long j10, boolean z10, boolean z11) {
        int i10;
        int d10 = rVar.d() - 1;
        int i11 = 0;
        while (i11 <= d10) {
            int i12 = (i11 + d10) >>> 1;
            if (rVar.c(i12) < j10) {
                i11 = i12 + 1;
            } else {
                d10 = i12 - 1;
            }
        }
        if (z10 && (i10 = d10 + 1) < rVar.d() && rVar.c(i10) == j10) {
            return i10;
        }
        if (!z11 || d10 != -1) {
            return d10;
        }
        return 0;
    }

    public static int f0(int i10) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 2;
        }
        if (i10 != 24) {
            return i10 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static void f1(Throwable th2) {
        g1(th2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int g(int[] r3, int r4, boolean r5, boolean r6) {
        /*
            int r0 = java.util.Arrays.binarySearch(r3, r4)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r3 = -r0
            goto L_0x0019
        L_0x000a:
            int r1 = r0 + -1
            if (r1 < 0) goto L_0x0014
            r2 = r3[r1]
            if (r2 != r4) goto L_0x0014
            r0 = r1
            goto L_0x000a
        L_0x0014:
            if (r5 == 0) goto L_0x0018
            r3 = r0
            goto L_0x0019
        L_0x0018:
            r3 = r1
        L_0x0019:
            if (r6 == 0) goto L_0x0020
            r4 = 0
            int r3 = java.lang.Math.max(r4, r3)
        L_0x0020:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.N.g(int[], int, boolean, boolean):int");
    }

    public static C5807s g0(int i10, int i11, int i12) {
        return new C5807s.b().s0("audio/raw").Q(i11).t0(i12).m0(i10).M();
    }

    private static <T extends Throwable> void g1(Throwable th2) {
        throw th2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int h(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r4 = -r0
            goto L_0x001b
        L_0x000a:
            int r1 = r0 + -1
            if (r1 < 0) goto L_0x0016
            r2 = r4[r1]
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0016
            r0 = r1
            goto L_0x000a
        L_0x0016:
            if (r7 == 0) goto L_0x001a
            r4 = r0
            goto L_0x001b
        L_0x001a:
            r4 = r1
        L_0x001b:
            if (r8 == 0) goto L_0x0022
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
        L_0x0022:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.N.h(long[], long, boolean, boolean):int");
    }

    public static int h0(int i10, int i11) {
        return Q(i10) * i11;
    }

    public static String[] h1(String str, String str2) {
        return str.split(str2, -1);
    }

    public static <T> T i(T t10) {
        return t10;
    }

    public static long i0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(((double) j10) / ((double) f10));
    }

    public static String[] i1(String str, String str2) {
        return str.split(str2, 2);
    }

    public static <T> T[] j(T[] tArr) {
        return tArr;
    }

    public static List<String> j0(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add(DslKt.MAIN_THREAD_NAME);
        }
        if ((i10 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i10 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i10 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i10 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i10 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i10 & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i10 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i10 & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i10 & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i10 & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i10 & RecyclerView.n.FLAG_MOVED) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i10 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i10 & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i10 & 16384) != 0) {
            arrayList.add("trick-play");
        }
        if ((i10 & 32768) != 0) {
            arrayList.add("auxiliary");
        }
        return arrayList;
    }

    public static String[] j1(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : h1(str.trim(), "(\\s*,\\s*)");
    }

    public static int k(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static List<String> k0(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i10 & 1) != 0) {
            arrayList.add("default");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    public static long k1(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    public static long l(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    public static int l0(int i10) {
        if (i10 == 13) {
            return 1;
        }
        switch (i10) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static boolean l1(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static void m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String m0(StringBuilder sb2, Formatter formatter, long j10) {
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        String str = j10 < 0 ? "-" : "";
        long abs = (Math.abs(j10) + 500) / 1000;
        long j11 = abs % 60;
        long j12 = (abs / 60) % 60;
        long j13 = abs / 3600;
        sb2.setLength(0);
        return j13 > 0 ? formatter.format("%s%d:%02d:%02d", new Object[]{str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)}).toString() : formatter.format("%s%02d:%02d", new Object[]{str, Long.valueOf(j12), Long.valueOf(j11)}).toString();
    }

    public static String m1(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i10] & 15, 16));
        }
        return sb2.toString();
    }

    public static int n(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 == 0 ? 0 : 1;
    }

    public static String[] n0() {
        String[] o02 = o0();
        for (int i10 = 0; i10 < o02.length; i10++) {
            o02[i10] = S0(o02[i10]);
        }
        return o02;
    }

    public static long n1(int i10, int i11) {
        return o1(i11) | (o1(i10) << 32);
    }

    public static float o(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    private static String[] o0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (f29462a >= 24) {
            return p0(configuration);
        }
        return new String[]{b0(configuration.locale)};
    }

    public static long o1(int i10) {
        return ((long) i10) & 4294967295L;
    }

    public static int p(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    private static String[] p0(Configuration configuration) {
        return h1(configuration.getLocales().toLanguageTags(), ",");
    }

    public static String p1(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (str.charAt(i12) == '%') {
                i11++;
            }
        }
        if (i11 == 0) {
            return str;
        }
        int i13 = length - (i11 * 2);
        StringBuilder sb2 = new StringBuilder(i13);
        Matcher matcher = f29471j.matcher(str);
        while (i11 > 0 && matcher.find()) {
            sb2.append(str, i10, matcher.start());
            sb2.append((char) Integer.parseInt((String) C5950a.e(matcher.group(1)), 16));
            i10 = matcher.end();
            i11--;
        }
        if (i10 < length) {
            sb2.append(str, i10, length);
        }
        if (sb2.length() != i13) {
            return null;
        }
        return sb2.toString();
    }

    public static long q(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    private static String q0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e10) {
            q.d("Util", "Failed to read system property " + str, e10);
            return null;
        }
    }

    public static long q1(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static <T> boolean r(SparseArray<T> sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static String r0(int i10) {
        switch (i10) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i10 < 10000) {
                    return "?";
                }
                return "custom (" + i10 + ")";
        }
    }

    public static void r1(Parcel parcel, boolean z10) {
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static boolean s(Object[] objArr, Object obj) {
        for (Object d10 : objArr) {
            if (d(d10, obj)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] s0(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static <T> boolean t(SparseArray<T> sparseArray, SparseArray<T> sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (f29462a >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!Objects.equals(sparseArray.valueAt(i10), sparseArray2.get(sparseArray.keyAt(i10)))) {
                return false;
            }
        }
        return true;
    }

    public static boolean t0(E e10) {
        if (e10 == null || !e10.w(1)) {
            return false;
        }
        e10.c();
        return true;
    }

    public static <T> int u(SparseArray<T> sparseArray) {
        if (f29462a >= 31) {
            return sparseArray.contentHashCode();
        }
        int i10 = 17;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            i10 = (((i10 * 31) + sparseArray.keyAt(i11)) * 31) + Objects.hashCode(sparseArray.valueAt(i11));
        }
        return i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean u0(q3.E r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.V()
            r2 = 1
            if (r1 != r2) goto L_0x0017
            r3 = 2
            boolean r3 = r4.w(r3)
            if (r3 == 0) goto L_0x0017
            r4.d()
        L_0x0015:
            r0 = r2
            goto L_0x0024
        L_0x0017:
            r3 = 4
            if (r1 != r3) goto L_0x0024
            boolean r1 = r4.w(r3)
            if (r1 == 0) goto L_0x0024
            r4.l()
            goto L_0x0015
        L_0x0024:
            boolean r1 = r4.w(r2)
            if (r1 == 0) goto L_0x002e
            r4.i()
            goto L_0x002f
        L_0x002e:
            r2 = r0
        L_0x002f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.N.u0(q3.E):boolean");
    }

    public static int v(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            int b10 = C10079i.b(bArr[i10]);
            i12 = w(b10 & 15, w(b10 >> 4, i12));
            i10++;
        }
        return i12;
    }

    public static boolean v0(E e10, boolean z10) {
        return e1(e10, z10) ? u0(e10) : t0(e10);
    }

    private static int w(int i10, int i11) {
        return (f29477p[(i10 ^ ((i11 >> 12) & 255)) & 255] ^ ((i11 << 4) & 65535)) & 65535;
    }

    public static int w0(Uri uri) {
        int x02;
        String scheme = uri.getScheme();
        if (scheme != null && C9892c.a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0 && (x02 = x0(lastPathSegment.substring(lastIndexOf + 1))) != 4) {
            return x02;
        }
        Matcher matcher = f29472k.matcher((CharSequence) C5950a.e(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (group.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static int x(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f29476o[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static int x0(String str) {
        String e10 = C9892c.e(str);
        e10.hashCode();
        char c10 = 65535;
        switch (e10.hashCode()) {
            case 104579:
                if (e10.equals("ism")) {
                    c10 = 0;
                    break;
                }
                break;
            case 108321:
                if (e10.equals("mpd")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3242057:
                if (e10.equals("isml")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3299913:
                if (e10.equals("m3u8")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 2:
                return 1;
            case 1:
                return 0;
            case 3:
                return 2;
            default:
                return 4;
        }
    }

    public static int y(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = f29478q[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    public static int y0(Uri uri, String str) {
        if (str == null) {
            return w0(uri);
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    c10 = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    c10 = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 0;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    public static Handler z(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static boolean z0(B b10, B b11, Inflater inflater) {
        if (b10.a() <= 0) {
            return false;
        }
        if (b11.b() < b10.a()) {
            b11.c(b10.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(b10.e(), b10.f(), b10.a());
        int i10 = 0;
        while (true) {
            try {
                i10 += inflater.inflate(b11.e(), i10, b11.b() - i10);
                if (inflater.finished()) {
                    b11.V(i10);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else if (i10 == b11.b()) {
                    b11.c(b11.b() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }
}
