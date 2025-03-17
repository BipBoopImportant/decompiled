package com.sugarcube.core.network.models;

import YH.C16877v;
import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ*\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/sugarcube/core/network/models/UpdateUploadSetRequest;", "", "urls", "", "Lcom/sugarcube/core/network/models/UploadURL;", "user", "", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "getUrls", "()Ljava/util/List;", "getUser", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/sugarcube/core/network/models/UpdateUploadSetRequest;", "equals", "", "other", "hashCode", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class UpdateUploadSetRequest {
    private final List<UploadURL> urls;
    private final Integer user;

    public UpdateUploadSetRequest() {
        this((List) null, (Integer) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UpdateUploadSetRequest copy$default(UpdateUploadSetRequest updateUploadSetRequest, List<UploadURL> list, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = updateUploadSetRequest.urls;
        }
        if ((i10 & 2) != 0) {
            num = updateUploadSetRequest.user;
        }
        return updateUploadSetRequest.copy(list, num);
    }

    public final List<UploadURL> component1() {
        return this.urls;
    }

    public final Integer component2() {
        return this.user;
    }

    public final UpdateUploadSetRequest copy(List<UploadURL> list, Integer num) {
        C17542s.j(list, "urls");
        return new UpdateUploadSetRequest(list, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateUploadSetRequest)) {
            return false;
        }
        UpdateUploadSetRequest updateUploadSetRequest = (UpdateUploadSetRequest) obj;
        return C17542s.e(this.urls, updateUploadSetRequest.urls) && C17542s.e(this.user, updateUploadSetRequest.user);
    }

    public final List<UploadURL> getUrls() {
        return this.urls;
    }

    public final Integer getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode = this.urls.hashCode() * 31;
        Integer num = this.user;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        List<UploadURL> list = this.urls;
        Integer num = this.user;
        return "UpdateUploadSetRequest(urls=" + list + ", user=" + num + ")";
    }

    public UpdateUploadSetRequest(List<UploadURL> list, Integer num) {
        C17542s.j(list, "urls");
        this.urls = list;
        this.user = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdateUploadSetRequest(List list, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C16877v.n() : list, (i10 & 2) != 0 ? null : num);
    }
}
