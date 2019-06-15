package services;

public interface AuthenticationService {
    boolean isNotebookRegistered();
    QRCodeService getQRManager();
}
