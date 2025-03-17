package com.ingka.ikea.familyrewards.datalayer.impl.remote;

import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b!\b\b\u0018\u0000 A2\u00020\u0001:\u0002B%B\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010&\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010&\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010&\u0012\u0004\b0\u0010)\u001a\u0004\b/\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010&\u0012\u0004\b2\u0010)\u001a\u0004\b%\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010&\u0012\u0004\b5\u0010)\u001a\u0004\b4\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b9\u0010)\u001a\u0004\b*\u00108R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b=\u0010)\u001a\u0004\b:\u0010<R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u00107\u0012\u0004\b>\u0010)\u001a\u0004\b6\u00108R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010&\u0012\u0004\b?\u0010)\u001a\u0004\b1\u0010\u001eR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010&\u0012\u0004\b@\u0010)\u001a\u0004\b3\u0010\u001e¨\u0006C"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/RewardRemote;", "", "", "seen0", "", "rewardId", "title", "categoryType", "expiryDate", "adjustedExpirationLabel", "status", "amount", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ContentRemote;", "rewardContent", "progress", "keysNeeded", "newBalanceInfo", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ContentRemote;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "l", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/RewardRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "i", "getRewardId$annotations", "()V", "b", "k", "getTitle$annotations", "c", "getCategoryType$annotations", "d", "getExpiryDate$annotations", "e", "getAdjustedExpirationLabel$annotations", "f", "j", "getStatus$annotations", "g", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getAmount$annotations", "h", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ContentRemote;", "()Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ContentRemote;", "getRewardContent$annotations", "getProgress$annotations", "getKeysNeeded$annotations", "getNewBalanceInfo$annotations", "Companion", "$serializer", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RewardRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95846a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95847b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95848c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95849d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95850e;

    /* renamed from: f  reason: collision with root package name */
    private final String f95851f;

    /* renamed from: g  reason: collision with root package name */
    private final Integer f95852g;

    /* renamed from: h  reason: collision with root package name */
    private final ContentRemote f95853h;

    /* renamed from: i  reason: collision with root package name */
    private final Integer f95854i;

    /* renamed from: j  reason: collision with root package name */
    private final String f95855j;

    /* renamed from: k  reason: collision with root package name */
    private final String f95856k;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/RewardRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/RewardRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<RewardRemote> serializer() {
            return RewardRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RewardRemote(int i10, String str, String str2, String str3, String str4, String str5, String str6, Integer num, ContentRemote contentRemote, Integer num2, String str7, String str8, T0 t02) {
        if (2047 != (i10 & 2047)) {
            E0.b(i10, 2047, RewardRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95846a = str;
        this.f95847b = str2;
        this.f95848c = str3;
        this.f95849d = str4;
        this.f95850e = str5;
        this.f95851f = str6;
        this.f95852g = num;
        this.f95853h = contentRemote;
        this.f95854i = num2;
        this.f95855j = str7;
        this.f95856k = str8;
    }

    public static final /* synthetic */ void l(RewardRemote rewardRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, rewardRemote.f95846a);
        dVar.B(serialDescriptor, 1, y02, rewardRemote.f95847b);
        dVar.B(serialDescriptor, 2, y02, rewardRemote.f95848c);
        dVar.B(serialDescriptor, 3, y02, rewardRemote.f95849d);
        dVar.B(serialDescriptor, 4, y02, rewardRemote.f95850e);
        dVar.B(serialDescriptor, 5, y02, rewardRemote.f95851f);
        X x10 = X.f144073a;
        dVar.B(serialDescriptor, 6, x10, rewardRemote.f95852g);
        dVar.B(serialDescriptor, 7, ContentRemote$$serializer.INSTANCE, rewardRemote.f95853h);
        dVar.B(serialDescriptor, 8, x10, rewardRemote.f95854i);
        dVar.B(serialDescriptor, 9, y02, rewardRemote.f95855j);
        dVar.B(serialDescriptor, 10, y02, rewardRemote.f95856k);
    }

    public final String a() {
        return this.f95850e;
    }

    public final Integer b() {
        return this.f95852g;
    }

    public final String c() {
        return this.f95848c;
    }

    public final String d() {
        return this.f95849d;
    }

    public final String e() {
        return this.f95855j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardRemote)) {
            return false;
        }
        RewardRemote rewardRemote = (RewardRemote) obj;
        return C17542s.e(this.f95846a, rewardRemote.f95846a) && C17542s.e(this.f95847b, rewardRemote.f95847b) && C17542s.e(this.f95848c, rewardRemote.f95848c) && C17542s.e(this.f95849d, rewardRemote.f95849d) && C17542s.e(this.f95850e, rewardRemote.f95850e) && C17542s.e(this.f95851f, rewardRemote.f95851f) && C17542s.e(this.f95852g, rewardRemote.f95852g) && C17542s.e(this.f95853h, rewardRemote.f95853h) && C17542s.e(this.f95854i, rewardRemote.f95854i) && C17542s.e(this.f95855j, rewardRemote.f95855j) && C17542s.e(this.f95856k, rewardRemote.f95856k);
    }

    public final String f() {
        return this.f95856k;
    }

    public final Integer g() {
        return this.f95854i;
    }

    public final ContentRemote h() {
        return this.f95853h;
    }

    public int hashCode() {
        String str = this.f95846a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95847b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95848c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95849d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f95850e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f95851f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.f95852g;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        ContentRemote contentRemote = this.f95853h;
        int hashCode8 = (hashCode7 + (contentRemote == null ? 0 : contentRemote.hashCode())) * 31;
        Integer num2 = this.f95854i;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.f95855j;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f95856k;
        if (str8 != null) {
            i10 = str8.hashCode();
        }
        return hashCode10 + i10;
    }

    public final String i() {
        return this.f95846a;
    }

    public final String j() {
        return this.f95851f;
    }

    public final String k() {
        return this.f95847b;
    }

    public String toString() {
        String str = this.f95846a;
        String str2 = this.f95847b;
        String str3 = this.f95848c;
        String str4 = this.f95849d;
        String str5 = this.f95850e;
        String str6 = this.f95851f;
        Integer num = this.f95852g;
        ContentRemote contentRemote = this.f95853h;
        Integer num2 = this.f95854i;
        String str7 = this.f95855j;
        String str8 = this.f95856k;
        return "RewardRemote(rewardId=" + str + ", title=" + str2 + ", categoryType=" + str3 + ", expiryDate=" + str4 + ", adjustedExpirationLabel=" + str5 + ", status=" + str6 + ", amount=" + num + ", rewardContent=" + contentRemote + ", progress=" + num2 + ", keysNeeded=" + str7 + ", newBalanceInfo=" + str8 + ")";
    }
}
