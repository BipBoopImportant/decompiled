package com.ingka.ikea.familyrewards.datalayer.impl.remote;

import Qq.l;
import Qq.n;
import YH.C16877v;
import fK.p;
import gK.C17294a;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002-\"B7\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R*\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010(\u0012\u0004\b+\u0010'\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsFAQRemote;", "Lpp/b;", "LQq/l;", "", "seen0", "", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsFAQQuestionsRemote;", "faqs", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsFAQHeaderImageRemote;", "headerImage", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsFAQHeaderImageRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsFAQRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()LQq/l;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getFaqs", "()Ljava/util/List;", "getFaqs$annotations", "()V", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsFAQHeaderImageRemote;", "getHeaderImage", "()Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsFAQHeaderImageRemote;", "getHeaderImage$annotations", "Companion", "$serializer", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FamilyRewardsFAQRemote implements C11768b<l> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f95832c = {new C17451f(C17294a.u(FamilyRewardsFAQQuestionsRemote$$serializer.INSTANCE)), null};

    /* renamed from: a  reason: collision with root package name */
    private final List<FamilyRewardsFAQQuestionsRemote> f95833a;

    /* renamed from: b  reason: collision with root package name */
    private final FamilyRewardsFAQHeaderImageRemote f95834b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsFAQRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardsFAQRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<FamilyRewardsFAQRemote> serializer() {
            return FamilyRewardsFAQRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FamilyRewardsFAQRemote(int i10, List list, FamilyRewardsFAQHeaderImageRemote familyRewardsFAQHeaderImageRemote, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, FamilyRewardsFAQRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95833a = list;
        this.f95834b = familyRewardsFAQHeaderImageRemote;
    }

    public static final /* synthetic */ void c(FamilyRewardsFAQRemote familyRewardsFAQRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, f95832c[0], familyRewardsFAQRemote.f95833a);
        dVar.B(serialDescriptor, 1, FamilyRewardsFAQHeaderImageRemote$$serializer.INSTANCE, familyRewardsFAQRemote.f95834b);
    }

    public l b() {
        List<FamilyRewardsFAQQuestionsRemote> list = this.f95833a;
        if (list == null) {
            throw new IllegalArgumentException("Required value was null.");
        } else if (this.f95834b != null) {
            Iterable<FamilyRewardsFAQQuestionsRemote> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (FamilyRewardsFAQQuestionsRemote familyRewardsFAQQuestionsRemote : iterable) {
                n a10 = familyRewardsFAQQuestionsRemote != null ? familyRewardsFAQQuestionsRemote.a() : null;
                if (a10 != null) {
                    arrayList.add(a10);
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            return new l(arrayList, this.f95834b.b());
        } else {
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FamilyRewardsFAQRemote)) {
            return false;
        }
        FamilyRewardsFAQRemote familyRewardsFAQRemote = (FamilyRewardsFAQRemote) obj;
        return C17542s.e(this.f95833a, familyRewardsFAQRemote.f95833a) && C17542s.e(this.f95834b, familyRewardsFAQRemote.f95834b);
    }

    public int hashCode() {
        List<FamilyRewardsFAQQuestionsRemote> list = this.f95833a;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        FamilyRewardsFAQHeaderImageRemote familyRewardsFAQHeaderImageRemote = this.f95834b;
        if (familyRewardsFAQHeaderImageRemote != null) {
            i10 = familyRewardsFAQHeaderImageRemote.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        List<FamilyRewardsFAQQuestionsRemote> list = this.f95833a;
        FamilyRewardsFAQHeaderImageRemote familyRewardsFAQHeaderImageRemote = this.f95834b;
        return "FamilyRewardsFAQRemote(faqs=" + list + ", headerImage=" + familyRewardsFAQHeaderImageRemote + ")";
    }
}
