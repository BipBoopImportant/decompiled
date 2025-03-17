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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b.\b\b\u0018\u0000 Q2\u00020\u0001:\u0002R\u001eBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B«\u0001\b\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J(\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bHÁ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010!R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010(\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010!R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010(\u0012\u0004\b1\u0010+\u001a\u0004\b0\u0010!R \u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010(\u0012\u0004\b4\u0010+\u001a\u0004\b3\u0010!R \u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010(\u0012\u0004\b7\u0010+\u001a\u0004\b6\u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010(\u0012\u0004\b:\u0010+\u001a\u0004\b9\u0010!R \u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u0010(\u0012\u0004\b=\u0010+\u001a\u0004\b<\u0010!R \u0010\n\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b>\u0010(\u0012\u0004\b@\u0010+\u001a\u0004\b?\u0010!R \u0010\u000b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bA\u0010(\u0012\u0004\bC\u0010+\u001a\u0004\bB\u0010!R \u0010\f\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\bD\u0010(\u0012\u0004\bF\u0010+\u001a\u0004\bE\u0010!R \u0010\u000e\u001a\u00020\r8\u0006X\u0004¢\u0006\u0012\n\u0004\bG\u0010H\u0012\u0004\bK\u0010+\u001a\u0004\bI\u0010JR \u0010\u0010\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\bL\u0010M\u0012\u0004\bP\u0010+\u001a\u0004\bN\u0010O¨\u0006S"}, d2 = {"Lcom/ingka/ikea/episod/datalayer/network/models/EpisodEventPayload;", "", "", "schemaVersion", "clientId", "sessionId", "marketCode", "languageCode", "timestamp", "eventName", "eventLocation", "eventOrigin", "eventOriginTeam", "Lcom/ingka/ikea/episod/datalayer/network/models/EventDetails;", "eventDetails", "Lcom/ingka/ikea/episod/datalayer/network/models/ClientDetails;", "clientDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/episod/datalayer/network/models/EventDetails;Lcom/ingka/ikea/episod/datalayer/network/models/ClientDetails;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/episod/datalayer/network/models/EventDetails;Lcom/ingka/ikea/episod/datalayer/network/models/ClientDetails;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/episod/datalayer/network/models/EpisodEventPayload;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSchemaVersion", "getSchemaVersion$annotations", "()V", "b", "getClientId", "getClientId$annotations", "c", "getSessionId", "getSessionId$annotations", "d", "getMarketCode", "getMarketCode$annotations", "e", "getLanguageCode", "getLanguageCode$annotations", "f", "getTimestamp", "getTimestamp$annotations", "g", "getEventName", "getEventName$annotations", "h", "getEventLocation", "getEventLocation$annotations", "i", "getEventOrigin", "getEventOrigin$annotations", "j", "getEventOriginTeam", "getEventOriginTeam$annotations", "k", "Lcom/ingka/ikea/episod/datalayer/network/models/EventDetails;", "getEventDetails", "()Lcom/ingka/ikea/episod/datalayer/network/models/EventDetails;", "getEventDetails$annotations", "l", "Lcom/ingka/ikea/episod/datalayer/network/models/ClientDetails;", "getClientDetails", "()Lcom/ingka/ikea/episod/datalayer/network/models/ClientDetails;", "getClientDetails$annotations", "Companion", "$serializer", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EpisodEventPayload {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95755a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95756b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95757c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95758d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95759e;

    /* renamed from: f  reason: collision with root package name */
    private final String f95760f;

    /* renamed from: g  reason: collision with root package name */
    private final String f95761g;

    /* renamed from: h  reason: collision with root package name */
    private final String f95762h;

    /* renamed from: i  reason: collision with root package name */
    private final String f95763i;

    /* renamed from: j  reason: collision with root package name */
    private final String f95764j;

    /* renamed from: k  reason: collision with root package name */
    private final EventDetails f95765k;

    /* renamed from: l  reason: collision with root package name */
    private final ClientDetails f95766l;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/episod/datalayer/network/models/EpisodEventPayload$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/episod/datalayer/network/models/EpisodEventPayload;", "serializer", "()Lkotlinx/serialization/KSerializer;", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EpisodEventPayload> serializer() {
            return EpisodEventPayload$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ EpisodEventPayload(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, EventDetails eventDetails, ClientDetails clientDetails, T0 t02) {
        if (4063 != (i10 & 4063)) {
            E0.b(i10, 4063, EpisodEventPayload$$serializer.INSTANCE.getDescriptor());
        }
        this.f95755a = str;
        this.f95756b = str2;
        this.f95757c = str3;
        this.f95758d = str4;
        this.f95759e = str5;
        if ((i10 & 32) == 0) {
            this.f95760f = null;
        } else {
            this.f95760f = str6;
        }
        this.f95761g = str7;
        this.f95762h = str8;
        this.f95763i = str9;
        this.f95764j = str10;
        this.f95765k = eventDetails;
        this.f95766l = clientDetails;
    }

    public static final /* synthetic */ void a(EpisodEventPayload episodEventPayload, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, episodEventPayload.f95755a);
        dVar.y(serialDescriptor, 1, episodEventPayload.f95756b);
        dVar.y(serialDescriptor, 2, episodEventPayload.f95757c);
        dVar.y(serialDescriptor, 3, episodEventPayload.f95758d);
        dVar.y(serialDescriptor, 4, episodEventPayload.f95759e);
        if (dVar.z(serialDescriptor, 5) || episodEventPayload.f95760f != null) {
            dVar.B(serialDescriptor, 5, Y0.f144077a, episodEventPayload.f95760f);
        }
        dVar.y(serialDescriptor, 6, episodEventPayload.f95761g);
        dVar.y(serialDescriptor, 7, episodEventPayload.f95762h);
        dVar.y(serialDescriptor, 8, episodEventPayload.f95763i);
        dVar.y(serialDescriptor, 9, episodEventPayload.f95764j);
        dVar.i(serialDescriptor, 10, EventDetails$$serializer.INSTANCE, episodEventPayload.f95765k);
        dVar.i(serialDescriptor, 11, ClientDetails$$serializer.INSTANCE, episodEventPayload.f95766l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpisodEventPayload)) {
            return false;
        }
        EpisodEventPayload episodEventPayload = (EpisodEventPayload) obj;
        return C17542s.e(this.f95755a, episodEventPayload.f95755a) && C17542s.e(this.f95756b, episodEventPayload.f95756b) && C17542s.e(this.f95757c, episodEventPayload.f95757c) && C17542s.e(this.f95758d, episodEventPayload.f95758d) && C17542s.e(this.f95759e, episodEventPayload.f95759e) && C17542s.e(this.f95760f, episodEventPayload.f95760f) && C17542s.e(this.f95761g, episodEventPayload.f95761g) && C17542s.e(this.f95762h, episodEventPayload.f95762h) && C17542s.e(this.f95763i, episodEventPayload.f95763i) && C17542s.e(this.f95764j, episodEventPayload.f95764j) && C17542s.e(this.f95765k, episodEventPayload.f95765k) && C17542s.e(this.f95766l, episodEventPayload.f95766l);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f95755a.hashCode() * 31) + this.f95756b.hashCode()) * 31) + this.f95757c.hashCode()) * 31) + this.f95758d.hashCode()) * 31) + this.f95759e.hashCode()) * 31;
        String str = this.f95760f;
        return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f95761g.hashCode()) * 31) + this.f95762h.hashCode()) * 31) + this.f95763i.hashCode()) * 31) + this.f95764j.hashCode()) * 31) + this.f95765k.hashCode()) * 31) + this.f95766l.hashCode();
    }

    public String toString() {
        String str = this.f95755a;
        String str2 = this.f95756b;
        String str3 = this.f95757c;
        String str4 = this.f95758d;
        String str5 = this.f95759e;
        String str6 = this.f95760f;
        String str7 = this.f95761g;
        String str8 = this.f95762h;
        String str9 = this.f95763i;
        String str10 = this.f95764j;
        EventDetails eventDetails = this.f95765k;
        ClientDetails clientDetails = this.f95766l;
        return "EpisodEventPayload(schemaVersion=" + str + ", clientId=" + str2 + ", sessionId=" + str3 + ", marketCode=" + str4 + ", languageCode=" + str5 + ", timestamp=" + str6 + ", eventName=" + str7 + ", eventLocation=" + str8 + ", eventOrigin=" + str9 + ", eventOriginTeam=" + str10 + ", eventDetails=" + eventDetails + ", clientDetails=" + clientDetails + ")";
    }

    public EpisodEventPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, EventDetails eventDetails, ClientDetails clientDetails) {
        C17542s.j(str, "schemaVersion");
        C17542s.j(str2, "clientId");
        C17542s.j(str3, "sessionId");
        C17542s.j(str4, "marketCode");
        C17542s.j(str5, "languageCode");
        C17542s.j(str7, "eventName");
        C17542s.j(str8, "eventLocation");
        C17542s.j(str9, "eventOrigin");
        C17542s.j(str10, "eventOriginTeam");
        C17542s.j(eventDetails, "eventDetails");
        C17542s.j(clientDetails, "clientDetails");
        this.f95755a = str;
        this.f95756b = str2;
        this.f95757c = str3;
        this.f95758d = str4;
        this.f95759e = str5;
        this.f95760f = str6;
        this.f95761g = str7;
        this.f95762h = str8;
        this.f95763i = str9;
        this.f95764j = str10;
        this.f95765k = eventDetails;
        this.f95766l = clientDetails;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EpisodEventPayload(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, EventDetails eventDetails, ClientDetails clientDetails, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i10 & 32) != 0 ? null : str6, str7, str8, str9, str10, eventDetails, clientDetails);
    }
}
