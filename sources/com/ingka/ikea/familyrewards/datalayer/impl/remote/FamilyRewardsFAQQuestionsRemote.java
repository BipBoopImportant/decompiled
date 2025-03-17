package com.ingka.ikea.familyrewards.datalayer.impl.remote;

import Qq.n;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*\u0015B9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0018R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010 \u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010\u0018¨\u0006+"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsFAQQuestionsRemote;", "Lpp/b;", "LQq/n;", "", "seen0", "", "id", "question", "answer", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsFAQQuestionsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LQq/n;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getQuestion", "getQuestion$annotations", "c", "getAnswer", "getAnswer$annotations", "Companion", "$serializer", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FamilyRewardsFAQQuestionsRemote implements C11768b<n> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95829a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95830b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95831c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsFAQQuestionsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsFAQQuestionsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<FamilyRewardsFAQQuestionsRemote> serializer() {
            return FamilyRewardsFAQQuestionsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FamilyRewardsFAQQuestionsRemote(int i10, String str, String str2, String str3, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, FamilyRewardsFAQQuestionsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95829a = str;
        this.f95830b = str2;
        this.f95831c = str3;
    }

    public static final /* synthetic */ void b(FamilyRewardsFAQQuestionsRemote familyRewardsFAQQuestionsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, familyRewardsFAQQuestionsRemote.f95829a);
        dVar.B(serialDescriptor, 1, y02, familyRewardsFAQQuestionsRemote.f95830b);
        dVar.B(serialDescriptor, 2, y02, familyRewardsFAQQuestionsRemote.f95831c);
    }

    public n a() {
        String str = this.f95829a;
        if (str != null) {
            String str2 = this.f95830b;
            if (str2 != null) {
                String str3 = this.f95831c;
                if (str3 != null) {
                    return new n(str, str2, str3);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FamilyRewardsFAQQuestionsRemote)) {
            return false;
        }
        FamilyRewardsFAQQuestionsRemote familyRewardsFAQQuestionsRemote = (FamilyRewardsFAQQuestionsRemote) obj;
        return C17542s.e(this.f95829a, familyRewardsFAQQuestionsRemote.f95829a) && C17542s.e(this.f95830b, familyRewardsFAQQuestionsRemote.f95830b) && C17542s.e(this.f95831c, familyRewardsFAQQuestionsRemote.f95831c);
    }

    public int hashCode() {
        String str = this.f95829a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95830b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95831c;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f95829a;
        String str2 = this.f95830b;
        String str3 = this.f95831c;
        return "FamilyRewardsFAQQuestionsRemote(id=" + str + ", question=" + str2 + ", answer=" + str3 + ")";
    }
}
