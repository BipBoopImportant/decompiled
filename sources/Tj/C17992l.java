package tJ;

/* renamed from: tJ.l  reason: case insensitive filesystem */
class C17992l<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f147375a;

    /* renamed from: b  reason: collision with root package name */
    private final Thread f147376b = Thread.currentThread();

    C17992l(T t10) {
        this.f147375a = t10;
    }

    public T a() {
        if (b()) {
            return this.f147375a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        return this.f147376b == Thread.currentThread();
    }
}
