package com.thoughtmechanix.licenseservice.services;

import com.thoughtmechanix.licenseservice.models.License;

import java.util.List;

public interface LicenseService {

    License getLicense(String organizationId, String licenseId);

    List<License> getLicensesByOrg(String organizationId);

    void saveLicense(License license);

}
