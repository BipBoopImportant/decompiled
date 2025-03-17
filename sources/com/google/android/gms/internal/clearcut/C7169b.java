package com.google.android.gms.internal.clearcut;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.UserManager;

/* renamed from: com.google.android.gms.internal.clearcut.b  reason: case insensitive filesystem */
public class C7169b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile UserManager f48303a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f48304b = (!b());

    private C7169b() {
    }

    public static boolean a(Context context) {
        return b() && !c(context);
    }

    private static boolean b() {
        return true;
    }

    @TargetApi(24)
    private static boolean c(Context context) {
        boolean z10 = f48304b;
        if (!z10) {
            UserManager userManager = f48303a;
            if (userManager == null) {
                synchronized (C7169b.class) {
                    try {
                        userManager = f48303a;
                        if (userManager == null) {
                            UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                            f48303a = userManager2;
                            if (userManager2 == null) {
                                f48304b = true;
                                return true;
                            }
                            userManager = userManager2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            z10 = userManager.isUserUnlocked();
            f48304b = z10;
            if (z10) {
                f48303a = null;
            }
        }
        return z10;
    }
}
