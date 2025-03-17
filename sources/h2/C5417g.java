package h2;

/* renamed from: h2.g  reason: case insensitive filesystem */
class C5417g<T> implements C5416f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f23822a;

    /* renamed from: b  reason: collision with root package name */
    private int f23823b;

    C5417g(int i10) {
        if (i10 > 0) {
            this.f23822a = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public boolean a(T t10) {
        int i10 = this.f23823b;
        Object[] objArr = this.f23822a;
        if (i10 >= objArr.length) {
            return false;
        }
        objArr[i10] = t10;
        this.f23823b = i10 + 1;
        return true;
    }

    public T b() {
        int i10 = this.f23823b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        T[] tArr = this.f23822a;
        T t10 = tArr[i11];
        tArr[i11] = null;
        this.f23823b = i10 - 1;
        return t10;
    }

    public void c(T[] tArr, int i10) {
        if (i10 > tArr.length) {
            i10 = tArr.length;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            T t10 = tArr[i11];
            int i12 = this.f23823b;
            Object[] objArr = this.f23822a;
            if (i12 < objArr.length) {
                objArr[i12] = t10;
                this.f23823b = i12 + 1;
            }
        }
    }
}
