package services;

public class AuthenticationServer implements AuthenticationService {
    @Override
    public boolean isNotebookRegistered() {
        return false;
    }

    @Override
    public QRCodeService getQRManager() {
        return null;
    }
}
