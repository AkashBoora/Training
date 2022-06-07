package valid.services;

public class InternalServicePlatform {
    InternalShareService internalShareService;

    public InternalServicePlatform(InternalShareService internalShareService) {
        this.internalShareService=internalShareService;
    }

    public void shareMedia() {
        internalShareService.share();
    }
}
