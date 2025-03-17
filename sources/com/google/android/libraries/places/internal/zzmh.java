package com.google.android.libraries.places.internal;

import com.google.common.flogger.backend.google.GooglePlatform;
import com.google.common.flogger.backend.system.DefaultPlatform;
import java.lang.reflect.InvocationTargetException;

public final class zzmh {
    public static zzmg zza() {
        try {
            return zzml.class.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused) {
            try {
                return GooglePlatform.class.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused2) {
                try {
                    return DefaultPlatform.class.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused3) {
                    return null;
                }
            }
        }
    }
}
