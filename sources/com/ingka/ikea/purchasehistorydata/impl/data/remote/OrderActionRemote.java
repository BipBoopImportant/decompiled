package com.ingka.ikea.purchasehistorydata.impl.data.remote;

import HJ.C15854t;
import Hx.c;
import androidx.annotation.Keep;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
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
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0004¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote;", "", "<init>", "()V", "enabled", "", "getEnabled", "()Ljava/lang/Boolean;", "doable", "getDoable", "isDoable", "Action", "AssemblyActionRemote", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$Action;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$AssemblyActionRemote;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Keep
public abstract class OrderActionRemote {
    public static final int $stable = 0;

    @p
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0015\b\b\u0018\u0000 52\u00020\u0001:\u00026&BI\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010'\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010)R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010.\u0012\u0004\b0\u0010+\u001a\u0004\b/\u0010\u001fR(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u00101\u0012\u0004\b4\u0010+\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$Action;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote;", "", "seen0", "", "enabled", "doable", "", "token", "", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/CancelReasonRemote;", "reasonCodes", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$Action;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "LHx/c$d$e;", "c", "()LHx/c$d$e;", "LHx/c$d$b;", "b", "()LHx/c$d$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "getEnabled$annotations", "()V", "getDoable", "getDoable$annotations", "Ljava/lang/String;", "getToken", "getToken$annotations", "Ljava/util/List;", "getReasonCodes", "()Ljava/util/List;", "getReasonCodes$annotations", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action extends OrderActionRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: e  reason: collision with root package name */
        public static final int f119523e = 8;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final KSerializer<Object>[] f119524f = {null, null, null, new C17451f(CancelReasonRemote$$serializer.INSTANCE)};

        /* renamed from: a  reason: collision with root package name */
        private final Boolean f119525a;

        /* renamed from: b  reason: collision with root package name */
        private final Boolean f119526b;

        /* renamed from: c  reason: collision with root package name */
        private final String f119527c;

        /* renamed from: d  reason: collision with root package name */
        private final List<CancelReasonRemote> f119528d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$Action$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$Action;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Action> serializer() {
                return OrderActionRemote$Action$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Action(int i10, Boolean bool, Boolean bool2, String str, List list, T0 t02) {
            super((DefaultConstructorMarker) null);
            if (15 != (i10 & 15)) {
                E0.b(i10, 15, OrderActionRemote$Action$$serializer.INSTANCE.getDescriptor());
            }
            this.f119525a = bool;
            this.f119526b = bool2;
            this.f119527c = str;
            this.f119528d = list;
        }

        public static final /* synthetic */ void d(Action action, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f119524f;
            C17457i iVar = C17457i.f144111a;
            dVar.B(serialDescriptor, 0, iVar, action.getEnabled());
            dVar.B(serialDescriptor, 1, iVar, action.getDoable());
            dVar.B(serialDescriptor, 2, Y0.f144077a, action.f119527c);
            dVar.B(serialDescriptor, 3, kSerializerArr[3], action.f119528d);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
            r0 = r4.f119527c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final Hx.c.d.b b() {
            /*
                r4 = this;
                java.lang.Boolean r0 = r4.isDoable()
                if (r0 == 0) goto L_0x0054
                boolean r0 = r0.booleanValue()
                java.util.List<com.ingka.ikea.purchasehistorydata.impl.data.remote.CancelReasonRemote> r1 = r4.f119528d
                if (r1 == 0) goto L_0x002f
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x0019:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0033
                java.lang.Object r3 = r1.next()
                com.ingka.ikea.purchasehistorydata.impl.data.remote.CancelReasonRemote r3 = (com.ingka.ikea.purchasehistorydata.impl.data.remote.CancelReasonRemote) r3
                Hx.c$d$b$a r3 = r3.a()
                if (r3 == 0) goto L_0x0019
                r2.add(r3)
                goto L_0x0019
            L_0x002f:
                java.util.List r2 = YH.C16877v.n()
            L_0x0033:
                Hx.c$d$b r1 = new Hx.c$d$b
                if (r0 == 0) goto L_0x004d
                java.lang.String r0 = r4.f119527c
                if (r0 == 0) goto L_0x004d
                boolean r0 = HJ.C15854t.v0(r0)
                if (r0 == 0) goto L_0x0042
                goto L_0x004d
            L_0x0042:
                r0 = r2
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x004d
                r0 = 1
                goto L_0x004e
            L_0x004d:
                r0 = 0
            L_0x004e:
                java.lang.String r3 = r4.f119527c
                r1.<init>(r0, r3, r2)
                goto L_0x0055
            L_0x0054:
                r1 = 0
            L_0x0055:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.purchasehistorydata.impl.data.remote.OrderActionRemote.Action.b():Hx.c$d$b");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r3.f119527c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final Hx.c.d.e c() {
            /*
                r3 = this;
                java.lang.Boolean r0 = r3.isDoable()
                if (r0 == 0) goto L_0x0022
                boolean r0 = r0.booleanValue()
                Hx.c$d$e r1 = new Hx.c$d$e
                if (r0 == 0) goto L_0x001b
                java.lang.String r0 = r3.f119527c
                if (r0 == 0) goto L_0x001b
                boolean r0 = HJ.C15854t.v0(r0)
                if (r0 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r0 = 1
                goto L_0x001c
            L_0x001b:
                r0 = 0
            L_0x001c:
                java.lang.String r2 = r3.f119527c
                r1.<init>(r0, r2)
                goto L_0x0023
            L_0x0022:
                r1 = 0
            L_0x0023:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.purchasehistorydata.impl.data.remote.OrderActionRemote.Action.c():Hx.c$d$e");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return C17542s.e(this.f119525a, action.f119525a) && C17542s.e(this.f119526b, action.f119526b) && C17542s.e(this.f119527c, action.f119527c) && C17542s.e(this.f119528d, action.f119528d);
        }

        public Boolean getDoable() {
            return this.f119526b;
        }

        public Boolean getEnabled() {
            return this.f119525a;
        }

        public int hashCode() {
            Boolean bool = this.f119525a;
            int i10 = 0;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.f119526b;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.f119527c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List<CancelReasonRemote> list = this.f119528d;
            if (list != null) {
                i10 = list.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            Boolean bool = this.f119525a;
            Boolean bool2 = this.f119526b;
            String str = this.f119527c;
            List<CancelReasonRemote> list = this.f119528d;
            return "Action(enabled=" + bool + ", doable=" + bool2 + ", token=" + str + ", reasonCodes=" + list + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0011\b\b\u0018\u0000 +2\u00020\u0001:\u0002,\u0016B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\"R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010\u0019¨\u0006-"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$AssemblyActionRemote;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote;", "", "seen0", "", "enabled", "doable", "", "assemblyUrl", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$AssemblyActionRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "LHx/c$d$a;", "a", "()LHx/c$d$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "getEnabled$annotations", "()V", "getDoable", "getDoable$annotations", "c", "Ljava/lang/String;", "getAssemblyUrl", "getAssemblyUrl$annotations", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AssemblyActionRemote extends OrderActionRemote {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final Boolean f119529a;

        /* renamed from: b  reason: collision with root package name */
        private final Boolean f119530b;

        /* renamed from: c  reason: collision with root package name */
        private final String f119531c;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$AssemblyActionRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/OrderActionRemote$AssemblyActionRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<AssemblyActionRemote> serializer() {
                return OrderActionRemote$AssemblyActionRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AssemblyActionRemote(int i10, Boolean bool, Boolean bool2, String str, T0 t02) {
            super((DefaultConstructorMarker) null);
            if (7 != (i10 & 7)) {
                E0.b(i10, 7, OrderActionRemote$AssemblyActionRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f119529a = bool;
            this.f119530b = bool2;
            this.f119531c = str;
        }

        public static final /* synthetic */ void b(AssemblyActionRemote assemblyActionRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            C17457i iVar = C17457i.f144111a;
            dVar.B(serialDescriptor, 0, iVar, assemblyActionRemote.getEnabled());
            dVar.B(serialDescriptor, 1, iVar, assemblyActionRemote.getDoable());
            dVar.B(serialDescriptor, 2, Y0.f144077a, assemblyActionRemote.f119531c);
        }

        public final c.d.a a() {
            Boolean isDoable = isDoable();
            if (isDoable == null) {
                return null;
            }
            boolean booleanValue = isDoable.booleanValue();
            String str = this.f119531c;
            if (str != null && str.length() != 0) {
                return new c.d.a(booleanValue, this.f119531c);
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Missing assembly url");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        return null;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = AssemblyActionRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalArgumentException, str4);
                str2 = str4;
                str3 = str5;
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssemblyActionRemote)) {
                return false;
            }
            AssemblyActionRemote assemblyActionRemote = (AssemblyActionRemote) obj;
            return C17542s.e(this.f119529a, assemblyActionRemote.f119529a) && C17542s.e(this.f119530b, assemblyActionRemote.f119530b) && C17542s.e(this.f119531c, assemblyActionRemote.f119531c);
        }

        public Boolean getDoable() {
            return this.f119530b;
        }

        public Boolean getEnabled() {
            return this.f119529a;
        }

        public int hashCode() {
            Boolean bool = this.f119529a;
            int i10 = 0;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.f119530b;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.f119531c;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            Boolean bool = this.f119529a;
            Boolean bool2 = this.f119530b;
            String str = this.f119531c;
            return "AssemblyActionRemote(enabled=" + bool + ", doable=" + bool2 + ", assemblyUrl=" + str + ")";
        }
    }

    public /* synthetic */ OrderActionRemote(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Boolean getDoable();

    public abstract Boolean getEnabled();

    /* access modifiers changed from: protected */
    public final Boolean isDoable() {
        if (!C17542s.e(getEnabled(), Boolean.TRUE)) {
            return null;
        }
        if (getDoable() == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("doable was null");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalArgumentException, str3);
                str = str3;
                str2 = str4;
            }
        }
        return Boolean.valueOf(C17542s.e(getDoable(), Boolean.TRUE));
    }

    private OrderActionRemote() {
    }
}
