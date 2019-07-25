package com.thoughtmechanix.licenseservice.models;

public class License {

    private String licenseId;
    private String productName;
    private String licenseType;
    private String organizationId;

    public String getLicenseId() {
        return licenseId;
    }

    public String getProductName() {
        return productName;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public License withId(final String licenseId) {
        this.licenseId = licenseId;
        return this;
    }

    public License withProductName(final String productName) {
        this.productName = productName;
        return this;
    }

    public License withLicenseType(final String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    public License withOrganizationId(final String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
}
