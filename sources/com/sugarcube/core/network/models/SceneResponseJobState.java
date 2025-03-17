package com.sugarcube.core.network.models;

import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/core/network/models/SceneResponseJobState;", "", "jobState", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJobState", "()Ljava/lang/String;", "Initialized", "Uploading", "Processing", "Success", "Failed", "Lost", "Unknown", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum SceneResponseJobState {
    Initialized("Initialized"),
    Uploading("Uploading"),
    Processing("Processing"),
    Success("Success"),
    Failed("Failed"),
    Lost("Lost"),
    Unknown((String) null);
    
    private final String jobState;

    static {
        SceneResponseJobState[] $values;
        $ENTRIES = C17221b.a($values);
    }

    private SceneResponseJobState(String str) {
        this.jobState = str;
    }

    public static C17220a<SceneResponseJobState> getEntries() {
        return $ENTRIES;
    }

    public final String getJobState() {
        return this.jobState;
    }
}
