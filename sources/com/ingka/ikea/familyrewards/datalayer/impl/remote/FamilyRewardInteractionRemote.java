package com.ingka.ikea.familyrewards.datalayer.impl.remote;

import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\b\u0018\u0000 E2\u00020\u0001:\u0002F&B\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010'\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010'\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u0010*\u001a\u0004\b3\u00104R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u00106\u0012\u0004\b9\u0010*\u001a\u0004\b7\u00108R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u00102\u0012\u0004\b;\u0010*\u001a\u0004\b:\u00104R\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010'\u0012\u0004\b<\u0010*\u001a\u0004\b1\u0010 R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010=\u0012\u0004\b@\u0010*\u001a\u0004\b>\u0010?R(\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010A\u0012\u0004\bC\u0010*\u001a\u0004\b+\u0010BR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u00102\u0012\u0004\bD\u0010*\u001a\u0004\b.\u00104¨\u0006G"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardInteractionRemote;", "", "", "seen0", "", "id", "title", "url", "keys", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ImageRemote;", "image", "frequencyRepeat", "frequencyPeriod", "", "itemRelatedToSpending", "", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/KeyRangeRemote;", "amountRanges", "amountRangesPickerStart", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ImageRemote;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "j", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardInteractionRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "getId$annotations", "()V", "b", "h", "getTitle$annotations", "c", "i", "getUrl$annotations", "d", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "getKeys$annotations", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ImageRemote;", "f", "()Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/ImageRemote;", "getImage$annotations", "getFrequencyRepeat", "getFrequencyRepeat$annotations", "getFrequencyPeriod$annotations", "Ljava/lang/Boolean;", "getItemRelatedToSpending", "()Ljava/lang/Boolean;", "getItemRelatedToSpending$annotations", "Ljava/util/List;", "()Ljava/util/List;", "getAmountRanges$annotations", "getAmountRangesPickerStart$annotations", "Companion", "$serializer", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FamilyRewardInteractionRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final KSerializer<Object>[] f95815k = {null, null, null, null, null, null, null, null, new C17451f(KeyRangeRemote$$serializer.INSTANCE), null};

    /* renamed from: a  reason: collision with root package name */
    private final String f95816a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95817b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95818c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f95819d;

    /* renamed from: e  reason: collision with root package name */
    private final ImageRemote f95820e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f95821f;

    /* renamed from: g  reason: collision with root package name */
    private final String f95822g;

    /* renamed from: h  reason: collision with root package name */
    private final Boolean f95823h;

    /* renamed from: i  reason: collision with root package name */
    private final List<KeyRangeRemote> f95824i;

    /* renamed from: j  reason: collision with root package name */
    private final Integer f95825j;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardInteractionRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardInteractionRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<FamilyRewardInteractionRemote> serializer() {
            return FamilyRewardInteractionRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FamilyRewardInteractionRemote(int i10, String str, String str2, String str3, Integer num, ImageRemote imageRemote, Integer num2, String str4, Boolean bool, List list, Integer num3, T0 t02) {
        if (1023 != (i10 & 1023)) {
            E0.b(i10, 1023, FamilyRewardInteractionRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95816a = str;
        this.f95817b = str2;
        this.f95818c = str3;
        this.f95819d = num;
        this.f95820e = imageRemote;
        this.f95821f = num2;
        this.f95822g = str4;
        this.f95823h = bool;
        this.f95824i = list;
        this.f95825j = num3;
    }

    public static final /* synthetic */ void j(FamilyRewardInteractionRemote familyRewardInteractionRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95815k;
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, familyRewardInteractionRemote.f95816a);
        dVar.B(serialDescriptor, 1, y02, familyRewardInteractionRemote.f95817b);
        dVar.B(serialDescriptor, 2, y02, familyRewardInteractionRemote.f95818c);
        X x10 = X.f144073a;
        dVar.B(serialDescriptor, 3, x10, familyRewardInteractionRemote.f95819d);
        dVar.B(serialDescriptor, 4, ImageRemote$$serializer.INSTANCE, familyRewardInteractionRemote.f95820e);
        dVar.B(serialDescriptor, 5, x10, familyRewardInteractionRemote.f95821f);
        dVar.B(serialDescriptor, 6, y02, familyRewardInteractionRemote.f95822g);
        dVar.B(serialDescriptor, 7, C17457i.f144111a, familyRewardInteractionRemote.f95823h);
        dVar.B(serialDescriptor, 8, kSerializerArr[8], familyRewardInteractionRemote.f95824i);
        dVar.B(serialDescriptor, 9, x10, familyRewardInteractionRemote.f95825j);
    }

    public final List<KeyRangeRemote> b() {
        return this.f95824i;
    }

    public final Integer c() {
        return this.f95825j;
    }

    public final String d() {
        return this.f95822g;
    }

    public final String e() {
        return this.f95816a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FamilyRewardInteractionRemote)) {
            return false;
        }
        FamilyRewardInteractionRemote familyRewardInteractionRemote = (FamilyRewardInteractionRemote) obj;
        return C17542s.e(this.f95816a, familyRewardInteractionRemote.f95816a) && C17542s.e(this.f95817b, familyRewardInteractionRemote.f95817b) && C17542s.e(this.f95818c, familyRewardInteractionRemote.f95818c) && C17542s.e(this.f95819d, familyRewardInteractionRemote.f95819d) && C17542s.e(this.f95820e, familyRewardInteractionRemote.f95820e) && C17542s.e(this.f95821f, familyRewardInteractionRemote.f95821f) && C17542s.e(this.f95822g, familyRewardInteractionRemote.f95822g) && C17542s.e(this.f95823h, familyRewardInteractionRemote.f95823h) && C17542s.e(this.f95824i, familyRewardInteractionRemote.f95824i) && C17542s.e(this.f95825j, familyRewardInteractionRemote.f95825j);
    }

    public final ImageRemote f() {
        return this.f95820e;
    }

    public final Integer g() {
        return this.f95819d;
    }

    public final String h() {
        return this.f95817b;
    }

    public int hashCode() {
        String str = this.f95816a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95817b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95818c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f95819d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        ImageRemote imageRemote = this.f95820e;
        int hashCode5 = (hashCode4 + (imageRemote == null ? 0 : imageRemote.hashCode())) * 31;
        Integer num2 = this.f95821f;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f95822g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f95823h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<KeyRangeRemote> list = this.f95824i;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.f95825j;
        if (num3 != null) {
            i10 = num3.hashCode();
        }
        return hashCode9 + i10;
    }

    public final String i() {
        return this.f95818c;
    }

    public String toString() {
        String str = this.f95816a;
        String str2 = this.f95817b;
        String str3 = this.f95818c;
        Integer num = this.f95819d;
        ImageRemote imageRemote = this.f95820e;
        Integer num2 = this.f95821f;
        String str4 = this.f95822g;
        Boolean bool = this.f95823h;
        List<KeyRangeRemote> list = this.f95824i;
        Integer num3 = this.f95825j;
        return "FamilyRewardInteractionRemote(id=" + str + ", title=" + str2 + ", url=" + str3 + ", keys=" + num + ", image=" + imageRemote + ", frequencyRepeat=" + num2 + ", frequencyPeriod=" + str4 + ", itemRelatedToSpending=" + bool + ", amountRanges=" + list + ", amountRangesPickerStart=" + num3 + ")";
    }
}
