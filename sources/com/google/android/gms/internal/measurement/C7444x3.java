package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import j0.b0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import jb.k;

/* renamed from: com.google.android.gms.internal.measurement.x3  reason: case insensitive filesystem */
public final class C7444x3 {

    /* renamed from: com.google.android.gms.internal.measurement.x3$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static volatile k<C7428v3> f49138a;

        private a() {
        }

        public static k<C7428v3> a(Context context) {
            k<C7428v3> kVar;
            k<C7428v3> kVar2 = f49138a;
            if (kVar2 == null) {
                synchronized (a.class) {
                    try {
                        kVar2 = f49138a;
                        if (kVar2 == null) {
                            new C7444x3();
                            if (!C7452y3.c(Build.TYPE, Build.TAGS)) {
                                kVar = k.a();
                            } else {
                                if (C7338k3.a()) {
                                    if (!context.isDeviceProtectedStorage()) {
                                        context = context.createDeviceProtectedStorageContext();
                                    }
                                }
                                kVar = C7444x3.c(context);
                            }
                            f49138a = kVar;
                            kVar2 = kVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return kVar2;
        }
    }

    private static C7428v3 a(Context context, File file) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            b0 b0Var = new b0();
            HashMap hashMap = new HashMap();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                    } else {
                        String b10 = b(split[0]);
                        String decode = Uri.decode(b(split[1]));
                        String str = (String) hashMap.get(split[2]);
                        if (str == null) {
                            String b11 = b(split[2]);
                            str = Uri.decode(b11);
                            if (str.length() < 1024 || str == b11) {
                                hashMap.put(b11, str);
                            }
                        }
                        b0 b0Var2 = (b0) b0Var.get(b10);
                        if (b0Var2 == null) {
                            b0Var2 = new b0();
                            b0Var.put(b10, b0Var2);
                        }
                        b0Var2.put(decode, str);
                    }
                } else {
                    String valueOf = String.valueOf(file);
                    String packageName = context.getPackageName();
                    Log.w("HermeticFileOverrides", "Parsed " + valueOf + " for Android package " + packageName);
                    C7389q3 q3Var = new C7389q3(b0Var);
                    bufferedReader.close();
                    return q3Var;
                }
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private static final String b(String str) {
        return new String(str);
    }

    static k<C7428v3> c(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            k<File> d10 = d(context);
            return d10.c() ? k.d(a(context, d10.b())) : k.a();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static k<File> d(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? k.d(file) : k.a();
        } catch (RuntimeException e10) {
            Log.e("HermeticFileOverrides", "no data dir", e10);
            return k.a();
        }
    }
}
