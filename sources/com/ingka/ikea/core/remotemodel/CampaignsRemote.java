package com.ingka.ikea.core.remotemodel;

import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kp.C11519a;
import kp.C11520b;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#\u0018B5\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u001e\u0012\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/CampaignsRemote;", "Lpp/b;", "Lkp/b;", "", "seen0", "", "title", "", "Lcom/ingka/ikea/core/remotemodel/CampaignRemote;", "campaigns", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/core/remotemodel/CampaignsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Lkp/b;", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitle$annotations", "()V", "Ljava/util/List;", "getCampaigns", "()Ljava/util/List;", "getCampaigns$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CampaignsRemote implements C11768b<C11520b> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f95180c = {null, new C17451f(CampaignRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f95181a;

    /* renamed from: b  reason: collision with root package name */
    private final List<CampaignRemote> f95182b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/CampaignsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/CampaignsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CampaignsRemote> serializer() {
            return CampaignsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CampaignsRemote(int i10, String str, List list, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, CampaignsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95181a = str;
        this.f95182b = list;
    }

    public static final /* synthetic */ void c(CampaignsRemote campaignsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95180c;
        dVar.B(serialDescriptor, 0, Y0.f144077a, campaignsRemote.f95181a);
        dVar.B(serialDescriptor, 1, kSerializerArr[1], campaignsRemote.f95182b);
    }

    public C11520b b() {
        String str = this.f95181a;
        List<CampaignRemote> list = this.f95182b;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (CampaignRemote a10 : list) {
                C11519a a11 = a10.a();
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
            return new C11520b(str, arrayList);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
