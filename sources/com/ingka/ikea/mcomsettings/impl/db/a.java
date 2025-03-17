package com.ingka.ikea.mcomsettings.impl.db;

import YH.C16877v;
import com.ingka.ikea.mcomsettings.MComConfig;
import com.ingka.ikea.mcomsettings.impl.AvailablePaymentOptionHolder;
import com.ingka.ikea.mcomsettings.impl.CardHolderNameValidation;
import com.ingka.ikea.mcomsettings.impl.DeliveryTimeSlotDatePatternsHolder;
import com.ingka.ikea.mcomsettings.impl.EmployeeDiscountConfig;
import com.ingka.ikea.mcomsettings.impl.PaymentTermsAndConditionHolder;
import com.ingka.ikea.mcomsettings.impl.db.MComSurveyConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010\"\u001a\u00020!*\u00020 H\u0000¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/DeliveryTimeSlotDatePatternsHolder;", "Lcom/ingka/ikea/mcomsettings/MComConfig$d;", "d", "(Lcom/ingka/ikea/mcomsettings/impl/DeliveryTimeSlotDatePatternsHolder;)Lcom/ingka/ikea/mcomsettings/MComConfig$d;", "Lcom/ingka/ikea/mcomsettings/impl/PaymentTermsAndConditionHolder;", "Lcom/ingka/ikea/mcomsettings/MComConfig$g;", "g", "(Lcom/ingka/ikea/mcomsettings/impl/PaymentTermsAndConditionHolder;)Lcom/ingka/ikea/mcomsettings/MComConfig$g;", "Lcom/ingka/ikea/mcomsettings/impl/AvailablePaymentOptionHolder;", "Lcom/ingka/ikea/mcomsettings/MComConfig$a;", "a", "(Lcom/ingka/ikea/mcomsettings/impl/AvailablePaymentOptionHolder;)Lcom/ingka/ikea/mcomsettings/MComConfig$a;", "Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig;", "Lcom/ingka/ikea/mcomsettings/MComConfig$f;", "f", "(Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig;)Lcom/ingka/ikea/mcomsettings/MComConfig$f;", "Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig$SurveyQuestion;", "Lcom/ingka/ikea/mcomsettings/MComConfig$f$a;", "i", "(Lcom/ingka/ikea/mcomsettings/impl/db/MComSurveyConfig$SurveyQuestion;)Lcom/ingka/ikea/mcomsettings/MComConfig$f$a;", "Lcom/ingka/ikea/mcomsettings/impl/EmployeeDiscountConfig;", "Lcom/ingka/ikea/mcomsettings/MComConfig$e;", "e", "(Lcom/ingka/ikea/mcomsettings/impl/EmployeeDiscountConfig;)Lcom/ingka/ikea/mcomsettings/MComConfig$e;", "Lcom/ingka/ikea/mcomsettings/impl/EmployeeDiscountConfig$Card;", "Lcom/ingka/ikea/mcomsettings/MComConfig$e$a;", "b", "(Lcom/ingka/ikea/mcomsettings/impl/EmployeeDiscountConfig$Card;)Lcom/ingka/ikea/mcomsettings/MComConfig$e$a;", "Lcom/ingka/ikea/mcomsettings/impl/EmployeeDiscountConfig$ReadMore;", "Lcom/ingka/ikea/mcomsettings/MComConfig$e$b;", "h", "(Lcom/ingka/ikea/mcomsettings/impl/EmployeeDiscountConfig$ReadMore;)Lcom/ingka/ikea/mcomsettings/MComConfig$e$b;", "Lcom/ingka/ikea/mcomsettings/impl/CardHolderNameValidation;", "Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "c", "(Lcom/ingka/ikea/mcomsettings/impl/CardHolderNameValidation;)Lcom/ingka/ikea/mcomsettings/MComConfig$b;", "mcomsettings-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final MComConfig.a a(AvailablePaymentOptionHolder availablePaymentOptionHolder) {
        C17542s.j(availablePaymentOptionHolder, "<this>");
        return new MComConfig.a(availablePaymentOptionHolder.b(), availablePaymentOptionHolder.a());
    }

    public static final MComConfig.e.a b(EmployeeDiscountConfig.Card card) {
        C17542s.j(card, "<this>");
        return new MComConfig.e.a(card.b(), card.a());
    }

    public static final MComConfig.b c(CardHolderNameValidation cardHolderNameValidation) {
        C17542s.j(cardHolderNameValidation, "<this>");
        return new MComConfig.b(cardHolderNameValidation.a(), cardHolderNameValidation.b());
    }

    public static final MComConfig.d d(DeliveryTimeSlotDatePatternsHolder deliveryTimeSlotDatePatternsHolder) {
        C17542s.j(deliveryTimeSlotDatePatternsHolder, "<this>");
        return new MComConfig.d(deliveryTimeSlotDatePatternsHolder.b(), deliveryTimeSlotDatePatternsHolder.c(), deliveryTimeSlotDatePatternsHolder.f(), deliveryTimeSlotDatePatternsHolder.d(), deliveryTimeSlotDatePatternsHolder.e(), deliveryTimeSlotDatePatternsHolder.a());
    }

    public static final MComConfig.e e(EmployeeDiscountConfig employeeDiscountConfig) {
        C17542s.j(employeeDiscountConfig, "<this>");
        return new MComConfig.e(employeeDiscountConfig.b(), b(employeeDiscountConfig.a()), h(employeeDiscountConfig.c()));
    }

    public static final MComConfig.f f(MComSurveyConfig mComSurveyConfig) {
        C17542s.j(mComSurveyConfig, "<this>");
        String c10 = mComSurveyConfig.c();
        String e10 = mComSurveyConfig.e();
        String b10 = mComSurveyConfig.b();
        Iterable<MComSurveyConfig.SurveyQuestion> d10 = mComSurveyConfig.d();
        ArrayList arrayList = new ArrayList(C16877v.y(d10, 10));
        for (MComSurveyConfig.SurveyQuestion i10 : d10) {
            arrayList.add(i(i10));
        }
        return new MComConfig.f(c10, e10, b10, arrayList);
    }

    public static final MComConfig.g g(PaymentTermsAndConditionHolder paymentTermsAndConditionHolder) {
        C17542s.j(paymentTermsAndConditionHolder, "<this>");
        return new MComConfig.g(paymentTermsAndConditionHolder.c(), paymentTermsAndConditionHolder.d(), paymentTermsAndConditionHolder.b(), paymentTermsAndConditionHolder.a());
    }

    public static final MComConfig.e.b h(EmployeeDiscountConfig.ReadMore readMore) {
        C17542s.j(readMore, "<this>");
        return new MComConfig.e.b(readMore.a(), readMore.c(), readMore.b());
    }

    public static final MComConfig.f.a i(MComSurveyConfig.SurveyQuestion surveyQuestion) {
        C17542s.j(surveyQuestion, "<this>");
        return new MComConfig.f.a(surveyQuestion.a(), surveyQuestion.d(), surveyQuestion.c(), surveyQuestion.b());
    }
}
