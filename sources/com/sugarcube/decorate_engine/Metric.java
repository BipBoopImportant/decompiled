package com.sugarcube.decorate_engine;

import HJ.C15854t;
import XH.C16814e;
import fK.p;
import fK.z;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 /2\u00020\u0001:\u00020/B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB7\b\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÁ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010(R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010,R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010%\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010(¨\u00061"}, d2 = {"Lcom/sugarcube/decorate_engine/Metric;", "", "", "name", "", "value", "context", "<init>", "(Ljava/lang/String;DLjava/lang/String;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;DLjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/Metric;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "copy", "(Ljava/lang/String;DLjava/lang/String;)Lcom/sugarcube/decorate_engine/Metric;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "D", "getValue", "setValue", "(D)V", "getContext", "setContext", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Metric {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private String context;
    private String name;
    private double value;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0001¨\u0006\n"}, d2 = {"Lcom/sugarcube/decorate_engine/Metric$Companion;", "", "()V", "fromLogLine", "Lcom/sugarcube/decorate_engine/Metric;", "logLine", "", "fromLogLine$decorate_engine_release", "serializer", "Lkotlinx/serialization/KSerializer;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Metric fromLogLine$decorate_engine_release(String str) {
            C17542s.j(str, "logLine");
            C17514c.a aVar = C17514c.f144280d;
            String l12 = C15854t.l1(str, "() ", (String) null, 2, (Object) null);
            KSerializer<Object> d10 = z.d(aVar.a(), P.l(Metric.class));
            C17542s.h(d10, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            Metric metric = (Metric) aVar.c(d10, l12);
            String context = metric.getContext();
            if (context != null && context.length() == 0) {
                metric.setContext((String) null);
            }
            return metric;
        }

        public final KSerializer<Metric> serializer() {
            return Metric$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C16814e
    public /* synthetic */ Metric(int i10, String str, double d10, String str2, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, Metric$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        if ((i10 & 2) == 0) {
            this.value = 0.0d;
        } else {
            this.value = d10;
        }
        if ((i10 & 4) == 0) {
            this.context = null;
        } else {
            this.context = str2;
        }
    }

    public static /* synthetic */ Metric copy$default(Metric metric, String str, double d10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = metric.name;
        }
        if ((i10 & 2) != 0) {
            d10 = metric.value;
        }
        if ((i10 & 4) != 0) {
            str2 = metric.context;
        }
        return metric.copy(str, d10, str2);
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(Metric metric, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, metric.name);
        if (dVar.z(serialDescriptor, 1) || Double.compare(metric.value, 0.0d) != 0) {
            dVar.E(serialDescriptor, 1, metric.value);
        }
        if (dVar.z(serialDescriptor, 2) || metric.context != null) {
            dVar.B(serialDescriptor, 2, Y0.f144077a, metric.context);
        }
    }

    public final String component1() {
        return this.name;
    }

    public final double component2() {
        return this.value;
    }

    public final String component3() {
        return this.context;
    }

    public final Metric copy(String str, double d10, String str2) {
        C17542s.j(str, "name");
        return new Metric(str, d10, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metric)) {
            return false;
        }
        Metric metric = (Metric) obj;
        return C17542s.e(this.name, metric.name) && Double.compare(this.value, metric.value) == 0 && C17542s.e(this.context, metric.context);
    }

    public final String getContext() {
        return this.context;
    }

    public final String getName() {
        return this.name;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + Double.hashCode(this.value)) * 31;
        String str = this.context;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setContext(String str) {
        this.context = str;
    }

    public final void setName(String str) {
        C17542s.j(str, "<set-?>");
        this.name = str;
    }

    public final void setValue(double d10) {
        this.value = d10;
    }

    public String toString() {
        String str = this.name;
        double d10 = this.value;
        String str2 = this.context;
        return "Metric(name=" + str + ", value=" + d10 + ", context=" + str2 + ")";
    }

    public Metric(String str, double d10, String str2) {
        C17542s.j(str, "name");
        this.name = str;
        this.value = d10;
        this.context = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Metric(String str, double d10, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? 0.0d : d10, (i10 & 4) != 0 ? null : str2);
    }
}
