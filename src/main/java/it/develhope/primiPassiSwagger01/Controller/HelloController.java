package it.develhope.primiPassiSwagger01.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.context.annotation.Description;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/name/{name}")
    @Operation(summary = "getMyName", description = "This Method return the name of the user")
    @ApiResponse(responseCode = "200", description = "Operation Performed")
    public String getName(@PathVariable(required = false) String name){
        return "Hello, i'm the user " + name;

    }
}
