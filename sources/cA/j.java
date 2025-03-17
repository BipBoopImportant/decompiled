package ca;

public final class j {
    public static Object a(Class cls, String str, h... hVarArr) {
        return c(cls, "isIsolated", (Object) null, false, hVarArr);
    }

    public static Object b(String str, String str2, ClassLoader classLoader, h... hVarArr) {
        return c(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", (Object) null, false, hVarArr);
    }

    private static Object c(Class cls, String str, Object obj, boolean z10, h... hVarArr) {
        int length = hVarArr.length;
        Class[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i10 = 0; i10 < hVarArr.length; i10++) {
            h hVar = hVarArr[i10];
            hVar.getClass();
            clsArr[i10] = hVar.b();
            objArr[i10] = hVarArr[i10].c();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke((Object) null, objArr);
    }
}
