package com.ingka.ikea.zipselector.impl.network;

import fK.p;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/ingka/ikea/zipselector/impl/network/RequestStatedBody;", "", "", "zipCode", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/zipselector/impl/network/RequestStatedBody;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getZipCode", "()Ljava/lang/String;", "getZipCode$annotations", "()V", "Companion", "$serializer", "zipselector-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RequestStatedBody {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f120744a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/zipselector/impl/network/RequestStatedBody$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/zipselector/impl/network/RequestStatedBody;", "serializer", "()Lkotlinx/serialization/KSerializer;", "zipselector-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<RequestStatedBody> serializer() {
            return RequestStatedBody$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RequestStatedBody(int i10, String str, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, RequestStatedBody$$serializer.INSTANCE.getDescriptor());
        }
        this.f120744a = str;
    }

    public RequestStatedBody(String str) {
        C17542s.j(str, "zipCode");
        this.f120744a = str;
    }
}
