package com.ganggreen.controller;

import com.ganggreen.model.Profile;
import com.ganggreen.service.ProfileService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

/**
 * @author Jason MacKeigan
 */
@RestController()
public class ProfileController {

    private final ProfileService projectService;

    public ProfileController(ProfileService projectService) {
        this.projectService = projectService;
    }

    @Operation(
            description = "Returns a collection of projects.",
            responses = @ApiResponse(responseCode = "200",
                content = @Content(schema = @Schema(implementation = Profile.class)))
    )

    @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Profile> getAllProjects() {
        return projectService.getAllProfiles();
    }

    @Operation (
            description = "Returns a specific profile.",
            responses = @ApiResponse(responseCode = "200",
                    content = @Content(schema = @Schema(implementation = Profile.class)))
    )
    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Profile> getProfileById(@PathVariable("id") int id) {
        return projectService.findProfileById(id);
    }

}
