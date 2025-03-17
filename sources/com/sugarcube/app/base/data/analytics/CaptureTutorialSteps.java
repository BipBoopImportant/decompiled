package com.sugarcube.app.base.data.analytics;

import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/sugarcube/app/base/data/analytics/CaptureTutorialSteps;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STEP_0", "STEP_1", "STEP_2", "STEP_3", "STEP_4", "STEP_5", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum CaptureTutorialSteps {
    STEP_0(0),
    STEP_1(1),
    STEP_2(2),
    STEP_3(3),
    STEP_4(4),
    STEP_5(5);
    
    private final int value;

    static {
        CaptureTutorialSteps[] $values;
        $ENTRIES = C17221b.a($values);
    }

    private CaptureTutorialSteps(int i10) {
        this.value = i10;
    }

    public static C17220a<CaptureTutorialSteps> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
