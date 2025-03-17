package com.google.ar.core;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* renamed from: com.google.ar.core.l  reason: case insensitive filesystem */
final class C9504l {
    static PendingIntent a(Context context) {
        try {
            Bundle call = context.getContentResolver().call(new Uri.Builder().scheme("content").authority("com.google.ar.core.services.arcorecontentprovider").path("").build(), "getSetupIntent", context.getPackageName(), (Bundle) null);
            if (call != null) {
                PendingIntent pendingIntent = (PendingIntent) call.getParcelable("intent");
                if (pendingIntent != null) {
                    return pendingIntent;
                }
                String string = call.getString("exceptionType", "");
                if (!string.isEmpty()) {
                    if (string.equals(UnavailableDeviceNotCompatibleException.class.getName())) {
                        throw new UnavailableDeviceNotCompatibleException();
                    } else if (!string.equals(UnavailableUserDeclinedInstallationException.class.getName())) {
                        Class<? extends U> asSubclass = Class.forName(string).asSubclass(RuntimeException.class);
                        String string2 = call.getString("exceptionText", (String) null);
                        throw (string2 != null ? (RuntimeException) asSubclass.getConstructor(new Class[]{String.class}).newInstance(new Object[]{string2}) : (RuntimeException) asSubclass.getConstructor((Class[]) null).newInstance((Object[]) null));
                    } else {
                        throw new UnavailableUserDeclinedInstallationException();
                    }
                }
            }
            return null;
        } catch (ReflectiveOperationException e10) {
            e = e10;
            Log.i("ARCore-SetupContentReso", "Post-install failed", e);
            return null;
        } catch (RuntimeException e11) {
            e = e11;
            Log.i("ARCore-SetupContentReso", "Post-install failed", e);
            return null;
        }
    }
}
