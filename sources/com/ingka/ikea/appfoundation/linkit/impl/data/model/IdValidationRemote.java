package com.ingka.ikea.appfoundation.linkit.impl.data.model;

import fK.p;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 \"2\u00020\u0001:\u0002#\u001cB+\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/ingka/ikea/appfoundation/linkit/impl/data/model/IdValidationRemote;", "", "", "seen0", "", "Lcom/ingka/ikea/appfoundation/linkit/impl/data/model/FieldValidationRemote;", "fields", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/appfoundation/linkit/impl/data/model/IdValidationRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "getFields$annotations", "()V", "Companion", "$serializer", "linkit-Implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IdValidationRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final KSerializer<Object>[] f93031b = {new C17451f(FieldValidationRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final List<FieldValidationRemote> f93032a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appfoundation/linkit/impl/data/model/IdValidationRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appfoundation/linkit/impl/data/model/IdValidationRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "linkit-Implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<IdValidationRemote> serializer() {
            return IdValidationRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ IdValidationRemote(int i10, List list, T0 t02) {
        if (1 != (i10 & 1)) {
            E0.b(i10, 1, IdValidationRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f93032a = list;
    }

    public final List<FieldValidationRemote> b() {
        return this.f93032a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IdValidationRemote) && C17542s.e(this.f93032a, ((IdValidationRemote) obj).f93032a);
    }

    public int hashCode() {
        return this.f93032a.hashCode();
    }

    public String toString() {
        List<FieldValidationRemote> list = this.f93032a;
        return "IdValidationRemote(fields=" + list + ")";
    }
}
