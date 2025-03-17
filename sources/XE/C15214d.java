package xE;

import android.util.Log;
import org.slf4j.Logger;
import org.slf4j.Marker;

/* renamed from: xE.d  reason: case insensitive filesystem */
public class C15214d implements Logger {

    /* renamed from: a  reason: collision with root package name */
    private final String f131879a;

    public C15214d(String str) {
        this.f131879a = str;
    }

    private String a(String str, Object... objArr) {
        for (Object obj : objArr) {
            str = str.replaceFirst("\\{\\}", obj.toString());
        }
        return str;
    }

    private String b(String str, Throwable th2) {
        return str + "\n" + th2.getMessage();
    }

    public void debug(String str) {
    }

    public void error(String str) {
        Log.e(this.f131879a, str);
    }

    public String getName() {
        return "OptimizelyLiteLogger";
    }

    public void info(String str) {
        Log.i(this.f131879a, str);
    }

    public boolean isDebugEnabled() {
        return false;
    }

    public boolean isErrorEnabled() {
        return true;
    }

    public boolean isInfoEnabled() {
        return false;
    }

    public boolean isTraceEnabled() {
        return false;
    }

    public boolean isWarnEnabled() {
        return true;
    }

    public void trace(String str) {
    }

    public void warn(String str) {
        Log.w(this.f131879a, str);
    }

    public void debug(String str, Object obj) {
        Log.d(this.f131879a, a(str, obj));
    }

    public void error(String str, Object obj) {
        Log.e(this.f131879a, a(str, obj));
    }

    public void info(String str, Object obj) {
        Log.i(this.f131879a, a(str, obj));
    }

    public boolean isDebugEnabled(Marker marker) {
        return false;
    }

    public boolean isErrorEnabled(Marker marker) {
        return true;
    }

    public boolean isInfoEnabled(Marker marker) {
        return false;
    }

    public boolean isTraceEnabled(Marker marker) {
        return false;
    }

    public boolean isWarnEnabled(Marker marker) {
        return true;
    }

    public void trace(String str, Object obj) {
    }

    public void warn(String str, Object obj) {
        Log.w(this.f131879a, a(str, obj));
    }

    public void debug(String str, Object obj, Object obj2) {
        Log.d(this.f131879a, a(str, obj, obj2));
    }

    public void error(String str, Object obj, Object obj2) {
        Log.e(this.f131879a, a(str, obj, obj2));
    }

    public void info(String str, Object obj, Object obj2) {
        Log.i(this.f131879a, a(str, obj, obj2));
    }

    public void trace(String str, Object obj, Object obj2) {
    }

    public void warn(String str, Object... objArr) {
        Log.w(this.f131879a, a(str, objArr));
    }

    public void debug(String str, Object... objArr) {
        Log.d(this.f131879a, a(str, objArr));
    }

    public void error(String str, Object... objArr) {
        Log.e(this.f131879a, a(str, objArr));
    }

    public void info(String str, Object... objArr) {
        Log.i(this.f131879a, a(str, objArr));
    }

    public void trace(String str, Object... objArr) {
    }

    public void warn(String str, Object obj, Object obj2) {
        Log.w(this.f131879a, a(str, obj, obj2));
    }

    public void debug(String str, Throwable th2) {
        Log.d(this.f131879a, b(str, th2));
    }

    public void error(String str, Throwable th2) {
        Log.e(this.f131879a, b(str, th2));
    }

    public void info(String str, Throwable th2) {
        Log.i(this.f131879a, b(str, th2));
    }

    public void trace(String str, Throwable th2) {
    }

    public void warn(String str, Throwable th2) {
        Log.w(this.f131879a, b(str, th2));
    }

    public void debug(Marker marker, String str) {
        Log.d(this.f131879a, str);
    }

    public void error(Marker marker, String str) {
        Log.e(this.f131879a, str);
    }

    public void info(Marker marker, String str) {
        Log.i(this.f131879a, str);
    }

    public void trace(Marker marker, String str) {
    }

    public void warn(Marker marker, String str) {
        Log.w(this.f131879a, str);
    }

    public void debug(Marker marker, String str, Object obj) {
        Log.d(this.f131879a, a(str, obj));
    }

    public void error(Marker marker, String str, Object obj) {
        Log.e(this.f131879a, a(str, obj));
    }

    public void info(Marker marker, String str, Object obj) {
        Log.i(this.f131879a, a(str, obj));
    }

    public void trace(Marker marker, String str, Object obj) {
    }

    public void warn(Marker marker, String str, Object obj) {
        Log.w(this.f131879a, a(str, obj));
    }

    public void debug(Marker marker, String str, Object obj, Object obj2) {
        Log.d(this.f131879a, a(str, obj, obj2));
    }

    public void error(Marker marker, String str, Object obj, Object obj2) {
        Log.e(this.f131879a, a(str, obj, obj2));
    }

    public void info(Marker marker, String str, Object obj, Object obj2) {
        Log.i(this.f131879a, a(str, obj, obj2));
    }

    public void trace(Marker marker, String str, Object obj, Object obj2) {
    }

    public void warn(Marker marker, String str, Object obj, Object obj2) {
        Log.w(this.f131879a, a(str, obj, obj2));
    }

    public void debug(Marker marker, String str, Object... objArr) {
        Log.d(this.f131879a, a(str, objArr));
    }

    public void error(Marker marker, String str, Object... objArr) {
        Log.e(this.f131879a, a(str, objArr));
    }

    public void info(Marker marker, String str, Object... objArr) {
        Log.i(this.f131879a, a(str, objArr));
    }

    public void trace(Marker marker, String str, Object... objArr) {
    }

    public void warn(Marker marker, String str, Object... objArr) {
        Log.w(this.f131879a, a(str, objArr));
    }

    public void debug(Marker marker, String str, Throwable th2) {
        Log.d(this.f131879a, b(str, th2));
    }

    public void error(Marker marker, String str, Throwable th2) {
        Log.e(this.f131879a, b(str, th2));
    }

    public void info(Marker marker, String str, Throwable th2) {
        Log.i(this.f131879a, b(str, th2));
    }

    public void trace(Marker marker, String str, Throwable th2) {
    }

    public void warn(Marker marker, String str, Throwable th2) {
        Log.w(this.f131879a, b(str, th2));
    }
}
