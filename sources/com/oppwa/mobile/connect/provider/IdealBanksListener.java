package com.oppwa.mobile.connect.provider;

import java.util.Map;

public interface IdealBanksListener {
    void idealBanksRequestFailed();

    void idealBanksRequestSucceeded(Map<String, String> map);
}
