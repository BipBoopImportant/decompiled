package nJ;

import nJ.C17649d;

/* renamed from: nJ.c  reason: case insensitive filesystem */
public abstract class C17648c {

    /* renamed from: nJ.c$a */
    public static final class a extends C17648c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f144820a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final int f144821b;

        static {
            C17649d.a aVar = C17649d.f144823c;
            f144821b = (~(aVar.i() | aVar.d())) & aVar.b();
        }

        private a() {
        }

        public int a() {
            return f144821b;
        }
    }

    /* renamed from: nJ.c$b */
    public static final class b extends C17648c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f144822a = new b();

        private b() {
        }

        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
