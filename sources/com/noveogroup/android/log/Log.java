package com.noveogroup.android.log;

import com.noveogroup.android.log.Logger;

public final class Log {
    private Log() {
        throw new UnsupportedOperationException();
    }

    public static void a(String str, Throwable th2) {
        LoggerManager.getLogger().a(str, th2);
    }

    public static void d(String str, Throwable th2) {
        LoggerManager.getLogger().d(str, th2);
    }

    public static void e(String str, Throwable th2) {
        LoggerManager.getLogger().e(str, th2);
    }

    public static void i(String str, Throwable th2) {
        LoggerManager.getLogger().i(str, th2);
    }

    public static boolean isAssertEnabled() {
        return LoggerManager.getLogger().isAssertEnabled();
    }

    public static boolean isDebugEnabled() {
        return LoggerManager.getLogger().isDebugEnabled();
    }

    public static boolean isEnabled(Logger.Level level) {
        return LoggerManager.getLogger().isEnabled(level);
    }

    public static boolean isErrorEnabled() {
        return LoggerManager.getLogger().isErrorEnabled();
    }

    public static boolean isInfoEnabled() {
        return LoggerManager.getLogger().isInfoEnabled();
    }

    public static boolean isVerboseEnabled() {
        return LoggerManager.getLogger().isVerboseEnabled();
    }

    public static boolean isWarnEnabled() {
        return LoggerManager.getLogger().isWarnEnabled();
    }

    public static void print(Logger.Level level, Throwable th2, String str) {
        LoggerManager.getLogger().print(level, th2, str);
    }

    public static void v(String str, Throwable th2) {
        LoggerManager.getLogger().v(str, th2);
    }

    public static void w(String str, Throwable th2) {
        LoggerManager.getLogger().w(str, th2);
    }

    public static void a(Throwable th2) {
        LoggerManager.getLogger().a(th2);
    }

    public static void d(Throwable th2) {
        LoggerManager.getLogger().d(th2);
    }

    public static void e(Throwable th2) {
        LoggerManager.getLogger().e(th2);
    }

    public static void i(Throwable th2) {
        LoggerManager.getLogger().i(th2);
    }

    public static void print(Logger.Level level, Throwable th2, String str, Object... objArr) {
        LoggerManager.getLogger().print(level, th2, str, objArr);
    }

    public static void v(Throwable th2) {
        LoggerManager.getLogger().v(th2);
    }

    public static void w(Throwable th2) {
        LoggerManager.getLogger().w(th2);
    }

    public static void a(Throwable th2, String str, Object... objArr) {
        LoggerManager.getLogger().a(th2, str, objArr);
    }

    public static void d(Throwable th2, String str, Object... objArr) {
        LoggerManager.getLogger().d(th2, str, objArr);
    }

    public static void e(Throwable th2, String str, Object... objArr) {
        LoggerManager.getLogger().e(th2, str, objArr);
    }

    public static void i(Throwable th2, String str, Object... objArr) {
        LoggerManager.getLogger().i(th2, str, objArr);
    }

    public static void v(Throwable th2, String str, Object... objArr) {
        LoggerManager.getLogger().v(th2, str, objArr);
    }

    public static void w(Throwable th2, String str, Object... objArr) {
        LoggerManager.getLogger().w(th2, str, objArr);
    }

    public static void a(Throwable th2, String str) {
        LoggerManager.getLogger().a(th2, str);
    }

    public static void d(Throwable th2, String str) {
        LoggerManager.getLogger().d(th2, str);
    }

    public static void e(Throwable th2, String str) {
        LoggerManager.getLogger().e(th2, str);
    }

    public static void i(Throwable th2, String str) {
        LoggerManager.getLogger().i(th2, str);
    }

    public static void v(Throwable th2, String str) {
        LoggerManager.getLogger().v(th2, str);
    }

    public static void w(Throwable th2, String str) {
        LoggerManager.getLogger().w(th2, str);
    }

    public static void a(String str, Object... objArr) {
        LoggerManager.getLogger().a(str, objArr);
    }

    public static void d(String str, Object... objArr) {
        LoggerManager.getLogger().d(str, objArr);
    }

    public static void e(String str, Object... objArr) {
        LoggerManager.getLogger().e(str, objArr);
    }

    public static void i(String str, Object... objArr) {
        LoggerManager.getLogger().i(str, objArr);
    }

    public static void v(String str, Object... objArr) {
        LoggerManager.getLogger().v(str, objArr);
    }

    public static void w(String str, Object... objArr) {
        LoggerManager.getLogger().w(str, objArr);
    }

    public static void a(String str) {
        LoggerManager.getLogger().a(str);
    }

    public static void d(String str) {
        LoggerManager.getLogger().d(str);
    }

    public static void e(String str) {
        LoggerManager.getLogger().e(str);
    }

    public static void i(String str) {
        LoggerManager.getLogger().i(str);
    }

    public static void v(String str) {
        LoggerManager.getLogger().v(str);
    }

    public static void w(String str) {
        LoggerManager.getLogger().w(str);
    }
}
