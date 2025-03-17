package com.google.android.gms.vision.clearcut;

import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.g;

@Keep
public class LoggingConnectionCallbacks implements g.a, g.b {
    public void onConnected(@RecentlyNonNull Bundle bundle) {
        throw new NoSuchMethodError();
    }

    public void onConnectionFailed(@RecentlyNonNull ConnectionResult connectionResult) {
        throw new NoSuchMethodError();
    }

    public void onConnectionSuspended(int i10) {
        throw new NoSuchMethodError();
    }
}
