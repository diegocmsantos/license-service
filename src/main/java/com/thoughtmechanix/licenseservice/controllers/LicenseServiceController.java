package com.thoughtmechanix.licenseservice.controllers;

import com.thoughtmechanix.licenseservice.models.License;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    @GetMapping("/{licenseId}")
    public ResponseEntity<License> getLicenses(@PathVariable("organizationId") String organizationId,
                                              @PathVariable("licenseId") String licenseId) {
        return ResponseEntity.ok(new License()
                .withId(licenseId)
                .withProductName("Teleleco")
                .withLicenseType("Seat")
                .withOrganizationId(organizationId));
    }

}
