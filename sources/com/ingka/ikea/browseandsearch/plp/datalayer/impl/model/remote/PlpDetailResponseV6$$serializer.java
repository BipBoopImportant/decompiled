package com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote;

import XH.C16814e;
import com.ingka.ikea.core.remotemodel.CampaignsRemote$$serializer;
import com.ingka.ikea.core.remotemodel.KeyBenefitsRemote$$serializer;
import com.ingka.ikea.core.remotemodel.TopSuggestionsRemote$$serializer;
import gK.C17294a;
import iK.C17395d;
import jK.C17457i;
import jK.J0;
import jK.N;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/PlpDetailResponseV6.$serializer", "LjK/N;", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/PlpDetailResponseV6;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/PlpDetailResponseV6;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/PlpDetailResponseV6;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class PlpDetailResponseV6$$serializer implements N<PlpDetailResponseV6> {
    public static final PlpDetailResponseV6$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlpDetailResponseV6$$serializer plpDetailResponseV6$$serializer = new PlpDetailResponseV6$$serializer();
        INSTANCE = plpDetailResponseV6$$serializer;
        J0 j02 = new J0("com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.PlpDetailResponseV6", plpDetailResponseV6$$serializer, 16);
        j02.p("products", false);
        j02.p("facets", false);
        j02.p("showAvailabilityBanner", false);
        j02.p("keyBenefits", false);
        j02.p("meta", false);
        j02.p("category", false);
        j02.p("categories", false);
        j02.p("suggestions", false);
        j02.p("didYouMean", false);
        j02.p("inspirationFeed", false);
        j02.p("campaigns", false);
        j02.p("inspirations", false);
        j02.p("vugc", false);
        j02.p("relatedSearches", false);
        j02.p("mostLovedProducts", false);
        j02.p("token", false);
        descriptor = j02;
    }

    private PlpDetailResponseV6$$serializer() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v7, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v5, resolved type: com.ingka.ikea.core.remotemodel.KeyBenefitsRemote} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.HeaderRemoteV6} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0112, code lost:
        r14 = r29;
        r15 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01da, code lost:
        r15 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01dc, code lost:
        r3 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01f8, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0251, code lost:
        r2 = r25;
        r25 = r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.PlpDetailResponseV6 deserialize(kotlinx.serialization.encoding.Decoder r51) {
        /*
            r50 = this;
            r0 = r51
            java.lang.String r1 = "decoder"
            kotlin.jvm.internal.C17542s.j(r0, r1)
            kotlinx.serialization.descriptors.SerialDescriptor r1 = descriptor
            iK.c r0 = r0.b(r1)
            kotlinx.serialization.KSerializer[] r2 = com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.PlpDetailResponseV6.f93432q
            boolean r3 = r0.q()
            r9 = 10
            r10 = 9
            r11 = 7
            r12 = 6
            r13 = 5
            r14 = 3
            r15 = 4
            r4 = 2
            r5 = 8
            r6 = 1
            r7 = 0
            r8 = 0
            if (r3 == 0) goto L_0x00d9
            r3 = r2[r7]
            java.lang.Object r3 = r0.o(r1, r7, r3, r8)
            java.util.List r3 = (java.util.List) r3
            r7 = r2[r6]
            java.lang.Object r6 = r0.A(r1, r6, r7, r8)
            java.util.List r6 = (java.util.List) r6
            jK.i r7 = jK.C17457i.f144111a
            java.lang.Object r4 = r0.A(r1, r4, r7, r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            com.ingka.ikea.core.remotemodel.KeyBenefitsRemote$$serializer r7 = com.ingka.ikea.core.remotemodel.KeyBenefitsRemote$$serializer.INSTANCE
            java.lang.Object r7 = r0.A(r1, r14, r7, r8)
            com.ingka.ikea.core.remotemodel.KeyBenefitsRemote r7 = (com.ingka.ikea.core.remotemodel.KeyBenefitsRemote) r7
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.MetaInfoRemoteV6$$serializer r14 = com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.MetaInfoRemoteV6$$serializer.INSTANCE
            java.lang.Object r14 = r0.A(r1, r15, r14, r8)
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.MetaInfoRemoteV6 r14 = (com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.MetaInfoRemoteV6) r14
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.HeaderRemoteV6$$serializer r15 = com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.HeaderRemoteV6$$serializer.INSTANCE
            java.lang.Object r13 = r0.A(r1, r13, r15, r8)
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.HeaderRemoteV6 r13 = (com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.HeaderRemoteV6) r13
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.CategoryRemoteListV6$$serializer r15 = com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.CategoryRemoteListV6$$serializer.INSTANCE
            java.lang.Object r12 = r0.A(r1, r12, r15, r8)
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.CategoryRemoteListV6 r12 = (com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.CategoryRemoteListV6) r12
            com.ingka.ikea.core.remotemodel.TopSuggestionsRemote$$serializer r15 = com.ingka.ikea.core.remotemodel.TopSuggestionsRemote$$serializer.INSTANCE
            java.lang.Object r11 = r0.A(r1, r11, r15, r8)
            com.ingka.ikea.core.remotemodel.TopSuggestionsRemote r11 = (com.ingka.ikea.core.remotemodel.TopSuggestionsRemote) r11
            r2 = r2[r5]
            java.lang.Object r2 = r0.A(r1, r5, r2, r8)
            java.util.List r2 = (java.util.List) r2
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote$$serializer r5 = com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote$$serializer.INSTANCE
            java.lang.Object r10 = r0.A(r1, r10, r5, r8)
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote r10 = (com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote) r10
            r19 = r2
            com.ingka.ikea.core.remotemodel.CampaignsRemote$$serializer r2 = com.ingka.ikea.core.remotemodel.CampaignsRemote$$serializer.INSTANCE
            java.lang.Object r2 = r0.A(r1, r9, r2, r8)
            com.ingka.ikea.core.remotemodel.CampaignsRemote r2 = (com.ingka.ikea.core.remotemodel.CampaignsRemote) r2
            r9 = 11
            java.lang.Object r9 = r0.A(r1, r9, r5, r8)
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote r9 = (com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote) r9
            r18 = r2
            r2 = 12
            java.lang.Object r2 = r0.A(r1, r2, r5, r8)
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote r2 = (com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote) r2
            r5 = 13
            java.lang.Object r5 = r0.A(r1, r5, r15, r8)
            com.ingka.ikea.core.remotemodel.TopSuggestionsRemote r5 = (com.ingka.ikea.core.remotemodel.TopSuggestionsRemote) r5
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.CategoryRemoteV6$$serializer r15 = com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.CategoryRemoteV6$$serializer.INSTANCE
            r17 = r2
            r2 = 14
            java.lang.Object r2 = r0.A(r1, r2, r15, r8)
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.CategoryRemoteV6 r2 = (com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.CategoryRemoteV6) r2
            jK.Y0 r15 = jK.Y0.f144077a
            r16 = r2
            r2 = 15
            java.lang.Object r2 = r0.A(r1, r2, r15, r8)
            java.lang.String r2 = (java.lang.String) r2
            r8 = 65535(0xffff, float:9.1834E-41)
            r48 = r2
            r33 = r3
            r35 = r4
            r46 = r5
            r34 = r6
            r36 = r7
            r32 = r8
            r44 = r9
            r42 = r10
            r40 = r11
            r39 = r12
            r38 = r13
            r37 = r14
            r47 = r16
            r45 = r17
            r43 = r18
            r41 = r19
            goto L_0x0298
        L_0x00d9:
            r28 = r6
            r3 = r8
            r4 = r3
            r5 = r4
            r6 = r5
            r9 = r6
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r24 = r15
            r25 = r24
            r26 = r25
            r27 = r26
            r8 = r7
            r7 = r27
        L_0x00f1:
            if (r28 == 0) goto L_0x026a
            r29 = r14
            int r14 = r0.p(r1)
            switch(r14) {
                case -1: goto L_0x0256;
                case 0: goto L_0x0232;
                case 1: goto L_0x0218;
                case 2: goto L_0x01fb;
                case 3: goto L_0x01e0;
                case 4: goto L_0x01c6;
                case 5: goto L_0x01ad;
                case 6: goto L_0x019d;
                case 7: goto L_0x018c;
                case 8: goto L_0x017d;
                case 9: goto L_0x016c;
                case 10: goto L_0x015b;
                case 11: goto L_0x014a;
                case 12: goto L_0x0139;
                case 13: goto L_0x0128;
                case 14: goto L_0x0117;
                case 15: goto L_0x0102;
                default: goto L_0x00fc;
            }
        L_0x00fc:
            fK.E r0 = new fK.E
            r0.<init>((int) r14)
            throw r0
        L_0x0102:
            jK.Y0 r14 = jK.Y0.f144077a
            r30 = r15
            r15 = 15
            java.lang.Object r4 = r0.A(r1, r15, r14, r4)
            java.lang.String r4 = (java.lang.String) r4
            r14 = 32768(0x8000, float:4.5918E-41)
            r8 = r8 | r14
        L_0x0112:
            r14 = r29
            r15 = r30
            goto L_0x00f1
        L_0x0117:
            r30 = r15
            r15 = 15
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.CategoryRemoteV6$$serializer r14 = com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.CategoryRemoteV6$$serializer.INSTANCE
            r15 = 14
            java.lang.Object r6 = r0.A(r1, r15, r14, r6)
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.CategoryRemoteV6 r6 = (com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.CategoryRemoteV6) r6
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
            goto L_0x0112
        L_0x0128:
            r30 = r15
            r15 = 14
            com.ingka.ikea.core.remotemodel.TopSuggestionsRemote$$serializer r14 = com.ingka.ikea.core.remotemodel.TopSuggestionsRemote$$serializer.INSTANCE
            r15 = 13
            java.lang.Object r7 = r0.A(r1, r15, r14, r7)
            com.ingka.ikea.core.remotemodel.TopSuggestionsRemote r7 = (com.ingka.ikea.core.remotemodel.TopSuggestionsRemote) r7
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0112
        L_0x0139:
            r30 = r15
            r15 = 13
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote$$serializer r14 = com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote$$serializer.INSTANCE
            r15 = 12
            java.lang.Object r3 = r0.A(r1, r15, r14, r3)
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote r3 = (com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote) r3
            r8 = r8 | 4096(0x1000, float:5.74E-42)
            goto L_0x0112
        L_0x014a:
            r30 = r15
            r15 = 12
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote$$serializer r14 = com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote$$serializer.INSTANCE
            r15 = 11
            java.lang.Object r9 = r0.A(r1, r15, r14, r9)
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote r9 = (com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote) r9
            r8 = r8 | 2048(0x800, float:2.87E-42)
            goto L_0x0112
        L_0x015b:
            r30 = r15
            r15 = 11
            com.ingka.ikea.core.remotemodel.CampaignsRemote$$serializer r14 = com.ingka.ikea.core.remotemodel.CampaignsRemote$$serializer.INSTANCE
            r15 = 10
            java.lang.Object r10 = r0.A(r1, r15, r14, r10)
            com.ingka.ikea.core.remotemodel.CampaignsRemote r10 = (com.ingka.ikea.core.remotemodel.CampaignsRemote) r10
            r8 = r8 | 1024(0x400, float:1.435E-42)
            goto L_0x0112
        L_0x016c:
            r30 = r15
            r15 = 10
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote$$serializer r14 = com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote$$serializer.INSTANCE
            r15 = 9
            java.lang.Object r5 = r0.A(r1, r15, r14, r5)
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote r5 = (com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.SearchInspireFeedRemote) r5
            r8 = r8 | 512(0x200, float:7.175E-43)
            goto L_0x0112
        L_0x017d:
            r30 = r15
            r14 = 8
            r15 = r2[r14]
            java.lang.Object r11 = r0.A(r1, r14, r15, r11)
            java.util.List r11 = (java.util.List) r11
            r8 = r8 | 256(0x100, float:3.59E-43)
            goto L_0x0112
        L_0x018c:
            r30 = r15
            r14 = 8
            com.ingka.ikea.core.remotemodel.TopSuggestionsRemote$$serializer r15 = com.ingka.ikea.core.remotemodel.TopSuggestionsRemote$$serializer.INSTANCE
            r14 = 7
            java.lang.Object r12 = r0.A(r1, r14, r15, r12)
            com.ingka.ikea.core.remotemodel.TopSuggestionsRemote r12 = (com.ingka.ikea.core.remotemodel.TopSuggestionsRemote) r12
            r8 = r8 | 128(0x80, float:1.794E-43)
            goto L_0x0112
        L_0x019d:
            r30 = r15
            r14 = 7
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.CategoryRemoteListV6$$serializer r15 = com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.CategoryRemoteListV6$$serializer.INSTANCE
            r14 = 6
            java.lang.Object r13 = r0.A(r1, r14, r15, r13)
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.CategoryRemoteListV6 r13 = (com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.CategoryRemoteListV6) r13
            r8 = r8 | 64
            goto L_0x0112
        L_0x01ad:
            r30 = r15
            r14 = 6
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.HeaderRemoteV6$$serializer r15 = com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.HeaderRemoteV6$$serializer.INSTANCE
            r23 = r3
            r3 = r30
            r14 = 5
            java.lang.Object r3 = r0.A(r1, r14, r15, r3)
            r15 = r3
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.HeaderRemoteV6 r15 = (com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.HeaderRemoteV6) r15
            r8 = r8 | 32
            r3 = r23
            r14 = r29
            goto L_0x00f1
        L_0x01c6:
            r23 = r3
            r3 = r15
            r14 = 5
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.MetaInfoRemoteV6$$serializer r15 = com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.MetaInfoRemoteV6$$serializer.INSTANCE
            r22 = r3
            r3 = r29
            r14 = 4
            java.lang.Object r3 = r0.A(r1, r14, r15, r3)
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.MetaInfoRemoteV6 r3 = (com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.MetaInfoRemoteV6) r3
            r8 = r8 | 16
            r14 = r3
        L_0x01da:
            r15 = r22
        L_0x01dc:
            r3 = r23
            goto L_0x00f1
        L_0x01e0:
            r23 = r3
            r22 = r15
            r3 = r29
            r14 = 4
            com.ingka.ikea.core.remotemodel.KeyBenefitsRemote$$serializer r15 = com.ingka.ikea.core.remotemodel.KeyBenefitsRemote$$serializer.INSTANCE
            r21 = r3
            r3 = r27
            r14 = 3
            java.lang.Object r3 = r0.A(r1, r14, r15, r3)
            r27 = r3
            com.ingka.ikea.core.remotemodel.KeyBenefitsRemote r27 = (com.ingka.ikea.core.remotemodel.KeyBenefitsRemote) r27
            r8 = r8 | 8
        L_0x01f8:
            r14 = r21
            goto L_0x01da
        L_0x01fb:
            r23 = r3
            r22 = r15
            r3 = r27
            r21 = r29
            r14 = 3
            jK.i r15 = jK.C17457i.f144111a
            r20 = r3
            r3 = r26
            r14 = 2
            java.lang.Object r3 = r0.A(r1, r14, r15, r3)
            r26 = r3
            java.lang.Boolean r26 = (java.lang.Boolean) r26
            r8 = r8 | 4
            r27 = r20
            goto L_0x01f8
        L_0x0218:
            r23 = r3
            r22 = r15
            r3 = r26
            r20 = r27
            r21 = r29
            r15 = 1
            r14 = r2[r15]
            r3 = r25
            java.lang.Object r3 = r0.A(r1, r15, r14, r3)
            r25 = r3
            java.util.List r25 = (java.util.List) r25
            r8 = r8 | 2
            goto L_0x01f8
        L_0x0232:
            r23 = r3
            r22 = r15
            r3 = r25
            r20 = r27
            r21 = r29
            r14 = 0
            r15 = r2[r14]
            r25 = r2
            r2 = r24
            java.lang.Object r2 = r0.o(r1, r14, r15, r2)
            r24 = r2
            java.util.List r24 = (java.util.List) r24
            r8 = r8 | 1
            r14 = r21
            r15 = r22
        L_0x0251:
            r2 = r25
            r25 = r3
            goto L_0x01dc
        L_0x0256:
            r23 = r3
            r22 = r15
            r3 = r25
            r20 = r27
            r21 = r29
            r14 = 0
            r25 = r2
            r2 = r24
            r28 = r14
            r14 = r21
            goto L_0x0251
        L_0x026a:
            r23 = r3
            r21 = r14
            r22 = r15
            r2 = r24
            r3 = r25
            r20 = r27
            r33 = r2
            r34 = r3
            r48 = r4
            r42 = r5
            r47 = r6
            r46 = r7
            r32 = r8
            r44 = r9
            r43 = r10
            r41 = r11
            r40 = r12
            r39 = r13
            r36 = r20
            r37 = r21
            r38 = r22
            r45 = r23
            r35 = r26
        L_0x0298:
            r0.c(r1)
            com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.PlpDetailResponseV6 r0 = new com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.PlpDetailResponseV6
            r31 = r0
            r49 = 0
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.PlpDetailResponseV6$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote.PlpDetailResponseV6");
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, PlpDetailResponseV6 plpDetailResponseV6) {
        C17542s.j(encoder, "encoder");
        C17542s.j(plpDetailResponseV6, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        PlpDetailResponseV6.c(plpDetailResponseV6, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = PlpDetailResponseV6.f93432q;
        KSerializer<?> kSerializer = a10[0];
        KSerializer<?> u10 = C17294a.u(a10[1]);
        KSerializer<?> u11 = C17294a.u(C17457i.f144111a);
        KSerializer<?> u12 = C17294a.u(KeyBenefitsRemote$$serializer.INSTANCE);
        KSerializer<?> u13 = C17294a.u(MetaInfoRemoteV6$$serializer.INSTANCE);
        KSerializer<?> u14 = C17294a.u(HeaderRemoteV6$$serializer.INSTANCE);
        KSerializer<?> u15 = C17294a.u(CategoryRemoteListV6$$serializer.INSTANCE);
        TopSuggestionsRemote$$serializer topSuggestionsRemote$$serializer = TopSuggestionsRemote$$serializer.INSTANCE;
        KSerializer<?> u16 = C17294a.u(topSuggestionsRemote$$serializer);
        KSerializer<?> u17 = C17294a.u(a10[8]);
        SearchInspireFeedRemote$$serializer searchInspireFeedRemote$$serializer = SearchInspireFeedRemote$$serializer.INSTANCE;
        return new KSerializer[]{kSerializer, u10, u11, u12, u13, u14, u15, u16, u17, C17294a.u(searchInspireFeedRemote$$serializer), C17294a.u(CampaignsRemote$$serializer.INSTANCE), C17294a.u(searchInspireFeedRemote$$serializer), C17294a.u(searchInspireFeedRemote$$serializer), C17294a.u(topSuggestionsRemote$$serializer), C17294a.u(CategoryRemoteV6$$serializer.INSTANCE), C17294a.u(Y0.f144077a)};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
