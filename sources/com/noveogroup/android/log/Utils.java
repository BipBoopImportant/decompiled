package com.noveogroup.android.log;

public final class Utils {
    private static final CallerResolver CALLER_RESOLVER = new CallerResolver();
    /* access modifiers changed from: private */
    public static final String PACKAGE_NAME = Logger.class.getPackage().getName();

    private static final class CallerResolver extends SecurityManager {
        private CallerResolver() {
        }

        public Class<?> getCaller() {
            Class<?>[] classContext = getClassContext();
            if (classContext == null || classContext.length <= 0) {
                return null;
            }
            boolean z10 = false;
            for (Class<?> cls : classContext) {
                if (!z10) {
                    if (cls.getPackage().getName().startsWith(Utils.PACKAGE_NAME)) {
                        z10 = true;
                    }
                } else if (!cls.getPackage().getName().startsWith(Utils.PACKAGE_NAME)) {
                    return cls;
                }
            }
            return classContext[classContext.length - 1];
        }
    }

    private Utils() {
        throw new UnsupportedOperationException();
    }

    public static StackTraceElement getCaller() {
        return getCallerStackTrace();
    }

    public static String getCallerClassName() {
        Class<?> caller = CALLER_RESOLVER.getCaller();
        if (caller != null) {
            return caller.getName();
        }
        StackTraceElement callerStackTrace = getCallerStackTrace();
        if (callerStackTrace == null) {
            return null;
        }
        return callerStackTrace.getClassName();
    }

    private static StackTraceElement getCallerStackTrace() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null || stackTrace.length <= 0) {
            return null;
        }
        boolean z10 = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!z10) {
                if (stackTraceElement.getClassName().startsWith(PACKAGE_NAME)) {
                    z10 = true;
                }
            } else if (!stackTraceElement.getClassName().startsWith(PACKAGE_NAME)) {
                return stackTraceElement;
            }
        }
        return stackTrace[stackTrace.length - 1];
    }

    public static String shorten(String str, int i10, int i11) {
        if (str == null) {
            return null;
        }
        if (Math.abs(i11) < str.length()) {
            str = i11 < 0 ? str.substring(str.length() + i11, str.length()) : i11 > 0 ? str.substring(0, i11) : str;
        }
        if (Math.abs(i10) <= str.length()) {
            return str;
        }
        return String.format("%" + i10 + "s", new Object[]{str});
    }

    public static String shortenClassName(String str, int i10, int i11) {
        String shortenPackagesName = shortenPackagesName(str, i10);
        if (shortenPackagesName == null) {
            return null;
        }
        if (i11 == 0 || i11 > shortenPackagesName.length()) {
            return shortenPackagesName;
        }
        int i12 = 0;
        if (i11 < 0) {
            int i13 = -i11;
            StringBuilder sb2 = new StringBuilder();
            int length = shortenPackagesName.length() - 1;
            while (true) {
                if (length <= 0) {
                    break;
                }
                int lastIndexOf = shortenPackagesName.lastIndexOf(46, length);
                if (lastIndexOf != -1) {
                    if (sb2.length() > 0 && sb2.length() + ((length + 1) - lastIndexOf) + 1 > i13) {
                        sb2.insert(0, '*');
                        break;
                    }
                    sb2.insert(0, shortenPackagesName.substring(lastIndexOf, length + 1));
                } else if (sb2.length() > 0 && sb2.length() + length + 1 > i13) {
                    sb2.insert(0, '*');
                    break;
                } else {
                    sb2.insert(0, shortenPackagesName.substring(0, length + 1));
                }
                length = lastIndexOf - 1;
            }
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        while (true) {
            if (i12 < shortenPackagesName.length()) {
                int indexOf = shortenPackagesName.indexOf(46, i12);
                if (indexOf != -1) {
                    if (sb3.length() > 0 && indexOf + 1 > i11) {
                        sb3.insert(sb3.length(), '*');
                        break;
                    }
                    int i14 = indexOf + 1;
                    sb3.insert(sb3.length(), shortenPackagesName.substring(i12, i14));
                    i12 = i14;
                } else if (sb3.length() > 0) {
                    sb3.insert(sb3.length(), '*');
                } else {
                    sb3.insert(sb3.length(), shortenPackagesName.substring(i12, shortenPackagesName.length()));
                }
            } else {
                break;
            }
        }
        return sb3.toString();
    }

    private static String shortenPackagesName(String str, int i10) {
        if (str == null) {
            return null;
        }
        if (i10 == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = 1;
        if (i10 > 0) {
            int i12 = 0;
            while (true) {
                if (i12 >= str.length()) {
                    break;
                }
                int indexOf = str.indexOf(46, i12);
                if (indexOf == -1) {
                    sb2.insert(sb2.length(), str.substring(i12, str.length()));
                    break;
                } else if (i11 == i10) {
                    sb2.insert(sb2.length(), str.substring(i12, indexOf));
                    break;
                } else {
                    int i13 = indexOf + 1;
                    sb2.insert(sb2.length(), str.substring(i12, i13));
                    i11++;
                    i12 = i13;
                }
            }
        } else if (i10 < 0) {
            String shortenPackagesName = shortenPackagesName(str, -i10);
            if (str.equals(shortenPackagesName)) {
                sb2.insert(sb2.length(), str.substring(str.lastIndexOf(46) + 1, str.length()));
            } else {
                return str.replaceFirst(shortenPackagesName + '.', "");
            }
        }
        return sb2.toString();
    }
}
