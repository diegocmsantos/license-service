package com.thoughtmechanix.licenseservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "licenses")
public class License {

    @Id
    @Column(name = "license_id", nullable = false)
    private String licenseId;

    @Column(name = "product_name", nullable = false)
    private String productName;
    private String licenseType;

    @Column(name = "organization_id", nullable = false)
    private String organizationId;

    private String comment;

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

    public String getComment() {
        return comment;
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

    public License withComment(final String comment) {
        this.comment = comment;
        return this;
    }
}
