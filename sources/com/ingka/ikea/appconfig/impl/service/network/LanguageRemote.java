package com.ingka.ikea.appconfig.impl.service.network;

import HJ.C15854t;
import Rl.f;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002-\u0016B9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0019R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010$\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/LanguageRemote;", "Lpp/b;", "LRl/f;", "", "seen0", "", "code", "name", "Lcom/ingka/ikea/appconfig/impl/service/network/PrivacyPolicyRemote;", "privacyPolicy", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/appconfig/impl/service/network/PrivacyPolicyRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/appconfig/impl/service/network/LanguageRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LRl/f;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "getCode$annotations", "()V", "getName", "getName$annotations", "c", "Lcom/ingka/ikea/appconfig/impl/service/network/PrivacyPolicyRemote;", "getPrivacyPolicy", "()Lcom/ingka/ikea/appconfig/impl/service/network/PrivacyPolicyRemote;", "getPrivacyPolicy$annotations", "Companion", "$serializer", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LanguageRemote implements C11768b<f> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f92919a;

    /* renamed from: b  reason: collision with root package name */
    private final String f92920b;

    /* renamed from: c  reason: collision with root package name */
    private final PrivacyPolicyRemote f92921c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/impl/service/network/LanguageRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/impl/service/network/LanguageRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<LanguageRemote> serializer() {
            return LanguageRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LanguageRemote(int i10, String str, String str2, PrivacyPolicyRemote privacyPolicyRemote, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, LanguageRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f92919a = str;
        this.f92920b = str2;
        this.f92921c = privacyPolicyRemote;
    }

    public static final /* synthetic */ void b(LanguageRemote languageRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, languageRemote.f92919a);
        dVar.B(serialDescriptor, 1, y02, languageRemote.f92920b);
        dVar.B(serialDescriptor, 2, PrivacyPolicyRemote$$serializer.INSTANCE, languageRemote.f92921c);
    }

    public f a() {
        String str = this.f92919a;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        } else if (!C15854t.v0(str)) {
            String str2 = this.f92920b;
            if (str2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            } else if (!C15854t.v0(str2)) {
                PrivacyPolicyRemote privacyPolicyRemote = this.f92921c;
                if (privacyPolicyRemote != null) {
                    return new f(str, str2, privacyPolicyRemote.a());
                }
                throw new IllegalArgumentException("Required value was null.");
            } else {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageRemote)) {
            return false;
        }
        LanguageRemote languageRemote = (LanguageRemote) obj;
        return C17542s.e(this.f92919a, languageRemote.f92919a) && C17542s.e(this.f92920b, languageRemote.f92920b) && C17542s.e(this.f92921c, languageRemote.f92921c);
    }

    public int hashCode() {
        String str = this.f92919a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f92920b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PrivacyPolicyRemote privacyPolicyRemote = this.f92921c;
        if (privacyPolicyRemote != null) {
            i10 = privacyPolicyRemote.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f92919a;
        String str2 = this.f92920b;
        PrivacyPolicyRemote privacyPolicyRemote = this.f92921c;
        return "LanguageRemote(code=" + str + ", name=" + str2 + ", privacyPolicy=" + privacyPolicyRemote + ")";
    }
}
