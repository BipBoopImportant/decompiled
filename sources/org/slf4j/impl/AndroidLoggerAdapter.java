package org.slf4j.impl;

import com.noveogroup.android.log.Logger;
import org.slf4j.helpers.MarkerIgnoringBase;
import org.slf4j.helpers.MessageFormatter;

public class AndroidLoggerAdapter extends MarkerIgnoringBase {
    private final Logger logger;

    public AndroidLoggerAdapter(Logger logger2) {
        this.logger = logger2;
    }

    private boolean isEnabled(Logger.Level level) {
        return this.logger.isEnabled(level);
    }

    private void log(Logger.Level level, String str) {
        this.logger.print(level, (Throwable) null, str);
    }

    public void debug(String str) {
        log(Logger.Level.DEBUG, str);
    }

    public void error(String str) {
        log(Logger.Level.ERROR, str);
    }

    public void info(String str) {
        log(Logger.Level.INFO, str);
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

    public boolean isTraceEnabled() {
        return isEnabled(Logger.Level.VERBOSE);
    }

    public boolean isWarnEnabled() {
        return isEnabled(Logger.Level.WARN);
    }

    public void trace(String str) {
        log(Logger.Level.VERBOSE, str);
    }

    public void warn(String str) {
        log(Logger.Level.WARN, str);
    }

    private void log(Logger.Level level, String str, Object obj) {
        this.logger.print(level, (Throwable) null, MessageFormatter.format(str, obj).getMessage());
    }

    public void debug(String str, Object obj) {
        log(Logger.Level.DEBUG, str, obj);
    }

    public void error(String str, Object obj) {
        log(Logger.Level.ERROR, str, obj);
    }

    public void info(String str, Object obj) {
        log(Logger.Level.INFO, str, obj);
    }

    public void trace(String str, Object obj) {
        log(Logger.Level.VERBOSE, str, obj);
    }

    public void warn(String str, Object obj) {
        log(Logger.Level.WARN, str, obj);
    }

    private void log(Logger.Level level, String str, Object obj, Object obj2) {
        this.logger.print(level, (Throwable) null, MessageFormatter.format(str, obj, obj2).getMessage());
    }

    public void debug(String str, Object obj, Object obj2) {
        log(Logger.Level.DEBUG, str, obj, obj2);
    }

    public void error(String str, Object obj, Object obj2) {
        log(Logger.Level.ERROR, str, obj, obj2);
    }

    public void info(String str, Object obj, Object obj2) {
        log(Logger.Level.INFO, str, obj, obj2);
    }

    public void trace(String str, Object obj, Object obj2) {
        log(Logger.Level.VERBOSE, str, obj, obj2);
    }

    public void warn(String str, Object obj, Object obj2) {
        log(Logger.Level.WARN, str, obj, obj2);
    }

    private void log(Logger.Level level, String str, Object... objArr) {
        this.logger.print(level, (Throwable) null, MessageFormatter.arrayFormat(str, objArr).getMessage());
    }

    public void debug(String str, Object... objArr) {
        log(Logger.Level.DEBUG, str, objArr);
    }

    public void error(String str, Object... objArr) {
        log(Logger.Level.ERROR, str, objArr);
    }

    public void info(String str, Object... objArr) {
        log(Logger.Level.INFO, str, objArr);
    }

    public void trace(String str, Object... objArr) {
        log(Logger.Level.VERBOSE, str, objArr);
    }

    public void warn(String str, Object... objArr) {
        log(Logger.Level.WARN, str, objArr);
    }

    private void log(Logger.Level level, String str, Throwable th2) {
        this.logger.print(level, th2, str);
    }

    public void debug(String str, Throwable th2) {
        log(Logger.Level.DEBUG, str, th2);
    }

    public void error(String str, Throwable th2) {
        log(Logger.Level.ERROR, str, th2);
    }

    public void info(String str, Throwable th2) {
        log(Logger.Level.INFO, str, th2);
    }

    public void trace(String str, Throwable th2) {
        log(Logger.Level.VERBOSE, str, th2);
    }

    public void warn(String str, Throwable th2) {
        log(Logger.Level.WARN, str, th2);
    }
}
