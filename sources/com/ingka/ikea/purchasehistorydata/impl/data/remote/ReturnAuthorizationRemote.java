package com.ingka.ikea.purchasehistorydata.impl.data.remote;

import Gx.b;
import androidx.annotation.Keep;
import fK.p;
import iK.C17395d;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001c¨\u0006/"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/ReturnAuthorizationRemote;", "", "", "approved", "", "callbackUrl", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$purchasehistorydata_implementation_release", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/ReturnAuthorizationRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "LGx/b;", "convertToLocal", "()LGx/b;", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/ReturnAuthorizationRemote;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getApproved", "getApproved$annotations", "()V", "Ljava/lang/String;", "getCallbackUrl", "getCallbackUrl$annotations", "Companion", "$serializer", "a", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReturnAuthorizationRemote {
    public static final int $stable = 0;
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final Boolean approved;
    private final String callbackUrl;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/ReturnAuthorizationRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/ReturnAuthorizationRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ReturnAuthorizationRemote> serializer() {
            return ReturnAuthorizationRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ReturnAuthorizationRemote(int i10, Boolean bool, String str, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, ReturnAuthorizationRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.approved = bool;
        this.callbackUrl = str;
    }

    public static /* synthetic */ ReturnAuthorizationRemote copy$default(ReturnAuthorizationRemote returnAuthorizationRemote, Boolean bool, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = returnAuthorizationRemote.approved;
        }
        if ((i10 & 2) != 0) {
            str = returnAuthorizationRemote.callbackUrl;
        }
        return returnAuthorizationRemote.copy(bool, str);
    }

    public static /* synthetic */ void getApproved$annotations() {
    }

    public static /* synthetic */ void getCallbackUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchasehistorydata_implementation_release(ReturnAuthorizationRemote returnAuthorizationRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, C17457i.f144111a, returnAuthorizationRemote.approved);
        dVar.B(serialDescriptor, 1, Y0.f144077a, returnAuthorizationRemote.callbackUrl);
    }

    public final Boolean component1() {
        return this.approved;
    }

    public final String component2() {
        return this.callbackUrl;
    }

    public final b convertToLocal() {
        Boolean bool = this.approved;
        if (bool == null) {
            return null;
        }
        if (!bool.booleanValue() || this.callbackUrl != null) {
            return new b(this.approved.booleanValue(), this.callbackUrl);
        }
        return null;
    }

    public final ReturnAuthorizationRemote copy(Boolean bool, String str) {
        return new ReturnAuthorizationRemote(bool, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReturnAuthorizationRemote)) {
            return false;
        }
        ReturnAuthorizationRemote returnAuthorizationRemote = (ReturnAuthorizationRemote) obj;
        return C17542s.e(this.approved, returnAuthorizationRemote.approved) && C17542s.e(this.callbackUrl, returnAuthorizationRemote.callbackUrl);
    }

    public final Boolean getApproved() {
        return this.approved;
    }

    public final String getCallbackUrl() {
        return this.callbackUrl;
    }

    public int hashCode() {
        Boolean bool = this.approved;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.callbackUrl;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        Boolean bool = this.approved;
        String str = this.callbackUrl;
        return "ReturnAuthorizationRemote(approved=" + bool + ", callbackUrl=" + str + ")";
    }

    public ReturnAuthorizationRemote(Boolean bool, String str) {
        this.approved = bool;
        this.callbackUrl = str;
    }
}
