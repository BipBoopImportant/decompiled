package com.ingka.ikea.app.caasremote.models;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import fI.C17221b;
import fK.p;
import jK.J;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import nI.C17631a;

@p
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b(\b\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006*"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getValue", "Companion", "b", "AVAILABILITY_CLIENT_ERROR", "CART_NOT_ELIGIBLE_FOR_REMOVAL", "CART_NOT_FOUND", "CONFLICT", "DEXF_ERROR", "DISCOUNT_CODE_ERROR", "FETCH_FAILED", "GENERIC_ERROR", "INVALID_CART_ID", "INVALID_DISCOUNT_CODE", "INVALID_INPUT", "INVALID_STORE_ID", "INVALID_SHOPPING_PROFILE", "ITEM_INFO_ERROR", "ITEM_NOT_FOUND", "ITEM_VALIDATION_ERROR", "MISSING_HEADER", "MISSING_STORE_ID", "PARSE_ERROR", "PLAN_NOT_FOUND", "PRICING_CONNECTION", "PRICING_ERROR", "QUANTITY_EXCEEDED_LIMIT", "REGION_NOT_FOUND", "RESOURCE_NOT_FOUND", "SERVICE_OFFER_NOT_ENABLED", "SR_PRICE_ACCESS", "SR_PRICE_ERROR", "TOO_MANY_DISCOUNT_CODES", "UNAUTHORIZED", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum a {
    AVAILABILITY_CLIENT_ERROR("AVAILABILITY_CLIENT_ERROR"),
    CART_NOT_ELIGIBLE_FOR_REMOVAL("CART_NOT_ELIGIBLE_FOR_REMOVAL"),
    CART_NOT_FOUND("CART_NOT_FOUND"),
    CONFLICT("CONFLICT"),
    DEXF_ERROR("DEXF_ERROR"),
    DISCOUNT_CODE_ERROR("DISCOUNT_CODE_ERROR"),
    FETCH_FAILED("FETCH_FAILED"),
    GENERIC_ERROR("GENERIC_ERROR"),
    INVALID_CART_ID("INVALID_CART_ID"),
    INVALID_DISCOUNT_CODE("INVALID_DISCOUNT_CODE"),
    INVALID_INPUT("INVALID_INPUT"),
    INVALID_STORE_ID("INVALID_STORE_ID"),
    INVALID_SHOPPING_PROFILE("INVALID_SHOPPING_PROFILE"),
    ITEM_INFO_ERROR("ITEM_INFO_ERROR"),
    ITEM_NOT_FOUND("ITEM_NOT_FOUND"),
    ITEM_VALIDATION_ERROR("ITEM_VALIDATION_ERROR"),
    MISSING_HEADER("MISSING_HEADER"),
    MISSING_STORE_ID("MISSING_STORE_ID"),
    PARSE_ERROR("PARSE_ERROR"),
    PLAN_NOT_FOUND("PLAN_NOT_FOUND"),
    PRICING_CONNECTION("PRICING_CONNECTION"),
    PRICING_ERROR("PRICING_ERROR"),
    QUANTITY_EXCEEDED_LIMIT("QUANTITY_EXCEEDED_LIMIT"),
    REGION_NOT_FOUND("REGION_NOT_FOUND"),
    RESOURCE_NOT_FOUND("RESOURCE_NOT_FOUND"),
    SERVICE_OFFER_NOT_ENABLED("SERVICE_OFFER_NOT_ENABLED"),
    SR_PRICE_ACCESS("SR_PRICE_ACCESS"),
    SR_PRICE_ERROR("SR_PRICE_ERROR"),
    TOO_MANY_DISCOUNT_CODES("TOO_MANY_DISCOUNT_CODES"),
    UNAUTHORIZED("UNAUTHORIZED");
    
    /* access modifiers changed from: private */
    public static final C16824o<KSerializer<Object>> $cachedSerializer$delegate = null;
    public static final b Companion = null;
    private final String value;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.app.caasremote.models.a$a  reason: collision with other inner class name */
    static final class C1223a extends C17544u implements C17631a<KSerializer<Object>> {

        /* renamed from: c  reason: collision with root package name */
        public static final C1223a f71577c = null;

        static {
            f71577c = new C1223a();
        }

        C1223a() {
            super(0);
        }

        public final KSerializer<Object> invoke() {
            return J.a("com.ingka.ikea.app.caasremote.models.ApiErrorCodeRemoteModel", a.values(), new String[]{"AVAILABILITY_CLIENT_ERROR", "CART_NOT_ELIGIBLE_FOR_REMOVAL", "CART_NOT_FOUND", "CONFLICT", "DEXF_ERROR", "DISCOUNT_CODE_ERROR", "FETCH_FAILED", "GENERIC_ERROR", "INVALID_CART_ID", "INVALID_DISCOUNT_CODE", "INVALID_INPUT", "INVALID_STORE_ID", "INVALID_SHOPPING_PROFILE", "ITEM_INFO_ERROR", "ITEM_NOT_FOUND", "ITEM_VALIDATION_ERROR", "MISSING_HEADER", "MISSING_STORE_ID", "PARSE_ERROR", "PLAN_NOT_FOUND", "PRICING_CONNECTION", "PRICING_ERROR", "QUANTITY_EXCEEDED_LIMIT", "REGION_NOT_FOUND", "RESOURCE_NOT_FOUND", "SERVICE_OFFER_NOT_ENABLED", "SR_PRICE_ACCESS", "SR_PRICE_ERROR", "TOO_MANY_DISCOUNT_CODES", "UNAUTHORIZED"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, (Annotation[]) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/a$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/a;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) a.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<a> serializer() {
            return a();
        }

        private b() {
        }
    }

    static {
        a[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new b((DefaultConstructorMarker) null);
        $cachedSerializer$delegate = C16825p.a(s.PUBLICATION, C1223a.f71577c);
    }

    private a(String str) {
        this.value = str;
    }

    public String toString() {
        return this.value;
    }
}
