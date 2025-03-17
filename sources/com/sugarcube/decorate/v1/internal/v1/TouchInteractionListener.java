package com.sugarcube.decorate.v1.internal.v1;

import RF.k;
import ZF.C16930S0;
import ZF.C16932T0;
import com.sugarcube.decorate_engine.PanZoomRegion;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0011H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u0004J\u0019\u0010\u001a\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u001a\u0010\u000fJ\u001b\u0010\u001d\u001a\u00020\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H&¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0002H&¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\u0002H&¢\u0006\u0004\b%\u0010\u0004J\u0017\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/sugarcube/decorate/v1/internal/v1/TouchInteractionListener;", "", "LXH/N;", "onItemEraseToggled", "()V", "Lcom/sugarcube/decorate_engine/PanZoomRegion;", "region", "onRegionChanged", "(Lcom/sugarcube/decorate_engine/PanZoomRegion;)V", "onMaxZoomReached", "onPinch", "onMinZoomReached", "LRF/k;", "selectedInstance", "onInstanceSelected", "(LRF/k;)V", "inst", "", "sx", "sy", "onMove", "(LRF/k;FF)V", "deltaYaw", "onRotate", "(LRF/k;F)V", "onSelectionCleared", "onInstanceDoubleTap", "LZF/S0;", "mode", "onItemInteractionMode", "(LZF/S0;)V", "LZF/T0;", "swipeDirection", "onSwipe", "(LZF/T0;)V", "onFocusModeZoomIncrease", "onFocusModeZoomDecrease", "onInteractionEnded", "", "downTime", "onLongPress", "(J)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface TouchInteractionListener {
    void onFocusModeZoomDecrease();

    void onFocusModeZoomIncrease();

    void onInstanceDoubleTap(k kVar);

    void onInstanceSelected(k kVar);

    void onInteractionEnded();

    void onItemEraseToggled();

    void onItemInteractionMode(C16930S0 s02);

    void onLongPress(long j10);

    void onMaxZoomReached();

    void onMinZoomReached();

    void onMove(k kVar, float f10, float f11);

    void onPinch();

    void onRegionChanged(PanZoomRegion panZoomRegion);

    void onRotate(k kVar, float f10);

    void onSelectionCleared();

    void onSwipe(C16932T0 t02);
}
