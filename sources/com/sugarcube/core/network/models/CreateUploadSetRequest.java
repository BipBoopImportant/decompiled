package com.sugarcube.core.network.models;

import YH.C16877v;
import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/sugarcube/core/network/models/CreateUploadSetRequest;", "", "urls", "", "Lcom/sugarcube/core/network/models/UploadURL;", "clientIdentifier", "", "resumable", "", "properties", "Lcom/sugarcube/core/network/models/UploadProperties;", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLcom/sugarcube/core/network/models/UploadProperties;)V", "getUrls", "()Ljava/util/List;", "getClientIdentifier", "()Ljava/lang/String;", "getResumable", "()Z", "getProperties", "()Lcom/sugarcube/core/network/models/UploadProperties;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class CreateUploadSetRequest {
    private final String clientIdentifier;
    private final UploadProperties properties;
    private final boolean resumable;
    private final List<UploadURL> urls;

    public CreateUploadSetRequest() {
        this((List) null, (String) null, false, (UploadProperties) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CreateUploadSetRequest copy$default(CreateUploadSetRequest createUploadSetRequest, List<UploadURL> list, String str, boolean z10, UploadProperties uploadProperties, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = createUploadSetRequest.urls;
        }
        if ((i10 & 2) != 0) {
            str = createUploadSetRequest.clientIdentifier;
        }
        if ((i10 & 4) != 0) {
            z10 = createUploadSetRequest.resumable;
        }
        if ((i10 & 8) != 0) {
            uploadProperties = createUploadSetRequest.properties;
        }
        return createUploadSetRequest.copy(list, str, z10, uploadProperties);
    }

    public final List<UploadURL> component1() {
        return this.urls;
    }

    public final String component2() {
        return this.clientIdentifier;
    }

    public final boolean component3() {
        return this.resumable;
    }

    public final UploadProperties component4() {
        return this.properties;
    }

    public final CreateUploadSetRequest copy(List<UploadURL> list, String str, boolean z10, UploadProperties uploadProperties) {
        C17542s.j(list, "urls");
        return new CreateUploadSetRequest(list, str, z10, uploadProperties);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateUploadSetRequest)) {
            return false;
        }
        CreateUploadSetRequest createUploadSetRequest = (CreateUploadSetRequest) obj;
        return C17542s.e(this.urls, createUploadSetRequest.urls) && C17542s.e(this.clientIdentifier, createUploadSetRequest.clientIdentifier) && this.resumable == createUploadSetRequest.resumable && C17542s.e(this.properties, createUploadSetRequest.properties);
    }

    public final String getClientIdentifier() {
        return this.clientIdentifier;
    }

    public final UploadProperties getProperties() {
        return this.properties;
    }

    public final boolean getResumable() {
        return this.resumable;
    }

    public final List<UploadURL> getUrls() {
        return this.urls;
    }

    public int hashCode() {
        int hashCode = this.urls.hashCode() * 31;
        String str = this.clientIdentifier;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.resumable)) * 31;
        UploadProperties uploadProperties = this.properties;
        if (uploadProperties != null) {
            i10 = uploadProperties.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        List<UploadURL> list = this.urls;
        String str = this.clientIdentifier;
        boolean z10 = this.resumable;
        UploadProperties uploadProperties = this.properties;
        return "CreateUploadSetRequest(urls=" + list + ", clientIdentifier=" + str + ", resumable=" + z10 + ", properties=" + uploadProperties + ")";
    }

    public CreateUploadSetRequest(List<UploadURL> list, String str, boolean z10, UploadProperties uploadProperties) {
        C17542s.j(list, "urls");
        this.urls = list;
        this.clientIdentifier = str;
        this.resumable = z10;
        this.properties = uploadProperties;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreateUploadSetRequest(List list, String str, boolean z10, UploadProperties uploadProperties, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C16877v.n() : list, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : uploadProperties);
    }
}
