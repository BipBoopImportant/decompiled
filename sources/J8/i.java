package j8;

import a9.N1;
import a9.U1;
import androidx.room.x;
import com.adjust.sdk.Constants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0015"}, d2 = {"Lj8/i;", "", "<init>", "()V", "", "", "", "a", "()Ljava/util/Map;", "", "b", "()Ljava/util/Set;", "currency", "d", "(Ljava/lang/String;)I", "c", "(I)I", "Ljava/util/Map;", "currencyMap", "Ljava/util/Set;", "currencySet", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f54089a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, Integer> f54090b;

    /* renamed from: c  reason: collision with root package name */
    private static final Set<Integer> f54091c;

    static {
        i iVar = new i();
        f54089a = iVar;
        f54090b = iVar.a();
        f54091c = iVar.b();
    }

    private i() {
    }

    private final Map<String, Integer> a() {
        HashMap hashMap = new HashMap();
        N1.a(971, hashMap, "AFN", 978, "EUR");
        N1.a(8, hashMap, "ALL", 12, "DZD");
        N1.a(840, hashMap, "USD", 973, "AOA");
        N1.a(951, hashMap, "XCD", 32, "ARS");
        N1.a(51, hashMap, "AMD", 533, "AWG");
        N1.a(36, hashMap, "AUD", 944, "AZN");
        N1.a(44, hashMap, "BSD", 48, "BHD");
        N1.a(50, hashMap, "BDT", 52, "BBD");
        N1.a(933, hashMap, "BYN", 84, "BZD");
        N1.a(952, hashMap, "XOF", 60, "BMD");
        N1.a(356, hashMap, "INR", 64, "BTN");
        N1.a(68, hashMap, "BOB", 984, "BOV");
        N1.a(977, hashMap, "BAM", 72, "BWP");
        N1.a(578, hashMap, "NOK", 986, "BRL");
        N1.a(96, hashMap, "BND", 975, "BGN");
        N1.a(108, hashMap, "BIF", 132, "CVE");
        N1.a(116, hashMap, "KHR", 950, "XAF");
        N1.a(124, hashMap, "CAD", ModuleDescriptor.MODULE_VERSION, "KYD");
        N1.a(152, hashMap, "CLP", 990, "CLF");
        N1.a(156, hashMap, "CNY", 170, "COP");
        N1.a(970, hashMap, "COU", 174, "KMF");
        N1.a(976, hashMap, "CDF", 554, "NZD");
        N1.a(188, hashMap, "CRC", 191, "HRK");
        N1.a(192, hashMap, "CUP", 931, "CUC");
        N1.a(532, hashMap, "ANG", 203, "CZK");
        N1.a(208, hashMap, "DKK", 262, "DJF");
        N1.a(214, hashMap, "DOP", 818, "EGP");
        N1.a(222, hashMap, "SVC", 232, "ERN");
        N1.a(748, hashMap, "SZL", 230, "ETB");
        N1.a(238, hashMap, "FKP", 242, "FJD");
        N1.a(953, hashMap, "XPF", 270, "GMD");
        N1.a(981, hashMap, "GEL", 936, "GHS");
        N1.a(292, hashMap, "GIP", 320, "GTQ");
        N1.a(826, hashMap, "GBP", 324, "GNF");
        N1.a(328, hashMap, "GYD", 332, "HTG");
        N1.a(340, hashMap, "HNL", 344, "HKD");
        N1.a(348, hashMap, "HUF", 352, "ISK");
        N1.a(360, hashMap, "IDR", 960, "XDR");
        N1.a(364, hashMap, "IRR", 368, "IQD");
        N1.a(376, hashMap, "ILS", 388, "JMD");
        N1.a(392, hashMap, "JPY", Constants.MINIMAL_ERROR_STATUS_CODE, "JOD");
        N1.a(398, hashMap, "KZT", 404, "KES");
        N1.a(408, hashMap, "KPW", 410, "KRW");
        N1.a(414, hashMap, "KWD", 417, "KGS");
        N1.a(418, hashMap, "LAK", 422, "LBP");
        N1.a(426, hashMap, "LSL", 710, "ZAR");
        N1.a(430, hashMap, "LRD", 434, "LYD");
        N1.a(756, hashMap, "CHF", 446, "MOP");
        N1.a(807, hashMap, "MKD", 969, "MGA");
        N1.a(454, hashMap, "MWK", 458, "MYR");
        N1.a(462, hashMap, "MVR", 929, "MRU");
        N1.a(480, hashMap, "MUR", 965, "XUA");
        N1.a(484, hashMap, "MXN", 979, "MXV");
        N1.a(498, hashMap, "MDL", 496, "MNT");
        N1.a(504, hashMap, "MAD", 943, "MZN");
        N1.a(104, hashMap, "MMK", 516, "NAD");
        N1.a(524, hashMap, "NPR", 558, "NIO");
        N1.a(566, hashMap, "NGN", 512, "OMR");
        N1.a(586, hashMap, "PKR", 590, "PAB");
        N1.a(598, hashMap, "PGK", 600, "PYG");
        N1.a(604, hashMap, "PEN", 608, "PHP");
        N1.a(985, hashMap, "PLN", 634, "QAR");
        N1.a(946, hashMap, "RON", 643, "RUB");
        N1.a(646, hashMap, "RWF", 654, "SHP");
        N1.a(882, hashMap, "WST", 930, "STN");
        N1.a(682, hashMap, "SAR", 941, "RSD");
        N1.a(690, hashMap, "SCR", 694, "SLL");
        N1.a(925, hashMap, "SLE", 702, "SGD");
        N1.a(994, hashMap, "XSU", 90, "SBD");
        N1.a(706, hashMap, "SOS", 728, "SSP");
        N1.a(144, hashMap, "LKR", 938, "SDG");
        N1.a(968, hashMap, "SRD", 752, "SEK");
        N1.a(947, hashMap, "CHE", 948, "CHW");
        N1.a(760, hashMap, "SYP", 901, "TWD");
        N1.a(972, hashMap, "TJS", 834, "TZS");
        N1.a(764, hashMap, "THB", 776, "TOP");
        N1.a(780, hashMap, "TTD", 788, "TND");
        N1.a(949, hashMap, "TRY", 934, "TMT");
        N1.a(800, hashMap, "UGX", 980, "UAH");
        N1.a(784, hashMap, "AED", 997, "USN");
        N1.a(858, hashMap, "UYU", 940, "UYI");
        N1.a(927, hashMap, "UYW", 860, "UZS");
        N1.a(548, hashMap, "VUV", 928, "VES");
        N1.a(926, hashMap, "VED", 704, "VND");
        N1.a(886, hashMap, "YER", 967, "ZMW");
        N1.a(932, hashMap, "ZWL", 955, "XBA");
        N1.a(956, hashMap, "XBB", 957, "XBC");
        N1.a(958, hashMap, "XBD", 963, "XTS");
        N1.a(x.MAX_BIND_PARAMETER_CNT, hashMap, "XXX", 959, "XAU");
        N1.a(964, hashMap, "XPD", 962, "XPT");
        hashMap.put("XAG", 961);
        return hashMap;
    }

    private final Set<Integer> b() {
        HashSet hashSet = new HashSet();
        U1.a(971, hashSet, 978, 8, 12);
        U1.a(840, hashSet, 973, 951, 32);
        U1.a(51, hashSet, 533, 36, 944);
        U1.a(44, hashSet, 48, 50, 52);
        U1.a(933, hashSet, 84, 952, 60);
        U1.a(356, hashSet, 64, 68, 984);
        U1.a(977, hashSet, 72, 578, 986);
        U1.a(96, hashSet, 975, 108, 132);
        U1.a(116, hashSet, 950, 124, ModuleDescriptor.MODULE_VERSION);
        U1.a(152, hashSet, 990, 156, 170);
        U1.a(970, hashSet, 174, 976, 554);
        U1.a(188, hashSet, 191, 192, 931);
        U1.a(532, hashSet, 203, 208, 262);
        U1.a(214, hashSet, 818, 222, 232);
        U1.a(748, hashSet, 230, 238, 242);
        U1.a(953, hashSet, 270, 981, 936);
        U1.a(292, hashSet, 320, 826, 324);
        U1.a(328, hashSet, 332, 340, 344);
        U1.a(348, hashSet, 352, 360, 960);
        U1.a(364, hashSet, 368, 376, 388);
        U1.a(392, hashSet, Constants.MINIMAL_ERROR_STATUS_CODE, 398, 404);
        U1.a(408, hashSet, 410, 414, 417);
        U1.a(418, hashSet, 422, 426, 710);
        U1.a(430, hashSet, 434, 756, 446);
        U1.a(807, hashSet, 969, 454, 458);
        U1.a(462, hashSet, 929, 480, 965);
        U1.a(484, hashSet, 979, 498, 496);
        U1.a(504, hashSet, 943, 104, 516);
        U1.a(524, hashSet, 558, 566, 512);
        U1.a(586, hashSet, 590, 598, 600);
        U1.a(604, hashSet, 608, 985, 634);
        U1.a(946, hashSet, 643, 646, 654);
        U1.a(882, hashSet, 930, 682, 941);
        U1.a(690, hashSet, 694, 925, 702);
        U1.a(994, hashSet, 90, 706, 728);
        U1.a(144, hashSet, 938, 968, 752);
        U1.a(947, hashSet, 948, 760, 901);
        U1.a(972, hashSet, 834, 764, 776);
        U1.a(780, hashSet, 788, 949, 934);
        U1.a(800, hashSet, 980, 784, 997);
        U1.a(858, hashSet, 940, 927, 860);
        U1.a(548, hashSet, 928, 926, 704);
        U1.a(886, hashSet, 967, 932, 955);
        U1.a(956, hashSet, 957, 958, 963);
        U1.a(x.MAX_BIND_PARAMETER_CNT, hashSet, 959, 964, 962);
        hashSet.add(961);
        return hashSet;
    }

    public final int c(int i10) {
        if (f54091c.contains(Integer.valueOf(i10))) {
            return i10;
        }
        return -1;
    }

    public final int d(String str) {
        C17542s.j(str, "currency");
        Integer num = f54090b.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }
}
