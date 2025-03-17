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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0016¨\u0006%"}, d2 = {"Lcom/afterpay/android/cashapp/AfterpayCashAppValidationRequest;", "", "", "jwt", "externalCustomerId", "externalGrantId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/afterpay/android/cashapp/AfterpayCashAppValidationRequest;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getJwt", "b", "getExternalCustomerId", "c", "getExternalGrantId", "Companion", "$serializer", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AfterpayCashAppValidationRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f45975a;

    /* renamed from: b  reason: collision with root package name */
    private final String f45976b;

    /* renamed from: c  reason: collision with root package name */
    private final String f45977c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/afterpay/android/cashapp/AfterpayCashAppValidationRequest$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/afterpay/android/cashapp/AfterpayCashAppValidationRequest;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AfterpayCashAppValidationRequest> serializer() {
            return AfterpayCashAppValidationRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C16814e
    public /* synthetic */ AfterpayCashAppValidationRequest(int i10, String str, String str2, String str3, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, AfterpayCashAppValidationRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.f45975a = str;
        this.f45976b = str2;
        this.f45977c = str3;
    }

    public static final void a(AfterpayCashAppValidationRequest afterpayCashAppValidationRequest, C17395d dVar, SerialDescriptor serialDescriptor) {
        C17542s.j(afterpayCashAppValidationRequest, "self");
        C17542s.j(dVar, "output");
        C17542s.j(serialDescriptor, "serialDesc");
        dVar.y(serialDescriptor, 0, afterpayCashAppValidationRequest.f45975a);
        dVar.y(serialDescriptor, 1, afterpayCashAppValidationRequest.f45976b);
        dVar.y(serialDescriptor, 2, afterpayCashAppValidationRequest.f45977c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayCashAppValidationRequest)) {
            return false;
        }
        AfterpayCashAppValidationRequest afterpayCashAppValidationRequest = (AfterpayCashAppValidationRequest) obj;
        return C17542s.e(this.f45975a, afterpayCashAppValidationRequest.f45975a) && C17542s.e(this.f45976b, afterpayCashAppValidationRequest.f45976b) && C17542s.e(this.f45977c, afterpayCashAppValidationRequest.f45977c);
    }

    public int hashCode() {
        return (((this.f45975a.hashCode() * 31) + this.f45976b.hashCode()) * 31) + this.f45977c.hashCode();
    }

    public String toString() {
        return "AfterpayCashAppValidationRequest(jwt=" + this.f45975a + ", externalCustomerId=" + this.f45976b + ", externalGrantId=" + this.f45977c + ')';
    }

    public AfterpayCashAppValidationRequest(String str, String str2, String str3) {
        C17542s.j(str, "jwt");
        C17542s.j(str2, "externalCustomerId");
        C17542s.j(str3, "externalGrantId");
        this.f45975a = str;
        this.f45976b = str2;
        this.f45977c = str3;
    }
}
