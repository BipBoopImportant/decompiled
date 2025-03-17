package Qb;

import Nb.g;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import com.optimizely.ab.config.FeatureVariable;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/* renamed from: Qb.i  reason: case insensitive filesystem */
public class C9251i {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f62984a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: Qb.i$a */
    enum a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        private static final Map<String, a> matcher = null;

        static {
            a aVar;
            a aVar2;
            a aVar3;
            a aVar4;
            HashMap hashMap = new HashMap(4);
            matcher = hashMap;
            hashMap.put("armeabi-v7a", aVar3);
            hashMap.put("armeabi", aVar2);
            hashMap.put("arm64-v8a", aVar4);
            hashMap.put("x86", aVar);
        }

        static a b() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                g.f().i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            a aVar = matcher.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }
    }

    public static String A(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static synchronized long b(Context context) {
        long j10;
        synchronized (C9251i.class) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            j10 = memoryInfo.totalMem;
        }
        return j10;
    }

    public static long c(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    @SuppressLint({"MissingPermission"})
    public static boolean d(Context context) {
        if (!e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean e(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void f(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                g.f().e(str, e10);
            }
        }
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static String h(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb2 = new StringBuilder();
        for (String append : arrayList) {
            sb2.append(append);
        }
        String sb3 = sb2.toString();
        if (sb3.length() > 0) {
            return z(sb3);
        }
        return null;
    }

    public static boolean i(Context context, String str, boolean z10) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int p10 = p(context, str, "bool");
            if (p10 > 0) {
                return resources.getBoolean(p10);
            }
            int p11 = p(context, str, FeatureVariable.STRING_TYPE);
            if (p11 > 0) {
                return Boolean.parseBoolean(context.getString(p11));
            }
        }
        return z10;
    }

    public static List<C9248f> j(Context context) {
        ArrayList arrayList = new ArrayList();
        int p10 = p(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
        int p11 = p(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
        int p12 = p(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
        if (p10 == 0 || p11 == 0 || p12 == 0) {
            g.f().b(String.format("Could not find resources: %d %d %d", new Object[]{Integer.valueOf(p10), Integer.valueOf(p11), Integer.valueOf(p12)}));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(p10);
        String[] stringArray2 = context.getResources().getStringArray(p11);
        String[] stringArray3 = context.getResources().getStringArray(p12);
        if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
            for (int i10 = 0; i10 < stringArray3.length; i10++) {
                arrayList.add(new C9248f(stringArray[i10], stringArray2[i10], stringArray3[i10]));
            }
            return arrayList;
        }
        g.f().b(String.format("Lengths did not match: %d %d %d", new Object[]{Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)}));
        return arrayList;
    }

    public static int k() {
        return a.b().ordinal();
    }

    public static int l() {
        boolean w10 = w();
        if (x()) {
            w10 |= true;
        }
        return v() ? w10 | true ? 1 : 0 : w10 ? 1 : 0;
    }

    public static String m(Context context) {
        int p10 = p(context, "com.google.firebase.crashlytics.mapping_file_id", FeatureVariable.STRING_TYPE);
        if (p10 == 0) {
            p10 = p(context, "com.crashlytics.android.build_id", FeatureVariable.STRING_TYPE);
        }
        if (p10 != 0) {
            return context.getResources().getString(p10);
        }
        return null;
    }

    public static boolean n(Context context) {
        return !w() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null;
    }

    public static String o(Context context) {
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 <= 0) {
            return context.getPackageName();
        }
        try {
            String resourcePackageName = context.getResources().getResourcePackageName(i10);
            return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static int p(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, o(context));
    }

    public static SharedPreferences q(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    private static String r(String str, String str2) {
        return s(str.getBytes(), str2);
    }

    private static String s(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return t(instance.digest());
        } catch (NoSuchAlgorithmException e10) {
            g f10 = g.f();
            f10.e("Could not create hashing algorithm: " + str + ", returning empty string.", e10);
            return "";
        }
    }

    public static String t(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f62984a;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static boolean u(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean v() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static boolean w() {
        if (!Build.PRODUCT.contains("sdk")) {
            String str = Build.HARDWARE;
            return str.contains("goldfish") || str.contains("ranchu");
        }
    }

    public static boolean x() {
        boolean w10 = w();
        String str = Build.TAGS;
        if ((!w10 && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        return !w10 && new File("/system/xbin/su").exists();
    }

    public static boolean y(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public static String z(String str) {
        return r(str, "SHA-1");
    }
}
