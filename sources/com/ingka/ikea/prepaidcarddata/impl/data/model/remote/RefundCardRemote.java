package com.ingka.ikea.prepaidcarddata.impl.data.model.remote;

import XH.x;
import XH.y;
import androidx.annotation.Keep;
import ep.C11256b;
import fK.p;
import iK.C17395d;
import ix.C14584a;
import ix.b;
import ix.d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u0000 I2\u00020\u0001:\u0002JKBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rBc\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0006H\u0000¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0012\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0010\u0010+\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b+\u0010(J\u0010\u0010,\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b,\u0010(Jb\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b/\u0010(J\u0010\u00100\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010$R \u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0004\u00106\u0012\u0004\b;\u00109\u001a\u0004\b:\u0010$R \u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u00106\u0012\u0004\b=\u00109\u001a\u0004\b<\u0010$R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010>\u0012\u0004\b@\u00109\u001a\u0004\b?\u0010(R \u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\b\u00106\u0012\u0004\bB\u00109\u001a\u0004\bA\u0010$R\"\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\t\u0010>\u0012\u0004\bD\u00109\u001a\u0004\bC\u0010(R \u0010\n\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\n\u0010>\u0012\u0004\bF\u00109\u001a\u0004\bE\u0010(R \u0010\u000b\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010>\u0012\u0004\bH\u00109\u001a\u0004\bG\u0010(¨\u0006L"}, d2 = {"Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/RefundCardRemote;", "", "", "original", "current", "reserved", "", "currency", "balance", "expiry", "cardType", "cardId", "<init>", "(DDDLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(IDDDLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$prepaidcarddata_implementation_release", "(Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/RefundCardRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lep/b;", "localizedDateTimeFormatter", "dateFormat", "Lix/b;", "convertToLocal$prepaidcarddata_implementation_release", "(Lep/b;Ljava/lang/String;)Lix/b;", "convertToLocal", "component1", "()D", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "component8", "copy", "(DDDLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/RefundCardRemote;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getOriginal", "getOriginal$annotations", "()V", "getCurrent", "getCurrent$annotations", "getReserved", "getReserved$annotations", "Ljava/lang/String;", "getCurrency", "getCurrency$annotations", "getBalance", "getBalance$annotations", "getExpiry", "getExpiry$annotations", "getCardType", "getCardType$annotations", "getCardId", "getCardId$annotations", "Companion", "$serializer", "a", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RefundCardRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    private final double balance;
    private final String cardId;
    private final String cardType;
    private final String currency;
    private final double current;
    private final String expiry;
    private final double original;
    private final double reserved;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/RefundCardRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/RefundCardRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<RefundCardRemote> serializer() {
            return RefundCardRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RefundCardRemote(int i10, double d10, double d11, double d12, String str, double d13, String str2, String str3, String str4, T0 t02) {
        if (255 != (i10 & 255)) {
            E0.b(i10, 255, RefundCardRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.original = d10;
        this.current = d11;
        this.reserved = d12;
        this.currency = str;
        this.balance = d13;
        this.expiry = str2;
        this.cardType = str3;
        this.cardId = str4;
    }

    public static /* synthetic */ RefundCardRemote copy$default(RefundCardRemote refundCardRemote, double d10, double d11, double d12, String str, double d13, String str2, String str3, String str4, int i10, Object obj) {
        RefundCardRemote refundCardRemote2 = refundCardRemote;
        int i11 = i10;
        return refundCardRemote.copy((i11 & 1) != 0 ? refundCardRemote2.original : d10, (i11 & 2) != 0 ? refundCardRemote2.current : d11, (i11 & 4) != 0 ? refundCardRemote2.reserved : d12, (i11 & 8) != 0 ? refundCardRemote2.currency : str, (i11 & 16) != 0 ? refundCardRemote2.balance : d13, (i11 & 32) != 0 ? refundCardRemote2.expiry : str2, (i11 & 64) != 0 ? refundCardRemote2.cardType : str3, (i11 & 128) != 0 ? refundCardRemote2.cardId : str4);
    }

    public static /* synthetic */ void getBalance$annotations() {
    }

    public static /* synthetic */ void getCardId$annotations() {
    }

    public static /* synthetic */ void getCardType$annotations() {
    }

    public static /* synthetic */ void getCurrency$annotations() {
    }

    public static /* synthetic */ void getCurrent$annotations() {
    }

    public static /* synthetic */ void getExpiry$annotations() {
    }

    public static /* synthetic */ void getOriginal$annotations() {
    }

    public static /* synthetic */ void getReserved$annotations() {
    }

    public static final /* synthetic */ void write$Self$prepaidcarddata_implementation_release(RefundCardRemote refundCardRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.E(serialDescriptor, 0, refundCardRemote.original);
        dVar.E(serialDescriptor, 1, refundCardRemote.current);
        dVar.E(serialDescriptor, 2, refundCardRemote.reserved);
        dVar.y(serialDescriptor, 3, refundCardRemote.currency);
        dVar.E(serialDescriptor, 4, refundCardRemote.balance);
        dVar.B(serialDescriptor, 5, Y0.f144077a, refundCardRemote.expiry);
        dVar.y(serialDescriptor, 6, refundCardRemote.cardType);
        dVar.y(serialDescriptor, 7, refundCardRemote.cardId);
    }

    public final double component1() {
        return this.original;
    }

    public final double component2() {
        return this.current;
    }

    public final double component3() {
        return this.reserved;
    }

    public final String component4() {
        return this.currency;
    }

    public final double component5() {
        return this.balance;
    }

    public final String component6() {
        return this.expiry;
    }

    public final String component7() {
        return this.cardType;
    }

    public final String component8() {
        return this.cardId;
    }

    public final b convertToLocal$prepaidcarddata_implementation_release(C11256b bVar, String str) {
        Object obj;
        C11256b bVar2 = bVar;
        String str2 = str;
        C17542s.j(bVar2, "localizedDateTimeFormatter");
        C17542s.j(str2, "dateFormat");
        d a10 = a.Companion.a(this.cardType);
        String str3 = this.cardId;
        try {
            x.a aVar = x.f139812b;
            LocalDate localDate = LocalDateTime.parse(this.expiry).toLocalDate();
            C17542s.i(localDate, "toLocalDate(...)");
            obj = x.b(bVar2.e(localDate, str2));
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            x.a aVar2 = x.f139812b;
            obj = x.b(y.a(th2));
        }
        Throwable e11 = x.e(obj);
        String str4 = obj;
        if (e11 != null) {
            str4 = this.expiry;
        }
        double d10 = this.balance;
        double d11 = this.reserved;
        double d12 = this.original;
        String str5 = this.currency;
        return new b(a10, str3, d10, Double.valueOf(d11), Double.valueOf(d12), str5, (String) str4, (C14584a) null, 128, (DefaultConstructorMarker) null);
    }

    public final RefundCardRemote copy(double d10, double d11, double d12, String str, double d13, String str2, String str3, String str4) {
        String str5 = str;
        C17542s.j(str5, "currency");
        String str6 = str3;
        C17542s.j(str6, "cardType");
        String str7 = str4;
        C17542s.j(str7, "cardId");
        return new RefundCardRemote(d10, d11, d12, str5, d13, str2, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefundCardRemote)) {
            return false;
        }
        RefundCardRemote refundCardRemote = (RefundCardRemote) obj;
        return Double.compare(this.original, refundCardRemote.original) == 0 && Double.compare(this.current, refundCardRemote.current) == 0 && Double.compare(this.reserved, refundCardRemote.reserved) == 0 && C17542s.e(this.currency, refundCardRemote.currency) && Double.compare(this.balance, refundCardRemote.balance) == 0 && C17542s.e(this.expiry, refundCardRemote.expiry) && C17542s.e(this.cardType, refundCardRemote.cardType) && C17542s.e(this.cardId, refundCardRemote.cardId);
    }

    public final double getBalance() {
        return this.balance;
    }

    public final String getCardId() {
        return this.cardId;
    }

    public final String getCardType() {
        return this.cardType;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final double getCurrent() {
        return this.current;
    }

    public final String getExpiry() {
        return this.expiry;
    }

    public final double getOriginal() {
        return this.original;
    }

    public final double getReserved() {
        return this.reserved;
    }

    public int hashCode() {
        int hashCode = ((((((((Double.hashCode(this.original) * 31) + Double.hashCode(this.current)) * 31) + Double.hashCode(this.reserved)) * 31) + this.currency.hashCode()) * 31) + Double.hashCode(this.balance)) * 31;
        String str = this.expiry;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.cardType.hashCode()) * 31) + this.cardId.hashCode();
    }

    public String toString() {
        double d10 = this.original;
        double d11 = this.current;
        double d12 = this.reserved;
        String str = this.currency;
        double d13 = this.balance;
        String str2 = this.expiry;
        String str3 = this.cardType;
        String str4 = this.cardId;
        return "RefundCardRemote(original=" + d10 + ", current=" + d11 + ", reserved=" + d12 + ", currency=" + str + ", balance=" + d13 + ", expiry=" + str2 + ", cardType=" + str3 + ", cardId=" + str4 + ")";
    }

    public RefundCardRemote(double d10, double d11, double d12, String str, double d13, String str2, String str3, String str4) {
        C17542s.j(str, "currency");
        C17542s.j(str3, "cardType");
        C17542s.j(str4, "cardId");
        this.original = d10;
        this.current = d11;
        this.reserved = d12;
        this.currency = str;
        this.balance = d13;
        this.expiry = str2;
        this.cardType = str3;
        this.cardId = str4;
    }
}
