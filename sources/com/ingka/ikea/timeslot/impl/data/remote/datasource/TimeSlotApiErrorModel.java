package com.ingka.ikea.timeslot.impl.data.remote.datasource;

import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 '2\u00020\u0001:\u0002(\u0012B7\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010\u0015R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010!\u0012\u0004\b&\u0010\u001f\u001a\u0004\b%\u0010\u0015¨\u0006)"}, d2 = {"Lcom/ingka/ikea/timeslot/impl/data/remote/datasource/TimeSlotApiErrorModel;", "", "", "seen0", "code", "", "type", "message", "LjK/T0;", "serializationConstructorMarker", "<init>", "(IILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/timeslot/impl/data/remote/datasource/TimeSlotApiErrorModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCode", "getCode$annotations", "()V", "b", "Ljava/lang/String;", "getType", "getType$annotations", "c", "getMessage", "getMessage$annotations", "Companion", "$serializer", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TimeSlotApiErrorModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final int f120524a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120525b;

    /* renamed from: c  reason: collision with root package name */
    private final String f120526c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/timeslot/impl/data/remote/datasource/TimeSlotApiErrorModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/timeslot/impl/data/remote/datasource/TimeSlotApiErrorModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<TimeSlotApiErrorModel> serializer() {
            return TimeSlotApiErrorModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TimeSlotApiErrorModel(int i10, int i11, String str, String str2, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, TimeSlotApiErrorModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f120524a = i11;
        this.f120525b = str;
        this.f120526c = str2;
    }

    public static final /* synthetic */ void a(TimeSlotApiErrorModel timeSlotApiErrorModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.w(serialDescriptor, 0, timeSlotApiErrorModel.f120524a);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 1, y02, timeSlotApiErrorModel.f120525b);
        dVar.B(serialDescriptor, 2, y02, timeSlotApiErrorModel.f120526c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeSlotApiErrorModel)) {
            return false;
        }
        TimeSlotApiErrorModel timeSlotApiErrorModel = (TimeSlotApiErrorModel) obj;
        return this.f120524a == timeSlotApiErrorModel.f120524a && C17542s.e(this.f120525b, timeSlotApiErrorModel.f120525b) && C17542s.e(this.f120526c, timeSlotApiErrorModel.f120526c);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f120524a) * 31;
        String str = this.f120525b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f120526c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        int i10 = this.f120524a;
        String str = this.f120525b;
        String str2 = this.f120526c;
        return "TimeSlotApiErrorModel(code=" + i10 + ", type=" + str + ", message=" + str2 + ")";
    }
}
