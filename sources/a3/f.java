package a3;

import H2.i;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final b f15168a;

    private static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final TextView f15169a;

        /* renamed from: b  reason: collision with root package name */
        private final d f15170b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f15171c = true;

        a(TextView textView) {
            this.f15169a = textView;
            this.f15170b = new d(textView);
        }

        private InputFilter[] f(InputFilter[] inputFilterArr) {
            for (d dVar : inputFilterArr) {
                if (dVar == this.f15170b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.f15170b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> g(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> g10 = g(inputFilterArr);
            if (g10.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length - g10.size())];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (g10.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        private void k() {
            this.f15169a.setFilters(a(this.f15169a.getFilters()));
        }

        private TransformationMethod m(TransformationMethod transformationMethod) {
            return (!(transformationMethod instanceof h) && !(transformationMethod instanceof PasswordTransformationMethod)) ? new h(transformationMethod) : transformationMethod;
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f15171c ? h(inputFilterArr) : f(inputFilterArr);
        }

        public boolean b() {
            return this.f15171c;
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z10) {
            if (z10) {
                l();
            }
        }

        /* access modifiers changed from: package-private */
        public void d(boolean z10) {
            this.f15171c = z10;
            l();
            k();
        }

        /* access modifiers changed from: package-private */
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f15171c ? m(transformationMethod) : j(transformationMethod);
        }

        /* access modifiers changed from: package-private */
        public void i(boolean z10) {
            this.f15171c = z10;
        }

        /* access modifiers changed from: package-private */
        public void l() {
            this.f15169a.setTransformationMethod(e(this.f15169a.getTransformationMethod()));
        }
    }

    static class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z10) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void d(boolean z10) {
            throw null;
        }

        /* access modifiers changed from: package-private */
        public TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    private static class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final a f15172a;

        c(TextView textView) {
            this.f15172a = new a(textView);
        }

        private boolean f() {
            return !androidx.emoji2.text.f.k();
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f15172a.a(inputFilterArr);
        }

        public boolean b() {
            return this.f15172a.b();
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z10) {
            if (!f()) {
                this.f15172a.c(z10);
            }
        }

        /* access modifiers changed from: package-private */
        public void d(boolean z10) {
            if (f()) {
                this.f15172a.i(z10);
            } else {
                this.f15172a.d(z10);
            }
        }

        /* access modifiers changed from: package-private */
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f15172a.e(transformationMethod);
        }
    }

    public f(TextView textView, boolean z10) {
        i.h(textView, "textView cannot be null");
        if (!z10) {
            this.f15168a = new c(textView);
        } else {
            this.f15168a = new a(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f15168a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f15168a.b();
    }

    public void c(boolean z10) {
        this.f15168a.c(z10);
    }

    public void d(boolean z10) {
        this.f15168a.d(z10);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f15168a.e(transformationMethod);
    }
}
