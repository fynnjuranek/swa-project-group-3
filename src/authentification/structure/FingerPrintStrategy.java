package authentification.structure;

public class FingerPrintStrategy implements Credential {
    @Override
    public void authenticate() { // TODO implement further
        System.out.println("You have chosen the Fingerprint-Strategy");
        System.out.println("Scanning Finger");
        System.out.println("Done!");
    }
}
