package com.ikea.kompassmap.model.store.map;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ikea/kompassmap/model/store/map/KompassMapOptions;", "", "storeNo", "", "ruCode", "languageCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStoreNo", "()Ljava/lang/String;", "getRuCode", "getLanguageCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KompassMapOptions {
    public static final int $stable = 0;
    private final String languageCode;
    private final String ruCode;
    private final String storeNo;

    public KompassMapOptions(String str, String str2, String str3) {
        C17542s.j(str, "storeNo");
        C17542s.j(str2, "ruCode");
        C17542s.j(str3, "languageCode");
        this.storeNo = str;
        this.ruCode = str2;
        this.languageCode = str3;
    }

    public static /* synthetic */ KompassMapOptions copy$default(KompassMapOptions kompassMapOptions, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = kompassMapOptions.storeNo;
        }
        if ((i10 & 2) != 0) {
            str2 = kompassMapOptions.ruCode;
        }
        if ((i10 & 4) != 0) {
            str3 = kompassMapOptions.languageCode;
        }
        return kompassMapOptions.copy(str, str2, str3);
    }

    public final String component1() {
        return this.storeNo;
    }

    public final String component2() {
        return this.ruCode;
    }

    public final String component3() {
        return this.languageCode;
    }

    public final KompassMapOptions copy(String str, String str2, String str3) {
        C17542s.j(str, "storeNo");
        C17542s.j(str2, "ruCode");
        C17542s.j(str3, "languageCode");
        return new KompassMapOptions(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KompassMapOptions)) {
            return false;
        }
        KompassMapOptions kompassMapOptions = (KompassMapOptions) obj;
        return C17542s.e(this.storeNo, kompassMapOptions.storeNo) && C17542s.e(this.ruCode, kompassMapOptions.ruCode) && C17542s.e(this.languageCode, kompassMapOptions.languageCode);
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final String getRuCode() {
        return this.ruCode;
    }

    public final String getStoreNo() {
        return this.storeNo;
    }

    public int hashCode() {
        return (((this.storeNo.hashCode() * 31) + this.ruCode.hashCode()) * 31) + this.languageCode.hashCode();
    }

    public String toString() {
        return "KompassMapOptions(storeNo=" + this.storeNo + ", ruCode=" + this.ruCode + ", languageCode=" + this.languageCode + ')';
    }
}
