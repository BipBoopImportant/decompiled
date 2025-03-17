package com.google.vr.dynamite.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.ar.core.dependencies.c;

public final class b extends c implements INativeLibraryLoader {
    b(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.INativeLibraryLoader");
    }

    public final int checkVersion(String str) {
        Parcel a10 = a();
        a10.writeString(str);
        Parcel b10 = b(2, a10);
        int readInt = b10.readInt();
        b10.recycle();
        return readInt;
    }

    public final long initializeAndLoadNativeLibrary(String str) {
        Parcel a10 = a();
        a10.writeString(str);
        Parcel b10 = b(1, a10);
        long readLong = b10.readLong();
        b10.recycle();
        return readLong;
    }
}
