package com.ingka.ikea.app.stockinfo.local;

import androidx.annotation.Keep;
import com.ingka.ikea.app.stockinfo.network.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b!\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\"\u0010\u000e¨\u0006#"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/local/Status;", "", "Lcom/ingka/ikea/app/stockinfo/network/d;", "code", "", "stockText", "label", "quantityHtmlText", "timestampText", "<init>", "(Lcom/ingka/ikea/app/stockinfo/network/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/ingka/ikea/app/stockinfo/network/d;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Lcom/ingka/ikea/app/stockinfo/network/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ingka/ikea/app/stockinfo/local/Status;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ingka/ikea/app/stockinfo/network/d;", "getCode", "Ljava/lang/String;", "getStockText", "getLabel", "getQuantityHtmlText", "getTimestampText", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Keep
public final class Status {
    private final d code;
    private final String label;
    private final String quantityHtmlText;
    private final String stockText;
    private final String timestampText;

    public Status(d dVar, String str, String str2, String str3, String str4) {
        C17542s.j(dVar, "code");
        C17542s.j(str, "stockText");
        C17542s.j(str2, "label");
        C17542s.j(str3, "quantityHtmlText");
        C17542s.j(str4, "timestampText");
        this.code = dVar;
        this.stockText = str;
        this.label = str2;
        this.quantityHtmlText = str3;
        this.timestampText = str4;
    }

    public static /* synthetic */ Status copy$default(Status status, d dVar, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = status.code;
        }
        if ((i10 & 2) != 0) {
            str = status.stockText;
        }
        String str5 = str;
        if ((i10 & 4) != 0) {
            str2 = status.label;
        }
        String str6 = str2;
        if ((i10 & 8) != 0) {
            str3 = status.quantityHtmlText;
        }
        String str7 = str3;
        if ((i10 & 16) != 0) {
            str4 = status.timestampText;
        }
        return status.copy(dVar, str5, str6, str7, str4);
    }

    public final d component1() {
        return this.code;
    }

    public final String component2() {
        return this.stockText;
    }

    public final String component3() {
        return this.label;
    }

    public final String component4() {
        return this.quantityHtmlText;
    }

    public final String component5() {
        return this.timestampText;
    }

    public final Status copy(d dVar, String str, String str2, String str3, String str4) {
        C17542s.j(dVar, "code");
        C17542s.j(str, "stockText");
        C17542s.j(str2, "label");
        C17542s.j(str3, "quantityHtmlText");
        C17542s.j(str4, "timestampText");
        return new Status(dVar, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.code == status.code && C17542s.e(this.stockText, status.stockText) && C17542s.e(this.label, status.label) && C17542s.e(this.quantityHtmlText, status.quantityHtmlText) && C17542s.e(this.timestampText, status.timestampText);
    }

    public final d getCode() {
        return this.code;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getQuantityHtmlText() {
        return this.quantityHtmlText;
    }

    public final String getStockText() {
        return this.stockText;
    }

    public final String getTimestampText() {
        return this.timestampText;
    }

    public int hashCode() {
        return (((((((this.code.hashCode() * 31) + this.stockText.hashCode()) * 31) + this.label.hashCode()) * 31) + this.quantityHtmlText.hashCode()) * 31) + this.timestampText.hashCode();
    }

    public String toString() {
        d dVar = this.code;
        String str = this.stockText;
        String str2 = this.label;
        String str3 = this.quantityHtmlText;
        String str4 = this.timestampText;
        return "Status(code=" + dVar + ", stockText=" + str + ", label=" + str2 + ", quantityHtmlText=" + str3 + ", timestampText=" + str4 + ")";
    }
}
