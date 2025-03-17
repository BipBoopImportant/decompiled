package com.google.vr.dynamite.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Log;
import dalvik.system.DexClassLoader;
import kd.C9974b;

@UsedByNative
public final class DynamiteClient {

    /* renamed from: a  reason: collision with root package name */
    private static final ArrayMap f69435a = new ArrayMap();

    private DynamiteClient() {
    }

    @UsedByNative
    public static synchronized int checkVersion(Context context, String str, String str2, String str3) {
        synchronized (DynamiteClient.class) {
            d dVar = new d(str, str2);
            c remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(dVar);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.a(context).newNativeLibraryLoader(ObjectWrapper.I3(remoteLibraryLoaderFromInfo.b(context)), ObjectWrapper.I3(context));
                if (newNativeLibraryLoader == null) {
                    String obj = dVar.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 72);
                    sb2.append("Failed to load native library ");
                    sb2.append(obj);
                    sb2.append(" from remote package: no loader available.");
                    Log.e("DynamiteClient", sb2.toString());
                    return -1;
                }
                int checkVersion = newNativeLibraryLoader.checkVersion(str3);
                return checkVersion;
            } catch (RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError | C9974b e10) {
                String obj2 = dVar.toString();
                StringBuilder sb3 = new StringBuilder(obj2.length() + 54);
                sb3.append("Failed to load native library ");
                sb3.append(obj2);
                sb3.append(" from remote package:\n  ");
                Log.e("DynamiteClient", sb3.toString(), e10);
                return -1;
            }
        }
    }

    @UsedByNative
    public static synchronized ClassLoader getRemoteClassLoader(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, str2);
            if (remoteContext == null) {
                return null;
            }
            ClassLoader classLoader = remoteContext.getClassLoader();
            return classLoader;
        }
    }

    @UsedByNative
    public static synchronized Context getRemoteContext(Context context, String str, String str2) {
        Context b10;
        synchronized (DynamiteClient.class) {
            d dVar = new d(str, str2);
            try {
                b10 = getRemoteLibraryLoaderFromInfo(dVar).b(context);
            } catch (C9974b e10) {
                String obj = dVar.toString();
                StringBuilder sb2 = new StringBuilder(obj.length() + 52);
                sb2.append("Failed to get remote Context");
                sb2.append(obj);
                sb2.append(" from remote package:\n  ");
                Log.e("DynamiteClient", sb2.toString(), e10);
                return null;
            }
        }
        return b10;
    }

    @UsedByNative
    public static synchronized ClassLoader getRemoteDexClassLoader(Context context, String str) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, (String) null);
            if (remoteContext == null) {
                return null;
            }
            try {
                DexClassLoader dexClassLoader = new DexClassLoader(remoteContext.getPackageCodePath(), context.getCodeCacheDir().getAbsolutePath(), remoteContext.getApplicationInfo().nativeLibraryDir, context.getClassLoader());
                return dexClassLoader;
            } catch (RuntimeException e10) {
                Log.e("DynamiteClient", "Failed to create class loader for remote package\n ", e10);
                return null;
            }
        }
    }

    @UsedByNative
    private static synchronized c getRemoteLibraryLoaderFromInfo(d dVar) {
        synchronized (DynamiteClient.class) {
            ArrayMap arrayMap = f69435a;
            c cVar = (c) arrayMap.get(dVar);
            if (cVar != null) {
                return cVar;
            }
            c cVar2 = new c(dVar);
            arrayMap.put(dVar, cVar2);
            return cVar2;
        }
    }

    @UsedByNative
    public static synchronized long loadNativeRemoteLibrary(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            d dVar = new d(str, str2);
            c remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(dVar);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.a(context).newNativeLibraryLoader(ObjectWrapper.I3(remoteLibraryLoaderFromInfo.b(context)), ObjectWrapper.I3(context));
                if (newNativeLibraryLoader == null) {
                    String obj = dVar.toString();
                    StringBuilder sb2 = new StringBuilder(obj.length() + 72);
                    sb2.append("Failed to load native library ");
                    sb2.append(obj);
                    sb2.append(" from remote package: no loader available.");
                    Log.e("DynamiteClient", sb2.toString());
                    return 0;
                }
                long initializeAndLoadNativeLibrary = newNativeLibraryLoader.initializeAndLoadNativeLibrary(str2);
                return initializeAndLoadNativeLibrary;
            } catch (RemoteException | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError | C9974b e10) {
                String obj2 = dVar.toString();
                StringBuilder sb3 = new StringBuilder(obj2.length() + 54);
                sb3.append("Failed to load native library ");
                sb3.append(obj2);
                sb3.append(" from remote package:\n  ");
                Log.e("DynamiteClient", sb3.toString(), e10);
                return 0;
            }
        }
    }
}
