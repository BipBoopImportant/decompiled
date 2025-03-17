package E7;

final class b extends RuntimeException {
    b(Throwable th2) {
        super("Unexpected exception thrown by non-Glide code", th2);
    }
}
