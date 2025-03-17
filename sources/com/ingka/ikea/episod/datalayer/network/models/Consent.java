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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000  2\u00020\u0001:\u0002!\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001e\u0010\u0017¨\u0006\""}, d2 = {"Lcom/ingka/ikea/episod/datalayer/network/models/Consent;", "", "", "analytics", "marketing", "personalisation", "<init>", "(ZZZ)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(IZZZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/episod/datalayer/network/models/Consent;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "getAnalytics", "()Z", "getAnalytics$annotations", "()V", "b", "getMarketing", "getMarketing$annotations", "c", "getPersonalisation", "getPersonalisation$annotations", "Companion", "$serializer", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Consent {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f95752a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f95753b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f95754c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/episod/datalayer/network/models/Consent$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/episod/datalayer/network/models/Consent;", "serializer", "()Lkotlinx/serialization/KSerializer;", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Consent> serializer() {
            return Consent$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ Consent(int i10, boolean z10, boolean z11, boolean z12, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, Consent$$serializer.INSTANCE.getDescriptor());
        }
        this.f95752a = z10;
        this.f95753b = z11;
        this.f95754c = z12;
    }

    public static final /* synthetic */ void a(Consent consent, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.x(serialDescriptor, 0, consent.f95752a);
        dVar.x(serialDescriptor, 1, consent.f95753b);
        dVar.x(serialDescriptor, 2, consent.f95754c);
    }

    public Consent(boolean z10, boolean z11, boolean z12) {
        this.f95752a = z10;
        this.f95753b = z11;
        this.f95754c = z12;
    }
}
