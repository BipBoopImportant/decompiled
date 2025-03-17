package com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote;

import com.ingka.ikea.core.model.KeyBenefits;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002)\u001fB5\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0017R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/KeyBenefitsRemote;", "Lpp/b;", "Lcom/ingka/ikea/core/model/KeyBenefits;", "", "seen0", "", "title", "", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/KeyBenefitRemote;", "keyBenefits", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/KeyBenefitsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ljava/util/List;", "getKeyBenefits", "()Ljava/util/List;", "getKeyBenefits$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeyBenefitsRemote implements C11768b<KeyBenefits> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final KSerializer<Object>[] f93422c = {null, new C17451f(KeyBenefitRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f93423a;

    /* renamed from: b  reason: collision with root package name */
    private final List<KeyBenefitRemote> f93424b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/KeyBenefitsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/KeyBenefitsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<KeyBenefitsRemote> serializer() {
            return KeyBenefitsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ KeyBenefitsRemote(int i10, String str, List list, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, KeyBenefitsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f93423a = str;
        this.f93424b = list;
    }

    public static final /* synthetic */ void b(KeyBenefitsRemote keyBenefitsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f93422c;
        dVar.y(serialDescriptor, 0, keyBenefitsRemote.f93423a);
        dVar.i(serialDescriptor, 1, kSerializerArr[1], keyBenefitsRemote.f93424b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyBenefitsRemote)) {
            return false;
        }
        KeyBenefitsRemote keyBenefitsRemote = (KeyBenefitsRemote) obj;
        return C17542s.e(this.f93423a, keyBenefitsRemote.f93423a) && C17542s.e(this.f93424b, keyBenefitsRemote.f93424b);
    }

    public int hashCode() {
        return (this.f93423a.hashCode() * 31) + this.f93424b.hashCode();
    }

    public String toString() {
        String str = this.f93423a;
        List<KeyBenefitRemote> list = this.f93424b;
        return "KeyBenefitsRemote(title=" + str + ", keyBenefits=" + list + ")";
    }
}
