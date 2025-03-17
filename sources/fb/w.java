package fb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    private static final C9693i f72965a = new C9693i("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                f72965a.d("Play Store package is disabled.", new Object[0]);
            } else {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (r0 = signatureArr.length) == 0) {
                        f72965a.d("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Signature byteArray : signatureArr) {
                            String a10 = v.a(byteArray.toByteArray());
                            arrayList.add(a10);
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(a10)) {
                                return true;
                            }
                            String str = Build.TAGS;
                            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(a10)) {
                                return true;
                            }
                        }
                        C9693i iVar = f72965a;
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb2.append((CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb2.append(", ");
                            }
                        }
                        iVar.d(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", new Object[]{sb2.toString()}), new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    f72965a.d("Play Store package is not found.", new Object[0]);
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            f72965a.d("Play Store package is not found.", new Object[0]);
        }
        return false;
    }
}
