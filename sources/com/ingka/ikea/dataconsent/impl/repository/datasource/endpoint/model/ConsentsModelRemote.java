package com.ingka.ikea.dataconsent.impl.repository.datasource.endpoint.model;

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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 *2\u00020\u0001:\u0002+\u0014B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u0017R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010!\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsModelRemote;", "", "", "deviceId", "customerRef", "Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsRemote;", "consents", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsRemote;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsModelRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeviceId", "getDeviceId$annotations", "()V", "b", "getCustomerRef", "getCustomerRef$annotations", "c", "Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsRemote;", "getConsents", "()Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsRemote;", "getConsents$annotations", "Companion", "$serializer", "dataconsent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConsentsModelRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95459a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95460b;

    /* renamed from: c  reason: collision with root package name */
    private final ConsentsRemote f95461c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsModelRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsModelRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "dataconsent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ConsentsModelRemote> serializer() {
            return ConsentsModelRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ConsentsModelRemote(int i10, String str, String str2, ConsentsRemote consentsRemote, T0 t02) {
        if (5 != (i10 & 5)) {
            E0.b(i10, 5, ConsentsModelRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95459a = str;
        if ((i10 & 2) == 0) {
            this.f95460b = null;
        } else {
            this.f95460b = str2;
        }
        this.f95461c = consentsRemote;
    }

    public static final /* synthetic */ void a(ConsentsModelRemote consentsModelRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, consentsModelRemote.f95459a);
        if (dVar.z(serialDescriptor, 1) || consentsModelRemote.f95460b != null) {
            dVar.B(serialDescriptor, 1, Y0.f144077a, consentsModelRemote.f95460b);
        }
        dVar.i(serialDescriptor, 2, ConsentsRemote$$serializer.INSTANCE, consentsModelRemote.f95461c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentsModelRemote)) {
            return false;
        }
        ConsentsModelRemote consentsModelRemote = (ConsentsModelRemote) obj;
        return C17542s.e(this.f95459a, consentsModelRemote.f95459a) && C17542s.e(this.f95460b, consentsModelRemote.f95460b) && C17542s.e(this.f95461c, consentsModelRemote.f95461c);
    }

    public int hashCode() {
        int hashCode = this.f95459a.hashCode() * 31;
        String str = this.f95460b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f95461c.hashCode();
    }

    public String toString() {
        String str = this.f95459a;
        String str2 = this.f95460b;
        ConsentsRemote consentsRemote = this.f95461c;
        return "ConsentsModelRemote(deviceId=" + str + ", customerRef=" + str2 + ", consents=" + consentsRemote + ")";
    }

    public ConsentsModelRemote(String str, String str2, ConsentsRemote consentsRemote) {
        C17542s.j(str, "deviceId");
        C17542s.j(consentsRemote, "consents");
        this.f95459a = str;
        this.f95460b = str2;
        this.f95461c = consentsRemote;
    }
}
