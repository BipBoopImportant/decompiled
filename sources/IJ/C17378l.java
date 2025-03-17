package iJ;

import DI.C15538I;
import XH.C16807N;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wJ.C18227i;
import wJ.C18229k;
import wJ.C18230l;

/* renamed from: iJ.l  reason: case insensitive filesystem */
public abstract class C17378l extends C17373g<C16807N> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f143507b = new a((DefaultConstructorMarker) null);

    /* renamed from: iJ.l$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C17378l a(String str) {
            C17542s.j(str, "message");
            return new b(str);
        }

        private a() {
        }
    }

    /* renamed from: iJ.l$b */
    public static final class b extends C17378l {

        /* renamed from: c  reason: collision with root package name */
        private final String f143508c;

        public b(String str) {
            C17542s.j(str, "message");
            this.f143508c = str;
        }

        /* renamed from: d */
        public C18227i a(C15538I i10) {
            C17542s.j(i10, "module");
            return C18230l.d(C18229k.ERROR_CONSTANT_VALUE, this.f143508c);
        }

        public String toString() {
            return this.f143508c;
        }
    }

    public C17378l() {
        super(C16807N.f139792a);
    }

    /* renamed from: c */
    public C16807N b() {
        throw new UnsupportedOperationException();
    }
}
