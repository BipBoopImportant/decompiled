package com.google.firebase.perf.util;

public enum b {
    TRACE_EVENT_RATE_LIMITED("_fstec"),
    NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
    TRACE_STARTED_NOT_STOPPED("_tsns"),
    FRAMES_TOTAL("_fr_tot"),
    FRAMES_SLOW("_fr_slo"),
    FRAMES_FROZEN("_fr_fzn");
    
    private String mName;

    private b(String str) {
        this.mName = str;
    }

    public String toString() {
        return this.mName;
    }
}
