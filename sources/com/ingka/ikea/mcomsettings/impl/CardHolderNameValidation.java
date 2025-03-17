package com.ingka.ikea.mcomsettings.impl;

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

@p
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\b\u0018\u0000 $2\u00020\u0001:\u0002%\u001cB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010 \u001a\u0004\b!\u0010\u0016¨\u0006&"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/CardHolderNameValidation;", "", "", "enabled", "", "regex", "<init>", "(ZLjava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(IZLjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/mcomsettings/impl/CardHolderNameValidation;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "getEnabled$annotations", "()V", "b", "Ljava/lang/String;", "getRegex$annotations", "Companion", "$serializer", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CardHolderNameValidation {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f96627a;

    /* renamed from: b  reason: collision with root package name */
    private final String f96628b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/mcomsettings/impl/CardHolderNameValidation$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/mcomsettings/impl/CardHolderNameValidation;", "serializer", "()Lkotlinx/serialization/KSerializer;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CardHolderNameValidation> serializer() {
            return CardHolderNameValidation$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CardHolderNameValidation(int i10, boolean z10, String str, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, CardHolderNameValidation$$serializer.INSTANCE.getDescriptor());
        }
        this.f96627a = z10;
        this.f96628b = str;
    }

    public static final /* synthetic */ void c(CardHolderNameValidation cardHolderNameValidation, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.x(serialDescriptor, 0, cardHolderNameValidation.f96627a);
        dVar.B(serialDescriptor, 1, Y0.f144077a, cardHolderNameValidation.f96628b);
    }

    public final boolean a() {
        return this.f96627a;
    }

    public final String b() {
        return this.f96628b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardHolderNameValidation)) {
            return false;
        }
        CardHolderNameValidation cardHolderNameValidation = (CardHolderNameValidation) obj;
        return this.f96627a == cardHolderNameValidation.f96627a && C17542s.e(this.f96628b, cardHolderNameValidation.f96628b);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f96627a) * 31;
        String str = this.f96628b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        boolean z10 = this.f96627a;
        String str = this.f96628b;
        return "CardHolderNameValidation(enabled=" + z10 + ", regex=" + str + ")";
    }

    public CardHolderNameValidation(boolean z10, String str) {
        this.f96627a = z10;
        this.f96628b = str;
    }
}
