package com.ingka.ikea.timeslot.impl.data.remote.model;

import fK.p;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u001dB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotRequest;", "", "", "Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotCartItemRequest;", "items", "<init>", "(Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotRequest;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getItems$annotations", "()V", "Companion", "$serializer", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TimeslotRequest {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final int f120537b = 8;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f120538c = {new C17451f(TimeslotCartItemRequest$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final List<TimeslotCartItemRequest> f120539a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotRequest$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<TimeslotRequest> serializer() {
            return TimeslotRequest$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TimeslotRequest(int i10, List list, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, TimeslotRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.f120539a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TimeslotRequest) && C17542s.e(this.f120539a, ((TimeslotRequest) obj).f120539a);
    }

    public int hashCode() {
        return this.f120539a.hashCode();
    }

    public String toString() {
        List<TimeslotCartItemRequest> list = this.f120539a;
        return "TimeslotRequest(items=" + list + ")";
    }

    public TimeslotRequest(List<TimeslotCartItemRequest> list) {
        C17542s.j(list, "items");
        this.f120539a = list;
    }
}
