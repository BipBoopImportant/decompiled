package com.afterpay.android.cashapp;

import HJ.C15838d;
import HJ.C15854t;
import XH.C16814e;
import XH.x;
import XH.y;
import android.util.Base64;
import fK.p;
import fK.z;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17546w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mK.C17611d;
import uI.C18068q;

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0012\b\b\u0018\u0000 +2\u00020\u0001:\u0002,+BC\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 \"\u0004\b!\u0010\"R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010'R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b(\u0010$\u001a\u0004\b#\u0010\u0017\"\u0004\b)\u0010'R\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010$\u001a\u0004\b(\u0010\u0017\"\u0004\b*\u0010'¨\u0006-"}, d2 = {"Lcom/afterpay/android/cashapp/AfterpayCashAppJwt;", "", "", "seen1", "Lcom/afterpay/android/cashapp/AfterpayCashAppAmount;", "amount", "", "token", "externalMerchantId", "redirectUrl", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/afterpay/android/cashapp/AfterpayCashAppAmount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/afterpay/android/cashapp/AfterpayCashAppJwt;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/afterpay/android/cashapp/AfterpayCashAppAmount;", "()Lcom/afterpay/android/cashapp/AfterpayCashAppAmount;", "setAmount", "(Lcom/afterpay/android/cashapp/AfterpayCashAppAmount;)V", "b", "Ljava/lang/String;", "getToken", "setToken", "(Ljava/lang/String;)V", "c", "setExternalMerchantId", "setRedirectUrl", "Companion", "$serializer", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AfterpayCashAppJwt {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private AfterpayCashAppAmount f45968a;

    /* renamed from: b  reason: collision with root package name */
    private String f45969b;

    /* renamed from: c  reason: collision with root package name */
    private String f45970c;

    /* renamed from: d  reason: collision with root package name */
    private String f45971d;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\rHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/afterpay/android/cashapp/AfterpayCashAppJwt$Companion;", "", "<init>", "()V", "", "strEncoded", "b", "(Ljava/lang/String;)Ljava/lang/String;", "jwt", "LXH/x;", "Lcom/afterpay/android/cashapp/AfterpayCashAppJwt;", "a", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String b(String str) {
            byte[] decode = Base64.decode(str, 8);
            C17542s.i(decode, "decode(strEncoded, Base64.URL_SAFE)");
            return new String(decode, C15838d.f135279b);
        }

        public final Object a(String str) {
            C17542s.j(str, "jwt");
            try {
                x.a aVar = x.f139812b;
                String b10 = b(((String[]) C15854t.Y0(str, new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]))[1]);
                C17514c.a aVar2 = C17514c.f144280d;
                C17611d a10 = aVar2.a();
                C18068q l10 = P.l(AfterpayCashAppJwt.class);
                C17546w.a("kotlinx.serialization.serializer.withModule");
                return x.b((AfterpayCashAppJwt) aVar2.c(z.d(a10, l10), b10));
            } catch (Throwable th2) {
                x.a aVar3 = x.f139812b;
                return x.b(y.a(th2));
            }
        }

        public final KSerializer<AfterpayCashAppJwt> serializer() {
            return AfterpayCashAppJwt$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @C16814e
    public /* synthetic */ AfterpayCashAppJwt(int i10, AfterpayCashAppAmount afterpayCashAppAmount, String str, String str2, String str3, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, AfterpayCashAppJwt$$serializer.INSTANCE.getDescriptor());
        }
        this.f45968a = afterpayCashAppAmount;
        this.f45969b = str;
        this.f45970c = str2;
        this.f45971d = str3;
    }

    public static final void d(AfterpayCashAppJwt afterpayCashAppJwt, C17395d dVar, SerialDescriptor serialDescriptor) {
        C17542s.j(afterpayCashAppJwt, "self");
        C17542s.j(dVar, "output");
        C17542s.j(serialDescriptor, "serialDesc");
        dVar.i(serialDescriptor, 0, AfterpayCashAppAmount$$serializer.INSTANCE, afterpayCashAppJwt.f45968a);
        dVar.y(serialDescriptor, 1, afterpayCashAppJwt.f45969b);
        dVar.y(serialDescriptor, 2, afterpayCashAppJwt.f45970c);
        dVar.y(serialDescriptor, 3, afterpayCashAppJwt.f45971d);
    }

    public final AfterpayCashAppAmount a() {
        return this.f45968a;
    }

    public final String b() {
        return this.f45970c;
    }

    public final String c() {
        return this.f45971d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayCashAppJwt)) {
            return false;
        }
        AfterpayCashAppJwt afterpayCashAppJwt = (AfterpayCashAppJwt) obj;
        return C17542s.e(this.f45968a, afterpayCashAppJwt.f45968a) && C17542s.e(this.f45969b, afterpayCashAppJwt.f45969b) && C17542s.e(this.f45970c, afterpayCashAppJwt.f45970c) && C17542s.e(this.f45971d, afterpayCashAppJwt.f45971d);
    }

    public int hashCode() {
        return (((((this.f45968a.hashCode() * 31) + this.f45969b.hashCode()) * 31) + this.f45970c.hashCode()) * 31) + this.f45971d.hashCode();
    }

    public String toString() {
        return "AfterpayCashAppJwt(amount=" + this.f45968a + ", token=" + this.f45969b + ", externalMerchantId=" + this.f45970c + ", redirectUrl=" + this.f45971d + ')';
    }
}
