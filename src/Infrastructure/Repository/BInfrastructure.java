/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Infrastructure.Repository;

import Infrastructure.IInfrastructureHandler.IAddAirplane;
import Infrastructure.IInfrastructureHandler.IAddFlights;
import Infrastructure.IInfrastructureHandler.ICancelFlights;
import Infrastructure.IInfrastructureHandler.IGetAllAirplanes;
import Infrastructure.IInfrastructureHandler.IGetAllFlights;

public class BInfrastructure {
    static IAddAirplane oAddAirplane = null;
    static IAddFlights oAddFlights = null;
    static ICancelFlights oCancelFlights = null;
    static IGetAllAirplanes oGetAllAirplanes = null;
    static IGetAllFlights oGetAllFlights = null;
    static IAirplaneStorage oAirplaneStorage = null;
            
    public static IAddAirplane buildAddAirplane(){
        if(oAddAirplane == null)
        {
            oAddAirplane = new AddAirplainToStorage();
        } 
        return oAddAirplane;
    }
    
    public static IAddFlights buildAddFlights(){
        if(oAddFlights == null)
        {
            oAddFlights = new AddFlightsToStorage();
        } 
        return oAddFlights;
    }
    
    public static ICancelFlights buildCancelFlights(){
        if(oCancelFlights == null)
        {
            oCancelFlights = new CancelFlightsFromStorage();
        } 
        return oCancelFlights;
    }
    
    public static IGetAllAirplanes buildGetAllAirplanes(){
        if(oGetAllAirplanes == null)
        {
            oGetAllAirplanes = new GetAllAirplanes();
        } 
        return oGetAllAirplanes;
    }
    
    public static IGetAllFlights buildGetAllFlights(){
        if(oGetAllFlights == null)
        {
            oGetAllFlights = new GetAllFlights();
        } 
        return oGetAllFlights;
    }
    
    public static IAirplaneStorage buildGetAirplaneStorage(){
        if(oAirplaneStorage == null)
        {
            oAirplaneStorage = new AirplaneStorage();
        } 
        return oAirplaneStorage;
    }
}
