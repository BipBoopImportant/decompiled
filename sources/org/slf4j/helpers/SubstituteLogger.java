package org.slf4j.helpers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.event.EventRecodingLogger;
import org.slf4j.event.LoggingEvent;
import org.slf4j.event.SubstituteLoggingEvent;

public class SubstituteLogger implements Logger {
    private volatile Logger _delegate;
    private final boolean createdPostInitialization;
    private Boolean delegateEventAware;
    private Queue<SubstituteLoggingEvent> eventQueue;
    private EventRecodingLogger eventRecodingLogger;
    private Method logMethodCache;
    private final String name;

    public SubstituteLogger(String str, Queue<SubstituteLoggingEvent> queue, boolean z10) {
        this.name = str;
        this.eventQueue = queue;
        this.createdPostInitialization = z10;
    }

    private Logger getEventRecordingLogger() {
        if (this.eventRecodingLogger == null) {
            this.eventRecodingLogger = new EventRecodingLogger(this, this.eventQueue);
        }
        return this.eventRecodingLogger;
    }

    public void debug(String str) {
        delegate().debug(str);
    }

    /* access modifiers changed from: package-private */
    public Logger delegate() {
        return this._delegate != null ? this._delegate : this.createdPostInitialization ? NOPLogger.NOP_LOGGER : getEventRecordingLogger();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.name.equals(((SubstituteLogger) obj).name);
    }

    public void error(String str) {
        delegate().error(str);
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public void info(String str) {
        delegate().info(str);
    }

    public boolean isDebugEnabled() {
        return delegate().isDebugEnabled();
    }

    public boolean isDelegateEventAware() {
        Boolean bool = this.delegateEventAware;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.logMethodCache = this._delegate.getClass().getMethod("log", new Class[]{LoggingEvent.class});
            this.delegateEventAware = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.delegateEventAware = Boolean.FALSE;
        }
        return this.delegateEventAware.booleanValue();
    }

    public boolean isDelegateNOP() {
        return this._delegate instanceof NOPLogger;
    }

    public boolean isDelegateNull() {
        return this._delegate == null;
    }

    public boolean isErrorEnabled() {
        return delegate().isErrorEnabled();
    }

    public boolean isInfoEnabled() {
        return delegate().isInfoEnabled();
    }

    public boolean isTraceEnabled() {
        return delegate().isTraceEnabled();
    }

    public boolean isWarnEnabled() {
        return delegate().isWarnEnabled();
    }

    public void log(LoggingEvent loggingEvent) {
        if (isDelegateEventAware()) {
            try {
                this.logMethodCache.invoke(this._delegate, new Object[]{loggingEvent});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    public void setDelegate(Logger logger) {
        this._delegate = logger;
    }

    public void trace(String str) {
        delegate().trace(str);
    }

    public void warn(String str) {
        delegate().warn(str);
    }

    public void debug(String str, Object obj) {
        delegate().debug(str, obj);
    }

    public void error(String str, Object obj) {
        delegate().error(str, obj);
    }

    public void info(String str, Object obj) {
        delegate().info(str, obj);
    }

    public boolean isDebugEnabled(Marker marker) {
        return delegate().isDebugEnabled(marker);
    }

    public boolean isErrorEnabled(Marker marker) {
        return delegate().isErrorEnabled(marker);
    }

    public boolean isInfoEnabled(Marker marker) {
        return delegate().isInfoEnabled(marker);
    }

    public boolean isTraceEnabled(Marker marker) {
        return delegate().isTraceEnabled(marker);
    }

    public boolean isWarnEnabled(Marker marker) {
        return delegate().isWarnEnabled(marker);
    }

    public void trace(String str, Object obj) {
        delegate().trace(str, obj);
    }

    public void warn(String str, Object obj) {
        delegate().warn(str, obj);
    }

    public void debug(String str, Object obj, Object obj2) {
        delegate().debug(str, obj, obj2);
    }

    public void error(String str, Object obj, Object obj2) {
        delegate().error(str, obj, obj2);
    }

    public void info(String str, Object obj, Object obj2) {
        delegate().info(str, obj, obj2);
    }

    public void trace(String str, Object obj, Object obj2) {
        delegate().trace(str, obj, obj2);
    }

    public void warn(String str, Object obj, Object obj2) {
        delegate().warn(str, obj, obj2);
    }

    public void debug(String str, Object... objArr) {
        delegate().debug(str, objArr);
    }

    public void error(String str, Object... objArr) {
        delegate().error(str, objArr);
    }

    public void info(String str, Object... objArr) {
        delegate().info(str, objArr);
    }

    public void trace(String str, Object... objArr) {
        delegate().trace(str, objArr);
    }

    public void warn(String str, Object... objArr) {
        delegate().warn(str, objArr);
    }

    public void debug(String str, Throwable th2) {
        delegate().debug(str, th2);
    }

    public void error(String str, Throwable th2) {
        delegate().error(str, th2);
    }

    public void info(String str, Throwable th2) {
        delegate().info(str, th2);
    }

    public void trace(String str, Throwable th2) {
        delegate().trace(str, th2);
    }

    public void warn(String str, Throwable th2) {
        delegate().warn(str, th2);
    }

    public void debug(Marker marker, String str) {
        delegate().debug(marker, str);
    }

    public void error(Marker marker, String str) {
        delegate().error(marker, str);
    }

    public void info(Marker marker, String str) {
        delegate().info(marker, str);
    }

    public void trace(Marker marker, String str) {
        delegate().trace(marker, str);
    }

    public void warn(Marker marker, String str) {
        delegate().warn(marker, str);
    }

    public void debug(Marker marker, String str, Object obj) {
        delegate().debug(marker, str, obj);
    }

    public void error(Marker marker, String str, Object obj) {
        delegate().error(marker, str, obj);
    }

    public void info(Marker marker, String str, Object obj) {
        delegate().info(marker, str, obj);
    }

    public void trace(Marker marker, String str, Object obj) {
        delegate().trace(marker, str, obj);
    }

    public void warn(Marker marker, String str, Object obj) {
        delegate().warn(marker, str, obj);
    }

    public void debug(Marker marker, String str, Object obj, Object obj2) {
        delegate().debug(marker, str, obj, obj2);
    }

    public void error(Marker marker, String str, Object obj, Object obj2) {
        delegate().error(marker, str, obj, obj2);
    }

    public void info(Marker marker, String str, Object obj, Object obj2) {
        delegate().info(marker, str, obj, obj2);
    }

    public void trace(Marker marker, String str, Object obj, Object obj2) {
        delegate().trace(marker, str, obj, obj2);
    }

    public void warn(Marker marker, String str, Object obj, Object obj2) {
        delegate().warn(marker, str, obj, obj2);
    }

    public void debug(Marker marker, String str, Object... objArr) {
        delegate().debug(marker, str, objArr);
    }

    public void error(Marker marker, String str, Object... objArr) {
        delegate().error(marker, str, objArr);
    }

    public void info(Marker marker, String str, Object... objArr) {
        delegate().info(marker, str, objArr);
    }

    public void trace(Marker marker, String str, Object... objArr) {
        delegate().trace(marker, str, objArr);
    }

    public void warn(Marker marker, String str, Object... objArr) {
        delegate().warn(marker, str, objArr);
    }

    public void debug(Marker marker, String str, Throwable th2) {
        delegate().debug(marker, str, th2);
    }

    public void error(Marker marker, String str, Throwable th2) {
        delegate().error(marker, str, th2);
    }

    public void info(Marker marker, String str, Throwable th2) {
        delegate().info(marker, str, th2);
    }

    public void trace(Marker marker, String str, Throwable th2) {
        delegate().trace(marker, str, th2);
    }

    public void warn(Marker marker, String str, Throwable th2) {
        delegate().warn(marker, str, th2);
    }
}
