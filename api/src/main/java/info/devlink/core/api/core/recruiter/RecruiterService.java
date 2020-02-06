package info.devlink.core.api.core.recruiter;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface RecruiterService {
    /**
     * Sample usage:
     *
     *
     * @param body
     * @return
     */
    @PostMapping(
            value    = "/recruiter",
            consumes = "application/json",
            produces = "application/json")
    Recruiter createRecruiter(@RequestBody Recruiter body);

    /**
     * Sample usage:
     *
     * curl $HOST:$PORT/recruiter?recruiterId=1
     *
     * @param recruiterId
     * @return
     */
    @GetMapping(
            value    = "/recruiter",
            produces = "application/json")
    List<Recruiter> getRecruiter(@RequestParam(value = "recruiterId", required = true) int recruiterId);

    /**
     * Sample usage:
     *
     * curl -X DELETE $HOST:$PORT/recruiter?recruiterId=1
     *
     * @param recruiterId
     */
    @DeleteMapping(value = "/recruiter")
    void deleteRecruiters(@RequestParam(value = "recruiterId", required = true)  int recruiterId);
}
