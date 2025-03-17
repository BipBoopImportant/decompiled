package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import XH.C16814e;
import fK.C17247E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import jK.C17458i0;
import jK.J0;
import jK.N;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoCheckoutResponseDataModel.$serializer", "LjK/N;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoCheckoutResponseDataModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoCheckoutResponseDataModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoCheckoutResponseDataModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class ScanAndGoCheckoutResponseDataModel$$serializer implements N<ScanAndGoCheckoutResponseDataModel> {
    public static final ScanAndGoCheckoutResponseDataModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ScanAndGoCheckoutResponseDataModel$$serializer scanAndGoCheckoutResponseDataModel$$serializer = new ScanAndGoCheckoutResponseDataModel$$serializer();
        INSTANCE = scanAndGoCheckoutResponseDataModel$$serializer;
        J0 j02 = new J0("com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoCheckoutResponseDataModel", scanAndGoCheckoutResponseDataModel$$serializer, 5);
        j02.p("orderId", false);
        j02.p("timeStamp", false);
        j02.p("checkoutCard", false);
        j02.p("summaryCard", false);
        j02.p("salesOrder", false);
        descriptor = j02;
    }

    private ScanAndGoCheckoutResponseDataModel$$serializer() {
    }

    /* renamed from: b */
    public final ScanAndGoCheckoutResponseDataModel deserialize(Decoder decoder) {
        CheckoutSalesOrderDataModel checkoutSalesOrderDataModel;
        CheckoutSummaryCardDataModel checkoutSummaryCardDataModel;
        CheckoutCardDataModel checkoutCardDataModel;
        Long l10;
        String str;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        String str2 = null;
        if (b10.q()) {
            str = (String) b10.A(serialDescriptor, 0, Y0.f144077a, null);
            checkoutSummaryCardDataModel = (CheckoutSummaryCardDataModel) b10.A(serialDescriptor, 3, CheckoutSummaryCardDataModel$$serializer.INSTANCE, null);
            checkoutSalesOrderDataModel = (CheckoutSalesOrderDataModel) b10.A(serialDescriptor, 4, CheckoutSalesOrderDataModel$$serializer.INSTANCE, null);
            checkoutCardDataModel = (CheckoutCardDataModel) b10.A(serialDescriptor, 2, CheckoutCardDataModel$$serializer.INSTANCE, null);
            l10 = (Long) b10.A(serialDescriptor, 1, C17458i0.f144113a, null);
            i10 = 31;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Long l11 = null;
            CheckoutCardDataModel checkoutCardDataModel2 = null;
            CheckoutSummaryCardDataModel checkoutSummaryCardDataModel2 = null;
            CheckoutSalesOrderDataModel checkoutSalesOrderDataModel2 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    str2 = (String) b10.A(serialDescriptor, 0, Y0.f144077a, str2);
                    i11 |= 1;
                } else if (p10 == 1) {
                    l11 = (Long) b10.A(serialDescriptor, 1, C17458i0.f144113a, l11);
                    i11 |= 2;
                } else if (p10 == 2) {
                    checkoutCardDataModel2 = (CheckoutCardDataModel) b10.A(serialDescriptor, 2, CheckoutCardDataModel$$serializer.INSTANCE, checkoutCardDataModel2);
                    i11 |= 4;
                } else if (p10 == 3) {
                    checkoutSummaryCardDataModel2 = (CheckoutSummaryCardDataModel) b10.A(serialDescriptor, 3, CheckoutSummaryCardDataModel$$serializer.INSTANCE, checkoutSummaryCardDataModel2);
                    i11 |= 8;
                } else if (p10 == 4) {
                    checkoutSalesOrderDataModel2 = (CheckoutSalesOrderDataModel) b10.A(serialDescriptor, 4, CheckoutSalesOrderDataModel$$serializer.INSTANCE, checkoutSalesOrderDataModel2);
                    i11 |= 16;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            str = str2;
            l10 = l11;
            checkoutCardDataModel = checkoutCardDataModel2;
            checkoutSummaryCardDataModel = checkoutSummaryCardDataModel2;
            checkoutSalesOrderDataModel = checkoutSalesOrderDataModel2;
        }
        b10.c(serialDescriptor);
        return new ScanAndGoCheckoutResponseDataModel(i10, str, l10, checkoutCardDataModel, checkoutSummaryCardDataModel, checkoutSalesOrderDataModel, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, ScanAndGoCheckoutResponseDataModel scanAndGoCheckoutResponseDataModel) {
        C17542s.j(encoder, "encoder");
        C17542s.j(scanAndGoCheckoutResponseDataModel, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        ScanAndGoCheckoutResponseDataModel.f(scanAndGoCheckoutResponseDataModel, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{C17294a.u(Y0.f144077a), C17294a.u(C17458i0.f144113a), C17294a.u(CheckoutCardDataModel$$serializer.INSTANCE), C17294a.u(CheckoutSummaryCardDataModel$$serializer.INSTANCE), C17294a.u(CheckoutSalesOrderDataModel$$serializer.INSTANCE)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
