package com.noveogroup.android.log;

public interface Logger {
    public static final String ROOT_LOGGER_NAME = "ROOT";

    public enum Level {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6),
        ASSERT(7);
        
        private final int intValue;

        private Level(int i10) {
            this.intValue = i10;
        }

        public boolean includes(Level level) {
            return level != null && intValue() <= level.intValue();
        }

        public int intValue() {
            return this.intValue;
        }
    }

    void a(String str);

    void a(String str, Throwable th2);

    void a(String str, Object... objArr);

    void a(Throwable th2);

    void a(Throwable th2, String str);

    void a(Throwable th2, String str, Object... objArr);

    void d(String str);

    void d(String str, Throwable th2);

    void d(String str, Object... objArr);

    void d(Throwable th2);

    void d(Throwable th2, String str);

    void d(Throwable th2, String str, Object... objArr);

    void e(String str);

    void e(String str, Throwable th2);

    void e(String str, Object... objArr);

    void e(Throwable th2);

    void e(Throwable th2, String str);

    void e(Throwable th2, String str, Object... objArr);

    String getName();

    void i(String str);

    void i(String str, Throwable th2);

    void i(String str, Object... objArr);

    void i(Throwable th2);

    void i(Throwable th2, String str);

    void i(Throwable th2, String str, Object... objArr);

    boolean isAssertEnabled();

    boolean isDebugEnabled();

    boolean isEnabled(Level level);

    boolean isErrorEnabled();

    boolean isInfoEnabled();

    boolean isVerboseEnabled();

    boolean isWarnEnabled();

    void print(Level level, Throwable th2, String str);

    void print(Level level, Throwable th2, String str, Object... objArr);

    void v(String str);

    void v(String str, Throwable th2);

    void v(String str, Object... objArr);

    void v(Throwable th2);

    void v(Throwable th2, String str);

    void v(Throwable th2, String str, Object... objArr);

    void w(String str);

    void w(String str, Throwable th2);

    void w(String str, Object... objArr);

    void w(Throwable th2);

    void w(Throwable th2, String str);

    void w(Throwable th2, String str, Object... objArr);
}
