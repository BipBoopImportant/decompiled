package com.noveogroup.android.log;

import com.noveogroup.android.log.Logger;

public class SimpleLogger extends AbstractLogger {
    private final Handler handler;

    public SimpleLogger(String str, Handler handler2) {
        super(str);
        this.handler = handler2;
    }

    public boolean isEnabled(Logger.Level level) {
        Handler handler2 = this.handler;
        return handler2 != null && handler2.isEnabled(level);
    }

    public void print(Logger.Level level, Throwable th2, String str) {
        Handler handler2 = this.handler;
        if (handler2 != null) {
            handler2.print(getName(), level, th2, str);
        }
    }

    public void print(Logger.Level level, Throwable th2, String str, Object... objArr) {
        Handler handler2 = this.handler;
        if (handler2 != null) {
            handler2.print(getName(), level, th2, str, objArr);
        }
    }
}
