package U7;

public interface e {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        private a(boolean z10) {
            this.isComplete = z10;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.isComplete;
        }
    }

    boolean a();

    void b(d dVar);

    boolean d(d dVar);

    boolean e(d dVar);

    void g(d dVar);

    e getRoot();

    boolean k(d dVar);
}
