package com.ingka.ikea.core.remotemodel;

import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kp.i;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\b\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002<\u001aBW\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001dR \u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001dR \u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010%\u0012\u0004\b-\u0010(\u001a\u0004\b,\u0010\u001dR \u0010\t\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010%\u0012\u0004\b0\u0010(\u001a\u0004\b/\u0010\u001dR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010(\u001a\u0004\b3\u00104R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010(\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/ingka/ikea/core/remotemodel/ReferenceImageRemote;", "Lpp/b;", "Lkp/i;", "", "seen0", "", "url", "altText", "id", "imageType", "Lcom/ingka/ikea/core/remotemodel/ReferenceImageSourceRemote;", "source", "", "aspectRatio", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/ReferenceImageSourceRemote;Ljava/lang/Double;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/remotemodel/ReferenceImageRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lkp/i;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getUrl$annotations", "()V", "getAltText", "getAltText$annotations", "c", "getId", "getId$annotations", "d", "getImageType", "getImageType$annotations", "e", "Lcom/ingka/ikea/core/remotemodel/ReferenceImageSourceRemote;", "getSource", "()Lcom/ingka/ikea/core/remotemodel/ReferenceImageSourceRemote;", "getSource$annotations", "f", "Ljava/lang/Double;", "getAspectRatio", "()Ljava/lang/Double;", "getAspectRatio$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferenceImageRemote implements C11768b<i> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95225a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95226b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95227c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95228d;

    /* renamed from: e  reason: collision with root package name */
    private final ReferenceImageSourceRemote f95229e;

    /* renamed from: f  reason: collision with root package name */
    private final Double f95230f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/ReferenceImageRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/ReferenceImageRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<ReferenceImageRemote> serializer() {
            return ReferenceImageRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ReferenceImageRemote(int i10, String str, String str2, String str3, String str4, ReferenceImageSourceRemote referenceImageSourceRemote, Double d10, T0 t02) {
        if (63 != (i10 & 63)) {
            E0.b(i10, 63, ReferenceImageRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95225a = str;
        this.f95226b = str2;
        this.f95227c = str3;
        this.f95228d = str4;
        this.f95229e = referenceImageSourceRemote;
        this.f95230f = d10;
    }

    public static final /* synthetic */ void b(ReferenceImageRemote referenceImageRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, referenceImageRemote.f95225a);
        dVar.y(serialDescriptor, 1, referenceImageRemote.f95226b);
        dVar.y(serialDescriptor, 2, referenceImageRemote.f95227c);
        dVar.y(serialDescriptor, 3, referenceImageRemote.f95228d);
        dVar.B(serialDescriptor, 4, ReferenceImageSourceRemote$$serializer.INSTANCE, referenceImageRemote.f95229e);
        dVar.B(serialDescriptor, 5, C17438C.f144010a, referenceImageRemote.f95230f);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kp.i a() {
        /*
            r13 = this;
            java.lang.String r0 = r13.f95228d
            int r1 = r0.hashCode()
            r2 = 0
            switch(r1) {
                case 83953: goto L_0x0031;
                case 81665115: goto L_0x0025;
                case 697990260: goto L_0x0019;
                case 1804446588: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0039
        L_0x000b:
            java.lang.String r1 = "REGULAR"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0014
            goto L_0x0039
        L_0x0014:
            kp.i$a r0 = kp.i.a.REGULAR
        L_0x0016:
            r7 = r0
            goto L_0x0101
        L_0x0019:
            java.lang.String r1 = "SHOPPABLE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0022
            goto L_0x0039
        L_0x0022:
            kp.i$a r0 = kp.i.a.SHOPPABLE
            goto L_0x0016
        L_0x0025:
            java.lang.String r1 = "VIDEO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002e
            goto L_0x0039
        L_0x002e:
            kp.i$a r0 = kp.i.a.VIDEO
            goto L_0x0016
        L_0x0031:
            java.lang.String r1 = "UGC"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00fd
        L_0x0039:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r13.f95228d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown reference image type: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            qv.e r1 = qv.e.ERROR
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0064:
            boolean r5 = r3.hasNext()
            r9 = 0
            if (r5 == 0) goto L_0x007c
            java.lang.Object r5 = r3.next()
            r6 = r5
            qv.b r6 = (qv.C11819b) r6
            boolean r6 = r6.b(r1, r9)
            if (r6 == 0) goto L_0x0064
            r4.add(r5)
            goto L_0x0064
        L_0x007c:
            java.util.Iterator r10 = r4.iterator()
            r3 = r2
            r4 = r3
        L_0x0082:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x00f9
            java.lang.Object r5 = r10.next()
            qv.b r5 = (qv.C11819b) r5
            if (r3 != 0) goto L_0x009c
            java.lang.String r3 = qv.C11818a.a(r2, r0)
            if (r3 != 0) goto L_0x0098
            goto L_0x00f9
        L_0x0098:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x009c:
            r11 = r3
            if (r4 != 0) goto L_0x00ec
            java.lang.Class<com.ingka.ikea.core.remotemodel.ReferenceImageRemote> r3 = com.ingka.ikea.core.remotemodel.ReferenceImageRemote.class
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r4 = 36
            r6 = 2
            java.lang.String r4 = HJ.C15854t.s1(r3, r4, r2, r6, r2)
            r7 = 46
            java.lang.String r4 = HJ.C15854t.o1(r4, r7, r2, r6, r2)
            int r6 = r4.length()
            if (r6 != 0) goto L_0x00bc
            goto L_0x00c2
        L_0x00bc:
            java.lang.String r3 = "Kt"
            java.lang.String r3 = HJ.C15854t.P0(r4, r3)
        L_0x00c2:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            java.lang.String r6 = "main"
            r7 = 1
            boolean r4 = HJ.C15854t.b0(r4, r6, r7)
            if (r4 == 0) goto L_0x00d6
            java.lang.String r4 = "m"
            goto L_0x00d8
        L_0x00d6:
            java.lang.String r4 = "b"
        L_0x00d8:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = "|"
            r6.append(r4)
            r6.append(r3)
            java.lang.String r4 = r6.toString()
        L_0x00ec:
            r12 = r4
            r3 = r5
            r4 = r1
            r5 = r12
            r6 = r9
            r7 = r0
            r8 = r11
            r3.a(r4, r5, r6, r7, r8)
            r3 = r11
            r4 = r12
            goto L_0x0082
        L_0x00f9:
            kp.i$a r0 = kp.i.a.REGULAR
            goto L_0x0016
        L_0x00fd:
            kp.i$a r0 = kp.i.a.USER_CONTENT
            goto L_0x0016
        L_0x0101:
            kp.i r0 = new kp.i
            java.lang.String r4 = r13.f95225a
            java.lang.String r5 = r13.f95226b
            java.lang.String r6 = r13.f95227c
            com.ingka.ikea.core.remotemodel.ReferenceImageSourceRemote r1 = r13.f95229e
            if (r1 == 0) goto L_0x0111
            kp.j r2 = r1.a()
        L_0x0111:
            r8 = r2
            java.lang.Double r9 = r13.f95230f
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.core.remotemodel.ReferenceImageRemote.a():kp.i");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferenceImageRemote)) {
            return false;
        }
        ReferenceImageRemote referenceImageRemote = (ReferenceImageRemote) obj;
        return C17542s.e(this.f95225a, referenceImageRemote.f95225a) && C17542s.e(this.f95226b, referenceImageRemote.f95226b) && C17542s.e(this.f95227c, referenceImageRemote.f95227c) && C17542s.e(this.f95228d, referenceImageRemote.f95228d) && C17542s.e(this.f95229e, referenceImageRemote.f95229e) && C17542s.e(this.f95230f, referenceImageRemote.f95230f);
    }

    public int hashCode() {
        int hashCode = ((((((this.f95225a.hashCode() * 31) + this.f95226b.hashCode()) * 31) + this.f95227c.hashCode()) * 31) + this.f95228d.hashCode()) * 31;
        ReferenceImageSourceRemote referenceImageSourceRemote = this.f95229e;
        int i10 = 0;
        int hashCode2 = (hashCode + (referenceImageSourceRemote == null ? 0 : referenceImageSourceRemote.hashCode())) * 31;
        Double d10 = this.f95230f;
        if (d10 != null) {
            i10 = d10.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f95225a;
        String str2 = this.f95226b;
        String str3 = this.f95227c;
        String str4 = this.f95228d;
        ReferenceImageSourceRemote referenceImageSourceRemote = this.f95229e;
        Double d10 = this.f95230f;
        return "ReferenceImageRemote(url=" + str + ", altText=" + str2 + ", id=" + str3 + ", imageType=" + str4 + ", source=" + referenceImageSourceRemote + ", aspectRatio=" + d10 + ")";
    }
}
