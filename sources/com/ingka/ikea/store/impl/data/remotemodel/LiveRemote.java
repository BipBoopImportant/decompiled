package com.ingka.ikea.store.impl.data.remotemodel;

import GB.e;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002) B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010\u0018R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/LiveRemote;", "Lpp/b;", "LGB/e;", "", "seen0", "", "status", "Lcom/ingka/ikea/store/impl/data/remotemodel/DataRemote;", "data", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/store/impl/data/remotemodel/DataRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/store/impl/data/remotemodel/LiveRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LGB/e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStatus$annotations", "()V", "Lcom/ingka/ikea/store/impl/data/remotemodel/DataRemote;", "getData", "()Lcom/ingka/ikea/store/impl/data/remotemodel/DataRemote;", "getData$annotations", "Companion", "$serializer", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LiveRemote implements C11768b<e> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f120422a;

    /* renamed from: b  reason: collision with root package name */
    private final DataRemote f120423b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/LiveRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/impl/data/remotemodel/LiveRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<LiveRemote> serializer() {
            return LiveRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LiveRemote(int i10, String str, DataRemote dataRemote, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, LiveRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f120422a = str;
        this.f120423b = dataRemote;
    }

    public static final /* synthetic */ void c(LiveRemote liveRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, liveRemote.f120422a);
        dVar.B(serialDescriptor, 1, DataRemote$$serializer.INSTANCE, liveRemote.f120423b);
    }

    public final String a() {
        return this.f120422a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GB.e b() {
        /*
            r12 = this;
            java.lang.String r0 = r12.f120422a
            int r1 = r0.hashCode()
            r2 = 2432586(0x251e4a, float:3.408779E-39)
            r3 = 0
            if (r1 == r2) goto L_0x0031
            r2 = 433141802(0x19d1382a, float:2.1632778E-23)
            if (r1 == r2) goto L_0x0024
            r2 = 1990776172(0x76a8d56c, float:1.7121769E33)
            if (r1 == r2) goto L_0x0017
            goto L_0x003d
        L_0x0017:
            java.lang.String r1 = "CLOSED"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0020
            goto L_0x003d
        L_0x0020:
            GB.e$b r0 = GB.e.b.Closed
            goto L_0x00ff
        L_0x0024:
            java.lang.String r1 = "UNKNOWN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002d
            goto L_0x003d
        L_0x002d:
            GB.e$b r0 = GB.e.b.Unknown
            goto L_0x00ff
        L_0x0031:
            java.lang.String r1 = "OPEN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003d
            GB.e$b r0 = GB.e.b.Open
            goto L_0x00ff
        L_0x003d:
            qv.e r0 = qv.e.WARN
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0050:
            boolean r4 = r1.hasNext()
            r10 = 0
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = r1.next()
            r5 = r4
            qv.b r5 = (qv.C11819b) r5
            boolean r5 = r5.b(r0, r10)
            if (r5 == 0) goto L_0x0050
            r2.add(r4)
            goto L_0x0050
        L_0x0068:
            java.util.Iterator r1 = r2.iterator()
            r2 = r3
            r4 = r2
        L_0x006e:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00fd
            java.lang.Object r5 = r1.next()
            qv.b r5 = (qv.C11819b) r5
            r8 = 0
            if (r2 != 0) goto L_0x00a2
            java.lang.String r2 = r12.a()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Could not parse status: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = ", falling back to Status.Unknown"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.String r2 = qv.C11818a.a(r2, r8)
            if (r2 != 0) goto L_0x009e
            goto L_0x00fd
        L_0x009e:
            java.lang.String r2 = qv.C11820c.a(r2)
        L_0x00a2:
            if (r4 != 0) goto L_0x00f1
            java.lang.Class<com.ingka.ikea.store.impl.data.remotemodel.LiveRemote> r4 = com.ingka.ikea.store.impl.data.remotemodel.LiveRemote.class
            java.lang.String r4 = r4.getName()
            kotlin.jvm.internal.C17542s.g(r4)
            r6 = 36
            r7 = 2
            java.lang.String r6 = HJ.C15854t.s1(r4, r6, r3, r7, r3)
            r9 = 46
            java.lang.String r6 = HJ.C15854t.o1(r6, r9, r3, r7, r3)
            int r7 = r6.length()
            if (r7 != 0) goto L_0x00c1
            goto L_0x00c7
        L_0x00c1:
            java.lang.String r4 = "Kt"
            java.lang.String r4 = HJ.C15854t.P0(r6, r4)
        L_0x00c7:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "main"
            r9 = 1
            boolean r6 = HJ.C15854t.b0(r6, r7, r9)
            if (r6 == 0) goto L_0x00db
            java.lang.String r6 = "m"
            goto L_0x00dd
        L_0x00db:
            java.lang.String r6 = "b"
        L_0x00dd:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = "|"
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
        L_0x00f1:
            r11 = r4
            r4 = r5
            r5 = r0
            r6 = r11
            r7 = r10
            r9 = r2
            r4.a(r5, r6, r7, r8, r9)
            r4 = r11
            goto L_0x006e
        L_0x00fd:
            GB.e$b r0 = GB.e.b.Unknown
        L_0x00ff:
            GB.e r1 = new GB.e
            com.ingka.ikea.store.impl.data.remotemodel.DataRemote r2 = r12.f120423b
            if (r2 == 0) goto L_0x0109
            GB.e$a r3 = r2.a()
        L_0x0109:
            r1.<init>(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.store.impl.data.remotemodel.LiveRemote.b():GB.e");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveRemote)) {
            return false;
        }
        LiveRemote liveRemote = (LiveRemote) obj;
        return C17542s.e(this.f120422a, liveRemote.f120422a) && C17542s.e(this.f120423b, liveRemote.f120423b);
    }

    public int hashCode() {
        int hashCode = this.f120422a.hashCode() * 31;
        DataRemote dataRemote = this.f120423b;
        return hashCode + (dataRemote == null ? 0 : dataRemote.hashCode());
    }

    public String toString() {
        String str = this.f120422a;
        DataRemote dataRemote = this.f120423b;
        return "LiveRemote(status=" + str + ", data=" + dataRemote + ")";
    }
}
