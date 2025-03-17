package com.noveogroup.android.log;

import com.noveogroup.android.log.Logger;

public class PatternHandler implements Handler {
    private final Pattern compiledMessagePattern;
    private final Pattern compiledTagPattern;
    private final Logger.Level level;
    private final String messagePattern;
    private final String tagPattern;

    public PatternHandler(Logger.Level level2, String str, String str2) {
        this.level = level2;
        this.tagPattern = str;
        this.compiledTagPattern = Pattern.compile(str);
        this.messagePattern = str2;
        this.compiledMessagePattern = Pattern.compile(str2);
    }

    public Logger.Level getLevel() {
        return this.level;
    }

    public String getMessagePattern() {
        return this.messagePattern;
    }

    public String getTagPattern() {
        return this.tagPattern;
    }

    public boolean isEnabled(Logger.Level level2) {
        Logger.Level level3 = this.level;
        return (level3 == null || level2 == null || !level3.includes(level2)) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        r6 = r3.compiledMessagePattern;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void print(java.lang.String r4, com.noveogroup.android.log.Logger.Level r5, java.lang.Throwable r6, java.lang.String r7) {
        /*
            r3 = this;
            boolean r0 = r3.isEnabled(r5)
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = ""
            if (r7 != 0) goto L_0x0013
            if (r6 != 0) goto L_0x000e
            r7 = r0
            goto L_0x002e
        L_0x000e:
            java.lang.String r7 = android.util.Log.getStackTraceString(r6)
            goto L_0x002e
        L_0x0013:
            if (r6 != 0) goto L_0x0016
            goto L_0x002e
        L_0x0016:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r7 = 10
            r1.append(r7)
            java.lang.String r6 = android.util.Log.getStackTraceString(r6)
            r1.append(r6)
            java.lang.String r7 = r1.toString()
        L_0x002e:
            com.noveogroup.android.log.Pattern r6 = r3.compiledTagPattern
            if (r6 == 0) goto L_0x0038
            boolean r6 = r6.isCallerNeeded()
            if (r6 != 0) goto L_0x0042
        L_0x0038:
            com.noveogroup.android.log.Pattern r6 = r3.compiledMessagePattern
            if (r6 == 0) goto L_0x0047
            boolean r6 = r6.isCallerNeeded()
            if (r6 == 0) goto L_0x0047
        L_0x0042:
            java.lang.StackTraceElement r6 = com.noveogroup.android.log.Utils.getCaller()
            goto L_0x0048
        L_0x0047:
            r6 = 0
        L_0x0048:
            com.noveogroup.android.log.Pattern r1 = r3.compiledTagPattern
            if (r1 != 0) goto L_0x004e
            r1 = r0
            goto L_0x0052
        L_0x004e:
            java.lang.String r1 = r1.apply(r6, r4, r5)
        L_0x0052:
            com.noveogroup.android.log.Pattern r2 = r3.compiledMessagePattern
            if (r2 != 0) goto L_0x0057
            goto L_0x005b
        L_0x0057:
            java.lang.String r0 = r2.apply(r6, r4, r5)
        L_0x005b:
            int r4 = r0.length()
            if (r4 <= 0) goto L_0x007d
            r4 = 0
            char r4 = r0.charAt(r4)
            boolean r4 = java.lang.Character.isWhitespace(r4)
            if (r4 != 0) goto L_0x007d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r6 = " "
            r4.append(r6)
            java.lang.String r0 = r4.toString()
        L_0x007d:
            int r4 = r5.intValue()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.println(r4, r1, r5)
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.noveogroup.android.log.PatternHandler.print(java.lang.String, com.noveogroup.android.log.Logger$Level, java.lang.Throwable, java.lang.String):void");
    }

    public void print(String str, Logger.Level level2, Throwable th2, String str2, Object... objArr) {
        String str3;
        if (!isEnabled(level2)) {
            return;
        }
        if (str2 != null || objArr == null || objArr.length <= 0) {
            if (str2 == null) {
                str3 = null;
            } else {
                str3 = String.format(str2, objArr);
            }
            print(str, level2, th2, str3);
            return;
        }
        throw new IllegalArgumentException("message format is not set but arguments are presented");
    }
}
