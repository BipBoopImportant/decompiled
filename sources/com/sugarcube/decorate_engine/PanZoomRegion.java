package com.sugarcube.decorate_engine;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 -2\u00020\u0001:\u0001-B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0002\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8\u0000@\u0000X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR0\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8F@FX\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u000fR$\u0010$\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R0\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8F@FX\u000e¢\u0006\f\u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u000fR\u0011\u0010)\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0011\u0010,\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b,\u0010*¨\u0006."}, d2 = {"Lcom/sugarcube/decorate_engine/PanZoomRegion;", "", "<init>", "()V", "Landroid/view/MotionEvent$PointerCoords;", "center", "", "zoom", "(Landroid/view/MotionEvent$PointerCoords;F)V", "rhs", "(Lcom/sugarcube/decorate_engine/PanZoomRegion;)V", "", "delta", "LXH/N;", "movePixelCenter", "([Ljava/lang/Float;)V", "deltaX", "deltaY", "(FF)V", "", "toPacked$decorate_engine_release", "()J", "toPacked", "_pixelCenter", "[Ljava/lang/Float;", "_proportionalCenter", "F", "v", "getPixelCenter", "()[Ljava/lang/Float;", "setPixelCenter", "pixelCenter", "getPixelCenterCoords", "()Landroid/view/MotionEvent$PointerCoords;", "setPixelCenterCoords", "(Landroid/view/MotionEvent$PointerCoords;)V", "pixelCenterCoords", "getProportionalCenter", "setProportionalCenter", "proportionalCenter", "", "isPixelCenterValid", "()Z", "isProportionalCenterValid", "isUnzoomed", "Companion", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PanZoomRegion {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final float kInvalidCoord = 1048575.0f;
    /* access modifiers changed from: private */
    public static final Float[] kInvalidPos;
    /* access modifiers changed from: private */
    public static final Float[] kProportionalMiddle;
    /* access modifiers changed from: private */
    public static final PanZoomRegion unzoomed = new PanZoomRegion();
    public Float[] _pixelCenter = kInvalidPos;
    public Float[] _proportionalCenter = kProportionalMiddle;
    public float zoom;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/decorate_engine/PanZoomRegion$Companion;", "", "()V", "kInvalidCoord", "", "getKInvalidCoord$decorate_engine_release", "()F", "kInvalidPos", "", "getKInvalidPos$decorate_engine_release", "()[Ljava/lang/Float;", "[Ljava/lang/Float;", "kProportionalMiddle", "getKProportionalMiddle", "unzoomed", "Lcom/sugarcube/decorate_engine/PanZoomRegion;", "getUnzoomed", "()Lcom/sugarcube/decorate_engine/PanZoomRegion;", "fromPacked", "packed", "", "fromPacked$decorate_engine_release", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PanZoomRegion fromPacked$decorate_engine_release(long j10) {
            PanZoomRegion fromPackedRgn = BridgeStructsUtil.fromPackedRgn(j10);
            C17542s.i(fromPackedRgn, "fromPackedRgn(...)");
            return fromPackedRgn;
        }

        public final float getKInvalidCoord$decorate_engine_release() {
            return PanZoomRegion.kInvalidCoord;
        }

        public final Float[] getKInvalidPos$decorate_engine_release() {
            return PanZoomRegion.kInvalidPos;
        }

        public final Float[] getKProportionalMiddle() {
            return PanZoomRegion.kProportionalMiddle;
        }

        public final PanZoomRegion getUnzoomed() {
            return PanZoomRegion.unzoomed;
        }

        private Companion() {
        }
    }

    static {
        Float valueOf = Float.valueOf(1048575.0f);
        kInvalidPos = new Float[]{valueOf, valueOf};
        Float valueOf2 = Float.valueOf(0.0f);
        kProportionalMiddle = new Float[]{valueOf2, valueOf2};
    }

    public PanZoomRegion() {
    }

    public final Float[] getPixelCenter() {
        return this._pixelCenter;
    }

    public final MotionEvent.PointerCoords getPixelCenterCoords() {
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.x = this._pixelCenter[0].floatValue();
        pointerCoords.y = this._pixelCenter[1].floatValue();
        return pointerCoords;
    }

    public final Float[] getProportionalCenter() {
        return this._proportionalCenter;
    }

    public final boolean isPixelCenterValid() {
        float floatValue = this._pixelCenter[0].floatValue();
        float f10 = kInvalidCoord;
        return (floatValue == f10 || this._pixelCenter[1].floatValue() == f10) ? false : true;
    }

    public final boolean isProportionalCenterValid() {
        float floatValue = this._proportionalCenter[0].floatValue();
        float f10 = kInvalidCoord;
        return (floatValue == f10 || getProportionalCenter()[1].floatValue() == f10) ? false : true;
    }

    public final boolean isUnzoomed() {
        return this.zoom <= 1.0f;
    }

    public final void movePixelCenter(Float[] fArr) {
        C17542s.j(fArr, "delta");
        int length = fArr.length;
        movePixelCenter(fArr[0].floatValue(), fArr[1].floatValue());
    }

    public final void setPixelCenter(Float[] fArr) {
        C17542s.j(fArr, "v");
        if (fArr.length == 2) {
            float floatValue = fArr[0].floatValue();
            float f10 = kInvalidCoord;
            if (floatValue != f10) {
                int i10 = (fArr[1].floatValue() > f10 ? 1 : (fArr[1].floatValue() == f10 ? 0 : -1));
            }
        }
        this._pixelCenter = fArr;
        this._proportionalCenter = kInvalidPos;
    }

    public final void setPixelCenterCoords(MotionEvent.PointerCoords pointerCoords) {
        C17542s.j(pointerCoords, "v");
        setPixelCenter(new Float[]{Float.valueOf(pointerCoords.x), Float.valueOf(pointerCoords.y)});
    }

    public final void setProportionalCenter(Float[] fArr) {
        C17542s.j(fArr, "v");
        if (fArr.length == 2) {
            float floatValue = fArr[0].floatValue();
            float f10 = kInvalidCoord;
            if (floatValue != f10) {
                int i10 = (fArr[1].floatValue() > f10 ? 1 : (fArr[1].floatValue() == f10 ? 0 : -1));
            }
        }
        this._proportionalCenter = fArr;
        this._pixelCenter = kInvalidPos;
    }

    public final long toPacked$decorate_engine_release() {
        return BridgeStructsUtil.toPackedRgn(this);
    }

    public final void movePixelCenter(float f10, float f11) {
        float floatValue = getPixelCenter()[0].floatValue();
        float f12 = kInvalidCoord;
        if (floatValue != f12) {
            int i10 = (getPixelCenter()[1].floatValue() > f12 ? 1 : (getPixelCenter()[1].floatValue() == f12 ? 0 : -1));
        }
        setPixelCenter(new Float[]{Float.valueOf(getPixelCenter()[0].floatValue() + f10), Float.valueOf(getPixelCenter()[1].floatValue() + f11)});
    }

    public PanZoomRegion(MotionEvent.PointerCoords pointerCoords, float f10) {
        C17542s.j(pointerCoords, "center");
        setPixelCenterCoords(pointerCoords);
        this.zoom = f10;
    }

    public PanZoomRegion(PanZoomRegion panZoomRegion) {
        C17542s.j(panZoomRegion, "rhs");
        this._pixelCenter = panZoomRegion._pixelCenter;
        this._proportionalCenter = panZoomRegion._proportionalCenter;
        this.zoom = panZoomRegion.zoom;
    }
}
