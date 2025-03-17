package Ow;

import HJ.C15850p;
import HJ.C15854t;
import Nn.D;
import Nn.v;
import Ow.C13323a;
import Pw.C13348a;
import XH.t;
import YH.C16877v;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.ingka.ikea.mcomsettings.MComConfig;
import com.ingka.ikea.onlinepayment.impl.presentation.AciBroadcastReceiver;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import com.oppwa.mobile.connect.checkout.meta.AfterpayPacificConfig;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSkipCVVMode;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.provider.threeds.v2.model.ThreeDSConfig;
import com.oppwa.mobile.connect.utils.googlepay.CardPaymentMethodJsonBuilder;
import com.oppwa.mobile.connect.utils.googlepay.PaymentDataRequestJsonBuilder;
import com.oppwa.mobile.connect.utils.googlepay.TransactionInfoJsonBuilder;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg.C10025b;
import lg.C10026c;
import org.json.JSONArray;
import org.json.JSONObject;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import rE.C14996a;
import rE.C15000e;
import rE.C15001f;
import rv.C11849b;
import tv.C11996a;
import tv.C11997b;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 +2\u00020\u0001:\u0001%B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JC\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u0011*\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010%\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J'\u0010+\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010-¨\u0006."}, d2 = {"LOw/b;", "LOw/a;", "LIl/a;", "appConfigApi", "<init>", "(LIl/a;)V", "LNn/v;", "googlePayInfo", "", "gatewayMerchantId", "", "leftToPay", "currency", "Lcom/oppwa/mobile/connect/checkout/meta/CheckoutSettings;", "checkoutSettings", "LOw/a$a$a;", "googlePayExpressSettings", "LXH/N;", "f", "(LNn/v;Ljava/lang/String;DLjava/lang/String;Lcom/oppwa/mobile/connect/checkout/meta/CheckoutSettings;LOw/a$a$a;)V", "Landroid/content/Context;", "context", "d", "(Landroid/content/Context;Lcom/oppwa/mobile/connect/checkout/meta/CheckoutSettings;)V", "LNn/D$a$a;", "configuration", "e", "(Lcom/oppwa/mobile/connect/checkout/meta/CheckoutSettings;LNn/D$a$a;)V", "Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "cardHolderNameValidation", "c", "(Lcom/oppwa/mobile/connect/checkout/meta/CheckoutSettings;Lcom/ingka/ikea/mcomsettings/MComConfig$b;)V", "Landroid/content/ComponentName;", "senderComponentName", "aciCheckoutId", "", "isValid", "a", "(Landroid/content/Context;Landroid/content/ComponentName;Ljava/lang/String;Z)V", "Lcom/oppwa/mobile/connect/provider/Connect$ProviderMode;", "providerMode", "LOw/a$a;", "input", "b", "(Landroid/content/Context;Lcom/oppwa/mobile/connect/provider/Connect$ProviderMode;LOw/a$a;)Lcom/oppwa/mobile/connect/checkout/meta/CheckoutSettings;", "LIl/a;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ow.b  reason: case insensitive filesystem */
public final class C13324b implements C13323a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f113597b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f113598c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Il.a f113599a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LOw/b$a;", "", "<init>", "()V", "", "GOOGLE_PAY_PRICE_STATUS", "Ljava/lang/String;", "LOCALE_DELIMITER", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ow.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C13324b(Il.a aVar) {
        C17542s.j(aVar, "appConfigApi");
        this.f113599a = aVar;
    }

    private final void c(CheckoutSettings checkoutSettings, MComConfig.b bVar) {
        String b10;
        checkoutSettings.setCardHolderVisible(bVar != null ? bVar.a() : false);
        if (bVar != null && (b10 = bVar.b()) != null) {
            checkoutSettings.setPaymentFormListener(new C13348a(new C15850p(b10)));
        }
    }

    private final void d(Context context, CheckoutSettings checkoutSettings) {
        ThreeDSConfig.Builder builder = new ThreeDSConfig.Builder();
        C15000e eVar = new C15000e();
        eVar.j(context.getString(C10025b.f75266h));
        eVar.d(context.getString(C10025b.f75260b));
        eVar.k(context.getString(C11849b.f102225P2));
        C14996a aVar = new C14996a();
        aVar.d(context.getString(C10025b.f75266h));
        aVar.k(context.getResources().getDimensionPixelSize(C10026c.f75269c));
        aVar.j(context.getString(C10025b.f75259a));
        C14996a aVar2 = new C14996a();
        aVar2.d(context.getString(C10025b.f75266h));
        aVar2.k(context.getResources().getDimensionPixelSize(C10026c.f75269c));
        aVar2.j(context.getString(C10025b.f75260b));
        C15001f fVar = new C15001f();
        fVar.i(eVar);
        fVar.h(aVar, C15001f.a.CONTINUE);
        fVar.h(aVar, C15001f.a.NEXT);
        fVar.h(aVar, C15001f.a.SUBMIT);
        fVar.h(aVar2, C15001f.a.RESEND);
        builder.setUiCustomization(fVar);
        checkoutSettings.setThreeDS2Config(builder.build());
    }

    private final void e(CheckoutSettings checkoutSettings, D.a.C1690a aVar) {
        Class<C13324b> cls = C13324b.class;
        boolean z10 = true;
        try {
            List Y02 = C15854t.Y0(aVar.b(), new String[]{"_"}, false, 0, 6, (Object) null);
            List Y03 = C15854t.Y0(aVar.a(), new String[]{"_"}, false, 0, 6, (Object) null);
            AfterpayPacificConfig afterpayPacificConfig = new AfterpayPacificConfig(String.valueOf(aVar.d()), String.valueOf(aVar.c()), new Locale((String) Y02.get(0), (String) Y02.get(1)), new Locale((String) Y03.get(0), (String) Y03.get(1)));
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Setup AfterPay with config: " + afterpayPacificConfig, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                if (str2 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str2, false, (Throwable) null, str);
            }
            checkoutSettings.setAfterpayPacificConfig(afterpayPacificConfig);
        } catch (Exception e10) {
            e eVar2 = e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str3 == null) {
                    String a11 = C11818a.a("Failed to setup AfterPay configuration", e10);
                    if (a11 != null) {
                        str3 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                if (str4 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, z10) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str4, false, e10, str3);
                z10 = true;
            }
        }
    }

    private final void f(v vVar, String str, double d10, String str2, CheckoutSettings checkoutSettings, C13323a.C2787a.C2788a aVar) {
        Class<C13324b> cls;
        String str3 = str;
        double d11 = d10;
        C13323a.C2787a.C2788a aVar2 = aVar;
        e eVar = e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str4 = null;
        String str5 = null;
        while (true) {
            cls = C13324b.class;
            if (!it.hasNext()) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str4 == null) {
                String a10 = C11818a.a("setupGooglePay leftToPay: " + d11 + ", googlePayExpressSettings: " + aVar2, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str4 = C11820c.a(a10);
            }
            String str6 = str4;
            if (str5 == null) {
                String name = cls.getName();
                C17542s.g(name);
                String str7 = DslKt.INDICATOR_BACKGROUND;
                String str8 = name;
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                String P02 = o12.length() == 0 ? str8 : C15854t.P0(o12, "Kt");
                str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str7) + DslKt.INDICATOR_SEPARATOR + P02;
            }
            String str9 = str5;
            bVar.a(eVar, str9, false, (Throwable) null, str6);
            str5 = str9;
            str4 = str6;
        }
        String str10 = DslKt.INDICATOR_BACKGROUND;
        if (str3 != null) {
            e eVar2 = e.DEBUG;
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, true)) {
                    arrayList2.add(next2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            String str11 = null;
            String str12 = null;
            while (true) {
                if (!it2.hasNext()) {
                    v vVar2 = vVar;
                    break;
                }
                C11819b bVar2 = (C11819b) it2.next();
                if (str12 == null) {
                    String a11 = C11818a.a("Adding googlePayInfo: " + vVar + ", leftToPay: " + d11, (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str12 = C11820c.a(a11);
                } else {
                    v vVar3 = vVar;
                }
                if (str11 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str10) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str11, true, (Throwable) null, str12);
                d11 = d10;
            }
            Iterable<C11996a> b10 = vVar.b();
            ArrayList arrayList3 = new ArrayList(C16877v.y(b10, 10));
            for (C11996a b11 : b10) {
                arrayList3.add(b11.b());
            }
            Iterable<C11997b> a12 = vVar.a();
            ArrayList arrayList4 = new ArrayList(C16877v.y(a12, 10));
            for (C11997b b12 : a12) {
                arrayList4.add(b12.b());
            }
            CardPaymentMethodJsonBuilder gatewayMerchantId = new CardPaymentMethodJsonBuilder().setAllowedAuthMethods(new JSONArray(arrayList3)).setAllowedCardNetworks(new JSONArray(arrayList4)).setGatewayMerchantId(str3);
            if (aVar2 != null) {
                gatewayMerchantId.setBillingAddressRequired(true).setBillingAddressParameters("FULL", true);
            }
            JSONArray put = new JSONArray().put(gatewayMerchantId.toJson());
            JSONObject json = new TransactionInfoJsonBuilder().setCurrencyCode(str2).setTotalPriceStatus("FINAL").setTotalPrice(String.valueOf(d10)).toJson();
            C17542s.i(json, "toJson(...)");
            PaymentDataRequestJsonBuilder transactionInfo = new PaymentDataRequestJsonBuilder().setAllowedPaymentMethods(put).setTransactionInfo(json);
            if (aVar2 != null) {
                transactionInfo.setEmailRequired(true);
                if (aVar.a()) {
                    transactionInfo.setShippingAddressRequired(true).setShippingAddressParameters((JSONArray) null, Boolean.TRUE);
                }
            }
            checkoutSettings.setGooglePayPaymentDataRequestJson(transactionInfo.toJson().toString());
            return;
        }
        throw new IllegalStateException("gatewayMerchantId should not be null here");
    }

    public void a(Context context, ComponentName componentName, String str, boolean z10) {
        C17542s.j(context, "context");
        C17542s.j(componentName, "senderComponentName");
        C17542s.j(str, "aciCheckoutId");
        Intent intent = new Intent(context, CheckoutActivity.class);
        intent.setAction(CheckoutActivity.ACTION_ON_BEFORE_SUBMIT);
        intent.setComponent(componentName);
        intent.setPackage(componentName.getPackageName());
        intent.addFlags(268435456);
        intent.putExtra(CheckoutActivity.EXTRA_CHECKOUT_ID, str);
        intent.putExtra(CheckoutActivity.EXTRA_TRANSACTION_ABORTED, !z10);
        context.startActivity(intent);
    }

    public CheckoutSettings b(Context context, Connect.ProviderMode providerMode, C13323a.C2787a aVar) {
        Parcelable parcelable;
        String str;
        String str2;
        Iterator it;
        Context context2 = context;
        Connect.ProviderMode providerMode2 = providerMode;
        C17542s.j(context2, "context");
        C17542s.j(providerMode2, "providerMode");
        C17542s.j(aVar, "input");
        CheckoutSettings checkoutSettings = new CheckoutSettings(aVar.c(), aVar.h(), providerMode2);
        checkoutSettings.setTotalAmountRequired(true);
        checkoutSettings.setCardScanningEnabled(true);
        String upperCase = aVar.i().toUpperCase(this.f113599a.A());
        C17542s.i(upperCase, "toUpperCase(...)");
        checkoutSettings.setKlarnaCountry(upperCase);
        checkoutSettings.setSkipCVVMode(aVar.l() ? CheckoutSkipCVVMode.ALWAYS : CheckoutSkipCVVMode.NEVER);
        if (aVar.a() != null) {
            checkoutSettings.setBrandDetectionType(aVar.a());
        }
        c(checkoutSettings, aVar.b());
        checkoutSettings.setComponentName(new ComponentName(context2, AciBroadcastReceiver.class.getName()));
        d(context2, checkoutSettings);
        if (aVar.k() instanceof D.c) {
            f(((D.c) aVar.k()).g(), aVar.e(), aVar.g(), aVar.d(), checkoutSettings, aVar.f());
        }
        D k10 = aVar.k();
        if (k10 instanceof D.g) {
            parcelable = ((D.g) aVar.k()).g();
        } else if (k10 instanceof D.h) {
            parcelable = ((D.h) aVar.k()).g();
        } else if ((k10 instanceof D.b) || (k10 instanceof D.c) || (k10 instanceof D.d) || (k10 instanceof D.e)) {
            parcelable = null;
        } else {
            throw new t();
        }
        boolean z10 = parcelable instanceof D.a.C1690a;
        String str3 = DslKt.INDICATOR_BACKGROUND;
        Class<C13324b> cls = C13324b.class;
        if (z10) {
            e(checkoutSettings, (D.a.C1690a) parcelable);
            str = str3;
        } else if (parcelable instanceof D.a.b) {
            e eVar = e.DEBUG;
            ArrayList arrayList = new ArrayList();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            String str4 = null;
            String str5 = null;
            while (it2.hasNext()) {
                C11819b bVar = (C11819b) it2.next();
                if (str4 == null) {
                    String a10 = C11818a.a("Setting idealBankAccountCountry to: " + ((D.a.b) parcelable).a(), (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str4 = C11820c.a(a10);
                }
                if (str5 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    it = it2;
                    str2 = str3;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    it = it2;
                    str2 = str3;
                }
                bVar.a(eVar, str5, false, (Throwable) null, str4);
                it2 = it;
                str3 = str2;
            }
            str = str3;
            checkoutSettings.setIdealBankAccountCountry(((D.a.b) parcelable).a());
        } else {
            str = str3;
            if (parcelable != null) {
                throw new t();
            }
        }
        if (aVar.h().size() == 1) {
            checkoutSettings.setPaymentButtonBrand(aVar.j());
        }
        e eVar2 = e.DEBUG;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, true)) {
                arrayList2.add(next2);
            }
        }
        String str6 = null;
        String str7 = null;
        for (C11819b bVar2 : arrayList2) {
            if (str7 == null) {
                String a11 = C11818a.a("ACI checkout settings: " + checkoutSettings, (Throwable) null);
                if (a11 == null) {
                    break;
                }
                str7 = C11820c.a(a11);
            }
            if (str6 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
            }
            bVar2.a(eVar2, str6, true, (Throwable) null, str7);
        }
        return checkoutSettings;
    }
}
