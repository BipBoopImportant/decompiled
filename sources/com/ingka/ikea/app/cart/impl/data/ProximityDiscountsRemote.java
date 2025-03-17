package com.ingka.ikea.app.cart.impl.data;

import HJ.C15854t;
import YH.C16877v;
import androidx.annotation.Keep;
import com.ingka.ikea.app.cart.impl.data.a;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.M;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00040123B'\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tB;\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ4\u0010\u001d\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R(\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001bR(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u001b¨\u00064"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsRemote;", "Lpp/b;", "Lcom/ingka/ikea/app/cart/impl/data/a;", "", "Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsRemote$ProximityDiscountRemote;", "proximityDiscounts", "Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsRemote$DiscountRemote;", "discounts", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$cart_implementation_release", "(Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toLocal", "()Lcom/ingka/ikea/app/cart/impl/data/a;", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsRemote;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getProximityDiscounts", "getProximityDiscounts$annotations", "()V", "getDiscounts", "getDiscounts$annotations", "Companion", "ProximityDiscountRemote", "DiscountRemote", "$serializer", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProximityDiscountsRemote implements C11768b<a> {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers = {new C17451f(ProximityDiscountsRemote$ProximityDiscountRemote$$serializer.INSTANCE), new C17451f(ProximityDiscountsRemote$DiscountRemote$$serializer.INSTANCE)};
    public static final int $stable = 8;
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final List<DiscountRemote> discounts;
    private final List<ProximityDiscountRemote> proximityDiscounts;

    @Keep
    @p
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\r\b\b\u0018\u0000 ,2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002-.B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB/\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b+\u0010)\u001a\u0004\b\u0006\u0010\u001c¨\u0006/"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsRemote$DiscountRemote;", "Lpp/b;", "Lcom/ingka/ikea/app/cart/impl/data/a$a;", "", "name", "", "isFamily", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$cart_implementation_release", "(Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsRemote$DiscountRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toLocal", "()Lcom/ingka/ikea/app/cart/impl/data/a$a;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsRemote$DiscountRemote;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "Ljava/lang/Boolean;", "isFamily$annotations", "Companion", "$serializer", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DiscountRemote implements C11768b<a.C1229a> {
        public static final int $stable = 0;
        public static final a Companion = new a((DefaultConstructorMarker) null);
        private final Boolean isFamily;
        private final String name;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsRemote$DiscountRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsRemote$DiscountRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<DiscountRemote> serializer() {
                return ProximityDiscountsRemote$DiscountRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ DiscountRemote(int i10, String str, Boolean bool, T0 t02) {
            if (3 != (i10 & 3)) {
                E0.b(i10, 3, ProximityDiscountsRemote$DiscountRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.name = str;
            this.isFamily = bool;
        }

        public static /* synthetic */ DiscountRemote copy$default(DiscountRemote discountRemote, String str, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = discountRemote.name;
            }
            if ((i10 & 2) != 0) {
                bool = discountRemote.isFamily;
            }
            return discountRemote.copy(str, bool);
        }

        public static /* synthetic */ void getName$annotations() {
        }

        public static /* synthetic */ void isFamily$annotations() {
        }

        public static final /* synthetic */ void write$Self$cart_implementation_release(DiscountRemote discountRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.B(serialDescriptor, 0, Y0.f144077a, discountRemote.name);
            dVar.B(serialDescriptor, 1, C17457i.f144111a, discountRemote.isFamily);
        }

        public final String component1() {
            return this.name;
        }

        public final Boolean component2() {
            return this.isFamily;
        }

        public final DiscountRemote copy(String str, Boolean bool) {
            return new DiscountRemote(str, bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DiscountRemote)) {
                return false;
            }
            DiscountRemote discountRemote = (DiscountRemote) obj;
            return C17542s.e(this.name, discountRemote.name) && C17542s.e(this.isFamily, discountRemote.isFamily);
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.name;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isFamily;
            if (bool != null) {
                i10 = bool.hashCode();
            }
            return hashCode + i10;
        }

        public final Boolean isFamily() {
            return this.isFamily;
        }

        public String toString() {
            String str = this.name;
            Boolean bool = this.isFamily;
            return "DiscountRemote(name=" + str + ", isFamily=" + bool + ")";
        }

        public DiscountRemote(String str, Boolean bool) {
            this.name = str;
            this.isFamily = bool;
        }

        public a.C1229a toLocal() {
            String str = this.name;
            if (str == null || C15854t.v0(str)) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Name is null or blank");
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str2 = null;
                String str3 = null;
                for (C11819b bVar : arrayList) {
                    if (str2 == null) {
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 == null) {
                            break;
                        }
                        str2 = C11820c.a(a10);
                    }
                    String str4 = str2;
                    if (str3 == null) {
                        String name2 = DiscountRemote.class.getName();
                        C17542s.g(name2);
                        String o12 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name2 = C15854t.P0(o12, "Kt");
                        }
                        str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    String str5 = str3;
                    bVar.a(eVar, str5, false, illegalArgumentException, str4);
                    str2 = str4;
                    str3 = str5;
                }
                return null;
            }
            String str6 = this.name;
            Boolean bool = this.isFamily;
            return new a.C1229a(str6, bool != null ? bool.booleanValue() : false);
        }
    }

    @Keep
    @p
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0010\b\b\u0018\u0000 32\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u000245B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB9\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J4\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b2\u0010-\u001a\u0004\b\b\u0010 ¨\u00066"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsRemote$ProximityDiscountRemote;", "Lpp/b;", "Lcom/ingka/ikea/app/cart/impl/data/a$b;", "", "name", "", "needed", "", "isFamily", "<init>", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$cart_implementation_release", "(Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsRemote$ProximityDiscountRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toLocal", "()Lcom/ingka/ikea/app/cart/impl/data/a$b;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Float;", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Boolean;)Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsRemote$ProximityDiscountRemote;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "Ljava/lang/Float;", "getNeeded", "getNeeded$annotations", "Ljava/lang/Boolean;", "isFamily$annotations", "Companion", "$serializer", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProximityDiscountRemote implements C11768b<a.b> {
        public static final int $stable = 0;
        public static final a Companion = new a((DefaultConstructorMarker) null);
        private final Boolean isFamily;
        private final String name;
        private final Float needed;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsRemote$ProximityDiscountRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsRemote$ProximityDiscountRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ProximityDiscountRemote> serializer() {
                return ProximityDiscountsRemote$ProximityDiscountRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ProximityDiscountRemote(int i10, String str, Float f10, Boolean bool, T0 t02) {
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, ProximityDiscountsRemote$ProximityDiscountRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.name = str;
            this.needed = f10;
            this.isFamily = bool;
        }

        public static /* synthetic */ ProximityDiscountRemote copy$default(ProximityDiscountRemote proximityDiscountRemote, String str, Float f10, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = proximityDiscountRemote.name;
            }
            if ((i10 & 2) != 0) {
                f10 = proximityDiscountRemote.needed;
            }
            if ((i10 & 4) != 0) {
                bool = proximityDiscountRemote.isFamily;
            }
            return proximityDiscountRemote.copy(str, f10, bool);
        }

        public static /* synthetic */ void getName$annotations() {
        }

        public static /* synthetic */ void getNeeded$annotations() {
        }

        public static /* synthetic */ void isFamily$annotations() {
        }

        public static final /* synthetic */ void write$Self$cart_implementation_release(ProximityDiscountRemote proximityDiscountRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.B(serialDescriptor, 0, Y0.f144077a, proximityDiscountRemote.name);
            dVar.B(serialDescriptor, 1, M.f144051a, proximityDiscountRemote.needed);
            dVar.B(serialDescriptor, 2, C17457i.f144111a, proximityDiscountRemote.isFamily);
        }

        public final String component1() {
            return this.name;
        }

        public final Float component2() {
            return this.needed;
        }

        public final Boolean component3() {
            return this.isFamily;
        }

        public final ProximityDiscountRemote copy(String str, Float f10, Boolean bool) {
            return new ProximityDiscountRemote(str, f10, bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProximityDiscountRemote)) {
                return false;
            }
            ProximityDiscountRemote proximityDiscountRemote = (ProximityDiscountRemote) obj;
            return C17542s.e(this.name, proximityDiscountRemote.name) && C17542s.e(this.needed, proximityDiscountRemote.needed) && C17542s.e(this.isFamily, proximityDiscountRemote.isFamily);
        }

        public final String getName() {
            return this.name;
        }

        public final Float getNeeded() {
            return this.needed;
        }

        public int hashCode() {
            String str = this.name;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Float f10 = this.needed;
            int hashCode2 = (hashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
            Boolean bool = this.isFamily;
            if (bool != null) {
                i10 = bool.hashCode();
            }
            return hashCode2 + i10;
        }

        public final Boolean isFamily() {
            return this.isFamily;
        }

        public String toString() {
            String str = this.name;
            Float f10 = this.needed;
            Boolean bool = this.isFamily;
            return "ProximityDiscountRemote(name=" + str + ", needed=" + f10 + ", isFamily=" + bool + ")";
        }

        public ProximityDiscountRemote(String str, Float f10, Boolean bool) {
            this.name = str;
            this.needed = f10;
            this.isFamily = bool;
        }

        public a.b toLocal() {
            char c10;
            String str;
            String str2 = this.name;
            String str3 = DslKt.INDICATOR_BACKGROUND;
            Class<ProximityDiscountRemote> cls = ProximityDiscountRemote.class;
            if (str2 == null || C15854t.v0(str2)) {
                String str4 = str3;
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Name is null or blank");
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str5 = null;
                String str6 = null;
                for (C11819b bVar : arrayList) {
                    if (str5 == null) {
                        String a10 = C11818a.a((String) null, illegalArgumentException);
                        if (a10 == null) {
                            break;
                        }
                        str5 = C11820c.a(a10);
                    }
                    if (str6 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        c10 = '$';
                        String o12 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name2 = C15854t.P0(o12, "Kt");
                        }
                        str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str4) + DslKt.INDICATOR_SEPARATOR + name2;
                    } else {
                        c10 = '$';
                    }
                    char c11 = c10;
                    bVar.a(eVar, str6, false, illegalArgumentException, str5);
                }
                return null;
            } else if (this.needed == null) {
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Needed amount is null");
                e eVar2 = e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str7 = null;
                String str8 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str7 == null) {
                        String a11 = C11818a.a((String) null, illegalArgumentException2);
                        if (a11 == null) {
                            break;
                        }
                        str7 = C11820c.a(a11);
                    }
                    if (str8 == null) {
                        String name3 = cls.getName();
                        C17542s.g(name3);
                        str = str3;
                        String o13 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name3 = C15854t.P0(o13, "Kt");
                        }
                        str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name3;
                    } else {
                        str = str3;
                    }
                    String str9 = str8;
                    bVar2.a(eVar2, str9, false, illegalArgumentException2, str7);
                    str8 = str9;
                    eVar2 = eVar2;
                    str3 = str;
                }
                return null;
            } else {
                String str10 = this.name;
                float floatValue = this.needed.floatValue();
                Boolean bool = this.isFamily;
                return new a.b(str10, floatValue, bool != null ? bool.booleanValue() : false);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/cart/impl/data/ProximityDiscountsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ProximityDiscountsRemote> serializer() {
            return ProximityDiscountsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProximityDiscountsRemote(int i10, List list, List list2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, ProximityDiscountsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.proximityDiscounts = list;
        this.discounts = list2;
    }

    public static /* synthetic */ ProximityDiscountsRemote copy$default(ProximityDiscountsRemote proximityDiscountsRemote, List<ProximityDiscountRemote> list, List<DiscountRemote> list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = proximityDiscountsRemote.proximityDiscounts;
        }
        if ((i10 & 2) != 0) {
            list2 = proximityDiscountsRemote.discounts;
        }
        return proximityDiscountsRemote.copy(list, list2);
    }

    public static /* synthetic */ void getDiscounts$annotations() {
    }

    public static /* synthetic */ void getProximityDiscounts$annotations() {
    }

    public static final /* synthetic */ void write$Self$cart_implementation_release(ProximityDiscountsRemote proximityDiscountsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        dVar.B(serialDescriptor, 0, kSerializerArr[0], proximityDiscountsRemote.proximityDiscounts);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], proximityDiscountsRemote.discounts);
    }

    public final List<ProximityDiscountRemote> component1() {
        return this.proximityDiscounts;
    }

    public final List<DiscountRemote> component2() {
        return this.discounts;
    }

    public final ProximityDiscountsRemote copy(List<ProximityDiscountRemote> list, List<DiscountRemote> list2) {
        return new ProximityDiscountsRemote(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProximityDiscountsRemote)) {
            return false;
        }
        ProximityDiscountsRemote proximityDiscountsRemote = (ProximityDiscountsRemote) obj;
        return C17542s.e(this.proximityDiscounts, proximityDiscountsRemote.proximityDiscounts) && C17542s.e(this.discounts, proximityDiscountsRemote.discounts);
    }

    public final List<DiscountRemote> getDiscounts() {
        return this.discounts;
    }

    public final List<ProximityDiscountRemote> getProximityDiscounts() {
        return this.proximityDiscounts;
    }

    public int hashCode() {
        List<ProximityDiscountRemote> list = this.proximityDiscounts;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<DiscountRemote> list2 = this.discounts;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        List<ProximityDiscountRemote> list = this.proximityDiscounts;
        List<DiscountRemote> list2 = this.discounts;
        return "ProximityDiscountsRemote(proximityDiscounts=" + list + ", discounts=" + list2 + ")";
    }

    public ProximityDiscountsRemote(List<ProximityDiscountRemote> list, List<DiscountRemote> list2) {
        this.proximityDiscounts = list;
        this.discounts = list2;
    }

    public a toLocal() {
        List list;
        List list2;
        List<ProximityDiscountRemote> list3 = this.proximityDiscounts;
        if (list3 != null) {
            list = new ArrayList();
            for (ProximityDiscountRemote local : list3) {
                a.b local2 = local.toLocal();
                if (local2 != null) {
                    list.add(local2);
                }
            }
        } else {
            list = C16877v.n();
        }
        List<DiscountRemote> list4 = this.discounts;
        if (list4 != null) {
            list2 = new ArrayList();
            for (DiscountRemote local3 : list4) {
                a.C1229a local4 = local3.toLocal();
                if (local4 != null) {
                    list2.add(local4);
                }
            }
        } else {
            list2 = C16877v.n();
        }
        return new a(list, list2);
    }
}
