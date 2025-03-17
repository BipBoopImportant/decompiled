package mK;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import nI.C17642l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0007\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00052\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H¦\u0002¢\u0006\u0004\b\u0007\u0010\b\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"LmK/a;", "", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "typeArgumentsSerializers", "a", "(Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "b", "LmK/a$a;", "LmK/a$b;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mK.a  reason: case insensitive filesystem */
public abstract class C17608a {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LmK/a$a;", "LmK/a;", "Lkotlinx/serialization/KSerializer;", "serializer", "<init>", "(Lkotlinx/serialization/KSerializer;)V", "", "typeArgumentsSerializers", "a", "(Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "b", "()Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mK.a$a  reason: collision with other inner class name */
    public static final class C3525a extends C17608a {

        /* renamed from: a  reason: collision with root package name */
        private final KSerializer<?> f144557a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3525a(KSerializer<?> kSerializer) {
            super((DefaultConstructorMarker) null);
            C17542s.j(kSerializer, "serializer");
            this.f144557a = kSerializer;
        }

        public KSerializer<?> a(List<? extends KSerializer<?>> list) {
            C17542s.j(list, "typeArgumentsSerializers");
            return this.f144557a;
        }

        public final KSerializer<?> b() {
            return this.f144557a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C3525a) && C17542s.e(((C3525a) obj).f144557a, this.f144557a);
        }

        public int hashCode() {
            return this.f144557a.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B)\u0012 \u0010\u0005\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00042\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003H\u0002¢\u0006\u0004\b\t\u0010\nR1\u0010\u0005\u001a\u001c\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LmK/a$b;", "LmK/a;", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "provider", "<init>", "(LnI/l;)V", "typeArgumentsSerializers", "a", "(Ljava/util/List;)Lkotlinx/serialization/KSerializer;", "LnI/l;", "b", "()LnI/l;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: mK.a$b */
    public static final class b extends C17608a {

        /* renamed from: a  reason: collision with root package name */
        private final C17642l<List<? extends KSerializer<?>>, KSerializer<?>> f144558a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17642l<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> lVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(lVar, "provider");
            this.f144558a = lVar;
        }

        public KSerializer<?> a(List<? extends KSerializer<?>> list) {
            C17542s.j(list, "typeArgumentsSerializers");
            return this.f144558a.invoke(list);
        }

        public final C17642l<List<? extends KSerializer<?>>, KSerializer<?>> b() {
            return this.f144558a;
        }
    }

    public /* synthetic */ C17608a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract KSerializer<?> a(List<? extends KSerializer<?>> list);

    private C17608a() {
    }
}
