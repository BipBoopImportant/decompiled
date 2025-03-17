package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.C17250c;
import fK.p;
import gK.C17294a;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.M;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b=\b\b\u0018\u0000 j2\u00020\u0001:\u0002k2B»\u0001\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0015\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J(\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%HÁ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u00103\u0012\u0004\b6\u00107\u001a\u0004\b4\u00105R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b;\u00107\u001a\u0004\b8\u0010:R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b<\u0010=\u0012\u0004\b@\u00107\u001a\u0004\b>\u0010?R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bD\u00107\u001a\u0004\b<\u0010CR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\bE\u0010F\u0012\u0004\bH\u00107\u001a\u0004\bA\u0010GR\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\bI\u0010J\u0012\u0004\bM\u00107\u001a\u0004\bK\u0010LR \u0010\u0012\u001a\u00020\u00118\u0006X\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bP\u00107\u001a\u0004\bE\u0010+R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bT\u00107\u001a\u0004\bI\u0010SR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0004¢\u0006\u0012\n\u0004\bU\u0010V\u0012\u0004\bX\u00107\u001a\u0004\bN\u0010WR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010Y\u0012\u0004\b\\\u00107\u001a\u0004\bZ\u0010[R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0004¢\u0006\u0012\n\u0004\b]\u0010^\u0012\u0004\b`\u00107\u001a\u0004\bQ\u0010_R \u0010\u001b\u001a\u00020\u00158\u0006X\u0004¢\u0006\u0012\n\u0004\ba\u0010b\u0012\u0004\bd\u00107\u001a\u0004\bU\u0010cR \u0010\u001d\u001a\u00020\u001c8\u0006X\u0004¢\u0006\u0012\n\u0004\be\u0010f\u0012\u0004\bi\u00107\u001a\u0004\bg\u0010h¨\u0006l"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/ItemResponseRemoteModel;", "", "", "seen1", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseAssemblyServiceRemoteModel;", "assemblyService", "Lcom/ingka/ikea/app/caasremote/models/NullableItemLevelAvailabilityIndicationResponseRemoteModel;", "availabilityIndication", "", "Lcom/ingka/ikea/app/caasremote/models/ChildItemResponseRemoteModel;", "childItems", "Lcom/ingka/ikea/app/caasremote/models/NullableFeesRemoteModel;", "fees", "Lcom/ingka/ikea/app/caasremote/models/NullableItemInfoResponseRemoteModel;", "info", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServiceRemoteModel;", "installationService", "", "itemNo", "Lcom/ingka/ikea/app/caasremote/models/e;", "itemType", "", "maxQuantity", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseMetadataRemoteModel;", "metadata", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponsePriceRemoteModel;", "price", "quantity", "Lcom/ingka/ikea/app/caasremote/models/l;", "shoppingProfile", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/app/caasremote/models/NullableItemResponseAssemblyServiceRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableItemLevelAvailabilityIndicationResponseRemoteModel;Ljava/util/List;Lcom/ingka/ikea/app/caasremote/models/NullableFeesRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableItemInfoResponseRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServiceRemoteModel;Ljava/lang/String;Lcom/ingka/ikea/app/caasremote/models/e;Ljava/lang/Float;Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseMetadataRemoteModel;Lcom/ingka/ikea/app/caasremote/models/NullableItemResponsePriceRemoteModel;FLcom/ingka/ikea/app/caasremote/models/l;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "j", "(Lcom/ingka/ikea/app/caasremote/models/ItemResponseRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseAssemblyServiceRemoteModel;", "getAssemblyService", "()Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseAssemblyServiceRemoteModel;", "getAssemblyService$annotations", "()V", "b", "Lcom/ingka/ikea/app/caasremote/models/NullableItemLevelAvailabilityIndicationResponseRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/NullableItemLevelAvailabilityIndicationResponseRemoteModel;", "getAvailabilityIndication$annotations", "c", "Ljava/util/List;", "getChildItems", "()Ljava/util/List;", "getChildItems$annotations", "d", "Lcom/ingka/ikea/app/caasremote/models/NullableFeesRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/NullableFeesRemoteModel;", "getFees$annotations", "e", "Lcom/ingka/ikea/app/caasremote/models/NullableItemInfoResponseRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/NullableItemInfoResponseRemoteModel;", "getInfo$annotations", "f", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServiceRemoteModel;", "getInstallationService", "()Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseInstallationServiceRemoteModel;", "getInstallationService$annotations", "g", "Ljava/lang/String;", "getItemNo$annotations", "h", "Lcom/ingka/ikea/app/caasremote/models/e;", "()Lcom/ingka/ikea/app/caasremote/models/e;", "getItemType$annotations", "i", "Ljava/lang/Float;", "()Ljava/lang/Float;", "getMaxQuantity$annotations", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseMetadataRemoteModel;", "getMetadata", "()Lcom/ingka/ikea/app/caasremote/models/NullableItemResponseMetadataRemoteModel;", "getMetadata$annotations", "k", "Lcom/ingka/ikea/app/caasremote/models/NullableItemResponsePriceRemoteModel;", "()Lcom/ingka/ikea/app/caasremote/models/NullableItemResponsePriceRemoteModel;", "getPrice$annotations", "l", "F", "()F", "getQuantity$annotations", "m", "Lcom/ingka/ikea/app/caasremote/models/l;", "getShoppingProfile", "()Lcom/ingka/ikea/app/caasremote/models/l;", "getShoppingProfile$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ItemResponseRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final KSerializer<Object>[] f71185n = {null, null, new C17451f(ChildItemResponseRemoteModel$$serializer.INSTANCE), null, null, null, null, new C17250c(P.b(e.class), C17294a.u(e.Companion.serializer()), new KSerializer[0]), null, null, null, null, new C17250c(P.b(l.class), l.Companion.serializer(), new KSerializer[0])};

    /* renamed from: a  reason: collision with root package name */
    private final NullableItemResponseAssemblyServiceRemoteModel f71186a;

    /* renamed from: b  reason: collision with root package name */
    private final NullableItemLevelAvailabilityIndicationResponseRemoteModel f71187b;

    /* renamed from: c  reason: collision with root package name */
    private final List<ChildItemResponseRemoteModel> f71188c;

    /* renamed from: d  reason: collision with root package name */
    private final NullableFeesRemoteModel f71189d;

    /* renamed from: e  reason: collision with root package name */
    private final NullableItemInfoResponseRemoteModel f71190e;

    /* renamed from: f  reason: collision with root package name */
    private final NullableItemResponseInstallationServiceRemoteModel f71191f;

    /* renamed from: g  reason: collision with root package name */
    private final String f71192g;

    /* renamed from: h  reason: collision with root package name */
    private final e f71193h;

    /* renamed from: i  reason: collision with root package name */
    private final Float f71194i;

    /* renamed from: j  reason: collision with root package name */
    private final NullableItemResponseMetadataRemoteModel f71195j;

    /* renamed from: k  reason: collision with root package name */
    private final NullableItemResponsePriceRemoteModel f71196k;

    /* renamed from: l  reason: collision with root package name */
    private final float f71197l;

    /* renamed from: m  reason: collision with root package name */
    private final l f71198m;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/ItemResponseRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/ItemResponseRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ItemResponseRemoteModel> serializer() {
            return ItemResponseRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ ItemResponseRemoteModel(int i10, NullableItemResponseAssemblyServiceRemoteModel nullableItemResponseAssemblyServiceRemoteModel, NullableItemLevelAvailabilityIndicationResponseRemoteModel nullableItemLevelAvailabilityIndicationResponseRemoteModel, List list, NullableFeesRemoteModel nullableFeesRemoteModel, NullableItemInfoResponseRemoteModel nullableItemInfoResponseRemoteModel, NullableItemResponseInstallationServiceRemoteModel nullableItemResponseInstallationServiceRemoteModel, String str, e eVar, Float f10, NullableItemResponseMetadataRemoteModel nullableItemResponseMetadataRemoteModel, NullableItemResponsePriceRemoteModel nullableItemResponsePriceRemoteModel, float f11, l lVar, T0 t02) {
        if (8191 != (i10 & 8191)) {
            E0.b(i10, 8191, ItemResponseRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71186a = nullableItemResponseAssemblyServiceRemoteModel;
        this.f71187b = nullableItemLevelAvailabilityIndicationResponseRemoteModel;
        this.f71188c = list;
        this.f71189d = nullableFeesRemoteModel;
        this.f71190e = nullableItemInfoResponseRemoteModel;
        this.f71191f = nullableItemResponseInstallationServiceRemoteModel;
        this.f71192g = str;
        this.f71193h = eVar;
        this.f71194i = f10;
        this.f71195j = nullableItemResponseMetadataRemoteModel;
        this.f71196k = nullableItemResponsePriceRemoteModel;
        this.f71197l = f11;
        this.f71198m = lVar;
    }

    public static final /* synthetic */ void j(ItemResponseRemoteModel itemResponseRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f71185n;
        dVar.B(serialDescriptor, 0, NullableItemResponseAssemblyServiceRemoteModel$$serializer.INSTANCE, itemResponseRemoteModel.f71186a);
        dVar.B(serialDescriptor, 1, NullableItemLevelAvailabilityIndicationResponseRemoteModel$$serializer.INSTANCE, itemResponseRemoteModel.f71187b);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], itemResponseRemoteModel.f71188c);
        dVar.B(serialDescriptor, 3, NullableFeesRemoteModel$$serializer.INSTANCE, itemResponseRemoteModel.f71189d);
        dVar.B(serialDescriptor, 4, NullableItemInfoResponseRemoteModel$$serializer.INSTANCE, itemResponseRemoteModel.f71190e);
        dVar.B(serialDescriptor, 5, NullableItemResponseInstallationServiceRemoteModel$$serializer.INSTANCE, itemResponseRemoteModel.f71191f);
        dVar.y(serialDescriptor, 6, itemResponseRemoteModel.f71192g);
        dVar.B(serialDescriptor, 7, kSerializerArr[7], itemResponseRemoteModel.f71193h);
        dVar.B(serialDescriptor, 8, M.f144051a, itemResponseRemoteModel.f71194i);
        dVar.B(serialDescriptor, 9, NullableItemResponseMetadataRemoteModel$$serializer.INSTANCE, itemResponseRemoteModel.f71195j);
        dVar.B(serialDescriptor, 10, NullableItemResponsePriceRemoteModel$$serializer.INSTANCE, itemResponseRemoteModel.f71196k);
        dVar.s(serialDescriptor, 11, itemResponseRemoteModel.f71197l);
        dVar.i(serialDescriptor, 12, kSerializerArr[12], itemResponseRemoteModel.f71198m);
    }

    public final NullableItemLevelAvailabilityIndicationResponseRemoteModel b() {
        return this.f71187b;
    }

    public final NullableFeesRemoteModel c() {
        return this.f71189d;
    }

    public final NullableItemInfoResponseRemoteModel d() {
        return this.f71190e;
    }

    public final String e() {
        return this.f71192g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemResponseRemoteModel)) {
            return false;
        }
        ItemResponseRemoteModel itemResponseRemoteModel = (ItemResponseRemoteModel) obj;
        return C17542s.e(this.f71186a, itemResponseRemoteModel.f71186a) && C17542s.e(this.f71187b, itemResponseRemoteModel.f71187b) && C17542s.e(this.f71188c, itemResponseRemoteModel.f71188c) && C17542s.e(this.f71189d, itemResponseRemoteModel.f71189d) && C17542s.e(this.f71190e, itemResponseRemoteModel.f71190e) && C17542s.e(this.f71191f, itemResponseRemoteModel.f71191f) && C17542s.e(this.f71192g, itemResponseRemoteModel.f71192g) && this.f71193h == itemResponseRemoteModel.f71193h && C17542s.e(this.f71194i, itemResponseRemoteModel.f71194i) && C17542s.e(this.f71195j, itemResponseRemoteModel.f71195j) && C17542s.e(this.f71196k, itemResponseRemoteModel.f71196k) && Float.compare(this.f71197l, itemResponseRemoteModel.f71197l) == 0 && this.f71198m == itemResponseRemoteModel.f71198m;
    }

    public final e f() {
        return this.f71193h;
    }

    public final Float g() {
        return this.f71194i;
    }

    public final NullableItemResponsePriceRemoteModel h() {
        return this.f71196k;
    }

    public int hashCode() {
        NullableItemResponseAssemblyServiceRemoteModel nullableItemResponseAssemblyServiceRemoteModel = this.f71186a;
        int i10 = 0;
        int hashCode = (nullableItemResponseAssemblyServiceRemoteModel == null ? 0 : nullableItemResponseAssemblyServiceRemoteModel.hashCode()) * 31;
        NullableItemLevelAvailabilityIndicationResponseRemoteModel nullableItemLevelAvailabilityIndicationResponseRemoteModel = this.f71187b;
        int hashCode2 = (((hashCode + (nullableItemLevelAvailabilityIndicationResponseRemoteModel == null ? 0 : nullableItemLevelAvailabilityIndicationResponseRemoteModel.hashCode())) * 31) + this.f71188c.hashCode()) * 31;
        NullableFeesRemoteModel nullableFeesRemoteModel = this.f71189d;
        int hashCode3 = (hashCode2 + (nullableFeesRemoteModel == null ? 0 : nullableFeesRemoteModel.hashCode())) * 31;
        NullableItemInfoResponseRemoteModel nullableItemInfoResponseRemoteModel = this.f71190e;
        int hashCode4 = (hashCode3 + (nullableItemInfoResponseRemoteModel == null ? 0 : nullableItemInfoResponseRemoteModel.hashCode())) * 31;
        NullableItemResponseInstallationServiceRemoteModel nullableItemResponseInstallationServiceRemoteModel = this.f71191f;
        int hashCode5 = (((hashCode4 + (nullableItemResponseInstallationServiceRemoteModel == null ? 0 : nullableItemResponseInstallationServiceRemoteModel.hashCode())) * 31) + this.f71192g.hashCode()) * 31;
        e eVar = this.f71193h;
        int hashCode6 = (hashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Float f10 = this.f71194i;
        int hashCode7 = (hashCode6 + (f10 == null ? 0 : f10.hashCode())) * 31;
        NullableItemResponseMetadataRemoteModel nullableItemResponseMetadataRemoteModel = this.f71195j;
        int hashCode8 = (hashCode7 + (nullableItemResponseMetadataRemoteModel == null ? 0 : nullableItemResponseMetadataRemoteModel.hashCode())) * 31;
        NullableItemResponsePriceRemoteModel nullableItemResponsePriceRemoteModel = this.f71196k;
        if (nullableItemResponsePriceRemoteModel != null) {
            i10 = nullableItemResponsePriceRemoteModel.hashCode();
        }
        return ((((hashCode8 + i10) * 31) + Float.hashCode(this.f71197l)) * 31) + this.f71198m.hashCode();
    }

    public final float i() {
        return this.f71197l;
    }

    public String toString() {
        NullableItemResponseAssemblyServiceRemoteModel nullableItemResponseAssemblyServiceRemoteModel = this.f71186a;
        NullableItemLevelAvailabilityIndicationResponseRemoteModel nullableItemLevelAvailabilityIndicationResponseRemoteModel = this.f71187b;
        List<ChildItemResponseRemoteModel> list = this.f71188c;
        NullableFeesRemoteModel nullableFeesRemoteModel = this.f71189d;
        NullableItemInfoResponseRemoteModel nullableItemInfoResponseRemoteModel = this.f71190e;
        NullableItemResponseInstallationServiceRemoteModel nullableItemResponseInstallationServiceRemoteModel = this.f71191f;
        String str = this.f71192g;
        e eVar = this.f71193h;
        Float f10 = this.f71194i;
        NullableItemResponseMetadataRemoteModel nullableItemResponseMetadataRemoteModel = this.f71195j;
        NullableItemResponsePriceRemoteModel nullableItemResponsePriceRemoteModel = this.f71196k;
        float f11 = this.f71197l;
        l lVar = this.f71198m;
        return "ItemResponseRemoteModel(assemblyService=" + nullableItemResponseAssemblyServiceRemoteModel + ", availabilityIndication=" + nullableItemLevelAvailabilityIndicationResponseRemoteModel + ", childItems=" + list + ", fees=" + nullableFeesRemoteModel + ", info=" + nullableItemInfoResponseRemoteModel + ", installationService=" + nullableItemResponseInstallationServiceRemoteModel + ", itemNo=" + str + ", itemType=" + eVar + ", maxQuantity=" + f10 + ", metadata=" + nullableItemResponseMetadataRemoteModel + ", price=" + nullableItemResponsePriceRemoteModel + ", quantity=" + f11 + ", shoppingProfile=" + lVar + ")";
    }
}
