package com.noveogroup.android.log;

import com.noveogroup.android.log.Logger;

public interface Handler {
    boolean isEnabled(Logger.Level level);

    void print(String str, Logger.Level level, Throwable th2, String str2);

    void print(String str, Logger.Level level, Throwable th2, String str2, Object... objArr);
}
