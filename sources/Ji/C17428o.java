package jI;

import GJ.C15765h;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LjI/o;", "LGJ/h;", "", "Ljava/io/BufferedReader;", "reader", "<init>", "(Ljava/io/BufferedReader;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "Ljava/io/BufferedReader;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jI.o  reason: case insensitive filesystem */
final class C17428o implements C15765h<String> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final BufferedReader f144000a;

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"jI/o$a", "", "", "", "hasNext", "()Z", "c", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "nextValue", "b", "Z", "done", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jI.o$a */
    public static final class a implements Iterator<String>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private String f144001a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f144002b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17428o f144003c;

        a(C17428o oVar) {
            this.f144003c = oVar;
        }

        /* renamed from: c */
        public String next() {
            if (hasNext()) {
                String str = this.f144001a;
                this.f144001a = null;
                C17542s.g(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f144001a == null && !this.f144002b) {
                String readLine = this.f144003c.f144000a.readLine();
                this.f144001a = readLine;
                if (readLine == null) {
                    this.f144002b = true;
                }
            }
            return this.f144001a != null;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C17428o(BufferedReader bufferedReader) {
        C17542s.j(bufferedReader, "reader");
        this.f144000a = bufferedReader;
    }

    public Iterator<String> iterator() {
        return new a(this);
    }
}
