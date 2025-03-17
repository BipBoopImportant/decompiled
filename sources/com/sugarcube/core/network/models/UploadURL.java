package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J^\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\t\u0010\u0016R\u001e\u0010\n\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016\"\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/sugarcube/core/network/models/UploadURL;", "", "path", "", "contentType", "contentMd5", "url", "completed", "", "isUploaded", "resumable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;)V", "getPath", "()Ljava/lang/String;", "getContentType", "getContentMd5", "getUrl", "getCompleted", "()Z", "setCompleted", "(Z)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getResumable", "setResumable", "(Ljava/lang/Boolean;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sugarcube/core/network/models/UploadURL;", "equals", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class UploadURL {
    private boolean completed;
    private final String contentMd5;
    private final String contentType;
    private final Boolean isUploaded;
    private final String path;
    private Boolean resumable;
    private final String url;

    public UploadURL(String str, String str2, String str3, String str4, boolean z10, Boolean bool, Boolean bool2) {
        C17542s.j(str, "path");
        this.path = str;
        this.contentType = str2;
        this.contentMd5 = str3;
        this.url = str4;
        this.completed = z10;
        this.isUploaded = bool;
        this.resumable = bool2;
    }

    public static /* synthetic */ UploadURL copy$default(UploadURL uploadURL, String str, String str2, String str3, String str4, boolean z10, Boolean bool, Boolean bool2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = uploadURL.path;
        }
        if ((i10 & 2) != 0) {
            str2 = uploadURL.contentType;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = uploadURL.contentMd5;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = uploadURL.url;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            z10 = uploadURL.completed;
        }
        boolean z11 = z10;
        if ((i10 & 32) != 0) {
            bool = uploadURL.isUploaded;
        }
        Boolean bool3 = bool;
        if ((i10 & 64) != 0) {
            bool2 = uploadURL.resumable;
        }
        return uploadURL.copy(str, str5, str6, str7, z11, bool3, bool2);
    }

    public final String component1() {
        return this.path;
    }

    public final String component2() {
        return this.contentType;
    }

    public final String component3() {
        return this.contentMd5;
    }

    public final String component4() {
        return this.url;
    }

    public final boolean component5() {
        return this.completed;
    }

    public final Boolean component6() {
        return this.isUploaded;
    }

    public final Boolean component7() {
        return this.resumable;
    }

    public final UploadURL copy(String str, String str2, String str3, String str4, boolean z10, Boolean bool, Boolean bool2) {
        C17542s.j(str, "path");
        return new UploadURL(str, str2, str3, str4, z10, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadURL)) {
            return false;
        }
        UploadURL uploadURL = (UploadURL) obj;
        return C17542s.e(this.path, uploadURL.path) && C17542s.e(this.contentType, uploadURL.contentType) && C17542s.e(this.contentMd5, uploadURL.contentMd5) && C17542s.e(this.url, uploadURL.url) && this.completed == uploadURL.completed && C17542s.e(this.isUploaded, uploadURL.isUploaded) && C17542s.e(this.resumable, uploadURL.resumable);
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final String getContentMd5() {
        return this.contentMd5;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getPath() {
        return this.path;
    }

    public final Boolean getResumable() {
        return this.resumable;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.path.hashCode() * 31;
        String str = this.contentType;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contentMd5;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Boolean.hashCode(this.completed)) * 31;
        Boolean bool = this.isUploaded;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.resumable;
        if (bool2 != null) {
            i10 = bool2.hashCode();
        }
        return hashCode5 + i10;
    }

    public final Boolean isUploaded() {
        return this.isUploaded;
    }

    public final void setCompleted(boolean z10) {
        this.completed = z10;
    }

    public final void setResumable(Boolean bool) {
        this.resumable = bool;
    }

    public String toString() {
        String str = this.path;
        String str2 = this.contentType;
        String str3 = this.contentMd5;
        String str4 = this.url;
        boolean z10 = this.completed;
        Boolean bool = this.isUploaded;
        Boolean bool2 = this.resumable;
        return "UploadURL(path=" + str + ", contentType=" + str2 + ", contentMd5=" + str3 + ", url=" + str4 + ", completed=" + z10 + ", isUploaded=" + bool + ", resumable=" + bool2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UploadURL(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12, java.lang.Boolean r13, java.lang.Boolean r14, int r15, kotlin.jvm.internal.DefaultConstructorMarker r16) {
        /*
            r7 = this;
            r0 = r15 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0008
        L_0x0007:
            r0 = r9
        L_0x0008:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x000e
            r2 = r1
            goto L_0x000f
        L_0x000e:
            r2 = r10
        L_0x000f:
            r3 = r15 & 8
            if (r3 == 0) goto L_0x0015
            r3 = r1
            goto L_0x0016
        L_0x0015:
            r3 = r11
        L_0x0016:
            r4 = r15 & 16
            if (r4 == 0) goto L_0x001c
            r4 = 0
            goto L_0x001d
        L_0x001c:
            r4 = r12
        L_0x001d:
            r5 = r15 & 32
            if (r5 == 0) goto L_0x0024
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x0025
        L_0x0024:
            r5 = r13
        L_0x0025:
            r6 = r15 & 64
            if (r6 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r1 = r14
        L_0x002b:
            r9 = r7
            r10 = r8
            r11 = r0
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.UploadURL.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Boolean, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
