package com.sugarcube.decorate_engine;

import gK.C17294a;
import hK.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u00020\u00128\u0016X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/sugarcube/decorate_engine/ModelScreenTransformSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sugarcube/decorate_engine/ModelScreenTransform;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sugarcube/decorate_engine/ModelScreenTransform;", "", "delegateSerializer", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor$annotations", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ModelScreenTransformSerializer implements KSerializer<ModelScreenTransform> {
    public static final ModelScreenTransformSerializer INSTANCE = new ModelScreenTransformSerializer();
    private static final KSerializer<double[]> delegateSerializer;
    private static final SerialDescriptor descriptor;

    static {
        KSerializer<double[]> e10 = C17294a.e();
        delegateSerializer = e10;
        descriptor = k.c("ObjectInstanceId", e10.getDescriptor());
    }

    private ModelScreenTransformSerializer() {
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public ModelScreenTransform deserialize(Decoder decoder) {
        C17542s.j(decoder, "decoder");
        double[] dArr = (double[]) decoder.E(delegateSerializer);
        ModelScreenTransform modelScreenTransform = new ModelScreenTransform();
        if (dArr.length == 4) {
            modelScreenTransform.isAbsolutePosition = true;
            modelScreenTransform.isAbsoluteYaw = true;
            boolean z10 = false;
            modelScreenTransform.screenX = (float) dArr[0];
            modelScreenTransform.screenY = (float) dArr[1];
            modelScreenTransform.yawRadians = (float) dArr[2];
            if (dArr[3] == 0.0d) {
                z10 = true;
            }
            modelScreenTransform.isPanoSpace = !z10;
        }
        return modelScreenTransform;
    }

    public void serialize(Encoder encoder, ModelScreenTransform modelScreenTransform) {
        double[] dArr;
        C17542s.j(encoder, "encoder");
        C17542s.j(modelScreenTransform, "value");
        if (modelScreenTransform.isValid()) {
            dArr = new double[]{(double) modelScreenTransform.screenX, (double) modelScreenTransform.screenY, (double) modelScreenTransform.yawRadians, modelScreenTransform.isPanoSpace ? 1.0d : 0.0d};
        } else {
            dArr = new double[0];
        }
        encoder.n(delegateSerializer, dArr);
    }
}
