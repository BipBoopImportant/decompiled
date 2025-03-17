package com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response;

import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 $2\u00020\u0001:\u0003!%\u001cB9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001d\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u0015R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u0012\u0004\b#\u0010 \u001a\u0004\b\u001c\u0010\u0015¨\u0006&"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StockInfoDataModel;", "", "", "seen0", "", "text", "color", "code", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StockInfoDataModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "getText$annotations", "()V", "b", "getColor$annotations", "getCode$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StockInfoDataModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f120119a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120120b;

    /* renamed from: c  reason: collision with root package name */
    private final String f120121c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StockInfoDataModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StockInfoDataModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<StockInfoDataModel> serializer() {
            return StockInfoDataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/StockInfoDataModel$b;", "", "", "type", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "NOT_SOLD", "LOW_IN_STOCK", "MEDIUM_IN_STOCK", "HIGH_IN_STOCK", "OUT_OF_STOCK", "OTHER", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        NOT_SOLD("NOT_SOLD"),
        LOW_IN_STOCK("LOW_IN_STOCK"),
        MEDIUM_IN_STOCK("MEDIUM_IN_STOCK"),
        HIGH_IN_STOCK("HIGH_IN_STOCK"),
        OUT_OF_STOCK("OUT_OF_STOCK"),
        OTHER("OTHER");
        
        private final String type;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private b(String str) {
            this.type = str;
        }

        public static C17220a<b> b() {
            return $ENTRIES;
        }

        public final String j() {
            return this.type;
        }
    }

    public /* synthetic */ StockInfoDataModel(int i10, String str, String str2, String str3, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, StockInfoDataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f120119a = str;
        this.f120120b = str2;
        this.f120121c = str3;
    }

    public static final /* synthetic */ void d(StockInfoDataModel stockInfoDataModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, stockInfoDataModel.f120119a);
        dVar.B(serialDescriptor, 1, y02, stockInfoDataModel.f120120b);
        dVar.B(serialDescriptor, 2, y02, stockInfoDataModel.f120121c);
    }

    public final String a() {
        return this.f120121c;
    }

    public final String b() {
        return this.f120120b;
    }

    public final String c() {
        return this.f120119a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockInfoDataModel)) {
            return false;
        }
        StockInfoDataModel stockInfoDataModel = (StockInfoDataModel) obj;
        return C17542s.e(this.f120119a, stockInfoDataModel.f120119a) && C17542s.e(this.f120120b, stockInfoDataModel.f120120b) && C17542s.e(this.f120121c, stockInfoDataModel.f120121c);
    }

    public int hashCode() {
        String str = this.f120119a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f120120b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120121c;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f120119a;
        String str2 = this.f120120b;
        String str3 = this.f120121c;
        return "StockInfoDataModel(text=" + str + ", color=" + str2 + ", code=" + str3 + ")";
    }
}
