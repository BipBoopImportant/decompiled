package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/sugarcube/core/network/models/SmartaDebug;", "", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class SmartaDebug {
    private final String message;

    public SmartaDebug(String str) {
        this.message = str;
    }

    public static /* synthetic */ SmartaDebug copy$default(SmartaDebug smartaDebug, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = smartaDebug.message;
        }
        return smartaDebug.copy(str);
    }

    public final String component1() {
        return this.message;
    }

    public final SmartaDebug copy(String str) {
        return new SmartaDebug(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SmartaDebug) && C17542s.e(this.message, ((SmartaDebug) obj).message);
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.message;
        return "SmartaDebug(message=" + str + ")";
    }
}
