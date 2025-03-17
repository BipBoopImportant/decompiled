package com.sugarcube.decorate.v2.internal.manager.touch;

import A1.B;
import TJ.C16532g;
import com.sugarcube.decorate.v2.internal.manager.engine.EngineTouchInteractions;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004J\u001f\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0005H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0004J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\"\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001cH&¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/manager/touch/TouchManager;", "", "", "isTapGesturesEnabled", "()Z", "Lo1/g;", "offset", "LXH/N;", "onTap-k-4lQ0M", "(J)V", "onTap", "onDoubleTap-k-4lQ0M", "onDoubleTap", "onLongPress-k-4lQ0M", "onLongPress", "isDragGestureEnabled", "LA1/B;", "change", "dragAmount", "onDrag-Uv8p0NA", "(LA1/B;J)V", "onDrag", "isMultiTouchTransformGesturesEnabled", "isActive", "isTransforming", "(Z)V", "centroid", "pan", "", "zoom", "effectiveRotation", "rotation", "onMultiTouchTransformGesture-IUXd7x4", "(JJFFF)V", "onMultiTouchTransformGesture", "Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineTouchInteractions;", "interactions", "registerTouchInteractions", "(Lcom/sugarcube/decorate/v2/internal/manager/engine/EngineTouchInteractions;)V", "LTJ/g;", "isTransformingFlow", "()LTJ/g;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface TouchManager {
    boolean isDragGestureEnabled();

    boolean isMultiTouchTransformGesturesEnabled();

    boolean isTapGesturesEnabled();

    void isTransforming(boolean z10);

    C16532g<Boolean> isTransformingFlow();

    /* renamed from: onDoubleTap-k-4lQ0M  reason: not valid java name */
    void m65onDoubleTapk4lQ0M(long j10);

    /* renamed from: onDrag-Uv8p0NA  reason: not valid java name */
    void m66onDragUv8p0NA(B b10, long j10);

    /* renamed from: onLongPress-k-4lQ0M  reason: not valid java name */
    void m67onLongPressk4lQ0M(long j10);

    /* renamed from: onMultiTouchTransformGesture-IUXd7x4  reason: not valid java name */
    void m68onMultiTouchTransformGestureIUXd7x4(long j10, long j11, float f10, float f11, float f12);

    /* renamed from: onTap-k-4lQ0M  reason: not valid java name */
    void m69onTapk4lQ0M(long j10);

    void registerTouchInteractions(EngineTouchInteractions engineTouchInteractions);
}
