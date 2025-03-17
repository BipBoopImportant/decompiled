package com.ingka.ikea.core.remotemodel.product;

import YH.C16877v;
import com.ingka.ikea.core.model.product.CustomerEnvironment;
import com.ingka.ikea.core.model.product.GoodToKnow;
import com.ingka.ikea.core.model.product.MoreInfo;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b'\b\b\u0018\u0000 Q2\u00020\u0001:\u0002R/B©\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0004\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000X\u0004¢\u0006\u0012\n\u0004\b%\u00105\u0012\u0004\b7\u00104\u001a\u0004\b6\u0010(R(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b\"\u00100\u0012\u0004\b9\u00104\u001a\u0004\b8\u00102R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b:\u00100\u0012\u0004\b<\u00104\u001a\u0004\b;\u00102R(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b=\u00100\u0012\u0004\b?\u00104\u001a\u0004\b>\u00102R(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\b@\u00100\u0012\u0004\bB\u00104\u001a\u0004\bA\u00102R(\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\bC\u00100\u0012\u0004\bE\u00104\u001a\u0004\bD\u00102R(\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00048\u0000X\u0004¢\u0006\u0012\n\u0004\bF\u00100\u0012\u0004\bH\u00104\u001a\u0004\bG\u00102R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0000X\u0004¢\u0006\u0012\n\u0004\bI\u0010J\u0012\u0004\bM\u00104\u001a\u0004\bK\u0010LR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0000X\u0004¢\u0006\u0012\n\u0004\bN\u00105\u0012\u0004\bP\u00104\u001a\u0004\bO\u0010(¨\u0006S"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/MoreInfoRemote;", "", "", "seen0", "", "Lcom/ingka/ikea/core/remotemodel/product/AttachmentRemote;", "attachments", "", "attachmentsDisclaimer", "Lcom/ingka/ikea/core/remotemodel/product/CustomerBenefitRemote;", "customerBenefit", "Lcom/ingka/ikea/core/remotemodel/product/CustomerEnvironmentRemote;", "customerEnvironment", "Lcom/ingka/ikea/core/remotemodel/product/CustomerMaterialRemote;", "customerMaterial", "Lcom/ingka/ikea/core/remotemodel/product/CustomerCareRemote;", "customerCare", "Lcom/ingka/ikea/core/remotemodel/product/GoodToKnowRemote;", "goodToKnow", "Lcom/ingka/ikea/core/remotemodel/product/SafetyAndComplianceRemote;", "safetyAndCompliance", "Lcom/ingka/ikea/core/remotemodel/product/TechnicalComplianceRemote;", "technicalCompliance", "designerInfo", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/ingka/ikea/core/remotemodel/product/TechnicalComplianceRemote;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/remotemodel/product/MoreInfoRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/ingka/ikea/core/model/product/MoreInfo;", "b", "()Lcom/ingka/ikea/core/model/product/MoreInfo;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getAttachments$remote_model_release", "()Ljava/util/List;", "getAttachments$remote_model_release$annotations", "()V", "Ljava/lang/String;", "getAttachmentsDisclaimer$remote_model_release", "getAttachmentsDisclaimer$remote_model_release$annotations", "getCustomerBenefit$remote_model_release", "getCustomerBenefit$remote_model_release$annotations", "d", "getCustomerEnvironment$remote_model_release", "getCustomerEnvironment$remote_model_release$annotations", "e", "getCustomerMaterial$remote_model_release", "getCustomerMaterial$remote_model_release$annotations", "f", "getCustomerCare$remote_model_release", "getCustomerCare$remote_model_release$annotations", "g", "getGoodToKnow$remote_model_release", "getGoodToKnow$remote_model_release$annotations", "h", "getSafetyAndCompliance$remote_model_release", "getSafetyAndCompliance$remote_model_release$annotations", "i", "Lcom/ingka/ikea/core/remotemodel/product/TechnicalComplianceRemote;", "getTechnicalCompliance$remote_model_release", "()Lcom/ingka/ikea/core/remotemodel/product/TechnicalComplianceRemote;", "getTechnicalCompliance$remote_model_release$annotations", "j", "getDesignerInfo$remote_model_release", "getDesignerInfo$remote_model_release$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MoreInfoRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final KSerializer<Object>[] f95304k = {new C17451f(AttachmentRemote$$serializer.INSTANCE), null, new C17451f(CustomerBenefitRemote$$serializer.INSTANCE), new C17451f(CustomerEnvironmentRemote$$serializer.INSTANCE), new C17451f(CustomerMaterialRemote$$serializer.INSTANCE), new C17451f(CustomerCareRemote$$serializer.INSTANCE), new C17451f(GoodToKnowRemote$$serializer.INSTANCE), new C17451f(SafetyAndComplianceRemote$$serializer.INSTANCE), null, null};

    /* renamed from: a  reason: collision with root package name */
    private final List<AttachmentRemote> f95305a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95306b;

    /* renamed from: c  reason: collision with root package name */
    private final List<CustomerBenefitRemote> f95307c;

    /* renamed from: d  reason: collision with root package name */
    private final List<CustomerEnvironmentRemote> f95308d;

    /* renamed from: e  reason: collision with root package name */
    private final List<CustomerMaterialRemote> f95309e;

    /* renamed from: f  reason: collision with root package name */
    private final List<CustomerCareRemote> f95310f;

    /* renamed from: g  reason: collision with root package name */
    private final List<GoodToKnowRemote> f95311g;

    /* renamed from: h  reason: collision with root package name */
    private final List<SafetyAndComplianceRemote> f95312h;

    /* renamed from: i  reason: collision with root package name */
    private final TechnicalComplianceRemote f95313i;

    /* renamed from: j  reason: collision with root package name */
    private final String f95314j;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/MoreInfoRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/MoreInfoRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<MoreInfoRemote> serializer() {
            return MoreInfoRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MoreInfoRemote(int i10, List list, String str, List list2, List list3, List list4, List list5, List list6, List list7, TechnicalComplianceRemote technicalComplianceRemote, String str2, T0 t02) {
        if (1023 != (i10 & 1023)) {
            E0.b(i10, 1023, MoreInfoRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95305a = list;
        this.f95306b = str;
        this.f95307c = list2;
        this.f95308d = list3;
        this.f95309e = list4;
        this.f95310f = list5;
        this.f95311g = list6;
        this.f95312h = list7;
        this.f95313i = technicalComplianceRemote;
        this.f95314j = str2;
    }

    public static final /* synthetic */ void c(MoreInfoRemote moreInfoRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95304k;
        dVar.B(serialDescriptor, 0, kSerializerArr[0], moreInfoRemote.f95305a);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 1, y02, moreInfoRemote.f95306b);
        dVar.B(serialDescriptor, 2, kSerializerArr[2], moreInfoRemote.f95307c);
        dVar.B(serialDescriptor, 3, kSerializerArr[3], moreInfoRemote.f95308d);
        dVar.B(serialDescriptor, 4, kSerializerArr[4], moreInfoRemote.f95309e);
        dVar.B(serialDescriptor, 5, kSerializerArr[5], moreInfoRemote.f95310f);
        dVar.B(serialDescriptor, 6, kSerializerArr[6], moreInfoRemote.f95311g);
        dVar.B(serialDescriptor, 7, kSerializerArr[7], moreInfoRemote.f95312h);
        dVar.B(serialDescriptor, 8, TechnicalComplianceRemote$$serializer.INSTANCE, moreInfoRemote.f95313i);
        dVar.B(serialDescriptor, 9, y02, moreInfoRemote.f95314j);
    }

    public final MoreInfo b() {
        List n10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        List<AttachmentRemote> list = this.f95305a;
        if (list != null) {
            Iterable<AttachmentRemote> iterable = list;
            n10 = new ArrayList(C16877v.y(iterable, 10));
            for (AttachmentRemote a10 : iterable) {
                n10.add(a10.a());
            }
        } else {
            n10 = C16877v.n();
        }
        List list2 = n10;
        List<CustomerBenefitRemote> list3 = this.f95307c;
        if (list3 != null) {
            Iterable<CustomerBenefitRemote> iterable2 = list3;
            ArrayList arrayList7 = new ArrayList(C16877v.y(iterable2, 10));
            for (CustomerBenefitRemote a11 : iterable2) {
                arrayList7.add(a11.a());
            }
            arrayList = arrayList7;
        } else {
            arrayList = C16877v.n();
        }
        List<CustomerEnvironmentRemote> list4 = this.f95308d;
        if (list4 != null) {
            Iterable<CustomerEnvironmentRemote> iterable3 = list4;
            ArrayList arrayList8 = new ArrayList(C16877v.y(iterable3, 10));
            for (CustomerEnvironmentRemote b10 : iterable3) {
                arrayList8.add(new CustomerEnvironment(b10.b()));
            }
            arrayList2 = arrayList8;
        } else {
            arrayList2 = null;
        }
        List<CustomerMaterialRemote> list5 = this.f95309e;
        if (list5 != null) {
            Iterable<CustomerMaterialRemote> iterable4 = list5;
            ArrayList arrayList9 = new ArrayList(C16877v.y(iterable4, 10));
            for (CustomerMaterialRemote b11 : iterable4) {
                arrayList9.add(b11.b());
            }
            arrayList3 = arrayList9;
        } else {
            arrayList3 = null;
        }
        List<CustomerCareRemote> list6 = this.f95310f;
        if (list6 != null) {
            Iterable<CustomerCareRemote> iterable5 = list6;
            ArrayList arrayList10 = new ArrayList(C16877v.y(iterable5, 10));
            for (CustomerCareRemote b12 : iterable5) {
                arrayList10.add(b12.b());
            }
            arrayList4 = arrayList10;
        } else {
            arrayList4 = null;
        }
        List<GoodToKnowRemote> list7 = this.f95311g;
        if (list7 != null) {
            ArrayList arrayList11 = new ArrayList();
            for (GoodToKnowRemote a12 : list7) {
                GoodToKnow a13 = a12.a();
                if (a13 != null) {
                    arrayList11.add(a13);
                }
            }
            arrayList5 = arrayList11;
        } else {
            arrayList5 = null;
        }
        List<SafetyAndComplianceRemote> list8 = this.f95312h;
        if (list8 != null) {
            Iterable<SafetyAndComplianceRemote> iterable6 = list8;
            ArrayList arrayList12 = new ArrayList(C16877v.y(iterable6, 10));
            for (SafetyAndComplianceRemote a14 : iterable6) {
                arrayList12.add(a14.a());
            }
            arrayList6 = arrayList12;
        } else {
            arrayList6 = null;
        }
        TechnicalComplianceRemote technicalComplianceRemote = this.f95313i;
        return new MoreInfo(list2, this.f95306b, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, technicalComplianceRemote != null ? technicalComplianceRemote.b() : null, this.f95314j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoreInfoRemote)) {
            return false;
        }
        MoreInfoRemote moreInfoRemote = (MoreInfoRemote) obj;
        return C17542s.e(this.f95305a, moreInfoRemote.f95305a) && C17542s.e(this.f95306b, moreInfoRemote.f95306b) && C17542s.e(this.f95307c, moreInfoRemote.f95307c) && C17542s.e(this.f95308d, moreInfoRemote.f95308d) && C17542s.e(this.f95309e, moreInfoRemote.f95309e) && C17542s.e(this.f95310f, moreInfoRemote.f95310f) && C17542s.e(this.f95311g, moreInfoRemote.f95311g) && C17542s.e(this.f95312h, moreInfoRemote.f95312h) && C17542s.e(this.f95313i, moreInfoRemote.f95313i) && C17542s.e(this.f95314j, moreInfoRemote.f95314j);
    }

    public int hashCode() {
        List<AttachmentRemote> list = this.f95305a;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f95306b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<CustomerBenefitRemote> list2 = this.f95307c;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<CustomerEnvironmentRemote> list3 = this.f95308d;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<CustomerMaterialRemote> list4 = this.f95309e;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<CustomerCareRemote> list5 = this.f95310f;
        int hashCode6 = (hashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<GoodToKnowRemote> list6 = this.f95311g;
        int hashCode7 = (hashCode6 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<SafetyAndComplianceRemote> list7 = this.f95312h;
        int hashCode8 = (hashCode7 + (list7 == null ? 0 : list7.hashCode())) * 31;
        TechnicalComplianceRemote technicalComplianceRemote = this.f95313i;
        int hashCode9 = (hashCode8 + (technicalComplianceRemote == null ? 0 : technicalComplianceRemote.hashCode())) * 31;
        String str2 = this.f95314j;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode9 + i10;
    }

    public String toString() {
        List<AttachmentRemote> list = this.f95305a;
        String str = this.f95306b;
        List<CustomerBenefitRemote> list2 = this.f95307c;
        List<CustomerEnvironmentRemote> list3 = this.f95308d;
        List<CustomerMaterialRemote> list4 = this.f95309e;
        List<CustomerCareRemote> list5 = this.f95310f;
        List<GoodToKnowRemote> list6 = this.f95311g;
        List<SafetyAndComplianceRemote> list7 = this.f95312h;
        TechnicalComplianceRemote technicalComplianceRemote = this.f95313i;
        String str2 = this.f95314j;
        return "MoreInfoRemote(attachments=" + list + ", attachmentsDisclaimer=" + str + ", customerBenefit=" + list2 + ", customerEnvironment=" + list3 + ", customerMaterial=" + list4 + ", customerCare=" + list5 + ", goodToKnow=" + list6 + ", safetyAndCompliance=" + list7 + ", technicalCompliance=" + technicalComplianceRemote + ", designerInfo=" + str2 + ")";
    }
}
