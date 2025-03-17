package com.ingka.ikea.episod.datalayer.network.models;

import XH.C16814e;
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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0001\u0018\u0000 +2\u00020\u0001:\u0002,\u0016B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010 R \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u0012\u0004\b$\u0010\u001c\u001a\u0004\b#\u0010\u001aR \u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010\u0018\u0012\u0004\b'\u0010\u001c\u001a\u0004\b&\u0010\u001aR \u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010\u0018\u0012\u0004\b*\u0010\u001c\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lcom/ingka/ikea/episod/datalayer/network/models/ClientDetails;", "", "", "partyUid", "Lcom/ingka/ikea/episod/datalayer/network/models/Consent;", "consent", "userAgent", "deviceBrand", "deviceModel", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/episod/datalayer/network/models/Consent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/ingka/ikea/episod/datalayer/network/models/Consent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/episod/datalayer/network/models/ClientDetails;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getPartyUid", "()Ljava/lang/String;", "getPartyUid$annotations", "()V", "b", "Lcom/ingka/ikea/episod/datalayer/network/models/Consent;", "getConsent", "()Lcom/ingka/ikea/episod/datalayer/network/models/Consent;", "getConsent$annotations", "c", "getUserAgent", "getUserAgent$annotations", "d", "getDeviceBrand", "getDeviceBrand$annotations", "e", "getDeviceModel", "getDeviceModel$annotations", "Companion", "$serializer", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ClientDetails {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95747a;

    /* renamed from: b  reason: collision with root package name */
    private final Consent f95748b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95749c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95750d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95751e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/episod/datalayer/network/models/ClientDetails$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/episod/datalayer/network/models/ClientDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ClientDetails> serializer() {
            return ClientDetails$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ ClientDetails(int i10, String str, Consent consent, String str2, String str3, String str4, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, ClientDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.f95747a = str;
        this.f95748b = consent;
        this.f95749c = str2;
        this.f95750d = str3;
        this.f95751e = str4;
    }

    public static final /* synthetic */ void a(ClientDetails clientDetails, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, Y0.f144077a, clientDetails.f95747a);
        dVar.i(serialDescriptor, 1, Consent$$serializer.INSTANCE, clientDetails.f95748b);
        dVar.y(serialDescriptor, 2, clientDetails.f95749c);
        dVar.y(serialDescriptor, 3, clientDetails.f95750d);
        dVar.y(serialDescriptor, 4, clientDetails.f95751e);
    }

    public ClientDetails(String str, Consent consent, String str2, String str3, String str4) {
        C17542s.j(consent, "consent");
        C17542s.j(str2, "userAgent");
        C17542s.j(str3, "deviceBrand");
        C17542s.j(str4, "deviceModel");
        this.f95747a = str;
        this.f95748b = consent;
        this.f95749c = str2;
        this.f95750d = str3;
        this.f95751e = str4;
    }
}
