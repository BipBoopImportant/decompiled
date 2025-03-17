package org.slf4j.helpers;

import java.io.PrintStream;

public final class Util {
    private static ClassContextSecurityManager SECURITY_MANAGER = null;
    private static boolean SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED = false;

    private static final class ClassContextSecurityManager extends SecurityManager {
        private ClassContextSecurityManager() {
        }

        /* access modifiers changed from: protected */
        public Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private Util() {
    }

    public static Class<?> getCallingClass() {
        int i10;
        ClassContextSecurityManager securityManager = getSecurityManager();
        if (securityManager == null) {
            return null;
        }
        Class<?>[] classContext = securityManager.getClassContext();
        String name = Util.class.getName();
        int i11 = 0;
        while (i11 < classContext.length && !name.equals(classContext[i11].getName())) {
            i11++;
        }
        if (i11 < classContext.length && (i10 = i11 + 2) < classContext.length) {
            return classContext[i10];
        }
        throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
    }

    private static ClassContextSecurityManager getSecurityManager() {
        ClassContextSecurityManager classContextSecurityManager = SECURITY_MANAGER;
        if (classContextSecurityManager != null) {
            return classContextSecurityManager;
        }
        if (SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED) {
            return null;
        }
        ClassContextSecurityManager safeCreateSecurityManager = safeCreateSecurityManager();
        SECURITY_MANAGER = safeCreateSecurityManager;
        SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED = true;
        return safeCreateSecurityManager;
    }

    public static final void report(String str, Throwable th2) {
        PrintStream printStream = System.err;
        printStream.println(str);
        printStream.println("Reported exception:");
        th2.printStackTrace();
    }

    private static ClassContextSecurityManager safeCreateSecurityManager() {
        try {
            return new ClassContextSecurityManager();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean safeGetBooleanSystemProperty(String str) {
        String safeGetSystemProperty = safeGetSystemProperty(str);
        if (safeGetSystemProperty == null) {
            return false;
        }
        return safeGetSystemProperty.equalsIgnoreCase("true");
    }

    public static String safeGetSystemProperty(String str) {
        if (str != null) {
            try {
                return System.getProperty(str);
            } catch (SecurityException unused) {
                return null;
            }
        } else {
            throw new IllegalArgumentException("null input");
        }
    }

    public static final void report(String str) {
        PrintStream printStream = System.err;
        printStream.println("SLF4J: " + str);
    }
}
