package com.ingka.ikea.core.model.product;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import fK.C17261n;
import fK.p;
import iK.C17395d;
import jK.T0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import op.C11695f;
import uI.C18055d;

@p
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00118&X§\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00118&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198&X§\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001a\u0010\u001b\u0001\u0005 !\"#$¨\u0006%"}, d2 = {"Lcom/ingka/ikea/core/model/product/a;", "", "<init>", "()V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "g", "(Lcom/ingka/ikea/core/model/product/a;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/core/model/product/Price;", "e", "()Lcom/ingka/ikea/core/model/product/Price;", "getIncludingVat$annotations", "includingVat", "d", "getExcludingVat$annotations", "excludingVat", "", "f", "()Ljava/lang/String;", "getIndicativeDiscount$annotations", "indicativeDiscount", "Companion", "a", "Lcom/ingka/ikea/core/model/product/BtiPrice;", "Lcom/ingka/ikea/core/model/product/FamilyPrice;", "Lcom/ingka/ikea/core/model/product/NewLowerPrice;", "Lcom/ingka/ikea/core/model/product/RegularPrice;", "Lcom/ingka/ikea/core/model/product/TimeRestrictedPrice;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {
    public static final C2118a Companion = new C2118a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C16824o<KSerializer<Object>> f95172a = C16825p.a(s.PUBLICATION, new C11695f());

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/a$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/model/product/a;", "serializer", "()Lkotlinx/serialization/KSerializer;", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.core.model.product.a$a  reason: collision with other inner class name */
    public static final class C2118a {
        private C2118a() {
        }

        private final /* synthetic */ KSerializer a() {
            return (KSerializer) a.f95172a.getValue();
        }

        public final KSerializer<a> serializer() {
            return a();
        }

        public /* synthetic */ C2118a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return new C17261n("com.ingka.ikea.core.model.product.PricePackage", P.b(a.class), new C18055d[]{P.b(BtiPrice.class), P.b(FamilyPrice.class), P.b(NewLowerPrice.class), P.b(RegularPrice.class), P.b(TimeRestrictedPrice.class)}, new KSerializer[]{BtiPrice$$serializer.INSTANCE, FamilyPrice$$serializer.INSTANCE, NewLowerPrice$$serializer.INSTANCE, RegularPrice$$serializer.INSTANCE, TimeRestrictedPrice$$serializer.INSTANCE}, new Annotation[0]);
    }

    public static final /* synthetic */ void g(a aVar, C17395d dVar, SerialDescriptor serialDescriptor) {
    }

    public abstract Price d();

    public abstract Price e();

    public abstract String f();

    private a() {
    }

    public /* synthetic */ a(int i10, T0 t02) {
    }
}
