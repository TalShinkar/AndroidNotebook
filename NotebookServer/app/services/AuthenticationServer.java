package services;

public class AuthenticationServer implements AuthenticationService {
    @Override
    public boolean isNotebookRegistered() {
        return true;
    }

    @Override
    public QRCodeService getQRManager() {
        return null;
    }
}
