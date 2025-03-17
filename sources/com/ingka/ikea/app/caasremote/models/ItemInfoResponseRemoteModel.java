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
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bV\b\b\u0018\u0000 \u00012\u00020\u0001:\u0003\u00016B\u0002\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011\u0012\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0011\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J(\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020\u00002\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*HÁ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010;\u001a\u0004\b8\u00109R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010<\u0012\u0004\b>\u0010;\u001a\u0004\b=\u00100R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b?\u0010<\u0012\u0004\bA\u0010;\u001a\u0004\b@\u00100R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u0010;\u001a\u0004\bD\u0010ER\"\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bG\u0010<\u0012\u0004\bI\u0010;\u001a\u0004\bH\u00100R\"\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bJ\u0010<\u0012\u0004\bL\u0010;\u001a\u0004\bK\u00100R \u0010\r\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bM\u0010<\u0012\u0004\bO\u0010;\u001a\u0004\bN\u00100R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bP\u0010<\u0012\u0004\bR\u0010;\u001a\u0004\bQ\u00100R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\bS\u0010T\u0012\u0004\bV\u0010;\u001a\u0004\b\u0010\u0010UR&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\bW\u0010X\u0012\u0004\b[\u0010;\u001a\u0004\bY\u0010ZR&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b\\\u0010X\u0012\u0004\b^\u0010;\u001a\u0004\b]\u0010ZR&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\b_\u0010X\u0012\u0004\ba\u0010;\u001a\u0004\b`\u0010ZR \u0010\u0018\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bb\u0010<\u0012\u0004\bd\u0010;\u001a\u0004\bc\u00100R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\be\u0010f\u0012\u0004\bi\u0010;\u001a\u0004\bg\u0010hR&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\bj\u0010X\u0012\u0004\bl\u0010;\u001a\u0004\bk\u0010ZR \u0010\u001c\u001a\u00020\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\bm\u0010T\u0012\u0004\bo\u0010;\u001a\u0004\bn\u0010UR\"\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0004¢\u0006\u0012\n\u0004\bp\u0010q\u0012\u0004\bt\u0010;\u001a\u0004\br\u0010sR \u0010 \u001a\u00020\u001f8\u0006X\u0004¢\u0006\u0012\n\u0004\bu\u0010v\u0012\u0004\by\u0010;\u001a\u0004\bw\u0010xR\"\u0010!\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\bz\u0010<\u0012\u0004\b|\u0010;\u001a\u0004\b{\u00100R\"\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b}\u0010<\u0012\u0004\b\u0010;\u001a\u0004\b~\u00100¨\u0006\u0001"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/ItemInfoResponseRemoteModel;", "", "", "seen1", "Lcom/ingka/ikea/app/caasremote/models/BusinessStructureRemoteModel;", "businessStructure", "", "category", "description", "Lcom/ingka/ikea/app/caasremote/models/NullableDisplayUnitRemoteModel;", "displayUnit", "energyEfficiencySymbol", "energyLabel", "formattedItemNo", "globalName", "", "isAssemblyRequired", "", "Lcom/ingka/ikea/app/caasremote/models/ImageRemoteModel;", "mainProductImages", "Lcom/ingka/ikea/app/caasremote/models/MaterialRemoteModel;", "materials", "Lcom/ingka/ikea/app/caasremote/models/MeasurementRemoteModel;", "measurements", "name", "numberOfPackages", "Lcom/ingka/ikea/app/caasremote/models/ProductTagRemoteModel;", "productTags", "riskAcknowledgementNeeded", "Lcom/ingka/ikea/app/caasremote/models/NullableTechnicalDetailsRemoteModel;", "technicalDetails", "Lcom/ingka/ikea/app/caasremote/models/m;", "unitCode", "waterLabel", "waterSymbol", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/caasremote/models/BusinessStructureRemoteModel;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/caasremote/models/NullableDisplayUnitRemoteModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;ZLcom/ingka/ikea/app/caasremote/models/NullableTechnicalDetailsRemoteModel;Lcom/ingka/ikea/app/caasremote/models/m;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/caasremote/models/ItemInfoResponseRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/caasremote/models/BusinessStructureRemoteModel;", "getBusinessStructure", "()Lcom/ingka/ikea/app/caasremote/models/BusinessStructureRemoteModel;", "getBusinessStructure$annotations", "()V", "Ljava/lang/String;", "getCategory", "getCategory$annotations", "c", "getDescription", "getDescription$annotations", "d", "Lcom/ingka/ikea/app/caasremote/models/NullableDisplayUnitRemoteModel;", "getDisplayUnit", "()Lcom/ingka/ikea/app/caasremote/models/NullableDisplayUnitRemoteModel;", "getDisplayUnit$annotations", "e", "getEnergyEfficiencySymbol", "getEnergyEfficiencySymbol$annotations", "f", "getEnergyLabel", "getEnergyLabel$annotations", "g", "getFormattedItemNo", "getFormattedItemNo$annotations", "h", "getGlobalName", "getGlobalName$annotations", "i", "Z", "()Z", "isAssemblyRequired$annotations", "j", "Ljava/util/List;", "getMainProductImages", "()Ljava/util/List;", "getMainProductImages$annotations", "k", "getMaterials", "getMaterials$annotations", "l", "getMeasurements", "getMeasurements$annotations", "m", "getName", "getName$annotations", "n", "Ljava/lang/Integer;", "getNumberOfPackages", "()Ljava/lang/Integer;", "getNumberOfPackages$annotations", "o", "getProductTags", "getProductTags$annotations", "p", "getRiskAcknowledgementNeeded", "getRiskAcknowledgementNeeded$annotations", "q", "Lcom/ingka/ikea/app/caasremote/models/NullableTechnicalDetailsRemoteModel;", "getTechnicalDetails", "()Lcom/ingka/ikea/app/caasremote/models/NullableTechnicalDetailsRemoteModel;", "getTechnicalDetails$annotations", "r", "Lcom/ingka/ikea/app/caasremote/models/m;", "getUnitCode", "()Lcom/ingka/ikea/app/caasremote/models/m;", "getUnitCode$annotations", "s", "getWaterLabel", "getWaterLabel$annotations", "t", "getWaterSymbol", "getWaterSymbol$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ItemInfoResponseRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public static final KSerializer<Object>[] f71162u = {null, null, null, null, null, null, null, null, null, new C17451f(ImageRemoteModel$$serializer.INSTANCE), new C17451f(MaterialRemoteModel$$serializer.INSTANCE), new C17451f(MeasurementRemoteModel$$serializer.INSTANCE), null, null, new C17451f(ProductTagRemoteModel$$serializer.INSTANCE), null, null, new C17250c(P.b(m.class), m.Companion.serializer(), new KSerializer[0]), null, null};

    /* renamed from: a  reason: collision with root package name */
    private final BusinessStructureRemoteModel f71163a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71164b;

    /* renamed from: c  reason: collision with root package name */
    private final String f71165c;

    /* renamed from: d  reason: collision with root package name */
    private final NullableDisplayUnitRemoteModel f71166d;

    /* renamed from: e  reason: collision with root package name */
    private final String f71167e;

    /* renamed from: f  reason: collision with root package name */
    private final String f71168f;

    /* renamed from: g  reason: collision with root package name */
    private final String f71169g;

    /* renamed from: h  reason: collision with root package name */
    private final String f71170h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f71171i;

    /* renamed from: j  reason: collision with root package name */
    private final List<ImageRemoteModel> f71172j;

    /* renamed from: k  reason: collision with root package name */
    private final List<MaterialRemoteModel> f71173k;

    /* renamed from: l  reason: collision with root package name */
    private final List<MeasurementRemoteModel> f71174l;

    /* renamed from: m  reason: collision with root package name */
    private final String f71175m;

    /* renamed from: n  reason: collision with root package name */
    private final Integer f71176n;

    /* renamed from: o  reason: collision with root package name */
    private final List<ProductTagRemoteModel> f71177o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f71178p;

    /* renamed from: q  reason: collision with root package name */
    private final NullableTechnicalDetailsRemoteModel f71179q;

    /* renamed from: r  reason: collision with root package name */
    private final m f71180r;

    /* renamed from: s  reason: collision with root package name */
    private final String f71181s;

    /* renamed from: t  reason: collision with root package name */
    private final String f71182t;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/ItemInfoResponseRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/ItemInfoResponseRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ItemInfoResponseRemoteModel> serializer() {
            return ItemInfoResponseRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ ItemInfoResponseRemoteModel(int i10, BusinessStructureRemoteModel businessStructureRemoteModel, String str, String str2, NullableDisplayUnitRemoteModel nullableDisplayUnitRemoteModel, String str3, String str4, String str5, String str6, boolean z10, List list, List list2, List list3, String str7, Integer num, List list4, boolean z11, NullableTechnicalDetailsRemoteModel nullableTechnicalDetailsRemoteModel, m mVar, String str8, String str9, T0 t02) {
        if (1048575 != (i10 & 1048575)) {
            E0.b(i10, 1048575, ItemInfoResponseRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71163a = businessStructureRemoteModel;
        this.f71164b = str;
        this.f71165c = str2;
        this.f71166d = nullableDisplayUnitRemoteModel;
        this.f71167e = str3;
        this.f71168f = str4;
        this.f71169g = str5;
        this.f71170h = str6;
        this.f71171i = z10;
        this.f71172j = list;
        this.f71173k = list2;
        this.f71174l = list3;
        this.f71175m = str7;
        this.f71176n = num;
        this.f71177o = list4;
        this.f71178p = z11;
        this.f71179q = nullableTechnicalDetailsRemoteModel;
        this.f71180r = mVar;
        this.f71181s = str8;
        this.f71182t = str9;
    }

    public static final /* synthetic */ void b(ItemInfoResponseRemoteModel itemInfoResponseRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71162u;
        dVar.i(serialDescriptor, 0, BusinessStructureRemoteModel$$serializer.INSTANCE, itemInfoResponseRemoteModel.f71163a);
        dVar.y(serialDescriptor, 1, itemInfoResponseRemoteModel.f71164b);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 2, y02, itemInfoResponseRemoteModel.f71165c);
        dVar.B(serialDescriptor, 3, NullableDisplayUnitRemoteModel$$serializer.INSTANCE, itemInfoResponseRemoteModel.f71166d);
        dVar.B(serialDescriptor, 4, y02, itemInfoResponseRemoteModel.f71167e);
        dVar.B(serialDescriptor, 5, y02, itemInfoResponseRemoteModel.f71168f);
        dVar.y(serialDescriptor, 6, itemInfoResponseRemoteModel.f71169g);
        dVar.B(serialDescriptor, 7, y02, itemInfoResponseRemoteModel.f71170h);
        dVar.x(serialDescriptor, 8, itemInfoResponseRemoteModel.f71171i);
        dVar.i(serialDescriptor, 9, kSerializerArr[9], itemInfoResponseRemoteModel.f71172j);
        dVar.i(serialDescriptor, 10, kSerializerArr[10], itemInfoResponseRemoteModel.f71173k);
        dVar.i(serialDescriptor, 11, kSerializerArr[11], itemInfoResponseRemoteModel.f71174l);
        dVar.y(serialDescriptor, 12, itemInfoResponseRemoteModel.f71175m);
        dVar.B(serialDescriptor, 13, X.f144073a, itemInfoResponseRemoteModel.f71176n);
        dVar.i(serialDescriptor, 14, kSerializerArr[14], itemInfoResponseRemoteModel.f71177o);
        dVar.x(serialDescriptor, 15, itemInfoResponseRemoteModel.f71178p);
        dVar.B(serialDescriptor, 16, NullableTechnicalDetailsRemoteModel$$serializer.INSTANCE, itemInfoResponseRemoteModel.f71179q);
        dVar.i(serialDescriptor, 17, kSerializerArr[17], itemInfoResponseRemoteModel.f71180r);
        dVar.B(serialDescriptor, 18, y02, itemInfoResponseRemoteModel.f71181s);
        dVar.B(serialDescriptor, 19, y02, itemInfoResponseRemoteModel.f71182t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemInfoResponseRemoteModel)) {
            return false;
        }
        ItemInfoResponseRemoteModel itemInfoResponseRemoteModel = (ItemInfoResponseRemoteModel) obj;
        return C17542s.e(this.f71163a, itemInfoResponseRemoteModel.f71163a) && C17542s.e(this.f71164b, itemInfoResponseRemoteModel.f71164b) && C17542s.e(this.f71165c, itemInfoResponseRemoteModel.f71165c) && C17542s.e(this.f71166d, itemInfoResponseRemoteModel.f71166d) && C17542s.e(this.f71167e, itemInfoResponseRemoteModel.f71167e) && C17542s.e(this.f71168f, itemInfoResponseRemoteModel.f71168f) && C17542s.e(this.f71169g, itemInfoResponseRemoteModel.f71169g) && C17542s.e(this.f71170h, itemInfoResponseRemoteModel.f71170h) && this.f71171i == itemInfoResponseRemoteModel.f71171i && C17542s.e(this.f71172j, itemInfoResponseRemoteModel.f71172j) && C17542s.e(this.f71173k, itemInfoResponseRemoteModel.f71173k) && C17542s.e(this.f71174l, itemInfoResponseRemoteModel.f71174l) && C17542s.e(this.f71175m, itemInfoResponseRemoteModel.f71175m) && C17542s.e(this.f71176n, itemInfoResponseRemoteModel.f71176n) && C17542s.e(this.f71177o, itemInfoResponseRemoteModel.f71177o) && this.f71178p == itemInfoResponseRemoteModel.f71178p && C17542s.e(this.f71179q, itemInfoResponseRemoteModel.f71179q) && this.f71180r == itemInfoResponseRemoteModel.f71180r && C17542s.e(this.f71181s, itemInfoResponseRemoteModel.f71181s) && C17542s.e(this.f71182t, itemInfoResponseRemoteModel.f71182t);
    }

    public int hashCode() {
        int hashCode = ((this.f71163a.hashCode() * 31) + this.f71164b.hashCode()) * 31;
        String str = this.f71165c;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        NullableDisplayUnitRemoteModel nullableDisplayUnitRemoteModel = this.f71166d;
        int hashCode3 = (hashCode2 + (nullableDisplayUnitRemoteModel == null ? 0 : nullableDisplayUnitRemoteModel.hashCode())) * 31;
        String str2 = this.f71167e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f71168f;
        int hashCode5 = (((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f71169g.hashCode()) * 31;
        String str4 = this.f71170h;
        int hashCode6 = (((((((((((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + Boolean.hashCode(this.f71171i)) * 31) + this.f71172j.hashCode()) * 31) + this.f71173k.hashCode()) * 31) + this.f71174l.hashCode()) * 31) + this.f71175m.hashCode()) * 31;
        Integer num = this.f71176n;
        int hashCode7 = (((((hashCode6 + (num == null ? 0 : num.hashCode())) * 31) + this.f71177o.hashCode()) * 31) + Boolean.hashCode(this.f71178p)) * 31;
        NullableTechnicalDetailsRemoteModel nullableTechnicalDetailsRemoteModel = this.f71179q;
        int hashCode8 = (((hashCode7 + (nullableTechnicalDetailsRemoteModel == null ? 0 : nullableTechnicalDetailsRemoteModel.hashCode())) * 31) + this.f71180r.hashCode()) * 31;
        String str5 = this.f71181s;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f71182t;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return hashCode9 + i10;
    }

    public String toString() {
        BusinessStructureRemoteModel businessStructureRemoteModel = this.f71163a;
        String str = this.f71164b;
        String str2 = this.f71165c;
        NullableDisplayUnitRemoteModel nullableDisplayUnitRemoteModel = this.f71166d;
        String str3 = this.f71167e;
        String str4 = this.f71168f;
        String str5 = this.f71169g;
        String str6 = this.f71170h;
        boolean z10 = this.f71171i;
        List<ImageRemoteModel> list = this.f71172j;
        List<MaterialRemoteModel> list2 = this.f71173k;
        List<MeasurementRemoteModel> list3 = this.f71174l;
        String str7 = this.f71175m;
        Integer num = this.f71176n;
        List<ProductTagRemoteModel> list4 = this.f71177o;
        boolean z11 = this.f71178p;
        NullableTechnicalDetailsRemoteModel nullableTechnicalDetailsRemoteModel = this.f71179q;
        m mVar = this.f71180r;
        String str8 = this.f71181s;
        String str9 = this.f71182t;
        return "ItemInfoResponseRemoteModel(businessStructure=" + businessStructureRemoteModel + ", category=" + str + ", description=" + str2 + ", displayUnit=" + nullableDisplayUnitRemoteModel + ", energyEfficiencySymbol=" + str3 + ", energyLabel=" + str4 + ", formattedItemNo=" + str5 + ", globalName=" + str6 + ", isAssemblyRequired=" + z10 + ", mainProductImages=" + list + ", materials=" + list2 + ", measurements=" + list3 + ", name=" + str7 + ", numberOfPackages=" + num + ", productTags=" + list4 + ", riskAcknowledgementNeeded=" + z11 + ", technicalDetails=" + nullableTechnicalDetailsRemoteModel + ", unitCode=" + mVar + ", waterLabel=" + str8 + ", waterSymbol=" + str9 + ")";
    }
}
