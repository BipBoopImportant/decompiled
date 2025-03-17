package com.ingka.ikea.core.remotemodel.product;

import com.ingka.ikea.core.remotemodel.ImageRemote;
import com.ingka.ikea.core.remotemodel.ImageRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u0000 42\u00020\u0001:\u00025$BO\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001dR(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010-\u0012\u0004\b0\u0010)\u001a\u0004\b.\u0010/R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0000X\u0004¢\u0006\u0012\n\u0004\b1\u0010-\u0012\u0004\b3\u0010)\u001a\u0004\b2\u0010/¨\u00066"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/TechnicalComplianceRemote;", "", "", "seen0", "Lcom/ingka/ikea/core/remotemodel/product/InfoSheetRemote;", "infoSheet", "", "informationValuesLabel", "", "Lcom/ingka/ikea/core/remotemodel/product/InformationValueRemote;", "informationValues", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "energyLabelImages", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILcom/ingka/ikea/core/remotemodel/product/InfoSheetRemote;Ljava/lang/String;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/remotemodel/product/TechnicalComplianceRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/core/model/product/TechnicalCompliance;", "b", "()Lcom/ingka/ikea/core/model/product/TechnicalCompliance;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/remotemodel/product/InfoSheetRemote;", "getInfoSheet$remote_model_release", "()Lcom/ingka/ikea/core/remotemodel/product/InfoSheetRemote;", "getInfoSheet$remote_model_release$annotations", "()V", "Ljava/lang/String;", "getInformationValuesLabel$remote_model_release", "getInformationValuesLabel$remote_model_release$annotations", "Ljava/util/List;", "getInformationValues$remote_model_release", "()Ljava/util/List;", "getInformationValues$remote_model_release$annotations", "d", "getEnergyLabelImages$remote_model_release", "getEnergyLabelImages$remote_model_release$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TechnicalComplianceRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f95431e = {null, null, new C17451f(InformationValueRemote$$serializer.INSTANCE), new C17451f(ImageRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final InfoSheetRemote f95432a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95433b;

    /* renamed from: c  reason: collision with root package name */
    private final List<InformationValueRemote> f95434c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ImageRemote> f95435d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/TechnicalComplianceRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/TechnicalComplianceRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<TechnicalComplianceRemote> serializer() {
            return TechnicalComplianceRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TechnicalComplianceRemote(int i10, InfoSheetRemote infoSheetRemote, String str, List list, List list2, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, TechnicalComplianceRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95432a = infoSheetRemote;
        this.f95433b = str;
        this.f95434c = list;
        this.f95435d = list2;
    }

    public static final /* synthetic */ void c(TechnicalComplianceRemote technicalComplianceRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95431e;
        dVar.B(serialDescriptor, 0, InfoSheetRemote$$serializer.INSTANCE, technicalComplianceRemote.f95432a);
        dVar.B(serialDescriptor, 1, Y0.f144077a, technicalComplianceRemote.f95433b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], technicalComplianceRemote.f95434c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], technicalComplianceRemote.f95435d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r0 == null) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.core.model.product.TechnicalCompliance b() {
        /*
            r6 = this;
            java.util.List<com.ingka.ikea.core.remotemodel.product.InformationValueRemote> r0 = r6.f95434c
            if (r0 == 0) goto L_0x002b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x000f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0025
            java.lang.Object r2 = r0.next()
            com.ingka.ikea.core.remotemodel.product.InformationValueRemote r2 = (com.ingka.ikea.core.remotemodel.product.InformationValueRemote) r2
            com.ingka.ikea.core.model.product.InformationValue r2 = r2.a()
            if (r2 == 0) goto L_0x000f
            r1.add(r2)
            goto L_0x000f
        L_0x0025:
            java.util.List r0 = YH.C16877v.t1(r1)
            if (r0 != 0) goto L_0x002f
        L_0x002b:
            java.util.List r0 = YH.C16877v.n()
        L_0x002f:
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r2 = 0
            if (r1 != 0) goto L_0x003c
            java.lang.String r1 = r6.f95433b
            goto L_0x003d
        L_0x003c:
            r1 = r2
        L_0x003d:
            com.ingka.ikea.core.remotemodel.product.InfoSheetRemote r3 = r6.f95432a
            if (r3 == 0) goto L_0x0045
            com.ingka.ikea.core.model.Link r2 = r3.a()
        L_0x0045:
            java.util.List<com.ingka.ikea.core.remotemodel.ImageRemote> r3 = r6.f95435d
            if (r3 == 0) goto L_0x006e
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = YH.C16877v.y(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x005a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0072
            java.lang.Object r5 = r3.next()
            com.ingka.ikea.core.remotemodel.ImageRemote r5 = (com.ingka.ikea.core.remotemodel.ImageRemote) r5
            com.ingka.ikea.core.model.Image r5 = r5.c()
            r4.add(r5)
            goto L_0x005a
        L_0x006e:
            java.util.List r4 = YH.C16877v.n()
        L_0x0072:
            com.ingka.ikea.core.model.product.TechnicalCompliance r3 = new com.ingka.ikea.core.model.product.TechnicalCompliance
            r3.<init>(r2, r1, r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.remotemodel.product.TechnicalComplianceRemote.b():com.ingka.ikea.core.model.product.TechnicalCompliance");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TechnicalComplianceRemote)) {
            return false;
        }
        TechnicalComplianceRemote technicalComplianceRemote = (TechnicalComplianceRemote) obj;
        return C17542s.e(this.f95432a, technicalComplianceRemote.f95432a) && C17542s.e(this.f95433b, technicalComplianceRemote.f95433b) && C17542s.e(this.f95434c, technicalComplianceRemote.f95434c) && C17542s.e(this.f95435d, technicalComplianceRemote.f95435d);
    }

    public int hashCode() {
        InfoSheetRemote infoSheetRemote = this.f95432a;
        int i10 = 0;
        int hashCode = (infoSheetRemote == null ? 0 : infoSheetRemote.hashCode()) * 31;
        String str = this.f95433b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<InformationValueRemote> list = this.f95434c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<ImageRemote> list2 = this.f95435d;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        InfoSheetRemote infoSheetRemote = this.f95432a;
        String str = this.f95433b;
        List<InformationValueRemote> list = this.f95434c;
        List<ImageRemote> list2 = this.f95435d;
        return "TechnicalComplianceRemote(infoSheet=" + infoSheetRemote + ", informationValuesLabel=" + str + ", informationValues=" + list + ", energyLabelImages=" + list2 + ")";
    }
}
