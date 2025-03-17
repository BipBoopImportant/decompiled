package com.ingka.ikea.purchasehistorydata.impl.data.remote;

import HJ.C15854t;
import Hx.e;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@p
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 +2\u00020\u0001:\u0002,\u0016B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0019R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010#\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchasePaymentRemote;", "", "", "seen0", "", "group", "information", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;", "amount", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchasePaymentRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "LHx/e;", "a", "()LHx/e;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getGroup", "getGroup$annotations", "()V", "getInformation", "getInformation$annotations", "c", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;", "getAmount", "()Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/MoneyRemote;", "getAmount$annotations", "Companion", "$serializer", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PurchasePaymentRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f119558a;

    /* renamed from: b  reason: collision with root package name */
    private final String f119559b;

    /* renamed from: c  reason: collision with root package name */
    private final MoneyRemote f119560c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchasePaymentRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchasePaymentRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PurchasePaymentRemote> serializer() {
            return PurchasePaymentRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PurchasePaymentRemote(int i10, String str, String str2, MoneyRemote moneyRemote, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, PurchasePaymentRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f119558a = str;
        this.f119559b = str2;
        this.f119560c = moneyRemote;
    }

    public static final /* synthetic */ void b(PurchasePaymentRemote purchasePaymentRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, purchasePaymentRemote.f119558a);
        dVar.B(serialDescriptor, 1, y02, purchasePaymentRemote.f119559b);
        dVar.B(serialDescriptor, 2, MoneyRemote$$serializer.INSTANCE, purchasePaymentRemote.f119560c);
    }

    public final e a() {
        String str = this.f119558a;
        String str2 = null;
        if (str == null || C15854t.v0(str)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid payment type");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = PurchasePaymentRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str6 = str4;
                bVar.a(eVar, str6, false, illegalArgumentException, str5);
                str3 = str5;
                str4 = str6;
            }
        }
        e.a a11 = e.a.Companion.a(this.f119558a);
        String str7 = this.f119559b;
        MoneyRemote moneyRemote = this.f119560c;
        if (moneyRemote != null) {
            str2 = moneyRemote.a();
        }
        return new e(a11, str7, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasePaymentRemote)) {
            return false;
        }
        PurchasePaymentRemote purchasePaymentRemote = (PurchasePaymentRemote) obj;
        return C17542s.e(this.f119558a, purchasePaymentRemote.f119558a) && C17542s.e(this.f119559b, purchasePaymentRemote.f119559b) && C17542s.e(this.f119560c, purchasePaymentRemote.f119560c);
    }

    public int hashCode() {
        String str = this.f119558a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f119559b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        MoneyRemote moneyRemote = this.f119560c;
        if (moneyRemote != null) {
            i10 = moneyRemote.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f119558a;
        String str2 = this.f119559b;
        MoneyRemote moneyRemote = this.f119560c;
        return "PurchasePaymentRemote(group=" + str + ", information=" + str2 + ", amount=" + moneyRemote + ")";
    }
}
