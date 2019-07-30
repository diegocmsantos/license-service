package com.thoughtmechanix.licenseservice.services;

import com.thoughtmechanix.licenseservice.config.ServiceConfig;
import com.thoughtmechanix.licenseservice.models.License;
import com.thoughtmechanix.licenseservice.repositories.LicenseRepository;

import java.util.List;
import java.util.UUID;

public class LicenseServiceDefault implements LicenseService {

    private final LicenseRepository licenseRepository;
    private final ServiceConfig config;

    public LicenseServiceDefault(final LicenseRepository licenseRepository,
                                 final ServiceConfig serviceConfig) {
        this.licenseRepository = licenseRepository;
        this.config = serviceConfig;
    }

    public License getLicense(String organizationId, String licenseId) {
        License license = licenseRepository.findByOrganizationIdAndLicenseId(
                organizationId, licenseId);
        return license.withComment(config.getExampleProperty());
    }

    public List<License> getLicensesByOrg(String organizationId) {
        return licenseRepository.findByOrganizationId(organizationId);
    }

    public void saveLicense(License license) {
        license.withId(UUID.randomUUID().toString());
        licenseRepository.save(license);
    }
}
