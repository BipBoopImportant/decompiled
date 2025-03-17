package Qb;

public enum G {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: id  reason: collision with root package name */
    private final int f62920id;

    private G(int i10) {
        this.f62920id = i10;
    }

    public static G b(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int j() {
        return this.f62920id;
    }

    public String toString() {
        return Integer.toString(this.f62920id);
    }
}
