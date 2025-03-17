package K6;

import android.app.Application;
import android.os.Build;
import android.provider.Settings;
import android.webkit.JavascriptInterface;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class v {

    /* renamed from: f  reason: collision with root package name */
    private static final String f37716f = v.class.toString();

    /* renamed from: a  reason: collision with root package name */
    String[] f37717a = null;

    /* renamed from: b  reason: collision with root package name */
    private final Application f37718b;

    /* renamed from: c  reason: collision with root package name */
    String f37719c = null;

    /* renamed from: d  reason: collision with root package name */
    private a f37720d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f37721e = Boolean.TRUE;

    public interface a {
        void a();
    }

    public v(Application application, a aVar) {
        this.f37718b = application;
        this.f37720d = aVar;
    }

    private static String a(String str) {
        try {
            Process exec = Runtime.getRuntime().exec(str);
            exec.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return sb2.toString();
                }
                sb2.append(readLine + "\n");
            }
        } catch (Exception e10) {
            y.a(e10);
            return null;
        }
    }

    @JavascriptInterface
    public String adbStatus() {
        try {
            return String.valueOf(Q.a(this.f37718b));
        } catch (Exception e10) {
            y.a(e10);
            return "-1";
        }
    }

    @JavascriptInterface
    public String androidId() {
        return Q.e(this.f37718b);
    }

    @JavascriptInterface
    public String appIdentifier() {
        return this.f37718b.getPackageName();
    }

    @JavascriptInterface
    public String buildId() {
        return Build.ID;
    }

    @JavascriptInterface
    public String carrierName() {
        return "-1";
    }

    @JavascriptInterface
    public String cpuABI() {
        String[] strArr = Build.SUPPORTED_ABIS;
        return strArr.length > 0 ? strArr[0] : "Default_ABI";
    }

    @JavascriptInterface
    public String defaultBuildFingerPrintProperties() {
        String a10 = a("getprop ro.build.fingerprint");
        return a10 == null ? "default-build-fingerprint" : a10;
    }

    @JavascriptInterface
    public String deviceProperties() {
        String a10 = a("getprop");
        return a10 == null ? "default-build-fingerprint" : a10;
    }

    @JavascriptInterface
    public void done() {
        this.f37720d.a();
    }

    @JavascriptInterface
    public String getServerSignals() {
        return C6599u.f37709a + ", " + sdkVersion() + ", " + androidId() + ", " + buildId() + ", " + systemVersion() + ", " + model() + ", " + host();
    }

    @JavascriptInterface
    public String hardWareType() {
        return P.c(Build.HARDWARE);
    }

    @JavascriptInterface
    public String host() {
        return Build.HOST;
    }

    @JavascriptInterface
    public String isDebugEnabled() {
        try {
            return Settings.Secure.getInt(this.f37718b.getContentResolver(), "adb_enabled", 0) == 1 ? "true" : "false";
        } catch (Exception e10) {
            y.a(e10);
            return "debug";
        }
    }

    @JavascriptInterface
    public String model() {
        return Build.MODEL;
    }

    @JavascriptInterface
    public String mountFileProperties() {
        String a10 = a("cat /proc/mounts");
        return a10 == null ? "default-build-fingerprint" : a10;
    }

    @JavascriptInterface
    public String qemuProperties() {
        String a10 = a("getprop ro.kernel.qemu");
        return a10 == null ? "default-qemu" : a10;
    }

    @JavascriptInterface
    public String screenHeight() {
        return String.valueOf(this.f37718b.getResources().getDisplayMetrics().heightPixels);
    }

    @JavascriptInterface
    public String screenWidth() {
        return String.valueOf(this.f37718b.getResources().getDisplayMetrics().widthPixels);
    }

    @JavascriptInterface
    public String sdkVersion() {
        return "3.3.8-rc2";
    }

    @JavascriptInterface
    public void setDCIDisabled(Boolean bool) {
        this.f37721e = Boolean.valueOf(!bool.booleanValue());
    }

    @JavascriptInterface
    public void setOrder(String str) {
        if (str != null) {
            try {
                if (str.contains(",")) {
                    this.f37717a = str.split(",");
                }
            } catch (Exception e10) {
                this.f37717a = null;
                y.a(e10);
            }
        }
    }

    @JavascriptInterface
    public void setSignal(String str) {
        this.f37719c = str;
        done();
    }

    @JavascriptInterface
    public String startTime() {
        return Long.toString(C6599u.f37709a);
    }

    @JavascriptInterface
    public String systemVersion() {
        return Build.VERSION.RELEASE;
    }
}
