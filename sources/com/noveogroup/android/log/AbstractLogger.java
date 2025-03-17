package com.noveogroup.android.log;

import com.noveogroup.android.log.Logger;

public abstract class AbstractLogger implements Logger {
    private final String name;

    public AbstractLogger(String str) {
        this.name = str;
    }

    public void a(String str, Throwable th2) {
        print(Logger.Level.ASSERT, th2, str);
    }

    public void d(String str, Throwable th2) {
        print(Logger.Level.DEBUG, th2, str);
    }

    public void e(String str, Throwable th2) {
        print(Logger.Level.ERROR, th2, str);
    }

    public String getName() {
        return this.name;
    }

    public void i(String str, Throwable th2) {
        print(Logger.Level.INFO, th2, str);
    }

    public boolean isAssertEnabled() {
        return isEnabled(Logger.Level.ASSERT);
    }

    public boolean isDebugEnabled() {
        return isEnabled(Logger.Level.DEBUG);
    }

    public boolean isErrorEnabled() {
        return isEnabled(Logger.Level.ERROR);
    }

    public boolean isInfoEnabled() {
        return isEnabled(Logger.Level.INFO);
    }

    public boolean isVerboseEnabled() {
        return isEnabled(Logger.Level.VERBOSE);
    }

    public boolean isWarnEnabled() {
        return isEnabled(Logger.Level.WARN);
    }

    public void v(String str, Throwable th2) {
        print(Logger.Level.VERBOSE, th2, str);
    }

    public void w(String str, Throwable th2) {
        print(Logger.Level.WARN, th2, str);
    }

    public void a(Throwable th2) {
        print(Logger.Level.ASSERT, th2, (String) null);
    }

    public void d(Throwable th2) {
        print(Logger.Level.DEBUG, th2, (String) null);
    }

    public void e(Throwable th2) {
        print(Logger.Level.ERROR, th2, (String) null);
    }

    public void i(Throwable th2) {
        print(Logger.Level.INFO, th2, (String) null);
    }

    public void v(Throwable th2) {
        print(Logger.Level.VERBOSE, th2, (String) null);
    }

    public void w(Throwable th2) {
        print(Logger.Level.WARN, th2, (String) null);
    }

    public void a(Throwable th2, String str, Object... objArr) {
        print(Logger.Level.ASSERT, th2, str, objArr);
    }

    public void d(Throwable th2, String str, Object... objArr) {
        print(Logger.Level.DEBUG, th2, str, objArr);
    }

    public void e(Throwable th2, String str, Object... objArr) {
        print(Logger.Level.ERROR, th2, str, objArr);
    }

    public void i(Throwable th2, String str, Object... objArr) {
        print(Logger.Level.INFO, th2, str, objArr);
    }

    public void v(Throwable th2, String str, Object... objArr) {
        print(Logger.Level.VERBOSE, th2, str, objArr);
    }

    public void w(Throwable th2, String str, Object... objArr) {
        print(Logger.Level.WARN, th2, str, objArr);
    }

    public void a(Throwable th2, String str) {
        print(Logger.Level.ASSERT, th2, str);
    }

    public void d(Throwable th2, String str) {
        print(Logger.Level.DEBUG, th2, str);
    }

    public void e(Throwable th2, String str) {
        print(Logger.Level.ERROR, th2, str);
    }

    public void i(Throwable th2, String str) {
        print(Logger.Level.INFO, th2, str);
    }

    public void v(Throwable th2, String str) {
        print(Logger.Level.VERBOSE, th2, str);
    }

    public void w(Throwable th2, String str) {
        print(Logger.Level.WARN, th2, str);
    }

    public void a(String str, Object... objArr) {
        print(Logger.Level.ASSERT, (Throwable) null, str, objArr);
    }

    public void d(String str, Object... objArr) {
        print(Logger.Level.DEBUG, (Throwable) null, str, objArr);
    }

    public void e(String str, Object... objArr) {
        print(Logger.Level.ERROR, (Throwable) null, str, objArr);
    }

    public void i(String str, Object... objArr) {
        print(Logger.Level.INFO, (Throwable) null, str, objArr);
    }

    public void v(String str, Object... objArr) {
        print(Logger.Level.VERBOSE, (Throwable) null, str, objArr);
    }

    public void w(String str, Object... objArr) {
        print(Logger.Level.WARN, (Throwable) null, str, objArr);
    }

    public void a(String str) {
        print(Logger.Level.ASSERT, (Throwable) null, str);
    }

    public void d(String str) {
        print(Logger.Level.DEBUG, (Throwable) null, str);
    }

    public void e(String str) {
        print(Logger.Level.ERROR, (Throwable) null, str);
    }

    public void i(String str) {
        print(Logger.Level.INFO, (Throwable) null, str);
    }

    public void v(String str) {
        print(Logger.Level.VERBOSE, (Throwable) null, str);
    }

    public void w(String str) {
        print(Logger.Level.WARN, (Throwable) null, str);
    }
}
