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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/j;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getValue", "Companion", "b", "NEW", "LAST_CHANCE", "DELIVERY_COST_ADDED", "SUITABLE_FOR_BUSINESS", "TOP_SELLER", "LIMITED_EDITION", "ONLINE_EXCLUSIVE", "GUARANTEE_1_YEAR", "GUARANTEE_2_YEAR", "GUARANTEE_3_YEAR", "GUARANTEE_5_YEAR", "GUARANTEE_6_YEAR", "GUARANTEE_10_YEAR", "GUARANTEE_15_YEAR", "GUARANTEE_25_YEAR", "SEASONAL", "BREATHTAKING_ITEM", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum j {
    NEW("NEW"),
    LAST_CHANCE("LAST_CHANCE"),
    DELIVERY_COST_ADDED("DELIVERY_COST_ADDED"),
    SUITABLE_FOR_BUSINESS("SUITABLE_FOR_BUSINESS"),
    TOP_SELLER("TOP_SELLER"),
    LIMITED_EDITION("LIMITED_EDITION"),
    ONLINE_EXCLUSIVE("ONLINE_EXCLUSIVE"),
    GUARANTEE_1_YEAR("GUARANTEE_1_YEAR"),
    GUARANTEE_2_YEAR("GUARANTEE_2_YEAR"),
    GUARANTEE_3_YEAR("GUARANTEE_3_YEAR"),
    GUARANTEE_5_YEAR("GUARANTEE_5_YEAR"),
    GUARANTEE_6_YEAR("GUARANTEE_6_YEAR"),
    GUARANTEE_10_YEAR("GUARANTEE_10_YEAR"),
    GUARANTEE_15_YEAR("GUARANTEE_15_YEAR"),
    GUARANTEE_25_YEAR("GUARANTEE_25_YEAR"),
    SEASONAL("SEASONAL"),
    BREATHTAKING_ITEM("BREATHTAKING_ITEM");
    
    /* access modifiers changed from: private */
    public static final C16824o<KSerializer<Object>> $cachedSerializer$delegate = null;
    public static final b Companion = null;
    private final String value;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends C17544u implements C17631a<KSerializer<Object>> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f71586c = null;

        static {
            f71586c = new a();
        }

        a() {
            super(0);
        }

        public final KSerializer<Object> invoke() {
            return J.a("com.ingka.ikea.app.caasremote.models.ProductTagNameRemoteModel", j.values(), new String[]{"NEW", "LAST_CHANCE", "DELIVERY_COST_ADDED", "SUITABLE_FOR_BUSINESS", "TOP_SELLER", "LIMITED_EDITION", "ONLINE_EXCLUSIVE", "GUARANTEE_1_YEAR", "GUARANTEE_2_YEAR", "GUARANTEE_3_YEAR", "GUARANTEE_5_YEAR", "GUARANTEE_6_YEAR", "GUARANTEE_10_YEAR", "GUARANTEE_15_YEAR", "GUARANTEE_25_YEAR", "SEASONAL", "BREATHTAKING_ITEM"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, (Annotation[]) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/j$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/j;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) j.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<j> serializer() {
            return a();
        }

        private b() {
        }
    }

    static {
        j[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new b((DefaultConstructorMarker) null);
        $cachedSerializer$delegate = C16825p.a(s.PUBLICATION, a.f71586c);
    }

    private j(String str) {
        this.value = str;
    }

    public String toString() {
        return this.value;
    }
}
