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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\b\u0018\u0000 -2\u00020\u0001:\u0002.\u0015B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001e\u0012\u0004\b'\u0010!\u001a\u0004\b&\u0010\u0018R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010!\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsDetailsRemote;", "", "", "type", "display", "description", "", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsDetailsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "b", "getDisplay", "getDisplay$annotations", "c", "getDescription", "getDescription$annotations", "d", "Z", "getStatus", "()Z", "getStatus$annotations", "Companion", "$serializer", "dataconsent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConsentsDetailsRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95455a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95456b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95457c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f95458d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsDetailsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/dataconsent/impl/repository/datasource/endpoint/model/ConsentsDetailsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "dataconsent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ConsentsDetailsRemote> serializer() {
            return ConsentsDetailsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ConsentsDetailsRemote(int i10, String str, String str2, String str3, boolean z10, T0 t02) {
        if (9 != (i10 & 9)) {
            E0.b(i10, 9, ConsentsDetailsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95455a = str;
        if ((i10 & 2) == 0) {
            this.f95456b = null;
        } else {
            this.f95456b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f95457c = null;
        } else {
            this.f95457c = str3;
        }
        this.f95458d = z10;
    }

    public static final /* synthetic */ void a(ConsentsDetailsRemote consentsDetailsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, consentsDetailsRemote.f95455a);
        if (dVar.z(serialDescriptor, 1) || consentsDetailsRemote.f95456b != null) {
            dVar.B(serialDescriptor, 1, Y0.f144077a, consentsDetailsRemote.f95456b);
        }
        if (dVar.z(serialDescriptor, 2) || consentsDetailsRemote.f95457c != null) {
            dVar.B(serialDescriptor, 2, Y0.f144077a, consentsDetailsRemote.f95457c);
        }
        dVar.x(serialDescriptor, 3, consentsDetailsRemote.f95458d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentsDetailsRemote)) {
            return false;
        }
        ConsentsDetailsRemote consentsDetailsRemote = (ConsentsDetailsRemote) obj;
        return C17542s.e(this.f95455a, consentsDetailsRemote.f95455a) && C17542s.e(this.f95456b, consentsDetailsRemote.f95456b) && C17542s.e(this.f95457c, consentsDetailsRemote.f95457c) && this.f95458d == consentsDetailsRemote.f95458d;
    }

    public int hashCode() {
        int hashCode = this.f95455a.hashCode() * 31;
        String str = this.f95456b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95457c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Boolean.hashCode(this.f95458d);
    }

    public String toString() {
        String str = this.f95455a;
        String str2 = this.f95456b;
        String str3 = this.f95457c;
        boolean z10 = this.f95458d;
        return "ConsentsDetailsRemote(type=" + str + ", display=" + str2 + ", description=" + str3 + ", status=" + z10 + ")";
    }

    public ConsentsDetailsRemote(String str, String str2, String str3, boolean z10) {
        C17542s.j(str, "type");
        this.f95455a = str;
        this.f95456b = str2;
        this.f95457c = str3;
        this.f95458d = z10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConsentsDetailsRemote(String str, String str2, String str3, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, z10);
    }
}
