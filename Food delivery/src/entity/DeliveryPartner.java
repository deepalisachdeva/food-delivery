package entity;

import enums.PartnerStatus;

public class DeliveryPartner {
    String id;
    String name;
    PartnerStatus status;

    public DeliveryPartner(String id, String name, PartnerStatus status) {
        this.id = id;
        this.name = name;
        this.status = PartnerStatus.AVAILABLE;
    }
}
