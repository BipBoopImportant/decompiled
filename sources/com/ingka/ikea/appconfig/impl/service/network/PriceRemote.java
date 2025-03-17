package com.ingka.ikea.appconfig.impl.service.network;

import Rl.h;
import fK.p;
import iK.C17395d;
import jK.C17457i;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\"\b\b\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002C\u001bBu\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010&\u0012\u0004\b,\u0010*\u001a\u0004\b+\u0010(R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010&\u0012\u0004\b/\u0010*\u001a\u0004\b.\u0010(R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010&\u0012\u0004\b2\u0010*\u001a\u0004\b1\u0010(R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010&\u0012\u0004\b5\u0010*\u001a\u0004\b4\u0010(R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010&\u0012\u0004\b8\u0010*\u001a\u0004\b7\u0010(R\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b9\u0010&\u0012\u0004\b;\u0010*\u001a\u0004\b:\u0010(R\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010&\u0012\u0004\b>\u0010*\u001a\u0004\b=\u0010(R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u0010&\u0012\u0004\bA\u0010*\u001a\u0004\b@\u0010(¨\u0006D"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/PriceRemote;", "Lpp/b;", "LRl/h;", "", "seen0", "", "detailedUnitPrice", "perPiecePrice", "showFoodComparisionPrice", "formerPriceCrossOutNLP", "formerPriceCrossOutTRO", "showNLPDateInterval", "showVATInformation", "enablePrf", "showPricesInclVat", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/appconfig/impl/service/network/PriceRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LRl/h;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getDetailedUnitPrice", "()Ljava/lang/Boolean;", "getDetailedUnitPrice$annotations", "()V", "getPerPiecePrice", "getPerPiecePrice$annotations", "c", "getShowFoodComparisionPrice", "getShowFoodComparisionPrice$annotations", "d", "getFormerPriceCrossOutNLP", "getFormerPriceCrossOutNLP$annotations", "e", "getFormerPriceCrossOutTRO", "getFormerPriceCrossOutTRO$annotations", "f", "getShowNLPDateInterval", "getShowNLPDateInterval$annotations", "g", "getShowVATInformation", "getShowVATInformation$annotations", "h", "getEnablePrf", "getEnablePrf$annotations", "i", "getShowPricesInclVat", "getShowPricesInclVat$annotations", "Companion", "$serializer", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PriceRemote implements C11768b<h> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Boolean f92973a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f92974b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f92975c;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f92976d;

    /* renamed from: e  reason: collision with root package name */
    private final Boolean f92977e;

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f92978f;

    /* renamed from: g  reason: collision with root package name */
    private final Boolean f92979g;

    /* renamed from: h  reason: collision with root package name */
    private final Boolean f92980h;

    /* renamed from: i  reason: collision with root package name */
    private final Boolean f92981i;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/PriceRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/impl/service/network/PriceRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PriceRemote> serializer() {
            return PriceRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PriceRemote(int i10, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, T0 t02) {
        if (511 != (i10 & 511)) {
            E0.b(i10, 511, PriceRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f92973a = bool;
        this.f92974b = bool2;
        this.f92975c = bool3;
        this.f92976d = bool4;
        this.f92977e = bool5;
        this.f92978f = bool6;
        this.f92979g = bool7;
        this.f92980h = bool8;
        this.f92981i = bool9;
    }

    public static final /* synthetic */ void b(PriceRemote priceRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        C17457i iVar = C17457i.f144111a;
        dVar.B(serialDescriptor, 0, iVar, priceRemote.f92973a);
        dVar.B(serialDescriptor, 1, iVar, priceRemote.f92974b);
        dVar.B(serialDescriptor, 2, iVar, priceRemote.f92975c);
        dVar.B(serialDescriptor, 3, iVar, priceRemote.f92976d);
        dVar.B(serialDescriptor, 4, iVar, priceRemote.f92977e);
        dVar.B(serialDescriptor, 5, iVar, priceRemote.f92978f);
        dVar.B(serialDescriptor, 6, iVar, priceRemote.f92979g);
        dVar.B(serialDescriptor, 7, iVar, priceRemote.f92980h);
        dVar.B(serialDescriptor, 8, iVar, priceRemote.f92981i);
    }

    public h a() {
        Boolean bool = this.f92973a;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = this.f92974b;
            if (bool2 != null) {
                boolean booleanValue2 = bool2.booleanValue();
                Boolean bool3 = this.f92975c;
                if (bool3 != null) {
                    boolean booleanValue3 = bool3.booleanValue();
                    Boolean bool4 = this.f92976d;
                    if (bool4 != null) {
                        boolean booleanValue4 = bool4.booleanValue();
                        Boolean bool5 = this.f92977e;
                        if (bool5 != null) {
                            boolean booleanValue5 = bool5.booleanValue();
                            Boolean bool6 = this.f92978f;
                            if (bool6 != null) {
                                boolean booleanValue6 = bool6.booleanValue();
                                Boolean bool7 = this.f92979g;
                                if (bool7 != null) {
                                    boolean booleanValue7 = bool7.booleanValue();
                                    Boolean bool8 = this.f92980h;
                                    if (bool8 != null) {
                                        boolean booleanValue8 = bool8.booleanValue();
                                        Boolean bool9 = this.f92981i;
                                        if (bool9 != null) {
                                            return new h(booleanValue, booleanValue2, booleanValue3, booleanValue4, booleanValue5, booleanValue6, booleanValue7, booleanValue8, bool9.booleanValue());
                                        }
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceRemote)) {
            return false;
        }
        PriceRemote priceRemote = (PriceRemote) obj;
        return C17542s.e(this.f92973a, priceRemote.f92973a) && C17542s.e(this.f92974b, priceRemote.f92974b) && C17542s.e(this.f92975c, priceRemote.f92975c) && C17542s.e(this.f92976d, priceRemote.f92976d) && C17542s.e(this.f92977e, priceRemote.f92977e) && C17542s.e(this.f92978f, priceRemote.f92978f) && C17542s.e(this.f92979g, priceRemote.f92979g) && C17542s.e(this.f92980h, priceRemote.f92980h) && C17542s.e(this.f92981i, priceRemote.f92981i);
    }

    public int hashCode() {
        Boolean bool = this.f92973a;
        int i10 = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.f92974b;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f92975c;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f92976d;
        int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f92977e;
        int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.f92978f;
        int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.f92979g;
        int hashCode7 = (hashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.f92980h;
        int hashCode8 = (hashCode7 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.f92981i;
        if (bool9 != null) {
            i10 = bool9.hashCode();
        }
        return hashCode8 + i10;
    }

    public String toString() {
        Boolean bool = this.f92973a;
        Boolean bool2 = this.f92974b;
        Boolean bool3 = this.f92975c;
        Boolean bool4 = this.f92976d;
        Boolean bool5 = this.f92977e;
        Boolean bool6 = this.f92978f;
        Boolean bool7 = this.f92979g;
        Boolean bool8 = this.f92980h;
        Boolean bool9 = this.f92981i;
        return "PriceRemote(detailedUnitPrice=" + bool + ", perPiecePrice=" + bool2 + ", showFoodComparisionPrice=" + bool3 + ", formerPriceCrossOutNLP=" + bool4 + ", formerPriceCrossOutTRO=" + bool5 + ", showNLPDateInterval=" + bool6 + ", showVATInformation=" + bool7 + ", enablePrf=" + bool8 + ", showPricesInclVat=" + bool9 + ")";
    }
}
