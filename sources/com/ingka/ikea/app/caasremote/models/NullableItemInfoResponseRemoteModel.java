package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17250c;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bL\b\b\u0018\u0000 v2\u00020\u0001:\u0002w6B\u0002\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011\u0012\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0011\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J(\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*HÁ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010;\u001a\u0004\b8\u00109R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b>\u0010;\u001a\u0004\b<\u00100R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u0010=\u0012\u0004\b@\u0010;\u001a\u0004\b?\u00100R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bD\u0010;\u001a\u0004\bA\u0010CR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bE\u0010=\u0012\u0004\bF\u0010;\u001a\u0004\bE\u00100R\"\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bG\u0010=\u0012\u0004\bI\u0010;\u001a\u0004\bH\u00100R \u0010\r\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bJ\u0010=\u0012\u0004\bL\u0010;\u001a\u0004\bK\u00100R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bM\u0010=\u0012\u0004\bO\u0010;\u001a\u0004\bN\u00100R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\bP\u0010Q\u0012\u0004\bS\u0010;\u001a\u0004\b\u0010\u0010RR&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\bT\u0010U\u0012\u0004\bW\u0010;\u001a\u0004\bG\u0010VR&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\bX\u0010U\u0012\u0004\bY\u0010;\u001a\u0004\bJ\u0010VR&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010U\u0012\u0004\bZ\u0010;\u001a\u0004\bM\u0010VR \u0010\u0018\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b[\u0010=\u0012\u0004\b\\\u0010;\u001a\u0004\bP\u00100R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b]\u0010^\u0012\u0004\ba\u0010;\u001a\u0004\b_\u0010`R&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\bb\u0010U\u0012\u0004\bc\u0010;\u001a\u0004\bT\u0010VR \u0010\u001c\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\bd\u0010Q\u0012\u0004\bf\u0010;\u001a\u0004\be\u0010RR\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0004¢\u0006\u0012\n\u0004\bg\u0010h\u0012\u0004\bk\u0010;\u001a\u0004\bi\u0010jR \u0010 \u001a\u00020\u001f8\u0006X\u0004¢\u0006\u0012\n\u0004\bl\u0010m\u0012\u0004\bo\u0010;\u001a\u0004\bX\u0010nR\"\u0010!\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bp\u0010=\u0012\u0004\br\u0010;\u001a\u0004\bq\u00100R\"\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bs\u0010=\u0012\u0004\bu\u0010;\u001a\u0004\bt\u00100¨\u0006x"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableItemInfoResponseRemoteModel;", "", "", "seen1", "Lcom/ingka/ikea/app/caasremote/models/BusinessStructureRemoteModel;", "businessStructure", "", "category", "description", "Lcom/ingka/ikea/app/caasremote/models/NullableDisplayUnitRemoteModel;", "displayUnit", "energyEfficiencySymbol", "energyLabel", "formattedItemNo", "globalName", "", "isAssemblyRequired", "", "Lcom/ingka/ikea/app/caasremote/models/ImageRemoteModel;", "mainProductImages", "Lcom/ingka/ikea/app/caasremote/models/MaterialRemoteModel;", "materials", "Lcom/ingka/ikea/app/caasremote/models/MeasurementRemoteModel;", "measurements", "name", "numberOfPackages", "Lcom/ingka/ikea/app/caasremote/models/ProductTagRemoteModel;", "productTags", "riskAcknowledgementNeeded", "Lcom/ingka/ikea/app/caasremote/models/NullableTechnicalDetailsRemoteModel;", "technicalDetails", "Lcom/ingka/ikea/app/caasremote/models/m;", "unitCode", "waterLabel", "waterSymbol", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/caasremote/models/BusinessStructureRemoteModel;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/caasremote/models/NullableDisplayUnitRemoteModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;ZLcom/ingka/ikea/app/caasremote/models/NullableTechnicalDetailsRemoteModel;Lcom/ingka/ikea/app/caasremote/models/m;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "l", "(Lcom/ingka/ikea/app/caasremote/models/NullableItemInfoResponseRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/caasremote/models/BusinessStructureRemoteModel;", "getBusinessStructure", "()Lcom/ingka/ikea/app/caasremote/models/BusinessStructureRemoteModel;", "getBusinessStructure$annotations", "()V", "b", "Ljava/lang/String;", "getCategory$annotations", "c", "getDescription$annotations", "d", "Lcom/ingka/ikea/app/caasremote/models/NullableDisplayUnitRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/NullableDisplayUnitRemoteModel;", "getDisplayUnit$annotations", "e", "getEnergyEfficiencySymbol$annotations", "f", "getEnergyLabel", "getEnergyLabel$annotations", "g", "getFormattedItemNo", "getFormattedItemNo$annotations", "h", "getGlobalName", "getGlobalName$annotations", "i", "Z", "()Z", "isAssemblyRequired$annotations", "j", "Ljava/util/List;", "()Ljava/util/List;", "getMainProductImages$annotations", "k", "getMaterials$annotations", "getMeasurements$annotations", "m", "getName$annotations", "n", "Ljava/lang/Integer;", "getNumberOfPackages", "()Ljava/lang/Integer;", "getNumberOfPackages$annotations", "o", "getProductTags$annotations", "p", "getRiskAcknowledgementNeeded", "getRiskAcknowledgementNeeded$annotations", "q", "Lcom/ingka/ikea/app/caasremote/models/NullableTechnicalDetailsRemoteModel;", "getTechnicalDetails", "()Lcom/ingka/ikea/app/caasremote/models/NullableTechnicalDetailsRemoteModel;", "getTechnicalDetails$annotations", "r", "Lcom/ingka/ikea/app/caasremote/models/m;", "()Lcom/ingka/ikea/app/caasremote/models/m;", "getUnitCode$annotations", "s", "getWaterLabel", "getWaterLabel$annotations", "t", "getWaterSymbol", "getWaterSymbol$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NullableItemInfoResponseRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public static final KSerializer<Object>[] f71312u = {null, null, null, null, null, null, null, null, null, new C17451f(ImageRemoteModel$$serializer.INSTANCE), new C17451f(MaterialRemoteModel$$serializer.INSTANCE), new C17451f(MeasurementRemoteModel$$serializer.INSTANCE), null, null, new C17451f(ProductTagRemoteModel$$serializer.INSTANCE), null, null, new C17250c(P.b(m.class), m.Companion.serializer(), new KSerializer[0]), null, null};

    /* renamed from: a  reason: collision with root package name */
    private final BusinessStructureRemoteModel f71313a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71314b;

    /* renamed from: c  reason: collision with root package name */
    private final String f71315c;

    /* renamed from: d  reason: collision with root package name */
    private final NullableDisplayUnitRemoteModel f71316d;

    /* renamed from: e  reason: collision with root package name */
    private final String f71317e;

    /* renamed from: f  reason: collision with root package name */
    private final String f71318f;

    /* renamed from: g  reason: collision with root package name */
    private final String f71319g;

    /* renamed from: h  reason: collision with root package name */
    private final String f71320h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f71321i;

    /* renamed from: j  reason: collision with root package name */
    private final List<ImageRemoteModel> f71322j;

    /* renamed from: k  reason: collision with root package name */
    private final List<MaterialRemoteModel> f71323k;

    /* renamed from: l  reason: collision with root package name */
    private final List<MeasurementRemoteModel> f71324l;

    /* renamed from: m  reason: collision with root package name */
    private final String f71325m;

    /* renamed from: n  reason: collision with root package name */
    private final Integer f71326n;

    /* renamed from: o  reason: collision with root package name */
    private final List<ProductTagRemoteModel> f71327o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f71328p;

    /* renamed from: q  reason: collision with root package name */
    private final NullableTechnicalDetailsRemoteModel f71329q;

    /* renamed from: r  reason: collision with root package name */
    private final m f71330r;

    /* renamed from: s  reason: collision with root package name */
    private final String f71331s;

    /* renamed from: t  reason: collision with root package name */
    private final String f71332t;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/NullableItemInfoResponseRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/NullableItemInfoResponseRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NullableItemInfoResponseRemoteModel> serializer() {
            return NullableItemInfoResponseRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ NullableItemInfoResponseRemoteModel(int i10, BusinessStructureRemoteModel businessStructureRemoteModel, String str, String str2, NullableDisplayUnitRemoteModel nullableDisplayUnitRemoteModel, String str3, String str4, String str5, String str6, boolean z10, List list, List list2, List list3, String str7, Integer num, List list4, boolean z11, NullableTechnicalDetailsRemoteModel nullableTechnicalDetailsRemoteModel, m mVar, String str8, String str9, T0 t02) {
        if (1048575 != (i10 & 1048575)) {
            E0.b(i10, 1048575, NullableItemInfoResponseRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71313a = businessStructureRemoteModel;
        this.f71314b = str;
        this.f71315c = str2;
        this.f71316d = nullableDisplayUnitRemoteModel;
        this.f71317e = str3;
        this.f71318f = str4;
        this.f71319g = str5;
        this.f71320h = str6;
        this.f71321i = z10;
        this.f71322j = list;
        this.f71323k = list2;
        this.f71324l = list3;
        this.f71325m = str7;
        this.f71326n = num;
        this.f71327o = list4;
        this.f71328p = z11;
        this.f71329q = nullableTechnicalDetailsRemoteModel;
        this.f71330r = mVar;
        this.f71331s = str8;
        this.f71332t = str9;
    }

    public static final /* synthetic */ void l(NullableItemInfoResponseRemoteModel nullableItemInfoResponseRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71312u;
        dVar.i(serialDescriptor, 0, BusinessStructureRemoteModel$$serializer.INSTANCE, nullableItemInfoResponseRemoteModel.f71313a);
        dVar.y(serialDescriptor, 1, nullableItemInfoResponseRemoteModel.f71314b);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 2, y02, nullableItemInfoResponseRemoteModel.f71315c);
        dVar.B(serialDescriptor, 3, NullableDisplayUnitRemoteModel$$serializer.INSTANCE, nullableItemInfoResponseRemoteModel.f71316d);
        dVar.B(serialDescriptor, 4, y02, nullableItemInfoResponseRemoteModel.f71317e);
        dVar.B(serialDescriptor, 5, y02, nullableItemInfoResponseRemoteModel.f71318f);
        dVar.y(serialDescriptor, 6, nullableItemInfoResponseRemoteModel.f71319g);
        dVar.B(serialDescriptor, 7, y02, nullableItemInfoResponseRemoteModel.f71320h);
        dVar.x(serialDescriptor, 8, nullableItemInfoResponseRemoteModel.f71321i);
        dVar.i(serialDescriptor, 9, kSerializerArr[9], nullableItemInfoResponseRemoteModel.f71322j);
        dVar.i(serialDescriptor, 10, kSerializerArr[10], nullableItemInfoResponseRemoteModel.f71323k);
        dVar.i(serialDescriptor, 11, kSerializerArr[11], nullableItemInfoResponseRemoteModel.f71324l);
        dVar.y(serialDescriptor, 12, nullableItemInfoResponseRemoteModel.f71325m);
        dVar.B(serialDescriptor, 13, X.f144073a, nullableItemInfoResponseRemoteModel.f71326n);
        dVar.i(serialDescriptor, 14, kSerializerArr[14], nullableItemInfoResponseRemoteModel.f71327o);
        dVar.x(serialDescriptor, 15, nullableItemInfoResponseRemoteModel.f71328p);
        dVar.B(serialDescriptor, 16, NullableTechnicalDetailsRemoteModel$$serializer.INSTANCE, nullableItemInfoResponseRemoteModel.f71329q);
        dVar.i(serialDescriptor, 17, kSerializerArr[17], nullableItemInfoResponseRemoteModel.f71330r);
        dVar.B(serialDescriptor, 18, y02, nullableItemInfoResponseRemoteModel.f71331s);
        dVar.B(serialDescriptor, 19, y02, nullableItemInfoResponseRemoteModel.f71332t);
    }

    public final String b() {
        return this.f71314b;
    }

    public final String c() {
        return this.f71315c;
    }

    public final NullableDisplayUnitRemoteModel d() {
        return this.f71316d;
    }

    public final String e() {
        return this.f71317e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullableItemInfoResponseRemoteModel)) {
            return false;
        }
        NullableItemInfoResponseRemoteModel nullableItemInfoResponseRemoteModel = (NullableItemInfoResponseRemoteModel) obj;
        return C17542s.e(this.f71313a, nullableItemInfoResponseRemoteModel.f71313a) && C17542s.e(this.f71314b, nullableItemInfoResponseRemoteModel.f71314b) && C17542s.e(this.f71315c, nullableItemInfoResponseRemoteModel.f71315c) && C17542s.e(this.f71316d, nullableItemInfoResponseRemoteModel.f71316d) && C17542s.e(this.f71317e, nullableItemInfoResponseRemoteModel.f71317e) && C17542s.e(this.f71318f, nullableItemInfoResponseRemoteModel.f71318f) && C17542s.e(this.f71319g, nullableItemInfoResponseRemoteModel.f71319g) && C17542s.e(this.f71320h, nullableItemInfoResponseRemoteModel.f71320h) && this.f71321i == nullableItemInfoResponseRemoteModel.f71321i && C17542s.e(this.f71322j, nullableItemInfoResponseRemoteModel.f71322j) && C17542s.e(this.f71323k, nullableItemInfoResponseRemoteModel.f71323k) && C17542s.e(this.f71324l, nullableItemInfoResponseRemoteModel.f71324l) && C17542s.e(this.f71325m, nullableItemInfoResponseRemoteModel.f71325m) && C17542s.e(this.f71326n, nullableItemInfoResponseRemoteModel.f71326n) && C17542s.e(this.f71327o, nullableItemInfoResponseRemoteModel.f71327o) && this.f71328p == nullableItemInfoResponseRemoteModel.f71328p && C17542s.e(this.f71329q, nullableItemInfoResponseRemoteModel.f71329q) && this.f71330r == nullableItemInfoResponseRemoteModel.f71330r && C17542s.e(this.f71331s, nullableItemInfoResponseRemoteModel.f71331s) && C17542s.e(this.f71332t, nullableItemInfoResponseRemoteModel.f71332t);
    }

    public final List<ImageRemoteModel> f() {
        return this.f71322j;
    }

    public final List<MaterialRemoteModel> g() {
        return this.f71323k;
    }

    public final List<MeasurementRemoteModel> h() {
        return this.f71324l;
    }

    public int hashCode() {
        int hashCode = ((this.f71313a.hashCode() * 31) + this.f71314b.hashCode()) * 31;
        String str = this.f71315c;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        NullableDisplayUnitRemoteModel nullableDisplayUnitRemoteModel = this.f71316d;
        int hashCode3 = (hashCode2 + (nullableDisplayUnitRemoteModel == null ? 0 : nullableDisplayUnitRemoteModel.hashCode())) * 31;
        String str2 = this.f71317e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f71318f;
        int hashCode5 = (((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f71319g.hashCode()) * 31;
        String str4 = this.f71320h;
        int hashCode6 = (((((((((((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.f71321i)) * 31) + this.f71322j.hashCode()) * 31) + this.f71323k.hashCode()) * 31) + this.f71324l.hashCode()) * 31) + this.f71325m.hashCode()) * 31;
        Integer num = this.f71326n;
        int hashCode7 = (((((hashCode6 + (num == null ? 0 : num.hashCode())) * 31) + this.f71327o.hashCode()) * 31) + Boolean.hashCode(this.f71328p)) * 31;
        NullableTechnicalDetailsRemoteModel nullableTechnicalDetailsRemoteModel = this.f71329q;
        int hashCode8 = (((hashCode7 + (nullableTechnicalDetailsRemoteModel == null ? 0 : nullableTechnicalDetailsRemoteModel.hashCode())) * 31) + this.f71330r.hashCode()) * 31;
        String str5 = this.f71331s;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f71332t;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return hashCode9 + i10;
    }

    public final String i() {
        return this.f71325m;
    }

    public final List<ProductTagRemoteModel> j() {
        return this.f71327o;
    }

    public final m k() {
        return this.f71330r;
    }

    public String toString() {
        BusinessStructureRemoteModel businessStructureRemoteModel = this.f71313a;
        String str = this.f71314b;
        String str2 = this.f71315c;
        NullableDisplayUnitRemoteModel nullableDisplayUnitRemoteModel = this.f71316d;
        String str3 = this.f71317e;
        String str4 = this.f71318f;
        String str5 = this.f71319g;
        String str6 = this.f71320h;
        boolean z10 = this.f71321i;
        List<ImageRemoteModel> list = this.f71322j;
        List<MaterialRemoteModel> list2 = this.f71323k;
        List<MeasurementRemoteModel> list3 = this.f71324l;
        String str7 = this.f71325m;
        Integer num = this.f71326n;
        List<ProductTagRemoteModel> list4 = this.f71327o;
        boolean z11 = this.f71328p;
        NullableTechnicalDetailsRemoteModel nullableTechnicalDetailsRemoteModel = this.f71329q;
        m mVar = this.f71330r;
        String str8 = this.f71331s;
        String str9 = this.f71332t;
        return "NullableItemInfoResponseRemoteModel(businessStructure=" + businessStructureRemoteModel + ", category=" + str + ", description=" + str2 + ", displayUnit=" + nullableDisplayUnitRemoteModel + ", energyEfficiencySymbol=" + str3 + ", energyLabel=" + str4 + ", formattedItemNo=" + str5 + ", globalName=" + str6 + ", isAssemblyRequired=" + z10 + ", mainProductImages=" + list + ", materials=" + list2 + ", measurements=" + list3 + ", name=" + str7 + ", numberOfPackages=" + num + ", productTags=" + list4 + ", riskAcknowledgementNeeded=" + z11 + ", technicalDetails=" + nullableTechnicalDetailsRemoteModel + ", unitCode=" + mVar + ", waterLabel=" + str8 + ", waterSymbol=" + str9 + ")";
    }
}
