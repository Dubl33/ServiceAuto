package ro.ugal.aciee.Service;

class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }
}

public class Exceptie {
    public void methodWithCustomCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException("Raspuns invalid, raspunde doar cu " + "da " + "sau " + " nu");
    }

    public void methodWithCustomUncheckedException() {
        throw new CustomUncheckedException("Raspuns invalid, raspunde doar cu " + "da " + "sau " + " nu");
    }

}
