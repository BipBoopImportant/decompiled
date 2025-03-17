package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.g3  reason: case insensitive filesystem */
public final class C7302g3 implements C7320i3 {
    public final String a(ContentResolver contentResolver, String str) {
        Cursor query;
        Uri uri = Z2.f48837a;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (acquireUnstableContentProviderClient != null) {
            try {
                query = acquireUnstableContentProviderClient.query(uri, (String[]) null, (String) null, new String[]{str}, (String) null);
                if (query == null) {
                    throw new C7311h3("ContentProvider query returned null cursor");
                } else if (query.moveToFirst()) {
                    String string = query.getString(1);
                    query.close();
                    acquireUnstableContentProviderClient.release();
                    return string;
                } else {
                    query.close();
                    acquireUnstableContentProviderClient.release();
                    return null;
                }
            } catch (RemoteException e10) {
                throw new C7311h3("ContentProvider query failed", e10);
            } catch (Throwable th2) {
                acquireUnstableContentProviderClient.release();
                throw th2;
            }
        } else {
            throw new C7311h3("Unable to acquire ContentProviderClient");
        }
        throw th;
    }

    public final <T extends Map<String, String>> T b(ContentResolver contentResolver, String[] strArr, C7293f3<T> f3Var) {
        Cursor query;
        Uri uri = Z2.f48838b;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (acquireUnstableContentProviderClient != null) {
            try {
                query = acquireUnstableContentProviderClient.query(uri, (String[]) null, (String) null, strArr, (String) null);
                if (query != null) {
                    T c10 = f3Var.c(query.getCount());
                    while (query.moveToNext()) {
                        c10.put(query.getString(0), query.getString(1));
                    }
                    if (query.isAfterLast()) {
                        query.close();
                        acquireUnstableContentProviderClient.release();
                        return c10;
                    }
                    throw new C7311h3("Cursor read incomplete (ContentProvider dead?)");
                }
                throw new C7311h3("ContentProvider query returned null cursor");
            } catch (RemoteException e10) {
                try {
                    throw new C7311h3("ContentProvider query failed", e10);
                } catch (Throwable th2) {
                    acquireUnstableContentProviderClient.release();
                    throw th2;
                }
            } catch (Throwable th3) {
                th.addSuppressed(th3);
            }
        } else {
            throw new C7311h3("Unable to acquire ContentProviderClient");
        }
        throw th;
    }
}
