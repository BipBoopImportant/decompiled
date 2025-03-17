package com.oppwa.mobile.connect.provider;

import android.app.Activity;
import com.oppwa.mobile.connect.provider.threeds.v2.model.ThreeDSConfig;

public interface ThreeDSWorkflowListener {
    Activity onThreeDSChallengeRequired();

    ThreeDSConfig onThreeDSConfigRequired() {
        return new ThreeDSConfig.Builder().build();
    }
}
