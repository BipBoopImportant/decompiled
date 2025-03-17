package com.ingka.ikea.mcomsettings.impl.network;

import HJ.C15854t;
import com.ingka.ikea.mcomsettings.impl.AvailablePaymentOptionHolder;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 !2\u00020\u0001:\u0002\"\u0015B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0017\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001c\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0017\u0012\u0004\b \u0010\u001b\u001a\u0004\b\u001f\u0010\u0019¨\u0006#"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/AvailablePaymentDisclaimerIconModel;", "", "", "seen0", "", "name", "link", "optionCategory", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/mcomsettings/impl/network/AvailablePaymentDisclaimerIconModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/mcomsettings/impl/AvailablePaymentOptionHolder;", "a", "()Lcom/ingka/ikea/mcomsettings/impl/AvailablePaymentOptionHolder;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getName$annotations", "()V", "getLink", "getLink$annotations", "c", "getOptionCategory", "getOptionCategory$annotations", "Companion", "$serializer", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AvailablePaymentDisclaimerIconModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f96660a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96661b;

    /* renamed from: c  reason: collision with root package name */
    private final String f96662c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/AvailablePaymentDisclaimerIconModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/impl/network/AvailablePaymentDisclaimerIconModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<AvailablePaymentDisclaimerIconModel> serializer() {
            return AvailablePaymentDisclaimerIconModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AvailablePaymentDisclaimerIconModel(int i10, String str, String str2, String str3, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, AvailablePaymentDisclaimerIconModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f96660a = str;
        this.f96661b = str2;
        this.f96662c = str3;
    }

    public static final /* synthetic */ void b(AvailablePaymentDisclaimerIconModel availablePaymentDisclaimerIconModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, availablePaymentDisclaimerIconModel.f96660a);
        dVar.B(serialDescriptor, 1, y02, availablePaymentDisclaimerIconModel.f96661b);
        dVar.B(serialDescriptor, 2, y02, availablePaymentDisclaimerIconModel.f96662c);
    }

    public final AvailablePaymentOptionHolder a() {
        String str;
        String str2;
        String str3 = this.f96660a;
        if (str3 == null || str3.length() == 0 || (str = this.f96661b) == null || str.length() == 0 || (str2 = this.f96662c) == null || str2.length() == 0) {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar : arrayList) {
                if (str4 == null) {
                    String a10 = C11818a.a("We have a null or empty field in the available payment options " + this, (Throwable) null);
                    if (a10 == null) {
                        return null;
                    }
                    str4 = C11820c.a(a10);
                }
                String str6 = str4;
                if (str5 == null) {
                    String name = AvailablePaymentDisclaimerIconModel.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str7 = str5;
                bVar.a(eVar, str7, false, (Throwable) null, str6);
                str4 = str6;
                str5 = str7;
            }
            return null;
        }
        String str8 = this.f96662c;
        if (str8 == null) {
            return null;
        }
        switch (str8.hashCode()) {
            case -2043287165:
                if (!str8.equals("OPENINVOICE")) {
                    return null;
                }
                break;
            case -1741862919:
                if (!str8.equals("WALLET")) {
                    return null;
                }
                break;
            case -78778999:
                if (!str8.equals("CREDITCARD")) {
                    return null;
                }
                break;
            case -48083138:
                if (!str8.equals("ONLINETRANSFER")) {
                    return null;
                }
                break;
            case -33846353:
                if (!str8.equals(CheckoutConstants.PaymentBrands.GOOGLEPAY)) {
                    return null;
                }
                break;
            case -16615908:
                if (!str8.equals("CUSTOMERFINANCE")) {
                    return null;
                }
                break;
            case 582126431:
                if (!str8.equals("PREPAIDCARD")) {
                    return null;
                }
                break;
            case 802025819:
                if (!str8.equals("PAYONDELIVERY")) {
                    return null;
                }
                break;
            default:
                return null;
        }
        return new AvailablePaymentOptionHolder(this.f96660a, this.f96661b);
    }
}
