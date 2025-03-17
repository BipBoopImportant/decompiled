package com.ingka.ikea.appfoundation.linkit.impl.data.model;

import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\b\u0018\u0000 #2\u00020\u0001:\u0002$\u001bB-\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R \u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010 \u0012\u0004\b\"\u0010\u001f\u001a\u0004\b\u001b\u0010!¨\u0006%"}, d2 = {"Lcom/ingka/ikea/appfoundation/linkit/impl/data/model/FieldValidationRemote;", "", "", "seen0", "", "field", "", "valid", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;ZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/appfoundation/linkit/impl/data/model/FieldValidationRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getField", "getField$annotations", "()V", "Z", "()Z", "getValid$annotations", "Companion", "$serializer", "linkit-Implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FieldValidationRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f93029a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f93030b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appfoundation/linkit/impl/data/model/FieldValidationRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appfoundation/linkit/impl/data/model/FieldValidationRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "linkit-Implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<FieldValidationRemote> serializer() {
            return FieldValidationRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FieldValidationRemote(int i10, String str, boolean z10, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, FieldValidationRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f93029a = str;
        this.f93030b = z10;
    }

    public static final /* synthetic */ void b(FieldValidationRemote fieldValidationRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, fieldValidationRemote.f93029a);
        dVar.x(serialDescriptor, 1, fieldValidationRemote.f93030b);
    }

    public final boolean a() {
        return this.f93030b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldValidationRemote)) {
            return false;
        }
        FieldValidationRemote fieldValidationRemote = (FieldValidationRemote) obj;
        return C17542s.e(this.f93029a, fieldValidationRemote.f93029a) && this.f93030b == fieldValidationRemote.f93030b;
    }

    public int hashCode() {
        return (this.f93029a.hashCode() * 31) + Boolean.hashCode(this.f93030b);
    }

    public String toString() {
        String str = this.f93029a;
        boolean z10 = this.f93030b;
        return "FieldValidationRemote(field=" + str + ", valid=" + z10 + ")";
    }
}
