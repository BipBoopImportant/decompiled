package hK;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.descriptors.SerialDescriptor;
import oI.C17693a;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0003¨\u0006\b"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "a", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)Ljava/lang/Iterable;", "elementDescriptors", "", "b", "elementNames", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"hK/i$a", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "hasNext", "()Z", "c", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "a", "I", "elementsLeft", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Iterator<SerialDescriptor>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private int f143462a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SerialDescriptor f143463b;

        a(SerialDescriptor serialDescriptor) {
            this.f143463b = serialDescriptor;
            this.f143462a = serialDescriptor.d();
        }

        /* renamed from: c */
        public SerialDescriptor next() {
            SerialDescriptor serialDescriptor = this.f143463b;
            int d10 = serialDescriptor.d();
            int i10 = this.f143462a;
            this.f143462a = i10 - 1;
            return serialDescriptor.g(d10 - i10);
        }

        public boolean hasNext() {
            return this.f143462a > 0;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"hK/i$b", "", "", "", "hasNext", "()Z", "c", "()Ljava/lang/String;", "", "a", "I", "elementsLeft", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Iterator<String>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private int f143464a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SerialDescriptor f143465b;

        b(SerialDescriptor serialDescriptor) {
            this.f143465b = serialDescriptor;
            this.f143464a = serialDescriptor.d();
        }

        /* renamed from: c */
        public String next() {
            SerialDescriptor serialDescriptor = this.f143465b;
            int d10 = serialDescriptor.d();
            int i10 = this.f143464a;
            this.f143464a = i10 - 1;
            return serialDescriptor.e(d10 - i10);
        }

        public boolean hasNext() {
            return this.f143464a > 0;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"hK/i$c", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Iterable<SerialDescriptor>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SerialDescriptor f143466a;

        public c(SerialDescriptor serialDescriptor) {
            this.f143466a = serialDescriptor;
        }

        public Iterator<SerialDescriptor> iterator() {
            return new a(this.f143466a);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"hK/i$d", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements Iterable<String>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SerialDescriptor f143467a;

        public d(SerialDescriptor serialDescriptor) {
            this.f143467a = serialDescriptor;
        }

        public Iterator<String> iterator() {
            return new b(this.f143467a);
        }
    }

    public static final Iterable<SerialDescriptor> a(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "<this>");
        return new c(serialDescriptor);
    }

    public static final Iterable<String> b(SerialDescriptor serialDescriptor) {
        C17542s.j(serialDescriptor, "<this>");
        return new d(serialDescriptor);
    }
}
