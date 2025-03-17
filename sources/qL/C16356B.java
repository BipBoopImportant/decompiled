package QL;

import java.lang.annotation.Annotation;

/* renamed from: QL.B  reason: case insensitive filesystem */
final class C16356B implements C16355A {

    /* renamed from: a  reason: collision with root package name */
    private static final C16355A f137722a = new C16356B();

    C16356B() {
    }

    static Annotation[] a(Annotation[] annotationArr) {
        if (C16357C.l(annotationArr, C16355A.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = f137722a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class<? extends Annotation> annotationType() {
        return C16355A.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof C16355A;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "@" + C16355A.class.getName() + "()";
    }
}
