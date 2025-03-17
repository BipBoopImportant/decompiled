package com.ingka.ikea.episod.datalayer.network.models;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u0013B3\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0014\u0012\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/ingka/ikea/episod/datalayer/network/models/EpisodResponse;", "", "", "seen1", "", "eventId", "serverTimestamp", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/episod/datalayer/network/models/EpisodResponse;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "Ljava/lang/String;", "getEventId", "()Ljava/lang/String;", "getEventId$annotations", "()V", "getServerTimestamp$annotations", "Companion", "$serializer", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EpisodResponse {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95767a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95768b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/episod/datalayer/network/models/EpisodResponse$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/episod/datalayer/network/models/EpisodResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EpisodResponse> serializer() {
            return EpisodResponse$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ EpisodResponse(int i10, String str, String str2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, EpisodResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f95767a = str;
        this.f95768b = str2;
    }

    public static final /* synthetic */ void b(EpisodResponse episodResponse, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, episodResponse.f95767a);
        dVar.y(serialDescriptor, 1, episodResponse.f95768b);
    }

    public final String a() {
        return this.f95768b;
    }
}
