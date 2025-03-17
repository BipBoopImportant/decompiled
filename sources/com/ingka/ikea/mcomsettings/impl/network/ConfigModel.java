package com.ingka.ikea.mcomsettings.impl.network;

import HJ.C15854t;
import YH.C16877v;
import com.ingka.ikea.mcomsettings.MComConfig;
import com.ingka.ikea.mcomsettings.impl.AvailablePaymentOptionHolder;
import com.ingka.ikea.mcomsettings.impl.CardHolderNameValidation;
import com.ingka.ikea.mcomsettings.impl.DeliveryTimeSlotDatePatternsHolder;
import com.ingka.ikea.mcomsettings.impl.EmployeeDiscountConfig;
import com.ingka.ikea.mcomsettings.impl.PaymentTermsAndConditionHolder;
import com.ingka.ikea.mcomsettings.impl.db.MComSurveyConfig;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
import vv.C12270c;

@p
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b8\b\b\u0018\u0000 e2\u00020\u0001:\u0002f9BÛ\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J'\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0001¢\u0006\u0004\b+\u0010,J\u001d\u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\u00042\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\f\n\u0004\b9\u0010:\u0012\u0004\b;\u0010<R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\f\n\u0004\b0\u0010:\u0012\u0004\b=\u0010<R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\f\n\u0004\b+\u0010:\u0012\u0004\b>\u0010<R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\f\n\u0004\b?\u0010@\u0012\u0004\bA\u0010<R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002X\u0004¢\u0006\f\n\u0004\bB\u0010C\u0012\u0004\bD\u0010<R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0004¢\u0006\f\n\u0004\bE\u0010F\u0012\u0004\bG\u0010<R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\f\n\u0004\bH\u0010I\u0012\u0004\bJ\u0010<R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\f\n\u0004\bK\u0010:\u0012\u0004\bL\u0010<R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\n8\u0002X\u0004¢\u0006\f\n\u0004\bM\u0010C\u0012\u0004\bN\u0010<R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\f\n\u0004\bO\u0010:\u0012\u0004\bP\u0010<R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0002X\u0004¢\u0006\f\n\u0004\bQ\u0010@\u0012\u0004\bR\u0010<R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0004¢\u0006\f\n\u0004\bS\u0010T\u0012\u0004\bU\u0010<R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002X\u0004¢\u0006\f\n\u0004\bV\u0010T\u0012\u0004\bW\u0010<R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\f\n\u0004\bX\u0010:\u0012\u0004\bY\u0010<R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0004¢\u0006\f\n\u0004\bZ\u0010[\u0012\u0004\b\\\u0010<R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\f\n\u0004\b]\u0010:\u0012\u0004\b^\u0010<R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002X\u0004¢\u0006\f\n\u0004\b_\u0010`\u0012\u0004\ba\u0010<R\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002X\u0004¢\u0006\f\n\u0004\bb\u0010c\u0012\u0004\bd\u0010<¨\u0006g"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/ConfigModel;", "", "", "seen0", "", "discountCodeEnabled", "showTotalExclTaxInCartAndCheckout", "showPriceViewInPaymentExpanded", "", "contactUs", "", "Lcom/ingka/ikea/mcomsettings/impl/network/PaymentTermsAndConditionModel;", "paymentTermsAndConditions", "Lcom/ingka/ikea/mcomsettings/impl/network/DeliveryTimeSlotDatePatterns;", "deliveryTimeSlotDatePatterns", "Lcom/ingka/ikea/mcomsettings/impl/network/CardHolderNameValidationRemote;", "cardHolderInAci", "showOrderSummaryInCheckoutExpanded", "Lcom/ingka/ikea/mcomsettings/impl/network/AvailablePaymentDisclaimerIconModel;", "availablePaymentDisclaimerIcons", "pickupDisabled", "dateAndTimePresentationPattern", "Lcom/ingka/ikea/mcomsettings/impl/network/SurveyConfigRemote;", "checkoutSurveyConfig", "abortCheckoutSurvey", "showMaterialsInCart", "Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote;", "employeeDiscount", "showPaymentInformationSectionCheckout", "Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote;", "googlePayExpressConfig", "Lcom/ingka/ikea/mcomsettings/impl/network/RemoteShoppingConfigurationRemote;", "remoteShoppingConfiguration", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/ingka/ikea/mcomsettings/impl/network/DeliveryTimeSlotDatePatterns;Lcom/ingka/ikea/mcomsettings/impl/network/CardHolderNameValidationRemote;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ingka/ikea/mcomsettings/impl/network/SurveyConfigRemote;Lcom/ingka/ikea/mcomsettings/impl/network/SurveyConfigRemote;Ljava/lang/Boolean;Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote;Ljava/lang/Boolean;Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote;Lcom/ingka/ikea/mcomsettings/impl/network/RemoteShoppingConfigurationRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/mcomsettings/impl/network/ConfigModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "retailCode", "languageCode", "Lvv/c;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lvv/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "getDiscountCodeEnabled$annotations", "()V", "getShowTotalExclTaxInCartAndCheckout$annotations", "getShowPriceViewInPaymentExpanded$annotations", "d", "Ljava/lang/String;", "getContactUs$annotations", "e", "Ljava/util/List;", "getPaymentTermsAndConditions$annotations", "f", "Lcom/ingka/ikea/mcomsettings/impl/network/DeliveryTimeSlotDatePatterns;", "getDeliveryTimeSlotDatePatterns$annotations", "g", "Lcom/ingka/ikea/mcomsettings/impl/network/CardHolderNameValidationRemote;", "getCardHolderInAci$annotations", "h", "getShowOrderSummaryInCheckoutExpanded$annotations", "i", "getAvailablePaymentDisclaimerIcons$annotations", "j", "getPickupDisabled$annotations", "k", "getDateAndTimePresentationPattern$annotations", "l", "Lcom/ingka/ikea/mcomsettings/impl/network/SurveyConfigRemote;", "getCheckoutSurveyConfig$annotations", "m", "getAbortCheckoutSurvey$annotations", "n", "getShowMaterialsInCart$annotations", "o", "Lcom/ingka/ikea/mcomsettings/impl/network/EmployeeDiscountRemote;", "getEmployeeDiscount$annotations", "p", "getShowPaymentInformationSectionCheckout$annotations", "q", "Lcom/ingka/ikea/mcomsettings/impl/network/GooglePayExpressConfigRemote;", "getGooglePayExpressConfig$annotations", "r", "Lcom/ingka/ikea/mcomsettings/impl/network/RemoteShoppingConfigurationRemote;", "getRemoteShoppingConfiguration$annotations", "Companion", "$serializer", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfigModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final KSerializer<Object>[] f96665s = {null, null, null, null, new C17451f(PaymentTermsAndConditionModel$$serializer.INSTANCE), null, null, null, new C17451f(AvailablePaymentDisclaimerIconModel$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f96666a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f96667b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f96668c;

    /* renamed from: d  reason: collision with root package name */
    private final String f96669d;

    /* renamed from: e  reason: collision with root package name */
    private final List<PaymentTermsAndConditionModel> f96670e;

    /* renamed from: f  reason: collision with root package name */
    private final DeliveryTimeSlotDatePatterns f96671f;

    /* renamed from: g  reason: collision with root package name */
    private final CardHolderNameValidationRemote f96672g;

    /* renamed from: h  reason: collision with root package name */
    private final Boolean f96673h;

    /* renamed from: i  reason: collision with root package name */
    private final List<AvailablePaymentDisclaimerIconModel> f96674i;

    /* renamed from: j  reason: collision with root package name */
    private final Boolean f96675j;

    /* renamed from: k  reason: collision with root package name */
    private final String f96676k;

    /* renamed from: l  reason: collision with root package name */
    private final SurveyConfigRemote f96677l;

    /* renamed from: m  reason: collision with root package name */
    private final SurveyConfigRemote f96678m;

    /* renamed from: n  reason: collision with root package name */
    private final Boolean f96679n;

    /* renamed from: o  reason: collision with root package name */
    private final EmployeeDiscountRemote f96680o;

    /* renamed from: p  reason: collision with root package name */
    private final Boolean f96681p;

    /* renamed from: q  reason: collision with root package name */
    private final GooglePayExpressConfigRemote f96682q;

    /* renamed from: r  reason: collision with root package name */
    private final RemoteShoppingConfigurationRemote f96683r;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/network/ConfigModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/impl/network/ConfigModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ConfigModel> serializer() {
            return ConfigModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ConfigModel(int i10, Boolean bool, Boolean bool2, Boolean bool3, String str, List list, DeliveryTimeSlotDatePatterns deliveryTimeSlotDatePatterns, CardHolderNameValidationRemote cardHolderNameValidationRemote, Boolean bool4, List list2, Boolean bool5, String str2, SurveyConfigRemote surveyConfigRemote, SurveyConfigRemote surveyConfigRemote2, Boolean bool6, EmployeeDiscountRemote employeeDiscountRemote, Boolean bool7, GooglePayExpressConfigRemote googlePayExpressConfigRemote, RemoteShoppingConfigurationRemote remoteShoppingConfigurationRemote, T0 t02) {
        if (262143 != (i10 & 262143)) {
            E0.b(i10, 262143, ConfigModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f96666a = bool;
        this.f96667b = bool2;
        this.f96668c = bool3;
        this.f96669d = str;
        this.f96670e = list;
        this.f96671f = deliveryTimeSlotDatePatterns;
        this.f96672g = cardHolderNameValidationRemote;
        this.f96673h = bool4;
        this.f96674i = list2;
        this.f96675j = bool5;
        this.f96676k = str2;
        this.f96677l = surveyConfigRemote;
        this.f96678m = surveyConfigRemote2;
        this.f96679n = bool6;
        this.f96680o = employeeDiscountRemote;
        this.f96681p = bool7;
        this.f96682q = googlePayExpressConfigRemote;
        this.f96683r = remoteShoppingConfigurationRemote;
    }

    public static final /* synthetic */ void c(ConfigModel configModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f96665s;
        C17457i iVar = C17457i.f144111a;
        dVar.B(serialDescriptor, 0, iVar, configModel.f96666a);
        dVar.B(serialDescriptor, 1, iVar, configModel.f96667b);
        dVar.B(serialDescriptor, 2, iVar, configModel.f96668c);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 3, y02, configModel.f96669d);
        dVar.B(serialDescriptor, 4, kSerializerArr[4], configModel.f96670e);
        dVar.B(serialDescriptor, 5, DeliveryTimeSlotDatePatterns$$serializer.INSTANCE, configModel.f96671f);
        dVar.B(serialDescriptor, 6, CardHolderNameValidationRemote$$serializer.INSTANCE, configModel.f96672g);
        dVar.B(serialDescriptor, 7, iVar, configModel.f96673h);
        dVar.B(serialDescriptor, 8, kSerializerArr[8], configModel.f96674i);
        dVar.B(serialDescriptor, 9, iVar, configModel.f96675j);
        dVar.B(serialDescriptor, 10, y02, configModel.f96676k);
        SurveyConfigRemote$$serializer surveyConfigRemote$$serializer = SurveyConfigRemote$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 11, surveyConfigRemote$$serializer, configModel.f96677l);
        dVar.B(serialDescriptor, 12, surveyConfigRemote$$serializer, configModel.f96678m);
        dVar.B(serialDescriptor, 13, iVar, configModel.f96679n);
        dVar.B(serialDescriptor, 14, EmployeeDiscountRemote$$serializer.INSTANCE, configModel.f96680o);
        dVar.B(serialDescriptor, 15, iVar, configModel.f96681p);
        dVar.B(serialDescriptor, 16, GooglePayExpressConfigRemote$$serializer.INSTANCE, configModel.f96682q);
        dVar.B(serialDescriptor, 17, RemoteShoppingConfigurationRemote$$serializer.INSTANCE, configModel.f96683r);
    }

    public final C12270c b(String str, String str2) {
        Collection collection;
        DeliveryTimeSlotDatePatternsHolder a10;
        C17542s.j(str, "retailCode");
        C17542s.j(str2, "languageCode");
        String str3 = this.f96669d;
        Double d10 = null;
        if (str3 == null || str3.length() == 0) {
            e eVar = e.WARN;
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
                    String a11 = C11818a.a("No contact us provided", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str4 = C11820c.a(a11);
                }
                String str6 = str4;
                if (str5 == null) {
                    String name = ConfigModel.class.getName();
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
        }
        ArrayList arrayList2 = new ArrayList();
        List<PaymentTermsAndConditionModel> list = this.f96670e;
        if (list != null) {
            for (PaymentTermsAndConditionModel a12 : list) {
                PaymentTermsAndConditionHolder a13 = a12.a();
                if (a13 != null) {
                    arrayList2.add(a13);
                }
            }
        }
        DeliveryTimeSlotDatePatterns deliveryTimeSlotDatePatterns = this.f96671f;
        DeliveryTimeSlotDatePatternsHolder deliveryTimeSlotDatePatternsHolder = (deliveryTimeSlotDatePatterns == null || (a10 = deliveryTimeSlotDatePatterns.a()) == null) ? new DeliveryTimeSlotDatePatternsHolder("d", "MMM", "EEE", "HH:mm", "EEE, d MMM", "d MMM") : a10;
        List<AvailablePaymentDisclaimerIconModel> list2 = this.f96674i;
        if (list2 != null) {
            collection = new ArrayList();
            for (AvailablePaymentDisclaimerIconModel a14 : list2) {
                AvailablePaymentOptionHolder a15 = a14.a();
                if (a15 != null) {
                    collection.add(a15);
                }
            }
        } else {
            collection = C16877v.n();
        }
        String str8 = this.f96676k;
        if (str8 == null) {
            str8 = "yyyy-MM-dd HH:mm";
        }
        String str9 = str8;
        Boolean bool = this.f96666a;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = this.f96667b;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = this.f96668c;
        boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        String str10 = this.f96669d;
        CardHolderNameValidationRemote cardHolderNameValidationRemote = this.f96672g;
        CardHolderNameValidation a16 = cardHolderNameValidationRemote != null ? cardHolderNameValidationRemote.a() : null;
        Boolean bool4 = this.f96673h;
        boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : false;
        String str11 = str9;
        ArrayList arrayList3 = new ArrayList(collection);
        Boolean bool5 = this.f96675j;
        boolean booleanValue5 = bool5 != null ? bool5.booleanValue() : false;
        SurveyConfigRemote surveyConfigRemote = this.f96677l;
        MComSurveyConfig b10 = surveyConfigRemote != null ? surveyConfigRemote.b() : null;
        SurveyConfigRemote surveyConfigRemote2 = this.f96678m;
        MComSurveyConfig b11 = surveyConfigRemote2 != null ? surveyConfigRemote2.b() : null;
        Boolean bool6 = this.f96679n;
        boolean booleanValue6 = bool6 != null ? bool6.booleanValue() : false;
        EmployeeDiscountRemote employeeDiscountRemote = this.f96680o;
        EmployeeDiscountConfig a17 = employeeDiscountRemote != null ? employeeDiscountRemote.a() : null;
        Boolean bool7 = this.f96681p;
        boolean booleanValue7 = bool7 != null ? bool7.booleanValue() : false;
        GooglePayExpressConfigRemote googlePayExpressConfigRemote = this.f96682q;
        MComConfig.GooglePayExpressConfig f10 = googlePayExpressConfigRemote != null ? googlePayExpressConfigRemote.f() : null;
        RemoteShoppingConfigurationRemote remoteShoppingConfigurationRemote = this.f96683r;
        if (remoteShoppingConfigurationRemote != null) {
            d10 = remoteShoppingConfigurationRemote.a();
        }
        return new C12270c(str, str2, booleanValue, booleanValue2, booleanValue3, str10, arrayList2, deliveryTimeSlotDatePatternsHolder, a16, booleanValue4, arrayList3, booleanValue5, str11, b10, b11, booleanValue6, a17, booleanValue7, f10, d10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigModel)) {
            return false;
        }
        ConfigModel configModel = (ConfigModel) obj;
        return C17542s.e(this.f96666a, configModel.f96666a) && C17542s.e(this.f96667b, configModel.f96667b) && C17542s.e(this.f96668c, configModel.f96668c) && C17542s.e(this.f96669d, configModel.f96669d) && C17542s.e(this.f96670e, configModel.f96670e) && C17542s.e(this.f96671f, configModel.f96671f) && C17542s.e(this.f96672g, configModel.f96672g) && C17542s.e(this.f96673h, configModel.f96673h) && C17542s.e(this.f96674i, configModel.f96674i) && C17542s.e(this.f96675j, configModel.f96675j) && C17542s.e(this.f96676k, configModel.f96676k) && C17542s.e(this.f96677l, configModel.f96677l) && C17542s.e(this.f96678m, configModel.f96678m) && C17542s.e(this.f96679n, configModel.f96679n) && C17542s.e(this.f96680o, configModel.f96680o) && C17542s.e(this.f96681p, configModel.f96681p) && C17542s.e(this.f96682q, configModel.f96682q) && C17542s.e(this.f96683r, configModel.f96683r);
    }

    public int hashCode() {
        Boolean bool = this.f96666a;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f96667b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f96668c;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f96669d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<PaymentTermsAndConditionModel> list = this.f96670e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        DeliveryTimeSlotDatePatterns deliveryTimeSlotDatePatterns = this.f96671f;
        int hashCode6 = (hashCode5 + (deliveryTimeSlotDatePatterns == null ? 0 : deliveryTimeSlotDatePatterns.hashCode())) * 31;
        CardHolderNameValidationRemote cardHolderNameValidationRemote = this.f96672g;
        int hashCode7 = (hashCode6 + (cardHolderNameValidationRemote == null ? 0 : cardHolderNameValidationRemote.hashCode())) * 31;
        Boolean bool4 = this.f96673h;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<AvailablePaymentDisclaimerIconModel> list2 = this.f96674i;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool5 = this.f96675j;
        int hashCode10 = (hashCode9 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str2 = this.f96676k;
        int hashCode11 = (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SurveyConfigRemote surveyConfigRemote = this.f96677l;
        int hashCode12 = (hashCode11 + (surveyConfigRemote == null ? 0 : surveyConfigRemote.hashCode())) * 31;
        SurveyConfigRemote surveyConfigRemote2 = this.f96678m;
        int hashCode13 = (hashCode12 + (surveyConfigRemote2 == null ? 0 : surveyConfigRemote2.hashCode())) * 31;
        Boolean bool6 = this.f96679n;
        int hashCode14 = (hashCode13 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        EmployeeDiscountRemote employeeDiscountRemote = this.f96680o;
        int hashCode15 = (hashCode14 + (employeeDiscountRemote == null ? 0 : employeeDiscountRemote.hashCode())) * 31;
        Boolean bool7 = this.f96681p;
        int hashCode16 = (hashCode15 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        GooglePayExpressConfigRemote googlePayExpressConfigRemote = this.f96682q;
        int hashCode17 = (hashCode16 + (googlePayExpressConfigRemote == null ? 0 : googlePayExpressConfigRemote.hashCode())) * 31;
        RemoteShoppingConfigurationRemote remoteShoppingConfigurationRemote = this.f96683r;
        if (remoteShoppingConfigurationRemote != null) {
            i10 = remoteShoppingConfigurationRemote.hashCode();
        }
        return hashCode17 + i10;
    }

    public String toString() {
        Boolean bool = this.f96666a;
        Boolean bool2 = this.f96667b;
        Boolean bool3 = this.f96668c;
        String str = this.f96669d;
        List<PaymentTermsAndConditionModel> list = this.f96670e;
        DeliveryTimeSlotDatePatterns deliveryTimeSlotDatePatterns = this.f96671f;
        CardHolderNameValidationRemote cardHolderNameValidationRemote = this.f96672g;
        Boolean bool4 = this.f96673h;
        List<AvailablePaymentDisclaimerIconModel> list2 = this.f96674i;
        Boolean bool5 = this.f96675j;
        String str2 = this.f96676k;
        SurveyConfigRemote surveyConfigRemote = this.f96677l;
        SurveyConfigRemote surveyConfigRemote2 = this.f96678m;
        Boolean bool6 = this.f96679n;
        EmployeeDiscountRemote employeeDiscountRemote = this.f96680o;
        Boolean bool7 = this.f96681p;
        GooglePayExpressConfigRemote googlePayExpressConfigRemote = this.f96682q;
        RemoteShoppingConfigurationRemote remoteShoppingConfigurationRemote = this.f96683r;
        return "ConfigModel(discountCodeEnabled=" + bool + ", showTotalExclTaxInCartAndCheckout=" + bool2 + ", showPriceViewInPaymentExpanded=" + bool3 + ", contactUs=" + str + ", paymentTermsAndConditions=" + list + ", deliveryTimeSlotDatePatterns=" + deliveryTimeSlotDatePatterns + ", cardHolderInAci=" + cardHolderNameValidationRemote + ", showOrderSummaryInCheckoutExpanded=" + bool4 + ", availablePaymentDisclaimerIcons=" + list2 + ", pickupDisabled=" + bool5 + ", dateAndTimePresentationPattern=" + str2 + ", checkoutSurveyConfig=" + surveyConfigRemote + ", abortCheckoutSurvey=" + surveyConfigRemote2 + ", showMaterialsInCart=" + bool6 + ", employeeDiscount=" + employeeDiscountRemote + ", showPaymentInformationSectionCheckout=" + bool7 + ", googlePayExpressConfig=" + googlePayExpressConfigRemote + ", remoteShoppingConfiguration=" + remoteShoppingConfigurationRemote + ")";
    }
}
