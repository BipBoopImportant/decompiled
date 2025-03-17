package com.sugarcube.decorate_engine;

import XH.C16814e;
import android.view.MotionEvent;
import fK.p;
import iK.C17395d;
import jK.C17457i;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 A2\u00020\u0001:\u0002BAB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006B1\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\rB1\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0011B)\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0012B!\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0015Bg\b\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u0002\u0010!J(\u0010*\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%HÁ\u0001¢\u0006\u0004\b(\u0010)J\u000f\u0010.\u001a\u00020+H\u0000¢\u0006\u0004\b,\u0010-R\u0016\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010/R\u0016\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010/R\u0016\u0010\u001a\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010/R\u0016\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u001b\u00100R\u0016\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u001c\u00100R\u0016\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u001d\u00100R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\u001e\u00101R\u0016\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b\f\u00100R\u0011\u00102\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b2\u00103R$\u00109\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00078F@FX\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010@\u001a\u00020:2\u0006\u0010;\u001a\u00020:8F@FX\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "", "<init>", "()V", "", "isModelRolled90", "(Z)V", "", "sx", "sy", "isAbsPos", "isPanoCoords", "applyPhysics", "(FFZZZ)V", "absX", "absY", "absYaw", "(FFFZZ)V", "(FFZZ)V", "yaw", "isAbsYaw", "(FZZ)V", "", "seen1", "screenX", "screenY", "yawRadians", "isAbsolutePosition", "isAbsoluteYaw", "isPanoSpace", "isModelMirrored", "LjK/T0;", "serializationConstructorMarker", "(IFFFZZZLjava/lang/Boolean;Ljava/lang/Boolean;ZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/ModelScreenTransform;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toPacked$decorate_engine_release", "()J", "toPacked", "F", "Z", "Ljava/lang/Boolean;", "isValid", "()Z", "v", "getYawDegrees", "()F", "setYawDegrees", "(F)V", "yawDegrees", "Landroid/view/MotionEvent$PointerCoords;", "value", "getScreenCoords", "()Landroid/view/MotionEvent$PointerCoords;", "setScreenCoords", "(Landroid/view/MotionEvent$PointerCoords;)V", "screenCoords", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ModelScreenTransform {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public boolean applyPhysics;
    public boolean isAbsolutePosition;
    public boolean isAbsoluteYaw;
    public Boolean isModelMirrored;
    public Boolean isModelRolled90;
    public boolean isPanoSpace;
    public float screenX;
    public float screenY;
    public float yawRadians;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0001¨\u0006\n"}, d2 = {"Lcom/sugarcube/decorate_engine/ModelScreenTransform$Companion;", "", "()V", "fromPacked", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "packed", "", "fromPacked$decorate_engine_release", "serializer", "Lkotlinx/serialization/KSerializer;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ModelScreenTransform fromPacked$decorate_engine_release(long j10) {
            ModelScreenTransform fromPackedXform = BridgeStructsUtil.fromPackedXform(j10);
            C17542s.i(fromPackedXform, "fromPackedXform(...)");
            return fromPackedXform;
        }

        public final KSerializer<ModelScreenTransform> serializer() {
            return ModelScreenTransform$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C16814e
    public /* synthetic */ ModelScreenTransform(int i10, float f10, float f11, float f12, boolean z10, boolean z11, boolean z12, Boolean bool, Boolean bool2, boolean z13, T0 t02) {
        if ((i10 & 1) == 0) {
            this.screenX = 0.0f;
        } else {
            this.screenX = f10;
        }
        if ((i10 & 2) == 0) {
            this.screenY = 0.0f;
        } else {
            this.screenY = f11;
        }
        if ((i10 & 4) == 0) {
            this.yawRadians = 0.0f;
        } else {
            this.yawRadians = f12;
        }
        if ((i10 & 8) == 0) {
            this.isAbsolutePosition = false;
        } else {
            this.isAbsolutePosition = z10;
        }
        if ((i10 & 16) == 0) {
            this.isAbsoluteYaw = false;
        } else {
            this.isAbsoluteYaw = z11;
        }
        if ((i10 & 32) == 0) {
            this.isPanoSpace = false;
        } else {
            this.isPanoSpace = z12;
        }
        if ((i10 & 64) == 0) {
            this.isModelRolled90 = null;
        } else {
            this.isModelRolled90 = bool;
        }
        if ((i10 & 128) == 0) {
            this.isModelMirrored = null;
        } else {
            this.isModelMirrored = bool2;
        }
        if ((i10 & 256) == 0) {
            this.applyPhysics = false;
        } else {
            this.applyPhysics = z13;
        }
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(ModelScreenTransform modelScreenTransform, C17395d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.z(serialDescriptor, 0) || Float.compare(modelScreenTransform.screenX, 0.0f) != 0) {
            dVar.s(serialDescriptor, 0, modelScreenTransform.screenX);
        }
        if (dVar.z(serialDescriptor, 1) || Float.compare(modelScreenTransform.screenY, 0.0f) != 0) {
            dVar.s(serialDescriptor, 1, modelScreenTransform.screenY);
        }
        if (dVar.z(serialDescriptor, 2) || Float.compare(modelScreenTransform.yawRadians, 0.0f) != 0) {
            dVar.s(serialDescriptor, 2, modelScreenTransform.yawRadians);
        }
        if (dVar.z(serialDescriptor, 3) || modelScreenTransform.isAbsolutePosition) {
            dVar.x(serialDescriptor, 3, modelScreenTransform.isAbsolutePosition);
        }
        if (dVar.z(serialDescriptor, 4) || modelScreenTransform.isAbsoluteYaw) {
            dVar.x(serialDescriptor, 4, modelScreenTransform.isAbsoluteYaw);
        }
        if (dVar.z(serialDescriptor, 5) || modelScreenTransform.isPanoSpace) {
            dVar.x(serialDescriptor, 5, modelScreenTransform.isPanoSpace);
        }
        if (dVar.z(serialDescriptor, 6) || modelScreenTransform.isModelRolled90 != null) {
            dVar.B(serialDescriptor, 6, C17457i.f144111a, modelScreenTransform.isModelRolled90);
        }
        if (dVar.z(serialDescriptor, 7) || modelScreenTransform.isModelMirrored != null) {
            dVar.B(serialDescriptor, 7, C17457i.f144111a, modelScreenTransform.isModelMirrored);
        }
        if (dVar.z(serialDescriptor, 8) || modelScreenTransform.applyPhysics) {
            dVar.x(serialDescriptor, 8, modelScreenTransform.applyPhysics);
        }
    }

    public final MotionEvent.PointerCoords getScreenCoords() {
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.x = this.screenX;
        pointerCoords.y = this.screenY;
        return pointerCoords;
    }

    public final float getYawDegrees() {
        return this.yawRadians * ((float) 57.29577951308232d);
    }

    public final boolean isValid() {
        return (this.screenX == 0.0f && this.screenY == 0.0f && this.yawRadians == 0.0f && !this.isAbsolutePosition && !this.isAbsoluteYaw && this.isModelRolled90 == null && this.isModelMirrored == null && !this.applyPhysics && !this.isPanoSpace) ? false : true;
    }

    public final void setScreenCoords(MotionEvent.PointerCoords pointerCoords) {
        C17542s.j(pointerCoords, "value");
        this.screenX = pointerCoords.x;
        this.screenY = pointerCoords.y;
    }

    public final void setYawDegrees(float f10) {
        this.yawRadians = f10 * ((float) 0.017453292519943295d);
    }

    public final long toPacked$decorate_engine_release() {
        return BridgeStructsUtil.toPackedXform(this);
    }

    public ModelScreenTransform() {
    }

    public ModelScreenTransform(boolean z10) {
        this.isModelRolled90 = Boolean.valueOf(z10);
    }

    public ModelScreenTransform(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        this.screenX = f10;
        this.screenY = f11;
        this.isAbsolutePosition = z10;
        this.isPanoSpace = z11;
        this.applyPhysics = z12 && !z11;
    }

    public ModelScreenTransform(float f10, float f11, float f12, boolean z10, boolean z11) {
        this.screenX = f10;
        this.screenY = f11;
        this.yawRadians = f12;
        boolean z12 = true;
        this.isAbsolutePosition = true;
        this.isAbsoluteYaw = true;
        this.isPanoSpace = z10;
        this.applyPhysics = (!z11 || z10) ? false : z12;
    }

    public ModelScreenTransform(float f10, float f11, boolean z10, boolean z11) {
        this.screenX = f10;
        this.screenY = f11;
        this.isAbsolutePosition = z10;
        this.applyPhysics = z11;
    }

    public ModelScreenTransform(float f10, boolean z10, boolean z11) {
        this.yawRadians = f10;
        this.isAbsoluteYaw = z10;
        this.applyPhysics = z11;
    }
}
