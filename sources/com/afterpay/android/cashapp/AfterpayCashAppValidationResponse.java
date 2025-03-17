package com.afterpay.android.cashapp;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 %2\u00020\u0001:\u0002&%B9\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b!\u0010 R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010 ¨\u0006'"}, d2 = {"Lcom/afterpay/android/cashapp/AfterpayCashAppValidationResponse;", "", "", "seen1", "", "cashAppTag", "status", "callbackBaseUrl", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/afterpay/android/cashapp/AfterpayCashAppValidationResponse;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCashAppTag", "setCashAppTag", "(Ljava/lang/String;)V", "setStatus", "c", "getCallbackBaseUrl", "setCallbackBaseUrl", "Companion", "$serializer", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AfterpayCashAppValidationResponse {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private String f45978a;

    /* renamed from: b  reason: collision with root package name */
    private String f45979b;

    /* renamed from: c  reason: collision with root package name */
    private String f45980c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/afterpay/android/cashapp/AfterpayCashAppValidationResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/afterpay/android/cashapp/AfterpayCashAppValidationResponse;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AfterpayCashAppValidationResponse> serializer() {
            return AfterpayCashAppValidationResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C16814e
    public /* synthetic */ AfterpayCashAppValidationResponse(int i10, String str, String str2, String str3, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, AfterpayCashAppValidationResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.f45978a = str;
        this.f45979b = str2;
        this.f45980c = str3;
    }

    public static final void b(AfterpayCashAppValidationResponse afterpayCashAppValidationResponse, C17395d dVar, SerialDescriptor serialDescriptor) {
        C17542s.j(afterpayCashAppValidationResponse, "self");
        C17542s.j(dVar, "output");
        C17542s.j(serialDescriptor, "serialDesc");
        dVar.y(serialDescriptor, 0, afterpayCashAppValidationResponse.f45978a);
        dVar.y(serialDescriptor, 1, afterpayCashAppValidationResponse.f45979b);
        dVar.y(serialDescriptor, 2, afterpayCashAppValidationResponse.f45980c);
    }

    public final String a() {
        return this.f45979b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayCashAppValidationResponse)) {
            return false;
        }
        AfterpayCashAppValidationResponse afterpayCashAppValidationResponse = (AfterpayCashAppValidationResponse) obj;
        return C17542s.e(this.f45978a, afterpayCashAppValidationResponse.f45978a) && C17542s.e(this.f45979b, afterpayCashAppValidationResponse.f45979b) && C17542s.e(this.f45980c, afterpayCashAppValidationResponse.f45980c);
    }

    public int hashCode() {
        return (((this.f45978a.hashCode() * 31) + this.f45979b.hashCode()) * 31) + this.f45980c.hashCode();
    }

    public String toString() {
        return "AfterpayCashAppValidationResponse(cashAppTag=" + this.f45978a + ", status=" + this.f45979b + ", callbackBaseUrl=" + this.f45980c + ')';
    }
}
