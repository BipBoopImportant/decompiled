package com.sugarcube.app.base.network.models;

import GK.C15776D;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJB\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001f\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/sugarcube/app/base/network/models/UploadFileResult;", "", "", "success", "LGK/D;", "lastApiResponse", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "alreadyUploaded", "<init>", "(ZLGK/D;Ljava/lang/Exception;Z)V", "component1", "()Z", "component2", "()LGK/D;", "component3", "()Ljava/lang/Exception;", "component4", "copy", "(ZLGK/D;Ljava/lang/Exception;Z)Lcom/sugarcube/app/base/network/models/UploadFileResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "LGK/D;", "getLastApiResponse", "Ljava/lang/Exception;", "getException", "getAlreadyUploaded", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UploadFileResult {
    public static final int $stable = 8;
    private final boolean alreadyUploaded;
    private final Exception exception;
    private final C15776D lastApiResponse;
    private final boolean success;

    public UploadFileResult(boolean z10, C15776D d10, Exception exc, boolean z11) {
        this.success = z10;
        this.lastApiResponse = d10;
        this.exception = exc;
        this.alreadyUploaded = z11;
    }

    public static /* synthetic */ UploadFileResult copy$default(UploadFileResult uploadFileResult, boolean z10, C15776D d10, Exception exc, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = uploadFileResult.success;
        }
        if ((i10 & 2) != 0) {
            d10 = uploadFileResult.lastApiResponse;
        }
        if ((i10 & 4) != 0) {
            exc = uploadFileResult.exception;
        }
        if ((i10 & 8) != 0) {
            z11 = uploadFileResult.alreadyUploaded;
        }
        return uploadFileResult.copy(z10, d10, exc, z11);
    }

    public final boolean component1() {
        return this.success;
    }

    public final C15776D component2() {
        return this.lastApiResponse;
    }

    public final Exception component3() {
        return this.exception;
    }

    public final boolean component4() {
        return this.alreadyUploaded;
    }

    public final UploadFileResult copy(boolean z10, C15776D d10, Exception exc, boolean z11) {
        return new UploadFileResult(z10, d10, exc, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadFileResult)) {
            return false;
        }
        UploadFileResult uploadFileResult = (UploadFileResult) obj;
        return this.success == uploadFileResult.success && C17542s.e(this.lastApiResponse, uploadFileResult.lastApiResponse) && C17542s.e(this.exception, uploadFileResult.exception) && this.alreadyUploaded == uploadFileResult.alreadyUploaded;
    }

    public final boolean getAlreadyUploaded() {
        return this.alreadyUploaded;
    }

    public final Exception getException() {
        return this.exception;
    }

    public final C15776D getLastApiResponse() {
        return this.lastApiResponse;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.success) * 31;
        C15776D d10 = this.lastApiResponse;
        int i10 = 0;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Exception exc = this.exception;
        if (exc != null) {
            i10 = exc.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Boolean.hashCode(this.alreadyUploaded);
    }

    public String toString() {
        boolean z10 = this.success;
        C15776D d10 = this.lastApiResponse;
        Exception exc = this.exception;
        boolean z11 = this.alreadyUploaded;
        return "UploadFileResult(success=" + z10 + ", lastApiResponse=" + d10 + ", exception=" + exc + ", alreadyUploaded=" + z11 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UploadFileResult(boolean z10, C15776D d10, Exception exc, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? null : d10, (i10 & 4) != 0 ? null : exc, (i10 & 8) != 0 ? false : z11);
    }
}
