package com.ingka.ikea.shareprovider.impl.network;

import androidx.annotation.Keep;
import fK.p;
import jK.E0;
import jK.T0;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u001c\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0015¨\u0006'"}, d2 = {"Lcom/ingka/ikea/shareprovider/impl/network/DynamicLinkResponse;", "", "", "shortLink", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$shareprovider_implementation_release", "(Lcom/ingka/ikea/shareprovider/impl/network/DynamicLinkResponse;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "convertToLocal", "()Ljava/lang/String;", "component1", "copy", "(Ljava/lang/String;)Lcom/ingka/ikea/shareprovider/impl/network/DynamicLinkResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getShortLink", "getShortLink$annotations", "()V", "Companion", "$serializer", "a", "shareprovider-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class DynamicLinkResponse {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final String shortLink;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/shareprovider/impl/network/DynamicLinkResponse$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/shareprovider/impl/network/DynamicLinkResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "shareprovider-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<DynamicLinkResponse> serializer() {
            return DynamicLinkResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DynamicLinkResponse(int i10, String str, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, DynamicLinkResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.shortLink = str;
    }

    public static /* synthetic */ DynamicLinkResponse copy$default(DynamicLinkResponse dynamicLinkResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dynamicLinkResponse.shortLink;
        }
        return dynamicLinkResponse.copy(str);
    }

    public static /* synthetic */ void getShortLink$annotations() {
    }

    public final String component1() {
        return this.shortLink;
    }

    public final String convertToLocal() {
        String str = this.shortLink;
        if (str != null) {
            return str;
        }
        throw new IOException("Missing short link in response");
    }

    public final DynamicLinkResponse copy(String str) {
        return new DynamicLinkResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DynamicLinkResponse) && C17542s.e(this.shortLink, ((DynamicLinkResponse) obj).shortLink);
    }

    public final String getShortLink() {
        return this.shortLink;
    }

    public int hashCode() {
        String str = this.shortLink;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.shortLink;
        return "DynamicLinkResponse(shortLink=" + str + ")";
    }

    public DynamicLinkResponse(String str) {
        this.shortLink = str;
    }
}
