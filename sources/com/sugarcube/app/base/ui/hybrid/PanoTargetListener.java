package com.sugarcube.app.base.ui.hybrid;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/PanoTargetListener;", "", "", "targetIdx", "LXH/N;", "targetAcquired", "(I)V", "targetLost", "targetSaving", "targetDone", "", "angles", "updateAngles", "([F)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PanoTargetListener {
    void targetAcquired(int i10);

    void targetDone(int i10);

    void targetLost(int i10);

    void targetSaving(int i10);

    void updateAngles(float[] fArr);
}
