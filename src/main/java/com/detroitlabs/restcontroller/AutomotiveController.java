package com.detroitlabs.restcontroller;

import com.detroitlabs.model.*;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by paul on 2016/04/13.
 */
@RestController
@RequestMapping("/automotive")
public class AutomotiveController {

    @RequestMapping(method = RequestMethod.GET, path="/getoilchangemiles", produces = "application/json")
    @ApiOperation(value = "getoilchangemiles", nickname = "getOilChangeMiles")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userid", value = "User ID as gathered from the User Database", required = true, dataType = "string", paramType = "query", defaultValue=""),
            @ApiImplicitParam(name = "milestoday", value = "Miles driven today. Oil should be changed every 5000 miles.", required = true, dataType = "string", paramType = "query", defaultValue="")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = OilChangeTime.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")
    })
    public Integer getOilChangeMiles(@RequestParam(value="userid") String userId, @RequestParam(value="miles") int miles) {

        return 1;
    }

    @RequestMapping(method = RequestMethod.GET, path="/wheresmycar", produces = "application/json")
    @ApiOperation(value = "wheresmycar", nickname = "WheresMyCar")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userid", value = "User ID as gathered from the User Database", required = true, dataType = "string", paramType = "query", defaultValue="")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = CarLocation.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")
    })
    public CarLocation getCarLocation(@RequestParam(value="userid") String userId) {

        return null;
    }

    @RequestMapping(method = RequestMethod.POST, path="/setcarlocation", produces = "application/json")
    @ApiOperation(value = "setcarlocation", nickname = "SetCarLocation")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = CarLocation.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")
    })
    public CarLocation setCarLocation(@RequestBody CarLocation carLocation) {

        return null;
    }

    @RequestMapping(method = RequestMethod.GET, path="/getnearbydealer", produces = "application/json")
    @ApiOperation(value = "getnearbydealer", nickname = "GetNearbyDealers")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = NearbyDealer.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")
    })
    public CarLocation getCarLocation(@RequestBody CurrentLocation myLocation) {

        return null;
    }

    @RequestMapping(method = RequestMethod.POST, path="/accidentping", produces = "application/json")
    @ApiOperation(value = "accidentping", nickname = "AccidentPing")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = AccidentPing.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")
    })
    public CarLocation setCarLocation(@RequestBody AccidentPing ping) {

        return null;
    }

    @RequestMapping(method = RequestMethod.GET, path="/getnearbychargingstation", produces = "application/json")
    @ApiOperation(value = "getnearbychargingstation", nickname = "GetNearbyChargingStation")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = NearbyChargingStation.class),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Failure")
    })
    public CarLocation getNearbyChargingStation(@RequestBody CurrentLocation myLocation) {

        return null;
    }
}
